package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureWriteInstanceDataNV.class */
public class VkPartitionedAccelerationStructureWriteInstanceDataNV extends Struct<VkPartitionedAccelerationStructureWriteInstanceDataNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TRANSFORM;
    public static final int EXPLICITAABB;
    public static final int INSTANCEID;
    public static final int INSTANCEMASK;
    public static final int INSTANCECONTRIBUTIONTOHITGROUPINDEX;
    public static final int INSTANCEFLAGS;
    public static final int INSTANCEINDEX;
    public static final int PARTITIONINDEX;
    public static final int ACCELERATIONSTRUCTURE;

    static {
        Struct.Layout layout = __struct(__member(VkTransformMatrixKHR.SIZEOF, VkTransformMatrixKHR.ALIGNOF), __array(4, 6), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TRANSFORM = layout.offsetof(0);
        EXPLICITAABB = layout.offsetof(1);
        INSTANCEID = layout.offsetof(2);
        INSTANCEMASK = layout.offsetof(3);
        INSTANCECONTRIBUTIONTOHITGROUPINDEX = layout.offsetof(4);
        INSTANCEFLAGS = layout.offsetof(5);
        INSTANCEINDEX = layout.offsetof(6);
        PARTITIONINDEX = layout.offsetof(7);
        ACCELERATIONSTRUCTURE = layout.offsetof(8);
    }

    protected VkPartitionedAccelerationStructureWriteInstanceDataNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPartitionedAccelerationStructureWriteInstanceDataNV create(long address, ByteBuffer container) {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(address, container);
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkTransformMatrixKHR transform() {
        return ntransform(address());
    }

    @NativeType("float[6]")
    public FloatBuffer explicitAABB() {
        return nexplicitAABB(address());
    }

    public float explicitAABB(int index) {
        return nexplicitAABB(address(), index);
    }

    @NativeType("uint32_t")
    public int instanceID() {
        return ninstanceID(address());
    }

    @NativeType("uint32_t")
    public int instanceMask() {
        return ninstanceMask(address());
    }

    @NativeType("uint32_t")
    public int instanceContributionToHitGroupIndex() {
        return ninstanceContributionToHitGroupIndex(address());
    }

    @NativeType("VkPartitionedAccelerationStructureInstanceFlagsNV")
    public int instanceFlags() {
        return ninstanceFlags(address());
    }

    @NativeType("uint32_t")
    public int instanceIndex() {
        return ninstanceIndex(address());
    }

    @NativeType("uint32_t")
    public int partitionIndex() {
        return npartitionIndex(address());
    }

    @NativeType("VkDeviceAddress")
    public long accelerationStructure() {
        return naccelerationStructure(address());
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV transform(VkTransformMatrixKHR value) {
        ntransform(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV transform(Consumer<VkTransformMatrixKHR> consumer) {
        consumer.accept(transform());
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV explicitAABB(@NativeType("float[6]") FloatBuffer value) {
        nexplicitAABB(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV explicitAABB(int index, float value) {
        nexplicitAABB(address(), index, value);
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceID(@NativeType("uint32_t") int value) {
        ninstanceID(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceMask(@NativeType("uint32_t") int value) {
        ninstanceMask(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceContributionToHitGroupIndex(@NativeType("uint32_t") int value) {
        ninstanceContributionToHitGroupIndex(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceFlags(@NativeType("VkPartitionedAccelerationStructureInstanceFlagsNV") int value) {
        ninstanceFlags(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceIndex(@NativeType("uint32_t") int value) {
        ninstanceIndex(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV partitionIndex(@NativeType("uint32_t") int value) {
        npartitionIndex(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV accelerationStructure(@NativeType("VkDeviceAddress") long value) {
        naccelerationStructure(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV set(VkTransformMatrixKHR transform, FloatBuffer explicitAABB, int instanceID, int instanceMask, int instanceContributionToHitGroupIndex, int instanceFlags, int instanceIndex, int partitionIndex, long accelerationStructure) {
        transform(transform);
        explicitAABB(explicitAABB);
        instanceID(instanceID);
        instanceMask(instanceMask);
        instanceContributionToHitGroupIndex(instanceContributionToHitGroupIndex);
        instanceFlags(instanceFlags);
        instanceIndex(instanceIndex);
        partitionIndex(partitionIndex);
        accelerationStructure(accelerationStructure);
        return this;
    }

    public VkPartitionedAccelerationStructureWriteInstanceDataNV set(VkPartitionedAccelerationStructureWriteInstanceDataNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPartitionedAccelerationStructureWriteInstanceDataNV malloc() {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureWriteInstanceDataNV calloc() {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureWriteInstanceDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPartitionedAccelerationStructureWriteInstanceDataNV create(long address) {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(address, null);
    }

    public static VkPartitionedAccelerationStructureWriteInstanceDataNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(address, null);
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

    public static VkPartitionedAccelerationStructureWriteInstanceDataNV malloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureWriteInstanceDataNV calloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkTransformMatrixKHR ntransform(long struct) {
        return VkTransformMatrixKHR.create(struct + TRANSFORM);
    }

    public static FloatBuffer nexplicitAABB(long struct) {
        return MemoryUtil.memFloatBuffer(struct + EXPLICITAABB, 6);
    }

    public static float nexplicitAABB(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + EXPLICITAABB + (Checks.check(index, 6) * 4));
    }

    public static int ninstanceID(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCEID);
    }

    public static int ninstanceMask(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCEMASK);
    }

    public static int ninstanceContributionToHitGroupIndex(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCECONTRIBUTIONTOHITGROUPINDEX);
    }

    public static int ninstanceFlags(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCEFLAGS);
    }

    public static int ninstanceIndex(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCEINDEX);
    }

    public static int npartitionIndex(long struct) {
        return MemoryUtil.memGetInt(struct + PARTITIONINDEX);
    }

    public static long naccelerationStructure(long struct) {
        return MemoryUtil.memGetLong(struct + ACCELERATIONSTRUCTURE);
    }

    public static void ntransform(long struct, VkTransformMatrixKHR value) {
        MemoryUtil.memCopy(value.address(), struct + TRANSFORM, VkTransformMatrixKHR.SIZEOF);
    }

    public static void nexplicitAABB(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 6);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + EXPLICITAABB, value.remaining() * 4);
    }

    public static void nexplicitAABB(long struct, int index, float value) {
        MemoryUtil.memPutFloat(struct + EXPLICITAABB + (Checks.check(index, 6) * 4), value);
    }

    public static void ninstanceID(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCEID, value);
    }

    public static void ninstanceMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCEMASK, value);
    }

    public static void ninstanceContributionToHitGroupIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCECONTRIBUTIONTOHITGROUPINDEX, value);
    }

    public static void ninstanceFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCEFLAGS, value);
    }

    public static void ninstanceIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCEINDEX, value);
    }

    public static void npartitionIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + PARTITIONINDEX, value);
    }

    public static void naccelerationStructure(long struct, long value) {
        MemoryUtil.memPutLong(struct + ACCELERATIONSTRUCTURE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureWriteInstanceDataNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPartitionedAccelerationStructureWriteInstanceDataNV, Buffer> implements NativeResource {
        private static final VkPartitionedAccelerationStructureWriteInstanceDataNV ELEMENT_FACTORY = VkPartitionedAccelerationStructureWriteInstanceDataNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPartitionedAccelerationStructureWriteInstanceDataNV.SIZEOF);
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
        public VkPartitionedAccelerationStructureWriteInstanceDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkTransformMatrixKHR transform() {
            return VkPartitionedAccelerationStructureWriteInstanceDataNV.ntransform(address());
        }

        @NativeType("float[6]")
        public FloatBuffer explicitAABB() {
            return VkPartitionedAccelerationStructureWriteInstanceDataNV.nexplicitAABB(address());
        }

        public float explicitAABB(int index) {
            return VkPartitionedAccelerationStructureWriteInstanceDataNV.nexplicitAABB(address(), index);
        }

        @NativeType("uint32_t")
        public int instanceID() {
            return VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceID(address());
        }

        @NativeType("uint32_t")
        public int instanceMask() {
            return VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceMask(address());
        }

        @NativeType("uint32_t")
        public int instanceContributionToHitGroupIndex() {
            return VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceContributionToHitGroupIndex(address());
        }

        @NativeType("VkPartitionedAccelerationStructureInstanceFlagsNV")
        public int instanceFlags() {
            return VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceFlags(address());
        }

        @NativeType("uint32_t")
        public int instanceIndex() {
            return VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceIndex(address());
        }

        @NativeType("uint32_t")
        public int partitionIndex() {
            return VkPartitionedAccelerationStructureWriteInstanceDataNV.npartitionIndex(address());
        }

        @NativeType("VkDeviceAddress")
        public long accelerationStructure() {
            return VkPartitionedAccelerationStructureWriteInstanceDataNV.naccelerationStructure(address());
        }

        public Buffer transform(VkTransformMatrixKHR value) {
            VkPartitionedAccelerationStructureWriteInstanceDataNV.ntransform(address(), value);
            return this;
        }

        public Buffer transform(Consumer<VkTransformMatrixKHR> consumer) {
            consumer.accept(transform());
            return this;
        }

        public Buffer explicitAABB(@NativeType("float[6]") FloatBuffer value) {
            VkPartitionedAccelerationStructureWriteInstanceDataNV.nexplicitAABB(address(), value);
            return this;
        }

        public Buffer explicitAABB(int index, float value) {
            VkPartitionedAccelerationStructureWriteInstanceDataNV.nexplicitAABB(address(), index, value);
            return this;
        }

        public Buffer instanceID(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceID(address(), value);
            return this;
        }

        public Buffer instanceMask(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceMask(address(), value);
            return this;
        }

        public Buffer instanceContributionToHitGroupIndex(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceContributionToHitGroupIndex(address(), value);
            return this;
        }

        public Buffer instanceFlags(@NativeType("VkPartitionedAccelerationStructureInstanceFlagsNV") int value) {
            VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceFlags(address(), value);
            return this;
        }

        public Buffer instanceIndex(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceIndex(address(), value);
            return this;
        }

        public Buffer partitionIndex(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureWriteInstanceDataNV.npartitionIndex(address(), value);
            return this;
        }

        public Buffer accelerationStructure(@NativeType("VkDeviceAddress") long value) {
            VkPartitionedAccelerationStructureWriteInstanceDataNV.naccelerationStructure(address(), value);
            return this;
        }
    }
}
