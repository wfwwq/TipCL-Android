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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultAddressInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultAddressInfoEXT.class */
public class VkDeviceFaultAddressInfoEXT extends Struct<VkDeviceFaultAddressInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ADDRESSTYPE;
    public static final int REPORTEDADDRESS;
    public static final int ADDRESSPRECISION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ADDRESSTYPE = layout.offsetof(0);
        REPORTEDADDRESS = layout.offsetof(1);
        ADDRESSPRECISION = layout.offsetof(2);
    }

    protected VkDeviceFaultAddressInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceFaultAddressInfoEXT create(long address, ByteBuffer container) {
        return new VkDeviceFaultAddressInfoEXT(address, container);
    }

    public VkDeviceFaultAddressInfoEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceFaultAddressTypeEXT")
    public int addressType() {
        return naddressType(address());
    }

    @NativeType("VkDeviceAddress")
    public long reportedAddress() {
        return nreportedAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long addressPrecision() {
        return naddressPrecision(address());
    }

    public VkDeviceFaultAddressInfoEXT addressType(@NativeType("VkDeviceFaultAddressTypeEXT") int value) {
        naddressType(address(), value);
        return this;
    }

    public VkDeviceFaultAddressInfoEXT reportedAddress(@NativeType("VkDeviceAddress") long value) {
        nreportedAddress(address(), value);
        return this;
    }

    public VkDeviceFaultAddressInfoEXT addressPrecision(@NativeType("VkDeviceSize") long value) {
        naddressPrecision(address(), value);
        return this;
    }

    public VkDeviceFaultAddressInfoEXT set(int addressType, long reportedAddress, long addressPrecision) {
        addressType(addressType);
        reportedAddress(reportedAddress);
        addressPrecision(addressPrecision);
        return this;
    }

    public VkDeviceFaultAddressInfoEXT set(VkDeviceFaultAddressInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceFaultAddressInfoEXT malloc() {
        return new VkDeviceFaultAddressInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceFaultAddressInfoEXT calloc() {
        return new VkDeviceFaultAddressInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceFaultAddressInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultAddressInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceFaultAddressInfoEXT create(long address) {
        return new VkDeviceFaultAddressInfoEXT(address, null);
    }

    public static VkDeviceFaultAddressInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceFaultAddressInfoEXT(address, null);
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

    public static VkDeviceFaultAddressInfoEXT malloc(MemoryStack stack) {
        return new VkDeviceFaultAddressInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceFaultAddressInfoEXT calloc(MemoryStack stack) {
        return new VkDeviceFaultAddressInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int naddressType(long struct) {
        return MemoryUtil.memGetInt(struct + ADDRESSTYPE);
    }

    public static long nreportedAddress(long struct) {
        return MemoryUtil.memGetLong(struct + REPORTEDADDRESS);
    }

    public static long naddressPrecision(long struct) {
        return MemoryUtil.memGetLong(struct + ADDRESSPRECISION);
    }

    public static void naddressType(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADDRESSTYPE, value);
    }

    public static void nreportedAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + REPORTEDADDRESS, value);
    }

    public static void naddressPrecision(long struct, long value) {
        MemoryUtil.memPutLong(struct + ADDRESSPRECISION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultAddressInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultAddressInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceFaultAddressInfoEXT, Buffer> implements NativeResource {
        private static final VkDeviceFaultAddressInfoEXT ELEMENT_FACTORY = VkDeviceFaultAddressInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceFaultAddressInfoEXT.SIZEOF);
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
        public VkDeviceFaultAddressInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceFaultAddressTypeEXT")
        public int addressType() {
            return VkDeviceFaultAddressInfoEXT.naddressType(address());
        }

        @NativeType("VkDeviceAddress")
        public long reportedAddress() {
            return VkDeviceFaultAddressInfoEXT.nreportedAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long addressPrecision() {
            return VkDeviceFaultAddressInfoEXT.naddressPrecision(address());
        }

        public Buffer addressType(@NativeType("VkDeviceFaultAddressTypeEXT") int value) {
            VkDeviceFaultAddressInfoEXT.naddressType(address(), value);
            return this;
        }

        public Buffer reportedAddress(@NativeType("VkDeviceAddress") long value) {
            VkDeviceFaultAddressInfoEXT.nreportedAddress(address(), value);
            return this;
        }

        public Buffer addressPrecision(@NativeType("VkDeviceSize") long value) {
            VkDeviceFaultAddressInfoEXT.naddressPrecision(address(), value);
            return this;
        }
    }
}
