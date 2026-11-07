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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkD3D12FenceSubmitInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkD3D12FenceSubmitInfoKHR.class */
public class VkD3D12FenceSubmitInfoKHR extends Struct<VkD3D12FenceSubmitInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int WAITSEMAPHOREVALUESCOUNT;
    public static final int PWAITSEMAPHOREVALUES;
    public static final int SIGNALSEMAPHOREVALUESCOUNT;
    public static final int PSIGNALSEMAPHOREVALUES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHOREVALUESCOUNT = layout.offsetof(2);
        PWAITSEMAPHOREVALUES = layout.offsetof(3);
        SIGNALSEMAPHOREVALUESCOUNT = layout.offsetof(4);
        PSIGNALSEMAPHOREVALUES = layout.offsetof(5);
    }

    protected VkD3D12FenceSubmitInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkD3D12FenceSubmitInfoKHR create(long address, ByteBuffer container) {
        return new VkD3D12FenceSubmitInfoKHR(address, container);
    }

    public VkD3D12FenceSubmitInfoKHR(ByteBuffer container) {
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
    public int waitSemaphoreValuesCount() {
        return nwaitSemaphoreValuesCount(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pWaitSemaphoreValues() {
        return npWaitSemaphoreValues(address());
    }

    @NativeType("uint32_t")
    public int signalSemaphoreValuesCount() {
        return nsignalSemaphoreValuesCount(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pSignalSemaphoreValues() {
        return npSignalSemaphoreValues(address());
    }

    public VkD3D12FenceSubmitInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkD3D12FenceSubmitInfoKHR sType$Default() {
        return sType(KHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR);
    }

    public VkD3D12FenceSubmitInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkD3D12FenceSubmitInfoKHR waitSemaphoreValuesCount(@NativeType("uint32_t") int value) {
        nwaitSemaphoreValuesCount(address(), value);
        return this;
    }

    public VkD3D12FenceSubmitInfoKHR pWaitSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
        npWaitSemaphoreValues(address(), value);
        return this;
    }

    public VkD3D12FenceSubmitInfoKHR signalSemaphoreValuesCount(@NativeType("uint32_t") int value) {
        nsignalSemaphoreValuesCount(address(), value);
        return this;
    }

    public VkD3D12FenceSubmitInfoKHR pSignalSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
        npSignalSemaphoreValues(address(), value);
        return this;
    }

    public VkD3D12FenceSubmitInfoKHR set(int sType, long pNext, int waitSemaphoreValuesCount, LongBuffer pWaitSemaphoreValues, int signalSemaphoreValuesCount, LongBuffer pSignalSemaphoreValues) {
        sType(sType);
        pNext(pNext);
        waitSemaphoreValuesCount(waitSemaphoreValuesCount);
        pWaitSemaphoreValues(pWaitSemaphoreValues);
        signalSemaphoreValuesCount(signalSemaphoreValuesCount);
        pSignalSemaphoreValues(pSignalSemaphoreValues);
        return this;
    }

    public VkD3D12FenceSubmitInfoKHR set(VkD3D12FenceSubmitInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkD3D12FenceSubmitInfoKHR malloc() {
        return new VkD3D12FenceSubmitInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkD3D12FenceSubmitInfoKHR calloc() {
        return new VkD3D12FenceSubmitInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkD3D12FenceSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkD3D12FenceSubmitInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkD3D12FenceSubmitInfoKHR create(long address) {
        return new VkD3D12FenceSubmitInfoKHR(address, null);
    }

    public static VkD3D12FenceSubmitInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkD3D12FenceSubmitInfoKHR(address, null);
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

    public static VkD3D12FenceSubmitInfoKHR malloc(MemoryStack stack) {
        return new VkD3D12FenceSubmitInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkD3D12FenceSubmitInfoKHR calloc(MemoryStack stack) {
        return new VkD3D12FenceSubmitInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nwaitSemaphoreValuesCount(long struct) {
        return MemoryUtil.memGetInt(struct + WAITSEMAPHOREVALUESCOUNT);
    }

    public static LongBuffer npWaitSemaphoreValues(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PWAITSEMAPHOREVALUES), nwaitSemaphoreValuesCount(struct));
    }

    public static int nsignalSemaphoreValuesCount(long struct) {
        return MemoryUtil.memGetInt(struct + SIGNALSEMAPHOREVALUESCOUNT);
    }

    public static LongBuffer npSignalSemaphoreValues(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PSIGNALSEMAPHOREVALUES), nsignalSemaphoreValuesCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nwaitSemaphoreValuesCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + WAITSEMAPHOREVALUESCOUNT, value);
    }

    public static void npWaitSemaphoreValues(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PWAITSEMAPHOREVALUES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nwaitSemaphoreValuesCount(struct, value.remaining());
        }
    }

    public static void nsignalSemaphoreValuesCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIGNALSEMAPHOREVALUESCOUNT, value);
    }

    public static void npSignalSemaphoreValues(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSIGNALSEMAPHOREVALUES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nsignalSemaphoreValuesCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkD3D12FenceSubmitInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkD3D12FenceSubmitInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkD3D12FenceSubmitInfoKHR, Buffer> implements NativeResource {
        private static final VkD3D12FenceSubmitInfoKHR ELEMENT_FACTORY = VkD3D12FenceSubmitInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkD3D12FenceSubmitInfoKHR.SIZEOF);
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
        public VkD3D12FenceSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkD3D12FenceSubmitInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkD3D12FenceSubmitInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int waitSemaphoreValuesCount() {
            return VkD3D12FenceSubmitInfoKHR.nwaitSemaphoreValuesCount(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pWaitSemaphoreValues() {
            return VkD3D12FenceSubmitInfoKHR.npWaitSemaphoreValues(address());
        }

        @NativeType("uint32_t")
        public int signalSemaphoreValuesCount() {
            return VkD3D12FenceSubmitInfoKHR.nsignalSemaphoreValuesCount(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pSignalSemaphoreValues() {
            return VkD3D12FenceSubmitInfoKHR.npSignalSemaphoreValues(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkD3D12FenceSubmitInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkD3D12FenceSubmitInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer waitSemaphoreValuesCount(@NativeType("uint32_t") int value) {
            VkD3D12FenceSubmitInfoKHR.nwaitSemaphoreValuesCount(address(), value);
            return this;
        }

        public Buffer pWaitSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
            VkD3D12FenceSubmitInfoKHR.npWaitSemaphoreValues(address(), value);
            return this;
        }

        public Buffer signalSemaphoreValuesCount(@NativeType("uint32_t") int value) {
            VkD3D12FenceSubmitInfoKHR.nsignalSemaphoreValuesCount(address(), value);
            return this;
        }

        public Buffer pSignalSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
            VkD3D12FenceSubmitInfoKHR.npSignalSemaphoreValues(address(), value);
            return this;
        }
    }
}
