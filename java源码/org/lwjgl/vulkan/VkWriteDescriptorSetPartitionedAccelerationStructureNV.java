package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetPartitionedAccelerationStructureNV.class */
public class VkWriteDescriptorSetPartitionedAccelerationStructureNV extends Struct<VkWriteDescriptorSetPartitionedAccelerationStructureNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ACCELERATIONSTRUCTURECOUNT;
    public static final int PACCELERATIONSTRUCTURES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURECOUNT = layout.offsetof(2);
        PACCELERATIONSTRUCTURES = layout.offsetof(3);
    }

    protected VkWriteDescriptorSetPartitionedAccelerationStructureNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV create(long address, ByteBuffer container) {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(address, container);
    }

    public VkWriteDescriptorSetPartitionedAccelerationStructureNV(ByteBuffer container) {
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
    public int accelerationStructureCount() {
        return naccelerationStructureCount(address());
    }

    @NativeType("VkDeviceAddress const *")
    public LongBuffer pAccelerationStructures() {
        return npAccelerationStructures(address());
    }

    public VkWriteDescriptorSetPartitionedAccelerationStructureNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkWriteDescriptorSetPartitionedAccelerationStructureNV sType$Default() {
        return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV);
    }

    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkWriteDescriptorSetPartitionedAccelerationStructureNV accelerationStructureCount(@NativeType("uint32_t") int value) {
        naccelerationStructureCount(address(), value);
        return this;
    }

    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pAccelerationStructures(@NativeType("VkDeviceAddress const *") LongBuffer value) {
        npAccelerationStructures(address(), value);
        return this;
    }

    public VkWriteDescriptorSetPartitionedAccelerationStructureNV set(int sType, long pNext, int accelerationStructureCount, LongBuffer pAccelerationStructures) {
        sType(sType);
        pNext(pNext);
        accelerationStructureCount(accelerationStructureCount);
        pAccelerationStructures(pAccelerationStructures);
        return this;
    }

    public VkWriteDescriptorSetPartitionedAccelerationStructureNV set(VkWriteDescriptorSetPartitionedAccelerationStructureNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV malloc() {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV calloc() {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(MemoryUtil.memAddress(container), container);
    }

    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV create(long address) {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(address, null);
    }

    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(address, null);
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

    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV malloc(MemoryStack stack) {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV calloc(MemoryStack stack) {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int naccelerationStructureCount(long struct) {
        return MemoryUtil.memGetInt(struct + ACCELERATIONSTRUCTURECOUNT);
    }

    public static LongBuffer npAccelerationStructures(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PACCELERATIONSTRUCTURES), naccelerationStructureCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void naccelerationStructureCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ACCELERATIONSTRUCTURECOUNT, value);
    }

    public static void npAccelerationStructures(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PACCELERATIONSTRUCTURES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            naccelerationStructureCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetPartitionedAccelerationStructureNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSetPartitionedAccelerationStructureNV, Buffer> implements NativeResource {
        private static final VkWriteDescriptorSetPartitionedAccelerationStructureNV ELEMENT_FACTORY = VkWriteDescriptorSetPartitionedAccelerationStructureNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkWriteDescriptorSetPartitionedAccelerationStructureNV.SIZEOF);
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
        public VkWriteDescriptorSetPartitionedAccelerationStructureNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkWriteDescriptorSetPartitionedAccelerationStructureNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkWriteDescriptorSetPartitionedAccelerationStructureNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int accelerationStructureCount() {
            return VkWriteDescriptorSetPartitionedAccelerationStructureNV.naccelerationStructureCount(address());
        }

        @NativeType("VkDeviceAddress const *")
        public LongBuffer pAccelerationStructures() {
            return VkWriteDescriptorSetPartitionedAccelerationStructureNV.npAccelerationStructures(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkWriteDescriptorSetPartitionedAccelerationStructureNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkWriteDescriptorSetPartitionedAccelerationStructureNV.npNext(address(), value);
            return this;
        }

        public Buffer accelerationStructureCount(@NativeType("uint32_t") int value) {
            VkWriteDescriptorSetPartitionedAccelerationStructureNV.naccelerationStructureCount(address(), value);
            return this;
        }

        public Buffer pAccelerationStructures(@NativeType("VkDeviceAddress const *") LongBuffer value) {
            VkWriteDescriptorSetPartitionedAccelerationStructureNV.npAccelerationStructures(address(), value);
            return this;
        }
    }
}
