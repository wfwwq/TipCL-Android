package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourcePushIndexEXT.class */
public class VkDescriptorMappingSourcePushIndexEXT extends Struct<VkDescriptorMappingSourcePushIndexEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEAPOFFSET;
    public static final int PUSHOFFSET;
    public static final int HEAPINDEXSTRIDE;
    public static final int HEAPARRAYSTRIDE;
    public static final int PEMBEDDEDSAMPLER;
    public static final int USECOMBINEDIMAGESAMPLERINDEX;
    public static final int SAMPLERHEAPOFFSET;
    public static final int SAMPLERPUSHOFFSET;
    public static final int SAMPLERHEAPINDEXSTRIDE;
    public static final int SAMPLERHEAPARRAYSTRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEAPOFFSET = layout.offsetof(0);
        PUSHOFFSET = layout.offsetof(1);
        HEAPINDEXSTRIDE = layout.offsetof(2);
        HEAPARRAYSTRIDE = layout.offsetof(3);
        PEMBEDDEDSAMPLER = layout.offsetof(4);
        USECOMBINEDIMAGESAMPLERINDEX = layout.offsetof(5);
        SAMPLERHEAPOFFSET = layout.offsetof(6);
        SAMPLERPUSHOFFSET = layout.offsetof(7);
        SAMPLERHEAPINDEXSTRIDE = layout.offsetof(8);
        SAMPLERHEAPARRAYSTRIDE = layout.offsetof(9);
    }

    protected VkDescriptorMappingSourcePushIndexEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorMappingSourcePushIndexEXT create(long address, ByteBuffer container) {
        return new VkDescriptorMappingSourcePushIndexEXT(address, container);
    }

    public VkDescriptorMappingSourcePushIndexEXT(ByteBuffer container) {
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
    public int pushOffset() {
        return npushOffset(address());
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
    public int samplerPushOffset() {
        return nsamplerPushOffset(address());
    }

    @NativeType("uint32_t")
    public int samplerHeapIndexStride() {
        return nsamplerHeapIndexStride(address());
    }

    @NativeType("uint32_t")
    public int samplerHeapArrayStride() {
        return nsamplerHeapArrayStride(address());
    }

    public VkDescriptorMappingSourcePushIndexEXT heapOffset(@NativeType("uint32_t") int value) {
        nheapOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourcePushIndexEXT pushOffset(@NativeType("uint32_t") int value) {
        npushOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourcePushIndexEXT heapIndexStride(@NativeType("uint32_t") int value) {
        nheapIndexStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourcePushIndexEXT heapArrayStride(@NativeType("uint32_t") int value) {
        nheapArrayStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourcePushIndexEXT pEmbeddedSampler(@NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) {
        npEmbeddedSampler(address(), value);
        return this;
    }

    public VkDescriptorMappingSourcePushIndexEXT useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) {
        nuseCombinedImageSamplerIndex(address(), value ? 1 : 0);
        return this;
    }

    public VkDescriptorMappingSourcePushIndexEXT samplerHeapOffset(@NativeType("uint32_t") int value) {
        nsamplerHeapOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourcePushIndexEXT samplerPushOffset(@NativeType("uint32_t") int value) {
        nsamplerPushOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourcePushIndexEXT samplerHeapIndexStride(@NativeType("uint32_t") int value) {
        nsamplerHeapIndexStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourcePushIndexEXT samplerHeapArrayStride(@NativeType("uint32_t") int value) {
        nsamplerHeapArrayStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourcePushIndexEXT set(int heapOffset, int pushOffset, int heapIndexStride, int heapArrayStride, VkSamplerCreateInfo pEmbeddedSampler, boolean useCombinedImageSamplerIndex, int samplerHeapOffset, int samplerPushOffset, int samplerHeapIndexStride, int samplerHeapArrayStride) {
        heapOffset(heapOffset);
        pushOffset(pushOffset);
        heapIndexStride(heapIndexStride);
        heapArrayStride(heapArrayStride);
        pEmbeddedSampler(pEmbeddedSampler);
        useCombinedImageSamplerIndex(useCombinedImageSamplerIndex);
        samplerHeapOffset(samplerHeapOffset);
        samplerPushOffset(samplerPushOffset);
        samplerHeapIndexStride(samplerHeapIndexStride);
        samplerHeapArrayStride(samplerHeapArrayStride);
        return this;
    }

    public VkDescriptorMappingSourcePushIndexEXT set(VkDescriptorMappingSourcePushIndexEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorMappingSourcePushIndexEXT malloc() {
        return new VkDescriptorMappingSourcePushIndexEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorMappingSourcePushIndexEXT calloc() {
        return new VkDescriptorMappingSourcePushIndexEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorMappingSourcePushIndexEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourcePushIndexEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorMappingSourcePushIndexEXT create(long address) {
        return new VkDescriptorMappingSourcePushIndexEXT(address, null);
    }

    public static VkDescriptorMappingSourcePushIndexEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorMappingSourcePushIndexEXT(address, null);
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

    public static VkDescriptorMappingSourcePushIndexEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourcePushIndexEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorMappingSourcePushIndexEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourcePushIndexEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npushOffset(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHOFFSET);
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

    public static int nsamplerPushOffset(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERPUSHOFFSET);
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

    public static void npushOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHOFFSET, value);
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

    public static void nsamplerPushOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERPUSHOFFSET, value);
    }

    public static void nsamplerHeapIndexStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERHEAPINDEXSTRIDE, value);
    }

    public static void nsamplerHeapArrayStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERHEAPARRAYSTRIDE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourcePushIndexEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourcePushIndexEXT, Buffer> implements NativeResource {
        private static final VkDescriptorMappingSourcePushIndexEXT ELEMENT_FACTORY = VkDescriptorMappingSourcePushIndexEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorMappingSourcePushIndexEXT.SIZEOF);
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
        public VkDescriptorMappingSourcePushIndexEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int heapOffset() {
            return VkDescriptorMappingSourcePushIndexEXT.nheapOffset(address());
        }

        @NativeType("uint32_t")
        public int pushOffset() {
            return VkDescriptorMappingSourcePushIndexEXT.npushOffset(address());
        }

        @NativeType("uint32_t")
        public int heapIndexStride() {
            return VkDescriptorMappingSourcePushIndexEXT.nheapIndexStride(address());
        }

        @NativeType("uint32_t")
        public int heapArrayStride() {
            return VkDescriptorMappingSourcePushIndexEXT.nheapArrayStride(address());
        }

        @NativeType("VkSamplerCreateInfo const *")
        public VkSamplerCreateInfo pEmbeddedSampler() {
            return VkDescriptorMappingSourcePushIndexEXT.npEmbeddedSampler(address());
        }

        @NativeType("VkBool32")
        public boolean useCombinedImageSamplerIndex() {
            return VkDescriptorMappingSourcePushIndexEXT.nuseCombinedImageSamplerIndex(address()) != 0;
        }

        @NativeType("uint32_t")
        public int samplerHeapOffset() {
            return VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapOffset(address());
        }

        @NativeType("uint32_t")
        public int samplerPushOffset() {
            return VkDescriptorMappingSourcePushIndexEXT.nsamplerPushOffset(address());
        }

        @NativeType("uint32_t")
        public int samplerHeapIndexStride() {
            return VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapIndexStride(address());
        }

        @NativeType("uint32_t")
        public int samplerHeapArrayStride() {
            return VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapArrayStride(address());
        }

        public Buffer heapOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourcePushIndexEXT.nheapOffset(address(), value);
            return this;
        }

        public Buffer pushOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourcePushIndexEXT.npushOffset(address(), value);
            return this;
        }

        public Buffer heapIndexStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourcePushIndexEXT.nheapIndexStride(address(), value);
            return this;
        }

        public Buffer heapArrayStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourcePushIndexEXT.nheapArrayStride(address(), value);
            return this;
        }

        public Buffer pEmbeddedSampler(@NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) {
            VkDescriptorMappingSourcePushIndexEXT.npEmbeddedSampler(address(), value);
            return this;
        }

        public Buffer useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) {
            VkDescriptorMappingSourcePushIndexEXT.nuseCombinedImageSamplerIndex(address(), value ? 1 : 0);
            return this;
        }

        public Buffer samplerHeapOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapOffset(address(), value);
            return this;
        }

        public Buffer samplerPushOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourcePushIndexEXT.nsamplerPushOffset(address(), value);
            return this;
        }

        public Buffer samplerHeapIndexStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapIndexStride(address(), value);
            return this;
        }

        public Buffer samplerHeapArrayStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapArrayStride(address(), value);
            return this;
        }
    }
}
