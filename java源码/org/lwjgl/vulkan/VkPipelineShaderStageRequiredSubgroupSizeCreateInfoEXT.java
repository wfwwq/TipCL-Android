package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.class */
public class VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT extends VkPipelineShaderStageRequiredSubgroupSizeCreateInfo {
    protected VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo, org.lwjgl.system.Struct
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(address, container);
    }

    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT sType$Default() {
        return sType(1000225001);
    }

    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT requiredSubgroupSize(@NativeType("uint32_t") int value) {
        nrequiredSubgroupSize(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT set(int sType, long pNext, int requiredSubgroupSize) {
        sType(sType);
        pNext(pNext);
        requiredSubgroupSize(requiredSubgroupSize);
        return this;
    }

    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT set(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT malloc() {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT calloc() {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT create(long address) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(address, null);
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(address, null);
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

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer {
        private static final VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT ELEMENT_FACTORY = VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000225001);
        }

        @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer
        public Buffer requiredSubgroupSize(@NativeType("uint32_t") int value) {
            VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT.nrequiredSubgroupSize(address(), value);
            return this;
        }
    }
}
