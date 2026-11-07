package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.class */
public class VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR extends VkPhysicalDeviceShaderIntegerDotProductProperties {
    protected VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties, org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(address, container);
    }

    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR sType$Default() {
        return sType(1000280001);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR set(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR malloc() {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR calloc() {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR create(long address) {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(address, null);
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

    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer {
        private static final VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000280001);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
