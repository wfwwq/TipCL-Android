package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkTensorCopyARM;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyTensorInfoARM.class */
public class VkCopyTensorInfoARM extends Struct<VkCopyTensorInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCTENSOR;
    public static final int DSTTENSOR;
    public static final int REGIONCOUNT;
    public static final int PREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCTENSOR = layout.offsetof(2);
        DSTTENSOR = layout.offsetof(3);
        REGIONCOUNT = layout.offsetof(4);
        PREGIONS = layout.offsetof(5);
    }

    protected VkCopyTensorInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyTensorInfoARM create(long address, ByteBuffer container) {
        return new VkCopyTensorInfoARM(address, container);
    }

    public VkCopyTensorInfoARM(ByteBuffer container) {
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

    @NativeType("VkTensorARM")
    public long srcTensor() {
        return nsrcTensor(address());
    }

    @NativeType("VkTensorARM")
    public long dstTensor() {
        return ndstTensor(address());
    }

    @NativeType("uint32_t")
    public int regionCount() {
        return nregionCount(address());
    }

    @NativeType("VkTensorCopyARM const *")
    public VkTensorCopyARM.Buffer pRegions() {
        return npRegions(address());
    }

    public VkCopyTensorInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyTensorInfoARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM);
    }

    public VkCopyTensorInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyTensorInfoARM srcTensor(@NativeType("VkTensorARM") long value) {
        nsrcTensor(address(), value);
        return this;
    }

    public VkCopyTensorInfoARM dstTensor(@NativeType("VkTensorARM") long value) {
        ndstTensor(address(), value);
        return this;
    }

    public VkCopyTensorInfoARM pRegions(@NativeType("VkTensorCopyARM const *") VkTensorCopyARM.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    public VkCopyTensorInfoARM set(int sType, long pNext, long srcTensor, long dstTensor, VkTensorCopyARM.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        srcTensor(srcTensor);
        dstTensor(dstTensor);
        pRegions(pRegions);
        return this;
    }

    public VkCopyTensorInfoARM set(VkCopyTensorInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyTensorInfoARM malloc() {
        return new VkCopyTensorInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyTensorInfoARM calloc() {
        return new VkCopyTensorInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyTensorInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyTensorInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyTensorInfoARM create(long address) {
        return new VkCopyTensorInfoARM(address, null);
    }

    public static VkCopyTensorInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyTensorInfoARM(address, null);
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

    public static VkCopyTensorInfoARM malloc(MemoryStack stack) {
        return new VkCopyTensorInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyTensorInfoARM calloc(MemoryStack stack) {
        return new VkCopyTensorInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsrcTensor(long struct) {
        return MemoryUtil.memGetLong(struct + SRCTENSOR);
    }

    public static long ndstTensor(long struct) {
        return MemoryUtil.memGetLong(struct + DSTTENSOR);
    }

    public static int nregionCount(long struct) {
        return MemoryUtil.memGetInt(struct + REGIONCOUNT);
    }

    public static VkTensorCopyARM.Buffer npRegions(long struct) {
        return VkTensorCopyARM.create(MemoryUtil.memGetAddress(struct + PREGIONS), nregionCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcTensor(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCTENSOR, value);
    }

    public static void ndstTensor(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTTENSOR, value);
    }

    public static void nregionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + REGIONCOUNT, value);
    }

    public static void npRegions(long struct, VkTensorCopyARM.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREGIONS, value.address());
        nregionCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PREGIONS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyTensorInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyTensorInfoARM, Buffer> implements NativeResource {
        private static final VkCopyTensorInfoARM ELEMENT_FACTORY = VkCopyTensorInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyTensorInfoARM.SIZEOF);
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
        public VkCopyTensorInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyTensorInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyTensorInfoARM.npNext(address());
        }

        @NativeType("VkTensorARM")
        public long srcTensor() {
            return VkCopyTensorInfoARM.nsrcTensor(address());
        }

        @NativeType("VkTensorARM")
        public long dstTensor() {
            return VkCopyTensorInfoARM.ndstTensor(address());
        }

        @NativeType("uint32_t")
        public int regionCount() {
            return VkCopyTensorInfoARM.nregionCount(address());
        }

        @NativeType("VkTensorCopyARM const *")
        public VkTensorCopyARM.Buffer pRegions() {
            return VkCopyTensorInfoARM.npRegions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyTensorInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyTensorInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer srcTensor(@NativeType("VkTensorARM") long value) {
            VkCopyTensorInfoARM.nsrcTensor(address(), value);
            return this;
        }

        public Buffer dstTensor(@NativeType("VkTensorARM") long value) {
            VkCopyTensorInfoARM.ndstTensor(address(), value);
            return this;
        }

        public Buffer pRegions(@NativeType("VkTensorCopyARM const *") VkTensorCopyARM.Buffer value) {
            VkCopyTensorInfoARM.npRegions(address(), value);
            return this;
        }
    }
}
