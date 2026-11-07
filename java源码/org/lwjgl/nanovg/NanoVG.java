package org.lwjgl.nanovg;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.nanovg.NVGGlyphPosition;
import org.lwjgl.nanovg.NVGTextRow;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoVG.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoVG.class */
public class NanoVG {
    public static final float NVG_PI = 3.1415927f;
    public static final int NVG_CCW = 1;
    public static final int NVG_CW = 2;
    public static final int NVG_SOLID = 1;
    public static final int NVG_HOLE = 2;
    public static final int NVG_BUTT = 0;
    public static final int NVG_ROUND = 1;
    public static final int NVG_SQUARE = 2;
    public static final int NVG_BEVEL = 3;
    public static final int NVG_MITER = 4;
    public static final int NVG_ALIGN_LEFT = 1;
    public static final int NVG_ALIGN_CENTER = 2;
    public static final int NVG_ALIGN_RIGHT = 4;
    public static final int NVG_ALIGN_TOP = 8;
    public static final int NVG_ALIGN_MIDDLE = 16;
    public static final int NVG_ALIGN_BOTTOM = 32;
    public static final int NVG_ALIGN_BASELINE = 64;
    public static final int NVG_ZERO = 1;
    public static final int NVG_ONE = 2;
    public static final int NVG_SRC_COLOR = 4;
    public static final int NVG_ONE_MINUS_SRC_COLOR = 8;
    public static final int NVG_DST_COLOR = 16;
    public static final int NVG_ONE_MINUS_DST_COLOR = 32;
    public static final int NVG_SRC_ALPHA = 64;
    public static final int NVG_ONE_MINUS_SRC_ALPHA = 128;
    public static final int NVG_DST_ALPHA = 256;
    public static final int NVG_ONE_MINUS_DST_ALPHA = 512;
    public static final int NVG_SRC_ALPHA_SATURATE = 1024;
    public static final int NVG_SOURCE_OVER = 0;
    public static final int NVG_SOURCE_IN = 1;
    public static final int NVG_SOURCE_OUT = 2;
    public static final int NVG_ATOP = 3;
    public static final int NVG_DESTINATION_OVER = 4;
    public static final int NVG_DESTINATION_IN = 5;
    public static final int NVG_DESTINATION_OUT = 6;
    public static final int NVG_DESTINATION_ATOP = 7;
    public static final int NVG_LIGHTER = 8;
    public static final int NVG_COPY = 9;
    public static final int NVG_XOR = 10;
    public static final int NVG_IMAGE_GENERATE_MIPMAPS = 1;
    public static final int NVG_IMAGE_REPEATX = 2;
    public static final int NVG_IMAGE_REPEATY = 4;
    public static final int NVG_IMAGE_FLIPY = 8;
    public static final int NVG_IMAGE_PREMULTIPLIED = 16;
    public static final int NVG_IMAGE_NEAREST = 32;
    static final long nvgCreateInternal;
    static final long nvgInternalParams;
    static final long nvgDeleteInternal;

    public static native void nnvgBeginFrame(long j, float f, float f2, float f3);

    public static native void nnvgCancelFrame(long j);

    public static native void nnvgEndFrame(long j);

    public static native void nnvgGlobalCompositeOperation(long j, int i);

    public static native void nnvgGlobalCompositeBlendFunc(long j, int i, int i2);

    public static native void nnvgGlobalCompositeBlendFuncSeparate(long j, int i, int i2, int i3, int i4);

    public static native void nnvgRGB(byte b, byte b2, byte b3, long j);

    public static native void nnvgRGBf(float f, float f2, float f3, long j);

    public static native void nnvgRGBA(byte b, byte b2, byte b3, byte b4, long j);

    public static native void nnvgRGBAf(float f, float f2, float f3, float f4, long j);

    public static native void nnvgLerpRGBA(long j, long j2, float f, long j3);

    public static native void nnvgTransRGBA(long j, byte b, long j2);

    public static native void nnvgTransRGBAf(long j, float f, long j2);

    public static native void nnvgHSL(float f, float f2, float f3, long j);

    public static native void nnvgHSLA(float f, float f2, float f3, byte b, long j);

    public static native void nnvgSave(long j);

    public static native void nnvgRestore(long j);

    public static native void nnvgReset(long j);

    public static native void nnvgShapeAntiAlias(long j, int i);

    public static native void nnvgStrokeColor(long j, long j2);

    public static native void nnvgStrokePaint(long j, long j2);

    public static native void nnvgFillColor(long j, long j2);

    public static native void nnvgFillPaint(long j, long j2);

    public static native void nnvgMiterLimit(long j, float f);

    public static native void nnvgStrokeWidth(long j, float f);

    public static native void nnvgLineCap(long j, int i);

    public static native void nnvgLineJoin(long j, int i);

    public static native void nnvgGlobalAlpha(long j, float f);

    public static native void nnvgResetTransform(long j);

