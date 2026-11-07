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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class */
public class VkPhysicalDeviceRayTracingPipelinePropertiesKHR extends Struct<VkPhysicalDeviceRayTracingPipelinePropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERGROUPHANDLESIZE;
    public static final int MAXRAYRECURSIONDEPTH;
    public static final int MAXSHADERGROUPSTRIDE;
    public static final int SHADERGROUPBASEALIGNMENT;
    public static final int SHADERGROUPHANDLECAPTUREREPLAYSIZE;
    public static final int MAXRAYDISPATCHINVOCATIONCOUNT;
    public static final int SHADERGROUPHANDLEALIGNMENT;
    public static final int MAXRAYHITATTRIBUTESIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERGROUPHANDLESIZE = layout.offsetof(2);
        MAXRAYRECURSIONDEPTH = layout.offsetof(3);
        MAXSHADERGROUPSTRIDE = layout.offsetof(4);
        SHADERGROUPBASEALIGNMENT = layout.offsetof(5);
        SHADERGROUPHANDLECAPTUREREPLAYSIZE = layout.offsetof(6);
        MAXRAYDISPATCHINVOCATIONCOUNT = layout.offsetof(7);
        SHADERGROUPHANDLEALIGNMENT = layout.offsetof(8);
        MAXRAYHITATTRIBUTESIZE = layout.offsetof(9);
    }

    protected VkPhysicalDeviceRayTracingPipelinePropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(address, container);
    }

    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR(ByteBuffer container) {
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
    public int shaderGroupHandleSize() {
        return nshaderGroupHandleSize(address());
    }

    @NativeType("uint32_t")
    public int maxRayRecursionDepth() {
        return nmaxRayRecursionDepth(address());
    }

    @NativeType("uint32_t")
    public int maxShaderGroupStride() {
        return nmaxShaderGroupStride(address());
    }

    @NativeType("uint32_t")
    public int shaderGroupBaseAlignment() {
        return nshaderGroupBaseAlignment(address());
    }

    @NativeType("uint32_t")
    public int shaderGroupHandleCaptureReplaySize() {
        return nshaderGroupHandleCaptureReplaySize(address());
    }

    @NativeType("uint32_t")
    public int maxRayDispatchInvocationCount() {
        return nmaxRayDispatchInvocationCount(address());
    }

    @NativeType("uint32_t")
    public int shaderGroupHandleAlignment() {
        return nshaderGroupHandleAlignment(address());
    }

    @NativeType("uint32_t")
    public int maxRayHitAttributeSize() {
        return nmaxRayHitAttributeSize(address());
    }

    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType$Default() {
        return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR);
    }

    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR set(VkPhysicalDeviceRayTracingPipelinePropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR malloc() {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR calloc() {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR create(long address) {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(address, null);
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

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderGroupHandleSize(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERGROUPHANDLESIZE);
    }

    public static int nmaxRayRecursionDepth(long struct) {
        return MemoryUtil.memGetInt(struct + MAXRAYRECURSIONDEPTH);
    }

    public static int nmaxShaderGroupStride(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSHADERGROUPSTRIDE);
    }

    public static int nshaderGroupBaseAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERGROUPBASEALIGNMENT);
    }

    public static int nshaderGroupHandleCaptureReplaySize(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERGROUPHANDLECAPTUREREPLAYSIZE);
    }

    public static int nmaxRayDispatchInvocationCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXRAYDISPATCHINVOCATIONCOUNT);
    }

    public static int nshaderGroupHandleAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERGROUPHANDLEALIGNMENT);
    }

    public static int nmaxRayHitAttributeSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXRAYHITATTRIBUTESIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingPipelinePropertiesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRayTracingPipelinePropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceRayTracingPipelinePropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF);
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
        public VkPhysicalDeviceRayTracingPipelinePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int shaderGroupHandleSize() {
            return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleSize(address());
        }

        @NativeType("uint32_t")
        public int maxRayRecursionDepth() {
            return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayRecursionDepth(address());
        }

        @NativeType("uint32_t")
        public int maxShaderGroupStride() {
            return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxShaderGroupStride(address());
        }

        @NativeType("uint32_t")
        public int shaderGroupBaseAlignment() {
            return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupBaseAlignment(address());
        }

        @NativeType("uint32_t")
        public int shaderGroupHandleCaptureReplaySize() {
            return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleCaptureReplaySize(address());
        }

        @NativeType("uint32_t")
        public int maxRayDispatchInvocationCount() {
            return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayDispatchInvocationCount(address());
        }

        @NativeType("uint32_t")
        public int shaderGroupHandleAlignment() {
            return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleAlignment(address());
        }

        @NativeType("uint32_t")
        public int maxRayHitAttributeSize() {
            return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayHitAttributeSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRayTracingPipelinePropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
