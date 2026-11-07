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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_StreamDesc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_StreamDesc.class */
public class FT_StreamDesc extends Struct<FT_StreamDesc> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VALUE;
    public static final int POINTER;

    static {
        Struct.Layout layout = __union(__member(CLONG_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VALUE = layout.offsetof(0);
        POINTER = layout.offsetof(1);
    }

    protected FT_StreamDesc(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_StreamDesc create(long address, ByteBuffer container) {
        return new FT_StreamDesc(address, container);
    }

    public FT_StreamDesc(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public long value() {
        return nvalue(address());
    }

    @NativeType("void *")
    public long pointer() {
        return npointer(address());
    }

    public FT_StreamDesc value(long value) {
        nvalue(address(), value);
        return this;
    }

    public FT_StreamDesc pointer(@NativeType("void *") long value) {
        npointer(address(), value);
        return this;
    }

    public FT_StreamDesc set(FT_StreamDesc src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_StreamDesc malloc() {
        return new FT_StreamDesc(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_StreamDesc calloc() {
        return new FT_StreamDesc(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_StreamDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_StreamDesc(MemoryUtil.memAddress(container), container);
    }

    public static FT_StreamDesc create(long address) {
        return new FT_StreamDesc(address, null);
    }

    public static FT_StreamDesc createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_StreamDesc(address, null);
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

    public static FT_StreamDesc malloc(MemoryStack stack) {
        return new FT_StreamDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_StreamDesc calloc(MemoryStack stack) {
        return new FT_StreamDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nvalue(long struct) {
        return MemoryUtil.memGetCLong(struct + VALUE);
    }

    public static long npointer(long struct) {
        return MemoryUtil.memGetAddress(struct + POINTER);
    }

    public static void nvalue(long struct, long value) {
        MemoryUtil.memPutCLong(struct + VALUE, value);
    }

    public static void npointer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + POINTER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_StreamDesc$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_StreamDesc$Buffer.class */
    public static class Buffer extends StructBuffer<FT_StreamDesc, Buffer> implements NativeResource {
        private static final FT_StreamDesc ELEMENT_FACTORY = FT_StreamDesc.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_StreamDesc.SIZEOF);
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
        public FT_StreamDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public long value() {
            return FT_StreamDesc.nvalue(address());
        }

        @NativeType("void *")
        public long pointer() {
            return FT_StreamDesc.npointer(address());
        }

        public Buffer value(long value) {
            FT_StreamDesc.nvalue(address(), value);
            return this;
        }

        public Buffer pointer(@NativeType("void *") long value) {
            FT_StreamDesc.npointer(address(), value);
            return this;
        }
    }
}