    public static native void nnvgTransform(long j, float f, float f2, float f3, float f4, float f5, float f6);

    public static native void nnvgTranslate(long j, float f, float f2);

    public static native void nnvgRotate(long j, float f);

    public static native void nnvgSkewX(long j, float f);

    public static native void nnvgSkewY(long j, float f);

    public static native void nnvgScale(long j, float f, float f2);

    public static native void nnvgCurrentTransform(long j, long j2);

    public static native void nnvgTransformIdentity(long j);

    public static native void nnvgTransformTranslate(long j, float f, float f2);

    public static native void nnvgTransformScale(long j, float f, float f2);

    public static native void nnvgTransformRotate(long j, float f);

    public static native void nnvgTransformSkewX(long j, float f);

    public static native void nnvgTransformSkewY(long j, float f);

    public static native void nnvgTransformMultiply(long j, long j2);

    public static native void nnvgTransformPremultiply(long j, long j2);

    public static native int nnvgTransformInverse(long j, long j2);

    public static native void nnvgTransformPoint(long j, long j2, long j3, float f, float f2);

    public static native float nvgDegToRad(float f);

    public static native float nvgRadToDeg(float f);

    public static native int nnvgCreateImage(long j, long j2, int i);

    public static native int nnvgCreateImageMem(long j, int i, long j2, int i2);

    public static native int nnvgCreateImageRGBA(long j, int i, int i2, int i3, long j2);

    public static native void nnvgUpdateImage(long j, int i, long j2);

    public static native void nnvgImageSize(long j, int i, long j2, long j3);

    public static native void nnvgDeleteImage(long j, int i);

    public static native void nnvgLinearGradient(long j, float f, float f2, float f3, float f4, long j2, long j3, long j4);

    public static native void nnvgBoxGradient(long j, float f, float f2, float f3, float f4, float f5, float f6, long j2, long j3, long j4);

    public static native void nnvgRadialGradient(long j, float f, float f2, float f3, float f4, long j2, long j3, long j4);

    public static native void nnvgImagePattern(long j, float f, float f2, float f3, float f4, float f5, int i, float f6, long j2);

    public static native void nnvgScissor(long j, float f, float f2, float f3, float f4);

    public static native void nnvgIntersectScissor(long j, float f, float f2, float f3, float f4);

    public static native void nnvgResetScissor(long j);

    public static native void nnvgBeginPath(long j);

    public static native void nnvgMoveTo(long j, float f, float f2);

    public static native void nnvgLineTo(long j, float f, float f2);

    public static native void nnvgBezierTo(long j, float f, float f2, float f3, float f4, float f5, float f6);

    public static native void nnvgQuadTo(long j, float f, float f2, float f3, float f4);

    public static native void nnvgArcTo(long j, float f, float f2, float f3, float f4, float f5);

    public static native void nnvgClosePath(long j);

    public static native void nnvgPathWinding(long j, int i);

    public static native void nnvgArc(long j, float f, float f2, float f3, float f4, float f5, int i);

    public static native void nnvgRect(long j, float f, float f2, float f3, float f4);

    public static native void nnvgRoundedRect(long j, float f, float f2, float f3, float f4, float f5);

    public static native void nnvgRoundedRectVarying(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8);

    public static native void nnvgEllipse(long j, float f, float f2, float f3, float f4);

    public static native void nnvgCircle(long j, float f, float f2, float f3);

    public static native void nnvgFill(long j);

    public static native void nnvgStroke(long j);

    public static native int nnvgCreateFont(long j, long j2, long j3);

    public static native int nnvgCreateFontAtIndex(long j, long j2, long j3, int i);

    public static native int nnvgCreateFontMem(long j, long j2, long j3, int i, int i2);

    public static native int nnvgCreateFontMemAtIndex(long j, long j2, long j3, int i, int i2, int i3);

    public static native int nnvgFindFont(long j, long j2);

    public static native int nnvgAddFallbackFontId(long j, int i, int i2);

    public static native int nnvgAddFallbackFont(long j, long j2, long j3);

    public static native void nnvgResetFallbackFontsId(long j, int i);

    public static native void nnvgResetFallbackFonts(long j, long j2);

    public static native void nnvgFontSize(long j, float f);

    public static native void nnvgFontBlur(long j, float f);

    public static native void nnvgTextLetterSpacing(long j, float f);

    public static native void nnvgTextLineHeight(long j, float f);

    public static native void nnvgTextAlign(long j, int i);

    public static native void nnvgFontFaceId(long j, int i);

    public static native void nnvgFontFace(long j, long j2);

    public static native float nnvgText(long j, float f, float f2, long j2, long j3);

    public static native void nnvgTextBox(long j, float f, float f2, float f3, long j2, long j3);

    public static native float nnvgTextBounds(long j, float f, float f2, long j2, long j3, long j4);

    public static native void nnvgTextBoxBounds(long j, float f, float f2, float f3, long j2, long j3, long j4);

