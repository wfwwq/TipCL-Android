package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSampleLocationEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSampleLocationEXT.class */
public class VkSampleLocationEXT extends Struct<VkSampleLocationEXT> implements NativeResource {
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

    protected VkSampleLocationEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSampleLocationEXT create(long address, ByteBuffer container) {
        return new VkSampleLocationEXT(address, container);
    }

    public VkSampleLocationEXT(ByteBuffer container) {
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

    public VkSampleLocationEXT x(float value) {
        nx(address(), value);
        return this;
    }

    public VkSampleLocationEXT y(float value) {
        ny(address(), value);
        return this;
    }

    public VkSampleLocationEXT set(float x, float y) {
        x(x);
        y(y);
        return this;
    }

    public VkSampleLocationEXT set(VkSampleLocationEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSampleLocationEXT malloc() {
        return new VkSampleLocationEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSampleLocationEXT calloc() {
        return new VkSampleLocationEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSampleLocationEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSampleLocationEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSampleLocationEXT create(long address) {
        return new VkSampleLocationEXT(address, null);
    }

    public static VkSampleLocationEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSampleLocationEXT(address, null);
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

    public static VkSampleLocationEXT malloc(MemoryStack stack) {
        return new VkSampleLocationEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSampleLocationEXT calloc(MemoryStack stack) {
        return new VkSampleLocationEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSampleLocationEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSampleLocationEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSampleLocationEXT, Buffer> implements NativeResource {
        private static final VkSampleLocationEXT ELEMENT_FACTORY = VkSampleLocationEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSampleLocationEXT.SIZEOF);
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
        public VkSampleLocationEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float x() {
            return VkSampleLocationEXT.nx(address());
        }

        public float y() {
            return VkSampleLocationEXT.ny(address());
        }

        public Buffer x(float value) {
            VkSampleLocationEXT.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            VkSampleLocationEXT.ny(address(), value);
            return this;
        }
    }
}
