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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearValue.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearValue.class */
public class VkClearValue extends Struct<VkClearValue> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COLOR;
    public static final int DEPTHSTENCIL;

    static {
        Struct.Layout layout = __union(__member(VkClearColorValue.SIZEOF, VkClearColorValue.ALIGNOF), __member(VkClearDepthStencilValue.SIZEOF, VkClearDepthStencilValue.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COLOR = layout.offsetof(0);
        DEPTHSTENCIL = layout.offsetof(1);
    }

    protected VkClearValue(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClearValue create(long address, ByteBuffer container) {
        return new VkClearValue(address, container);
    }

    public VkClearValue(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkClearColorValue color() {
        return ncolor(address());
    }

    public VkClearDepthStencilValue depthStencil() {
        return ndepthStencil(address());
    }

    public VkClearValue color(VkClearColorValue value) {
        ncolor(address(), value);
        return this;
    }

    public VkClearValue color(Consumer<VkClearColorValue> consumer) {
        consumer.accept(color());
        return this;
    }

    public VkClearValue depthStencil(VkClearDepthStencilValue value) {
        ndepthStencil(address(), value);
        return this;
    }

    public VkClearValue depthStencil(Consumer<VkClearDepthStencilValue> consumer) {
        consumer.accept(depthStencil());
        return this;
    }

    public VkClearValue set(VkClearValue src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClearValue malloc() {
        return new VkClearValue(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClearValue calloc() {
        return new VkClearValue(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClearValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClearValue(MemoryUtil.memAddress(container), container);
    }

    public static VkClearValue create(long address) {
        return new VkClearValue(address, null);
    }

    public static VkClearValue createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClearValue(address, null);
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

    public static VkClearValue malloc(MemoryStack stack) {
        return new VkClearValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClearValue calloc(MemoryStack stack) {
        return new VkClearValue(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkClearColorValue ncolor(long struct) {
        return VkClearColorValue.create(struct + COLOR);
    }

    public static VkClearDepthStencilValue ndepthStencil(long struct) {
        return VkClearDepthStencilValue.create(struct + DEPTHSTENCIL);
    }

    public static void ncolor(long struct, VkClearColorValue value) {
        MemoryUtil.memCopy(value.address(), struct + COLOR, VkClearColorValue.SIZEOF);
    }

    public static void ndepthStencil(long struct, VkClearDepthStencilValue value) {
        MemoryUtil.memCopy(value.address(), struct + DEPTHSTENCIL, VkClearDepthStencilValue.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearValue$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearValue$Buffer.class */
    public static class Buffer extends StructBuffer<VkClearValue, Buffer> implements NativeResource {
        private static final VkClearValue ELEMENT_FACTORY = VkClearValue.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClearValue.SIZEOF);
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
        public VkClearValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkClearColorValue color() {
            return VkClearValue.ncolor(address());
        }

        public VkClearDepthStencilValue depthStencil() {
            return VkClearValue.ndepthStencil(address());
        }

        public Buffer color(VkClearColorValue value) {
            VkClearValue.ncolor(address(), value);
            return this;
        }

        public Buffer color(Consumer<VkClearColorValue> consumer) {
            consumer.accept(color());
            return this;
        }

        public Buffer depthStencil(VkClearDepthStencilValue value) {
            VkClearValue.ndepthStencil(address(), value);
            return this;
        }

        public Buffer depthStencil(Consumer<VkClearDepthStencilValue> consumer) {
            consumer.accept(depthStencil());
            return this;
        }
    }
}
