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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePerformanceQueryFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePerformanceQueryFeaturesKHR.class */
public class VkPhysicalDevicePerformanceQueryFeaturesKHR extends Struct<VkPhysicalDevicePerformanceQueryFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PERFORMANCECOUNTERQUERYPOOLS;
    public static final int PERFORMANCECOUNTERMULTIPLEQUERYPOOLS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERFORMANCECOUNTERQUERYPOOLS = layout.offsetof(2);
        PERFORMANCECOUNTERMULTIPLEQUERYPOOLS = layout.offsetof(3);
    }

    protected VkPhysicalDevicePerformanceQueryFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePerformanceQueryFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(address, container);
    }

    public VkPhysicalDevicePerformanceQueryFeaturesKHR(ByteBuffer container) {
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
    public boolean performanceCounterQueryPools() {
        return nperformanceCounterQueryPools(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean performanceCounterMultipleQueryPools() {
        return nperformanceCounterMultipleQueryPools(address()) != 0;
    }

    public VkPhysicalDevicePerformanceQueryFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePerformanceQueryFeaturesKHR sType$Default() {
        return sType(1000116000);
    }

    public VkPhysicalDevicePerformanceQueryFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterQueryPools(@NativeType("VkBool32") boolean value) {
        nperformanceCounterQueryPools(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterMultipleQueryPools(@NativeType("VkBool32") boolean value) {
        nperformanceCounterMultipleQueryPools(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePerformanceQueryFeaturesKHR set(int sType, long pNext, boolean performanceCounterQueryPools, boolean performanceCounterMultipleQueryPools) {
        sType(sType);
        pNext(pNext);
        performanceCounterQueryPools(performanceCounterQueryPools);
        performanceCounterMultipleQueryPools(performanceCounterMultipleQueryPools);
        return this;
    }

    public VkPhysicalDevicePerformanceQueryFeaturesKHR set(VkPhysicalDevicePerformanceQueryFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR malloc() {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR calloc() {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR create(long address) {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(address, null);
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(address, null);
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

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePerformanceQueryFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nperformanceCounterQueryPools(long struct) {
        return MemoryUtil.memGetInt(struct + PERFORMANCECOUNTERQUERYPOOLS);
    }

    public static int nperformanceCounterMultipleQueryPools(long struct) {
        return MemoryUtil.memGetInt(struct + PERFORMANCECOUNTERMULTIPLEQUERYPOOLS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nperformanceCounterQueryPools(long struct, int value) {
        MemoryUtil.memPutInt(struct + PERFORMANCECOUNTERQUERYPOOLS, value);
    }

    public static void nperformanceCounterMultipleQueryPools(long struct, int value) {
        MemoryUtil.memPutInt(struct + PERFORMANCECOUNTERMULTIPLEQUERYPOOLS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePerformanceQueryFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePerformanceQueryFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePerformanceQueryFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePerformanceQueryFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePerformanceQueryFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePerformanceQueryFeaturesKHR.SIZEOF);
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
        public VkPhysicalDevicePerformanceQueryFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePerformanceQueryFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePerformanceQueryFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean performanceCounterQueryPools() {
            return VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterQueryPools(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean performanceCounterMultipleQueryPools() {
            return VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterMultipleQueryPools(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePerformanceQueryFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000116000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePerformanceQueryFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer performanceCounterQueryPools(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterQueryPools(address(), value ? 1 : 0);
            return this;
        }

        public Buffer performanceCounterMultipleQueryPools(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterMultipleQueryPools(address(), value ? 1 : 0);
            return this;
        }
    }
}
