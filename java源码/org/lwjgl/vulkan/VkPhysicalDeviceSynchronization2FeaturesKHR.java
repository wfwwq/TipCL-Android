package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSynchronization2FeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSynchronization2FeaturesKHR.class */
public class VkPhysicalDeviceSynchronization2FeaturesKHR extends VkPhysicalDeviceSynchronization2Features {
    protected VkPhysicalDeviceSynchronization2FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features, org.lwjgl.system.Struct
    public VkPhysicalDeviceSynchronization2FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceSynchronization2FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features
    public VkPhysicalDeviceSynchronization2FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features
    public VkPhysicalDeviceSynchronization2FeaturesKHR sType$Default() {
        return sType(1000314007);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features
    public VkPhysicalDeviceSynchronization2FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features
    public VkPhysicalDeviceSynchronization2FeaturesKHR synchronization2(@NativeType("VkBool32") boolean value) {
        nsynchronization2(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features
    public VkPhysicalDeviceSynchronization2FeaturesKHR set(int sType, long pNext, boolean synchronization2) {
        sType(sType);
        pNext(pNext);
        synchronization2(synchronization2);
        return this;
    }

    public VkPhysicalDeviceSynchronization2FeaturesKHR set(VkPhysicalDeviceSynchronization2FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSynchronization2FeaturesKHR malloc() {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSynchronization2FeaturesKHR calloc() {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSynchronization2FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSynchronization2FeaturesKHR create(long address) {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceSynchronization2FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceSynchronization2FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSynchronization2FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSynchronization2FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSynchronization2FeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSynchronization2FeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceSynchronization2Features.Buffer {
        private static final VkPhysicalDeviceSynchronization2FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceSynchronization2FeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceSynchronization2FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSynchronization2FeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.Buffer
        public Buffer sType$Default() {
            return sType(1000314007);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSynchronization2FeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features.Buffer
        public Buffer synchronization2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceSynchronization2FeaturesKHR.nsynchronization2(address(), value ? 1 : 0);
            return this;
        }
    }
}
