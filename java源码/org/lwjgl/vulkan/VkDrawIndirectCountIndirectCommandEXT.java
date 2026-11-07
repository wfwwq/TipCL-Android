package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawIndirectCountIndirectCommandEXT.class */
public class VkDrawIndirectCountIndirectCommandEXT extends Struct<VkDrawIndirectCountIndirectCommandEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUFFERADDRESS;
    public static final int STRIDE;
    public static final int COMMANDCOUNT;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUFFERADDRESS = layout.offsetof(0);
        STRIDE = layout.offsetof(1);
        COMMANDCOUNT = layout.offsetof(2);
    }

    protected VkDrawIndirectCountIndirectCommandEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDrawIndirectCountIndirectCommandEXT create(long address, ByteBuffer container) {
        return new VkDrawIndirectCountIndirectCommandEXT(address, container);
    }

    public VkDrawIndirectCountIndirectCommandEXT(ByteBuffer container) {
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
    public int stride() {
        return nstride(address());
    }

    @NativeType("uint32_t")
    public int commandCount() {
        return ncommandCount(address());
    }

    public VkDrawIndirectCountIndirectCommandEXT bufferAddress(@NativeType("VkDeviceAddress") long value) {
        nbufferAddress(address(), value);
        return this;
    }

    public VkDrawIndirectCountIndirectCommandEXT stride(@NativeType("uint32_t") int value) {
        nstride(address(), value);
        return this;
    }

    public VkDrawIndirectCountIndirectCommandEXT commandCount(@NativeType("uint32_t") int value) {
        ncommandCount(address(), value);
        return this;
    }

    public VkDrawIndirectCountIndirectCommandEXT set(long bufferAddress, int stride, int commandCount) {
        bufferAddress(bufferAddress);
        stride(stride);
        commandCount(commandCount);
        return this;
    }

    public VkDrawIndirectCountIndirectCommandEXT set(VkDrawIndirectCountIndirectCommandEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDrawIndirectCountIndirectCommandEXT malloc() {
        return new VkDrawIndirectCountIndirectCommandEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDrawIndirectCountIndirectCommandEXT calloc() {
        return new VkDrawIndirectCountIndirectCommandEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDrawIndirectCountIndirectCommandEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawIndirectCountIndirectCommandEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDrawIndirectCountIndirectCommandEXT create(long address) {
        return new VkDrawIndirectCountIndirectCommandEXT(address, null);
    }

    public static VkDrawIndirectCountIndirectCommandEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDrawIndirectCountIndirectCommandEXT(address, null);
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

    public static VkDrawIndirectCountIndirectCommandEXT malloc(MemoryStack stack) {
        return new VkDrawIndirectCountIndirectCommandEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDrawIndirectCountIndirectCommandEXT calloc(MemoryStack stack) {
        return new VkDrawIndirectCountIndirectCommandEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstride(long struct) {
        return MemoryUtil.memGetInt(struct + STRIDE);
    }

    public static int ncommandCount(long struct) {
        return MemoryUtil.memGetInt(struct + COMMANDCOUNT);
    }

    public static void nbufferAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFERADDRESS, value);
    }

    public static void nstride(long struct, int value) {
        MemoryUtil.memPutInt(struct + STRIDE, value);
    }

    public static void ncommandCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMMANDCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawIndirectCountIndirectCommandEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDrawIndirectCountIndirectCommandEXT, Buffer> implements NativeResource {
        private static final VkDrawIndirectCountIndirectCommandEXT ELEMENT_FACTORY = VkDrawIndirectCountIndirectCommandEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDrawIndirectCountIndirectCommandEXT.SIZEOF);
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
        public VkDrawIndirectCountIndirectCommandEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long bufferAddress() {
            return VkDrawIndirectCountIndirectCommandEXT.nbufferAddress(address());
        }

        @NativeType("uint32_t")
        public int stride() {
            return VkDrawIndirectCountIndirectCommandEXT.nstride(address());
        }

        @NativeType("uint32_t")
        public int commandCount() {
            return VkDrawIndirectCountIndirectCommandEXT.ncommandCount(address());
        }

        public Buffer bufferAddress(@NativeType("VkDeviceAddress") long value) {
            VkDrawIndirectCountIndirectCommandEXT.nbufferAddress(address(), value);
            return this;
        }

        public Buffer stride(@NativeType("uint32_t") int value) {
            VkDrawIndirectCountIndirectCommandEXT.nstride(address(), value);
            return this;
        }

        public Buffer commandCount(@NativeType("uint32_t") int value) {
            VkDrawIndirectCountIndirectCommandEXT.ncommandCount(address(), value);
            return this;
        }
    }
}
