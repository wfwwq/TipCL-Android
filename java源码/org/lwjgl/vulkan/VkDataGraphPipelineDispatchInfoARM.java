package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineDispatchInfoARM.class */
public class VkDataGraphPipelineDispatchInfoARM extends Struct<VkDataGraphPipelineDispatchInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected VkDataGraphPipelineDispatchInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelineDispatchInfoARM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelineDispatchInfoARM(address, container);
    }

    public VkDataGraphPipelineDispatchInfoARM(ByteBuffer container) {
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

    @NativeType("VkDataGraphPipelineDispatchFlagsARM")
    public long flags() {
        return nflags(address());
    }

    public VkDataGraphPipelineDispatchInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelineDispatchInfoARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM);
    }

    public VkDataGraphPipelineDispatchInfoARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelineDispatchInfoARM flags(@NativeType("VkDataGraphPipelineDispatchFlagsARM") long value) {
        nflags(address(), value);
        return this;
    }

    public VkDataGraphPipelineDispatchInfoARM set(int sType, long pNext, long flags) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        return this;
    }

    public VkDataGraphPipelineDispatchInfoARM set(VkDataGraphPipelineDispatchInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelineDispatchInfoARM malloc() {
        return new VkDataGraphPipelineDispatchInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelineDispatchInfoARM calloc() {
        return new VkDataGraphPipelineDispatchInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelineDispatchInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineDispatchInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelineDispatchInfoARM create(long address) {
        return new VkDataGraphPipelineDispatchInfoARM(address, null);
    }

    public static VkDataGraphPipelineDispatchInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelineDispatchInfoARM(address, null);
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

    public static VkDataGraphPipelineDispatchInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineDispatchInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelineDispatchInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineDispatchInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, long value) {
        MemoryUtil.memPutLong(struct + FLAGS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineDispatchInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineDispatchInfoARM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelineDispatchInfoARM ELEMENT_FACTORY = VkDataGraphPipelineDispatchInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelineDispatchInfoARM.SIZEOF);
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
        public VkDataGraphPipelineDispatchInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelineDispatchInfoARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDataGraphPipelineDispatchInfoARM.npNext(address());
        }

        @NativeType("VkDataGraphPipelineDispatchFlagsARM")
        public long flags() {
            return VkDataGraphPipelineDispatchInfoARM.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelineDispatchInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDataGraphPipelineDispatchInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkDataGraphPipelineDispatchFlagsARM") long value) {
            VkDataGraphPipelineDispatchInfoARM.nflags(address(), value);
            return this;
        }
    }
}
