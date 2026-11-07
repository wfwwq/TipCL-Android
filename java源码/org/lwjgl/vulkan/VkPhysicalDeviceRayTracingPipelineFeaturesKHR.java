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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelineFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelineFeaturesKHR.class */
public class VkPhysicalDeviceRayTracingPipelineFeaturesKHR extends Struct<VkPhysicalDeviceRayTracingPipelineFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RAYTRACINGPIPELINE;
    public static final int RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAY;
    public static final int RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAYMIXED;
    public static final int RAYTRACINGPIPELINETRACERAYSINDIRECT;
    public static final int RAYTRAVERSALPRIMITIVECULLING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RAYTRACINGPIPELINE = layout.offsetof(2);
        RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAY = layout.offsetof(3);
        RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAYMIXED = layout.offsetof(4);
        RAYTRACINGPIPELINETRACERAYSINDIRECT = layout.offsetof(5);
        RAYTRAVERSALPRIMITIVECULLING = layout.offsetof(6);
    }

    protected VkPhysicalDeviceRayTracingPipelineFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR(ByteBuffer container) {
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
    public boolean rayTracingPipeline() {
        return nrayTracingPipeline(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean rayTracingPipelineShaderGroupHandleCaptureReplay() {
        return nrayTracingPipelineShaderGroupHandleCaptureReplay(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean rayTracingPipelineShaderGroupHandleCaptureReplayMixed() {
        return nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean rayTracingPipelineTraceRaysIndirect() {
        return nrayTracingPipelineTraceRaysIndirect(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean rayTraversalPrimitiveCulling() {
        return nrayTraversalPrimitiveCulling(address()) != 0;
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sType$Default() {
        return sType(1000347000);
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipeline(@NativeType("VkBool32") boolean value) {
        nrayTracingPipeline(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplay(@NativeType("VkBool32") boolean value) {
        nrayTracingPipelineShaderGroupHandleCaptureReplay(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplayMixed(@NativeType("VkBool32") boolean value) {
        nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineTraceRaysIndirect(@NativeType("VkBool32") boolean value) {
        nrayTracingPipelineTraceRaysIndirect(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTraversalPrimitiveCulling(@NativeType("VkBool32") boolean value) {
        nrayTraversalPrimitiveCulling(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR set(int sType, long pNext, boolean rayTracingPipeline, boolean rayTracingPipelineShaderGroupHandleCaptureReplay, boolean rayTracingPipelineShaderGroupHandleCaptureReplayMixed, boolean rayTracingPipelineTraceRaysIndirect, boolean rayTraversalPrimitiveCulling) {
        sType(sType);
        pNext(pNext);
        rayTracingPipeline(rayTracingPipeline);
        rayTracingPipelineShaderGroupHandleCaptureReplay(rayTracingPipelineShaderGroupHandleCaptureReplay);
        rayTracingPipelineShaderGroupHandleCaptureReplayMixed(rayTracingPipelineShaderGroupHandleCaptureReplayMixed);
        rayTracingPipelineTraceRaysIndirect(rayTracingPipelineTraceRaysIndirect);
        rayTraversalPrimitiveCulling(rayTraversalPrimitiveCulling);
        return this;
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR set(VkPhysicalDeviceRayTracingPipelineFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR malloc() {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR calloc() {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR create(long address) {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrayTracingPipeline(long struct) {
        return MemoryUtil.memGetInt(struct + RAYTRACINGPIPELINE);
    }

    public static int nrayTracingPipelineShaderGroupHandleCaptureReplay(long struct) {
        return MemoryUtil.memGetInt(struct + RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAY);
    }

    public static int nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(long struct) {
        return MemoryUtil.memGetInt(struct + RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAYMIXED);
    }

    public static int nrayTracingPipelineTraceRaysIndirect(long struct) {
        return MemoryUtil.memGetInt(struct + RAYTRACINGPIPELINETRACERAYSINDIRECT);
    }

    public static int nrayTraversalPrimitiveCulling(long struct) {
        return MemoryUtil.memGetInt(struct + RAYTRAVERSALPRIMITIVECULLING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrayTracingPipeline(long struct, int value) {
        MemoryUtil.memPutInt(struct + RAYTRACINGPIPELINE, value);
    }

    public static void nrayTracingPipelineShaderGroupHandleCaptureReplay(long struct, int value) {
        MemoryUtil.memPutInt(struct + RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAY, value);
    }

    public static void nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(long struct, int value) {
        MemoryUtil.memPutInt(struct + RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAYMIXED, value);
    }

    public static void nrayTracingPipelineTraceRaysIndirect(long struct, int value) {
        MemoryUtil.memPutInt(struct + RAYTRACINGPIPELINETRACERAYSINDIRECT, value);
    }

    public static void nrayTraversalPrimitiveCulling(long struct, int value) {
        MemoryUtil.memPutInt(struct + RAYTRAVERSALPRIMITIVECULLING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelineFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelineFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingPipelineFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRayTracingPipelineFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceRayTracingPipelineFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRayTracingPipelineFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean rayTracingPipeline() {
            return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipeline(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean rayTracingPipelineShaderGroupHandleCaptureReplay() {
            return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplay(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean rayTracingPipelineShaderGroupHandleCaptureReplayMixed() {
            return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean rayTracingPipelineTraceRaysIndirect() {
            return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineTraceRaysIndirect(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean rayTraversalPrimitiveCulling() {
            return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTraversalPrimitiveCulling(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000347000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRayTracingPipelineFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer rayTracingPipeline(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipeline(address(), value ? 1 : 0);
            return this;
        }

        public Buffer rayTracingPipelineShaderGroupHandleCaptureReplay(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplay(address(), value ? 1 : 0);
            return this;
        }

        public Buffer rayTracingPipelineShaderGroupHandleCaptureReplayMixed(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address(), value ? 1 : 0);
            return this;
        }

        public Buffer rayTracingPipelineTraceRaysIndirect(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineTraceRaysIndirect(address(), value ? 1 : 0);
            return this;
        }

        public Buffer rayTraversalPrimitiveCulling(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTraversalPrimitiveCulling(address(), value ? 1 : 0);
            return this;
        }
    }
}
