package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class */
public class VkPhysicalDeviceInlineUniformBlockFeaturesEXT extends VkPhysicalDeviceInlineUniformBlockFeatures {
    protected VkPhysicalDeviceInlineUniformBlockFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT sType$Default() {
        return sType(1000138000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT inlineUniformBlock(@NativeType("VkBool32") boolean value) {
        ninlineUniformBlock(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT set(int sType, long pNext, boolean inlineUniformBlock, boolean descriptorBindingInlineUniformBlockUpdateAfterBind) {
        sType(sType);
        pNext(pNext);
        inlineUniformBlock(inlineUniformBlock);
        descriptorBindingInlineUniformBlockUpdateAfterBind(descriptorBindingInlineUniformBlockUpdateAfterBind);
        return this;
    }

    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT set(VkPhysicalDeviceInlineUniformBlockFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT malloc() {
        return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT calloc() {
        return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT create(long address) {
        return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceInlineUniformBlockFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceInlineUniformBlockFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceInlineUniformBlockFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceInlineUniformBlockFeatures.Buffer {
        private static final VkPhysicalDeviceInlineUniformBlockFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceInlineUniformBlockFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceInlineUniformBlockFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceInlineUniformBlockFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000138000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceInlineUniformBlockFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.Buffer
        public Buffer inlineUniformBlock(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceInlineUniformBlockFeaturesEXT.ninlineUniformBlock(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures.Buffer
        public Buffer descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceInlineUniformBlockFeaturesEXT.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }
    }
}
