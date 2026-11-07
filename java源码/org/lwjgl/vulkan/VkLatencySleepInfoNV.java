package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLatencySleepInfoNV.class */
public class VkLatencySleepInfoNV extends Struct<VkLatencySleepInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SIGNALSEMAPHORE;
    public static final int VALUE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SIGNALSEMAPHORE = layout.offsetof(2);
        VALUE = layout.offsetof(3);
    }

    protected VkLatencySleepInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkLatencySleepInfoNV create(long address, ByteBuffer container) {
        return new VkLatencySleepInfoNV(address, container);
    }

    public VkLatencySleepInfoNV(ByteBuffer container) {
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

    @NativeType("VkSemaphore")
    public long signalSemaphore() {
        return nsignalSemaphore(address());
    }

    @NativeType("uint64_t")
    public long value() {
        return nvalue(address());
    }

    public VkLatencySleepInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkLatencySleepInfoNV sType$Default() {
        return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV);
    }

    public VkLatencySleepInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkLatencySleepInfoNV signalSemaphore(@NativeType("VkSemaphore") long value) {
        nsignalSemaphore(address(), value);
        return this;
    }

    public VkLatencySleepInfoNV value(@NativeType("uint64_t") long value) {
        nvalue(address(), value);
        return this;
    }

    public VkLatencySleepInfoNV set(int sType, long pNext, long signalSemaphore, long value) {
        sType(sType);
        pNext(pNext);
        signalSemaphore(signalSemaphore);
        value(value);
        return this;
    }

    public VkLatencySleepInfoNV set(VkLatencySleepInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkLatencySleepInfoNV malloc() {
        return new VkLatencySleepInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkLatencySleepInfoNV calloc() {
        return new VkLatencySleepInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkLatencySleepInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLatencySleepInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkLatencySleepInfoNV create(long address) {
        return new VkLatencySleepInfoNV(address, null);
    }

    public static VkLatencySleepInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkLatencySleepInfoNV(address, null);
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

    public static VkLatencySleepInfoNV malloc(MemoryStack stack) {
        return new VkLatencySleepInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkLatencySleepInfoNV calloc(MemoryStack stack) {
        return new VkLatencySleepInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsignalSemaphore(long struct) {
        return MemoryUtil.memGetLong(struct + SIGNALSEMAPHORE);
    }

    public static long nvalue(long struct) {
        return MemoryUtil.memGetLong(struct + VALUE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsignalSemaphore(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIGNALSEMAPHORE, value);
    }

    public static void nvalue(long struct, long value) {
        MemoryUtil.memPutLong(struct + VALUE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLatencySleepInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkLatencySleepInfoNV, Buffer> implements NativeResource {
        private static final VkLatencySleepInfoNV ELEMENT_FACTORY = VkLatencySleepInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkLatencySleepInfoNV.SIZEOF);
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
        public VkLatencySleepInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkLatencySleepInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkLatencySleepInfoNV.npNext(address());
        }

        @NativeType("VkSemaphore")
        public long signalSemaphore() {
            return VkLatencySleepInfoNV.nsignalSemaphore(address());
        }

        @NativeType("uint64_t")
        public long value() {
            return VkLatencySleepInfoNV.nvalue(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkLatencySleepInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkLatencySleepInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer signalSemaphore(@NativeType("VkSemaphore") long value) {
            VkLatencySleepInfoNV.nsignalSemaphore(address(), value);
            return this;
        }

        public Buffer value(@NativeType("uint64_t") long value) {
            VkLatencySleepInfoNV.nvalue(address(), value);
            return this;
        }
    }
}
