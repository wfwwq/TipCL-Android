package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceShaderRecordIndexEXT.class */
public class VkDescriptorMappingSourceShaderRecordIndexEXT extends Struct<VkDescriptorMappingSourceShaderRecordIndexEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEAPOFFSET;
    public static final int SHADERRECORDOFFSET;
    public static final int HEAPINDEXSTRIDE;
    public static final int HEAPARRAYSTRIDE;
    public static final int PEMBEDDEDSAMPLER;
    public static final int USECOMBINEDIMAGESAMPLERINDEX;
    public static final int SAMPLERHEAPOFFSET;
    public static final int SAMPLERSHADERRECORDOFFSET;
    public static final int SAMPLERHEAPINDEXSTRIDE;
    public static final int SAMPLERHEAPARRAYSTRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEAPOFFSET = layout.offsetof(0);
        SHADERRECORDOFFSET = layout.offsetof(1);
        HEAPINDEXSTRIDE = layout.offsetof(2);
        HEAPARRAYSTRIDE = layout.offsetof(3);
        PEMBEDDEDSAMPLER = layout.offsetof(4);
        USECOMBINEDIMAGESAMPLERINDEX = layout.offsetof(5);
        SAMPLERHEAPOFFSET = layout.offsetof(6);
        SAMPLERSHADERRECORDOFFSET = layout.offsetof(7);
        SAMPLERHEAPINDEXSTRIDE = layout.offsetof(8);
        SAMPLERHEAPARRAYSTRIDE = layout.offsetof(9);
    }

    protected VkDescriptorMappingSourceShaderRecordIndexEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorMappingSourceShaderRecordIndexEXT create(long address, ByteBuffer container) {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(address, container);
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int heapOffset() {
        return nheapOffset(address());
    }

    @NativeType("uint32_t")
    public int shaderRecordOffset() {
        return nshaderRecordOffset(address());
    }

    @NativeType("uint32_t")
    public int heapIndexStride() {
        return nheapIndexStride(address());
    }

    @NativeType("uint32_t")
    public int heapArrayStride() {
        return nheapArrayStride(address());
    }

    @NativeType("VkSamplerCreateInfo const *")
    public VkSamplerCreateInfo pEmbeddedSampler() {
        return npEmbeddedSampler(address());
    }

    @NativeType("VkBool32")
    public boolean useCombinedImageSamplerIndex() {
        return nuseCombinedImageSamplerIndex(address()) != 0;
    }

    @NativeType("uint32_t")
    public int samplerHeapOffset() {
        return nsamplerHeapOffset(address());
    }

    @NativeType("uint32_t")
    public int samplerShaderRecordOffset() {
        return nsamplerShaderRecordOffset(address());
    }

    @NativeType("uint32_t")
    public int samplerHeapIndexStride() {
        return nsamplerHeapIndexStride(address());
    }

    @NativeType("uint32_t")
    public int samplerHeapArrayStride() {
        return nsamplerHeapArrayStride(address());
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT heapOffset(@NativeType("uint32_t") int value) {
        nheapOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT shaderRecordOffset(@NativeType("uint32_t") int value) {
        nshaderRecordOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT heapIndexStride(@NativeType("uint32_t") int value) {
        nheapIndexStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT heapArrayStride(@NativeType("uint32_t") int value) {
        nheapArrayStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT pEmbeddedSampler(@NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) {
        npEmbeddedSampler(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) {
        nuseCombinedImageSamplerIndex(address(), value ? 1 : 0);
        return this;
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerHeapOffset(@NativeType("uint32_t") int value) {
        nsamplerHeapOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerShaderRecordOffset(@NativeType("uint32_t") int value) {
        nsamplerShaderRecordOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerHeapIndexStride(@NativeType("uint32_t") int value) {
        nsamplerHeapIndexStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerHeapArrayStride(@NativeType("uint32_t") int value) {
        nsamplerHeapArrayStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT set(int heapOffset, int shaderRecordOffset, int heapIndexStride, int heapArrayStride, VkSamplerCreateInfo pEmbeddedSampler, boolean useCombinedImageSamplerIndex, int samplerHeapOffset, int samplerShaderRecordOffset, int samplerHeapIndexStride, int samplerHeapArrayStride) {
        heapOffset(heapOffset);
        shaderRecordOffset(shaderRecordOffset);
        heapIndexStride(heapIndexStride);
        heapArrayStride(heapArrayStride);
        pEmbeddedSampler(pEmbeddedSampler);
        useCombinedImageSamplerIndex(useCombinedImageSamplerIndex);
        samplerHeapOffset(samplerHeapOffset);
        samplerShaderRecordOffset(samplerShaderRecordOffset);
        samplerHeapIndexStride(samplerHeapIndexStride);
        samplerHeapArrayStride(samplerHeapArrayStride);
        return this;
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT set(VkDescriptorMappingSourceShaderRecordIndexEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorMappingSourceShaderRecordIndexEXT malloc() {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorMappingSourceShaderRecordIndexEXT calloc() {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceShaderRecordIndexEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorMappingSourceShaderRecordIndexEXT create(long address) {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(address, null);
    }

    public static VkDescriptorMappingSourceShaderRecordIndexEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(address, null);
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

    public static VkDescriptorMappingSourceShaderRecordIndexEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceShaderRecordIndexEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceShaderRecordIndexEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nheapOffset(long struct) {
        return MemoryUtil.memGetInt(struct + HEAPOFFSET);
    }

    public static int nshaderRecordOffset(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERRECORDOFFSET);
    }

    public static int nheapIndexStride(long struct) {
        return MemoryUtil.memGetInt(struct + HEAPINDEXSTRIDE);
    }

    public static int nheapArrayStride(long struct) {
        return MemoryUtil.memGetInt(struct + HEAPARRAYSTRIDE);
    }

    public static VkSamplerCreateInfo npEmbeddedSampler(long struct) {
        return VkSamplerCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PEMBEDDEDSAMPLER));
    }

    public static int nuseCombinedImageSamplerIndex(long struct) {
        return MemoryUtil.memGetInt(struct + USECOMBINEDIMAGESAMPLERINDEX);
    }

    public static int nsamplerHeapOffset(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERHEAPOFFSET);
    }

    public static int nsamplerShaderRecordOffset(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERSHADERRECORDOFFSET);
    }

    public static int nsamplerHeapIndexStride(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERHEAPINDEXSTRIDE);
    }

    public static int nsamplerHeapArrayStride(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERHEAPARRAYSTRIDE);
    }

    public static void nheapOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEAPOFFSET, value);
    }

    public static void nshaderRecordOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERRECORDOFFSET, value);
    }

    public static void nheapIndexStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEAPINDEXSTRIDE, value);
    }

    public static void nheapArrayStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEAPARRAYSTRIDE, value);
    }

    public static void npEmbeddedSampler(long struct, VkSamplerCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PEMBEDDEDSAMPLER, MemoryUtil.memAddressSafe(value));
    }

    public static void nuseCombinedImageSamplerIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + USECOMBINEDIMAGESAMPLERINDEX, value);
    }

    public static void nsamplerHeapOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERHEAPOFFSET, value);
    }

    public static void nsamplerShaderRecordOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERSHADERRECORDOFFSET, value);
    }

    public static void nsamplerHeapIndexStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERHEAPINDEXSTRIDE, value);
    }

    public static void nsamplerHeapArrayStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERHEAPARRAYSTRIDE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceShaderRecordIndexEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceShaderRecordIndexEXT, Buffer> implements NativeResource {
        private static final VkDescriptorMappingSourceShaderRecordIndexEXT ELEMENT_FACTORY = VkDescriptorMappingSourceShaderRecordIndexEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorMappingSourceShaderRecordIndexEXT.SIZEOF);
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
        public VkDescriptorMappingSourceShaderRecordIndexEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int heapOffset() {
            return VkDescriptorMappingSourceShaderRecordIndexEXT.nheapOffset(address());
        }

        @NativeType("uint32_t")
        public int shaderRecordOffset() {
            return VkDescriptorMappingSourceShaderRecordIndexEXT.nshaderRecordOffset(address());
        }

        @NativeType("uint32_t")
        public int heapIndexStride() {
            return VkDescriptorMappingSourceShaderRecordIndexEXT.nheapIndexStride(address());
        }

        @NativeType("uint32_t")
        public int heapArrayStride() {
            return VkDescriptorMappingSourceShaderRecordIndexEXT.nheapArrayStride(address());
        }

        @NativeType("VkSamplerCreateInfo const *")
        public VkSamplerCreateInfo pEmbeddedSampler() {
            return VkDescriptorMappingSourceShaderRecordIndexEXT.npEmbeddedSampler(address());
        }

        @NativeType("VkBool32")
        public boolean useCombinedImageSamplerIndex() {
            return VkDescriptorMappingSourceShaderRecordIndexEXT.nuseCombinedImageSamplerIndex(address()) != 0;
        }

        @NativeType("uint32_t")
        public int samplerHeapOffset() {
            return VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapOffset(address());
        }

        @NativeType("uint32_t")
        public int samplerShaderRecordOffset() {
            return VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerShaderRecordOffset(address());
        }

        @NativeType("uint32_t")
        public int samplerHeapIndexStride() {
            return VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapIndexStride(address());
        }

        @NativeType("uint32_t")
        public int samplerHeapArrayStride() {
            return VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapArrayStride(address());
        }

        public Buffer heapOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceShaderRecordIndexEXT.nheapOffset(address(), value);
            return this;
        }

        public Buffer shaderRecordOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceShaderRecordIndexEXT.nshaderRecordOffset(address(), value);
            return this;
        }

        public Buffer heapIndexStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceShaderRecordIndexEXT.nheapIndexStride(address(), value);
            return this;
        }

        public Buffer heapArrayStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceShaderRecordIndexEXT.nheapArrayStride(address(), value);
            return this;
        }

        public Buffer pEmbeddedSampler(@NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) {
            VkDescriptorMappingSourceShaderRecordIndexEXT.npEmbeddedSampler(address(), value);
            return this;
        }

        public Buffer useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) {
            VkDescriptorMappingSourceShaderRecordIndexEXT.nuseCombinedImageSamplerIndex(address(), value ? 1 : 0);
            return this;
        }

        public Buffer samplerHeapOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapOffset(address(), value);
            return this;
        }

        public Buffer samplerShaderRecordOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerShaderRecordOffset(address(), value);
            return this;
        }

        public Buffer samplerHeapIndexStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapIndexStride(address(), value);
            return this;
        }

        public Buffer samplerHeapArrayStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceShaderRecordIndexEXT.nsamplerHeapArrayStride(address(), value);
            return this;
        }
    }
}
