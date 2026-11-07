package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectExecutionSetPipelineInfoEXT.class */
public class VkIndirectExecutionSetPipelineInfoEXT extends Struct<VkIndirectExecutionSetPipelineInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INITIALPIPELINE;
    public static final int MAXPIPELINECOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INITIALPIPELINE = layout.offsetof(2);
        MAXPIPELINECOUNT = layout.offsetof(3);
    }

    protected VkIndirectExecutionSetPipelineInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectExecutionSetPipelineInfoEXT create(long address, ByteBuffer container) {
        return new VkIndirectExecutionSetPipelineInfoEXT(address, container);
    }

    public VkIndirectExecutionSetPipelineInfoEXT(ByteBuffer container) {
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

    @NativeType("VkPipeline")
    public long initialPipeline() {
        return ninitialPipeline(address());
    }

    @NativeType("uint32_t")
    public int maxPipelineCount() {
        return nmaxPipelineCount(address());
    }

    public VkIndirectExecutionSetPipelineInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkIndirectExecutionSetPipelineInfoEXT sType$Default() {
        return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT);
    }

    public VkIndirectExecutionSetPipelineInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkIndirectExecutionSetPipelineInfoEXT initialPipeline(@NativeType("VkPipeline") long value) {
        ninitialPipeline(address(), value);
        return this;
    }

    public VkIndirectExecutionSetPipelineInfoEXT maxPipelineCount(@NativeType("uint32_t") int value) {
        nmaxPipelineCount(address(), value);
        return this;
    }

    public VkIndirectExecutionSetPipelineInfoEXT set(int sType, long pNext, long initialPipeline, int maxPipelineCount) {
        sType(sType);
        pNext(pNext);
        initialPipeline(initialPipeline);
        maxPipelineCount(maxPipelineCount);
        return this;
    }

    public VkIndirectExecutionSetPipelineInfoEXT set(VkIndirectExecutionSetPipelineInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectExecutionSetPipelineInfoEXT malloc() {
        return new VkIndirectExecutionSetPipelineInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectExecutionSetPipelineInfoEXT calloc() {
        return new VkIndirectExecutionSetPipelineInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectExecutionSetPipelineInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectExecutionSetPipelineInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectExecutionSetPipelineInfoEXT create(long address) {
        return new VkIndirectExecutionSetPipelineInfoEXT(address, null);
    }

    public static VkIndirectExecutionSetPipelineInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectExecutionSetPipelineInfoEXT(address, null);
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

    public static VkIndirectExecutionSetPipelineInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectExecutionSetPipelineInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectExecutionSetPipelineInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectExecutionSetPipelineInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ninitialPipeline(long struct) {
        return MemoryUtil.memGetLong(struct + INITIALPIPELINE);
    }

    public static int nmaxPipelineCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPIPELINECOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ninitialPipeline(long struct, long value) {
        MemoryUtil.memPutLong(struct + INITIALPIPELINE, value);
    }

    public static void nmaxPipelineCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXPIPELINECOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectExecutionSetPipelineInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectExecutionSetPipelineInfoEXT, Buffer> implements NativeResource {
        private static final VkIndirectExecutionSetPipelineInfoEXT ELEMENT_FACTORY = VkIndirectExecutionSetPipelineInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectExecutionSetPipelineInfoEXT.SIZEOF);
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
        public VkIndirectExecutionSetPipelineInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkIndirectExecutionSetPipelineInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkIndirectExecutionSetPipelineInfoEXT.npNext(address());
        }

        @NativeType("VkPipeline")
        public long initialPipeline() {
            return VkIndirectExecutionSetPipelineInfoEXT.ninitialPipeline(address());
        }

        @NativeType("uint32_t")
        public int maxPipelineCount() {
            return VkIndirectExecutionSetPipelineInfoEXT.nmaxPipelineCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkIndirectExecutionSetPipelineInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkIndirectExecutionSetPipelineInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer initialPipeline(@NativeType("VkPipeline") long value) {
            VkIndirectExecutionSetPipelineInfoEXT.ninitialPipeline(address(), value);
            return this;
        }

        public Buffer maxPipelineCount(@NativeType("uint32_t") int value) {
            VkIndirectExecutionSetPipelineInfoEXT.nmaxPipelineCount(address(), value);
            return this;
        }
    }
}
