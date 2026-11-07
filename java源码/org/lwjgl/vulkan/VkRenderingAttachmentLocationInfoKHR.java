package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentLocationInfoKHR.class */
public class VkRenderingAttachmentLocationInfoKHR extends VkRenderingAttachmentLocationInfo {
    protected VkRenderingAttachmentLocationInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo, org.lwjgl.system.Struct
    public VkRenderingAttachmentLocationInfoKHR create(long address, ByteBuffer container) {
        return new VkRenderingAttachmentLocationInfoKHR(address, container);
    }

    public VkRenderingAttachmentLocationInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo
    public VkRenderingAttachmentLocationInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo
    public VkRenderingAttachmentLocationInfoKHR sType$Default() {
        return sType(1000232001);
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo
    public VkRenderingAttachmentLocationInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo
    public VkRenderingAttachmentLocationInfoKHR colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo
    public VkRenderingAttachmentLocationInfoKHR pColorAttachmentLocations(@NativeType("uint32_t const *") IntBuffer value) {
        npColorAttachmentLocations(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo
    public VkRenderingAttachmentLocationInfoKHR set(int sType, long pNext, int colorAttachmentCount, IntBuffer pColorAttachmentLocations) {
        sType(sType);
        pNext(pNext);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentLocations(pColorAttachmentLocations);
        return this;
    }

    public VkRenderingAttachmentLocationInfoKHR set(VkRenderingAttachmentLocationInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderingAttachmentLocationInfoKHR malloc() {
        return new VkRenderingAttachmentLocationInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderingAttachmentLocationInfoKHR calloc() {
        return new VkRenderingAttachmentLocationInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderingAttachmentLocationInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingAttachmentLocationInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderingAttachmentLocationInfoKHR create(long address) {
        return new VkRenderingAttachmentLocationInfoKHR(address, null);
    }

    public static VkRenderingAttachmentLocationInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderingAttachmentLocationInfoKHR(address, null);
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

    public static VkRenderingAttachmentLocationInfoKHR malloc(MemoryStack stack) {
        return new VkRenderingAttachmentLocationInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderingAttachmentLocationInfoKHR calloc(MemoryStack stack) {
        return new VkRenderingAttachmentLocationInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentLocationInfoKHR$Buffer.class */
    public static class Buffer extends VkRenderingAttachmentLocationInfo.Buffer {
        private static final VkRenderingAttachmentLocationInfoKHR ELEMENT_FACTORY = VkRenderingAttachmentLocationInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkRenderingAttachmentLocationInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderingAttachmentLocationInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000232001);
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderingAttachmentLocationInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.Buffer
        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkRenderingAttachmentLocationInfoKHR.ncolorAttachmentCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentLocationInfo.Buffer
        public Buffer pColorAttachmentLocations(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderingAttachmentLocationInfoKHR.npColorAttachmentLocations(address(), value);
            return this;
        }
    }
}
