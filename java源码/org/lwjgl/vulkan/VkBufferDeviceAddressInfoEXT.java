package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBufferDeviceAddressInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfoEXT.class */
public class VkBufferDeviceAddressInfoEXT extends VkBufferDeviceAddressInfo {
    protected VkBufferDeviceAddressInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo, org.lwjgl.system.Struct
    public VkBufferDeviceAddressInfoEXT create(long address, ByteBuffer container) {
        return new VkBufferDeviceAddressInfoEXT(address, container);
    }

    public VkBufferDeviceAddressInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo
    public VkBufferDeviceAddressInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo
    public VkBufferDeviceAddressInfoEXT sType$Default() {
        return sType(1000244001);
    }

    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo
    public VkBufferDeviceAddressInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo
    public VkBufferDeviceAddressInfoEXT buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo
    public VkBufferDeviceAddressInfoEXT set(int sType, long pNext, long buffer) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        return this;
    }

    public VkBufferDeviceAddressInfoEXT set(VkBufferDeviceAddressInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferDeviceAddressInfoEXT malloc() {
        return new VkBufferDeviceAddressInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferDeviceAddressInfoEXT calloc() {
        return new VkBufferDeviceAddressInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferDeviceAddressInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferDeviceAddressInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferDeviceAddressInfoEXT create(long address) {
        return new VkBufferDeviceAddressInfoEXT(address, null);
    }

    public static VkBufferDeviceAddressInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferDeviceAddressInfoEXT(address, null);
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

    public static VkBufferDeviceAddressInfoEXT malloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferDeviceAddressInfoEXT calloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferDeviceAddressInfoEXT$Buffer.class */
    public static class Buffer extends VkBufferDeviceAddressInfo.Buffer {
        private static final VkBufferDeviceAddressInfoEXT ELEMENT_FACTORY = VkBufferDeviceAddressInfoEXT.create(-1L);

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
        public VkBufferDeviceAddressInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferDeviceAddressInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000244001);
        }

        @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferDeviceAddressInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferDeviceAddressInfo.Buffer
        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkBufferDeviceAddressInfoEXT.nbuffer(address(), value);
            return this;
        }
    }
}
