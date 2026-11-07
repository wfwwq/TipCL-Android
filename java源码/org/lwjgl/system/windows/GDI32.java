package org.lwjgl.system.windows;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.SharedLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/GDI32.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/GDI32.class */
public class GDI32 {
    private static final SharedLibrary GDI32 = Library.loadNative(GDI32.class, "org.lwjgl", "gdi32");
    public static final int DISPLAY_DEVICE_ATTACHED_TO_DESKTOP = 1;
    public static final int DISPLAY_DEVICE_MULTI_DRIVER = 2;
    public static final int DISPLAY_DEVICE_PRIMARY_DEVICE = 4;
    public static final int DISPLAY_DEVICE_MIRRORING_DRIVER = 8;
    public static final int DISPLAY_DEVICE_VGA_COMPATIBLE = 16;
    public static final int DISPLAY_DEVICE_REMOVABLE = 32;
    public static final int DISPLAY_DEVICE_MODESPRUNED = 134217728;
    public static final int DISPLAY_DEVICE_REMOTE = 67108864;
    public static final int DISPLAY_DEVICE_DISCONNECT = 33554432;
    public static final int DISPLAY_DEVICE_TS_COMPATIBLE = 2097152;
    public static final int DISPLAY_DEVICE_UNSAFE_MODES_ON = 524288;
    public static final int DISPLAY_DEVICE_ACTIVE = 1;
    public static final int DISPLAY_DEVICE_ATTACHED = 2;
    public static final int DM_SPECVERSION = 1025;
    public static final int DM_ORIENTATION = 1;
    public static final int DM_PAPERSIZE = 2;
    public static final int DM_PAPERLENGTH = 4;
    public static final int DM_PAPERWIDTH = 8;
    public static final int DM_SCALE = 16;
    public static final int DM_POSITION = 32;
    public static final int DM_NUP = 64;
    public static final int DM_DISPLAYORIENTATION = 128;
    public static final int DM_COPIES = 256;
    public static final int DM_DEFAULTSOURCE = 512;
    public static final int DM_PRINTQUALITY = 1024;
    public static final int DM_COLOR = 2048;
    public static final int DM_DUPLEX = 4096;
    public static final int DM_YRESOLUTION = 8192;
    public static final int DM_TTOPTION = 16384;
    public static final int DM_COLLATE = 32768;
    public static final int DM_FORMNAME = 65536;
    public static final int DM_LOGPIXELS = 131072;
    public static final int DM_BITSPERPEL = 262144;
    public static final int DM_PELSWIDTH = 524288;
    public static final int DM_PELSHEIGHT = 1048576;
    public static final int DM_DISPLAYFLAGS = 2097152;
    public static final int DM_DISPLAYFREQUENCY = 4194304;
    public static final int DM_ICMMETHOD = 8388608;
    public static final int DM_ICMINTENT = 16777216;
    public static final int DM_MEDIATYPE = 33554432;
    public static final int DM_DITHERTYPE = 67108864;
    public static final int DM_PANNINGWIDTH = 134217728;
    public static final int DM_PANNINGHEIGHT = 268435456;
    public static final int DM_DISPLAYFIXEDOUTPUT = 536870912;
    public static final int DMDO_DEFAULT = 0;
    public static final int DMDO_90 = 1;
    public static final int DMDO_180 = 2;
    public static final int DMDO_270 = 3;
    public static final int DMDFO_DEFAULT = 0;
    public static final int DMDFO_STRETCH = 1;
    public static final int DMDFO_CENTER = 2;
    public static final int DM_INTERLACED = 2;
    public static final int DMDISPLAYFLAGS_TEXTMODE = 4;
    public static final int PFD_DOUBLEBUFFER = 1;
    public static final int PFD_STEREO = 2;
    public static final int PFD_DRAW_TO_WINDOW = 4;
    public static final int PFD_DRAW_TO_BITMAP = 8;
    public static final int PFD_SUPPORT_GDI = 16;
    public static final int PFD_SUPPORT_OPENGL = 32;
    public static final int PFD_GENERIC_FORMAT = 64;
    public static final int PFD_NEED_PALETTE = 128;
    public static final int PFD_NEED_SYSTEM_PALETTE = 256;
    public static final int PFD_SWAP_EXCHANGE = 512;
    public static final int PFD_SWAP_COPY = 1024;
    public static final int PFD_SWAP_LAYER_BUFFERS = 2048;
    public static final int PFD_GENERIC_ACCELERATED = 4096;
    public static final int PFD_SUPPORT_DIRECTDRAW = 8192;
    public static final int PFD_DIRECT3D_ACCELERATED = 16384;
    public static final int PFD_SUPPORT_COMPOSITION = 32768;
    public static final int PFD_DEPTH_DONTCARE = 536870912;
    public static final int PFD_DOUBLEBUFFER_DONTCARE = 1073741824;
    public static final int PFD_STEREO_DONTCARE = Integer.MIN_VALUE;
    public static final byte PFD_TYPE_RGBA = 0;
    public static final byte PFD_TYPE_COLORINDEX = 1;
    public static final byte PFD_MAIN_PLANE = 0;
    public static final byte PFD_OVERLAY_PLANE = 1;
    public static final byte PFD_UNDERLAY_PLANE = -1;

