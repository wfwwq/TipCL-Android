package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4FeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4FeaturesKHR.class */
public class VkPhysicalDeviceMaintenance4FeaturesKHR extends VkPhysicalDeviceMaintenance4Features {
    protected VkPhysicalDeviceMaintenance4FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features, org.lwjgl.system.Struct
    public VkPhysicalDeviceMaintenance4FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance4FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceMaintenance4FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features
    public VkPhysicalDeviceMaintenance4FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features
    public VkPhysicalDeviceMaintenance4FeaturesKHR sType$Default() {
        return sType(1000413000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features
    public VkPhysicalDeviceMaintenance4FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features
    public VkPhysicalDeviceMaintenance4FeaturesKHR maintenance4(@NativeType("VkBool32") boolean value) {
        nmaintenance4(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features
    public VkPhysicalDeviceMaintenance4FeaturesKHR set(int sType, long pNext, boolean maintenance4) {
        sType(sType);
        pNext(pNext);
        maintenance4(maintenance4);
        return this;
    }

    public VkPhysicalDeviceMaintenance4FeaturesKHR set(VkPhysicalDeviceMaintenance4FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMaintenance4FeaturesKHR malloc() {
        return new VkPhysicalDeviceMaintenance4FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance4FeaturesKHR calloc() {
        return new VkPhysicalDeviceMaintenance4FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance4FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance4FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMaintenance4FeaturesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance4FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceMaintenance4FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMaintenance4FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceMaintenance4FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance4FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance4FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance4FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4FeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4FeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceMaintenance4Features.Buffer {
        private static final VkPhysicalDeviceMaintenance4FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance4FeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceMaintenance4FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMaintenance4FeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.Buffer
        public Buffer sType$Default() {
            return sType(1000413000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMaintenance4FeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features.Buffer
        public Buffer maintenance4(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMaintenance4FeaturesKHR.nmaintenance4(address(), value ? 1 : 0);
            return this;
        }
    }
}
