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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Parameter.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Parameter.class */
public class FT_Parameter extends Struct<FT_Parameter> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TAG;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TAG = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    protected FT_Parameter(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Parameter create(long address, ByteBuffer container) {
        return new FT_Parameter(address, container);
    }

    public FT_Parameter(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_ULong")
    public long tag() {
        return ntag(address());
    }

    @NativeType("FT_Pointer")
    public ByteBuffer data(int capacity) {
        return ndata(address(), capacity);
    }

    public FT_Parameter tag(@NativeType("FT_ULong") long value) {
        ntag(address(), value);
        return this;
    }

    public FT_Parameter data(@NativeType("FT_Pointer") ByteBuffer value) {
        ndata(address(), value);
        return this;
    }

    public FT_Parameter set(long tag, ByteBuffer data) {
        tag(tag);
        data(data);
        return this;
    }

    public FT_Parameter set(FT_Parameter src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Parameter malloc() {
        return new FT_Parameter(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Parameter calloc() {
        return new FT_Parameter(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Parameter create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Parameter(MemoryUtil.memAddress(container), container);
    }

    public static FT_Parameter create(long address) {
        return new FT_Parameter(address, null);
    }

    public static FT_Parameter createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Parameter(address, null);
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

    public static FT_Parameter malloc(MemoryStack stack) {
        return new FT_Parameter(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Parameter calloc(MemoryStack stack) {
        return new FT_Parameter(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ntag(long struct) {
        return MemoryUtil.memGetCLong(struct + TAG);
    }

    public static ByteBuffer ndata(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + DATA), capacity);
    }

    public static void ntag(long struct, long value) {
        MemoryUtil.memPutCLong(struct + TAG, value);
    }

    public static void ndata(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + DATA, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Parameter$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Parameter$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Parameter, Buffer> implements NativeResource {
        private static final FT_Parameter ELEMENT_FACTORY = FT_Parameter.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Parameter.SIZEOF);
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
        public FT_Parameter getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_ULong")
        public long tag() {
            return FT_Parameter.ntag(address());
        }

        @NativeType("FT_Pointer")
        public ByteBuffer data(int capacity) {
            return FT_Parameter.ndata(address(), capacity);
        }

        public Buffer tag(@NativeType("FT_ULong") long value) {
            FT_Parameter.ntag(address(), value);
            return this;
        }

        public Buffer data(@NativeType("FT_Pointer") ByteBuffer value) {
            FT_Parameter.ndata(address(), value);
            return this;
        }
    }
}
