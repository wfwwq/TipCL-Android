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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPropertiesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPropertiesNV.class */
public class VkPhysicalDeviceRayTracingPropertiesNV extends Struct<VkPhysicalDeviceRayTracingPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERGROUPHANDLESIZE;
    public static final int MAXRECURSIONDEPTH;
    public static final int MAXSHADERGROUPSTRIDE;
    public static final int SHADERGROUPBASEALIGNMENT;
    public static final int MAXGEOMETRYCOUNT;
    public static final int MAXINSTANCECOUNT;
    public static final int MAXTRIANGLECOUNT;
    public static final int MAXDESCRIPTORSETACCELERATIONSTRUCTURES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(8), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERGROUPHANDLESIZE = layout.offsetof(2);
        MAXRECURSIONDEPTH = layout.offsetof(3);
        MAXSHADERGROUPSTRIDE = layout.offsetof(4);
        SHADERGROUPBASEALIGNMENT = layout.offsetof(5);
        MAXGEOMETRYCOUNT = layout.offsetof(6);
        MAXINSTANCECOUNT = layout.offsetof(7);
        MAXTRIANGLECOUNT = layout.offsetof(8);
        MAXDESCRIPTORSETACCELERATIONSTRUCTURES = layout.offsetof(9);
    }

    protected VkPhysicalDeviceRayTracingPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRayTracingPropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingPropertiesNV(address, container);
    }

    public VkPhysicalDeviceRayTracingPropertiesNV(ByteBuffer container) {
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
    public int maxRecursionDepth() {
        return nmaxRecursionDepth(address());
    }

    @NativeType("uint32_t")
    public int maxShaderGroupStride() {
        return nmaxShaderGroupStride(address());
    }

    @NativeType("uint32_t")
    public int shaderGroupBaseAlignment() {
        return nshaderGroupBaseAlignment(address());
    }

    @NativeType("uint64_t")
    public long maxGeometryCount() {
        return nmaxGeometryCount(address());
    }

    @NativeType("uint64_t")
    public long maxInstanceCount() {
        return nmaxInstanceCount(address());
    }

    @NativeType("uint64_t")
    public long maxTriangleCount() {
        return nmaxTriangleCount(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetAccelerationStructures() {
        return nmaxDescriptorSetAccelerationStructures(address());
    }

    public VkPhysicalDeviceRayTracingPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingPropertiesNV sType$Default() {
        return sType(NVRayTracing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV);
    }

    public VkPhysicalDeviceRayTracingPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceRayTracingPropertiesNV set(VkPhysicalDeviceRayTracingPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRayTracingPropertiesNV malloc() {
        return new VkPhysicalDeviceRayTracingPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPropertiesNV calloc() {
        return new VkPhysicalDeviceRayTracingPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRayTracingPropertiesNV create(long address) {
        return new VkPhysicalDeviceRayTracingPropertiesNV(address, null);
    }

    public static VkPhysicalDeviceRayTracingPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRayTracingPropertiesNV(address, null);
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

    public static VkPhysicalDeviceRayTracingPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxRecursionDepth(long struct) {
        return MemoryUtil.memGetInt(struct + MAXRECURSIONDEPTH);
    }

    public static int nmaxShaderGroupStride(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSHADERGROUPSTRIDE);
    }

    public static int nshaderGroupBaseAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERGROUPBASEALIGNMENT);
    }

    public static long nmaxGeometryCount(long struct) {
        return MemoryUtil.memGetLong(struct + MAXGEOMETRYCOUNT);
    }

    public static long nmaxInstanceCount(long struct) {
        return MemoryUtil.memGetLong(struct + MAXINSTANCECOUNT);
    }

    public static long nmaxTriangleCount(long struct) {
        return MemoryUtil.memGetLong(struct + MAXTRIANGLECOUNT);
    }

    public static int nmaxDescriptorSetAccelerationStructures(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETACCELERATIONSTRUCTURES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPropertiesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingPropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRayTracingPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceRayTracingPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRayTracingPropertiesNV.SIZEOF);
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
        public VkPhysicalDeviceRayTracingPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRayTracingPropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRayTracingPropertiesNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int shaderGroupHandleSize() {
            return VkPhysicalDeviceRayTracingPropertiesNV.nshaderGroupHandleSize(address());
        }

        @NativeType("uint32_t")
        public int maxRecursionDepth() {
            return VkPhysicalDeviceRayTracingPropertiesNV.nmaxRecursionDepth(address());
        }

        @NativeType("uint32_t")
        public int maxShaderGroupStride() {
            return VkPhysicalDeviceRayTracingPropertiesNV.nmaxShaderGroupStride(address());
        }

        @NativeType("uint32_t")
        public int shaderGroupBaseAlignment() {
            return VkPhysicalDeviceRayTracingPropertiesNV.nshaderGroupBaseAlignment(address());
        }

        @NativeType("uint64_t")
        public long maxGeometryCount() {
            return VkPhysicalDeviceRayTracingPropertiesNV.nmaxGeometryCount(address());
        }

        @NativeType("uint64_t")
        public long maxInstanceCount() {
            return VkPhysicalDeviceRayTracingPropertiesNV.nmaxInstanceCount(address());
        }

        @NativeType("uint64_t")
        public long maxTriangleCount() {
            return VkPhysicalDeviceRayTracingPropertiesNV.nmaxTriangleCount(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetAccelerationStructures() {
            return VkPhysicalDeviceRayTracingPropertiesNV.nmaxDescriptorSetAccelerationStructures(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRayTracingPropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRayTracingPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
