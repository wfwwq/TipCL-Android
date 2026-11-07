package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkDecompressMemoryRegionEXT;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDecompressMemoryInfoEXT.class */
public class VkDecompressMemoryInfoEXT extends Struct<VkDecompressMemoryInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DECOMPRESSIONMETHOD;
    public static final int REGIONCOUNT;
    public static final int PREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DECOMPRESSIONMETHOD = layout.offsetof(2);
        REGIONCOUNT = layout.offsetof(3);
        PREGIONS = layout.offsetof(4);
    }

    protected VkDecompressMemoryInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDecompressMemoryInfoEXT create(long address, ByteBuffer container) {
        return new VkDecompressMemoryInfoEXT(address, container);
    }

    public VkDecompressMemoryInfoEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkMemoryDecompressionMethodFlagsEXT")
    public long decompressionMethod() {
        return ndecompressionMethod(address());
    }

    @NativeType("uint32_t")
    public int regionCount() {
        return nregionCount(address());
    }

    @NativeType("VkDecompressMemoryRegionEXT const *")
    public VkDecompressMemoryRegionEXT.Buffer pRegions() {
        return npRegions(address());
    }

    public VkDecompressMemoryInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDecompressMemoryInfoEXT sType$Default() {
        return sType(EXTMemoryDecompression.VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT);
    }

    public VkDecompressMemoryInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDecompressMemoryInfoEXT decompressionMethod(@NativeType("VkMemoryDecompressionMethodFlagsEXT") long value) {
        ndecompressionMethod(address(), value);
        return this;
    }

    public VkDecompressMemoryInfoEXT pRegions(@NativeType("VkDecompressMemoryRegionEXT const *") VkDecompressMemoryRegionEXT.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    public VkDecompressMemoryInfoEXT set(int sType, long pNext, long decompressionMethod, VkDecompressMemoryRegionEXT.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        decompressionMethod(decompressionMethod);
        pRegions(pRegions);
        return this;
    }

    public VkDecompressMemoryInfoEXT set(VkDecompressMemoryInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDecompressMemoryInfoEXT malloc() {
        return new VkDecompressMemoryInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDecompressMemoryInfoEXT calloc() {
        return new VkDecompressMemoryInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDecompressMemoryInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDecompressMemoryInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDecompressMemoryInfoEXT create(long address) {
        return new VkDecompressMemoryInfoEXT(address, null);
    }

    public static VkDecompressMemoryInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDecompressMemoryInfoEXT(address, null);
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

    public static VkDecompressMemoryInfoEXT malloc(MemoryStack stack) {
        return new VkDecompressMemoryInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDecompressMemoryInfoEXT calloc(MemoryStack stack) {
        return new VkDecompressMemoryInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static long ndecompressionMethod(long struct) {
        return MemoryUtil.memGetLong(struct + DECOMPRESSIONMETHOD);
    }

    public static int nregionCount(long struct) {
        return MemoryUtil.memGetInt(struct + REGIONCOUNT);
    }

    public static VkDecompressMemoryRegionEXT.Buffer npRegions(long struct) {
        return VkDecompressMemoryRegionEXT.create(MemoryUtil.memGetAddress(struct + PREGIONS), nregionCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndecompressionMethod(long struct, long value) {
        MemoryUtil.memPutLong(struct + DECOMPRESSIONMETHOD, value);
    }

    public static void nregionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + REGIONCOUNT, value);
    }

    public static void npRegions(long struct, VkDecompressMemoryRegionEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREGIONS, value.address());
        nregionCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PREGIONS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDecompressMemoryInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDecompressMemoryInfoEXT, Buffer> implements NativeResource {
        private static final VkDecompressMemoryInfoEXT ELEMENT_FACTORY = VkDecompressMemoryInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDecompressMemoryInfoEXT.SIZEOF);
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
        public VkDecompressMemoryInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDecompressMemoryInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDecompressMemoryInfoEXT.npNext(address());
        }

        @NativeType("VkMemoryDecompressionMethodFlagsEXT")
        public long decompressionMethod() {
            return VkDecompressMemoryInfoEXT.ndecompressionMethod(address());
        }

        @NativeType("uint32_t")
        public int regionCount() {
            return VkDecompressMemoryInfoEXT.nregionCount(address());
        }

        @NativeType("VkDecompressMemoryRegionEXT const *")
        public VkDecompressMemoryRegionEXT.Buffer pRegions() {
            return VkDecompressMemoryInfoEXT.npRegions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDecompressMemoryInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMemoryDecompression.VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDecompressMemoryInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer decompressionMethod(@NativeType("VkMemoryDecompressionMethodFlagsEXT") long value) {
            VkDecompressMemoryInfoEXT.ndecompressionMethod(address(), value);
            return this;
        }

        public Buffer pRegions(@NativeType("VkDecompressMemoryRegionEXT const *") VkDecompressMemoryRegionEXT.Buffer value) {
            VkDecompressMemoryInfoEXT.npRegions(address(), value);
            return this;
        }
    }
}
