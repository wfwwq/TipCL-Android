package org.lwjgl.system;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/StructBuffer.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/StructBuffer.class */
public abstract class StructBuffer<T extends Struct<T>, SELF extends StructBuffer<T, SELF>> extends CustomBuffer<SELF> implements Iterable<T> {
    protected abstract T getElementFactory();

    protected StructBuffer(ByteBuffer container, int remaining) {
        super(MemoryUtil.memAddress(container), container, -1, 0, remaining, remaining);
    }

    protected StructBuffer(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
        super(address, container, mark, position, limit, capacity);
    }

    @Override // org.lwjgl.system.CustomBuffer
    public int sizeof() {
        return getElementFactory().sizeof();
    }

    public T get() {
        return (T) getElementFactory().create(this.address + (Integer.toUnsignedLong(nextGetIndex()) * r0.sizeof()), this.container);
    }

    public SELF get(T value) {
        int sizeof = getElementFactory().sizeof();
        MemoryUtil.memCopy(this.address + (Integer.toUnsignedLong(nextGetIndex()) * sizeof), value.address(), sizeof);
        return self();
    }

    public SELF put(T value) {
        int sizeof = getElementFactory().sizeof();
        MemoryUtil.memCopy(value.address(), this.address + (Integer.toUnsignedLong(nextPutIndex()) * sizeof), sizeof);
        return self();
    }

    public T get(int i) {
        return (T) getElementFactory().create(this.address + (Integer.toUnsignedLong(check(i, this.limit)) * r0.sizeof()), this.container);
    }

    public SELF get(int index, T value) {
        int sizeof = getElementFactory().sizeof();
        MemoryUtil.memCopy(this.address + (Checks.check(index, this.limit) * sizeof), value.address(), sizeof);
        return self();
    }

    public SELF put(int index, T value) {
        int sizeof = getElementFactory().sizeof();
        MemoryUtil.memCopy(value.address(), this.address + (Checks.check(index, this.limit) * sizeof), sizeof);
        return self();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SELF apply(Consumer<T> consumer) {
        consumer.accept(get());
        return self();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SELF apply(int index, Consumer<T> consumer) {
        consumer.accept(get(index));
        return self();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new StructIterator(this.address, this.container, getElementFactory(), this.position, this.limit);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/StructBuffer$StructIterator.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/StructBuffer$StructIterator.class */
    private static class StructIterator<T extends Struct<T>> implements Iterator<T> {
        private long address;
        private ByteBuffer container;
        private T factory;
        private int index;
        private int fence;

        StructIterator(long address, ByteBuffer container, T factory, int position, int limit) {
            this.address = address;
            this.container = container;
            this.factory = factory;
            this.index = position;
            this.fence = limit;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.fence;
        }

        @Override // java.util.Iterator
        public T next() {
            if (Checks.CHECKS && this.fence <= this.index) {
                throw new NoSuchElementException();
            }
            T t = this.factory;
            long j = this.address;
            int i = this.index;
            this.index = i + 1;
            return (T) t.create(j + (Integer.toUnsignedLong(i) * this.factory.sizeof()), this.container);
        }

        @Override // java.util.Iterator
        public void forEachRemaining(Consumer<? super T> action) {
            Objects.requireNonNull(action);
            int i = this.index;
            try {
                int sizeof = this.factory.sizeof();
                while (i < this.fence) {
                    action.accept(this.factory.create(this.address + (Integer.toUnsignedLong(i) * sizeof), this.container));
                    i++;
                }
            } finally {
                this.index = i;
            }
        }
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        Struct elementFactory = getElementFactory();
        int fence = this.limit;
        elementFactory.sizeof();
        for (int i = this.position; i < fence; i++) {
            action.accept(elementFactory.create(this.address + (Integer.toUnsignedLong(i) * sizeof()), this.container));
        }
    }

    @Override // java.lang.Iterable
    public Spliterator<T> spliterator() {
        return new StructSpliterator(this.address, this.container, getElementFactory(), this.position, this.limit);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/StructBuffer$StructSpliterator.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/StructBuffer$StructSpliterator.class */
    private static class StructSpliterator<T extends Struct<T>> implements Spliterator<T> {
        private long address;
        private ByteBuffer container;
        private T factory;
        private int index;
        private int fence;

        StructSpliterator(long address, ByteBuffer container, T factory, int position, int limit) {
            this.address = address;
            this.container = container;
            this.factory = factory;
            this.index = position;
            this.fence = limit;
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super T> action) {
            Objects.requireNonNull(action);
            if (this.index < this.fence) {
                T t = this.factory;
                long j = this.address;
                int i = this.index;
                this.index = i + 1;
                action.accept(t.create(j + (Integer.toUnsignedLong(i) * this.factory.sizeof()), this.container));
                return true;
            }
            return false;
        }

        @Override // java.util.Spliterator
        public Spliterator<T> trySplit() {
            int lo = this.index;
            int mid = (lo + this.fence) >>> 1;
            if (lo < mid) {
                long j = this.address;
                ByteBuffer byteBuffer = this.container;
                T t = this.factory;
                this.index = mid;
                return new StructSpliterator(j, byteBuffer, t, lo, mid);
            }
            return null;
        }

        @Override // java.util.Spliterator
        public long estimateSize() {
            return this.fence - this.index;
        }

        @Override // java.util.Spliterator
        public int characteristics() {
            return 17744;
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(Consumer<? super T> action) {
            Objects.requireNonNull(action);
            int i = this.index;
            try {
                int sizeof = this.factory.sizeof();
                while (i < this.fence) {
                    action.accept(this.factory.create(this.address + (Integer.toUnsignedLong(i) * sizeof), this.container));
                    i++;
                }
            } finally {
                this.index = i;
            }
        }

        @Override // java.util.Spliterator
        public Comparator<? super T> getComparator() {
            throw new IllegalStateException();
        }
    }

    public Stream<T> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    public Stream<T> parallelStream() {
        return StreamSupport.stream(spliterator(), true);
    }

    private static int check(int index, int length) {
        if (Checks.CHECKS && (index < 0 || length <= index)) {
            throw new IndexOutOfBoundsException();
        }
        return index;
    }
}
