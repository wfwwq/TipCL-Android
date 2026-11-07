package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewport.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewport.class */
public class VkViewport extends Struct<VkViewport> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int MINDEPTH;
    public static final int MAXDEPTH;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        MINDEPTH = layout.offsetof(4);
        MAXDEPTH = layout.offsetof(5);
    }

    protected VkViewport(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkViewport create(long address, ByteBuffer container) {
        return new VkViewport(address, container);
    }

    public VkViewport(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public float x() {
        return nx(address());
    }

    public float y() {
        return ny(address());
    }

    public float width() {
        return nwidth(address());
    }

    public float height() {
        return nheight(address());
    }

    public float minDepth() {
        return nminDepth(address());
    }

    public float maxDepth() {
        return nmaxDepth(address());
    }

    public VkViewport x(float value) {
        nx(address(), value);
        return this;
    }

    public VkViewport y(float value) {
        ny(address(), value);
        return this;
    }

    public VkViewport width(float value) {
        nwidth(address(), value);
        return this;
    }

    public VkViewport height(float value) {
        nheight(address(), value);
        return this;
    }

    public VkViewport minDepth(float value) {
        nminDepth(address(), value);
        return this;
    }

    public VkViewport maxDepth(float value) {
        nmaxDepth(address(), value);
        return this;
    }

    public VkViewport set(float x, float y, float width, float height, float minDepth, float maxDepth) {
        x(x);
        y(y);
        width(width);
        height(height);
        minDepth(minDepth);
        maxDepth(maxDepth);
        return this;
    }

    public VkViewport set(VkViewport src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkViewport malloc() {
        return new VkViewport(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkViewport calloc() {
        return new VkViewport(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkViewport create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkViewport(MemoryUtil.memAddress(container), container);
    }

    public static VkViewport create(long address) {
        return new VkViewport(address, null);
    }

    public static VkViewport createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkViewport(address, null);
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

    public static VkViewport malloc(MemoryStack stack) {
        return new VkViewport(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkViewport calloc(MemoryStack stack) {
        return new VkViewport(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static float nx(long struct) {
        return MemoryUtil.memGetFloat(struct + X);
    }

    public static float ny(long struct) {
        return MemoryUtil.memGetFloat(struct + Y);
    }

    public static float nwidth(long struct) {
        return MemoryUtil.memGetFloat(struct + WIDTH);
    }

    public static float nheight(long struct) {
        return MemoryUtil.memGetFloat(struct + HEIGHT);
    }

    public static float nminDepth(long struct) {
        return MemoryUtil.memGetFloat(struct + MINDEPTH);
    }

    public static float nmaxDepth(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXDEPTH);
    }

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    public static void nwidth(long struct, float value) {
        MemoryUtil.memPutFloat(struct + WIDTH, value);
    }

    public static void nheight(long struct, float value) {
        MemoryUtil.memPutFloat(struct + HEIGHT, value);
    }

    public static void nminDepth(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MINDEPTH, value);
    }

    public static void nmaxDepth(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAXDEPTH, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewport$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewport$Buffer.class */
    public static class Buffer extends StructBuffer<VkViewport, Buffer> implements NativeResource {
        private static final VkViewport ELEMENT_FACTORY = VkViewport.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkViewport.SIZEOF);
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
        public VkViewport getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float x() {
            return VkViewport.nx(address());
        }

        public float y() {
            return VkViewport.ny(address());
        }

        public float width() {
            return VkViewport.nwidth(address());
        }

        public float height() {
            return VkViewport.nheight(address());
        }

        public float minDepth() {
            return VkViewport.nminDepth(address());
        }

        public float maxDepth() {
            return VkViewport.nmaxDepth(address());
        }

        public Buffer x(float value) {
            VkViewport.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            VkViewport.ny(address(), value);
            return this;
        }

        public Buffer width(float value) {
            VkViewport.nwidth(address(), value);
            return this;
        }

        public Buffer height(float value) {
            VkViewport.nheight(address(), value);
            return this;
        }

        public Buffer minDepth(float value) {
            VkViewport.nminDepth(address(), value);
            return this;
        }

        public Buffer maxDepth(float value) {
            VkViewport.nmaxDepth(address(), value);
            return this;
        }
    }
}
