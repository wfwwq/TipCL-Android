package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/WGL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/WGL.class */
public class WGL {
    public static final int WGL_FONT_LINES = 0;
    public static final int WGL_FONT_POLYGONS = 1;
    public static final int WGL_SWAP_MAIN_PLANE = 1;
    public static final int WGL_SWAP_OVERLAY1 = 2;
    public static final int WGL_SWAP_OVERLAY2 = 4;
    public static final int WGL_SWAP_OVERLAY3 = 8;
    public static final int WGL_SWAP_OVERLAY4 = 16;
    public static final int WGL_SWAP_OVERLAY5 = 32;
    public static final int WGL_SWAP_OVERLAY6 = 64;
    public static final int WGL_SWAP_OVERLAY7 = 128;
    public static final int WGL_SWAP_OVERLAY8 = 256;
    public static final int WGL_SWAP_OVERLAY9 = 512;
    public static final int WGL_SWAP_OVERLAY10 = 1024;
    public static final int WGL_SWAP_OVERLAY11 = 2048;
    public static final int WGL_SWAP_OVERLAY12 = 4096;
    public static final int WGL_SWAP_OVERLAY13 = 8192;
    public static final int WGL_SWAP_OVERLAY14 = 16384;
    public static final int WGL_SWAP_OVERLAY15 = 32768;
    public static final int WGL_SWAP_UNDERLAY1 = 65536;
    public static final int WGL_SWAP_UNDERLAY2 = 131072;
    public static final int WGL_SWAP_UNDERLAY3 = 262144;
    public static final int WGL_SWAP_UNDERLAY4 = 524288;
    public static final int WGL_SWAP_UNDERLAY5 = 1048576;
    public static final int WGL_SWAP_UNDERLAY6 = 2097152;
    public static final int WGL_SWAP_UNDERLAY7 = 4194304;
    public static final int WGL_SWAP_UNDERLAY8 = 8388608;
    public static final int WGL_SWAP_UNDERLAY9 = 16777216;
    public static final int WGL_SWAP_UNDERLAY10 = 33554432;
    public static final int WGL_SWAP_UNDERLAY11 = 67108864;
    public static final int WGL_SWAP_UNDERLAY12 = 134217728;
    public static final int WGL_SWAP_UNDERLAY13 = 268435456;
    public static final int WGL_SWAP_UNDERLAY14 = 536870912;
    public static final int WGL_SWAP_UNDERLAY15 = 1073741824;

    public static native long nwglCreateContext(long j, long j2, long j3);

    public static native long nwglCreateLayerContext(long j, long j2, int i, long j3);

    public static native int nwglCopyContext(long j, long j2, long j3, int i, long j4);

    public static native int nwglDeleteContext(long j, long j2, long j3);

    public static native long nwglGetCurrentContext(long j, long j2);

    public static native long nwglGetProcAddress(long j, long j2, long j3);

    public static native int nwglMakeCurrent(long j, long j2, long j3, long j4);

    public static native int nwglShareLists(long j, long j2, long j3, long j4);

