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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_COLR_Paint.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_COLR_Paint.class */
public class FT_COLR_Paint extends Struct<FT_COLR_Paint> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FORMAT;
    public static final int U;
    public static final int U_COLR_LAYERS;
    public static final int U_GLYPH;
    public static final int U_SOLID;
    public static final int U_LINEAR_GRADIENT;
    public static final int U_RADIAL_GRADIENT;
    public static final int U_SWEEP_GRADIENT;
    public static final int U_TRANSFORM;
    public static final int U_TRANSLATE;
    public static final int U_SCALE;
    public static final int U_ROTATE;
    public static final int U_SKEW;
    public static final int U_COMPOSITE;
    public static final int U_COLR_GLYPH;

    static {
        Struct.Layout layout = __struct(__member(4), __union(__member(FT_PaintColrLayers.SIZEOF, FT_PaintColrLayers.ALIGNOF), __member(FT_PaintGlyph.SIZEOF, FT_PaintGlyph.ALIGNOF), __member(FT_PaintSolid.SIZEOF, FT_PaintSolid.ALIGNOF), __member(FT_PaintLinearGradient.SIZEOF, FT_PaintLinearGradient.ALIGNOF), __member(FT_PaintRadialGradient.SIZEOF, FT_PaintRadialGradient.ALIGNOF), __member(FT_PaintSweepGradient.SIZEOF, FT_PaintSweepGradient.ALIGNOF), __member(FT_PaintTransform.SIZEOF, FT_PaintTransform.ALIGNOF), __member(FT_PaintTranslate.SIZEOF, FT_PaintTranslate.ALIGNOF), __member(FT_PaintScale.SIZEOF, FT_PaintScale.ALIGNOF), __member(FT_PaintRotate.SIZEOF, FT_PaintRotate.ALIGNOF), __member(FT_PaintSkew.SIZEOF, FT_PaintSkew.ALIGNOF), __member(FT_PaintComposite.SIZEOF, FT_PaintComposite.ALIGNOF), __member(FT_PaintColrGlyph.SIZEOF, FT_PaintColrGlyph.ALIGNOF)));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FORMAT = layout.offsetof(0);
        U = layout.offsetof(1);
        U_COLR_LAYERS = layout.offsetof(2);
        U_GLYPH = layout.offsetof(3);
        U_SOLID = layout.offsetof(4);
        U_LINEAR_GRADIENT = layout.offsetof(5);
        U_RADIAL_GRADIENT = layout.offsetof(6);
        U_SWEEP_GRADIENT = layout.offsetof(7);
        U_TRANSFORM = layout.offsetof(8);
        U_TRANSLATE = layout.offsetof(9);
        U_SCALE = layout.offsetof(10);
        U_ROTATE = layout.offsetof(11);
        U_SKEW = layout.offsetof(12);
        U_COMPOSITE = layout.offsetof(13);
        U_COLR_GLYPH = layout.offsetof(14);
    }

    protected FT_COLR_Paint(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_COLR_Paint create(long address, ByteBuffer container) {
        return new FT_COLR_Paint(address, container);
    }

    public FT_COLR_Paint(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_PaintFormat")
    public int format() {
        return nformat(address());
    }

    public FT_PaintColrLayers u_colr_layers() {
        return nu_colr_layers(address());
    }

    public FT_PaintGlyph u_glyph() {
        return nu_glyph(address());
    }

    public FT_PaintSolid u_solid() {
        return nu_solid(address());
    }

    public FT_PaintLinearGradient u_linear_gradient() {
        return nu_linear_gradient(address());
    }

    public FT_PaintRadialGradient u_radial_gradient() {
        return nu_radial_gradient(address());
    }

    public FT_PaintSweepGradient u_sweep_gradient() {
        return nu_sweep_gradient(address());
    }

    public FT_PaintTransform u_transform() {
        return nu_transform(address());
    }

    public FT_PaintTranslate u_translate() {
        return nu_translate(address());
    }

    public FT_PaintScale u_scale() {
        return nu_scale(address());
    }

    public FT_PaintRotate u_rotate() {
        return nu_rotate(address());
    }

    public FT_PaintSkew u_skew() {
        return nu_skew(address());
    }

    public FT_PaintComposite u_composite() {
        return nu_composite(address());
    }

    public FT_PaintColrGlyph u_colr_glyph() {
        return nu_colr_glyph(address());
    }

    public static FT_COLR_Paint malloc() {
        return new FT_COLR_Paint(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_COLR_Paint calloc() {
        return new FT_COLR_Paint(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_COLR_Paint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_COLR_Paint(MemoryUtil.memAddress(container), container);
    }

    public static FT_COLR_Paint create(long address) {
        return new FT_COLR_Paint(address, null);
    }

    public static FT_COLR_Paint createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_COLR_Paint(address, null);
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

    public static FT_COLR_Paint malloc(MemoryStack stack) {
        return new FT_COLR_Paint(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_COLR_Paint calloc(MemoryStack stack) {
        return new FT_COLR_Paint(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static FT_PaintColrLayers nu_colr_layers(long struct) {
        return FT_PaintColrLayers.create(struct + U_COLR_LAYERS);
    }

    public static FT_PaintGlyph nu_glyph(long struct) {
        return FT_PaintGlyph.create(struct + U_GLYPH);
    }

    public static FT_PaintSolid nu_solid(long struct) {
        return FT_PaintSolid.create(struct + U_SOLID);
    }

    public static FT_PaintLinearGradient nu_linear_gradient(long struct) {
        return FT_PaintLinearGradient.create(struct + U_LINEAR_GRADIENT);
    }

    public static FT_PaintRadialGradient nu_radial_gradient(long struct) {
        return FT_PaintRadialGradient.create(struct + U_RADIAL_GRADIENT);
    }

    public static FT_PaintSweepGradient nu_sweep_gradient(long struct) {
        return FT_PaintSweepGradient.create(struct + U_SWEEP_GRADIENT);
    }

    public static FT_PaintTransform nu_transform(long struct) {
        return FT_PaintTransform.create(struct + U_TRANSFORM);
    }

    public static FT_PaintTranslate nu_translate(long struct) {
        return FT_PaintTranslate.create(struct + U_TRANSLATE);
    }

    public static FT_PaintScale nu_scale(long struct) {
        return FT_PaintScale.create(struct + U_SCALE);
    }

    public static FT_PaintRotate nu_rotate(long struct) {
        return FT_PaintRotate.create(struct + U_ROTATE);
    }

    public static FT_PaintSkew nu_skew(long struct) {
        return FT_PaintSkew.create(struct + U_SKEW);
    }

    public static FT_PaintComposite nu_composite(long struct) {
        return FT_PaintComposite.create(struct + U_COMPOSITE);
    }

    public static FT_PaintColrGlyph nu_colr_glyph(long struct) {
        return FT_PaintColrGlyph.create(struct + U_COLR_GLYPH);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_COLR_Paint$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_COLR_Paint$Buffer.class */
    public static class Buffer extends StructBuffer<FT_COLR_Paint, Buffer> implements NativeResource {
        private static final FT_COLR_Paint ELEMENT_FACTORY = FT_COLR_Paint.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_COLR_Paint.SIZEOF);
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
        public FT_COLR_Paint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_PaintFormat")
        public int format() {
            return FT_COLR_Paint.nformat(address());
        }

        public FT_PaintColrLayers u_colr_layers() {
            return FT_COLR_Paint.nu_colr_layers(address());
        }

        public FT_PaintGlyph u_glyph() {
            return FT_COLR_Paint.nu_glyph(address());
        }

        public FT_PaintSolid u_solid() {
            return FT_COLR_Paint.nu_solid(address());
        }

        public FT_PaintLinearGradient u_linear_gradient() {
            return FT_COLR_Paint.nu_linear_gradient(address());
        }

        public FT_PaintRadialGradient u_radial_gradient() {
            return FT_COLR_Paint.nu_radial_gradient(address());
        }

        public FT_PaintSweepGradient u_sweep_gradient() {
            return FT_COLR_Paint.nu_sweep_gradient(address());
        }

        public FT_PaintTransform u_transform() {
            return FT_COLR_Paint.nu_transform(address());
        }

        public FT_PaintTranslate u_translate() {
            return FT_COLR_Paint.nu_translate(address());
        }

        public FT_PaintScale u_scale() {
            return FT_COLR_Paint.nu_scale(address());
        }

        public FT_PaintRotate u_rotate() {
            return FT_COLR_Paint.nu_rotate(address());
        }

        public FT_PaintSkew u_skew() {
            return FT_COLR_Paint.nu_skew(address());
        }

        public FT_PaintComposite u_composite() {
            return FT_COLR_Paint.nu_composite(address());
        }

        public FT_PaintColrGlyph u_colr_glyph() {
            return FT_COLR_Paint.nu_colr_glyph(address());
        }
    }
}
