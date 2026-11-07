package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindVertexBufferIndirectCommandEXT.class */
public class VkBindVertexBufferIndirectCommandEXT extends Struct<VkBindVertexBufferIndirectCommandEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUFFERADDRESS;
    public static final int SIZE;
    public static final int STRIDE;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUFFERADDRESS = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        STRIDE = layout.offsetof(2);
    }

    protected VkBindVertexBufferIndirectCommandEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindVertexBufferIndirectCommandEXT create(long address, ByteBuffer container) {
        return new VkBindVertexBufferIndirectCommandEXT(address, container);
    }

    public VkBindVertexBufferIndirectCommandEXT(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int stride() {
        return nstride(address());
    }

    public VkBindVertexBufferIndirectCommandEXT bufferAddress(@NativeType("VkDeviceAddress") long value) {
        nbufferAddress(address(), value);
        return this;
    }

    public VkBindVertexBufferIndirectCommandEXT size(@NativeType("uint32_t") int value) {
        nsize(address(), value);
        return this;
    }

    public VkBindVertexBufferIndirectCommandEXT stride(@NativeType("uint32_t") int value) {
        nstride(address(), value);
        return this;
    }

    public VkBindVertexBufferIndirectCommandEXT set(long bufferAddress, int size, int stride) {
        bufferAddress(bufferAddress);
        size(size);
        stride(stride);
        return this;
    }

    public VkBindVertexBufferIndirectCommandEXT set(VkBindVertexBufferIndirectCommandEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindVertexBufferIndirectCommandEXT malloc() {
        return new VkBindVertexBufferIndirectCommandEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindVertexBufferIndirectCommandEXT calloc() {
        return new VkBindVertexBufferIndirectCommandEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindVertexBufferIndirectCommandEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindVertexBufferIndirectCommandEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkBindVertexBufferIndirectCommandEXT create(long address) {
        return new VkBindVertexBufferIndirectCommandEXT(address, null);
    }

    public static VkBindVertexBufferIndirectCommandEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindVertexBufferIndirectCommandEXT(address, null);
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

    public static VkBindVertexBufferIndirectCommandEXT malloc(MemoryStack stack) {
        return new VkBindVertexBufferIndirectCommandEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindVertexBufferIndirectCommandEXT calloc(MemoryStack stack) {
        return new VkBindVertexBufferIndirectCommandEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstride(long struct) {
        return MemoryUtil.memGetInt(struct + STRIDE);
    }

    public static void nbufferAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFERADDRESS, value);
    }

    public static void nsize(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIZE, value);
    }

    public static void nstride(long struct, int value) {
        MemoryUtil.memPutInt(struct + STRIDE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindVertexBufferIndirectCommandEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindVertexBufferIndirectCommandEXT, Buffer> implements NativeResource {
        private static final VkBindVertexBufferIndirectCommandEXT ELEMENT_FACTORY = VkBindVertexBufferIndirectCommandEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindVertexBufferIndirectCommandEXT.SIZEOF);
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
        public VkBindVertexBufferIndirectCommandEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long bufferAddress() {
            return VkBindVertexBufferIndirectCommandEXT.nbufferAddress(address());
        }

        @NativeType("uint32_t")
        public int size() {
            return VkBindVertexBufferIndirectCommandEXT.nsize(address());
        }

        @NativeType("uint32_t")
        public int stride() {
            return VkBindVertexBufferIndirectCommandEXT.nstride(address());
        }

        public Buffer bufferAddress(@NativeType("VkDeviceAddress") long value) {
            VkBindVertexBufferIndirectCommandEXT.nbufferAddress(address(), value);
            return this;
        }

        public Buffer size(@NativeType("uint32_t") int value) {
            VkBindVertexBufferIndirectCommandEXT.nsize(address(), value);
            return this;
        }

        public Buffer stride(@NativeType("uint32_t") int value) {
            VkBindVertexBufferIndirectCommandEXT.nstride(address(), value);
            return this;
        }
    }
}
