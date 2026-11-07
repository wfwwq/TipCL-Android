package org.lwjgl.vulkan;

import java.util.Set;
import org.lwjgl.system.Checks;
import org.lwjgl.system.FunctionProvider;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VKCapabilitiesInstance.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VKCapabilitiesInstance.class */
public class VKCapabilitiesInstance {
    public final long vkDestroyInstance;
    public final long vkEnumeratePhysicalDevices;
    public final long vkGetPhysicalDeviceFeatures;
    public final long vkGetPhysicalDeviceFormatProperties;
    public final long vkGetPhysicalDeviceImageFormatProperties;
    public final long vkGetPhysicalDeviceProperties;
    public final long vkGetPhysicalDeviceQueueFamilyProperties;
    public final long vkGetPhysicalDeviceMemoryProperties;
    public final long vkCreateDevice;
    public final long vkEnumerateDeviceExtensionProperties;
    public final long vkEnumerateDeviceLayerProperties;
    public final long vkGetPhysicalDeviceSparseImageFormatProperties;
    public final long vkEnumeratePhysicalDeviceGroups;
    public final long vkGetPhysicalDeviceFeatures2;
    public final long vkGetPhysicalDeviceProperties2;
    public final long vkGetPhysicalDeviceFormatProperties2;
    public final long vkGetPhysicalDeviceImageFormatProperties2;
    public final long vkGetPhysicalDeviceQueueFamilyProperties2;
    public final long vkGetPhysicalDeviceMemoryProperties2;
    public final long vkGetPhysicalDeviceSparseImageFormatProperties2;
    public final long vkGetPhysicalDeviceExternalBufferProperties;
    public final long vkGetPhysicalDeviceExternalFenceProperties;
    public final long vkGetPhysicalDeviceExternalSemaphoreProperties;
    public final long vkGetPhysicalDeviceToolProperties;
    public final long vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM;
    public final long vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM;
    public final long vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM;
    public final long vkGetPhysicalDeviceExternalTensorPropertiesARM;
    public final long vkAcquireDrmDisplayEXT;
    public final long vkGetDrmDisplayEXT;
    public final long vkAcquireXlibDisplayEXT;
    public final long vkGetRandROutputDisplayEXT;
    public final long vkGetPhysicalDeviceCalibrateableTimeDomainsEXT;
    public final long vkCreateDebugReportCallbackEXT;
    public final long vkDestroyDebugReportCallbackEXT;
    public final long vkDebugReportMessageEXT;
    public final long vkSetDebugUtilsObjectNameEXT;
    public final long vkSetDebugUtilsObjectTagEXT;
    public final long vkQueueBeginDebugUtilsLabelEXT;
    public final long vkQueueEndDebugUtilsLabelEXT;
    public final long vkQueueInsertDebugUtilsLabelEXT;
    public final long vkCmdBeginDebugUtilsLabelEXT;
    public final long vkCmdEndDebugUtilsLabelEXT;
    public final long vkCmdInsertDebugUtilsLabelEXT;
    public final long vkCreateDebugUtilsMessengerEXT;
    public final long vkDestroyDebugUtilsMessengerEXT;
    public final long vkSubmitDebugUtilsMessageEXT;
    public final long vkGetPhysicalDeviceDescriptorSizeEXT;
    public final long vkReleaseDisplayEXT;
    public final long vkCreateDirectFBSurfaceEXT;
    public final long vkGetPhysicalDeviceDirectFBPresentationSupportEXT;
    public final long vkGetPhysicalDeviceSurfaceCapabilities2EXT;
    public final long vkGetPhysicalDeviceSurfacePresentModes2EXT;
    public final long vkCreateHeadlessSurfaceEXT;
    public final long vkCreateMetalSurfaceEXT;
    public final long vkGetPhysicalDeviceMultisamplePropertiesEXT;
    public final long vkGetPhysicalDeviceToolPropertiesEXT;
    public final long vkCreateAndroidSurfaceKHR;
    public final long vkGetPhysicalDeviceCalibrateableTimeDomainsKHR;
    public final long vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR;
    public final long vkGetPhysicalDevicePresentRectanglesKHR;
    public final long vkEnumeratePhysicalDeviceGroupsKHR;
    public final long vkGetPhysicalDeviceDisplayPropertiesKHR;
    public final long vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
    public final long vkGetDisplayPlaneSupportedDisplaysKHR;
    public final long vkGetDisplayModePropertiesKHR;
    public final long vkCreateDisplayModeKHR;
    public final long vkGetDisplayPlaneCapabilitiesKHR;
    public final long vkCreateDisplayPlaneSurfaceKHR;
    public final long vkGetPhysicalDeviceExternalFencePropertiesKHR;
    public final long vkGetPhysicalDeviceExternalBufferPropertiesKHR;
    public final long vkGetPhysicalDeviceExternalSemaphorePropertiesKHR;
    public final long vkGetPhysicalDeviceFragmentShadingRatesKHR;
    public final long vkGetPhysicalDeviceDisplayProperties2KHR;
    public final long vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
    public final long vkGetDisplayModeProperties2KHR;
    public final long vkGetDisplayPlaneCapabilities2KHR;
    public final long vkGetPhysicalDeviceFeatures2KHR;
    public final long vkGetPhysicalDeviceProperties2KHR;
    public final long vkGetPhysicalDeviceFormatProperties2KHR;
    public final long vkGetPhysicalDeviceImageFormatProperties2KHR;
    public final long vkGetPhysicalDeviceQueueFamilyProperties2KHR;
    public final long vkGetPhysicalDeviceMemoryProperties2KHR;
    public final long vkGetPhysicalDeviceSparseImageFormatProperties2KHR;
    public final long vkGetPhysicalDeviceSurfaceCapabilities2KHR;
    public final long vkGetPhysicalDeviceSurfaceFormats2KHR;
    public final long vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR;
    public final long vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;
    public final long vkDestroySurfaceKHR;
    public final long vkGetPhysicalDeviceSurfaceSupportKHR;
    public final long vkGetPhysicalDeviceSurfaceCapabilitiesKHR;
    public final long vkGetPhysicalDeviceSurfaceFormatsKHR;
    public final long vkGetPhysicalDeviceSurfacePresentModesKHR;
    public final long vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR;
    public final long vkGetPhysicalDeviceVideoCapabilitiesKHR;
    public final long vkGetPhysicalDeviceVideoFormatPropertiesKHR;
    public final long vkCreateWaylandSurfaceKHR;
    public final long vkGetPhysicalDeviceWaylandPresentationSupportKHR;
    public final long vkCreateWin32SurfaceKHR;
    public final long vkGetPhysicalDeviceWin32PresentationSupportKHR;
    public final long vkCreateXcbSurfaceKHR;
    public final long vkGetPhysicalDeviceXcbPresentationSupportKHR;
    public final long vkCreateXlibSurfaceKHR;
    public final long vkGetPhysicalDeviceXlibPresentationSupportKHR;
    public final long vkCreateMacOSSurfaceMVK;
    public final long vkAcquireWinrtDisplayNV;
    public final long vkGetWinrtDisplayNV;
    public final long vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;
    public final long vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV;
    public final long vkGetPhysicalDeviceCooperativeVectorPropertiesNV;
    public final long vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;
    public final long vkGetPhysicalDeviceExternalImageFormatPropertiesNV;
    public final long vkGetPhysicalDeviceOpticalFlowImageFormatsNV;
    public final int apiVersion;
    public final boolean Vulkan10;
    public final boolean Vulkan11;
    public final boolean Vulkan12;
    public final boolean Vulkan13;
    public final boolean Vulkan14;
    public final boolean VK_EXT_acquire_drm_display;
    public final boolean VK_EXT_acquire_xlib_display;
    public final boolean VK_EXT_debug_report;
    public final boolean VK_EXT_debug_utils;
    public final boolean VK_EXT_direct_mode_display;
    public final boolean VK_EXT_directfb_surface;
    public final boolean VK_EXT_display_surface_counter;
    public final boolean VK_EXT_headless_surface;
    public final boolean VK_EXT_layer_settings;
    public final boolean VK_EXT_metal_surface;
    public final boolean VK_EXT_surface_maintenance1;
    public final boolean VK_EXT_swapchain_colorspace;
    public final boolean VK_EXT_validation_features;
    public final boolean VK_EXT_validation_flags;
    public final boolean VK_GOOGLE_surfaceless_query;
    public final boolean VK_KHR_android_surface;
    public final boolean VK_KHR_device_group_creation;
    public final boolean VK_KHR_display;
    public final boolean VK_KHR_external_fence_capabilities;
    public final boolean VK_KHR_external_memory_capabilities;
    public final boolean VK_KHR_external_semaphore_capabilities;
    public final boolean VK_KHR_get_display_properties2;
    public final boolean VK_KHR_get_physical_device_properties2;
    public final boolean VK_KHR_get_surface_capabilities2;
    public final boolean VK_KHR_portability_enumeration;
    public final boolean VK_KHR_surface;
    public final boolean VK_KHR_surface_maintenance1;
    public final boolean VK_KHR_surface_protected_capabilities;
    public final boolean VK_KHR_wayland_surface;
    public final boolean VK_KHR_win32_surface;
    public final boolean VK_KHR_xcb_surface;
    public final boolean VK_KHR_xlib_surface;
    public final boolean VK_LUNARG_direct_driver_loading;
    public final boolean VK_MVK_macos_surface;
    public final boolean VK_NV_display_stereo;
    public final boolean VK_NV_external_memory_capabilities;

