package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStridedDeviceAddressRegionKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStridedDeviceAddressRegionKHR.class */
public class VkStridedDeviceAddressRegionKHR extends Struct<VkStridedDeviceAddressRegionKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DEVICEADDRESS;
    public static final int STRIDE;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DEVICEADDRESS = layout.offsetof(0);
        STRIDE = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkStridedDeviceAddressRegionKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkStridedDeviceAddressRegionKHR create(long address, ByteBuffer container) {
        return new VkStridedDeviceAddressRegionKHR(address, container);
    }

    public VkStridedDeviceAddressRegionKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long deviceAddress() {
        return ndeviceAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long stride() {
        return nstride(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    public VkStridedDeviceAddressRegionKHR deviceAddress(@NativeType("VkDeviceAddress") long value) {
        ndeviceAddress(address(), value);
        return this;
    }

    public VkStridedDeviceAddressRegionKHR stride(@NativeType("VkDeviceSize") long value) {
        nstride(address(), value);
        return this;
    }

    public VkStridedDeviceAddressRegionKHR size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkStridedDeviceAddressRegionKHR set(long deviceAddress, long stride, long size) {
        deviceAddress(deviceAddress);
        stride(stride);
        size(size);
        return this;
    }

    public VkStridedDeviceAddressRegionKHR set(VkStridedDeviceAddressRegionKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkStridedDeviceAddressRegionKHR malloc() {
        return new VkStridedDeviceAddressRegionKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkStridedDeviceAddressRegionKHR calloc() {
        return new VkStridedDeviceAddressRegionKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkStridedDeviceAddressRegionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkStridedDeviceAddressRegionKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkStridedDeviceAddressRegionKHR create(long address) {
        return new VkStridedDeviceAddressRegionKHR(address, null);
    }

    public static VkStridedDeviceAddressRegionKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkStridedDeviceAddressRegionKHR(address, null);
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

    public static VkStridedDeviceAddressRegionKHR malloc(MemoryStack stack) {
        return new VkStridedDeviceAddressRegionKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkStridedDeviceAddressRegionKHR calloc(MemoryStack stack) {
        return new VkStridedDeviceAddressRegionKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ndeviceAddress(long struct) {
        return MemoryUtil.memGetLong(struct + DEVICEADDRESS);
    }

    public static long nstride(long struct) {
        return MemoryUtil.memGetLong(struct + STRIDE);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static void ndeviceAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + DEVICEADDRESS, value);
    }

    public static void nstride(long struct, long value) {
        MemoryUtil.memPutLong(struct + STRIDE, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStridedDeviceAddressRegionKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkStridedDeviceAddressRegionKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkStridedDeviceAddressRegionKHR, Buffer> implements NativeResource {
        private static final VkStridedDeviceAddressRegionKHR ELEMENT_FACTORY = VkStridedDeviceAddressRegionKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkStridedDeviceAddressRegionKHR.SIZEOF);
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
        public VkStridedDeviceAddressRegionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long deviceAddress() {
            return VkStridedDeviceAddressRegionKHR.ndeviceAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long stride() {
            return VkStridedDeviceAddressRegionKHR.nstride(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkStridedDeviceAddressRegionKHR.nsize(address());
        }

        public Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) {
            VkStridedDeviceAddressRegionKHR.ndeviceAddress(address(), value);
            return this;
        }

        public Buffer stride(@NativeType("VkDeviceSize") long value) {
            VkStridedDeviceAddressRegionKHR.nstride(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkStridedDeviceAddressRegionKHR.nsize(address(), value);
            return this;
        }
    }
}
