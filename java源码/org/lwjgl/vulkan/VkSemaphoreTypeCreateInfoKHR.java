package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreTypeCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreTypeCreateInfoKHR.class */
public class VkSemaphoreTypeCreateInfoKHR extends VkSemaphoreTypeCreateInfo {
    protected VkSemaphoreTypeCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo, org.lwjgl.system.Struct
    public VkSemaphoreTypeCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkSemaphoreTypeCreateInfoKHR(address, container);
    }

    public VkSemaphoreTypeCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo
    public VkSemaphoreTypeCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo
    public VkSemaphoreTypeCreateInfoKHR sType$Default() {
        return sType(1000207002);
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo
    public VkSemaphoreTypeCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo
    public VkSemaphoreTypeCreateInfoKHR semaphoreType(@NativeType("VkSemaphoreType") int value) {
        nsemaphoreType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo
    public VkSemaphoreTypeCreateInfoKHR initialValue(@NativeType("uint64_t") long value) {
        ninitialValue(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo
    public VkSemaphoreTypeCreateInfoKHR set(int sType, long pNext, int semaphoreType, long initialValue) {
        sType(sType);
        pNext(pNext);
        semaphoreType(semaphoreType);
        initialValue(initialValue);
        return this;
    }

    public VkSemaphoreTypeCreateInfoKHR set(VkSemaphoreTypeCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSemaphoreTypeCreateInfoKHR malloc() {
        return new VkSemaphoreTypeCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSemaphoreTypeCreateInfoKHR calloc() {
        return new VkSemaphoreTypeCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSemaphoreTypeCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreTypeCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSemaphoreTypeCreateInfoKHR create(long address) {
        return new VkSemaphoreTypeCreateInfoKHR(address, null);
    }

    public static VkSemaphoreTypeCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSemaphoreTypeCreateInfoKHR(address, null);
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

    public static VkSemaphoreTypeCreateInfoKHR malloc(MemoryStack stack) {
        return new VkSemaphoreTypeCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSemaphoreTypeCreateInfoKHR calloc(MemoryStack stack) {
        return new VkSemaphoreTypeCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreTypeCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreTypeCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkSemaphoreTypeCreateInfo.Buffer {
        private static final VkSemaphoreTypeCreateInfoKHR ELEMENT_FACTORY = VkSemaphoreTypeCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkSemaphoreTypeCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSemaphoreTypeCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000207002);
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSemaphoreTypeCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.Buffer
        public Buffer semaphoreType(@NativeType("VkSemaphoreType") int value) {
            VkSemaphoreTypeCreateInfoKHR.nsemaphoreType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo.Buffer
        public Buffer initialValue(@NativeType("uint64_t") long value) {
            VkSemaphoreTypeCreateInfoKHR.ninitialValue(address(), value);
            return this;
        }
    }
}
