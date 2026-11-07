package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLatencyTimingsFrameReportNV.class */
public class VkLatencyTimingsFrameReportNV extends Struct<VkLatencyTimingsFrameReportNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTID;
    public static final int INPUTSAMPLETIMEUS;
    public static final int SIMSTARTTIMEUS;
    public static final int SIMENDTIMEUS;
    public static final int RENDERSUBMITSTARTTIMEUS;
    public static final int RENDERSUBMITENDTIMEUS;
    public static final int PRESENTSTARTTIMEUS;
    public static final int PRESENTENDTIMEUS;
    public static final int DRIVERSTARTTIMEUS;
    public static final int DRIVERENDTIMEUS;
    public static final int OSRENDERQUEUESTARTTIMEUS;
    public static final int OSRENDERQUEUEENDTIMEUS;
    public static final int GPURENDERSTARTTIMEUS;
    public static final int GPURENDERENDTIMEUS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTID = layout.offsetof(2);
        INPUTSAMPLETIMEUS = layout.offsetof(3);
        SIMSTARTTIMEUS = layout.offsetof(4);
        SIMENDTIMEUS = layout.offsetof(5);
        RENDERSUBMITSTARTTIMEUS = layout.offsetof(6);
        RENDERSUBMITENDTIMEUS = layout.offsetof(7);
        PRESENTSTARTTIMEUS = layout.offsetof(8);
        PRESENTENDTIMEUS = layout.offsetof(9);
        DRIVERSTARTTIMEUS = layout.offsetof(10);
        DRIVERENDTIMEUS = layout.offsetof(11);
        OSRENDERQUEUESTARTTIMEUS = layout.offsetof(12);
        OSRENDERQUEUEENDTIMEUS = layout.offsetof(13);
        GPURENDERSTARTTIMEUS = layout.offsetof(14);
        GPURENDERENDTIMEUS = layout.offsetof(15);
    }

    protected VkLatencyTimingsFrameReportNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkLatencyTimingsFrameReportNV create(long address, ByteBuffer container) {
        return new VkLatencyTimingsFrameReportNV(address, container);
    }

    public VkLatencyTimingsFrameReportNV(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long presentID() {
        return npresentID(address());
    }

    @NativeType("uint64_t")
    public long inputSampleTimeUs() {
        return ninputSampleTimeUs(address());
    }

    @NativeType("uint64_t")
    public long simStartTimeUs() {
        return nsimStartTimeUs(address());
    }

    @NativeType("uint64_t")
    public long simEndTimeUs() {
        return nsimEndTimeUs(address());
    }

    @NativeType("uint64_t")
    public long renderSubmitStartTimeUs() {
        return nrenderSubmitStartTimeUs(address());
    }

    @NativeType("uint64_t")
    public long renderSubmitEndTimeUs() {
        return nrenderSubmitEndTimeUs(address());
    }

    @NativeType("uint64_t")
    public long presentStartTimeUs() {
        return npresentStartTimeUs(address());
    }

    @NativeType("uint64_t")
    public long presentEndTimeUs() {
        return npresentEndTimeUs(address());
    }

    @NativeType("uint64_t")
    public long driverStartTimeUs() {
        return ndriverStartTimeUs(address());
    }

    @NativeType("uint64_t")
    public long driverEndTimeUs() {
        return ndriverEndTimeUs(address());
    }

    @NativeType("uint64_t")
    public long osRenderQueueStartTimeUs() {
        return nosRenderQueueStartTimeUs(address());
    }

    @NativeType("uint64_t")
    public long osRenderQueueEndTimeUs() {
        return nosRenderQueueEndTimeUs(address());
    }

    @NativeType("uint64_t")
    public long gpuRenderStartTimeUs() {
        return ngpuRenderStartTimeUs(address());
    }

    @NativeType("uint64_t")
    public long gpuRenderEndTimeUs() {
        return ngpuRenderEndTimeUs(address());
    }

    public VkLatencyTimingsFrameReportNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkLatencyTimingsFrameReportNV sType$Default() {
        return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV);
    }

    public VkLatencyTimingsFrameReportNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkLatencyTimingsFrameReportNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkLatencyTimingsFrameReportNV set(VkLatencyTimingsFrameReportNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkLatencyTimingsFrameReportNV malloc() {
        return new VkLatencyTimingsFrameReportNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkLatencyTimingsFrameReportNV calloc() {
        return new VkLatencyTimingsFrameReportNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkLatencyTimingsFrameReportNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLatencyTimingsFrameReportNV(MemoryUtil.memAddress(container), container);
    }

    public static VkLatencyTimingsFrameReportNV create(long address) {
        return new VkLatencyTimingsFrameReportNV(address, null);
    }

    public static VkLatencyTimingsFrameReportNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkLatencyTimingsFrameReportNV(address, null);
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

    public static VkLatencyTimingsFrameReportNV malloc(MemoryStack stack) {
        return new VkLatencyTimingsFrameReportNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkLatencyTimingsFrameReportNV calloc(MemoryStack stack) {
        return new VkLatencyTimingsFrameReportNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npresentID(long struct) {
        return MemoryUtil.memGetLong(struct + PRESENTID);
    }

    public static long ninputSampleTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + INPUTSAMPLETIMEUS);
    }

    public static long nsimStartTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + SIMSTARTTIMEUS);
    }

    public static long nsimEndTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + SIMENDTIMEUS);
    }

    public static long nrenderSubmitStartTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + RENDERSUBMITSTARTTIMEUS);
    }

    public static long nrenderSubmitEndTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + RENDERSUBMITENDTIMEUS);
    }

    public static long npresentStartTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + PRESENTSTARTTIMEUS);
    }

    public static long npresentEndTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + PRESENTENDTIMEUS);
    }

    public static long ndriverStartTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + DRIVERSTARTTIMEUS);
    }

    public static long ndriverEndTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + DRIVERENDTIMEUS);
    }

    public static long nosRenderQueueStartTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + OSRENDERQUEUESTARTTIMEUS);
    }

    public static long nosRenderQueueEndTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + OSRENDERQUEUEENDTIMEUS);
    }

    public static long ngpuRenderStartTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + GPURENDERSTARTTIMEUS);
    }

    public static long ngpuRenderEndTimeUs(long struct) {
        return MemoryUtil.memGetLong(struct + GPURENDERENDTIMEUS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLatencyTimingsFrameReportNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkLatencyTimingsFrameReportNV, Buffer> implements NativeResource {
        private static final VkLatencyTimingsFrameReportNV ELEMENT_FACTORY = VkLatencyTimingsFrameReportNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkLatencyTimingsFrameReportNV.SIZEOF);
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
        public VkLatencyTimingsFrameReportNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkLatencyTimingsFrameReportNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkLatencyTimingsFrameReportNV.npNext(address());
        }

        @NativeType("uint64_t")
        public long presentID() {
            return VkLatencyTimingsFrameReportNV.npresentID(address());
        }

        @NativeType("uint64_t")
        public long inputSampleTimeUs() {
            return VkLatencyTimingsFrameReportNV.ninputSampleTimeUs(address());
        }

        @NativeType("uint64_t")
        public long simStartTimeUs() {
            return VkLatencyTimingsFrameReportNV.nsimStartTimeUs(address());
        }

        @NativeType("uint64_t")
        public long simEndTimeUs() {
            return VkLatencyTimingsFrameReportNV.nsimEndTimeUs(address());
        }

        @NativeType("uint64_t")
        public long renderSubmitStartTimeUs() {
            return VkLatencyTimingsFrameReportNV.nrenderSubmitStartTimeUs(address());
        }

        @NativeType("uint64_t")
        public long renderSubmitEndTimeUs() {
            return VkLatencyTimingsFrameReportNV.nrenderSubmitEndTimeUs(address());
        }

        @NativeType("uint64_t")
        public long presentStartTimeUs() {
            return VkLatencyTimingsFrameReportNV.npresentStartTimeUs(address());
        }

        @NativeType("uint64_t")
        public long presentEndTimeUs() {
            return VkLatencyTimingsFrameReportNV.npresentEndTimeUs(address());
        }

        @NativeType("uint64_t")
        public long driverStartTimeUs() {
            return VkLatencyTimingsFrameReportNV.ndriverStartTimeUs(address());
        }

        @NativeType("uint64_t")
        public long driverEndTimeUs() {
            return VkLatencyTimingsFrameReportNV.ndriverEndTimeUs(address());
        }

        @NativeType("uint64_t")
        public long osRenderQueueStartTimeUs() {
            return VkLatencyTimingsFrameReportNV.nosRenderQueueStartTimeUs(address());
        }

        @NativeType("uint64_t")
        public long osRenderQueueEndTimeUs() {
            return VkLatencyTimingsFrameReportNV.nosRenderQueueEndTimeUs(address());
        }

        @NativeType("uint64_t")
        public long gpuRenderStartTimeUs() {
            return VkLatencyTimingsFrameReportNV.ngpuRenderStartTimeUs(address());
        }

        @NativeType("uint64_t")
        public long gpuRenderEndTimeUs() {
            return VkLatencyTimingsFrameReportNV.ngpuRenderEndTimeUs(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkLatencyTimingsFrameReportNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkLatencyTimingsFrameReportNV.npNext(address(), value);
            return this;
        }
    }
}
