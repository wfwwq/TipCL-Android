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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceOrHostAddressConstAMDX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceOrHostAddressConstAMDX.class */
public class VkDeviceOrHostAddressConstAMDX extends Struct<VkDeviceOrHostAddressConstAMDX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DEVICEADDRESS;
    public static final int HOSTADDRESS;

    static {
        Struct.Layout layout = __union(__member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DEVICEADDRESS = layout.offsetof(0);
        HOSTADDRESS = layout.offsetof(1);
    }

    protected VkDeviceOrHostAddressConstAMDX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceOrHostAddressConstAMDX create(long address, ByteBuffer container) {
        return new VkDeviceOrHostAddressConstAMDX(address, container);
    }

    public VkDeviceOrHostAddressConstAMDX(ByteBuffer container) {
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

    @NativeType("void const *")
    public long hostAddress() {
        return nhostAddress(address());
    }

    public VkDeviceOrHostAddressConstAMDX deviceAddress(@NativeType("VkDeviceAddress") long value) {
        ndeviceAddress(address(), value);
        return this;
    }

    public VkDeviceOrHostAddressConstAMDX hostAddress(@NativeType("void const *") long value) {
        nhostAddress(address(), value);
        return this;
    }

    public VkDeviceOrHostAddressConstAMDX set(VkDeviceOrHostAddressConstAMDX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceOrHostAddressConstAMDX malloc() {
        return new VkDeviceOrHostAddressConstAMDX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceOrHostAddressConstAMDX calloc() {
        return new VkDeviceOrHostAddressConstAMDX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceOrHostAddressConstAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceOrHostAddressConstAMDX(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceOrHostAddressConstAMDX create(long address) {
        return new VkDeviceOrHostAddressConstAMDX(address, null);
    }

    public static VkDeviceOrHostAddressConstAMDX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceOrHostAddressConstAMDX(address, null);
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

    public static VkDeviceOrHostAddressConstAMDX malloc(MemoryStack stack) {
        return new VkDeviceOrHostAddressConstAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceOrHostAddressConstAMDX calloc(MemoryStack stack) {
        return new VkDeviceOrHostAddressConstAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nhostAddress(long struct) {
        return MemoryUtil.memGetAddress(struct + HOSTADDRESS);
    }

    public static void ndeviceAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + DEVICEADDRESS, value);
    }

    public static void nhostAddress(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HOSTADDRESS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceOrHostAddressConstAMDX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceOrHostAddressConstAMDX$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceOrHostAddressConstAMDX, Buffer> implements NativeResource {
        private static final VkDeviceOrHostAddressConstAMDX ELEMENT_FACTORY = VkDeviceOrHostAddressConstAMDX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceOrHostAddressConstAMDX.SIZEOF);
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
        public VkDeviceOrHostAddressConstAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long deviceAddress() {
            return VkDeviceOrHostAddressConstAMDX.ndeviceAddress(address());
        }

        @NativeType("void const *")
        public long hostAddress() {
            return VkDeviceOrHostAddressConstAMDX.nhostAddress(address());
        }

        public Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) {
            VkDeviceOrHostAddressConstAMDX.ndeviceAddress(address(), value);
            return this;
        }

        public Buffer hostAddress(@NativeType("void const *") long value) {
            VkDeviceOrHostAddressConstAMDX.nhostAddress(address(), value);
            return this;
        }
    }
}
