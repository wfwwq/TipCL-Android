package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.IntFunction;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.FunctionProviderLocal;
import org.lwjgl.system.JNI;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Platform;
import org.lwjgl.system.SharedLibrary;
import org.lwjgl.system.ThreadLocalUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/ALC.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/ALC.class */
public final class ALC {
    private static FunctionProviderLocal functionProvider;
    private static ALCCapabilities router;
    private static final ThreadLocal<ALCCapabilities> capabilitiesTLS = new ThreadLocal<>();
    private static ICD icd;

    static {
        if (!Configuration.OPENAL_EXPLICIT_INIT.get(false).booleanValue()) {
            create();
        }
    }

    private ALC() {
    }

    public static void create() {
        String libName;
        switch (Platform.get()) {
            case FREEBSD:
            case LINUX:
            case MACOSX:
                libName = "openal";
                break;
            case WINDOWS:
                libName = "OpenAL";
                break;
            default:
                throw new IllegalStateException();
        }
        create(Configuration.OPENAL_LIBRARY_NAME.get(Platform.mapLibraryNameBundled(libName)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/ALC$SharedLibraryAL.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/ALC$SharedLibraryAL.class */
    private static class SharedLibraryAL extends SharedLibrary.Delegate implements FunctionProviderLocal {
        private final long alcGetProcAddress;

        protected SharedLibraryAL(SharedLibrary library) {
            super(library);
            this.alcGetProcAddress = getFunctionAddress("alcGetProcAddress");
            if (this.alcGetProcAddress == 0) {
                throw new RuntimeException("A core ALC function is missing. Make sure that the OpenAL library has been loaded correctly.");
            }
        }

        @Override // org.lwjgl.system.FunctionProvider
        public long getFunctionAddress(ByteBuffer functionName) {
            long address = this.library.getFunctionAddress(functionName);
            if (address == 0 && Checks.DEBUG_FUNCTIONS) {
                APIUtil.apiLogMissing("ALC core", functionName);
            }
            return address;
        }

        @Override // org.lwjgl.system.FunctionProviderLocal
        public long getFunctionAddress(long handle, ByteBuffer functionName) {
            long address = JNI.invokePPP(handle, MemoryUtil.memAddress(functionName), this.alcGetProcAddress);
            if (address == 0) {
                address = this.library.getFunctionAddress(functionName);
            }
            if (address == 0 && Checks.DEBUG_FUNCTIONS) {
                APIUtil.apiLogMissing("ALC", functionName);
            }
            return address;
        }
    }

    public static void create(String libName) {
        SharedLibrary OPENAL = Library.loadNative((Class<?>) ALC.class, "org.lwjgl.openal", libName, true);
        try {
            create(new SharedLibraryAL(OPENAL));
        } catch (RuntimeException e) {
            OPENAL.free();
            throw e;
        }
    }

    public static void create(FunctionProviderLocal functionProvider2) {
        if (functionProvider != null) {
            throw new IllegalStateException("ALC has already been created.");
        }
        functionProvider = functionProvider2;
        router = createCapabilities(0L);
        AL.init();
    }

    public static void destroy() {
        if (functionProvider == null) {
            return;
        }
        AL.destroy();
        router = null;
        if (functionProvider instanceof NativeResource) {
            ((NativeResource) functionProvider).free();
        }
        functionProvider = null;
    }

    static <T> T check(T t) {
        if (t == null) {
            throw new IllegalStateException("OpenAL library has not been loaded.");
        }
        return t;
    }

    public static FunctionProviderLocal getFunctionProvider() {
        return (FunctionProviderLocal) check(functionProvider);
    }

    public static void setCapabilities(ALCCapabilities caps) {
        capabilitiesTLS.set(caps);
        if (icd == null) {
            icd = new ICDStatic();
        }
        icd.set(caps);
    }

    public static ALCCapabilities getCapabilities() {
        ALCCapabilities caps = capabilitiesTLS.get();
        if (caps == null) {
            caps = router;
        }
        return checkCapabilities(caps);
    }

    private static ALCCapabilities checkCapabilities(ALCCapabilities caps) {
        if (caps == null) {
            throw new IllegalStateException("No ALCCapabilities instance set");
        }
        return caps;
    }

    public static ALCCapabilities createCapabilities(long device) {
        return createCapabilities(device, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ALCCapabilities createCapabilities(long device, IntFunction<PointerBuffer> bufferFactory) {
        FunctionProviderLocal functionProvider2 = getFunctionProvider();
        long GetIntegerv = functionProvider2.getFunctionAddress("alcGetIntegerv");
        long GetString = functionProvider2.getFunctionAddress("alcGetString");
        long IsExtensionPresent = functionProvider2.getFunctionAddress("alcIsExtensionPresent");
        if (GetIntegerv == 0 || GetString == 0 || IsExtensionPresent == 0) {
            throw new IllegalStateException("Core ALC functions could not be found. Make sure that OpenAL has been loaded.");
        }
        MemoryStack stack = MemoryStack.stackPush();
        try {
            IntBuffer version = stack.mallocInt(1);
            JNI.invokePPV(device, 4096, 1, MemoryUtil.memAddress(version), GetIntegerv);
            int majorVersion = version.get(0);
            JNI.invokePPV(device, 4097, 1, MemoryUtil.memAddress(version), GetIntegerv);
            int minorVersion = version.get(0);
            if (stack != null) {
                stack.close();
            }
            int[] iArr = {new int[]{0, 1}};
            Set<String> supportedExtensions = new HashSet<>(16);
            for (int major = 1; major <= iArr.length; major++) {
                for (char c : iArr[major - 1]) {
                    if (major < majorVersion || (major == majorVersion && c <= minorVersion)) {
                        supportedExtensions.add("OpenALC" + major + ((int) c));
                    }
                }
            }
            String extensionsString = MemoryUtil.memASCIISafe(JNI.invokePP(device, 4102, GetString));
            if (extensionsString != null) {
                StringTokenizer tokenizer = new StringTokenizer(extensionsString);
                while (tokenizer.hasMoreTokens()) {
                    String extName = tokenizer.nextToken();
                    stack = MemoryStack.stackPush();
                    try {
                        if (JNI.invokePPZ(device, MemoryUtil.memAddress(stack.ASCII(extName, true)), IsExtensionPresent)) {
                            supportedExtensions.add(extName);
                        }
                        if (stack != null) {
                            stack.close();
                        }
                    } finally {
                    }
                }
            }
            APIUtil.apiFilterExtensions(supportedExtensions, Configuration.OPENAL_EXTENSION_FILTER);
            ALCCapabilities caps = new ALCCapabilities(functionProvider2, device, supportedExtensions, bufferFactory == null ? BufferUtils::createPointerBuffer : bufferFactory);
            if (device != 0) {
                setCapabilities(caps);
            }
            return caps;
        } finally {
        }
    }

    static ALCCapabilities getICD() {
        ALCCapabilities caps = icd == null ? null : icd.get();
        if (caps == null) {
            caps = router;
        }
        return (ALCCapabilities) check(caps);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/ALC$ICD.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/ALC$ICD.class */
    private interface ICD {
        ALCCapabilities get();

        default void set(ALCCapabilities caps) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/ALC$ICDStatic.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/ALC$ICDStatic.class */
    private static class ICDStatic implements ICD {
        private static ALCCapabilities tempCaps;

        private ICDStatic() {
        }

        @Override // org.lwjgl.openal.ALC.ICD
        public void set(ALCCapabilities caps) {
            if (tempCaps == null) {
                tempCaps = caps;
            } else if (caps != null && caps != tempCaps && ThreadLocalUtil.areCapabilitiesDifferent(tempCaps.addresses, caps.addresses)) {
                APIUtil.apiLog("[WARNING] Incompatible context detected. Falling back to thread/process lookup for AL contexts.");
                ICD unused = ALC.icd = ALC::getCapabilities;
            }
        }

        @Override // org.lwjgl.openal.ALC.ICD
        public ALCCapabilities get() {
            return WriteOnce.caps;
        }

        /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/ALC$ICDStatic$WriteOnce.class
 */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/ALC$ICDStatic$WriteOnce.class */
        private static final class WriteOnce {
            static final ALCCapabilities caps;

            private WriteOnce() {
            }

            static {
                ALCCapabilities tempCaps = ICDStatic.tempCaps;
                if (tempCaps == null) {
                    throw new IllegalStateException("No ALCCapabilities instance has been set");
                }
                caps = tempCaps;
            }
        }
    }
}
