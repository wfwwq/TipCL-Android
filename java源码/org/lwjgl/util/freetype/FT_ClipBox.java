package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ClipBox.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ClipBox.class */
public class FT_ClipBox extends Struct<FT_ClipBox> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BOTTOM_LEFT;
    public static final int TOP_LEFT;
    public static final int TOP_RIGHT;
    public static final int BOTTOM_RIGHT;

    static {
        Struct.Layout layout = __struct(__member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BOTTOM_LEFT = layout.offsetof(0);
        TOP_LEFT = layout.offsetof(1);
        TOP_RIGHT = layout.offsetof(2);
        BOTTOM_RIGHT = layout.offsetof(3);
    }

    protected FT_ClipBox(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_ClipBox create(long address, ByteBuffer container) {
        return new FT_ClipBox(address, container);
    }

    public FT_ClipBox(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public FT_Vector bottom_left() {
        return nbottom_left(address());
    }

    public FT_Vector top_left() {
        return ntop_left(address());
    }

    public FT_Vector top_right() {
        return ntop_right(address());
    }

    public FT_Vector bottom_right() {
        return nbottom_right(address());
    }

    public static FT_ClipBox malloc() {
        return new FT_ClipBox(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_ClipBox calloc() {
        return new FT_ClipBox(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_ClipBox create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_ClipBox(MemoryUtil.memAddress(container), container);
    }

    public static FT_ClipBox create(long address) {
        return new FT_ClipBox(address, null);
    }

    public static FT_ClipBox createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_ClipBox(address, null);
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

    public static FT_ClipBox malloc(MemoryStack stack) {
        return new FT_ClipBox(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_ClipBox calloc(MemoryStack stack) {
        return new FT_ClipBox(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FT_Vector nbottom_left(long struct) {
        return FT_Vector.create(struct + BOTTOM_LEFT);
    }

    public static FT_Vector ntop_left(long struct) {
        return FT_Vector.create(struct + TOP_LEFT);
    }

    public static FT_Vector ntop_right(long struct) {
        return FT_Vector.create(struct + TOP_RIGHT);
    }

    public static FT_Vector nbottom_right(long struct) {
        return FT_Vector.create(struct + BOTTOM_RIGHT);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ClipBox$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ClipBox$Buffer.class */
    public static class Buffer extends StructBuffer<FT_ClipBox, Buffer> implements NativeResource {
        private static final FT_ClipBox ELEMENT_FACTORY = FT_ClipBox.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_ClipBox.SIZEOF);
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
        public FT_ClipBox getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public FT_Vector bottom_left() {
            return FT_ClipBox.nbottom_left(address());
        }

        public FT_Vector top_left() {
            return FT_ClipBox.ntop_left(address());
        }

        public FT_Vector top_right() {
            return FT_ClipBox.ntop_right(address());
        }

        public FT_Vector bottom_right() {
            return FT_ClipBox.nbottom_right(address());
        }
    }
}
