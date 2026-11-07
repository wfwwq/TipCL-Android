package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.class */
public class VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE extends VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT {
    protected VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT, org.lwjgl.system.Struct
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(address, container);
    }

    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE sType$Default() {
        return sType(1000351000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE mutableDescriptorType(@NativeType("VkBool32") boolean value) {
        nmutableDescriptorType(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE set(int sType, long pNext, boolean mutableDescriptorType) {
        sType(sType);
        pNext(pNext);
        mutableDescriptorType(mutableDescriptorType);
        return this;
    }

    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE set(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE malloc() {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE calloc() {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE create(long address) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(address, null);
    }

    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(address, null);
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

    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer {
        private static final VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE ELEMENT_FACTORY = VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer
        public Buffer sType$Default() {
            return sType(1000351000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer
        public Buffer mutableDescriptorType(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.nmutableDescriptorType(address(), value ? 1 : 0);
            return this;
        }
    }
}
