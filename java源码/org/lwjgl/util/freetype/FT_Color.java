package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Color.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Color.class */
public class FT_Color extends Struct<FT_Color> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BLUE;
    public static final int GREEN;
    public static final int RED;
    public static final int ALPHA;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BLUE = layout.offsetof(0);
        GREEN = layout.offsetof(1);
        RED = layout.offsetof(2);
        ALPHA = layout.offsetof(3);
    }

    protected FT_Color(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Color create(long address, ByteBuffer container) {
        return new FT_Color(address, container);
    }

    public FT_Color(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Byte")
    public byte blue() {
        return nblue(address());
    }

    @NativeType("FT_Byte")
    public byte green() {
        return ngreen(address());
    }

    @NativeType("FT_Byte")
    public byte red() {
        return nred(address());
    }

    @NativeType("FT_Byte")
    public byte alpha() {
        return nalpha(address());
    }

    public FT_Color blue(@NativeType("FT_Byte") byte value) {
        nblue(address(), value);
        return this;
    }

    public FT_Color green(@NativeType("FT_Byte") byte value) {
        ngreen(address(), value);
        return this;
    }

    public FT_Color red(@NativeType("FT_Byte") byte value) {
        nred(address(), value);
        return this;
    }

    public FT_Color alpha(@NativeType("FT_Byte") byte value) {
        nalpha(address(), value);
        return this;
    }

    public FT_Color set(byte blue, byte green, byte red, byte alpha) {
        blue(blue);
        green(green);
        red(red);
        alpha(alpha);
        return this;
    }

    public FT_Color set(FT_Color src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Color malloc() {
        return new FT_Color(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Color calloc() {
        return new FT_Color(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Color create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Color(MemoryUtil.memAddress(container), container);
    }

    public static FT_Color create(long address) {
        return new FT_Color(address, null);
    }

    public static FT_Color createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Color(address, null);
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

    public static FT_Color malloc(MemoryStack stack) {
        return new FT_Color(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Color calloc(MemoryStack stack) {
        return new FT_Color(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte nblue(long struct) {
        return MemoryUtil.memGetByte(struct + BLUE);
    }

    public static byte ngreen(long struct) {
        return MemoryUtil.memGetByte(struct + GREEN);
    }

    public static byte nred(long struct) {
        return MemoryUtil.memGetByte(struct + RED);
    }

    public static byte nalpha(long struct) {
        return MemoryUtil.memGetByte(struct + ALPHA);
    }

    public static void nblue(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BLUE, value);
    }

    public static void ngreen(long struct, byte value) {
        MemoryUtil.memPutByte(struct + GREEN, value);
    }

    public static void nred(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RED, value);
    }

    public static void nalpha(long struct, byte value) {
        MemoryUtil.memPutByte(struct + ALPHA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Color$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Color$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Color, Buffer> implements NativeResource {
        private static final FT_Color ELEMENT_FACTORY = FT_Color.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Color.SIZEOF);
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
        public FT_Color getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Byte")
        public byte blue() {
            return FT_Color.nblue(address());
        }

        @NativeType("FT_Byte")
        public byte green() {
            return FT_Color.ngreen(address());
        }

        @NativeType("FT_Byte")
        public byte red() {
            return FT_Color.nred(address());
        }

        @NativeType("FT_Byte")
        public byte alpha() {
            return FT_Color.nalpha(address());
        }

        public Buffer blue(@NativeType("FT_Byte") byte value) {
            FT_Color.nblue(address(), value);
            return this;
        }

        public Buffer green(@NativeType("FT_Byte") byte value) {
            FT_Color.ngreen(address(), value);
            return this;
        }

        public Buffer red(@NativeType("FT_Byte") byte value) {
            FT_Color.nred(address(), value);
            return this;
        }

        public Buffer alpha(@NativeType("FT_Byte") byte value) {
            FT_Color.nalpha(address(), value);
            return this;
        }
    }
}