    public static native int nnvgTextGlyphPositions(long j, float f, float f2, long j2, long j3, long j4, int i);

    public static native void nnvgTextMetrics(long j, long j2, long j3, long j4);

    public static native int nnvgTextBreakLines(long j, long j2, long j3, float f, long j4, int i);

    @NativeType("void *")
    private static native long nvgCreateInternal();

    @NativeType("void *")
    private static native long nvgInternalParams();

    @NativeType("void *")
    private static native long nvgDeleteInternal();

    public static native void nnvgCurrentTransform(long j, float[] fArr);

    public static native void nnvgTransformIdentity(float[] fArr);

    public static native void nnvgTransformTranslate(float[] fArr, float f, float f2);

    public static native void nnvgTransformScale(float[] fArr, float f, float f2);

    public static native void nnvgTransformRotate(float[] fArr, float f);

    public static native void nnvgTransformSkewX(float[] fArr, float f);

    public static native void nnvgTransformSkewY(float[] fArr, float f);

    public static native void nnvgTransformMultiply(float[] fArr, float[] fArr2);

    public static native void nnvgTransformPremultiply(float[] fArr, float[] fArr2);

    public static native int nnvgTransformInverse(float[] fArr, float[] fArr2);

    public static native void nnvgTransformPoint(float[] fArr, float[] fArr2, float[] fArr3, float f, float f2);

    public static native void nnvgImageSize(long j, int i, int[] iArr, int[] iArr2);

    public static native float nnvgTextBounds(long j, float f, float f2, long j2, long j3, float[] fArr);

    public static native void nnvgTextBoxBounds(long j, float f, float f2, float f3, long j2, long j3, float[] fArr);

    public static native void nnvgTextMetrics(long j, float[] fArr, float[] fArr2, float[] fArr3);

    static {
        LibNanoVG.initialize();
        nvgCreateInternal = nvgCreateInternal();
        nvgInternalParams = nvgInternalParams();
        nvgDeleteInternal = nvgDeleteInternal();
    }

    protected NanoVG() {
        throw new UnsupportedOperationException();
    }

