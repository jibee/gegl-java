package com.jibee.gegl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.nio.file.Path;

import com.jibee.gegl.priv.Environment;
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
				//f.deleteOnExit();
				String location = nativeLocationInJar();
				List<String> cp = getClasspathEntriesByPath(location);
				if(null!=cp)
				{
					for(String e: cp)
					{
						String source = e;
						String target = e.split("/", 4)[3];
						File t = new File(f, target);
						t.getParentFile().mkdirs();
						// extract library implementation from jar into a temp
						log.debug("Copying {} into {}", source, t);
						copyLib(source, t);
					}
				}
				else
				{
					log.warn(
							"No native libs found in jar. Please provide the "+
									"location of the GEGL libraries through the "+
									"gegl.native property. We will now try to load "+
									"the native libs from the system location but "+
									"this is likely to fail."
							);
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
		Environment.libc.setenv("BABL_PATH", modules_path+"/babl-0.1", 0);
		Environment.libc.setenv("LD_LIBRARY_PATH", modules_path, 0);
		com.jibee.gegl.priv.BablAPI.INSTANCE.babl_init();
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_init(null, null);
		com.jibee.gegl.priv.Gegl.INSTANCE.gegl_config().set("application-license", "GPL3");
	}

	private static List<String> getClasspathEntriesByPath(String path) throws IOException {
		ClassLoader cl = Gegl.class.getClassLoader();
		if(null==cl)
		{
			log.info("Classloader is null");
			return null;
		}
		InputStream is = cl.getResourceAsStream(path);
		if(null==is)
		{
			log.info("resource stream is null");
			return null;
		}
		StringBuilder sb = new StringBuilder();
		while (is.available()>0) {
			byte[] buffer = new byte[1024];
			int l = is.read(buffer);
			sb.append(new String(buffer, 0, l, Charset.defaultCharset()));
		}
		is.close();

		return Arrays
				.asList(sb.toString().split("\n"))          // Convert StringBuilder to individual lines
				.stream()                                   // Stream the list
				.filter(line -> line.trim().length()>0)     // Filter out empty lines
				.collect(Collectors.toList());              // Collect remaining lines into a List again
	}

	private static void copyLib(String source, File t) throws IOException {
		ClassLoader cl = Gegl.class.getClassLoader();
		if(null==cl)
		{
			log.error("Classloader is null");
			return;
		}
		InputStream is = cl.getResourceAsStream(source);
		if(null==is)
		{
			log.error("resource stream for {} is null", source);
			return;
		}
		OutputStream os = Files.newOutputStream(t.toPath());
		byte[] buffer = new byte[1024];
		while(is.available()>0)
		{
			int r = is.read(buffer);
			os.write(buffer, 0, r);
		}
	}

	/** Determines which native libraries to extract from the jar
	 * 
	 * @return path within the jar of the native library
	 */
	private static String nativeLocationInJar() {
		String OS = System.getProperty("os.name");
		String arch = System.getProperty("os.arch");
		log.info("Found OS={}, arch={}", OS, arch);
		String key = OS+"_"+arch;
		switch(key)
		{
		case "Linux_amd64":
			return "native/MANIFEST.Linux_amd64";
		case "Windows 7_amd64":
		case "Windows 8_amd64":
		case "Windows 8.1_amd64":
			return "native/MANIFEST.Windows_amd64";
		}
		log.error("No matching native library for {}", key);
		throw new Error("No matching native library for "+key);
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
