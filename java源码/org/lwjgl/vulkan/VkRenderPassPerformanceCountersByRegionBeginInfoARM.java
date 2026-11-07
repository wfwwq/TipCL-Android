package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassPerformanceCountersByRegionBeginInfoARM.class */
public class VkRenderPassPerformanceCountersByRegionBeginInfoARM extends Struct<VkRenderPassPerformanceCountersByRegionBeginInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COUNTERADDRESSCOUNT;
    public static final int PCOUNTERADDRESSES;
    public static final int SERIALIZEREGIONS;
    public static final int COUNTERINDEXCOUNT;
    public static final int PCOUNTERINDICES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COUNTERADDRESSCOUNT = layout.offsetof(2);
        PCOUNTERADDRESSES = layout.offsetof(3);
        SERIALIZEREGIONS = layout.offsetof(4);
        COUNTERINDEXCOUNT = layout.offsetof(5);
        PCOUNTERINDICES = layout.offsetof(6);
    }

    protected VkRenderPassPerformanceCountersByRegionBeginInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM create(long address, ByteBuffer container) {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(address, container);
    }

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int counterAddressCount() {
        return ncounterAddressCount(address());
    }

    @NativeType("VkDeviceAddress const *")
    public LongBuffer pCounterAddresses(int capacity) {
        return npCounterAddresses(address(), capacity);
    }

    @NativeType("VkBool32")
    public boolean serializeRegions() {
        return nserializeRegions(address()) != 0;
    }

    @NativeType("uint32_t")
    public int counterIndexCount() {
        return ncounterIndexCount(address());
    }

    @NativeType("uint32_t *")
    public IntBuffer pCounterIndices(int capacity) {
        return npCounterIndices(address(), capacity);
    }

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM sType$Default() {
        return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM);
    }

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM counterAddressCount(@NativeType("uint32_t") int value) {
        ncounterAddressCount(address(), value);
        return this;
    }

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pCounterAddresses(@NativeType("VkDeviceAddress const *") LongBuffer value) {
        npCounterAddresses(address(), value);
        return this;
    }

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM serializeRegions(@NativeType("VkBool32") boolean value) {
        nserializeRegions(address(), value ? 1 : 0);
        return this;
    }

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM counterIndexCount(@NativeType("uint32_t") int value) {
        ncounterIndexCount(address(), value);
        return this;
    }

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pCounterIndices(@NativeType("uint32_t *") IntBuffer value) {
        npCounterIndices(address(), value);
        return this;
    }

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM set(int sType, long pNext, int counterAddressCount, LongBuffer pCounterAddresses, boolean serializeRegions, int counterIndexCount, IntBuffer pCounterIndices) {
        sType(sType);
        pNext(pNext);
        counterAddressCount(counterAddressCount);
        pCounterAddresses(pCounterAddresses);
        serializeRegions(serializeRegions);
        counterIndexCount(counterIndexCount);
        pCounterIndices(pCounterIndices);
        return this;
    }

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM set(VkRenderPassPerformanceCountersByRegionBeginInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM malloc() {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM calloc() {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM create(long address) {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(address, null);
    }

    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(address, null);
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

    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM malloc(MemoryStack stack) {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM calloc(MemoryStack stack) {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncounterAddressCount(long struct) {
        return MemoryUtil.memGetInt(struct + COUNTERADDRESSCOUNT);
    }

    public static LongBuffer npCounterAddresses(long struct, int capacity) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + PCOUNTERADDRESSES), capacity);
    }

    public static int nserializeRegions(long struct) {
        return MemoryUtil.memGetInt(struct + SERIALIZEREGIONS);
    }

    public static int ncounterIndexCount(long struct) {
        return MemoryUtil.memGetInt(struct + COUNTERINDEXCOUNT);
    }

    public static IntBuffer npCounterIndices(long struct, int capacity) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PCOUNTERINDICES), capacity);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncounterAddressCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COUNTERADDRESSCOUNT, value);
    }

    public static void npCounterAddresses(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOUNTERADDRESSES, MemoryUtil.memAddress(value));
    }

    public static void nserializeRegions(long struct, int value) {
        MemoryUtil.memPutInt(struct + SERIALIZEREGIONS, value);
    }

    public static void ncounterIndexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COUNTERINDEXCOUNT, value);
    }

    public static void npCounterIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOUNTERINDICES, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PCOUNTERADDRESSES));
        Checks.check(MemoryUtil.memGetAddress(struct + PCOUNTERINDICES));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassPerformanceCountersByRegionBeginInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassPerformanceCountersByRegionBeginInfoARM, Buffer> implements NativeResource {
        private static final VkRenderPassPerformanceCountersByRegionBeginInfoARM ELEMENT_FACTORY = VkRenderPassPerformanceCountersByRegionBeginInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassPerformanceCountersByRegionBeginInfoARM.SIZEOF);
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
        public VkRenderPassPerformanceCountersByRegionBeginInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassPerformanceCountersByRegionBeginInfoARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkRenderPassPerformanceCountersByRegionBeginInfoARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int counterAddressCount() {
            return VkRenderPassPerformanceCountersByRegionBeginInfoARM.ncounterAddressCount(address());
        }

        @NativeType("VkDeviceAddress const *")
        public LongBuffer pCounterAddresses(int capacity) {
            return VkRenderPassPerformanceCountersByRegionBeginInfoARM.npCounterAddresses(address(), capacity);
        }

        @NativeType("VkBool32")
        public boolean serializeRegions() {
            return VkRenderPassPerformanceCountersByRegionBeginInfoARM.nserializeRegions(address()) != 0;
        }

        @NativeType("uint32_t")
        public int counterIndexCount() {
            return VkRenderPassPerformanceCountersByRegionBeginInfoARM.ncounterIndexCount(address());
        }

        @NativeType("uint32_t *")
        public IntBuffer pCounterIndices(int capacity) {
            return VkRenderPassPerformanceCountersByRegionBeginInfoARM.npCounterIndices(address(), capacity);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassPerformanceCountersByRegionBeginInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkRenderPassPerformanceCountersByRegionBeginInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer counterAddressCount(@NativeType("uint32_t") int value) {
            VkRenderPassPerformanceCountersByRegionBeginInfoARM.ncounterAddressCount(address(), value);
            return this;
        }

        public Buffer pCounterAddresses(@NativeType("VkDeviceAddress const *") LongBuffer value) {
            VkRenderPassPerformanceCountersByRegionBeginInfoARM.npCounterAddresses(address(), value);
            return this;
        }

        public Buffer serializeRegions(@NativeType("VkBool32") boolean value) {
            VkRenderPassPerformanceCountersByRegionBeginInfoARM.nserializeRegions(address(), value ? 1 : 0);
            return this;
        }

        public Buffer counterIndexCount(@NativeType("uint32_t") int value) {
            VkRenderPassPerformanceCountersByRegionBeginInfoARM.ncounterIndexCount(address(), value);
            return this;
        }

        public Buffer pCounterIndices(@NativeType("uint32_t *") IntBuffer value) {
            VkRenderPassPerformanceCountersByRegionBeginInfoARM.npCounterIndices(address(), value);
            return this;
        }
    }
}
