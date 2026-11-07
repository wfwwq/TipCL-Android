package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/PS_FontInfo.class
 */
@NativeType("struct PS_FontInfoRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/PS_FontInfo.class */
public class PS_FontInfo extends Struct<PS_FontInfo> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERSION;
    public static final int NOTICE;
    public static final int FULL_NAME;
    public static final int FAMILY_NAME;
    public static final int WEIGHT;
    public static final int ITALIC_ANGLE;
    public static final int IS_FIXED_PITCH;
    public static final int UNDERLINE_POSITION;
    public static final int UNDERLINE_THICKNESS;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(1), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERSION = layout.offsetof(0);
        NOTICE = layout.offsetof(1);
        FULL_NAME = layout.offsetof(2);
        FAMILY_NAME = layout.offsetof(3);
        WEIGHT = layout.offsetof(4);
        ITALIC_ANGLE = layout.offsetof(5);
        IS_FIXED_PITCH = layout.offsetof(6);
        UNDERLINE_POSITION = layout.offsetof(7);
        UNDERLINE_THICKNESS = layout.offsetof(8);
    }

    protected PS_FontInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public PS_FontInfo create(long address, ByteBuffer container) {
        return new PS_FontInfo(address, container);
    }

    public PS_FontInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_String *")
    public ByteBuffer version() {
        return nversion(address());
    }

    @NativeType("FT_String *")
    public String versionString() {
        return nversionString(address());
    }

    @NativeType("FT_String *")
    public ByteBuffer notice() {
        return nnotice(address());
    }

    @NativeType("FT_String *")
    public String noticeString() {
        return nnoticeString(address());
    }

    @NativeType("FT_String *")
    public ByteBuffer full_name() {
        return nfull_name(address());
    }

    @NativeType("FT_String *")
    public String full_nameString() {
        return nfull_nameString(address());
    }

    @NativeType("FT_String *")
    public ByteBuffer family_name() {
        return nfamily_name(address());
    }

    @NativeType("FT_String *")
    public String family_nameString() {
        return nfamily_nameString(address());
    }

    @NativeType("FT_String *")
    public ByteBuffer weight() {
        return nweight(address());
    }

    @NativeType("FT_String *")
    public String weightString() {
        return nweightString(address());
    }

    @NativeType("FT_Long")
    public long italic_angle() {
        return nitalic_angle(address());
    }

    @NativeType("FT_Bool")
    public boolean is_fixed_pitch() {
        return nis_fixed_pitch(address());
    }

    @NativeType("FT_Short")
    public short underline_position() {
        return nunderline_position(address());
    }

    @NativeType("FT_UShort")
    public short underline_thickness() {
        return nunderline_thickness(address());
    }

    public static PS_FontInfo create(long address) {
        return new PS_FontInfo(address, null);
    }

    public static PS_FontInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new PS_FontInfo(address, null);
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

    public static ByteBuffer nversion(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + VERSION));
    }

    public static String nversionString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + VERSION));
    }

    public static ByteBuffer nnotice(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + NOTICE));
    }

    public static String nnoticeString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + NOTICE));
    }

    public static ByteBuffer nfull_name(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + FULL_NAME));
    }

    public static String nfull_nameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + FULL_NAME));
    }

    public static ByteBuffer nfamily_name(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + FAMILY_NAME));
    }

    public static String nfamily_nameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + FAMILY_NAME));
    }

    public static ByteBuffer nweight(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + WEIGHT));
    }

    public static String nweightString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + WEIGHT));
    }

    public static long nitalic_angle(long struct) {
        return MemoryUtil.memGetCLong(struct + ITALIC_ANGLE);
    }

    public static boolean nis_fixed_pitch(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) IS_FIXED_PITCH)) != 0;
    }

    public static short nunderline_position(long struct) {
        return MemoryUtil.memGetShort(struct + UNDERLINE_POSITION);
    }

    public static short nunderline_thickness(long struct) {
        return MemoryUtil.memGetShort(struct + UNDERLINE_THICKNESS);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/PS_FontInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/PS_FontInfo$Buffer.class */
    public static class Buffer extends StructBuffer<PS_FontInfo, Buffer> {
        private static final PS_FontInfo ELEMENT_FACTORY = PS_FontInfo.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / PS_FontInfo.SIZEOF);
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
        public PS_FontInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_String *")
        public ByteBuffer version() {
            return PS_FontInfo.nversion(address());
        }

        @NativeType("FT_String *")
        public String versionString() {
            return PS_FontInfo.nversionString(address());
        }

        @NativeType("FT_String *")
        public ByteBuffer notice() {
            return PS_FontInfo.nnotice(address());
        }

        @NativeType("FT_String *")
        public String noticeString() {
            return PS_FontInfo.nnoticeString(address());
        }

        @NativeType("FT_String *")
        public ByteBuffer full_name() {
            return PS_FontInfo.nfull_name(address());
        }

        @NativeType("FT_String *")
        public String full_nameString() {
            return PS_FontInfo.nfull_nameString(address());
        }

        @NativeType("FT_String *")
        public ByteBuffer family_name() {
            return PS_FontInfo.nfamily_name(address());
        }

        @NativeType("FT_String *")
        public String family_nameString() {
            return PS_FontInfo.nfamily_nameString(address());
        }

        @NativeType("FT_String *")
        public ByteBuffer weight() {
            return PS_FontInfo.nweight(address());
        }

        @NativeType("FT_String *")
        public String weightString() {
            return PS_FontInfo.nweightString(address());
        }

        @NativeType("FT_Long")
        public long italic_angle() {
            return PS_FontInfo.nitalic_angle(address());
        }

        @NativeType("FT_Bool")
        public boolean is_fixed_pitch() {
            return PS_FontInfo.nis_fixed_pitch(address());
        }

        @NativeType("FT_Short")
        public short underline_position() {
            return PS_FontInfo.nunderline_position(address());
        }

        @NativeType("FT_UShort")
        public short underline_thickness() {
            return PS_FontInfo.nunderline_thickness(address());
        }
    }
}
