package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfo.class */
public class VkTimelineSemaphoreSubmitInfo extends Struct<VkTimelineSemaphoreSubmitInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int WAITSEMAPHOREVALUECOUNT;
    public static final int PWAITSEMAPHOREVALUES;
    public static final int SIGNALSEMAPHOREVALUECOUNT;
    public static final int PSIGNALSEMAPHOREVALUES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHOREVALUECOUNT = layout.offsetof(2);
        PWAITSEMAPHOREVALUES = layout.offsetof(3);
        SIGNALSEMAPHOREVALUECOUNT = layout.offsetof(4);
        PSIGNALSEMAPHOREVALUES = layout.offsetof(5);
    }

    protected VkTimelineSemaphoreSubmitInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTimelineSemaphoreSubmitInfo create(long address, ByteBuffer container) {
        return new VkTimelineSemaphoreSubmitInfo(address, container);
    }

    public VkTimelineSemaphoreSubmitInfo(ByteBuffer container) {
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
    public int waitSemaphoreValueCount() {
        return nwaitSemaphoreValueCount(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pWaitSemaphoreValues() {
        return npWaitSemaphoreValues(address());
    }

    @NativeType("uint32_t")
    public int signalSemaphoreValueCount() {
        return nsignalSemaphoreValueCount(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pSignalSemaphoreValues() {
        return npSignalSemaphoreValues(address());
    }

    public VkTimelineSemaphoreSubmitInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTimelineSemaphoreSubmitInfo sType$Default() {
        return sType(1000207003);
    }

    public VkTimelineSemaphoreSubmitInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTimelineSemaphoreSubmitInfo waitSemaphoreValueCount(@NativeType("uint32_t") int value) {
        nwaitSemaphoreValueCount(address(), value);
        return this;
    }

    public VkTimelineSemaphoreSubmitInfo pWaitSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
        npWaitSemaphoreValues(address(), value);
        return this;
    }

    public VkTimelineSemaphoreSubmitInfo signalSemaphoreValueCount(@NativeType("uint32_t") int value) {
        nsignalSemaphoreValueCount(address(), value);
        return this;
    }

    public VkTimelineSemaphoreSubmitInfo pSignalSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
        npSignalSemaphoreValues(address(), value);
        return this;
    }

    public VkTimelineSemaphoreSubmitInfo set(int sType, long pNext, int waitSemaphoreValueCount, LongBuffer pWaitSemaphoreValues, int signalSemaphoreValueCount, LongBuffer pSignalSemaphoreValues) {
        sType(sType);
        pNext(pNext);
        waitSemaphoreValueCount(waitSemaphoreValueCount);
        pWaitSemaphoreValues(pWaitSemaphoreValues);
        signalSemaphoreValueCount(signalSemaphoreValueCount);
        pSignalSemaphoreValues(pSignalSemaphoreValues);
        return this;
    }

    public VkTimelineSemaphoreSubmitInfo set(VkTimelineSemaphoreSubmitInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTimelineSemaphoreSubmitInfo malloc() {
        return new VkTimelineSemaphoreSubmitInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTimelineSemaphoreSubmitInfo calloc() {
        return new VkTimelineSemaphoreSubmitInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTimelineSemaphoreSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTimelineSemaphoreSubmitInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkTimelineSemaphoreSubmitInfo create(long address) {
        return new VkTimelineSemaphoreSubmitInfo(address, null);
    }

    public static VkTimelineSemaphoreSubmitInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTimelineSemaphoreSubmitInfo(address, null);
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

    public static VkTimelineSemaphoreSubmitInfo malloc(MemoryStack stack) {
        return new VkTimelineSemaphoreSubmitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTimelineSemaphoreSubmitInfo calloc(MemoryStack stack) {
        return new VkTimelineSemaphoreSubmitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nwaitSemaphoreValueCount(long struct) {
        return MemoryUtil.memGetInt(struct + WAITSEMAPHOREVALUECOUNT);
    }

    public static LongBuffer npWaitSemaphoreValues(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PWAITSEMAPHOREVALUES), nwaitSemaphoreValueCount(struct));
    }

    public static int nsignalSemaphoreValueCount(long struct) {
        return MemoryUtil.memGetInt(struct + SIGNALSEMAPHOREVALUECOUNT);
    }

    public static LongBuffer npSignalSemaphoreValues(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PSIGNALSEMAPHOREVALUES), nsignalSemaphoreValueCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nwaitSemaphoreValueCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + WAITSEMAPHOREVALUECOUNT, value);
    }

    public static void npWaitSemaphoreValues(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PWAITSEMAPHOREVALUES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nwaitSemaphoreValueCount(struct, value.remaining());
        }
    }

    public static void nsignalSemaphoreValueCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIGNALSEMAPHOREVALUECOUNT, value);
    }

    public static void npSignalSemaphoreValues(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSIGNALSEMAPHOREVALUES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nsignalSemaphoreValueCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkTimelineSemaphoreSubmitInfo, Buffer> implements NativeResource {
        private static final VkTimelineSemaphoreSubmitInfo ELEMENT_FACTORY = VkTimelineSemaphoreSubmitInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTimelineSemaphoreSubmitInfo.SIZEOF);
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
        public VkTimelineSemaphoreSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTimelineSemaphoreSubmitInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkTimelineSemaphoreSubmitInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int waitSemaphoreValueCount() {
            return VkTimelineSemaphoreSubmitInfo.nwaitSemaphoreValueCount(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pWaitSemaphoreValues() {
            return VkTimelineSemaphoreSubmitInfo.npWaitSemaphoreValues(address());
        }

        @NativeType("uint32_t")
        public int signalSemaphoreValueCount() {
            return VkTimelineSemaphoreSubmitInfo.nsignalSemaphoreValueCount(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pSignalSemaphoreValues() {
            return VkTimelineSemaphoreSubmitInfo.npSignalSemaphoreValues(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTimelineSemaphoreSubmitInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000207003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkTimelineSemaphoreSubmitInfo.npNext(address(), value);
            return this;
        }

        public Buffer waitSemaphoreValueCount(@NativeType("uint32_t") int value) {
            VkTimelineSemaphoreSubmitInfo.nwaitSemaphoreValueCount(address(), value);
            return this;
        }

        public Buffer pWaitSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
            VkTimelineSemaphoreSubmitInfo.npWaitSemaphoreValues(address(), value);
            return this;
        }

        public Buffer signalSemaphoreValueCount(@NativeType("uint32_t") int value) {
            VkTimelineSemaphoreSubmitInfo.nsignalSemaphoreValueCount(address(), value);
            return this;
        }

        public Buffer pSignalSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
            VkTimelineSemaphoreSubmitInfo.npSignalSemaphoreValues(address(), value);
            return this;
        }
    }
}
