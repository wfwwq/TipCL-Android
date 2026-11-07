package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBinding.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBinding.class */
public class VkDescriptorSetLayoutBinding extends Struct<VkDescriptorSetLayoutBinding> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BINDING;
    public static final int DESCRIPTORTYPE;
    public static final int DESCRIPTORCOUNT;
    public static final int STAGEFLAGS;
    public static final int PIMMUTABLESAMPLERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BINDING = layout.offsetof(0);
        DESCRIPTORTYPE = layout.offsetof(1);
        DESCRIPTORCOUNT = layout.offsetof(2);
        STAGEFLAGS = layout.offsetof(3);
        PIMMUTABLESAMPLERS = layout.offsetof(4);
    }

    protected VkDescriptorSetLayoutBinding(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorSetLayoutBinding create(long address, ByteBuffer container) {
        return new VkDescriptorSetLayoutBinding(address, container);
    }

    public VkDescriptorSetLayoutBinding(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int binding() {
        return nbinding(address());
    }

    @NativeType("VkDescriptorType")
    public int descriptorType() {
        return ndescriptorType(address());
    }

    @NativeType("uint32_t")
    public int descriptorCount() {
        return ndescriptorCount(address());
    }

    @NativeType("VkShaderStageFlags")
    public int stageFlags() {
        return nstageFlags(address());
    }

    @NativeType("VkSampler const *")
    public LongBuffer pImmutableSamplers() {
        return npImmutableSamplers(address());
    }

    public VkDescriptorSetLayoutBinding binding(@NativeType("uint32_t") int value) {
        nbinding(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutBinding descriptorType(@NativeType("VkDescriptorType") int value) {
        ndescriptorType(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutBinding descriptorCount(@NativeType("uint32_t") int value) {
        ndescriptorCount(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutBinding stageFlags(@NativeType("VkShaderStageFlags") int value) {
        nstageFlags(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutBinding pImmutableSamplers(@NativeType("VkSampler const *") LongBuffer value) {
        npImmutableSamplers(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutBinding set(int binding, int descriptorType, int descriptorCount, int stageFlags, LongBuffer pImmutableSamplers) {
        binding(binding);
        descriptorType(descriptorType);
        descriptorCount(descriptorCount);
        stageFlags(stageFlags);
        pImmutableSamplers(pImmutableSamplers);
        return this;
    }

    public VkDescriptorSetLayoutBinding set(VkDescriptorSetLayoutBinding src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorSetLayoutBinding malloc() {
        return new VkDescriptorSetLayoutBinding(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorSetLayoutBinding calloc() {
        return new VkDescriptorSetLayoutBinding(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorSetLayoutBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetLayoutBinding(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorSetLayoutBinding create(long address) {
        return new VkDescriptorSetLayoutBinding(address, null);
    }

    public static VkDescriptorSetLayoutBinding createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorSetLayoutBinding(address, null);
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

    public static VkDescriptorSetLayoutBinding malloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorSetLayoutBinding calloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbinding(long struct) {
        return MemoryUtil.memGetInt(struct + BINDING);
    }

    public static int ndescriptorType(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORTYPE);
    }

    public static int ndescriptorCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORCOUNT);
    }

    public static int nstageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + STAGEFLAGS);
    }

    public static LongBuffer npImmutableSamplers(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PIMMUTABLESAMPLERS), ndescriptorCount(struct));
    }

    public static void nbinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDING, value);
    }

    public static void ndescriptorType(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORTYPE, value);
    }

    public static void ndescriptorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORCOUNT, value);
    }

    public static void nstageFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGEFLAGS, value);
    }

    public static void npImmutableSamplers(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PIMMUTABLESAMPLERS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ndescriptorCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBinding$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBinding$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutBinding, Buffer> implements NativeResource {
        private static final VkDescriptorSetLayoutBinding ELEMENT_FACTORY = VkDescriptorSetLayoutBinding.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorSetLayoutBinding.SIZEOF);
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
        public VkDescriptorSetLayoutBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int binding() {
            return VkDescriptorSetLayoutBinding.nbinding(address());
        }

        @NativeType("VkDescriptorType")
        public int descriptorType() {
            return VkDescriptorSetLayoutBinding.ndescriptorType(address());
        }

        @NativeType("uint32_t")
        public int descriptorCount() {
            return VkDescriptorSetLayoutBinding.ndescriptorCount(address());
        }

        @NativeType("VkShaderStageFlags")
        public int stageFlags() {
            return VkDescriptorSetLayoutBinding.nstageFlags(address());
        }

        @NativeType("VkSampler const *")
        public LongBuffer pImmutableSamplers() {
            return VkDescriptorSetLayoutBinding.npImmutableSamplers(address());
        }

        public Buffer binding(@NativeType("uint32_t") int value) {
            VkDescriptorSetLayoutBinding.nbinding(address(), value);
            return this;
        }

        public Buffer descriptorType(@NativeType("VkDescriptorType") int value) {
            VkDescriptorSetLayoutBinding.ndescriptorType(address(), value);
            return this;
        }

        public Buffer descriptorCount(@NativeType("uint32_t") int value) {
            VkDescriptorSetLayoutBinding.ndescriptorCount(address(), value);
            return this;
        }

        public Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) {
            VkDescriptorSetLayoutBinding.nstageFlags(address(), value);
            return this;
        }

        public Buffer pImmutableSamplers(@NativeType("VkSampler const *") LongBuffer value) {
            VkDescriptorSetLayoutBinding.npImmutableSamplers(address(), value);
            return this;
        }
    }
}
