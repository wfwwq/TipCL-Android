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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureCommandsInfoNV.class */
public class VkClusterAccelerationStructureCommandsInfoNV extends Struct<VkClusterAccelerationStructureCommandsInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INPUT;
    public static final int DSTIMPLICITDATA;
    public static final int SCRATCHDATA;
    public static final int DSTADDRESSESARRAY;
    public static final int DSTSIZESARRAY;
    public static final int SRCINFOSARRAY;
    public static final int SRCINFOSCOUNT;
    public static final int ADDRESSRESOLUTIONFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkClusterAccelerationStructureInputInfoNV.SIZEOF, VkClusterAccelerationStructureInputInfoNV.ALIGNOF), __member(8), __member(8), __member(VkStridedDeviceAddressRegionKHR.SIZEOF, VkStridedDeviceAddressRegionKHR.ALIGNOF), __member(VkStridedDeviceAddressRegionKHR.SIZEOF, VkStridedDeviceAddressRegionKHR.ALIGNOF), __member(VkStridedDeviceAddressRegionKHR.SIZEOF, VkStridedDeviceAddressRegionKHR.ALIGNOF), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INPUT = layout.offsetof(2);
        DSTIMPLICITDATA = layout.offsetof(3);
        SCRATCHDATA = layout.offsetof(4);
        DSTADDRESSESARRAY = layout.offsetof(5);
        DSTSIZESARRAY = layout.offsetof(6);
        SRCINFOSARRAY = layout.offsetof(7);
        SRCINFOSCOUNT = layout.offsetof(8);
        ADDRESSRESOLUTIONFLAGS = layout.offsetof(9);
    }

    protected VkClusterAccelerationStructureCommandsInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureCommandsInfoNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureCommandsInfoNV(address, container);
    }

    public VkClusterAccelerationStructureCommandsInfoNV(ByteBuffer container) {
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

    public VkClusterAccelerationStructureInputInfoNV input() {
        return ninput(address());
    }

    @NativeType("VkDeviceAddress")
    public long dstImplicitData() {
        return ndstImplicitData(address());
    }

    @NativeType("VkDeviceAddress")
    public long scratchData() {
        return nscratchData(address());
    }

    public VkStridedDeviceAddressRegionKHR dstAddressesArray() {
        return ndstAddressesArray(address());
    }

    public VkStridedDeviceAddressRegionKHR dstSizesArray() {
        return ndstSizesArray(address());
    }

    public VkStridedDeviceAddressRegionKHR srcInfosArray() {
        return nsrcInfosArray(address());
    }

    @NativeType("VkDeviceAddress")
    public long srcInfosCount() {
        return nsrcInfosCount(address());
    }

    @NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV")
    public int addressResolutionFlags() {
        return naddressResolutionFlags(address());
    }

    public VkClusterAccelerationStructureCommandsInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV sType$Default() {
        return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV);
    }

    public VkClusterAccelerationStructureCommandsInfoNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV input(VkClusterAccelerationStructureInputInfoNV value) {
        ninput(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV input(Consumer<VkClusterAccelerationStructureInputInfoNV> consumer) {
        consumer.accept(input());
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV dstImplicitData(@NativeType("VkDeviceAddress") long value) {
        ndstImplicitData(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV scratchData(@NativeType("VkDeviceAddress") long value) {
        nscratchData(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray(VkStridedDeviceAddressRegionKHR value) {
        ndstAddressesArray(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray(Consumer<VkStridedDeviceAddressRegionKHR> consumer) {
        consumer.accept(dstAddressesArray());
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray(VkStridedDeviceAddressRegionKHR value) {
        ndstSizesArray(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray(Consumer<VkStridedDeviceAddressRegionKHR> consumer) {
        consumer.accept(dstSizesArray());
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray(VkStridedDeviceAddressRegionKHR value) {
        nsrcInfosArray(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray(Consumer<VkStridedDeviceAddressRegionKHR> consumer) {
        consumer.accept(srcInfosArray());
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV srcInfosCount(@NativeType("VkDeviceAddress") long value) {
        nsrcInfosCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV addressResolutionFlags(@NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV") int value) {
        naddressResolutionFlags(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV set(int sType, long pNext, VkClusterAccelerationStructureInputInfoNV input, long dstImplicitData, long scratchData, VkStridedDeviceAddressRegionKHR dstAddressesArray, VkStridedDeviceAddressRegionKHR dstSizesArray, VkStridedDeviceAddressRegionKHR srcInfosArray, long srcInfosCount, int addressResolutionFlags) {
        sType(sType);
        pNext(pNext);
        input(input);
        dstImplicitData(dstImplicitData);
        scratchData(scratchData);
        dstAddressesArray(dstAddressesArray);
        dstSizesArray(dstSizesArray);
        srcInfosArray(srcInfosArray);
        srcInfosCount(srcInfosCount);
        addressResolutionFlags(addressResolutionFlags);
        return this;
    }

    public VkClusterAccelerationStructureCommandsInfoNV set(VkClusterAccelerationStructureCommandsInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureCommandsInfoNV malloc() {
        return new VkClusterAccelerationStructureCommandsInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureCommandsInfoNV calloc() {
        return new VkClusterAccelerationStructureCommandsInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureCommandsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureCommandsInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureCommandsInfoNV create(long address) {
        return new VkClusterAccelerationStructureCommandsInfoNV(address, null);
    }

    public static VkClusterAccelerationStructureCommandsInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureCommandsInfoNV(address, null);
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

    public static VkClusterAccelerationStructureCommandsInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureCommandsInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureCommandsInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureCommandsInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkClusterAccelerationStructureInputInfoNV ninput(long struct) {
        return VkClusterAccelerationStructureInputInfoNV.create(struct + INPUT);
    }

    public static long ndstImplicitData(long struct) {
        return MemoryUtil.memGetLong(struct + DSTIMPLICITDATA);
    }

    public static long nscratchData(long struct) {
        return MemoryUtil.memGetLong(struct + SCRATCHDATA);
    }

    public static VkStridedDeviceAddressRegionKHR ndstAddressesArray(long struct) {
        return VkStridedDeviceAddressRegionKHR.create(struct + DSTADDRESSESARRAY);
    }

    public static VkStridedDeviceAddressRegionKHR ndstSizesArray(long struct) {
        return VkStridedDeviceAddressRegionKHR.create(struct + DSTSIZESARRAY);
    }

    public static VkStridedDeviceAddressRegionKHR nsrcInfosArray(long struct) {
        return VkStridedDeviceAddressRegionKHR.create(struct + SRCINFOSARRAY);
    }

    public static long nsrcInfosCount(long struct) {
        return MemoryUtil.memGetLong(struct + SRCINFOSCOUNT);
    }

    public static int naddressResolutionFlags(long struct) {
        return MemoryUtil.memGetInt(struct + ADDRESSRESOLUTIONFLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ninput(long struct, VkClusterAccelerationStructureInputInfoNV value) {
        MemoryUtil.memCopy(value.address(), struct + INPUT, VkClusterAccelerationStructureInputInfoNV.SIZEOF);
    }

    public static void ndstImplicitData(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTIMPLICITDATA, value);
    }

    public static void nscratchData(long struct, long value) {
        MemoryUtil.memPutLong(struct + SCRATCHDATA, value);
    }

    public static void ndstAddressesArray(long struct, VkStridedDeviceAddressRegionKHR value) {
        MemoryUtil.memCopy(value.address(), struct + DSTADDRESSESARRAY, VkStridedDeviceAddressRegionKHR.SIZEOF);
    }

    public static void ndstSizesArray(long struct, VkStridedDeviceAddressRegionKHR value) {
        MemoryUtil.memCopy(value.address(), struct + DSTSIZESARRAY, VkStridedDeviceAddressRegionKHR.SIZEOF);
    }

    public static void nsrcInfosArray(long struct, VkStridedDeviceAddressRegionKHR value) {
        MemoryUtil.memCopy(value.address(), struct + SRCINFOSARRAY, VkStridedDeviceAddressRegionKHR.SIZEOF);
    }

    public static void nsrcInfosCount(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCINFOSCOUNT, value);
    }

    public static void naddressResolutionFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADDRESSRESOLUTIONFLAGS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureCommandsInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureCommandsInfoNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureCommandsInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureCommandsInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureCommandsInfoNV.SIZEOF);
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
        public VkClusterAccelerationStructureCommandsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkClusterAccelerationStructureCommandsInfoNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkClusterAccelerationStructureCommandsInfoNV.npNext(address());
        }

        public VkClusterAccelerationStructureInputInfoNV input() {
            return VkClusterAccelerationStructureCommandsInfoNV.ninput(address());
        }

        @NativeType("VkDeviceAddress")
        public long dstImplicitData() {
            return VkClusterAccelerationStructureCommandsInfoNV.ndstImplicitData(address());
        }

        @NativeType("VkDeviceAddress")
        public long scratchData() {
            return VkClusterAccelerationStructureCommandsInfoNV.nscratchData(address());
        }

        public VkStridedDeviceAddressRegionKHR dstAddressesArray() {
            return VkClusterAccelerationStructureCommandsInfoNV.ndstAddressesArray(address());
        }

        public VkStridedDeviceAddressRegionKHR dstSizesArray() {
            return VkClusterAccelerationStructureCommandsInfoNV.ndstSizesArray(address());
        }

        public VkStridedDeviceAddressRegionKHR srcInfosArray() {
            return VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosArray(address());
        }

        @NativeType("VkDeviceAddress")
        public long srcInfosCount() {
            return VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosCount(address());
        }

        @NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV")
        public int addressResolutionFlags() {
            return VkClusterAccelerationStructureCommandsInfoNV.naddressResolutionFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkClusterAccelerationStructureCommandsInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkClusterAccelerationStructureCommandsInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer input(VkClusterAccelerationStructureInputInfoNV value) {
            VkClusterAccelerationStructureCommandsInfoNV.ninput(address(), value);
            return this;
        }

        public Buffer input(Consumer<VkClusterAccelerationStructureInputInfoNV> consumer) {
            consumer.accept(input());
            return this;
        }

        public Buffer dstImplicitData(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureCommandsInfoNV.ndstImplicitData(address(), value);
            return this;
        }

        public Buffer scratchData(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureCommandsInfoNV.nscratchData(address(), value);
            return this;
        }

        public Buffer dstAddressesArray(VkStridedDeviceAddressRegionKHR value) {
            VkClusterAccelerationStructureCommandsInfoNV.ndstAddressesArray(address(), value);
            return this;
        }

        public Buffer dstAddressesArray(Consumer<VkStridedDeviceAddressRegionKHR> consumer) {
            consumer.accept(dstAddressesArray());
            return this;
        }

        public Buffer dstSizesArray(VkStridedDeviceAddressRegionKHR value) {
            VkClusterAccelerationStructureCommandsInfoNV.ndstSizesArray(address(), value);
            return this;
        }

        public Buffer dstSizesArray(Consumer<VkStridedDeviceAddressRegionKHR> consumer) {
            consumer.accept(dstSizesArray());
            return this;
        }

        public Buffer srcInfosArray(VkStridedDeviceAddressRegionKHR value) {
            VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosArray(address(), value);
            return this;
        }

        public Buffer srcInfosArray(Consumer<VkStridedDeviceAddressRegionKHR> consumer) {
            consumer.accept(srcInfosArray());
            return this;
        }

        public Buffer srcInfosCount(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosCount(address(), value);
            return this;
        }

        public Buffer addressResolutionFlags(@NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV") int value) {
            VkClusterAccelerationStructureCommandsInfoNV.naddressResolutionFlags(address(), value);
            return this;
        }
    }
}
