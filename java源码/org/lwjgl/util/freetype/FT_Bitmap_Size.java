package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Bitmap_Size.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Bitmap_Size.class */
public class FT_Bitmap_Size extends Struct<FT_Bitmap_Size> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEIGHT;
    public static final int WIDTH;
    public static final int SIZE;
    public static final int X_PPEM;
    public static final int Y_PPEM;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEIGHT = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        SIZE = layout.offsetof(2);
        X_PPEM = layout.offsetof(3);
        Y_PPEM = layout.offsetof(4);
    }

    protected FT_Bitmap_Size(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Bitmap_Size create(long address, ByteBuffer container) {
        return new FT_Bitmap_Size(address, container);
    }

    public FT_Bitmap_Size(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Short")
    public short height() {
        return nheight(address());
    }

    @NativeType("FT_Short")
    public short width() {
        return nwidth(address());
    }

    @NativeType("FT_Pos")
    public long size() {
        return nsize(address());
    }

    @NativeType("FT_Pos")
    public long x_ppem() {
        return nx_ppem(address());
    }

    @NativeType("FT_Pos")
    public long y_ppem() {
        return ny_ppem(address());
    }

    public static FT_Bitmap_Size create(long address) {
        return new FT_Bitmap_Size(address, null);
    }

    public static FT_Bitmap_Size createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Bitmap_Size(address, null);
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

    public static short nheight(long struct) {
        return MemoryUtil.memGetShort(struct + HEIGHT);
    }

    public static short nwidth(long struct) {
        return MemoryUtil.memGetShort(struct + WIDTH);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetCLong(struct + SIZE);
    }

    public static long nx_ppem(long struct) {
        return MemoryUtil.memGetCLong(struct + X_PPEM);
    }

    public static long ny_ppem(long struct) {
        return MemoryUtil.memGetCLong(struct + Y_PPEM);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Bitmap_Size$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Bitmap_Size$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Bitmap_Size, Buffer> {
        private static final FT_Bitmap_Size ELEMENT_FACTORY = FT_Bitmap_Size.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Bitmap_Size.SIZEOF);
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
        public FT_Bitmap_Size getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Short")
        public short height() {
            return FT_Bitmap_Size.nheight(address());
        }

        @NativeType("FT_Short")
        public short width() {
            return FT_Bitmap_Size.nwidth(address());
        }

        @NativeType("FT_Pos")
        public long size() {
            return FT_Bitmap_Size.nsize(address());
        }

        @NativeType("FT_Pos")
        public long x_ppem() {
            return FT_Bitmap_Size.nx_ppem(address());
        }

        @NativeType("FT_Pos")
        public long y_ppem() {
            return FT_Bitmap_Size.ny_ppem(address());
        }
    }
}
