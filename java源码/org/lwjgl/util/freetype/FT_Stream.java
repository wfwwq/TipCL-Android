package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream.class
 */
@NativeType("struct FT_StreamRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream.class */
public class FT_Stream extends Struct<FT_Stream> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BASE;
    public static final int SIZE;
    public static final int POS;
    public static final int DESCRIPTOR;
    public static final int PATHNAME;
    public static final int READ;
    public static final int CLOSE;
    public static final int MEMORY;
    public static final int CURSOR;
    public static final int LIMIT;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(FT_StreamDesc.SIZEOF, FT_StreamDesc.ALIGNOF), __member(FT_StreamDesc.SIZEOF, FT_StreamDesc.ALIGNOF), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BASE = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        POS = layout.offsetof(2);
        DESCRIPTOR = layout.offsetof(3);
        PATHNAME = layout.offsetof(4);
        READ = layout.offsetof(5);
        CLOSE = layout.offsetof(6);
        MEMORY = layout.offsetof(7);
        CURSOR = layout.offsetof(8);
        LIMIT = layout.offsetof(9);
    }

    protected FT_Stream(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Stream create(long address, ByteBuffer container) {
        return new FT_Stream(address, container);
    }

    public FT_Stream(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned char *")
    public ByteBuffer base() {
        return nbase(address());
    }

    @NativeType("unsigned long")
    public long size() {
        return nsize(address());
    }

    @NativeType("unsigned long")
    public long pos() {
        return npos(address());
    }

    public FT_StreamDesc descriptor() {
        return ndescriptor(address());
    }

    public FT_StreamDesc pathname() {
        return npathname(address());
    }

    public FT_Stream_IoFunc read() {
        return nread(address());
    }

    public FT_Stream_CloseFunc close$() {
        return nclose$(address());
    }

    public FT_Stream base(@NativeType("unsigned char *") ByteBuffer value) {
        nbase(address(), value);
        return this;
    }

    public FT_Stream size(@NativeType("unsigned long") long value) {
        nsize(address(), value);
        return this;
    }

    public FT_Stream pos(@NativeType("unsigned long") long value) {
        npos(address(), value);
        return this;
    }

    public FT_Stream descriptor(FT_StreamDesc value) {
        ndescriptor(address(), value);
        return this;
    }

    public FT_Stream descriptor(Consumer<FT_StreamDesc> consumer) {
        consumer.accept(descriptor());
        return this;
    }

    public FT_Stream pathname(FT_StreamDesc value) {
        npathname(address(), value);
        return this;
    }

    public FT_Stream pathname(Consumer<FT_StreamDesc> consumer) {
        consumer.accept(pathname());
        return this;
    }

    public FT_Stream read(@NativeType("FT_Stream_IoFunc") FT_Stream_IoFuncI value) {
        nread(address(), value);
        return this;
    }

    public FT_Stream close$(@NativeType("FT_Stream_CloseFunc") FT_Stream_CloseFuncI value) {
        nclose$(address(), value);
        return this;
    }

    public FT_Stream set(ByteBuffer base, long size, long pos, FT_StreamDesc descriptor, FT_StreamDesc pathname, FT_Stream_IoFuncI read, FT_Stream_CloseFuncI close$) {
        base(base);
        size(size);
        pos(pos);
        descriptor(descriptor);
        pathname(pathname);
        read(read);
        close$(close$);
        return this;
    }

    public FT_Stream set(FT_Stream src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Stream malloc() {
        return new FT_Stream(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Stream calloc() {
        return new FT_Stream(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Stream create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Stream(MemoryUtil.memAddress(container), container);
    }

    public static FT_Stream create(long address) {
        return new FT_Stream(address, null);
    }

    public static FT_Stream createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Stream(address, null);
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

    public static FT_Stream malloc(MemoryStack stack) {
        return new FT_Stream(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Stream calloc(MemoryStack stack) {
        return new FT_Stream(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nbase(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + BASE), (int) nsize(struct));
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetCLong(struct + SIZE);
    }

    public static long npos(long struct) {
        return MemoryUtil.memGetCLong(struct + POS);
    }

    public static FT_StreamDesc ndescriptor(long struct) {
        return FT_StreamDesc.create(struct + DESCRIPTOR);
    }

    public static FT_StreamDesc npathname(long struct) {
        return FT_StreamDesc.create(struct + PATHNAME);
    }

    public static FT_Stream_IoFunc nread(long struct) {
        return FT_Stream_IoFunc.createSafe(MemoryUtil.memGetAddress(struct + READ));
    }

    public static FT_Stream_CloseFunc nclose$(long struct) {
        return FT_Stream_CloseFunc.createSafe(MemoryUtil.memGetAddress(struct + CLOSE));
    }

    public static FT_Memory nmemory(long struct) {
        return FT_Memory.createSafe(MemoryUtil.memGetAddress(struct + MEMORY));
    }

    public static ByteBuffer ncursor(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + CURSOR), capacity);
    }

    public static void nbase(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + BASE, MemoryUtil.memAddressSafe(value));
        nsize(struct, value == null ? 0L : value.remaining());
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutCLong(struct + SIZE, value);
    }

    public static void npos(long struct, long value) {
        MemoryUtil.memPutCLong(struct + POS, value);
    }

    public static void ndescriptor(long struct, FT_StreamDesc value) {
        MemoryUtil.memCopy(value.address(), struct + DESCRIPTOR, FT_StreamDesc.SIZEOF);
    }

    public static void npathname(long struct, FT_StreamDesc value) {
        MemoryUtil.memCopy(value.address(), struct + PATHNAME, FT_StreamDesc.SIZEOF);
    }

    public static void nread(long struct, FT_Stream_IoFuncI value) {
        MemoryUtil.memPutAddress(struct + READ, MemoryUtil.memAddressSafe(value));
    }

    public static void nclose$(long struct, FT_Stream_CloseFuncI value) {
        MemoryUtil.memPutAddress(struct + CLOSE, MemoryUtil.memAddressSafe(value));
    }

    public static void nmemory(long struct, FT_Memory value) {
        MemoryUtil.memPutAddress(struct + MEMORY, MemoryUtil.memAddressSafe(value));
    }

    public static void ncursor(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + CURSOR, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Stream$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Stream, Buffer> implements NativeResource {
        private static final FT_Stream ELEMENT_FACTORY = FT_Stream.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Stream.SIZEOF);
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
        public FT_Stream getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned char *")
        public ByteBuffer base() {
            return FT_Stream.nbase(address());
        }

        @NativeType("unsigned long")
        public long size() {
            return FT_Stream.nsize(address());
        }

        @NativeType("unsigned long")
        public long pos() {
            return FT_Stream.npos(address());
        }

        public FT_StreamDesc descriptor() {
            return FT_Stream.ndescriptor(address());
        }

        public FT_StreamDesc pathname() {
            return FT_Stream.npathname(address());
        }

        public FT_Stream_IoFunc read() {
            return FT_Stream.nread(address());
        }

        public FT_Stream_CloseFunc close$() {
            return FT_Stream.nclose$(address());
        }

        public Buffer base(@NativeType("unsigned char *") ByteBuffer value) {
            FT_Stream.nbase(address(), value);
            return this;
        }

        public Buffer size(@NativeType("unsigned long") long value) {
            FT_Stream.nsize(address(), value);
            return this;
        }

        public Buffer pos(@NativeType("unsigned long") long value) {
            FT_Stream.npos(address(), value);
            return this;
        }

        public Buffer descriptor(FT_StreamDesc value) {
            FT_Stream.ndescriptor(address(), value);
            return this;
        }

        public Buffer descriptor(Consumer<FT_StreamDesc> consumer) {
            consumer.accept(descriptor());
            return this;
        }

        public Buffer pathname(FT_StreamDesc value) {
            FT_Stream.npathname(address(), value);
            return this;
        }

        public Buffer pathname(Consumer<FT_StreamDesc> consumer) {
            consumer.accept(pathname());
            return this;
        }

        public Buffer read(@NativeType("FT_Stream_IoFunc") FT_Stream_IoFuncI value) {
            FT_Stream.nread(address(), value);
            return this;
        }

        public Buffer close$(@NativeType("FT_Stream_CloseFunc") FT_Stream_CloseFuncI value) {
            FT_Stream.nclose$(address(), value);
            return this;
        }
    }
}
