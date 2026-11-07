package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateFlagsInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateFlagsInfoKHR.class */
public class VkMemoryAllocateFlagsInfoKHR extends VkMemoryAllocateFlagsInfo {
    protected VkMemoryAllocateFlagsInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo, org.lwjgl.system.Struct
    public VkMemoryAllocateFlagsInfoKHR create(long address, ByteBuffer container) {
        return new VkMemoryAllocateFlagsInfoKHR(address, container);
    }

    public VkMemoryAllocateFlagsInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo
    public VkMemoryAllocateFlagsInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo
    public VkMemoryAllocateFlagsInfoKHR sType$Default() {
        return sType(1000060000);
    }

    @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo
    public VkMemoryAllocateFlagsInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo
    public VkMemoryAllocateFlagsInfoKHR flags(@NativeType("VkMemoryAllocateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo
    public VkMemoryAllocateFlagsInfoKHR deviceMask(@NativeType("uint32_t") int value) {
        ndeviceMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo
    public VkMemoryAllocateFlagsInfoKHR set(int sType, long pNext, int flags, int deviceMask) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        deviceMask(deviceMask);
        return this;
    }

    public VkMemoryAllocateFlagsInfoKHR set(VkMemoryAllocateFlagsInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryAllocateFlagsInfoKHR malloc() {
        return new VkMemoryAllocateFlagsInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryAllocateFlagsInfoKHR calloc() {
        return new VkMemoryAllocateFlagsInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryAllocateFlagsInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryAllocateFlagsInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryAllocateFlagsInfoKHR create(long address) {
        return new VkMemoryAllocateFlagsInfoKHR(address, null);
    }

    public static VkMemoryAllocateFlagsInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryAllocateFlagsInfoKHR(address, null);
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

    public static VkMemoryAllocateFlagsInfoKHR malloc(MemoryStack stack) {
        return new VkMemoryAllocateFlagsInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryAllocateFlagsInfoKHR calloc(MemoryStack stack) {
        return new VkMemoryAllocateFlagsInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateFlagsInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateFlagsInfoKHR$Buffer.class */
    public static class Buffer extends VkMemoryAllocateFlagsInfo.Buffer {
        private static final VkMemoryAllocateFlagsInfoKHR ELEMENT_FACTORY = VkMemoryAllocateFlagsInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkMemoryAllocateFlagsInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryAllocateFlagsInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000060000);
        }

        @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryAllocateFlagsInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.Buffer
        public Buffer flags(@NativeType("VkMemoryAllocateFlags") int value) {
            VkMemoryAllocateFlagsInfoKHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo.Buffer
        public Buffer deviceMask(@NativeType("uint32_t") int value) {
            VkMemoryAllocateFlagsInfoKHR.ndeviceMask(address(), value);
            return this;
        }
    }
}
