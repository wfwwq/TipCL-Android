package org.lwjgl;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.lwjgl.system.CheckIntrinsics;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/CLongBuffer.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/CLongBuffer.class */
public class CLongBuffer extends CustomBuffer<CLongBuffer> implements Comparable<CLongBuffer> {
    protected CLongBuffer(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
        super(address, container, mark, position, limit, capacity);
    }

    public static CLongBuffer allocateDirect(int capacity) {
        ByteBuffer source = BufferUtils.createByteBuffer(BufferUtils.getAllocationSize(capacity, CLONG_SHIFT));
        return new CLongBuffer(org.lwjgl.system.MemoryUtil.memAddress(source), source, -1, 0, capacity, capacity);
    }

    public static CLongBuffer create(long address, int capacity) {
        return new CLongBuffer(address, null, -1, 0, capacity, capacity);
    }

    public static CLongBuffer create(ByteBuffer source) {
        int capacity = source.remaining() >> CLONG_SHIFT;
        return new CLongBuffer(org.lwjgl.system.MemoryUtil.memAddress(source), source, -1, 0, capacity, capacity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.CustomBuffer
    public CLongBuffer self() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.CustomBuffer
    public CLongBuffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
        return new CLongBuffer(address, container, mark, position, limit, capacity);
    }

    @Override // org.lwjgl.system.CustomBuffer
    public int sizeof() {
        return CLONG_SIZE;
    }

    public long get() {
        return org.lwjgl.system.MemoryUtil.memGetCLong(this.address + (Integer.toUnsignedLong(nextGetIndex()) * CLONG_SIZE));
    }

    public static long get(ByteBuffer source) {
        if (source.remaining() < CLONG_SIZE) {
            throw new BufferUnderflowException();
        }
        try {
            return org.lwjgl.system.MemoryUtil.memGetCLong(org.lwjgl.system.MemoryUtil.memAddress(source));
        } finally {
            source.position(source.position() + CLONG_SIZE);
        }
    }

    public CLongBuffer put(long p) {
        org.lwjgl.system.MemoryUtil.memPutCLong(this.address + (Integer.toUnsignedLong(nextPutIndex()) * CLONG_SIZE), p);
        return this;
    }

    public static void put(ByteBuffer target, long p) {
        if (target.remaining() < CLONG_SIZE) {
            throw new BufferOverflowException();
        }
        try {
            org.lwjgl.system.MemoryUtil.memPutCLong(org.lwjgl.system.MemoryUtil.memAddress(target), p);
        } finally {
            target.position(target.position() + CLONG_SIZE);
        }
    }

    public long get(int index) {
        return org.lwjgl.system.MemoryUtil.memGetCLong(this.address + (Checks.check(index, this.limit) * CLONG_SIZE));
    }

    public static long get(ByteBuffer source, int index) {
        CheckIntrinsics.checkFromIndexSize(index, CLONG_SIZE, source.limit());
        return org.lwjgl.system.MemoryUtil.memGetCLong(org.lwjgl.system.MemoryUtil.memAddress0(source) + index);
    }

    public CLongBuffer put(int index, long p) {
        org.lwjgl.system.MemoryUtil.memPutCLong(this.address + (Checks.check(index, this.limit) * CLONG_SIZE), p);
        return this;
    }

    public static void put(ByteBuffer target, int index, long p) {
        CheckIntrinsics.checkFromIndexSize(index, CLONG_SIZE, target.limit());
        org.lwjgl.system.MemoryUtil.memPutCLong(org.lwjgl.system.MemoryUtil.memAddress0(target) + index, p);
    }

    public CLongBuffer get(long[] dst) {
        return get(dst, 0, dst.length);
    }

    public CLongBuffer get(long[] dst, int offset, int length) {
        if (CLONG_SIZE == 8) {
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

    public CLongBuffer put(long[] src) {
        return put(src, 0, src.length);
    }

    public CLongBuffer put(long[] src, int offset, int length) {
        if (CLONG_SIZE == 8) {
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
        if (!(ob instanceof CLongBuffer)) {
            return false;
        }
        CLongBuffer that = (CLongBuffer) ob;
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
    public int compareTo(CLongBuffer that) {
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
