package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindVertexBufferIndirectCommandNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindVertexBufferIndirectCommandNV.class */
public class VkBindVertexBufferIndirectCommandNV extends Struct<VkBindVertexBufferIndirectCommandNV> implements NativeResource {
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

    protected VkBindVertexBufferIndirectCommandNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindVertexBufferIndirectCommandNV create(long address, ByteBuffer container) {
        return new VkBindVertexBufferIndirectCommandNV(address, container);
    }

    public VkBindVertexBufferIndirectCommandNV(ByteBuffer container) {
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

    public VkBindVertexBufferIndirectCommandNV bufferAddress(@NativeType("VkDeviceAddress") long value) {
        nbufferAddress(address(), value);
        return this;
    }

    public VkBindVertexBufferIndirectCommandNV size(@NativeType("uint32_t") int value) {
        nsize(address(), value);
        return this;
    }

    public VkBindVertexBufferIndirectCommandNV stride(@NativeType("uint32_t") int value) {
        nstride(address(), value);
        return this;
    }

    public VkBindVertexBufferIndirectCommandNV set(long bufferAddress, int size, int stride) {
        bufferAddress(bufferAddress);
        size(size);
        stride(stride);
        return this;
    }

    public VkBindVertexBufferIndirectCommandNV set(VkBindVertexBufferIndirectCommandNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindVertexBufferIndirectCommandNV malloc() {
        return new VkBindVertexBufferIndirectCommandNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindVertexBufferIndirectCommandNV calloc() {
        return new VkBindVertexBufferIndirectCommandNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindVertexBufferIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindVertexBufferIndirectCommandNV(MemoryUtil.memAddress(container), container);
    }

    public static VkBindVertexBufferIndirectCommandNV create(long address) {
        return new VkBindVertexBufferIndirectCommandNV(address, null);
    }

    public static VkBindVertexBufferIndirectCommandNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindVertexBufferIndirectCommandNV(address, null);
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

    public static VkBindVertexBufferIndirectCommandNV malloc(MemoryStack stack) {
        return new VkBindVertexBufferIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindVertexBufferIndirectCommandNV calloc(MemoryStack stack) {
        return new VkBindVertexBufferIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindVertexBufferIndirectCommandNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindVertexBufferIndirectCommandNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindVertexBufferIndirectCommandNV, Buffer> implements NativeResource {
        private static final VkBindVertexBufferIndirectCommandNV ELEMENT_FACTORY = VkBindVertexBufferIndirectCommandNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindVertexBufferIndirectCommandNV.SIZEOF);
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
        public VkBindVertexBufferIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long bufferAddress() {
            return VkBindVertexBufferIndirectCommandNV.nbufferAddress(address());
        }

        @NativeType("uint32_t")
        public int size() {
            return VkBindVertexBufferIndirectCommandNV.nsize(address());
        }

        @NativeType("uint32_t")
        public int stride() {
            return VkBindVertexBufferIndirectCommandNV.nstride(address());
        }

        public Buffer bufferAddress(@NativeType("VkDeviceAddress") long value) {
            VkBindVertexBufferIndirectCommandNV.nbufferAddress(address(), value);
            return this;
        }

        public Buffer size(@NativeType("uint32_t") int value) {
            VkBindVertexBufferIndirectCommandNV.nsize(address(), value);
            return this;
        }

        public Buffer stride(@NativeType("uint32_t") int value) {
            VkBindVertexBufferIndirectCommandNV.nstride(address(), value);
            return this;
        }
    }
}
