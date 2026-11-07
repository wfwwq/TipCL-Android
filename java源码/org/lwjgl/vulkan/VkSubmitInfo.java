package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo.class */
public class VkSubmitInfo extends Struct<VkSubmitInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int WAITSEMAPHORECOUNT;
    public static final int PWAITSEMAPHORES;
    public static final int PWAITDSTSTAGEMASK;
    public static final int COMMANDBUFFERCOUNT;
    public static final int PCOMMANDBUFFERS;
    public static final int SIGNALSEMAPHORECOUNT;
    public static final int PSIGNALSEMAPHORES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHORECOUNT = layout.offsetof(2);
        PWAITSEMAPHORES = layout.offsetof(3);
        PWAITDSTSTAGEMASK = layout.offsetof(4);
        COMMANDBUFFERCOUNT = layout.offsetof(5);
        PCOMMANDBUFFERS = layout.offsetof(6);
        SIGNALSEMAPHORECOUNT = layout.offsetof(7);
        PSIGNALSEMAPHORES = layout.offsetof(8);
    }

    protected VkSubmitInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubmitInfo create(long address, ByteBuffer container) {
        return new VkSubmitInfo(address, container);
    }

    public VkSubmitInfo(ByteBuffer container) {
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
    public int waitSemaphoreCount() {
        return nwaitSemaphoreCount(address());
    }

    @NativeType("VkSemaphore const *")
    public LongBuffer pWaitSemaphores() {
        return npWaitSemaphores(address());
    }

    @NativeType("VkPipelineStageFlags const *")
    public IntBuffer pWaitDstStageMask() {
        return npWaitDstStageMask(address());
    }

    @NativeType("uint32_t")
    public int commandBufferCount() {
        return ncommandBufferCount(address());
    }

    @NativeType("VkCommandBuffer const *")
    public PointerBuffer pCommandBuffers() {
        return npCommandBuffers(address());
    }

    @NativeType("uint32_t")
    public int signalSemaphoreCount() {
        return nsignalSemaphoreCount(address());
    }

    @NativeType("VkSemaphore const *")
    public LongBuffer pSignalSemaphores() {
        return npSignalSemaphores(address());
    }

    public VkSubmitInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSubmitInfo sType$Default() {
        return sType(4);
    }

    public VkSubmitInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSubmitInfo pNext(VkAmigoProfilingSubmitInfoSEC value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkD3D12FenceSubmitInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkDeviceGroupSubmitInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkDeviceGroupSubmitInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkFrameBoundaryEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkFrameBoundaryTensorsARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkLatencySubmissionPresentIdNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkPerformanceQuerySubmitInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkProtectedSubmitInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkTimelineSemaphoreSubmitInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkTimelineSemaphoreSubmitInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkWin32KeyedMutexAcquireReleaseInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo pNext(VkWin32KeyedMutexAcquireReleaseInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubmitInfo waitSemaphoreCount(@NativeType("uint32_t") int value) {
        nwaitSemaphoreCount(address(), value);
        return this;
    }

    public VkSubmitInfo pWaitSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
        npWaitSemaphores(address(), value);
        return this;
    }

    public VkSubmitInfo pWaitDstStageMask(@NativeType("VkPipelineStageFlags const *") IntBuffer value) {
        npWaitDstStageMask(address(), value);
        return this;
    }

    public VkSubmitInfo pCommandBuffers(@NativeType("VkCommandBuffer const *") PointerBuffer value) {
        npCommandBuffers(address(), value);
        return this;
    }

    public VkSubmitInfo pSignalSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
        npSignalSemaphores(address(), value);
        return this;
    }

    public VkSubmitInfo set(int sType, long pNext, int waitSemaphoreCount, LongBuffer pWaitSemaphores, IntBuffer pWaitDstStageMask, PointerBuffer pCommandBuffers, LongBuffer pSignalSemaphores) {
        sType(sType);
        pNext(pNext);
        waitSemaphoreCount(waitSemaphoreCount);
        pWaitSemaphores(pWaitSemaphores);
        pWaitDstStageMask(pWaitDstStageMask);
        pCommandBuffers(pCommandBuffers);
        pSignalSemaphores(pSignalSemaphores);
        return this;
    }

    public VkSubmitInfo set(VkSubmitInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubmitInfo malloc() {
        return new VkSubmitInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubmitInfo calloc() {
        return new VkSubmitInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubmitInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSubmitInfo create(long address) {
        return new VkSubmitInfo(address, null);
    }

    public static VkSubmitInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubmitInfo(address, null);
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

    public static VkSubmitInfo malloc(MemoryStack stack) {
        return new VkSubmitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubmitInfo calloc(MemoryStack stack) {
        return new VkSubmitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nwaitSemaphoreCount(long struct) {
        return MemoryUtil.memGetInt(struct + WAITSEMAPHORECOUNT);
    }

    public static LongBuffer npWaitSemaphores(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PWAITSEMAPHORES), nwaitSemaphoreCount(struct));
    }

    public static IntBuffer npWaitDstStageMask(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PWAITDSTSTAGEMASK), nwaitSemaphoreCount(struct));
    }

    public static int ncommandBufferCount(long struct) {
        return MemoryUtil.memGetInt(struct + COMMANDBUFFERCOUNT);
    }

    public static PointerBuffer npCommandBuffers(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PCOMMANDBUFFERS), ncommandBufferCount(struct));
    }

    public static int nsignalSemaphoreCount(long struct) {
        return MemoryUtil.memGetInt(struct + SIGNALSEMAPHORECOUNT);
    }

    public static LongBuffer npSignalSemaphores(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PSIGNALSEMAPHORES), nsignalSemaphoreCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nwaitSemaphoreCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + WAITSEMAPHORECOUNT, value);
    }

    public static void npWaitSemaphores(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PWAITSEMAPHORES, MemoryUtil.memAddressSafe(value));
    }

    public static void npWaitDstStageMask(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PWAITDSTSTAGEMASK, MemoryUtil.memAddressSafe(value));
    }

    public static void ncommandBufferCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMMANDBUFFERCOUNT, value);
    }

    public static void npCommandBuffers(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOMMANDBUFFERS, MemoryUtil.memAddressSafe(value));
        ncommandBufferCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nsignalSemaphoreCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIGNALSEMAPHORECOUNT, value);
    }

    public static void npSignalSemaphores(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSIGNALSEMAPHORES, MemoryUtil.memAddressSafe(value));
        nsignalSemaphoreCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nwaitSemaphoreCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PWAITSEMAPHORES));
        }
        if (ncommandBufferCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PCOMMANDBUFFERS));
        }
        if (nsignalSemaphoreCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PSIGNALSEMAPHORES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubmitInfo, Buffer> implements NativeResource {
        private static final VkSubmitInfo ELEMENT_FACTORY = VkSubmitInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubmitInfo.SIZEOF);
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
        public VkSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSubmitInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSubmitInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int waitSemaphoreCount() {
            return VkSubmitInfo.nwaitSemaphoreCount(address());
        }

        @NativeType("VkSemaphore const *")
        public LongBuffer pWaitSemaphores() {
            return VkSubmitInfo.npWaitSemaphores(address());
        }

        @NativeType("VkPipelineStageFlags const *")
        public IntBuffer pWaitDstStageMask() {
            return VkSubmitInfo.npWaitDstStageMask(address());
        }

        @NativeType("uint32_t")
        public int commandBufferCount() {
            return VkSubmitInfo.ncommandBufferCount(address());
        }

        @NativeType("VkCommandBuffer const *")
        public PointerBuffer pCommandBuffers() {
            return VkSubmitInfo.npCommandBuffers(address());
        }

        @NativeType("uint32_t")
        public int signalSemaphoreCount() {
            return VkSubmitInfo.nsignalSemaphoreCount(address());
        }

        @NativeType("VkSemaphore const *")
        public LongBuffer pSignalSemaphores() {
            return VkSubmitInfo.npSignalSemaphores(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubmitInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(4);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubmitInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkAmigoProfilingSubmitInfoSEC value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkD3D12FenceSubmitInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceGroupSubmitInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceGroupSubmitInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
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

        public Buffer pNext(VkProtectedSubmitInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkTimelineSemaphoreSubmitInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkTimelineSemaphoreSubmitInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkWin32KeyedMutexAcquireReleaseInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkWin32KeyedMutexAcquireReleaseInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer waitSemaphoreCount(@NativeType("uint32_t") int value) {
            VkSubmitInfo.nwaitSemaphoreCount(address(), value);
            return this;
        }

        public Buffer pWaitSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
            VkSubmitInfo.npWaitSemaphores(address(), value);
            return this;
        }

        public Buffer pWaitDstStageMask(@NativeType("VkPipelineStageFlags const *") IntBuffer value) {
            VkSubmitInfo.npWaitDstStageMask(address(), value);
            return this;
        }

        public Buffer pCommandBuffers(@NativeType("VkCommandBuffer const *") PointerBuffer value) {
            VkSubmitInfo.npCommandBuffers(address(), value);
            return this;
        }

        public Buffer pSignalSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
            VkSubmitInfo.npSignalSemaphores(address(), value);
            return this;
        }
    }
}
