package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageRobustnessFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageRobustnessFeaturesEXT.class */
public class VkPhysicalDeviceImageRobustnessFeaturesEXT extends VkPhysicalDeviceImageRobustnessFeatures {
    protected VkPhysicalDeviceImageRobustnessFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceImageRobustnessFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageRobustnessFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceImageRobustnessFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures
    public VkPhysicalDeviceImageRobustnessFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures
    public VkPhysicalDeviceImageRobustnessFeaturesEXT sType$Default() {
        return sType(1000335000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures
    public VkPhysicalDeviceImageRobustnessFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures
    public VkPhysicalDeviceImageRobustnessFeaturesEXT robustImageAccess(@NativeType("VkBool32") boolean value) {
        nrobustImageAccess(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures
    public VkPhysicalDeviceImageRobustnessFeaturesEXT set(int sType, long pNext, boolean robustImageAccess) {
        sType(sType);
        pNext(pNext);
        robustImageAccess(robustImageAccess);
        return this;
    }

    public VkPhysicalDeviceImageRobustnessFeaturesEXT set(VkPhysicalDeviceImageRobustnessFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageRobustnessFeaturesEXT malloc() {
        return new VkPhysicalDeviceImageRobustnessFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageRobustnessFeaturesEXT calloc() {
        return new VkPhysicalDeviceImageRobustnessFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageRobustnessFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageRobustnessFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageRobustnessFeaturesEXT create(long address) {
        return new VkPhysicalDeviceImageRobustnessFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceImageRobustnessFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageRobustnessFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceImageRobustnessFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageRobustnessFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageRobustnessFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageRobustnessFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageRobustnessFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageRobustnessFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceImageRobustnessFeatures.Buffer {
        private static final VkPhysicalDeviceImageRobustnessFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceImageRobustnessFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceImageRobustnessFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageRobustnessFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000335000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImageRobustnessFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures.Buffer
        public Buffer robustImageAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImageRobustnessFeaturesEXT.nrobustImageAccess(address(), value ? 1 : 0);
            return this;
        }
    }
}
