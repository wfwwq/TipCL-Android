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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresourceLayers.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresourceLayers.class */
public class VkImageSubresourceLayers extends Struct<VkImageSubresourceLayers> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ASPECTMASK;
    public static final int MIPLEVEL;
    public static final int BASEARRAYLAYER;
    public static final int LAYERCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ASPECTMASK = layout.offsetof(0);
        MIPLEVEL = layout.offsetof(1);
        BASEARRAYLAYER = layout.offsetof(2);
        LAYERCOUNT = layout.offsetof(3);
    }

    protected VkImageSubresourceLayers(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageSubresourceLayers create(long address, ByteBuffer container) {
        return new VkImageSubresourceLayers(address, container);
    }

    public VkImageSubresourceLayers(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkImageAspectFlags")
    public int aspectMask() {
        return naspectMask(address());
    }

    @NativeType("uint32_t")
    public int mipLevel() {
        return nmipLevel(address());
    }

    @NativeType("uint32_t")
    public int baseArrayLayer() {
        return nbaseArrayLayer(address());
    }

    @NativeType("uint32_t")
    public int layerCount() {
        return nlayerCount(address());
    }

    public VkImageSubresourceLayers aspectMask(@NativeType("VkImageAspectFlags") int value) {
        naspectMask(address(), value);
        return this;
    }

    public VkImageSubresourceLayers mipLevel(@NativeType("uint32_t") int value) {
        nmipLevel(address(), value);
        return this;
    }

    public VkImageSubresourceLayers baseArrayLayer(@NativeType("uint32_t") int value) {
        nbaseArrayLayer(address(), value);
        return this;
    }

    public VkImageSubresourceLayers layerCount(@NativeType("uint32_t") int value) {
        nlayerCount(address(), value);
        return this;
    }

    public VkImageSubresourceLayers set(int aspectMask, int mipLevel, int baseArrayLayer, int layerCount) {
        aspectMask(aspectMask);
        mipLevel(mipLevel);
        baseArrayLayer(baseArrayLayer);
        layerCount(layerCount);
        return this;
    }

    public VkImageSubresourceLayers set(VkImageSubresourceLayers src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageSubresourceLayers malloc() {
        return new VkImageSubresourceLayers(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageSubresourceLayers calloc() {
        return new VkImageSubresourceLayers(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageSubresourceLayers create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageSubresourceLayers(MemoryUtil.memAddress(container), container);
    }

    public static VkImageSubresourceLayers create(long address) {
        return new VkImageSubresourceLayers(address, null);
    }

    public static VkImageSubresourceLayers createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageSubresourceLayers(address, null);
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

    public static VkImageSubresourceLayers malloc(MemoryStack stack) {
        return new VkImageSubresourceLayers(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageSubresourceLayers calloc(MemoryStack stack) {
        return new VkImageSubresourceLayers(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int naspectMask(long struct) {
        return MemoryUtil.memGetInt(struct + ASPECTMASK);
    }

    public static int nmipLevel(long struct) {
        return MemoryUtil.memGetInt(struct + MIPLEVEL);
    }

    public static int nbaseArrayLayer(long struct) {
        return MemoryUtil.memGetInt(struct + BASEARRAYLAYER);
    }

    public static int nlayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + LAYERCOUNT);
    }

    public static void naspectMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + ASPECTMASK, value);
    }

    public static void nmipLevel(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIPLEVEL, value);
    }

    public static void nbaseArrayLayer(long struct, int value) {
        MemoryUtil.memPutInt(struct + BASEARRAYLAYER, value);
    }

    public static void nlayerCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYERCOUNT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresourceLayers$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresourceLayers$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageSubresourceLayers, Buffer> implements NativeResource {
        private static final VkImageSubresourceLayers ELEMENT_FACTORY = VkImageSubresourceLayers.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageSubresourceLayers.SIZEOF);
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
        public VkImageSubresourceLayers getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkImageAspectFlags")
        public int aspectMask() {
            return VkImageSubresourceLayers.naspectMask(address());
        }

        @NativeType("uint32_t")
        public int mipLevel() {
            return VkImageSubresourceLayers.nmipLevel(address());
        }

        @NativeType("uint32_t")
        public int baseArrayLayer() {
            return VkImageSubresourceLayers.nbaseArrayLayer(address());
        }

        @NativeType("uint32_t")
        public int layerCount() {
            return VkImageSubresourceLayers.nlayerCount(address());
        }

        public Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) {
            VkImageSubresourceLayers.naspectMask(address(), value);
            return this;
        }

        public Buffer mipLevel(@NativeType("uint32_t") int value) {
            VkImageSubresourceLayers.nmipLevel(address(), value);
            return this;
        }

        public Buffer baseArrayLayer(@NativeType("uint32_t") int value) {
            VkImageSubresourceLayers.nbaseArrayLayer(address(), value);
            return this;
        }

        public Buffer layerCount(@NativeType("uint32_t") int value) {
            VkImageSubresourceLayers.nlayerCount(address(), value);
            return this;
        }
    }
}
