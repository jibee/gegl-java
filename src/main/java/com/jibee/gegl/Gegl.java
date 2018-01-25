package com.jibee.gegl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.nio.file.Path;
import com.jibee.gegl.priv.GeglRectangle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Gegl {
	static
	{
		String modules_path = System.getProperty("gegl.native");
		if(null==modules_path)
		{
			try {
				Path tempLibsFolder = Files.createTempDirectory("gegl_java_native");
				modules_path = tempLibsFolder.toString();
				File f = tempLibsFolder.toFile();
				f.deleteOnExit();
				List<String> cp = getClasspathEntriesByPath("/native");
				if(null!=cp)
				{
					cp.forEach(t -> log.info(t) );
				}
				else
				{
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String jnaPath = System.getProperty("jna.library.path");
		if(null==jnaPath)
		{
			jnaPath = modules_path;
		}
		else
		{
			jnaPath = modules_path+":"+jnaPath;
		}
		System.setProperty("jna.library.path",jnaPath);
		// TODO extract library implementation from jar into a temp
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_init(null, null);
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_config().set("application-license", "GPL3");
	}
	
	private static List<String> getClasspathEntriesByPath(String path) throws IOException {
		ClassLoader cl = Gegl.class.getClassLoader();
		if(null==cl)
		{
			return null;
		}
	    InputStream is = cl.getResourceAsStream(path);
	    if(null==is)
	    {
	    	return null;
	    }
	    StringBuilder sb = new StringBuilder();
	    while (is.available()>0) {
	        byte[] buffer = new byte[1024];
	        sb.append(new String(buffer, Charset.defaultCharset()));
	    }
	    is.close();

	    return Arrays
	            .asList(sb.toString().split("\n"))          // Convert StringBuilder to individual lines
	            .stream()                                   // Stream the list
	            .filter(line -> line.trim().length()>0)     // Filter out empty lines
	            .collect(Collectors.toList());              // Collect remaining lines into a List again
	}


	@Override
	protected void finalize() throws Throwable {
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_exit();
	};

	public static GeglNode newNode() {
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_new();
	}

	public static GeglNode fromXml(String text)
	{
		return fromXml("/");
	}
	public static GeglNode fromXml(String text, String path_base)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_node_new_from_xml(text, path_base);
	}

	public static GeglColor makeColor(String string) {
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_color_new(string);
	}

	public static GeglBuffer newBuffer(GeglRectangle extent, Babl format)
	{
		return com.jibee.gegl.priv.Gegl.INSTANCE.gegl_buffer_new(extent, format.getPointer());
	}
}
