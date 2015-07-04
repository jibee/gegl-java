cmake_minimum_required(VERSION 2.6)
project(mainweb)

add_executable(mainweb main.cpp)

install(TARGETS mainweb RUNTIME DESTINATION bin)
