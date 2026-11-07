package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.class */
public class VkPhysicalDeviceClusterAccelerationStructureFeaturesNV extends Struct<VkPhysicalDeviceClusterAccelerationStructureFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CLUSTERACCELERATIONSTRUCTURE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CLUSTERACCELERATIONSTRUCTURE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(address, container);
    }

    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(ByteBuffer container) {
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
    public boolean clusterAccelerationStructure() {
        return nclusterAccelerationStructure(address()) != 0;
    }

    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV sType$Default() {
        return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV);
    }

    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV clusterAccelerationStructure(@NativeType("VkBool32") boolean value) {
        nclusterAccelerationStructure(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV set(int sType, long pNext, boolean clusterAccelerationStructure) {
        sType(sType);
        pNext(pNext);
        clusterAccelerationStructure(clusterAccelerationStructure);
        return this;
    }

    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV set(VkPhysicalDeviceClusterAccelerationStructureFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV malloc() {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV calloc() {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV create(long address) {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(address, null);
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

    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nclusterAccelerationStructure(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERACCELERATIONSTRUCTURE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nclusterAccelerationStructure(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLUSTERACCELERATIONSTRUCTURE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterAccelerationStructureFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceClusterAccelerationStructureFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceClusterAccelerationStructureFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean clusterAccelerationStructure() {
            return VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.nclusterAccelerationStructure(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer clusterAccelerationStructure(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.nclusterAccelerationStructure(address(), value ? 1 : 0);
            return this;
        }
    }
}
