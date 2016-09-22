include(ExternalProject)
cmake_minimum_required(VERSION 3.0)
ExternalProject_Add(
babl
SOURCE_DIR babl
GIT_REPOSITORY http://git.gnome.org/browse/babl
PREFIX ${CMAKE_HOME_DIRECTORY}/3rdParty
CONFIGURE_COMMAND <SOURCE_DIR>/configure --prefix=<INSTALL_DIR>

)
ExternalProject_Add(
gegl
DEPENDS babl
SOURCE_DIR gegl
GIT_REPOSITORY http://git.gnome.org/browse/gegl
PREFIX ${CMAKE_HOME_DIRECTORY}/3rdParty
CONFIGURE_COMMAND PKG_CONFIG_PATH=${CMAKE_HOME_DIRECTORY}/3rdParty/lib/pkgconfig <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR>
)
