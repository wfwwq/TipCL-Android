package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.CLongBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Var_Named_Style.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Var_Named_Style.class */
public class FT_Var_Named_Style extends Struct<FT_Var_Named_Style> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COORDS;
    public static final int STRID;
    public static final int PSID;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COORDS = layout.offsetof(0);
        STRID = layout.offsetof(1);
        PSID = layout.offsetof(2);
    }

    protected FT_Var_Named_Style(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Var_Named_Style create(long address, ByteBuffer container) {
        return new FT_Var_Named_Style(address, container);
    }

    public FT_Var_Named_Style(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Fixed *")
    public CLongBuffer coords(int capacity) {
        return ncoords(address(), capacity);
    }

    @NativeType("FT_UInt")
    public int strid() {
        return nstrid(address());
    }

    @NativeType("FT_UInt")
    public int psid() {
        return npsid(address());
    }

    public static FT_Var_Named_Style create(long address) {
        return new FT_Var_Named_Style(address, null);
    }

    public static FT_Var_Named_Style createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Var_Named_Style(address, null);
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

    public static CLongBuffer ncoords(long struct, int capacity) {
        return MemoryUtil.memCLongBuffer(MemoryUtil.memGetAddress(struct + COORDS), capacity);
    }

    public static int nstrid(long struct) {
        return MemoryUtil.memGetInt(struct + STRID);
    }

    public static int npsid(long struct) {
        return MemoryUtil.memGetInt(struct + PSID);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Var_Named_Style$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Var_Named_Style$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Var_Named_Style, Buffer> {
        private static final FT_Var_Named_Style ELEMENT_FACTORY = FT_Var_Named_Style.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Var_Named_Style.SIZEOF);
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
        public FT_Var_Named_Style getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Fixed *")
        public CLongBuffer coords(int capacity) {
            return FT_Var_Named_Style.ncoords(address(), capacity);
        }

        @NativeType("FT_UInt")
        public int strid() {
            return FT_Var_Named_Style.nstrid(address());
        }

        @NativeType("FT_UInt")
        public int psid() {
            return FT_Var_Named_Style.npsid(address());
        }
    }
}
