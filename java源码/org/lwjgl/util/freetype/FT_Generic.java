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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Generic.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Generic.class */
public class FT_Generic extends Struct<FT_Generic> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DATA;
    public static final int FINALIZER;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DATA = layout.offsetof(0);
        FINALIZER = layout.offsetof(1);
    }

    protected FT_Generic(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Generic create(long address, ByteBuffer container) {
        return new FT_Generic(address, container);
    }

    public FT_Generic(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("void *")
    public long data() {
        return ndata(address());
    }

    public FT_Generic_Finalizer finalizer() {
        return nfinalizer(address());
    }

    public FT_Generic data(@NativeType("void *") long value) {
        ndata(address(), value);
        return this;
    }

    public FT_Generic finalizer(@NativeType("FT_Generic_Finalizer") FT_Generic_FinalizerI value) {
        nfinalizer(address(), value);
        return this;
    }

    public FT_Generic set(long data, FT_Generic_FinalizerI finalizer) {
        data(data);
        finalizer(finalizer);
        return this;
    }

    public FT_Generic set(FT_Generic src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Generic malloc() {
        return new FT_Generic(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Generic calloc() {
        return new FT_Generic(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Generic create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Generic(MemoryUtil.memAddress(container), container);
    }

    public static FT_Generic create(long address) {
        return new FT_Generic(address, null);
    }

    public static FT_Generic createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Generic(address, null);
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

    public static FT_Generic malloc(MemoryStack stack) {
        return new FT_Generic(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Generic calloc(MemoryStack stack) {
        return new FT_Generic(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ndata(long struct) {
        return MemoryUtil.memGetAddress(struct + DATA);
    }

    public static FT_Generic_Finalizer nfinalizer(long struct) {
        return FT_Generic_Finalizer.create(MemoryUtil.memGetAddress(struct + FINALIZER));
    }

    public static void ndata(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DATA, value);
    }

    public static void nfinalizer(long struct, FT_Generic_FinalizerI value) {
        MemoryUtil.memPutAddress(struct + FINALIZER, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + FINALIZER));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Generic$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Generic$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Generic, Buffer> implements NativeResource {
        private static final FT_Generic ELEMENT_FACTORY = FT_Generic.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Generic.SIZEOF);
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
        public FT_Generic getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("void *")
        public long data() {
            return FT_Generic.ndata(address());
        }

        public FT_Generic_Finalizer finalizer() {
            return FT_Generic.nfinalizer(address());
        }

        public Buffer data(@NativeType("void *") long value) {
            FT_Generic.ndata(address(), value);
            return this;
        }

        public Buffer finalizer(@NativeType("FT_Generic_Finalizer") FT_Generic_FinalizerI value) {
            FT_Generic.nfinalizer(address(), value);
            return this;
        }
    }
}
