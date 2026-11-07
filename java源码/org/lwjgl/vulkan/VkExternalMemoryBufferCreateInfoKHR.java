package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryBufferCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryBufferCreateInfoKHR.class */
public class VkExternalMemoryBufferCreateInfoKHR extends VkExternalMemoryBufferCreateInfo {
    protected VkExternalMemoryBufferCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo, org.lwjgl.system.Struct
    public VkExternalMemoryBufferCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkExternalMemoryBufferCreateInfoKHR(address, container);
    }

    public VkExternalMemoryBufferCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo
    public VkExternalMemoryBufferCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo
    public VkExternalMemoryBufferCreateInfoKHR sType$Default() {
        return sType(1000072000);
    }

    @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo
    public VkExternalMemoryBufferCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo
    public VkExternalMemoryBufferCreateInfoKHR handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) {
        nhandleTypes(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo
    public VkExternalMemoryBufferCreateInfoKHR set(int sType, long pNext, int handleTypes) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);
        return this;
    }

    public VkExternalMemoryBufferCreateInfoKHR set(VkExternalMemoryBufferCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalMemoryBufferCreateInfoKHR malloc() {
        return new VkExternalMemoryBufferCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalMemoryBufferCreateInfoKHR calloc() {
        return new VkExternalMemoryBufferCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalMemoryBufferCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalMemoryBufferCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalMemoryBufferCreateInfoKHR create(long address) {
        return new VkExternalMemoryBufferCreateInfoKHR(address, null);
    }

    public static VkExternalMemoryBufferCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalMemoryBufferCreateInfoKHR(address, null);
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

    public static VkExternalMemoryBufferCreateInfoKHR malloc(MemoryStack stack) {
        return new VkExternalMemoryBufferCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalMemoryBufferCreateInfoKHR calloc(MemoryStack stack) {
        return new VkExternalMemoryBufferCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryBufferCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryBufferCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkExternalMemoryBufferCreateInfo.Buffer {
        private static final VkExternalMemoryBufferCreateInfoKHR ELEMENT_FACTORY = VkExternalMemoryBufferCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkExternalMemoryBufferCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalMemoryBufferCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000072000);
        }

        @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkExternalMemoryBufferCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo.Buffer
        public Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) {
            VkExternalMemoryBufferCreateInfoKHR.nhandleTypes(address(), value);
            return this;
        }
    }
}
