package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.class */
public class VkDescriptorSetLayoutBindingFlagsCreateInfoEXT extends VkDescriptorSetLayoutBindingFlagsCreateInfo {
    protected VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo, org.lwjgl.system.Struct
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(address, container);
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT sType$Default() {
        return sType(1000161000);
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT bindingCount(@NativeType("uint32_t") int value) {
        nbindingCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pBindingFlags(@NativeType("VkDescriptorBindingFlags const *") IntBuffer value) {
        npBindingFlags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT set(int sType, long pNext, int bindingCount, IntBuffer pBindingFlags) {
        sType(sType);
        pNext(pNext);
        bindingCount(bindingCount);
        pBindingFlags(pBindingFlags);
        return this;
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT set(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT malloc() {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT calloc() {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT create(long address) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(address, null);
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(address, null);
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

    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT malloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT calloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer {
        private static final VkDescriptorSetLayoutBindingFlagsCreateInfoEXT ELEMENT_FACTORY = VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000161000);
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public Buffer bindingCount(@NativeType("uint32_t") int value) {
            VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.nbindingCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public Buffer pBindingFlags(@NativeType("VkDescriptorBindingFlags const *") IntBuffer value) {
            VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.npBindingFlags(address(), value);
            return this;
        }
    }
}
