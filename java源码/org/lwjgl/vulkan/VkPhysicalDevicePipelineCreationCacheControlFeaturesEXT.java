package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class */
public class VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT extends VkPhysicalDevicePipelineCreationCacheControlFeatures {
    protected VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures, org.lwjgl.system.Struct
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(address, container);
    }

    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT sType$Default() {
        return sType(1000297000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) {
        npipelineCreationCacheControl(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT set(int sType, long pNext, boolean pipelineCreationCacheControl) {
        sType(sType);
        pNext(pNext);
        pipelineCreationCacheControl(pipelineCreationCacheControl);
        return this;
    }

    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT set(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT malloc() {
        return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT calloc() {
        return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT create(long address) {
        return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(address, null);
    }

    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(address, null);
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

    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer {
        private static final VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000297000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer
        public Buffer pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.npipelineCreationCacheControl(address(), value ? 1 : 0);
            return this;
        }
    }
}
