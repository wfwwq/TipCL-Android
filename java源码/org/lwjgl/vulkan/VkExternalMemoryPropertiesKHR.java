package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.vulkan.VkExternalMemoryProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryPropertiesKHR.class */
public class VkExternalMemoryPropertiesKHR extends VkExternalMemoryProperties {
    protected VkExternalMemoryPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkExternalMemoryProperties, org.lwjgl.system.Struct
    public VkExternalMemoryPropertiesKHR create(long address, ByteBuffer container) {
        return new VkExternalMemoryPropertiesKHR(address, container);
    }

    public VkExternalMemoryPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    public static VkExternalMemoryPropertiesKHR create(long address) {
        return new VkExternalMemoryPropertiesKHR(address, null);
    }

    public static VkExternalMemoryPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalMemoryPropertiesKHR(address, null);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryPropertiesKHR$Buffer.class */
    public static class Buffer extends VkExternalMemoryProperties.Buffer {
        private static final VkExternalMemoryPropertiesKHR ELEMENT_FACTORY = VkExternalMemoryPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalMemoryProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalMemoryProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalMemoryProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkExternalMemoryPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }
    }
}
