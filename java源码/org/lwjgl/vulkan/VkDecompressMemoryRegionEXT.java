package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDecompressMemoryRegionEXT.class */
public class VkDecompressMemoryRegionEXT extends Struct<VkDecompressMemoryRegionEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRCADDRESS;
    public static final int DSTADDRESS;
    public static final int COMPRESSEDSIZE;
    public static final int DECOMPRESSEDSIZE;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRCADDRESS = layout.offsetof(0);
        DSTADDRESS = layout.offsetof(1);
        COMPRESSEDSIZE = layout.offsetof(2);
        DECOMPRESSEDSIZE = layout.offsetof(3);
    }

    protected VkDecompressMemoryRegionEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDecompressMemoryRegionEXT create(long address, ByteBuffer container) {
        return new VkDecompressMemoryRegionEXT(address, container);
    }

    public VkDecompressMemoryRegionEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long srcAddress() {
        return nsrcAddress(address());
    }

    @NativeType("VkDeviceAddress")
    public long dstAddress() {
        return ndstAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long compressedSize() {
        return ncompressedSize(address());
    }

    @NativeType("VkDeviceSize")
    public long decompressedSize() {
        return ndecompressedSize(address());
    }

    public VkDecompressMemoryRegionEXT srcAddress(@NativeType("VkDeviceAddress") long value) {
        nsrcAddress(address(), value);
        return this;
    }

    public VkDecompressMemoryRegionEXT dstAddress(@NativeType("VkDeviceAddress") long value) {
        ndstAddress(address(), value);
        return this;
    }

    public VkDecompressMemoryRegionEXT compressedSize(@NativeType("VkDeviceSize") long value) {
        ncompressedSize(address(), value);
        return this;
    }

    public VkDecompressMemoryRegionEXT decompressedSize(@NativeType("VkDeviceSize") long value) {
        ndecompressedSize(address(), value);
        return this;
    }

    public VkDecompressMemoryRegionEXT set(long srcAddress, long dstAddress, long compressedSize, long decompressedSize) {
        srcAddress(srcAddress);
        dstAddress(dstAddress);
        compressedSize(compressedSize);
        decompressedSize(decompressedSize);
        return this;
    }

    public VkDecompressMemoryRegionEXT set(VkDecompressMemoryRegionEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDecompressMemoryRegionEXT malloc() {
        return new VkDecompressMemoryRegionEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDecompressMemoryRegionEXT calloc() {
        return new VkDecompressMemoryRegionEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDecompressMemoryRegionEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDecompressMemoryRegionEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDecompressMemoryRegionEXT create(long address) {
        return new VkDecompressMemoryRegionEXT(address, null);
    }

    public static VkDecompressMemoryRegionEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDecompressMemoryRegionEXT(address, null);
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

    public static VkDecompressMemoryRegionEXT malloc(MemoryStack stack) {
        return new VkDecompressMemoryRegionEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDecompressMemoryRegionEXT calloc(MemoryStack stack) {
        return new VkDecompressMemoryRegionEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nsrcAddress(long struct) {
        return MemoryUtil.memGetLong(struct + SRCADDRESS);
    }

    public static long ndstAddress(long struct) {
        return MemoryUtil.memGetLong(struct + DSTADDRESS);
    }

    public static long ncompressedSize(long struct) {
        return MemoryUtil.memGetLong(struct + COMPRESSEDSIZE);
    }

    public static long ndecompressedSize(long struct) {
        return MemoryUtil.memGetLong(struct + DECOMPRESSEDSIZE);
    }

    public static void nsrcAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCADDRESS, value);
    }

    public static void ndstAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTADDRESS, value);
    }

    public static void ncompressedSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + COMPRESSEDSIZE, value);
    }

    public static void ndecompressedSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + DECOMPRESSEDSIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDecompressMemoryRegionEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDecompressMemoryRegionEXT, Buffer> implements NativeResource {
        private static final VkDecompressMemoryRegionEXT ELEMENT_FACTORY = VkDecompressMemoryRegionEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDecompressMemoryRegionEXT.SIZEOF);
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
        public VkDecompressMemoryRegionEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long srcAddress() {
            return VkDecompressMemoryRegionEXT.nsrcAddress(address());
        }

        @NativeType("VkDeviceAddress")
        public long dstAddress() {
            return VkDecompressMemoryRegionEXT.ndstAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long compressedSize() {
            return VkDecompressMemoryRegionEXT.ncompressedSize(address());
        }

        @NativeType("VkDeviceSize")
        public long decompressedSize() {
            return VkDecompressMemoryRegionEXT.ndecompressedSize(address());
        }

        public Buffer srcAddress(@NativeType("VkDeviceAddress") long value) {
            VkDecompressMemoryRegionEXT.nsrcAddress(address(), value);
            return this;
        }

        public Buffer dstAddress(@NativeType("VkDeviceAddress") long value) {
            VkDecompressMemoryRegionEXT.ndstAddress(address(), value);
            return this;
        }

        public Buffer compressedSize(@NativeType("VkDeviceSize") long value) {
            VkDecompressMemoryRegionEXT.ncompressedSize(address(), value);
            return this;
        }

        public Buffer decompressedSize(@NativeType("VkDeviceSize") long value) {
            VkDecompressMemoryRegionEXT.ndecompressedSize(address(), value);
            return this;
        }
    }
}
