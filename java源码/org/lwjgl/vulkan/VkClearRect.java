package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearRect.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearRect.class */
public class VkClearRect extends Struct<VkClearRect> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RECT;
    public static final int BASEARRAYLAYER;
    public static final int LAYERCOUNT;

    static {
        Struct.Layout layout = __struct(__member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RECT = layout.offsetof(0);
        BASEARRAYLAYER = layout.offsetof(1);
        LAYERCOUNT = layout.offsetof(2);
    }

    protected VkClearRect(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClearRect create(long address, ByteBuffer container) {
        return new VkClearRect(address, container);
    }

    public VkClearRect(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkRect2D rect() {
        return nrect(address());
    }

    @NativeType("uint32_t")
    public int baseArrayLayer() {
        return nbaseArrayLayer(address());
    }

    @NativeType("uint32_t")
    public int layerCount() {
        return nlayerCount(address());
    }

    public VkClearRect rect(VkRect2D value) {
        nrect(address(), value);
        return this;
    }

    public VkClearRect rect(Consumer<VkRect2D> consumer) {
        consumer.accept(rect());
        return this;
    }

    public VkClearRect baseArrayLayer(@NativeType("uint32_t") int value) {
        nbaseArrayLayer(address(), value);
        return this;
    }

    public VkClearRect layerCount(@NativeType("uint32_t") int value) {
        nlayerCount(address(), value);
        return this;
    }

    public VkClearRect set(VkRect2D rect, int baseArrayLayer, int layerCount) {
        rect(rect);
        baseArrayLayer(baseArrayLayer);
        layerCount(layerCount);
        return this;
    }

    public VkClearRect set(VkClearRect src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClearRect malloc() {
        return new VkClearRect(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClearRect calloc() {
        return new VkClearRect(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClearRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClearRect(MemoryUtil.memAddress(container), container);
    }

    public static VkClearRect create(long address) {
        return new VkClearRect(address, null);
    }

    public static VkClearRect createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClearRect(address, null);
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

    public static VkClearRect malloc(MemoryStack stack) {
        return new VkClearRect(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClearRect calloc(MemoryStack stack) {
        return new VkClearRect(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkRect2D nrect(long struct) {
        return VkRect2D.create(struct + RECT);
    }

    public static int nbaseArrayLayer(long struct) {
        return MemoryUtil.memGetInt(struct + BASEARRAYLAYER);
    }

    public static int nlayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + LAYERCOUNT);
    }

    public static void nrect(long struct, VkRect2D value) {
        MemoryUtil.memCopy(value.address(), struct + RECT, VkRect2D.SIZEOF);
    }

    public static void nbaseArrayLayer(long struct, int value) {
        MemoryUtil.memPutInt(struct + BASEARRAYLAYER, value);
    }

    public static void nlayerCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYERCOUNT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearRect$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearRect$Buffer.class */
    public static class Buffer extends StructBuffer<VkClearRect, Buffer> implements NativeResource {
        private static final VkClearRect ELEMENT_FACTORY = VkClearRect.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClearRect.SIZEOF);
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
        public VkClearRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkRect2D rect() {
            return VkClearRect.nrect(address());
        }

        @NativeType("uint32_t")
        public int baseArrayLayer() {
            return VkClearRect.nbaseArrayLayer(address());
        }

        @NativeType("uint32_t")
        public int layerCount() {
            return VkClearRect.nlayerCount(address());
        }

        public Buffer rect(VkRect2D value) {
            VkClearRect.nrect(address(), value);
            return this;
        }

        public Buffer rect(Consumer<VkRect2D> consumer) {
            consumer.accept(rect());
            return this;
        }

        public Buffer baseArrayLayer(@NativeType("uint32_t") int value) {
            VkClearRect.nbaseArrayLayer(address(), value);
            return this;
        }

        public Buffer layerCount(@NativeType("uint32_t") int value) {
            VkClearRect.nlayerCount(address(), value);
            return this;
        }
    }
}
