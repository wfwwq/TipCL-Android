package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.util.freetype.FT_Vector;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline.class */
public class FT_Outline extends Struct<FT_Outline> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int N_CONTOURS;
    public static final int N_POINTS;
    public static final int POINTS;
    public static final int TAGS;
    public static final int CONTOURS;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        N_CONTOURS = layout.offsetof(0);
        N_POINTS = layout.offsetof(1);
        POINTS = layout.offsetof(2);
        TAGS = layout.offsetof(3);
        CONTOURS = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
    }

    protected FT_Outline(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Outline create(long address, ByteBuffer container) {
        return new FT_Outline(address, container);
    }

    public FT_Outline(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned short")
    public short n_contours() {
        return nn_contours(address());
    }

    @NativeType("unsigned short")
    public short n_points() {
        return nn_points(address());
    }

    @NativeType("FT_Vector *")
    public FT_Vector.Buffer points() {
        return npoints(address());
    }

    @NativeType("unsigned char *")
    public ByteBuffer tags() {
        return ntags(address());
    }

    @NativeType("unsigned short *")
    public ShortBuffer contours() {
        return ncontours(address());
    }

    public int flags() {
        return nflags(address());
    }

    public static FT_Outline malloc() {
        return new FT_Outline(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Outline calloc() {
        return new FT_Outline(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Outline create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Outline(MemoryUtil.memAddress(container), container);
    }

    public static FT_Outline create(long address) {
        return new FT_Outline(address, null);
    }

    public static FT_Outline createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Outline(address, null);
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

    public static FT_Outline malloc(MemoryStack stack) {
        return new FT_Outline(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Outline calloc(MemoryStack stack) {
        return new FT_Outline(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nn_contours(long struct) {
        return MemoryUtil.memGetShort(struct + N_CONTOURS);
    }

    public static short nn_points(long struct) {
        return MemoryUtil.memGetShort(struct + N_POINTS);
    }

    public static FT_Vector.Buffer npoints(long struct) {
        return FT_Vector.create(MemoryUtil.memGetAddress(struct + POINTS), Short.toUnsignedInt(nn_points(struct)));
    }

    public static ByteBuffer ntags(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + TAGS), Short.toUnsignedInt(nn_points(struct)));
    }

    public static ShortBuffer ncontours(long struct) {
        return MemoryUtil.memShortBuffer(MemoryUtil.memGetAddress(struct + CONTOURS), Short.toUnsignedInt(nn_contours(struct)));
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Outline, Buffer> implements NativeResource {
        private static final FT_Outline ELEMENT_FACTORY = FT_Outline.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Outline.SIZEOF);
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
        public FT_Outline getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned short")
        public short n_contours() {
            return FT_Outline.nn_contours(address());
        }

        @NativeType("unsigned short")
        public short n_points() {
            return FT_Outline.nn_points(address());
        }

        @NativeType("FT_Vector *")
        public FT_Vector.Buffer points() {
            return FT_Outline.npoints(address());
        }

        @NativeType("unsigned char *")
        public ByteBuffer tags() {
            return FT_Outline.ntags(address());
        }

        @NativeType("unsigned short *")
        public ShortBuffer contours() {
            return FT_Outline.ncontours(address());
        }

        public int flags() {
            return FT_Outline.nflags(address());
        }
    }
}
