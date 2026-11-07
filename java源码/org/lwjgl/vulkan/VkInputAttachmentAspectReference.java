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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInputAttachmentAspectReference.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInputAttachmentAspectReference.class */
public class VkInputAttachmentAspectReference extends Struct<VkInputAttachmentAspectReference> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SUBPASS;
    public static final int INPUTATTACHMENTINDEX;
    public static final int ASPECTMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SUBPASS = layout.offsetof(0);
        INPUTATTACHMENTINDEX = layout.offsetof(1);
        ASPECTMASK = layout.offsetof(2);
    }

    protected VkInputAttachmentAspectReference(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkInputAttachmentAspectReference create(long address, ByteBuffer container) {
        return new VkInputAttachmentAspectReference(address, container);
    }

    public VkInputAttachmentAspectReference(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int subpass() {
        return nsubpass(address());
    }

    @NativeType("uint32_t")
    public int inputAttachmentIndex() {
        return ninputAttachmentIndex(address());
    }

    @NativeType("VkImageAspectFlags")
    public int aspectMask() {
        return naspectMask(address());
    }

    public VkInputAttachmentAspectReference subpass(@NativeType("uint32_t") int value) {
        nsubpass(address(), value);
        return this;
    }

    public VkInputAttachmentAspectReference inputAttachmentIndex(@NativeType("uint32_t") int value) {
        ninputAttachmentIndex(address(), value);
        return this;
    }

    public VkInputAttachmentAspectReference aspectMask(@NativeType("VkImageAspectFlags") int value) {
        naspectMask(address(), value);
        return this;
    }

    public VkInputAttachmentAspectReference set(int subpass, int inputAttachmentIndex, int aspectMask) {
        subpass(subpass);
        inputAttachmentIndex(inputAttachmentIndex);
        aspectMask(aspectMask);
        return this;
    }

    public VkInputAttachmentAspectReference set(VkInputAttachmentAspectReference src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkInputAttachmentAspectReference malloc() {
        return new VkInputAttachmentAspectReference(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkInputAttachmentAspectReference calloc() {
        return new VkInputAttachmentAspectReference(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkInputAttachmentAspectReference create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkInputAttachmentAspectReference(MemoryUtil.memAddress(container), container);
    }

    public static VkInputAttachmentAspectReference create(long address) {
        return new VkInputAttachmentAspectReference(address, null);
    }

    public static VkInputAttachmentAspectReference createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkInputAttachmentAspectReference(address, null);
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

    public static VkInputAttachmentAspectReference malloc(MemoryStack stack) {
        return new VkInputAttachmentAspectReference(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkInputAttachmentAspectReference calloc(MemoryStack stack) {
        return new VkInputAttachmentAspectReference(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsubpass(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPASS);
    }

    public static int ninputAttachmentIndex(long struct) {
        return MemoryUtil.memGetInt(struct + INPUTATTACHMENTINDEX);
    }

    public static int naspectMask(long struct) {
        return MemoryUtil.memGetInt(struct + ASPECTMASK);
    }

    public static void nsubpass(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBPASS, value);
    }

    public static void ninputAttachmentIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUTATTACHMENTINDEX, value);
    }

    public static void naspectMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + ASPECTMASK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInputAttachmentAspectReference$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInputAttachmentAspectReference$Buffer.class */
    public static class Buffer extends StructBuffer<VkInputAttachmentAspectReference, Buffer> implements NativeResource {
        private static final VkInputAttachmentAspectReference ELEMENT_FACTORY = VkInputAttachmentAspectReference.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkInputAttachmentAspectReference.SIZEOF);
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
        public VkInputAttachmentAspectReference getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int subpass() {
            return VkInputAttachmentAspectReference.nsubpass(address());
        }

        @NativeType("uint32_t")
        public int inputAttachmentIndex() {
            return VkInputAttachmentAspectReference.ninputAttachmentIndex(address());
        }

        @NativeType("VkImageAspectFlags")
        public int aspectMask() {
            return VkInputAttachmentAspectReference.naspectMask(address());
        }

        public Buffer subpass(@NativeType("uint32_t") int value) {
            VkInputAttachmentAspectReference.nsubpass(address(), value);
            return this;
        }

        public Buffer inputAttachmentIndex(@NativeType("uint32_t") int value) {
            VkInputAttachmentAspectReference.ninputAttachmentIndex(address(), value);
            return this;
        }

        public Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) {
            VkInputAttachmentAspectReference.naspectMask(address(), value);
            return this;
        }
    }
}
