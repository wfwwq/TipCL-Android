package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.class */
public class VkPhysicalDeviceSubgroupSizeControlFeaturesEXT extends VkPhysicalDeviceSubgroupSizeControlFeatures {
    protected VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT sType$Default() {
        return sType(1000225002);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT subgroupSizeControl(@NativeType("VkBool32") boolean value) {
        nsubgroupSizeControl(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT computeFullSubgroups(@NativeType("VkBool32") boolean value) {
        ncomputeFullSubgroups(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT set(int sType, long pNext, boolean subgroupSizeControl, boolean computeFullSubgroups) {
        sType(sType);
        pNext(pNext);
        subgroupSizeControl(subgroupSizeControl);
        computeFullSubgroups(computeFullSubgroups);
        return this;
    }

    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT set(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT malloc() {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT calloc() {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT create(long address) {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupSizeControlFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupSizeControlFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer {
        private static final VkPhysicalDeviceSubgroupSizeControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000225002);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer
        public Buffer subgroupSizeControl(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.nsubgroupSizeControl(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer
        public Buffer computeFullSubgroups(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.ncomputeFullSubgroups(address(), value ? 1 : 0);
            return this;
        }
    }
}