    public static native int nChoosePixelFormat(long j, long j2, long j3, long j4);

    public static native int nDescribePixelFormat(long j, long j2, int i, int i2, long j3, long j4);

    public static native int nGetPixelFormat(long j, long j2, long j3);

    public static native int nSetPixelFormat(long j, long j2, int i, long j3, long j4);

    public static native int nSwapBuffers(long j, long j2, long j3);

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/GDI32$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/GDI32$Functions.class */
    public static final class Functions {
        public static final long ChoosePixelFormat = APIUtil.apiGetFunctionAddress(GDI32.GDI32, "ChoosePixelFormat");
        public static final long DescribePixelFormat = APIUtil.apiGetFunctionAddress(GDI32.GDI32, "DescribePixelFormat");
        public static final long GetPixelFormat = APIUtil.apiGetFunctionAddress(GDI32.GDI32, "GetPixelFormat");
        public static final long SetPixelFormat = APIUtil.apiGetFunctionAddress(GDI32.GDI32, "SetPixelFormat");
        public static final long SwapBuffers = APIUtil.apiGetFunctionAddress(GDI32.GDI32, "SwapBuffers");

        private Functions() {
        }
    }

    public static SharedLibrary getLibrary() {
        return GDI32;
    }

    protected GDI32() {
        throw new UnsupportedOperationException();
    }

    public static int nChoosePixelFormat(long _GetLastError, long hdc, long pixelFormatDescriptor) {
        long __functionAddress = Functions.ChoosePixelFormat;
        if (Checks.CHECKS) {
            Checks.check(hdc);
        }
        return nChoosePixelFormat(_GetLastError, hdc, pixelFormatDescriptor, __functionAddress);
    }

    public static int ChoosePixelFormat(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HDC") long hdc, @NativeType("PIXELFORMATDESCRIPTOR const *") PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nChoosePixelFormat(MemoryUtil.memAddressSafe(_GetLastError), hdc, pixelFormatDescriptor.address());
    }

    public static int nDescribePixelFormat(long _GetLastError, long hdc, int pixelFormat, int bytes, long pixelFormatDescriptor) {
        long __functionAddress = Functions.DescribePixelFormat;
        if (Checks.CHECKS) {
            Checks.check(hdc);
        }
        return nDescribePixelFormat(_GetLastError, hdc, pixelFormat, bytes, pixelFormatDescriptor, __functionAddress);
    }

    public static int DescribePixelFormat(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HDC") long hdc, int pixelFormat, @NativeType("UINT") int bytes, @NativeType("LPPIXELFORMATDESCRIPTOR") PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nDescribePixelFormat(MemoryUtil.memAddressSafe(_GetLastError), hdc, pixelFormat, bytes, MemoryUtil.memAddressSafe(pixelFormatDescriptor));
    }

    public static int DescribePixelFormat(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HDC") long hdc, int pixelFormat, @NativeType("LPPIXELFORMATDESCRIPTOR") PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nDescribePixelFormat(MemoryUtil.memAddressSafe(_GetLastError), hdc, pixelFormat, PIXELFORMATDESCRIPTOR.SIZEOF, MemoryUtil.memAddressSafe(pixelFormatDescriptor));
    }

    public static int nGetPixelFormat(long _GetLastError, long hdc) {
        long __functionAddress = Functions.GetPixelFormat;
        if (Checks.CHECKS) {
            Checks.check(hdc);
        }
        return nGetPixelFormat(_GetLastError, hdc, __functionAddress);
    }

    public static int GetPixelFormat(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HDC") long hdc) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nGetPixelFormat(MemoryUtil.memAddressSafe(_GetLastError), hdc);
    }

    public static int nSetPixelFormat(long _GetLastError, long hdc, int pixelFormat, long pixelFormatDescriptor) {
        long __functionAddress = Functions.SetPixelFormat;
        if (Checks.CHECKS) {
            Checks.check(hdc);
        }
        return nSetPixelFormat(_GetLastError, hdc, pixelFormat, pixelFormatDescriptor, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean SetPixelFormat(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HDC") long hdc, int pixelFormat, @NativeType("PIXELFORMATDESCRIPTOR const *") PIXELFORMATDESCRIPTOR pixelFormatDescriptor) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nSetPixelFormat(MemoryUtil.memAddressSafe(_GetLastError), hdc, pixelFormat, MemoryUtil.memAddressSafe(pixelFormatDescriptor)) != 0;
    }

    public static int nSwapBuffers(long _GetLastError, long dc) {
        long __functionAddress = Functions.SwapBuffers;
        if (Checks.CHECKS) {
            Checks.check(dc);
        }
        return nSwapBuffers(_GetLastError, dc, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean SwapBuffers(@NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HDC") long dc) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _GetLastError, 1);
        }
        return nSwapBuffers(MemoryUtil.memAddressSafe(_GetLastError), dc) != 0;
    }
}
