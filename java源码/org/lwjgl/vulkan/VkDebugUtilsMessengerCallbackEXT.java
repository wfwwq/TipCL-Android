package org.lwjgl.vulkan;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackEXT.class */
public abstract class VkDebugUtilsMessengerCallbackEXT extends Callback implements VkDebugUtilsMessengerCallbackEXTI {
    public static VkDebugUtilsMessengerCallbackEXT create(long functionPointer) {
        VkDebugUtilsMessengerCallbackEXTI instance = (VkDebugUtilsMessengerCallbackEXTI) Callback.get(functionPointer);
        if (instance instanceof VkDebugUtilsMessengerCallbackEXT) {
            return (VkDebugUtilsMessengerCallbackEXT) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static VkDebugUtilsMessengerCallbackEXT createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static VkDebugUtilsMessengerCallbackEXT create(VkDebugUtilsMessengerCallbackEXTI instance) {
        if (instance instanceof VkDebugUtilsMessengerCallbackEXT) {
            return (VkDebugUtilsMessengerCallbackEXT) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected VkDebugUtilsMessengerCallbackEXT() {
        super(DESCRIPTOR);
    }

    VkDebugUtilsMessengerCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackEXT$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackEXT$Container.class */
    private static final class Container extends VkDebugUtilsMessengerCallbackEXT {
        private final VkDebugUtilsMessengerCallbackEXTI delegate;

        Container(long functionPointer, VkDebugUtilsMessengerCallbackEXTI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackEXTI
        public int invoke(int messageSeverity, int messageTypes, long pCallbackData, long pUserData) {
            return this.delegate.invoke(messageSeverity, messageTypes, pCallbackData, pUserData);
        }
    }
}
