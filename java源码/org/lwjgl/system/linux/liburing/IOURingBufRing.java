package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.system.linux.liburing.IOURingBuf;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBufRing.class
 */
@NativeType("struct io_uring_buf_ring")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBufRing.class */
public class IOURingBufRing extends Struct<IOURingBufRing> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RESV1;
    public static final int RESV2;
    public static final int RESV3;
    public static final int TAIL;
    public static final int BUFS;

    static {
        Struct.Layout layout = __struct(__union(__struct(__member(8), __member(4), __member(2), __member(2)), __array(IOURingBuf.SIZEOF, IOURingBuf.ALIGNOF, 0)));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RESV1 = layout.offsetof(2);
        RESV2 = layout.offsetof(3);
        RESV3 = layout.offsetof(4);
        TAIL = layout.offsetof(5);
        BUFS = layout.offsetof(6);
    }

    protected IOURingBufRing(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingBufRing create(long address, ByteBuffer container) {
        return new IOURingBufRing(address, container);
    }

    public IOURingBufRing(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u64")
    public long resv1() {
        return nresv1(address());
    }

    @NativeType("__u32")
    public int resv2() {
        return nresv2(address());
    }

    @NativeType("__u16")
    public short resv3() {
        return nresv3(address());
    }

    @NativeType("__u16")
    public short tail() {
        return ntail(address());
    }

    @NativeType("struct io_uring_buf[0]")
    public IOURingBuf.Buffer bufs() {
        return nbufs(address());
    }

    @NativeType("struct io_uring_buf")
    public IOURingBuf bufs(int index) {
        return nbufs(address(), index);
    }

    public IOURingBufRing resv1(@NativeType("__u64") long value) {
        nresv1(address(), value);
        return this;
    }

    public IOURingBufRing resv2(@NativeType("__u32") int value) {
        nresv2(address(), value);
        return this;
    }

    public IOURingBufRing resv3(@NativeType("__u16") short value) {
        nresv3(address(), value);
        return this;
    }

    public IOURingBufRing tail(@NativeType("__u16") short value) {
        ntail(address(), value);
        return this;
    }

    public IOURingBufRing bufs(@NativeType("struct io_uring_buf[0]") IOURingBuf.Buffer value) {
        nbufs(address(), value);
        return this;
    }

    public IOURingBufRing bufs(int index, @NativeType("struct io_uring_buf") IOURingBuf value) {
        nbufs(address(), index, value);
        return this;
    }

    public IOURingBufRing bufs(Consumer<IOURingBuf.Buffer> consumer) {
        consumer.accept(bufs());
        return this;
    }

    public IOURingBufRing bufs(int index, Consumer<IOURingBuf> consumer) {
        consumer.accept(bufs(index));
        return this;
    }

    public IOURingBufRing set(IOURingBufRing src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingBufRing malloc() {
        return new IOURingBufRing(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingBufRing calloc() {
        return new IOURingBufRing(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingBufRing create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingBufRing(MemoryUtil.memAddress(container), container);
    }

    public static IOURingBufRing create(long address) {
        return new IOURingBufRing(address, null);
    }

    public static IOURingBufRing createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingBufRing(address, null);
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

    public static IOURingBufRing malloc(MemoryStack stack) {
        return new IOURingBufRing(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingBufRing calloc(MemoryStack stack) {
        return new IOURingBufRing(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nresv1(long struct) {
        return MemoryUtil.memGetLong(struct + RESV1);
    }

    public static int nresv2(long struct) {
        return MemoryUtil.memGetInt(struct + RESV2);
    }

    public static short nresv3(long struct) {
        return MemoryUtil.memGetShort(struct + RESV3);
    }

    public static short ntail(long struct) {
        return MemoryUtil.memGetShort(struct + TAIL);
    }

    public static IOURingBuf.Buffer nbufs(long struct) {
        return IOURingBuf.create(struct + BUFS, 0);
    }

    public static IOURingBuf nbufs(long struct, int index) {
        return IOURingBuf.create(struct + BUFS + (Checks.check(index, 0) * IOURingBuf.SIZEOF));
    }

    public static void nresv1(long struct, long value) {
        MemoryUtil.memPutLong(struct + RESV1, value);
    }

    public static void nresv2(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESV2, value);
    }

    public static void nresv3(long struct, short value) {
        MemoryUtil.memPutShort(struct + RESV3, value);
    }

    public static void ntail(long struct, short value) {
        MemoryUtil.memPutShort(struct + TAIL, value);
    }

    public static void nbufs(long struct, IOURingBuf.Buffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 0);
        }
        MemoryUtil.memCopy(value.address(), struct + BUFS, value.remaining() * IOURingBuf.SIZEOF);
    }

    public static void nbufs(long struct, int index, IOURingBuf value) {
        MemoryUtil.memCopy(value.address(), struct + BUFS + (Checks.check(index, 0) * IOURingBuf.SIZEOF), IOURingBuf.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBufRing$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBufRing$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingBufRing, Buffer> implements NativeResource {
        private static final IOURingBufRing ELEMENT_FACTORY = IOURingBufRing.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingBufRing.SIZEOF);
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
        public IOURingBufRing getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long resv1() {
            return IOURingBufRing.nresv1(address());
        }

        @NativeType("__u32")
        public int resv2() {
            return IOURingBufRing.nresv2(address());
        }

        @NativeType("__u16")
        public short resv3() {
            return IOURingBufRing.nresv3(address());
        }

        @NativeType("__u16")
        public short tail() {
            return IOURingBufRing.ntail(address());
        }

        @NativeType("struct io_uring_buf[0]")
        public IOURingBuf.Buffer bufs() {
            return IOURingBufRing.nbufs(address());
        }

        @NativeType("struct io_uring_buf")
        public IOURingBuf bufs(int index) {
            return IOURingBufRing.nbufs(address(), index);
        }

        public Buffer resv1(@NativeType("__u64") long value) {
            IOURingBufRing.nresv1(address(), value);
            return this;
        }

        public Buffer resv2(@NativeType("__u32") int value) {
            IOURingBufRing.nresv2(address(), value);
            return this;
        }

        public Buffer resv3(@NativeType("__u16") short value) {
            IOURingBufRing.nresv3(address(), value);
            return this;
        }

        public Buffer tail(@NativeType("__u16") short value) {
            IOURingBufRing.ntail(address(), value);
            return this;
        }

        public Buffer bufs(@NativeType("struct io_uring_buf[0]") IOURingBuf.Buffer value) {
            IOURingBufRing.nbufs(address(), value);
            return this;
        }

        public Buffer bufs(int index, @NativeType("struct io_uring_buf") IOURingBuf value) {
            IOURingBufRing.nbufs(address(), index, value);
            return this;
        }

        public Buffer bufs(Consumer<IOURingBuf.Buffer> consumer) {
            consumer.accept(bufs());
            return this;
        }

        public Buffer bufs(int index, Consumer<IOURingBuf> consumer) {
            consumer.accept(bufs(index));
            return this;
        }
    }
}
