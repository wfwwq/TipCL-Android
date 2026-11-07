package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntry.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntry.class */
public class VkDescriptorUpdateTemplateEntry extends Struct<VkDescriptorUpdateTemplateEntry> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DSTBINDING;
    public static final int DSTARRAYELEMENT;
    public static final int DESCRIPTORCOUNT;
    public static final int DESCRIPTORTYPE;
    public static final int OFFSET;
    public static final int STRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DSTBINDING = layout.offsetof(0);
        DSTARRAYELEMENT = layout.offsetof(1);
        DESCRIPTORCOUNT = layout.offsetof(2);
        DESCRIPTORTYPE = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        STRIDE = layout.offsetof(5);
    }

    protected VkDescriptorUpdateTemplateEntry(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorUpdateTemplateEntry create(long address, ByteBuffer container) {
        return new VkDescriptorUpdateTemplateEntry(address, container);
    }

    public VkDescriptorUpdateTemplateEntry(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int dstBinding() {
        return ndstBinding(address());
    }

    @NativeType("uint32_t")
    public int dstArrayElement() {
        return ndstArrayElement(address());
    }

    @NativeType("uint32_t")
    public int descriptorCount() {
        return ndescriptorCount(address());
    }

    @NativeType("VkDescriptorType")
    public int descriptorType() {
        return ndescriptorType(address());
    }

    @NativeType("size_t")
    public long offset() {
        return noffset(address());
    }

    @NativeType("size_t")
    public long stride() {
        return nstride(address());
    }

    public VkDescriptorUpdateTemplateEntry dstBinding(@NativeType("uint32_t") int value) {
        ndstBinding(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateEntry dstArrayElement(@NativeType("uint32_t") int value) {
        ndstArrayElement(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateEntry descriptorCount(@NativeType("uint32_t") int value) {
        ndescriptorCount(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateEntry descriptorType(@NativeType("VkDescriptorType") int value) {
        ndescriptorType(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateEntry offset(@NativeType("size_t") long value) {
        noffset(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateEntry stride(@NativeType("size_t") long value) {
        nstride(address(), value);
        return this;
    }

    public VkDescriptorUpdateTemplateEntry set(int dstBinding, int dstArrayElement, int descriptorCount, int descriptorType, long offset, long stride) {
        dstBinding(dstBinding);
        dstArrayElement(dstArrayElement);
        descriptorCount(descriptorCount);
        descriptorType(descriptorType);
        offset(offset);
        stride(stride);
        return this;
    }

    public VkDescriptorUpdateTemplateEntry set(VkDescriptorUpdateTemplateEntry src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorUpdateTemplateEntry malloc() {
        return new VkDescriptorUpdateTemplateEntry(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateEntry calloc() {
        return new VkDescriptorUpdateTemplateEntry(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorUpdateTemplateEntry(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorUpdateTemplateEntry create(long address) {
        return new VkDescriptorUpdateTemplateEntry(address, null);
    }

    public static VkDescriptorUpdateTemplateEntry createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorUpdateTemplateEntry(address, null);
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

    public static VkDescriptorUpdateTemplateEntry malloc(MemoryStack stack) {
        return new VkDescriptorUpdateTemplateEntry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateEntry calloc(MemoryStack stack) {
        return new VkDescriptorUpdateTemplateEntry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ndstBinding(long struct) {
        return MemoryUtil.memGetInt(struct + DSTBINDING);
    }

    public static int ndstArrayElement(long struct) {
        return MemoryUtil.memGetInt(struct + DSTARRAYELEMENT);
    }

    public static int ndescriptorCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORCOUNT);
    }

    public static int ndescriptorType(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORTYPE);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetAddress(struct + OFFSET);
    }

    public static long nstride(long struct) {
        return MemoryUtil.memGetAddress(struct + STRIDE);
    }

    public static void ndstBinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTBINDING, value);
    }

    public static void ndstArrayElement(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTARRAYELEMENT, value);
    }

    public static void ndescriptorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORCOUNT, value);
    }

    public static void ndescriptorType(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORTYPE, value);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutAddress(struct + OFFSET, value);
    }

    public static void nstride(long struct, long value) {
        MemoryUtil.memPutAddress(struct + STRIDE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntry$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntry$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorUpdateTemplateEntry, Buffer> implements NativeResource {
        private static final VkDescriptorUpdateTemplateEntry ELEMENT_FACTORY = VkDescriptorUpdateTemplateEntry.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorUpdateTemplateEntry.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkDescriptorUpdateTemplateEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int dstBinding() {
            return VkDescriptorUpdateTemplateEntry.ndstBinding(address());
        }

        @NativeType("uint32_t")
        public int dstArrayElement() {
            return VkDescriptorUpdateTemplateEntry.ndstArrayElement(address());
        }

        @NativeType("uint32_t")
        public int descriptorCount() {
            return VkDescriptorUpdateTemplateEntry.ndescriptorCount(address());
        }

        @NativeType("VkDescriptorType")
        public int descriptorType() {
            return VkDescriptorUpdateTemplateEntry.ndescriptorType(address());
        }

        @NativeType("size_t")
        public long offset() {
            return VkDescriptorUpdateTemplateEntry.noffset(address());
        }

        @NativeType("size_t")
        public long stride() {
            return VkDescriptorUpdateTemplateEntry.nstride(address());
        }

        public Buffer dstBinding(@NativeType("uint32_t") int value) {
            VkDescriptorUpdateTemplateEntry.ndstBinding(address(), value);
            return this;
        }

        public Buffer dstArrayElement(@NativeType("uint32_t") int value) {
            VkDescriptorUpdateTemplateEntry.ndstArrayElement(address(), value);
            return this;
        }

        public Buffer descriptorCount(@NativeType("uint32_t") int value) {
            VkDescriptorUpdateTemplateEntry.ndescriptorCount(address(), value);
            return this;
        }

        public Buffer descriptorType(@NativeType("VkDescriptorType") int value) {
            VkDescriptorUpdateTemplateEntry.ndescriptorType(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("size_t") long value) {
            VkDescriptorUpdateTemplateEntry.noffset(address(), value);
            return this;
        }

        public Buffer stride(@NativeType("size_t") long value) {
            VkDescriptorUpdateTemplateEntry.nstride(address(), value);
            return this;
        }
    }
}
