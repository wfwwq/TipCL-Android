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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.class */
public class VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR extends Struct<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RAYTRACINGMAINTENANCE1;
    public static final int RAYTRACINGPIPELINETRACERAYSINDIRECT2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RAYTRACINGMAINTENANCE1 = layout.offsetof(2);
        RAYTRACINGPIPELINETRACERAYSINDIRECT2 = layout.offsetof(3);
    }

    protected VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(ByteBuffer container) {
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
    public boolean rayTracingMaintenance1() {
        return nrayTracingMaintenance1(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean rayTracingPipelineTraceRaysIndirect2() {
        return nrayTracingPipelineTraceRaysIndirect2(address()) != 0;
    }

    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR sType$Default() {
        return sType(1000386000);
    }

    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingMaintenance1(@NativeType("VkBool32") boolean value) {
        nrayTracingMaintenance1(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingPipelineTraceRaysIndirect2(@NativeType("VkBool32") boolean value) {
        nrayTracingPipelineTraceRaysIndirect2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR set(int sType, long pNext, boolean rayTracingMaintenance1, boolean rayTracingPipelineTraceRaysIndirect2) {
        sType(sType);
        pNext(pNext);
        rayTracingMaintenance1(rayTracingMaintenance1);
        rayTracingPipelineTraceRaysIndirect2(rayTracingPipelineTraceRaysIndirect2);
        return this;
    }

    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR set(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR malloc() {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR calloc() {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR create(long address) {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrayTracingMaintenance1(long struct) {
        return MemoryUtil.memGetInt(struct + RAYTRACINGMAINTENANCE1);
    }

    public static int nrayTracingPipelineTraceRaysIndirect2(long struct) {
        return MemoryUtil.memGetInt(struct + RAYTRACINGPIPELINETRACERAYSINDIRECT2);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrayTracingMaintenance1(long struct, int value) {
        MemoryUtil.memPutInt(struct + RAYTRACINGMAINTENANCE1, value);
    }

    public static void nrayTracingPipelineTraceRaysIndirect2(long struct, int value) {
        MemoryUtil.memPutInt(struct + RAYTRACINGPIPELINETRACERAYSINDIRECT2, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean rayTracingMaintenance1() {
            return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nrayTracingMaintenance1(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean rayTracingPipelineTraceRaysIndirect2() {
            return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nrayTracingPipelineTraceRaysIndirect2(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000386000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer rayTracingMaintenance1(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nrayTracingMaintenance1(address(), value ? 1 : 0);
            return this;
        }

        public Buffer rayTracingPipelineTraceRaysIndirect2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nrayTracingPipelineTraceRaysIndirect2(address(), value ? 1 : 0);
            return this;
        }
    }
}
