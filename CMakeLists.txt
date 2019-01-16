cmake_minimum_required(VERSION 3.0)
add_subdirectory(dependancies)

# Build the native library jars

include(UseJava)

# invoke maven to load all dependendant jars
execute_process(COMMAND mvn dependency:copy-dependencies)
# List the java source
file(GLOB_RECURSE javasrc src/main/java/*.java)
# linux native libs
file(GLOB_RECURSE nativeLibs RELATIVE ${CMAKE_HOME_DIRECTORY} native/linux-x86-64/lib/*.so)
MESSAGE(STATUS "nativeLibs (linux x86-64): " ${nativeLibs})
# windows native libs
file(GLOB_RECURSE nativeLibsWin RELATIVE ${CMAKE_HOME_DIRECTORY} native/win-x86-64/lib/*.dll native/win-x86-64/bin/*.dll)
MESSAGE(STATUS "nativeLibs (win x86-64): " ${nativeLibsWin})

file(GLOB javalibs target/dependency/*.jar)
find_package(Java COMPONENTS Development)
add_jar(gegl_java
#SOURCES ${nativeLibs} ${nativeLibsWin}
SOURCES ${javasrc} ${nativeLibs} ${nativeLibsWin}
INCLUDE_JARS ${javalibs}
)
