package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureInstancesInputNV.class */
public class VkPartitionedAccelerationStructureInstancesInputNV extends Struct<VkPartitionedAccelerationStructureInstancesInputNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int INSTANCECOUNT;
    public static final int MAXINSTANCEPERPARTITIONCOUNT;
    public static final int PARTITIONCOUNT;
    public static final int MAXINSTANCEINGLOBALPARTITIONCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        INSTANCECOUNT = layout.offsetof(3);
        MAXINSTANCEPERPARTITIONCOUNT = layout.offsetof(4);
        PARTITIONCOUNT = layout.offsetof(5);
        MAXINSTANCEINGLOBALPARTITIONCOUNT = layout.offsetof(6);
    }

    protected VkPartitionedAccelerationStructureInstancesInputNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPartitionedAccelerationStructureInstancesInputNV create(long address, ByteBuffer container) {
        return new VkPartitionedAccelerationStructureInstancesInputNV(address, container);
    }

    public VkPartitionedAccelerationStructureInstancesInputNV(ByteBuffer container) {
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

    @NativeType("VkBuildAccelerationStructureFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int instanceCount() {
        return ninstanceCount(address());
    }

    @NativeType("uint32_t")
    public int maxInstancePerPartitionCount() {
        return nmaxInstancePerPartitionCount(address());
    }

    @NativeType("uint32_t")
    public int partitionCount() {
        return npartitionCount(address());
    }

    @NativeType("uint32_t")
    public int maxInstanceInGlobalPartitionCount() {
        return nmaxInstanceInGlobalPartitionCount(address());
    }

    public VkPartitionedAccelerationStructureInstancesInputNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureInstancesInputNV sType$Default() {
        return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV);
    }

    public VkPartitionedAccelerationStructureInstancesInputNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureInstancesInputNV pNext(VkPartitionedAccelerationStructureFlagsNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPartitionedAccelerationStructureInstancesInputNV flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureInstancesInputNV instanceCount(@NativeType("uint32_t") int value) {
        ninstanceCount(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureInstancesInputNV maxInstancePerPartitionCount(@NativeType("uint32_t") int value) {
        nmaxInstancePerPartitionCount(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureInstancesInputNV partitionCount(@NativeType("uint32_t") int value) {
        npartitionCount(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureInstancesInputNV maxInstanceInGlobalPartitionCount(@NativeType("uint32_t") int value) {
        nmaxInstanceInGlobalPartitionCount(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureInstancesInputNV set(int sType, long pNext, int flags, int instanceCount, int maxInstancePerPartitionCount, int partitionCount, int maxInstanceInGlobalPartitionCount) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        instanceCount(instanceCount);
        maxInstancePerPartitionCount(maxInstancePerPartitionCount);
        partitionCount(partitionCount);
        maxInstanceInGlobalPartitionCount(maxInstanceInGlobalPartitionCount);
        return this;
    }

    public VkPartitionedAccelerationStructureInstancesInputNV set(VkPartitionedAccelerationStructureInstancesInputNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPartitionedAccelerationStructureInstancesInputNV malloc() {
        return new VkPartitionedAccelerationStructureInstancesInputNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureInstancesInputNV calloc() {
        return new VkPartitionedAccelerationStructureInstancesInputNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureInstancesInputNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPartitionedAccelerationStructureInstancesInputNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPartitionedAccelerationStructureInstancesInputNV create(long address) {
        return new VkPartitionedAccelerationStructureInstancesInputNV(address, null);
    }

    public static VkPartitionedAccelerationStructureInstancesInputNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPartitionedAccelerationStructureInstancesInputNV(address, null);
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

    public static VkPartitionedAccelerationStructureInstancesInputNV malloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureInstancesInputNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureInstancesInputNV calloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureInstancesInputNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int ninstanceCount(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCECOUNT);
    }

    public static int nmaxInstancePerPartitionCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINSTANCEPERPARTITIONCOUNT);
    }

    public static int npartitionCount(long struct) {
        return MemoryUtil.memGetInt(struct + PARTITIONCOUNT);
    }

    public static int nmaxInstanceInGlobalPartitionCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINSTANCEINGLOBALPARTITIONCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ninstanceCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCECOUNT, value);
    }

    public static void nmaxInstancePerPartitionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXINSTANCEPERPARTITIONCOUNT, value);
    }

    public static void npartitionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PARTITIONCOUNT, value);
    }

    public static void nmaxInstanceInGlobalPartitionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXINSTANCEINGLOBALPARTITIONCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureInstancesInputNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPartitionedAccelerationStructureInstancesInputNV, Buffer> implements NativeResource {
        private static final VkPartitionedAccelerationStructureInstancesInputNV ELEMENT_FACTORY = VkPartitionedAccelerationStructureInstancesInputNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF);
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
        public VkPartitionedAccelerationStructureInstancesInputNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPartitionedAccelerationStructureInstancesInputNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPartitionedAccelerationStructureInstancesInputNV.npNext(address());
        }

        @NativeType("VkBuildAccelerationStructureFlagsKHR")
        public int flags() {
            return VkPartitionedAccelerationStructureInstancesInputNV.nflags(address());
        }

        @NativeType("uint32_t")
        public int instanceCount() {
            return VkPartitionedAccelerationStructureInstancesInputNV.ninstanceCount(address());
        }

        @NativeType("uint32_t")
        public int maxInstancePerPartitionCount() {
            return VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstancePerPartitionCount(address());
        }

        @NativeType("uint32_t")
        public int partitionCount() {
            return VkPartitionedAccelerationStructureInstancesInputNV.npartitionCount(address());
        }

        @NativeType("uint32_t")
        public int maxInstanceInGlobalPartitionCount() {
            return VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstanceInGlobalPartitionCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPartitionedAccelerationStructureInstancesInputNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPartitionedAccelerationStructureInstancesInputNV.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPartitionedAccelerationStructureFlagsNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) {
            VkPartitionedAccelerationStructureInstancesInputNV.nflags(address(), value);
            return this;
        }

        public Buffer instanceCount(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureInstancesInputNV.ninstanceCount(address(), value);
            return this;
        }

        public Buffer maxInstancePerPartitionCount(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstancePerPartitionCount(address(), value);
            return this;
        }

        public Buffer partitionCount(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureInstancesInputNV.npartitionCount(address(), value);
            return this;
        }

        public Buffer maxInstanceInGlobalPartitionCount(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstanceInGlobalPartitionCount(address(), value);
            return this;
        }
    }
}
