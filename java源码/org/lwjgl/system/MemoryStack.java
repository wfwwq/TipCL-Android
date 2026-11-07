package org.lwjgl.system;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.Objects;
import org.lwjgl.BufferUtils;
import org.lwjgl.CLongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Pointer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryStack.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryStack.class */
public class MemoryStack extends Pointer.Default implements AutoCloseable {
    private static final int DEFAULT_STACK_FRAMES = 8;
    private final ByteBuffer container;
    private final int size;
    private int pointer;
    private int[] frames;
    protected int frameIndex;
    private static final int DEFAULT_STACK_SIZE = Configuration.STACK_SIZE.get(64).intValue() * 1024;
    private static final ThreadLocal<MemoryStack> TLS = ThreadLocal.withInitial(MemoryStack::create);

    static {
        if (DEFAULT_STACK_SIZE < 0) {
            throw new IllegalStateException("Invalid stack size.");
        }
    }

    protected MemoryStack(ByteBuffer container, long address, int size) {
        super(address);
        this.container = container;
        this.size = size;
        this.pointer = size;
        this.frames = new int[8];
    }

    public static MemoryStack create() {
        return create(DEFAULT_STACK_SIZE);
    }

    public static MemoryStack create(int capacity) {
        return create(BufferUtils.createByteBuffer(capacity));
    }

    public static MemoryStack create(ByteBuffer buffer) {
        long address = MemoryUtil.memAddress(buffer);
        int size = buffer.remaining();
        if (Configuration.DEBUG_STACK.get(false).booleanValue()) {
            return new DebugMemoryStack(buffer, address, size);
        }
        return new MemoryStack(buffer, address, size);
    }

    public static MemoryStack ncreate(long address, int size) {
        if (Configuration.DEBUG_STACK.get(false).booleanValue()) {
            return new DebugMemoryStack(null, address, size);
        }
        return new MemoryStack(null, address, size);
    }

    public MemoryStack push() {
        if (this.frameIndex == this.frames.length) {
            frameOverflow();
        }
        int[] iArr = this.frames;
        int i = this.frameIndex;
        this.frameIndex = i + 1;
        iArr[i] = this.pointer;
        return this;
    }

    private void frameOverflow() {
        if (Checks.DEBUG) {
            APIUtil.apiLog("[WARNING] Out of frame stack space (" + this.frames.length + ") in thread: " + Thread.currentThread());
        }
        this.frames = Arrays.copyOf(this.frames, (this.frames.length * 3) / 2);
    }

