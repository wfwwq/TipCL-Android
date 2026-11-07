package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorCopyARM.class */
public class VkTensorCopyARM extends Struct<VkTensorCopyARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DIMENSIONCOUNT;
    public static final int PSRCOFFSET;
    public static final int PDSTOFFSET;
    public static final int PEXTENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DIMENSIONCOUNT = layout.offsetof(2);
        PSRCOFFSET = layout.offsetof(3);
        PDSTOFFSET = layout.offsetof(4);
        PEXTENT = layout.offsetof(5);
    }

    protected VkTensorCopyARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTensorCopyARM create(long address, ByteBuffer container) {
        return new VkTensorCopyARM(address, container);
    }

    public VkTensorCopyARM(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int dimensionCount() {
        return ndimensionCount(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pSrcOffset() {
        return npSrcOffset(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pDstOffset() {
        return npDstOffset(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pExtent() {
        return npExtent(address());
    }

    public VkTensorCopyARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTensorCopyARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_COPY_ARM);
    }

    public VkTensorCopyARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTensorCopyARM dimensionCount(@NativeType("uint32_t") int value) {
        ndimensionCount(address(), value);
        return this;
    }

    public VkTensorCopyARM pSrcOffset(@NativeType("uint64_t const *") LongBuffer value) {
        npSrcOffset(address(), value);
        return this;
    }

    public VkTensorCopyARM pDstOffset(@NativeType("uint64_t const *") LongBuffer value) {
        npDstOffset(address(), value);
        return this;
    }

    public VkTensorCopyARM pExtent(@NativeType("uint64_t const *") LongBuffer value) {
        npExtent(address(), value);
        return this;
    }

    public VkTensorCopyARM set(int sType, long pNext, int dimensionCount, LongBuffer pSrcOffset, LongBuffer pDstOffset, LongBuffer pExtent) {
        sType(sType);
        pNext(pNext);
        dimensionCount(dimensionCount);
        pSrcOffset(pSrcOffset);
        pDstOffset(pDstOffset);
        pExtent(pExtent);
        return this;
    }

    public VkTensorCopyARM set(VkTensorCopyARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTensorCopyARM malloc() {
        return new VkTensorCopyARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTensorCopyARM calloc() {
        return new VkTensorCopyARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTensorCopyARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorCopyARM(MemoryUtil.memAddress(container), container);
    }

    public static VkTensorCopyARM create(long address) {
        return new VkTensorCopyARM(address, null);
    }

    public static VkTensorCopyARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTensorCopyARM(address, null);
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

    public static VkTensorCopyARM malloc(MemoryStack stack) {
        return new VkTensorCopyARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTensorCopyARM calloc(MemoryStack stack) {
        return new VkTensorCopyARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndimensionCount(long struct) {
        return MemoryUtil.memGetInt(struct + DIMENSIONCOUNT);
    }

    public static LongBuffer npSrcOffset(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PSRCOFFSET), ndimensionCount(struct));
    }

    public static LongBuffer npDstOffset(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PDSTOFFSET), ndimensionCount(struct));
    }

    public static LongBuffer npExtent(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PEXTENT), ndimensionCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndimensionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DIMENSIONCOUNT, value);
    }

    public static void npSrcOffset(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSRCOFFSET, MemoryUtil.memAddressSafe(value));
    }

    public static void npDstOffset(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PDSTOFFSET, MemoryUtil.memAddressSafe(value));
    }

    public static void npExtent(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PEXTENT, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorCopyARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTensorCopyARM, Buffer> implements NativeResource {
        private static final VkTensorCopyARM ELEMENT_FACTORY = VkTensorCopyARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTensorCopyARM.SIZEOF);
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
        public VkTensorCopyARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTensorCopyARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkTensorCopyARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int dimensionCount() {
            return VkTensorCopyARM.ndimensionCount(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pSrcOffset() {
            return VkTensorCopyARM.npSrcOffset(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pDstOffset() {
            return VkTensorCopyARM.npDstOffset(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pExtent() {
            return VkTensorCopyARM.npExtent(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTensorCopyARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_COPY_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkTensorCopyARM.npNext(address(), value);
            return this;
        }

        public Buffer dimensionCount(@NativeType("uint32_t") int value) {
            VkTensorCopyARM.ndimensionCount(address(), value);
            return this;
        }

        public Buffer pSrcOffset(@NativeType("uint64_t const *") LongBuffer value) {
            VkTensorCopyARM.npSrcOffset(address(), value);
            return this;
        }

        public Buffer pDstOffset(@NativeType("uint64_t const *") LongBuffer value) {
            VkTensorCopyARM.npDstOffset(address(), value);
            return this;
        }

        public Buffer pExtent(@NativeType("uint64_t const *") LongBuffer value) {
            VkTensorCopyARM.npExtent(address(), value);
            return this;
        }
    }
}
