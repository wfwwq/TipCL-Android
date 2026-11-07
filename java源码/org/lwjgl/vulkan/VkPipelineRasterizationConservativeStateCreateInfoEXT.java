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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationConservativeStateCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationConservativeStateCreateInfoEXT.class */
public class VkPipelineRasterizationConservativeStateCreateInfoEXT extends Struct<VkPipelineRasterizationConservativeStateCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int CONSERVATIVERASTERIZATIONMODE;
    public static final int EXTRAPRIMITIVEOVERESTIMATIONSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        CONSERVATIVERASTERIZATIONMODE = layout.offsetof(3);
        EXTRAPRIMITIVEOVERESTIMATIONSIZE = layout.offsetof(4);
    }

    protected VkPipelineRasterizationConservativeStateCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineRasterizationConservativeStateCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineRasterizationConservativeStateCreateInfoEXT(address, container);
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkPipelineRasterizationConservativeStateCreateFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkConservativeRasterizationModeEXT")
    public int conservativeRasterizationMode() {
        return nconservativeRasterizationMode(address());
    }

    public float extraPrimitiveOverestimationSize() {
        return nextraPrimitiveOverestimationSize(address());
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT sType$Default() {
        return sType(EXTConservativeRasterization.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT);
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT flags(@NativeType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT conservativeRasterizationMode(@NativeType("VkConservativeRasterizationModeEXT") int value) {
        nconservativeRasterizationMode(address(), value);
        return this;
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT extraPrimitiveOverestimationSize(float value) {
        nextraPrimitiveOverestimationSize(address(), value);
        return this;
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT set(int sType, long pNext, int flags, int conservativeRasterizationMode, float extraPrimitiveOverestimationSize) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        conservativeRasterizationMode(conservativeRasterizationMode);
        extraPrimitiveOverestimationSize(extraPrimitiveOverestimationSize);
        return this;
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT set(VkPipelineRasterizationConservativeStateCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRasterizationConservativeStateCreateInfoEXT malloc() {
        return new VkPipelineRasterizationConservativeStateCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRasterizationConservativeStateCreateInfoEXT calloc() {
        return new VkPipelineRasterizationConservativeStateCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRasterizationConservativeStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationConservativeStateCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRasterizationConservativeStateCreateInfoEXT create(long address) {
        return new VkPipelineRasterizationConservativeStateCreateInfoEXT(address, null);
    }

    public static VkPipelineRasterizationConservativeStateCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRasterizationConservativeStateCreateInfoEXT(address, null);
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

    public static VkPipelineRasterizationConservativeStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineRasterizationConservativeStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRasterizationConservativeStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineRasterizationConservativeStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nconservativeRasterizationMode(long struct) {
        return MemoryUtil.memGetInt(struct + CONSERVATIVERASTERIZATIONMODE);
    }

    public static float nextraPrimitiveOverestimationSize(long struct) {
        return MemoryUtil.memGetFloat(struct + EXTRAPRIMITIVEOVERESTIMATIONSIZE);
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

    public static void nconservativeRasterizationMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONSERVATIVERASTERIZATIONMODE, value);
    }

    public static void nextraPrimitiveOverestimationSize(long struct, float value) {
        MemoryUtil.memPutFloat(struct + EXTRAPRIMITIVEOVERESTIMATIONSIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationConservativeStateCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationConservativeStateCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationConservativeStateCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkPipelineRasterizationConservativeStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationConservativeStateCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineRasterizationConservativeStateCreateInfoEXT.SIZEOF);
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
        public VkPipelineRasterizationConservativeStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineRasterizationConservativeStateCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineRasterizationConservativeStateCreateInfoEXT.npNext(address());
        }

        @NativeType("VkPipelineRasterizationConservativeStateCreateFlagsEXT")
        public int flags() {
            return VkPipelineRasterizationConservativeStateCreateInfoEXT.nflags(address());
        }

        @NativeType("VkConservativeRasterizationModeEXT")
        public int conservativeRasterizationMode() {
            return VkPipelineRasterizationConservativeStateCreateInfoEXT.nconservativeRasterizationMode(address());
        }

        public float extraPrimitiveOverestimationSize() {
            return VkPipelineRasterizationConservativeStateCreateInfoEXT.nextraPrimitiveOverestimationSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRasterizationConservativeStateCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTConservativeRasterization.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRasterizationConservativeStateCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int value) {
            VkPipelineRasterizationConservativeStateCreateInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer conservativeRasterizationMode(@NativeType("VkConservativeRasterizationModeEXT") int value) {
            VkPipelineRasterizationConservativeStateCreateInfoEXT.nconservativeRasterizationMode(address(), value);
            return this;
        }

        public Buffer extraPrimitiveOverestimationSize(float value) {
            VkPipelineRasterizationConservativeStateCreateInfoEXT.nextraPrimitiveOverestimationSize(address(), value);
            return this;
        }
    }
}
