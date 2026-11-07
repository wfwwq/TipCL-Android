package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.IntFunction;
import kotlin.UShort;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.JNI;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Platform;
import org.lwjgl.system.SharedLibrary;
import org.lwjgl.system.ThreadLocalUtil;
import org.lwjgl.system.linux.X11;
import org.lwjgl.system.macosx.MacOSXLibrary;
import org.lwjgl.system.windows.GDI32;
import org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR;
import org.lwjgl.system.windows.User32;
import org.lwjgl.system.windows.WNDCLASSEX;
import org.lwjgl.system.windows.WindowsLibrary;
import org.lwjgl.system.windows.WindowsUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GL.class */
public final class GL {
    private static final APIUtil.APIVersion MAX_VERSION;
    private static FunctionProvider functionProvider;
    private static final ThreadLocal<GLCapabilities> capabilitiesTLS = new ThreadLocal<>();
    private static ICD icd = new ICDStatic();
    private static WGLCapabilities capabilitiesWGL;
    private static GLXCapabilities capabilitiesGLXClient;
    private static GLXCapabilities capabilitiesGLX;

    static {
        Library.loadSystem(System::load, System::loadLibrary, GL.class, "org.lwjgl.opengl", Platform.mapLibraryNameBundled("lwjgl_opengl"));
        MAX_VERSION = APIUtil.apiParseVersion((Configuration<?>) Configuration.OPENGL_MAXVERSION);
        if (!Configuration.OPENGL_EXPLICIT_INIT.get(false).booleanValue()) {
            create();
        }
    }

    private GL() {
    }

    static void initialize() {
    }

    public static void create() {
        SharedLibrary GL;
        SharedLibrary withIdentifier;
        switch (Platform.get()) {
            case LINUX:
                GL = Library.loadNative((Class<?>) GL.class, "org.lwjgl.opengl", Configuration.OPENGL_LIBRARY_NAME, "libGLX.so.0", "libGL.so.1", "libGL.so");
                break;
            case MACOSX:
                Configuration.OPENGL_LIBRARY_NAME.set(System.getProperty("org.lwjgl.opengl.libname"));
                String override = Configuration.OPENGL_LIBRARY_NAME.get();
                if (override != null) {
                    withIdentifier = Library.loadNative(GL.class, "org.lwjgl.opengl", override);
                } else {
                    withIdentifier = MacOSXLibrary.getWithIdentifier("com.apple.opengl");
                }
                GL = withIdentifier;
                break;
            case WINDOWS:
                GL = Library.loadNative((Class<?>) GL.class, "org.lwjgl.opengl", Configuration.OPENGL_LIBRARY_NAME, "opengl32");
                break;
            default:
                throw new IllegalStateException();
        }
        create(GL);
    }

