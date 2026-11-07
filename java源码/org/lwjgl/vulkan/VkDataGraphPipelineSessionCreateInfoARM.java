package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineSessionCreateInfoARM.class */
public class VkDataGraphPipelineSessionCreateInfoARM extends Struct<VkDataGraphPipelineSessionCreateInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DATAGRAPHPIPELINE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DATAGRAPHPIPELINE = layout.offsetof(3);
    }

    protected VkDataGraphPipelineSessionCreateInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelineSessionCreateInfoARM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelineSessionCreateInfoARM(address, container);
    }

    public VkDataGraphPipelineSessionCreateInfoARM(ByteBuffer container) {
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

    @NativeType("VkDataGraphPipelineSessionCreateFlagsARM")
    public long flags() {
        return nflags(address());
    }

    @NativeType("VkPipeline")
    public long dataGraphPipeline() {
        return ndataGraphPipeline(address());
    }

    public VkDataGraphPipelineSessionCreateInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelineSessionCreateInfoARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM);
    }

    public VkDataGraphPipelineSessionCreateInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelineSessionCreateInfoARM flags(@NativeType("VkDataGraphPipelineSessionCreateFlagsARM") long value) {
        nflags(address(), value);
        return this;
    }

    public VkDataGraphPipelineSessionCreateInfoARM dataGraphPipeline(@NativeType("VkPipeline") long value) {
        ndataGraphPipeline(address(), value);
        return this;
    }

    public VkDataGraphPipelineSessionCreateInfoARM set(int sType, long pNext, long flags, long dataGraphPipeline) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        dataGraphPipeline(dataGraphPipeline);
        return this;
    }

    public VkDataGraphPipelineSessionCreateInfoARM set(VkDataGraphPipelineSessionCreateInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelineSessionCreateInfoARM malloc() {
        return new VkDataGraphPipelineSessionCreateInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelineSessionCreateInfoARM calloc() {
        return new VkDataGraphPipelineSessionCreateInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelineSessionCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineSessionCreateInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelineSessionCreateInfoARM create(long address) {
        return new VkDataGraphPipelineSessionCreateInfoARM(address, null);
    }

    public static VkDataGraphPipelineSessionCreateInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelineSessionCreateInfoARM(address, null);
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

    public static VkDataGraphPipelineSessionCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelineSessionCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndataGraphPipeline(long struct) {
        return MemoryUtil.memGetLong(struct + DATAGRAPHPIPELINE);
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

    public static void ndataGraphPipeline(long struct, long value) {
        MemoryUtil.memPutLong(struct + DATAGRAPHPIPELINE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineSessionCreateInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineSessionCreateInfoARM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelineSessionCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineSessionCreateInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelineSessionCreateInfoARM.SIZEOF);
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
        public VkDataGraphPipelineSessionCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelineSessionCreateInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDataGraphPipelineSessionCreateInfoARM.npNext(address());
        }

        @NativeType("VkDataGraphPipelineSessionCreateFlagsARM")
        public long flags() {
            return VkDataGraphPipelineSessionCreateInfoARM.nflags(address());
        }

        @NativeType("VkPipeline")
        public long dataGraphPipeline() {
            return VkDataGraphPipelineSessionCreateInfoARM.ndataGraphPipeline(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelineSessionCreateInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDataGraphPipelineSessionCreateInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkDataGraphPipelineSessionCreateFlagsARM") long value) {
            VkDataGraphPipelineSessionCreateInfoARM.nflags(address(), value);
            return this;
        }

        public Buffer dataGraphPipeline(@NativeType("VkPipeline") long value) {
            VkDataGraphPipelineSessionCreateInfoARM.ndataGraphPipeline(address(), value);
            return this;
        }
    }
}
