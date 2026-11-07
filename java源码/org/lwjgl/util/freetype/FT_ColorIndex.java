package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorIndex.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorIndex.class */
public class FT_ColorIndex extends Struct<FT_ColorIndex> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PALETTE_INDEX;
    public static final int ALPHA;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PALETTE_INDEX = layout.offsetof(0);
        ALPHA = layout.offsetof(1);
    }

    protected FT_ColorIndex(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_ColorIndex create(long address, ByteBuffer container) {
        return new FT_ColorIndex(address, container);
    }

    public FT_ColorIndex(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_UInt16")
    public short palette_index() {
        return npalette_index(address());
    }

    @NativeType("FT_F2Dot14")
    public short alpha() {
        return nalpha(address());
    }

    public static FT_ColorIndex create(long address) {
        return new FT_ColorIndex(address, null);
    }

    public static FT_ColorIndex createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_ColorIndex(address, null);
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

    public static short npalette_index(long struct) {
        return MemoryUtil.memGetShort(struct + PALETTE_INDEX);
    }

    public static short nalpha(long struct) {
        return MemoryUtil.memGetShort(struct + ALPHA);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorIndex$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorIndex$Buffer.class */
    public static class Buffer extends StructBuffer<FT_ColorIndex, Buffer> {
        private static final FT_ColorIndex ELEMENT_FACTORY = FT_ColorIndex.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_ColorIndex.SIZEOF);
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
        public FT_ColorIndex getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_UInt16")
        public short palette_index() {
            return FT_ColorIndex.npalette_index(address());
        }

        @NativeType("FT_F2Dot14")
        public short alpha() {
            return FT_ColorIndex.nalpha(address());
        }
    }
}
