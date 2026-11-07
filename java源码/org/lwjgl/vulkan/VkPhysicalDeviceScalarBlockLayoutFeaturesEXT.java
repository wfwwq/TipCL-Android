package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceScalarBlockLayoutFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceScalarBlockLayoutFeaturesEXT.class */
public class VkPhysicalDeviceScalarBlockLayoutFeaturesEXT extends VkPhysicalDeviceScalarBlockLayoutFeatures {
    protected VkPhysicalDeviceScalarBlockLayoutFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceScalarBlockLayoutFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceScalarBlockLayoutFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceScalarBlockLayoutFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures
    public VkPhysicalDeviceScalarBlockLayoutFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures
    public VkPhysicalDeviceScalarBlockLayoutFeaturesEXT sType$Default() {
        return sType(1000221000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures
    public VkPhysicalDeviceScalarBlockLayoutFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures
    public VkPhysicalDeviceScalarBlockLayoutFeaturesEXT scalarBlockLayout(@NativeType("VkBool32") boolean value) {
        nscalarBlockLayout(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures
    public VkPhysicalDeviceScalarBlockLayoutFeaturesEXT set(int sType, long pNext, boolean scalarBlockLayout) {
        sType(sType);
        pNext(pNext);
        scalarBlockLayout(scalarBlockLayout);
        return this;
    }

    public VkPhysicalDeviceScalarBlockLayoutFeaturesEXT set(VkPhysicalDeviceScalarBlockLayoutFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeaturesEXT malloc() {
        return new VkPhysicalDeviceScalarBlockLayoutFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeaturesEXT calloc() {
        return new VkPhysicalDeviceScalarBlockLayoutFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceScalarBlockLayoutFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeaturesEXT create(long address) {
        return new VkPhysicalDeviceScalarBlockLayoutFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceScalarBlockLayoutFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceScalarBlockLayoutFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceScalarBlockLayoutFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceScalarBlockLayoutFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceScalarBlockLayoutFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceScalarBlockLayoutFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer {
        private static final VkPhysicalDeviceScalarBlockLayoutFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceScalarBlockLayoutFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceScalarBlockLayoutFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceScalarBlockLayoutFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000221000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceScalarBlockLayoutFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures.Buffer
        public Buffer scalarBlockLayout(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceScalarBlockLayoutFeaturesEXT.nscalarBlockLayout(address(), value ? 1 : 0);
            return this;
        }
    }
}
