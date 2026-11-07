package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_SBit.class
 */
@NativeType("struct FTC_SBitRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_SBit.class */
public class FTC_SBit extends Struct<FTC_SBit> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int LEFT;
    public static final int TOP;
    public static final int FORMAT;
    public static final int MAX_GRAYS;
    public static final int PITCH;
    public static final int XADVANCE;
    public static final int YADVANCE;
    public static final int BUFFER;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(2), __member(1), __member(1), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        LEFT = layout.offsetof(2);
        TOP = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
        MAX_GRAYS = layout.offsetof(5);
        PITCH = layout.offsetof(6);
        XADVANCE = layout.offsetof(7);
        YADVANCE = layout.offsetof(8);
        BUFFER = layout.offsetof(9);
    }

    protected FTC_SBit(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FTC_SBit create(long address, ByteBuffer container) {
        return new FTC_SBit(address, container);
    }

    public FTC_SBit(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Byte")
    public byte width() {
        return nwidth(address());
    }

    @NativeType("FT_Byte")
    public byte height() {
        return nheight(address());
    }

    @NativeType("FT_Char")
    public byte left() {
        return nleft(address());
    }

    @NativeType("FT_Char")
    public byte top() {
        return ntop(address());
    }

    @NativeType("FT_Byte")
    public byte format() {
        return nformat(address());
    }

    @NativeType("FT_Byte")
    public byte max_grays() {
        return nmax_grays(address());
    }

    @NativeType("FT_Short")
    public short pitch() {
        return npitch(address());
    }

    @NativeType("FT_Char")
    public byte xadvance() {
        return nxadvance(address());
    }

    @NativeType("FT_Char")
    public byte yadvance() {
        return nyadvance(address());
    }

    @NativeType("FT_Byte *")
    public ByteBuffer buffer(int capacity) {
        return nbuffer(address(), capacity);
    }

    public static FTC_SBit create(long address) {
        return new FTC_SBit(address, null);
    }

    public static FTC_SBit createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FTC_SBit(address, null);
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

    public static byte nwidth(long struct) {
        return MemoryUtil.memGetByte(struct + WIDTH);
    }

    public static byte nheight(long struct) {
        return MemoryUtil.memGetByte(struct + HEIGHT);
    }

    public static byte nleft(long struct) {
        return MemoryUtil.memGetByte(struct + LEFT);
    }

    public static byte ntop(long struct) {
        return MemoryUtil.memGetByte(struct + TOP);
    }

    public static byte nformat(long struct) {
        return MemoryUtil.memGetByte(struct + FORMAT);
    }

    public static byte nmax_grays(long struct) {
        return MemoryUtil.memGetByte(struct + MAX_GRAYS);
    }

    public static short npitch(long struct) {
        return MemoryUtil.memGetShort(struct + PITCH);
    }

    public static byte nxadvance(long struct) {
        return MemoryUtil.memGetByte(struct + XADVANCE);
    }

    public static byte nyadvance(long struct) {
        return MemoryUtil.memGetByte(struct + YADVANCE);
    }

    public static ByteBuffer nbuffer(long struct, int capacity) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + BUFFER), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_SBit$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_SBit$Buffer.class */
    public static class Buffer extends StructBuffer<FTC_SBit, Buffer> {
        private static final FTC_SBit ELEMENT_FACTORY = FTC_SBit.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FTC_SBit.SIZEOF);
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
        public FTC_SBit getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Byte")
        public byte width() {
            return FTC_SBit.nwidth(address());
        }

        @NativeType("FT_Byte")
        public byte height() {
            return FTC_SBit.nheight(address());
        }

        @NativeType("FT_Char")
        public byte left() {
            return FTC_SBit.nleft(address());
        }

        @NativeType("FT_Char")
        public byte top() {
            return FTC_SBit.ntop(address());
        }

        @NativeType("FT_Byte")
        public byte format() {
            return FTC_SBit.nformat(address());
        }

        @NativeType("FT_Byte")
        public byte max_grays() {
            return FTC_SBit.nmax_grays(address());
        }

        @NativeType("FT_Short")
        public short pitch() {
            return FTC_SBit.npitch(address());
        }

        @NativeType("FT_Char")
        public byte xadvance() {
            return FTC_SBit.nxadvance(address());
        }

        @NativeType("FT_Char")
        public byte yadvance() {
            return FTC_SBit.nyadvance(address());
        }

        @NativeType("FT_Byte *")
        public ByteBuffer buffer(int capacity) {
            return FTC_SBit.nbuffer(address(), capacity);
        }
    }
}
