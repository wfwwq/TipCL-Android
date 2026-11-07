package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSemaphoreSignalInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSignalInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSignalInfoKHR.class */
public class VkSemaphoreSignalInfoKHR extends VkSemaphoreSignalInfo {
    protected VkSemaphoreSignalInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo, org.lwjgl.system.Struct
    public VkSemaphoreSignalInfoKHR create(long address, ByteBuffer container) {
        return new VkSemaphoreSignalInfoKHR(address, container);
    }

    public VkSemaphoreSignalInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo
    public VkSemaphoreSignalInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo
    public VkSemaphoreSignalInfoKHR sType$Default() {
        return sType(1000207005);
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo
    public VkSemaphoreSignalInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo
    public VkSemaphoreSignalInfoKHR semaphore(@NativeType("VkSemaphore") long value) {
        nsemaphore(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo
    public VkSemaphoreSignalInfoKHR value(@NativeType("uint64_t") long value) {
        nvalue(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo
    public VkSemaphoreSignalInfoKHR set(int sType, long pNext, long semaphore, long value) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        value(value);
        return this;
    }

    public VkSemaphoreSignalInfoKHR set(VkSemaphoreSignalInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSemaphoreSignalInfoKHR malloc() {
        return new VkSemaphoreSignalInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSemaphoreSignalInfoKHR calloc() {
        return new VkSemaphoreSignalInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSemaphoreSignalInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreSignalInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSemaphoreSignalInfoKHR create(long address) {
        return new VkSemaphoreSignalInfoKHR(address, null);
    }

    public static VkSemaphoreSignalInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSemaphoreSignalInfoKHR(address, null);
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

    public static VkSemaphoreSignalInfoKHR malloc(MemoryStack stack) {
        return new VkSemaphoreSignalInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSemaphoreSignalInfoKHR calloc(MemoryStack stack) {
        return new VkSemaphoreSignalInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSignalInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSignalInfoKHR$Buffer.class */
    public static class Buffer extends VkSemaphoreSignalInfo.Buffer {
        private static final VkSemaphoreSignalInfoKHR ELEMENT_FACTORY = VkSemaphoreSignalInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkSemaphoreSignalInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSemaphoreSignalInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000207005);
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSemaphoreSignalInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo.Buffer
        public Buffer semaphore(@NativeType("VkSemaphore") long value) {
            VkSemaphoreSignalInfoKHR.nsemaphore(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSignalInfo.Buffer
        public Buffer value(@NativeType("uint64_t") long value) {
            VkSemaphoreSignalInfoKHR.nvalue(address(), value);
            return this;
        }
    }
}
