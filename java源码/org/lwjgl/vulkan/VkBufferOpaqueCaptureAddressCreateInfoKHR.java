package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferOpaqueCaptureAddressCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferOpaqueCaptureAddressCreateInfoKHR.class */
public class VkBufferOpaqueCaptureAddressCreateInfoKHR extends VkBufferOpaqueCaptureAddressCreateInfo {
    protected VkBufferOpaqueCaptureAddressCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo, org.lwjgl.system.Struct
    public VkBufferOpaqueCaptureAddressCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkBufferOpaqueCaptureAddressCreateInfoKHR(address, container);
    }

    public VkBufferOpaqueCaptureAddressCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo
    public VkBufferOpaqueCaptureAddressCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo
    public VkBufferOpaqueCaptureAddressCreateInfoKHR sType$Default() {
        return sType(1000257002);
    }

    @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo
    public VkBufferOpaqueCaptureAddressCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo
    public VkBufferOpaqueCaptureAddressCreateInfoKHR opaqueCaptureAddress(@NativeType("uint64_t") long value) {
        nopaqueCaptureAddress(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo
    public VkBufferOpaqueCaptureAddressCreateInfoKHR set(int sType, long pNext, long opaqueCaptureAddress) {
        sType(sType);
        pNext(pNext);
        opaqueCaptureAddress(opaqueCaptureAddress);
        return this;
    }

    public VkBufferOpaqueCaptureAddressCreateInfoKHR set(VkBufferOpaqueCaptureAddressCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferOpaqueCaptureAddressCreateInfoKHR malloc() {
        return new VkBufferOpaqueCaptureAddressCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferOpaqueCaptureAddressCreateInfoKHR calloc() {
        return new VkBufferOpaqueCaptureAddressCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferOpaqueCaptureAddressCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferOpaqueCaptureAddressCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferOpaqueCaptureAddressCreateInfoKHR create(long address) {
        return new VkBufferOpaqueCaptureAddressCreateInfoKHR(address, null);
    }

    public static VkBufferOpaqueCaptureAddressCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferOpaqueCaptureAddressCreateInfoKHR(address, null);
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

    public static VkBufferOpaqueCaptureAddressCreateInfoKHR malloc(MemoryStack stack) {
        return new VkBufferOpaqueCaptureAddressCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferOpaqueCaptureAddressCreateInfoKHR calloc(MemoryStack stack) {
        return new VkBufferOpaqueCaptureAddressCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferOpaqueCaptureAddressCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferOpaqueCaptureAddressCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkBufferOpaqueCaptureAddressCreateInfo.Buffer {
        private static final VkBufferOpaqueCaptureAddressCreateInfoKHR ELEMENT_FACTORY = VkBufferOpaqueCaptureAddressCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkBufferOpaqueCaptureAddressCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferOpaqueCaptureAddressCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000257002);
        }

        @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferOpaqueCaptureAddressCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo.Buffer
        public Buffer opaqueCaptureAddress(@NativeType("uint64_t") long value) {
            VkBufferOpaqueCaptureAddressCreateInfoKHR.nopaqueCaptureAddress(address(), value);
            return this;
        }
    }
}
