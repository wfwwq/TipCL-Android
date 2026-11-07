package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStridedDeviceAddressNV.class */
public class VkStridedDeviceAddressNV extends Struct<VkStridedDeviceAddressNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STARTADDRESS;
    public static final int STRIDEINBYTES;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STARTADDRESS = layout.offsetof(0);
        STRIDEINBYTES = layout.offsetof(1);
    }

    protected VkStridedDeviceAddressNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkStridedDeviceAddressNV create(long address, ByteBuffer container) {
        return new VkStridedDeviceAddressNV(address, container);
    }

    public VkStridedDeviceAddressNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long startAddress() {
        return nstartAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long strideInBytes() {
        return nstrideInBytes(address());
    }

    public VkStridedDeviceAddressNV startAddress(@NativeType("VkDeviceAddress") long value) {
        nstartAddress(address(), value);
        return this;
    }

    public VkStridedDeviceAddressNV strideInBytes(@NativeType("VkDeviceSize") long value) {
        nstrideInBytes(address(), value);
        return this;
    }

    public VkStridedDeviceAddressNV set(long startAddress, long strideInBytes) {
        startAddress(startAddress);
        strideInBytes(strideInBytes);
        return this;
    }

    public VkStridedDeviceAddressNV set(VkStridedDeviceAddressNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkStridedDeviceAddressNV malloc() {
        return new VkStridedDeviceAddressNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkStridedDeviceAddressNV calloc() {
        return new VkStridedDeviceAddressNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkStridedDeviceAddressNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkStridedDeviceAddressNV(MemoryUtil.memAddress(container), container);
    }

    public static VkStridedDeviceAddressNV create(long address) {
        return new VkStridedDeviceAddressNV(address, null);
    }

    public static VkStridedDeviceAddressNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkStridedDeviceAddressNV(address, null);
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

    public static VkStridedDeviceAddressNV malloc(MemoryStack stack) {
        return new VkStridedDeviceAddressNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkStridedDeviceAddressNV calloc(MemoryStack stack) {
        return new VkStridedDeviceAddressNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nstartAddress(long struct) {
        return MemoryUtil.memGetLong(struct + STARTADDRESS);
    }

    public static long nstrideInBytes(long struct) {
        return MemoryUtil.memGetLong(struct + STRIDEINBYTES);
    }

    public static void nstartAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + STARTADDRESS, value);
    }

    public static void nstrideInBytes(long struct, long value) {
        MemoryUtil.memPutLong(struct + STRIDEINBYTES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStridedDeviceAddressNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkStridedDeviceAddressNV, Buffer> implements NativeResource {
        private static final VkStridedDeviceAddressNV ELEMENT_FACTORY = VkStridedDeviceAddressNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkStridedDeviceAddressNV.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkStridedDeviceAddressNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long startAddress() {
            return VkStridedDeviceAddressNV.nstartAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long strideInBytes() {
            return VkStridedDeviceAddressNV.nstrideInBytes(address());
        }

        public Buffer startAddress(@NativeType("VkDeviceAddress") long value) {
            VkStridedDeviceAddressNV.nstartAddress(address(), value);
            return this;
        }

        public Buffer strideInBytes(@NativeType("VkDeviceSize") long value) {
            VkStridedDeviceAddressNV.nstrideInBytes(address(), value);
            return this;
        }
    }
}
