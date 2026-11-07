package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSemaphoreSubmitInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSubmitInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSubmitInfoKHR.class */
public class VkSemaphoreSubmitInfoKHR extends VkSemaphoreSubmitInfo {
    protected VkSemaphoreSubmitInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo, org.lwjgl.system.Struct
    public VkSemaphoreSubmitInfoKHR create(long address, ByteBuffer container) {
        return new VkSemaphoreSubmitInfoKHR(address, container);
    }

    public VkSemaphoreSubmitInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public VkSemaphoreSubmitInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public VkSemaphoreSubmitInfoKHR sType$Default() {
        return sType(1000314005);
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public VkSemaphoreSubmitInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public VkSemaphoreSubmitInfoKHR semaphore(@NativeType("VkSemaphore") long value) {
        nsemaphore(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public VkSemaphoreSubmitInfoKHR value(@NativeType("uint64_t") long value) {
        nvalue(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public VkSemaphoreSubmitInfoKHR stageMask(@NativeType("VkPipelineStageFlags2") long value) {
        nstageMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public VkSemaphoreSubmitInfoKHR deviceIndex(@NativeType("uint32_t") int value) {
        ndeviceIndex(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public VkSemaphoreSubmitInfoKHR set(int sType, long pNext, long semaphore, long value, long stageMask, int deviceIndex) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        value(value);
        stageMask(stageMask);
        deviceIndex(deviceIndex);
        return this;
    }

    public VkSemaphoreSubmitInfoKHR set(VkSemaphoreSubmitInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSemaphoreSubmitInfoKHR malloc() {
        return new VkSemaphoreSubmitInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSemaphoreSubmitInfoKHR calloc() {
        return new VkSemaphoreSubmitInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSemaphoreSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreSubmitInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSemaphoreSubmitInfoKHR create(long address) {
        return new VkSemaphoreSubmitInfoKHR(address, null);
    }

    public static VkSemaphoreSubmitInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSemaphoreSubmitInfoKHR(address, null);
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

    public static VkSemaphoreSubmitInfoKHR malloc(MemoryStack stack) {
        return new VkSemaphoreSubmitInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSemaphoreSubmitInfoKHR calloc(MemoryStack stack) {
        return new VkSemaphoreSubmitInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSubmitInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSubmitInfoKHR$Buffer.class */
    public static class Buffer extends VkSemaphoreSubmitInfo.Buffer {
        private static final VkSemaphoreSubmitInfoKHR ELEMENT_FACTORY = VkSemaphoreSubmitInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkSemaphoreSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSemaphoreSubmitInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000314005);
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSemaphoreSubmitInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public Buffer semaphore(@NativeType("VkSemaphore") long value) {
            VkSemaphoreSubmitInfoKHR.nsemaphore(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public Buffer value(@NativeType("uint64_t") long value) {
            VkSemaphoreSubmitInfoKHR.nvalue(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public Buffer stageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkSemaphoreSubmitInfoKHR.nstageMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public Buffer deviceIndex(@NativeType("uint32_t") int value) {
            VkSemaphoreSubmitInfoKHR.ndeviceIndex(address(), value);
            return this;
        }
    }
}
