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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_Funcs.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_Funcs.class */
public class FT_Outline_Funcs extends Struct<FT_Outline_Funcs> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MOVE_TO;
    public static final int LINE_TO;
    public static final int CONIC_TO;
    public static final int CUBIC_TO;
    public static final int SHIFT;
    public static final int DELTA;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MOVE_TO = layout.offsetof(0);
        LINE_TO = layout.offsetof(1);
        CONIC_TO = layout.offsetof(2);
        CUBIC_TO = layout.offsetof(3);
        SHIFT = layout.offsetof(4);
        DELTA = layout.offsetof(5);
    }

    protected FT_Outline_Funcs(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Outline_Funcs create(long address, ByteBuffer container) {
        return new FT_Outline_Funcs(address, container);
    }

    public FT_Outline_Funcs(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public FT_Outline_MoveToFunc move_to() {
        return nmove_to(address());
    }

    public FT_Outline_LineToFunc line_to() {
        return nline_to(address());
    }

    public FT_Outline_ConicToFunc conic_to() {
        return nconic_to(address());
    }

    public FT_Outline_CubicToFunc cubic_to() {
        return ncubic_to(address());
    }

    public int shift() {
        return nshift(address());
    }

    @NativeType("FT_Pos")
    public long delta() {
        return ndelta(address());
    }

    public FT_Outline_Funcs move_to(@NativeType("FT_Outline_MoveToFunc") FT_Outline_MoveToFuncI value) {
        nmove_to(address(), value);
        return this;
    }

    public FT_Outline_Funcs line_to(@NativeType("FT_Outline_LineToFunc") FT_Outline_LineToFuncI value) {
        nline_to(address(), value);
        return this;
    }

    public FT_Outline_Funcs conic_to(@NativeType("FT_Outline_ConicToFunc") FT_Outline_ConicToFuncI value) {
        nconic_to(address(), value);
        return this;
    }

    public FT_Outline_Funcs cubic_to(@NativeType("FT_Outline_CubicToFunc") FT_Outline_CubicToFuncI value) {
        ncubic_to(address(), value);
        return this;
    }

    public FT_Outline_Funcs shift(int value) {
        nshift(address(), value);
        return this;
    }

    public FT_Outline_Funcs delta(@NativeType("FT_Pos") long value) {
        ndelta(address(), value);
        return this;
    }

    public FT_Outline_Funcs set(FT_Outline_MoveToFuncI move_to, FT_Outline_LineToFuncI line_to, FT_Outline_ConicToFuncI conic_to, FT_Outline_CubicToFuncI cubic_to, int shift, long delta) {
        move_to(move_to);
        line_to(line_to);
        conic_to(conic_to);
        cubic_to(cubic_to);
        shift(shift);
        delta(delta);
        return this;
    }

    public FT_Outline_Funcs set(FT_Outline_Funcs src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Outline_Funcs malloc() {
        return new FT_Outline_Funcs(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Outline_Funcs calloc() {
        return new FT_Outline_Funcs(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Outline_Funcs create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Outline_Funcs(MemoryUtil.memAddress(container), container);
    }

    public static FT_Outline_Funcs create(long address) {
        return new FT_Outline_Funcs(address, null);
    }

    public static FT_Outline_Funcs createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Outline_Funcs(address, null);
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

    public static FT_Outline_Funcs malloc(MemoryStack stack) {
        return new FT_Outline_Funcs(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Outline_Funcs calloc(MemoryStack stack) {
        return new FT_Outline_Funcs(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FT_Outline_MoveToFunc nmove_to(long struct) {
        return FT_Outline_MoveToFunc.createSafe(MemoryUtil.memGetAddress(struct + MOVE_TO));
    }

    public static FT_Outline_LineToFunc nline_to(long struct) {
        return FT_Outline_LineToFunc.createSafe(MemoryUtil.memGetAddress(struct + LINE_TO));
    }

    public static FT_Outline_ConicToFunc nconic_to(long struct) {
        return FT_Outline_ConicToFunc.createSafe(MemoryUtil.memGetAddress(struct + CONIC_TO));
    }

    public static FT_Outline_CubicToFunc ncubic_to(long struct) {
        return FT_Outline_CubicToFunc.createSafe(MemoryUtil.memGetAddress(struct + CUBIC_TO));
    }

    public static int nshift(long struct) {
        return MemoryUtil.memGetInt(struct + SHIFT);
    }

    public static long ndelta(long struct) {
        return MemoryUtil.memGetCLong(struct + DELTA);
    }

    public static void nmove_to(long struct, FT_Outline_MoveToFuncI value) {
        MemoryUtil.memPutAddress(struct + MOVE_TO, MemoryUtil.memAddressSafe(value));
    }

    public static void nline_to(long struct, FT_Outline_LineToFuncI value) {
        MemoryUtil.memPutAddress(struct + LINE_TO, MemoryUtil.memAddressSafe(value));
    }

    public static void nconic_to(long struct, FT_Outline_ConicToFuncI value) {
        MemoryUtil.memPutAddress(struct + CONIC_TO, MemoryUtil.memAddressSafe(value));
    }

    public static void ncubic_to(long struct, FT_Outline_CubicToFuncI value) {
        MemoryUtil.memPutAddress(struct + CUBIC_TO, MemoryUtil.memAddressSafe(value));
    }

    public static void nshift(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHIFT, value);
    }

    public static void ndelta(long struct, long value) {
        MemoryUtil.memPutCLong(struct + DELTA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_Funcs$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Outline_Funcs$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Outline_Funcs, Buffer> implements NativeResource {
        private static final FT_Outline_Funcs ELEMENT_FACTORY = FT_Outline_Funcs.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Outline_Funcs.SIZEOF);
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
        public FT_Outline_Funcs getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public FT_Outline_MoveToFunc move_to() {
            return FT_Outline_Funcs.nmove_to(address());
        }

        public FT_Outline_LineToFunc line_to() {
            return FT_Outline_Funcs.nline_to(address());
        }

        public FT_Outline_ConicToFunc conic_to() {
            return FT_Outline_Funcs.nconic_to(address());
        }

        public FT_Outline_CubicToFunc cubic_to() {
            return FT_Outline_Funcs.ncubic_to(address());
        }

        public int shift() {
            return FT_Outline_Funcs.nshift(address());
        }

        @NativeType("FT_Pos")
        public long delta() {
            return FT_Outline_Funcs.ndelta(address());
        }

        public Buffer move_to(@NativeType("FT_Outline_MoveToFunc") FT_Outline_MoveToFuncI value) {
            FT_Outline_Funcs.nmove_to(address(), value);
            return this;
        }

        public Buffer line_to(@NativeType("FT_Outline_LineToFunc") FT_Outline_LineToFuncI value) {
            FT_Outline_Funcs.nline_to(address(), value);
            return this;
        }

        public Buffer conic_to(@NativeType("FT_Outline_ConicToFunc") FT_Outline_ConicToFuncI value) {
            FT_Outline_Funcs.nconic_to(address(), value);
            return this;
        }

        public Buffer cubic_to(@NativeType("FT_Outline_CubicToFunc") FT_Outline_CubicToFuncI value) {
            FT_Outline_Funcs.ncubic_to(address(), value);
            return this;
        }

        public Buffer shift(int value) {
            FT_Outline_Funcs.nshift(address(), value);
            return this;
        }

        public Buffer delta(@NativeType("FT_Pos") long value) {
            FT_Outline_Funcs.ndelta(address(), value);
            return this;
        }
    }
}
