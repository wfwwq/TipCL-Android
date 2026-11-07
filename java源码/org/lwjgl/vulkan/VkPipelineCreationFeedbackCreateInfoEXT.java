package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPipelineCreationFeedback;
import org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedbackCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedbackCreateInfoEXT.class */
public class VkPipelineCreationFeedbackCreateInfoEXT extends VkPipelineCreationFeedbackCreateInfo {
    protected VkPipelineCreationFeedbackCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo, org.lwjgl.system.Struct
    public VkPipelineCreationFeedbackCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineCreationFeedbackCreateInfoEXT(address, container);
    }

    public VkPipelineCreationFeedbackCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo
    public VkPipelineCreationFeedbackCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo
    public VkPipelineCreationFeedbackCreateInfoEXT sType$Default() {
        return sType(1000192000);
    }

    @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo
    public VkPipelineCreationFeedbackCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineCreationFeedback(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback value) {
        npPipelineCreationFeedback(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineStageCreationFeedbacks(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback.Buffer value) {
        npPipelineStageCreationFeedbacks(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo
    public VkPipelineCreationFeedbackCreateInfoEXT set(int sType, long pNext, VkPipelineCreationFeedback pPipelineCreationFeedback, VkPipelineCreationFeedback.Buffer pPipelineStageCreationFeedbacks) {
        sType(sType);
        pNext(pNext);
        pPipelineCreationFeedback(pPipelineCreationFeedback);
        pPipelineStageCreationFeedbacks(pPipelineStageCreationFeedbacks);
        return this;
    }

    public VkPipelineCreationFeedbackCreateInfoEXT set(VkPipelineCreationFeedbackCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineCreationFeedbackCreateInfoEXT malloc() {
        return new VkPipelineCreationFeedbackCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineCreationFeedbackCreateInfoEXT calloc() {
        return new VkPipelineCreationFeedbackCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineCreationFeedbackCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCreationFeedbackCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineCreationFeedbackCreateInfoEXT create(long address) {
        return new VkPipelineCreationFeedbackCreateInfoEXT(address, null);
    }

    public static VkPipelineCreationFeedbackCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineCreationFeedbackCreateInfoEXT(address, null);
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

    public static VkPipelineCreationFeedbackCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineCreationFeedbackCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineCreationFeedbackCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineCreationFeedbackCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedbackCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedbackCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkPipelineCreationFeedbackCreateInfo.Buffer {
        private static final VkPipelineCreationFeedbackCreateInfoEXT ELEMENT_FACTORY = VkPipelineCreationFeedbackCreateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPipelineCreationFeedbackCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineCreationFeedbackCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000192000);
        }

        @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineCreationFeedbackCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.Buffer
        public Buffer pPipelineCreationFeedback(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback value) {
            VkPipelineCreationFeedbackCreateInfoEXT.npPipelineCreationFeedback(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo.Buffer
        public Buffer pPipelineStageCreationFeedbacks(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback.Buffer value) {
            VkPipelineCreationFeedbackCreateInfoEXT.npPipelineStageCreationFeedbacks(address(), value);
            return this;
        }
    }
}
