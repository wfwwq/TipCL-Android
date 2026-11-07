package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class */
public class VkDeviceMemoryOpaqueCaptureAddressInfoKHR extends VkDeviceMemoryOpaqueCaptureAddressInfo {
    protected VkDeviceMemoryOpaqueCaptureAddressInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo, org.lwjgl.system.Struct
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR create(long address, ByteBuffer container) {
        return new VkDeviceMemoryOpaqueCaptureAddressInfoKHR(address, container);
    }

    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR sType$Default() {
        return sType(1000257004);
    }

    @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR set(int sType, long pNext, long memory) {
        sType(sType);
        pNext(pNext);
        memory(memory);
        return this;
    }

    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR set(VkDeviceMemoryOpaqueCaptureAddressInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR malloc() {
        return new VkDeviceMemoryOpaqueCaptureAddressInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR calloc() {
        return new VkDeviceMemoryOpaqueCaptureAddressInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceMemoryOpaqueCaptureAddressInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR create(long address) {
        return new VkDeviceMemoryOpaqueCaptureAddressInfoKHR(address, null);
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceMemoryOpaqueCaptureAddressInfoKHR(address, null);
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

    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceMemoryOpaqueCaptureAddressInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceMemoryOpaqueCaptureAddressInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOpaqueCaptureAddressInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceMemoryOpaqueCaptureAddressInfoKHR$Buffer.class */
    public static class Buffer extends VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer {
        private static final VkDeviceMemoryOpaqueCaptureAddressInfoKHR ELEMENT_FACTORY = VkDeviceMemoryOpaqueCaptureAddressInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDeviceMemoryOpaqueCaptureAddressInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceMemoryOpaqueCaptureAddressInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000257004);
        }

        @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceMemoryOpaqueCaptureAddressInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer
        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkDeviceMemoryOpaqueCaptureAddressInfoKHR.nmemory(address(), value);
            return this;
        }
    }
}
