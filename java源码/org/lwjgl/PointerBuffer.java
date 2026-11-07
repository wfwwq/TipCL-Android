package org.lwjgl;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.ShortBuffer;
import org.lwjgl.system.CheckIntrinsics;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.Pointer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/PointerBuffer.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/PointerBuffer.class */
public class PointerBuffer extends CustomBuffer<PointerBuffer> implements Comparable<PointerBuffer> {
    public PointerBuffer(int capacity) {
        this(allocateDirect(capacity));
    }

    public PointerBuffer(ByteBuffer source) {
        this(create(source));
    }

    protected PointerBuffer(PointerBuffer copy) {
        this(copy.address0(), copy.container, copy.mark, copy.position, copy.limit, copy.capacity);
    }

    public ByteBuffer getBuffer() {
        return this.container;
    }

    public static boolean is64Bit() {
        return POINTER_SIZE == 8;
    }

    public static int getPointerSize() {
        return POINTER_SIZE;
    }

    public final int positionByte() {
        return position() * getPointerSize();
    }

    public final int remainingByte() {
        return remaining() * getPointerSize();
    }

    public PointerBuffer asReadOnlyBuffer() {
        PointerBuffer buffer = new PointerBufferR(this.container);
        buffer.position(position());
        buffer.limit(limit());
        return buffer;
    }

    public boolean isReadOnly() {
        return false;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/PointerBuffer$PointerBufferR.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/PointerBuffer$PointerBufferR.class */
    private static final class PointerBufferR extends PointerBuffer {
        @Override // org.lwjgl.PointerBuffer, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(PointerBuffer pointerBuffer) {
            return super.compareTo(pointerBuffer);
        }

        @Override // org.lwjgl.PointerBuffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ CustomBuffer create(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
            return super.create(j, byteBuffer, i, i2, i3, i4);
        }

