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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Memory.class
 */
@NativeType("struct FT_MemoryRec_")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Memory.class */
public class FT_Memory extends Struct<FT_Memory> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int USER;
    public static final int ALLOC;
    public static final int FREE;
    public static final int REALLOC;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        USER = layout.offsetof(0);
        ALLOC = layout.offsetof(1);
        FREE = layout.offsetof(2);
        REALLOC = layout.offsetof(3);
    }

    protected FT_Memory(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Memory create(long address, ByteBuffer container) {
        return new FT_Memory(address, container);
    }

    public FT_Memory(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("void *")
    public long user() {
        return nuser(address());
    }

    public FT_Alloc_Func alloc() {
        return nalloc(address());
    }

    public FT_Free_Func free$() {
        return nfree$(address());
    }

    public FT_Realloc_Func realloc() {
        return nrealloc(address());
    }

    public FT_Memory user(@NativeType("void *") long value) {
        nuser(address(), value);
        return this;
    }

    public FT_Memory alloc(@NativeType("FT_Alloc_Func") FT_Alloc_FuncI value) {
        nalloc(address(), value);
        return this;
    }

    public FT_Memory free$(@NativeType("FT_Free_Func") FT_Free_FuncI value) {
        nfree$(address(), value);
        return this;
    }

    public FT_Memory realloc(@NativeType("FT_Realloc_Func") FT_Realloc_FuncI value) {
        nrealloc(address(), value);
        return this;
    }

    public FT_Memory set(long user, FT_Alloc_FuncI alloc, FT_Free_FuncI free$, FT_Realloc_FuncI realloc) {
        user(user);
        alloc(alloc);
        free$(free$);
        realloc(realloc);
        return this;
    }

    public FT_Memory set(FT_Memory src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Memory malloc() {
        return new FT_Memory(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Memory calloc() {
        return new FT_Memory(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Memory create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Memory(MemoryUtil.memAddress(container), container);
    }

    public static FT_Memory create(long address) {
        return new FT_Memory(address, null);
    }

    public static FT_Memory createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Memory(address, null);
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

    public static FT_Memory malloc(MemoryStack stack) {
        return new FT_Memory(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Memory calloc(MemoryStack stack) {
        return new FT_Memory(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nuser(long struct) {
        return MemoryUtil.memGetAddress(struct + USER);
    }

    public static FT_Alloc_Func nalloc(long struct) {
        return FT_Alloc_Func.createSafe(MemoryUtil.memGetAddress(struct + ALLOC));
    }

    public static FT_Free_Func nfree$(long struct) {
        return FT_Free_Func.createSafe(MemoryUtil.memGetAddress(struct + FREE));
    }

    public static FT_Realloc_Func nrealloc(long struct) {
        return FT_Realloc_Func.createSafe(MemoryUtil.memGetAddress(struct + REALLOC));
    }

    public static void nuser(long struct, long value) {
        MemoryUtil.memPutAddress(struct + USER, value);
    }

    public static void nalloc(long struct, FT_Alloc_FuncI value) {
        MemoryUtil.memPutAddress(struct + ALLOC, MemoryUtil.memAddressSafe(value));
    }

    public static void nfree$(long struct, FT_Free_FuncI value) {
        MemoryUtil.memPutAddress(struct + FREE, MemoryUtil.memAddressSafe(value));
    }

    public static void nrealloc(long struct, FT_Realloc_FuncI value) {
        MemoryUtil.memPutAddress(struct + REALLOC, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Memory$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Memory$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Memory, Buffer> implements NativeResource {
        private static final FT_Memory ELEMENT_FACTORY = FT_Memory.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Memory.SIZEOF);
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
        public FT_Memory getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("void *")
        public long user() {
            return FT_Memory.nuser(address());
        }

        public FT_Alloc_Func alloc() {
            return FT_Memory.nalloc(address());
        }

        public FT_Free_Func free$() {
            return FT_Memory.nfree$(address());
        }

        public FT_Realloc_Func realloc() {
            return FT_Memory.nrealloc(address());
        }

        public Buffer user(@NativeType("void *") long value) {
            FT_Memory.nuser(address(), value);
            return this;
        }

        public Buffer alloc(@NativeType("FT_Alloc_Func") FT_Alloc_FuncI value) {
            FT_Memory.nalloc(address(), value);
            return this;
        }

        public Buffer free$(@NativeType("FT_Free_Func") FT_Free_FuncI value) {
            FT_Memory.nfree$(address(), value);
            return this;
        }

        public Buffer realloc(@NativeType("FT_Realloc_Func") FT_Realloc_FuncI value) {
            FT_Memory.nrealloc(address(), value);
            return this;
        }
    }
}
