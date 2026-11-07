package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.class */
public class VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV extends Struct<VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PARTITIONEDACCELERATIONSTRUCTURE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PARTITIONEDACCELERATIONSTRUCTURE = layout.offsetof(2);
    }

    protected VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(address, container);
    }

    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(ByteBuffer container) {
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
    public boolean partitionedAccelerationStructure() {
        return npartitionedAccelerationStructure(address()) != 0;
    }

    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV sType$Default() {
        return sType(1000570000);
    }

    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV partitionedAccelerationStructure(@NativeType("VkBool32") boolean value) {
        npartitionedAccelerationStructure(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV set(int sType, long pNext, boolean partitionedAccelerationStructure) {
        sType(sType);
        pNext(pNext);
        partitionedAccelerationStructure(partitionedAccelerationStructure);
        return this;
    }

    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV set(VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV malloc() {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV calloc() {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV create(long address) {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(address, null);
    }

    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(address, null);
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

    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npartitionedAccelerationStructure(long struct) {
        return MemoryUtil.memGetInt(struct + PARTITIONEDACCELERATIONSTRUCTURE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npartitionedAccelerationStructure(long struct, int value) {
        MemoryUtil.memPutInt(struct + PARTITIONEDACCELERATIONSTRUCTURE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV ELEMENT_FACTORY = VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.SIZEOF);
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
        public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean partitionedAccelerationStructure() {
            return VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.npartitionedAccelerationStructure(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000570000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer partitionedAccelerationStructure(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.npartitionedAccelerationStructure(address(), value ? 1 : 0);
            return this;
        }
    }
}
