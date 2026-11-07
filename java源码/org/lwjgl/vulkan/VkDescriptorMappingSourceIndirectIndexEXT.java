package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceIndirectIndexEXT.class */
public class VkDescriptorMappingSourceIndirectIndexEXT extends Struct<VkDescriptorMappingSourceIndirectIndexEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEAPOFFSET;
    public static final int PUSHOFFSET;
    public static final int ADDRESSOFFSET;
    public static final int HEAPINDEXSTRIDE;
    public static final int HEAPARRAYSTRIDE;
    public static final int PEMBEDDEDSAMPLER;
    public static final int USECOMBINEDIMAGESAMPLERINDEX;
    public static final int SAMPLERHEAPOFFSET;
    public static final int SAMPLERPUSHOFFSET;
    public static final int SAMPLERADDRESSOFFSET;
    public static final int SAMPLERHEAPINDEXSTRIDE;
    public static final int SAMPLERHEAPARRAYSTRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEAPOFFSET = layout.offsetof(0);
        PUSHOFFSET = layout.offsetof(1);
        ADDRESSOFFSET = layout.offsetof(2);
        HEAPINDEXSTRIDE = layout.offsetof(3);
        HEAPARRAYSTRIDE = layout.offsetof(4);
        PEMBEDDEDSAMPLER = layout.offsetof(5);
        USECOMBINEDIMAGESAMPLERINDEX = layout.offsetof(6);
        SAMPLERHEAPOFFSET = layout.offsetof(7);
        SAMPLERPUSHOFFSET = layout.offsetof(8);
        SAMPLERADDRESSOFFSET = layout.offsetof(9);
        SAMPLERHEAPINDEXSTRIDE = layout.offsetof(10);
        SAMPLERHEAPARRAYSTRIDE = layout.offsetof(11);
    }

    protected VkDescriptorMappingSourceIndirectIndexEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorMappingSourceIndirectIndexEXT create(long address, ByteBuffer container) {
        return new VkDescriptorMappingSourceIndirectIndexEXT(address, container);
    }

    public VkDescriptorMappingSourceIndirectIndexEXT(ByteBuffer container) {
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
    public int addressOffset() {
        return naddressOffset(address());
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
    public int samplerAddressOffset() {
        return nsamplerAddressOffset(address());
    }

    @NativeType("uint32_t")
    public int samplerHeapIndexStride() {
        return nsamplerHeapIndexStride(address());
    }

    @NativeType("uint32_t")
    public int samplerHeapArrayStride() {
        return nsamplerHeapArrayStride(address());
    }

    public VkDescriptorMappingSourceIndirectIndexEXT heapOffset(@NativeType("uint32_t") int value) {
        nheapOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT pushOffset(@NativeType("uint32_t") int value) {
        npushOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT addressOffset(@NativeType("uint32_t") int value) {
        naddressOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT heapIndexStride(@NativeType("uint32_t") int value) {
        nheapIndexStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT heapArrayStride(@NativeType("uint32_t") int value) {
        nheapArrayStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT pEmbeddedSampler(@NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) {
        npEmbeddedSampler(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) {
        nuseCombinedImageSamplerIndex(address(), value ? 1 : 0);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT samplerHeapOffset(@NativeType("uint32_t") int value) {
        nsamplerHeapOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT samplerPushOffset(@NativeType("uint32_t") int value) {
        nsamplerPushOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT samplerAddressOffset(@NativeType("uint32_t") int value) {
        nsamplerAddressOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT samplerHeapIndexStride(@NativeType("uint32_t") int value) {
        nsamplerHeapIndexStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT samplerHeapArrayStride(@NativeType("uint32_t") int value) {
        nsamplerHeapArrayStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT set(int heapOffset, int pushOffset, int addressOffset, int heapIndexStride, int heapArrayStride, VkSamplerCreateInfo pEmbeddedSampler, boolean useCombinedImageSamplerIndex, int samplerHeapOffset, int samplerPushOffset, int samplerAddressOffset, int samplerHeapIndexStride, int samplerHeapArrayStride) {
        heapOffset(heapOffset);
        pushOffset(pushOffset);
        addressOffset(addressOffset);
        heapIndexStride(heapIndexStride);
        heapArrayStride(heapArrayStride);
        pEmbeddedSampler(pEmbeddedSampler);
        useCombinedImageSamplerIndex(useCombinedImageSamplerIndex);
        samplerHeapOffset(samplerHeapOffset);
        samplerPushOffset(samplerPushOffset);
        samplerAddressOffset(samplerAddressOffset);
        samplerHeapIndexStride(samplerHeapIndexStride);
        samplerHeapArrayStride(samplerHeapArrayStride);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexEXT set(VkDescriptorMappingSourceIndirectIndexEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorMappingSourceIndirectIndexEXT malloc() {
        return new VkDescriptorMappingSourceIndirectIndexEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorMappingSourceIndirectIndexEXT calloc() {
        return new VkDescriptorMappingSourceIndirectIndexEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceIndirectIndexEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceIndirectIndexEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorMappingSourceIndirectIndexEXT create(long address) {
        return new VkDescriptorMappingSourceIndirectIndexEXT(address, null);
    }

    public static VkDescriptorMappingSourceIndirectIndexEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorMappingSourceIndirectIndexEXT(address, null);
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

    public static VkDescriptorMappingSourceIndirectIndexEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectIndexEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceIndirectIndexEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectIndexEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int naddressOffset(long struct) {
        return MemoryUtil.memGetInt(struct + ADDRESSOFFSET);
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

    public static int nsamplerAddressOffset(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERADDRESSOFFSET);
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

    public static void naddressOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADDRESSOFFSET, value);
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

    public static void nsamplerAddressOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERADDRESSOFFSET, value);
    }

    public static void nsamplerHeapIndexStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERHEAPINDEXSTRIDE, value);
    }

    public static void nsamplerHeapArrayStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERHEAPARRAYSTRIDE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceIndirectIndexEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceIndirectIndexEXT, Buffer> implements NativeResource {
        private static final VkDescriptorMappingSourceIndirectIndexEXT ELEMENT_FACTORY = VkDescriptorMappingSourceIndirectIndexEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF);
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
        public VkDescriptorMappingSourceIndirectIndexEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int heapOffset() {
            return VkDescriptorMappingSourceIndirectIndexEXT.nheapOffset(address());
        }

        @NativeType("uint32_t")
        public int pushOffset() {
            return VkDescriptorMappingSourceIndirectIndexEXT.npushOffset(address());
        }

        @NativeType("uint32_t")
        public int addressOffset() {
            return VkDescriptorMappingSourceIndirectIndexEXT.naddressOffset(address());
        }

        @NativeType("uint32_t")
        public int heapIndexStride() {
            return VkDescriptorMappingSourceIndirectIndexEXT.nheapIndexStride(address());
        }

        @NativeType("uint32_t")
        public int heapArrayStride() {
            return VkDescriptorMappingSourceIndirectIndexEXT.nheapArrayStride(address());
        }

        @NativeType("VkSamplerCreateInfo const *")
        public VkSamplerCreateInfo pEmbeddedSampler() {
            return VkDescriptorMappingSourceIndirectIndexEXT.npEmbeddedSampler(address());
        }

        @NativeType("VkBool32")
        public boolean useCombinedImageSamplerIndex() {
            return VkDescriptorMappingSourceIndirectIndexEXT.nuseCombinedImageSamplerIndex(address()) != 0;
        }

        @NativeType("uint32_t")
        public int samplerHeapOffset() {
            return VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapOffset(address());
        }

        @NativeType("uint32_t")
        public int samplerPushOffset() {
            return VkDescriptorMappingSourceIndirectIndexEXT.nsamplerPushOffset(address());
        }

        @NativeType("uint32_t")
        public int samplerAddressOffset() {
            return VkDescriptorMappingSourceIndirectIndexEXT.nsamplerAddressOffset(address());
        }

        @NativeType("uint32_t")
        public int samplerHeapIndexStride() {
            return VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapIndexStride(address());
        }

        @NativeType("uint32_t")
        public int samplerHeapArrayStride() {
            return VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapArrayStride(address());
        }

        public Buffer heapOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexEXT.nheapOffset(address(), value);
            return this;
        }

        public Buffer pushOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexEXT.npushOffset(address(), value);
            return this;
        }

        public Buffer addressOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexEXT.naddressOffset(address(), value);
            return this;
        }

        public Buffer heapIndexStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexEXT.nheapIndexStride(address(), value);
            return this;
        }

        public Buffer heapArrayStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexEXT.nheapArrayStride(address(), value);
            return this;
        }

        public Buffer pEmbeddedSampler(@NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) {
            VkDescriptorMappingSourceIndirectIndexEXT.npEmbeddedSampler(address(), value);
            return this;
        }

        public Buffer useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) {
            VkDescriptorMappingSourceIndirectIndexEXT.nuseCombinedImageSamplerIndex(address(), value ? 1 : 0);
            return this;
        }

        public Buffer samplerHeapOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapOffset(address(), value);
            return this;
        }

        public Buffer samplerPushOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexEXT.nsamplerPushOffset(address(), value);
            return this;
        }

        public Buffer samplerAddressOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexEXT.nsamplerAddressOffset(address(), value);
            return this;
        }

        public Buffer samplerHeapIndexStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapIndexStride(address(), value);
            return this;
        }

        public Buffer samplerHeapArrayStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapArrayStride(address(), value);
            return this;
        }
    }
}
