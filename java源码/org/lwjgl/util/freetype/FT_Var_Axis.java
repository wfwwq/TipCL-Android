package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Var_Axis.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Var_Axis.class */
public class FT_Var_Axis extends Struct<FT_Var_Axis> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NAME;
    public static final int MINIMUM;
    public static final int DEF;
    public static final int MAXIMUM;
    public static final int TAG;
    public static final int STRID;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NAME = layout.offsetof(0);
        MINIMUM = layout.offsetof(1);
        DEF = layout.offsetof(2);
        MAXIMUM = layout.offsetof(3);
        TAG = layout.offsetof(4);
        STRID = layout.offsetof(5);
    }

    protected FT_Var_Axis(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Var_Axis create(long address, ByteBuffer container) {
        return new FT_Var_Axis(address, container);
    }

    public FT_Var_Axis(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_String *")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("FT_String *")
    public String nameString() {
        return nnameString(address());
    }

    @NativeType("FT_Fixed")
    public long minimum() {
        return nminimum(address());
    }

    @NativeType("FT_Fixed")
    public long def() {
        return ndef(address());
    }

    @NativeType("FT_Fixed")
    public long maximum() {
        return nmaximum(address());
    }

    @NativeType("FT_ULong")
    public long tag() {
        return ntag(address());
    }

    @NativeType("FT_UInt")
    public int strid() {
        return nstrid(address());
    }

    public static FT_Var_Axis create(long address) {
        return new FT_Var_Axis(address, null);
    }

    public static FT_Var_Axis createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Var_Axis(address, null);
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

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static long nminimum(long struct) {
        return MemoryUtil.memGetCLong(struct + MINIMUM);
    }

    public static long ndef(long struct) {
        return MemoryUtil.memGetCLong(struct + DEF);
    }

    public static long nmaximum(long struct) {
        return MemoryUtil.memGetCLong(struct + MAXIMUM);
    }

    public static long ntag(long struct) {
        return MemoryUtil.memGetCLong(struct + TAG);
    }

    public static int nstrid(long struct) {
        return MemoryUtil.memGetInt(struct + STRID);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Var_Axis$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Var_Axis$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Var_Axis, Buffer> {
        private static final FT_Var_Axis ELEMENT_FACTORY = FT_Var_Axis.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Var_Axis.SIZEOF);
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
        public FT_Var_Axis getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_String *")
        public ByteBuffer name() {
            return FT_Var_Axis.nname(address());
        }

        @NativeType("FT_String *")
        public String nameString() {
            return FT_Var_Axis.nnameString(address());
        }

        @NativeType("FT_Fixed")
        public long minimum() {
            return FT_Var_Axis.nminimum(address());
        }

        @NativeType("FT_Fixed")
        public long def() {
            return FT_Var_Axis.ndef(address());
        }

        @NativeType("FT_Fixed")
        public long maximum() {
            return FT_Var_Axis.nmaximum(address());
        }

        @NativeType("FT_ULong")
        public long tag() {
            return FT_Var_Axis.ntag(address());
        }

        @NativeType("FT_UInt")
        public int strid() {
            return FT_Var_Axis.nstrid(address());
        }
    }
}
