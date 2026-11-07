package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGetLatencyMarkerInfoNV.class */
public class VkGetLatencyMarkerInfoNV extends Struct<VkGetLatencyMarkerInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TIMINGCOUNT;
    public static final int PTIMINGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TIMINGCOUNT = layout.offsetof(2);
        PTIMINGS = layout.offsetof(3);
    }

    protected VkGetLatencyMarkerInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGetLatencyMarkerInfoNV create(long address, ByteBuffer container) {
        return new VkGetLatencyMarkerInfoNV(address, container);
    }

    public VkGetLatencyMarkerInfoNV(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int timingCount() {
        return ntimingCount(address());
    }

    @NativeType("VkLatencyTimingsFrameReportNV *")
    public VkLatencyTimingsFrameReportNV.Buffer pTimings() {
        return npTimings(address());
    }

    public VkGetLatencyMarkerInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGetLatencyMarkerInfoNV sType$Default() {
        return sType(NVLowLatency2.VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV);
    }

    public VkGetLatencyMarkerInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGetLatencyMarkerInfoNV timingCount(@NativeType("uint32_t") int value) {
        ntimingCount(address(), value);
        return this;
    }

    public VkGetLatencyMarkerInfoNV pTimings(@NativeType("VkLatencyTimingsFrameReportNV *") VkLatencyTimingsFrameReportNV.Buffer value) {
        npTimings(address(), value);
        return this;
    }

    public VkGetLatencyMarkerInfoNV set(int sType, long pNext, int timingCount, VkLatencyTimingsFrameReportNV.Buffer pTimings) {
        sType(sType);
        pNext(pNext);
        timingCount(timingCount);
        pTimings(pTimings);
        return this;
    }

    public VkGetLatencyMarkerInfoNV set(VkGetLatencyMarkerInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGetLatencyMarkerInfoNV malloc() {
        return new VkGetLatencyMarkerInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGetLatencyMarkerInfoNV calloc() {
        return new VkGetLatencyMarkerInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGetLatencyMarkerInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGetLatencyMarkerInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkGetLatencyMarkerInfoNV create(long address) {
        return new VkGetLatencyMarkerInfoNV(address, null);
    }

    public static VkGetLatencyMarkerInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGetLatencyMarkerInfoNV(address, null);
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

    public static VkGetLatencyMarkerInfoNV malloc(MemoryStack stack) {
        return new VkGetLatencyMarkerInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGetLatencyMarkerInfoNV calloc(MemoryStack stack) {
        return new VkGetLatencyMarkerInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntimingCount(long struct) {
        return MemoryUtil.memGetInt(struct + TIMINGCOUNT);
    }

    public static VkLatencyTimingsFrameReportNV.Buffer npTimings(long struct) {
        return VkLatencyTimingsFrameReportNV.createSafe(MemoryUtil.memGetAddress(struct + PTIMINGS), ntimingCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntimingCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + TIMINGCOUNT, value);
    }

    public static void npTimings(long struct, VkLatencyTimingsFrameReportNV.Buffer value) {
        MemoryUtil.memPutAddress(struct + PTIMINGS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ntimingCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGetLatencyMarkerInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkGetLatencyMarkerInfoNV, Buffer> implements NativeResource {
        private static final VkGetLatencyMarkerInfoNV ELEMENT_FACTORY = VkGetLatencyMarkerInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGetLatencyMarkerInfoNV.SIZEOF);
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
        public VkGetLatencyMarkerInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGetLatencyMarkerInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkGetLatencyMarkerInfoNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int timingCount() {
            return VkGetLatencyMarkerInfoNV.ntimingCount(address());
        }

        @NativeType("VkLatencyTimingsFrameReportNV *")
        public VkLatencyTimingsFrameReportNV.Buffer pTimings() {
            return VkGetLatencyMarkerInfoNV.npTimings(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGetLatencyMarkerInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVLowLatency2.VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkGetLatencyMarkerInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer timingCount(@NativeType("uint32_t") int value) {
            VkGetLatencyMarkerInfoNV.ntimingCount(address(), value);
            return this;
        }

        public Buffer pTimings(@NativeType("VkLatencyTimingsFrameReportNV *") VkLatencyTimingsFrameReportNV.Buffer value) {
            VkGetLatencyMarkerInfoNV.npTimings(address(), value);
            return this;
        }
    }
}
