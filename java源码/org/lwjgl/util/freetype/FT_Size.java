package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size.class
 */
@NativeType("struct FT_SizeRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size.class */
public class FT_Size extends Struct<FT_Size> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FACE;
    public static final int GENERIC;
    public static final int METRICS;
    public static final int INTERNAL;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(FT_Generic.SIZEOF, FT_Generic.ALIGNOF), __member(FT_Size_Metrics.SIZEOF, FT_Size_Metrics.ALIGNOF), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FACE = layout.offsetof(0);
        GENERIC = layout.offsetof(1);
        METRICS = layout.offsetof(2);
        INTERNAL = layout.offsetof(3);
    }

    protected FT_Size(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Size create(long address, ByteBuffer container) {
        return new FT_Size(address, container);
    }

    public FT_Size(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public FT_Face face() {
        return nface(address());
    }

    public FT_Generic generic() {
        return ngeneric(address());
    }

    public FT_Size_Metrics metrics() {
        return nmetrics(address());
    }

    public FT_Size face(FT_Face value) {
        nface(address(), value);
        return this;
    }

    public FT_Size generic(FT_Generic value) {
        ngeneric(address(), value);
        return this;
    }

    public FT_Size generic(Consumer<FT_Generic> consumer) {
        consumer.accept(generic());
        return this;
    }

    public FT_Size metrics(FT_Size_Metrics value) {
        nmetrics(address(), value);
        return this;
    }

    public FT_Size set(FT_Face face, FT_Generic generic, FT_Size_Metrics metrics) {
        face(face);
        generic(generic);
        metrics(metrics);
        return this;
    }

    public FT_Size set(FT_Size src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Size malloc() {
        return new FT_Size(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Size calloc() {
        return new FT_Size(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Size create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Size(MemoryUtil.memAddress(container), container);
    }

    public static FT_Size create(long address) {
        return new FT_Size(address, null);
    }

    public static FT_Size createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Size(address, null);
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

    public static FT_Size malloc(MemoryStack stack) {
        return new FT_Size(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Size calloc(MemoryStack stack) {
        return new FT_Size(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FT_Face nface(long struct) {
        return FT_Face.create(MemoryUtil.memGetAddress(struct + FACE));
    }

    public static FT_Generic ngeneric(long struct) {
        return FT_Generic.create(struct + GENERIC);
    }

    public static FT_Size_Metrics nmetrics(long struct) {
        return FT_Size_Metrics.create(struct + METRICS);
    }

    public static FT_Size_Internal ninternal(long struct) {
        return FT_Size_Internal.create(MemoryUtil.memGetAddress(struct + INTERNAL));
    }

    public static void nface(long struct, FT_Face value) {
        MemoryUtil.memPutAddress(struct + FACE, value.address());
    }

    public static void ngeneric(long struct, FT_Generic value) {
        MemoryUtil.memCopy(value.address(), struct + GENERIC, FT_Generic.SIZEOF);
    }

    public static void nmetrics(long struct, FT_Size_Metrics value) {
        MemoryUtil.memCopy(value.address(), struct + METRICS, FT_Size_Metrics.SIZEOF);
    }

    public static void ninternal(long struct, FT_Size_Internal value) {
        MemoryUtil.memPutAddress(struct + INTERNAL, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + FACE));
        FT_Generic.validate(struct + GENERIC);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Size$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Size, Buffer> implements NativeResource {
        private static final FT_Size ELEMENT_FACTORY = FT_Size.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Size.SIZEOF);
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
        public FT_Size getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public FT_Face face() {
            return FT_Size.nface(address());
        }

        public FT_Generic generic() {
            return FT_Size.ngeneric(address());
        }

        public FT_Size_Metrics metrics() {
            return FT_Size.nmetrics(address());
        }

        public Buffer face(FT_Face value) {
            FT_Size.nface(address(), value);
            return this;
        }

        public Buffer generic(FT_Generic value) {
            FT_Size.ngeneric(address(), value);
            return this;
        }

        public Buffer generic(Consumer<FT_Generic> consumer) {
            consumer.accept(generic());
            return this;
        }

        public Buffer metrics(FT_Size_Metrics value) {
            FT_Size.nmetrics(address(), value);
            return this;
        }
    }
}
