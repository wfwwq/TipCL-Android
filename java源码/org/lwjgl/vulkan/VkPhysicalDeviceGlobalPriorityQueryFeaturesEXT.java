package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class */
public class VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT extends VkPhysicalDeviceGlobalPriorityQueryFeatures {
    protected VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT sType$Default() {
        return sType(1000388000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT globalPriorityQuery(@NativeType("VkBool32") boolean value) {
        nglobalPriorityQuery(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT set(int sType, long pNext, boolean globalPriorityQuery) {
        sType(sType);
        pNext(pNext);
        globalPriorityQuery(globalPriorityQuery);
        return this;
    }

    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT set(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT malloc() {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT calloc() {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT create(long address) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceGlobalPriorityQueryFeatures.Buffer {
        private static final VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000388000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeatures.Buffer
        public Buffer globalPriorityQuery(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.nglobalPriorityQuery(address(), value ? 1 : 0);
            return this;
        }
    }
}
