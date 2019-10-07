# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around console_bridge, providing nothing but a dependency on console_bridge, on some systems.     On others, it provides an ExternalProject build of console_bridge."
AUTHOR = "Steven! Ragnarök <steven@osrfoundation.org>"
HOMEPAGE = "https://github.com/ros/console_bridge"
SECTION = "devel"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_CN = "console_bridge_vendor"
ROS_BPN = "console_bridge_vendor"

ROS_BUILD_DEPENDS = " \
    console-bridge \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    console-bridge \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    console-bridge \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/console_bridge_vendor-release/archive/release/dashing/console_bridge_vendor/1.2.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e7990b86da459b0d753b98f4da8b59ec"
SRC_URI[sha256sum] = "6d21c708f3252482d7dffa02dbd0c2b3e94491dbe5dca0148ac190d62a787646"
S = "${WORKDIR}/console_bridge_vendor-release-release-dashing-console_bridge_vendor-1.2.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('console-bridge-vendor', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('console-bridge-vendor', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/console-bridge-vendor/console-bridge-vendor_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/console-bridge-vendor/console-bridge-vendor-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/console-bridge-vendor/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/console-bridge-vendor/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
