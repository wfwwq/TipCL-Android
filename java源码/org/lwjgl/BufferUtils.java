package org.lwjgl;

import androidx.collection.SieveCacheKt;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.CustomBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/BufferUtils.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/BufferUtils.class */
public final class BufferUtils {
    public static int getElementSizeExponent(Buffer buf) {
        if (buf instanceof ByteBuffer) {
            return 0;
        }
        if ((buf instanceof ShortBuffer) || (buf instanceof CharBuffer)) {
            return 1;
        }
        if ((buf instanceof FloatBuffer) || (buf instanceof IntBuffer)) {
            return 2;
        }
        if ((buf instanceof LongBuffer) || (buf instanceof DoubleBuffer)) {
            return 3;
        }
        throw new IllegalStateException("Unsupported buffer type: " + buf);
    }

    public static int getOffset(Buffer buffer) {
        return buffer.position() << getElementSizeExponent(buffer);
    }

    static long getBufferAddress(Buffer buffer) {
        return org.lwjgl.system.MemoryUtil.memAddress(buffer);
    }

    private BufferUtils() {
    }

    public static ByteBuffer createByteBuffer(int capacity) {
        return ByteBuffer.allocateDirect(capacity).order(ByteOrder.nativeOrder());
    }

    static int getAllocationSize(int elements, int elementShift) {
        APIUtil.apiCheckAllocation(elements, APIUtil.apiGetBytes(elements, elementShift), SieveCacheKt.NodeLinkMask);
        return elements << elementShift;
    }

    public static ShortBuffer createShortBuffer(int capacity) {
        return createByteBuffer(getAllocationSize(capacity, 1)).asShortBuffer();
    }

    public static CharBuffer createCharBuffer(int capacity) {
        return createByteBuffer(getAllocationSize(capacity, 1)).asCharBuffer();
    }

    public static IntBuffer createIntBuffer(int capacity) {
        return createByteBuffer(getAllocationSize(capacity, 2)).asIntBuffer();
    }

    public static LongBuffer createLongBuffer(int capacity) {
        return createByteBuffer(getAllocationSize(capacity, 3)).asLongBuffer();
    }

    public static CLongBuffer createCLongBuffer(int capacity) {
        return CLongBuffer.allocateDirect(capacity);
    }

    public static FloatBuffer createFloatBuffer(int capacity) {
        return createByteBuffer(getAllocationSize(capacity, 2)).asFloatBuffer();
    }

    public static DoubleBuffer createDoubleBuffer(int capacity) {
        return createByteBuffer(getAllocationSize(capacity, 3)).asDoubleBuffer();
    }

    public static PointerBuffer createPointerBuffer(int capacity) {
        return PointerBuffer.allocateDirect(capacity);
    }

    public static void zeroBuffer(ByteBuffer buffer) {
        org.lwjgl.system.MemoryUtil.memSet(buffer, 0);
    }

    public static void zeroBuffer(ShortBuffer buffer) {
        org.lwjgl.system.MemoryUtil.memSet(buffer, 0);
    }

    public static void zeroBuffer(CharBuffer buffer) {
        org.lwjgl.system.MemoryUtil.memSet(buffer, 0);
    }

    public static void zeroBuffer(IntBuffer buffer) {
        org.lwjgl.system.MemoryUtil.memSet(buffer, 0);
    }

    public static void zeroBuffer(FloatBuffer buffer) {
        org.lwjgl.system.MemoryUtil.memSet(buffer, 0);
    }

    public static void zeroBuffer(LongBuffer buffer) {
        org.lwjgl.system.MemoryUtil.memSet(buffer, 0);
    }

    public static void zeroBuffer(DoubleBuffer buffer) {
        org.lwjgl.system.MemoryUtil.memSet(buffer, 0);
    }

    public static <T extends CustomBuffer<T>> void zeroBuffer(T buffer) {
        org.lwjgl.system.MemoryUtil.memSet(buffer, 0);
    }
}
