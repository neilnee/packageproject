LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := mavenlibpack
LOCAL_SRC_FILES := hello-jni.c

include $(BUILD_SHARED_LIBRARY)
