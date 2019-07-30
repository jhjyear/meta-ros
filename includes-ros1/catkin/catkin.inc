# Copyright (c) 2019 LG Electronics, Inc.

FILESEXTRAPATHS_prepend := "${THISDIR}/catkin:"
SRC_URI += " \
    file://0001-use-python-provided-by-environment-instead-of-the-ge.patch \
    file://0001-allow-proper-cross-compilation-with-catkin.patch \
"

ROS_BUILD_DEPENDS_remove = "python-catkin-pkg"
ROS_BUILD_DEPENDS_remove = "python-empy"

ROS_BUILDTOOL_DEPENDS += " \
    python-catkin-pkg-native \
    python-empy-native \
"