SUMMARY = "C++ bindings for linux gpio APIs"
DESCRIPTION = "C++ bindings for linux gpio APIs."
HOMEPAGE = "http://github.com/openbmc/gpioplus"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"
SRCREV = "6975122d3a63ed710ae1a871dca8268c8bea3338"
PV = "0.1+git${SRCPV}"
PR = "r1"

SRC_URI = "git://github.com/openbmc/gpioplus;branch=master;protocol=https"

S = "${WORKDIR}/git"

inherit meson pkgconfig

EXTRA_OEMESON = " \
        -Dexamples=false \
        -Dtests=disabled \
        "
