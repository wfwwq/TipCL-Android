package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkCommandBufferSubmitInfo;
import org.lwjgl.vulkan.VkSemaphoreSubmitInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo2.class */
public class VkSubmitInfo2 extends Struct<VkSubmitInfo2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int WAITSEMAPHOREINFOCOUNT;
    public static final int PWAITSEMAPHOREINFOS;
    public static final int COMMANDBUFFERINFOCOUNT;
    public static final int PCOMMANDBUFFERINFOS;
    public static final int SIGNALSEMAPHOREINFOCOUNT;
    public static final int PSIGNALSEMAPHOREINFOS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        WAITSEMAPHOREINFOCOUNT = layout.offsetof(3);
        PWAITSEMAPHOREINFOS = layout.offsetof(4);
        COMMANDBUFFERINFOCOUNT = layout.offsetof(5);
        PCOMMANDBUFFERINFOS = layout.offsetof(6);
        SIGNALSEMAPHOREINFOCOUNT = layout.offsetof(7);
        PSIGNALSEMAPHOREINFOS = layout.offsetof(8);
    }

    protected VkSubmitInfo2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubmitInfo2 create(long address, ByteBuffer container) {
        return new VkSubmitInfo2(address, container);
    }

    public VkSubmitInfo2(ByteBuffer container) {
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

    @NativeType("VkSubmitFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int waitSemaphoreInfoCount() {
        return nwaitSemaphoreInfoCount(address());
    }

    @NativeType("VkSemaphoreSubmitInfo const *")
    public VkSemaphoreSubmitInfo.Buffer pWaitSemaphoreInfos() {
        return npWaitSemaphoreInfos(address());
    }

    @NativeType("uint32_t")
    public int commandBufferInfoCount() {
        return ncommandBufferInfoCount(address());
    }

    @NativeType("VkCommandBufferSubmitInfo const *")
    public VkCommandBufferSubmitInfo.Buffer pCommandBufferInfos() {
        return npCommandBufferInfos(address());
    }

    @NativeType("uint32_t")
    public int signalSemaphoreInfoCount() {
        return nsignalSemaphoreInfoCount(address());
    }

    @NativeType("VkSemaphoreSubmitInfo const *")
    public VkSemaphoreSubmitInfo.Buffer pSignalSemaphoreInfos() {
        return npSignalSemaphoreInfos(address());
    }

    public VkSubmitInfo2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSubmitInfo2 sType$Default() {
        return sType(1000314004);
    }

    public VkSubmitInfo2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSubmitInfo2 pNext(VkFrameBoundaryEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo2 pNext(VkFrameBoundaryTensorsARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo2 pNext(VkLatencySubmissionPresentIdNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo2 pNext(VkPerformanceQuerySubmitInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo2 pNext(VkWin32KeyedMutexAcquireReleaseInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo2 pNext(VkWin32KeyedMutexAcquireReleaseInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo2 flags(@NativeType("VkSubmitFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkSubmitInfo2 pWaitSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) {
        npWaitSemaphoreInfos(address(), value);
        return this;
    }

    public VkSubmitInfo2 pCommandBufferInfos(@NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.Buffer value) {
        npCommandBufferInfos(address(), value);
        return this;
    }

    public VkSubmitInfo2 pSignalSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) {
        npSignalSemaphoreInfos(address(), value);
        return this;
    }

    public VkSubmitInfo2 set(int sType, long pNext, int flags, VkSemaphoreSubmitInfo.Buffer pWaitSemaphoreInfos, VkCommandBufferSubmitInfo.Buffer pCommandBufferInfos, VkSemaphoreSubmitInfo.Buffer pSignalSemaphoreInfos) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pWaitSemaphoreInfos(pWaitSemaphoreInfos);
        pCommandBufferInfos(pCommandBufferInfos);
        pSignalSemaphoreInfos(pSignalSemaphoreInfos);
        return this;
    }

    public VkSubmitInfo2 set(VkSubmitInfo2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubmitInfo2 malloc() {
        return new VkSubmitInfo2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubmitInfo2 calloc() {
        return new VkSubmitInfo2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubmitInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubmitInfo2(MemoryUtil.memAddress(container), container);
    }

    public static VkSubmitInfo2 create(long address) {
        return new VkSubmitInfo2(address, null);
    }

    public static VkSubmitInfo2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubmitInfo2(address, null);
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

    public static VkSubmitInfo2 malloc(MemoryStack stack) {
        return new VkSubmitInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubmitInfo2 calloc(MemoryStack stack) {
        return new VkSubmitInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nwaitSemaphoreInfoCount(long struct) {
        return MemoryUtil.memGetInt(struct + WAITSEMAPHOREINFOCOUNT);
    }

    public static VkSemaphoreSubmitInfo.Buffer npWaitSemaphoreInfos(long struct) {
        return VkSemaphoreSubmitInfo.createSafe(MemoryUtil.memGetAddress(struct + PWAITSEMAPHOREINFOS), nwaitSemaphoreInfoCount(struct));
    }

    public static int ncommandBufferInfoCount(long struct) {
        return MemoryUtil.memGetInt(struct + COMMANDBUFFERINFOCOUNT);
    }

    public static VkCommandBufferSubmitInfo.Buffer npCommandBufferInfos(long struct) {
        return VkCommandBufferSubmitInfo.createSafe(MemoryUtil.memGetAddress(struct + PCOMMANDBUFFERINFOS), ncommandBufferInfoCount(struct));
    }

    public static int nsignalSemaphoreInfoCount(long struct) {
        return MemoryUtil.memGetInt(struct + SIGNALSEMAPHOREINFOCOUNT);
    }

    public static VkSemaphoreSubmitInfo.Buffer npSignalSemaphoreInfos(long struct) {
        return VkSemaphoreSubmitInfo.createSafe(MemoryUtil.memGetAddress(struct + PSIGNALSEMAPHOREINFOS), nsignalSemaphoreInfoCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nwaitSemaphoreInfoCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + WAITSEMAPHOREINFOCOUNT, value);
    }

    public static void npWaitSemaphoreInfos(long struct, VkSemaphoreSubmitInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PWAITSEMAPHOREINFOS, MemoryUtil.memAddressSafe(value));
        nwaitSemaphoreInfoCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ncommandBufferInfoCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMMANDBUFFERINFOCOUNT, value);
    }

    public static void npCommandBufferInfos(long struct, VkCommandBufferSubmitInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PCOMMANDBUFFERINFOS, MemoryUtil.memAddressSafe(value));
        ncommandBufferInfoCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nsignalSemaphoreInfoCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIGNALSEMAPHOREINFOCOUNT, value);
    }

    public static void npSignalSemaphoreInfos(long struct, VkSemaphoreSubmitInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSIGNALSEMAPHOREINFOS, MemoryUtil.memAddressSafe(value));
        nsignalSemaphoreInfoCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nwaitSemaphoreInfoCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PWAITSEMAPHOREINFOS));
        }
        int commandBufferInfoCount = ncommandBufferInfoCount(struct);
        if (commandBufferInfoCount != 0) {
            long pCommandBufferInfos = MemoryUtil.memGetAddress(struct + PCOMMANDBUFFERINFOS);
            Checks.check(pCommandBufferInfos);
            validate(pCommandBufferInfos, commandBufferInfoCount, VkCommandBufferSubmitInfo.SIZEOF, VkCommandBufferSubmitInfo::validate);
        }
        if (nsignalSemaphoreInfoCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PSIGNALSEMAPHOREINFOS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo2$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubmitInfo2, Buffer> implements NativeResource {
        private static final VkSubmitInfo2 ELEMENT_FACTORY = VkSubmitInfo2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubmitInfo2.SIZEOF);
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
        public VkSubmitInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSubmitInfo2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSubmitInfo2.npNext(address());
        }

        @NativeType("VkSubmitFlags")
        public int flags() {
            return VkSubmitInfo2.nflags(address());
        }

        @NativeType("uint32_t")
        public int waitSemaphoreInfoCount() {
            return VkSubmitInfo2.nwaitSemaphoreInfoCount(address());
        }

        @NativeType("VkSemaphoreSubmitInfo const *")
        public VkSemaphoreSubmitInfo.Buffer pWaitSemaphoreInfos() {
            return VkSubmitInfo2.npWaitSemaphoreInfos(address());
        }

        @NativeType("uint32_t")
        public int commandBufferInfoCount() {
            return VkSubmitInfo2.ncommandBufferInfoCount(address());
        }

        @NativeType("VkCommandBufferSubmitInfo const *")
        public VkCommandBufferSubmitInfo.Buffer pCommandBufferInfos() {
            return VkSubmitInfo2.npCommandBufferInfos(address());
        }

        @NativeType("uint32_t")
        public int signalSemaphoreInfoCount() {
            return VkSubmitInfo2.nsignalSemaphoreInfoCount(address());
        }

        @NativeType("VkSemaphoreSubmitInfo const *")
        public VkSemaphoreSubmitInfo.Buffer pSignalSemaphoreInfos() {
            return VkSubmitInfo2.npSignalSemaphoreInfos(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubmitInfo2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000314004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubmitInfo2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkFrameBoundaryEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkFrameBoundaryTensorsARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkLatencySubmissionPresentIdNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPerformanceQuerySubmitInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkWin32KeyedMutexAcquireReleaseInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkWin32KeyedMutexAcquireReleaseInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkSubmitFlags") int value) {
            VkSubmitInfo2.nflags(address(), value);
            return this;
        }

        public Buffer pWaitSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) {
            VkSubmitInfo2.npWaitSemaphoreInfos(address(), value);
            return this;
        }

        public Buffer pCommandBufferInfos(@NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.Buffer value) {
            VkSubmitInfo2.npCommandBufferInfos(address(), value);
            return this;
        }

        public Buffer pSignalSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) {
            VkSubmitInfo2.npSignalSemaphoreInfos(address(), value);
            return this;
        }
    }
}
