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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOSQRingOffsets.class
 */
@NativeType("struct io_sqring_offsets")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOSQRingOffsets.class */
public class IOSQRingOffsets extends Struct<IOSQRingOffsets> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEAD;
    public static final int TAIL;
    public static final int RING_MASK;
    public static final int RING_ENTRIES;
    public static final int FLAGS;
    public static final int DROPPED;
    public static final int ARRAY;
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
        FLAGS = layout.offsetof(4);
        DROPPED = layout.offsetof(5);
        ARRAY = layout.offsetof(6);
        RESV1 = layout.offsetof(7);
        USER_ADDR = layout.offsetof(8);
    }

    protected IOSQRingOffsets(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOSQRingOffsets create(long address, ByteBuffer container) {
        return new IOSQRingOffsets(address, container);
    }

    public IOSQRingOffsets(ByteBuffer container) {
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
    public int flags() {
        return nflags(address());
    }

    @NativeType("__u32")
    public int dropped() {
        return ndropped(address());
    }

    @NativeType("__u32")
    public int array() {
        return narray(address());
    }

    @NativeType("__u64")
    public long user_addr() {
        return nuser_addr(address());
    }

    public IOSQRingOffsets head(@NativeType("__u32") int value) {
        nhead(address(), value);
        return this;
    }

    public IOSQRingOffsets tail(@NativeType("__u32") int value) {
        ntail(address(), value);
        return this;
    }

    public IOSQRingOffsets ring_mask(@NativeType("__u32") int value) {
        nring_mask(address(), value);
        return this;
    }

    public IOSQRingOffsets ring_entries(@NativeType("__u32") int value) {
        nring_entries(address(), value);
        return this;
    }

    public IOSQRingOffsets flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOSQRingOffsets dropped(@NativeType("__u32") int value) {
        ndropped(address(), value);
        return this;
    }

    public IOSQRingOffsets array(@NativeType("__u32") int value) {
        narray(address(), value);
        return this;
    }

    public IOSQRingOffsets user_addr(@NativeType("__u64") long value) {
        nuser_addr(address(), value);
        return this;
    }

    public IOSQRingOffsets set(int head, int tail, int ring_mask, int ring_entries, int flags, int dropped, int array, long user_addr) {
        head(head);
        tail(tail);
        ring_mask(ring_mask);
        ring_entries(ring_entries);
        flags(flags);
        dropped(dropped);
        array(array);
        user_addr(user_addr);
        return this;
    }

    public IOSQRingOffsets set(IOSQRingOffsets src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOSQRingOffsets malloc() {
        return new IOSQRingOffsets(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOSQRingOffsets calloc() {
        return new IOSQRingOffsets(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOSQRingOffsets create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOSQRingOffsets(MemoryUtil.memAddress(container), container);
    }

    public static IOSQRingOffsets create(long address) {
        return new IOSQRingOffsets(address, null);
    }

    public static IOSQRingOffsets createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOSQRingOffsets(address, null);
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

    public static IOSQRingOffsets malloc(MemoryStack stack) {
        return new IOSQRingOffsets(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOSQRingOffsets calloc(MemoryStack stack) {
        return new IOSQRingOffsets(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int ndropped(long struct) {
        return MemoryUtil.memGetInt(struct + DROPPED);
    }

    public static int narray(long struct) {
        return MemoryUtil.memGetInt(struct + ARRAY);
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

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ndropped(long struct, int value) {
        MemoryUtil.memPutInt(struct + DROPPED, value);
    }

    public static void narray(long struct, int value) {
        MemoryUtil.memPutInt(struct + ARRAY, value);
    }

    public static void nresv1(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESV1, value);
    }

    public static void nuser_addr(long struct, long value) {
        MemoryUtil.memPutLong(struct + USER_ADDR, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOSQRingOffsets$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOSQRingOffsets$Buffer.class */
    public static class Buffer extends StructBuffer<IOSQRingOffsets, Buffer> implements NativeResource {
        private static final IOSQRingOffsets ELEMENT_FACTORY = IOSQRingOffsets.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOSQRingOffsets.SIZEOF);
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
        public IOSQRingOffsets getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int head() {
            return IOSQRingOffsets.nhead(address());
        }

        @NativeType("__u32")
        public int tail() {
            return IOSQRingOffsets.ntail(address());
        }

        @NativeType("__u32")
        public int ring_mask() {
            return IOSQRingOffsets.nring_mask(address());
        }

        @NativeType("__u32")
        public int ring_entries() {
            return IOSQRingOffsets.nring_entries(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOSQRingOffsets.nflags(address());
        }

        @NativeType("__u32")
        public int dropped() {
            return IOSQRingOffsets.ndropped(address());
        }

        @NativeType("__u32")
        public int array() {
            return IOSQRingOffsets.narray(address());
        }

        @NativeType("__u64")
        public long user_addr() {
            return IOSQRingOffsets.nuser_addr(address());
        }

        public Buffer head(@NativeType("__u32") int value) {
            IOSQRingOffsets.nhead(address(), value);
            return this;
        }

        public Buffer tail(@NativeType("__u32") int value) {
            IOSQRingOffsets.ntail(address(), value);
            return this;
        }

        public Buffer ring_mask(@NativeType("__u32") int value) {
            IOSQRingOffsets.nring_mask(address(), value);
            return this;
        }

        public Buffer ring_entries(@NativeType("__u32") int value) {
            IOSQRingOffsets.nring_entries(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOSQRingOffsets.nflags(address(), value);
            return this;
        }

        public Buffer dropped(@NativeType("__u32") int value) {
            IOSQRingOffsets.ndropped(address(), value);
            return this;
        }

        public Buffer array(@NativeType("__u32") int value) {
            IOSQRingOffsets.narray(address(), value);
            return this;
        }

        public Buffer user_addr(@NativeType("__u64") long value) {
            IOSQRingOffsets.nuser_addr(address(), value);
            return this;
        }
    }
}
