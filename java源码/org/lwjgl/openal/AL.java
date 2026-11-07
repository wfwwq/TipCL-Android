package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.IntFunction;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.ThreadLocalUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/AL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/AL.class */
public final class AL {
    static long alContext;
    static ALCdevice alcDevice;
    static ALCCapabilities alContextCaps;
    static ALCapabilities alCaps;
    private static ALCapabilities processCaps;
    private static boolean created_lwjgl2 = false;
    private static final ThreadLocal<ALCapabilities> capabilitiesTLS = new ThreadLocal<>();
    private static ICD icd = new ICDStatic();

    public static void create(String deviceArguments, int contextFrequency, int contextRefresh, boolean contextSynchronized) throws LWJGLException {
        create(deviceArguments, contextFrequency, contextRefresh, contextSynchronized, true);
    }

    public static void create(String deviceArguments, int contextFrequency, int contextRefresh, boolean contextSynchronized, boolean openDevice) throws LWJGLException {
        if (alContext == 0 && openDevice) {
            long alDevice = ALC10.alcOpenDevice(deviceArguments);
            if (alDevice == 0) {
                throw new LWJGLException("Cannot open the device");
            }
            IntBuffer attribs = BufferUtils.createIntBuffer(16);
            attribs.put(4103);
            attribs.put(contextFrequency);
            attribs.put(ALC10.ALC_REFRESH);
            attribs.put(contextRefresh);
            attribs.put(131075);
            attribs.put(4);
            attribs.put(4105);
            attribs.put(contextSynchronized ? 1 : 0);
            attribs.put(0);
            attribs.flip();
            alContext = ALC10.alcCreateContext(alDevice, attribs);
            ALC10.alcMakeContextCurrent(alContext);
            alContextCaps = ALC.createCapabilities(alDevice);
            alCaps = createCapabilities(alContextCaps);
            alcDevice = new ALCdevice(alDevice);
            created_lwjgl2 = true;
        }
    }

    public static void create() throws LWJGLException {
        if (alContext == 0) {
            long alDevice = ALC10.alcOpenDevice((ByteBuffer) null);
            if (alDevice == 0) {
                throw new LWJGLException("Cannot open the device");
            }
            IntBuffer attribs = BufferUtils.createIntBuffer(16);
            attribs.put(4103);
            attribs.put(44100);
            attribs.put(ALC10.ALC_REFRESH);
            attribs.put(60);
            attribs.put(131075);
            attribs.put(4);
            attribs.put(4105);
            attribs.put(0);
            attribs.put(0);
            attribs.flip();
            alContext = ALC10.alcCreateContext(alDevice, attribs);
            ALC10.alcMakeContextCurrent(alContext);
            alContextCaps = ALC.createCapabilities(alDevice);
            alCaps = createCapabilities(alContextCaps);
            alcDevice = new ALCdevice(alDevice);
            created_lwjgl2 = true;
        }
    }

    public static boolean isCreated() {
        return created_lwjgl2;
    }

    public static ALCdevice getDevice() {
        return alcDevice;
    }

    private AL() {
    }

    static void init() {
    }

    public static void destroy() {
        if (created_lwjgl2) {
            ALC10.alcMakeContextCurrent(0L);
            ALC10.alcDestroyContext(alContext);
            ALC10.alcCloseDevice(alcDevice.device);
            alContext = 0L;
            alcDevice = null;
            created_lwjgl2 = false;
        }
        setCurrentProcess(null);
    }

    public static void setCurrentProcess(ALCapabilities caps) {
        processCaps = caps;
        capabilitiesTLS.set(null);
        icd.set(caps);
    }

    public static void setCurrentThread(ALCapabilities caps) {
        capabilitiesTLS.set(caps);
        icd.set(caps);
    }

    public static ALCapabilities getCapabilities() {
        ALCapabilities caps = capabilitiesTLS.get();
        if (caps == null) {
            caps = processCaps;
        }
        return checkCapabilities(caps);
    }

    private static ALCapabilities checkCapabilities(ALCapabilities caps) {
        if (caps == null) {
            throw new IllegalStateException("No ALCapabilities instance set for the current thread or process. Possible solutions:\n\ta) Call AL.createCapabilities() after making a context current.\n\tb) Call AL.setCurrentProcess() or AL.setCurrentThread() if an ALCapabilities instance already exists.");
        }
        return caps;
    }

