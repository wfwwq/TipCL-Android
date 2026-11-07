package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class */
public class VkDescriptorPoolInlineUniformBlockCreateInfoEXT extends VkDescriptorPoolInlineUniformBlockCreateInfo {
    protected VkDescriptorPoolInlineUniformBlockCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo, org.lwjgl.system.Struct
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfoEXT(address, container);
    }

    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT sType$Default() {
        return sType(1000138003);
    }

    @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) {
        nmaxInlineUniformBlockBindings(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT set(int sType, long pNext, int maxInlineUniformBlockBindings) {
        sType(sType);
        pNext(pNext);
        maxInlineUniformBlockBindings(maxInlineUniformBlockBindings);
        return this;
    }

    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT set(VkDescriptorPoolInlineUniformBlockCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT malloc() {
        return new VkDescriptorPoolInlineUniformBlockCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT calloc() {
        return new VkDescriptorPoolInlineUniformBlockCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorPoolInlineUniformBlockCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT create(long address) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfoEXT(address, null);
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorPoolInlineUniformBlockCreateInfoEXT(address, null);
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

    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT malloc(MemoryStack stack) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT calloc(MemoryStack stack) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolInlineUniformBlockCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolInlineUniformBlockCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer {
        private static final VkDescriptorPoolInlineUniformBlockCreateInfoEXT ELEMENT_FACTORY = VkDescriptorPoolInlineUniformBlockCreateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDescriptorPoolInlineUniformBlockCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorPoolInlineUniformBlockCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000138003);
        }

        @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorPoolInlineUniformBlockCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer
        public Buffer maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) {
            VkDescriptorPoolInlineUniformBlockCreateInfoEXT.nmaxInlineUniformBlockBindings(address(), value);
            return this;
        }
    }
}
