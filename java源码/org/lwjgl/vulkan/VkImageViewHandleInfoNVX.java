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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewHandleInfoNVX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewHandleInfoNVX.class */
public class VkImageViewHandleInfoNVX extends Struct<VkImageViewHandleInfoNVX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGEVIEW;
    public static final int DESCRIPTORTYPE;
    public static final int SAMPLER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEVIEW = layout.offsetof(2);
        DESCRIPTORTYPE = layout.offsetof(3);
        SAMPLER = layout.offsetof(4);
    }

    protected VkImageViewHandleInfoNVX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageViewHandleInfoNVX create(long address, ByteBuffer container) {
        return new VkImageViewHandleInfoNVX(address, container);
    }

    public VkImageViewHandleInfoNVX(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkImageView")
    public long imageView() {
        return nimageView(address());
    }

    @NativeType("VkDescriptorType")
    public int descriptorType() {
        return ndescriptorType(address());
    }

    @NativeType("VkSampler")
    public long sampler() {
        return nsampler(address());
    }

    public VkImageViewHandleInfoNVX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageViewHandleInfoNVX sType$Default() {
        return sType(NVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX);
    }

    public VkImageViewHandleInfoNVX pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageViewHandleInfoNVX imageView(@NativeType("VkImageView") long value) {
        nimageView(address(), value);
        return this;
    }

    public VkImageViewHandleInfoNVX descriptorType(@NativeType("VkDescriptorType") int value) {
        ndescriptorType(address(), value);
        return this;
    }

    public VkImageViewHandleInfoNVX sampler(@NativeType("VkSampler") long value) {
        nsampler(address(), value);
        return this;
    }

    public VkImageViewHandleInfoNVX set(int sType, long pNext, long imageView, int descriptorType, long sampler) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);
        descriptorType(descriptorType);
        sampler(sampler);
        return this;
    }

    public VkImageViewHandleInfoNVX set(VkImageViewHandleInfoNVX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageViewHandleInfoNVX malloc() {
        return new VkImageViewHandleInfoNVX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageViewHandleInfoNVX calloc() {
        return new VkImageViewHandleInfoNVX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageViewHandleInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewHandleInfoNVX(MemoryUtil.memAddress(container), container);
    }

    public static VkImageViewHandleInfoNVX create(long address) {
        return new VkImageViewHandleInfoNVX(address, null);
    }

    public static VkImageViewHandleInfoNVX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageViewHandleInfoNVX(address, null);
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

    public static VkImageViewHandleInfoNVX malloc(MemoryStack stack) {
        return new VkImageViewHandleInfoNVX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageViewHandleInfoNVX calloc(MemoryStack stack) {
        return new VkImageViewHandleInfoNVX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static long nimageView(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGEVIEW);
    }

    public static int ndescriptorType(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORTYPE);
    }

    public static long nsampler(long struct) {
        return MemoryUtil.memGetLong(struct + SAMPLER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimageView(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGEVIEW, value);
    }

    public static void ndescriptorType(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORTYPE, value);
    }

    public static void nsampler(long struct, long value) {
        MemoryUtil.memPutLong(struct + SAMPLER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewHandleInfoNVX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewHandleInfoNVX$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageViewHandleInfoNVX, Buffer> implements NativeResource {
        private static final VkImageViewHandleInfoNVX ELEMENT_FACTORY = VkImageViewHandleInfoNVX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageViewHandleInfoNVX.SIZEOF);
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
        public VkImageViewHandleInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageViewHandleInfoNVX.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageViewHandleInfoNVX.npNext(address());
        }

        @NativeType("VkImageView")
        public long imageView() {
            return VkImageViewHandleInfoNVX.nimageView(address());
        }

        @NativeType("VkDescriptorType")
        public int descriptorType() {
            return VkImageViewHandleInfoNVX.ndescriptorType(address());
        }

        @NativeType("VkSampler")
        public long sampler() {
            return VkImageViewHandleInfoNVX.nsampler(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageViewHandleInfoNVX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageViewHandleInfoNVX.npNext(address(), value);
            return this;
        }

        public Buffer imageView(@NativeType("VkImageView") long value) {
            VkImageViewHandleInfoNVX.nimageView(address(), value);
            return this;
        }

        public Buffer descriptorType(@NativeType("VkDescriptorType") int value) {
            VkImageViewHandleInfoNVX.ndescriptorType(address(), value);
            return this;
        }

        public Buffer sampler(@NativeType("VkSampler") long value) {
            VkImageViewHandleInfoNVX.nsampler(address(), value);
            return this;
        }
    }
}
