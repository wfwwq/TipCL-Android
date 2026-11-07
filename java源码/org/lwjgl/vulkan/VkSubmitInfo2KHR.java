package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCommandBufferSubmitInfo;
import org.lwjgl.vulkan.VkSemaphoreSubmitInfo;
import org.lwjgl.vulkan.VkSubmitInfo2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo2KHR.class */
public class VkSubmitInfo2KHR extends VkSubmitInfo2 {
    protected VkSubmitInfo2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSubmitInfo2, org.lwjgl.system.Struct
    public VkSubmitInfo2KHR create(long address, ByteBuffer container) {
        return new VkSubmitInfo2KHR(address, container);
    }

    public VkSubmitInfo2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSubmitInfo2
    public VkSubmitInfo2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubmitInfo2
    public VkSubmitInfo2KHR sType$Default() {
        return sType(1000314004);
    }

    @Override // org.lwjgl.vulkan.VkSubmitInfo2
    public VkSubmitInfo2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubmitInfo2
    public VkSubmitInfo2KHR flags(@NativeType("VkSubmitFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubmitInfo2
    public VkSubmitInfo2KHR pWaitSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) {
        npWaitSemaphoreInfos(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubmitInfo2
    public VkSubmitInfo2KHR pCommandBufferInfos(@NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.Buffer value) {
        npCommandBufferInfos(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubmitInfo2
    public VkSubmitInfo2KHR pSignalSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) {
        npSignalSemaphoreInfos(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubmitInfo2
    public VkSubmitInfo2KHR set(int sType, long pNext, int flags, VkSemaphoreSubmitInfo.Buffer pWaitSemaphoreInfos, VkCommandBufferSubmitInfo.Buffer pCommandBufferInfos, VkSemaphoreSubmitInfo.Buffer pSignalSemaphoreInfos) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pWaitSemaphoreInfos(pWaitSemaphoreInfos);
        pCommandBufferInfos(pCommandBufferInfos);
        pSignalSemaphoreInfos(pSignalSemaphoreInfos);
        return this;
    }

    public VkSubmitInfo2KHR set(VkSubmitInfo2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubmitInfo2KHR malloc() {
        return new VkSubmitInfo2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubmitInfo2KHR calloc() {
        return new VkSubmitInfo2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubmitInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubmitInfo2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSubmitInfo2KHR create(long address) {
        return new VkSubmitInfo2KHR(address, null);
    }

    public static VkSubmitInfo2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubmitInfo2KHR(address, null);
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

    public static VkSubmitInfo2KHR malloc(MemoryStack stack) {
        return new VkSubmitInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubmitInfo2KHR calloc(MemoryStack stack) {
        return new VkSubmitInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubmitInfo2KHR$Buffer.class */
    public static class Buffer extends VkSubmitInfo2.Buffer {
        private static final VkSubmitInfo2KHR ELEMENT_FACTORY = VkSubmitInfo2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSubmitInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubmitInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubmitInfo2.Buffer, org.lwjgl.system.StructBuffer
        public VkSubmitInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSubmitInfo2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubmitInfo2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubmitInfo2.Buffer
        public Buffer sType$Default() {
            return sType(1000314004);
        }

        @Override // org.lwjgl.vulkan.VkSubmitInfo2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubmitInfo2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubmitInfo2.Buffer
        public Buffer flags(@NativeType("VkSubmitFlags") int value) {
            VkSubmitInfo2KHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubmitInfo2.Buffer
        public Buffer pWaitSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) {
            VkSubmitInfo2KHR.npWaitSemaphoreInfos(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubmitInfo2.Buffer
        public Buffer pCommandBufferInfos(@NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.Buffer value) {
            VkSubmitInfo2KHR.npCommandBufferInfos(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubmitInfo2.Buffer
        public Buffer pSignalSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) {
            VkSubmitInfo2KHR.npSignalSemaphoreInfos(address(), value);
            return this;
        }
    }
}
