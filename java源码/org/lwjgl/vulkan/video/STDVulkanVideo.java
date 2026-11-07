package org.lwjgl.vulkan.video;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/STDVulkanVideo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/STDVulkanVideo.class */
public class STDVulkanVideo {
    protected STDVulkanVideo() {
        throw new UnsupportedOperationException();
    }

    @NativeType("uint32_t")
    public static int VK_MAKE_VIDEO_STD_VERSION(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return (major << 22) | (minor << 12) | patch;
    }
}