    public static ALCapabilities createCapabilities(ALCCapabilities alcCaps) {
        return createCapabilities(alcCaps, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ALCapabilities createCapabilities(ALCCapabilities alcCaps, IntFunction<PointerBuffer> bufferFactory) {
        long alGetProcAddress = ALC.getFunctionProvider().getFunctionAddress(0L, "alGetProcAddress");
        if (alGetProcAddress == 0) {
            throw new RuntimeException("A core AL function is missing. Make sure that the OpenAL library has been loaded correctly.");
        }
        FunctionProvider functionProvider = functionName -> {
            long address = JNI.invokePP(MemoryUtil.memAddress(functionName), alGetProcAddress);
            if (address == 0 && Checks.DEBUG_FUNCTIONS) {
                APIUtil.apiLogMissing("AL", functionName);
            }
            return address;
        };
        long GetString = functionProvider.getFunctionAddress("alGetString");
        long GetError = functionProvider.getFunctionAddress("alGetError");
        long IsExtensionPresent = functionProvider.getFunctionAddress("alIsExtensionPresent");
        if (GetString == 0 || GetError == 0 || IsExtensionPresent == 0) {
            throw new IllegalStateException("Core OpenAL functions could not be found. Make sure that the OpenAL library has been loaded correctly.");
        }
        String versionString = MemoryUtil.memASCIISafe(JNI.invokeP(AL10.AL_VERSION, GetString));
        if (versionString == null || JNI.invokeI(GetError) != 0) {
            throw new IllegalStateException("There is no OpenAL context current in the current thread or process.");
        }
        APIUtil.APIVersion apiVersion = APIUtil.apiParseVersion(versionString);
        int majorVersion = apiVersion.major;
        int minorVersion = apiVersion.minor;
        int[] iArr = {new int[]{0, 1}};
        Set<String> supportedExtensions = new HashSet<>(32);
        for (int major = 1; major <= iArr.length; major++) {
            for (char c : iArr[major - 1]) {
                if (major < majorVersion || (major == majorVersion && c <= minorVersion)) {
                    supportedExtensions.add("OpenAL" + major + ((int) c));
                }
            }
        }
        String extensionsString = MemoryUtil.memASCIISafe(JNI.invokeP(AL10.AL_EXTENSIONS, GetString));
        if (extensionsString != null) {
            MemoryStack stack = MemoryStack.stackGet();
            StringTokenizer tokenizer = new StringTokenizer(extensionsString);
            while (tokenizer.hasMoreTokens()) {
                String extName = tokenizer.nextToken();
                MemoryStack frame = stack.push();
                try {
                    if (JNI.invokePZ(MemoryUtil.memAddress(frame.ASCII(extName, true)), IsExtensionPresent)) {
                        supportedExtensions.add(extName);
                    }
                    if (frame != null) {
                        frame.close();
                    }
                } catch (Throwable th) {
                    if (frame != null) {
                        try {
                            frame.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
        if (alcCaps.ALC_EXT_EFX) {
            supportedExtensions.add("ALC_EXT_EFX");
        }
        APIUtil.apiFilterExtensions(supportedExtensions, Configuration.OPENAL_EXTENSION_FILTER);
        ALCapabilities caps = new ALCapabilities(functionProvider, supportedExtensions, bufferFactory == null ? BufferUtils::createPointerBuffer : bufferFactory);
        if (alcCaps.ALC_EXT_thread_local_context && EXTThreadLocalContext.alcGetThreadContext() != 0) {
            setCurrentThread(caps);
        } else {
            setCurrentProcess(caps);
        }
        return caps;
    }

    static ALCapabilities getICD() {
        return (ALCapabilities) ALC.check(icd.get());
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/AL$ICD.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/AL$ICD.class */
    private interface ICD {
        ALCapabilities get();

        default void set(ALCapabilities caps) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/AL$ICDStatic.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/AL$ICDStatic.class */
    private static class ICDStatic implements ICD {
        private static ALCapabilities tempCaps;

        private ICDStatic() {
        }

        @Override // org.lwjgl.openal.AL.ICD
        public void set(ALCapabilities caps) {
            if (tempCaps == null) {
                tempCaps = caps;
            } else if (caps != null && caps != tempCaps && ThreadLocalUtil.areCapabilitiesDifferent(tempCaps.addresses, caps.addresses)) {
                APIUtil.apiLog("[WARNING] Incompatible context detected. Falling back to thread/process lookup for AL contexts.");
                ICD unused = AL.icd = AL::getCapabilities;
            }
        }

        @Override // org.lwjgl.openal.AL.ICD
        public ALCapabilities get() {
            return WriteOnce.caps;
        }

        /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/AL$ICDStatic$WriteOnce.class
 */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/AL$ICDStatic$WriteOnce.class */
        private static final class WriteOnce {
            static final ALCapabilities caps;

            private WriteOnce() {
            }

            static {
                ALCapabilities tempCaps = ICDStatic.tempCaps;
                if (tempCaps == null) {
                    throw new IllegalStateException("No ALCapabilities instance has been set");
                }
                caps = tempCaps;
            }
        }
    }
}
