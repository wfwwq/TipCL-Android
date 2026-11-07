package org.lwjgl.nanovg;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoSVG.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoSVG.class */
public class NanoSVG {
    public static final int NSVG_PAINT_UNDEF = -1;
    public static final int NSVG_PAINT_NONE = 0;
    public static final int NSVG_PAINT_COLOR = 1;
    public static final int NSVG_PAINT_LINEAR_GRADIENT = 2;
    public static final int NSVG_PAINT_RADIAL_GRADIENT = 3;
    public static final int NSVG_SPREAD_PAD = 0;
    public static final int NSVG_SPREAD_REFLECT = 1;
    public static final int NSVG_SPREAD_REPEAT = 2;
    public static final int NSVG_JOIN_MITER = 0;
    public static final int NSVG_JOIN_ROUND = 1;
    public static final int NSVG_JOIN_BEVEL = 2;
    public static final int NSVG_CAP_BUTT = 0;
    public static final int NSVG_CAP_ROUND = 1;
    public static final int NSVG_CAP_SQUARE = 2;
    public static final int NSVG_FILLRULE_NONZERO = 0;
    public static final int NSVG_FILLRULE_EVENODD = 1;
    public static final int NSVG_FLAGS_VISIBLE = 1;
    public static final int NSVG_PAINT_FILL = 0;
    public static final int NSVG_PAINT_MARKERS = 1;
    public static final int NSVG_PAINT_STROKE = 2;

    public static native long nnsvgParseFromFile(long j, long j2, float f);

    public static native long nnsvgParse(long j, long j2, float f);

    public static native long nnsvgDuplicatePath(long j);

    public static native void nnsvgDelete(long j);

    @NativeType("NSVGrasterizer *")
    public static native long nsvgCreateRasterizer();

    public static native void nnsvgRasterize(long j, long j2, float f, float f2, float f3, long j3, int i, int i2, int i3);

    public static native void nnsvgDeleteRasterizer(long j);

    static {
        LibNanoVG.initialize();
    }

    protected NanoSVG() {
        throw new UnsupportedOperationException();
    }

    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParseFromFile(@NativeType("char const *") ByteBuffer filename, @NativeType("char const *") ByteBuffer units, float dpi) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.checkNT1(units);
        }
        long __result = nnsvgParseFromFile(MemoryUtil.memAddress(filename), MemoryUtil.memAddress(units), dpi);
        return NSVGImage.createSafe(__result);
    }

    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParseFromFile(@NativeType("char const *") CharSequence filename, @NativeType("char const *") CharSequence units, float dpi) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            stack.nASCII(units, true);
            long unitsEncoded = stack.getPointerAddress();
            long __result = nnsvgParseFromFile(filenameEncoded, unitsEncoded, dpi);
            NSVGImage nSVGImageCreateSafe = NSVGImage.createSafe(__result);
            stack.setPointer(stackPointer);
            return nSVGImageCreateSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParse(@NativeType("char *") ByteBuffer input, @NativeType("char const *") ByteBuffer units, float dpi) {
        if (Checks.CHECKS) {
            Checks.checkNT1(input);
            Checks.checkNT1(units);
        }
        long __result = nnsvgParse(MemoryUtil.memAddress(input), MemoryUtil.memAddress(units), dpi);
        return NSVGImage.createSafe(__result);
    }

    @NativeType("NSVGimage *")
    public static NSVGImage nsvgParse(@NativeType("char *") CharSequence input, @NativeType("char const *") CharSequence units, float dpi) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(input, true);
            long inputEncoded = stack.getPointerAddress();
            stack.nASCII(units, true);
            long unitsEncoded = stack.getPointerAddress();
            long __result = nnsvgParse(inputEncoded, unitsEncoded, dpi);
            NSVGImage nSVGImageCreateSafe = NSVGImage.createSafe(__result);
            stack.setPointer(stackPointer);
            return nSVGImageCreateSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("NSVGpath *")
    public static NSVGPath nsvgDuplicatePath(@NativeType("NSVGpath *") NSVGPath p) {
        long __result = nnsvgDuplicatePath(p.address());
        return NSVGPath.createSafe(__result);
    }

    public static void nsvgDelete(@NativeType("NSVGimage *") NSVGImage image) {
        nnsvgDelete(image.address());
    }

    public static void nsvgRasterize(@NativeType("NSVGrasterizer *") long r, @NativeType("NSVGimage *") NSVGImage image, float tx, float ty, float scale, @NativeType("unsigned char *") ByteBuffer dst, int w, int h, int stride) {
        if (Checks.CHECKS) {
            Checks.check(r);
            Checks.check((Buffer) dst, h * stride);
        }
        nnsvgRasterize(r, image.address(), tx, ty, scale, MemoryUtil.memAddress(dst), w, h, stride);
    }

    public static void nsvgDeleteRasterizer(@NativeType("NSVGrasterizer *") long rasterizer) {
        if (Checks.CHECKS) {
            Checks.check(rasterizer);
        }
        nnsvgDeleteRasterizer(rasterizer);
    }
}
