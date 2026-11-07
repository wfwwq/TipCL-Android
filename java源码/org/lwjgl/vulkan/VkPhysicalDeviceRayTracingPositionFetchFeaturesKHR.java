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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.class */
public class VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR extends Struct<VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RAYTRACINGPOSITIONFETCH;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RAYTRACINGPOSITIONFETCH = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(ByteBuffer container) {
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
    public boolean rayTracingPositionFetch() {
        return nrayTracingPositionFetch(address()) != 0;
    }

    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR sType$Default() {
        return sType(KHRRayTracingPositionFetch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR);
    }

    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR rayTracingPositionFetch(@NativeType("VkBool32") boolean value) {
        nrayTracingPositionFetch(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR set(int sType, long pNext, boolean rayTracingPositionFetch) {
        sType(sType);
        pNext(pNext);
        rayTracingPositionFetch(rayTracingPositionFetch);
        return this;
    }

    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR set(VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR malloc() {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR calloc() {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR create(long address) {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrayTracingPositionFetch(long struct) {
        return MemoryUtil.memGetInt(struct + RAYTRACINGPOSITIONFETCH);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrayTracingPositionFetch(long struct, int value) {
        MemoryUtil.memPutInt(struct + RAYTRACINGPOSITIONFETCH, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean rayTracingPositionFetch() {
            return VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.nrayTracingPositionFetch(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRRayTracingPositionFetch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer rayTracingPositionFetch(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR.nrayTracingPositionFetch(address(), value ? 1 : 0);
            return this;
        }
    }
}
