package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBufferDeviceAddressInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfoKHR.class */
public class VkBufferDeviceAddressInfoKHR extends VkBufferDeviceAddressInfo {
    protected VkBufferDeviceAddressInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo, org.lwjgl.system.Struct
    public VkBufferDeviceAddressInfoKHR create(long address, ByteBuffer container) {
        return new VkBufferDeviceAddressInfoKHR(address, container);
    }

    public VkBufferDeviceAddressInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo
    public VkBufferDeviceAddressInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo
    public VkBufferDeviceAddressInfoKHR sType$Default() {
        return sType(1000244001);
    }

    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo
    public VkBufferDeviceAddressInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo
    public VkBufferDeviceAddressInfoKHR buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo
    public VkBufferDeviceAddressInfoKHR set(int sType, long pNext, long buffer) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        return this;
    }

    public VkBufferDeviceAddressInfoKHR set(VkBufferDeviceAddressInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferDeviceAddressInfoKHR malloc() {
        return new VkBufferDeviceAddressInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferDeviceAddressInfoKHR calloc() {
        return new VkBufferDeviceAddressInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferDeviceAddressInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferDeviceAddressInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferDeviceAddressInfoKHR create(long address) {
        return new VkBufferDeviceAddressInfoKHR(address, null);
    }

    public static VkBufferDeviceAddressInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferDeviceAddressInfoKHR(address, null);
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

    public static VkBufferDeviceAddressInfoKHR malloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferDeviceAddressInfoKHR calloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfoKHR$Buffer.class */
    public static class Buffer extends VkBufferDeviceAddressInfo.Buffer {
        private static final VkBufferDeviceAddressInfoKHR ELEMENT_FACTORY = VkBufferDeviceAddressInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkBufferDeviceAddressInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferDeviceAddressInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000244001);
        }

        @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferDeviceAddressInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo.Buffer
        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkBufferDeviceAddressInfoKHR.nbuffer(address(), value);
            return this;
        }
    }
}
