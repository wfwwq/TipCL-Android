package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.util.freetype.FT_Parameter;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Open_Args.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Open_Args.class */
public class FT_Open_Args extends Struct<FT_Open_Args> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int MEMORY_BASE;
    public static final int MEMORY_SIZE;
    public static final int PATHNAME;
    public static final int STREAM;
    public static final int DRIVER;
    public static final int NUM_PARAMS;
    public static final int PARAMS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        MEMORY_BASE = layout.offsetof(1);
        MEMORY_SIZE = layout.offsetof(2);
        PATHNAME = layout.offsetof(3);
        STREAM = layout.offsetof(4);
        DRIVER = layout.offsetof(5);
        NUM_PARAMS = layout.offsetof(6);
        PARAMS = layout.offsetof(7);
    }

    protected FT_Open_Args(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Open_Args create(long address, ByteBuffer container) {
        return new FT_Open_Args(address, container);
    }

    public FT_Open_Args(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_UInt")
    public int flags() {
        return nflags(address());
    }

    @NativeType("FT_Byte const *")
    public ByteBuffer memory_base() {
        return nmemory_base(address());
    }

    @NativeType("FT_Long")
    public long memory_size() {
        return nmemory_size(address());
    }

    @NativeType("FT_String *")
    public ByteBuffer pathname() {
        return npathname(address());
    }

    @NativeType("FT_String *")
    public String pathnameString() {
        return npathnameString(address());
    }

    public FT_Stream stream$() {
        return nstream$(address());
    }

    @NativeType("FT_Module")
    public long driver() {
        return ndriver(address());
    }

    @NativeType("FT_Int")
    public int num_params() {
        return nnum_params(address());
    }

    @NativeType("FT_Parameter *")
    public FT_Parameter.Buffer params() {
        return nparams(address());
    }

    public FT_Open_Args flags(@NativeType("FT_UInt") int value) {
        nflags(address(), value);
        return this;
    }

    public FT_Open_Args memory_base(@NativeType("FT_Byte const *") ByteBuffer value) {
        nmemory_base(address(), value);
        return this;
    }

    public FT_Open_Args memory_size(@NativeType("FT_Long") long value) {
        nmemory_size(address(), value);
        return this;
    }

    public FT_Open_Args pathname(@NativeType("FT_String *") ByteBuffer value) {
        npathname(address(), value);
        return this;
    }

    public FT_Open_Args stream$(FT_Stream value) {
        nstream$(address(), value);
        return this;
    }

    public FT_Open_Args driver(@NativeType("FT_Module") long value) {
        ndriver(address(), value);
        return this;
    }

    public FT_Open_Args num_params(@NativeType("FT_Int") int value) {
        nnum_params(address(), value);
        return this;
    }

    public FT_Open_Args params(@NativeType("FT_Parameter *") FT_Parameter.Buffer value) {
        nparams(address(), value);
        return this;
    }

    public FT_Open_Args set(int flags, ByteBuffer memory_base, long memory_size, ByteBuffer pathname, FT_Stream stream$, long driver, int num_params, FT_Parameter.Buffer params) {
        flags(flags);
        memory_base(memory_base);
        memory_size(memory_size);
        pathname(pathname);
        stream$(stream$);
        driver(driver);
        num_params(num_params);
        params(params);
        return this;
    }

    public FT_Open_Args set(FT_Open_Args src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Open_Args malloc() {
        return new FT_Open_Args(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Open_Args calloc() {
        return new FT_Open_Args(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Open_Args create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Open_Args(MemoryUtil.memAddress(container), container);
    }

    public static FT_Open_Args create(long address) {
        return new FT_Open_Args(address, null);
    }

    public static FT_Open_Args createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Open_Args(address, null);
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

    public static FT_Open_Args malloc(MemoryStack stack) {
        return new FT_Open_Args(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Open_Args calloc(MemoryStack stack) {
        return new FT_Open_Args(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static ByteBuffer nmemory_base(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + MEMORY_BASE), (int) nmemory_size(struct));
    }

    public static long nmemory_size(long struct) {
        return MemoryUtil.memGetCLong(struct + MEMORY_SIZE);
    }

    public static ByteBuffer npathname(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + PATHNAME));
    }

    public static String npathnameString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + PATHNAME));
    }

    public static FT_Stream nstream$(long struct) {
        return FT_Stream.createSafe(MemoryUtil.memGetAddress(struct + STREAM));
    }

    public static long ndriver(long struct) {
        return MemoryUtil.memGetAddress(struct + DRIVER);
    }

    public static int nnum_params(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_PARAMS);
    }

    public static FT_Parameter.Buffer nparams(long struct) {
        return FT_Parameter.createSafe(MemoryUtil.memGetAddress(struct + PARAMS), nnum_params(struct));
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nmemory_base(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + MEMORY_BASE, MemoryUtil.memAddressSafe(value));
        nmemory_size(struct, value == null ? 0L : value.remaining());
    }

    public static void nmemory_size(long struct, long value) {
        MemoryUtil.memPutCLong(struct + MEMORY_SIZE, value);
    }

    public static void npathname(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + PATHNAME, MemoryUtil.memAddressSafe(value));
    }

    public static void nstream$(long struct, FT_Stream value) {
        MemoryUtil.memPutAddress(struct + STREAM, MemoryUtil.memAddressSafe(value));
    }

    public static void ndriver(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DRIVER, value);
    }

    public static void nnum_params(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_PARAMS, value);
    }

    public static void nparams(long struct, FT_Parameter.Buffer value) {
        MemoryUtil.memPutAddress(struct + PARAMS, MemoryUtil.memAddressSafe(value));
        nnum_params(struct, value == null ? 0 : value.remaining());
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Open_Args$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Open_Args$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Open_Args, Buffer> implements NativeResource {
        private static final FT_Open_Args ELEMENT_FACTORY = FT_Open_Args.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Open_Args.SIZEOF);
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
        public FT_Open_Args getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_UInt")
        public int flags() {
            return FT_Open_Args.nflags(address());
        }

        @NativeType("FT_Byte const *")
        public ByteBuffer memory_base() {
            return FT_Open_Args.nmemory_base(address());
        }

        @NativeType("FT_Long")
        public long memory_size() {
            return FT_Open_Args.nmemory_size(address());
        }

        @NativeType("FT_String *")
        public ByteBuffer pathname() {
            return FT_Open_Args.npathname(address());
        }

        @NativeType("FT_String *")
        public String pathnameString() {
            return FT_Open_Args.npathnameString(address());
        }

        public FT_Stream stream$() {
            return FT_Open_Args.nstream$(address());
        }

        @NativeType("FT_Module")
        public long driver() {
            return FT_Open_Args.ndriver(address());
        }

        @NativeType("FT_Int")
        public int num_params() {
            return FT_Open_Args.nnum_params(address());
        }

        @NativeType("FT_Parameter *")
        public FT_Parameter.Buffer params() {
            return FT_Open_Args.nparams(address());
        }

        public Buffer flags(@NativeType("FT_UInt") int value) {
            FT_Open_Args.nflags(address(), value);
            return this;
        }

        public Buffer memory_base(@NativeType("FT_Byte const *") ByteBuffer value) {
            FT_Open_Args.nmemory_base(address(), value);
            return this;
        }

        public Buffer memory_size(@NativeType("FT_Long") long value) {
            FT_Open_Args.nmemory_size(address(), value);
            return this;
        }

        public Buffer pathname(@NativeType("FT_String *") ByteBuffer value) {
            FT_Open_Args.npathname(address(), value);
            return this;
        }

        public Buffer stream$(FT_Stream value) {
            FT_Open_Args.nstream$(address(), value);
            return this;
        }

        public Buffer driver(@NativeType("FT_Module") long value) {
            FT_Open_Args.ndriver(address(), value);
            return this;
        }

        public Buffer num_params(@NativeType("FT_Int") int value) {
            FT_Open_Args.nnum_params(address(), value);
            return this;
        }

        public Buffer params(@NativeType("FT_Parameter *") FT_Parameter.Buffer value) {
            FT_Open_Args.nparams(address(), value);
            return this;
        }
    }
}
