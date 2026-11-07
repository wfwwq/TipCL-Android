package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReleaseCapturedPipelineDataInfoKHR.class */
public class VkReleaseCapturedPipelineDataInfoKHR extends Struct<VkReleaseCapturedPipelineDataInfoKHR> implements NativeResource {
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

    protected VkReleaseCapturedPipelineDataInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkReleaseCapturedPipelineDataInfoKHR create(long address, ByteBuffer container) {
        return new VkReleaseCapturedPipelineDataInfoKHR(address, container);
    }

    public VkReleaseCapturedPipelineDataInfoKHR(ByteBuffer container) {
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

    public VkReleaseCapturedPipelineDataInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkReleaseCapturedPipelineDataInfoKHR sType$Default() {
        return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR);
    }

    public VkReleaseCapturedPipelineDataInfoKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkReleaseCapturedPipelineDataInfoKHR pipeline(@NativeType("VkPipeline") long value) {
        npipeline(address(), value);
        return this;
    }

    public VkReleaseCapturedPipelineDataInfoKHR set(int sType, long pNext, long pipeline) {
        sType(sType);
        pNext(pNext);
        pipeline(pipeline);
        return this;
    }

    public VkReleaseCapturedPipelineDataInfoKHR set(VkReleaseCapturedPipelineDataInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkReleaseCapturedPipelineDataInfoKHR malloc() {
        return new VkReleaseCapturedPipelineDataInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkReleaseCapturedPipelineDataInfoKHR calloc() {
        return new VkReleaseCapturedPipelineDataInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkReleaseCapturedPipelineDataInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkReleaseCapturedPipelineDataInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkReleaseCapturedPipelineDataInfoKHR create(long address) {
        return new VkReleaseCapturedPipelineDataInfoKHR(address, null);
    }

    public static VkReleaseCapturedPipelineDataInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkReleaseCapturedPipelineDataInfoKHR(address, null);
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

    public static VkReleaseCapturedPipelineDataInfoKHR malloc(MemoryStack stack) {
        return new VkReleaseCapturedPipelineDataInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkReleaseCapturedPipelineDataInfoKHR calloc(MemoryStack stack) {
        return new VkReleaseCapturedPipelineDataInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReleaseCapturedPipelineDataInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkReleaseCapturedPipelineDataInfoKHR, Buffer> implements NativeResource {
        private static final VkReleaseCapturedPipelineDataInfoKHR ELEMENT_FACTORY = VkReleaseCapturedPipelineDataInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkReleaseCapturedPipelineDataInfoKHR.SIZEOF);
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
        public VkReleaseCapturedPipelineDataInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkReleaseCapturedPipelineDataInfoKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkReleaseCapturedPipelineDataInfoKHR.npNext(address());
        }

        @NativeType("VkPipeline")
        public long pipeline() {
            return VkReleaseCapturedPipelineDataInfoKHR.npipeline(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkReleaseCapturedPipelineDataInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkReleaseCapturedPipelineDataInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pipeline(@NativeType("VkPipeline") long value) {
            VkReleaseCapturedPipelineDataInfoKHR.npipeline(address(), value);
            return this;
        }
    }
}
