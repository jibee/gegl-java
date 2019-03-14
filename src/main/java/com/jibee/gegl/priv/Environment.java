package com.jibee.gegl.priv;

import com.sun.jna.Library;
import com.sun.jna.Native;
/** Support class for modifying the environment variables - so we can tell BABL and GEGL where to load the plugins
 * 
 * Credit: http://blog.quirk.es/2009/11/setting-environment-variables-in-java.html
 *
 */
public class Environment {
	/** libc singleton */
	public static POSIX instance = new POSIX();

	/** Mapping for the relevant functions of the C runtime under windows
	 * 
	 */
	interface WinLibC extends Library {
		/** 
		 * 
		 * @param name
		 * @return
		 */
		int _putenv(String name);
	}
	/** Mapping for the relevant functions of the libC
	 * 
	 */
	interface LinuxLibC extends Library {
		/**
		 * 
		 * @param name
		 * @param value
		 * @param overwrite
		 * @return
		 */
		int setenv(String name, String value, int overwrite);
		/**
		 * 
		 * @param name
		 * @return
		 */
		int unsetenv(String name);
	}
	/**
	 * 
	 *
	 */
	static public class POSIX {
		/**
		 * 
		 */
		static Object libc;
		static {
			if (System.getProperty("os.name").equals("Linux")) {
				libc = Native.loadLibrary("c", LinuxLibC.class);
			} else {
				libc = Native.loadLibrary("msvcrt", WinLibC.class);
			}
		}
		/** Sets the given environment variable 
		 * @param name 
		 * @param value 
		 * @param overwrite 
		 * @return */
		public static int setenv(String name, String value, int overwrite) {
			if (libc instanceof LinuxLibC) {
				return ((LinuxLibC)libc).setenv(name, value, overwrite);
			}
			else {
				return ((WinLibC)libc)._putenv(name + "=" + value);
			}
		}
		/** Unset the given environment variable 
		 * @param name 
		 * @return */
		public static int unsetenv(String name) {
			if (libc instanceof LinuxLibC) {
				return ((LinuxLibC)libc).unsetenv(name);
			}
			else {
				return ((WinLibC)libc)._putenv(name + "=");
			}
		}
	}
}