    static {
        GL.initialize();
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/WGL$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/WGL$Functions.class */
    public static final class Functions {
        public static final long CreateContext = APIUtil.apiGetFunctionAddress(GL.getFunctionProvider(), "wglCreateContext");
        public static final long CreateLayerContext = APIUtil.apiGetFunctionAddress(GL.getFunctionProvider(), "wglCreateLayerContext");
        public static final long CopyContext = APIUtil.apiGetFunctionAddress(GL.getFunctionProvider(), "wglCopyContext");
        public static final long DeleteContext = APIUtil.apiGetFunctionAddress(GL.getFunctionProvider(), "wglDeleteContext");
        public static final long GetCurrentContext = APIUtil.apiGetFunctionAddress(GL.getFunctionProvider(), "wglGetCurrentContext");
        public static final long GetCurrentDC = APIUtil.apiGetFunctionAddress(GL.getFunctionProvider(), "wglGetCurrentDC");
        public static final long GetProcAddress = APIUtil.apiGetFunctionAddress(GL.getFunctionProvider(), "wglGetProcAddress");
        public static final long MakeCurrent = APIUtil.apiGetFunctionAddress(GL.getFunctionProvider(), "wglMakeCurrent");
        public static final long ShareLists = APIUtil.apiGetFunctionAddress(GL.getFunctionProvider(), "wglShareLists");

        private Functions() {
        }
    }

    protected WGL() {
        throw new UnsupportedOperationException();
    }

    public static long nwglCreateContext(long _GetLastError, long hdc) {
        long __functionAddress = Functions.CreateContext;
        if (Checks.CHECKS) {
            Checks.check(hdc);
        }
        return nwglCreateContext(_GetLastError, hdc, __functionAddress);
    }

    @NativeType("HGLRC")
    public static long wglCreateContext(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HDC") long hdc) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nwglCreateContext(MemoryUtil.memAddressSafe(_GetLastError), hdc);
    }

    public static long nwglCreateLayerContext(long _GetLastError, long hdc, int layerPlane) {
        long __functionAddress = Functions.CreateLayerContext;
        if (Checks.CHECKS) {
            Checks.check(hdc);
        }
        return nwglCreateLayerContext(_GetLastError, hdc, layerPlane, __functionAddress);
    }

    @NativeType("HGLRC")
    public static long wglCreateLayerContext(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HDC") long hdc, int layerPlane) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nwglCreateLayerContext(MemoryUtil.memAddressSafe(_GetLastError), hdc, layerPlane);
    }

    public static int nwglCopyContext(long _GetLastError, long src, long dst, int mask) {
        long __functionAddress = Functions.CopyContext;
        if (Checks.CHECKS) {
            Checks.check(src);
            Checks.check(dst);
        }
        return nwglCopyContext(_GetLastError, src, dst, mask, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean wglCopyContext(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HGLRC") long src, @NativeType("HGLRC") long dst, @NativeType("UINT") int mask) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nwglCopyContext(MemoryUtil.memAddressSafe(_GetLastError), src, dst, mask) != 0;
    }

    public static int nwglDeleteContext(long _GetLastError, long context) {
        long __functionAddress = Functions.DeleteContext;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return nwglDeleteContext(_GetLastError, context, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean wglDeleteContext(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HGLRC") long context) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nwglDeleteContext(MemoryUtil.memAddressSafe(_GetLastError), context) != 0;
    }

    public static long nwglGetCurrentContext(long _GetLastError) {
        long __functionAddress = Functions.GetCurrentContext;
        return nwglGetCurrentContext(_GetLastError, __functionAddress);
    }

    @NativeType("HGLRC")
    public static long wglGetCurrentContext(@NativeType("DWORD *") IntBuffer _GetLastError) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nwglGetCurrentContext(MemoryUtil.memAddressSafe(_GetLastError));
    }

    @NativeType("HDC")
    public static long wglGetCurrentDC() {
        long __functionAddress = Functions.GetCurrentDC;
        return JNI.callP(__functionAddress);
    }

    public static long nwglGetProcAddress(long _GetLastError, long proc) {
        long __functionAddress = Functions.GetProcAddress;
        return nwglGetProcAddress(_GetLastError, proc, __functionAddress);
    }

    @NativeType("PROC")
    public static long wglGetProcAddress(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("LPCSTR") ByteBuffer proc) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
            Checks.checkNT1(proc);
        }
        return nwglGetProcAddress(MemoryUtil.memAddressSafe(_GetLastError), MemoryUtil.memAddress(proc));
    }

    @NativeType("PROC")
    public static long wglGetProcAddress(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("LPCSTR") CharSequence proc) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(proc, true);
            long procEncoded = stack.getPointerAddress();
            long jNwglGetProcAddress = nwglGetProcAddress(MemoryUtil.memAddressSafe(_GetLastError), procEncoded);
            stack.setPointer(stackPointer);
            return jNwglGetProcAddress;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nwglMakeCurrent(long _GetLastError, long hdc, long hglrc) {
        long __functionAddress = Functions.MakeCurrent;
        return nwglMakeCurrent(_GetLastError, hdc, hglrc, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean wglMakeCurrent(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HDC") long hdc, @NativeType("HGLRC") long hglrc) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nwglMakeCurrent(MemoryUtil.memAddressSafe(_GetLastError), hdc, hglrc) != 0;
    }

    public static int nwglShareLists(long _GetLastError, long hglrc1, long hglrc2) {
        long __functionAddress = Functions.ShareLists;
        if (Checks.CHECKS) {
            Checks.check(hglrc1);
            Checks.check(hglrc2);
        }
        return nwglShareLists(_GetLastError, hglrc1, hglrc2, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean wglShareLists(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HGLRC") long hglrc1, @NativeType("HGLRC") long hglrc2) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nwglShareLists(MemoryUtil.memAddressSafe(_GetLastError), hglrc1, hglrc2) != 0;
    }
}
