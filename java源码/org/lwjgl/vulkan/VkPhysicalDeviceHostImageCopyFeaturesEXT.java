package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyFeaturesEXT.class */
public class VkPhysicalDeviceHostImageCopyFeaturesEXT extends VkPhysicalDeviceHostImageCopyFeatures {
    protected VkPhysicalDeviceHostImageCopyFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceHostImageCopyFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceHostImageCopyFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures
    public VkPhysicalDeviceHostImageCopyFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures
    public VkPhysicalDeviceHostImageCopyFeaturesEXT sType$Default() {
        return sType(1000270000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures
    public VkPhysicalDeviceHostImageCopyFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures
    public VkPhysicalDeviceHostImageCopyFeaturesEXT hostImageCopy(@NativeType("VkBool32") boolean value) {
        nhostImageCopy(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures
    public VkPhysicalDeviceHostImageCopyFeaturesEXT set(int sType, long pNext, boolean hostImageCopy) {
        sType(sType);
        pNext(pNext);
        hostImageCopy(hostImageCopy);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyFeaturesEXT set(VkPhysicalDeviceHostImageCopyFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceHostImageCopyFeaturesEXT malloc() {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyFeaturesEXT calloc() {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceHostImageCopyFeaturesEXT create(long address) {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceHostImageCopyFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceHostImageCopyFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceHostImageCopyFeatures.Buffer {
        private static final VkPhysicalDeviceHostImageCopyFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceHostImageCopyFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceHostImageCopyFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceHostImageCopyFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000270000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceHostImageCopyFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeatures.Buffer
        public Buffer hostImageCopy(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceHostImageCopyFeaturesEXT.nhostImageCopy(address(), value ? 1 : 0);
            return this;
        }
    }
}
