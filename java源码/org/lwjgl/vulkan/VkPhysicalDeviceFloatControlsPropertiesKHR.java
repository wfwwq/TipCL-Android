package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsPropertiesKHR.class */
public class VkPhysicalDeviceFloatControlsPropertiesKHR extends VkPhysicalDeviceFloatControlsProperties {
    protected VkPhysicalDeviceFloatControlsPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties, org.lwjgl.system.Struct
    public VkPhysicalDeviceFloatControlsPropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFloatControlsPropertiesKHR(address, container);
    }

    public VkPhysicalDeviceFloatControlsPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
    public VkPhysicalDeviceFloatControlsPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
    public VkPhysicalDeviceFloatControlsPropertiesKHR sType$Default() {
        return sType(1000197000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
    public VkPhysicalDeviceFloatControlsPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
    public VkPhysicalDeviceFloatControlsPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceFloatControlsPropertiesKHR set(VkPhysicalDeviceFloatControlsPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFloatControlsPropertiesKHR malloc() {
        return new VkPhysicalDeviceFloatControlsPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFloatControlsPropertiesKHR calloc() {
        return new VkPhysicalDeviceFloatControlsPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFloatControlsPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFloatControlsPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFloatControlsPropertiesKHR create(long address) {
        return new VkPhysicalDeviceFloatControlsPropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceFloatControlsPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFloatControlsPropertiesKHR(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
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

    public static VkPhysicalDeviceFloatControlsPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFloatControlsPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFloatControlsPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFloatControlsPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsPropertiesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceFloatControlsProperties.Buffer {
        private static final VkPhysicalDeviceFloatControlsPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceFloatControlsPropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceFloatControlsPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFloatControlsPropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000197000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFloatControlsPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
