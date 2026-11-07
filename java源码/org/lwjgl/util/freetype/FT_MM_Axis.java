package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_MM_Axis.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_MM_Axis.class */
public class FT_MM_Axis extends Struct<FT_MM_Axis> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NAME;
    public static final int MINIMUM;
    public static final int MAXIMUM;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NAME = layout.offsetof(0);
        MINIMUM = layout.offsetof(1);
        MAXIMUM = layout.offsetof(2);
    }

    protected FT_MM_Axis(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_MM_Axis create(long address, ByteBuffer container) {
        return new FT_MM_Axis(address, container);
    }

    public FT_MM_Axis(ByteBuffer container) {
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

    @NativeType("FT_Long")
    public long minimum() {
        return nminimum(address());
    }

    @NativeType("FT_Long")
    public long maximum() {
        return nmaximum(address());
    }

    public static FT_MM_Axis create(long address) {
        return new FT_MM_Axis(address, null);
    }

    public static FT_MM_Axis createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_MM_Axis(address, null);
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

    public static long nmaximum(long struct) {
        return MemoryUtil.memGetCLong(struct + MAXIMUM);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_MM_Axis$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_MM_Axis$Buffer.class */
    public static class Buffer extends StructBuffer<FT_MM_Axis, Buffer> {
        private static final FT_MM_Axis ELEMENT_FACTORY = FT_MM_Axis.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_MM_Axis.SIZEOF);
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
        public FT_MM_Axis getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_String *")
        public ByteBuffer name() {
            return FT_MM_Axis.nname(address());
        }

        @NativeType("FT_String *")
        public String nameString() {
            return FT_MM_Axis.nnameString(address());
        }

        @NativeType("FT_Long")
        public long minimum() {
            return FT_MM_Axis.nminimum(address());
        }

        @NativeType("FT_Long")
        public long maximum() {
            return FT_MM_Axis.nmaximum(address());
        }
    }
}
