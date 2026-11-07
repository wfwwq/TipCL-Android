package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBufferMemoryBarrier2;
import org.lwjgl.vulkan.VkDependencyInfo;
import org.lwjgl.vulkan.VkImageMemoryBarrier2;
import org.lwjgl.vulkan.VkMemoryBarrier2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDependencyInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDependencyInfoKHR.class */
public class VkDependencyInfoKHR extends VkDependencyInfo {
    protected VkDependencyInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDependencyInfo, org.lwjgl.system.Struct
    public VkDependencyInfoKHR create(long address, ByteBuffer container) {
        return new VkDependencyInfoKHR(address, container);
    }

    public VkDependencyInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public VkDependencyInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public VkDependencyInfoKHR sType$Default() {
        return sType(1000314003);
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public VkDependencyInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public VkDependencyInfoKHR dependencyFlags(@NativeType("VkDependencyFlags") int value) {
        ndependencyFlags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public VkDependencyInfoKHR pMemoryBarriers(@NativeType("VkMemoryBarrier2 const *") VkMemoryBarrier2.Buffer value) {
        npMemoryBarriers(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public VkDependencyInfoKHR pBufferMemoryBarriers(@NativeType("VkBufferMemoryBarrier2 const *") VkBufferMemoryBarrier2.Buffer value) {
        npBufferMemoryBarriers(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public VkDependencyInfoKHR pImageMemoryBarriers(@NativeType("VkImageMemoryBarrier2 const *") VkImageMemoryBarrier2.Buffer value) {
        npImageMemoryBarriers(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public VkDependencyInfoKHR set(int sType, long pNext, int dependencyFlags, VkMemoryBarrier2.Buffer pMemoryBarriers, VkBufferMemoryBarrier2.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier2.Buffer pImageMemoryBarriers) {
        sType(sType);
        pNext(pNext);
        dependencyFlags(dependencyFlags);
        pMemoryBarriers(pMemoryBarriers);
        pBufferMemoryBarriers(pBufferMemoryBarriers);
        pImageMemoryBarriers(pImageMemoryBarriers);
        return this;
    }

    public VkDependencyInfoKHR set(VkDependencyInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDependencyInfoKHR malloc() {
        return new VkDependencyInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDependencyInfoKHR calloc() {
        return new VkDependencyInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDependencyInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDependencyInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDependencyInfoKHR create(long address) {
        return new VkDependencyInfoKHR(address, null);
    }

    public static VkDependencyInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDependencyInfoKHR(address, null);
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

    public static VkDependencyInfoKHR malloc(MemoryStack stack) {
        return new VkDependencyInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDependencyInfoKHR calloc(MemoryStack stack) {
        return new VkDependencyInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDependencyInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDependencyInfoKHR$Buffer.class */
    public static class Buffer extends VkDependencyInfo.Buffer {
        private static final VkDependencyInfoKHR ELEMENT_FACTORY = VkDependencyInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDependencyInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDependencyInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000314003);
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDependencyInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) {
            VkDependencyInfoKHR.ndependencyFlags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public Buffer pMemoryBarriers(@NativeType("VkMemoryBarrier2 const *") VkMemoryBarrier2.Buffer value) {
            VkDependencyInfoKHR.npMemoryBarriers(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public Buffer pBufferMemoryBarriers(@NativeType("VkBufferMemoryBarrier2 const *") VkBufferMemoryBarrier2.Buffer value) {
            VkDependencyInfoKHR.npBufferMemoryBarriers(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public Buffer pImageMemoryBarriers(@NativeType("VkImageMemoryBarrier2 const *") VkImageMemoryBarrier2.Buffer value) {
            VkDependencyInfoKHR.npImageMemoryBarriers(address(), value);
            return this;
        }
    }
}
