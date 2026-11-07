package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSemaphoreWaitInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfoKHR.class */
public class VkSemaphoreWaitInfoKHR extends VkSemaphoreWaitInfo {
    protected VkSemaphoreWaitInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo, org.lwjgl.system.Struct
    public VkSemaphoreWaitInfoKHR create(long address, ByteBuffer container) {
        return new VkSemaphoreWaitInfoKHR(address, container);
    }

    public VkSemaphoreWaitInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public VkSemaphoreWaitInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public VkSemaphoreWaitInfoKHR sType$Default() {
        return sType(1000207004);
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public VkSemaphoreWaitInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public VkSemaphoreWaitInfoKHR flags(@NativeType("VkSemaphoreWaitFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public VkSemaphoreWaitInfoKHR semaphoreCount(@NativeType("uint32_t") int value) {
        nsemaphoreCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public VkSemaphoreWaitInfoKHR pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
        npSemaphores(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public VkSemaphoreWaitInfoKHR pValues(@NativeType("uint64_t const *") LongBuffer value) {
        npValues(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public VkSemaphoreWaitInfoKHR set(int sType, long pNext, int flags, int semaphoreCount, LongBuffer pSemaphores, LongBuffer pValues) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        semaphoreCount(semaphoreCount);
        pSemaphores(pSemaphores);
        pValues(pValues);
        return this;
    }

    public VkSemaphoreWaitInfoKHR set(VkSemaphoreWaitInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSemaphoreWaitInfoKHR malloc() {
        return new VkSemaphoreWaitInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSemaphoreWaitInfoKHR calloc() {
        return new VkSemaphoreWaitInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSemaphoreWaitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreWaitInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSemaphoreWaitInfoKHR create(long address) {
        return new VkSemaphoreWaitInfoKHR(address, null);
    }

    public static VkSemaphoreWaitInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSemaphoreWaitInfoKHR(address, null);
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

    public static VkSemaphoreWaitInfoKHR malloc(MemoryStack stack) {
        return new VkSemaphoreWaitInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSemaphoreWaitInfoKHR calloc(MemoryStack stack) {
        return new VkSemaphoreWaitInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfoKHR$Buffer.class */
    public static class Buffer extends VkSemaphoreWaitInfo.Buffer {
        private static final VkSemaphoreWaitInfoKHR ELEMENT_FACTORY = VkSemaphoreWaitInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkSemaphoreWaitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSemaphoreWaitInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000207004);
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSemaphoreWaitInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public Buffer flags(@NativeType("VkSemaphoreWaitFlags") int value) {
            VkSemaphoreWaitInfoKHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public Buffer semaphoreCount(@NativeType("uint32_t") int value) {
            VkSemaphoreWaitInfoKHR.nsemaphoreCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public Buffer pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
            VkSemaphoreWaitInfoKHR.npSemaphores(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public Buffer pValues(@NativeType("uint64_t const *") LongBuffer value) {
            VkSemaphoreWaitInfoKHR.npValues(address(), value);
            return this;
        }
    }
}
