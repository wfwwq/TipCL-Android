package org.lwjgl.system;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.function.LongPredicate;
import org.lwjgl.CLongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryManage;
import org.lwjgl.system.jni.JNINativeInterface;
import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryUtil.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryUtil.class */
public final class MemoryUtil {
    public static final long NULL = 0;
    public static final int PAGE_SIZE;
    public static final int CACHE_LINE_SIZE;
    static final Unsafe UNSAFE;
    private static final Charset UTF16;
    static final Class<? extends ByteBuffer> BUFFER_BYTE;
    static final Class<? extends ShortBuffer> BUFFER_SHORT;
    static final Class<? extends CharBuffer> BUFFER_CHAR;
    static final Class<? extends IntBuffer> BUFFER_INT;
    static final Class<? extends LongBuffer> BUFFER_LONG;
    static final Class<? extends FloatBuffer> BUFFER_FLOAT;
    static final Class<? extends DoubleBuffer> BUFFER_DOUBLE;
    private static final long MARK;
    private static final long POSITION;
    private static final long LIMIT;
    private static final long CAPACITY;
    private static final long ADDRESS;
    private static final long PARENT_BYTE;
    private static final long PARENT_SHORT;
    private static final long PARENT_CHAR;
    private static final long PARENT_INT;
    private static final long PARENT_LONG;
    private static final long PARENT_FLOAT;
    private static final long PARENT_DOUBLE;
    private static final int MAGIC_CAPACITY = 219540062;
    private static final int MAGIC_POSITION = 16435934;
    static final int ARRAY_TLC_SIZE = Configuration.ARRAY_TLC_SIZE.get(8192).intValue();
    static final ThreadLocal<byte[]> ARRAY_TLC_BYTE = ThreadLocal.withInitial(() -> {
        return new byte[ARRAY_TLC_SIZE];
    });
    static final ThreadLocal<char[]> ARRAY_TLC_CHAR = ThreadLocal.withInitial(() -> {
        return new char[ARRAY_TLC_SIZE];
    });
    static final ByteOrder NATIVE_ORDER = ByteOrder.nativeOrder();

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryUtil$MemoryAllocationReport.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryUtil$MemoryAllocationReport.class */
    public interface MemoryAllocationReport {

        /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryUtil$MemoryAllocationReport$Aggregate.class
 */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryUtil$MemoryAllocationReport$Aggregate.class */
        public enum Aggregate {
            ALL,
            GROUP_BY_METHOD,
            GROUP_BY_STACKTRACE
        }

        void invoke(long j, long j2, long j3, String str, StackTraceElement... stackTraceElementArr);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryUtil$MemoryAllocator.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryUtil$MemoryAllocator.class */
    public interface MemoryAllocator {
        long getMalloc();

        long getCalloc();

        long getRealloc();

        long getFree();

        long getAlignedAlloc();

        long getAlignedFree();

        long malloc(long j);

        long calloc(long j, long j2);

        long realloc(long j, long j2);

        void free(long j);

        long aligned_alloc(long j, long j2);

        void aligned_free(long j);
    }

    public static native <T> T memGlobalRefToObject(long j);

