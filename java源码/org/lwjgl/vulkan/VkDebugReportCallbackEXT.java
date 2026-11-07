package org.lwjgl.vulkan;

import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXT.class */
public abstract class VkDebugReportCallbackEXT extends Callback implements VkDebugReportCallbackEXTI {
    public static VkDebugReportCallbackEXT create(long functionPointer) {
        VkDebugReportCallbackEXTI instance = (VkDebugReportCallbackEXTI) Callback.get(functionPointer);
        if (instance instanceof VkDebugReportCallbackEXT) {
            return (VkDebugReportCallbackEXT) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static VkDebugReportCallbackEXT createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static VkDebugReportCallbackEXT create(VkDebugReportCallbackEXTI instance) {
        if (instance instanceof VkDebugReportCallbackEXT) {
            return (VkDebugReportCallbackEXT) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected VkDebugReportCallbackEXT() {
        super(DESCRIPTOR);
    }

    VkDebugReportCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

    public static String getString(long string) {
        return MemoryUtil.memUTF8(string);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXT$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXT$Container.class */
    private static final class Container extends VkDebugReportCallbackEXT {
        private final VkDebugReportCallbackEXTI delegate;

        Container(long functionPointer, VkDebugReportCallbackEXTI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.vulkan.VkDebugReportCallbackEXTI
        public int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData) {
            return this.delegate.invoke(flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, pUserData);
        }
    }
}
