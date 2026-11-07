package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOutOfBandQueueTypeInfoNV.class */
public class VkOutOfBandQueueTypeInfoNV extends Struct<VkOutOfBandQueueTypeInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int QUEUETYPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUETYPE = layout.offsetof(2);
    }

    protected VkOutOfBandQueueTypeInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkOutOfBandQueueTypeInfoNV create(long address, ByteBuffer container) {
        return new VkOutOfBandQueueTypeInfoNV(address, container);
    }

    public VkOutOfBandQueueTypeInfoNV(ByteBuffer container) {
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

    @NativeType("VkOutOfBandQueueTypeNV")
    public int queueType() {
        return nqueueType(address());
    }

    public VkOutOfBandQueueTypeInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkOutOfBandQueueTypeInfoNV sType$Default() {
        return sType(NVLowLatency2.VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV);
    }

    public VkOutOfBandQueueTypeInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkOutOfBandQueueTypeInfoNV queueType(@NativeType("VkOutOfBandQueueTypeNV") int value) {
        nqueueType(address(), value);
        return this;
    }

    public VkOutOfBandQueueTypeInfoNV set(int sType, long pNext, int queueType) {
        sType(sType);
        pNext(pNext);
        queueType(queueType);
        return this;
    }

    public VkOutOfBandQueueTypeInfoNV set(VkOutOfBandQueueTypeInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkOutOfBandQueueTypeInfoNV malloc() {
        return new VkOutOfBandQueueTypeInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkOutOfBandQueueTypeInfoNV calloc() {
        return new VkOutOfBandQueueTypeInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkOutOfBandQueueTypeInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOutOfBandQueueTypeInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkOutOfBandQueueTypeInfoNV create(long address) {
        return new VkOutOfBandQueueTypeInfoNV(address, null);
    }

    public static VkOutOfBandQueueTypeInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkOutOfBandQueueTypeInfoNV(address, null);
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

    public static VkOutOfBandQueueTypeInfoNV malloc(MemoryStack stack) {
        return new VkOutOfBandQueueTypeInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkOutOfBandQueueTypeInfoNV calloc(MemoryStack stack) {
        return new VkOutOfBandQueueTypeInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nqueueType(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUETYPE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nqueueType(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUETYPE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOutOfBandQueueTypeInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkOutOfBandQueueTypeInfoNV, Buffer> implements NativeResource {
        private static final VkOutOfBandQueueTypeInfoNV ELEMENT_FACTORY = VkOutOfBandQueueTypeInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkOutOfBandQueueTypeInfoNV.SIZEOF);
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
        public VkOutOfBandQueueTypeInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkOutOfBandQueueTypeInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkOutOfBandQueueTypeInfoNV.npNext(address());
        }

        @NativeType("VkOutOfBandQueueTypeNV")
        public int queueType() {
            return VkOutOfBandQueueTypeInfoNV.nqueueType(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkOutOfBandQueueTypeInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVLowLatency2.VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkOutOfBandQueueTypeInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer queueType(@NativeType("VkOutOfBandQueueTypeNV") int value) {
            VkOutOfBandQueueTypeInfoNV.nqueueType(address(), value);
            return this;
        }
    }
}
