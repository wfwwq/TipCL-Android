package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInputAttachmentIndexInfoKHR.class */
public class VkRenderingInputAttachmentIndexInfoKHR extends VkRenderingInputAttachmentIndexInfo {
    protected VkRenderingInputAttachmentIndexInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo, org.lwjgl.system.Struct
    public VkRenderingInputAttachmentIndexInfoKHR create(long address, ByteBuffer container) {
        return new VkRenderingInputAttachmentIndexInfoKHR(address, container);
    }

    public VkRenderingInputAttachmentIndexInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo
    public VkRenderingInputAttachmentIndexInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo
    public VkRenderingInputAttachmentIndexInfoKHR sType$Default() {
        return sType(1000232002);
    }

    @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo
    public VkRenderingInputAttachmentIndexInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo
    public VkRenderingInputAttachmentIndexInfoKHR colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo
    public VkRenderingInputAttachmentIndexInfoKHR pColorAttachmentInputIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npColorAttachmentInputIndices(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo
    public VkRenderingInputAttachmentIndexInfoKHR pDepthInputAttachmentIndex(@NativeType("uint32_t const *") IntBuffer value) {
        npDepthInputAttachmentIndex(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo
    public VkRenderingInputAttachmentIndexInfoKHR pStencilInputAttachmentIndex(@NativeType("uint32_t const *") IntBuffer value) {
        npStencilInputAttachmentIndex(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo
    public VkRenderingInputAttachmentIndexInfoKHR set(int sType, long pNext, int colorAttachmentCount, IntBuffer pColorAttachmentInputIndices, IntBuffer pDepthInputAttachmentIndex, IntBuffer pStencilInputAttachmentIndex) {
        sType(sType);
        pNext(pNext);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentInputIndices(pColorAttachmentInputIndices);
        pDepthInputAttachmentIndex(pDepthInputAttachmentIndex);
        pStencilInputAttachmentIndex(pStencilInputAttachmentIndex);
        return this;
    }

    public VkRenderingInputAttachmentIndexInfoKHR set(VkRenderingInputAttachmentIndexInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderingInputAttachmentIndexInfoKHR malloc() {
        return new VkRenderingInputAttachmentIndexInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderingInputAttachmentIndexInfoKHR calloc() {
        return new VkRenderingInputAttachmentIndexInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderingInputAttachmentIndexInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingInputAttachmentIndexInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderingInputAttachmentIndexInfoKHR create(long address) {
        return new VkRenderingInputAttachmentIndexInfoKHR(address, null);
    }

    public static VkRenderingInputAttachmentIndexInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderingInputAttachmentIndexInfoKHR(address, null);
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

    public static VkRenderingInputAttachmentIndexInfoKHR malloc(MemoryStack stack) {
        return new VkRenderingInputAttachmentIndexInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderingInputAttachmentIndexInfoKHR calloc(MemoryStack stack) {
        return new VkRenderingInputAttachmentIndexInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInputAttachmentIndexInfoKHR$Buffer.class */
    public static class Buffer extends VkRenderingInputAttachmentIndexInfo.Buffer {
        private static final VkRenderingInputAttachmentIndexInfoKHR ELEMENT_FACTORY = VkRenderingInputAttachmentIndexInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkRenderingInputAttachmentIndexInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderingInputAttachmentIndexInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000232002);
        }

        @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderingInputAttachmentIndexInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.Buffer
        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkRenderingInputAttachmentIndexInfoKHR.ncolorAttachmentCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.Buffer
        public Buffer pColorAttachmentInputIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderingInputAttachmentIndexInfoKHR.npColorAttachmentInputIndices(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.Buffer
        public Buffer pDepthInputAttachmentIndex(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderingInputAttachmentIndexInfoKHR.npDepthInputAttachmentIndex(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingInputAttachmentIndexInfo.Buffer
        public Buffer pStencilInputAttachmentIndex(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderingInputAttachmentIndexInfoKHR.npStencilInputAttachmentIndex(address(), value);
            return this;
        }
    }
}