    static {
        Charset charset;
        if (NATIVE_ORDER == ByteOrder.LITTLE_ENDIAN) {
            charset = StandardCharsets.UTF_16LE;
        } else {
            charset = StandardCharsets.UTF_16BE;
        }
        UTF16 = charset;
        Library.initialize();
        ByteBuffer bb = ByteBuffer.allocateDirect(0).order(NATIVE_ORDER);
        BUFFER_BYTE = bb.getClass();
        BUFFER_SHORT = bb.asShortBuffer().getClass();
        BUFFER_CHAR = bb.asCharBuffer().getClass();
        BUFFER_INT = bb.asIntBuffer().getClass();
        BUFFER_LONG = bb.asLongBuffer().getClass();
        BUFFER_FLOAT = bb.asFloatBuffer().getClass();
        BUFFER_DOUBLE = bb.asDoubleBuffer().getClass();
        UNSAFE = getUnsafeInstance();
        try {
            MARK = getMarkOffset();
            POSITION = getPositionOffset();
            LIMIT = getLimitOffset();
            CAPACITY = getCapacityOffset();
            ADDRESS = getAddressOffset();
            PARENT_BYTE = getFieldOffsetObject(bb.duplicate().order(bb.order()), bb);
            PARENT_SHORT = getFieldOffsetObject(bb.asShortBuffer(), bb);
            PARENT_CHAR = getFieldOffsetObject(bb.asCharBuffer(), bb);
            PARENT_INT = getFieldOffsetObject(bb.asIntBuffer(), bb);
            PARENT_LONG = getFieldOffsetObject(bb.asLongBuffer(), bb);
            PARENT_FLOAT = getFieldOffsetObject(bb.asFloatBuffer(), bb);
            PARENT_DOUBLE = getFieldOffsetObject(bb.asDoubleBuffer(), bb);
            PAGE_SIZE = UNSAFE.pageSize();
            CACHE_LINE_SIZE = 64;
        } catch (Throwable t) {
            throw new UnsupportedOperationException(t);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryUtil$LazyInit.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryUtil$LazyInit.class */
    static final class LazyInit {
        static final MemoryAllocator ALLOCATOR_IMPL;
        static final MemoryAllocator ALLOCATOR;

        private LazyInit() {
        }

        static {
            MemoryAllocator debugAllocator;
            boolean debug = Configuration.DEBUG_MEMORY_ALLOCATOR.get(false).booleanValue();
            ALLOCATOR_IMPL = MemoryManage.getInstance();
            if (debug) {
                debugAllocator = new MemoryManage.DebugAllocator(ALLOCATOR_IMPL);
            } else {
                debugAllocator = ALLOCATOR_IMPL;
            }
            ALLOCATOR = debugAllocator;
            APIUtil.apiLog("MemoryUtil allocator: " + ALLOCATOR.getClass().getSimpleName());
            if (debug && !Configuration.DEBUG_MEMORY_ALLOCATOR_FAST.get(false).booleanValue()) {
                APIUtil.apiLogMore("Reminder: enable Configuration.DEBUG_MEMORY_ALLOCATOR_FAST for low overhead allocation tracking.");
            }
        }
    }

    private MemoryUtil() {
    }

    public static MemoryAllocator getAllocator() {
        return getAllocator(false);
    }

    public static MemoryAllocator getAllocator(boolean tracked) {
        if (tracked) {
            return LazyInit.ALLOCATOR;
        }
        return LazyInit.ALLOCATOR_IMPL;
    }

    public static long nmemAlloc(long size) {
        return LazyInit.ALLOCATOR.malloc(size);
    }

    public static long nmemAllocChecked(long size) {
        long address = nmemAlloc(size != 0 ? size : 1L);
        if (Checks.CHECKS && address == 0) {
            throw new OutOfMemoryError();
        }
        return address;
    }

    private static long getAllocationSize(int elements, int elementShift) {
        return APIUtil.apiCheckAllocation(elements, Integer.toUnsignedLong(elements) << elementShift, Pointer.BITS64 ? Long.MAX_VALUE : 4294967295L);
    }

    public static ByteBuffer memAlloc(int size) {
        return wrapBufferByte(nmemAllocChecked(size), size);
    }

    public static ShortBuffer memAllocShort(int size) {
        return wrapBufferShort(nmemAllocChecked(getAllocationSize(size, 1)), size);
    }

    public static IntBuffer memAllocInt(int size) {
        return wrapBufferInt(nmemAllocChecked(getAllocationSize(size, 2)), size);
    }

    public static FloatBuffer memAllocFloat(int size) {
        return wrapBufferFloat(nmemAllocChecked(getAllocationSize(size, 2)), size);
    }

    public static LongBuffer memAllocLong(int size) {
        return wrapBufferLong(nmemAllocChecked(getAllocationSize(size, 3)), size);
    }

    public static CLongBuffer memAllocCLong(int size) {
        return CLongBuffer.create(nmemAllocChecked(getAllocationSize(size, Pointer.CLONG_SHIFT)), size);
    }

    public static DoubleBuffer memAllocDouble(int size) {
        return wrapBufferDouble(nmemAllocChecked(getAllocationSize(size, 3)), size);
    }

    public static PointerBuffer memAllocPointer(int size) {
        return PointerBuffer.create(nmemAllocChecked(getAllocationSize(size, Pointer.POINTER_SHIFT)), size);
    }

    public static void nmemFree(long ptr) {
        LazyInit.ALLOCATOR.free(ptr);
    }

    public static void memFree(Buffer ptr) {
        if (ptr != null) {
            nmemFree(UNSAFE.getLong(ptr, ADDRESS));
        }
    }

    public static void memFree(ByteBuffer ptr) {
        if (ptr != null) {
            nmemFree(UNSAFE.getLong(ptr, ADDRESS));
        }
    }

    public static void memFree(ShortBuffer ptr) {
        if (ptr != null) {
            nmemFree(UNSAFE.getLong(ptr, ADDRESS));
        }
    }

    public static void memFree(CharBuffer ptr) {
        if (ptr != null) {
            nmemFree(UNSAFE.getLong(ptr, ADDRESS));
        }
    }

    public static void memFree(IntBuffer ptr) {
        if (ptr != null) {
            nmemFree(UNSAFE.getLong(ptr, ADDRESS));
        }
    }

    public static void memFree(LongBuffer ptr) {
        if (ptr != null) {
            nmemFree(UNSAFE.getLong(ptr, ADDRESS));
        }
    }

    public static void memFree(FloatBuffer ptr) {
        if (ptr != null) {
            nmemFree(UNSAFE.getLong(ptr, ADDRESS));
        }
    }

    public static void memFree(DoubleBuffer ptr) {
        if (ptr != null) {
            nmemFree(UNSAFE.getLong(ptr, ADDRESS));
        }
    }

    public static void memFree(CustomBuffer<?> ptr) {
        if (ptr != null) {
            nmemFree(ptr.address);
        }
    }

    public static long nmemCalloc(long num, long size) {
        return LazyInit.ALLOCATOR.calloc(num, size);
    }

    public static long nmemCallocChecked(long num, long size) {
        if (num == 0 || size == 0) {
            num = 1;
            size = 1;
        }
        long address = nmemCalloc(num, size);
        if (Checks.CHECKS && address == 0) {
            throw new OutOfMemoryError();
        }
        return address;
    }

    public static ByteBuffer memCalloc(int num, int size) {
        return wrapBufferByte(nmemCallocChecked(num, size), num * size);
    }

    public static ByteBuffer memCalloc(int num) {
        return wrapBufferByte(nmemCallocChecked(num, 1L), num);
    }

    public static ShortBuffer memCallocShort(int num) {
        return wrapBufferShort(nmemCallocChecked(num, 2L), num);
    }

    public static IntBuffer memCallocInt(int num) {
        return wrapBufferInt(nmemCallocChecked(num, 4L), num);
    }

    public static FloatBuffer memCallocFloat(int num) {
        return wrapBufferFloat(nmemCallocChecked(num, 4L), num);
    }

    public static LongBuffer memCallocLong(int num) {
        return wrapBufferLong(nmemCallocChecked(num, 8L), num);
    }

    public static CLongBuffer memCallocCLong(int num) {
        return CLongBuffer.create(nmemCallocChecked(num, Pointer.CLONG_SIZE), num);
    }

    public static DoubleBuffer memCallocDouble(int num) {
        return wrapBufferDouble(nmemCallocChecked(num, 8L), num);
    }

    public static PointerBuffer memCallocPointer(int num) {
        return PointerBuffer.create(nmemCallocChecked(num, Pointer.POINTER_SIZE), num);
    }

    public static long nmemRealloc(long ptr, long size) {
        return LazyInit.ALLOCATOR.realloc(ptr, size);
    }

    public static long nmemReallocChecked(long ptr, long size) {
        long address = nmemRealloc(ptr, size != 0 ? size : 1L);
        if (Checks.CHECKS && address == 0) {
            throw new OutOfMemoryError();
        }
        return address;
    }

    private static <T extends Buffer> T realloc(T old_p, T new_p, int size) {
        if (old_p != null) {
            new_p.position(Math.min(old_p.position(), size));
        }
        return new_p;
    }

    public static ByteBuffer memRealloc(ByteBuffer ptr, int size) {
        return (ByteBuffer) realloc(ptr, memByteBuffer(nmemReallocChecked(ptr == null ? 0L : UNSAFE.getLong(ptr, ADDRESS), size), size), size);
    }

    public static ShortBuffer memRealloc(ShortBuffer ptr, int size) {
        return (ShortBuffer) realloc(ptr, memShortBuffer(nmemReallocChecked(ptr == null ? 0L : UNSAFE.getLong(ptr, ADDRESS), getAllocationSize(size, 1)), size), size);
    }

    public static IntBuffer memRealloc(IntBuffer ptr, int size) {
        return (IntBuffer) realloc(ptr, memIntBuffer(nmemReallocChecked(ptr == null ? 0L : UNSAFE.getLong(ptr, ADDRESS), getAllocationSize(size, 2)), size), size);
    }

    public static LongBuffer memRealloc(LongBuffer ptr, int size) {
        return (LongBuffer) realloc(ptr, memLongBuffer(nmemReallocChecked(ptr == null ? 0L : UNSAFE.getLong(ptr, ADDRESS), getAllocationSize(size, 3)), size), size);
    }

    public static CLongBuffer memRealloc(CLongBuffer ptr, int size) {
        CLongBuffer buffer = memCLongBuffer(nmemReallocChecked(ptr == null ? 0L : ptr.address, getAllocationSize(size, Pointer.CLONG_SIZE)), size);
        if (ptr != null) {
            buffer.position(Math.min(ptr.position(), size));
        }
        return buffer;
    }

    public static FloatBuffer memRealloc(FloatBuffer ptr, int size) {
        return (FloatBuffer) realloc(ptr, memFloatBuffer(nmemReallocChecked(ptr == null ? 0L : UNSAFE.getLong(ptr, ADDRESS), getAllocationSize(size, 2)), size), size);
    }

    public static DoubleBuffer memRealloc(DoubleBuffer ptr, int size) {
        return (DoubleBuffer) realloc(ptr, memDoubleBuffer(nmemReallocChecked(ptr == null ? 0L : UNSAFE.getLong(ptr, ADDRESS), getAllocationSize(size, 3)), size), size);
    }

    public static PointerBuffer memRealloc(PointerBuffer ptr, int size) {
        PointerBuffer buffer = memPointerBuffer(nmemReallocChecked(ptr == null ? 0L : ptr.address, getAllocationSize(size, Pointer.POINTER_SHIFT)), size);
        if (ptr != null) {
            buffer.position(Math.min(ptr.position(), size));
        }
        return buffer;
    }

    public static long nmemAlignedAlloc(long alignment, long size) {
        return LazyInit.ALLOCATOR.aligned_alloc(alignment, size);
    }

    public static long nmemAlignedAllocChecked(long alignment, long size) {
        long address = nmemAlignedAlloc(alignment, size != 0 ? size : 1L);
        if (Checks.CHECKS && address == 0) {
            throw new OutOfMemoryError();
        }
        return address;
    }

    public static ByteBuffer memAlignedAlloc(int alignment, int size) {
        return wrapBufferByte(nmemAlignedAllocChecked(alignment, size), size);
    }

    public static void nmemAlignedFree(long ptr) {
        LazyInit.ALLOCATOR.aligned_free(ptr);
    }

    public static void memAlignedFree(ByteBuffer ptr) {
        if (ptr != null) {
            nmemAlignedFree(UNSAFE.getLong(ptr, ADDRESS));
        }
    }

    public static void memReport(MemoryAllocationReport report) {
        MemoryManage.DebugAllocator.report(report);
    }

    public static void memReport(MemoryAllocationReport report, MemoryAllocationReport.Aggregate groupByStackTrace, boolean groupByThread) {
        MemoryManage.DebugAllocator.report(report, groupByStackTrace, groupByThread);
    }

    public static long memAddress0(Buffer buffer) {
        return UNSAFE.getLong(buffer, ADDRESS);
    }

    public static long memAddress0(ByteBuffer buffer) {
        return UNSAFE.getLong(buffer, ADDRESS);
    }

    public static long memAddress0(ShortBuffer buffer) {
        return UNSAFE.getLong(buffer, ADDRESS);
    }

    public static long memAddress0(CharBuffer buffer) {
        return UNSAFE.getLong(buffer, ADDRESS);
    }

    public static long memAddress0(IntBuffer buffer) {
        return UNSAFE.getLong(buffer, ADDRESS);
    }

    public static long memAddress0(LongBuffer buffer) {
        return UNSAFE.getLong(buffer, ADDRESS);
    }

    public static long memAddress0(FloatBuffer buffer) {
        return UNSAFE.getLong(buffer, ADDRESS);
    }

    public static long memAddress0(DoubleBuffer buffer) {
        return UNSAFE.getLong(buffer, ADDRESS);
    }

    public static long memAddress(ByteBuffer buffer) {
        return buffer.position() + memAddress0(buffer);
    }

    public static long memAddress(ByteBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return memAddress0(buffer) + Integer.toUnsignedLong(position);
    }

    private static long address(int position, int elementShift, long address) {
        return address + ((position & 4294967295L) << elementShift);
    }

    public static long memAddress(ShortBuffer buffer) {
        return address(buffer.position(), 1, memAddress0(buffer));
    }

    public static long memAddress(ShortBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 1, memAddress0(buffer));
    }

    public static long memAddress(CharBuffer buffer) {
        return address(buffer.position(), 1, memAddress0(buffer));
    }

    public static long memAddress(CharBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 1, memAddress0(buffer));
    }

