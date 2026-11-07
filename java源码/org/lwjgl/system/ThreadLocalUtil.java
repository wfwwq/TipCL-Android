package org.lwjgl.system;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.jni.JNINativeInterface;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/ThreadLocalUtil.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/ThreadLocalUtil.class */
public final class ThreadLocalUtil {
    private static final int JNI_NATIVE_INTERFACE_FUNCTION_COUNT;
    private static final long JNI_NATIVE_INTERFACE = MemoryUtil.memGetAddress(getThreadJNIEnv());
    private static final int CAPABILITIES_OFFSET = 3 * Pointer.POINTER_SIZE;
    private static final long RESERVED_NULL = MemoryUtil.memGetAddress(JNI_NATIVE_INTERFACE + CAPABILITIES_OFFSET);
    private static final long FUNCTION_MISSING_ABORT = getFunctionMissingAbort();
    private static long FUNCTION_MISSING_ABORT_TABLE = 0;

    private static native long getThreadJNIEnv();

    private static native long getFunctionMissingAbort();

    private static native long setupEnvData(int i);

    static {
        int reservedCount;
        int jniCallCount;
        int JNI_VERSION = JNINativeInterface.GetVersion();
        switch (JNI_VERSION) {
            case 65537:
                reservedCount = 12;
                break;
            default:
                reservedCount = 4;
                break;
        }
        switch (JNI_VERSION) {
            case 65537:
                jniCallCount = 208;
                break;
            case 65538:
                jniCallCount = 225;
                break;
            case 65540:
                jniCallCount = 228;
                break;
            case 65542:
            case 65544:
                jniCallCount = 229;
                break;
            case JNINativeInterface.JNI_VERSION_9 /* 589824 */:
            case JNINativeInterface.JNI_VERSION_10 /* 655360 */:
                jniCallCount = 230;
                break;
            case JNINativeInterface.JNI_VERSION_19 /* 1245184 */:
            case JNINativeInterface.JNI_VERSION_20 /* 1310720 */:
                jniCallCount = 231;
                break;
            case JNINativeInterface.JNI_VERSION_21 /* 1376256 */:
                jniCallCount = 232;
                break;
            case JNINativeInterface.JNI_VERSION_24 /* 1572864 */:
                jniCallCount = 233;
                break;
            default:
                jniCallCount = 233;
                APIUtil.DEBUG_STREAM.println("[LWJGL] [ThreadLocalUtil] Unsupported JNI version detected, this may result in a crash. Please inform LWJGL developers.");
                break;
        }
        JNI_NATIVE_INTERFACE_FUNCTION_COUNT = reservedCount + Configuration.JNI_NATIVE_INTERFACE_FUNCTION_COUNT.get(Integer.valueOf(jniCallCount)).intValue();
    }

    private ThreadLocalUtil() {
    }

    public static void setCapabilities(long capabilities) {
        long env_pp = getThreadJNIEnv();
        long env_p = MemoryUtil.memGetAddress(env_pp);
        if (capabilities == 0) {
            if (env_p != JNI_NATIVE_INTERFACE) {
                MemoryUtil.memPutAddress(env_p + CAPABILITIES_OFFSET, FUNCTION_MISSING_ABORT_TABLE);
            }
        } else {
            if (env_p == JNI_NATIVE_INTERFACE) {
                setupEnvData(JNI_NATIVE_INTERFACE_FUNCTION_COUNT);
                env_p = MemoryUtil.memGetAddress(env_pp);
            }
            MemoryUtil.memPutAddress(env_p + CAPABILITIES_OFFSET, capabilities);
        }
    }

    public static void setFunctionMissingAddresses(int functionCount) {
        long ptr = JNI_NATIVE_INTERFACE + CAPABILITIES_OFFSET;
        long currentTable = MemoryUtil.memGetAddress(ptr);
        if (functionCount == 0) {
            if (currentTable == FUNCTION_MISSING_ABORT_TABLE && FUNCTION_MISSING_ABORT_TABLE != 0) {
                FUNCTION_MISSING_ABORT_TABLE = 0L;
                MemoryUtil.getAllocator().free(currentTable);
                MemoryUtil.memPutAddress(ptr, RESERVED_NULL);
                return;
            }
            return;
        }
        if (currentTable != RESERVED_NULL) {
            throw new IllegalStateException("setFunctionMissingAddresses has been called already");
        }
        if (currentTable != 0) {
            if (MemoryUtil.memGetAddress(JNI_NATIVE_INTERFACE) == RESERVED_NULL) {
                return;
            } else {
                System.err.println("[LWJGL] [ThreadLocalUtil] Unsupported JVM detected, this may result in a crash. Please inform LWJGL developers.");
            }
        }
        FUNCTION_MISSING_ABORT_TABLE = MemoryUtil.getAllocator().malloc(Integer.toUnsignedLong(functionCount) * Pointer.POINTER_SIZE);
        for (int i = 0; i < functionCount; i++) {
            MemoryUtil.memPutAddress(FUNCTION_MISSING_ABORT_TABLE + (Integer.toUnsignedLong(i) * Pointer.POINTER_SIZE), FUNCTION_MISSING_ABORT);
        }
        MemoryUtil.memPutAddress(ptr, FUNCTION_MISSING_ABORT_TABLE);
    }

    public static PointerBuffer setupAddressBuffer(PointerBuffer addresses) {
        for (int i = addresses.position(); i < addresses.limit(); i++) {
            if (addresses.get(i) == 0) {
                addresses.put(i, FUNCTION_MISSING_ABORT);
            }
        }
        return addresses;
    }

    public static boolean areCapabilitiesDifferent(PointerBuffer ref, PointerBuffer caps) {
        for (int i = 0; i < ref.remaining(); i++) {
            if (ref.get(i) != caps.get(i) && caps.get(i) != 0) {
                return true;
            }
        }
        return false;
    }
}
