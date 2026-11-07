package org.lwjgl.system;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Checks.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Checks.class */
public final class Checks {
    public static final boolean CHECKS;
    public static final boolean DEBUG;
    public static final boolean DEBUG_FUNCTIONS;

    static {
        CHECKS = !Configuration.DISABLE_CHECKS.get(false).booleanValue();
        DEBUG = Configuration.DEBUG.get(false).booleanValue();
        DEBUG_FUNCTIONS = Configuration.DEBUG_FUNCTIONS.get(false).booleanValue();
        if (DEBUG_FUNCTIONS && !DEBUG) {
            APIUtil.DEBUG_STREAM.println("[LWJGL] The DEBUG_FUNCTIONS option requires DEBUG to produce output.");
        }
    }

    private Checks() {
    }

    public static int lengthSafe(short[] array) {
        if (array == null) {
            return 0;
        }
        return array.length;
    }

    public static int lengthSafe(int[] array) {
        if (array == null) {
            return 0;
        }
        return array.length;
    }

    public static int lengthSafe(long[] array) {
        if (array == null) {
            return 0;
        }
        return array.length;
    }

    public static int lengthSafe(float[] array) {
        if (array == null) {
            return 0;
        }
        return array.length;
    }

    public static int lengthSafe(double[] array) {
        if (array == null) {
            return 0;
        }
        return array.length;
    }

    public static int remainingSafe(Buffer buffer) {
        if (buffer == null) {
            return 0;
        }
        return buffer.remaining();
    }

    public static int remainingSafe(CustomBuffer<?> buffer) {
        if (buffer == null) {
            return 0;
        }
        return buffer.remaining();
    }

    public static boolean checkFunctions(long... functions) {
        for (long pointer : functions) {
            if (pointer == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkFunctions(FunctionProvider provider, PointerBuffer caps, int[] indices, String... functions) {
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            if (index >= 0 && caps.get(index) == 0) {
                long address = provider.getFunctionAddress(functions[i]);
                if (address != 0) {
                    caps.put(index, address);
                }
            }
        }
        return true;
    }

    public static boolean checkFunctions(FunctionProviderLocal provider, long handle, PointerBuffer caps, int[] indices, String... functions) {
        boolean available = true;
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            if (index >= 0 && caps.get(index) == 0) {
                long address = provider.getFunctionAddress(handle, functions[i]);
                if (address != 0) {
                    caps.put(index, address);
                } else {
                    available = false;
                }
            }
        }
        return available;
    }

    public static boolean checkFunctions(FunctionProvider provider, long[] caps, int[] indices, String... functions) {
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            if (index >= 0 && caps[index] == 0) {
                long address = provider.getFunctionAddress(functions[i]);
                if (address != 0) {
                    caps[index] = address;
                }
            }
        }
        return true;
    }

    public static boolean reportMissing(String api, String extension) {
        APIUtil.apiLog("[" + api + "] " + extension + " was reported as available but an entry point is missing.");
        return true;
    }

    public static long check(long pointer) {
        if (pointer == 0) {
            throw new NullPointerException();
        }
        return pointer;
    }

    private static void assertNT(boolean found) {
        if (!found) {
            throw new IllegalArgumentException("Missing termination");
        }
    }

    public static void checkNT(int[] buf) {
        checkBuffer(buf.length, 1);
        assertNT(buf[buf.length - 1] == 0);
    }

    public static void checkNT(int[] buf, int terminator) {
        checkBuffer(buf.length, 1);
        assertNT(buf[buf.length - 1] == terminator);
    }

    public static void checkNT(long[] buf) {
        checkBuffer(buf.length, 1);
        assertNT(buf[buf.length - 1] == 0);
    }

    public static void checkNT(float[] buf) {
        checkBuffer(buf.length, 1);
        assertNT(buf[buf.length - 1] == 0.0f);
    }

