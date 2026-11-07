package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceHeapDataEXT.class */
public class VkDescriptorMappingSourceHeapDataEXT extends Struct<VkDescriptorMappingSourceHeapDataEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEAPOFFSET;
    public static final int PUSHOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEAPOFFSET = layout.offsetof(0);
        PUSHOFFSET = layout.offsetof(1);
    }

    protected VkDescriptorMappingSourceHeapDataEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorMappingSourceHeapDataEXT create(long address, ByteBuffer container) {
        return new VkDescriptorMappingSourceHeapDataEXT(address, container);
    }

    public VkDescriptorMappingSourceHeapDataEXT(ByteBuffer container) {
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

    public VkDescriptorMappingSourceHeapDataEXT heapOffset(@NativeType("uint32_t") int value) {
        nheapOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceHeapDataEXT pushOffset(@NativeType("uint32_t") int value) {
        npushOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceHeapDataEXT set(int heapOffset, int pushOffset) {
        heapOffset(heapOffset);
        pushOffset(pushOffset);
        return this;
    }

    public VkDescriptorMappingSourceHeapDataEXT set(VkDescriptorMappingSourceHeapDataEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorMappingSourceHeapDataEXT malloc() {
        return new VkDescriptorMappingSourceHeapDataEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorMappingSourceHeapDataEXT calloc() {
        return new VkDescriptorMappingSourceHeapDataEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceHeapDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceHeapDataEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorMappingSourceHeapDataEXT create(long address) {
        return new VkDescriptorMappingSourceHeapDataEXT(address, null);
    }

    public static VkDescriptorMappingSourceHeapDataEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorMappingSourceHeapDataEXT(address, null);
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

    public static VkDescriptorMappingSourceHeapDataEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceHeapDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceHeapDataEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceHeapDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nheapOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEAPOFFSET, value);
    }

    public static void npushOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHOFFSET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceHeapDataEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceHeapDataEXT, Buffer> implements NativeResource {
        private static final VkDescriptorMappingSourceHeapDataEXT ELEMENT_FACTORY = VkDescriptorMappingSourceHeapDataEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorMappingSourceHeapDataEXT.SIZEOF);
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
        public VkDescriptorMappingSourceHeapDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int heapOffset() {
            return VkDescriptorMappingSourceHeapDataEXT.nheapOffset(address());
        }

        @NativeType("uint32_t")
        public int pushOffset() {
            return VkDescriptorMappingSourceHeapDataEXT.npushOffset(address());
        }

        public Buffer heapOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceHeapDataEXT.nheapOffset(address(), value);
            return this;
        }

        public Buffer pushOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceHeapDataEXT.npushOffset(address(), value);
            return this;
        }
    }
}
