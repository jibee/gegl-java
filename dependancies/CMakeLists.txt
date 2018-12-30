include(ExternalProject)
cmake_minimum_required(VERSION 3.0)

# Building for Linux / x86-64
ExternalProject_Add(
babl-linux-x86-64
SOURCE_DIR babl
#GIT_REPOSITORY http://git.gnome.org/browse/babl
INSTALL_DIR ${CMAKE_HOME_DIRECTORY}/native/linux-x86-64
CONFIGURE_COMMAND <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR> --disable-maintainer-mode

)
ExternalProject_Add(
gegl-linux-x86-64
DEPENDS babl-linux-x86-64
SOURCE_DIR gegl
#GIT_REPOSITORY http://git.gnome.org/browse/gegl
#PATCH_COMMAND patch < ${CMAKE_CURRENT_LIST_DIR}/patches/gegl/01_gettextversion.diff
INSTALL_DIR ${CMAKE_HOME_DIRECTORY}/native/linux-x86-64
CONFIGURE_COMMAND PKG_CONFIG_PATH=${CMAKE_HOME_DIRECTORY}/native/lib/pkgconfig <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR> --disable-maintainer-mode
)

# Building for Windows / x86-64
# CC=x86_64-w64-mingw32-gcc CXX=x86_64-w64-mingw32-g++ 

SET(WINDOWS_INSTALL ${CMAKE_HOME_DIRECTORY}/native/win-x86-64)

ExternalProject_Add(
lcms-win-x86-64
SOURCE_DIR lcms
URL https://downloads.sourceforge.net/project/lcms/lcms/2.9/lcms2-2.9.tar.gz
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_PATH=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32
)


ExternalProject_Add(
babl-win-x86-64
DEPENDS lcms-win-x86-64
SOURCE_DIR babl
#GIT_REPOSITORY http://git.gnome.org/browse/babl
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_PATH=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32
)

ExternalProject_Add(
iconv-win-x86-64
SOURCE_DIR iconv
URL https://ftp.gnu.org/pub/gnu/libiconv/libiconv-1.15.tar.gz
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_PATH=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)

ExternalProject_Add(
pcre-win-x86-64
SOURCE_DIR pcre
URL https://ftp.pcre.org/pub/pcre/pcre-8.42.tar.bz2
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_PATH=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)

ExternalProject_Add(
ffi-win-x86-64
SOURCE_DIR ffi
URL ftp://sourceware.org/pub/libffi/libffi-3.2.1.tar.gz
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_PATH=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)

ExternalProject_Add(
zlib-win-x86-64
SOURCE_DIR zlib
URL https://zlib.net/zlib-1.2.11.tar.xz
INSTALL_DIR ${WINDOWS_INSTALL}
PATCH_COMMAND patch -p1 < ${CMAKE_CURRENT_LIST_DIR}/patches/zlib.patch
BUILD_IN_SOURCE 1
BUILD_COMMAND PREFIX=x86_64-w64-mingw32- make -f win32/Makefile.gcc
INSTALL_COMMAND PREFIX=x86_64-w64-mingw32- INCLUDE_PATH=${WINDOWS_INSTALL}/include LIBRARY_PATH=${WINDOWS_INSTALL}/lib BINARY_PATH=${WINDOWS_INSTALL}/bin make -f win32/Makefile.gcc install
)


ExternalProject_Add(
gettext-win-x86-64
SOURCE_DIR gettext
DEPENDS iconv-win-x86-64
URL http://ftp.gnu.org/pub/gnu/gettext/gettext-0.18.3.1.tar.gz
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND CFLAGS=-O2 CXXFLAGS=-O2 PKG_CONFIG_PATH=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)

ExternalProject_Add(
glib-win-x86-64
SOURCE_DIR glib
DEPENDS gettext-win-x86-64 pcre-win-x86-64 ffi-win-x86-64
URL https://download.gnome.org/sources/glib/2.58/glib-2.58.2.tar.xz
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_PATH=${WINDOWS_INSTALL}/lib/pkgconfig CPPFLAGS=-I<INSTALL_DIR>/include LDFLAGS=-L<INSTALL_DIR>/lib <SOURCE_DIR>/autogen.sh --exec-prefix=<INSTALL_DIR> --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32
)


ExternalProject_Add(
gegl-win-x86-64
DEPENDS babl-win-x86-64 glib-win-x86-64
SOURCE_DIR gegl
#GIT_REPOSITORY http://git.gnome.org/browse/gegl
#PATCH_COMMAND patch < ${CMAKE_CURRENT_LIST_DIR}/patches/gegl/01_gettextversion.diff
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_PATH=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32
)
