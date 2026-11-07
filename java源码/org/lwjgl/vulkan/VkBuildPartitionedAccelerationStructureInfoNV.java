package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBuildPartitionedAccelerationStructureInfoNV.class */
public class VkBuildPartitionedAccelerationStructureInfoNV extends Struct<VkBuildPartitionedAccelerationStructureInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INPUT;
    public static final int SRCACCELERATIONSTRUCTUREDATA;
    public static final int DSTACCELERATIONSTRUCTUREDATA;
    public static final int SCRATCHDATA;
    public static final int SRCINFOS;
    public static final int SRCINFOSCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF, VkPartitionedAccelerationStructureInstancesInputNV.ALIGNOF), __member(8), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INPUT = layout.offsetof(2);
        SRCACCELERATIONSTRUCTUREDATA = layout.offsetof(3);
        DSTACCELERATIONSTRUCTUREDATA = layout.offsetof(4);
        SCRATCHDATA = layout.offsetof(5);
        SRCINFOS = layout.offsetof(6);
        SRCINFOSCOUNT = layout.offsetof(7);
    }

    protected VkBuildPartitionedAccelerationStructureInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBuildPartitionedAccelerationStructureInfoNV create(long address, ByteBuffer container) {
        return new VkBuildPartitionedAccelerationStructureInfoNV(address, container);
    }

    public VkBuildPartitionedAccelerationStructureInfoNV(ByteBuffer container) {
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

    public VkPartitionedAccelerationStructureInstancesInputNV input() {
        return ninput(address());
    }

    @NativeType("VkDeviceAddress")
    public long srcAccelerationStructureData() {
        return nsrcAccelerationStructureData(address());
    }

    @NativeType("VkDeviceAddress")
    public long dstAccelerationStructureData() {
        return ndstAccelerationStructureData(address());
    }

    @NativeType("VkDeviceAddress")
    public long scratchData() {
        return nscratchData(address());
    }

    @NativeType("VkDeviceAddress")
    public long srcInfos() {
        return nsrcInfos(address());
    }

    @NativeType("VkDeviceAddress")
    public long srcInfosCount() {
        return nsrcInfosCount(address());
    }

    public VkBuildPartitionedAccelerationStructureInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureInfoNV sType$Default() {
        return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV);
    }

    public VkBuildPartitionedAccelerationStructureInfoNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureInfoNV input(VkPartitionedAccelerationStructureInstancesInputNV value) {
        ninput(address(), value);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureInfoNV input(Consumer<VkPartitionedAccelerationStructureInstancesInputNV> consumer) {
        consumer.accept(input());
        return this;
    }

    public VkBuildPartitionedAccelerationStructureInfoNV srcAccelerationStructureData(@NativeType("VkDeviceAddress") long value) {
        nsrcAccelerationStructureData(address(), value);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureInfoNV dstAccelerationStructureData(@NativeType("VkDeviceAddress") long value) {
        ndstAccelerationStructureData(address(), value);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureInfoNV scratchData(@NativeType("VkDeviceAddress") long value) {
        nscratchData(address(), value);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureInfoNV srcInfos(@NativeType("VkDeviceAddress") long value) {
        nsrcInfos(address(), value);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureInfoNV srcInfosCount(@NativeType("VkDeviceAddress") long value) {
        nsrcInfosCount(address(), value);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureInfoNV set(int sType, long pNext, VkPartitionedAccelerationStructureInstancesInputNV input, long srcAccelerationStructureData, long dstAccelerationStructureData, long scratchData, long srcInfos, long srcInfosCount) {
        sType(sType);
        pNext(pNext);
        input(input);
        srcAccelerationStructureData(srcAccelerationStructureData);
        dstAccelerationStructureData(dstAccelerationStructureData);
        scratchData(scratchData);
        srcInfos(srcInfos);
        srcInfosCount(srcInfosCount);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureInfoNV set(VkBuildPartitionedAccelerationStructureInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV malloc() {
        return new VkBuildPartitionedAccelerationStructureInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV calloc() {
        return new VkBuildPartitionedAccelerationStructureInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBuildPartitionedAccelerationStructureInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV create(long address) {
        return new VkBuildPartitionedAccelerationStructureInfoNV(address, null);
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBuildPartitionedAccelerationStructureInfoNV(address, null);
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

    public static VkBuildPartitionedAccelerationStructureInfoNV malloc(MemoryStack stack) {
        return new VkBuildPartitionedAccelerationStructureInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV calloc(MemoryStack stack) {
        return new VkBuildPartitionedAccelerationStructureInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPartitionedAccelerationStructureInstancesInputNV ninput(long struct) {
        return VkPartitionedAccelerationStructureInstancesInputNV.create(struct + INPUT);
    }

    public static long nsrcAccelerationStructureData(long struct) {
        return MemoryUtil.memGetLong(struct + SRCACCELERATIONSTRUCTUREDATA);
    }

    public static long ndstAccelerationStructureData(long struct) {
        return MemoryUtil.memGetLong(struct + DSTACCELERATIONSTRUCTUREDATA);
    }

    public static long nscratchData(long struct) {
        return MemoryUtil.memGetLong(struct + SCRATCHDATA);
    }

    public static long nsrcInfos(long struct) {
        return MemoryUtil.memGetLong(struct + SRCINFOS);
    }

    public static long nsrcInfosCount(long struct) {
        return MemoryUtil.memGetLong(struct + SRCINFOSCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ninput(long struct, VkPartitionedAccelerationStructureInstancesInputNV value) {
        MemoryUtil.memCopy(value.address(), struct + INPUT, VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF);
    }

    public static void nsrcAccelerationStructureData(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCACCELERATIONSTRUCTUREDATA, value);
    }

    public static void ndstAccelerationStructureData(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTACCELERATIONSTRUCTUREDATA, value);
    }

    public static void nscratchData(long struct, long value) {
        MemoryUtil.memPutLong(struct + SCRATCHDATA, value);
    }

    public static void nsrcInfos(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCINFOS, value);
    }

    public static void nsrcInfosCount(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCINFOSCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBuildPartitionedAccelerationStructureInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkBuildPartitionedAccelerationStructureInfoNV, Buffer> implements NativeResource {
        private static final VkBuildPartitionedAccelerationStructureInfoNV ELEMENT_FACTORY = VkBuildPartitionedAccelerationStructureInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBuildPartitionedAccelerationStructureInfoNV.SIZEOF);
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
        public VkBuildPartitionedAccelerationStructureInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBuildPartitionedAccelerationStructureInfoNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkBuildPartitionedAccelerationStructureInfoNV.npNext(address());
        }

        public VkPartitionedAccelerationStructureInstancesInputNV input() {
            return VkBuildPartitionedAccelerationStructureInfoNV.ninput(address());
        }

        @NativeType("VkDeviceAddress")
        public long srcAccelerationStructureData() {
            return VkBuildPartitionedAccelerationStructureInfoNV.nsrcAccelerationStructureData(address());
        }

        @NativeType("VkDeviceAddress")
        public long dstAccelerationStructureData() {
            return VkBuildPartitionedAccelerationStructureInfoNV.ndstAccelerationStructureData(address());
        }

        @NativeType("VkDeviceAddress")
        public long scratchData() {
            return VkBuildPartitionedAccelerationStructureInfoNV.nscratchData(address());
        }

        @NativeType("VkDeviceAddress")
        public long srcInfos() {
            return VkBuildPartitionedAccelerationStructureInfoNV.nsrcInfos(address());
        }

        @NativeType("VkDeviceAddress")
        public long srcInfosCount() {
            return VkBuildPartitionedAccelerationStructureInfoNV.nsrcInfosCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBuildPartitionedAccelerationStructureInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkBuildPartitionedAccelerationStructureInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer input(VkPartitionedAccelerationStructureInstancesInputNV value) {
            VkBuildPartitionedAccelerationStructureInfoNV.ninput(address(), value);
            return this;
        }

        public Buffer input(Consumer<VkPartitionedAccelerationStructureInstancesInputNV> consumer) {
            consumer.accept(input());
            return this;
        }

        public Buffer srcAccelerationStructureData(@NativeType("VkDeviceAddress") long value) {
            VkBuildPartitionedAccelerationStructureInfoNV.nsrcAccelerationStructureData(address(), value);
            return this;
        }

        public Buffer dstAccelerationStructureData(@NativeType("VkDeviceAddress") long value) {
            VkBuildPartitionedAccelerationStructureInfoNV.ndstAccelerationStructureData(address(), value);
            return this;
        }

        public Buffer scratchData(@NativeType("VkDeviceAddress") long value) {
            VkBuildPartitionedAccelerationStructureInfoNV.nscratchData(address(), value);
            return this;
        }

        public Buffer srcInfos(@NativeType("VkDeviceAddress") long value) {
            VkBuildPartitionedAccelerationStructureInfoNV.nsrcInfos(address(), value);
            return this;
        }

        public Buffer srcInfosCount(@NativeType("VkDeviceAddress") long value) {
            VkBuildPartitionedAccelerationStructureInfoNV.nsrcInfosCount(address(), value);
            return this;
        }
    }
}
