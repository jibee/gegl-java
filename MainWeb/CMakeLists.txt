cmake_minimum_required(VERSION 2.6)
project(mainweb)

add_executable(mainweb main.cpp)
target_link_libraries(mainweb wt wthttp)
target_include_directories(mainweb PRIVATE ${CMAKE_HOME_DIRECTORY}/dependancies/wt/src)

install(TARGETS mainweb RUNTIME DESTINATION bin)
