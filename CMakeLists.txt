cmake_minimum_required(VERSION 3.12)
SET(jar_version "0.0.1-SNAPSHOT")
add_subdirectory(dependancies)

# Build the native library jars

include(UseJava)

# invoke maven to load all dependendant jars
execute_process(COMMAND mvn dependency:copy-dependencies)
# List the java source
file(GLOB_RECURSE javasrc src/main/java/*.java)
# linux native libs
file(GLOB_RECURSE nativeLibs RELATIVE ${CMAKE_HOME_DIRECTORY} CONFIGURE_DEPENDS native/linux-x86-64/lib/*.so)
MESSAGE(STATUS "nativeLibs (linux x86-64): " ${nativeLibs})
# windows native libs
file(GLOB_RECURSE nativeLibsWin RELATIVE ${CMAKE_HOME_DIRECTORY} CONFIGURE_DEPENDS native/win-x86-64/lib/*.dll native/win-x86-64/bin/*.dll)
MESSAGE(STATUS "nativeLibs (win x86-64): " ${nativeLibsWin})

# Generate a "MANIFEST" listing all libs
string(JOIN "\n" manifest_win ${nativeLibsWin})
string(JOIN "\n" manifest_lin ${nativeLibs})

file(WRITE native/MANIFEST.Linux_amd64 ${manifest_lin})
file(WRITE native/MANIFEST.Windows_amd64 ${manifest_win})

file(GLOB javalibs target/dependency/*.jar)
find_package(Java COMPONENTS Development)

# TODO generate the pom file
add_jar(gegl
SOURCES ${javasrc} ${nativeLibs} ${nativeLibsWin} native/MANIFEST.Linux_amd64 native/MANIFEST.Windows_amd64
INCLUDE_JARS ${javalibs}
# add version number to the jar file name
VERSION ${jar_version}
)

# declare install dir as local maven repo
install_jar(gegl DESTINATION "~/.m2/repository/com/jibee/gegl/${jar_version}/")
