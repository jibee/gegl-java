cmake_minimum_required(VERSION 3.0)
add_subdirectory(dependancies)

include(UseJava)
execute_process(COMMAND mvn dependency:copy-dependencies)
file(GLOB_RECURSE javasrc src/main/java/*.java)
file(GLOB_RECURSE nativeLibs 3rdParty/lib/*.so)
MESSAGE(STATUS "nativeLibs: " ${nativeLibs})
file(GLOB javalibs target/dependency/*.jar)
find_package(Java COMPONENTS Development)
add_jar(gegl_java
SOURCES ${javasrc} ${nativeLibs}
INCLUDE_JARS ${javalibs}
)
