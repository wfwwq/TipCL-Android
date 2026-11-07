package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSetLatencyMarkerInfoNV.class */
public class VkSetLatencyMarkerInfoNV extends Struct<VkSetLatencyMarkerInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTID;
    public static final int MARKER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTID = layout.offsetof(2);
        MARKER = layout.offsetof(3);
    }

    protected VkSetLatencyMarkerInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSetLatencyMarkerInfoNV create(long address, ByteBuffer container) {
        return new VkSetLatencyMarkerInfoNV(address, container);
    }

    public VkSetLatencyMarkerInfoNV(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long presentID() {
        return npresentID(address());
    }

    @NativeType("VkLatencyMarkerNV")
    public int marker() {
        return nmarker(address());
    }

    public VkSetLatencyMarkerInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSetLatencyMarkerInfoNV sType$Default() {
        return sType(NVLowLatency2.VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV);
    }

    public VkSetLatencyMarkerInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSetLatencyMarkerInfoNV presentID(@NativeType("uint64_t") long value) {
        npresentID(address(), value);
        return this;
    }

    public VkSetLatencyMarkerInfoNV marker(@NativeType("VkLatencyMarkerNV") int value) {
        nmarker(address(), value);
        return this;
    }

    public VkSetLatencyMarkerInfoNV set(int sType, long pNext, long presentID, int marker) {
        sType(sType);
        pNext(pNext);
        presentID(presentID);
        marker(marker);
        return this;
    }

    public VkSetLatencyMarkerInfoNV set(VkSetLatencyMarkerInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSetLatencyMarkerInfoNV malloc() {
        return new VkSetLatencyMarkerInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSetLatencyMarkerInfoNV calloc() {
        return new VkSetLatencyMarkerInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSetLatencyMarkerInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSetLatencyMarkerInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkSetLatencyMarkerInfoNV create(long address) {
        return new VkSetLatencyMarkerInfoNV(address, null);
    }

    public static VkSetLatencyMarkerInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSetLatencyMarkerInfoNV(address, null);
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

    public static VkSetLatencyMarkerInfoNV malloc(MemoryStack stack) {
        return new VkSetLatencyMarkerInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSetLatencyMarkerInfoNV calloc(MemoryStack stack) {
        return new VkSetLatencyMarkerInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmarker(long struct) {
        return MemoryUtil.memGetInt(struct + MARKER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npresentID(long struct, long value) {
        MemoryUtil.memPutLong(struct + PRESENTID, value);
    }

    public static void nmarker(long struct, int value) {
        MemoryUtil.memPutInt(struct + MARKER, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSetLatencyMarkerInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkSetLatencyMarkerInfoNV, Buffer> implements NativeResource {
        private static final VkSetLatencyMarkerInfoNV ELEMENT_FACTORY = VkSetLatencyMarkerInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSetLatencyMarkerInfoNV.SIZEOF);
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
        public VkSetLatencyMarkerInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSetLatencyMarkerInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSetLatencyMarkerInfoNV.npNext(address());
        }

        @NativeType("uint64_t")
        public long presentID() {
            return VkSetLatencyMarkerInfoNV.npresentID(address());
        }

        @NativeType("VkLatencyMarkerNV")
        public int marker() {
            return VkSetLatencyMarkerInfoNV.nmarker(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSetLatencyMarkerInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVLowLatency2.VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSetLatencyMarkerInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer presentID(@NativeType("uint64_t") long value) {
            VkSetLatencyMarkerInfoNV.npresentID(address(), value);
            return this;
        }

        public Buffer marker(@NativeType("VkLatencyMarkerNV") int value) {
            VkSetLatencyMarkerInfoNV.nmarker(address(), value);
            return this;
        }
    }
}
