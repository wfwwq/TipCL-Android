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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresource.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresource.class */
public class VkImageSubresource extends Struct<VkImageSubresource> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ASPECTMASK;
    public static final int MIPLEVEL;
    public static final int ARRAYLAYER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ASPECTMASK = layout.offsetof(0);
        MIPLEVEL = layout.offsetof(1);
        ARRAYLAYER = layout.offsetof(2);
    }

    protected VkImageSubresource(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageSubresource create(long address, ByteBuffer container) {
        return new VkImageSubresource(address, container);
    }

    public VkImageSubresource(ByteBuffer container) {
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
    public int arrayLayer() {
        return narrayLayer(address());
    }

    public VkImageSubresource aspectMask(@NativeType("VkImageAspectFlags") int value) {
        naspectMask(address(), value);
        return this;
    }

    public VkImageSubresource mipLevel(@NativeType("uint32_t") int value) {
        nmipLevel(address(), value);
        return this;
    }

    public VkImageSubresource arrayLayer(@NativeType("uint32_t") int value) {
        narrayLayer(address(), value);
        return this;
    }

    public VkImageSubresource set(int aspectMask, int mipLevel, int arrayLayer) {
        aspectMask(aspectMask);
        mipLevel(mipLevel);
        arrayLayer(arrayLayer);
        return this;
    }

    public VkImageSubresource set(VkImageSubresource src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageSubresource malloc() {
        return new VkImageSubresource(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageSubresource calloc() {
        return new VkImageSubresource(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageSubresource create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageSubresource(MemoryUtil.memAddress(container), container);
    }

    public static VkImageSubresource create(long address) {
        return new VkImageSubresource(address, null);
    }

    public static VkImageSubresource createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageSubresource(address, null);
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

    public static VkImageSubresource malloc(MemoryStack stack) {
        return new VkImageSubresource(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageSubresource calloc(MemoryStack stack) {
        return new VkImageSubresource(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int narrayLayer(long struct) {
        return MemoryUtil.memGetInt(struct + ARRAYLAYER);
    }

    public static void naspectMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + ASPECTMASK, value);
    }

    public static void nmipLevel(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIPLEVEL, value);
    }

    public static void narrayLayer(long struct, int value) {
        MemoryUtil.memPutInt(struct + ARRAYLAYER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresource$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresource$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageSubresource, Buffer> implements NativeResource {
        private static final VkImageSubresource ELEMENT_FACTORY = VkImageSubresource.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageSubresource.SIZEOF);
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
        public VkImageSubresource getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkImageAspectFlags")
        public int aspectMask() {
            return VkImageSubresource.naspectMask(address());
        }

        @NativeType("uint32_t")
        public int mipLevel() {
            return VkImageSubresource.nmipLevel(address());
        }

        @NativeType("uint32_t")
        public int arrayLayer() {
            return VkImageSubresource.narrayLayer(address());
        }

        public Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) {
            VkImageSubresource.naspectMask(address(), value);
            return this;
        }

        public Buffer mipLevel(@NativeType("uint32_t") int value) {
            VkImageSubresource.nmipLevel(address(), value);
            return this;
        }

        public Buffer arrayLayer(@NativeType("uint32_t") int value) {
            VkImageSubresource.narrayLayer(address(), value);
            return this;
        }
    }
}
