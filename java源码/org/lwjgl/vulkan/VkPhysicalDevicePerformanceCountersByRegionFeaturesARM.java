package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.class */
public class VkPhysicalDevicePerformanceCountersByRegionFeaturesARM extends Struct<VkPhysicalDevicePerformanceCountersByRegionFeaturesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PERFORMANCECOUNTERSBYREGION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERFORMANCECOUNTERSBYREGION = layout.offsetof(2);
    }

    protected VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(address, container);
    }

    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean performanceCountersByRegion() {
        return nperformanceCountersByRegion(address()) != 0;
    }

    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM sType$Default() {
        return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM);
    }

    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM performanceCountersByRegion(@NativeType("VkBool32") boolean value) {
        nperformanceCountersByRegion(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM set(int sType, long pNext, boolean performanceCountersByRegion) {
        sType(sType);
        pNext(pNext);
        performanceCountersByRegion(performanceCountersByRegion);
        return this;
    }

    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM set(VkPhysicalDevicePerformanceCountersByRegionFeaturesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM malloc() {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM calloc() {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM create(long address) {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(address, null);
    }

    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(address, null);
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

    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nperformanceCountersByRegion(long struct) {
        return MemoryUtil.memGetInt(struct + PERFORMANCECOUNTERSBYREGION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nperformanceCountersByRegion(long struct, int value) {
        MemoryUtil.memPutInt(struct + PERFORMANCECOUNTERSBYREGION, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePerformanceCountersByRegionFeaturesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePerformanceCountersByRegionFeaturesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePerformanceCountersByRegionFeaturesARM ELEMENT_FACTORY = VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.SIZEOF);
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
        public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean performanceCountersByRegion() {
            return VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.nperformanceCountersByRegion(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.npNext(address(), value);
            return this;
        }

        public Buffer performanceCountersByRegion(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.nperformanceCountersByRegion(address(), value ? 1 : 0);
            return this;
        }
    }
}
