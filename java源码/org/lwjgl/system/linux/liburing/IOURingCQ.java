package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingCQ.class
 */
@NativeType("struct io_uring_cq")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingCQ.class */
public class IOURingCQ extends Struct<IOURingCQ> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int KHEAD;
    public static final int KTAIL;
    public static final int KRING_MASK;
    public static final int KRING_ENTRIES;
    public static final int KFLAGS;
    public static final int KOVERFLOW;
    public static final int CQES;
    public static final int RING_SZ;
    public static final int RING_PTR;
    public static final int RING_MASK;
    public static final int RING_ENTRIES;
    public static final int PAD;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __array(4, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        KHEAD = layout.offsetof(0);
        KTAIL = layout.offsetof(1);
        KRING_MASK = layout.offsetof(2);
        KRING_ENTRIES = layout.offsetof(3);
        KFLAGS = layout.offsetof(4);
        KOVERFLOW = layout.offsetof(5);
        CQES = layout.offsetof(6);
        RING_SZ = layout.offsetof(7);
        RING_PTR = layout.offsetof(8);
        RING_MASK = layout.offsetof(9);
        RING_ENTRIES = layout.offsetof(10);
        PAD = layout.offsetof(11);
    }

    protected IOURingCQ(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingCQ create(long address, ByteBuffer container) {
        return new IOURingCQ(address, container);
    }

    public IOURingCQ(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned *")
    public IntBuffer khead(int capacity) {
        return nkhead(address(), capacity);
    }

    @NativeType("unsigned *")
    public IntBuffer ktail(int capacity) {
        return nktail(address(), capacity);
    }

    @NativeType("unsigned *")
    public IntBuffer kring_mask(int capacity) {
        return nkring_mask(address(), capacity);
    }

    @NativeType("unsigned *")
    public IntBuffer kring_entries(int capacity) {
        return nkring_entries(address(), capacity);
    }

    @NativeType("unsigned *")
    public IntBuffer kflags(int capacity) {
        return nkflags(address(), capacity);
    }

    @NativeType("unsigned *")
    public IntBuffer koverflow(int capacity) {
        return nkoverflow(address(), capacity);
    }

    @NativeType("struct io_uring_cqe *")
    public IOURingCQE cqes() {
        return ncqes(address());
    }

    @NativeType("size_t")
    public long ring_sz() {
        return nring_sz(address());
    }

    @NativeType("void *")
    public ByteBuffer ring_ptr() {
        return nring_ptr(address());
    }

    @NativeType("unsigned")
    public int ring_mask() {
        return nring_mask(address());
    }

    @NativeType("unsigned")
    public int ring_entries() {
        return nring_entries(address());
    }

    public IOURingCQ khead(@NativeType("unsigned *") IntBuffer value) {
        nkhead(address(), value);
        return this;
    }

    public IOURingCQ ktail(@NativeType("unsigned *") IntBuffer value) {
        nktail(address(), value);
        return this;
    }

    public IOURingCQ kring_mask(@NativeType("unsigned *") IntBuffer value) {
        nkring_mask(address(), value);
        return this;
    }

    public IOURingCQ kring_entries(@NativeType("unsigned *") IntBuffer value) {
        nkring_entries(address(), value);
        return this;
    }

    public IOURingCQ kflags(@NativeType("unsigned *") IntBuffer value) {
        nkflags(address(), value);
        return this;
    }

    public IOURingCQ koverflow(@NativeType("unsigned *") IntBuffer value) {
        nkoverflow(address(), value);
        return this;
    }

    public IOURingCQ cqes(@NativeType("struct io_uring_cqe *") IOURingCQE value) {
        ncqes(address(), value);
        return this;
    }

    public IOURingCQ ring_ptr(@NativeType("void *") ByteBuffer value) {
        nring_ptr(address(), value);
        return this;
    }

    public IOURingCQ ring_mask(@NativeType("unsigned") int value) {
        nring_mask(address(), value);
        return this;
    }

    public IOURingCQ ring_entries(@NativeType("unsigned") int value) {
        nring_entries(address(), value);
        return this;
    }

    public IOURingCQ set(IntBuffer khead, IntBuffer ktail, IntBuffer kring_mask, IntBuffer kring_entries, IntBuffer kflags, IntBuffer koverflow, IOURingCQE cqes, ByteBuffer ring_ptr, int ring_mask, int ring_entries) {
        khead(khead);
        ktail(ktail);
        kring_mask(kring_mask);
        kring_entries(kring_entries);
        kflags(kflags);
        koverflow(koverflow);
        cqes(cqes);
        ring_ptr(ring_ptr);
        ring_mask(ring_mask);
        ring_entries(ring_entries);
        return this;
    }

    public IOURingCQ set(IOURingCQ src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingCQ malloc() {
        return new IOURingCQ(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingCQ calloc() {
        return new IOURingCQ(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingCQ create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingCQ(MemoryUtil.memAddress(container), container);
    }

    public static IOURingCQ create(long address) {
        return new IOURingCQ(address, null);
    }

    public static IOURingCQ createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingCQ(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static IOURingCQ malloc(MemoryStack stack) {
        return new IOURingCQ(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingCQ calloc(MemoryStack stack) {
        return new IOURingCQ(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static IntBuffer nkhead(long struct, int capacity) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + KHEAD), capacity);
    }

    public static IntBuffer nktail(long struct, int capacity) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + KTAIL), capacity);
    }

    public static IntBuffer nkring_mask(long struct, int capacity) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + KRING_MASK), capacity);
    }

    public static IntBuffer nkring_entries(long struct, int capacity) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + KRING_ENTRIES), capacity);
    }

    public static IntBuffer nkflags(long struct, int capacity) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + KFLAGS), capacity);
    }

    public static IntBuffer nkoverflow(long struct, int capacity) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + KOVERFLOW), capacity);
    }

    public static IOURingCQE ncqes(long struct) {
        return IOURingCQE.create(MemoryUtil.memGetAddress(struct + CQES));
    }

    public static long nring_sz(long struct) {
        return MemoryUtil.memGetAddress(struct + RING_SZ);
    }

    public static ByteBuffer nring_ptr(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + RING_PTR), (int) nring_sz(struct));
    }

    public static int nring_mask(long struct) {
        return MemoryUtil.memGetInt(struct + RING_MASK);
    }

    public static int nring_entries(long struct) {
        return MemoryUtil.memGetInt(struct + RING_ENTRIES);
    }

    public static IntBuffer npad(long struct) {
        return MemoryUtil.memIntBuffer(struct + PAD, 2);
    }

    public static int npad(long struct, int index) {
        return MemoryUtil.memGetInt(struct + PAD + (Checks.check(index, 2) * 4));
    }

    public static void nkhead(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + KHEAD, MemoryUtil.memAddress(value));
    }

    public static void nktail(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + KTAIL, MemoryUtil.memAddress(value));
    }

    public static void nkring_mask(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + KRING_MASK, MemoryUtil.memAddress(value));
    }

    public static void nkring_entries(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + KRING_ENTRIES, MemoryUtil.memAddress(value));
    }

    public static void nkflags(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + KFLAGS, MemoryUtil.memAddress(value));
    }

    public static void nkoverflow(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + KOVERFLOW, MemoryUtil.memAddress(value));
    }

    public static void ncqes(long struct, IOURingCQE value) {
        MemoryUtil.memPutAddress(struct + CQES, value.address());
    }

    public static void nring_sz(long struct, long value) {
        MemoryUtil.memPutAddress(struct + RING_SZ, value);
    }

    public static void nring_ptr(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + RING_PTR, MemoryUtil.memAddress(value));
        nring_sz(struct, value.remaining());
    }

    public static void nring_mask(long struct, int value) {
        MemoryUtil.memPutInt(struct + RING_MASK, value);
    }

    public static void nring_entries(long struct, int value) {
        MemoryUtil.memPutInt(struct + RING_ENTRIES, value);
    }

    public static void npad(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PAD, value.remaining() * 4);
    }

    public static void npad(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + PAD + (Checks.check(index, 2) * 4), value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + KHEAD));
        Checks.check(MemoryUtil.memGetAddress(struct + KTAIL));
        Checks.check(MemoryUtil.memGetAddress(struct + KRING_MASK));
        Checks.check(MemoryUtil.memGetAddress(struct + KRING_ENTRIES));
        Checks.check(MemoryUtil.memGetAddress(struct + KFLAGS));
        Checks.check(MemoryUtil.memGetAddress(struct + KOVERFLOW));
        Checks.check(MemoryUtil.memGetAddress(struct + CQES));
        Checks.check(MemoryUtil.memGetAddress(struct + RING_PTR));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingCQ$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingCQ$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingCQ, Buffer> implements NativeResource {
        private static final IOURingCQ ELEMENT_FACTORY = IOURingCQ.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingCQ.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public IOURingCQ getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned *")
        public IntBuffer khead(int capacity) {
            return IOURingCQ.nkhead(address(), capacity);
        }

        @NativeType("unsigned *")
        public IntBuffer ktail(int capacity) {
            return IOURingCQ.nktail(address(), capacity);
        }

        @NativeType("unsigned *")
        public IntBuffer kring_mask(int capacity) {
            return IOURingCQ.nkring_mask(address(), capacity);
        }

        @NativeType("unsigned *")
        public IntBuffer kring_entries(int capacity) {
            return IOURingCQ.nkring_entries(address(), capacity);
        }

        @NativeType("unsigned *")
        public IntBuffer kflags(int capacity) {
            return IOURingCQ.nkflags(address(), capacity);
        }

        @NativeType("unsigned *")
        public IntBuffer koverflow(int capacity) {
            return IOURingCQ.nkoverflow(address(), capacity);
        }

        @NativeType("struct io_uring_cqe *")
        public IOURingCQE cqes() {
            return IOURingCQ.ncqes(address());
        }

        @NativeType("size_t")
        public long ring_sz() {
            return IOURingCQ.nring_sz(address());
        }

        @NativeType("void *")
        public ByteBuffer ring_ptr() {
            return IOURingCQ.nring_ptr(address());
        }

        @NativeType("unsigned")
        public int ring_mask() {
            return IOURingCQ.nring_mask(address());
        }

        @NativeType("unsigned")
        public int ring_entries() {
            return IOURingCQ.nring_entries(address());
        }

        public Buffer khead(@NativeType("unsigned *") IntBuffer value) {
            IOURingCQ.nkhead(address(), value);
            return this;
        }

        public Buffer ktail(@NativeType("unsigned *") IntBuffer value) {
            IOURingCQ.nktail(address(), value);
            return this;
        }

        public Buffer kring_mask(@NativeType("unsigned *") IntBuffer value) {
            IOURingCQ.nkring_mask(address(), value);
            return this;
        }

        public Buffer kring_entries(@NativeType("unsigned *") IntBuffer value) {
            IOURingCQ.nkring_entries(address(), value);
            return this;
        }

        public Buffer kflags(@NativeType("unsigned *") IntBuffer value) {
            IOURingCQ.nkflags(address(), value);
            return this;
        }

        public Buffer koverflow(@NativeType("unsigned *") IntBuffer value) {
            IOURingCQ.nkoverflow(address(), value);
            return this;
        }

        public Buffer cqes(@NativeType("struct io_uring_cqe *") IOURingCQE value) {
            IOURingCQ.ncqes(address(), value);
            return this;
        }

        public Buffer ring_ptr(@NativeType("void *") ByteBuffer value) {
            IOURingCQ.nring_ptr(address(), value);
            return this;
        }

        public Buffer ring_mask(@NativeType("unsigned") int value) {
            IOURingCQ.nring_mask(address(), value);
            return this;
        }

        public Buffer ring_entries(@NativeType("unsigned") int value) {
            IOURingCQ.nring_entries(address(), value);
            return this;
        }
    }
}
