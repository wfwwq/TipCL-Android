package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.class */
public class VkPhysicalDeviceDepthClampZeroOneFeaturesEXT extends VkPhysicalDeviceDepthClampZeroOneFeaturesKHR {
    protected VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR, org.lwjgl.system.Struct
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT sType$Default() {
        return sType(1000421000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT depthClampZeroOne(@NativeType("VkBool32") boolean value) {
        ndepthClampZeroOne(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT set(int sType, long pNext, boolean depthClampZeroOne) {
        sType(sType);
        pNext(pNext);
        depthClampZeroOne(depthClampZeroOne);
        return this;
    }

    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT set(VkPhysicalDeviceDepthClampZeroOneFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT malloc() {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT calloc() {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthClampZeroOneFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthClampZeroOneFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer {
        private static final VkPhysicalDeviceDepthClampZeroOneFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000421000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer
        public Buffer depthClampZeroOne(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.ndepthClampZeroOne(address(), value ? 1 : 0);
            return this;
        }
    }
}
