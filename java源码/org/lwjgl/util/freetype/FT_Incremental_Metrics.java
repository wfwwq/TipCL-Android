package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_Metrics.class
 */
@NativeType("struct FT_Incremental_MetricsRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_Metrics.class */
public class FT_Incremental_Metrics extends Struct<FT_Incremental_Metrics> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BEARING_X;
    public static final int BEARING_Y;
    public static final int ADVANCE;
    public static final int ADVANCE_V;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BEARING_X = layout.offsetof(0);
        BEARING_Y = layout.offsetof(1);
        ADVANCE = layout.offsetof(2);
        ADVANCE_V = layout.offsetof(3);
    }

    protected FT_Incremental_Metrics(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Incremental_Metrics create(long address, ByteBuffer container) {
        return new FT_Incremental_Metrics(address, container);
    }

    public FT_Incremental_Metrics(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Long")
    public long bearing_x() {
        return nbearing_x(address());
    }

    @NativeType("FT_Long")
    public long bearing_y() {
        return nbearing_y(address());
    }

    @NativeType("FT_Long")
    public long advance() {
        return nadvance(address());
    }

    @NativeType("FT_Long")
    public long advance_v() {
        return nadvance_v(address());
    }

    public static FT_Incremental_Metrics create(long address) {
        return new FT_Incremental_Metrics(address, null);
    }

    public static FT_Incremental_Metrics createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Incremental_Metrics(address, null);
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

    public static long nbearing_x(long struct) {
        return MemoryUtil.memGetCLong(struct + BEARING_X);
    }

    public static long nbearing_y(long struct) {
        return MemoryUtil.memGetCLong(struct + BEARING_Y);
    }

    public static long nadvance(long struct) {
        return MemoryUtil.memGetCLong(struct + ADVANCE);
    }

    public static long nadvance_v(long struct) {
        return MemoryUtil.memGetCLong(struct + ADVANCE_V);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_Metrics$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_Metrics$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Incremental_Metrics, Buffer> {
        private static final FT_Incremental_Metrics ELEMENT_FACTORY = FT_Incremental_Metrics.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Incremental_Metrics.SIZEOF);
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
        public FT_Incremental_Metrics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Long")
        public long bearing_x() {
            return FT_Incremental_Metrics.nbearing_x(address());
        }

        @NativeType("FT_Long")
        public long bearing_y() {
            return FT_Incremental_Metrics.nbearing_y(address());
        }

        @NativeType("FT_Long")
        public long advance() {
            return FT_Incremental_Metrics.nadvance(address());
        }

        @NativeType("FT_Long")
        public long advance_v() {
            return FT_Incremental_Metrics.nadvance_v(address());
        }
    }
}
