package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRect2D.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRect2D.class */
public class VkRect2D extends Struct<VkRect2D> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OFFSET;
    public static final int EXTENT;

    static {
        Struct.Layout layout = __struct(__member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET = layout.offsetof(0);
        EXTENT = layout.offsetof(1);
    }

    protected VkRect2D(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRect2D create(long address, ByteBuffer container) {
        return new VkRect2D(address, container);
    }

    public VkRect2D(ByteBuffer container) {
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

    public VkRect2D offset(VkOffset2D value) {
        noffset(address(), value);
        return this;
    }

    public VkRect2D offset(Consumer<VkOffset2D> consumer) {
        consumer.accept(offset());
        return this;
    }

    public VkRect2D extent(VkExtent2D value) {
        nextent(address(), value);
        return this;
    }

    public VkRect2D extent(Consumer<VkExtent2D> consumer) {
        consumer.accept(extent());
        return this;
    }

    public VkRect2D set(VkOffset2D offset, VkExtent2D extent) {
        offset(offset);
        extent(extent);
        return this;
    }

    public VkRect2D set(VkRect2D src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRect2D malloc() {
        return new VkRect2D(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRect2D calloc() {
        return new VkRect2D(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRect2D create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRect2D(MemoryUtil.memAddress(container), container);
    }

    public static VkRect2D create(long address) {
        return new VkRect2D(address, null);
    }

    public static VkRect2D createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRect2D(address, null);
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

    public static VkRect2D malloc(MemoryStack stack) {
        return new VkRect2D(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRect2D calloc(MemoryStack stack) {
        return new VkRect2D(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void noffset(long struct, VkOffset2D value) {
        MemoryUtil.memCopy(value.address(), struct + OFFSET, VkOffset2D.SIZEOF);
    }

    public static void nextent(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + EXTENT, VkExtent2D.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRect2D$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRect2D$Buffer.class */
    public static class Buffer extends StructBuffer<VkRect2D, Buffer> implements NativeResource {
        private static final VkRect2D ELEMENT_FACTORY = VkRect2D.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRect2D.SIZEOF);
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
        public VkRect2D getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkOffset2D offset() {
            return VkRect2D.noffset(address());
        }

        public VkExtent2D extent() {
            return VkRect2D.nextent(address());
        }

        public Buffer offset(VkOffset2D value) {
            VkRect2D.noffset(address(), value);
            return this;
        }

        public Buffer offset(Consumer<VkOffset2D> consumer) {
            consumer.accept(offset());
            return this;
        }

        public Buffer extent(VkExtent2D value) {
            VkRect2D.nextent(address(), value);
            return this;
        }

        public Buffer extent(Consumer<VkExtent2D> consumer) {
            consumer.accept(extent());
            return this;
        }
    }
}
