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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateStreamCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateStreamCreateInfoEXT.class */
public class VkPipelineRasterizationStateStreamCreateInfoEXT extends Struct<VkPipelineRasterizationStateStreamCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int RASTERIZATIONSTREAM;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RASTERIZATIONSTREAM = layout.offsetof(3);
    }

    protected VkPipelineRasterizationStateStreamCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineRasterizationStateStreamCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineRasterizationStateStreamCreateInfoEXT(address, container);
    }

    public VkPipelineRasterizationStateStreamCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkPipelineRasterizationStateStreamCreateFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int rasterizationStream() {
        return nrasterizationStream(address());
    }

    public VkPipelineRasterizationStateStreamCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateStreamCreateInfoEXT sType$Default() {
        return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT);
    }

    public VkPipelineRasterizationStateStreamCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateStreamCreateInfoEXT flags(@NativeType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateStreamCreateInfoEXT rasterizationStream(@NativeType("uint32_t") int value) {
        nrasterizationStream(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateStreamCreateInfoEXT set(int sType, long pNext, int flags, int rasterizationStream) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        rasterizationStream(rasterizationStream);
        return this;
    }

    public VkPipelineRasterizationStateStreamCreateInfoEXT set(VkPipelineRasterizationStateStreamCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRasterizationStateStreamCreateInfoEXT malloc() {
        return new VkPipelineRasterizationStateStreamCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRasterizationStateStreamCreateInfoEXT calloc() {
        return new VkPipelineRasterizationStateStreamCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRasterizationStateStreamCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationStateStreamCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRasterizationStateStreamCreateInfoEXT create(long address) {
        return new VkPipelineRasterizationStateStreamCreateInfoEXT(address, null);
    }

    public static VkPipelineRasterizationStateStreamCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRasterizationStateStreamCreateInfoEXT(address, null);
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

    public static VkPipelineRasterizationStateStreamCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineRasterizationStateStreamCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRasterizationStateStreamCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineRasterizationStateStreamCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nrasterizationStream(long struct) {
        return MemoryUtil.memGetInt(struct + RASTERIZATIONSTREAM);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nrasterizationStream(long struct, int value) {
        MemoryUtil.memPutInt(struct + RASTERIZATIONSTREAM, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateStreamCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateStreamCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationStateStreamCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkPipelineRasterizationStateStreamCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationStateStreamCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineRasterizationStateStreamCreateInfoEXT.SIZEOF);
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
        public VkPipelineRasterizationStateStreamCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineRasterizationStateStreamCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineRasterizationStateStreamCreateInfoEXT.npNext(address());
        }

        @NativeType("VkPipelineRasterizationStateStreamCreateFlagsEXT")
        public int flags() {
            return VkPipelineRasterizationStateStreamCreateInfoEXT.nflags(address());
        }

        @NativeType("uint32_t")
        public int rasterizationStream() {
            return VkPipelineRasterizationStateStreamCreateInfoEXT.nrasterizationStream(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRasterizationStateStreamCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRasterizationStateStreamCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int value) {
            VkPipelineRasterizationStateStreamCreateInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer rasterizationStream(@NativeType("uint32_t") int value) {
            VkPipelineRasterizationStateStreamCreateInfoEXT.nrasterizationStream(address(), value);
            return this;
        }
    }
}
