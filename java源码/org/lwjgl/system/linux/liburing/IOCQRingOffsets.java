package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOCQRingOffsets.class
 */
@NativeType("struct io_cqring_offsets")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOCQRingOffsets.class */
public class IOCQRingOffsets extends Struct<IOCQRingOffsets> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEAD;
    public static final int TAIL;
    public static final int RING_MASK;
    public static final int RING_ENTRIES;
    public static final int OVERFLOW;
    public static final int CQES;
    public static final int FLAGS;
    public static final int RESV1;
    public static final int USER_ADDR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEAD = layout.offsetof(0);
        TAIL = layout.offsetof(1);
        RING_MASK = layout.offsetof(2);
        RING_ENTRIES = layout.offsetof(3);
        OVERFLOW = layout.offsetof(4);
        CQES = layout.offsetof(5);
        FLAGS = layout.offsetof(6);
        RESV1 = layout.offsetof(7);
        USER_ADDR = layout.offsetof(8);
    }

    protected IOCQRingOffsets(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOCQRingOffsets create(long address, ByteBuffer container) {
        return new IOCQRingOffsets(address, container);
    }

    public IOCQRingOffsets(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int head() {
        return nhead(address());
    }

    @NativeType("__u32")
    public int tail() {
        return ntail(address());
    }

    @NativeType("__u32")
    public int ring_mask() {
        return nring_mask(address());
    }

    @NativeType("__u32")
    public int ring_entries() {
        return nring_entries(address());
    }

    @NativeType("__u32")
    public int overflow() {
        return noverflow(address());
    }

    @NativeType("__u32")
    public int cqes() {
        return ncqes(address());
    }

    @NativeType("__u32")
    public int flags() {
        return nflags(address());
    }

    @NativeType("__u64")
    public long user_addr() {
        return nuser_addr(address());
    }

    public IOCQRingOffsets head(@NativeType("__u32") int value) {
        nhead(address(), value);
        return this;
    }

    public IOCQRingOffsets tail(@NativeType("__u32") int value) {
        ntail(address(), value);
        return this;
    }

    public IOCQRingOffsets ring_mask(@NativeType("__u32") int value) {
        nring_mask(address(), value);
        return this;
    }

    public IOCQRingOffsets ring_entries(@NativeType("__u32") int value) {
        nring_entries(address(), value);
        return this;
    }

    public IOCQRingOffsets overflow(@NativeType("__u32") int value) {
        noverflow(address(), value);
        return this;
    }

    public IOCQRingOffsets cqes(@NativeType("__u32") int value) {
        ncqes(address(), value);
        return this;
    }

    public IOCQRingOffsets flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOCQRingOffsets user_addr(@NativeType("__u64") long value) {
        nuser_addr(address(), value);
        return this;
    }

    public IOCQRingOffsets set(int head, int tail, int ring_mask, int ring_entries, int overflow, int cqes, int flags, long user_addr) {
        head(head);
        tail(tail);
        ring_mask(ring_mask);
        ring_entries(ring_entries);
        overflow(overflow);
        cqes(cqes);
        flags(flags);
        user_addr(user_addr);
        return this;
    }

    public IOCQRingOffsets set(IOCQRingOffsets src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOCQRingOffsets malloc() {
        return new IOCQRingOffsets(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOCQRingOffsets calloc() {
        return new IOCQRingOffsets(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOCQRingOffsets create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOCQRingOffsets(MemoryUtil.memAddress(container), container);
    }

    public static IOCQRingOffsets create(long address) {
        return new IOCQRingOffsets(address, null);
    }

    public static IOCQRingOffsets createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOCQRingOffsets(address, null);
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

    public static IOCQRingOffsets malloc(MemoryStack stack) {
        return new IOCQRingOffsets(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOCQRingOffsets calloc(MemoryStack stack) {
        return new IOCQRingOffsets(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nhead(long struct) {
        return MemoryUtil.memGetInt(struct + HEAD);
    }

    public static int ntail(long struct) {
        return MemoryUtil.memGetInt(struct + TAIL);
    }

    public static int nring_mask(long struct) {
        return MemoryUtil.memGetInt(struct + RING_MASK);
    }

    public static int nring_entries(long struct) {
        return MemoryUtil.memGetInt(struct + RING_ENTRIES);
    }

    public static int noverflow(long struct) {
        return MemoryUtil.memGetInt(struct + OVERFLOW);
    }

    public static int ncqes(long struct) {
        return MemoryUtil.memGetInt(struct + CQES);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nresv1(long struct) {
        return MemoryUtil.memGetInt(struct + RESV1);
    }

    public static long nuser_addr(long struct) {
        return MemoryUtil.memGetLong(struct + USER_ADDR);
    }

    public static void nhead(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEAD, value);
    }

    public static void ntail(long struct, int value) {
        MemoryUtil.memPutInt(struct + TAIL, value);
    }

    public static void nring_mask(long struct, int value) {
        MemoryUtil.memPutInt(struct + RING_MASK, value);
    }

    public static void nring_entries(long struct, int value) {
        MemoryUtil.memPutInt(struct + RING_ENTRIES, value);
    }

    public static void noverflow(long struct, int value) {
        MemoryUtil.memPutInt(struct + OVERFLOW, value);
    }

    public static void ncqes(long struct, int value) {
        MemoryUtil.memPutInt(struct + CQES, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nresv1(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESV1, value);
    }

    public static void nuser_addr(long struct, long value) {
        MemoryUtil.memPutLong(struct + USER_ADDR, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOCQRingOffsets$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOCQRingOffsets$Buffer.class */
    public static class Buffer extends StructBuffer<IOCQRingOffsets, Buffer> implements NativeResource {
        private static final IOCQRingOffsets ELEMENT_FACTORY = IOCQRingOffsets.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOCQRingOffsets.SIZEOF);
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
        public IOCQRingOffsets getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int head() {
            return IOCQRingOffsets.nhead(address());
        }

        @NativeType("__u32")
        public int tail() {
            return IOCQRingOffsets.ntail(address());
        }

        @NativeType("__u32")
        public int ring_mask() {
            return IOCQRingOffsets.nring_mask(address());
        }

        @NativeType("__u32")
        public int ring_entries() {
            return IOCQRingOffsets.nring_entries(address());
        }

        @NativeType("__u32")
        public int overflow() {
            return IOCQRingOffsets.noverflow(address());
        }

        @NativeType("__u32")
        public int cqes() {
            return IOCQRingOffsets.ncqes(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOCQRingOffsets.nflags(address());
        }

        @NativeType("__u64")
        public long user_addr() {
            return IOCQRingOffsets.nuser_addr(address());
        }

        public Buffer head(@NativeType("__u32") int value) {
            IOCQRingOffsets.nhead(address(), value);
            return this;
        }

        public Buffer tail(@NativeType("__u32") int value) {
            IOCQRingOffsets.ntail(address(), value);
            return this;
        }

        public Buffer ring_mask(@NativeType("__u32") int value) {
            IOCQRingOffsets.nring_mask(address(), value);
            return this;
        }

        public Buffer ring_entries(@NativeType("__u32") int value) {
            IOCQRingOffsets.nring_entries(address(), value);
            return this;
        }

        public Buffer overflow(@NativeType("__u32") int value) {
            IOCQRingOffsets.noverflow(address(), value);
            return this;
        }

        public Buffer cqes(@NativeType("__u32") int value) {
            IOCQRingOffsets.ncqes(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOCQRingOffsets.nflags(address(), value);
            return this;
        }

        public Buffer user_addr(@NativeType("__u64") long value) {
            IOCQRingOffsets.nuser_addr(address(), value);
            return this;
        }
    }
}
