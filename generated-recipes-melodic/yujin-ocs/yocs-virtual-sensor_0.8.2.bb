# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Virtual sensor that uses semantic map information to &quot;see&quot; obstacles undetectable by robot sensors.              Current implementation cannot read obstacles from YAML files. Until this feature gets implemented, we       use auxiliary scripts to read and publish files' content. Data directory contains some example files."
AUTHOR = "Jihoon Lee <jihoonl@yujinrobot.com>"
ROS_AUTHOR = "Jorge Santos"
HOMEPAGE = "http://ros.org/wiki/yocs_virtual_sensor"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "yujin_ocs"
ROS_BPN = "yocs_virtual_sensor"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    roscpp \
    sensor-msgs \
    tf \
    yocs-math-toolkit \
    yocs-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    roscpp \
    rospy \
    rospy-message-converter \
    sensor-msgs \
    tf \
    visualization-msgs \
    yocs-math-toolkit \
    yocs-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    roscpp \
    rospy \
    rospy-message-converter \
    sensor-msgs \
    tf \
    visualization-msgs \
    yocs-math-toolkit \
    yocs-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_virtual_sensor/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "eceff2da688e2afa46a66dfc57b88b97"
SRC_URI[sha256sum] = "4505ba05080e444b2000591f1628a4e204e1efb9e9e45be6a8ccb19506193631"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_virtual_sensor-0.8.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('yujin-ocs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('yujin-ocs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/yujin-ocs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/yujin-ocs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}