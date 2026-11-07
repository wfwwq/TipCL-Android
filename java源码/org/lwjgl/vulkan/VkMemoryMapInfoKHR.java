package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkMemoryMapInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryMapInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryMapInfoKHR.class */
public class VkMemoryMapInfoKHR extends VkMemoryMapInfo {
    protected VkMemoryMapInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkMemoryMapInfo, org.lwjgl.system.Struct
    public VkMemoryMapInfoKHR create(long address, ByteBuffer container) {
        return new VkMemoryMapInfoKHR(address, container);
    }

    public VkMemoryMapInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkMemoryMapInfo
    public VkMemoryMapInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryMapInfo
    public VkMemoryMapInfoKHR sType$Default() {
        return sType(1000271000);
    }

    @Override // org.lwjgl.vulkan.VkMemoryMapInfo
    public VkMemoryMapInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryMapInfo
    public VkMemoryMapInfoKHR flags(@NativeType("VkMemoryMapFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryMapInfo
    public VkMemoryMapInfoKHR memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryMapInfo
    public VkMemoryMapInfoKHR offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryMapInfo
    public VkMemoryMapInfoKHR size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryMapInfo
    public VkMemoryMapInfoKHR set(int sType, long pNext, int flags, long memory, long offset, long size) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        memory(memory);
        offset(offset);
        size(size);
        return this;
    }

    public VkMemoryMapInfoKHR set(VkMemoryMapInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryMapInfoKHR malloc() {
        return new VkMemoryMapInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryMapInfoKHR calloc() {
        return new VkMemoryMapInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryMapInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryMapInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryMapInfoKHR create(long address) {
        return new VkMemoryMapInfoKHR(address, null);
    }

    public static VkMemoryMapInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryMapInfoKHR(address, null);
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

    public static VkMemoryMapInfoKHR malloc(MemoryStack stack) {
        return new VkMemoryMapInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryMapInfoKHR calloc(MemoryStack stack) {
        return new VkMemoryMapInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryMapInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryMapInfoKHR$Buffer.class */
    public static class Buffer extends VkMemoryMapInfo.Buffer {
        private static final VkMemoryMapInfoKHR ELEMENT_FACTORY = VkMemoryMapInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkMemoryMapInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMemoryMapInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMemoryMapInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkMemoryMapInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkMemoryMapInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryMapInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryMapInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000271000);
        }

        @Override // org.lwjgl.vulkan.VkMemoryMapInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryMapInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryMapInfo.Buffer
        public Buffer flags(@NativeType("VkMemoryMapFlags") int value) {
            VkMemoryMapInfoKHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryMapInfo.Buffer
        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkMemoryMapInfoKHR.nmemory(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryMapInfo.Buffer
        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkMemoryMapInfoKHR.noffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryMapInfo.Buffer
        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkMemoryMapInfoKHR.nsize(address(), value);
            return this;
        }
    }
}
