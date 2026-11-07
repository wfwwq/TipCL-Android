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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceOrHostAddressConstKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceOrHostAddressConstKHR.class */
public class VkDeviceOrHostAddressConstKHR extends Struct<VkDeviceOrHostAddressConstKHR> implements NativeResource {
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

    protected VkDeviceOrHostAddressConstKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceOrHostAddressConstKHR create(long address, ByteBuffer container) {
        return new VkDeviceOrHostAddressConstKHR(address, container);
    }

    public VkDeviceOrHostAddressConstKHR(ByteBuffer container) {
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

    public VkDeviceOrHostAddressConstKHR deviceAddress(@NativeType("VkDeviceAddress") long value) {
        ndeviceAddress(address(), value);
        return this;
    }

    public VkDeviceOrHostAddressConstKHR hostAddress(@NativeType("void const *") long value) {
        nhostAddress(address(), value);
        return this;
    }

    public VkDeviceOrHostAddressConstKHR set(VkDeviceOrHostAddressConstKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceOrHostAddressConstKHR malloc() {
        return new VkDeviceOrHostAddressConstKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceOrHostAddressConstKHR calloc() {
        return new VkDeviceOrHostAddressConstKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceOrHostAddressConstKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceOrHostAddressConstKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceOrHostAddressConstKHR create(long address) {
        return new VkDeviceOrHostAddressConstKHR(address, null);
    }

    public static VkDeviceOrHostAddressConstKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceOrHostAddressConstKHR(address, null);
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

    public static VkDeviceOrHostAddressConstKHR malloc(MemoryStack stack) {
        return new VkDeviceOrHostAddressConstKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceOrHostAddressConstKHR calloc(MemoryStack stack) {
        return new VkDeviceOrHostAddressConstKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceOrHostAddressConstKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceOrHostAddressConstKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceOrHostAddressConstKHR, Buffer> implements NativeResource {
        private static final VkDeviceOrHostAddressConstKHR ELEMENT_FACTORY = VkDeviceOrHostAddressConstKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceOrHostAddressConstKHR.SIZEOF);
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
        public VkDeviceOrHostAddressConstKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long deviceAddress() {
            return VkDeviceOrHostAddressConstKHR.ndeviceAddress(address());
        }

        @NativeType("void const *")
        public long hostAddress() {
            return VkDeviceOrHostAddressConstKHR.nhostAddress(address());
        }

        public Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) {
            VkDeviceOrHostAddressConstKHR.ndeviceAddress(address(), value);
            return this;
        }

        public Buffer hostAddress(@NativeType("void const *") long value) {
            VkDeviceOrHostAddressConstKHR.nhostAddress(address(), value);
            return this;
        }
    }
}
