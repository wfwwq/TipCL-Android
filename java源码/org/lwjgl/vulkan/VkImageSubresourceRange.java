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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresourceRange.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresourceRange.class */
public class VkImageSubresourceRange extends Struct<VkImageSubresourceRange> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ASPECTMASK;
    public static final int BASEMIPLEVEL;
    public static final int LEVELCOUNT;
    public static final int BASEARRAYLAYER;
    public static final int LAYERCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ASPECTMASK = layout.offsetof(0);
        BASEMIPLEVEL = layout.offsetof(1);
        LEVELCOUNT = layout.offsetof(2);
        BASEARRAYLAYER = layout.offsetof(3);
        LAYERCOUNT = layout.offsetof(4);
    }

    protected VkImageSubresourceRange(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageSubresourceRange create(long address, ByteBuffer container) {
        return new VkImageSubresourceRange(address, container);
    }

    public VkImageSubresourceRange(ByteBuffer container) {
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
    public int baseMipLevel() {
        return nbaseMipLevel(address());
    }

    @NativeType("uint32_t")
    public int levelCount() {
        return nlevelCount(address());
    }

    @NativeType("uint32_t")
    public int baseArrayLayer() {
        return nbaseArrayLayer(address());
    }

    @NativeType("uint32_t")
    public int layerCount() {
        return nlayerCount(address());
    }

    public VkImageSubresourceRange aspectMask(@NativeType("VkImageAspectFlags") int value) {
        naspectMask(address(), value);
        return this;
    }

    public VkImageSubresourceRange baseMipLevel(@NativeType("uint32_t") int value) {
        nbaseMipLevel(address(), value);
        return this;
    }

    public VkImageSubresourceRange levelCount(@NativeType("uint32_t") int value) {
        nlevelCount(address(), value);
        return this;
    }

    public VkImageSubresourceRange baseArrayLayer(@NativeType("uint32_t") int value) {
        nbaseArrayLayer(address(), value);
        return this;
    }

    public VkImageSubresourceRange layerCount(@NativeType("uint32_t") int value) {
        nlayerCount(address(), value);
        return this;
    }

    public VkImageSubresourceRange set(int aspectMask, int baseMipLevel, int levelCount, int baseArrayLayer, int layerCount) {
        aspectMask(aspectMask);
        baseMipLevel(baseMipLevel);
        levelCount(levelCount);
        baseArrayLayer(baseArrayLayer);
        layerCount(layerCount);
        return this;
    }

    public VkImageSubresourceRange set(VkImageSubresourceRange src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageSubresourceRange malloc() {
        return new VkImageSubresourceRange(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageSubresourceRange calloc() {
        return new VkImageSubresourceRange(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageSubresourceRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageSubresourceRange(MemoryUtil.memAddress(container), container);
    }

    public static VkImageSubresourceRange create(long address) {
        return new VkImageSubresourceRange(address, null);
    }

    public static VkImageSubresourceRange createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageSubresourceRange(address, null);
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

    public static VkImageSubresourceRange malloc(MemoryStack stack) {
        return new VkImageSubresourceRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageSubresourceRange calloc(MemoryStack stack) {
        return new VkImageSubresourceRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nbaseMipLevel(long struct) {
        return MemoryUtil.memGetInt(struct + BASEMIPLEVEL);
    }

    public static int nlevelCount(long struct) {
        return MemoryUtil.memGetInt(struct + LEVELCOUNT);
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

    public static void nbaseMipLevel(long struct, int value) {
        MemoryUtil.memPutInt(struct + BASEMIPLEVEL, value);
    }

    public static void nlevelCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEVELCOUNT, value);
    }

    public static void nbaseArrayLayer(long struct, int value) {
        MemoryUtil.memPutInt(struct + BASEARRAYLAYER, value);
    }

    public static void nlayerCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYERCOUNT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresourceRange$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresourceRange$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageSubresourceRange, Buffer> implements NativeResource {
        private static final VkImageSubresourceRange ELEMENT_FACTORY = VkImageSubresourceRange.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageSubresourceRange.SIZEOF);
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
        public VkImageSubresourceRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkImageAspectFlags")
        public int aspectMask() {
            return VkImageSubresourceRange.naspectMask(address());
        }

        @NativeType("uint32_t")
        public int baseMipLevel() {
            return VkImageSubresourceRange.nbaseMipLevel(address());
        }

        @NativeType("uint32_t")
        public int levelCount() {
            return VkImageSubresourceRange.nlevelCount(address());
        }

        @NativeType("uint32_t")
        public int baseArrayLayer() {
            return VkImageSubresourceRange.nbaseArrayLayer(address());
        }

        @NativeType("uint32_t")
        public int layerCount() {
            return VkImageSubresourceRange.nlayerCount(address());
        }

        public Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) {
            VkImageSubresourceRange.naspectMask(address(), value);
            return this;
        }

        public Buffer baseMipLevel(@NativeType("uint32_t") int value) {
            VkImageSubresourceRange.nbaseMipLevel(address(), value);
            return this;
        }

        public Buffer levelCount(@NativeType("uint32_t") int value) {
            VkImageSubresourceRange.nlevelCount(address(), value);
            return this;
        }

        public Buffer baseArrayLayer(@NativeType("uint32_t") int value) {
            VkImageSubresourceRange.nbaseArrayLayer(address(), value);
            return this;
        }

        public Buffer layerCount(@NativeType("uint32_t") int value) {
            VkImageSubresourceRange.nlayerCount(address(), value);
            return this;
        }
    }
}
