package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalBufferInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalBufferInfoKHR.class */
public class VkPhysicalDeviceExternalBufferInfoKHR extends VkPhysicalDeviceExternalBufferInfo {
    protected VkPhysicalDeviceExternalBufferInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo, org.lwjgl.system.Struct
    public VkPhysicalDeviceExternalBufferInfoKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExternalBufferInfoKHR(address, container);
    }

    public VkPhysicalDeviceExternalBufferInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo
    public VkPhysicalDeviceExternalBufferInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo
    public VkPhysicalDeviceExternalBufferInfoKHR sType$Default() {
        return sType(1000071002);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo
    public VkPhysicalDeviceExternalBufferInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo
    public VkPhysicalDeviceExternalBufferInfoKHR flags(@NativeType("VkBufferCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo
    public VkPhysicalDeviceExternalBufferInfoKHR usage(@NativeType("VkBufferUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo
    public VkPhysicalDeviceExternalBufferInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo
    public VkPhysicalDeviceExternalBufferInfoKHR set(int sType, long pNext, int flags, int usage, int handleType) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        usage(usage);
        handleType(handleType);
        return this;
    }

    public VkPhysicalDeviceExternalBufferInfoKHR set(VkPhysicalDeviceExternalBufferInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExternalBufferInfoKHR malloc() {
        return new VkPhysicalDeviceExternalBufferInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalBufferInfoKHR calloc() {
        return new VkPhysicalDeviceExternalBufferInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalBufferInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalBufferInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExternalBufferInfoKHR create(long address) {
        return new VkPhysicalDeviceExternalBufferInfoKHR(address, null);
    }

    public static VkPhysicalDeviceExternalBufferInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExternalBufferInfoKHR(address, null);
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

    public static VkPhysicalDeviceExternalBufferInfoKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalBufferInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalBufferInfoKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalBufferInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalBufferInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalBufferInfoKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceExternalBufferInfo.Buffer {
        private static final VkPhysicalDeviceExternalBufferInfoKHR ELEMENT_FACTORY = VkPhysicalDeviceExternalBufferInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceExternalBufferInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExternalBufferInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000071002);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceExternalBufferInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.Buffer
        public Buffer flags(@NativeType("VkBufferCreateFlags") int value) {
            VkPhysicalDeviceExternalBufferInfoKHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.Buffer
        public Buffer usage(@NativeType("VkBufferUsageFlags") int value) {
            VkPhysicalDeviceExternalBufferInfoKHR.nusage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceExternalBufferInfo.Buffer
        public Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
            VkPhysicalDeviceExternalBufferInfoKHR.nhandleType(address(), value);
            return this;
        }
    }
}
