package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/CID_FaceDict.class
 */
@NativeType("struct CID_FaceDictRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/CID_FaceDict.class */
public class CID_FaceDict extends Struct<CID_FaceDict> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PRIVATE_DICT;
    public static final int LEN_BUILDCHAR;
    public static final int FORCEBOLD_THRESHOLD;
    public static final int STROKE_WIDTH;
    public static final int EXPANSION_FACTOR;
    public static final int PAINT_TYPE;
    public static final int FONT_TYPE;
    public static final int FONT_MATRIX;
    public static final int FONT_OFFSET;
    public static final int NUM_SUBRS;
    public static final int SUBRMAP_OFFSET;
    public static final int SD_BYTES;

    static {
        Struct.Layout layout = __struct(__member(PS_Private.SIZEOF, PS_Private.ALIGNOF), __member(4), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(1), __member(1), __member(FT_Matrix.SIZEOF, FT_Matrix.ALIGNOF), __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF), __member(4), __member(CLONG_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PRIVATE_DICT = layout.offsetof(0);
        LEN_BUILDCHAR = layout.offsetof(1);
        FORCEBOLD_THRESHOLD = layout.offsetof(2);
        STROKE_WIDTH = layout.offsetof(3);
        EXPANSION_FACTOR = layout.offsetof(4);
        PAINT_TYPE = layout.offsetof(5);
        FONT_TYPE = layout.offsetof(6);
        FONT_MATRIX = layout.offsetof(7);
        FONT_OFFSET = layout.offsetof(8);
        NUM_SUBRS = layout.offsetof(9);
        SUBRMAP_OFFSET = layout.offsetof(10);
        SD_BYTES = layout.offsetof(11);
    }

    protected CID_FaceDict(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public CID_FaceDict create(long address, ByteBuffer container) {
        return new CID_FaceDict(address, container);
    }

    public CID_FaceDict(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("PS_PrivateRec")
    public PS_Private private_dict() {
        return nprivate_dict(address());
    }

    @NativeType("FT_UInt")
    public int len_buildchar() {
        return nlen_buildchar(address());
    }

    @NativeType("FT_Fixed")
    public long forcebold_threshold() {
        return nforcebold_threshold(address());
    }

    @NativeType("FT_Pos")
    public long stroke_width() {
        return nstroke_width(address());
    }

    @NativeType("FT_Fixed")
    public long expansion_factor() {
        return nexpansion_factor(address());
    }

    @NativeType("FT_Byte")
    public byte paint_type() {
        return npaint_type(address());
    }

    @NativeType("FT_Byte")
    public byte font_type() {
        return nfont_type(address());
    }

    public FT_Matrix font_matrix() {
        return nfont_matrix(address());
    }

    public FT_Vector font_offset() {
        return nfont_offset(address());
    }

    @NativeType("FT_UInt")
    public int num_subrs() {
        return nnum_subrs(address());
    }

    @NativeType("FT_ULong")
    public long subrmap_offset() {
        return nsubrmap_offset(address());
    }

    @NativeType("FT_UInt")
    public int sd_bytes() {
        return nsd_bytes(address());
    }

    public static CID_FaceDict create(long address) {
        return new CID_FaceDict(address, null);
    }

    public static CID_FaceDict createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new CID_FaceDict(address, null);
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

    public static PS_Private nprivate_dict(long struct) {
        return PS_Private.create(struct + PRIVATE_DICT);
    }

    public static int nlen_buildchar(long struct) {
        return MemoryUtil.memGetInt(struct + LEN_BUILDCHAR);
    }

    public static long nforcebold_threshold(long struct) {
        return MemoryUtil.memGetCLong(struct + FORCEBOLD_THRESHOLD);
    }

    public static long nstroke_width(long struct) {
        return MemoryUtil.memGetCLong(struct + STROKE_WIDTH);
    }

    public static long nexpansion_factor(long struct) {
        return MemoryUtil.memGetCLong(struct + EXPANSION_FACTOR);
    }

    public static byte npaint_type(long struct) {
        return MemoryUtil.memGetByte(struct + PAINT_TYPE);
    }

    public static byte nfont_type(long struct) {
        return MemoryUtil.memGetByte(struct + FONT_TYPE);
    }

    public static FT_Matrix nfont_matrix(long struct) {
        return FT_Matrix.create(struct + FONT_MATRIX);
    }

    public static FT_Vector nfont_offset(long struct) {
        return FT_Vector.create(struct + FONT_OFFSET);
    }

    public static int nnum_subrs(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_SUBRS);
    }

    public static long nsubrmap_offset(long struct) {
        return MemoryUtil.memGetCLong(struct + SUBRMAP_OFFSET);
    }

    public static int nsd_bytes(long struct) {
        return MemoryUtil.memGetInt(struct + SD_BYTES);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/CID_FaceDict$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/CID_FaceDict$Buffer.class */
    public static class Buffer extends StructBuffer<CID_FaceDict, Buffer> {
        private static final CID_FaceDict ELEMENT_FACTORY = CID_FaceDict.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / CID_FaceDict.SIZEOF);
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
        public CID_FaceDict getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("PS_PrivateRec")
        public PS_Private private_dict() {
            return CID_FaceDict.nprivate_dict(address());
        }

        @NativeType("FT_UInt")
        public int len_buildchar() {
            return CID_FaceDict.nlen_buildchar(address());
        }

        @NativeType("FT_Fixed")
        public long forcebold_threshold() {
            return CID_FaceDict.nforcebold_threshold(address());
        }

        @NativeType("FT_Pos")
        public long stroke_width() {
            return CID_FaceDict.nstroke_width(address());
        }

        @NativeType("FT_Fixed")
        public long expansion_factor() {
            return CID_FaceDict.nexpansion_factor(address());
        }

        @NativeType("FT_Byte")
        public byte paint_type() {
            return CID_FaceDict.npaint_type(address());
        }

        @NativeType("FT_Byte")
        public byte font_type() {
            return CID_FaceDict.nfont_type(address());
        }

        public FT_Matrix font_matrix() {
            return CID_FaceDict.nfont_matrix(address());
        }

        public FT_Vector font_offset() {
            return CID_FaceDict.nfont_offset(address());
        }

        @NativeType("FT_UInt")
        public int num_subrs() {
            return CID_FaceDict.nnum_subrs(address());
        }

        @NativeType("FT_ULong")
        public long subrmap_offset() {
            return CID_FaceDict.nsubrmap_offset(address());
        }

        @NativeType("FT_UInt")
        public int sd_bytes() {
            return CID_FaceDict.nsd_bytes(address());
        }
    }
}
