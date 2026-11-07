package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentInfoKHR.class */
public class VkPresentInfoKHR extends Struct<VkPresentInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int WAITSEMAPHORECOUNT;
    public static final int PWAITSEMAPHORES;
    public static final int SWAPCHAINCOUNT;
    public static final int PSWAPCHAINS;
    public static final int PIMAGEINDICES;
    public static final int PRESULTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHORECOUNT = layout.offsetof(2);
        PWAITSEMAPHORES = layout.offsetof(3);
        SWAPCHAINCOUNT = layout.offsetof(4);
        PSWAPCHAINS = layout.offsetof(5);
        PIMAGEINDICES = layout.offsetof(6);
        PRESULTS = layout.offsetof(7);
    }

    protected VkPresentInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPresentInfoKHR create(long address, ByteBuffer container) {
        return new VkPresentInfoKHR(address, container);
    }

    public VkPresentInfoKHR(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int swapchainCount() {
        return nswapchainCount(address());
    }

    @NativeType("VkSwapchainKHR const *")
    public LongBuffer pSwapchains() {
        return npSwapchains(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pImageIndices() {
        return npImageIndices(address());
    }

    @NativeType("VkResult *")
    public IntBuffer pResults() {
        return npResults(address());
    }

    public VkPresentInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPresentInfoKHR sType$Default() {
        return sType(KHRSwapchain.VK_STRUCTURE_TYPE_PRESENT_INFO_KHR);
    }

    public VkPresentInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPresentInfoKHR pNext(VkDeviceGroupPresentInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkDisplayPresentInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkFrameBoundaryEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkFrameBoundaryTensorsARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkPresentId2KHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkPresentIdKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkPresentRegionsKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkPresentTimesInfoGOOGLE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkPresentTimingsInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkSetPresentConfigNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkSwapchainPresentFenceInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkSwapchainPresentFenceInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkSwapchainPresentModeInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pNext(VkSwapchainPresentModeInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPresentInfoKHR pWaitSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
        npWaitSemaphores(address(), value);
        return this;
    }

    public VkPresentInfoKHR swapchainCount(@NativeType("uint32_t") int value) {
        nswapchainCount(address(), value);
        return this;
    }

    public VkPresentInfoKHR pSwapchains(@NativeType("VkSwapchainKHR const *") LongBuffer value) {
        npSwapchains(address(), value);
        return this;
    }

    public VkPresentInfoKHR pImageIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npImageIndices(address(), value);
        return this;
    }

    public VkPresentInfoKHR pResults(@NativeType("VkResult *") IntBuffer value) {
        npResults(address(), value);
        return this;
    }

    public VkPresentInfoKHR set(int sType, long pNext, LongBuffer pWaitSemaphores, int swapchainCount, LongBuffer pSwapchains, IntBuffer pImageIndices, IntBuffer pResults) {
        sType(sType);
        pNext(pNext);
        pWaitSemaphores(pWaitSemaphores);
        swapchainCount(swapchainCount);
        pSwapchains(pSwapchains);
        pImageIndices(pImageIndices);
        pResults(pResults);
        return this;
    }

    public VkPresentInfoKHR set(VkPresentInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPresentInfoKHR malloc() {
        return new VkPresentInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPresentInfoKHR calloc() {
        return new VkPresentInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPresentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPresentInfoKHR create(long address) {
        return new VkPresentInfoKHR(address, null);
    }

    public static VkPresentInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPresentInfoKHR(address, null);
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

    public static VkPresentInfoKHR malloc(MemoryStack stack) {
        return new VkPresentInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPresentInfoKHR calloc(MemoryStack stack) {
        return new VkPresentInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nswapchainCount(long struct) {
        return MemoryUtil.memGetInt(struct + SWAPCHAINCOUNT);
    }

    public static LongBuffer npSwapchains(long struct) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + PSWAPCHAINS), nswapchainCount(struct));
    }

    public static IntBuffer npImageIndices(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PIMAGEINDICES), nswapchainCount(struct));
    }

    public static IntBuffer npResults(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PRESULTS), nswapchainCount(struct));
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
        nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nswapchainCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SWAPCHAINCOUNT, value);
    }

    public static void npSwapchains(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSWAPCHAINS, MemoryUtil.memAddress(value));
    }

    public static void npImageIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PIMAGEINDICES, MemoryUtil.memAddress(value));
    }

    public static void npResults(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PRESULTS, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        if (nwaitSemaphoreCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PWAITSEMAPHORES));
        }
        Checks.check(MemoryUtil.memGetAddress(struct + PSWAPCHAINS));
        Checks.check(MemoryUtil.memGetAddress(struct + PIMAGEINDICES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPresentInfoKHR, Buffer> implements NativeResource {
        private static final VkPresentInfoKHR ELEMENT_FACTORY = VkPresentInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPresentInfoKHR.SIZEOF);
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
        public VkPresentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPresentInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPresentInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int waitSemaphoreCount() {
            return VkPresentInfoKHR.nwaitSemaphoreCount(address());
        }

        @NativeType("VkSemaphore const *")
        public LongBuffer pWaitSemaphores() {
            return VkPresentInfoKHR.npWaitSemaphores(address());
        }

        @NativeType("uint32_t")
        public int swapchainCount() {
            return VkPresentInfoKHR.nswapchainCount(address());
        }

        @NativeType("VkSwapchainKHR const *")
        public LongBuffer pSwapchains() {
            return VkPresentInfoKHR.npSwapchains(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pImageIndices() {
            return VkPresentInfoKHR.npImageIndices(address());
        }

        @NativeType("VkResult *")
        public IntBuffer pResults() {
            return VkPresentInfoKHR.npResults(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPresentInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRSwapchain.VK_STRUCTURE_TYPE_PRESENT_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPresentInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDeviceGroupPresentInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDisplayPresentInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkFrameBoundaryEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkFrameBoundaryTensorsARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPresentId2KHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPresentIdKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPresentRegionsKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPresentTimesInfoGOOGLE value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPresentTimingsInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSetPresentConfigNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainPresentFenceInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainPresentFenceInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainPresentModeInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSwapchainPresentModeInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pWaitSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
            VkPresentInfoKHR.npWaitSemaphores(address(), value);
            return this;
        }

        public Buffer swapchainCount(@NativeType("uint32_t") int value) {
            VkPresentInfoKHR.nswapchainCount(address(), value);
            return this;
        }

        public Buffer pSwapchains(@NativeType("VkSwapchainKHR const *") LongBuffer value) {
            VkPresentInfoKHR.npSwapchains(address(), value);
            return this;
        }

        public Buffer pImageIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkPresentInfoKHR.npImageIndices(address(), value);
            return this;
        }

        public Buffer pResults(@NativeType("VkResult *") IntBuffer value) {
            VkPresentInfoKHR.npResults(address(), value);
            return this;
        }
    }
}
