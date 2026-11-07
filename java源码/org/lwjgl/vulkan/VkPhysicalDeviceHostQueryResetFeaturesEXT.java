package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostQueryResetFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostQueryResetFeaturesEXT.class */
public class VkPhysicalDeviceHostQueryResetFeaturesEXT extends VkPhysicalDeviceHostQueryResetFeatures {
    protected VkPhysicalDeviceHostQueryResetFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceHostQueryResetFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceHostQueryResetFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceHostQueryResetFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures
    public VkPhysicalDeviceHostQueryResetFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures
    public VkPhysicalDeviceHostQueryResetFeaturesEXT sType$Default() {
        return sType(1000261000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures
    public VkPhysicalDeviceHostQueryResetFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures
    public VkPhysicalDeviceHostQueryResetFeaturesEXT hostQueryReset(@NativeType("VkBool32") boolean value) {
        nhostQueryReset(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures
    public VkPhysicalDeviceHostQueryResetFeaturesEXT set(int sType, long pNext, boolean hostQueryReset) {
        sType(sType);
        pNext(pNext);
        hostQueryReset(hostQueryReset);
        return this;
    }

    public VkPhysicalDeviceHostQueryResetFeaturesEXT set(VkPhysicalDeviceHostQueryResetFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceHostQueryResetFeaturesEXT malloc() {
        return new VkPhysicalDeviceHostQueryResetFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceHostQueryResetFeaturesEXT calloc() {
        return new VkPhysicalDeviceHostQueryResetFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceHostQueryResetFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHostQueryResetFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceHostQueryResetFeaturesEXT create(long address) {
        return new VkPhysicalDeviceHostQueryResetFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceHostQueryResetFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceHostQueryResetFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceHostQueryResetFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostQueryResetFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceHostQueryResetFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostQueryResetFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostQueryResetFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostQueryResetFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceHostQueryResetFeatures.Buffer {
        private static final VkPhysicalDeviceHostQueryResetFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceHostQueryResetFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceHostQueryResetFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceHostQueryResetFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000261000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceHostQueryResetFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures.Buffer
        public Buffer hostQueryReset(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceHostQueryResetFeaturesEXT.nhostQueryReset(address(), value ? 1 : 0);
            return this;
        }
    }
}
