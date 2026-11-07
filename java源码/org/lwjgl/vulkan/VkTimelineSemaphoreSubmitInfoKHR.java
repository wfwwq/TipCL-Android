package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfoKHR.class */
public class VkTimelineSemaphoreSubmitInfoKHR extends VkTimelineSemaphoreSubmitInfo {
    protected VkTimelineSemaphoreSubmitInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo, org.lwjgl.system.Struct
    public VkTimelineSemaphoreSubmitInfoKHR create(long address, ByteBuffer container) {
        return new VkTimelineSemaphoreSubmitInfoKHR(address, container);
    }

    public VkTimelineSemaphoreSubmitInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
    public VkTimelineSemaphoreSubmitInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
    public VkTimelineSemaphoreSubmitInfoKHR sType$Default() {
        return sType(1000207003);
    }

    @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
    public VkTimelineSemaphoreSubmitInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
    public VkTimelineSemaphoreSubmitInfoKHR waitSemaphoreValueCount(@NativeType("uint32_t") int value) {
        nwaitSemaphoreValueCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
    public VkTimelineSemaphoreSubmitInfoKHR pWaitSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
        npWaitSemaphoreValues(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
    public VkTimelineSemaphoreSubmitInfoKHR signalSemaphoreValueCount(@NativeType("uint32_t") int value) {
        nsignalSemaphoreValueCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
    public VkTimelineSemaphoreSubmitInfoKHR pSignalSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
        npSignalSemaphoreValues(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
    public VkTimelineSemaphoreSubmitInfoKHR set(int sType, long pNext, int waitSemaphoreValueCount, LongBuffer pWaitSemaphoreValues, int signalSemaphoreValueCount, LongBuffer pSignalSemaphoreValues) {
        sType(sType);
        pNext(pNext);
        waitSemaphoreValueCount(waitSemaphoreValueCount);
        pWaitSemaphoreValues(pWaitSemaphoreValues);
        signalSemaphoreValueCount(signalSemaphoreValueCount);
        pSignalSemaphoreValues(pSignalSemaphoreValues);
        return this;
    }

    public VkTimelineSemaphoreSubmitInfoKHR set(VkTimelineSemaphoreSubmitInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTimelineSemaphoreSubmitInfoKHR malloc() {
        return new VkTimelineSemaphoreSubmitInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTimelineSemaphoreSubmitInfoKHR calloc() {
        return new VkTimelineSemaphoreSubmitInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTimelineSemaphoreSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTimelineSemaphoreSubmitInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkTimelineSemaphoreSubmitInfoKHR create(long address) {
        return new VkTimelineSemaphoreSubmitInfoKHR(address, null);
    }

    public static VkTimelineSemaphoreSubmitInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTimelineSemaphoreSubmitInfoKHR(address, null);
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

    public static VkTimelineSemaphoreSubmitInfoKHR malloc(MemoryStack stack) {
        return new VkTimelineSemaphoreSubmitInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTimelineSemaphoreSubmitInfoKHR calloc(MemoryStack stack) {
        return new VkTimelineSemaphoreSubmitInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfoKHR$Buffer.class */
    public static class Buffer extends VkTimelineSemaphoreSubmitInfo.Buffer {
        private static final VkTimelineSemaphoreSubmitInfoKHR ELEMENT_FACTORY = VkTimelineSemaphoreSubmitInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkTimelineSemaphoreSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTimelineSemaphoreSubmitInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000207003);
        }

        @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkTimelineSemaphoreSubmitInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer
        public Buffer waitSemaphoreValueCount(@NativeType("uint32_t") int value) {
            VkTimelineSemaphoreSubmitInfoKHR.nwaitSemaphoreValueCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer
        public Buffer pWaitSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
            VkTimelineSemaphoreSubmitInfoKHR.npWaitSemaphoreValues(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer
        public Buffer signalSemaphoreValueCount(@NativeType("uint32_t") int value) {
            VkTimelineSemaphoreSubmitInfoKHR.nsignalSemaphoreValueCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer
        public Buffer pSignalSemaphoreValues(@NativeType("uint64_t const *") LongBuffer value) {
            VkTimelineSemaphoreSubmitInfoKHR.npSignalSemaphoreValues(address(), value);
            return this;
        }
    }
}
