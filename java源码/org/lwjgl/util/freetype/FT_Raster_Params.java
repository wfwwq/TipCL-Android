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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_Params.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_Params.class */
public class FT_Raster_Params extends Struct<FT_Raster_Params> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TARGET;
    public static final int SOURCE;
    public static final int FLAGS;
    public static final int GRAY_SPANS;
    public static final int BLACK_SPANS;
    public static final int BIT_TEST;
    public static final int BIT_SET;
    public static final int USER;
    public static final int CLIP_BOX;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(FT_BBox.SIZEOF, FT_BBox.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TARGET = layout.offsetof(0);
        SOURCE = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        GRAY_SPANS = layout.offsetof(3);
        BLACK_SPANS = layout.offsetof(4);
        BIT_TEST = layout.offsetof(5);
        BIT_SET = layout.offsetof(6);
        USER = layout.offsetof(7);
        CLIP_BOX = layout.offsetof(8);
    }

    protected FT_Raster_Params(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Raster_Params create(long address, ByteBuffer container) {
        return new FT_Raster_Params(address, container);
    }

    public FT_Raster_Params(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Bitmap const *")
    public FT_Bitmap target() {
        return ntarget(address());
    }

    @NativeType("void const *")
    public ByteBuffer source(int capacity) {
        return nsource(address(), capacity);
    }

    public int flags() {
        return nflags(address());
    }

    public FT_SpanFunc gray_spans() {
        return ngray_spans(address());
    }

    @NativeType("void *")
    public long user() {
        return nuser(address());
    }

    public FT_BBox clip_box() {
        return nclip_box(address());
    }

    public FT_Raster_Params target(@NativeType("FT_Bitmap const *") FT_Bitmap value) {
        ntarget(address(), value);
        return this;
    }

    public FT_Raster_Params source(@NativeType("void const *") ByteBuffer value) {
        nsource(address(), value);
        return this;
    }

    public FT_Raster_Params flags(int value) {
        nflags(address(), value);
        return this;
    }

    public FT_Raster_Params gray_spans(@NativeType("FT_SpanFunc") FT_SpanFuncI value) {
        ngray_spans(address(), value);
        return this;
    }

    public FT_Raster_Params user(@NativeType("void *") long value) {
        nuser(address(), value);
        return this;
    }

    public FT_Raster_Params clip_box(FT_BBox value) {
        nclip_box(address(), value);
        return this;
    }

    public FT_Raster_Params clip_box(Consumer<FT_BBox> consumer) {
        consumer.accept(clip_box());
        return this;
    }

    public FT_Raster_Params set(FT_Bitmap target, ByteBuffer source, int flags, FT_SpanFuncI gray_spans, long user, FT_BBox clip_box) {
        target(target);
        source(source);
        flags(flags);
        gray_spans(gray_spans);
        user(user);
        clip_box(clip_box);
        return this;
    }

    public FT_Raster_Params set(FT_Raster_Params src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Raster_Params malloc() {
        return new FT_Raster_Params(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Raster_Params calloc() {
        return new FT_Raster_Params(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Raster_Params create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Raster_Params(MemoryUtil.memAddress(container), container);
    }

    public static FT_Raster_Params create(long address) {
        return new FT_Raster_Params(address, null);
    }

    public static FT_Raster_Params createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Raster_Params(address, null);
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

    public static FT_Raster_Params malloc(MemoryStack stack) {
        return new FT_Raster_Params(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Raster_Params calloc(MemoryStack stack) {
        return new FT_Raster_Params(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FT_Bitmap ntarget(long struct) {
        return FT_Bitmap.createSafe(MemoryUtil.memGetAddress(struct + TARGET));
    }

    public static ByteBuffer nsource(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + SOURCE), capacity);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static FT_SpanFunc ngray_spans(long struct) {
        return FT_SpanFunc.createSafe(MemoryUtil.memGetAddress(struct + GRAY_SPANS));
    }

    public static FT_SpanFunc nblack_spans(long struct) {
        return FT_SpanFunc.createSafe(MemoryUtil.memGetAddress(struct + BLACK_SPANS));
    }

    public static long nbit_test(long struct) {
        return MemoryUtil.memGetAddress(struct + BIT_TEST);
    }

    public static long nbit_set(long struct) {
        return MemoryUtil.memGetAddress(struct + BIT_SET);
    }

    public static long nuser(long struct) {
        return MemoryUtil.memGetAddress(struct + USER);
    }

    public static FT_BBox nclip_box(long struct) {
        return FT_BBox.create(struct + CLIP_BOX);
    }

    public static void ntarget(long struct, FT_Bitmap value) {
        MemoryUtil.memPutAddress(struct + TARGET, MemoryUtil.memAddressSafe(value));
    }

    public static void nsource(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + SOURCE, MemoryUtil.memAddressSafe(value));
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ngray_spans(long struct, FT_SpanFuncI value) {
        MemoryUtil.memPutAddress(struct + GRAY_SPANS, MemoryUtil.memAddressSafe(value));
    }

    public static void nblack_spans(long struct, FT_SpanFuncI value) {
        MemoryUtil.memPutAddress(struct + BLACK_SPANS, MemoryUtil.memAddressSafe(value));
    }

    public static void nbit_test(long struct, long value) {
        MemoryUtil.memPutAddress(struct + BIT_TEST, value);
    }

    public static void nbit_set(long struct, long value) {
        MemoryUtil.memPutAddress(struct + BIT_SET, value);
    }

    public static void nuser(long struct, long value) {
        MemoryUtil.memPutAddress(struct + USER, value);
    }

    public static void nclip_box(long struct, FT_BBox value) {
        MemoryUtil.memCopy(value.address(), struct + CLIP_BOX, FT_BBox.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_Params$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_Params$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Raster_Params, Buffer> implements NativeResource {
        private static final FT_Raster_Params ELEMENT_FACTORY = FT_Raster_Params.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Raster_Params.SIZEOF);
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
        public FT_Raster_Params getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Bitmap const *")
        public FT_Bitmap target() {
            return FT_Raster_Params.ntarget(address());
        }

        @NativeType("void const *")
        public ByteBuffer source(int capacity) {
            return FT_Raster_Params.nsource(address(), capacity);
        }

        public int flags() {
            return FT_Raster_Params.nflags(address());
        }

        public FT_SpanFunc gray_spans() {
            return FT_Raster_Params.ngray_spans(address());
        }

        @NativeType("void *")
        public long user() {
            return FT_Raster_Params.nuser(address());
        }

        public FT_BBox clip_box() {
            return FT_Raster_Params.nclip_box(address());
        }

        public Buffer target(@NativeType("FT_Bitmap const *") FT_Bitmap value) {
            FT_Raster_Params.ntarget(address(), value);
            return this;
        }

        public Buffer source(@NativeType("void const *") ByteBuffer value) {
            FT_Raster_Params.nsource(address(), value);
            return this;
        }

        public Buffer flags(int value) {
            FT_Raster_Params.nflags(address(), value);
            return this;
        }

        public Buffer gray_spans(@NativeType("FT_SpanFunc") FT_SpanFuncI value) {
            FT_Raster_Params.ngray_spans(address(), value);
            return this;
        }

        public Buffer user(@NativeType("void *") long value) {
            FT_Raster_Params.nuser(address(), value);
            return this;
        }

        public Buffer clip_box(FT_BBox value) {
            FT_Raster_Params.nclip_box(address(), value);
            return this;
        }

        public Buffer clip_box(Consumer<FT_BBox> consumer) {
            consumer.accept(clip_box());
            return this;
        }
    }
}
