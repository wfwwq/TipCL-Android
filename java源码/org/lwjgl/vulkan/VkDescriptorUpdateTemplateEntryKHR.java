package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntryKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntryKHR.class */
public class VkDescriptorUpdateTemplateEntryKHR extends VkDescriptorUpdateTemplateEntry {
    protected VkDescriptorUpdateTemplateEntryKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry, org.lwjgl.system.Struct
    public VkDescriptorUpdateTemplateEntryKHR create(long address, ByteBuffer container) {
        return new VkDescriptorUpdateTemplateEntryKHR(address, container);
    }

    public VkDescriptorUpdateTemplateEntryKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public VkDescriptorUpdateTemplateEntryKHR dstBinding(@NativeType("uint32_t") int value) {
        ndstBinding(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public VkDescriptorUpdateTemplateEntryKHR dstArrayElement(@NativeType("uint32_t") int value) {
        ndstArrayElement(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public VkDescriptorUpdateTemplateEntryKHR descriptorCount(@NativeType("uint32_t") int value) {
        ndescriptorCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public VkDescriptorUpdateTemplateEntryKHR descriptorType(@NativeType("VkDescriptorType") int value) {
        ndescriptorType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public VkDescriptorUpdateTemplateEntryKHR offset(@NativeType("size_t") long value) {
        noffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public VkDescriptorUpdateTemplateEntryKHR stride(@NativeType("size_t") long value) {
        nstride(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public VkDescriptorUpdateTemplateEntryKHR set(int dstBinding, int dstArrayElement, int descriptorCount, int descriptorType, long offset, long stride) {
        dstBinding(dstBinding);
        dstArrayElement(dstArrayElement);
        descriptorCount(descriptorCount);
        descriptorType(descriptorType);
        offset(offset);
        stride(stride);
        return this;
    }

    public VkDescriptorUpdateTemplateEntryKHR set(VkDescriptorUpdateTemplateEntryKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorUpdateTemplateEntryKHR malloc() {
        return new VkDescriptorUpdateTemplateEntryKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateEntryKHR calloc() {
        return new VkDescriptorUpdateTemplateEntryKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateEntryKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorUpdateTemplateEntryKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorUpdateTemplateEntryKHR create(long address) {
        return new VkDescriptorUpdateTemplateEntryKHR(address, null);
    }

    public static VkDescriptorUpdateTemplateEntryKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorUpdateTemplateEntryKHR(address, null);
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

    public static VkDescriptorUpdateTemplateEntryKHR malloc(MemoryStack stack) {
        return new VkDescriptorUpdateTemplateEntryKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateEntryKHR calloc(MemoryStack stack) {
        return new VkDescriptorUpdateTemplateEntryKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntryKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntryKHR$Buffer.class */
    public static class Buffer extends VkDescriptorUpdateTemplateEntry.Buffer {
        private static final VkDescriptorUpdateTemplateEntryKHR ELEMENT_FACTORY = VkDescriptorUpdateTemplateEntryKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer, org.lwjgl.system.StructBuffer
        public VkDescriptorUpdateTemplateEntryKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public Buffer dstBinding(@NativeType("uint32_t") int value) {
            VkDescriptorUpdateTemplateEntryKHR.ndstBinding(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public Buffer dstArrayElement(@NativeType("uint32_t") int value) {
            VkDescriptorUpdateTemplateEntryKHR.ndstArrayElement(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public Buffer descriptorCount(@NativeType("uint32_t") int value) {
            VkDescriptorUpdateTemplateEntryKHR.ndescriptorCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public Buffer descriptorType(@NativeType("VkDescriptorType") int value) {
            VkDescriptorUpdateTemplateEntryKHR.ndescriptorType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public Buffer offset(@NativeType("size_t") long value) {
            VkDescriptorUpdateTemplateEntryKHR.noffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public Buffer stride(@NativeType("size_t") long value) {
            VkDescriptorUpdateTemplateEntryKHR.nstride(address(), value);
            return this;
        }
    }
}
