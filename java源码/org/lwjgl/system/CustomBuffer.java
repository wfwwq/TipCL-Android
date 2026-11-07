package org.lwjgl.system;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.Pointer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/CustomBuffer.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/CustomBuffer.class */
public abstract class CustomBuffer<SELF extends CustomBuffer<SELF>> extends Pointer.Default {
    protected ByteBuffer container;
    protected int mark;
    protected int position;
    protected int limit;
    protected int capacity;

    public abstract int sizeof();

    protected abstract SELF self();

    protected abstract SELF create(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    protected CustomBuffer(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
        super(address);
        this.container = container;
        this.mark = mark;
        this.position = position;
        this.limit = limit;
        this.capacity = capacity;
    }

    public long address0() {
        return this.address;
    }

    @Override // org.lwjgl.system.Pointer.Default, org.lwjgl.system.Pointer
    public long address() {
        return this.address + (Integer.toUnsignedLong(this.position) * sizeof());
    }

    public long address(int position) {
        return this.address + (Integer.toUnsignedLong(position) * sizeof());
    }

    public void free() {
        MemoryUtil.nmemFree(this.address);
    }

    public int capacity() {
        return this.capacity;
    }

    public int position() {
        return this.position;
    }

    public SELF position(int i) {
        if (i < 0 || this.limit < i) {
            throw new IllegalArgumentException();
        }
        this.position = i;
        if (i < this.mark) {
            this.mark = -1;
        }
        return (SELF) self();
    }

    public int limit() {
        return this.limit;
    }

    public SELF limit(int i) {
        if (i < 0 || this.capacity < i) {
            throw new IllegalArgumentException();
        }
        this.limit = i;
        if (i < this.position) {
            this.position = i;
        }
        if (i < this.mark) {
            this.mark = -1;
        }
        return (SELF) self();
    }

    public SELF mark() {
        this.mark = this.position;
        return (SELF) self();
    }

    public SELF reset() {
        int i = this.mark;
        if (i < 0) {
            throw new InvalidMarkException();
        }
        this.position = i;
        return (SELF) self();
    }

    public SELF clear() {
        this.position = 0;
        this.limit = this.capacity;
        this.mark = -1;
        return (SELF) self();
    }

    public SELF flip() {
        this.limit = this.position;
        this.position = 0;
        this.mark = -1;
        return (SELF) self();
    }

    public SELF rewind() {
        this.position = 0;
        this.mark = -1;
        return (SELF) self();
    }

    public int remaining() {
        return this.limit - this.position;
    }

    public boolean hasRemaining() {
        return this.position < this.limit;
    }

    public SELF slice() {
        return (SELF) create(this.address + (Integer.toUnsignedLong(this.position) * sizeof()), this.container, -1, 0, remaining(), remaining());
    }

    public SELF slice(int i, int i2) {
        int i3 = this.position + i;
        if (i < 0 || this.limit < i) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || this.capacity - i3 < i2) {
            throw new IllegalArgumentException();
        }
        return (SELF) create(this.address + (Integer.toUnsignedLong(i3) * sizeof()), this.container, -1, 0, i2, i2);
    }

    public SELF duplicate() {
        return (SELF) create(this.address, this.container, this.mark, this.position, this.limit, this.capacity);
    }

    public SELF put(SELF self) {
        if (self == this) {
            throw new IllegalArgumentException();
        }
        int iRemaining = self.remaining();
        if (remaining() < iRemaining) {
            throw new BufferOverflowException();
        }
        MemoryUtil.memCopy(self.address(), address(), Integer.toUnsignedLong(iRemaining) * sizeof());
        this.position += iRemaining;
        return (SELF) self();
    }

    public SELF compact() {
        MemoryUtil.memCopy(address(), this.address, Integer.toUnsignedLong(remaining()) * sizeof());
        position(remaining());
        limit(capacity());
        this.mark = -1;
        return (SELF) self();
    }

    @Override // org.lwjgl.system.Pointer.Default
    public String toString() {
        return getClass().getName() + "[pos=" + position() + " lim=" + limit() + " cap=" + capacity() + "]";
    }

    protected final int nextGetIndex() {
        if (this.position < this.limit) {
            int i = this.position;
            this.position = i + 1;
            return i;
        }
        throw new BufferUnderflowException();
    }

    protected final int nextPutIndex() {
        if (this.position < this.limit) {
            int i = this.position;
            this.position = i + 1;
            return i;
        }
        throw new BufferOverflowException();
    }
}
