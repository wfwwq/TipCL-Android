package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalImageFormatInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalImageFormatInfoKHR.class */
public class VkPhysicalDeviceExternalImageFormatInfoKHR extends VkPhysicalDeviceExternalImageFormatInfo {
    protected VkPhysicalDeviceExternalImageFormatInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo, org.lwjgl.system.Struct
    public VkPhysicalDeviceExternalImageFormatInfoKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(address, container);
    }

    public VkPhysicalDeviceExternalImageFormatInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo
    public VkPhysicalDeviceExternalImageFormatInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo
    public VkPhysicalDeviceExternalImageFormatInfoKHR sType$Default() {
        return sType(1000071000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo
    public VkPhysicalDeviceExternalImageFormatInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo
    public VkPhysicalDeviceExternalImageFormatInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo
    public VkPhysicalDeviceExternalImageFormatInfoKHR set(int sType, long pNext, int handleType) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        return this;
    }

    public VkPhysicalDeviceExternalImageFormatInfoKHR set(VkPhysicalDeviceExternalImageFormatInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExternalImageFormatInfoKHR malloc() {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalImageFormatInfoKHR calloc() {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalImageFormatInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExternalImageFormatInfoKHR create(long address) {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(address, null);
    }

    public static VkPhysicalDeviceExternalImageFormatInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(address, null);
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

    public static VkPhysicalDeviceExternalImageFormatInfoKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalImageFormatInfoKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalImageFormatInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalImageFormatInfoKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceExternalImageFormatInfo.Buffer {
        private static final VkPhysicalDeviceExternalImageFormatInfoKHR ELEMENT_FACTORY = VkPhysicalDeviceExternalImageFormatInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceExternalImageFormatInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExternalImageFormatInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000071000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceExternalImageFormatInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalImageFormatInfo.Buffer
        public Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
            VkPhysicalDeviceExternalImageFormatInfoKHR.nhandleType(address(), value);
            return this;
        }
    }
}
