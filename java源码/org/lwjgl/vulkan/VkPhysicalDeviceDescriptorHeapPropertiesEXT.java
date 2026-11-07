package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorHeapPropertiesEXT.class */
public class VkPhysicalDeviceDescriptorHeapPropertiesEXT extends Struct<VkPhysicalDeviceDescriptorHeapPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SAMPLERHEAPALIGNMENT;
    public static final int RESOURCEHEAPALIGNMENT;
    public static final int MAXSAMPLERHEAPSIZE;
    public static final int MAXRESOURCEHEAPSIZE;
    public static final int MINSAMPLERHEAPRESERVEDRANGE;
    public static final int MINSAMPLERHEAPRESERVEDRANGEWITHEMBEDDED;
    public static final int MINRESOURCEHEAPRESERVEDRANGE;
    public static final int SAMPLERDESCRIPTORSIZE;
    public static final int IMAGEDESCRIPTORSIZE;
    public static final int BUFFERDESCRIPTORSIZE;
    public static final int SAMPLERDESCRIPTORALIGNMENT;
    public static final int IMAGEDESCRIPTORALIGNMENT;
    public static final int BUFFERDESCRIPTORALIGNMENT;
    public static final int MAXPUSHDATASIZE;
    public static final int IMAGECAPTUREREPLAYOPAQUEDATASIZE;
    public static final int MAXDESCRIPTORHEAPEMBEDDEDSAMPLERS;
    public static final int SAMPLERYCBCRCONVERSIONCOUNT;
    public static final int SPARSEDESCRIPTORHEAPS;
    public static final int PROTECTEDDESCRIPTORHEAPS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLERHEAPALIGNMENT = layout.offsetof(2);
        RESOURCEHEAPALIGNMENT = layout.offsetof(3);
        MAXSAMPLERHEAPSIZE = layout.offsetof(4);
        MAXRESOURCEHEAPSIZE = layout.offsetof(5);
        MINSAMPLERHEAPRESERVEDRANGE = layout.offsetof(6);
        MINSAMPLERHEAPRESERVEDRANGEWITHEMBEDDED = layout.offsetof(7);
        MINRESOURCEHEAPRESERVEDRANGE = layout.offsetof(8);
        SAMPLERDESCRIPTORSIZE = layout.offsetof(9);
        IMAGEDESCRIPTORSIZE = layout.offsetof(10);
        BUFFERDESCRIPTORSIZE = layout.offsetof(11);
        SAMPLERDESCRIPTORALIGNMENT = layout.offsetof(12);
        IMAGEDESCRIPTORALIGNMENT = layout.offsetof(13);
        BUFFERDESCRIPTORALIGNMENT = layout.offsetof(14);
        MAXPUSHDATASIZE = layout.offsetof(15);
        IMAGECAPTUREREPLAYOPAQUEDATASIZE = layout.offsetof(16);
        MAXDESCRIPTORHEAPEMBEDDEDSAMPLERS = layout.offsetof(17);
        SAMPLERYCBCRCONVERSIONCOUNT = layout.offsetof(18);
        SPARSEDESCRIPTORHEAPS = layout.offsetof(19);
        PROTECTEDDESCRIPTORHEAPS = layout.offsetof(20);
    }

    protected VkPhysicalDeviceDescriptorHeapPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceDescriptorHeapPropertiesEXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkDeviceSize")
    public long samplerHeapAlignment() {
        return nsamplerHeapAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long resourceHeapAlignment() {
        return nresourceHeapAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long maxSamplerHeapSize() {
        return nmaxSamplerHeapSize(address());
    }

    @NativeType("VkDeviceSize")
    public long maxResourceHeapSize() {
        return nmaxResourceHeapSize(address());
    }

    @NativeType("VkDeviceSize")
    public long minSamplerHeapReservedRange() {
        return nminSamplerHeapReservedRange(address());
    }

    @NativeType("VkDeviceSize")
    public long minSamplerHeapReservedRangeWithEmbedded() {
        return nminSamplerHeapReservedRangeWithEmbedded(address());
    }

    @NativeType("VkDeviceSize")
    public long minResourceHeapReservedRange() {
        return nminResourceHeapReservedRange(address());
    }

    @NativeType("VkDeviceSize")
    public long samplerDescriptorSize() {
        return nsamplerDescriptorSize(address());
    }

    @NativeType("VkDeviceSize")
    public long imageDescriptorSize() {
        return nimageDescriptorSize(address());
    }

    @NativeType("VkDeviceSize")
    public long bufferDescriptorSize() {
        return nbufferDescriptorSize(address());
    }

    @NativeType("VkDeviceSize")
    public long samplerDescriptorAlignment() {
        return nsamplerDescriptorAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long imageDescriptorAlignment() {
        return nimageDescriptorAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long bufferDescriptorAlignment() {
        return nbufferDescriptorAlignment(address());
    }

    @NativeType("VkDeviceSize")
    public long maxPushDataSize() {
        return nmaxPushDataSize(address());
    }

    @NativeType("size_t")
    public long imageCaptureReplayOpaqueDataSize() {
        return nimageCaptureReplayOpaqueDataSize(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorHeapEmbeddedSamplers() {
        return nmaxDescriptorHeapEmbeddedSamplers(address());
    }

    @NativeType("uint32_t")
    public int samplerYcbcrConversionCount() {
        return nsamplerYcbcrConversionCount(address());
    }

    @NativeType("VkBool32")
    public boolean sparseDescriptorHeaps() {
        return nsparseDescriptorHeaps(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean protectedDescriptorHeaps() {
        return nprotectedDescriptorHeaps(address()) != 0;
    }

    public VkPhysicalDeviceDescriptorHeapPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorHeapPropertiesEXT sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceDescriptorHeapPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorHeapPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceDescriptorHeapPropertiesEXT set(VkPhysicalDeviceDescriptorHeapPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT malloc() {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT calloc() {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT create(long address) {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsamplerHeapAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + SAMPLERHEAPALIGNMENT);
    }

    public static long nresourceHeapAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + RESOURCEHEAPALIGNMENT);
    }

    public static long nmaxSamplerHeapSize(long struct) {
        return MemoryUtil.memGetLong(struct + MAXSAMPLERHEAPSIZE);
    }

    public static long nmaxResourceHeapSize(long struct) {
        return MemoryUtil.memGetLong(struct + MAXRESOURCEHEAPSIZE);
    }

    public static long nminSamplerHeapReservedRange(long struct) {
        return MemoryUtil.memGetLong(struct + MINSAMPLERHEAPRESERVEDRANGE);
    }

    public static long nminSamplerHeapReservedRangeWithEmbedded(long struct) {
        return MemoryUtil.memGetLong(struct + MINSAMPLERHEAPRESERVEDRANGEWITHEMBEDDED);
    }

    public static long nminResourceHeapReservedRange(long struct) {
        return MemoryUtil.memGetLong(struct + MINRESOURCEHEAPRESERVEDRANGE);
    }

    public static long nsamplerDescriptorSize(long struct) {
        return MemoryUtil.memGetLong(struct + SAMPLERDESCRIPTORSIZE);
    }

    public static long nimageDescriptorSize(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGEDESCRIPTORSIZE);
    }

    public static long nbufferDescriptorSize(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFERDESCRIPTORSIZE);
    }

    public static long nsamplerDescriptorAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + SAMPLERDESCRIPTORALIGNMENT);
    }

    public static long nimageDescriptorAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGEDESCRIPTORALIGNMENT);
    }

    public static long nbufferDescriptorAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFERDESCRIPTORALIGNMENT);
    }

    public static long nmaxPushDataSize(long struct) {
        return MemoryUtil.memGetLong(struct + MAXPUSHDATASIZE);
    }

    public static long nimageCaptureReplayOpaqueDataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + IMAGECAPTUREREPLAYOPAQUEDATASIZE);
    }

    public static int nmaxDescriptorHeapEmbeddedSamplers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORHEAPEMBEDDEDSAMPLERS);
    }

    public static int nsamplerYcbcrConversionCount(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERYCBCRCONVERSIONCOUNT);
    }

    public static int nsparseDescriptorHeaps(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSEDESCRIPTORHEAPS);
    }

    public static int nprotectedDescriptorHeaps(long struct) {
        return MemoryUtil.memGetInt(struct + PROTECTEDDESCRIPTORHEAPS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorHeapPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDescriptorHeapPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceDescriptorHeapPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceDescriptorHeapPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long samplerHeapAlignment() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerHeapAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long resourceHeapAlignment() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nresourceHeapAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long maxSamplerHeapSize() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxSamplerHeapSize(address());
        }

        @NativeType("VkDeviceSize")
        public long maxResourceHeapSize() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxResourceHeapSize(address());
        }

        @NativeType("VkDeviceSize")
        public long minSamplerHeapReservedRange() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nminSamplerHeapReservedRange(address());
        }

        @NativeType("VkDeviceSize")
        public long minSamplerHeapReservedRangeWithEmbedded() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nminSamplerHeapReservedRangeWithEmbedded(address());
        }

        @NativeType("VkDeviceSize")
        public long minResourceHeapReservedRange() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nminResourceHeapReservedRange(address());
        }

        @NativeType("VkDeviceSize")
        public long samplerDescriptorSize() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerDescriptorSize(address());
        }

        @NativeType("VkDeviceSize")
        public long imageDescriptorSize() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nimageDescriptorSize(address());
        }

        @NativeType("VkDeviceSize")
        public long bufferDescriptorSize() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nbufferDescriptorSize(address());
        }

        @NativeType("VkDeviceSize")
        public long samplerDescriptorAlignment() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerDescriptorAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long imageDescriptorAlignment() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nimageDescriptorAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long bufferDescriptorAlignment() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nbufferDescriptorAlignment(address());
        }

        @NativeType("VkDeviceSize")
        public long maxPushDataSize() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxPushDataSize(address());
        }

        @NativeType("size_t")
        public long imageCaptureReplayOpaqueDataSize() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nimageCaptureReplayOpaqueDataSize(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorHeapEmbeddedSamplers() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxDescriptorHeapEmbeddedSamplers(address());
        }

        @NativeType("uint32_t")
        public int samplerYcbcrConversionCount() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerYcbcrConversionCount(address());
        }

        @NativeType("VkBool32")
        public boolean sparseDescriptorHeaps() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsparseDescriptorHeaps(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean protectedDescriptorHeaps() {
            return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nprotectedDescriptorHeaps(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorHeapPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
