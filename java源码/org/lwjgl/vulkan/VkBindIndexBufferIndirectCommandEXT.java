package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindIndexBufferIndirectCommandEXT.class */
public class VkBindIndexBufferIndirectCommandEXT extends Struct<VkBindIndexBufferIndirectCommandEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUFFERADDRESS;
    public static final int SIZE;
    public static final int INDEXTYPE;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUFFERADDRESS = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        INDEXTYPE = layout.offsetof(2);
    }

    protected VkBindIndexBufferIndirectCommandEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindIndexBufferIndirectCommandEXT create(long address, ByteBuffer container) {
        return new VkBindIndexBufferIndirectCommandEXT(address, container);
    }

    public VkBindIndexBufferIndirectCommandEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long bufferAddress() {
        return nbufferAddress(address());
    }

    @NativeType("uint32_t")
    public int size() {
        return nsize(address());
    }

    @NativeType("VkIndexType")
    public int indexType() {
        return nindexType(address());
    }

    public VkBindIndexBufferIndirectCommandEXT bufferAddress(@NativeType("VkDeviceAddress") long value) {
        nbufferAddress(address(), value);
        return this;
    }

    public VkBindIndexBufferIndirectCommandEXT size(@NativeType("uint32_t") int value) {
        nsize(address(), value);
        return this;
    }

    public VkBindIndexBufferIndirectCommandEXT indexType(@NativeType("VkIndexType") int value) {
        nindexType(address(), value);
        return this;
    }

    public VkBindIndexBufferIndirectCommandEXT set(long bufferAddress, int size, int indexType) {
        bufferAddress(bufferAddress);
        size(size);
        indexType(indexType);
        return this;
    }

    public VkBindIndexBufferIndirectCommandEXT set(VkBindIndexBufferIndirectCommandEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindIndexBufferIndirectCommandEXT malloc() {
        return new VkBindIndexBufferIndirectCommandEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindIndexBufferIndirectCommandEXT calloc() {
        return new VkBindIndexBufferIndirectCommandEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindIndexBufferIndirectCommandEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindIndexBufferIndirectCommandEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkBindIndexBufferIndirectCommandEXT create(long address) {
        return new VkBindIndexBufferIndirectCommandEXT(address, null);
    }

    public static VkBindIndexBufferIndirectCommandEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindIndexBufferIndirectCommandEXT(address, null);
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

    public static VkBindIndexBufferIndirectCommandEXT malloc(MemoryStack stack) {
        return new VkBindIndexBufferIndirectCommandEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindIndexBufferIndirectCommandEXT calloc(MemoryStack stack) {
        return new VkBindIndexBufferIndirectCommandEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nbufferAddress(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFERADDRESS);
    }

    public static int nsize(long struct) {
        return MemoryUtil.memGetInt(struct + SIZE);
    }

    public static int nindexType(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXTYPE);
    }

    public static void nbufferAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFERADDRESS, value);
    }

    public static void nsize(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIZE, value);
    }

    public static void nindexType(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXTYPE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindIndexBufferIndirectCommandEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindIndexBufferIndirectCommandEXT, Buffer> implements NativeResource {
        private static final VkBindIndexBufferIndirectCommandEXT ELEMENT_FACTORY = VkBindIndexBufferIndirectCommandEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindIndexBufferIndirectCommandEXT.SIZEOF);
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
        public VkBindIndexBufferIndirectCommandEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long bufferAddress() {
            return VkBindIndexBufferIndirectCommandEXT.nbufferAddress(address());
        }

        @NativeType("uint32_t")
        public int size() {
            return VkBindIndexBufferIndirectCommandEXT.nsize(address());
        }

        @NativeType("VkIndexType")
        public int indexType() {
            return VkBindIndexBufferIndirectCommandEXT.nindexType(address());
        }

        public Buffer bufferAddress(@NativeType("VkDeviceAddress") long value) {
            VkBindIndexBufferIndirectCommandEXT.nbufferAddress(address(), value);
            return this;
        }

        public Buffer size(@NativeType("uint32_t") int value) {
            VkBindIndexBufferIndirectCommandEXT.nsize(address(), value);
            return this;
        }

        public Buffer indexType(@NativeType("VkIndexType") int value) {
            VkBindIndexBufferIndirectCommandEXT.nindexType(address(), value);
            return this;
        }
    }
}
