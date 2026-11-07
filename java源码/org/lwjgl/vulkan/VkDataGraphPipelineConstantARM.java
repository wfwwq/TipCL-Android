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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineConstantARM.class */
public class VkDataGraphPipelineConstantARM extends Struct<VkDataGraphPipelineConstantARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ID;
    public static final int PCONSTANTDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ID = layout.offsetof(2);
        PCONSTANTDATA = layout.offsetof(3);
    }

    protected VkDataGraphPipelineConstantARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelineConstantARM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelineConstantARM(address, container);
    }

    public VkDataGraphPipelineConstantARM(ByteBuffer container) {
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
    public int id() {
        return nid(address());
    }

    @NativeType("void const *")
    public long pConstantData() {
        return npConstantData(address());
    }

    public VkDataGraphPipelineConstantARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelineConstantARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM);
    }

    public VkDataGraphPipelineConstantARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelineConstantARM pNext(VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDataGraphPipelineConstantARM pNext(VkTensorDescriptionARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDataGraphPipelineConstantARM id(@NativeType("uint32_t") int value) {
        nid(address(), value);
        return this;
    }

    public VkDataGraphPipelineConstantARM pConstantData(@NativeType("void const *") long value) {
        npConstantData(address(), value);
        return this;
    }

    public VkDataGraphPipelineConstantARM set(int sType, long pNext, int id, long pConstantData) {
        sType(sType);
        pNext(pNext);
        id(id);
        pConstantData(pConstantData);
        return this;
    }

    public VkDataGraphPipelineConstantARM set(VkDataGraphPipelineConstantARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelineConstantARM malloc() {
        return new VkDataGraphPipelineConstantARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelineConstantARM calloc() {
        return new VkDataGraphPipelineConstantARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelineConstantARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineConstantARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelineConstantARM create(long address) {
        return new VkDataGraphPipelineConstantARM(address, null);
    }

    public static VkDataGraphPipelineConstantARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelineConstantARM(address, null);
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

    public static VkDataGraphPipelineConstantARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineConstantARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelineConstantARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineConstantARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nid(long struct) {
        return MemoryUtil.memGetInt(struct + ID);
    }

    public static long npConstantData(long struct) {
        return MemoryUtil.memGetAddress(struct + PCONSTANTDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nid(long struct, int value) {
        MemoryUtil.memPutInt(struct + ID, value);
    }

    public static void npConstantData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PCONSTANTDATA, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PCONSTANTDATA));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineConstantARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineConstantARM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelineConstantARM ELEMENT_FACTORY = VkDataGraphPipelineConstantARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelineConstantARM.SIZEOF);
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
        public VkDataGraphPipelineConstantARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelineConstantARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDataGraphPipelineConstantARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int id() {
            return VkDataGraphPipelineConstantARM.nid(address());
        }

        @NativeType("void const *")
        public long pConstantData() {
            return VkDataGraphPipelineConstantARM.npConstantData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelineConstantARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDataGraphPipelineConstantARM.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkTensorDescriptionARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer id(@NativeType("uint32_t") int value) {
            VkDataGraphPipelineConstantARM.nid(address(), value);
            return this;
        }

        public Buffer pConstantData(@NativeType("void const *") long value) {
            VkDataGraphPipelineConstantARM.npConstantData(address(), value);
            return this;
        }
    }
}
