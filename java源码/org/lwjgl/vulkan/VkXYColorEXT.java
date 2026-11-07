package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXYColorEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXYColorEXT.class */
public class VkXYColorEXT extends Struct<VkXYColorEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    protected VkXYColorEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkXYColorEXT create(long address, ByteBuffer container) {
        return new VkXYColorEXT(address, container);
    }

    public VkXYColorEXT(ByteBuffer container) {
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

    public VkXYColorEXT x(float value) {
        nx(address(), value);
        return this;
    }

    public VkXYColorEXT y(float value) {
        ny(address(), value);
        return this;
    }

    public VkXYColorEXT set(float x, float y) {
        x(x);
        y(y);
        return this;
    }

    public VkXYColorEXT set(VkXYColorEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkXYColorEXT malloc() {
        return new VkXYColorEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkXYColorEXT calloc() {
        return new VkXYColorEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkXYColorEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkXYColorEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkXYColorEXT create(long address) {
        return new VkXYColorEXT(address, null);
    }

    public static VkXYColorEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkXYColorEXT(address, null);
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

    public static VkXYColorEXT malloc(MemoryStack stack) {
        return new VkXYColorEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkXYColorEXT calloc(MemoryStack stack) {
        return new VkXYColorEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXYColorEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXYColorEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkXYColorEXT, Buffer> implements NativeResource {
        private static final VkXYColorEXT ELEMENT_FACTORY = VkXYColorEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkXYColorEXT.SIZEOF);
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
        public VkXYColorEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float x() {
            return VkXYColorEXT.nx(address());
        }

        public float y() {
            return VkXYColorEXT.ny(address());
        }

        public Buffer x(float value) {
            VkXYColorEXT.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            VkXYColorEXT.ny(address(), value);
            return this;
        }
    }
}
