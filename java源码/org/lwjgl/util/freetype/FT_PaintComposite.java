package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintComposite.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintComposite.class */
public class FT_PaintComposite extends Struct<FT_PaintComposite> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SOURCE_PAINT;
    public static final int COMPOSITE_MODE;
    public static final int BACKDROP_PAINT;

    static {
        Struct.Layout layout = __struct(__member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF), __member(4), __member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SOURCE_PAINT = layout.offsetof(0);
        COMPOSITE_MODE = layout.offsetof(1);
        BACKDROP_PAINT = layout.offsetof(2);
    }

    protected FT_PaintComposite(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_PaintComposite create(long address, ByteBuffer container) {
        return new FT_PaintComposite(address, container);
    }

    public FT_PaintComposite(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint source_paint() {
        return nsource_paint(address());
    }

    @NativeType("FT_Composite_Mode")
    public int composite_mode() {
        return ncomposite_mode(address());
    }

    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint backdrop_paint() {
        return nbackdrop_paint(address());
    }

    public static FT_PaintComposite create(long address) {
        return new FT_PaintComposite(address, null);
    }

    public static FT_PaintComposite createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_PaintComposite(address, null);
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

    public static FT_OpaquePaint nsource_paint(long struct) {
        return FT_OpaquePaint.create(struct + SOURCE_PAINT);
    }

    public static int ncomposite_mode(long struct) {
        return MemoryUtil.memGetInt(struct + COMPOSITE_MODE);
    }

    public static FT_OpaquePaint nbackdrop_paint(long struct) {
        return FT_OpaquePaint.create(struct + BACKDROP_PAINT);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintComposite$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_PaintComposite$Buffer.class */
    public static class Buffer extends StructBuffer<FT_PaintComposite, Buffer> {
        private static final FT_PaintComposite ELEMENT_FACTORY = FT_PaintComposite.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_PaintComposite.SIZEOF);
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
        public FT_PaintComposite getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint source_paint() {
            return FT_PaintComposite.nsource_paint(address());
        }

        @NativeType("FT_Composite_Mode")
        public int composite_mode() {
            return FT_PaintComposite.ncomposite_mode(address());
        }

        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint backdrop_paint() {
            return FT_PaintComposite.nbackdrop_paint(address());
        }
    }
}
