package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIndexTypeUint8FeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIndexTypeUint8FeaturesEXT.class */
public class VkPhysicalDeviceIndexTypeUint8FeaturesEXT extends VkPhysicalDeviceIndexTypeUint8Features {
    protected VkPhysicalDeviceIndexTypeUint8FeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features, org.lwjgl.system.Struct
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesEXT(address, container);
    }

    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT sType$Default() {
        return sType(1000265000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT indexTypeUint8(@NativeType("VkBool32") boolean value) {
        nindexTypeUint8(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT set(int sType, long pNext, boolean indexTypeUint8) {
        sType(sType);
        pNext(pNext);
        indexTypeUint8(indexTypeUint8);
        return this;
    }

    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT set(VkPhysicalDeviceIndexTypeUint8FeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT malloc() {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT calloc() {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceIndexTypeUint8FeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT create(long address) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceIndexTypeUint8FeaturesEXT(address, null);
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

    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIndexTypeUint8FeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIndexTypeUint8FeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceIndexTypeUint8Features.Buffer {
        private static final VkPhysicalDeviceIndexTypeUint8FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceIndexTypeUint8FeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceIndexTypeUint8FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceIndexTypeUint8FeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer
        public Buffer sType$Default() {
            return sType(1000265000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceIndexTypeUint8FeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8Features.Buffer
        public Buffer indexTypeUint8(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceIndexTypeUint8FeaturesEXT.nindexTypeUint8(address(), value ? 1 : 0);
            return this;
        }
    }
}
