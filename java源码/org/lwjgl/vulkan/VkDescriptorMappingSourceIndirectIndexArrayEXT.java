package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceIndirectIndexArrayEXT.class */
public class VkDescriptorMappingSourceIndirectIndexArrayEXT extends Struct<VkDescriptorMappingSourceIndirectIndexArrayEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEAPOFFSET;
    public static final int PUSHOFFSET;
    public static final int ADDRESSOFFSET;
    public static final int HEAPINDEXSTRIDE;
    public static final int PEMBEDDEDSAMPLER;
    public static final int USECOMBINEDIMAGESAMPLERINDEX;
    public static final int SAMPLERHEAPOFFSET;
    public static final int SAMPLERPUSHOFFSET;
    public static final int SAMPLERADDRESSOFFSET;
    public static final int SAMPLERHEAPINDEXSTRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEAPOFFSET = layout.offsetof(0);
        PUSHOFFSET = layout.offsetof(1);
        ADDRESSOFFSET = layout.offsetof(2);
        HEAPINDEXSTRIDE = layout.offsetof(3);
        PEMBEDDEDSAMPLER = layout.offsetof(4);
        USECOMBINEDIMAGESAMPLERINDEX = layout.offsetof(5);
        SAMPLERHEAPOFFSET = layout.offsetof(6);
        SAMPLERPUSHOFFSET = layout.offsetof(7);
        SAMPLERADDRESSOFFSET = layout.offsetof(8);
        SAMPLERHEAPINDEXSTRIDE = layout.offsetof(9);
    }

    protected VkDescriptorMappingSourceIndirectIndexArrayEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorMappingSourceIndirectIndexArrayEXT create(long address, ByteBuffer container) {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(address, container);
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT(ByteBuffer container) {
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

    public VkDescriptorMappingSourceIndirectIndexArrayEXT heapOffset(@NativeType("uint32_t") int value) {
        nheapOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT pushOffset(@NativeType("uint32_t") int value) {
        npushOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT addressOffset(@NativeType("uint32_t") int value) {
        naddressOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT heapIndexStride(@NativeType("uint32_t") int value) {
        nheapIndexStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT pEmbeddedSampler(@NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) {
        npEmbeddedSampler(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) {
        nuseCombinedImageSamplerIndex(address(), value ? 1 : 0);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT samplerHeapOffset(@NativeType("uint32_t") int value) {
        nsamplerHeapOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT samplerPushOffset(@NativeType("uint32_t") int value) {
        nsamplerPushOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT samplerAddressOffset(@NativeType("uint32_t") int value) {
        nsamplerAddressOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT samplerHeapIndexStride(@NativeType("uint32_t") int value) {
        nsamplerHeapIndexStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT set(int heapOffset, int pushOffset, int addressOffset, int heapIndexStride, VkSamplerCreateInfo pEmbeddedSampler, boolean useCombinedImageSamplerIndex, int samplerHeapOffset, int samplerPushOffset, int samplerAddressOffset, int samplerHeapIndexStride) {
        heapOffset(heapOffset);
        pushOffset(pushOffset);
        addressOffset(addressOffset);
        heapIndexStride(heapIndexStride);
        pEmbeddedSampler(pEmbeddedSampler);
        useCombinedImageSamplerIndex(useCombinedImageSamplerIndex);
        samplerHeapOffset(samplerHeapOffset);
        samplerPushOffset(samplerPushOffset);
        samplerAddressOffset(samplerAddressOffset);
        samplerHeapIndexStride(samplerHeapIndexStride);
        return this;
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT set(VkDescriptorMappingSourceIndirectIndexArrayEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorMappingSourceIndirectIndexArrayEXT malloc() {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorMappingSourceIndirectIndexArrayEXT calloc() {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceIndirectIndexArrayEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorMappingSourceIndirectIndexArrayEXT create(long address) {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(address, null);
    }

    public static VkDescriptorMappingSourceIndirectIndexArrayEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(address, null);
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

    public static VkDescriptorMappingSourceIndirectIndexArrayEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceIndirectIndexArrayEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectIndexArrayEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceIndirectIndexArrayEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceIndirectIndexArrayEXT, Buffer> implements NativeResource {
        private static final VkDescriptorMappingSourceIndirectIndexArrayEXT ELEMENT_FACTORY = VkDescriptorMappingSourceIndirectIndexArrayEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorMappingSourceIndirectIndexArrayEXT.SIZEOF);
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
        public VkDescriptorMappingSourceIndirectIndexArrayEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int heapOffset() {
            return VkDescriptorMappingSourceIndirectIndexArrayEXT.nheapOffset(address());
        }

        @NativeType("uint32_t")
        public int pushOffset() {
            return VkDescriptorMappingSourceIndirectIndexArrayEXT.npushOffset(address());
        }

        @NativeType("uint32_t")
        public int addressOffset() {
            return VkDescriptorMappingSourceIndirectIndexArrayEXT.naddressOffset(address());
        }

        @NativeType("uint32_t")
        public int heapIndexStride() {
            return VkDescriptorMappingSourceIndirectIndexArrayEXT.nheapIndexStride(address());
        }

        @NativeType("VkSamplerCreateInfo const *")
        public VkSamplerCreateInfo pEmbeddedSampler() {
            return VkDescriptorMappingSourceIndirectIndexArrayEXT.npEmbeddedSampler(address());
        }

        @NativeType("VkBool32")
        public boolean useCombinedImageSamplerIndex() {
            return VkDescriptorMappingSourceIndirectIndexArrayEXT.nuseCombinedImageSamplerIndex(address()) != 0;
        }

        @NativeType("uint32_t")
        public int samplerHeapOffset() {
            return VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerHeapOffset(address());
        }

        @NativeType("uint32_t")
        public int samplerPushOffset() {
            return VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerPushOffset(address());
        }

        @NativeType("uint32_t")
        public int samplerAddressOffset() {
            return VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerAddressOffset(address());
        }

        @NativeType("uint32_t")
        public int samplerHeapIndexStride() {
            return VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerHeapIndexStride(address());
        }

        public Buffer heapOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexArrayEXT.nheapOffset(address(), value);
            return this;
        }

        public Buffer pushOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexArrayEXT.npushOffset(address(), value);
            return this;
        }

        public Buffer addressOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexArrayEXT.naddressOffset(address(), value);
            return this;
        }

        public Buffer heapIndexStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexArrayEXT.nheapIndexStride(address(), value);
            return this;
        }

        public Buffer pEmbeddedSampler(@NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) {
            VkDescriptorMappingSourceIndirectIndexArrayEXT.npEmbeddedSampler(address(), value);
            return this;
        }

        public Buffer useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) {
            VkDescriptorMappingSourceIndirectIndexArrayEXT.nuseCombinedImageSamplerIndex(address(), value ? 1 : 0);
            return this;
        }

        public Buffer samplerHeapOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerHeapOffset(address(), value);
            return this;
        }

        public Buffer samplerPushOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerPushOffset(address(), value);
            return this;
        }

        public Buffer samplerAddressOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerAddressOffset(address(), value);
            return this;
        }

        public Buffer samplerHeapIndexStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectIndexArrayEXT.nsamplerHeapIndexStride(address(), value);
            return this;
        }
    }
}
