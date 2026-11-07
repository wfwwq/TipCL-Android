package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryDeviceGroupInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryDeviceGroupInfoKHR.class */
public class VkBindBufferMemoryDeviceGroupInfoKHR extends VkBindBufferMemoryDeviceGroupInfo {
    protected VkBindBufferMemoryDeviceGroupInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo, org.lwjgl.system.Struct
    public VkBindBufferMemoryDeviceGroupInfoKHR create(long address, ByteBuffer container) {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(address, container);
    }

    public VkBindBufferMemoryDeviceGroupInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo
    public VkBindBufferMemoryDeviceGroupInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo
    public VkBindBufferMemoryDeviceGroupInfoKHR sType$Default() {
        return sType(1000060013);
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo
    public VkBindBufferMemoryDeviceGroupInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo
    public VkBindBufferMemoryDeviceGroupInfoKHR pDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npDeviceIndices(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo
    public VkBindBufferMemoryDeviceGroupInfoKHR set(int sType, long pNext, IntBuffer pDeviceIndices) {
        sType(sType);
        pNext(pNext);
        pDeviceIndices(pDeviceIndices);
        return this;
    }

    public VkBindBufferMemoryDeviceGroupInfoKHR set(VkBindBufferMemoryDeviceGroupInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindBufferMemoryDeviceGroupInfoKHR malloc() {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindBufferMemoryDeviceGroupInfoKHR calloc() {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindBufferMemoryDeviceGroupInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindBufferMemoryDeviceGroupInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBindBufferMemoryDeviceGroupInfoKHR create(long address) {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(address, null);
    }

    public static VkBindBufferMemoryDeviceGroupInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindBufferMemoryDeviceGroupInfoKHR(address, null);
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

    public static VkBindBufferMemoryDeviceGroupInfoKHR malloc(MemoryStack stack) {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindBufferMemoryDeviceGroupInfoKHR calloc(MemoryStack stack) {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryDeviceGroupInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryDeviceGroupInfoKHR$Buffer.class */
    public static class Buffer extends VkBindBufferMemoryDeviceGroupInfo.Buffer {
        private static final VkBindBufferMemoryDeviceGroupInfoKHR ELEMENT_FACTORY = VkBindBufferMemoryDeviceGroupInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkBindBufferMemoryDeviceGroupInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindBufferMemoryDeviceGroupInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000060013);
        }

        @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindBufferMemoryDeviceGroupInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindBufferMemoryDeviceGroupInfo.Buffer
        public Buffer pDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkBindBufferMemoryDeviceGroupInfoKHR.npDeviceIndices(address(), value);
            return this;
        }
    }
}
