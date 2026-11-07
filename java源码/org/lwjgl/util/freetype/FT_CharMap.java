package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_CharMap.class
 */
@NativeType("struct FT_CharMapRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_CharMap.class */
public class FT_CharMap extends Struct<FT_CharMap> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FACE;
    public static final int ENCODING;
    public static final int PLATFORM_ID;
    public static final int ENCODING_ID;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FACE = layout.offsetof(0);
        ENCODING = layout.offsetof(1);
        PLATFORM_ID = layout.offsetof(2);
        ENCODING_ID = layout.offsetof(3);
    }

    protected FT_CharMap(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_CharMap create(long address, ByteBuffer container) {
        return new FT_CharMap(address, container);
    }

    public FT_CharMap(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public FT_Face face() {
        return nface(address());
    }

    @NativeType("FT_Encoding")
    public int encoding() {
        return nencoding(address());
    }

    @NativeType("FT_UShort")
    public short platform_id() {
        return nplatform_id(address());
    }

    @NativeType("FT_UShort")
    public short encoding_id() {
        return nencoding_id(address());
    }

    public static FT_CharMap create(long address) {
        return new FT_CharMap(address, null);
    }

    public static FT_CharMap createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_CharMap(address, null);
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

    public static FT_Face nface(long struct) {
        return FT_Face.create(MemoryUtil.memGetAddress(struct + FACE));
    }

    public static int nencoding(long struct) {
        return MemoryUtil.memGetInt(struct + ENCODING);
    }

    public static short nplatform_id(long struct) {
        return MemoryUtil.memGetShort(struct + PLATFORM_ID);
    }

    public static short nencoding_id(long struct) {
        return MemoryUtil.memGetShort(struct + ENCODING_ID);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_CharMap$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_CharMap$Buffer.class */
    public static class Buffer extends StructBuffer<FT_CharMap, Buffer> {
        private static final FT_CharMap ELEMENT_FACTORY = FT_CharMap.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_CharMap.SIZEOF);
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
        public FT_CharMap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public FT_Face face() {
            return FT_CharMap.nface(address());
        }

        @NativeType("FT_Encoding")
        public int encoding() {
            return FT_CharMap.nencoding(address());
        }

        @NativeType("FT_UShort")
        public short platform_id() {
            return FT_CharMap.nplatform_id(address());
        }

        @NativeType("FT_UShort")
        public short encoding_id() {
            return FT_CharMap.nencoding_id(address());
        }
    }
}