    VKCapabilitiesInstance(FunctionProvider provider, int apiVersion, Set<String> ext, Set<String> deviceExt) {
        this.apiVersion = apiVersion;
        long[] caps = new long[113];
        this.Vulkan10 = check_VK10(provider, caps, ext);
        this.Vulkan11 = check_VK11(provider, caps, ext);
        this.Vulkan12 = ext.contains("Vulkan12");
        this.Vulkan13 = check_VK13(provider, caps, ext);
        this.Vulkan14 = ext.contains("Vulkan14");
        check_ARM_data_graph(provider, caps, deviceExt);
        check_ARM_performance_counters_by_region(provider, caps, deviceExt);
        check_ARM_tensors(provider, caps, deviceExt);
        this.VK_EXT_acquire_drm_display = check_EXT_acquire_drm_display(provider, caps, ext);
        this.VK_EXT_acquire_xlib_display = check_EXT_acquire_xlib_display(provider, caps, ext);
        check_EXT_calibrated_timestamps(provider, caps, deviceExt);
        this.VK_EXT_debug_report = check_EXT_debug_report(provider, caps, ext);
        this.VK_EXT_debug_utils = check_EXT_debug_utils(provider, caps, ext);
        check_EXT_descriptor_heap(provider, caps, deviceExt);
        this.VK_EXT_direct_mode_display = check_EXT_direct_mode_display(provider, caps, ext);
        this.VK_EXT_directfb_surface = check_EXT_directfb_surface(provider, caps, ext);
        this.VK_EXT_display_surface_counter = check_EXT_display_surface_counter(provider, caps, ext);
        check_EXT_full_screen_exclusive(provider, caps, deviceExt);
        this.VK_EXT_headless_surface = check_EXT_headless_surface(provider, caps, ext);
        this.VK_EXT_layer_settings = ext.contains(EXTLayerSettings.VK_EXT_LAYER_SETTINGS_EXTENSION_NAME);
        this.VK_EXT_metal_surface = check_EXT_metal_surface(provider, caps, ext);
        check_EXT_sample_locations(provider, caps, deviceExt);
        this.VK_EXT_surface_maintenance1 = ext.contains(EXTSurfaceMaintenance1.VK_EXT_SURFACE_MAINTENANCE_1_EXTENSION_NAME);
        this.VK_EXT_swapchain_colorspace = ext.contains(EXTSwapchainColorspace.VK_EXT_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME);
        check_EXT_tooling_info(provider, caps, deviceExt);
        this.VK_EXT_validation_features = ext.contains(EXTValidationFeatures.VK_EXT_VALIDATION_FEATURES_EXTENSION_NAME);
        this.VK_EXT_validation_flags = ext.contains(EXTValidationFlags.VK_EXT_VALIDATION_FLAGS_EXTENSION_NAME);
        this.VK_GOOGLE_surfaceless_query = ext.contains(GOOGLESurfacelessQuery.VK_GOOGLE_SURFACELESS_QUERY_EXTENSION_NAME);
        this.VK_KHR_android_surface = check_KHR_android_surface(provider, caps, ext);
        check_KHR_calibrated_timestamps(provider, caps, deviceExt);
        check_KHR_cooperative_matrix(provider, caps, deviceExt);
        check_KHR_device_group(provider, caps, deviceExt);
        this.VK_KHR_device_group_creation = check_KHR_device_group_creation(provider, caps, ext);
        this.VK_KHR_display = check_KHR_display(provider, caps, ext);
        this.VK_KHR_external_fence_capabilities = check_KHR_external_fence_capabilities(provider, caps, ext);
        this.VK_KHR_external_memory_capabilities = check_KHR_external_memory_capabilities(provider, caps, ext);
        this.VK_KHR_external_semaphore_capabilities = check_KHR_external_semaphore_capabilities(provider, caps, ext);
        check_KHR_fragment_shading_rate(provider, caps, deviceExt);
        this.VK_KHR_get_display_properties2 = check_KHR_get_display_properties2(provider, caps, ext);
        this.VK_KHR_get_physical_device_properties2 = check_KHR_get_physical_device_properties2(provider, caps, ext);
        this.VK_KHR_get_surface_capabilities2 = check_KHR_get_surface_capabilities2(provider, caps, ext);
        check_KHR_performance_query(provider, caps, deviceExt);
        this.VK_KHR_portability_enumeration = ext.contains(KHRPortabilityEnumeration.VK_KHR_PORTABILITY_ENUMERATION_EXTENSION_NAME);
        this.VK_KHR_surface = check_KHR_surface(provider, caps, ext);
        this.VK_KHR_surface_maintenance1 = ext.contains(KHRSurfaceMaintenance1.VK_KHR_SURFACE_MAINTENANCE_1_EXTENSION_NAME);
        this.VK_KHR_surface_protected_capabilities = ext.contains(KHRSurfaceProtectedCapabilities.VK_KHR_SURFACE_PROTECTED_CAPABILITIES_EXTENSION_NAME);
        check_KHR_swapchain(provider, caps, deviceExt);
        check_KHR_video_encode_queue(provider, caps, deviceExt);
        check_KHR_video_queue(provider, caps, deviceExt);
        this.VK_KHR_wayland_surface = check_KHR_wayland_surface(provider, caps, ext);
        this.VK_KHR_win32_surface = check_KHR_win32_surface(provider, caps, ext);
        this.VK_KHR_xcb_surface = check_KHR_xcb_surface(provider, caps, ext);
        this.VK_KHR_xlib_surface = check_KHR_xlib_surface(provider, caps, ext);
        this.VK_LUNARG_direct_driver_loading = ext.contains(LUNARGDirectDriverLoading.VK_LUNARG_DIRECT_DRIVER_LOADING_EXTENSION_NAME);
        this.VK_MVK_macos_surface = check_MVK_macos_surface(provider, caps, ext);
        check_NV_acquire_winrt_display(provider, caps, deviceExt);
        check_NV_cooperative_matrix(provider, caps, deviceExt);
        check_NV_cooperative_matrix2(provider, caps, deviceExt);
        check_NV_cooperative_vector(provider, caps, deviceExt);
        check_NV_coverage_reduction_mode(provider, caps, deviceExt);
        this.VK_NV_display_stereo = ext.contains(NVDisplayStereo.VK_NV_DISPLAY_STEREO_EXTENSION_NAME);
        this.VK_NV_external_memory_capabilities = check_NV_external_memory_capabilities(provider, caps, ext);
        check_NV_optical_flow(provider, caps, deviceExt);
        this.vkDestroyInstance = caps[0];
        this.vkEnumeratePhysicalDevices = caps[1];
        this.vkGetPhysicalDeviceFeatures = caps[2];
        this.vkGetPhysicalDeviceFormatProperties = caps[3];
        this.vkGetPhysicalDeviceImageFormatProperties = caps[4];
        this.vkGetPhysicalDeviceProperties = caps[5];
        this.vkGetPhysicalDeviceQueueFamilyProperties = caps[6];
        this.vkGetPhysicalDeviceMemoryProperties = caps[7];
        this.vkCreateDevice = caps[8];
        this.vkEnumerateDeviceExtensionProperties = caps[9];
        this.vkEnumerateDeviceLayerProperties = caps[10];
        this.vkGetPhysicalDeviceSparseImageFormatProperties = caps[11];
        this.vkEnumeratePhysicalDeviceGroups = caps[12];
        this.vkGetPhysicalDeviceFeatures2 = caps[13];
        this.vkGetPhysicalDeviceProperties2 = caps[14];
        this.vkGetPhysicalDeviceFormatProperties2 = caps[15];
        this.vkGetPhysicalDeviceImageFormatProperties2 = caps[16];
        this.vkGetPhysicalDeviceQueueFamilyProperties2 = caps[17];
        this.vkGetPhysicalDeviceMemoryProperties2 = caps[18];
        this.vkGetPhysicalDeviceSparseImageFormatProperties2 = caps[19];
        this.vkGetPhysicalDeviceExternalBufferProperties = caps[20];
        this.vkGetPhysicalDeviceExternalFenceProperties = caps[21];
        this.vkGetPhysicalDeviceExternalSemaphoreProperties = caps[22];
        this.vkGetPhysicalDeviceToolProperties = caps[23];
        this.vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM = caps[24];
        this.vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM = caps[25];
        this.vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM = caps[26];
        this.vkGetPhysicalDeviceExternalTensorPropertiesARM = caps[27];
        this.vkAcquireDrmDisplayEXT = caps[28];
        this.vkGetDrmDisplayEXT = caps[29];
        this.vkAcquireXlibDisplayEXT = caps[30];
        this.vkGetRandROutputDisplayEXT = caps[31];
        this.vkGetPhysicalDeviceCalibrateableTimeDomainsEXT = caps[32];
        this.vkCreateDebugReportCallbackEXT = caps[33];
        this.vkDestroyDebugReportCallbackEXT = caps[34];
        this.vkDebugReportMessageEXT = caps[35];
        this.vkSetDebugUtilsObjectNameEXT = caps[36];
        this.vkSetDebugUtilsObjectTagEXT = caps[37];
        this.vkQueueBeginDebugUtilsLabelEXT = caps[38];
        this.vkQueueEndDebugUtilsLabelEXT = caps[39];
        this.vkQueueInsertDebugUtilsLabelEXT = caps[40];
        this.vkCmdBeginDebugUtilsLabelEXT = caps[41];
        this.vkCmdEndDebugUtilsLabelEXT = caps[42];
        this.vkCmdInsertDebugUtilsLabelEXT = caps[43];
        this.vkCreateDebugUtilsMessengerEXT = caps[44];
        this.vkDestroyDebugUtilsMessengerEXT = caps[45];
        this.vkSubmitDebugUtilsMessageEXT = caps[46];
        this.vkGetPhysicalDeviceDescriptorSizeEXT = caps[47];
        this.vkReleaseDisplayEXT = caps[48];
        this.vkCreateDirectFBSurfaceEXT = caps[49];
        this.vkGetPhysicalDeviceDirectFBPresentationSupportEXT = caps[50];
        this.vkGetPhysicalDeviceSurfaceCapabilities2EXT = caps[51];
        this.vkGetPhysicalDeviceSurfacePresentModes2EXT = caps[52];
        this.vkCreateHeadlessSurfaceEXT = caps[53];
        this.vkCreateMetalSurfaceEXT = caps[54];
        this.vkGetPhysicalDeviceMultisamplePropertiesEXT = caps[55];
        this.vkGetPhysicalDeviceToolPropertiesEXT = caps[56];
        this.vkCreateAndroidSurfaceKHR = caps[57];
        this.vkGetPhysicalDeviceCalibrateableTimeDomainsKHR = caps[58];
        this.vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR = caps[59];
        this.vkGetPhysicalDevicePresentRectanglesKHR = caps[60];
        this.vkEnumeratePhysicalDeviceGroupsKHR = caps[61];
        this.vkGetPhysicalDeviceDisplayPropertiesKHR = caps[62];
        this.vkGetPhysicalDeviceDisplayPlanePropertiesKHR = caps[63];
        this.vkGetDisplayPlaneSupportedDisplaysKHR = caps[64];
        this.vkGetDisplayModePropertiesKHR = caps[65];
        this.vkCreateDisplayModeKHR = caps[66];
        this.vkGetDisplayPlaneCapabilitiesKHR = caps[67];
        this.vkCreateDisplayPlaneSurfaceKHR = caps[68];
        this.vkGetPhysicalDeviceExternalFencePropertiesKHR = caps[69];
        this.vkGetPhysicalDeviceExternalBufferPropertiesKHR = caps[70];
        this.vkGetPhysicalDeviceExternalSemaphorePropertiesKHR = caps[71];
        this.vkGetPhysicalDeviceFragmentShadingRatesKHR = caps[72];
        this.vkGetPhysicalDeviceDisplayProperties2KHR = caps[73];
        this.vkGetPhysicalDeviceDisplayPlaneProperties2KHR = caps[74];
        this.vkGetDisplayModeProperties2KHR = caps[75];
        this.vkGetDisplayPlaneCapabilities2KHR = caps[76];
        this.vkGetPhysicalDeviceFeatures2KHR = caps[77];
        this.vkGetPhysicalDeviceProperties2KHR = caps[78];
        this.vkGetPhysicalDeviceFormatProperties2KHR = caps[79];
        this.vkGetPhysicalDeviceImageFormatProperties2KHR = caps[80];
        this.vkGetPhysicalDeviceQueueFamilyProperties2KHR = caps[81];
        this.vkGetPhysicalDeviceMemoryProperties2KHR = caps[82];
        this.vkGetPhysicalDeviceSparseImageFormatProperties2KHR = caps[83];
        this.vkGetPhysicalDeviceSurfaceCapabilities2KHR = caps[84];
        this.vkGetPhysicalDeviceSurfaceFormats2KHR = caps[85];
        this.vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR = caps[86];
        this.vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR = caps[87];
        this.vkDestroySurfaceKHR = caps[88];
        this.vkGetPhysicalDeviceSurfaceSupportKHR = caps[89];
        this.vkGetPhysicalDeviceSurfaceCapabilitiesKHR = caps[90];
        this.vkGetPhysicalDeviceSurfaceFormatsKHR = caps[91];
        this.vkGetPhysicalDeviceSurfacePresentModesKHR = caps[92];
        this.vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR = caps[93];
        this.vkGetPhysicalDeviceVideoCapabilitiesKHR = caps[94];
        this.vkGetPhysicalDeviceVideoFormatPropertiesKHR = caps[95];
        this.vkCreateWaylandSurfaceKHR = caps[96];
        this.vkGetPhysicalDeviceWaylandPresentationSupportKHR = caps[97];
        this.vkCreateWin32SurfaceKHR = caps[98];
        this.vkGetPhysicalDeviceWin32PresentationSupportKHR = caps[99];
        this.vkCreateXcbSurfaceKHR = caps[100];
        this.vkGetPhysicalDeviceXcbPresentationSupportKHR = caps[101];
        this.vkCreateXlibSurfaceKHR = caps[102];
        this.vkGetPhysicalDeviceXlibPresentationSupportKHR = caps[103];
        this.vkCreateMacOSSurfaceMVK = caps[104];
        this.vkAcquireWinrtDisplayNV = caps[105];
        this.vkGetWinrtDisplayNV = caps[106];
        this.vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = caps[107];
        this.vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV = caps[108];
        this.vkGetPhysicalDeviceCooperativeVectorPropertiesNV = caps[109];
        this.vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = caps[110];
        this.vkGetPhysicalDeviceExternalImageFormatPropertiesNV = caps[111];
        this.vkGetPhysicalDeviceOpticalFlowImageFormatsNV = caps[112];
    }