    public static void checkNT1(ByteBuffer buf) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == 0);
    }

    public static void checkNT2(ByteBuffer buf) {
        checkBuffer(buf.remaining(), 2);
        assertNT(buf.get(buf.limit() - 2) == 0);
    }

    public static void checkNT(IntBuffer buf) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == 0);
    }

    public static void checkNT(IntBuffer buf, int terminator) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == terminator);
    }

    public static void checkNT(LongBuffer buf) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == 0);
    }

    public static void checkNT(FloatBuffer buf) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == 0.0f);
    }

    public static void checkNT(PointerBuffer buf) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == 0);
    }

    public static void checkNT(PointerBuffer buf, long terminator) {
        checkBuffer(buf.remaining(), 1);
        assertNT(buf.get(buf.limit() - 1) == terminator);
    }

    public static void checkNTSafe(int[] buf) {
        if (buf != null) {
            checkBuffer(buf.length, 1);
            assertNT(buf[buf.length - 1] == 0);
        }
    }

    public static void checkNTSafe(int[] buf, int terminator) {
        if (buf != null) {
            checkBuffer(buf.length, 1);
            assertNT(buf[buf.length - 1] == terminator);
        }
    }

    public static void checkNTSafe(long[] buf) {
        if (buf != null) {
            checkBuffer(buf.length, 1);
            assertNT(buf[buf.length - 1] == 0);
        }
    }

    public static void checkNTSafe(float[] buf) {
        if (buf != null) {
            checkBuffer(buf.length, 1);
            assertNT(buf[buf.length - 1] == 0.0f);
        }
    }

    public static void checkNT1Safe(ByteBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == 0);
        }
    }

    public static void checkNT2Safe(ByteBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 2);
            assertNT(buf.get(buf.limit() - 2) == 0);
        }
    }

    public static void checkNTSafe(IntBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == 0);
        }
    }

    public static void checkNTSafe(IntBuffer buf, int terminator) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == terminator);
        }
    }

    public static void checkNTSafe(LongBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == 0);
        }
    }

    public static void checkNTSafe(FloatBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == 0.0f);
        }
    }

    public static void checkNTSafe(PointerBuffer buf) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == 0);
        }
    }

    public static void checkNTSafe(PointerBuffer buf, long terminator) {
        if (buf != null) {
            checkBuffer(buf.remaining(), 1);
            assertNT(buf.get(buf.limit() - 1) == terminator);
        }
    }

    private static void checkBuffer(int bufferSize, int minimumSize) {
        if (bufferSize < minimumSize) {
            throwIAE(bufferSize, minimumSize);
        }
    }

    public static void check(byte[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    public static void check(short[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    public static void check(int[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    public static void check(long[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    public static void check(float[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    public static void check(double[] buf, int size) {
        checkBuffer(buf.length, size);
    }

    public static void check(CharSequence text, int size) {
        checkBuffer(text.length(), size);
    }

    public static void check(Buffer buf, int size) {
        checkBuffer(buf.remaining(), size);
    }

    public static void check(Buffer buf, long size) {
        checkBuffer(buf.remaining(), (int) size);
    }

    public static void check(CustomBuffer<?> buf, int size) {
        checkBuffer(buf.remaining(), size);
    }

    public static void check(CustomBuffer<?> buf, long size) {
        checkBuffer(buf.remaining(), (int) size);
    }

    public static void checkSafe(short[] buf, int size) {
        if (buf != null) {
            checkBuffer(buf.length, size);
        }
    }

    public static void checkSafe(int[] buf, int size) {
        if (buf != null) {
            checkBuffer(buf.length, size);
        }
    }

    public static void checkSafe(long[] buf, int size) {
        if (buf != null) {
            checkBuffer(buf.length, size);
        }
    }

    public static void checkSafe(float[] buf, int size) {
        if (buf != null) {
            checkBuffer(buf.length, size);
        }
    }

    public static void checkSafe(double[] buf, int size) {
        if (buf != null) {
            checkBuffer(buf.length, size);
        }
    }

    public static void checkSafe(Buffer buf, int size) {
        if (buf != null) {
            checkBuffer(buf.remaining(), size);
        }
    }

    public static void checkSafe(Buffer buf, long size) {
        if (buf != null) {
            checkBuffer(buf.remaining(), (int) size);
        }
    }

    public static void checkSafe(CustomBuffer<?> buf, int size) {
        if (buf != null) {
            checkBuffer(buf.remaining(), size);
        }
    }

    public static void checkSafe(CustomBuffer<?> buf, long size) {
        if (buf != null) {
            checkBuffer(buf.remaining(), (int) size);
        }
    }

    public static void check(Object[] array, int size) {
        checkBuffer(array.length, size);
    }

    private static void checkBufferGT(int bufferSize, int maximumSize) {
        if (maximumSize < bufferSize) {
            throwIAEGT(bufferSize, maximumSize);
        }
    }

    public static void checkGT(Buffer buf, int size) {
        checkBufferGT(buf.remaining(), size);
    }

    public static void checkGT(CustomBuffer<?> buf, int size) {
        checkBufferGT(buf.remaining(), size);
    }

    public static long check(int index, int length) {
        if (CHECKS) {
            CheckIntrinsics.checkIndex(index, length);
        }
        return Integer.toUnsignedLong(index);
    }

    public static void checkMemcpy(long address, int offset, int size, int length) {
        if (CHECKS) {
            if (address == 0) {
                throw new NullPointerException();
            }
            CheckIntrinsics.checkFromIndexSize(offset, size, length);
        }
    }

    private static void throwIAE(int bufferSize, int minimumSize) {
        throw new IllegalArgumentException("Number of remaining elements is " + bufferSize + ", must be at least " + minimumSize);
    }

    private static void throwIAEGT(int bufferSize, int maximumSize) {
        throw new IllegalArgumentException("Number of remaining buffer elements is " + bufferSize + ", must be at most " + maximumSize);
    }
}