    public static void nvgBeginFrame(@NativeType("NVGcontext *") long ctx, float windowWidth, float windowHeight, float devicePixelRatio) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgBeginFrame(ctx, windowWidth, windowHeight, devicePixelRatio);
    }

    public static void nvgCancelFrame(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgCancelFrame(ctx);
    }

    public static void nvgEndFrame(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgEndFrame(ctx);
    }

    public static void nvgGlobalCompositeOperation(@NativeType("NVGcontext *") long ctx, int op) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgGlobalCompositeOperation(ctx, op);
    }

    public static void nvgGlobalCompositeBlendFunc(@NativeType("NVGcontext *") long ctx, int sfactor, int dfactor) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgGlobalCompositeBlendFunc(ctx, sfactor, dfactor);
    }

    public static void nvgGlobalCompositeBlendFuncSeparate(@NativeType("NVGcontext *") long ctx, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgGlobalCompositeBlendFuncSeparate(ctx, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    @NativeType("NVGcolor")
    public static NVGColor nvgRGB(@NativeType("unsigned char") byte r, @NativeType("unsigned char") byte g, @NativeType("unsigned char") byte b, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGB(r, g, b, __result.address());
        return __result;
    }

    @NativeType("NVGcolor")
    public static NVGColor nvgRGBf(float r, float g, float b, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGBf(r, g, b, __result.address());
        return __result;
    }

    @NativeType("NVGcolor")
    public static NVGColor nvgRGBA(@NativeType("unsigned char") byte r, @NativeType("unsigned char") byte g, @NativeType("unsigned char") byte b, @NativeType("unsigned char") byte a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGBA(r, g, b, a, __result.address());
        return __result;
    }

    @NativeType("NVGcolor")
    public static NVGColor nvgRGBAf(float r, float g, float b, float a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGBAf(r, g, b, a, __result.address());
        return __result;
    }

    @NativeType("NVGcolor")
    public static NVGColor nvgLerpRGBA(@NativeType("NVGcolor") NVGColor c0, @NativeType("NVGcolor") NVGColor c1, float u, @NativeType("NVGcolor") NVGColor __result) {
        nnvgLerpRGBA(c0.address(), c1.address(), u, __result.address());
        return __result;
    }

    @NativeType("NVGcolor")
    public static NVGColor nvgTransRGBA(@NativeType("NVGcolor") NVGColor c0, @NativeType("unsigned char") byte a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgTransRGBA(c0.address(), a, __result.address());
        return __result;
    }

    @NativeType("NVGcolor")
    public static NVGColor nvgTransRGBAf(@NativeType("NVGcolor") NVGColor c0, float a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgTransRGBAf(c0.address(), a, __result.address());
        return __result;
    }

    @NativeType("NVGcolor")
    public static NVGColor nvgHSL(float h, float s, float l, @NativeType("NVGcolor") NVGColor __result) {
        nnvgHSL(h, s, l, __result.address());
        return __result;
    }

    @NativeType("NVGcolor")
    public static NVGColor nvgHSLA(float h, float s, float l, @NativeType("unsigned char") byte a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgHSLA(h, s, l, a, __result.address());
        return __result;
    }

    public static void nvgSave(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgSave(ctx);
    }

    public static void nvgRestore(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgRestore(ctx);
    }

    public static void nvgReset(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgReset(ctx);
    }

    public static void nvgShapeAntiAlias(@NativeType("NVGcontext *") long ctx, @NativeType("int") boolean enabled) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgShapeAntiAlias(ctx, enabled ? 1 : 0);
    }

    public static void nvgStrokeColor(@NativeType("NVGcontext *") long ctx, @NativeType("NVGcolor") NVGColor color) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgStrokeColor(ctx, color.address());
    }

    public static void nvgStrokePaint(@NativeType("NVGcontext *") long ctx, @NativeType("NVGpaint") NVGPaint paint) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgStrokePaint(ctx, paint.address());
    }

    public static void nvgFillColor(@NativeType("NVGcontext *") long ctx, @NativeType("NVGcolor") NVGColor color) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgFillColor(ctx, color.address());
    }

    public static void nvgFillPaint(@NativeType("NVGcontext *") long ctx, @NativeType("NVGpaint") NVGPaint paint) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgFillPaint(ctx, paint.address());
    }

    public static void nvgMiterLimit(@NativeType("NVGcontext *") long ctx, float limit) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgMiterLimit(ctx, limit);
    }

    public static void nvgStrokeWidth(@NativeType("NVGcontext *") long ctx, float size) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgStrokeWidth(ctx, size);
    }

    public static void nvgLineCap(@NativeType("NVGcontext *") long ctx, int cap) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgLineCap(ctx, cap);
    }

    public static void nvgLineJoin(@NativeType("NVGcontext *") long ctx, int join) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgLineJoin(ctx, join);
    }

    public static void nvgGlobalAlpha(@NativeType("NVGcontext *") long ctx, float alpha) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgGlobalAlpha(ctx, alpha);
    }

    public static void nvgResetTransform(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgResetTransform(ctx);
    }

    public static void nvgTransform(@NativeType("NVGcontext *") long ctx, float a, float b, float c, float d, float e, float f) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgTransform(ctx, a, b, c, d, e, f);
    }

    public static void nvgTranslate(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgTranslate(ctx, x, y);
    }

    public static void nvgRotate(@NativeType("NVGcontext *") long ctx, float angle) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgRotate(ctx, angle);
    }

    public static void nvgSkewX(@NativeType("NVGcontext *") long ctx, float angle) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgSkewX(ctx, angle);
    }

    public static void nvgSkewY(@NativeType("NVGcontext *") long ctx, float angle) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgSkewY(ctx, angle);
    }

    public static void nvgScale(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgScale(ctx, x, y);
    }

    public static void nvgCurrentTransform(@NativeType("NVGcontext *") long ctx, @NativeType("float *") FloatBuffer xform) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) xform, 6);
        }
        nnvgCurrentTransform(ctx, MemoryUtil.memAddress(xform));
    }

    public static void nvgTransformIdentity(@NativeType("float *") FloatBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, 6);
        }
        nnvgTransformIdentity(MemoryUtil.memAddress(dst));
    }

    public static void nvgTransformTranslate(@NativeType("float *") FloatBuffer dst, float tx, float ty) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, 6);
        }
        nnvgTransformTranslate(MemoryUtil.memAddress(dst), tx, ty);
    }

    public static void nvgTransformScale(@NativeType("float *") FloatBuffer dst, float sx, float sy) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, 6);
        }
        nnvgTransformScale(MemoryUtil.memAddress(dst), sx, sy);
    }

    public static void nvgTransformRotate(@NativeType("float *") FloatBuffer dst, float a) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, 6);
        }
        nnvgTransformRotate(MemoryUtil.memAddress(dst), a);
    }

    public static void nvgTransformSkewX(@NativeType("float *") FloatBuffer dst, float a) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, 6);
        }
        nnvgTransformSkewX(MemoryUtil.memAddress(dst), a);
    }

    public static void nvgTransformSkewY(@NativeType("float *") FloatBuffer dst, float a) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, 6);
        }
        nnvgTransformSkewY(MemoryUtil.memAddress(dst), a);
    }

    public static void nvgTransformMultiply(@NativeType("float *") FloatBuffer dst, @NativeType("float const *") FloatBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, 6);
            Checks.check((Buffer) src, 6);
        }
        nnvgTransformMultiply(MemoryUtil.memAddress(dst), MemoryUtil.memAddress(src));
    }

    public static void nvgTransformPremultiply(@NativeType("float *") FloatBuffer dst, @NativeType("float const *") FloatBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, 6);
            Checks.check((Buffer) src, 6);
        }
        nnvgTransformPremultiply(MemoryUtil.memAddress(dst), MemoryUtil.memAddress(src));
    }

    @NativeType("int")
    public static boolean nvgTransformInverse(@NativeType("float *") FloatBuffer dst, @NativeType("float const *") FloatBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, 6);
            Checks.check((Buffer) src, 6);
        }
        return nnvgTransformInverse(MemoryUtil.memAddress(dst), MemoryUtil.memAddress(src)) != 0;
    }

    public static void nvgTransformPoint(@NativeType("float *") FloatBuffer dstx, @NativeType("float *") FloatBuffer dsty, @NativeType("float const *") FloatBuffer xform, float srcx, float srcy) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dstx, 1);
            Checks.check((Buffer) dsty, 1);
            Checks.check((Buffer) xform, 6);
        }
        nnvgTransformPoint(MemoryUtil.memAddress(dstx), MemoryUtil.memAddress(dsty), MemoryUtil.memAddress(xform), srcx, srcy);
    }

    public static int nvgCreateImage(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer filename, int imageFlags) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(filename);
        }
        return nnvgCreateImage(ctx, MemoryUtil.memAddress(filename), imageFlags);
    }

    public static int nvgCreateImage(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence filename, int imageFlags) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            int iNnvgCreateImage = nnvgCreateImage(ctx, filenameEncoded, imageFlags);
            stack.setPointer(stackPointer);
            return iNnvgCreateImage;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvgCreateImageMem(@NativeType("NVGcontext *") long ctx, int imageFlags, @NativeType("unsigned char *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nnvgCreateImageMem(ctx, imageFlags, MemoryUtil.memAddress(data), data.remaining());
    }

    public static int nvgCreateImageRGBA(@NativeType("NVGcontext *") long ctx, int w, int h, int imageFlags, @NativeType("unsigned char const *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) data, w * h * 4);
        }
        return nnvgCreateImageRGBA(ctx, w, h, imageFlags, MemoryUtil.memAddress(data));
    }

    public static void nvgUpdateImage(@NativeType("NVGcontext *") long ctx, int image, @NativeType("unsigned char const *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgUpdateImage(ctx, image, MemoryUtil.memAddress(data));
    }

    public static void nvgImageSize(@NativeType("NVGcontext *") long ctx, int image, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer) w, 1);
            Checks.check((Buffer) h, 1);
        }
        nnvgImageSize(ctx, image, MemoryUtil.memAddress(w), MemoryUtil.memAddress(h));
    }

    public static void nvgDeleteImage(@NativeType("NVGcontext *") long ctx, int image) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgDeleteImage(ctx, image);
    }

    @NativeType("NVGpaint")
    public static NVGPaint nvgLinearGradient(@NativeType("NVGcontext *") long ctx, float sx, float sy, float ex, float ey, @NativeType("NVGcolor") NVGColor icol, @NativeType("NVGcolor") NVGColor ocol, @NativeType("NVGpaint") NVGPaint __result) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgLinearGradient(ctx, sx, sy, ex, ey, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    @NativeType("NVGpaint")
    public static NVGPaint nvgBoxGradient(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float r, float f, @NativeType("NVGcolor") NVGColor icol, @NativeType("NVGcolor") NVGColor ocol, @NativeType("NVGpaint") NVGPaint __result) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgBoxGradient(ctx, x, y, w, h, r, f, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    @NativeType("NVGpaint")
    public static NVGPaint nvgRadialGradient(@NativeType("NVGcontext *") long ctx, float cx, float cy, float inr, float outr, @NativeType("NVGcolor") NVGColor icol, @NativeType("NVGcolor") NVGColor ocol, @NativeType("NVGpaint") NVGPaint __result) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgRadialGradient(ctx, cx, cy, inr, outr, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    @NativeType("NVGpaint")
    public static NVGPaint nvgImagePattern(@NativeType("NVGcontext *") long ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha, @NativeType("NVGpaint") NVGPaint __result) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgImagePattern(ctx, ox, oy, ex, ey, angle, image, alpha, __result.address());
        return __result;
    }

    public static void nvgScissor(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgScissor(ctx, x, y, w, h);
    }

    public static void nvgIntersectScissor(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgIntersectScissor(ctx, x, y, w, h);
    }

    public static void nvgResetScissor(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgResetScissor(ctx);
    }

    public static void nvgBeginPath(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgBeginPath(ctx);
    }

    public static void nvgMoveTo(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgMoveTo(ctx, x, y);
    }

    public static void nvgLineTo(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgLineTo(ctx, x, y);
    }

    public static void nvgBezierTo(@NativeType("NVGcontext *") long ctx, float c1x, float c1y, float c2x, float c2y, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgBezierTo(ctx, c1x, c1y, c2x, c2y, x, y);
    }

    public static void nvgQuadTo(@NativeType("NVGcontext *") long ctx, float cx, float cy, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgQuadTo(ctx, cx, cy, x, y);
    }

    public static void nvgArcTo(@NativeType("NVGcontext *") long ctx, float x1, float y1, float x2, float y2, float radius) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgArcTo(ctx, x1, y1, x2, y2, radius);
    }

    public static void nvgClosePath(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgClosePath(ctx);
    }

    public static void nvgPathWinding(@NativeType("NVGcontext *") long ctx, int dir) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgPathWinding(ctx, dir);
    }

    public static void nvgArc(@NativeType("NVGcontext *") long ctx, float cx, float cy, float r, float a0, float a1, int dir) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgArc(ctx, cx, cy, r, a0, a1, dir);
    }

    public static void nvgRect(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgRect(ctx, x, y, w, h);
    }

    public static void nvgRoundedRect(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float r) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgRoundedRect(ctx, x, y, w, h, r);
    }

    public static void nvgRoundedRectVarying(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float radTopLeft, float radTopRight, float radBottomRight, float radBottomLeft) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgRoundedRectVarying(ctx, x, y, w, h, radTopLeft, radTopRight, radBottomRight, radBottomLeft);
    }

    public static void nvgEllipse(@NativeType("NVGcontext *") long ctx, float cx, float cy, float rx, float ry) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgEllipse(ctx, cx, cy, rx, ry);
    }

    public static void nvgCircle(@NativeType("NVGcontext *") long ctx, float cx, float cy, float r) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgCircle(ctx, cx, cy, r);
    }

    public static void nvgFill(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgFill(ctx);
    }

    public static void nvgStroke(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgStroke(ctx);
    }

    public static int nvgCreateFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer filename) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(name);
            Checks.checkNT1(filename);
        }
        return nnvgCreateFont(ctx, MemoryUtil.memAddress(name), MemoryUtil.memAddress(filename));
    }

    public static int nvgCreateFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence filename) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            int iNnvgCreateFont = nnvgCreateFont(ctx, nameEncoded, filenameEncoded);
            stack.setPointer(stackPointer);
            return iNnvgCreateFont;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvgCreateFontAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer filename, int fontIndex) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(name);
            Checks.checkNT1(filename);
        }
        return nnvgCreateFontAtIndex(ctx, MemoryUtil.memAddress(name), MemoryUtil.memAddress(filename), fontIndex);
    }

    public static int nvgCreateFontAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence filename, int fontIndex) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            int iNnvgCreateFontAtIndex = nnvgCreateFontAtIndex(ctx, nameEncoded, filenameEncoded, fontIndex);
            stack.setPointer(stackPointer);
            return iNnvgCreateFontAtIndex;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvgCreateFontMem(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(name);
        }
        return nnvgCreateFontMem(ctx, MemoryUtil.memAddress(name), MemoryUtil.memAddress(data), data.remaining(), freeData ? 1 : 0);
    }

    public static int nvgCreateFontMem(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("unsigned char *") ByteBuffer data, int freeData) {
        return nvgCreateFontMem(ctx, name, data, freeData != 0);
    }

    public static int nvgCreateFontMem(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            int iNnvgCreateFontMem = nnvgCreateFontMem(ctx, nameEncoded, MemoryUtil.memAddress(data), data.remaining(), freeData ? 1 : 0);
            stack.setPointer(stackPointer);
            return iNnvgCreateFontMem;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvgCreateFontMem(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("unsigned char *") ByteBuffer data, int freeData) {
        return nvgCreateFontMem(ctx, name, data, freeData != 0);
    }

    public static int nvgCreateFontMemAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData, int fontIndex) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(name);
        }
        return nnvgCreateFontMemAtIndex(ctx, MemoryUtil.memAddress(name), MemoryUtil.memAddress(data), data.remaining(), freeData ? 1 : 0, fontIndex);
    }

    public static int nvgCreateFontMemAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("unsigned char *") ByteBuffer data, int freeData, int fontIndex) {
        return nvgCreateFontMemAtIndex(ctx, name, data, freeData != 0, fontIndex);
    }

    public static int nvgCreateFontMemAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData, int fontIndex) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            int iNnvgCreateFontMemAtIndex = nnvgCreateFontMemAtIndex(ctx, nameEncoded, MemoryUtil.memAddress(data), data.remaining(), freeData ? 1 : 0, fontIndex);
            stack.setPointer(stackPointer);
            return iNnvgCreateFontMemAtIndex;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvgCreateFontMemAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("unsigned char *") ByteBuffer data, int freeData, int fontIndex) {
        return nvgCreateFontMemAtIndex(ctx, name, data, freeData != 0, fontIndex);
    }

    public static int nvgFindFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(name);
        }
        return nnvgFindFont(ctx, MemoryUtil.memAddress(name));
    }

    public static int nvgFindFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            int iNnvgFindFont = nnvgFindFont(ctx, nameEncoded);
            stack.setPointer(stackPointer);
            return iNnvgFindFont;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvgAddFallbackFontId(@NativeType("NVGcontext *") long ctx, int baseFont, int fallbackFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nnvgAddFallbackFontId(ctx, baseFont, fallbackFont);
    }

    public static int nvgAddFallbackFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer baseFont, @NativeType("char const *") ByteBuffer fallbackFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(baseFont);
            Checks.checkNT1(fallbackFont);
        }
        return nnvgAddFallbackFont(ctx, MemoryUtil.memAddress(baseFont), MemoryUtil.memAddress(fallbackFont));
    }

    public static int nvgAddFallbackFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence baseFont, @NativeType("char const *") CharSequence fallbackFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(baseFont, true);
            long baseFontEncoded = stack.getPointerAddress();
            stack.nASCII(fallbackFont, true);
            long fallbackFontEncoded = stack.getPointerAddress();
            int iNnvgAddFallbackFont = nnvgAddFallbackFont(ctx, baseFontEncoded, fallbackFontEncoded);
            stack.setPointer(stackPointer);
            return iNnvgAddFallbackFont;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nvgResetFallbackFontsId(@NativeType("NVGcontext *") long ctx, int baseFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgResetFallbackFontsId(ctx, baseFont);
    }

    public static void nvgResetFallbackFonts(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer baseFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(baseFont);
        }
        nnvgResetFallbackFonts(ctx, MemoryUtil.memAddress(baseFont));
    }

    public static void nvgResetFallbackFonts(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence baseFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(baseFont, true);
            long baseFontEncoded = stack.getPointerAddress();
            nnvgResetFallbackFonts(ctx, baseFontEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nvgFontSize(@NativeType("NVGcontext *") long ctx, float size) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgFontSize(ctx, size);
    }

    public static void nvgFontBlur(@NativeType("NVGcontext *") long ctx, float blur) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgFontBlur(ctx, blur);
    }

    public static void nvgTextLetterSpacing(@NativeType("NVGcontext *") long ctx, float spacing) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgTextLetterSpacing(ctx, spacing);
    }

    public static void nvgTextLineHeight(@NativeType("NVGcontext *") long ctx, float lineHeight) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgTextLineHeight(ctx, lineHeight);
    }

    public static void nvgTextAlign(@NativeType("NVGcontext *") long ctx, int align) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgTextAlign(ctx, align);
    }

    public static void nvgFontFaceId(@NativeType("NVGcontext *") long ctx, int font) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgFontFaceId(ctx, font);
    }

    public static void nvgFontFace(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer font) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(font);
        }
        nnvgFontFace(ctx, MemoryUtil.memAddress(font));
    }

    public static void nvgFontFace(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence font) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(font, true);
            long fontEncoded = stack.getPointerAddress();
            nnvgFontFace(ctx, fontEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static float nvgText(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nnvgText(ctx, x, y, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + string.remaining());
    }

    public static float nvgText(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            float fNnvgText = nnvgText(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength);
            stack.setPointer(stackPointer);
            return fNnvgText;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nvgTextBox(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") ByteBuffer string) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgTextBox(ctx, x, y, breakRowWidth, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + string.remaining());
    }

    public static void nvgTextBox(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") CharSequence string) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nnvgTextBox(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + stringEncodedLength);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string, @NativeType("float *") FloatBuffer bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe((Buffer) bounds, 4);
        }
        return nnvgTextBounds(ctx, x, y, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + string.remaining(), MemoryUtil.memAddressSafe(bounds));
    }

    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string, @NativeType("float *") FloatBuffer bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe((Buffer) bounds, 4);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            float fNnvgTextBounds = nnvgTextBounds(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength, MemoryUtil.memAddressSafe(bounds));
            stack.setPointer(stackPointer);
            return fNnvgTextBounds;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") ByteBuffer string, @NativeType("float *") FloatBuffer bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe((Buffer) bounds, 4);
        }
        nnvgTextBoxBounds(ctx, x, y, breakRowWidth, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + string.remaining(), MemoryUtil.memAddressSafe(bounds));
    }

    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") CharSequence string, @NativeType("float *") FloatBuffer bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe((Buffer) bounds, 4);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nnvgTextBoxBounds(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + stringEncodedLength, MemoryUtil.memAddressSafe(bounds));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nvgTextGlyphPositions(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string, @NativeType("NVGglyphPosition *") NVGGlyphPosition.Buffer positions) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nnvgTextGlyphPositions(ctx, x, y, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + string.remaining(), positions.address(), positions.remaining());
    }

    public static int nvgTextGlyphPositions(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string, @NativeType("NVGglyphPosition *") NVGGlyphPosition.Buffer positions) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            int iNnvgTextGlyphPositions = nnvgTextGlyphPositions(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength, positions.address(), positions.remaining());
            stack.setPointer(stackPointer);
            return iNnvgTextGlyphPositions;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nvgTextMetrics(@NativeType("NVGcontext *") long ctx, @NativeType("float *") FloatBuffer ascender, @NativeType("float *") FloatBuffer descender, @NativeType("float *") FloatBuffer lineh) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe((Buffer) ascender, 1);
            Checks.checkSafe((Buffer) descender, 1);
            Checks.checkSafe((Buffer) lineh, 1);
        }
        nnvgTextMetrics(ctx, MemoryUtil.memAddressSafe(ascender), MemoryUtil.memAddressSafe(descender), MemoryUtil.memAddressSafe(lineh));
    }

    public static int nvgTextBreakLines(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer string, float breakRowWidth, @NativeType("NVGtextRow *") NVGTextRow.Buffer rows) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nnvgTextBreakLines(ctx, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + string.remaining(), breakRowWidth, rows.address(), rows.remaining());
    }

    public static int nvgTextBreakLines(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence string, float breakRowWidth, @NativeType("NVGtextRow *") NVGTextRow.Buffer rows) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            int iNnvgTextBreakLines = nnvgTextBreakLines(ctx, stringEncoded, stringEncoded + stringEncodedLength, breakRowWidth, rows.address(), rows.remaining());
            stack.setPointer(stackPointer);
            return iNnvgTextBreakLines;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nvgCurrentTransform(@NativeType("NVGcontext *") long ctx, @NativeType("float *") float[] xform) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check(xform, 6);
        }
        nnvgCurrentTransform(ctx, xform);
    }

    public static void nvgTransformIdentity(@NativeType("float *") float[] dst) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        nnvgTransformIdentity(dst);
    }

    public static void nvgTransformTranslate(@NativeType("float *") float[] dst, float tx, float ty) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        nnvgTransformTranslate(dst, tx, ty);
    }

    public static void nvgTransformScale(@NativeType("float *") float[] dst, float sx, float sy) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        nnvgTransformScale(dst, sx, sy);
    }

    public static void nvgTransformRotate(@NativeType("float *") float[] dst, float a) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        nnvgTransformRotate(dst, a);
    }

    public static void nvgTransformSkewX(@NativeType("float *") float[] dst, float a) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        nnvgTransformSkewX(dst, a);
    }

    public static void nvgTransformSkewY(@NativeType("float *") float[] dst, float a) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        nnvgTransformSkewY(dst, a);
    }

    public static void nvgTransformMultiply(@NativeType("float *") float[] dst, @NativeType("float const *") float[] src) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
            Checks.check(src, 6);
        }
        nnvgTransformMultiply(dst, src);
    }

    public static void nvgTransformPremultiply(@NativeType("float *") float[] dst, @NativeType("float const *") float[] src) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
            Checks.check(src, 6);
        }
        nnvgTransformPremultiply(dst, src);
    }

    @NativeType("int")
    public static boolean nvgTransformInverse(@NativeType("float *") float[] dst, @NativeType("float const *") float[] src) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
            Checks.check(src, 6);
        }
        return nnvgTransformInverse(dst, src) != 0;
    }

    public static void nvgTransformPoint(@NativeType("float *") float[] dstx, @NativeType("float *") float[] dsty, @NativeType("float const *") float[] xform, float srcx, float srcy) {
        if (Checks.CHECKS) {
            Checks.check(dstx, 1);
            Checks.check(dsty, 1);
            Checks.check(xform, 6);
        }
        nnvgTransformPoint(dstx, dsty, xform, srcx, srcy);
    }

    public static void nvgImageSize(@NativeType("NVGcontext *") long ctx, int image, @NativeType("int *") int[] w, @NativeType("int *") int[] h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check(w, 1);
            Checks.check(h, 1);
        }
        nnvgImageSize(ctx, image, w, h);
    }

    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string, @NativeType("float *") float[] bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe(bounds, 4);
        }
        return nnvgTextBounds(ctx, x, y, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + string.remaining(), bounds);
    }

    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string, @NativeType("float *") float[] bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe(bounds, 4);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            float fNnvgTextBounds = nnvgTextBounds(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength, bounds);
            stack.setPointer(stackPointer);
            return fNnvgTextBounds;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") ByteBuffer string, @NativeType("float *") float[] bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe(bounds, 4);
        }
        nnvgTextBoxBounds(ctx, x, y, breakRowWidth, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + string.remaining(), bounds);
    }

    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") CharSequence string, @NativeType("float *") float[] bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe(bounds, 4);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nnvgTextBoxBounds(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + stringEncodedLength, bounds);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nvgTextMetrics(@NativeType("NVGcontext *") long ctx, @NativeType("float *") float[] ascender, @NativeType("float *") float[] descender, @NativeType("float *") float[] lineh) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe(ascender, 1);
            Checks.checkSafe(descender, 1);
            Checks.checkSafe(lineh, 1);
        }
        nnvgTextMetrics(ctx, ascender, descender, lineh);
    }
}
