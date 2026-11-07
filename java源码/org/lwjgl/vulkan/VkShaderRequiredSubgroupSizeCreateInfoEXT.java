package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderRequiredSubgroupSizeCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderRequiredSubgroupSizeCreateInfoEXT.class */
public class VkShaderRequiredSubgroupSizeCreateInfoEXT extends VkPipelineShaderStageRequiredSubgroupSizeCreateInfo {
    protected VkShaderRequiredSubgroupSizeCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo, org.lwjgl.system.Struct
    public VkShaderRequiredSubgroupSizeCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(address, container);
    }

    public VkShaderRequiredSubgroupSizeCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo
    public VkShaderRequiredSubgroupSizeCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo
    public VkShaderRequiredSubgroupSizeCreateInfoEXT sType$Default() {
        return sType(1000225001);
    }

    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo
    public VkShaderRequiredSubgroupSizeCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo
    public VkShaderRequiredSubgroupSizeCreateInfoEXT requiredSubgroupSize(@NativeType("uint32_t") int value) {
        nrequiredSubgroupSize(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo
    public VkShaderRequiredSubgroupSizeCreateInfoEXT set(int sType, long pNext, int requiredSubgroupSize) {
        sType(sType);
        pNext(pNext);
        requiredSubgroupSize(requiredSubgroupSize);
        return this;
    }

    public VkShaderRequiredSubgroupSizeCreateInfoEXT set(VkShaderRequiredSubgroupSizeCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkShaderRequiredSubgroupSizeCreateInfoEXT malloc() {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkShaderRequiredSubgroupSizeCreateInfoEXT calloc() {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkShaderRequiredSubgroupSizeCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkShaderRequiredSubgroupSizeCreateInfoEXT create(long address) {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(address, null);
    }

    public static VkShaderRequiredSubgroupSizeCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(address, null);
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

    public static VkShaderRequiredSubgroupSizeCreateInfoEXT malloc(MemoryStack stack) {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkShaderRequiredSubgroupSizeCreateInfoEXT calloc(MemoryStack stack) {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderRequiredSubgroupSizeCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderRequiredSubgroupSizeCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer {
        private static final VkShaderRequiredSubgroupSizeCreateInfoEXT ELEMENT_FACTORY = VkShaderRequiredSubgroupSizeCreateInfoEXT.create(-1L);

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
        public VkShaderRequiredSubgroupSizeCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkShaderRequiredSubgroupSizeCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000225001);
        }

        @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkShaderRequiredSubgroupSizeCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer
        public Buffer requiredSubgroupSize(@NativeType("uint32_t") int value) {
            VkShaderRequiredSubgroupSizeCreateInfoEXT.nrequiredSubgroupSize(address(), value);
            return this;
        }
    }
}
