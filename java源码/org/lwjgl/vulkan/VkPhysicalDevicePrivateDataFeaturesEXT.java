package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrivateDataFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrivateDataFeaturesEXT.class */
public class VkPhysicalDevicePrivateDataFeaturesEXT extends VkPhysicalDevicePrivateDataFeatures {
    protected VkPhysicalDevicePrivateDataFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures, org.lwjgl.system.Struct
    public VkPhysicalDevicePrivateDataFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(address, container);
    }

    public VkPhysicalDevicePrivateDataFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures
    public VkPhysicalDevicePrivateDataFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures
    public VkPhysicalDevicePrivateDataFeaturesEXT sType$Default() {
        return sType(1000295000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures
    public VkPhysicalDevicePrivateDataFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures
    public VkPhysicalDevicePrivateDataFeaturesEXT privateData(@NativeType("VkBool32") boolean value) {
        nprivateData(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures
    public VkPhysicalDevicePrivateDataFeaturesEXT set(int sType, long pNext, boolean privateData) {
        sType(sType);
        pNext(pNext);
        privateData(privateData);
        return this;
    }

    public VkPhysicalDevicePrivateDataFeaturesEXT set(VkPhysicalDevicePrivateDataFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePrivateDataFeaturesEXT malloc() {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePrivateDataFeaturesEXT calloc() {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePrivateDataFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePrivateDataFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePrivateDataFeaturesEXT create(long address) {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(address, null);
    }

    public static VkPhysicalDevicePrivateDataFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePrivateDataFeaturesEXT(address, null);
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

    public static VkPhysicalDevicePrivateDataFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePrivateDataFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrivateDataFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrivateDataFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDevicePrivateDataFeatures.Buffer {
        private static final VkPhysicalDevicePrivateDataFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePrivateDataFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDevicePrivateDataFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePrivateDataFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000295000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePrivateDataFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures.Buffer
        public Buffer privateData(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePrivateDataFeaturesEXT.nprivateData(address(), value ? 1 : 0);
            return this;
        }
    }
}
