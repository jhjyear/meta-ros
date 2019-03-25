# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A configuration package defining the default ROS interface generators."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidl_defaults"
ROS_BPN = "rosidl_default_generators"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-core-native \
    rosidl-cmake-native \
    rosidl-generator-c-native \
    rosidl-generator-cpp-native \
    rosidl-generator-py-native \
    rosidl-typesupport-c-native \
    rosidl-typesupport-cpp-native \
    rosidl-typesupport-introspection-c-native \
    rosidl-typesupport-introspection-cpp-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rosidl_defaults-release/archive/release/crystal/rosidl_default_generators/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1ee10c955b39f3f0055b313abb92b07b"
SRC_URI[sha256sum] = "0d994dd35ba40f84ae30f6ef0d14a5d00acfd24ca660e55b05a3882e811802a3"
S = "${WORKDIR}/rosidl_defaults-release-release-crystal-rosidl_default_generators-0.6.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosidl-defaults', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rosidl-defaults', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-defaults/rosidl-defaults_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-defaults/rosidl-defaults-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-defaults/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-defaults/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}