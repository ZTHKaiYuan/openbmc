SUMMARY = "Phosphor OpenBMC KCS to DBUS"
DESCRIPTION = "Phosphor OpenBMC KCS to DBUS."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1beb00e508e89da1ed2a541934f28c0"
DEPENDS += " \
        sdbusplus \
        sdeventplus \
        stdplus \
        systemd \
        "
PROVIDES += "virtual/obmc-host-ipmi-hw"
SRCREV = "f27ed42c224cf59aabb2ed9ce675db42a2a36e9d"
PV = "1.0+git${SRCPV}"
PR = "r1"

SRC_URI = "git://github.com/openbmc/kcsbridge.git;branch=master;protocol=https"

SYSTEMD_SERVICE:${PN} = "${PN}@${KCS_DEVICE}.service"
S = "${WORKDIR}/git"

inherit meson pkgconfig
inherit systemd

RRECOMMENDS:${PN} += "phosphor-ipmi-host"

RPROVIDES:${PN} += "virtual-obmc-host-ipmi-hw"

FILES:${PN} += "${systemd_system_unitdir}/${PN}@.service"

KCS_DEVICE ?= "ipmi-kcs3"
