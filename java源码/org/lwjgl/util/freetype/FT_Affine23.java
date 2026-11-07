package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Affine23.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Affine23.class */
public class FT_Affine23 extends Struct<FT_Affine23> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int XX;
    public static final int XY;
    public static final int DX;
    public static final int YX;
    public static final int YY;
    public static final int DY;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        XX = layout.offsetof(0);
        XY = layout.offsetof(1);
        DX = layout.offsetof(2);
        YX = layout.offsetof(3);
        YY = layout.offsetof(4);
        DY = layout.offsetof(5);
    }

    protected FT_Affine23(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Affine23 create(long address, ByteBuffer container) {
        return new FT_Affine23(address, container);
    }

    public FT_Affine23(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Fixed")
    public long xx() {
        return nxx(address());
    }

    @NativeType("FT_Fixed")
    public long xy() {
        return nxy(address());
    }

    @NativeType("FT_Fixed")
    public long dx() {
        return ndx(address());
    }

    @NativeType("FT_Fixed")
    public long yx() {
        return nyx(address());
    }

    @NativeType("FT_Fixed")
    public long yy() {
        return nyy(address());
    }

    @NativeType("FT_Fixed")
    public long dy() {
        return ndy(address());
    }

    public static FT_Affine23 create(long address) {
        return new FT_Affine23(address, null);
    }

    public static FT_Affine23 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Affine23(address, null);
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

    public static long nxx(long struct) {
        return MemoryUtil.memGetCLong(struct + XX);
    }

    public static long nxy(long struct) {
        return MemoryUtil.memGetCLong(struct + XY);
    }

    public static long ndx(long struct) {
        return MemoryUtil.memGetCLong(struct + DX);
    }

    public static long nyx(long struct) {
        return MemoryUtil.memGetCLong(struct + YX);
    }

    public static long nyy(long struct) {
        return MemoryUtil.memGetCLong(struct + YY);
    }

    public static long ndy(long struct) {
        return MemoryUtil.memGetCLong(struct + DY);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Affine23$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Affine23$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Affine23, Buffer> {
        private static final FT_Affine23 ELEMENT_FACTORY = FT_Affine23.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Affine23.SIZEOF);
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
        public FT_Affine23 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Fixed")
        public long xx() {
            return FT_Affine23.nxx(address());
        }

        @NativeType("FT_Fixed")
        public long xy() {
            return FT_Affine23.nxy(address());
        }

        @NativeType("FT_Fixed")
        public long dx() {
            return FT_Affine23.ndx(address());
        }

        @NativeType("FT_Fixed")
        public long yx() {
            return FT_Affine23.nyx(address());
        }

        @NativeType("FT_Fixed")
        public long yy() {
            return FT_Affine23.nyy(address());
        }

        @NativeType("FT_Fixed")
        public long dy() {
            return FT_Affine23.ndy(address());
        }
    }
}
