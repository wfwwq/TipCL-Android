package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Span.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Span.class */
public class FT_Span extends Struct<FT_Span> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int LEN;
    public static final int COVERAGE;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        LEN = layout.offsetof(1);
        COVERAGE = layout.offsetof(2);
    }

    protected FT_Span(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Span create(long address, ByteBuffer container) {
        return new FT_Span(address, container);
    }

    public FT_Span(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public short x() {
        return nx(address());
    }

    @NativeType("unsigned short")
    public short len() {
        return nlen(address());
    }

    @NativeType("unsigned char")
    public byte coverage() {
        return ncoverage(address());
    }

    public static FT_Span create(long address) {
        return new FT_Span(address, null);
    }

    public static FT_Span createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Span(address, null);
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

    public static short nx(long struct) {
        return MemoryUtil.memGetShort(struct + X);
    }

    public static short nlen(long struct) {
        return MemoryUtil.memGetShort(struct + LEN);
    }

    public static byte ncoverage(long struct) {
        return MemoryUtil.memGetByte(struct + COVERAGE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Span$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Span$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Span, Buffer> {
        private static final FT_Span ELEMENT_FACTORY = FT_Span.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Span.SIZEOF);
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
        public FT_Span getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public short x() {
            return FT_Span.nx(address());
        }

        @NativeType("unsigned short")
        public short len() {
            return FT_Span.nlen(address());
        }

        @NativeType("unsigned char")
        public byte coverage() {
            return FT_Span.ncoverage(address());
        }
    }
}
