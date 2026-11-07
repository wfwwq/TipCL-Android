package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSetPresentConfigNV.class */
public class VkSetPresentConfigNV extends Struct<VkSetPresentConfigNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int NUMFRAMESPERBATCH;
    public static final int PRESENTCONFIGFEEDBACK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NUMFRAMESPERBATCH = layout.offsetof(2);
        PRESENTCONFIGFEEDBACK = layout.offsetof(3);
    }

    protected VkSetPresentConfigNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSetPresentConfigNV create(long address, ByteBuffer container) {
        return new VkSetPresentConfigNV(address, container);
    }

    public VkSetPresentConfigNV(ByteBuffer container) {
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
    public int numFramesPerBatch() {
        return nnumFramesPerBatch(address());
    }

    @NativeType("uint32_t")
    public int presentConfigFeedback() {
        return npresentConfigFeedback(address());
    }

    public VkSetPresentConfigNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSetPresentConfigNV sType$Default() {
        return sType(NVPresentMetering.VK_STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV);
    }

    public VkSetPresentConfigNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSetPresentConfigNV numFramesPerBatch(@NativeType("uint32_t") int value) {
        nnumFramesPerBatch(address(), value);
        return this;
    }

    public VkSetPresentConfigNV presentConfigFeedback(@NativeType("uint32_t") int value) {
        npresentConfigFeedback(address(), value);
        return this;
    }

    public VkSetPresentConfigNV set(int sType, long pNext, int numFramesPerBatch, int presentConfigFeedback) {
        sType(sType);
        pNext(pNext);
        numFramesPerBatch(numFramesPerBatch);
        presentConfigFeedback(presentConfigFeedback);
        return this;
    }

    public VkSetPresentConfigNV set(VkSetPresentConfigNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSetPresentConfigNV malloc() {
        return new VkSetPresentConfigNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSetPresentConfigNV calloc() {
        return new VkSetPresentConfigNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSetPresentConfigNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSetPresentConfigNV(MemoryUtil.memAddress(container), container);
    }

    public static VkSetPresentConfigNV create(long address) {
        return new VkSetPresentConfigNV(address, null);
    }

    public static VkSetPresentConfigNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSetPresentConfigNV(address, null);
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

    public static VkSetPresentConfigNV malloc(MemoryStack stack) {
        return new VkSetPresentConfigNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSetPresentConfigNV calloc(MemoryStack stack) {
        return new VkSetPresentConfigNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nnumFramesPerBatch(long struct) {
        return MemoryUtil.memGetInt(struct + NUMFRAMESPERBATCH);
    }

    public static int npresentConfigFeedback(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTCONFIGFEEDBACK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nnumFramesPerBatch(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUMFRAMESPERBATCH, value);
    }

    public static void npresentConfigFeedback(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTCONFIGFEEDBACK, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSetPresentConfigNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkSetPresentConfigNV, Buffer> implements NativeResource {
        private static final VkSetPresentConfigNV ELEMENT_FACTORY = VkSetPresentConfigNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSetPresentConfigNV.SIZEOF);
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
        public VkSetPresentConfigNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSetPresentConfigNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSetPresentConfigNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int numFramesPerBatch() {
            return VkSetPresentConfigNV.nnumFramesPerBatch(address());
        }

        @NativeType("uint32_t")
        public int presentConfigFeedback() {
            return VkSetPresentConfigNV.npresentConfigFeedback(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSetPresentConfigNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPresentMetering.VK_STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSetPresentConfigNV.npNext(address(), value);
            return this;
        }

        public Buffer numFramesPerBatch(@NativeType("uint32_t") int value) {
            VkSetPresentConfigNV.nnumFramesPerBatch(address(), value);
            return this;
        }

        public Buffer presentConfigFeedback(@NativeType("uint32_t") int value) {
            VkSetPresentConfigNV.npresentConfigFeedback(address(), value);
            return this;
        }
    }
}
