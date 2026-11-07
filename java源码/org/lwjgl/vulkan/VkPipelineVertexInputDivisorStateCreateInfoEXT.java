package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo;
import org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineVertexInputDivisorStateCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineVertexInputDivisorStateCreateInfoEXT.class */
public class VkPipelineVertexInputDivisorStateCreateInfoEXT extends VkPipelineVertexInputDivisorStateCreateInfo {
    protected VkPipelineVertexInputDivisorStateCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo, org.lwjgl.system.Struct
    public VkPipelineVertexInputDivisorStateCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(address, container);
    }

    public VkPipelineVertexInputDivisorStateCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
    public VkPipelineVertexInputDivisorStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
    public VkPipelineVertexInputDivisorStateCreateInfoEXT sType$Default() {
        return sType(1000190001);
    }

    @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescription const *") VkVertexInputBindingDivisorDescription.Buffer value) {
        npVertexBindingDivisors(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
    public VkPipelineVertexInputDivisorStateCreateInfoEXT set(int sType, long pNext, VkVertexInputBindingDivisorDescription.Buffer pVertexBindingDivisors) {
        sType(sType);
        pNext(pNext);
        pVertexBindingDivisors(pVertexBindingDivisors);
        return this;
    }

    public VkPipelineVertexInputDivisorStateCreateInfoEXT set(VkPipelineVertexInputDivisorStateCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineVertexInputDivisorStateCreateInfoEXT malloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineVertexInputDivisorStateCreateInfoEXT calloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineVertexInputDivisorStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineVertexInputDivisorStateCreateInfoEXT create(long address) {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(address, null);
    }

    public static VkPipelineVertexInputDivisorStateCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(address, null);
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

    public static VkPipelineVertexInputDivisorStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineVertexInputDivisorStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineVertexInputDivisorStateCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineVertexInputDivisorStateCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkPipelineVertexInputDivisorStateCreateInfo.Buffer {
        private static final VkPipelineVertexInputDivisorStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineVertexInputDivisorStateCreateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPipelineVertexInputDivisorStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineVertexInputDivisorStateCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000190001);
        }

        @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineVertexInputDivisorStateCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer
        public Buffer pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescription const *") VkVertexInputBindingDivisorDescription.Buffer value) {
            VkPipelineVertexInputDivisorStateCreateInfoEXT.npVertexBindingDivisors(address(), value);
            return this;
        }
    }
}
