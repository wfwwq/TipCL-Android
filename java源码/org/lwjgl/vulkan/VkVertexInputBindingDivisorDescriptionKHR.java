package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDivisorDescriptionKHR.class */
public class VkVertexInputBindingDivisorDescriptionKHR extends VkVertexInputBindingDivisorDescription {
    protected VkVertexInputBindingDivisorDescriptionKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription, org.lwjgl.system.Struct
    public VkVertexInputBindingDivisorDescriptionKHR create(long address, ByteBuffer container) {
        return new VkVertexInputBindingDivisorDescriptionKHR(address, container);
    }

    public VkVertexInputBindingDivisorDescriptionKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription
    public VkVertexInputBindingDivisorDescriptionKHR binding(@NativeType("uint32_t") int value) {
        nbinding(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription
    public VkVertexInputBindingDivisorDescriptionKHR divisor(@NativeType("uint32_t") int value) {
        ndivisor(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription
    public VkVertexInputBindingDivisorDescriptionKHR set(int binding, int divisor) {
        binding(binding);
        divisor(divisor);
        return this;
    }

    public VkVertexInputBindingDivisorDescriptionKHR set(VkVertexInputBindingDivisorDescriptionKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVertexInputBindingDivisorDescriptionKHR malloc() {
        return new VkVertexInputBindingDivisorDescriptionKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVertexInputBindingDivisorDescriptionKHR calloc() {
        return new VkVertexInputBindingDivisorDescriptionKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVertexInputBindingDivisorDescriptionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputBindingDivisorDescriptionKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVertexInputBindingDivisorDescriptionKHR create(long address) {
        return new VkVertexInputBindingDivisorDescriptionKHR(address, null);
    }

    public static VkVertexInputBindingDivisorDescriptionKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVertexInputBindingDivisorDescriptionKHR(address, null);
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

    public static VkVertexInputBindingDivisorDescriptionKHR malloc(MemoryStack stack) {
        return new VkVertexInputBindingDivisorDescriptionKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVertexInputBindingDivisorDescriptionKHR calloc(MemoryStack stack) {
        return new VkVertexInputBindingDivisorDescriptionKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDivisorDescriptionKHR$Buffer.class */
    public static class Buffer extends VkVertexInputBindingDivisorDescription.Buffer {
        private static final VkVertexInputBindingDivisorDescriptionKHR ELEMENT_FACTORY = VkVertexInputBindingDivisorDescriptionKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer, org.lwjgl.system.StructBuffer
        public VkVertexInputBindingDivisorDescriptionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer
        public Buffer binding(@NativeType("uint32_t") int value) {
            VkVertexInputBindingDivisorDescriptionKHR.nbinding(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer
        public Buffer divisor(@NativeType("uint32_t") int value) {
            VkVertexInputBindingDivisorDescriptionKHR.ndivisor(address(), value);
            return this;
        }
    }
}
