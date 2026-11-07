package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceConstantOffsetEXT.class */
public class VkDescriptorMappingSourceConstantOffsetEXT extends Struct<VkDescriptorMappingSourceConstantOffsetEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEAPOFFSET;
    public static final int HEAPARRAYSTRIDE;
    public static final int PEMBEDDEDSAMPLER;
    public static final int SAMPLERHEAPOFFSET;
    public static final int SAMPLERHEAPARRAYSTRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEAPOFFSET = layout.offsetof(0);
        HEAPARRAYSTRIDE = layout.offsetof(1);
        PEMBEDDEDSAMPLER = layout.offsetof(2);
        SAMPLERHEAPOFFSET = layout.offsetof(3);
        SAMPLERHEAPARRAYSTRIDE = layout.offsetof(4);
    }

    protected VkDescriptorMappingSourceConstantOffsetEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorMappingSourceConstantOffsetEXT create(long address, ByteBuffer container) {
        return new VkDescriptorMappingSourceConstantOffsetEXT(address, container);
    }

    public VkDescriptorMappingSourceConstantOffsetEXT(ByteBuffer container) {
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
    public int heapArrayStride() {
        return nheapArrayStride(address());
    }

    @NativeType("VkSamplerCreateInfo const *")
    public VkSamplerCreateInfo pEmbeddedSampler() {
        return npEmbeddedSampler(address());
    }

    @NativeType("uint32_t")
    public int samplerHeapOffset() {
        return nsamplerHeapOffset(address());
    }

    @NativeType("uint32_t")
    public int samplerHeapArrayStride() {
        return nsamplerHeapArrayStride(address());
    }

    public VkDescriptorMappingSourceConstantOffsetEXT heapOffset(@NativeType("uint32_t") int value) {
        nheapOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceConstantOffsetEXT heapArrayStride(@NativeType("uint32_t") int value) {
        nheapArrayStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceConstantOffsetEXT pEmbeddedSampler(@NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) {
        npEmbeddedSampler(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceConstantOffsetEXT samplerHeapOffset(@NativeType("uint32_t") int value) {
        nsamplerHeapOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceConstantOffsetEXT samplerHeapArrayStride(@NativeType("uint32_t") int value) {
        nsamplerHeapArrayStride(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceConstantOffsetEXT set(int heapOffset, int heapArrayStride, VkSamplerCreateInfo pEmbeddedSampler, int samplerHeapOffset, int samplerHeapArrayStride) {
        heapOffset(heapOffset);
        heapArrayStride(heapArrayStride);
        pEmbeddedSampler(pEmbeddedSampler);
        samplerHeapOffset(samplerHeapOffset);
        samplerHeapArrayStride(samplerHeapArrayStride);
        return this;
    }

    public VkDescriptorMappingSourceConstantOffsetEXT set(VkDescriptorMappingSourceConstantOffsetEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorMappingSourceConstantOffsetEXT malloc() {
        return new VkDescriptorMappingSourceConstantOffsetEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorMappingSourceConstantOffsetEXT calloc() {
        return new VkDescriptorMappingSourceConstantOffsetEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceConstantOffsetEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceConstantOffsetEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorMappingSourceConstantOffsetEXT create(long address) {
        return new VkDescriptorMappingSourceConstantOffsetEXT(address, null);
    }

    public static VkDescriptorMappingSourceConstantOffsetEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorMappingSourceConstantOffsetEXT(address, null);
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

    public static VkDescriptorMappingSourceConstantOffsetEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceConstantOffsetEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceConstantOffsetEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceConstantOffsetEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nheapArrayStride(long struct) {
        return MemoryUtil.memGetInt(struct + HEAPARRAYSTRIDE);
    }

    public static VkSamplerCreateInfo npEmbeddedSampler(long struct) {
        return VkSamplerCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PEMBEDDEDSAMPLER));
    }

    public static int nsamplerHeapOffset(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERHEAPOFFSET);
    }

    public static int nsamplerHeapArrayStride(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERHEAPARRAYSTRIDE);
    }

    public static void nheapOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEAPOFFSET, value);
    }

    public static void nheapArrayStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEAPARRAYSTRIDE, value);
    }

    public static void npEmbeddedSampler(long struct, VkSamplerCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PEMBEDDEDSAMPLER, MemoryUtil.memAddressSafe(value));
    }

    public static void nsamplerHeapOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERHEAPOFFSET, value);
    }

    public static void nsamplerHeapArrayStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERHEAPARRAYSTRIDE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceConstantOffsetEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceConstantOffsetEXT, Buffer> implements NativeResource {
        private static final VkDescriptorMappingSourceConstantOffsetEXT ELEMENT_FACTORY = VkDescriptorMappingSourceConstantOffsetEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorMappingSourceConstantOffsetEXT.SIZEOF);
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
        public VkDescriptorMappingSourceConstantOffsetEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int heapOffset() {
            return VkDescriptorMappingSourceConstantOffsetEXT.nheapOffset(address());
        }

        @NativeType("uint32_t")
        public int heapArrayStride() {
            return VkDescriptorMappingSourceConstantOffsetEXT.nheapArrayStride(address());
        }

        @NativeType("VkSamplerCreateInfo const *")
        public VkSamplerCreateInfo pEmbeddedSampler() {
            return VkDescriptorMappingSourceConstantOffsetEXT.npEmbeddedSampler(address());
        }

        @NativeType("uint32_t")
        public int samplerHeapOffset() {
            return VkDescriptorMappingSourceConstantOffsetEXT.nsamplerHeapOffset(address());
        }

        @NativeType("uint32_t")
        public int samplerHeapArrayStride() {
            return VkDescriptorMappingSourceConstantOffsetEXT.nsamplerHeapArrayStride(address());
        }

        public Buffer heapOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceConstantOffsetEXT.nheapOffset(address(), value);
            return this;
        }

        public Buffer heapArrayStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceConstantOffsetEXT.nheapArrayStride(address(), value);
            return this;
        }

        public Buffer pEmbeddedSampler(@NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) {
            VkDescriptorMappingSourceConstantOffsetEXT.npEmbeddedSampler(address(), value);
            return this;
        }

        public Buffer samplerHeapOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceConstantOffsetEXT.nsamplerHeapOffset(address(), value);
            return this;
        }

        public Buffer samplerHeapArrayStride(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceConstantOffsetEXT.nsamplerHeapArrayStride(address(), value);
            return this;
        }
    }
}
