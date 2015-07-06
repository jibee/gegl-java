cmake_minimum_required(VERSION 2.6)
project(mainweb)
find_package(PkgConfig)
pkg_check_modules(GEGL REQUIRED "gegl-0.3")
add_executable(mainweb main.cpp)
target_link_libraries(mainweb wt wthttp ${GEGL_LDFLAGS} )

target_include_directories(mainweb PRIVATE ${CMAKE_HOME_DIRECTORY}/dependancies/wt/src)
target_include_directories(mainweb PRIVATE ${CMAKE_HOME_DIRECTORY}/dependancies/wt)
target_include_directories(mainweb SYSTEM PRIVATE ${GEGL_INCLUDE_DIRS})

install(TARGETS mainweb RUNTIME DESTINATION bin)
