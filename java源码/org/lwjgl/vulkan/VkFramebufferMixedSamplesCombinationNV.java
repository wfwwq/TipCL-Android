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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferMixedSamplesCombinationNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferMixedSamplesCombinationNV.class */
public class VkFramebufferMixedSamplesCombinationNV extends Struct<VkFramebufferMixedSamplesCombinationNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COVERAGEREDUCTIONMODE;
    public static final int RASTERIZATIONSAMPLES;
    public static final int DEPTHSTENCILSAMPLES;
    public static final int COLORSAMPLES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COVERAGEREDUCTIONMODE = layout.offsetof(2);
        RASTERIZATIONSAMPLES = layout.offsetof(3);
        DEPTHSTENCILSAMPLES = layout.offsetof(4);
        COLORSAMPLES = layout.offsetof(5);
    }

    protected VkFramebufferMixedSamplesCombinationNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkFramebufferMixedSamplesCombinationNV create(long address, ByteBuffer container) {
        return new VkFramebufferMixedSamplesCombinationNV(address, container);
    }

    public VkFramebufferMixedSamplesCombinationNV(ByteBuffer container) {
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

    @NativeType("VkCoverageReductionModeNV")
    public int coverageReductionMode() {
        return ncoverageReductionMode(address());
    }

    @NativeType("VkSampleCountFlagBits")
    public int rasterizationSamples() {
        return nrasterizationSamples(address());
    }

    @NativeType("VkSampleCountFlags")
    public int depthStencilSamples() {
        return ndepthStencilSamples(address());
    }

    @NativeType("VkSampleCountFlags")
    public int colorSamples() {
        return ncolorSamples(address());
    }

    public VkFramebufferMixedSamplesCombinationNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkFramebufferMixedSamplesCombinationNV sType$Default() {
        return sType(NVCoverageReductionMode.VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV);
    }

    public VkFramebufferMixedSamplesCombinationNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkFramebufferMixedSamplesCombinationNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkFramebufferMixedSamplesCombinationNV set(VkFramebufferMixedSamplesCombinationNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkFramebufferMixedSamplesCombinationNV malloc() {
        return new VkFramebufferMixedSamplesCombinationNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFramebufferMixedSamplesCombinationNV calloc() {
        return new VkFramebufferMixedSamplesCombinationNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFramebufferMixedSamplesCombinationNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFramebufferMixedSamplesCombinationNV(MemoryUtil.memAddress(container), container);
    }

    public static VkFramebufferMixedSamplesCombinationNV create(long address) {
        return new VkFramebufferMixedSamplesCombinationNV(address, null);
    }

    public static VkFramebufferMixedSamplesCombinationNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFramebufferMixedSamplesCombinationNV(address, null);
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

    public static VkFramebufferMixedSamplesCombinationNV malloc(MemoryStack stack) {
        return new VkFramebufferMixedSamplesCombinationNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFramebufferMixedSamplesCombinationNV calloc(MemoryStack stack) {
        return new VkFramebufferMixedSamplesCombinationNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncoverageReductionMode(long struct) {
        return MemoryUtil.memGetInt(struct + COVERAGEREDUCTIONMODE);
    }

    public static int nrasterizationSamples(long struct) {
        return MemoryUtil.memGetInt(struct + RASTERIZATIONSAMPLES);
    }

    public static int ndepthStencilSamples(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHSTENCILSAMPLES);
    }

    public static int ncolorSamples(long struct) {
        return MemoryUtil.memGetInt(struct + COLORSAMPLES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferMixedSamplesCombinationNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferMixedSamplesCombinationNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkFramebufferMixedSamplesCombinationNV, Buffer> implements NativeResource {
        private static final VkFramebufferMixedSamplesCombinationNV ELEMENT_FACTORY = VkFramebufferMixedSamplesCombinationNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkFramebufferMixedSamplesCombinationNV.SIZEOF);
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
        public VkFramebufferMixedSamplesCombinationNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkFramebufferMixedSamplesCombinationNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkFramebufferMixedSamplesCombinationNV.npNext(address());
        }

        @NativeType("VkCoverageReductionModeNV")
        public int coverageReductionMode() {
            return VkFramebufferMixedSamplesCombinationNV.ncoverageReductionMode(address());
        }

        @NativeType("VkSampleCountFlagBits")
        public int rasterizationSamples() {
            return VkFramebufferMixedSamplesCombinationNV.nrasterizationSamples(address());
        }

        @NativeType("VkSampleCountFlags")
        public int depthStencilSamples() {
            return VkFramebufferMixedSamplesCombinationNV.ndepthStencilSamples(address());
        }

        @NativeType("VkSampleCountFlags")
        public int colorSamples() {
            return VkFramebufferMixedSamplesCombinationNV.ncolorSamples(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkFramebufferMixedSamplesCombinationNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVCoverageReductionMode.VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkFramebufferMixedSamplesCombinationNV.npNext(address(), value);
            return this;
        }
    }
}
