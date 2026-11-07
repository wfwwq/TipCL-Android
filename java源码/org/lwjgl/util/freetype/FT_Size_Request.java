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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Request.class
 */
@NativeType("struct FT_Size_RequestRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Request.class */
public class FT_Size_Request extends Struct<FT_Size_Request> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int HORIRESOLUTION;
    public static final int VERTRESOLUTION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        HORIRESOLUTION = layout.offsetof(3);
        VERTRESOLUTION = layout.offsetof(4);
    }

    protected FT_Size_Request(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Size_Request create(long address, ByteBuffer container) {
        return new FT_Size_Request(address, container);
    }

    public FT_Size_Request(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Size_Request_Type")
    public int type() {
        return ntype(address());
    }

    @NativeType("FT_Long")
    public long width() {
        return nwidth(address());
    }

    @NativeType("FT_Long")
    public long height() {
        return nheight(address());
    }

    @NativeType("FT_UInt")
    public int horiResolution() {
        return nhoriResolution(address());
    }

    @NativeType("FT_UInt")
    public int vertResolution() {
        return nvertResolution(address());
    }

    public FT_Size_Request type(@NativeType("FT_Size_Request_Type") int value) {
        ntype(address(), value);
        return this;
    }

    public FT_Size_Request width(@NativeType("FT_Long") long value) {
        nwidth(address(), value);
        return this;
    }

    public FT_Size_Request height(@NativeType("FT_Long") long value) {
        nheight(address(), value);
        return this;
    }

    public FT_Size_Request horiResolution(@NativeType("FT_UInt") int value) {
        nhoriResolution(address(), value);
        return this;
    }

    public FT_Size_Request vertResolution(@NativeType("FT_UInt") int value) {
        nvertResolution(address(), value);
        return this;
    }

    public FT_Size_Request set(int type, long width, long height, int horiResolution, int vertResolution) {
        type(type);
        width(width);
        height(height);
        horiResolution(horiResolution);
        vertResolution(vertResolution);
        return this;
    }

    public FT_Size_Request set(FT_Size_Request src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Size_Request malloc() {
        return new FT_Size_Request(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Size_Request calloc() {
        return new FT_Size_Request(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Size_Request create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Size_Request(MemoryUtil.memAddress(container), container);
    }

    public static FT_Size_Request create(long address) {
        return new FT_Size_Request(address, null);
    }

    public static FT_Size_Request createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Size_Request(address, null);
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

    public static FT_Size_Request malloc(MemoryStack stack) {
        return new FT_Size_Request(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Size_Request calloc(MemoryStack stack) {
        return new FT_Size_Request(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static long nwidth(long struct) {
        return MemoryUtil.memGetCLong(struct + WIDTH);
    }

    public static long nheight(long struct) {
        return MemoryUtil.memGetCLong(struct + HEIGHT);
    }

    public static int nhoriResolution(long struct) {
        return MemoryUtil.memGetInt(struct + HORIRESOLUTION);
    }

    public static int nvertResolution(long struct) {
        return MemoryUtil.memGetInt(struct + VERTRESOLUTION);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nwidth(long struct, long value) {
        MemoryUtil.memPutCLong(struct + WIDTH, value);
    }

    public static void nheight(long struct, long value) {
        MemoryUtil.memPutCLong(struct + HEIGHT, value);
    }

    public static void nhoriResolution(long struct, int value) {
        MemoryUtil.memPutInt(struct + HORIRESOLUTION, value);
    }

    public static void nvertResolution(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTRESOLUTION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Request$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size_Request$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Size_Request, Buffer> implements NativeResource {
        private static final FT_Size_Request ELEMENT_FACTORY = FT_Size_Request.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Size_Request.SIZEOF);
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
        public FT_Size_Request getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Size_Request_Type")
        public int type() {
            return FT_Size_Request.ntype(address());
        }

        @NativeType("FT_Long")
        public long width() {
            return FT_Size_Request.nwidth(address());
        }

        @NativeType("FT_Long")
        public long height() {
            return FT_Size_Request.nheight(address());
        }

        @NativeType("FT_UInt")
        public int horiResolution() {
            return FT_Size_Request.nhoriResolution(address());
        }

        @NativeType("FT_UInt")
        public int vertResolution() {
            return FT_Size_Request.nvertResolution(address());
        }

        public Buffer type(@NativeType("FT_Size_Request_Type") int value) {
            FT_Size_Request.ntype(address(), value);
            return this;
        }

        public Buffer width(@NativeType("FT_Long") long value) {
            FT_Size_Request.nwidth(address(), value);
            return this;
        }

        public Buffer height(@NativeType("FT_Long") long value) {
            FT_Size_Request.nheight(address(), value);
            return this;
        }

        public Buffer horiResolution(@NativeType("FT_UInt") int value) {
            FT_Size_Request.nhoriResolution(address(), value);
            return this;
        }

        public Buffer vertResolution(@NativeType("FT_UInt") int value) {
            FT_Size_Request.nvertResolution(address(), value);
            return this;
        }
    }
}
