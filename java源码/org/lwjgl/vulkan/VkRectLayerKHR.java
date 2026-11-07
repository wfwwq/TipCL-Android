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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRectLayerKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRectLayerKHR.class */
public class VkRectLayerKHR extends Struct<VkRectLayerKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OFFSET;
    public static final int EXTENT;
    public static final int LAYER;

    static {
        Struct.Layout layout = __struct(__member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET = layout.offsetof(0);
        EXTENT = layout.offsetof(1);
        LAYER = layout.offsetof(2);
    }

    protected VkRectLayerKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRectLayerKHR create(long address, ByteBuffer container) {
        return new VkRectLayerKHR(address, container);
    }

    public VkRectLayerKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkOffset2D offset() {
        return noffset(address());
    }

    public VkExtent2D extent() {
        return nextent(address());
    }

    @NativeType("uint32_t")
    public int layer() {
        return nlayer(address());
    }

    public VkRectLayerKHR offset(VkOffset2D value) {
        noffset(address(), value);
        return this;
    }

    public VkRectLayerKHR offset(Consumer<VkOffset2D> consumer) {
        consumer.accept(offset());
        return this;
    }

    public VkRectLayerKHR extent(VkExtent2D value) {
        nextent(address(), value);
        return this;
    }

    public VkRectLayerKHR extent(Consumer<VkExtent2D> consumer) {
        consumer.accept(extent());
        return this;
    }

    public VkRectLayerKHR layer(@NativeType("uint32_t") int value) {
        nlayer(address(), value);
        return this;
    }

    public VkRectLayerKHR set(VkOffset2D offset, VkExtent2D extent, int layer) {
        offset(offset);
        extent(extent);
        layer(layer);
        return this;
    }

    public VkRectLayerKHR set(VkRectLayerKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRectLayerKHR malloc() {
        return new VkRectLayerKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRectLayerKHR calloc() {
        return new VkRectLayerKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRectLayerKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRectLayerKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRectLayerKHR create(long address) {
        return new VkRectLayerKHR(address, null);
    }

    public static VkRectLayerKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRectLayerKHR(address, null);
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

    public static VkRectLayerKHR malloc(MemoryStack stack) {
        return new VkRectLayerKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRectLayerKHR calloc(MemoryStack stack) {
        return new VkRectLayerKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkOffset2D noffset(long struct) {
        return VkOffset2D.create(struct + OFFSET);
    }

    public static VkExtent2D nextent(long struct) {
        return VkExtent2D.create(struct + EXTENT);
    }

    public static int nlayer(long struct) {
        return MemoryUtil.memGetInt(struct + LAYER);
    }

    public static void noffset(long struct, VkOffset2D value) {
        MemoryUtil.memCopy(value.address(), struct + OFFSET, VkOffset2D.SIZEOF);
    }

    public static void nextent(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + EXTENT, VkExtent2D.SIZEOF);
    }

    public static void nlayer(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRectLayerKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRectLayerKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkRectLayerKHR, Buffer> implements NativeResource {
        private static final VkRectLayerKHR ELEMENT_FACTORY = VkRectLayerKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRectLayerKHR.SIZEOF);
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
        public VkRectLayerKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkOffset2D offset() {
            return VkRectLayerKHR.noffset(address());
        }

        public VkExtent2D extent() {
            return VkRectLayerKHR.nextent(address());
        }

        @NativeType("uint32_t")
        public int layer() {
            return VkRectLayerKHR.nlayer(address());
        }

        public Buffer offset(VkOffset2D value) {
            VkRectLayerKHR.noffset(address(), value);
            return this;
        }

        public Buffer offset(Consumer<VkOffset2D> consumer) {
            consumer.accept(offset());
            return this;
        }

        public Buffer extent(VkExtent2D value) {
            VkRectLayerKHR.nextent(address(), value);
            return this;
        }

        public Buffer extent(Consumer<VkExtent2D> consumer) {
            consumer.accept(extent());
            return this;
        }

        public Buffer layer(@NativeType("uint32_t") int value) {
            VkRectLayerKHR.nlayer(address(), value);
            return this;
        }
    }
}