    public MemoryStack pop() {
        int[] iArr = this.frames;
        int i = this.frameIndex - 1;
        this.frameIndex = i;
        this.pointer = iArr[i];
        return this;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        pop();
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryStack$DebugMemoryStack.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryStack$DebugMemoryStack.class */
    private static class DebugMemoryStack extends MemoryStack {
        private Object[] debugFrames;

        DebugMemoryStack(ByteBuffer buffer, long address, int size) {
            super(buffer, address, size);
            this.debugFrames = new Object[8];
        }

        @Override // org.lwjgl.system.MemoryStack
        public MemoryStack push() {
            if (this.frameIndex == this.debugFrames.length) {
                frameOverflow();
            }
            this.debugFrames[this.frameIndex] = StackWalkUtil.stackWalkGetMethod(MemoryStack.class);
            return super.push();
        }

        private void frameOverflow() {
            this.debugFrames = Arrays.copyOf(this.debugFrames, (this.debugFrames.length * 3) / 2);
        }

        @Override // org.lwjgl.system.MemoryStack
        public MemoryStack pop() {
            Object pushed = Objects.requireNonNull(this.debugFrames[this.frameIndex - 1]);
            Object popped = StackWalkUtil.stackWalkCheckPop(MemoryStack.class, pushed);
            if (popped != null) {
                reportAsymmetricPop(pushed, popped);
            }
            this.debugFrames[this.frameIndex - 1] = null;
            return super.pop();
        }

        @Override // org.lwjgl.system.MemoryStack, java.lang.AutoCloseable
        public void close() {
            this.debugFrames[this.frameIndex - 1] = null;
            super.pop();
        }

        private static void reportAsymmetricPop(Object pushed, Object popped) {
            APIUtil.DEBUG_STREAM.format("[LWJGL] Asymmetric pop detected:\n\tPUSHED: %s\n\tPOPPED: %s\n\tTHREAD: %s\n", pushed, popped, Thread.currentThread());
        }
    }

    public long getAddress() {
        return this.address;
    }

    public int getSize() {
        return this.size;
    }

    public int getFrameIndex() {
        return this.frameIndex;
    }

    public long getPointerAddress() {
        return this.address + (this.pointer & 4294967295L);
    }

    public int getPointer() {
        return this.pointer;
    }

    public void setPointer(int pointer) {
        if (Checks.CHECKS) {
            checkPointer(pointer);
        }
        this.pointer = pointer;
    }

    private void checkPointer(int pointer) {
        if (pointer < 0 || this.size < pointer) {
            throw new IndexOutOfBoundsException("Invalid stack pointer");
        }
    }

    private static void checkAlignment(int alignment) {
        if (Integer.bitCount(alignment) != 1) {
            throw new IllegalArgumentException("Alignment must be a power-of-two value.");
        }
    }

    public long nmalloc(int size) {
        return nmalloc(POINTER_SIZE, size);
    }

    public long nmalloc(int alignment, int size) {
        long address = ((this.address + this.pointer) - size) & (Integer.toUnsignedLong(alignment - 1) ^ (-1));
        this.pointer = (int) (address - this.address);
        if (Checks.CHECKS && this.pointer < 0) {
            throw new OutOfMemoryError("Out of stack space.");
        }
        return address;
    }

    public long ncalloc(int alignment, int num, int size) {
        int bytes = num * size;
        long address = nmalloc(alignment, bytes);
        MemoryUtil.memSet(address, 0, bytes);
        return address;
    }

    public ByteBuffer malloc(int alignment, int size) {
        if (Checks.DEBUG) {
            checkAlignment(alignment);
        }
        return MemoryUtil.wrapBufferByte(nmalloc(alignment, size), size);
    }

    public ByteBuffer calloc(int alignment, int size) {
        if (Checks.DEBUG) {
            checkAlignment(alignment);
        }
        return MemoryUtil.wrapBufferByte(ncalloc(alignment, size, 1), size);
    }

    public ByteBuffer malloc(int size) {
        return MemoryUtil.wrapBufferByte(nmalloc(POINTER_SIZE, size), size);
    }

    public ByteBuffer calloc(int size) {
        return MemoryUtil.wrapBufferByte(ncalloc(POINTER_SIZE, size, 1), size);
    }

    public long nbyte(byte value) {
        long a = nmalloc(1, 1);
        MemoryUtil.memPutByte(a, value);
        return a;
    }

    public ByteBuffer bytes(byte x) {
        return malloc(1, 1).put(0, x);
    }

    public ByteBuffer bytes(byte x, byte y) {
        return malloc(1, 2).put(0, x).put(1, y);
    }

    public ByteBuffer bytes(byte x, byte y, byte z) {
        return malloc(1, 3).put(0, x).put(1, y).put(2, z);
    }

    public ByteBuffer bytes(byte x, byte y, byte z, byte w) {
        return malloc(1, 4).put(0, x).put(1, y).put(2, z).put(3, w);
    }

    public ByteBuffer bytes(byte... values) {
        ByteBuffer buffer = malloc(1, values.length).put(values);
        buffer.flip();
        return buffer;
    }

    public ShortBuffer mallocShort(int size) {
        return MemoryUtil.wrapBufferShort(nmalloc(2, size << 1), size);
    }

    public ShortBuffer callocShort(int size) {
        int bytes = size * 2;
        long address = nmalloc(2, bytes);
        MemoryUtil.memSet(address, 0, bytes);
        return MemoryUtil.wrapBufferShort(address, size);
    }

    public long nshort(short value) {
        long a = nmalloc(2, 2);
        MemoryUtil.memPutShort(a, value);
        return a;
    }

    public ShortBuffer shorts(short x) {
        return mallocShort(1).put(0, x);
    }

    public ShortBuffer shorts(short x, short y) {
        return mallocShort(2).put(0, x).put(1, y);
    }

    public ShortBuffer shorts(short x, short y, short z) {
        return mallocShort(3).put(0, x).put(1, y).put(2, z);
    }

    public ShortBuffer shorts(short x, short y, short z, short w) {
        return mallocShort(4).put(0, x).put(1, y).put(2, z).put(3, w);
    }

    public ShortBuffer shorts(short... values) {
        ShortBuffer buffer = mallocShort(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    public IntBuffer mallocInt(int size) {
        return MemoryUtil.wrapBufferInt(nmalloc(4, size << 2), size);
    }

    public IntBuffer callocInt(int size) {
        int bytes = size * 4;
        long address = nmalloc(4, bytes);
        MemoryUtil.memSet(address, 0, bytes);
        return MemoryUtil.wrapBufferInt(address, size);
    }

    public long nint(int value) {
        long a = nmalloc(4, 4);
        MemoryUtil.memPutInt(a, value);
        return a;
    }

    public IntBuffer ints(int x) {
        return mallocInt(1).put(0, x);
    }

    public IntBuffer ints(int x, int y) {
        return mallocInt(2).put(0, x).put(1, y);
    }

    public IntBuffer ints(int x, int y, int z) {
        return mallocInt(3).put(0, x).put(1, y).put(2, z);
    }

    public IntBuffer ints(int x, int y, int z, int w) {
        return mallocInt(4).put(0, x).put(1, y).put(2, z).put(3, w);
    }

    public IntBuffer ints(int... values) {
        IntBuffer buffer = mallocInt(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    public LongBuffer mallocLong(int size) {
        return MemoryUtil.wrapBufferLong(nmalloc(8, size << 3), size);
    }

    public LongBuffer callocLong(int size) {
        int bytes = size * 8;
        long address = nmalloc(8, bytes);
        MemoryUtil.memSet(address, 0, bytes);
        return MemoryUtil.wrapBufferLong(address, size);
    }

    public long nlong(long value) {
        long a = nmalloc(8, 8);
        MemoryUtil.memPutLong(a, value);
        return a;
    }

    public LongBuffer longs(long x) {
        return mallocLong(1).put(0, x);
    }

    public LongBuffer longs(long x, long y) {
        return mallocLong(2).put(0, x).put(1, y);
    }

    public LongBuffer longs(long x, long y, long z) {
        return mallocLong(3).put(0, x).put(1, y).put(2, z);
    }

    public LongBuffer longs(long x, long y, long z, long w) {
        return mallocLong(4).put(0, x).put(1, y).put(2, z).put(3, w);
    }

    public LongBuffer longs(long... more) {
        LongBuffer buffer = mallocLong(more.length).put(more);
        buffer.flip();
        return buffer;
    }

    public CLongBuffer mallocCLong(int size) {
        return CLongBuffer.create(nmalloc(CLONG_SIZE, size << CLONG_SHIFT), size);
    }

    public CLongBuffer callocCLong(int size) {
        int bytes = size * CLONG_SIZE;
        long address = nmalloc(CLONG_SIZE, bytes);
        MemoryUtil.memSet(address, 0, bytes);
        return CLongBuffer.create(address, size);
    }

    public long nclong(long value) {
        long a = nmalloc(CLONG_SIZE, CLONG_SIZE);
        MemoryUtil.memPutCLong(a, value);
        return a;
    }

    public CLongBuffer clongs(long x) {
        return mallocCLong(1).put(0, x);
    }

    public CLongBuffer clongs(long x, long y) {
        return mallocCLong(2).put(0, x).put(1, y);
    }

    public CLongBuffer clongs(long x, long y, long z) {
        return mallocCLong(3).put(0, x).put(1, y).put(2, z);
    }

    public CLongBuffer clongs(long x, long y, long z, long w) {
        return mallocCLong(4).put(0, x).put(1, y).put(2, z).put(3, w);
    }

    public CLongBuffer clongs(long... values) {
        CLongBuffer buffer = mallocCLong(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    public FloatBuffer mallocFloat(int size) {
        return MemoryUtil.wrapBufferFloat(nmalloc(4, size << 2), size);
    }

    public FloatBuffer callocFloat(int size) {
        int bytes = size * 4;
        long address = nmalloc(4, bytes);
        MemoryUtil.memSet(address, 0, bytes);
        return MemoryUtil.wrapBufferFloat(address, size);
    }

    public long nfloat(float value) {
        long a = nmalloc(4, 4);
        MemoryUtil.memPutFloat(a, value);
        return a;
    }

    public FloatBuffer floats(float x) {
        return mallocFloat(1).put(0, x);
    }

    public FloatBuffer floats(float x, float y) {
        return mallocFloat(2).put(0, x).put(1, y);
    }

    public FloatBuffer floats(float x, float y, float z) {
        return mallocFloat(3).put(0, x).put(1, y).put(2, z);
    }

    public FloatBuffer floats(float x, float y, float z, float w) {
        return mallocFloat(4).put(0, x).put(1, y).put(2, z).put(3, w);
    }

    public FloatBuffer floats(float... values) {
        FloatBuffer buffer = mallocFloat(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    public DoubleBuffer mallocDouble(int size) {
        return MemoryUtil.wrapBufferDouble(nmalloc(8, size << 3), size);
    }

    public DoubleBuffer callocDouble(int size) {
        int bytes = size * 8;
        long address = nmalloc(8, bytes);
        MemoryUtil.memSet(address, 0, bytes);
        return MemoryUtil.wrapBufferDouble(address, size);
    }

    public long ndouble(double value) {
        long a = nmalloc(8, 8);
        MemoryUtil.memPutDouble(a, value);
        return a;
    }

    public DoubleBuffer doubles(double x) {
        return mallocDouble(1).put(0, x);
    }

    public DoubleBuffer doubles(double x, double y) {
        return mallocDouble(2).put(0, x).put(1, y);
    }

    public DoubleBuffer doubles(double x, double y, double z) {
        return mallocDouble(3).put(0, x).put(1, y).put(2, z);
    }

    public DoubleBuffer doubles(double x, double y, double z, double w) {
        return mallocDouble(4).put(0, x).put(1, y).put(2, z).put(3, w);
    }

    public DoubleBuffer doubles(double... values) {
        DoubleBuffer buffer = mallocDouble(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    public PointerBuffer mallocPointer(int size) {
        return PointerBuffer.create(nmalloc(POINTER_SIZE, size << POINTER_SHIFT), size);
    }

    public PointerBuffer callocPointer(int size) {
        int bytes = size * POINTER_SIZE;
        long address = nmalloc(POINTER_SIZE, bytes);
        MemoryUtil.memSet(address, 0, bytes);
        return PointerBuffer.create(address, size);
    }

    public long npointer(long value) {
        long a = nmalloc(POINTER_SIZE, POINTER_SIZE);
        MemoryUtil.memPutAddress(a, value);
        return a;
    }

    public PointerBuffer pointers(long x) {
        return mallocPointer(1).put(0, x);
    }

    public PointerBuffer pointers(long x, long y) {
        return mallocPointer(2).put(0, x).put(1, y);
    }

    public PointerBuffer pointers(long x, long y, long z) {
        return mallocPointer(3).put(0, x).put(1, y).put(2, z);
    }

    public PointerBuffer pointers(long x, long y, long z, long w) {
        return mallocPointer(4).put(0, x).put(1, y).put(2, z).put(3, w);
    }

    public PointerBuffer pointers(long... values) {
        PointerBuffer buffer = mallocPointer(values.length).put(values);
        buffer.flip();
        return buffer;
    }

    public long npointer(Pointer value) {
        long a = nmalloc(POINTER_SIZE, POINTER_SIZE);
        MemoryUtil.memPutAddress(a, value.address());
        return a;
    }

    public PointerBuffer pointers(Pointer x) {
        return mallocPointer(1).put(0, x);
    }

    public PointerBuffer pointers(Pointer x, Pointer y) {
        return mallocPointer(2).put(0, x).put(1, y);
    }

    public PointerBuffer pointers(Pointer x, Pointer y, Pointer z) {
        return mallocPointer(3).put(0, x).put(1, y).put(2, z);
    }

    public PointerBuffer pointers(Pointer x, Pointer y, Pointer z, Pointer w) {
        return mallocPointer(4).put(0, x).put(1, y).put(2, z).put(3, w);
    }

    public PointerBuffer pointers(Pointer... values) {
        PointerBuffer buffer = mallocPointer(values.length);
        for (int i = 0; i < values.length; i++) {
            buffer.put(i, values[i]);
        }
        return buffer;
    }

    public long npointer(Buffer value) {
        long a = nmalloc(POINTER_SIZE, POINTER_SIZE);
        MemoryUtil.memPutAddress(a, MemoryUtil.memAddress(value));
        return a;
    }

    public PointerBuffer pointers(Buffer x) {
        return mallocPointer(1).put(0, MemoryUtil.memAddress(x));
    }

    public PointerBuffer pointers(Buffer x, Buffer y) {
        return mallocPointer(2).put(0, MemoryUtil.memAddress(x)).put(1, MemoryUtil.memAddress(y));
    }

    public PointerBuffer pointers(Buffer x, Buffer y, Buffer z) {
        return mallocPointer(3).put(0, MemoryUtil.memAddress(x)).put(1, MemoryUtil.memAddress(y)).put(2, MemoryUtil.memAddress(z));
    }

    public PointerBuffer pointers(Buffer x, Buffer y, Buffer z, Buffer w) {
        return mallocPointer(4).put(0, MemoryUtil.memAddress(x)).put(1, MemoryUtil.memAddress(y)).put(2, MemoryUtil.memAddress(z)).put(3, MemoryUtil.memAddress(w));
    }

    public PointerBuffer pointers(Buffer... values) {
        PointerBuffer buffer = mallocPointer(values.length);
        for (int i = 0; i < values.length; i++) {
            buffer.put(i, MemoryUtil.memAddress(values[i]));
        }
        return buffer;
    }

    public PointerBuffer pointersOfElements(CustomBuffer<?> buffer) {
        int remaining = buffer.remaining();
        long addr = buffer.address();
        long sizeof = buffer.sizeof();
        PointerBuffer pointerBuffer = mallocPointer(remaining);
        for (int i = 0; i < remaining; i++) {
            pointerBuffer.put(i, addr + (sizeof * i));
        }
        return pointerBuffer;
    }

    public ByteBuffer ASCII(CharSequence text) {
        return ASCII(text, true);
    }

    public ByteBuffer ASCII(CharSequence text, boolean nullTerminated) {
        int length = MemoryUtil.memLengthASCII(text, nullTerminated);
        long target = nmalloc(POINTER_SIZE, length);
        MemoryUtil.encodeASCIIUnsafe(text, nullTerminated, target);
        return MemoryUtil.wrapBufferByte(target, length);
    }

    public int nASCII(CharSequence text, boolean nullTerminated) {
        long target = nmalloc(POINTER_SIZE, MemoryUtil.memLengthASCII(text, nullTerminated));
        return MemoryUtil.encodeASCIIUnsafe(text, nullTerminated, target);
    }

    public ByteBuffer ASCIISafe(CharSequence text) {
        return ASCIISafe(text, true);
    }

    public ByteBuffer ASCIISafe(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }
        return ASCII(text, nullTerminated);
    }

    public int nASCIISafe(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return 0;
        }
        return nASCII(text, nullTerminated);
    }

    public ByteBuffer UTF8(CharSequence text) {
        return UTF8(text, true);
    }

    public ByteBuffer UTF8(CharSequence text, boolean nullTerminated) {
        int length = MemoryUtil.memLengthUTF8(text, nullTerminated);
        long target = nmalloc(POINTER_SIZE, length);
        MemoryUtil.encodeUTF8Unsafe(text, nullTerminated, target);
        return MemoryUtil.wrapBufferByte(target, length);
    }

    public int nUTF8(CharSequence text, boolean nullTerminated) {
        long target = nmalloc(POINTER_SIZE, MemoryUtil.memLengthUTF8(text, nullTerminated));
        return MemoryUtil.encodeUTF8Unsafe(text, nullTerminated, target);
    }

    public ByteBuffer UTF8Safe(CharSequence text) {
        return UTF8Safe(text, true);
    }

    public ByteBuffer UTF8Safe(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }
        return UTF8(text, nullTerminated);
    }

    public int nUTF8Safe(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return 0;
        }
        return nUTF8(text, nullTerminated);
    }

    public ByteBuffer UTF16(CharSequence text) {
        return UTF16(text, true);
    }

    public ByteBuffer UTF16(CharSequence text, boolean nullTerminated) {
        int length = MemoryUtil.memLengthUTF16(text, nullTerminated);
        long target = nmalloc(POINTER_SIZE, length);
        MemoryUtil.encodeUTF16Unsafe(text, nullTerminated, target);
        return MemoryUtil.wrapBufferByte(target, length);
    }

    public int nUTF16(CharSequence text, boolean nullTerminated) {
        long target = nmalloc(POINTER_SIZE, MemoryUtil.memLengthUTF16(text, nullTerminated));
        return MemoryUtil.encodeUTF16Unsafe(text, nullTerminated, target);
    }

    public ByteBuffer UTF16Safe(CharSequence text) {
        return UTF16Safe(text, true);
    }

    public ByteBuffer UTF16Safe(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }
        return UTF16(text, nullTerminated);
    }

    public int nUTF16Safe(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return 0;
        }
        return nUTF16(text, nullTerminated);
    }

    public static MemoryStack stackGet() {
        return TLS.get();
    }

    public static MemoryStack stackPush() {
        return stackGet().push();
    }

    public static MemoryStack stackPop() {
        return stackGet().pop();
    }

    public static long nstackMalloc(int size) {
        return stackGet().nmalloc(size);
    }

    public static long nstackMalloc(int alignment, int size) {
        return stackGet().nmalloc(alignment, size);
    }

    public static long nstackCalloc(int alignment, int num, int size) {
        return stackGet().ncalloc(alignment, num, size);
    }

    public static ByteBuffer stackMalloc(int size) {
        return stackGet().malloc(size);
    }

    public static ByteBuffer stackCalloc(int size) {
        return stackGet().calloc(size);
    }

    public static ByteBuffer stackBytes(byte x) {
        return stackGet().bytes(x);
    }

    public static ByteBuffer stackBytes(byte x, byte y) {
        return stackGet().bytes(x, y);
    }

    public static ByteBuffer stackBytes(byte x, byte y, byte z) {
        return stackGet().bytes(x, y, z);
    }

    public static ByteBuffer stackBytes(byte x, byte y, byte z, byte w) {
        return stackGet().bytes(x, y, z, w);
    }

    public static ByteBuffer stackBytes(byte... values) {
        return stackGet().bytes(values);
    }

    public static ShortBuffer stackMallocShort(int size) {
        return stackGet().mallocShort(size);
    }

    public static ShortBuffer stackCallocShort(int size) {
        return stackGet().callocShort(size);
    }

    public static ShortBuffer stackShorts(short x) {
        return stackGet().shorts(x);
    }

    public static ShortBuffer stackShorts(short x, short y) {
        return stackGet().shorts(x, y);
    }

    public static ShortBuffer stackShorts(short x, short y, short z) {
        return stackGet().shorts(x, y, z);
    }

    public static ShortBuffer stackShorts(short x, short y, short z, short w) {
        return stackGet().shorts(x, y, z, w);
    }

    public static ShortBuffer stackShorts(short... values) {
        return stackGet().shorts(values);
    }

    public static IntBuffer stackMallocInt(int size) {
        return stackGet().mallocInt(size);
    }

    public static IntBuffer stackCallocInt(int size) {
        return stackGet().callocInt(size);
    }

    public static IntBuffer stackInts(int x) {
        return stackGet().ints(x);
    }

    public static IntBuffer stackInts(int x, int y) {
        return stackGet().ints(x, y);
    }

    public static IntBuffer stackInts(int x, int y, int z) {
        return stackGet().ints(x, y, z);
    }

    public static IntBuffer stackInts(int x, int y, int z, int w) {
        return stackGet().ints(x, y, z, w);
    }

    public static IntBuffer stackInts(int... values) {
        return stackGet().ints(values);
    }

    public static LongBuffer stackMallocLong(int size) {
        return stackGet().mallocLong(size);
    }

    public static LongBuffer stackCallocLong(int size) {
        return stackGet().callocLong(size);
    }

    public static LongBuffer stackLongs(long x) {
        return stackGet().longs(x);
    }

    public static LongBuffer stackLongs(long x, long y) {
        return stackGet().longs(x, y);
    }

    public static LongBuffer stackLongs(long x, long y, long z) {
        return stackGet().longs(x, y, z);
    }

    public static LongBuffer stackLongs(long x, long y, long z, long w) {
        return stackGet().longs(x, y, z, w);
    }

    public static LongBuffer stackLongs(long... values) {
        return stackGet().longs(values);
    }

    public static CLongBuffer stackMallocCLong(int size) {
        return stackGet().mallocCLong(size);
    }

    public static CLongBuffer stackCallocCLong(int size) {
        return stackGet().callocCLong(size);
    }

    public static CLongBuffer stackCLongs(long x) {
        return stackGet().clongs(x);
    }

    public static CLongBuffer stackCLongs(long x, long y) {
        return stackGet().clongs(x, y);
    }

    public static CLongBuffer stackCLongs(long x, long y, long z) {
        return stackGet().clongs(x, y, z);
    }

    public static CLongBuffer stackCLongs(long x, long y, long z, long w) {
        return stackGet().clongs(x, y, z, w);
    }

    public static CLongBuffer stackCLongs(long... values) {
        return stackGet().clongs(values);
    }

    public static FloatBuffer stackMallocFloat(int size) {
        return stackGet().mallocFloat(size);
    }

    public static FloatBuffer stackCallocFloat(int size) {
        return stackGet().callocFloat(size);
    }

    public static FloatBuffer stackFloats(float x) {
        return stackGet().floats(x);
    }

    public static FloatBuffer stackFloats(float x, float y) {
        return stackGet().floats(x, y);
    }

    public static FloatBuffer stackFloats(float x, float y, float z) {
        return stackGet().floats(x, y, z);
    }

    public static FloatBuffer stackFloats(float x, float y, float z, float w) {
        return stackGet().floats(x, y, z, w);
    }

    public static FloatBuffer stackFloats(float... values) {
        return stackGet().floats(values);
    }

    public static DoubleBuffer stackMallocDouble(int size) {
        return stackGet().mallocDouble(size);
    }

    public static DoubleBuffer stackCallocDouble(int size) {
        return stackGet().callocDouble(size);
    }

    public static DoubleBuffer stackDoubles(double x) {
        return stackGet().doubles(x);
    }

    public static DoubleBuffer stackDoubles(double x, double y) {
        return stackGet().doubles(x, y);
    }

    public static DoubleBuffer stackDoubles(double x, double y, double z) {
        return stackGet().doubles(x, y, z);
    }

    public static DoubleBuffer stackDoubles(double x, double y, double z, double w) {
        return stackGet().doubles(x, y, z, w);
    }

    public static DoubleBuffer stackDoubles(double... values) {
        return stackGet().doubles(values);
    }

    public static PointerBuffer stackMallocPointer(int size) {
        return stackGet().mallocPointer(size);
    }

    public static PointerBuffer stackCallocPointer(int size) {
        return stackGet().callocPointer(size);
    }

    public static PointerBuffer stackPointers(long x) {
        return stackGet().pointers(x);
    }

    public static PointerBuffer stackPointers(long x, long y) {
        return stackGet().pointers(x, y);
    }

    public static PointerBuffer stackPointers(long x, long y, long z) {
        return stackGet().pointers(x, y, z);
    }

    public static PointerBuffer stackPointers(long x, long y, long z, long w) {
        return stackGet().pointers(x, y, z, w);
    }

    public static PointerBuffer stackPointers(long... values) {
        return stackGet().pointers(values);
    }

    public static PointerBuffer stackPointers(Pointer x) {
        return stackGet().pointers(x);
    }

    public static PointerBuffer stackPointers(Pointer x, Pointer y) {
        return stackGet().pointers(x, y);
    }

    public static PointerBuffer stackPointers(Pointer x, Pointer y, Pointer z) {
        return stackGet().pointers(x, y, z);
    }

    public static PointerBuffer stackPointers(Pointer x, Pointer y, Pointer z, Pointer w) {
        return stackGet().pointers(x, y, z, w);
    }

    public static PointerBuffer stackPointers(Pointer... values) {
        return stackGet().pointers(values);
    }

    public static ByteBuffer stackASCII(CharSequence text) {
        return stackGet().ASCII(text);
    }

    public static ByteBuffer stackASCII(CharSequence text, boolean nullTerminated) {
        return stackGet().ASCII(text, nullTerminated);
    }

    public static ByteBuffer stackUTF8(CharSequence text) {
        return stackGet().UTF8(text);
    }

    public static ByteBuffer stackUTF8(CharSequence text, boolean nullTerminated) {
        return stackGet().UTF8(text, nullTerminated);
    }

    public static ByteBuffer stackUTF16(CharSequence text) {
        return stackGet().UTF16(text);
    }

    public static ByteBuffer stackUTF16(CharSequence text, boolean nullTerminated) {
        return stackGet().UTF16(text, nullTerminated);
    }

    public static ByteBuffer stackASCIISafe(CharSequence text) {
        return stackGet().ASCIISafe(text);
    }

    public static ByteBuffer stackASCIISafe(CharSequence text, boolean nullTerminated) {
        return stackGet().ASCIISafe(text, nullTerminated);
    }

    public static ByteBuffer stackUTF8Safe(CharSequence text) {
        return stackGet().UTF8Safe(text);
    }

    public static ByteBuffer stackUTF8Safe(CharSequence text, boolean nullTerminated) {
        return stackGet().UTF8Safe(text, nullTerminated);
    }

    public static ByteBuffer stackUTF16Safe(CharSequence text) {
        return stackGet().UTF16Safe(text);
    }

    public static ByteBuffer stackUTF16Safe(CharSequence text, boolean nullTerminated) {
        return stackGet().UTF16Safe(text, nullTerminated);
    }
}