    private static boolean isWayland() {
        switch (Platform.get()) {
            case LINUX:
            case FREEBSD:
                if ("wayland".equals(System.getenv("XDG_SESSION_TYPE")) && System.getenv("WAYLAND_DISPLAY") != null) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private static SharedLibrary loadNative() {
        try {
            return Library.loadNative((Class<?>) GL.class, "org.lwjgl.opengl", Configuration.OPENGL_LIBRARY_NAME, Configuration.OPENGL_LIBRARY_NAME_DEFAULTS());
        } catch (Throwable th) {
            APIUtil.apiLog("[GL] Failed to initialize context management based on native OpenGL platform API");
            return null;
        }
    }

    private static SharedLibrary loadEGL() {
        try {
            return Library.loadNative((Class<?>) GL.class, "org.lwjgl.opengl", Configuration.EGL_LIBRARY_NAME, Configuration.EGL_LIBRARY_NAME_DEFAULTS());
        } catch (Throwable th) {
            APIUtil.apiLog("[GL] Failed to initialize context management based on EGL");
            return null;
        }
    }

    private static SharedLibrary loadOSMesa() {
        try {
            return Library.loadNative((Class<?>) GL.class, "org.lwjgl.opengl", Configuration.OPENGL_OSMESA_LIBRARY_NAME, Configuration.OPENGL_OSMESA_LIBRARY_NAME_DEFAULTS());
        } catch (Throwable th) {
            APIUtil.apiLog("[GL] Failed to initialize context management based on OSMesa");
            return null;
        }
    }

    public static void create(String libName) {
        create(Library.loadNative(GL.class, "org.lwjgl.opengl", libName));
    }

    private static void create(SharedLibrary OPENGL) {
        try {
            create((FunctionProvider) new SharedLibrary.Delegate(OPENGL) { // from class: org.lwjgl.opengl.GL.1
                private final long GetProcAddress;

                {
                    long GetProcAddress = 0;
                    switch (AnonymousClass2.$SwitchMap$org$lwjgl$system$Platform[Platform.get().ordinal()]) {
                        case 1:
                        case 4:
                            GetProcAddress = this.library.getFunctionAddress("glXGetProcAddress");
                            if (GetProcAddress == 0) {
                                GetProcAddress = this.library.getFunctionAddress("glXGetProcAddressARB");
                                break;
                            }
                            break;
                        case 3:
                            GetProcAddress = this.library.getFunctionAddress("wglGetProcAddress");
                            break;
                    }
                    GetProcAddress = GetProcAddress == 0 ? this.library.getFunctionAddress("eglGetProcAddress") : GetProcAddress;
                    this.GetProcAddress = GetProcAddress == 0 ? this.library.getFunctionAddress("OSMesaGetProcAddress") : GetProcAddress;
                }

                @Override // org.lwjgl.system.FunctionProvider
                public long getFunctionAddress(ByteBuffer functionName) {
                    long address = this.GetProcAddress == 0 ? 0L : JNI.callPP(MemoryUtil.memAddress(functionName), this.GetProcAddress);
                    if (address == 0) {
                        address = this.library.getFunctionAddress(functionName);
                        if (address == 0 && Checks.DEBUG_FUNCTIONS) {
                            APIUtil.apiLogMissing("GL", functionName);
                        }
                    }
                    return address;
                }
            });
        } catch (RuntimeException e) {
            OPENGL.free();
            throw e;
        }
    }

    public static void create(FunctionProvider functionProvider2) {
        if (functionProvider != null) {
            throw new IllegalStateException("OpenGL library has already been loaded.");
        }
        functionProvider = functionProvider2;
        ThreadLocalUtil.setFunctionMissingAddresses(2236);
    }

    public static void destroy() {
        if (functionProvider == null) {
            return;
        }
        ThreadLocalUtil.setFunctionMissingAddresses(0);
        capabilitiesWGL = null;
        capabilitiesGLX = null;
        if (functionProvider instanceof NativeResource) {
            ((NativeResource) functionProvider).free();
        }
        functionProvider = null;
    }

    public static FunctionProvider getFunctionProvider() {
        return functionProvider;
    }

    public static void setCapabilities(GLCapabilities caps) {
        capabilitiesTLS.set(caps);
        ThreadLocalUtil.setCapabilities(caps == null ? 0L : MemoryUtil.memAddress(caps.addresses));
        icd.set(caps);
    }

    public static GLCapabilities getCapabilities() {
        return checkCapabilities(capabilitiesTLS.get());
    }

    private static GLCapabilities checkCapabilities(GLCapabilities caps) {
        if (Checks.CHECKS && caps == null) {
            throw new IllegalStateException("No GLCapabilities instance set for the current thread. Possible solutions:\n\ta) Call GL.createCapabilities() after making a context current in the current thread.\n\tb) Call GL.setCapabilities() if a GLCapabilities instance already exists for the current context.");
        }
        return caps;
    }

    public static WGLCapabilities getCapabilitiesWGL() {
        if (capabilitiesWGL == null) {
            capabilitiesWGL = createCapabilitiesWGLDummy();
        }
        return capabilitiesWGL;
    }

    static GLXCapabilities getCapabilitiesGLXClient() {
        if (capabilitiesGLXClient == null) {
            capabilitiesGLXClient = initCapabilitiesGLX(true);
        }
        return capabilitiesGLXClient;
    }

    public static GLXCapabilities getCapabilitiesGLX() {
        if (capabilitiesGLX == null) {
            capabilitiesGLX = initCapabilitiesGLX(false);
        }
        return capabilitiesGLX;
    }

    private static GLXCapabilities initCapabilitiesGLX(boolean client) {
        int iXDefaultScreen;
        long display = X11.nXOpenDisplay(0L);
        if (client) {
            iXDefaultScreen = -1;
        } else {
            try {
                iXDefaultScreen = X11.XDefaultScreen(display);
            } catch (Throwable th) {
                X11.XCloseDisplay(display);
                throw th;
            }
        }
        GLXCapabilities gLXCapabilitiesCreateCapabilitiesGLX = createCapabilitiesGLX(display, iXDefaultScreen);
        X11.XCloseDisplay(display);
        return gLXCapabilitiesCreateCapabilitiesGLX;
    }

    private static void fixPojavGLContext() throws Exception {
        Class<?> glfwClass = Class.forName("org.lwjgl.glfw.GLFW");
        long currentContext = ((Long) glfwClass.getDeclaredField("mainContext").get(null)).longValue();
        glfwClass.getDeclaredMethod("glfwMakeContextCurrent", Long.TYPE).invoke(null, Long.valueOf(currentContext));
    }

    public static GLCapabilities createCapabilities() {
        return createCapabilities((IntFunction<PointerBuffer>) null);
    }

    public static GLCapabilities createCapabilities(IntFunction<PointerBuffer> bufferFactory) {
        return createCapabilities(false, bufferFactory);
    }

    public static GLCapabilities createCapabilities(boolean forwardCompatible) {
        return createCapabilities(forwardCompatible, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[Catch: Throwable -> 0x011b, TryCatch #0 {Throwable -> 0x011b, blocks: (B:25:0x0094, B:27:0x00b0, B:29:0x00bd, B:30:0x00d5, B:32:0x00e7, B:36:0x00f9, B:34:0x00ee, B:35:0x00f8), top: B:129:0x0094 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.lwjgl.opengl.GLCapabilities createCapabilities(boolean r7, java.util.function.IntFunction<org.lwjgl.PointerBuffer> r8) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.lwjgl.opengl.GL.createCapabilities(boolean, java.util.function.IntFunction):org.lwjgl.opengl.GLCapabilities");
    }

    private static WGLCapabilities createCapabilitiesWGLDummy() {
        long hdc = WGL.wglGetCurrentDC();
        if (hdc != 0) {
            return createCapabilitiesWGL(hdc);
        }
        short classAtom = 0;
        long hwnd = 0;
        long hglrc = 0;
        try {
            MemoryStack stack = MemoryStack.stackPush();
            try {
                IntBuffer pi = stack.mallocInt(1);
                WNDCLASSEX wc = WNDCLASSEX.calloc(stack).cbSize(WNDCLASSEX.SIZEOF).style(3).hInstance(WindowsLibrary.HINSTANCE).lpszClassName(stack.UTF16("WGL"));
                MemoryUtil.memPutAddress(wc.address() + WNDCLASSEX.LPFNWNDPROC, User32.Functions.DefWindowProc);
                classAtom = User32.RegisterClassEx(pi, wc);
                if (classAtom == 0) {
                    WindowsUtil.windowsThrowException("Failed to register WGL window class", pi);
                }
                hwnd = User32.nCreateWindowEx(MemoryUtil.memAddress(pi), 0, classAtom & UShort.MAX_VALUE, 0L, 114229248, 0, 0, 1, 1, 0L, 0L, 0L, 0L);
                if (hwnd == 0) {
                    WindowsUtil.windowsThrowException("Failed to create WGL window", pi);
                }
                long hdc2 = Checks.check(User32.GetDC(hwnd));
                PIXELFORMATDESCRIPTOR pfd = PIXELFORMATDESCRIPTOR.calloc(stack).nSize((short) PIXELFORMATDESCRIPTOR.SIZEOF).nVersion((short) 1).dwFlags(32);
                int pixelFormat = GDI32.ChoosePixelFormat(pi, hdc2, pfd);
                if (pixelFormat == 0) {
                    WindowsUtil.windowsThrowException("Failed to choose an OpenGL-compatible pixel format", pi);
                }
                if (GDI32.DescribePixelFormat(pi, hdc2, pixelFormat, pfd) == 0) {
                    WindowsUtil.windowsThrowException("Failed to obtain pixel format information", pi);
                }
                if (!GDI32.SetPixelFormat(pi, hdc2, pixelFormat, pfd)) {
                    WindowsUtil.windowsThrowException("Failed to set the pixel format", pi);
                }
                hglrc = Checks.check(WGL.wglCreateContext(null, hdc2));
                if (!WGL.wglMakeCurrent(pi, hdc2, hglrc)) {
                    WindowsUtil.windowsThrowException("Failed to make context current", pi);
                }
                WGLCapabilities wGLCapabilitiesCreateCapabilitiesWGL = createCapabilitiesWGL(hdc2);
                if (stack != null) {
                    stack.close();
                }
                if (hglrc != 0) {
                    WGL.wglMakeCurrent(null, 0L, 0L);
                    WGL.wglDeleteContext(null, hglrc);
                }
                if (hwnd != 0) {
                    User32.DestroyWindow(null, hwnd);
                }
                if (classAtom != 0) {
                    User32.nUnregisterClass(0L, classAtom & UShort.MAX_VALUE, WindowsLibrary.HINSTANCE);
                }
                return wGLCapabilitiesCreateCapabilitiesWGL;
            } finally {
            }
        } catch (Throwable th) {
            if (hglrc != 0) {
                WGL.wglMakeCurrent(null, 0L, 0L);
                WGL.wglDeleteContext(null, hglrc);
            }
            if (hwnd != 0) {
                User32.DestroyWindow(null, hwnd);
            }
            if (classAtom != 0) {
                User32.nUnregisterClass(0L, classAtom & UShort.MAX_VALUE, WindowsLibrary.HINSTANCE);
            }
            throw th;
        }
    }

    public static WGLCapabilities createCapabilitiesWGL() {
        long hdc = WGL.wglGetCurrentDC();
        if (hdc == 0) {
            throw new IllegalStateException("Failed to retrieve the device context of the current OpenGL context");
        }
        return createCapabilitiesWGL(hdc);
    }

    private static WGLCapabilities createCapabilitiesWGL(long hdc) {
        FunctionProvider functionProvider2 = functionProvider;
        if (functionProvider2 == null) {
            throw new IllegalStateException("OpenGL library has not been loaded.");
        }
        String extensionsString = null;
        long wglGetExtensionsString = functionProvider2.getFunctionAddress("wglGetExtensionsStringARB");
        if (wglGetExtensionsString != 0) {
            extensionsString = MemoryUtil.memASCII(JNI.callPP(hdc, wglGetExtensionsString));
        } else {
            long wglGetExtensionsString2 = functionProvider2.getFunctionAddress("wglGetExtensionsStringEXT");
            if (wglGetExtensionsString2 != 0) {
                extensionsString = MemoryUtil.memASCII(JNI.callP(wglGetExtensionsString2));
            }
        }
        Set<String> supportedExtensions = new HashSet<>(32);
        if (extensionsString != null) {
            StringTokenizer tokenizer = new StringTokenizer(extensionsString);
            while (tokenizer.hasMoreTokens()) {
                supportedExtensions.add(tokenizer.nextToken());
            }
        }
        APIUtil.apiFilterExtensions(supportedExtensions, Configuration.OPENGL_EXTENSION_FILTER);
        return new WGLCapabilities(functionProvider2, supportedExtensions);
    }

    public static GLXCapabilities createCapabilitiesGLX(long display) {
        return createCapabilitiesGLX(display, X11.XDefaultScreen(display));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GLXCapabilities createCapabilitiesGLX(long display, int screen) {
        String extensionsString;
        FunctionProvider functionProvider2 = functionProvider;
        if (functionProvider2 == null) {
            throw new IllegalStateException("OpenGL library has not been loaded.");
        }
        MemoryStack stack = MemoryStack.stackPush();
        try {
            IntBuffer piMajor = stack.ints(0);
            IntBuffer piMinor = stack.ints(0);
            if (!GLX11.glXQueryVersion(display, piMajor, piMinor)) {
                throw new IllegalStateException("Failed to query GLX version");
            }
            int majorVersion = piMajor.get(0);
            int minorVersion = piMinor.get(0);
            if (majorVersion != 1) {
                throw new IllegalStateException("Invalid GLX major version: " + majorVersion);
            }
            if (stack != null) {
                stack.close();
            }
            Set<String> supportedExtensions = new HashSet<>(32);
            int[] iArr = {new int[]{1, 2, 3, 4}};
            for (int major = 1; major <= iArr.length; major++) {
                for (char c : iArr[major - 1]) {
                    if (major < majorVersion || (major == majorVersion && c <= minorVersion)) {
                        supportedExtensions.add("GLX" + major + ((int) c));
                    }
                }
            }
            if (1 <= minorVersion) {
                if (screen == -1) {
                    long glXGetClientString = functionProvider2.getFunctionAddress("glXGetClientString");
                    extensionsString = MemoryUtil.memASCIISafe(JNI.callPP(display, 3, glXGetClientString));
                } else {
                    long glXQueryExtensionsString = functionProvider2.getFunctionAddress("glXQueryExtensionsString");
                    extensionsString = MemoryUtil.memASCIISafe(JNI.callPP(display, screen, glXQueryExtensionsString));
                }
                if (extensionsString != null) {
                    StringTokenizer tokenizer = new StringTokenizer(extensionsString);
                    while (tokenizer.hasMoreTokens()) {
                        supportedExtensions.add(tokenizer.nextToken());
                    }
                }
            }
            APIUtil.apiFilterExtensions(supportedExtensions, Configuration.OPENGL_EXTENSION_FILTER);
            return new GLXCapabilities(functionProvider2, supportedExtensions);
        } catch (Throwable th) {
            if (stack != null) {
                try {
                    stack.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static GLCapabilities getICD() {
        return checkCapabilities(icd.get());
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GL$ICD.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GL$ICD.class */
    private interface ICD {
        GLCapabilities get();

        default void set(GLCapabilities caps) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GL$ICDStatic.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GL$ICDStatic.class */
    private static class ICDStatic implements ICD {
        private static GLCapabilities tempCaps;

        private ICDStatic() {
        }

        @Override // org.lwjgl.opengl.GL.ICD
        public void set(GLCapabilities caps) {
            if (tempCaps == null) {
                tempCaps = caps;
            } else if (caps != null && caps != tempCaps && ThreadLocalUtil.areCapabilitiesDifferent(tempCaps.addresses, caps.addresses)) {
                APIUtil.apiLog("[WARNING] Incompatible context detected. Falling back to thread-local lookup for GL contexts.");
                ICD unused = GL.icd = GL::getCapabilities;
            }
        }

        @Override // org.lwjgl.opengl.GL.ICD
        public GLCapabilities get() {
            return WriteOnce.caps;
        }

        /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/GL$ICDStatic$WriteOnce.class
 */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/GL$ICDStatic$WriteOnce.class */
        private static final class WriteOnce {
            static final GLCapabilities caps;

            private WriteOnce() {
            }

            static {
                GLCapabilities tempCaps = ICDStatic.tempCaps;
                if (tempCaps == null) {
                    throw new IllegalStateException("No GLCapabilities instance has been set");
                }
                caps = tempCaps;
            }
        }
    }
}
