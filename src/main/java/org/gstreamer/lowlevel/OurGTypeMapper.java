package org.gstreamer.lowlevel;
/* 
 * Copyright (c) 2007 Wayne Meissner
 * 
 * This file is part of gstreamer-java.
 *
 * This code is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License version 3 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * version 3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with this work.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.URI;
import org.gstreamer.lowlevel.EnumMapper;
import org.gstreamer.lowlevel.GlibAPI;
import org.gstreamer.lowlevel.IntPtr;
import org.gstreamer.lowlevel.NativeObject;
import org.gstreamer.lowlevel.NativeValue;
import org.gstreamer.lowlevel.annotations.CallerOwnsReturn;
import org.gstreamer.lowlevel.annotations.ConstField;
import org.gstreamer.lowlevel.annotations.FreeReturnValue;
import org.gstreamer.lowlevel.annotations.IncRef;
import org.gstreamer.lowlevel.annotations.Invalidate;
import org.gstreamer.lowlevel.Handle;
import org.gstreamer.lowlevel.RefCountedObject;

import com.sun.jna.CallbackParameterContext;
import com.sun.jna.FromNativeContext;
import com.sun.jna.FromNativeConverter;
import com.sun.jna.MethodParameterContext;
import com.sun.jna.MethodResultContext;
import com.sun.jna.Pointer;
import com.sun.jna.StructureReadContext;
import com.sun.jna.ToNativeContext;
import com.sun.jna.ToNativeConverter;
import com.sun.jna.TypeConverter;

/**
 *
 * @author wayne
 */
public class OurGTypeMapper extends com.sun.jna.DefaultTypeMapper {
	/** Constructor
	 * 
	 */
    public OurGTypeMapper() {
        addToNativeConverter(URI.class, uriConverter);
    }
    private static ToNativeConverter nativeValueArgumentConverter = new ToNativeConverter() {

        @Override
		public Object toNative(Object arg, ToNativeContext context) {
            return arg != null ? ((NativeValue) arg).nativeValue() : null;
        }

        @Override
		public Class<?> nativeType() {
            return Void.class; // not really correct, but not used in this instance
        }        
    };
    
 
    private static TypeConverter nativeObjectConverter = new TypeConverter() {
        @Override
		public Object toNative(Object arg, ToNativeContext context) {
            if (arg == null) {
                return null;
            }
            Pointer ptr = ((NativeObject) arg).handle();
            
            //
            // Deal with any adjustments to the proxy neccessitated by gstreamer
            // breaking their reference-counting idiom with special cases
            //
            if (context instanceof MethodParameterContext) {
                MethodParameterContext mcontext = (MethodParameterContext) context;
                Method method = mcontext.getMethod();
                int index = mcontext.getParameterIndex();
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                if (index < parameterAnnotations.length) {
                    Annotation[] annotations = parameterAnnotations[index];
                    for (int i = 0; i < annotations.length; ++i) {
                        if (annotations[i] instanceof Invalidate) {
                            ((Handle) arg).invalidate();
                            break;
                        } else if (annotations[i] instanceof IncRef) {
                            ((RefCountedObject) arg).ref();
                            break;
                        }
                    }
                }
            }
            return ptr;
        }
 
        @Override
		@SuppressWarnings(value = "unchecked")
        public Object fromNative(Object result, FromNativeContext context) {
            if (result == null) {
                return null;
            }
            if (context instanceof MethodResultContext) {
                //
                // By default, gstreamer increments the refcount on objects 
                // returned from functions, so drop a ref here
                //
                boolean ownsHandle = ((MethodResultContext) context).getMethod().isAnnotationPresent(CallerOwnsReturn.class);
                int refadj = ownsHandle ? -1 : 0;
                return NativeObject.objectFor((Pointer) result, context.getTargetType(), refadj, ownsHandle);
            }
            if (context instanceof CallbackParameterContext) {
                return NativeObject.objectFor((Pointer) result, context.getTargetType(), 1, true);
            }
            if (context instanceof StructureReadContext) {
                StructureReadContext sctx = (StructureReadContext) context;
                boolean ownsHandle = sctx.getField().getAnnotation(ConstField.class) == null;
                return NativeObject.objectFor((Pointer) result, context.getTargetType(), 1, ownsHandle);
            }
            throw new IllegalStateException("Cannot convert to NativeObject from " + context);
        }
        
        @Override
		public Class<?> nativeType() {
            return Pointer.class;
        }
    };
    private static TypeConverter enumConverter = new TypeConverter() {

        @Override
		@SuppressWarnings(value = "unchecked")
        public Object fromNative(Object value, FromNativeContext context) {
            return EnumMapper.getInstance().valueOf((Integer) value, context.getTargetType());
        }

        @Override
		public Class<?> nativeType() {
            return Integer.class;
        }

        @SuppressWarnings("rawtypes")
		@Override
		public Object toNative(Object arg, ToNativeContext context) {
            if (arg == null) {
                return null;
            }
            return EnumMapper.getInstance().intValue((Enum) arg);
        }
    };

