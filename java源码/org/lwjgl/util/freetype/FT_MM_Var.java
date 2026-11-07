package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.util.freetype.FT_Var_Axis;
import org.lwjgl.util.freetype.FT_Var_Named_Style;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_MM_Var.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_MM_Var.class */
public class FT_MM_Var extends Struct<FT_MM_Var> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NUM_AXIS;
    public static final int NUM_DESIGNS;
    public static final int NUM_NAMEDSTYLES;
    public static final int AXIS;
    public static final int NAMEDSTYLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NUM_AXIS = layout.offsetof(0);
        NUM_DESIGNS = layout.offsetof(1);
        NUM_NAMEDSTYLES = layout.offsetof(2);
        AXIS = layout.offsetof(3);
        NAMEDSTYLE = layout.offsetof(4);
    }

    protected FT_MM_Var(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_MM_Var create(long address, ByteBuffer container) {
        return new FT_MM_Var(address, container);
    }

    public FT_MM_Var(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_UInt")
    public int num_axis() {
        return nnum_axis(address());
    }

    @NativeType("FT_UInt")
    public int num_designs() {
        return nnum_designs(address());
    }

    @NativeType("FT_UInt")
    public int num_namedstyles() {
        return nnum_namedstyles(address());
    }

    @NativeType("FT_Var_Axis *")
    public FT_Var_Axis.Buffer axis() {
        return naxis(address());
    }

    @NativeType("FT_Var_Named_Style *")
    public FT_Var_Named_Style.Buffer namedstyle() {
        return nnamedstyle(address());
    }

    public static FT_MM_Var create(long address) {
        return new FT_MM_Var(address, null);
    }

    public static FT_MM_Var createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_MM_Var(address, null);
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

    public static int nnum_axis(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_AXIS);
    }

    public static int nnum_designs(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_DESIGNS);
    }

    public static int nnum_namedstyles(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_NAMEDSTYLES);
    }

    public static FT_Var_Axis.Buffer naxis(long struct) {
        return FT_Var_Axis.create(MemoryUtil.memGetAddress(struct + AXIS), nnum_axis(struct));
    }

    public static FT_Var_Named_Style.Buffer nnamedstyle(long struct) {
        return FT_Var_Named_Style.create(MemoryUtil.memGetAddress(struct + NAMEDSTYLE), nnum_namedstyles(struct));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_MM_Var$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_MM_Var$Buffer.class */
    public static class Buffer extends StructBuffer<FT_MM_Var, Buffer> {
        private static final FT_MM_Var ELEMENT_FACTORY = FT_MM_Var.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_MM_Var.SIZEOF);
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
        public FT_MM_Var getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_UInt")
        public int num_axis() {
            return FT_MM_Var.nnum_axis(address());
        }

        @NativeType("FT_UInt")
        public int num_designs() {
            return FT_MM_Var.nnum_designs(address());
        }

        @NativeType("FT_UInt")
        public int num_namedstyles() {
            return FT_MM_Var.nnum_namedstyles(address());
        }

        @NativeType("FT_Var_Axis *")
        public FT_Var_Axis.Buffer axis() {
            return FT_MM_Var.naxis(address());
        }

        @NativeType("FT_Var_Named_Style *")
        public FT_Var_Named_Style.Buffer namedstyle() {
            return FT_MM_Var.nnamedstyle(address());
        }
    }
}
