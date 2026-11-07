package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/PS_Private.class
 */
@NativeType("struct PS_PrivateRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/PS_Private.class */
public class PS_Private extends Struct<PS_Private> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int UNIQUE_ID;
    public static final int LENIV;
    public static final int NUM_BLUE_VALUES;
    public static final int NUM_OTHER_BLUES;
    public static final int NUM_FAMILY_BLUES;
    public static final int NUM_FAMILY_OTHER_BLUES;
    public static final int BLUE_VALUES;
    public static final int OTHER_BLUES;
    public static final int FAMILY_BLUES;
    public static final int FAMILY_OTHER_BLUES;
    public static final int BLUE_SCALE;
    public static final int BLUE_SHIFT;
    public static final int BLUE_FUZZ;
    public static final int STANDARD_WIDTH;
    public static final int STANDARD_HEIGHT;
    public static final int NUM_SNAP_WIDTHS;
    public static final int NUM_SNAP_HEIGHTS;
    public static final int FORCE_BOLD;
    public static final int ROUND_STEM_UP;
    public static final int SNAP_WIDTHS;
    public static final int SNAP_HEIGHTS;
    public static final int EXPANSION_FACTOR;
    public static final int LANGUAGE_GROUP;
    public static final int PASSWORD;
    public static final int MIN_FEATURE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __array(2, 14), __array(2, 10), __array(2, 14), __array(2, 10), __member(CLONG_SIZE), __member(4), __member(4), __array(2, 1), __array(2, 1), __member(1), __member(1), __member(1), __member(1), __array(2, 13), __array(2, 13), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __array(2, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        UNIQUE_ID = layout.offsetof(0);
        LENIV = layout.offsetof(1);
        NUM_BLUE_VALUES = layout.offsetof(2);
        NUM_OTHER_BLUES = layout.offsetof(3);
        NUM_FAMILY_BLUES = layout.offsetof(4);
        NUM_FAMILY_OTHER_BLUES = layout.offsetof(5);
        BLUE_VALUES = layout.offsetof(6);
        OTHER_BLUES = layout.offsetof(7);
        FAMILY_BLUES = layout.offsetof(8);
        FAMILY_OTHER_BLUES = layout.offsetof(9);
        BLUE_SCALE = layout.offsetof(10);
        BLUE_SHIFT = layout.offsetof(11);
        BLUE_FUZZ = layout.offsetof(12);
        STANDARD_WIDTH = layout.offsetof(13);
        STANDARD_HEIGHT = layout.offsetof(14);
        NUM_SNAP_WIDTHS = layout.offsetof(15);
        NUM_SNAP_HEIGHTS = layout.offsetof(16);
        FORCE_BOLD = layout.offsetof(17);
        ROUND_STEM_UP = layout.offsetof(18);
        SNAP_WIDTHS = layout.offsetof(19);
        SNAP_HEIGHTS = layout.offsetof(20);
        EXPANSION_FACTOR = layout.offsetof(21);
        LANGUAGE_GROUP = layout.offsetof(22);
        PASSWORD = layout.offsetof(23);
        MIN_FEATURE = layout.offsetof(24);
    }

    protected PS_Private(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public PS_Private create(long address, ByteBuffer container) {
        return new PS_Private(address, container);
    }

    public PS_Private(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Int")
    public int unique_id() {
        return nunique_id(address());
    }

    @NativeType("FT_Int")
    public int lenIV() {
        return nlenIV(address());
    }

    @NativeType("FT_Byte")
    public byte num_blue_values() {
        return nnum_blue_values(address());
    }

    @NativeType("FT_Byte")
    public byte num_other_blues() {
        return nnum_other_blues(address());
    }

    @NativeType("FT_Byte")
    public byte num_family_blues() {
        return nnum_family_blues(address());
    }

    @NativeType("FT_Byte")
    public byte num_family_other_blues() {
        return nnum_family_other_blues(address());
    }

    @NativeType("FT_Short[14]")
    public ShortBuffer blue_values() {
        return nblue_values(address());
    }

    @NativeType("FT_Short")
    public short blue_values(int index) {
        return nblue_values(address(), index);
    }

    @NativeType("FT_Short[10]")
    public ShortBuffer other_blues() {
        return nother_blues(address());
    }

    @NativeType("FT_Short")
    public short other_blues(int index) {
        return nother_blues(address(), index);
    }

    @NativeType("FT_Short[14]")
    public ShortBuffer family_blues() {
        return nfamily_blues(address());
    }

    @NativeType("FT_Short")
    public short family_blues(int index) {
        return nfamily_blues(address(), index);
    }

    @NativeType("FT_Short[10]")
    public ShortBuffer family_other_blues() {
        return nfamily_other_blues(address());
    }

    @NativeType("FT_Short")
    public short family_other_blues(int index) {
        return nfamily_other_blues(address(), index);
    }

    @NativeType("FT_Fixed")
    public long blue_scale() {
        return nblue_scale(address());
    }

    @NativeType("FT_Int")
    public int blue_shift() {
        return nblue_shift(address());
    }

    @NativeType("FT_Int")
    public int blue_fuzz() {
        return nblue_fuzz(address());
    }

    @NativeType("FT_UShort[1]")
    public ShortBuffer standard_width() {
        return nstandard_width(address());
    }

    @NativeType("FT_UShort")
    public short standard_width(int index) {
        return nstandard_width(address(), index);
    }

    @NativeType("FT_UShort[1]")
    public ShortBuffer standard_height() {
        return nstandard_height(address());
    }

    @NativeType("FT_UShort")
    public short standard_height(int index) {
        return nstandard_height(address(), index);
    }

    @NativeType("FT_Byte")
    public byte num_snap_widths() {
        return nnum_snap_widths(address());
    }

    @NativeType("FT_Byte")
    public byte num_snap_heights() {
        return nnum_snap_heights(address());
    }

    @NativeType("FT_Bool")
    public boolean force_bold() {
        return nforce_bold(address());
    }

    @NativeType("FT_Bool")
    public boolean round_stem_up() {
        return nround_stem_up(address());
    }

    @NativeType("FT_Short[13]")
    public ShortBuffer snap_widths() {
        return nsnap_widths(address());
    }

    @NativeType("FT_Short")
    public short snap_widths(int index) {
        return nsnap_widths(address(), index);
    }

    @NativeType("FT_Short[13]")
    public ShortBuffer snap_heights() {
        return nsnap_heights(address());
    }

    @NativeType("FT_Short")
    public short snap_heights(int index) {
        return nsnap_heights(address(), index);
    }

    @NativeType("FT_Fixed")
    public long expansion_factor() {
        return nexpansion_factor(address());
    }

    @NativeType("FT_Long")
    public long language_group() {
        return nlanguage_group(address());
    }

    @NativeType("FT_Long")
    public long password() {
        return npassword(address());
    }

    @NativeType("FT_Short[2]")
    public ShortBuffer min_feature() {
        return nmin_feature(address());
    }

    @NativeType("FT_Short")
    public short min_feature(int index) {
        return nmin_feature(address(), index);
    }

    public static PS_Private create(long address) {
        return new PS_Private(address, null);
    }

    public static PS_Private createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new PS_Private(address, null);
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

    public static int nunique_id(long struct) {
        return MemoryUtil.memGetInt(struct + UNIQUE_ID);
    }

    public static int nlenIV(long struct) {
        return MemoryUtil.memGetInt(struct + LENIV);
    }

    public static byte nnum_blue_values(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_BLUE_VALUES);
    }

    public static byte nnum_other_blues(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_OTHER_BLUES);
    }

    public static byte nnum_family_blues(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_FAMILY_BLUES);
    }

    public static byte nnum_family_other_blues(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_FAMILY_OTHER_BLUES);
    }

    public static ShortBuffer nblue_values(long struct) {
        return MemoryUtil.memShortBuffer(struct + BLUE_VALUES, 14);
    }

    public static short nblue_values(long struct, int index) {
        return MemoryUtil.memGetShort(struct + BLUE_VALUES + (Checks.check(index, 14) * 2));
    }

    public static ShortBuffer nother_blues(long struct) {
        return MemoryUtil.memShortBuffer(struct + OTHER_BLUES, 10);
    }

    public static short nother_blues(long struct, int index) {
        return MemoryUtil.memGetShort(struct + OTHER_BLUES + (Checks.check(index, 10) * 2));
    }

    public static ShortBuffer nfamily_blues(long struct) {
        return MemoryUtil.memShortBuffer(struct + FAMILY_BLUES, 14);
    }

    public static short nfamily_blues(long struct, int index) {
        return MemoryUtil.memGetShort(struct + FAMILY_BLUES + (Checks.check(index, 14) * 2));
    }

    public static ShortBuffer nfamily_other_blues(long struct) {
        return MemoryUtil.memShortBuffer(struct + FAMILY_OTHER_BLUES, 10);
    }

    public static short nfamily_other_blues(long struct, int index) {
        return MemoryUtil.memGetShort(struct + FAMILY_OTHER_BLUES + (Checks.check(index, 10) * 2));
    }

    public static long nblue_scale(long struct) {
        return MemoryUtil.memGetCLong(struct + BLUE_SCALE);
    }

    public static int nblue_shift(long struct) {
        return MemoryUtil.memGetInt(struct + BLUE_SHIFT);
    }

    public static int nblue_fuzz(long struct) {
        return MemoryUtil.memGetInt(struct + BLUE_FUZZ);
    }

    public static ShortBuffer nstandard_width(long struct) {
        return MemoryUtil.memShortBuffer(struct + STANDARD_WIDTH, 1);
    }

    public static short nstandard_width(long struct, int index) {
        return MemoryUtil.memGetShort(struct + STANDARD_WIDTH + (Checks.check(index, 1) * 2));
    }

    public static ShortBuffer nstandard_height(long struct) {
        return MemoryUtil.memShortBuffer(struct + STANDARD_HEIGHT, 1);
    }

    public static short nstandard_height(long struct, int index) {
        return MemoryUtil.memGetShort(struct + STANDARD_HEIGHT + (Checks.check(index, 1) * 2));
    }

    public static byte nnum_snap_widths(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_SNAP_WIDTHS);
    }

    public static byte nnum_snap_heights(long struct) {
        return MemoryUtil.memGetByte(struct + NUM_SNAP_HEIGHTS);
    }

    public static boolean nforce_bold(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) FORCE_BOLD)) != 0;
    }

    public static boolean nround_stem_up(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ROUND_STEM_UP)) != 0;
    }

    public static ShortBuffer nsnap_widths(long struct) {
        return MemoryUtil.memShortBuffer(struct + SNAP_WIDTHS, 13);
    }

    public static short nsnap_widths(long struct, int index) {
        return MemoryUtil.memGetShort(struct + SNAP_WIDTHS + (Checks.check(index, 13) * 2));
    }

    public static ShortBuffer nsnap_heights(long struct) {
        return MemoryUtil.memShortBuffer(struct + SNAP_HEIGHTS, 13);
    }

    public static short nsnap_heights(long struct, int index) {
        return MemoryUtil.memGetShort(struct + SNAP_HEIGHTS + (Checks.check(index, 13) * 2));
    }

    public static long nexpansion_factor(long struct) {
        return MemoryUtil.memGetCLong(struct + EXPANSION_FACTOR);
    }

    public static long nlanguage_group(long struct) {
        return MemoryUtil.memGetCLong(struct + LANGUAGE_GROUP);
    }

    public static long npassword(long struct) {
        return MemoryUtil.memGetCLong(struct + PASSWORD);
    }

    public static ShortBuffer nmin_feature(long struct) {
        return MemoryUtil.memShortBuffer(struct + MIN_FEATURE, 2);
    }

    public static short nmin_feature(long struct, int index) {
        return MemoryUtil.memGetShort(struct + MIN_FEATURE + (Checks.check(index, 2) * 2));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/PS_Private$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/PS_Private$Buffer.class */
    public static class Buffer extends StructBuffer<PS_Private, Buffer> {
        private static final PS_Private ELEMENT_FACTORY = PS_Private.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / PS_Private.SIZEOF);
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
        public PS_Private getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Int")
        public int unique_id() {
            return PS_Private.nunique_id(address());
        }

        @NativeType("FT_Int")
        public int lenIV() {
            return PS_Private.nlenIV(address());
        }

        @NativeType("FT_Byte")
        public byte num_blue_values() {
            return PS_Private.nnum_blue_values(address());
        }

        @NativeType("FT_Byte")
        public byte num_other_blues() {
            return PS_Private.nnum_other_blues(address());
        }

        @NativeType("FT_Byte")
        public byte num_family_blues() {
            return PS_Private.nnum_family_blues(address());
        }

        @NativeType("FT_Byte")
        public byte num_family_other_blues() {
            return PS_Private.nnum_family_other_blues(address());
        }

        @NativeType("FT_Short[14]")
        public ShortBuffer blue_values() {
            return PS_Private.nblue_values(address());
        }

        @NativeType("FT_Short")
        public short blue_values(int index) {
            return PS_Private.nblue_values(address(), index);
        }

        @NativeType("FT_Short[10]")
        public ShortBuffer other_blues() {
            return PS_Private.nother_blues(address());
        }

        @NativeType("FT_Short")
        public short other_blues(int index) {
            return PS_Private.nother_blues(address(), index);
        }

        @NativeType("FT_Short[14]")
        public ShortBuffer family_blues() {
            return PS_Private.nfamily_blues(address());
        }

        @NativeType("FT_Short")
        public short family_blues(int index) {
            return PS_Private.nfamily_blues(address(), index);
        }

        @NativeType("FT_Short[10]")
        public ShortBuffer family_other_blues() {
            return PS_Private.nfamily_other_blues(address());
        }

        @NativeType("FT_Short")
        public short family_other_blues(int index) {
            return PS_Private.nfamily_other_blues(address(), index);
        }

        @NativeType("FT_Fixed")
        public long blue_scale() {
            return PS_Private.nblue_scale(address());
        }

        @NativeType("FT_Int")
        public int blue_shift() {
            return PS_Private.nblue_shift(address());
        }

        @NativeType("FT_Int")
        public int blue_fuzz() {
            return PS_Private.nblue_fuzz(address());
        }

        @NativeType("FT_UShort[1]")
        public ShortBuffer standard_width() {
            return PS_Private.nstandard_width(address());
        }

        @NativeType("FT_UShort")
        public short standard_width(int index) {
            return PS_Private.nstandard_width(address(), index);
        }

        @NativeType("FT_UShort[1]")
        public ShortBuffer standard_height() {
            return PS_Private.nstandard_height(address());
        }

        @NativeType("FT_UShort")
        public short standard_height(int index) {
            return PS_Private.nstandard_height(address(), index);
        }

        @NativeType("FT_Byte")
        public byte num_snap_widths() {
            return PS_Private.nnum_snap_widths(address());
        }

        @NativeType("FT_Byte")
        public byte num_snap_heights() {
            return PS_Private.nnum_snap_heights(address());
        }

        @NativeType("FT_Bool")
        public boolean force_bold() {
            return PS_Private.nforce_bold(address());
        }

        @NativeType("FT_Bool")
        public boolean round_stem_up() {
            return PS_Private.nround_stem_up(address());
        }

        @NativeType("FT_Short[13]")
        public ShortBuffer snap_widths() {
            return PS_Private.nsnap_widths(address());
        }

        @NativeType("FT_Short")
        public short snap_widths(int index) {
            return PS_Private.nsnap_widths(address(), index);
        }

        @NativeType("FT_Short[13]")
        public ShortBuffer snap_heights() {
            return PS_Private.nsnap_heights(address());
        }

        @NativeType("FT_Short")
        public short snap_heights(int index) {
            return PS_Private.nsnap_heights(address(), index);
        }

        @NativeType("FT_Fixed")
        public long expansion_factor() {
            return PS_Private.nexpansion_factor(address());
        }

        @NativeType("FT_Long")
        public long language_group() {
            return PS_Private.nlanguage_group(address());
        }

        @NativeType("FT_Long")
        public long password() {
            return PS_Private.npassword(address());
        }

        @NativeType("FT_Short[2]")
        public ShortBuffer min_feature() {
            return PS_Private.nmin_feature(address());
        }

        @NativeType("FT_Short")
        public short min_feature(int index) {
            return PS_Private.nmin_feature(address(), index);
        }
    }
}
