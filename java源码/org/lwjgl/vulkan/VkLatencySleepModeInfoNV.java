package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLatencySleepModeInfoNV.class */
public class VkLatencySleepModeInfoNV extends Struct<VkLatencySleepModeInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int LOWLATENCYMODE;
    public static final int LOWLATENCYBOOST;
    public static final int MINIMUMINTERVALUS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LOWLATENCYMODE = layout.offsetof(2);
        LOWLATENCYBOOST = layout.offsetof(3);
        MINIMUMINTERVALUS = layout.offsetof(4);
    }

    protected VkLatencySleepModeInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkLatencySleepModeInfoNV create(long address, ByteBuffer container) {
        return new VkLatencySleepModeInfoNV(address, container);
    }

    public VkLatencySleepModeInfoNV(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean lowLatencyMode() {
        return nlowLatencyMode(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean lowLatencyBoost() {
        return nlowLatencyBoost(address()) != 0;
    }

    @NativeType("uint32_t")
    public int minimumIntervalUs() {
        return nminimumIntervalUs(address());
    }

    public VkLatencySleepModeInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkLatencySleepModeInfoNV sType$Default() {
        return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV);
    }

    public VkLatencySleepModeInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkLatencySleepModeInfoNV lowLatencyMode(@NativeType("VkBool32") boolean value) {
        nlowLatencyMode(address(), value ? 1 : 0);
        return this;
    }

    public VkLatencySleepModeInfoNV lowLatencyBoost(@NativeType("VkBool32") boolean value) {
        nlowLatencyBoost(address(), value ? 1 : 0);
        return this;
    }

    public VkLatencySleepModeInfoNV minimumIntervalUs(@NativeType("uint32_t") int value) {
        nminimumIntervalUs(address(), value);
        return this;
    }

    public VkLatencySleepModeInfoNV set(int sType, long pNext, boolean lowLatencyMode, boolean lowLatencyBoost, int minimumIntervalUs) {
        sType(sType);
        pNext(pNext);
        lowLatencyMode(lowLatencyMode);
        lowLatencyBoost(lowLatencyBoost);
        minimumIntervalUs(minimumIntervalUs);
        return this;
    }

    public VkLatencySleepModeInfoNV set(VkLatencySleepModeInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkLatencySleepModeInfoNV malloc() {
        return new VkLatencySleepModeInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkLatencySleepModeInfoNV calloc() {
        return new VkLatencySleepModeInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkLatencySleepModeInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLatencySleepModeInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkLatencySleepModeInfoNV create(long address) {
        return new VkLatencySleepModeInfoNV(address, null);
    }

    public static VkLatencySleepModeInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkLatencySleepModeInfoNV(address, null);
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

    public static VkLatencySleepModeInfoNV malloc(MemoryStack stack) {
        return new VkLatencySleepModeInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkLatencySleepModeInfoNV calloc(MemoryStack stack) {
        return new VkLatencySleepModeInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nlowLatencyMode(long struct) {
        return MemoryUtil.memGetInt(struct + LOWLATENCYMODE);
    }

    public static int nlowLatencyBoost(long struct) {
        return MemoryUtil.memGetInt(struct + LOWLATENCYBOOST);
    }

    public static int nminimumIntervalUs(long struct) {
        return MemoryUtil.memGetInt(struct + MINIMUMINTERVALUS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nlowLatencyMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOWLATENCYMODE, value);
    }

    public static void nlowLatencyBoost(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOWLATENCYBOOST, value);
    }

    public static void nminimumIntervalUs(long struct, int value) {
        MemoryUtil.memPutInt(struct + MINIMUMINTERVALUS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLatencySleepModeInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkLatencySleepModeInfoNV, Buffer> implements NativeResource {
        private static final VkLatencySleepModeInfoNV ELEMENT_FACTORY = VkLatencySleepModeInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkLatencySleepModeInfoNV.SIZEOF);
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
        public VkLatencySleepModeInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkLatencySleepModeInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkLatencySleepModeInfoNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean lowLatencyMode() {
            return VkLatencySleepModeInfoNV.nlowLatencyMode(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean lowLatencyBoost() {
            return VkLatencySleepModeInfoNV.nlowLatencyBoost(address()) != 0;
        }

        @NativeType("uint32_t")
        public int minimumIntervalUs() {
            return VkLatencySleepModeInfoNV.nminimumIntervalUs(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkLatencySleepModeInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkLatencySleepModeInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer lowLatencyMode(@NativeType("VkBool32") boolean value) {
            VkLatencySleepModeInfoNV.nlowLatencyMode(address(), value ? 1 : 0);
            return this;
        }

        public Buffer lowLatencyBoost(@NativeType("VkBool32") boolean value) {
            VkLatencySleepModeInfoNV.nlowLatencyBoost(address(), value ? 1 : 0);
            return this;
        }

        public Buffer minimumIntervalUs(@NativeType("uint32_t") int value) {
            VkLatencySleepModeInfoNV.nminimumIntervalUs(address(), value);
            return this;
        }
    }
}
