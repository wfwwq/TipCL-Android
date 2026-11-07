package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Internal.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Internal.class */
public class FT_Size_Internal extends Struct<FT_Size_Internal> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MODULE_DATA;
    public static final int AUTOHINT_MODE;
    public static final int AUTOHINT_METRICS;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(FT_Size_Metrics.SIZEOF, FT_Size_Metrics.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MODULE_DATA = layout.offsetof(0);
        AUTOHINT_MODE = layout.offsetof(1);
        AUTOHINT_METRICS = layout.offsetof(2);
    }

    protected FT_Size_Internal(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Size_Internal create(long address, ByteBuffer container) {
        return new FT_Size_Internal(address, container);
    }

    public FT_Size_Internal(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("void *")
    public long module_data() {
        return nmodule_data(address());
    }

    @NativeType("FT_Render_Mode")
    public int autohint_mode() {
        return nautohint_mode(address());
    }

    public FT_Size_Metrics autohint_metrics() {
        return nautohint_metrics(address());
    }

    public static FT_Size_Internal create(long address) {
        return new FT_Size_Internal(address, null);
    }

    public static FT_Size_Internal createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Size_Internal(address, null);
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

    public static long nmodule_data(long struct) {
        return MemoryUtil.memGetAddress(struct + MODULE_DATA);
    }

    public static int nautohint_mode(long struct) {
        return MemoryUtil.memGetInt(struct + AUTOHINT_MODE);
    }

    public static FT_Size_Metrics nautohint_metrics(long struct) {
        return FT_Size_Metrics.create(struct + AUTOHINT_METRICS);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Internal$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Internal$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Size_Internal, Buffer> {
        private static final FT_Size_Internal ELEMENT_FACTORY = FT_Size_Internal.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Size_Internal.SIZEOF);
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
        public FT_Size_Internal getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("void *")
        public long module_data() {
            return FT_Size_Internal.nmodule_data(address());
        }

        @NativeType("FT_Render_Mode")
        public int autohint_mode() {
            return FT_Size_Internal.nautohint_mode(address());
        }

        public FT_Size_Metrics autohint_metrics() {
            return FT_Size_Internal.nautohint_metrics(address());
        }
    }
}
