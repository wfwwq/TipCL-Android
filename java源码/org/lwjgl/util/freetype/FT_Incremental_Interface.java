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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_Interface.class
 */
@NativeType("struct FT_Incremental_InterfaceRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_Interface.class */
public class FT_Incremental_Interface extends Struct<FT_Incremental_Interface> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FUNCS;
    public static final int OBJECT;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FUNCS = layout.offsetof(0);
        OBJECT = layout.offsetof(1);
    }

    protected FT_Incremental_Interface(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Incremental_Interface create(long address, ByteBuffer container) {
        return new FT_Incremental_Interface(address, container);
    }

    public FT_Incremental_Interface(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Incremental_FuncsRec const *")
    public FT_Incremental_Funcs funcs() {
        return nfuncs(address());
    }

    @NativeType("FT_Incremental")
    public long object() {
        return nobject(address());
    }

    public FT_Incremental_Interface funcs(@NativeType("FT_Incremental_FuncsRec const *") FT_Incremental_Funcs value) {
        nfuncs(address(), value);
        return this;
    }

    public FT_Incremental_Interface object(@NativeType("FT_Incremental") long value) {
        nobject(address(), value);
        return this;
    }

    public FT_Incremental_Interface set(FT_Incremental_Funcs funcs, long object) {
        funcs(funcs);
        object(object);
        return this;
    }

    public FT_Incremental_Interface set(FT_Incremental_Interface src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Incremental_Interface malloc() {
        return new FT_Incremental_Interface(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Incremental_Interface calloc() {
        return new FT_Incremental_Interface(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Incremental_Interface create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Incremental_Interface(MemoryUtil.memAddress(container), container);
    }

    public static FT_Incremental_Interface create(long address) {
        return new FT_Incremental_Interface(address, null);
    }

    public static FT_Incremental_Interface createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Incremental_Interface(address, null);
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

    public static FT_Incremental_Interface malloc(MemoryStack stack) {
        return new FT_Incremental_Interface(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Incremental_Interface calloc(MemoryStack stack) {
        return new FT_Incremental_Interface(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FT_Incremental_Funcs nfuncs(long struct) {
        return FT_Incremental_Funcs.create(MemoryUtil.memGetAddress(struct + FUNCS));
    }

    public static long nobject(long struct) {
        return MemoryUtil.memGetAddress(struct + OBJECT);
    }

    public static void nfuncs(long struct, FT_Incremental_Funcs value) {
        MemoryUtil.memPutAddress(struct + FUNCS, value.address());
    }

    public static void nobject(long struct, long value) {
        MemoryUtil.memPutAddress(struct + OBJECT, value);
    }

    public static void validate(long struct) {
        long funcs = MemoryUtil.memGetAddress(struct + FUNCS);
        Checks.check(funcs);
        FT_Incremental_Funcs.validate(funcs);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_Interface$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_Interface$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Incremental_Interface, Buffer> implements NativeResource {
        private static final FT_Incremental_Interface ELEMENT_FACTORY = FT_Incremental_Interface.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Incremental_Interface.SIZEOF);
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
        public FT_Incremental_Interface getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Incremental_FuncsRec const *")
        public FT_Incremental_Funcs funcs() {
            return FT_Incremental_Interface.nfuncs(address());
        }

        @NativeType("FT_Incremental")
        public long object() {
            return FT_Incremental_Interface.nobject(address());
        }

        public Buffer funcs(@NativeType("FT_Incremental_FuncsRec const *") FT_Incremental_Funcs value) {
            FT_Incremental_Interface.nfuncs(address(), value);
            return this;
        }

        public Buffer object(@NativeType("FT_Incremental") long value) {
            FT_Incremental_Interface.nobject(address(), value);
            return this;
        }
    }
}
