package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferUsageFlags2CreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferUsageFlags2CreateInfoKHR.class */
public class VkBufferUsageFlags2CreateInfoKHR extends VkBufferUsageFlags2CreateInfo {
    protected VkBufferUsageFlags2CreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo, org.lwjgl.system.Struct
    public VkBufferUsageFlags2CreateInfoKHR create(long address, ByteBuffer container) {
        return new VkBufferUsageFlags2CreateInfoKHR(address, container);
    }

    public VkBufferUsageFlags2CreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo
    public VkBufferUsageFlags2CreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo
    public VkBufferUsageFlags2CreateInfoKHR sType$Default() {
        return sType(1000470006);
    }

    @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo
    public VkBufferUsageFlags2CreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo
    public VkBufferUsageFlags2CreateInfoKHR usage(@NativeType("VkBufferUsageFlags2") long value) {
        nusage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo
    public VkBufferUsageFlags2CreateInfoKHR set(int sType, long pNext, long usage) {
        sType(sType);
        pNext(pNext);
        usage(usage);
        return this;
    }

    public VkBufferUsageFlags2CreateInfoKHR set(VkBufferUsageFlags2CreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferUsageFlags2CreateInfoKHR malloc() {
        return new VkBufferUsageFlags2CreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferUsageFlags2CreateInfoKHR calloc() {
        return new VkBufferUsageFlags2CreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferUsageFlags2CreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferUsageFlags2CreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferUsageFlags2CreateInfoKHR create(long address) {
        return new VkBufferUsageFlags2CreateInfoKHR(address, null);
    }

    public static VkBufferUsageFlags2CreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferUsageFlags2CreateInfoKHR(address, null);
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

    public static VkBufferUsageFlags2CreateInfoKHR malloc(MemoryStack stack) {
        return new VkBufferUsageFlags2CreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferUsageFlags2CreateInfoKHR calloc(MemoryStack stack) {
        return new VkBufferUsageFlags2CreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferUsageFlags2CreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferUsageFlags2CreateInfoKHR$Buffer.class */
    public static class Buffer extends VkBufferUsageFlags2CreateInfo.Buffer {
        private static final VkBufferUsageFlags2CreateInfoKHR ELEMENT_FACTORY = VkBufferUsageFlags2CreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkBufferUsageFlags2CreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferUsageFlags2CreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000470006);
        }

        @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferUsageFlags2CreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfo.Buffer
        public Buffer usage(@NativeType("VkBufferUsageFlags2") long value) {
            VkBufferUsageFlags2CreateInfoKHR.nusage(address(), value);
            return this;
        }
    }
}