    private TypeConverter stringConverter = new TypeConverter() {

        @Override
		public Object fromNative(Object result, FromNativeContext context) {
            if (result == null) {
                return null;
            }
            if (context instanceof MethodResultContext) {
                MethodResultContext functionContext = (MethodResultContext) context;
                Method method = functionContext.getMethod();
                Pointer ptr = (Pointer) result;
                String s = ptr.getString(0);
                if (method.isAnnotationPresent(FreeReturnValue.class)
                    || method.isAnnotationPresent(CallerOwnsReturn.class)) {
                    GlibAPI.GLIB_API.g_free(ptr);
                }
                return s;
            } else {
                return ((Pointer) result).getString(0);
            }           
        }

        @Override
		public Class<?> nativeType() {
            return Pointer.class;
        }

        @Override
		public Object toNative(Object arg, ToNativeContext context) {
            // Let the default String -> native conversion handle it
            return arg;            
        }
    };

    private TypeConverter booleanConverter = new TypeConverter() {
        @Override
		public Object toNative(Object arg, ToNativeContext context) {
            return Integer.valueOf(Boolean.TRUE.equals(arg) ? 1 : 0);
        }

        @Override
		public Object fromNative(Object arg0, FromNativeContext arg1) {
            return Boolean.valueOf(((Integer)arg0).intValue() != 0);
        }

        @Override
		public Class<?> nativeType() {
            return Integer.class;
        }
    };

    private TypeConverter intptrConverter = new TypeConverter() {
        
        @Override
		public Object toNative(Object arg, ToNativeContext context) {
            return ((IntPtr)arg).value;            
        }

        @Override
		public Object fromNative(Object arg0, FromNativeContext arg1) {
            return new IntPtr(((Number) arg0).intValue());            
        }

        @Override
		public Class<?> nativeType() {
            return Pointer.SIZE == 8 ? Long.class : Integer.class;
        }
    };
    private static ToNativeConverter uriConverter = new ToNativeConverter() {

        @Override
		public Object toNative(Object arg0, ToNativeContext arg1) {
            URI uri = (URI) arg0;
            String uriString = uri.toString();
            // Need to fixup file:/ to be file:/// for gstreamer
            if ("file".equals(uri.getScheme()) && uri.getHost() == null) {
                final String path = uri.getRawPath();
                if (com.sun.jna.Platform.isWindows()) {
                    uriString = "file:/" + path;
                } else {
                    uriString = "file://" + path;
                }
            }
            return uriString;
        }

        @Override
		public Class<?> nativeType() {
            return String.class;
        }
    };
    @Override
	public FromNativeConverter getFromNativeConverter(Class type) {
        if (Enum.class.isAssignableFrom(type)) {
            return enumConverter;              
        } else if (NativeObject.class.isAssignableFrom(type)) {
            return nativeObjectConverter;
        } else if (Boolean.class == type || boolean.class == type) {
            return booleanConverter;
        } else if (String.class == type) {
            return stringConverter;
        } else if (IntPtr.class == type) {
            return intptrConverter;
        }
        return super.getFromNativeConverter(type);
    }

    @Override
	public ToNativeConverter getToNativeConverter(Class type) {
        if (NativeObject.class.isAssignableFrom(type)) {
            return nativeObjectConverter;
        } else if (NativeValue.class.isAssignableFrom(type)) {
            return nativeValueArgumentConverter;
        } else if (Enum.class.isAssignableFrom(type)) {
            return enumConverter;
        } else if (Boolean.class == type || boolean.class == type) {
            return booleanConverter;
        } else if (String.class == type) {
            return stringConverter;        
        } else if (IntPtr.class == type) {
            return intptrConverter;
        }
        return super.getToNativeConverter(type);
    }
}
