include(ExternalProject)
cmake_minimum_required(VERSION 3.0)

SET(LINUX_AMD64_INSTALL ${CMAKE_HOME_DIRECTORY}/native/linux-x86-64)

# Building for Linux / x86-64
ExternalProject_Add(
babl-linux-x86-64
SOURCE_DIR babl
#GIT_REPOSITORY http://git.gnome.org/browse/babl
URL https://download.gimp.org/pub/babl/0.1/babl-0.1.60.tar.bz2
URL_HASH SHA512=a65533b4527c4334c7ab14fb16be41e3e2e93f51bbeb24dd427fa9263e25fa8ad83337b73a805bebc2414fb57bccceaa681f89ce5c5187bd0a03703bf07cccc2
INSTALL_DIR ${LINUX_AMD64_INSTALL}
CONFIGURE_COMMAND <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR> --disable-maintainer-mode

)
ExternalProject_Add(
gegl-linux-x86-64
DEPENDS babl-linux-x86-64
SOURCE_DIR gegl
#GIT_REPOSITORY http://git.gnome.org/browse/gegl
URL https://download.gimp.org/pub/gegl/0.4/gegl-0.4.12.tar.bz2
URL_HASH SHA512=cacf9f5c34357b3939162d0d4712ee2b47298a3e806b55e275cdf5e23f186d436ea1a840b91b1b72b76d450d94674cca217b7c253cd6b52a7d9505b4ad73fde2
PATCH_COMMAND patch < ${CMAKE_CURRENT_LIST_DIR}/patches/gegl/01_gettextversion.diff
INSTALL_DIR ${LINUX_AMD64_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_PATH=${LINUX_AMD64_INSTALL}/lib/pkgconfig <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR> --disable-maintainer-mode
)

# Building for Windows / x86-64
# CC=x86_64-w64-mingw32-gcc CXX=x86_64-w64-mingw32-g++ 

SET(WINDOWS_INSTALL ${CMAKE_HOME_DIRECTORY}/native/win-x86-64)

ExternalProject_Add(
lcms-win-x86-64
SOURCE_DIR lcms
URL https://downloads.sourceforge.net/project/lcms/lcms/2.9/lcms2-2.9.tar.gz
URL_HASH SHA512=70b1c51fa8d137d5072425e580745ff1fbf49c6e8bb1da0a8adb0647d3b7c095208793cb02de1e8d1a01363b8575fa60c61bedbff99bbec57a44228239cb00e5
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32
)


ExternalProject_Add(
babl-win-x86-64
DEPENDS lcms-win-x86-64
SOURCE_DIR babl
#GIT_REPOSITORY http://git.gnome.org/browse/babl
URL https://download.gimp.org/pub/babl/0.1/babl-0.1.60.tar.bz2
URL_HASH SHA512=a65533b4527c4334c7ab14fb16be41e3e2e93f51bbeb24dd427fa9263e25fa8ad83337b73a805bebc2414fb57bccceaa681f89ce5c5187bd0a03703bf07cccc2
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32
)

ExternalProject_Add(
iconv-win-x86-64
SOURCE_DIR iconv
URL https://ftp.gnu.org/pub/gnu/libiconv/libiconv-1.15.tar.gz
URL_HASH SHA512=1233fe3ca09341b53354fd4bfe342a7589181145a1232c9919583a8c9979636855839049f3406f253a9d9829908816bb71fd6d34dd544ba290d6f04251376b1a
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)

ExternalProject_Add(
pcre-win-x86-64
SOURCE_DIR pcre
URL https://ftp.pcre.org/pub/pcre/pcre-8.42.tar.bz2
URL_HASH SHA512=b47b923108f6ee0c31409b79d0888314271b482a22590e164d02f21d2112fba22dd0342c24f9ba0f5fcc5b8c65550bad08c476e30a2fc79b34ecf4601ed82f3d
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)

ExternalProject_Add(
ffi-win-x86-64
SOURCE_DIR ffi
URL ftp://sourceware.org/pub/libffi/libffi-3.2.1.tar.gz
URL_HASH SHA512=980ca30a8d76f963fca722432b1fe5af77d7a4e4d2eac5144fbc5374d4c596609a293440573f4294207e1bdd9fda80ad1e1cafb2ffb543df5a275bc3bd546483
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)

ExternalProject_Add(
zlib-win-x86-64
SOURCE_DIR zlib
URL https://zlib.net/zlib-1.2.11.tar.xz
URL_HASH SHA512=b7f50ada138c7f93eb7eb1631efccd1d9f03a5e77b6c13c8b757017b2d462e19d2d3e01c50fad60a4ae1bc86d431f6f94c72c11ff410c25121e571953017cb67
INSTALL_DIR ${WINDOWS_INSTALL}
PATCH_COMMAND patch -p1 < ${CMAKE_CURRENT_LIST_DIR}/patches/zlib.patch
CONFIGURE_COMMAND /bin/true
BUILD_IN_SOURCE 1
BUILD_COMMAND SHARED_MODE=1 PREFIX=x86_64-w64-mingw32- make -f win32/Makefile.gcc
INSTALL_COMMAND SHARED_MODE=1 PREFIX=x86_64-w64-mingw32- INCLUDE_PATH=${WINDOWS_INSTALL}/include LIBRARY_PATH=${WINDOWS_INSTALL}/lib BINARY_PATH=${WINDOWS_INSTALL}/bin make -f win32/Makefile.gcc install
)


ExternalProject_Add(
gettext-win-x86-64
SOURCE_DIR gettext
DEPENDS iconv-win-x86-64
URL http://ftp.gnu.org/pub/gnu/gettext/gettext-0.18.3.1.tar.gz
URL_HASH SHA512=b41f4ae5b5dc6459a9b87d6445c259ab8d8500fe760e4c5e6992245e96a1bf1b8ce424be82ff07bd67942301af7d9af4d2219643297e4baadfc8570ad9ab72cc
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND CFLAGS=-O2 CXXFLAGS=-O2 PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)

ExternalProject_Add(
glib-win-x86-64
SOURCE_DIR glib
DEPENDS gettext-win-x86-64 pcre-win-x86-64 ffi-win-x86-64 zlib-win-x86-64
URL https://download.gnome.org/sources/glib/2.58/glib-2.58.2.tar.xz
URL_HASH SHA512=4017ae308f2ef6313abbff2eb9b21ec6f8fa38935007491ca0cb4d1ffac6fedab6f50e911ac088995d6212323ba1767399f18529a2620d60378ecade193b4b1a
INSTALL_DIR ${WINDOWS_INSTALL}
#CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/autogen.sh --exec-prefix=<INSTALL_DIR> --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig CPPFLAGS=-I<INSTALL_DIR>/include LDFLAGS=-L<INSTALL_DIR>/lib <SOURCE_DIR>/autogen.sh --exec-prefix=<INSTALL_DIR> --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared
)

ExternalProject_Add(
jpeg-win-x86-64
SOURCE_DIR jpeg
INSTALL_DIR ${WINDOWS_INSTALL}
URL http://jpegclub.org/reference/wp-content/uploads/2018/03/jpegsrc.v9c.tar.gz
URL_HASH SHA512=2b581c60ae401a79bbbe748ff2deeda5acd50bfd2ea22e5926e36d34b9ebcffb6580b0ff48e972c1441583e30e21e1ea821ca0423f9c67ce08a31dffabdbe6b7
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)

ExternalProject_Add(
expat-win-x86-64
SOURCE_DIR expat
INSTALL_DIR ${WINDOWS_INSTALL}
URL https://github.com/libexpat/libexpat/releases/download/R_2_2_6/expat-2.2.6.tar.bz2
URL_HASH SHA512=dbfb635a5fe7b190722664263a0dd437b512fdf519bc53bd4905567f4bfb4b1e89a021562da63df8cacd48b706d1dea60ccde47f279e57400ad3c846b6e9c4e6
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)

ExternalProject_Add(
exiv2-win-x86-64
SOURCE_DIR exiv2
#INSTALL_DIR ${WINDOWS_INSTALL}
DEPENDS expat-win-x86-64
URL http://www.exiv2.org/builds/exiv2-0.27.0-Source.tar.gz
URL_HASH SHA512=3037d8e84b414e3915b807c5bea39f903668c0774f9dbc1367e23c595d5abaf318c746009e994234bcaf0088ad32a820ea42c9c77c9a53c65a7b5d7781a2c6d4
PATCH_COMMAND patch -p1 < ${CMAKE_CURRENT_LIST_DIR}/patches/exiv2.patch
#CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
CMAKE_ARGS -DCMAKE_TOOLCHAIN_FILE=${CMAKE_HOME_DIRECTORY}/dependancies/MingW64.cmake -DGNU_HOST=x86_64-w64-mingw32 -DCMAKE_INSTALL_PREFIX=${WINDOWS_INSTALL} -DCMAKE_SYSTEM_PREFIX_PATH=${WINDOWS_INSTALL}
)

ExternalProject_Add(
gexiv2-win-x86-64
DEPENDS exiv2-win-x86-64
SOURCE_DIR gexiv2
INSTALL_DIR ${WINDOWS_INSTALL}
URL https://download.gnome.org/sources/gexiv2/0.10/gexiv2-0.10.10.tar.xz
URL_HASH SHA512=41e5b4a9d81882ea4b1bc6f3b9ced95ca4d03f836de30ff90b7a43311e5319f7c0f46cbad767bf2b00926c8e5fd2c1e8ca2a2113c308e23b7a4c21205399abf7
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)

ExternalProject_Add(
png-win-x86-64
DEPENDS zlib-win-x86-64
SOURCE_DIR png
INSTALL_DIR ${WINDOWS_INSTALL}
URL https://download.sourceforge.net/libpng/libpng-1.6.36.tar.xz
URL_HASH SHA512=a86ee977df69748e5039fb0ead883f1d3f88b8a701fa24cf8e62dd77c5871bb46397d794fa33ec1d0be1ac488246832ad79d0e6117ac093bdce1b2a1cfcb2bb0
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig CPPFLAGS=-I<INSTALL_DIR>/include LDFLAGS=-L<INSTALL_DIR>/lib <SOURCE_DIR>/configure --exec-prefix=<INSTALL_DIR> --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32
#CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/configure --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared --enable-static
)


ExternalProject_Add(
json-glib-win-x86-64
SOURCE_DIR json-glib
DEPENDS glib-win-x86-64
URL https://download.gnome.org/sources/json-glib/1.0/json-glib-1.0.4.tar.xz
URL_HASH SHA512=491a2353b7a82015516b5029d400874f35ba9d8ad914eb3f97e6106eaf2daa300147725ffbaaf5a67a6bf0da192beb47cd4edee47ecdb6a4be7dfd5f51463e5b
INSTALL_DIR ${WINDOWS_INSTALL}
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig CPPFLAGS=-I<INSTALL_DIR>/include LDFLAGS=-L<INSTALL_DIR>/lib <SOURCE_DIR>/configure --exec-prefix=<INSTALL_DIR> --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --enable-shared
)

ExternalProject_Add(
libraw-win-x86-64
SOURCE_DIR libraw
URL https://www.libraw.org/data/LibRaw-0.19.2.tar.gz
INSTALL_DIR ${WINDOWS_INSTALL}
URL_HASH SHA512=163b783f26887219d02694c6ca7cdc5571b15efe3922f7e3ca122a875568bd060c40a364451ea94af44c2ae48705bf96cbef196c7e935e42efe6ee316bb291fa
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig CPPFLAGS=-I<INSTALL_DIR>/include LDFLAGS=-L<INSTALL_DIR>/lib <SOURCE_DIR>/configure --exec-prefix=<INSTALL_DIR> --prefix=<INSTALL_DIR>  --host=x86_64-w64-mingw32 --disable-static
)

ExternalProject_Add(
gegl-win-x86-64
DEPENDS babl-win-x86-64 glib-win-x86-64 jpeg-win-x86-64 json-glib-win-x86-64 gexiv2-win-x86-64 libraw-win-x86-64
SOURCE_DIR gegl
#GIT_REPOSITORY http://git.gnome.org/browse/gegl
URL https://download.gimp.org/pub/gegl/0.4/gegl-0.4.12.tar.bz2
URL_HASH SHA512=cacf9f5c34357b3939162d0d4712ee2b47298a3e806b55e275cdf5e23f186d436ea1a840b91b1b72b76d450d94674cca217b7c253cd6b52a7d9505b4ad73fde2
PATCH_COMMAND patch < ${CMAKE_CURRENT_LIST_DIR}/patches/gegl/01_gettextversion.diff
INSTALL_DIR ${WINDOWS_INSTALL}
BUILD_COMMAND make -j8
#CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig <SOURCE_DIR>/autogen.sh --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32
CONFIGURE_COMMAND PKG_CONFIG_LIBDIR=${WINDOWS_INSTALL}/lib/pkgconfig CPPFLAGS=-I<INSTALL_DIR>/include LDFLAGS=-L<INSTALL_DIR>/lib <SOURCE_DIR>/autogen.sh --exec-prefix=<INSTALL_DIR> --prefix=<INSTALL_DIR> --disable-maintainer-mode --host=x86_64-w64-mingw32 --without-sdl
)
