package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetInlineUniformBlockEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetInlineUniformBlockEXT.class */
public class VkWriteDescriptorSetInlineUniformBlockEXT extends VkWriteDescriptorSetInlineUniformBlock {
    protected VkWriteDescriptorSetInlineUniformBlockEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock, org.lwjgl.system.Struct
    public VkWriteDescriptorSetInlineUniformBlockEXT create(long address, ByteBuffer container) {
        return new VkWriteDescriptorSetInlineUniformBlockEXT(address, container);
    }

    public VkWriteDescriptorSetInlineUniformBlockEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock
    public VkWriteDescriptorSetInlineUniformBlockEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock
    public VkWriteDescriptorSetInlineUniformBlockEXT sType$Default() {
        return sType(1000138002);
    }

    @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock
    public VkWriteDescriptorSetInlineUniformBlockEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock
    public VkWriteDescriptorSetInlineUniformBlockEXT pData(@NativeType("void const *") ByteBuffer value) {
        npData(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock
    public VkWriteDescriptorSetInlineUniformBlockEXT set(int sType, long pNext, ByteBuffer pData) {
        sType(sType);
        pNext(pNext);
        pData(pData);
        return this;
    }

    public VkWriteDescriptorSetInlineUniformBlockEXT set(VkWriteDescriptorSetInlineUniformBlockEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkWriteDescriptorSetInlineUniformBlockEXT malloc() {
        return new VkWriteDescriptorSetInlineUniformBlockEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkWriteDescriptorSetInlineUniformBlockEXT calloc() {
        return new VkWriteDescriptorSetInlineUniformBlockEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkWriteDescriptorSetInlineUniformBlockEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteDescriptorSetInlineUniformBlockEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkWriteDescriptorSetInlineUniformBlockEXT create(long address) {
        return new VkWriteDescriptorSetInlineUniformBlockEXT(address, null);
    }

    public static VkWriteDescriptorSetInlineUniformBlockEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkWriteDescriptorSetInlineUniformBlockEXT(address, null);
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

    public static VkWriteDescriptorSetInlineUniformBlockEXT malloc(MemoryStack stack) {
        return new VkWriteDescriptorSetInlineUniformBlockEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkWriteDescriptorSetInlineUniformBlockEXT calloc(MemoryStack stack) {
        return new VkWriteDescriptorSetInlineUniformBlockEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetInlineUniformBlockEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetInlineUniformBlockEXT$Buffer.class */
    public static class Buffer extends VkWriteDescriptorSetInlineUniformBlock.Buffer {
        private static final VkWriteDescriptorSetInlineUniformBlockEXT ELEMENT_FACTORY = VkWriteDescriptorSetInlineUniformBlockEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.Buffer, org.lwjgl.system.StructBuffer
        public VkWriteDescriptorSetInlineUniformBlockEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkWriteDescriptorSetInlineUniformBlockEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.Buffer
        public Buffer sType$Default() {
            return sType(1000138002);
        }

        @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkWriteDescriptorSetInlineUniformBlockEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock.Buffer
        public Buffer pData(@NativeType("void const *") ByteBuffer value) {
            VkWriteDescriptorSetInlineUniformBlockEXT.npData(address(), value);
            return this;
        }
    }
}
