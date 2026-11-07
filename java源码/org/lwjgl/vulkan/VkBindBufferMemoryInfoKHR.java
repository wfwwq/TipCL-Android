package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBindBufferMemoryInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryInfoKHR.class */
public class VkBindBufferMemoryInfoKHR extends VkBindBufferMemoryInfo {
    protected VkBindBufferMemoryInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo, org.lwjgl.system.Struct
    public VkBindBufferMemoryInfoKHR create(long address, ByteBuffer container) {
        return new VkBindBufferMemoryInfoKHR(address, container);
    }

    public VkBindBufferMemoryInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo
    public VkBindBufferMemoryInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo
    public VkBindBufferMemoryInfoKHR sType$Default() {
        return sType(1000157000);
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo
    public VkBindBufferMemoryInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo
    public VkBindBufferMemoryInfoKHR buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo
    public VkBindBufferMemoryInfoKHR memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo
    public VkBindBufferMemoryInfoKHR memoryOffset(@NativeType("VkDeviceSize") long value) {
        nmemoryOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo
    public VkBindBufferMemoryInfoKHR set(int sType, long pNext, long buffer, long memory, long memoryOffset) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        memory(memory);
        memoryOffset(memoryOffset);
        return this;
    }

    public VkBindBufferMemoryInfoKHR set(VkBindBufferMemoryInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindBufferMemoryInfoKHR malloc() {
        return new VkBindBufferMemoryInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindBufferMemoryInfoKHR calloc() {
        return new VkBindBufferMemoryInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindBufferMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindBufferMemoryInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBindBufferMemoryInfoKHR create(long address) {
        return new VkBindBufferMemoryInfoKHR(address, null);
    }

    public static VkBindBufferMemoryInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindBufferMemoryInfoKHR(address, null);
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

    public static VkBindBufferMemoryInfoKHR malloc(MemoryStack stack) {
        return new VkBindBufferMemoryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindBufferMemoryInfoKHR calloc(MemoryStack stack) {
        return new VkBindBufferMemoryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryInfoKHR$Buffer.class */
    public static class Buffer extends VkBindBufferMemoryInfo.Buffer {
        private static final VkBindBufferMemoryInfoKHR ELEMENT_FACTORY = VkBindBufferMemoryInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkBindBufferMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindBufferMemoryInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000157000);
        }

        @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindBufferMemoryInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo.Buffer
        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkBindBufferMemoryInfoKHR.nbuffer(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo.Buffer
        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkBindBufferMemoryInfoKHR.nmemory(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindBufferMemoryInfo.Buffer
        public Buffer memoryOffset(@NativeType("VkDeviceSize") long value) {
            VkBindBufferMemoryInfoKHR.nmemoryOffset(address(), value);
            return this;
        }
    }
}
