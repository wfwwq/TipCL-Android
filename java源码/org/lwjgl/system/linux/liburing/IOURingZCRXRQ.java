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

@NativeType("struct io_uring_zcrx_rq")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXRQ.class */
public class IOURingZCRXRQ extends Struct<IOURingZCRXRQ> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int KHEAD;
    public static final int KTAIL;
    public static final int RQ_TAIL;
    public static final int RING_ENTRIES;
    public static final int RQES;
    public static final int RING_PTR;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        KHEAD = layout.offsetof(0);
        KTAIL = layout.offsetof(1);
        RQ_TAIL = layout.offsetof(2);
        RING_ENTRIES = layout.offsetof(3);
        RQES = layout.offsetof(4);
        RING_PTR = layout.offsetof(5);
    }

    protected IOURingZCRXRQ(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingZCRXRQ create(long address, ByteBuffer container) {
        return new IOURingZCRXRQ(address, container);
    }

    public IOURingZCRXRQ(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32 *")
    public IntBuffer khead(int capacity) {
        return nkhead(address(), capacity);
    }

    @NativeType("__u32 *")
    public IntBuffer ktail(int capacity) {
        return nktail(address(), capacity);
    }

    @NativeType("__u32")
    public int rq_tail() {
        return nrq_tail(address());
    }

    @NativeType("unsigned")
    public int ring_entries() {
        return nring_entries(address());
    }

    @NativeType("struct io_uring_zcrx_rqe *")
    public IOURingZCRXRQE rqes() {
        return nrqes(address());
    }

    @NativeType("void *")
    public long ring_ptr() {
        return nring_ptr(address());
    }

    public IOURingZCRXRQ khead(@NativeType("__u32 *") IntBuffer value) {
        nkhead(address(), value);
        return this;
    }

    public IOURingZCRXRQ ktail(@NativeType("__u32 *") IntBuffer value) {
        nktail(address(), value);
        return this;
    }

    public IOURingZCRXRQ rq_tail(@NativeType("__u32") int value) {
        nrq_tail(address(), value);
        return this;
    }

    public IOURingZCRXRQ ring_entries(@NativeType("unsigned") int value) {
        nring_entries(address(), value);
        return this;
    }

    public IOURingZCRXRQ rqes(@NativeType("struct io_uring_zcrx_rqe *") IOURingZCRXRQE value) {
        nrqes(address(), value);
        return this;
    }

    public IOURingZCRXRQ ring_ptr(@NativeType("void *") long value) {
        nring_ptr(address(), value);
        return this;
    }

    public IOURingZCRXRQ set(IntBuffer khead, IntBuffer ktail, int rq_tail, int ring_entries, IOURingZCRXRQE rqes, long ring_ptr) {
        khead(khead);
        ktail(ktail);
        rq_tail(rq_tail);
        ring_entries(ring_entries);
        rqes(rqes);
        ring_ptr(ring_ptr);
        return this;
    }

    public IOURingZCRXRQ set(IOURingZCRXRQ src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingZCRXRQ malloc() {
        return new IOURingZCRXRQ(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingZCRXRQ calloc() {
        return new IOURingZCRXRQ(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingZCRXRQ create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXRQ(MemoryUtil.memAddress(container), container);
    }

    public static IOURingZCRXRQ create(long address) {
        return new IOURingZCRXRQ(address, null);
    }

    public static IOURingZCRXRQ createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingZCRXRQ(address, null);
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

    public static IOURingZCRXRQ malloc(MemoryStack stack) {
        return new IOURingZCRXRQ(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingZCRXRQ calloc(MemoryStack stack) {
        return new IOURingZCRXRQ(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrq_tail(long struct) {
        return MemoryUtil.memGetInt(struct + RQ_TAIL);
    }

    public static int nring_entries(long struct) {
        return MemoryUtil.memGetInt(struct + RING_ENTRIES);
    }

    public static IOURingZCRXRQE nrqes(long struct) {
        return IOURingZCRXRQE.create(MemoryUtil.memGetAddress(struct + RQES));
    }

    public static long nring_ptr(long struct) {
        return MemoryUtil.memGetAddress(struct + RING_PTR);
    }

    public static void nkhead(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + KHEAD, MemoryUtil.memAddress(value));
    }

    public static void nktail(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + KTAIL, MemoryUtil.memAddress(value));
    }

    public static void nrq_tail(long struct, int value) {
        MemoryUtil.memPutInt(struct + RQ_TAIL, value);
    }

    public static void nring_entries(long struct, int value) {
        MemoryUtil.memPutInt(struct + RING_ENTRIES, value);
    }

    public static void nrqes(long struct, IOURingZCRXRQE value) {
        MemoryUtil.memPutAddress(struct + RQES, value.address());
    }

    public static void nring_ptr(long struct, long value) {
        MemoryUtil.memPutAddress(struct + RING_PTR, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + KHEAD));
        Checks.check(MemoryUtil.memGetAddress(struct + KTAIL));
        Checks.check(MemoryUtil.memGetAddress(struct + RQES));
        Checks.check(MemoryUtil.memGetAddress(struct + RING_PTR));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXRQ$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingZCRXRQ, Buffer> implements NativeResource {
        private static final IOURingZCRXRQ ELEMENT_FACTORY = IOURingZCRXRQ.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingZCRXRQ.SIZEOF);
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
        public IOURingZCRXRQ getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32 *")
        public IntBuffer khead(int capacity) {
            return IOURingZCRXRQ.nkhead(address(), capacity);
        }

        @NativeType("__u32 *")
        public IntBuffer ktail(int capacity) {
            return IOURingZCRXRQ.nktail(address(), capacity);
        }

        @NativeType("__u32")
        public int rq_tail() {
            return IOURingZCRXRQ.nrq_tail(address());
        }

        @NativeType("unsigned")
        public int ring_entries() {
            return IOURingZCRXRQ.nring_entries(address());
        }

        @NativeType("struct io_uring_zcrx_rqe *")
        public IOURingZCRXRQE rqes() {
            return IOURingZCRXRQ.nrqes(address());
        }

        @NativeType("void *")
        public long ring_ptr() {
            return IOURingZCRXRQ.nring_ptr(address());
        }

        public Buffer khead(@NativeType("__u32 *") IntBuffer value) {
            IOURingZCRXRQ.nkhead(address(), value);
            return this;
        }

        public Buffer ktail(@NativeType("__u32 *") IntBuffer value) {
            IOURingZCRXRQ.nktail(address(), value);
            return this;
        }

        public Buffer rq_tail(@NativeType("__u32") int value) {
            IOURingZCRXRQ.nrq_tail(address(), value);
            return this;
        }

        public Buffer ring_entries(@NativeType("unsigned") int value) {
            IOURingZCRXRQ.nring_entries(address(), value);
            return this;
        }

        public Buffer rqes(@NativeType("struct io_uring_zcrx_rqe *") IOURingZCRXRQE value) {
            IOURingZCRXRQ.nrqes(address(), value);
            return this;
        }

        public Buffer ring_ptr(@NativeType("void *") long value) {
            IOURingZCRXRQ.nring_ptr(address(), value);
            return this;
        }
    }
}
