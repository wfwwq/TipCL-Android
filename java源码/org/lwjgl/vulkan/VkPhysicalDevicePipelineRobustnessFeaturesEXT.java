package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineRobustnessFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineRobustnessFeaturesEXT.class */
public class VkPhysicalDevicePipelineRobustnessFeaturesEXT extends VkPhysicalDevicePipelineRobustnessFeatures {
    protected VkPhysicalDevicePipelineRobustnessFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures, org.lwjgl.system.Struct
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(address, container);
    }

    public VkPhysicalDevicePipelineRobustnessFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT sType$Default() {
        return sType(1000068001);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT pipelineRobustness(@NativeType("VkBool32") boolean value) {
        npipelineRobustness(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT set(int sType, long pNext, boolean pipelineRobustness) {
        sType(sType);
        pNext(pNext);
        pipelineRobustness(pipelineRobustness);
        return this;
    }

    public VkPhysicalDevicePipelineRobustnessFeaturesEXT set(VkPhysicalDevicePipelineRobustnessFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT malloc() {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT calloc() {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT create(long address) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(address, null);
    }

    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(address, null);
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

    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineRobustnessFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineRobustnessFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDevicePipelineRobustnessFeatures.Buffer {
        private static final VkPhysicalDevicePipelineRobustnessFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePipelineRobustnessFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDevicePipelineRobustnessFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePipelineRobustnessFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000068001);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePipelineRobustnessFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeatures.Buffer
        public Buffer pipelineRobustness(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePipelineRobustnessFeaturesEXT.npipelineRobustness(address(), value ? 1 : 0);
            return this;
        }
    }
}
