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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference.class */
public class VkAttachmentReference extends Struct<VkAttachmentReference> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ATTACHMENT;
    public static final int LAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ATTACHMENT = layout.offsetof(0);
        LAYOUT = layout.offsetof(1);
    }

    protected VkAttachmentReference(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAttachmentReference create(long address, ByteBuffer container) {
        return new VkAttachmentReference(address, container);
    }

    public VkAttachmentReference(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int attachment() {
        return nattachment(address());
    }

    @NativeType("VkImageLayout")
    public int layout() {
        return nlayout(address());
    }

    public VkAttachmentReference attachment(@NativeType("uint32_t") int value) {
        nattachment(address(), value);
        return this;
    }

    public VkAttachmentReference layout(@NativeType("VkImageLayout") int value) {
        nlayout(address(), value);
        return this;
    }

    public VkAttachmentReference set(int attachment, int layout) {
        attachment(attachment);
        layout(layout);
        return this;
    }

    public VkAttachmentReference set(VkAttachmentReference src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentReference malloc() {
        return new VkAttachmentReference(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentReference calloc() {
        return new VkAttachmentReference(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentReference create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentReference(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentReference create(long address) {
        return new VkAttachmentReference(address, null);
    }

    public static VkAttachmentReference createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentReference(address, null);
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

    public static VkAttachmentReference malloc(MemoryStack stack) {
        return new VkAttachmentReference(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentReference calloc(MemoryStack stack) {
        return new VkAttachmentReference(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nattachment(long struct) {
        return MemoryUtil.memGetInt(struct + ATTACHMENT);
    }

    public static int nlayout(long struct) {
        return MemoryUtil.memGetInt(struct + LAYOUT);
    }

    public static void nattachment(long struct, int value) {
        MemoryUtil.memPutInt(struct + ATTACHMENT, value);
    }

    public static void nlayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYOUT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference$Buffer.class */
    public static class Buffer extends StructBuffer<VkAttachmentReference, Buffer> implements NativeResource {
        private static final VkAttachmentReference ELEMENT_FACTORY = VkAttachmentReference.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAttachmentReference.SIZEOF);
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
        public VkAttachmentReference getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int attachment() {
            return VkAttachmentReference.nattachment(address());
        }

        @NativeType("VkImageLayout")
        public int layout() {
            return VkAttachmentReference.nlayout(address());
        }

        public Buffer attachment(@NativeType("uint32_t") int value) {
            VkAttachmentReference.nattachment(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkImageLayout") int value) {
            VkAttachmentReference.nlayout(address(), value);
            return this;
        }
    }
}