    public static long memAddress(IntBuffer buffer) {
        return address(buffer.position(), 2, memAddress0(buffer));
    }

    public static long memAddress(IntBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 2, memAddress0(buffer));
    }

    public static long memAddress(FloatBuffer buffer) {
        return address(buffer.position(), 2, memAddress0(buffer));
    }

    public static long memAddress(FloatBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 2, memAddress0(buffer));
    }

    public static long memAddress(LongBuffer buffer) {
        return address(buffer.position(), 3, memAddress0(buffer));
    }

    public static long memAddress(LongBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 3, memAddress0(buffer));
    }

    public static long memAddress(DoubleBuffer buffer) {
        return address(buffer.position(), 3, memAddress0(buffer));
    }

    public static long memAddress(DoubleBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 3, memAddress0(buffer));
    }

    public static long memAddress(Buffer buffer) {
        int elementShift;
        if (buffer instanceof ByteBuffer) {
            elementShift = 0;
        } else if ((buffer instanceof ShortBuffer) || (buffer instanceof CharBuffer)) {
            elementShift = 1;
        } else if ((buffer instanceof IntBuffer) || (buffer instanceof FloatBuffer)) {
            elementShift = 2;
        } else {
            elementShift = 3;
        }
        return address(buffer.position(), elementShift, UNSAFE.getLong(buffer, ADDRESS));
    }

    public static long memAddress(CustomBuffer<?> buffer) {
        return buffer.address();
    }

    public static long memAddress(CustomBuffer<?> buffer, int position) {
        return buffer.address(position);
    }

    public static long memAddressSafe(ByteBuffer buffer) {
        if (buffer == null) {
            return 0L;
        }
        return memAddress0(buffer) + buffer.position();
    }

    public static long memAddressSafe(ShortBuffer buffer) {
        if (buffer == null) {
            return 0L;
        }
        return address(buffer.position(), 1, memAddress0(buffer));
    }

    public static long memAddressSafe(CharBuffer buffer) {
        if (buffer == null) {
            return 0L;
        }
        return address(buffer.position(), 1, memAddress0(buffer));
    }

    public static long memAddressSafe(IntBuffer buffer) {
        if (buffer == null) {
            return 0L;
        }
        return address(buffer.position(), 2, memAddress0(buffer));
    }

    public static long memAddressSafe(FloatBuffer buffer) {
        if (buffer == null) {
            return 0L;
        }
        return address(buffer.position(), 2, memAddress0(buffer));
    }

    public static long memAddressSafe(LongBuffer buffer) {
        if (buffer == null) {
            return 0L;
        }
        return address(buffer.position(), 3, memAddress0(buffer));
    }

    public static long memAddressSafe(DoubleBuffer buffer) {
        if (buffer == null) {
            return 0L;
        }
        return address(buffer.position(), 3, memAddress0(buffer));
    }

    public static long memAddressSafe(Pointer pointer) {
        if (pointer == null) {
            return 0L;
        }
        return pointer.address();
    }

    public static ByteBuffer memByteBuffer(long address, int capacity) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        return wrapBufferByte(address, capacity);
    }

    public static ByteBuffer memByteBufferSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return wrapBufferByte(address, capacity);
    }

    public static ByteBuffer memByteBuffer(ShortBuffer buffer) {
        if (Checks.CHECKS && 1073741823 < buffer.remaining()) {
            throw new IllegalStateException("The source buffer range is too wide");
        }
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 1);
    }

    public static ByteBuffer memByteBuffer(CharBuffer buffer) {
        if (Checks.CHECKS && 1073741823 < buffer.remaining()) {
            throw new IllegalStateException("The source buffer range is too wide");
        }
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 1);
    }

    public static ByteBuffer memByteBuffer(IntBuffer buffer) {
        if (Checks.CHECKS && 536870911 < buffer.remaining()) {
            throw new IllegalStateException("The source buffer range is too wide");
        }
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 2);
    }

    public static ByteBuffer memByteBuffer(LongBuffer buffer) {
        if (Checks.CHECKS && 268435455 < buffer.remaining()) {
            throw new IllegalStateException("The source buffer range is too wide");
        }
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 3);
    }

    public static ByteBuffer memByteBuffer(FloatBuffer buffer) {
        if (Checks.CHECKS && 536870911 < buffer.remaining()) {
            throw new IllegalStateException("The source buffer range is too wide");
        }
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 2);
    }

    public static ByteBuffer memByteBuffer(DoubleBuffer buffer) {
        if (Checks.CHECKS && 268435455 < buffer.remaining()) {
            throw new IllegalStateException("The source buffer range is too wide");
        }
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 3);
    }

    public static ByteBuffer memByteBuffer(CustomBuffer<?> buffer) {
        if (Checks.CHECKS && Integer.MAX_VALUE / buffer.sizeof() < buffer.remaining()) {
            throw new IllegalStateException("The source buffer range is too wide");
        }
        return wrapBufferByte(memAddress(buffer), buffer.remaining() * buffer.sizeof());
    }

    public static <T extends Struct<T>> ByteBuffer memByteBuffer(T value) {
        return wrapBufferByte(value.address, value.sizeof());
    }

    public static ShortBuffer memShortBuffer(long address, int capacity) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        return wrapBufferShort(address, capacity);
    }

    public static ShortBuffer memShortBufferSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return wrapBufferShort(address, capacity);
    }

    public static CharBuffer memCharBuffer(long address, int capacity) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        return wrapBufferChar(address, capacity);
    }

    public static CharBuffer memCharBufferSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return wrapBufferChar(address, capacity);
    }

    public static IntBuffer memIntBuffer(long address, int capacity) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        return wrapBufferInt(address, capacity);
    }

    public static IntBuffer memIntBufferSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return wrapBufferInt(address, capacity);
    }

    public static LongBuffer memLongBuffer(long address, int capacity) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        return wrapBufferLong(address, capacity);
    }

    public static LongBuffer memLongBufferSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return wrapBufferLong(address, capacity);
    }

    public static CLongBuffer memCLongBuffer(long address, int capacity) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        return CLongBuffer.create(address, capacity);
    }

    public static CLongBuffer memCLongBufferSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return CLongBuffer.create(address, capacity);
    }

    public static FloatBuffer memFloatBuffer(long address, int capacity) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        return wrapBufferFloat(address, capacity);
    }

    public static FloatBuffer memFloatBufferSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return wrapBufferFloat(address, capacity);
    }

    public static DoubleBuffer memDoubleBuffer(long address, int capacity) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        return wrapBufferDouble(address, capacity);
    }

    public static DoubleBuffer memDoubleBufferSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return wrapBufferDouble(address, capacity);
    }

    public static PointerBuffer memPointerBuffer(long address, int capacity) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        return PointerBuffer.create(address, capacity);
    }

    public static PointerBuffer memPointerBufferSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return PointerBuffer.create(address, capacity);
    }

    public static ByteBuffer memDuplicate(ByteBuffer buffer) {
        try {
            ByteBuffer target = (ByteBuffer) UNSAFE.allocateInstance(BUFFER_BYTE);
            UNSAFE.putLong(target, ADDRESS, UNSAFE.getLong(buffer, ADDRESS));
            UNSAFE.putInt(target, MARK, UNSAFE.getInt(buffer, MARK));
            UNSAFE.putInt(target, POSITION, UNSAFE.getInt(buffer, POSITION));
            UNSAFE.putInt(target, LIMIT, UNSAFE.getInt(buffer, LIMIT));
            UNSAFE.putInt(target, CAPACITY, UNSAFE.getInt(buffer, CAPACITY));
            Object attachment = UNSAFE.getObject(buffer, PARENT_BYTE);
            UNSAFE.putObject(target, PARENT_BYTE, attachment == null ? buffer : attachment);
            return target.order(buffer.order());
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public static ShortBuffer memDuplicate(ShortBuffer buffer) {
        return (ShortBuffer) duplicate(BUFFER_SHORT, buffer, PARENT_SHORT);
    }

    public static CharBuffer memDuplicate(CharBuffer buffer) {
        return (CharBuffer) duplicate(BUFFER_CHAR, buffer, PARENT_CHAR);
    }

    public static IntBuffer memDuplicate(IntBuffer buffer) {
        return (IntBuffer) duplicate(BUFFER_INT, buffer, PARENT_INT);
    }

    public static LongBuffer memDuplicate(LongBuffer buffer) {
        return (LongBuffer) duplicate(BUFFER_LONG, buffer, PARENT_LONG);
    }

    public static FloatBuffer memDuplicate(FloatBuffer buffer) {
        return (FloatBuffer) duplicate(BUFFER_FLOAT, buffer, PARENT_FLOAT);
    }

    public static DoubleBuffer memDuplicate(DoubleBuffer buffer) {
        return (DoubleBuffer) duplicate(BUFFER_DOUBLE, buffer, PARENT_DOUBLE);
    }

    public static ByteBuffer memSlice(ByteBuffer buffer) {
        return slice(buffer, memAddress0(buffer) + buffer.position(), buffer.remaining());
    }

    public static ShortBuffer memSlice(ShortBuffer buffer) {
        return (ShortBuffer) slice(BUFFER_SHORT, buffer, address(buffer.position(), 1, memAddress0(buffer)), buffer.remaining(), PARENT_SHORT);
    }

    public static CharBuffer memSlice(CharBuffer buffer) {
        return (CharBuffer) slice(BUFFER_CHAR, buffer, address(buffer.position(), 1, memAddress0(buffer)), buffer.remaining(), PARENT_CHAR);
    }

    public static IntBuffer memSlice(IntBuffer buffer) {
        return (IntBuffer) slice(BUFFER_INT, buffer, address(buffer.position(), 2, memAddress0(buffer)), buffer.remaining(), PARENT_INT);
    }

    public static LongBuffer memSlice(LongBuffer buffer) {
        return (LongBuffer) slice(BUFFER_LONG, buffer, address(buffer.position(), 3, memAddress0(buffer)), buffer.remaining(), PARENT_LONG);
    }

    public static FloatBuffer memSlice(FloatBuffer buffer) {
        return (FloatBuffer) slice(BUFFER_FLOAT, buffer, address(buffer.position(), 2, memAddress0(buffer)), buffer.remaining(), PARENT_FLOAT);
    }

    public static DoubleBuffer memSlice(DoubleBuffer buffer) {
        return (DoubleBuffer) slice(BUFFER_DOUBLE, buffer, address(buffer.position(), 3, memAddress0(buffer)), buffer.remaining(), PARENT_DOUBLE);
    }

    public static ByteBuffer memSlice(ByteBuffer buffer, int offset, int capacity) {
        int position = buffer.position() + offset;
        if (offset < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (capacity < 0 || buffer.capacity() - position < capacity) {
            throw new IllegalArgumentException();
        }
        return slice(buffer, memAddress0(buffer) + position, capacity);
    }

    public static ShortBuffer memSlice(ShortBuffer buffer, int offset, int capacity) {
        int position = buffer.position() + offset;
        if (offset < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (capacity < 0 || buffer.capacity() - position < capacity) {
            throw new IllegalArgumentException();
        }
        return (ShortBuffer) slice(BUFFER_SHORT, buffer, address(position, 1, memAddress0(buffer)), capacity, PARENT_SHORT);
    }

    public static CharBuffer memSlice(CharBuffer buffer, int offset, int capacity) {
        int position = buffer.position() + offset;
        if (offset < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (capacity < 0 || buffer.capacity() - position < capacity) {
            throw new IllegalArgumentException();
        }
        return (CharBuffer) slice(BUFFER_CHAR, buffer, address(position, 1, memAddress0(buffer)), capacity, PARENT_CHAR);
    }

    public static IntBuffer memSlice(IntBuffer buffer, int offset, int capacity) {
        int position = buffer.position() + offset;
        if (offset < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (capacity < 0 || buffer.capacity() - position < capacity) {
            throw new IllegalArgumentException();
        }
        return (IntBuffer) slice(BUFFER_INT, buffer, address(position, 2, memAddress0(buffer)), capacity, PARENT_INT);
    }

    public static LongBuffer memSlice(LongBuffer buffer, int offset, int capacity) {
        int position = buffer.position() + offset;
        if (offset < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (capacity < 0 || buffer.capacity() - position < capacity) {
            throw new IllegalArgumentException();
        }
        return (LongBuffer) slice(BUFFER_LONG, buffer, address(position, 3, memAddress0(buffer)), capacity, PARENT_LONG);
    }

    public static FloatBuffer memSlice(FloatBuffer buffer, int offset, int capacity) {
        int position = buffer.position() + offset;
        if (offset < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (capacity < 0 || buffer.capacity() - position < capacity) {
            throw new IllegalArgumentException();
        }
        return (FloatBuffer) slice(BUFFER_FLOAT, buffer, address(position, 2, memAddress0(buffer)), capacity, PARENT_FLOAT);
    }

    public static DoubleBuffer memSlice(DoubleBuffer buffer, int offset, int capacity) {
        int position = buffer.position() + offset;
        if (offset < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (capacity < 0 || buffer.capacity() - position < capacity) {
            throw new IllegalArgumentException();
        }
        return (DoubleBuffer) slice(BUFFER_DOUBLE, buffer, address(position, 3, memAddress0(buffer)), capacity, PARENT_DOUBLE);
    }

    public static <T extends CustomBuffer<T>> T memSlice(T t, int i, int i2) {
        return (T) t.slice(i, i2);
    }

    public static void memSet(ByteBuffer ptr, int value) {
        memSet(memAddress(ptr), value, ptr.remaining());
    }

    public static void memSet(ShortBuffer ptr, int value) {
        memSet(memAddress(ptr), value, APIUtil.apiGetBytes(ptr.remaining(), 1));
    }

    public static void memSet(CharBuffer ptr, int value) {
        memSet(memAddress(ptr), value, APIUtil.apiGetBytes(ptr.remaining(), 1));
    }

    public static void memSet(IntBuffer ptr, int value) {
        memSet(memAddress(ptr), value, APIUtil.apiGetBytes(ptr.remaining(), 2));
    }

    public static void memSet(LongBuffer ptr, int value) {
        memSet(memAddress(ptr), value, APIUtil.apiGetBytes(ptr.remaining(), 3));
    }

    public static void memSet(FloatBuffer ptr, int value) {
        memSet(memAddress(ptr), value, APIUtil.apiGetBytes(ptr.remaining(), 2));
    }

    public static void memSet(DoubleBuffer ptr, int value) {
        memSet(memAddress(ptr), value, APIUtil.apiGetBytes(ptr.remaining(), 3));
    }

    public static <T extends CustomBuffer<T>> void memSet(T ptr, int value) {
        memSet(memAddress((CustomBuffer<?>) ptr), value, Integer.toUnsignedLong(ptr.remaining()) * ptr.sizeof());
    }

    public static <T extends Struct<T>> void memSet(T ptr, int value) {
        memSet(ptr.address, value, ptr.sizeof());
    }

    public static void memCopy(ByteBuffer src, ByteBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.remaining());
        }
        MemoryUtilTunables.memcpy(memAddress(src), memAddress(dst), src.remaining());
    }

    public static void memCopy(ShortBuffer src, ShortBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.remaining());
        }
        MemoryUtilTunables.memcpy(memAddress(src), memAddress(dst), APIUtil.apiGetBytes(src.remaining(), 1));
    }

    public static void memCopy(CharBuffer src, CharBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.remaining());
        }
        MemoryUtilTunables.memcpy(memAddress(src), memAddress(dst), APIUtil.apiGetBytes(src.remaining(), 1));
    }

    public static void memCopy(IntBuffer src, IntBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.remaining());
        }
        MemoryUtilTunables.memcpy(memAddress(src), memAddress(dst), APIUtil.apiGetBytes(src.remaining(), 2));
    }

    public static void memCopy(LongBuffer src, LongBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.remaining());
        }
        MemoryUtilTunables.memcpy(memAddress(src), memAddress(dst), APIUtil.apiGetBytes(src.remaining(), 3));
    }

    public static void memCopy(FloatBuffer src, FloatBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.remaining());
        }
        MemoryUtilTunables.memcpy(memAddress(src), memAddress(dst), APIUtil.apiGetBytes(src.remaining(), 2));
    }

    public static void memCopy(DoubleBuffer src, DoubleBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.remaining());
        }
        MemoryUtilTunables.memcpy(memAddress(src), memAddress(dst), APIUtil.apiGetBytes(src.remaining(), 3));
    }

    public static <T extends CustomBuffer<T>> void memCopy(T src, T dst) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) dst, src.remaining());
        }
        MemoryUtilTunables.memcpy(memAddress((CustomBuffer<?>) src), memAddress((CustomBuffer<?>) dst), Integer.toUnsignedLong(src.remaining()) * src.sizeof());
    }

    public static <T extends Struct<T>> void memCopy(T src, T dst) {
        MemoryUtilTunables.memcpy(src.address, dst.address, src.sizeof());
    }

    public static void memCopy(byte[] src, ByteBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.length);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), 0, src.length);
    }

    public static void memCopy(short[] src, ByteBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check(dst, APIUtil.apiGetBytes(src.length, 1));
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), 0, src.length);
    }

    public static void memCopy(short[] src, ShortBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.length);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), 0, src.length);
    }

    public static void memCopy(int[] src, ByteBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check(dst, APIUtil.apiGetBytes(src.length, 2));
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), 0, src.length);
    }

    public static void memCopy(int[] src, IntBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.length);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), 0, src.length);
    }

    public static void memCopy(long[] src, ByteBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check(dst, APIUtil.apiGetBytes(src.length, 3));
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), 0, src.length);
    }

    public static void memCopy(long[] src, LongBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.length);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), 0, src.length);
    }

    public static void memCopy(float[] src, ByteBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check(dst, APIUtil.apiGetBytes(src.length, 2));
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), 0, src.length);
    }

    public static void memCopy(float[] src, FloatBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.length);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), 0, src.length);
    }

    public static void memCopy(double[] src, ByteBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check(dst, APIUtil.apiGetBytes(src.length, 3));
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), 0, src.length);
    }

    public static void memCopy(double[] src, DoubleBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.length);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), 0, src.length);
    }

    public static void memCopy(byte[] src, ByteBuffer dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, size);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), offset, size);
    }

    public static void memCopy(short[] src, ByteBuffer dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check(dst, APIUtil.apiGetBytes(size, 1));
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), offset, size);
    }

    public static void memCopy(short[] src, ShortBuffer dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, size);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), offset, size);
    }

    public static void memCopy(int[] src, ByteBuffer dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check(dst, APIUtil.apiGetBytes(size, 2));
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), offset, size);
    }

    public static void memCopy(int[] src, IntBuffer dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, size);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), offset, size);
    }

    public static void memCopy(long[] src, ByteBuffer dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check(dst, APIUtil.apiGetBytes(size, 3));
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), offset, size);
    }

    public static void memCopy(long[] src, LongBuffer dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, size);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), offset, size);
    }

    public static void memCopy(float[] src, ByteBuffer dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check(dst, APIUtil.apiGetBytes(size, 2));
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), offset, size);
    }

    public static void memCopy(float[] src, FloatBuffer dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, size);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), offset, size);
    }

    public static void memCopy(double[] src, ByteBuffer dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check(dst, APIUtil.apiGetBytes(size, 3));
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), offset, size);
    }

    public static void memCopy(double[] src, DoubleBuffer dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, size);
        }
        MemoryUtilTunables.memcpy(src, memAddress(dst), offset, size);
    }

    public static void memCopy(ByteBuffer src, byte[] dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, dst.length);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, 0, dst.length);
    }

    public static void memCopy(ByteBuffer src, short[] dst) {
        if (Checks.CHECKS) {
            Checks.check(src, APIUtil.apiGetBytes(dst.length, 1));
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, 0, dst.length);
    }

    public static void memCopy(ShortBuffer src, short[] dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, dst.length);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, 0, dst.length);
    }

    public static void memCopy(ByteBuffer src, int[] dst) {
        if (Checks.CHECKS) {
            Checks.check(src, APIUtil.apiGetBytes(dst.length, 2));
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, 0, dst.length);
    }

    public static void memCopy(IntBuffer src, int[] dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, dst.length);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, 0, dst.length);
    }

    public static void memCopy(ByteBuffer src, long[] dst) {
        if (Checks.CHECKS) {
            Checks.check(src, APIUtil.apiGetBytes(dst.length, 3));
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, 0, dst.length);
    }

    public static void memCopy(LongBuffer src, long[] dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, dst.length);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, 0, dst.length);
    }

    public static void memCopy(ByteBuffer src, float[] dst) {
        if (Checks.CHECKS) {
            Checks.check(src, APIUtil.apiGetBytes(dst.length, 2));
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, 0, dst.length);
    }

    public static void memCopy(FloatBuffer src, float[] dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, dst.length);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, 0, dst.length);
    }

    public static void memCopy(ByteBuffer src, double[] dst) {
        if (Checks.CHECKS) {
            Checks.check(src, APIUtil.apiGetBytes(dst.length, 3));
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, 0, dst.length);
    }

    public static void memCopy(DoubleBuffer src, double[] dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, dst.length);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, 0, dst.length);
    }

    public static void memCopy(ByteBuffer src, byte[] dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, size);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, offset, size);
    }

    public static void memCopy(ByteBuffer src, short[] dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check(src, APIUtil.apiGetBytes(size, 1));
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, offset, size);
    }

    public static void memCopy(ShortBuffer src, short[] dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, size);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, offset, size);
    }

    public static void memCopy(ByteBuffer src, int[] dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check(src, APIUtil.apiGetBytes(size, 2));
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, offset, size);
    }

    public static void memCopy(IntBuffer src, int[] dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, size);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, offset, size);
    }

    public static void memCopy(ByteBuffer src, long[] dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check(src, APIUtil.apiGetBytes(size, 3));
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, offset, size);
    }

    public static void memCopy(LongBuffer src, long[] dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, size);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, offset, size);
    }

    public static void memCopy(ByteBuffer src, float[] dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check(src, APIUtil.apiGetBytes(size, 2));
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, offset, size);
    }

    public static void memCopy(FloatBuffer src, float[] dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, size);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, offset, size);
    }

    public static void memCopy(ByteBuffer src, double[] dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check(src, APIUtil.apiGetBytes(size, 3));
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, offset, size);
    }

    public static void memCopy(DoubleBuffer src, double[] dst, int offset, int size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, size);
        }
        MemoryUtilTunables.memcpy(memAddress(src), dst, offset, size);
    }

    public static void memSet(long ptr, int value, long bytes) {
        if (Checks.DEBUG && (ptr == 0 || bytes < 0)) {
            throw new IllegalArgumentException();
        }
        MemoryUtilTunables.memset(ptr, value, bytes);
    }

    public static void memCopy(long src, long dst, long bytes) {
        if (Checks.DEBUG && (src == 0 || dst == 0 || bytes < 0)) {
            throw new IllegalArgumentException();
        }
        MemoryUtilTunables.memcpy(src, dst, bytes);
    }

    public static void memCopy(byte[] src, long dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, src.length);
    }

    public static void memCopy(short[] src, long dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, src.length);
    }

    public static void memCopy(int[] src, long dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, src.length);
    }

    public static void memCopy(long[] src, long dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, src.length);
    }

    public static void memCopy(float[] src, long dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, src.length);
    }

    public static void memCopy(double[] src, long dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, src.length);
    }

    public static void memCopy(byte[] src, long dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static void memCopy(short[] src, long dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static void memCopy(int[] src, long dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static void memCopy(long[] src, long dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static void memCopy(float[] src, long dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static void memCopy(double[] src, long dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static void memCopy(long src, byte[] dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, dst.length);
    }

    public static void memCopy(long src, short[] dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, dst.length);
    }

    public static void memCopy(long src, int[] dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, dst.length);
    }

    public static void memCopy(long src, long[] dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, dst.length);
    }

    public static void memCopy(long src, float[] dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, dst.length);
    }

    public static void memCopy(long src, double[] dst) {
        MemoryUtilTunables.memcpy(src, dst, 0, dst.length);
    }

    public static void memCopy(long src, byte[] dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static void memCopy(long src, short[] dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static void memCopy(long src, int[] dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static void memCopy(long src, long[] dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static void memCopy(long src, float[] dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static void memCopy(long src, double[] dst, int offset, int size) {
        MemoryUtilTunables.memcpy(src, dst, offset, size);
    }

    public static boolean memGetBoolean(long ptr) {
        return UNSAFE.getByte((Object) null, ptr) != 0;
    }

    public static byte memGetByte(long ptr) {
        return UNSAFE.getByte((Object) null, ptr);
    }

    public static short memGetShort(long ptr) {
        return UNSAFE.getShort((Object) null, ptr);
    }

    public static int memGetInt(long ptr) {
        return UNSAFE.getInt((Object) null, ptr);
    }

    public static long memGetLong(long ptr) {
        return UNSAFE.getLong((Object) null, ptr);
    }

    public static float memGetFloat(long ptr) {
        return UNSAFE.getFloat((Object) null, ptr);
    }

    public static double memGetDouble(long ptr) {
        return UNSAFE.getDouble((Object) null, ptr);
    }

    public static long memGetCLong(long ptr) {
        if (Pointer.CLONG_SIZE == 8) {
            return UNSAFE.getLong((Object) null, ptr);
        }
        return UNSAFE.getInt((Object) null, ptr);
    }

    public static long memGetAddress(long ptr) {
        if (Pointer.BITS64) {
            return UNSAFE.getLong((Object) null, ptr);
        }
        return UNSAFE.getInt((Object) null, ptr) & 4294967295L;
    }

    public static void memPutByte(long ptr, byte value) {
        UNSAFE.putByte((Object) null, ptr, value);
    }

    public static void memPutShort(long ptr, short value) {
        UNSAFE.putShort((Object) null, ptr, value);
    }

    public static void memPutInt(long ptr, int value) {
        UNSAFE.putInt((Object) null, ptr, value);
    }

    public static void memPutLong(long ptr, long value) {
        UNSAFE.putLong((Object) null, ptr, value);
    }

    public static void memPutFloat(long ptr, float value) {
        UNSAFE.putFloat((Object) null, ptr, value);
    }

    public static void memPutDouble(long ptr, double value) {
        UNSAFE.putDouble((Object) null, ptr, value);
    }

    public static void memPutCLong(long ptr, long value) {
        if (Pointer.CLONG_SIZE == 8) {
            UNSAFE.putLong((Object) null, ptr, value);
        } else {
            UNSAFE.putInt((Object) null, ptr, (int) value);
        }
    }

    public static void memPutAddress(long ptr, long value) {
        if (Pointer.BITS64) {
            UNSAFE.putLong((Object) null, ptr, value);
        } else {
            UNSAFE.putInt((Object) null, ptr, (int) value);
        }
    }

    private static int write8(long target, int offset, int value) {
        UNSAFE.putByte((Object) null, target + Integer.toUnsignedLong(offset), (byte) value);
        return offset + 1;
    }

    private static int write8Safe(long target, int offset, int maxLength, int value) {
        if (offset == maxLength) {
            throw new BufferOverflowException();
        }
        UNSAFE.putByte((Object) null, target + Integer.toUnsignedLong(offset), (byte) value);
        return offset + 1;
    }

    private static int write16(long target, int offset, char value) {
        UNSAFE.putShort((Object) null, target + Integer.toUnsignedLong(offset), (short) value);
        return offset + 2;
    }

    public static ByteBuffer memASCII(CharSequence text) {
        return memASCII(text, true);
    }

    public static ByteBuffer memASCIISafe(CharSequence text) {
        if (text == null) {
            return null;
        }
        return memASCII(text, true);
    }

    public static ByteBuffer memASCII(CharSequence text, boolean nullTerminated) {
        int length = memLengthASCII(text, nullTerminated);
        long target = nmemAlloc(length);
        if (Checks.CHECKS && target == 0) {
            throw new OutOfMemoryError();
        }
        encodeASCIIUnsafe(text, nullTerminated, target);
        return wrapBufferByte(target, length);
    }

    public static ByteBuffer memASCIISafe(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }
        return memASCII(text, nullTerminated);
    }

    public static int memASCII(CharSequence text, boolean nullTerminated, ByteBuffer target) {
        if (target.remaining() < memLengthASCII(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        long address = memAddress(target);
        return encodeASCIIUnsafe(text, nullTerminated, address);
    }

    public static int memASCII(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        if (target.capacity() - offset < memLengthASCII(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        return encodeASCIIUnsafe(text, nullTerminated, memAddress(target, offset));
    }

    static int encodeASCIIUnsafe(CharSequence text, boolean nullTerminated, long target) {
        int i = 0;
        int len = text.length();
        while (i < len) {
            i = write8(target, i, text.charAt(i));
        }
        if (nullTerminated) {
            i = write8(target, i, 0);
        }
        return i;
    }

    public static int memLengthASCII(CharSequence value, boolean nullTerminated) {
        int len = value.length() + (nullTerminated ? 1 : 0);
        if (len < 0) {
            throw new BufferOverflowException();
        }
        return len;
    }

    public static ByteBuffer memUTF8(CharSequence text) {
        return memUTF8(text, true);
    }

    public static ByteBuffer memUTF8Safe(CharSequence text) {
        if (text == null) {
            return null;
        }
        return memUTF8(text, true);
    }

    public static ByteBuffer memUTF8(CharSequence text, boolean nullTerminated) {
        int length = memLengthUTF8(text, nullTerminated);
        long target = nmemAlloc(length);
        if (Checks.CHECKS && target == 0) {
            throw new OutOfMemoryError();
        }
        encodeUTF8Unsafe(text, nullTerminated, target);
        return wrapBufferByte(target, length);
    }

    public static ByteBuffer memUTF8Safe(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }
        return memUTF8(text, nullTerminated);
    }

    public static int memUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target) {
        if (target.remaining() < memLengthASCII(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        return encodeUTF8Safe(text, nullTerminated, memAddress(target), target.remaining());
    }

    public static int memUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        if (target.capacity() - offset < memLengthASCII(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        return encodeUTF8Safe(text, nullTerminated, memAddress(target, offset), target.capacity() - offset);
    }

    static int encodeUTF8Unsafe(CharSequence text, boolean nullTerminated, long target) {
        int p;
        int iWrite8;
        int p2 = 0;
        int i = 0;
        int len = text.length();
        while (i < len) {
            int i2 = i;
            i++;
            char c = text.charAt(i2);
            if (c < 128) {
                p2 = write8(target, p2, c);
            } else {
                int cp = c;
                if (c < 2048) {
                    iWrite8 = write8(target, p2, 192 | (cp >> 6));
                } else {
                    if (!Character.isHighSurrogate(c)) {
                        p = write8(target, p2, 224 | (cp >> 12));
                    } else {
                        i++;
                        cp = Character.toCodePoint(c, text.charAt(i));
                        p = write8(target, write8(target, p2, 240 | (cp >> 18)), 128 | ((cp >> 12) & 63));
                    }
                    iWrite8 = write8(target, p, 128 | ((cp >> 6) & 63));
                }
                int p3 = iWrite8;
                p2 = write8(target, p3, 128 | (cp & 63));
            }
        }
        if (nullTerminated) {
            p2 = write8(target, p2, 0);
        }
        return p2;
    }

    static int encodeUTF8Safe(CharSequence text, boolean nullTerminated, long target, int maxLength) {
        int p;
        int iWrite8Safe;
        char c;
        int p2 = 0;
        int i = 0;
        int length = text.length();
        while (i < length && 128 > (c = text.charAt(i))) {
            p2 = write8(target, p2, c);
            i++;
        }
        while (i < length) {
            int i2 = i;
            i++;
            char c2 = text.charAt(i2);
            if (c2 < 128) {
                p2 = write8Safe(target, p2, maxLength, c2);
            } else {
                int cp = c2;
                if (c2 < 2048) {
                    iWrite8Safe = write8Safe(target, p2, maxLength, 192 | (cp >> 6));
                } else {
                    if (!Character.isHighSurrogate(c2)) {
                        p = write8Safe(target, p2, maxLength, 224 | (cp >> 12));
                    } else {
                        i++;
                        cp = Character.toCodePoint(c2, text.charAt(i));
                        p = write8Safe(target, write8Safe(target, p2, maxLength, 240 | (cp >> 18)), maxLength, 128 | ((cp >> 12) & 63));
                    }
                    iWrite8Safe = write8Safe(target, p, maxLength, 128 | ((cp >> 6) & 63));
                }
                int p3 = iWrite8Safe;
                p2 = write8Safe(target, p3, maxLength, 128 | (cp & 63));
            }
        }
        if (nullTerminated) {
            p2 = write8Safe(target, p2, maxLength, 0);
        }
        return p2;
    }

    public static int memLengthUTF8(CharSequence value, boolean nullTerminated) {
        int len = value.length();
        int bytes = len + (nullTerminated ? 1 : 0);
        int i = 0;
        while (i < len) {
            char c = value.charAt(i);
            if (c >= 128) {
                if (c < 2048) {
                    bytes += (127 - c) >>> 31;
                } else {
                    bytes += 2;
                    if (Character.isHighSurrogate(c)) {
                        i++;
                    }
                }
                if (bytes < 0) {
                    throw new BufferOverflowException();
                }
            }
            i++;
        }
        if (bytes < 0) {
            throw new BufferOverflowException();
        }
        return bytes;
    }

    public static ByteBuffer memUTF16(CharSequence text) {
        return memUTF16(text, true);
    }

    public static ByteBuffer memUTF16Safe(CharSequence text) {
        if (text == null) {
            return null;
        }
        return memUTF16(text, true);
    }

    public static ByteBuffer memUTF16(CharSequence text, boolean nullTerminated) {
        int length = memLengthUTF16(text, nullTerminated);
        long target = nmemAlloc(length);
        if (Checks.CHECKS && target == 0) {
            throw new OutOfMemoryError();
        }
        encodeUTF16Unsafe(text, nullTerminated, target);
        return wrapBufferByte(target, length);
    }

    public static ByteBuffer memUTF16Safe(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }
        return memUTF16(text, nullTerminated);
    }

    public static int memUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target) {
        if (target.remaining() < memLengthUTF16(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        long address = memAddress(target);
        return encodeUTF16Unsafe(text, nullTerminated, address);
    }

    public static int memUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        if (target.capacity() - offset < memLengthUTF16(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        long address = memAddress(target, offset);
        return encodeUTF16Unsafe(text, nullTerminated, address);
    }

    static int encodeUTF16Unsafe(CharSequence text, boolean nullTerminated, long target) {
        int p = 0;
        int i = 0;
        int len = text.length();
        while (i < len) {
            int i2 = i;
            i++;
            p = write16(target, p, text.charAt(i2));
        }
        if (nullTerminated) {
            p = write16(target, p, (char) 0);
        }
        return p;
    }

    public static int memLengthUTF16(CharSequence value, boolean nullTerminated) {
        int len = value.length() + (nullTerminated ? 1 : 0);
        if (len < 0 || 1073741823 < len) {
            throw new BufferOverflowException();
        }
        return len << 1;
    }

    private static int memLengthNT1(long address, int maxLength) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        if (Pointer.BITS64) {
            return strlen64NT1(address, maxLength);
        }
        return strlen32NT1(address, maxLength);
    }

    private static int strlen64NT1(long address, int maxLength) {
        int i = 0;
        if (8 <= maxLength) {
            int misalignment = ((int) address) & 7;
            if (misalignment != 0) {
                int len = 8 - misalignment;
                while (i < len) {
                    if (UNSAFE.getByte((Object) null, address + i) != 0) {
                        i++;
                    } else {
                        return i;
                    }
                }
            }
            while (i <= maxLength - 8 && !MathUtil.mathHasZeroByte(UNSAFE.getLong((Object) null, address + i))) {
                i += 8;
            }
        }
        while (i < maxLength && UNSAFE.getByte((Object) null, address + i) != 0) {
            i++;
        }
        return i;
    }

    private static int strlen32NT1(long address, int maxLength) {
        int i = 0;
        if (4 <= maxLength) {
            int misalignment = ((int) address) & 3;
            if (misalignment != 0) {
                int len = 4 - misalignment;
                while (i < len) {
                    if (UNSAFE.getByte((Object) null, address + i) != 0) {
                        i++;
                    } else {
                        return i;
                    }
                }
            }
            while (i <= maxLength - 4 && !MathUtil.mathHasZeroByte(UNSAFE.getInt((Object) null, address + i))) {
                i += 4;
            }
        }
        while (i < maxLength && UNSAFE.getByte((Object) null, address + i) != 0) {
            i++;
        }
        return i;
    }

    public static int memLengthNT1(ByteBuffer buffer) {
        return memLengthNT1(memAddress(buffer), buffer.remaining());
    }

    private static int memLengthNT2(long address, int maxLength) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        if (Pointer.BITS64) {
            return strlen64NT2(address, maxLength);
        }
        return strlen32NT2((int) address, maxLength);
    }

    private static int strlen64NT2(long address, int maxLength) {
        int i = 0;
        if (8 <= maxLength) {
            int misalignment = ((int) address) & 7;
            if (misalignment != 0) {
                int len = 8 - misalignment;
                while (i < len) {
                    if (UNSAFE.getShort((Object) null, address + i) != 0) {
                        i += 2;
                    } else {
                        return i;
                    }
                }
            }
            while (i <= maxLength - 8 && !MathUtil.mathHasZeroShort(UNSAFE.getLong((Object) null, address + i))) {
                i += 8;
            }
        }
        while (i < maxLength && UNSAFE.getShort((Object) null, address + i) != 0) {
            i += 2;
        }
        return i;
    }

    private static int strlen32NT2(long address, int maxLength) {
        int i = 0;
        if (4 <= maxLength) {
            int misalignment = ((int) address) & 3;
            if (misalignment != 0) {
                int len = 4 - misalignment;
                while (i < len) {
                    if (UNSAFE.getShort((Object) null, address + i) != 0) {
                        i += 2;
                    } else {
                        return i;
                    }
                }
            }
            while (i <= maxLength - 4 && !MathUtil.mathHasZeroShort(UNSAFE.getInt((Object) null, address + i))) {
                i += 4;
            }
        }
        while (i < maxLength && UNSAFE.getShort((Object) null, address + i) != 0) {
            i += 2;
        }
        return i;
    }

    public static int memLengthNT2(ByteBuffer buffer) {
        return memLengthNT2(memAddress(buffer), buffer.remaining());
    }

    public static ByteBuffer memByteBufferNT1(long address) {
        return memByteBuffer(address, memLengthNT1(address, Integer.MAX_VALUE));
    }

    public static ByteBuffer memByteBufferNT1(long address, int maxLength) {
        return memByteBuffer(address, memLengthNT1(address, maxLength));
    }

    public static ByteBuffer memByteBufferNT1Safe(long address) {
        if (address == 0) {
            return null;
        }
        return memByteBuffer(address, memLengthNT1(address, Integer.MAX_VALUE));
    }

    public static ByteBuffer memByteBufferNT1Safe(long address, int maxLength) {
        if (address == 0) {
            return null;
        }
        return memByteBuffer(address, memLengthNT1(address, maxLength));
    }

    public static ByteBuffer memByteBufferNT2(long address) {
        return memByteBufferNT2(address, 2147483646);
    }

    public static ByteBuffer memByteBufferNT2(long address, int maxLength) {
        if (Checks.DEBUG && (maxLength & 1) != 0) {
            throw new IllegalArgumentException("The maximum length must be an even number.");
        }
        return memByteBuffer(address, memLengthNT2(address, maxLength));
    }

    public static ByteBuffer memByteBufferNT2Safe(long address) {
        if (address == 0) {
            return null;
        }
        return memByteBufferNT2(address, 2147483646);
    }

    public static ByteBuffer memByteBufferNT2Safe(long address, int maxLength) {
        if (address == 0) {
            return null;
        }
        return memByteBufferNT2(address, maxLength);
    }

    public static String memASCII(long address) {
        return memASCII(address, memLengthNT1(address, Integer.MAX_VALUE));
    }

    public static String memASCII(long address, int length) {
        if (length <= 0) {
            return "";
        }
        byte[] ascii = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_BYTE.get() : new byte[length];
        memByteBuffer(address, length).get(ascii, 0, length);
        return new String(ascii, 0, 0, length);
    }

    public static String memASCII(ByteBuffer buffer) {
        return memASCII(memAddress(buffer), buffer.remaining());
    }

    public static String memASCIISafe(long address) {
        if (address == 0) {
            return null;
        }
        return memASCII(address, memLengthNT1(address, Integer.MAX_VALUE));
    }

    public static String memASCIISafe(long address, int length) {
        if (address == 0) {
            return null;
        }
        return memASCII(address, length);
    }

    public static String memASCIISafe(ByteBuffer buffer) {
        if (buffer == null) {
            return null;
        }
        return memASCII(memAddress(buffer), buffer.remaining());
    }

    public static String memASCII(ByteBuffer buffer, int length) {
        return memASCII(memAddress(buffer), length);
    }

    public static String memASCII(ByteBuffer buffer, int length, int offset) {
        return memASCII(memAddress(buffer, offset), length);
    }

    public static String memUTF8(long address) {
        return MultiReleaseTextDecoding.decodeUTF8(address, memLengthNT1(address, Integer.MAX_VALUE));
    }

    public static String memUTF8(long address, int length) {
        return MultiReleaseTextDecoding.decodeUTF8(address, length);
    }

    public static String memUTF8(ByteBuffer buffer) {
        return MultiReleaseTextDecoding.decodeUTF8(memAddress(buffer), buffer.remaining());
    }

    public static String memUTF8Safe(long address) {
        if (address == 0) {
            return null;
        }
        return MultiReleaseTextDecoding.decodeUTF8(address, memLengthNT1(address, Integer.MAX_VALUE));
    }

    public static String memUTF8Safe(long address, int length) {
        if (address == 0) {
            return null;
        }
        return MultiReleaseTextDecoding.decodeUTF8(address, length);
    }

    public static String memUTF8Safe(ByteBuffer buffer) {
        if (buffer == null) {
            return null;
        }
        return MultiReleaseTextDecoding.decodeUTF8(memAddress(buffer), buffer.remaining());
    }

    public static String memUTF8(ByteBuffer buffer, int length) {
        return MultiReleaseTextDecoding.decodeUTF8(memAddress(buffer), length);
    }

    public static String memUTF8(ByteBuffer buffer, int length, int offset) {
        return MultiReleaseTextDecoding.decodeUTF8(memAddress(buffer, offset), length);
    }

    public static String memUTF16(long address) {
        return memUTF16(address, memLengthNT2(address, 2147483646) >> 1);
    }

    public static String memUTF16(long address, int length) {
        if (length <= 0) {
            return "";
        }
        if (Checks.DEBUG) {
            int len = length << 1;
            byte[] bytes = len <= ARRAY_TLC_SIZE ? ARRAY_TLC_BYTE.get() : new byte[len];
            memByteBuffer(address, len).get(bytes, 0, len);
            return new String(bytes, 0, len, UTF16);
        }
        char[] chars = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_CHAR.get() : new char[length];
        memCharBuffer(address, length).get(chars, 0, length);
        return new String(chars, 0, length);
    }

    public static String memUTF16(ByteBuffer buffer) {
        return memUTF16(memAddress(buffer), buffer.remaining() >> 1);
    }

    public static String memUTF16Safe(long address) {
        if (address == 0) {
            return null;
        }
        return memUTF16(address, memLengthNT2(address, 2147483646) >> 1);
    }

    public static String memUTF16Safe(long address, int length) {
        if (address == 0) {
            return null;
        }
        return memUTF16(address, length);
    }

    public static String memUTF16Safe(ByteBuffer buffer) {
        if (buffer == null) {
            return null;
        }
        return memUTF16(memAddress(buffer), buffer.remaining() >> 1);
    }

    public static String memUTF16(ByteBuffer buffer, int length) {
        return memUTF16(memAddress(buffer), length);
    }

    public static String memUTF16(ByteBuffer buffer, int length, int offset) {
        return memUTF16(memAddress(buffer, offset), length);
    }

    private static Unsafe getUnsafeInstance() {
        Field[] fields = Unsafe.class.getDeclaredFields();
        int length = fields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field = fields[i];
            if (field.getType().equals(Unsafe.class)) {
                int modifiers = field.getModifiers();
                if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                    try {
                        field.setAccessible(true);
                        return (Unsafe) field.get(null);
                    } catch (Exception e) {
                        throw new UnsupportedOperationException("LWJGL requires sun.misc.Unsafe to be available.");
                    }
                }
            }
            i++;
        }
    }

    private static long getFieldOffset(Class<?> containerType, Class<?> fieldType, LongPredicate predicate) {
        Class<?> superclass = containerType;
        while (true) {
            Class<?> c = superclass;
            if (c != Object.class) {
                Field[] fields = c.getDeclaredFields();
                for (Field field : fields) {
                    if (field.getType().isAssignableFrom(fieldType) && !Modifier.isStatic(field.getModifiers()) && !field.isSynthetic()) {
                        long offset = UNSAFE.objectFieldOffset(field);
                        if (predicate.test(offset)) {
                            return offset;
                        }
                    }
                }
                superclass = c.getSuperclass();
            } else {
                throw new UnsupportedOperationException("Failed to find field offset in class.");
            }
        }
    }

    private static long getFieldOffsetInt(Object container, int value) {
        return getFieldOffset(container.getClass(), Integer.TYPE, offset -> {
            return UNSAFE.getInt(container, offset) == value;
        });
    }

    private static long getFieldOffsetObject(Object container, Object value) {
        return getFieldOffset(container.getClass(), value.getClass(), offset -> {
            return UNSAFE.getObject(container, offset) == value;
        });
    }

    private static long getAddressOffset() {
        long MAGIC_ADDRESS = (-2401053090268712947L) & (Pointer.BITS32 ? 4294967295L : -1L);
        ByteBuffer bb = (ByteBuffer) Objects.requireNonNull(JNINativeInterface.NewDirectByteBuffer(MAGIC_ADDRESS, 0L));
        return getFieldOffset(bb.getClass(), Long.TYPE, offset -> {
            return UNSAFE.getLong(bb, offset) == MAGIC_ADDRESS;
        });
    }

    private static long getMarkOffset() {
        ByteBuffer bb = (ByteBuffer) Objects.requireNonNull(JNINativeInterface.NewDirectByteBuffer(1L, 0L));
        return getFieldOffsetInt(bb, -1);
    }

    private static long getPositionOffset() {
        ByteBuffer bb = (ByteBuffer) Objects.requireNonNull(JNINativeInterface.NewDirectByteBuffer(-1L, 219540062L));
        bb.position(MAGIC_POSITION);
        return getFieldOffsetInt(bb, MAGIC_POSITION);
    }

    private static long getLimitOffset() {
        ByteBuffer bb = (ByteBuffer) Objects.requireNonNull(JNINativeInterface.NewDirectByteBuffer(-1L, 219540062L));
        bb.limit(MAGIC_POSITION);
        return getFieldOffsetInt(bb, MAGIC_POSITION);
    }

    private static long getCapacityOffset() {
        ByteBuffer bb = (ByteBuffer) Objects.requireNonNull(JNINativeInterface.NewDirectByteBuffer(-1L, 219540062L));
        bb.limit(0);
        return getFieldOffsetInt(bb, MAGIC_CAPACITY);
    }

    static ByteBuffer wrapBufferByte(long address, int capacity) {
        try {
            ByteBuffer buffer = (ByteBuffer) UNSAFE.allocateInstance(BUFFER_BYTE);
            UNSAFE.putLong(buffer, ADDRESS, address);
            UNSAFE.putInt(buffer, MARK, -1);
            UNSAFE.putInt(buffer, LIMIT, capacity);
            UNSAFE.putInt(buffer, CAPACITY, capacity);
            return buffer.order(NATIVE_ORDER);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    static ShortBuffer wrapBufferShort(long address, int capacity) {
        try {
            ShortBuffer buffer = (ShortBuffer) UNSAFE.allocateInstance(BUFFER_SHORT);
            UNSAFE.putLong(buffer, ADDRESS, address);
            UNSAFE.putInt(buffer, MARK, -1);
            UNSAFE.putInt(buffer, LIMIT, capacity);
            UNSAFE.putInt(buffer, CAPACITY, capacity);
            return buffer;
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    static CharBuffer wrapBufferChar(long address, int capacity) {
        try {
            CharBuffer buffer = (CharBuffer) UNSAFE.allocateInstance(BUFFER_CHAR);
            UNSAFE.putLong(buffer, ADDRESS, address);
            UNSAFE.putInt(buffer, MARK, -1);
            UNSAFE.putInt(buffer, LIMIT, capacity);
            UNSAFE.putInt(buffer, CAPACITY, capacity);
            return buffer;
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    static IntBuffer wrapBufferInt(long address, int capacity) {
        try {
            IntBuffer buffer = (IntBuffer) UNSAFE.allocateInstance(BUFFER_INT);
            UNSAFE.putLong(buffer, ADDRESS, address);
            UNSAFE.putInt(buffer, MARK, -1);
            UNSAFE.putInt(buffer, LIMIT, capacity);
            UNSAFE.putInt(buffer, CAPACITY, capacity);
            return buffer;
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    static LongBuffer wrapBufferLong(long address, int capacity) {
        try {
            LongBuffer buffer = (LongBuffer) UNSAFE.allocateInstance(BUFFER_LONG);
            UNSAFE.putLong(buffer, ADDRESS, address);
            UNSAFE.putInt(buffer, MARK, -1);
            UNSAFE.putInt(buffer, LIMIT, capacity);
            UNSAFE.putInt(buffer, CAPACITY, capacity);
            return buffer;
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    static FloatBuffer wrapBufferFloat(long address, int capacity) {
        try {
            FloatBuffer buffer = (FloatBuffer) UNSAFE.allocateInstance(BUFFER_FLOAT);
            UNSAFE.putLong(buffer, ADDRESS, address);
            UNSAFE.putInt(buffer, MARK, -1);
            UNSAFE.putInt(buffer, LIMIT, capacity);
            UNSAFE.putInt(buffer, CAPACITY, capacity);
            return buffer;
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    static DoubleBuffer wrapBufferDouble(long address, int capacity) {
        try {
            DoubleBuffer buffer = (DoubleBuffer) UNSAFE.allocateInstance(BUFFER_DOUBLE);
            UNSAFE.putLong(buffer, ADDRESS, address);
            UNSAFE.putInt(buffer, MARK, -1);
            UNSAFE.putInt(buffer, LIMIT, capacity);
            UNSAFE.putInt(buffer, CAPACITY, capacity);
            return buffer;
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    static ByteBuffer slice(ByteBuffer source, long address, int capacity) {
        try {
            ByteBuffer target = (ByteBuffer) UNSAFE.allocateInstance(BUFFER_BYTE);
            UNSAFE.putLong(target, ADDRESS, address);
            UNSAFE.putInt(target, MARK, -1);
            UNSAFE.putInt(target, LIMIT, capacity);
            UNSAFE.putInt(target, CAPACITY, capacity);
            Object attachment = UNSAFE.getObject(source, PARENT_BYTE);
            UNSAFE.putObject(target, PARENT_BYTE, attachment == null ? source : attachment);
            return target.order(source.order());
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    static <T extends Buffer> T slice(Class<? extends T> clazz, T source, long address, int capacity, long attachmentOffset) {
        try {
            T t = (T) UNSAFE.allocateInstance(clazz);
            UNSAFE.putLong(t, ADDRESS, address);
            UNSAFE.putInt(t, MARK, -1);
            UNSAFE.putInt(t, LIMIT, capacity);
            UNSAFE.putInt(t, CAPACITY, capacity);
            UNSAFE.putObject(t, attachmentOffset, UNSAFE.getObject(source, attachmentOffset));
            return t;
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    static <T extends Buffer> T duplicate(Class<? extends T> clazz, T source, long attachmentOffset) {
        try {
            T t = (T) UNSAFE.allocateInstance(clazz);
            UNSAFE.putLong(t, ADDRESS, UNSAFE.getLong(source, ADDRESS));
            UNSAFE.putInt(t, MARK, UNSAFE.getInt(source, MARK));
            UNSAFE.putInt(t, POSITION, UNSAFE.getInt(source, POSITION));
            UNSAFE.putInt(t, LIMIT, UNSAFE.getInt(source, LIMIT));
            UNSAFE.putInt(t, CAPACITY, UNSAFE.getInt(source, CAPACITY));
            UNSAFE.putObject(t, attachmentOffset, UNSAFE.getObject(source, attachmentOffset));
            return t;
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
