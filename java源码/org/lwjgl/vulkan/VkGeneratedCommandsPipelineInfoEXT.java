package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsPipelineInfoEXT.class */
public class VkGeneratedCommandsPipelineInfoEXT extends Struct<VkGeneratedCommandsPipelineInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINE = layout.offsetof(2);
    }

    protected VkGeneratedCommandsPipelineInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGeneratedCommandsPipelineInfoEXT create(long address, ByteBuffer container) {
        return new VkGeneratedCommandsPipelineInfoEXT(address, container);
    }

    public VkGeneratedCommandsPipelineInfoEXT(ByteBuffer container) {
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

    @NativeType("VkPipeline")
    public long pipeline() {
        return npipeline(address());
    }

    public VkGeneratedCommandsPipelineInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGeneratedCommandsPipelineInfoEXT sType$Default() {
        return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT);
    }

    public VkGeneratedCommandsPipelineInfoEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGeneratedCommandsPipelineInfoEXT pipeline(@NativeType("VkPipeline") long value) {
        npipeline(address(), value);
        return this;
    }

    public VkGeneratedCommandsPipelineInfoEXT set(int sType, long pNext, long pipeline) {
        sType(sType);
        pNext(pNext);
        pipeline(pipeline);
        return this;
    }

    public VkGeneratedCommandsPipelineInfoEXT set(VkGeneratedCommandsPipelineInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGeneratedCommandsPipelineInfoEXT malloc() {
        return new VkGeneratedCommandsPipelineInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGeneratedCommandsPipelineInfoEXT calloc() {
        return new VkGeneratedCommandsPipelineInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGeneratedCommandsPipelineInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsPipelineInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkGeneratedCommandsPipelineInfoEXT create(long address) {
        return new VkGeneratedCommandsPipelineInfoEXT(address, null);
    }

    public static VkGeneratedCommandsPipelineInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGeneratedCommandsPipelineInfoEXT(address, null);
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

    public static VkGeneratedCommandsPipelineInfoEXT malloc(MemoryStack stack) {
        return new VkGeneratedCommandsPipelineInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGeneratedCommandsPipelineInfoEXT calloc(MemoryStack stack) {
        return new VkGeneratedCommandsPipelineInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npipeline(long struct) {
        return MemoryUtil.memGetLong(struct + PIPELINE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npipeline(long struct, long value) {
        MemoryUtil.memPutLong(struct + PIPELINE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsPipelineInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsPipelineInfoEXT, Buffer> implements NativeResource {
        private static final VkGeneratedCommandsPipelineInfoEXT ELEMENT_FACTORY = VkGeneratedCommandsPipelineInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGeneratedCommandsPipelineInfoEXT.SIZEOF);
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
        public VkGeneratedCommandsPipelineInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGeneratedCommandsPipelineInfoEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkGeneratedCommandsPipelineInfoEXT.npNext(address());
        }

        @NativeType("VkPipeline")
        public long pipeline() {
            return VkGeneratedCommandsPipelineInfoEXT.npipeline(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGeneratedCommandsPipelineInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkGeneratedCommandsPipelineInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pipeline(@NativeType("VkPipeline") long value) {
            VkGeneratedCommandsPipelineInfoEXT.npipeline(address(), value);
            return this;
        }
    }
}
