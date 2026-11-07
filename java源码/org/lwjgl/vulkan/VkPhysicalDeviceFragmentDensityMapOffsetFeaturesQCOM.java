package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.class */
public class VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM extends VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT {
    protected VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT, org.lwjgl.system.Struct
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(address, container);
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sType$Default() {
        return sType(1000425000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM fragmentDensityMapOffset(@NativeType("VkBool32") boolean value) {
        nfragmentDensityMapOffset(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM set(int sType, long pNext, boolean fragmentDensityMapOffset) {
        sType(sType);
        pNext(pNext);
        fragmentDensityMapOffset(fragmentDensityMapOffset);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM set(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM malloc() {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM calloc() {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(address, null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(address, null);
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

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.Buffer {
        private static final VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.Buffer
        public Buffer sType$Default() {
            return sType(1000425000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.Buffer
        public Buffer fragmentDensityMapOffset(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nfragmentDensityMapOffset(address(), value ? 1 : 0);
            return this;
        }
    }
}
