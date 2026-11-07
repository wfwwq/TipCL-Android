package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorStop.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorStop.class */
public class FT_ColorStop extends Struct<FT_ColorStop> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STOP_OFFSET;
    public static final int COLOR;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(FT_ColorIndex.SIZEOF, FT_ColorIndex.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STOP_OFFSET = layout.offsetof(0);
        COLOR = layout.offsetof(1);
    }

    protected FT_ColorStop(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_ColorStop create(long address, ByteBuffer container) {
        return new FT_ColorStop(address, container);
    }

    public FT_ColorStop(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Fixed")
    public long stop_offset() {
        return nstop_offset(address());
    }

    public FT_ColorIndex color() {
        return ncolor(address());
    }

    public static FT_ColorStop malloc() {
        return new FT_ColorStop(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_ColorStop calloc() {
        return new FT_ColorStop(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_ColorStop create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_ColorStop(MemoryUtil.memAddress(container), container);
    }

    public static FT_ColorStop create(long address) {
        return new FT_ColorStop(address, null);
    }

    public static FT_ColorStop createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_ColorStop(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
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

    public static FT_ColorStop malloc(MemoryStack stack) {
        return new FT_ColorStop(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_ColorStop calloc(MemoryStack stack) {
        return new FT_ColorStop(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nstop_offset(long struct) {
        return MemoryUtil.memGetCLong(struct + STOP_OFFSET);
    }

    public static FT_ColorIndex ncolor(long struct) {
        return FT_ColorIndex.create(struct + COLOR);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorStop$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ColorStop$Buffer.class */
    public static class Buffer extends StructBuffer<FT_ColorStop, Buffer> implements NativeResource {
        private static final FT_ColorStop ELEMENT_FACTORY = FT_ColorStop.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_ColorStop.SIZEOF);
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
        public FT_ColorStop getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Fixed")
        public long stop_offset() {
            return FT_ColorStop.nstop_offset(address());
        }

        public FT_ColorIndex color() {
            return FT_ColorStop.ncolor(address());
        }
    }
}
