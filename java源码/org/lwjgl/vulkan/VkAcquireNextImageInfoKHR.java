package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAcquireNextImageInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAcquireNextImageInfoKHR.class */
public class VkAcquireNextImageInfoKHR extends Struct<VkAcquireNextImageInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAIN;
    public static final int TIMEOUT;
    public static final int SEMAPHORE;
    public static final int FENCE;
    public static final int DEVICEMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
        TIMEOUT = layout.offsetof(3);
        SEMAPHORE = layout.offsetof(4);
        FENCE = layout.offsetof(5);
        DEVICEMASK = layout.offsetof(6);
    }

    protected VkAcquireNextImageInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAcquireNextImageInfoKHR create(long address, ByteBuffer container) {
        return new VkAcquireNextImageInfoKHR(address, container);
    }

    public VkAcquireNextImageInfoKHR(ByteBuffer container) {
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

    @NativeType("VkSwapchainKHR")
    public long swapchain() {
        return nswapchain(address());
    }

    @NativeType("uint64_t")
    public long timeout() {
        return ntimeout(address());
    }

    @NativeType("VkSemaphore")
    public long semaphore() {
        return nsemaphore(address());
    }

    @NativeType("VkFence")
    public long fence() {
        return nfence(address());
    }

    @NativeType("uint32_t")
    public int deviceMask() {
        return ndeviceMask(address());
    }

    public VkAcquireNextImageInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAcquireNextImageInfoKHR sType$Default() {
        return sType(1000060010);
    }

    public VkAcquireNextImageInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAcquireNextImageInfoKHR swapchain(@NativeType("VkSwapchainKHR") long value) {
        nswapchain(address(), value);
        return this;
    }

    public VkAcquireNextImageInfoKHR timeout(@NativeType("uint64_t") long value) {
        ntimeout(address(), value);
        return this;
    }

    public VkAcquireNextImageInfoKHR semaphore(@NativeType("VkSemaphore") long value) {
        nsemaphore(address(), value);
        return this;
    }

    public VkAcquireNextImageInfoKHR fence(@NativeType("VkFence") long value) {
        nfence(address(), value);
        return this;
    }

    public VkAcquireNextImageInfoKHR deviceMask(@NativeType("uint32_t") int value) {
        ndeviceMask(address(), value);
        return this;
    }

    public VkAcquireNextImageInfoKHR set(int sType, long pNext, long swapchain, long timeout, long semaphore, long fence, int deviceMask) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        timeout(timeout);
        semaphore(semaphore);
        fence(fence);
        deviceMask(deviceMask);
        return this;
    }

    public VkAcquireNextImageInfoKHR set(VkAcquireNextImageInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAcquireNextImageInfoKHR malloc() {
        return new VkAcquireNextImageInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAcquireNextImageInfoKHR calloc() {
        return new VkAcquireNextImageInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAcquireNextImageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAcquireNextImageInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAcquireNextImageInfoKHR create(long address) {
        return new VkAcquireNextImageInfoKHR(address, null);
    }

    public static VkAcquireNextImageInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAcquireNextImageInfoKHR(address, null);
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

    public static VkAcquireNextImageInfoKHR malloc(MemoryStack stack) {
        return new VkAcquireNextImageInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAcquireNextImageInfoKHR calloc(MemoryStack stack) {
        return new VkAcquireNextImageInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nswapchain(long struct) {
        return MemoryUtil.memGetLong(struct + SWAPCHAIN);
    }

    public static long ntimeout(long struct) {
        return MemoryUtil.memGetLong(struct + TIMEOUT);
    }

    public static long nsemaphore(long struct) {
        return MemoryUtil.memGetLong(struct + SEMAPHORE);
    }

    public static long nfence(long struct) {
        return MemoryUtil.memGetLong(struct + FENCE);
    }

    public static int ndeviceMask(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEMASK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nswapchain(long struct, long value) {
        MemoryUtil.memPutLong(struct + SWAPCHAIN, value);
    }

    public static void ntimeout(long struct, long value) {
        MemoryUtil.memPutLong(struct + TIMEOUT, value);
    }

    public static void nsemaphore(long struct, long value) {
        MemoryUtil.memPutLong(struct + SEMAPHORE, value);
    }

    public static void nfence(long struct, long value) {
        MemoryUtil.memPutLong(struct + FENCE, value);
    }

    public static void ndeviceMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEMASK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAcquireNextImageInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAcquireNextImageInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAcquireNextImageInfoKHR, Buffer> implements NativeResource {
        private static final VkAcquireNextImageInfoKHR ELEMENT_FACTORY = VkAcquireNextImageInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAcquireNextImageInfoKHR.SIZEOF);
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
        public VkAcquireNextImageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAcquireNextImageInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAcquireNextImageInfoKHR.npNext(address());
        }

        @NativeType("VkSwapchainKHR")
        public long swapchain() {
            return VkAcquireNextImageInfoKHR.nswapchain(address());
        }

        @NativeType("uint64_t")
        public long timeout() {
            return VkAcquireNextImageInfoKHR.ntimeout(address());
        }

        @NativeType("VkSemaphore")
        public long semaphore() {
            return VkAcquireNextImageInfoKHR.nsemaphore(address());
        }

        @NativeType("VkFence")
        public long fence() {
            return VkAcquireNextImageInfoKHR.nfence(address());
        }

        @NativeType("uint32_t")
        public int deviceMask() {
            return VkAcquireNextImageInfoKHR.ndeviceMask(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAcquireNextImageInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000060010);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAcquireNextImageInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer swapchain(@NativeType("VkSwapchainKHR") long value) {
            VkAcquireNextImageInfoKHR.nswapchain(address(), value);
            return this;
        }

        public Buffer timeout(@NativeType("uint64_t") long value) {
            VkAcquireNextImageInfoKHR.ntimeout(address(), value);
            return this;
        }

        public Buffer semaphore(@NativeType("VkSemaphore") long value) {
            VkAcquireNextImageInfoKHR.nsemaphore(address(), value);
            return this;
        }

        public Buffer fence(@NativeType("VkFence") long value) {
            VkAcquireNextImageInfoKHR.nfence(address(), value);
            return this;
        }

        public Buffer deviceMask(@NativeType("uint32_t") int value) {
            VkAcquireNextImageInfoKHR.ndeviceMask(address(), value);
            return this;
        }
    }
}
