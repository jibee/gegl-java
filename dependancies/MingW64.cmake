SET(CMAKE_SYSTEM_NAME Windows)
IF("${GNU_HOST}" STREQUAL "")
    SET(GNU_HOST x86_64-w64-mingw32)
ENDIF()
SET(CMAKE_C_COMPILER ${GNU_HOST}-gcc)
SET(CMAKE_CXX_COMPILER ${GNU_HOST}-g++)

#set(CMAKE_SYSTEM_PROCESSOR x86_64)

#set(CMAKE_SYSROOT /home/devel/rasp-pi-rootfs)
#set(CMAKE_STAGING_PREFIX /home/devel/stage)

#set(CMAKE_FIND_ROOT_PATH_MODE_PROGRAM NEVER)
#set(CMAKE_FIND_ROOT_PATH_MODE_LIBRARY ONLY)
#set(CMAKE_FIND_ROOT_PATH_MODE_INCLUDE ONLY)
#set(CMAKE_FIND_ROOT_PATH_MODE_PACKAGE ONLY)


# Prefix detection only works with compiler id "GNU"
# CMake doesn't automatically look for prefixed 'windres', do it manually:
SET(CMAKE_RC_COMPILER ${GNU_HOST}-windres)

