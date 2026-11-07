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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_Funcs.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_Funcs.class */
public class FT_Raster_Funcs extends Struct<FT_Raster_Funcs> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int GLYPH_FORMAT;
    public static final int RASTER_NEW;
    public static final int RASTER_RESET;
    public static final int RASTER_SET_MODE;
    public static final int RASTER_RENDER;
    public static final int RASTER_DONE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        GLYPH_FORMAT = layout.offsetof(0);
        RASTER_NEW = layout.offsetof(1);
        RASTER_RESET = layout.offsetof(2);
        RASTER_SET_MODE = layout.offsetof(3);
        RASTER_RENDER = layout.offsetof(4);
        RASTER_DONE = layout.offsetof(5);
    }

    protected FT_Raster_Funcs(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Raster_Funcs create(long address, ByteBuffer container) {
        return new FT_Raster_Funcs(address, container);
    }

    public FT_Raster_Funcs(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Glyph_Format")
    public int glyph_format() {
        return nglyph_format(address());
    }

    public FT_Raster_NewFunc raster_new() {
        return nraster_new(address());
    }

    public FT_Raster_ResetFunc raster_reset() {
        return nraster_reset(address());
    }

    public FT_Raster_SetModeFunc raster_set_mode() {
        return nraster_set_mode(address());
    }

    public FT_Raster_RenderFunc raster_render() {
        return nraster_render(address());
    }

    public FT_Raster_DoneFunc raster_done() {
        return nraster_done(address());
    }

    public FT_Raster_Funcs glyph_format(@NativeType("FT_Glyph_Format") int value) {
        nglyph_format(address(), value);
        return this;
    }

    public FT_Raster_Funcs raster_new(@NativeType("FT_Raster_NewFunc") FT_Raster_NewFuncI value) {
        nraster_new(address(), value);
        return this;
    }

    public FT_Raster_Funcs raster_reset(@NativeType("FT_Raster_ResetFunc") FT_Raster_ResetFuncI value) {
        nraster_reset(address(), value);
        return this;
    }

    public FT_Raster_Funcs raster_set_mode(@NativeType("FT_Raster_SetModeFunc") FT_Raster_SetModeFuncI value) {
        nraster_set_mode(address(), value);
        return this;
    }

    public FT_Raster_Funcs raster_render(@NativeType("FT_Raster_RenderFunc") FT_Raster_RenderFuncI value) {
        nraster_render(address(), value);
        return this;
    }

    public FT_Raster_Funcs raster_done(@NativeType("FT_Raster_DoneFunc") FT_Raster_DoneFuncI value) {
        nraster_done(address(), value);
        return this;
    }

    public FT_Raster_Funcs set(int glyph_format, FT_Raster_NewFuncI raster_new, FT_Raster_ResetFuncI raster_reset, FT_Raster_SetModeFuncI raster_set_mode, FT_Raster_RenderFuncI raster_render, FT_Raster_DoneFuncI raster_done) {
        glyph_format(glyph_format);
        raster_new(raster_new);
        raster_reset(raster_reset);
        raster_set_mode(raster_set_mode);
        raster_render(raster_render);
        raster_done(raster_done);
        return this;
    }

    public FT_Raster_Funcs set(FT_Raster_Funcs src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Raster_Funcs malloc() {
        return new FT_Raster_Funcs(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Raster_Funcs calloc() {
        return new FT_Raster_Funcs(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Raster_Funcs create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Raster_Funcs(MemoryUtil.memAddress(container), container);
    }

    public static FT_Raster_Funcs create(long address) {
        return new FT_Raster_Funcs(address, null);
    }

    public static FT_Raster_Funcs createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Raster_Funcs(address, null);
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

    public static FT_Raster_Funcs malloc(MemoryStack stack) {
        return new FT_Raster_Funcs(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Raster_Funcs calloc(MemoryStack stack) {
        return new FT_Raster_Funcs(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nglyph_format(long struct) {
        return MemoryUtil.memGetInt(struct + GLYPH_FORMAT);
    }

    public static FT_Raster_NewFunc nraster_new(long struct) {
        return FT_Raster_NewFunc.createSafe(MemoryUtil.memGetAddress(struct + RASTER_NEW));
    }

    public static FT_Raster_ResetFunc nraster_reset(long struct) {
        return FT_Raster_ResetFunc.createSafe(MemoryUtil.memGetAddress(struct + RASTER_RESET));
    }

    public static FT_Raster_SetModeFunc nraster_set_mode(long struct) {
        return FT_Raster_SetModeFunc.createSafe(MemoryUtil.memGetAddress(struct + RASTER_SET_MODE));
    }

    public static FT_Raster_RenderFunc nraster_render(long struct) {
        return FT_Raster_RenderFunc.createSafe(MemoryUtil.memGetAddress(struct + RASTER_RENDER));
    }

    public static FT_Raster_DoneFunc nraster_done(long struct) {
        return FT_Raster_DoneFunc.createSafe(MemoryUtil.memGetAddress(struct + RASTER_DONE));
    }

    public static void nglyph_format(long struct, int value) {
        MemoryUtil.memPutInt(struct + GLYPH_FORMAT, value);
    }

    public static void nraster_new(long struct, FT_Raster_NewFuncI value) {
        MemoryUtil.memPutAddress(struct + RASTER_NEW, MemoryUtil.memAddressSafe(value));
    }

    public static void nraster_reset(long struct, FT_Raster_ResetFuncI value) {
        MemoryUtil.memPutAddress(struct + RASTER_RESET, MemoryUtil.memAddressSafe(value));
    }

    public static void nraster_set_mode(long struct, FT_Raster_SetModeFuncI value) {
        MemoryUtil.memPutAddress(struct + RASTER_SET_MODE, MemoryUtil.memAddressSafe(value));
    }

    public static void nraster_render(long struct, FT_Raster_RenderFuncI value) {
        MemoryUtil.memPutAddress(struct + RASTER_RENDER, MemoryUtil.memAddressSafe(value));
    }

    public static void nraster_done(long struct, FT_Raster_DoneFuncI value) {
        MemoryUtil.memPutAddress(struct + RASTER_DONE, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_Funcs$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Raster_Funcs$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Raster_Funcs, Buffer> implements NativeResource {
        private static final FT_Raster_Funcs ELEMENT_FACTORY = FT_Raster_Funcs.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Raster_Funcs.SIZEOF);
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
        public FT_Raster_Funcs getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Glyph_Format")
        public int glyph_format() {
            return FT_Raster_Funcs.nglyph_format(address());
        }

        public FT_Raster_NewFunc raster_new() {
            return FT_Raster_Funcs.nraster_new(address());
        }

        public FT_Raster_ResetFunc raster_reset() {
            return FT_Raster_Funcs.nraster_reset(address());
        }

        public FT_Raster_SetModeFunc raster_set_mode() {
            return FT_Raster_Funcs.nraster_set_mode(address());
        }

        public FT_Raster_RenderFunc raster_render() {
            return FT_Raster_Funcs.nraster_render(address());
        }

        public FT_Raster_DoneFunc raster_done() {
            return FT_Raster_Funcs.nraster_done(address());
        }

        public Buffer glyph_format(@NativeType("FT_Glyph_Format") int value) {
            FT_Raster_Funcs.nglyph_format(address(), value);
            return this;
        }

        public Buffer raster_new(@NativeType("FT_Raster_NewFunc") FT_Raster_NewFuncI value) {
            FT_Raster_Funcs.nraster_new(address(), value);
            return this;
        }

        public Buffer raster_reset(@NativeType("FT_Raster_ResetFunc") FT_Raster_ResetFuncI value) {
            FT_Raster_Funcs.nraster_reset(address(), value);
            return this;
        }

        public Buffer raster_set_mode(@NativeType("FT_Raster_SetModeFunc") FT_Raster_SetModeFuncI value) {
            FT_Raster_Funcs.nraster_set_mode(address(), value);
            return this;
        }

        public Buffer raster_render(@NativeType("FT_Raster_RenderFunc") FT_Raster_RenderFuncI value) {
            FT_Raster_Funcs.nraster_render(address(), value);
            return this;
        }

        public Buffer raster_done(@NativeType("FT_Raster_DoneFunc") FT_Raster_DoneFuncI value) {
            FT_Raster_Funcs.nraster_done(address(), value);
            return this;
        }
    }
}
