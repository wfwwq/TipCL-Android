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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultCountsEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultCountsEXT.class */
public class VkDeviceFaultCountsEXT extends Struct<VkDeviceFaultCountsEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ADDRESSINFOCOUNT;
    public static final int VENDORINFOCOUNT;
    public static final int VENDORBINARYSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ADDRESSINFOCOUNT = layout.offsetof(2);
        VENDORINFOCOUNT = layout.offsetof(3);
        VENDORBINARYSIZE = layout.offsetof(4);
    }

    protected VkDeviceFaultCountsEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceFaultCountsEXT create(long address, ByteBuffer container) {
        return new VkDeviceFaultCountsEXT(address, container);
    }

    public VkDeviceFaultCountsEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int addressInfoCount() {
        return naddressInfoCount(address());
    }

    @NativeType("uint32_t")
    public int vendorInfoCount() {
        return nvendorInfoCount(address());
    }

    @NativeType("VkDeviceSize")
    public long vendorBinarySize() {
        return nvendorBinarySize(address());
    }

    public VkDeviceFaultCountsEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceFaultCountsEXT sType$Default() {
        return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT);
    }

    public VkDeviceFaultCountsEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceFaultCountsEXT addressInfoCount(@NativeType("uint32_t") int value) {
        naddressInfoCount(address(), value);
        return this;
    }

    public VkDeviceFaultCountsEXT vendorInfoCount(@NativeType("uint32_t") int value) {
        nvendorInfoCount(address(), value);
        return this;
    }

    public VkDeviceFaultCountsEXT vendorBinarySize(@NativeType("VkDeviceSize") long value) {
        nvendorBinarySize(address(), value);
        return this;
    }

    public VkDeviceFaultCountsEXT set(int sType, long pNext, int addressInfoCount, int vendorInfoCount, long vendorBinarySize) {
        sType(sType);
        pNext(pNext);
        addressInfoCount(addressInfoCount);
        vendorInfoCount(vendorInfoCount);
        vendorBinarySize(vendorBinarySize);
        return this;
    }

    public VkDeviceFaultCountsEXT set(VkDeviceFaultCountsEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceFaultCountsEXT malloc() {
        return new VkDeviceFaultCountsEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceFaultCountsEXT calloc() {
        return new VkDeviceFaultCountsEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceFaultCountsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultCountsEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceFaultCountsEXT create(long address) {
        return new VkDeviceFaultCountsEXT(address, null);
    }

    public static VkDeviceFaultCountsEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceFaultCountsEXT(address, null);
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

    public static VkDeviceFaultCountsEXT malloc(MemoryStack stack) {
        return new VkDeviceFaultCountsEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceFaultCountsEXT calloc(MemoryStack stack) {
        return new VkDeviceFaultCountsEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int naddressInfoCount(long struct) {
        return MemoryUtil.memGetInt(struct + ADDRESSINFOCOUNT);
    }

    public static int nvendorInfoCount(long struct) {
        return MemoryUtil.memGetInt(struct + VENDORINFOCOUNT);
    }

    public static long nvendorBinarySize(long struct) {
        return MemoryUtil.memGetLong(struct + VENDORBINARYSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void naddressInfoCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADDRESSINFOCOUNT, value);
    }

    public static void nvendorInfoCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VENDORINFOCOUNT, value);
    }

    public static void nvendorBinarySize(long struct, long value) {
        MemoryUtil.memPutLong(struct + VENDORBINARYSIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultCountsEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultCountsEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceFaultCountsEXT, Buffer> implements NativeResource {
        private static final VkDeviceFaultCountsEXT ELEMENT_FACTORY = VkDeviceFaultCountsEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceFaultCountsEXT.SIZEOF);
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
        public VkDeviceFaultCountsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceFaultCountsEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDeviceFaultCountsEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int addressInfoCount() {
            return VkDeviceFaultCountsEXT.naddressInfoCount(address());
        }

        @NativeType("uint32_t")
        public int vendorInfoCount() {
            return VkDeviceFaultCountsEXT.nvendorInfoCount(address());
        }

        @NativeType("VkDeviceSize")
        public long vendorBinarySize() {
            return VkDeviceFaultCountsEXT.nvendorBinarySize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceFaultCountsEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDeviceFaultCountsEXT.npNext(address(), value);
            return this;
        }

        public Buffer addressInfoCount(@NativeType("uint32_t") int value) {
            VkDeviceFaultCountsEXT.naddressInfoCount(address(), value);
            return this;
        }

        public Buffer vendorInfoCount(@NativeType("uint32_t") int value) {
            VkDeviceFaultCountsEXT.nvendorInfoCount(address(), value);
            return this;
        }

        public Buffer vendorBinarySize(@NativeType("VkDeviceSize") long value) {
            VkDeviceFaultCountsEXT.nvendorBinarySize(address(), value);
            return this;
        }
    }
}
