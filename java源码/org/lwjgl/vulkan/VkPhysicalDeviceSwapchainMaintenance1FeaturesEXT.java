package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.class */
public class VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT extends VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR {
    protected VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR, org.lwjgl.system.Struct
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(address, container);
    }

    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT sType$Default() {
        return sType(1000275000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT swapchainMaintenance1(@NativeType("VkBool32") boolean value) {
        nswapchainMaintenance1(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT set(int sType, long pNext, boolean swapchainMaintenance1) {
        sType(sType);
        pNext(pNext);
        swapchainMaintenance1(swapchainMaintenance1);
        return this;
    }

    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT set(VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT malloc() {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT calloc() {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT create(long address) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(address, null);
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

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.Buffer {
        private static final VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000275000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.Buffer
        public Buffer swapchainMaintenance1(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.nswapchainMaintenance1(address(), value ? 1 : 0);
            return this;
        }
    }
}
