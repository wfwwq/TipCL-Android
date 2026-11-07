package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_ImageType.class
 */
@NativeType("struct FTC_ImageTypeRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_ImageType.class */
public class FTC_ImageType extends Struct<FTC_ImageType> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FACE_ID;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FACE_ID = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected FTC_ImageType(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FTC_ImageType create(long address, ByteBuffer container) {
        return new FTC_ImageType(address, container);
    }

    public FTC_ImageType(ByteBuffer container) {
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

    @NativeType("FT_Int32")
    public int flags() {
        return nflags(address());
    }

    public static FTC_ImageType create(long address) {
        return new FTC_ImageType(address, null);
    }

    public static FTC_ImageType createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FTC_ImageType(address, null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_ImageType$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FTC_ImageType$Buffer.class */
    public static class Buffer extends StructBuffer<FTC_ImageType, Buffer> {
        private static final FTC_ImageType ELEMENT_FACTORY = FTC_ImageType.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FTC_ImageType.SIZEOF);
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
        public FTC_ImageType getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FTC_FaceID")
        public long face_id() {
            return FTC_ImageType.nface_id(address());
        }

        @NativeType("FT_UInt")
        public int width() {
            return FTC_ImageType.nwidth(address());
        }

        @NativeType("FT_UInt")
        public int height() {
            return FTC_ImageType.nheight(address());
        }

        @NativeType("FT_Int32")
        public int flags() {
            return FTC_ImageType.nflags(address());
        }
    }
}
