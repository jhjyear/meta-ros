# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Node for using a video file as video topic source."
AUTHOR = "Martin Pecka <peckama2@fel.cvut.cz>"
ROS_AUTHOR = "Martin Pecka"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "movie_publisher"
ROS_BPN = "movie_publisher"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-imageio} \
    cv-bridge \
    ffmpeg \
    opencv \
    rosbash-params \
    rospy \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/peci1/movie_publisher-release/archive/release/melodic/movie_publisher/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "02decd74a325c5b5ce0964f468a476fc"
SRC_URI[sha256sum] = "d25ff36cadc9c0e22259a1e55b9e761efcc0e9ed0f4c1fcd30c1f919dfb90f4b"
S = "${WORKDIR}/movie_publisher-release-release-melodic-movie_publisher-1.3.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('movie-publisher', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('movie-publisher', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/movie-publisher/movie-publisher_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/movie-publisher/movie-publisher-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/movie-publisher/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/movie-publisher/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}