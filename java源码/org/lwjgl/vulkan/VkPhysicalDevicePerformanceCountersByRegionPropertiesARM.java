package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.class */
public class VkPhysicalDevicePerformanceCountersByRegionPropertiesARM extends Struct<VkPhysicalDevicePerformanceCountersByRegionPropertiesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXPERREGIONPERFORMANCECOUNTERS;
    public static final int PERFORMANCECOUNTERREGIONSIZE;
    public static final int ROWSTRIDEALIGNMENT;
    public static final int REGIONALIGNMENT;
    public static final int IDENTITYTRANSFORMORDER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXPERREGIONPERFORMANCECOUNTERS = layout.offsetof(2);
        PERFORMANCECOUNTERREGIONSIZE = layout.offsetof(3);
        ROWSTRIDEALIGNMENT = layout.offsetof(4);
        REGIONALIGNMENT = layout.offsetof(5);
        IDENTITYTRANSFORMORDER = layout.offsetof(6);
    }

    protected VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(address, container);
    }

    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(ByteBuffer container) {
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
    public int maxPerRegionPerformanceCounters() {
        return nmaxPerRegionPerformanceCounters(address());
    }

    public VkExtent2D performanceCounterRegionSize() {
        return nperformanceCounterRegionSize(address());
    }

    @NativeType("uint32_t")
    public int rowStrideAlignment() {
        return nrowStrideAlignment(address());
    }

    @NativeType("uint32_t")
    public int regionAlignment() {
        return nregionAlignment(address());
    }

    @NativeType("VkBool32")
    public boolean identityTransformOrder() {
        return nidentityTransformOrder(address()) != 0;
    }

    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM sType$Default() {
        return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_PROPERTIES_ARM);
    }

    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM set(VkPhysicalDevicePerformanceCountersByRegionPropertiesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM malloc() {
        return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM calloc() {
        return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM create(long address) {
        return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(address, null);
    }

    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(address, null);
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

    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxPerRegionPerformanceCounters(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERREGIONPERFORMANCECOUNTERS);
    }

    public static VkExtent2D nperformanceCounterRegionSize(long struct) {
        return VkExtent2D.create(struct + PERFORMANCECOUNTERREGIONSIZE);
    }

    public static int nrowStrideAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + ROWSTRIDEALIGNMENT);
    }

    public static int nregionAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + REGIONALIGNMENT);
    }

    public static int nidentityTransformOrder(long struct) {
        return MemoryUtil.memGetInt(struct + IDENTITYTRANSFORMORDER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePerformanceCountersByRegionPropertiesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePerformanceCountersByRegionPropertiesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePerformanceCountersByRegionPropertiesARM ELEMENT_FACTORY = VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.SIZEOF);
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
        public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxPerRegionPerformanceCounters() {
            return VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.nmaxPerRegionPerformanceCounters(address());
        }

        public VkExtent2D performanceCounterRegionSize() {
            return VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.nperformanceCounterRegionSize(address());
        }

        @NativeType("uint32_t")
        public int rowStrideAlignment() {
            return VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.nrowStrideAlignment(address());
        }

        @NativeType("uint32_t")
        public int regionAlignment() {
            return VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.nregionAlignment(address());
        }

        @NativeType("VkBool32")
        public boolean identityTransformOrder() {
            return VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.nidentityTransformOrder(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_PROPERTIES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePerformanceCountersByRegionPropertiesARM.npNext(address(), value);
            return this;
        }
    }
}
