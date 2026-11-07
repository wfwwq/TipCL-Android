package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.class */
public class VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM extends Struct<VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DIMENSION;
    public static final int ZEROCOUNT;
    public static final int GROUPSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DIMENSION = layout.offsetof(2);
        ZEROCOUNT = layout.offsetof(3);
        GROUPSIZE = layout.offsetof(4);
    }

    protected VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(address, container);
    }

    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(ByteBuffer container) {
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
    public int dimension() {
        return ndimension(address());
    }

    @NativeType("uint32_t")
    public int zeroCount() {
        return nzeroCount(address());
    }

    @NativeType("uint32_t")
    public int groupSize() {
        return ngroupSize(address());
    }

    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_TENSOR_SEMI_STRUCTURED_SPARSITY_INFO_ARM);
    }

    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM dimension(@NativeType("uint32_t") int value) {
        ndimension(address(), value);
        return this;
    }

    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM zeroCount(@NativeType("uint32_t") int value) {
        nzeroCount(address(), value);
        return this;
    }

    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM groupSize(@NativeType("uint32_t") int value) {
        ngroupSize(address(), value);
        return this;
    }

    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM set(int sType, long pNext, int dimension, int zeroCount, int groupSize) {
        sType(sType);
        pNext(pNext);
        dimension(dimension);
        zeroCount(zeroCount);
        groupSize(groupSize);
        return this;
    }

    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM set(VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM malloc() {
        return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM calloc() {
        return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM create(long address) {
        return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(address, null);
    }

    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(address, null);
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

    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndimension(long struct) {
        return MemoryUtil.memGetInt(struct + DIMENSION);
    }

    public static int nzeroCount(long struct) {
        return MemoryUtil.memGetInt(struct + ZEROCOUNT);
    }

    public static int ngroupSize(long struct) {
        return MemoryUtil.memGetInt(struct + GROUPSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndimension(long struct, int value) {
        MemoryUtil.memPutInt(struct + DIMENSION, value);
    }

    public static void nzeroCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ZEROCOUNT, value);
    }

    public static void ngroupSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + GROUPSIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM ELEMENT_FACTORY = VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.SIZEOF);
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
        public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int dimension() {
            return VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.ndimension(address());
        }

        @NativeType("uint32_t")
        public int zeroCount() {
            return VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.nzeroCount(address());
        }

        @NativeType("uint32_t")
        public int groupSize() {
            return VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.ngroupSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_TENSOR_SEMI_STRUCTURED_SPARSITY_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer dimension(@NativeType("uint32_t") int value) {
            VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.ndimension(address(), value);
            return this;
        }

        public Buffer zeroCount(@NativeType("uint32_t") int value) {
            VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.nzeroCount(address(), value);
            return this;
        }

        public Buffer groupSize(@NativeType("uint32_t") int value) {
            VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM.ngroupSize(address(), value);
            return this;
        }
    }
}
