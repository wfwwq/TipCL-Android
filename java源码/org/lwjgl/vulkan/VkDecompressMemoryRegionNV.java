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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDecompressMemoryRegionNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDecompressMemoryRegionNV.class */
public class VkDecompressMemoryRegionNV extends Struct<VkDecompressMemoryRegionNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRCADDRESS;
    public static final int DSTADDRESS;
    public static final int COMPRESSEDSIZE;
    public static final int DECOMPRESSEDSIZE;
    public static final int DECOMPRESSIONMETHOD;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRCADDRESS = layout.offsetof(0);
        DSTADDRESS = layout.offsetof(1);
        COMPRESSEDSIZE = layout.offsetof(2);
        DECOMPRESSEDSIZE = layout.offsetof(3);
        DECOMPRESSIONMETHOD = layout.offsetof(4);
    }

    protected VkDecompressMemoryRegionNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDecompressMemoryRegionNV create(long address, ByteBuffer container) {
        return new VkDecompressMemoryRegionNV(address, container);
    }

    public VkDecompressMemoryRegionNV(ByteBuffer container) {
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

    @NativeType("VkMemoryDecompressionMethodFlagsNV")
    public long decompressionMethod() {
        return ndecompressionMethod(address());
    }

    public VkDecompressMemoryRegionNV srcAddress(@NativeType("VkDeviceAddress") long value) {
        nsrcAddress(address(), value);
        return this;
    }

    public VkDecompressMemoryRegionNV dstAddress(@NativeType("VkDeviceAddress") long value) {
        ndstAddress(address(), value);
        return this;
    }

    public VkDecompressMemoryRegionNV compressedSize(@NativeType("VkDeviceSize") long value) {
        ncompressedSize(address(), value);
        return this;
    }

    public VkDecompressMemoryRegionNV decompressedSize(@NativeType("VkDeviceSize") long value) {
        ndecompressedSize(address(), value);
        return this;
    }

    public VkDecompressMemoryRegionNV decompressionMethod(@NativeType("VkMemoryDecompressionMethodFlagsNV") long value) {
        ndecompressionMethod(address(), value);
        return this;
    }

    public VkDecompressMemoryRegionNV set(long srcAddress, long dstAddress, long compressedSize, long decompressedSize, long decompressionMethod) {
        srcAddress(srcAddress);
        dstAddress(dstAddress);
        compressedSize(compressedSize);
        decompressedSize(decompressedSize);
        decompressionMethod(decompressionMethod);
        return this;
    }

    public VkDecompressMemoryRegionNV set(VkDecompressMemoryRegionNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDecompressMemoryRegionNV malloc() {
        return new VkDecompressMemoryRegionNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDecompressMemoryRegionNV calloc() {
        return new VkDecompressMemoryRegionNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDecompressMemoryRegionNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDecompressMemoryRegionNV(MemoryUtil.memAddress(container), container);
    }

    public static VkDecompressMemoryRegionNV create(long address) {
        return new VkDecompressMemoryRegionNV(address, null);
    }

    public static VkDecompressMemoryRegionNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDecompressMemoryRegionNV(address, null);
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

    public static VkDecompressMemoryRegionNV malloc(MemoryStack stack) {
        return new VkDecompressMemoryRegionNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDecompressMemoryRegionNV calloc(MemoryStack stack) {
        return new VkDecompressMemoryRegionNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndecompressionMethod(long struct) {
        return MemoryUtil.memGetLong(struct + DECOMPRESSIONMETHOD);
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

    public static void ndecompressionMethod(long struct, long value) {
        MemoryUtil.memPutLong(struct + DECOMPRESSIONMETHOD, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDecompressMemoryRegionNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDecompressMemoryRegionNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkDecompressMemoryRegionNV, Buffer> implements NativeResource {
        private static final VkDecompressMemoryRegionNV ELEMENT_FACTORY = VkDecompressMemoryRegionNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDecompressMemoryRegionNV.SIZEOF);
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
        public VkDecompressMemoryRegionNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long srcAddress() {
            return VkDecompressMemoryRegionNV.nsrcAddress(address());
        }

        @NativeType("VkDeviceAddress")
        public long dstAddress() {
            return VkDecompressMemoryRegionNV.ndstAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long compressedSize() {
            return VkDecompressMemoryRegionNV.ncompressedSize(address());
        }

        @NativeType("VkDeviceSize")
        public long decompressedSize() {
            return VkDecompressMemoryRegionNV.ndecompressedSize(address());
        }

        @NativeType("VkMemoryDecompressionMethodFlagsNV")
        public long decompressionMethod() {
            return VkDecompressMemoryRegionNV.ndecompressionMethod(address());
        }

        public Buffer srcAddress(@NativeType("VkDeviceAddress") long value) {
            VkDecompressMemoryRegionNV.nsrcAddress(address(), value);
            return this;
        }

        public Buffer dstAddress(@NativeType("VkDeviceAddress") long value) {
            VkDecompressMemoryRegionNV.ndstAddress(address(), value);
            return this;
        }

        public Buffer compressedSize(@NativeType("VkDeviceSize") long value) {
            VkDecompressMemoryRegionNV.ncompressedSize(address(), value);
            return this;
        }

        public Buffer decompressedSize(@NativeType("VkDeviceSize") long value) {
            VkDecompressMemoryRegionNV.ndecompressedSize(address(), value);
            return this;
        }

        public Buffer decompressionMethod(@NativeType("VkMemoryDecompressionMethodFlagsNV") long value) {
            VkDecompressMemoryRegionNV.ndecompressionMethod(address(), value);
            return this;
        }
    }
}
