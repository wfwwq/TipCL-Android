package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBindMemoryStatus;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindMemoryStatusKHR.class */
public class VkBindMemoryStatusKHR extends VkBindMemoryStatus {
    protected VkBindMemoryStatusKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBindMemoryStatus, org.lwjgl.system.Struct
    public VkBindMemoryStatusKHR create(long address, ByteBuffer container) {
        return new VkBindMemoryStatusKHR(address, container);
    }

    public VkBindMemoryStatusKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBindMemoryStatus
    public VkBindMemoryStatusKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindMemoryStatus
    public VkBindMemoryStatusKHR sType$Default() {
        return sType(1000545002);
    }

    @Override // org.lwjgl.vulkan.VkBindMemoryStatus
    public VkBindMemoryStatusKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindMemoryStatus
    public VkBindMemoryStatusKHR pResult(@NativeType("VkResult *") IntBuffer value) {
        npResult(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindMemoryStatus
    public VkBindMemoryStatusKHR set(int sType, long pNext, IntBuffer pResult) {
        sType(sType);
        pNext(pNext);
        pResult(pResult);
        return this;
    }

    public VkBindMemoryStatusKHR set(VkBindMemoryStatusKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindMemoryStatusKHR malloc() {
        return new VkBindMemoryStatusKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindMemoryStatusKHR calloc() {
        return new VkBindMemoryStatusKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindMemoryStatusKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindMemoryStatusKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBindMemoryStatusKHR create(long address) {
        return new VkBindMemoryStatusKHR(address, null);
    }

    public static VkBindMemoryStatusKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindMemoryStatusKHR(address, null);
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

    public static VkBindMemoryStatusKHR malloc(MemoryStack stack) {
        return new VkBindMemoryStatusKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindMemoryStatusKHR calloc(MemoryStack stack) {
        return new VkBindMemoryStatusKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindMemoryStatusKHR$Buffer.class */
    public static class Buffer extends VkBindMemoryStatus.Buffer {
        private static final VkBindMemoryStatusKHR ELEMENT_FACTORY = VkBindMemoryStatusKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkBindMemoryStatus.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindMemoryStatus.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindMemoryStatus.Buffer, org.lwjgl.system.StructBuffer
        public VkBindMemoryStatusKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBindMemoryStatus.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindMemoryStatusKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindMemoryStatus.Buffer
        public Buffer sType$Default() {
            return sType(1000545002);
        }

        @Override // org.lwjgl.vulkan.VkBindMemoryStatus.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindMemoryStatusKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindMemoryStatus.Buffer
        public Buffer pResult(@NativeType("VkResult *") IntBuffer value) {
            VkBindMemoryStatusKHR.npResult(address(), value);
            return this;
        }
    }
}
