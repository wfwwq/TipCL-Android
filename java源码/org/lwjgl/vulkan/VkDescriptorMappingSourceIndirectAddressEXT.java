package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceIndirectAddressEXT.class */
public class VkDescriptorMappingSourceIndirectAddressEXT extends Struct<VkDescriptorMappingSourceIndirectAddressEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PUSHOFFSET;
    public static final int ADDRESSOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PUSHOFFSET = layout.offsetof(0);
        ADDRESSOFFSET = layout.offsetof(1);
    }

    protected VkDescriptorMappingSourceIndirectAddressEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorMappingSourceIndirectAddressEXT create(long address, ByteBuffer container) {
        return new VkDescriptorMappingSourceIndirectAddressEXT(address, container);
    }

    public VkDescriptorMappingSourceIndirectAddressEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int pushOffset() {
        return npushOffset(address());
    }

    @NativeType("uint32_t")
    public int addressOffset() {
        return naddressOffset(address());
    }

    public VkDescriptorMappingSourceIndirectAddressEXT pushOffset(@NativeType("uint32_t") int value) {
        npushOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectAddressEXT addressOffset(@NativeType("uint32_t") int value) {
        naddressOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceIndirectAddressEXT set(int pushOffset, int addressOffset) {
        pushOffset(pushOffset);
        addressOffset(addressOffset);
        return this;
    }

    public VkDescriptorMappingSourceIndirectAddressEXT set(VkDescriptorMappingSourceIndirectAddressEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorMappingSourceIndirectAddressEXT malloc() {
        return new VkDescriptorMappingSourceIndirectAddressEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorMappingSourceIndirectAddressEXT calloc() {
        return new VkDescriptorMappingSourceIndirectAddressEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceIndirectAddressEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceIndirectAddressEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorMappingSourceIndirectAddressEXT create(long address) {
        return new VkDescriptorMappingSourceIndirectAddressEXT(address, null);
    }

    public static VkDescriptorMappingSourceIndirectAddressEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorMappingSourceIndirectAddressEXT(address, null);
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

    public static VkDescriptorMappingSourceIndirectAddressEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectAddressEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceIndirectAddressEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectAddressEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int npushOffset(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHOFFSET);
    }

    public static int naddressOffset(long struct) {
        return MemoryUtil.memGetInt(struct + ADDRESSOFFSET);
    }

    public static void npushOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHOFFSET, value);
    }

    public static void naddressOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADDRESSOFFSET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceIndirectAddressEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceIndirectAddressEXT, Buffer> implements NativeResource {
        private static final VkDescriptorMappingSourceIndirectAddressEXT ELEMENT_FACTORY = VkDescriptorMappingSourceIndirectAddressEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorMappingSourceIndirectAddressEXT.SIZEOF);
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
        public VkDescriptorMappingSourceIndirectAddressEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int pushOffset() {
            return VkDescriptorMappingSourceIndirectAddressEXT.npushOffset(address());
        }

        @NativeType("uint32_t")
        public int addressOffset() {
            return VkDescriptorMappingSourceIndirectAddressEXT.naddressOffset(address());
        }

        public Buffer pushOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectAddressEXT.npushOffset(address(), value);
            return this;
        }

        public Buffer addressOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceIndirectAddressEXT.naddressOffset(address(), value);
            return this;
        }
    }
}
