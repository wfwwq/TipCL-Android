package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLatencySubmissionPresentIdNV.class */
public class VkLatencySubmissionPresentIdNV extends Struct<VkLatencySubmissionPresentIdNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTID = layout.offsetof(2);
    }

    protected VkLatencySubmissionPresentIdNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkLatencySubmissionPresentIdNV create(long address, ByteBuffer container) {
        return new VkLatencySubmissionPresentIdNV(address, container);
    }

    public VkLatencySubmissionPresentIdNV(ByteBuffer container) {
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

    public VkLatencySubmissionPresentIdNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkLatencySubmissionPresentIdNV sType$Default() {
        return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV);
    }

    public VkLatencySubmissionPresentIdNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkLatencySubmissionPresentIdNV presentID(@NativeType("uint64_t") long value) {
        npresentID(address(), value);
        return this;
    }

    public VkLatencySubmissionPresentIdNV set(int sType, long pNext, long presentID) {
        sType(sType);
        pNext(pNext);
        presentID(presentID);
        return this;
    }

    public VkLatencySubmissionPresentIdNV set(VkLatencySubmissionPresentIdNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkLatencySubmissionPresentIdNV malloc() {
        return new VkLatencySubmissionPresentIdNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkLatencySubmissionPresentIdNV calloc() {
        return new VkLatencySubmissionPresentIdNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkLatencySubmissionPresentIdNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLatencySubmissionPresentIdNV(MemoryUtil.memAddress(container), container);
    }

    public static VkLatencySubmissionPresentIdNV create(long address) {
        return new VkLatencySubmissionPresentIdNV(address, null);
    }

    public static VkLatencySubmissionPresentIdNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkLatencySubmissionPresentIdNV(address, null);
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

    public static VkLatencySubmissionPresentIdNV malloc(MemoryStack stack) {
        return new VkLatencySubmissionPresentIdNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkLatencySubmissionPresentIdNV calloc(MemoryStack stack) {
        return new VkLatencySubmissionPresentIdNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npresentID(long struct, long value) {
        MemoryUtil.memPutLong(struct + PRESENTID, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLatencySubmissionPresentIdNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkLatencySubmissionPresentIdNV, Buffer> implements NativeResource {
        private static final VkLatencySubmissionPresentIdNV ELEMENT_FACTORY = VkLatencySubmissionPresentIdNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkLatencySubmissionPresentIdNV.SIZEOF);
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
        public VkLatencySubmissionPresentIdNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkLatencySubmissionPresentIdNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkLatencySubmissionPresentIdNV.npNext(address());
        }

        @NativeType("uint64_t")
        public long presentID() {
            return VkLatencySubmissionPresentIdNV.npresentID(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkLatencySubmissionPresentIdNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkLatencySubmissionPresentIdNV.npNext(address(), value);
            return this;
        }

        public Buffer presentID(@NativeType("uint64_t") long value) {
            VkLatencySubmissionPresentIdNV.npresentID(address(), value);
            return this;
        }
    }
}
