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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCreateInfoKHR.class */
public class VkAccelerationStructureCreateInfoKHR extends Struct<VkAccelerationStructureCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CREATEFLAGS;
    public static final int BUFFER;
    public static final int OFFSET;
    public static final int SIZE;
    public static final int TYPE;
    public static final int DEVICEADDRESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(8), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CREATEFLAGS = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        SIZE = layout.offsetof(5);
        TYPE = layout.offsetof(6);
        DEVICEADDRESS = layout.offsetof(7);
    }

    protected VkAccelerationStructureCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkAccelerationStructureCreateInfoKHR(address, container);
    }

    public VkAccelerationStructureCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkAccelerationStructureCreateFlagsKHR")
    public int createFlags() {
        return ncreateFlags(address());
    }

    @NativeType("VkBuffer")
    public long buffer() {
        return nbuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long offset() {
        return noffset(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkAccelerationStructureTypeKHR")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkDeviceAddress")
    public long deviceAddress() {
        return ndeviceAddress(address());
    }

    public VkAccelerationStructureCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoKHR sType$Default() {
        return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR);
    }

    public VkAccelerationStructureCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoKHR pNext(VkAccelerationStructureMotionInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAccelerationStructureCreateInfoKHR pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAccelerationStructureCreateInfoKHR createFlags(@NativeType("VkAccelerationStructureCreateFlagsKHR") int value) {
        ncreateFlags(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoKHR buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoKHR offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoKHR size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoKHR type(@NativeType("VkAccelerationStructureTypeKHR") int value) {
        ntype(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoKHR deviceAddress(@NativeType("VkDeviceAddress") long value) {
        ndeviceAddress(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoKHR set(int sType, long pNext, int createFlags, long buffer, long offset, long size, int type, long deviceAddress) {
        sType(sType);
        pNext(pNext);
        createFlags(createFlags);
        buffer(buffer);
        offset(offset);
        size(size);
        type(type);
        deviceAddress(deviceAddress);
        return this;
    }

    public VkAccelerationStructureCreateInfoKHR set(VkAccelerationStructureCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureCreateInfoKHR malloc() {
        return new VkAccelerationStructureCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureCreateInfoKHR calloc() {
        return new VkAccelerationStructureCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureCreateInfoKHR create(long address) {
        return new VkAccelerationStructureCreateInfoKHR(address, null);
    }

    public static VkAccelerationStructureCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureCreateInfoKHR(address, null);
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

    public static VkAccelerationStructureCreateInfoKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureCreateInfoKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncreateFlags(long struct) {
        return MemoryUtil.memGetInt(struct + CREATEFLAGS);
    }

    public static long nbuffer(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFER);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetLong(struct + OFFSET);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static long ndeviceAddress(long struct) {
        return MemoryUtil.memGetLong(struct + DEVICEADDRESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncreateFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + CREATEFLAGS, value);
    }

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFER, value);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFFSET, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void ndeviceAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + DEVICEADDRESS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkAccelerationStructureCreateInfoKHR ELEMENT_FACTORY = VkAccelerationStructureCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureCreateInfoKHR.SIZEOF);
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
        public VkAccelerationStructureCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureCreateInfoKHR.npNext(address());
        }

        @NativeType("VkAccelerationStructureCreateFlagsKHR")
        public int createFlags() {
            return VkAccelerationStructureCreateInfoKHR.ncreateFlags(address());
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkAccelerationStructureCreateInfoKHR.nbuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VkAccelerationStructureCreateInfoKHR.noffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkAccelerationStructureCreateInfoKHR.nsize(address());
        }

        @NativeType("VkAccelerationStructureTypeKHR")
        public int type() {
            return VkAccelerationStructureCreateInfoKHR.ntype(address());
        }

        @NativeType("VkDeviceAddress")
        public long deviceAddress() {
            return VkAccelerationStructureCreateInfoKHR.ndeviceAddress(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkAccelerationStructureMotionInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer createFlags(@NativeType("VkAccelerationStructureCreateFlagsKHR") int value) {
            VkAccelerationStructureCreateInfoKHR.ncreateFlags(address(), value);
            return this;
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkAccelerationStructureCreateInfoKHR.nbuffer(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureCreateInfoKHR.noffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureCreateInfoKHR.nsize(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkAccelerationStructureTypeKHR") int value) {
            VkAccelerationStructureCreateInfoKHR.ntype(address(), value);
            return this;
        }

        public Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) {
            VkAccelerationStructureCreateInfoKHR.ndeviceAddress(address(), value);
            return this;
        }
    }
}
