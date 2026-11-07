package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.class */
public class VkPhysicalDevicePipelineProtectedAccessFeaturesEXT extends VkPhysicalDevicePipelineProtectedAccessFeatures {
    protected VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures, org.lwjgl.system.Struct
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(address, container);
    }

    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT sType$Default() {
        return sType(1000466000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT pipelineProtectedAccess(@NativeType("VkBool32") boolean value) {
        npipelineProtectedAccess(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT set(int sType, long pNext, boolean pipelineProtectedAccess) {
        sType(sType);
        pNext(pNext);
        pipelineProtectedAccess(pipelineProtectedAccess);
        return this;
    }

    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT set(VkPhysicalDevicePipelineProtectedAccessFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT malloc() {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT calloc() {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT create(long address) {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(address, null);
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(address, null);
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

    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineProtectedAccessFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineProtectedAccessFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer {
        private static final VkPhysicalDevicePipelineProtectedAccessFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000466000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer
        public Buffer pipelineProtectedAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.npipelineProtectedAccess(address(), value ? 1 : 0);
            return this;
        }
    }
}
