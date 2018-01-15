include(ExternalProject)
cmake_minimum_required(VERSION 3.0)
ExternalProject_Add(
babl
SOURCE_DIR babl
GIT_REPOSITORY http://git.gnome.org/browse/babl
PREFIX ${CMAKE_HOME_DIRECTORY}/native
CONFIGURE_COMMAND <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR>

)
ExternalProject_Add(
gegl
DEPENDS babl
SOURCE_DIR gegl
GIT_REPOSITORY http://git.gnome.org/browse/gegl
PATCH_COMMAND patch < ${CMAKE_CURRENT_LIST_DIR}/patches/gegl/01_gettextversion.diff
PREFIX ${CMAKE_HOME_DIRECTORY}/native
CONFIGURE_COMMAND PKG_CONFIG_PATH=${CMAKE_HOME_DIRECTORY}/native/lib/pkgconfig <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR>
)
