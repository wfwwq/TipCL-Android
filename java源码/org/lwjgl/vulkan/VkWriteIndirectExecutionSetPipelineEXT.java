package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteIndirectExecutionSetPipelineEXT.class */
public class VkWriteIndirectExecutionSetPipelineEXT extends Struct<VkWriteIndirectExecutionSetPipelineEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INDEX;
    public static final int PIPELINE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDEX = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
    }

    protected VkWriteIndirectExecutionSetPipelineEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkWriteIndirectExecutionSetPipelineEXT create(long address, ByteBuffer container) {
        return new VkWriteIndirectExecutionSetPipelineEXT(address, container);
    }

    public VkWriteIndirectExecutionSetPipelineEXT(ByteBuffer container) {
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
    public int index() {
        return nindex(address());
    }

    @NativeType("VkPipeline")
    public long pipeline() {
        return npipeline(address());
    }

    public VkWriteIndirectExecutionSetPipelineEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkWriteIndirectExecutionSetPipelineEXT sType$Default() {
        return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT);
    }

    public VkWriteIndirectExecutionSetPipelineEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkWriteIndirectExecutionSetPipelineEXT index(@NativeType("uint32_t") int value) {
        nindex(address(), value);
        return this;
    }

    public VkWriteIndirectExecutionSetPipelineEXT pipeline(@NativeType("VkPipeline") long value) {
        npipeline(address(), value);
        return this;
    }

    public VkWriteIndirectExecutionSetPipelineEXT set(int sType, long pNext, int index, long pipeline) {
        sType(sType);
        pNext(pNext);
        index(index);
        pipeline(pipeline);
        return this;
    }

    public VkWriteIndirectExecutionSetPipelineEXT set(VkWriteIndirectExecutionSetPipelineEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkWriteIndirectExecutionSetPipelineEXT malloc() {
        return new VkWriteIndirectExecutionSetPipelineEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkWriteIndirectExecutionSetPipelineEXT calloc() {
        return new VkWriteIndirectExecutionSetPipelineEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkWriteIndirectExecutionSetPipelineEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteIndirectExecutionSetPipelineEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkWriteIndirectExecutionSetPipelineEXT create(long address) {
        return new VkWriteIndirectExecutionSetPipelineEXT(address, null);
    }

    public static VkWriteIndirectExecutionSetPipelineEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkWriteIndirectExecutionSetPipelineEXT(address, null);
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

    public static VkWriteIndirectExecutionSetPipelineEXT malloc(MemoryStack stack) {
        return new VkWriteIndirectExecutionSetPipelineEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkWriteIndirectExecutionSetPipelineEXT calloc(MemoryStack stack) {
        return new VkWriteIndirectExecutionSetPipelineEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nindex(long struct) {
        return MemoryUtil.memGetInt(struct + INDEX);
    }

    public static long npipeline(long struct) {
        return MemoryUtil.memGetLong(struct + PIPELINE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nindex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEX, value);
    }

    public static void npipeline(long struct, long value) {
        MemoryUtil.memPutLong(struct + PIPELINE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteIndirectExecutionSetPipelineEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkWriteIndirectExecutionSetPipelineEXT, Buffer> implements NativeResource {
        private static final VkWriteIndirectExecutionSetPipelineEXT ELEMENT_FACTORY = VkWriteIndirectExecutionSetPipelineEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkWriteIndirectExecutionSetPipelineEXT.SIZEOF);
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
        public VkWriteIndirectExecutionSetPipelineEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkWriteIndirectExecutionSetPipelineEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkWriteIndirectExecutionSetPipelineEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int index() {
            return VkWriteIndirectExecutionSetPipelineEXT.nindex(address());
        }

        @NativeType("VkPipeline")
        public long pipeline() {
            return VkWriteIndirectExecutionSetPipelineEXT.npipeline(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkWriteIndirectExecutionSetPipelineEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkWriteIndirectExecutionSetPipelineEXT.npNext(address(), value);
            return this;
        }

        public Buffer index(@NativeType("uint32_t") int value) {
            VkWriteIndirectExecutionSetPipelineEXT.nindex(address(), value);
            return this;
        }

        public Buffer pipeline(@NativeType("VkPipeline") long value) {
            VkWriteIndirectExecutionSetPipelineEXT.npipeline(address(), value);
            return this;
        }
    }
}
