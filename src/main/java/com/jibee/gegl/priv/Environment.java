package com.jibee.gegl.priv;

import com.sun.jna.Library;
import com.sun.jna.Native;
/** Support class for modifying the environment variables - so we can tell BABL and GEGL where to load the plugins
 * 
 * Credit: http://blog.quirk.es/2009/11/setting-environment-variables-in-java.html
 *
 */
public class Environment {
	public static POSIX libc = new POSIX();

	public interface WinLibC extends Library {
		public int _putenv(String name);
	}
	public interface LinuxLibC extends Library {
		public int setenv(String name, String value, int overwrite);
		public int unsetenv(String name);
	}
	static public class POSIX {
		static Object libc;
		static {
			if (System.getProperty("os.name").equals("Linux")) {
				libc = Native.loadLibrary("c", LinuxLibC.class);
			} else {
				libc = Native.loadLibrary("msvcrt", WinLibC.class);
			}
		}

		public int setenv(String name, String value, int overwrite) {
			if (libc instanceof LinuxLibC) {
				return ((LinuxLibC)libc).setenv(name, value, overwrite);
			}
			else {
				return ((WinLibC)libc)._putenv(name + "=" + value);
			}
		}

		public int unsetenv(String name) {
			if (libc instanceof LinuxLibC) {
				return ((LinuxLibC)libc).unsetenv(name);
			}
			else {
				return ((WinLibC)libc)._putenv(name + "=");
			}
		}
	}
}