package org.lwjgl.vulkan;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/KHRVideoEncodeIntraRefresh.class */
public final class KHRVideoEncodeIntraRefresh {
    public static final int VK_KHR_VIDEO_ENCODE_INTRA_REFRESH_SPEC_VERSION = 1;
    public static final String VK_KHR_VIDEO_ENCODE_INTRA_REFRESH_EXTENSION_NAME = "VK_KHR_video_encode_intra_refresh";
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR = 1000552000;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR = 1000552001;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_INFO_KHR = 1000552002;
    public static final int VK_STRUCTURE_TYPE_VIDEO_REFERENCE_INTRA_REFRESH_INFO_KHR = 1000552003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR = 1000552004;
    public static final int VK_VIDEO_ENCODE_INTRA_REFRESH_BIT_KHR = 4;
    public static final int VK_VIDEO_ENCODE_H264_CAPABILITY_B_PICTURE_INTRA_REFRESH_BIT_KHR = 1024;
    public static final int VK_VIDEO_ENCODE_H265_CAPABILITY_B_PICTURE_INTRA_REFRESH_BIT_KHR = 2048;
    public static final int VK_VIDEO_ENCODE_AV1_CAPABILITY_COMPOUND_PREDICTION_INTRA_REFRESH_BIT_KHR = 32;
    public static final int VK_VIDEO_ENCODE_INTRA_REFRESH_MODE_NONE_KHR = 0;
    public static final int VK_VIDEO_ENCODE_INTRA_REFRESH_MODE_PER_PICTURE_PARTITION_BIT_KHR = 1;
    public static final int VK_VIDEO_ENCODE_INTRA_REFRESH_MODE_BLOCK_BASED_BIT_KHR = 2;
    public static final int VK_VIDEO_ENCODE_INTRA_REFRESH_MODE_BLOCK_ROW_BASED_BIT_KHR = 4;
    public static final int VK_VIDEO_ENCODE_INTRA_REFRESH_MODE_BLOCK_COLUMN_BASED_BIT_KHR = 8;

    private KHRVideoEncodeIntraRefresh() {
    }
}