    private static boolean check_VK10(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains("Vulkan10")) {
            return Checks.checkFunctions(provider, caps, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, "vkDestroyInstance", "vkEnumeratePhysicalDevices", "vkGetPhysicalDeviceFeatures", "vkGetPhysicalDeviceFormatProperties", "vkGetPhysicalDeviceImageFormatProperties", "vkGetPhysicalDeviceProperties", "vkGetPhysicalDeviceQueueFamilyProperties", "vkGetPhysicalDeviceMemoryProperties", "vkCreateDevice", "vkEnumerateDeviceExtensionProperties", "vkEnumerateDeviceLayerProperties", "vkGetPhysicalDeviceSparseImageFormatProperties") || Checks.reportMissing("VK", "Vulkan10");
        }
        return false;
    }

    private static boolean check_VK11(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains("Vulkan11")) {
            return Checks.checkFunctions(provider, caps, new int[]{12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22}, "vkEnumeratePhysicalDeviceGroups", "vkGetPhysicalDeviceFeatures2", "vkGetPhysicalDeviceProperties2", "vkGetPhysicalDeviceFormatProperties2", "vkGetPhysicalDeviceImageFormatProperties2", "vkGetPhysicalDeviceQueueFamilyProperties2", "vkGetPhysicalDeviceMemoryProperties2", "vkGetPhysicalDeviceSparseImageFormatProperties2", "vkGetPhysicalDeviceExternalBufferProperties", "vkGetPhysicalDeviceExternalFenceProperties", "vkGetPhysicalDeviceExternalSemaphoreProperties") || Checks.reportMissing("VK", "Vulkan11");
        }
        return false;
    }

    private static boolean check_VK13(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains("Vulkan13")) {
            return Checks.checkFunctions(provider, caps, new int[]{23}, "vkGetPhysicalDeviceToolProperties") || Checks.reportMissing("VK", "Vulkan13");
        }
        return false;
    }

    private static boolean check_ARM_data_graph(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(ARMDataGraph.VK_ARM_DATA_GRAPH_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{24, 25}, "vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM", "vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM") || Checks.reportMissing("VK", ARMDataGraph.VK_ARM_DATA_GRAPH_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_ARM_performance_counters_by_region(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(ARMPerformanceCountersByRegion.VK_ARM_PERFORMANCE_COUNTERS_BY_REGION_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{26}, "vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM") || Checks.reportMissing("VK", ARMPerformanceCountersByRegion.VK_ARM_PERFORMANCE_COUNTERS_BY_REGION_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_ARM_tensors(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(ARMTensors.VK_ARM_TENSORS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{27}, "vkGetPhysicalDeviceExternalTensorPropertiesARM") || Checks.reportMissing("VK", ARMTensors.VK_ARM_TENSORS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_acquire_drm_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTAcquireDrmDisplay.VK_EXT_ACQUIRE_DRM_DISPLAY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{28, 29}, "vkAcquireDrmDisplayEXT", "vkGetDrmDisplayEXT") || Checks.reportMissing("VK", EXTAcquireDrmDisplay.VK_EXT_ACQUIRE_DRM_DISPLAY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_acquire_xlib_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTAcquireXlibDisplay.VK_EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{30, 31}, "vkAcquireXlibDisplayEXT", "vkGetRandROutputDisplayEXT") || Checks.reportMissing("VK", EXTAcquireXlibDisplay.VK_EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTCalibratedTimestamps.VK_EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{32}, "vkGetPhysicalDeviceCalibrateableTimeDomainsEXT") || Checks.reportMissing("VK", EXTCalibratedTimestamps.VK_EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_debug_report(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDebugReport.VK_EXT_DEBUG_REPORT_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{33, 34, 35}, "vkCreateDebugReportCallbackEXT", "vkDestroyDebugReportCallbackEXT", "vkDebugReportMessageEXT") || Checks.reportMissing("VK", EXTDebugReport.VK_EXT_DEBUG_REPORT_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_debug_utils(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDebugUtils.VK_EXT_DEBUG_UTILS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46}, "vkSetDebugUtilsObjectNameEXT", "vkSetDebugUtilsObjectTagEXT", "vkQueueBeginDebugUtilsLabelEXT", "vkQueueEndDebugUtilsLabelEXT", "vkQueueInsertDebugUtilsLabelEXT", "vkCmdBeginDebugUtilsLabelEXT", "vkCmdEndDebugUtilsLabelEXT", "vkCmdInsertDebugUtilsLabelEXT", "vkCreateDebugUtilsMessengerEXT", "vkDestroyDebugUtilsMessengerEXT", "vkSubmitDebugUtilsMessageEXT") || Checks.reportMissing("VK", EXTDebugUtils.VK_EXT_DEBUG_UTILS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_descriptor_heap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDescriptorHeap.VK_EXT_DESCRIPTOR_HEAP_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{47}, "vkGetPhysicalDeviceDescriptorSizeEXT") || Checks.reportMissing("VK", EXTDescriptorHeap.VK_EXT_DESCRIPTOR_HEAP_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_direct_mode_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDirectModeDisplay.VK_EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{48}, "vkReleaseDisplayEXT") || Checks.reportMissing("VK", EXTDirectModeDisplay.VK_EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_directfb_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDirectfbSurface.VK_EXT_DIRECTFB_SURFACE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{49, 50}, "vkCreateDirectFBSurfaceEXT", "vkGetPhysicalDeviceDirectFBPresentationSupportEXT") || Checks.reportMissing("VK", EXTDirectfbSurface.VK_EXT_DIRECTFB_SURFACE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_display_surface_counter(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTDisplaySurfaceCounter.VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{51}, "vkGetPhysicalDeviceSurfaceCapabilities2EXT") || Checks.reportMissing("VK", EXTDisplaySurfaceCounter.VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_full_screen_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTFullScreenExclusive.VK_EXT_FULL_SCREEN_EXCLUSIVE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{52}, "vkGetPhysicalDeviceSurfacePresentModes2EXT") || Checks.reportMissing("VK", EXTFullScreenExclusive.VK_EXT_FULL_SCREEN_EXCLUSIVE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_headless_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTHeadlessSurface.VK_EXT_HEADLESS_SURFACE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{53}, "vkCreateHeadlessSurfaceEXT") || Checks.reportMissing("VK", EXTHeadlessSurface.VK_EXT_HEADLESS_SURFACE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_metal_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTMetalSurface.VK_EXT_METAL_SURFACE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{54}, "vkCreateMetalSurfaceEXT") || Checks.reportMissing("VK", EXTMetalSurface.VK_EXT_METAL_SURFACE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_sample_locations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTSampleLocations.VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{55}, "vkGetPhysicalDeviceMultisamplePropertiesEXT") || Checks.reportMissing("VK", EXTSampleLocations.VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_EXT_tooling_info(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(EXTToolingInfo.VK_EXT_TOOLING_INFO_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{56}, "vkGetPhysicalDeviceToolPropertiesEXT") || Checks.reportMissing("VK", EXTToolingInfo.VK_EXT_TOOLING_INFO_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_android_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRAndroidSurface.VK_KHR_ANDROID_SURFACE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{57}, "vkCreateAndroidSurfaceKHR") || Checks.reportMissing("VK", KHRAndroidSurface.VK_KHR_ANDROID_SURFACE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRCalibratedTimestamps.VK_KHR_CALIBRATED_TIMESTAMPS_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{58}, "vkGetPhysicalDeviceCalibrateableTimeDomainsKHR") || Checks.reportMissing("VK", KHRCalibratedTimestamps.VK_KHR_CALIBRATED_TIMESTAMPS_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_cooperative_matrix(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRCooperativeMatrix.VK_KHR_COOPERATIVE_MATRIX_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{59}, "vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR") || Checks.reportMissing("VK", KHRCooperativeMatrix.VK_KHR_COOPERATIVE_MATRIX_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_device_group(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(KHRDeviceGroup.VK_KHR_DEVICE_GROUP_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = ext.contains(KHRSurface.VK_KHR_SURFACE_EXTENSION_NAME) ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{flag0 + 60}, "vkGetPhysicalDevicePresentRectanglesKHR") || Checks.reportMissing("VK", KHRDeviceGroup.VK_KHR_DEVICE_GROUP_EXTENSION_NAME);
    }

    private static boolean check_KHR_device_group_creation(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRDeviceGroupCreation.VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{61}, "vkEnumeratePhysicalDeviceGroupsKHR") || Checks.reportMissing("VK", KHRDeviceGroupCreation.VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRDisplay.VK_KHR_DISPLAY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{62, 63, 64, 65, 66, 67, 68}, "vkGetPhysicalDeviceDisplayPropertiesKHR", "vkGetPhysicalDeviceDisplayPlanePropertiesKHR", "vkGetDisplayPlaneSupportedDisplaysKHR", "vkGetDisplayModePropertiesKHR", "vkCreateDisplayModeKHR", "vkGetDisplayPlaneCapabilitiesKHR", "vkCreateDisplayPlaneSurfaceKHR") || Checks.reportMissing("VK", KHRDisplay.VK_KHR_DISPLAY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_external_fence_capabilities(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRExternalFenceCapabilities.VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{69}, "vkGetPhysicalDeviceExternalFencePropertiesKHR") || Checks.reportMissing("VK", KHRExternalFenceCapabilities.VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_external_memory_capabilities(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRExternalMemoryCapabilities.VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{70}, "vkGetPhysicalDeviceExternalBufferPropertiesKHR") || Checks.reportMissing("VK", KHRExternalMemoryCapabilities.VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_external_semaphore_capabilities(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRExternalSemaphoreCapabilities.VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{71}, "vkGetPhysicalDeviceExternalSemaphorePropertiesKHR") || Checks.reportMissing("VK", KHRExternalSemaphoreCapabilities.VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_fragment_shading_rate(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRFragmentShadingRate.VK_KHR_FRAGMENT_SHADING_RATE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{72}, "vkGetPhysicalDeviceFragmentShadingRatesKHR") || Checks.reportMissing("VK", KHRFragmentShadingRate.VK_KHR_FRAGMENT_SHADING_RATE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_get_display_properties2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRGetDisplayProperties2.VK_KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{73, 74, 75, 76}, "vkGetPhysicalDeviceDisplayProperties2KHR", "vkGetPhysicalDeviceDisplayPlaneProperties2KHR", "vkGetDisplayModeProperties2KHR", "vkGetDisplayPlaneCapabilities2KHR") || Checks.reportMissing("VK", KHRGetDisplayProperties2.VK_KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_get_physical_device_properties2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRGetPhysicalDeviceProperties2.VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{77, 78, 79, 80, 81, 82, 83}, "vkGetPhysicalDeviceFeatures2KHR", "vkGetPhysicalDeviceProperties2KHR", "vkGetPhysicalDeviceFormatProperties2KHR", "vkGetPhysicalDeviceImageFormatProperties2KHR", "vkGetPhysicalDeviceQueueFamilyProperties2KHR", "vkGetPhysicalDeviceMemoryProperties2KHR", "vkGetPhysicalDeviceSparseImageFormatProperties2KHR") || Checks.reportMissing("VK", KHRGetPhysicalDeviceProperties2.VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_get_surface_capabilities2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRGetSurfaceCapabilities2.VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{84, 85}, "vkGetPhysicalDeviceSurfaceCapabilities2KHR", "vkGetPhysicalDeviceSurfaceFormats2KHR") || Checks.reportMissing("VK", KHRGetSurfaceCapabilities2.VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRPerformanceQuery.VK_KHR_PERFORMANCE_QUERY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{86, 87}, "vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR", "vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR") || Checks.reportMissing("VK", KHRPerformanceQuery.VK_KHR_PERFORMANCE_QUERY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRSurface.VK_KHR_SURFACE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{88, 89, 90, 91, 92}, "vkDestroySurfaceKHR", "vkGetPhysicalDeviceSurfaceSupportKHR", "vkGetPhysicalDeviceSurfaceCapabilitiesKHR", "vkGetPhysicalDeviceSurfaceFormatsKHR", "vkGetPhysicalDeviceSurfacePresentModesKHR") || Checks.reportMissing("VK", KHRSurface.VK_KHR_SURFACE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_swapchain(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains(KHRSwapchain.VK_KHR_SWAPCHAIN_EXTENSION_NAME)) {
            return false;
        }
        int flag0 = ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;
        return Checks.checkFunctions(provider, caps, new int[]{flag0 + 60}, "vkGetPhysicalDevicePresentRectanglesKHR") || Checks.reportMissing("VK", KHRSwapchain.VK_KHR_SWAPCHAIN_EXTENSION_NAME);
    }

    private static boolean check_KHR_video_encode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRVideoEncodeQueue.VK_KHR_VIDEO_ENCODE_QUEUE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{93}, "vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR") || Checks.reportMissing("VK", KHRVideoEncodeQueue.VK_KHR_VIDEO_ENCODE_QUEUE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_video_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRVideoQueue.VK_KHR_VIDEO_QUEUE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{94, 95}, "vkGetPhysicalDeviceVideoCapabilitiesKHR", "vkGetPhysicalDeviceVideoFormatPropertiesKHR") || Checks.reportMissing("VK", KHRVideoQueue.VK_KHR_VIDEO_QUEUE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_wayland_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRWaylandSurface.VK_KHR_WAYLAND_SURFACE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{96, 97}, "vkCreateWaylandSurfaceKHR", "vkGetPhysicalDeviceWaylandPresentationSupportKHR") || Checks.reportMissing("VK", KHRWaylandSurface.VK_KHR_WAYLAND_SURFACE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_win32_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRWin32Surface.VK_KHR_WIN32_SURFACE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{98, 99}, "vkCreateWin32SurfaceKHR", "vkGetPhysicalDeviceWin32PresentationSupportKHR") || Checks.reportMissing("VK", KHRWin32Surface.VK_KHR_WIN32_SURFACE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_xcb_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRXcbSurface.VK_KHR_XCB_SURFACE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{100, 101}, "vkCreateXcbSurfaceKHR", "vkGetPhysicalDeviceXcbPresentationSupportKHR") || Checks.reportMissing("VK", KHRXcbSurface.VK_KHR_XCB_SURFACE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_KHR_xlib_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(KHRXlibSurface.VK_KHR_XLIB_SURFACE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{102, 103}, "vkCreateXlibSurfaceKHR", "vkGetPhysicalDeviceXlibPresentationSupportKHR") || Checks.reportMissing("VK", KHRXlibSurface.VK_KHR_XLIB_SURFACE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_MVK_macos_surface(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(MVKMacosSurface.VK_MVK_MACOS_SURFACE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{104}, "vkCreateMacOSSurfaceMVK") || Checks.reportMissing("VK", MVKMacosSurface.VK_MVK_MACOS_SURFACE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_acquire_winrt_display(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVAcquireWinrtDisplay.VK_NV_ACQUIRE_WINRT_DISPLAY_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{105, 106}, "vkAcquireWinrtDisplayNV", "vkGetWinrtDisplayNV") || Checks.reportMissing("VK", NVAcquireWinrtDisplay.VK_NV_ACQUIRE_WINRT_DISPLAY_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_cooperative_matrix(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVCooperativeMatrix.VK_NV_COOPERATIVE_MATRIX_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{107}, "vkGetPhysicalDeviceCooperativeMatrixPropertiesNV") || Checks.reportMissing("VK", NVCooperativeMatrix.VK_NV_COOPERATIVE_MATRIX_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_cooperative_matrix2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVCooperativeMatrix2.VK_NV_COOPERATIVE_MATRIX_2_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{108}, "vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV") || Checks.reportMissing("VK", NVCooperativeMatrix2.VK_NV_COOPERATIVE_MATRIX_2_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_cooperative_vector(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVCooperativeVector.VK_NV_COOPERATIVE_VECTOR_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{109}, "vkGetPhysicalDeviceCooperativeVectorPropertiesNV") || Checks.reportMissing("VK", NVCooperativeVector.VK_NV_COOPERATIVE_VECTOR_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_coverage_reduction_mode(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVCoverageReductionMode.VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{110}, "vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV") || Checks.reportMissing("VK", NVCoverageReductionMode.VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_external_memory_capabilities(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVExternalMemoryCapabilities.VK_NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{111}, "vkGetPhysicalDeviceExternalImageFormatPropertiesNV") || Checks.reportMissing("VK", NVExternalMemoryCapabilities.VK_NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME);
        }
        return false;
    }

    private static boolean check_NV_optical_flow(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (ext.contains(NVOpticalFlow.VK_NV_OPTICAL_FLOW_EXTENSION_NAME)) {
            return Checks.checkFunctions(provider, caps, new int[]{112}, "vkGetPhysicalDeviceOpticalFlowImageFormatsNV") || Checks.reportMissing("VK", NVOpticalFlow.VK_NV_OPTICAL_FLOW_EXTENSION_NAME);
        }
        return false;
    }
}
