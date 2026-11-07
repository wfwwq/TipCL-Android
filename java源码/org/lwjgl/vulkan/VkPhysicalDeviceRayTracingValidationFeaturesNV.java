package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingValidationFeaturesNV.class */
public class VkPhysicalDeviceRayTracingValidationFeaturesNV extends Struct<VkPhysicalDeviceRayTracingValidationFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RAYTRACINGVALIDATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RAYTRACINGVALIDATION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRayTracingValidationFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRayTracingValidationFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(address, container);
    }

    public VkPhysicalDeviceRayTracingValidationFeaturesNV(ByteBuffer container) {
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
    public boolean rayTracingValidation() {
        return nrayTracingValidation(address()) != 0;
    }

    public VkPhysicalDeviceRayTracingValidationFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingValidationFeaturesNV sType$Default() {
        return sType(NVRayTracingValidation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV);
    }

    public VkPhysicalDeviceRayTracingValidationFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingValidationFeaturesNV rayTracingValidation(@NativeType("VkBool32") boolean value) {
        nrayTracingValidation(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRayTracingValidationFeaturesNV set(int sType, long pNext, boolean rayTracingValidation) {
        sType(sType);
        pNext(pNext);
        rayTracingValidation(rayTracingValidation);
        return this;
    }

    public VkPhysicalDeviceRayTracingValidationFeaturesNV set(VkPhysicalDeviceRayTracingValidationFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRayTracingValidationFeaturesNV malloc() {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingValidationFeaturesNV calloc() {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingValidationFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRayTracingValidationFeaturesNV create(long address) {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceRayTracingValidationFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(address, null);
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

    public static VkPhysicalDeviceRayTracingValidationFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingValidationFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingValidationFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrayTracingValidation(long struct) {
        return MemoryUtil.memGetInt(struct + RAYTRACINGVALIDATION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrayTracingValidation(long struct, int value) {
        MemoryUtil.memPutInt(struct + RAYTRACINGVALIDATION, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingValidationFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingValidationFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRayTracingValidationFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceRayTracingValidationFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRayTracingValidationFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceRayTracingValidationFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRayTracingValidationFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRayTracingValidationFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean rayTracingValidation() {
            return VkPhysicalDeviceRayTracingValidationFeaturesNV.nrayTracingValidation(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRayTracingValidationFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracingValidation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRayTracingValidationFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer rayTracingValidation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRayTracingValidationFeaturesNV.nrayTracingValidation(address(), value ? 1 : 0);
            return this;
        }
    }
}
