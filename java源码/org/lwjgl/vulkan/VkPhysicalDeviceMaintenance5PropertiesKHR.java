package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance5PropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance5PropertiesKHR.class */
public class VkPhysicalDeviceMaintenance5PropertiesKHR extends VkPhysicalDeviceMaintenance5Properties {
    protected VkPhysicalDeviceMaintenance5PropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties, org.lwjgl.system.Struct
    public VkPhysicalDeviceMaintenance5PropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(address, container);
    }

    public VkPhysicalDeviceMaintenance5PropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties
    public VkPhysicalDeviceMaintenance5PropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties
    public VkPhysicalDeviceMaintenance5PropertiesKHR sType$Default() {
        return sType(1000470001);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties
    public VkPhysicalDeviceMaintenance5PropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties
    public VkPhysicalDeviceMaintenance5PropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceMaintenance5PropertiesKHR set(VkPhysicalDeviceMaintenance5PropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMaintenance5PropertiesKHR malloc() {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance5PropertiesKHR calloc() {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance5PropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMaintenance5PropertiesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceMaintenance5PropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(address, null);
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

    public static VkPhysicalDeviceMaintenance5PropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance5PropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance5PropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance5PropertiesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceMaintenance5Properties.Buffer {
        private static final VkPhysicalDeviceMaintenance5PropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance5PropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceMaintenance5PropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMaintenance5PropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.Buffer
        public Buffer sType$Default() {
            return sType(1000470001);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5Properties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMaintenance5PropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
