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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorImageInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorImageInfo.class */
public class VkDescriptorImageInfo extends Struct<VkDescriptorImageInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SAMPLER;
    public static final int IMAGEVIEW;
    public static final int IMAGELAYOUT;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SAMPLER = layout.offsetof(0);
        IMAGEVIEW = layout.offsetof(1);
        IMAGELAYOUT = layout.offsetof(2);
    }

    protected VkDescriptorImageInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorImageInfo create(long address, ByteBuffer container) {
        return new VkDescriptorImageInfo(address, container);
    }

    public VkDescriptorImageInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkSampler")
    public long sampler() {
        return nsampler(address());
    }

    @NativeType("VkImageView")
    public long imageView() {
        return nimageView(address());
    }

    @NativeType("VkImageLayout")
    public int imageLayout() {
        return nimageLayout(address());
    }

    public VkDescriptorImageInfo sampler(@NativeType("VkSampler") long value) {
        nsampler(address(), value);
        return this;
    }

    public VkDescriptorImageInfo imageView(@NativeType("VkImageView") long value) {
        nimageView(address(), value);
        return this;
    }

    public VkDescriptorImageInfo imageLayout(@NativeType("VkImageLayout") int value) {
        nimageLayout(address(), value);
        return this;
    }

    public VkDescriptorImageInfo set(long sampler, long imageView, int imageLayout) {
        sampler(sampler);
        imageView(imageView);
        imageLayout(imageLayout);
        return this;
    }

    public VkDescriptorImageInfo set(VkDescriptorImageInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorImageInfo malloc() {
        return new VkDescriptorImageInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorImageInfo calloc() {
        return new VkDescriptorImageInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorImageInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorImageInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorImageInfo create(long address) {
        return new VkDescriptorImageInfo(address, null);
    }

    public static VkDescriptorImageInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(address, null);
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

    public static VkDescriptorImageInfo malloc(MemoryStack stack) {
        return new VkDescriptorImageInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorImageInfo calloc(MemoryStack stack) {
        return new VkDescriptorImageInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nsampler(long struct) {
        return MemoryUtil.memGetLong(struct + SAMPLER);
    }

    public static long nimageView(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGEVIEW);
    }

    public static int nimageLayout(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGELAYOUT);
    }

    public static void nsampler(long struct, long value) {
        MemoryUtil.memPutLong(struct + SAMPLER, value);
    }

    public static void nimageView(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGEVIEW, value);
    }

    public static void nimageLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGELAYOUT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorImageInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorImageInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorImageInfo, Buffer> implements NativeResource {
        private static final VkDescriptorImageInfo ELEMENT_FACTORY = VkDescriptorImageInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorImageInfo.SIZEOF);
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
        public VkDescriptorImageInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkSampler")
        public long sampler() {
            return VkDescriptorImageInfo.nsampler(address());
        }

        @NativeType("VkImageView")
        public long imageView() {
            return VkDescriptorImageInfo.nimageView(address());
        }

        @NativeType("VkImageLayout")
        public int imageLayout() {
            return VkDescriptorImageInfo.nimageLayout(address());
        }

        public Buffer sampler(@NativeType("VkSampler") long value) {
            VkDescriptorImageInfo.nsampler(address(), value);
            return this;
        }

        public Buffer imageView(@NativeType("VkImageView") long value) {
            VkDescriptorImageInfo.nimageView(address(), value);
            return this;
        }

        public Buffer imageLayout(@NativeType("VkImageLayout") int value) {
            VkDescriptorImageInfo.nimageLayout(address(), value);
            return this;
        }
    }
}