        @Override // org.lwjgl.PointerBuffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ CustomBuffer self() {
            return super.self();
        }

        PointerBufferR(ByteBuffer source) {
            super(source);
        }

        @Override // org.lwjgl.PointerBuffer
        public boolean isReadOnly() {
            return true;
        }

        protected PointerBuffer newInstance(ByteBuffer source) {
            return new PointerBufferR(source);
        }

        @Override // org.lwjgl.PointerBuffer
        public PointerBuffer asReadOnlyBuffer() {
            return duplicate();
        }

        @Override // org.lwjgl.PointerBuffer
        public PointerBuffer put(long l) {
            throw new ReadOnlyBufferException();
        }

        @Override // org.lwjgl.PointerBuffer
        public PointerBuffer put(int index, long l) {
            throw new ReadOnlyBufferException();
        }

        @Override // org.lwjgl.system.CustomBuffer
        public PointerBuffer put(PointerBuffer src) {
            throw new ReadOnlyBufferException();
        }

        @Override // org.lwjgl.PointerBuffer
        public PointerBuffer put(long[] src, int offset, int length) {
            throw new ReadOnlyBufferException();
        }

        @Override // org.lwjgl.system.CustomBuffer
        public PointerBuffer compact() {
            throw new ReadOnlyBufferException();
        }
    }

    protected PointerBuffer(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
        super(address, container, mark, position, limit, capacity);
    }

    public static PointerBuffer allocateDirect(int capacity) {
        ByteBuffer source = BufferUtils.createByteBuffer(BufferUtils.getAllocationSize(capacity, POINTER_SHIFT));
        return new PointerBuffer(org.lwjgl.system.MemoryUtil.memAddress(source), source, -1, 0, capacity, capacity);
    }

    public static PointerBuffer create(long address, int capacity) {
        return new PointerBuffer(address, null, -1, 0, capacity, capacity);
    }

    public static PointerBuffer create(ByteBuffer source) {
        int capacity = source.remaining() >> POINTER_SHIFT;
        return new PointerBuffer(org.lwjgl.system.MemoryUtil.memAddress(source), source, -1, 0, capacity, capacity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.CustomBuffer
    public PointerBuffer self() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.CustomBuffer
    public PointerBuffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
        return new PointerBuffer(address, container, mark, position, limit, capacity);
    }

    @Override // org.lwjgl.system.CustomBuffer
    public int sizeof() {
        return POINTER_SIZE;
    }

    public long get() {
        return org.lwjgl.system.MemoryUtil.memGetAddress(this.address + (Integer.toUnsignedLong(nextGetIndex()) * POINTER_SIZE));
    }

    public static long get(ByteBuffer source) {
        if (source.remaining() < POINTER_SIZE) {
            throw new BufferUnderflowException();
        }
        try {
            return org.lwjgl.system.MemoryUtil.memGetAddress(org.lwjgl.system.MemoryUtil.memAddress(source));
        } finally {
            source.position(source.position() + POINTER_SIZE);
        }
    }

    public PointerBuffer put(long p) {
        org.lwjgl.system.MemoryUtil.memPutAddress(this.address + (Integer.toUnsignedLong(nextPutIndex()) * POINTER_SIZE), p);
        return this;
    }

    public static void put(ByteBuffer target, long p) {
        if (target.remaining() < POINTER_SIZE) {
            throw new BufferOverflowException();
        }
        try {
            org.lwjgl.system.MemoryUtil.memPutAddress(org.lwjgl.system.MemoryUtil.memAddress(target), p);
        } finally {
            target.position(target.position() + POINTER_SIZE);
        }
    }

    public long get(int index) {
        return org.lwjgl.system.MemoryUtil.memGetAddress(this.address + (Checks.check(index, this.limit) * POINTER_SIZE));
    }

    public static long get(ByteBuffer source, int index) {
        CheckIntrinsics.checkFromIndexSize(index, POINTER_SIZE, source.limit());
        return org.lwjgl.system.MemoryUtil.memGetAddress(org.lwjgl.system.MemoryUtil.memAddress0(source) + index);
    }

    public PointerBuffer put(int index, long p) {
        org.lwjgl.system.MemoryUtil.memPutAddress(this.address + (Checks.check(index, this.limit) * POINTER_SIZE), p);
        return this;
    }

    public static void put(ByteBuffer target, int index, long p) {
        CheckIntrinsics.checkFromIndexSize(index, POINTER_SIZE, target.limit());
        org.lwjgl.system.MemoryUtil.memPutAddress(org.lwjgl.system.MemoryUtil.memAddress0(target) + index, p);
    }

    public PointerBuffer put(Pointer pointer) {
        put(pointer.address());
        return this;
    }

    public PointerBuffer put(int index, Pointer pointer) {
        put(index, pointer.address());
        return this;
    }

    public PointerBuffer put(ByteBuffer buffer) {
        put(org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer put(ShortBuffer buffer) {
        put(org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer put(IntBuffer buffer) {
        put(org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer put(LongBuffer buffer) {
        put(org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer put(FloatBuffer buffer) {
        put(org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer put(DoubleBuffer buffer) {
        put(org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer putAddressOf(CustomBuffer<?> buffer) {
        put(org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer put(int index, ByteBuffer buffer) {
        put(index, org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer put(int index, ShortBuffer buffer) {
        put(index, org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer put(int index, IntBuffer buffer) {
        put(index, org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer put(int index, LongBuffer buffer) {
        put(index, org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer put(int index, FloatBuffer buffer) {
        put(index, org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer put(int index, DoubleBuffer buffer) {
        put(index, org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public PointerBuffer putAddressOf(int index, CustomBuffer<?> buffer) {
        put(index, org.lwjgl.system.MemoryUtil.memAddress(buffer));
        return this;
    }

    public ByteBuffer getByteBuffer(int size) {
        return org.lwjgl.system.MemoryUtil.memByteBuffer(get(), size);
    }

    public ShortBuffer getShortBuffer(int size) {
        return org.lwjgl.system.MemoryUtil.memShortBuffer(get(), size);
    }

    public IntBuffer getIntBuffer(int size) {
        return org.lwjgl.system.MemoryUtil.memIntBuffer(get(), size);
    }

    public LongBuffer getLongBuffer(int size) {
        return org.lwjgl.system.MemoryUtil.memLongBuffer(get(), size);
    }

    public FloatBuffer getFloatBuffer(int size) {
        return org.lwjgl.system.MemoryUtil.memFloatBuffer(get(), size);
    }

    public DoubleBuffer getDoubleBuffer(int size) {
        return org.lwjgl.system.MemoryUtil.memDoubleBuffer(get(), size);
    }

    public PointerBuffer getPointerBuffer(int size) {
        return org.lwjgl.system.MemoryUtil.memPointerBuffer(get(), size);
    }

    public String getStringASCII() {
        return org.lwjgl.system.MemoryUtil.memASCII(get());
    }

    public String getStringUTF8() {
        return org.lwjgl.system.MemoryUtil.memUTF8(get());
    }

    public String getStringUTF16() {
        return org.lwjgl.system.MemoryUtil.memUTF16(get());
    }

    public ByteBuffer getByteBuffer(int index, int size) {
        return org.lwjgl.system.MemoryUtil.memByteBuffer(get(index), size);
    }

    public ShortBuffer getShortBuffer(int index, int size) {
        return org.lwjgl.system.MemoryUtil.memShortBuffer(get(index), size);
    }

    public IntBuffer getIntBuffer(int index, int size) {
        return org.lwjgl.system.MemoryUtil.memIntBuffer(get(index), size);
    }

    public LongBuffer getLongBuffer(int index, int size) {
        return org.lwjgl.system.MemoryUtil.memLongBuffer(get(index), size);
    }

    public FloatBuffer getFloatBuffer(int index, int size) {
        return org.lwjgl.system.MemoryUtil.memFloatBuffer(get(index), size);
    }

    public DoubleBuffer getDoubleBuffer(int index, int size) {
        return org.lwjgl.system.MemoryUtil.memDoubleBuffer(get(index), size);
    }

    public PointerBuffer getPointerBuffer(int index, int size) {
        return org.lwjgl.system.MemoryUtil.memPointerBuffer(get(index), size);
    }

    public String getStringASCII(int index) {
        return org.lwjgl.system.MemoryUtil.memASCII(get(index));
    }

    public String getStringUTF8(int index) {
        return org.lwjgl.system.MemoryUtil.memUTF8(get(index));
    }

    public String getStringUTF16(int index) {
        return org.lwjgl.system.MemoryUtil.memUTF16(get(index));
    }

    public PointerBuffer get(long[] dst) {
        return get(dst, 0, dst.length);
    }

    public PointerBuffer get(long[] dst, int offset, int length) {
        if (BITS64) {
            org.lwjgl.system.MemoryUtil.memLongBuffer(address(), remaining()).get(dst, offset, length);
            position(position() + length);
        } else {
            get32(dst, offset, length);
        }
        return this;
    }

    private void get32(long[] dst, int offset, int length) {
        CheckIntrinsics.checkFromIndexSize(offset, length, dst.length);
        if (remaining() < length) {
            throw new BufferUnderflowException();
        }
        int end = offset + length;
        for (int i = offset; i < end; i++) {
            dst[i] = get();
        }
    }

    public PointerBuffer put(long[] src) {
        return put(src, 0, src.length);
    }

    public PointerBuffer put(long[] src, int offset, int length) {
        if (BITS64) {
            org.lwjgl.system.MemoryUtil.memLongBuffer(address(), remaining()).put(src, offset, length);
            position(position() + length);
        } else {
            put32(src, offset, length);
        }
        return this;
    }

    private void put32(long[] src, int offset, int length) {
        CheckIntrinsics.checkFromIndexSize(offset, length, src.length);
        if (remaining() < length) {
            throw new BufferOverflowException();
        }
        int end = offset + length;
        for (int i = offset; i < end; i++) {
            put(src[i]);
        }
    }

    @Override // org.lwjgl.system.Pointer.Default
    public int hashCode() {
        int h = 1;
        int p = position();
        for (int i = limit() - 1; i >= p; i--) {
            h = (31 * h) + ((int) get(i));
        }
        return h;
    }

    @Override // org.lwjgl.system.Pointer.Default
    public boolean equals(Object ob) {
        if (!(ob instanceof PointerBuffer)) {
            return false;
        }
        PointerBuffer that = (PointerBuffer) ob;
        if (remaining() != that.remaining()) {
            return false;
        }
        int p = position();
        int i = limit() - 1;
        int j = that.limit() - 1;
        while (i >= p) {
            long v1 = get(i);
            long v2 = that.get(j);
            if (v1 == v2) {
                i--;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Comparable
    public int compareTo(PointerBuffer that) {
        int n = position() + Math.min(remaining(), that.remaining());
        int i = position();
        int j = that.position();
        while (i < n) {
            long v1 = get(i);
            long v2 = that.get(j);
            if (v1 != v2) {
                if (v1 < v2) {
                    return -1;
                }
                return 1;
            }
            i++;
            j++;
        }
        return remaining() - that.remaining();
    }
}
