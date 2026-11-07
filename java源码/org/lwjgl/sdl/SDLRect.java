package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.sdl.SDL_FPoint;
import org.lwjgl.sdl.SDL_Point;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLRect.class */
public class SDLRect {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLRect$Functions.class */
    public static final class Functions {
        public static final long HasRectIntersection = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasRectIntersection");
        public static final long GetRectIntersection = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectIntersection");
        public static final long GetRectUnion = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectUnion");
        public static final long GetRectEnclosingPoints = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectEnclosingPoints");
        public static final long GetRectAndLineIntersection = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectAndLineIntersection");
        public static final long HasRectIntersectionFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasRectIntersectionFloat");
        public static final long GetRectIntersectionFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectIntersectionFloat");
        public static final long GetRectUnionFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectUnionFloat");
        public static final long GetRectEnclosingPointsFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectEnclosingPointsFloat");
        public static final long GetRectAndLineIntersectionFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRectAndLineIntersectionFloat");

        private Functions() {
        }
    }

    protected SDLRect() {
        throw new UnsupportedOperationException();
    }

    public static boolean nSDL_HasRectIntersection(long A, long B) {
        long __functionAddress = Functions.HasRectIntersection;
        return JNI.invokePPZ(A, B, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasRectIntersection(@NativeType("SDL_Rect const *") SDL_Rect A, @NativeType("SDL_Rect const *") SDL_Rect B) {
        return nSDL_HasRectIntersection(A.address(), B.address());
    }

    public static boolean nSDL_GetRectIntersection(long A, long B, long result) {
        long __functionAddress = Functions.GetRectIntersection;
        return JNI.invokePPPZ(A, B, result, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRectIntersection(@NativeType("SDL_Rect const *") SDL_Rect A, @NativeType("SDL_Rect const *") SDL_Rect B, @NativeType("SDL_Rect *") SDL_Rect result) {
        return nSDL_GetRectIntersection(A.address(), B.address(), result.address());
    }

    public static boolean nSDL_GetRectUnion(long A, long B, long result) {
        long __functionAddress = Functions.GetRectUnion;
        return JNI.invokePPPZ(A, B, result, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRectUnion(@NativeType("SDL_Rect const *") SDL_Rect A, @NativeType("SDL_Rect const *") SDL_Rect B, @NativeType("SDL_Rect *") SDL_Rect result) {
        return nSDL_GetRectUnion(A.address(), B.address(), result.address());
    }

    public static boolean nSDL_GetRectEnclosingPoints(long points, int count, long clip, long result) {
        long __functionAddress = Functions.GetRectEnclosingPoints;
        return JNI.invokePPPZ(points, count, clip, result, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRectEnclosingPoints(@NativeType("SDL_Point const *") SDL_Point.Buffer points, @NativeType("SDL_Rect const *") SDL_Rect clip, @NativeType("SDL_Rect *") SDL_Rect result) {
        return nSDL_GetRectEnclosingPoints(points.address(), points.remaining(), MemoryUtil.memAddressSafe(clip), MemoryUtil.memAddressSafe(result));
    }

    public static boolean nSDL_GetRectAndLineIntersection(long rect, long X1, long Y1, long X2, long Y2) {
        long __functionAddress = Functions.GetRectAndLineIntersection;
        return JNI.invokePPPPPZ(rect, X1, Y1, X2, Y2, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRectAndLineIntersection(@NativeType("SDL_Rect const *") SDL_Rect rect, @NativeType("int *") IntBuffer X1, @NativeType("int *") IntBuffer Y1, @NativeType("int *") IntBuffer X2, @NativeType("int *") IntBuffer Y2) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) X1, 1);
            Checks.check((Buffer) Y1, 1);
            Checks.check((Buffer) X2, 1);
            Checks.check((Buffer) Y2, 1);
        }
        return nSDL_GetRectAndLineIntersection(rect.address(), MemoryUtil.memAddress(X1), MemoryUtil.memAddress(Y1), MemoryUtil.memAddress(X2), MemoryUtil.memAddress(Y2));
    }

    public static boolean nSDL_HasRectIntersectionFloat(long A, long B) {
        long __functionAddress = Functions.HasRectIntersectionFloat;
        return JNI.invokePPZ(A, B, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_HasRectIntersectionFloat(@NativeType("SDL_FRect const *") SDL_FRect A, @NativeType("SDL_FRect const *") SDL_FRect B) {
        return nSDL_HasRectIntersectionFloat(A.address(), B.address());
    }

    public static boolean nSDL_GetRectIntersectionFloat(long A, long B, long result) {
        long __functionAddress = Functions.GetRectIntersectionFloat;
        return JNI.invokePPPZ(A, B, result, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRectIntersectionFloat(@NativeType("SDL_FRect const *") SDL_FRect A, @NativeType("SDL_FRect const *") SDL_FRect B, @NativeType("SDL_FRect *") SDL_FRect result) {
        return nSDL_GetRectIntersectionFloat(A.address(), B.address(), result.address());
    }

    public static boolean nSDL_GetRectUnionFloat(long A, long B, long result) {
        long __functionAddress = Functions.GetRectUnionFloat;
        return JNI.invokePPPZ(A, B, result, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRectUnionFloat(@NativeType("SDL_FRect const *") SDL_FRect A, @NativeType("SDL_FRect const *") SDL_FRect B, @NativeType("SDL_FRect *") SDL_FRect result) {
        return nSDL_GetRectUnionFloat(A.address(), B.address(), result.address());
    }

    public static boolean nSDL_GetRectEnclosingPointsFloat(long points, int count, long clip, long result) {
        long __functionAddress = Functions.GetRectEnclosingPointsFloat;
        return JNI.invokePPPZ(points, count, clip, result, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRectEnclosingPointsFloat(@NativeType("SDL_FPoint const *") SDL_FPoint.Buffer points, @NativeType("SDL_FRect const *") SDL_FRect clip, @NativeType("SDL_FRect *") SDL_FRect result) {
        return nSDL_GetRectEnclosingPointsFloat(points.address(), points.remaining(), MemoryUtil.memAddressSafe(clip), MemoryUtil.memAddressSafe(result));
    }

    public static boolean nSDL_GetRectAndLineIntersectionFloat(long rect, long X1, long Y1, long X2, long Y2) {
        long __functionAddress = Functions.GetRectAndLineIntersectionFloat;
        return JNI.invokePPPPPZ(rect, X1, Y1, X2, Y2, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetRectAndLineIntersectionFloat(@NativeType("SDL_FRect const *") SDL_FRect rect, @NativeType("float *") FloatBuffer X1, @NativeType("float *") FloatBuffer Y1, @NativeType("float *") FloatBuffer X2, @NativeType("float *") FloatBuffer Y2) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) X1, 1);
            Checks.check((Buffer) Y1, 1);
            Checks.check((Buffer) X2, 1);
            Checks.check((Buffer) Y2, 1);
        }
        return nSDL_GetRectAndLineIntersectionFloat(rect.address(), MemoryUtil.memAddress(X1), MemoryUtil.memAddress(Y1), MemoryUtil.memAddress(X2), MemoryUtil.memAddress(Y2));
    }

    public static void SDL_RectToFRect(SDL_Rect rectInput, SDL_FRect frectOutput) {
        frectOutput.x(rectInput.x()).y(rectInput.y()).w(rectInput.w()).h(rectInput.h());
    }

    public static boolean SDL_PointInRect(SDL_Point p, SDL_Rect r) {
        return p != null && r != null && r.x() <= p.x() && p.x() < r.x() + r.w() && r.y() <= p.y() && p.y() < r.y() + r.h();
    }

    public static boolean SDL_RectEmpty(SDL_Rect r) {
        return r == null || r.w() <= 0 || r.h() <= 0;
    }

    public static boolean SDL_RectsEqual(SDL_Rect a, SDL_Rect b) {
        return a != null && b != null && a.x() == b.x() && a.y() == b.y() && a.w() == b.w() && a.h() == b.h();
    }

    public static boolean SDL_PointInRectFloat(SDL_FPoint p, SDL_FRect r) {
        return p != null && r != null && r.x() <= p.x() && p.x() <= r.x() + r.w() && r.y() <= p.y() && p.y() <= r.y() + r.h();
    }

    public static boolean SDL_RectEmptyFloat(SDL_FRect r) {
        return r == null || r.w() < 0.0f || r.h() < 0.0f;
    }

    public static boolean SDL_RectsEqualEpsilon(SDL_FRect a, SDL_FRect b, float epsilon) {
        return (a == null || b == null || (a != b && (Math.abs(a.x() - b.x()) > epsilon || Math.abs(a.y() - b.y()) > epsilon || Math.abs(a.w() - b.w()) > epsilon || Math.abs(a.h() - b.h()) > epsilon))) ? false : true;
    }

    public static boolean SDL_RectsEqualFloat(SDL_FRect a, SDL_FRect b) {
        return SDL_RectsEqualEpsilon(a, b, 1.1920929E-7f);
    }
}
