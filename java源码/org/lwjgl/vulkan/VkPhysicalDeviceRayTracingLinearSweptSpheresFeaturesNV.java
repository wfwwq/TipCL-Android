package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.class */
public class VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV extends Struct<VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SPHERES;
    public static final int LINEARSWEPTSPHERES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SPHERES = layout.offsetof(2);
        LINEARSWEPTSPHERES = layout.offsetof(3);
    }

    protected VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(address, container);
    }

    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(ByteBuffer container) {
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
    public boolean spheres() {
        return nspheres(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean linearSweptSpheres() {
        return nlinearSweptSpheres(address()) != 0;
    }

    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV sType$Default() {
        return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV);
    }

    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV spheres(@NativeType("VkBool32") boolean value) {
        nspheres(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV linearSweptSpheres(@NativeType("VkBool32") boolean value) {
        nlinearSweptSpheres(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV set(int sType, long pNext, boolean spheres, boolean linearSweptSpheres) {
        sType(sType);
        pNext(pNext);
        spheres(spheres);
        linearSweptSpheres(linearSweptSpheres);
        return this;
    }

    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV set(VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV malloc() {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV calloc() {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV create(long address) {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(address, null);
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

    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nspheres(long struct) {
        return MemoryUtil.memGetInt(struct + SPHERES);
    }

    public static int nlinearSweptSpheres(long struct) {
        return MemoryUtil.memGetInt(struct + LINEARSWEPTSPHERES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nspheres(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPHERES, value);
    }

    public static void nlinearSweptSpheres(long struct, int value) {
        MemoryUtil.memPutInt(struct + LINEARSWEPTSPHERES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean spheres() {
            return VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nspheres(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean linearSweptSpheres() {
            return VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nlinearSweptSpheres(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer spheres(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nspheres(address(), value ? 1 : 0);
            return this;
        }

        public Buffer linearSweptSpheres(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV.nlinearSweptSpheres(address(), value ? 1 : 0);
            return this;
        }
    }
}
