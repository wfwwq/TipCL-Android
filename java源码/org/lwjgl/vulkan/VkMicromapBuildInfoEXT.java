package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkMicromapUsageEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapBuildInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapBuildInfoEXT.class */
public class VkMicromapBuildInfoEXT extends Struct<VkMicromapBuildInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int FLAGS;
    public static final int MODE;
    public static final int DSTMICROMAP;
    public static final int USAGECOUNTSCOUNT;
    public static final int PUSAGECOUNTS;
    public static final int PPUSAGECOUNTS;
    public static final int DATA;
    public static final int SCRATCHDATA;
    public static final int TRIANGLEARRAY;
    public static final int TRIANGLEARRAYSTRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(8), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(VkDeviceOrHostAddressKHR.SIZEOF, VkDeviceOrHostAddressKHR.ALIGNOF), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        MODE = layout.offsetof(4);
        DSTMICROMAP = layout.offsetof(5);
        USAGECOUNTSCOUNT = layout.offsetof(6);
        PUSAGECOUNTS = layout.offsetof(7);
        PPUSAGECOUNTS = layout.offsetof(8);
        DATA = layout.offsetof(9);
        SCRATCHDATA = layout.offsetof(10);
        TRIANGLEARRAY = layout.offsetof(11);
        TRIANGLEARRAYSTRIDE = layout.offsetof(12);
    }

    protected VkMicromapBuildInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMicromapBuildInfoEXT create(long address, ByteBuffer container) {
        return new VkMicromapBuildInfoEXT(address, container);
    }

    public VkMicromapBuildInfoEXT(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkMicromapTypeEXT")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkBuildMicromapFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkBuildMicromapModeEXT")
    public int mode() {
        return nmode(address());
    }

    @NativeType("VkMicromapEXT")
    public long dstMicromap() {
        return ndstMicromap(address());
    }

    @NativeType("uint32_t")
    public int usageCountsCount() {
        return nusageCountsCount(address());
    }

    @NativeType("VkMicromapUsageEXT const *")
    public VkMicromapUsageEXT.Buffer pUsageCounts() {
        return npUsageCounts(address());
    }

    @NativeType("VkMicromapUsageEXT const * const *")
    public PointerBuffer ppUsageCounts() {
        return nppUsageCounts(address());
    }

    public VkDeviceOrHostAddressConstKHR data() {
        return ndata(address());
    }

    public VkDeviceOrHostAddressKHR scratchData() {
        return nscratchData(address());
    }

    public VkDeviceOrHostAddressConstKHR triangleArray() {
        return ntriangleArray(address());
    }

    @NativeType("VkDeviceSize")
    public long triangleArrayStride() {
        return ntriangleArrayStride(address());
    }

    public VkMicromapBuildInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT sType$Default() {
        return sType(1000396000);
    }

    public VkMicromapBuildInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT type(@NativeType("VkMicromapTypeEXT") int value) {
        ntype(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT flags(@NativeType("VkBuildMicromapFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT mode(@NativeType("VkBuildMicromapModeEXT") int value) {
        nmode(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT dstMicromap(@NativeType("VkMicromapEXT") long value) {
        ndstMicromap(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT usageCountsCount(@NativeType("uint32_t") int value) {
        nusageCountsCount(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT pUsageCounts(@NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) {
        npUsageCounts(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT ppUsageCounts(@NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) {
        nppUsageCounts(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT data(VkDeviceOrHostAddressConstKHR value) {
        ndata(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT data(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(data());
        return this;
    }

    public VkMicromapBuildInfoEXT scratchData(VkDeviceOrHostAddressKHR value) {
        nscratchData(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT scratchData(Consumer<VkDeviceOrHostAddressKHR> consumer) {
        consumer.accept(scratchData());
        return this;
    }

    public VkMicromapBuildInfoEXT triangleArray(VkDeviceOrHostAddressConstKHR value) {
        ntriangleArray(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT triangleArray(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(triangleArray());
        return this;
    }

    public VkMicromapBuildInfoEXT triangleArrayStride(@NativeType("VkDeviceSize") long value) {
        ntriangleArrayStride(address(), value);
        return this;
    }

    public VkMicromapBuildInfoEXT set(int sType, long pNext, int type, int flags, int mode, long dstMicromap, int usageCountsCount, VkMicromapUsageEXT.Buffer pUsageCounts, PointerBuffer ppUsageCounts, VkDeviceOrHostAddressConstKHR data, VkDeviceOrHostAddressKHR scratchData, VkDeviceOrHostAddressConstKHR triangleArray, long triangleArrayStride) {
        sType(sType);
        pNext(pNext);
        type(type);
        flags(flags);
        mode(mode);
        dstMicromap(dstMicromap);
        usageCountsCount(usageCountsCount);
        pUsageCounts(pUsageCounts);
        ppUsageCounts(ppUsageCounts);
        data(data);
        scratchData(scratchData);
        triangleArray(triangleArray);
        triangleArrayStride(triangleArrayStride);
        return this;
    }

    public VkMicromapBuildInfoEXT set(VkMicromapBuildInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMicromapBuildInfoEXT malloc() {
        return new VkMicromapBuildInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMicromapBuildInfoEXT calloc() {
        return new VkMicromapBuildInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMicromapBuildInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapBuildInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMicromapBuildInfoEXT create(long address) {
        return new VkMicromapBuildInfoEXT(address, null);
    }

    public static VkMicromapBuildInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMicromapBuildInfoEXT(address, null);
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

    public static VkMicromapBuildInfoEXT malloc(MemoryStack stack) {
        return new VkMicromapBuildInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMicromapBuildInfoEXT calloc(MemoryStack stack) {
        return new VkMicromapBuildInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nmode(long struct) {
        return MemoryUtil.memGetInt(struct + MODE);
    }

    public static long ndstMicromap(long struct) {
        return MemoryUtil.memGetLong(struct + DSTMICROMAP);
    }

    public static int nusageCountsCount(long struct) {
        return MemoryUtil.memGetInt(struct + USAGECOUNTSCOUNT);
    }

    public static VkMicromapUsageEXT.Buffer npUsageCounts(long struct) {
        return VkMicromapUsageEXT.createSafe(MemoryUtil.memGetAddress(struct + PUSAGECOUNTS), nusageCountsCount(struct));
    }

    public static PointerBuffer nppUsageCounts(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PPUSAGECOUNTS), nusageCountsCount(struct));
    }

    public static VkDeviceOrHostAddressConstKHR ndata(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + DATA);
    }

    public static VkDeviceOrHostAddressKHR nscratchData(long struct) {
        return VkDeviceOrHostAddressKHR.create(struct + SCRATCHDATA);
    }

    public static VkDeviceOrHostAddressConstKHR ntriangleArray(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + TRIANGLEARRAY);
    }

    public static long ntriangleArrayStride(long struct) {
        return MemoryUtil.memGetLong(struct + TRIANGLEARRAYSTRIDE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nmode(long struct, int value) {
        MemoryUtil.memPutInt(struct + MODE, value);
    }

    public static void ndstMicromap(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTMICROMAP, value);
    }

    public static void nusageCountsCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGECOUNTSCOUNT, value);
    }

    public static void npUsageCounts(long struct, VkMicromapUsageEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PUSAGECOUNTS, MemoryUtil.memAddressSafe(value));
    }

    public static void nppUsageCounts(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PPUSAGECOUNTS, MemoryUtil.memAddressSafe(value));
    }

    public static void ndata(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + DATA, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void nscratchData(long struct, VkDeviceOrHostAddressKHR value) {
        MemoryUtil.memCopy(value.address(), struct + SCRATCHDATA, VkDeviceOrHostAddressKHR.SIZEOF);
    }

    public static void ntriangleArray(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + TRIANGLEARRAY, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void ntriangleArrayStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + TRIANGLEARRAYSTRIDE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapBuildInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapBuildInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMicromapBuildInfoEXT, Buffer> implements NativeResource {
        private static final VkMicromapBuildInfoEXT ELEMENT_FACTORY = VkMicromapBuildInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMicromapBuildInfoEXT.SIZEOF);
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
        public VkMicromapBuildInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMicromapBuildInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMicromapBuildInfoEXT.npNext(address());
        }

        @NativeType("VkMicromapTypeEXT")
        public int type() {
            return VkMicromapBuildInfoEXT.ntype(address());
        }

        @NativeType("VkBuildMicromapFlagsEXT")
        public int flags() {
            return VkMicromapBuildInfoEXT.nflags(address());
        }

        @NativeType("VkBuildMicromapModeEXT")
        public int mode() {
            return VkMicromapBuildInfoEXT.nmode(address());
        }

        @NativeType("VkMicromapEXT")
        public long dstMicromap() {
            return VkMicromapBuildInfoEXT.ndstMicromap(address());
        }

        @NativeType("uint32_t")
        public int usageCountsCount() {
            return VkMicromapBuildInfoEXT.nusageCountsCount(address());
        }

        @NativeType("VkMicromapUsageEXT const *")
        public VkMicromapUsageEXT.Buffer pUsageCounts() {
            return VkMicromapBuildInfoEXT.npUsageCounts(address());
        }

        @NativeType("VkMicromapUsageEXT const * const *")
        public PointerBuffer ppUsageCounts() {
            return VkMicromapBuildInfoEXT.nppUsageCounts(address());
        }

        public VkDeviceOrHostAddressConstKHR data() {
            return VkMicromapBuildInfoEXT.ndata(address());
        }

        public VkDeviceOrHostAddressKHR scratchData() {
            return VkMicromapBuildInfoEXT.nscratchData(address());
        }

        public VkDeviceOrHostAddressConstKHR triangleArray() {
            return VkMicromapBuildInfoEXT.ntriangleArray(address());
        }

        @NativeType("VkDeviceSize")
        public long triangleArrayStride() {
            return VkMicromapBuildInfoEXT.ntriangleArrayStride(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMicromapBuildInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000396000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMicromapBuildInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkMicromapTypeEXT") int value) {
            VkMicromapBuildInfoEXT.ntype(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkBuildMicromapFlagsEXT") int value) {
            VkMicromapBuildInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer mode(@NativeType("VkBuildMicromapModeEXT") int value) {
            VkMicromapBuildInfoEXT.nmode(address(), value);
            return this;
        }

        public Buffer dstMicromap(@NativeType("VkMicromapEXT") long value) {
            VkMicromapBuildInfoEXT.ndstMicromap(address(), value);
            return this;
        }

        public Buffer usageCountsCount(@NativeType("uint32_t") int value) {
            VkMicromapBuildInfoEXT.nusageCountsCount(address(), value);
            return this;
        }

        public Buffer pUsageCounts(@NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) {
            VkMicromapBuildInfoEXT.npUsageCounts(address(), value);
            return this;
        }

        public Buffer ppUsageCounts(@NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) {
            VkMicromapBuildInfoEXT.nppUsageCounts(address(), value);
            return this;
        }

        public Buffer data(VkDeviceOrHostAddressConstKHR value) {
            VkMicromapBuildInfoEXT.ndata(address(), value);
            return this;
        }

        public Buffer data(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(data());
            return this;
        }

        public Buffer scratchData(VkDeviceOrHostAddressKHR value) {
            VkMicromapBuildInfoEXT.nscratchData(address(), value);
            return this;
        }

        public Buffer scratchData(Consumer<VkDeviceOrHostAddressKHR> consumer) {
            consumer.accept(scratchData());
            return this;
        }

        public Buffer triangleArray(VkDeviceOrHostAddressConstKHR value) {
            VkMicromapBuildInfoEXT.ntriangleArray(address(), value);
            return this;
        }

        public Buffer triangleArray(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(triangleArray());
            return this;
        }

        public Buffer triangleArrayStride(@NativeType("VkDeviceSize") long value) {
            VkMicromapBuildInfoEXT.ntriangleArrayStride(address(), value);
            return this;
        }
    }
}
