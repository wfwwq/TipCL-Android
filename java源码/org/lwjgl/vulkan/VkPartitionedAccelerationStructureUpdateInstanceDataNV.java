package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureUpdateInstanceDataNV.class */
public class VkPartitionedAccelerationStructureUpdateInstanceDataNV extends Struct<VkPartitionedAccelerationStructureUpdateInstanceDataNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int INSTANCEINDEX;
    public static final int INSTANCECONTRIBUTIONTOHITGROUPINDEX;
    public static final int ACCELERATIONSTRUCTURE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        INSTANCEINDEX = layout.offsetof(0);
        INSTANCECONTRIBUTIONTOHITGROUPINDEX = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
    }

    protected VkPartitionedAccelerationStructureUpdateInstanceDataNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV create(long address, ByteBuffer container) {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(address, container);
    }

    public VkPartitionedAccelerationStructureUpdateInstanceDataNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int instanceIndex() {
        return ninstanceIndex(address());
    }

    @NativeType("uint32_t")
    public int instanceContributionToHitGroupIndex() {
        return ninstanceContributionToHitGroupIndex(address());
    }

    @NativeType("VkDeviceAddress")
    public long accelerationStructure() {
        return naccelerationStructure(address());
    }

    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceIndex(@NativeType("uint32_t") int value) {
        ninstanceIndex(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceContributionToHitGroupIndex(@NativeType("uint32_t") int value) {
        ninstanceContributionToHitGroupIndex(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureUpdateInstanceDataNV accelerationStructure(@NativeType("VkDeviceAddress") long value) {
        naccelerationStructure(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureUpdateInstanceDataNV set(int instanceIndex, int instanceContributionToHitGroupIndex, long accelerationStructure) {
        instanceIndex(instanceIndex);
        instanceContributionToHitGroupIndex(instanceContributionToHitGroupIndex);
        accelerationStructure(accelerationStructure);
        return this;
    }

    public VkPartitionedAccelerationStructureUpdateInstanceDataNV set(VkPartitionedAccelerationStructureUpdateInstanceDataNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV malloc() {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV calloc() {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV create(long address) {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(address, null);
    }

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(address, null);
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

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV malloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV calloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ninstanceIndex(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCEINDEX);
    }

    public static int ninstanceContributionToHitGroupIndex(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCECONTRIBUTIONTOHITGROUPINDEX);
    }

    public static long naccelerationStructure(long struct) {
        return MemoryUtil.memGetLong(struct + ACCELERATIONSTRUCTURE);
    }

    public static void ninstanceIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCEINDEX, value);
    }

    public static void ninstanceContributionToHitGroupIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCECONTRIBUTIONTOHITGROUPINDEX, value);
    }

    public static void naccelerationStructure(long struct, long value) {
        MemoryUtil.memPutLong(struct + ACCELERATIONSTRUCTURE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureUpdateInstanceDataNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPartitionedAccelerationStructureUpdateInstanceDataNV, Buffer> implements NativeResource {
        private static final VkPartitionedAccelerationStructureUpdateInstanceDataNV ELEMENT_FACTORY = VkPartitionedAccelerationStructureUpdateInstanceDataNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPartitionedAccelerationStructureUpdateInstanceDataNV.SIZEOF);
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
        public VkPartitionedAccelerationStructureUpdateInstanceDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int instanceIndex() {
            return VkPartitionedAccelerationStructureUpdateInstanceDataNV.ninstanceIndex(address());
        }

        @NativeType("uint32_t")
        public int instanceContributionToHitGroupIndex() {
            return VkPartitionedAccelerationStructureUpdateInstanceDataNV.ninstanceContributionToHitGroupIndex(address());
        }

        @NativeType("VkDeviceAddress")
        public long accelerationStructure() {
            return VkPartitionedAccelerationStructureUpdateInstanceDataNV.naccelerationStructure(address());
        }

        public Buffer instanceIndex(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureUpdateInstanceDataNV.ninstanceIndex(address(), value);
            return this;
        }

        public Buffer instanceContributionToHitGroupIndex(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureUpdateInstanceDataNV.ninstanceContributionToHitGroupIndex(address(), value);
            return this;
        }

        public Buffer accelerationStructure(@NativeType("VkDeviceAddress") long value) {
            VkPartitionedAccelerationStructureUpdateInstanceDataNV.naccelerationStructure(address(), value);
            return this;
        }
    }
}
