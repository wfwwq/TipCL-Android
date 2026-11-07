package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2PropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2PropertiesEXT.class */
public class VkPhysicalDeviceRobustness2PropertiesEXT extends VkPhysicalDeviceRobustness2PropertiesKHR {
    protected VkPhysicalDeviceRobustness2PropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR, org.lwjgl.system.Struct
    public VkPhysicalDeviceRobustness2PropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(address, container);
    }

    public VkPhysicalDeviceRobustness2PropertiesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR
    public VkPhysicalDeviceRobustness2PropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR
    public VkPhysicalDeviceRobustness2PropertiesEXT sType$Default() {
        return sType(1000286001);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR
    public VkPhysicalDeviceRobustness2PropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR
    public VkPhysicalDeviceRobustness2PropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceRobustness2PropertiesEXT set(VkPhysicalDeviceRobustness2PropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT malloc() {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT calloc() {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRobustness2PropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT create(long address) {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRobustness2PropertiesEXT(address, null);
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

    public static VkPhysicalDeviceRobustness2PropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2PropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2PropertiesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceRobustness2PropertiesKHR.Buffer {
        private static final VkPhysicalDeviceRobustness2PropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceRobustness2PropertiesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceRobustness2PropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRobustness2PropertiesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000286001);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesKHR.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRobustness2PropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
