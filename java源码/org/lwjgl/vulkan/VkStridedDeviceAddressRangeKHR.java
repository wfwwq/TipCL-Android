package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStridedDeviceAddressRangeKHR.class */
public class VkStridedDeviceAddressRangeKHR extends Struct<VkStridedDeviceAddressRangeKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ADDRESS;
    public static final int SIZE;
    public static final int STRIDE;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ADDRESS = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        STRIDE = layout.offsetof(2);
    }

    protected VkStridedDeviceAddressRangeKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkStridedDeviceAddressRangeKHR create(long address, ByteBuffer container) {
        return new VkStridedDeviceAddressRangeKHR(address, container);
    }

    public VkStridedDeviceAddressRangeKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long address$() {
        return naddress$(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkDeviceSize")
    public long stride() {
        return nstride(address());
    }

    public VkStridedDeviceAddressRangeKHR address$(@NativeType("VkDeviceAddress") long value) {
        naddress$(address(), value);
        return this;
    }

    public VkStridedDeviceAddressRangeKHR size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkStridedDeviceAddressRangeKHR stride(@NativeType("VkDeviceSize") long value) {
        nstride(address(), value);
        return this;
    }

    public VkStridedDeviceAddressRangeKHR set(long address$, long size, long stride) {
        address$(address$);
        size(size);
        stride(stride);
        return this;
    }

    public VkStridedDeviceAddressRangeKHR set(VkStridedDeviceAddressRangeKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkStridedDeviceAddressRangeKHR malloc() {
        return new VkStridedDeviceAddressRangeKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkStridedDeviceAddressRangeKHR calloc() {
        return new VkStridedDeviceAddressRangeKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkStridedDeviceAddressRangeKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkStridedDeviceAddressRangeKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkStridedDeviceAddressRangeKHR create(long address) {
        return new VkStridedDeviceAddressRangeKHR(address, null);
    }

    public static VkStridedDeviceAddressRangeKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkStridedDeviceAddressRangeKHR(address, null);
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

    public static VkStridedDeviceAddressRangeKHR malloc(MemoryStack stack) {
        return new VkStridedDeviceAddressRangeKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkStridedDeviceAddressRangeKHR calloc(MemoryStack stack) {
        return new VkStridedDeviceAddressRangeKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long naddress$(long struct) {
        return MemoryUtil.memGetLong(struct + ADDRESS);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static long nstride(long struct) {
        return MemoryUtil.memGetLong(struct + STRIDE);
    }

    public static void naddress$(long struct, long value) {
        MemoryUtil.memPutLong(struct + ADDRESS, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void nstride(long struct, long value) {
        MemoryUtil.memPutLong(struct + STRIDE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStridedDeviceAddressRangeKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkStridedDeviceAddressRangeKHR, Buffer> implements NativeResource {
        private static final VkStridedDeviceAddressRangeKHR ELEMENT_FACTORY = VkStridedDeviceAddressRangeKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkStridedDeviceAddressRangeKHR.SIZEOF);
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
        public VkStridedDeviceAddressRangeKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long address$() {
            return VkStridedDeviceAddressRangeKHR.naddress$(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkStridedDeviceAddressRangeKHR.nsize(address());
        }

        @NativeType("VkDeviceSize")
        public long stride() {
            return VkStridedDeviceAddressRangeKHR.nstride(address());
        }

        public Buffer address$(@NativeType("VkDeviceAddress") long value) {
            VkStridedDeviceAddressRangeKHR.naddress$(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkStridedDeviceAddressRangeKHR.nsize(address(), value);
            return this;
        }

        public Buffer stride(@NativeType("VkDeviceSize") long value) {
            VkStridedDeviceAddressRangeKHR.nstride(address(), value);
            return this;
        }
    }
}
