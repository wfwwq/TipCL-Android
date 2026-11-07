package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorViewCreateInfoARM.class */
public class VkTensorViewCreateInfoARM extends Struct<VkTensorViewCreateInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int TENSOR;
    public static final int FORMAT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TENSOR = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
    }

    protected VkTensorViewCreateInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTensorViewCreateInfoARM create(long address, ByteBuffer container) {
        return new VkTensorViewCreateInfoARM(address, container);
    }

    public VkTensorViewCreateInfoARM(ByteBuffer container) {
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

    @NativeType("VkTensorViewCreateFlagsARM")
    public long flags() {
        return nflags(address());
    }

    @NativeType("VkTensorARM")
    public long tensor() {
        return ntensor(address());
    }

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    public VkTensorViewCreateInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTensorViewCreateInfoARM sType$Default() {
        return sType(1000460001);
    }

    public VkTensorViewCreateInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTensorViewCreateInfoARM pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkTensorViewCreateInfoARM flags(@NativeType("VkTensorViewCreateFlagsARM") long value) {
        nflags(address(), value);
        return this;
    }

    public VkTensorViewCreateInfoARM tensor(@NativeType("VkTensorARM") long value) {
        ntensor(address(), value);
        return this;
    }

    public VkTensorViewCreateInfoARM format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkTensorViewCreateInfoARM set(int sType, long pNext, long flags, long tensor, int format) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        tensor(tensor);
        format(format);
        return this;
    }

    public VkTensorViewCreateInfoARM set(VkTensorViewCreateInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTensorViewCreateInfoARM malloc() {
        return new VkTensorViewCreateInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTensorViewCreateInfoARM calloc() {
        return new VkTensorViewCreateInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTensorViewCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorViewCreateInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkTensorViewCreateInfoARM create(long address) {
        return new VkTensorViewCreateInfoARM(address, null);
    }

    public static VkTensorViewCreateInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTensorViewCreateInfoARM(address, null);
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

    public static VkTensorViewCreateInfoARM malloc(MemoryStack stack) {
        return new VkTensorViewCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTensorViewCreateInfoARM calloc(MemoryStack stack) {
        return new VkTensorViewCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nflags(long struct) {
        return MemoryUtil.memGetLong(struct + FLAGS);
    }

    public static long ntensor(long struct) {
        return MemoryUtil.memGetLong(struct + TENSOR);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, long value) {
        MemoryUtil.memPutLong(struct + FLAGS, value);
    }

    public static void ntensor(long struct, long value) {
        MemoryUtil.memPutLong(struct + TENSOR, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorViewCreateInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTensorViewCreateInfoARM, Buffer> implements NativeResource {
        private static final VkTensorViewCreateInfoARM ELEMENT_FACTORY = VkTensorViewCreateInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTensorViewCreateInfoARM.SIZEOF);
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
        public VkTensorViewCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTensorViewCreateInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkTensorViewCreateInfoARM.npNext(address());
        }

        @NativeType("VkTensorViewCreateFlagsARM")
        public long flags() {
            return VkTensorViewCreateInfoARM.nflags(address());
        }

        @NativeType("VkTensorARM")
        public long tensor() {
            return VkTensorViewCreateInfoARM.ntensor(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkTensorViewCreateInfoARM.nformat(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTensorViewCreateInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000460001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkTensorViewCreateInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkTensorViewCreateFlagsARM") long value) {
            VkTensorViewCreateInfoARM.nflags(address(), value);
            return this;
        }

        public Buffer tensor(@NativeType("VkTensorARM") long value) {
            VkTensorViewCreateInfoARM.ntensor(address(), value);
            return this;
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkTensorViewCreateInfoARM.nformat(address(), value);
            return this;
        }
    }
}
