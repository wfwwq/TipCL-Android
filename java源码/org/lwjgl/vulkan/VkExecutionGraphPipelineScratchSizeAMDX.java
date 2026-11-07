package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExecutionGraphPipelineScratchSizeAMDX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExecutionGraphPipelineScratchSizeAMDX.class */
public class VkExecutionGraphPipelineScratchSizeAMDX extends Struct<VkExecutionGraphPipelineScratchSizeAMDX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MINSIZE;
    public static final int MAXSIZE;
    public static final int SIZEGRANULARITY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINSIZE = layout.offsetof(2);
        MAXSIZE = layout.offsetof(3);
        SIZEGRANULARITY = layout.offsetof(4);
    }

    protected VkExecutionGraphPipelineScratchSizeAMDX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExecutionGraphPipelineScratchSizeAMDX create(long address, ByteBuffer container) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(address, container);
    }

    public VkExecutionGraphPipelineScratchSizeAMDX(ByteBuffer container) {
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

    @NativeType("VkDeviceSize")
    public long minSize() {
        return nminSize(address());
    }

    @NativeType("VkDeviceSize")
    public long maxSize() {
        return nmaxSize(address());
    }

    @NativeType("VkDeviceSize")
    public long sizeGranularity() {
        return nsizeGranularity(address());
    }

    public VkExecutionGraphPipelineScratchSizeAMDX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineScratchSizeAMDX sType$Default() {
        return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX);
    }

    public VkExecutionGraphPipelineScratchSizeAMDX pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineScratchSizeAMDX minSize(@NativeType("VkDeviceSize") long value) {
        nminSize(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineScratchSizeAMDX maxSize(@NativeType("VkDeviceSize") long value) {
        nmaxSize(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineScratchSizeAMDX sizeGranularity(@NativeType("VkDeviceSize") long value) {
        nsizeGranularity(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineScratchSizeAMDX set(int sType, long pNext, long minSize, long maxSize, long sizeGranularity) {
        sType(sType);
        pNext(pNext);
        minSize(minSize);
        maxSize(maxSize);
        sizeGranularity(sizeGranularity);
        return this;
    }

    public VkExecutionGraphPipelineScratchSizeAMDX set(VkExecutionGraphPipelineScratchSizeAMDX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExecutionGraphPipelineScratchSizeAMDX malloc() {
        return new VkExecutionGraphPipelineScratchSizeAMDX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExecutionGraphPipelineScratchSizeAMDX calloc() {
        return new VkExecutionGraphPipelineScratchSizeAMDX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExecutionGraphPipelineScratchSizeAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExecutionGraphPipelineScratchSizeAMDX(MemoryUtil.memAddress(container), container);
    }

    public static VkExecutionGraphPipelineScratchSizeAMDX create(long address) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(address, null);
    }

    public static VkExecutionGraphPipelineScratchSizeAMDX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExecutionGraphPipelineScratchSizeAMDX(address, null);
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

    public static VkExecutionGraphPipelineScratchSizeAMDX malloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExecutionGraphPipelineScratchSizeAMDX calloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineScratchSizeAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nminSize(long struct) {
        return MemoryUtil.memGetLong(struct + MINSIZE);
    }

    public static long nmaxSize(long struct) {
        return MemoryUtil.memGetLong(struct + MAXSIZE);
    }

    public static long nsizeGranularity(long struct) {
        return MemoryUtil.memGetLong(struct + SIZEGRANULARITY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nminSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + MINSIZE, value);
    }

    public static void nmaxSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + MAXSIZE, value);
    }

    public static void nsizeGranularity(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZEGRANULARITY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExecutionGraphPipelineScratchSizeAMDX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExecutionGraphPipelineScratchSizeAMDX$Buffer.class */
    public static class Buffer extends StructBuffer<VkExecutionGraphPipelineScratchSizeAMDX, Buffer> implements NativeResource {
        private static final VkExecutionGraphPipelineScratchSizeAMDX ELEMENT_FACTORY = VkExecutionGraphPipelineScratchSizeAMDX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExecutionGraphPipelineScratchSizeAMDX.SIZEOF);
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
        public VkExecutionGraphPipelineScratchSizeAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExecutionGraphPipelineScratchSizeAMDX.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkExecutionGraphPipelineScratchSizeAMDX.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long minSize() {
            return VkExecutionGraphPipelineScratchSizeAMDX.nminSize(address());
        }

        @NativeType("VkDeviceSize")
        public long maxSize() {
            return VkExecutionGraphPipelineScratchSizeAMDX.nmaxSize(address());
        }

        @NativeType("VkDeviceSize")
        public long sizeGranularity() {
            return VkExecutionGraphPipelineScratchSizeAMDX.nsizeGranularity(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExecutionGraphPipelineScratchSizeAMDX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkExecutionGraphPipelineScratchSizeAMDX.npNext(address(), value);
            return this;
        }

        public Buffer minSize(@NativeType("VkDeviceSize") long value) {
            VkExecutionGraphPipelineScratchSizeAMDX.nminSize(address(), value);
            return this;
        }

        public Buffer maxSize(@NativeType("VkDeviceSize") long value) {
            VkExecutionGraphPipelineScratchSizeAMDX.nmaxSize(address(), value);
            return this;
        }

        public Buffer sizeGranularity(@NativeType("VkDeviceSize") long value) {
            VkExecutionGraphPipelineScratchSizeAMDX.nsizeGranularity(address(), value);
            return this;
        }
    }
}
