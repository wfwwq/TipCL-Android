package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_Scaler.class
 */
@NativeType("struct FTC_ScalerRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_Scaler.class */
public class FTC_Scaler extends Struct<FTC_Scaler> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FACE_ID;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int PIXEL;
    public static final int X_RES;
    public static final int Y_RES;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FACE_ID = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        PIXEL = layout.offsetof(3);
        X_RES = layout.offsetof(4);
        Y_RES = layout.offsetof(5);
    }

    protected FTC_Scaler(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FTC_Scaler create(long address, ByteBuffer container) {
        return new FTC_Scaler(address, container);
    }

    public FTC_Scaler(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FTC_FaceID")
    public long face_id() {
        return nface_id(address());
    }

    @NativeType("FT_UInt")
    public int width() {
        return nwidth(address());
    }

    @NativeType("FT_UInt")
    public int height() {
        return nheight(address());
    }

    @NativeType("FT_Int")
    public int pixel() {
        return npixel(address());
    }

    @NativeType("FT_UInt")
    public int x_res() {
        return nx_res(address());
    }

    @NativeType("FT_UInt")
    public int y_res() {
        return ny_res(address());
    }

    public static FTC_Scaler create(long address) {
        return new FTC_Scaler(address, null);
    }

    public static FTC_Scaler createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FTC_Scaler(address, null);
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

    public static long nface_id(long struct) {
        return MemoryUtil.memGetAddress(struct + FACE_ID);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int npixel(long struct) {
        return MemoryUtil.memGetInt(struct + PIXEL);
    }

    public static int nx_res(long struct) {
        return MemoryUtil.memGetInt(struct + X_RES);
    }

    public static int ny_res(long struct) {
        return MemoryUtil.memGetInt(struct + Y_RES);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_Scaler$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_Scaler$Buffer.class */
    public static class Buffer extends StructBuffer<FTC_Scaler, Buffer> {
        private static final FTC_Scaler ELEMENT_FACTORY = FTC_Scaler.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FTC_Scaler.SIZEOF);
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
        public FTC_Scaler getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FTC_FaceID")
        public long face_id() {
            return FTC_Scaler.nface_id(address());
        }

        @NativeType("FT_UInt")
        public int width() {
            return FTC_Scaler.nwidth(address());
        }

        @NativeType("FT_UInt")
        public int height() {
            return FTC_Scaler.nheight(address());
        }

        @NativeType("FT_Int")
        public int pixel() {
            return FTC_Scaler.npixel(address());
        }

        @NativeType("FT_UInt")
        public int x_res() {
            return FTC_Scaler.nx_res(address());
        }

        @NativeType("FT_UInt")
        public int y_res() {
            return FTC_Scaler.ny_res(address());
        }
    }
}
