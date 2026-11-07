package org.lwjgl.nanovg;

import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoVGGLES2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoVGGLES2.class */
public class NanoVGGLES2 {
    public static final int NVG_ANTIALIAS = 1;
    public static final int NVG_STENCIL_STROKES = 2;
    public static final int NVG_DEBUG = 4;
    public static final int NVG_IMAGE_NODELETE = 65536;

    public static native int nnvglCreateImageFromHandle(long j, int i, int i2, int i3, int i4);

    public static native int nnvglImageHandle(long j, int i);

    public static native long nnvgCreate(int i);

    public static native void nnvgDelete(long j);

    public static native long nnvgluCreateFramebuffer(long j, int i, int i2, int i3);

    public static native void nnvgluBindFramebuffer(long j, long j2);

    public static native void nnvgluDeleteFramebuffer(long j, long j2);

    static {
        LibNanoVG.initialize();
    }

    protected NanoVGGLES2() {
        throw new UnsupportedOperationException();
    }

    public static int nvglCreateImageFromHandle(@NativeType("NVGcontext *") long ctx, @NativeType("GLuint") int textureId, int w, int h, int flags) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nnvglCreateImageFromHandle(ctx, textureId, w, h, flags);
    }

    @NativeType("GLuint")
    public static int nvglImageHandle(@NativeType("NVGcontext *") long ctx, int image) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return nnvglImageHandle(ctx, image);
    }

    @NativeType("NVGcontext *")
    public static long nvgCreate(int flags) {
        return nnvgCreate(flags);
    }

    public static void nvgDelete(@NativeType("NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgDelete(ctx);
    }

    @NativeType("NVGLUframebuffer *")
    public static NVGLUFramebuffer nvgluCreateFramebuffer(@NativeType("NVGcontext *") long ctx, int w, int h, int imageFlags) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        long __result = nnvgluCreateFramebuffer(ctx, w, h, imageFlags);
        return NVGLUFramebuffer.createSafe(__result);
    }

    public static void nvgluBindFramebuffer(@NativeType("NVGcontext *") long ctx, @NativeType("NVGLUframebuffer *") NVGLUFramebuffer fb) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgluBindFramebuffer(ctx, MemoryUtil.memAddressSafe(fb));
    }

    public static void nvgluDeleteFramebuffer(@NativeType("NVGcontext *") long ctx, @NativeType("NVGLUframebuffer *") NVGLUFramebuffer fb) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nnvgluDeleteFramebuffer(ctx, fb.address());
    }
}
