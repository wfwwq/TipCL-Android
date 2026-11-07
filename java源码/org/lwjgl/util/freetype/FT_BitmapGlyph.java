package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_BitmapGlyph.class
 */
@NativeType("struct FT_BitmapGlyphRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_BitmapGlyph.class */
public class FT_BitmapGlyph extends Struct<FT_BitmapGlyph> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ROOT;
    public static final int LEFT;
    public static final int TOP;
    public static final int BITMAP;

    static {
        Struct.Layout layout = __struct(__member(FT_Glyph.SIZEOF, FT_Glyph.ALIGNOF), __member(4), __member(4), __member(FT_Bitmap.SIZEOF, FT_Bitmap.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ROOT = layout.offsetof(0);
        LEFT = layout.offsetof(1);
        TOP = layout.offsetof(2);
        BITMAP = layout.offsetof(3);
    }

    protected FT_BitmapGlyph(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_BitmapGlyph create(long address, ByteBuffer container) {
        return new FT_BitmapGlyph(address, container);
    }

    public FT_BitmapGlyph(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_GlyphRec")
    public FT_Glyph root() {
        return nroot(address());
    }

    @NativeType("FT_Int")
    public int left() {
        return nleft(address());
    }

    @NativeType("FT_Int")
    public int top() {
        return ntop(address());
    }

    public FT_Bitmap bitmap() {
        return nbitmap(address());
    }

    public static FT_BitmapGlyph create(long address) {
        return new FT_BitmapGlyph(address, null);
    }

    public static FT_BitmapGlyph createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_BitmapGlyph(address, null);
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

    public static FT_Glyph nroot(long struct) {
        return FT_Glyph.create(struct + ROOT);
    }

    public static int nleft(long struct) {
        return MemoryUtil.memGetInt(struct + LEFT);
    }

    public static int ntop(long struct) {
        return MemoryUtil.memGetInt(struct + TOP);
    }

    public static FT_Bitmap nbitmap(long struct) {
        return FT_Bitmap.create(struct + BITMAP);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_BitmapGlyph$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_BitmapGlyph$Buffer.class */
    public static class Buffer extends StructBuffer<FT_BitmapGlyph, Buffer> {
        private static final FT_BitmapGlyph ELEMENT_FACTORY = FT_BitmapGlyph.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_BitmapGlyph.SIZEOF);
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
        public FT_BitmapGlyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_GlyphRec")
        public FT_Glyph root() {
            return FT_BitmapGlyph.nroot(address());
        }

        @NativeType("FT_Int")
        public int left() {
            return FT_BitmapGlyph.nleft(address());
        }

        @NativeType("FT_Int")
        public int top() {
            return FT_BitmapGlyph.ntop(address());
        }

        public FT_Bitmap bitmap() {
            return FT_BitmapGlyph.nbitmap(address());
        }
    }
}
