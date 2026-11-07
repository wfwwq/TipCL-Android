package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4PropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4PropertiesKHR.class */
public class VkPhysicalDeviceMaintenance4PropertiesKHR extends VkPhysicalDeviceMaintenance4Properties {
    protected VkPhysicalDeviceMaintenance4PropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties, org.lwjgl.system.Struct
    public VkPhysicalDeviceMaintenance4PropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance4PropertiesKHR(address, container);
    }

    public VkPhysicalDeviceMaintenance4PropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public VkPhysicalDeviceMaintenance4PropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public VkPhysicalDeviceMaintenance4PropertiesKHR sType$Default() {
        return sType(1000413001);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public VkPhysicalDeviceMaintenance4PropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public VkPhysicalDeviceMaintenance4PropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceMaintenance4PropertiesKHR set(VkPhysicalDeviceMaintenance4PropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMaintenance4PropertiesKHR malloc() {
        return new VkPhysicalDeviceMaintenance4PropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance4PropertiesKHR calloc() {
        return new VkPhysicalDeviceMaintenance4PropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance4PropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance4PropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMaintenance4PropertiesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance4PropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceMaintenance4PropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMaintenance4PropertiesKHR(address, null);
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

    public static VkPhysicalDeviceMaintenance4PropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance4PropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance4PropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance4PropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceMaintenance4Properties.Buffer {
        private static final VkPhysicalDeviceMaintenance4PropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance4PropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceMaintenance4PropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMaintenance4PropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer
        public Buffer sType$Default() {
            return sType(1000413001);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMaintenance4PropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
