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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURing.class
 */
@NativeType("struct io_uring")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURing.class */
public class IOURing extends Struct<IOURing> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SQ;
    public static final int CQ;
    public static final int FLAGS;
    public static final int RING_FD;
    public static final int FEATURES;
    public static final int ENTER_RING_FD;
    public static final int INT_FLAGS;
    public static final int PAD;
    public static final int PAD2;

    static {
        Struct.Layout layout = __struct(__member(IOURingSQ.SIZEOF, IOURingSQ.ALIGNOF), __member(IOURingCQ.SIZEOF, IOURingCQ.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(1), __array(1, 3), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SQ = layout.offsetof(0);
        CQ = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RING_FD = layout.offsetof(3);
        FEATURES = layout.offsetof(4);
        ENTER_RING_FD = layout.offsetof(5);
        INT_FLAGS = layout.offsetof(6);
        PAD = layout.offsetof(7);
        PAD2 = layout.offsetof(8);
    }

    protected IOURing(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURing create(long address, ByteBuffer container) {
        return new IOURing(address, container);
    }

    public IOURing(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("struct io_uring_sq")
    public IOURingSQ sq() {
        return nsq(address());
    }

    @NativeType("struct io_uring_cq")
    public IOURingCQ cq() {
        return ncq(address());
    }

    @NativeType("unsigned int")
    public int flags() {
        return nflags(address());
    }

    public int ring_fd() {
        return nring_fd(address());
    }

    @NativeType("unsigned int")
    public int features() {
        return nfeatures(address());
    }

    public int enter_ring_fd() {
        return nenter_ring_fd(address());
    }

    @NativeType("__u8")
    public byte int_flags() {
        return nint_flags(address());
    }

    public IOURing sq(@NativeType("struct io_uring_sq") IOURingSQ value) {
        nsq(address(), value);
        return this;
    }

    public IOURing sq(Consumer<IOURingSQ> consumer) {
        consumer.accept(sq());
        return this;
    }

    public IOURing cq(@NativeType("struct io_uring_cq") IOURingCQ value) {
        ncq(address(), value);
        return this;
    }

    public IOURing cq(Consumer<IOURingCQ> consumer) {
        consumer.accept(cq());
        return this;
    }

    public IOURing flags(@NativeType("unsigned int") int value) {
        nflags(address(), value);
        return this;
    }

    public IOURing ring_fd(int value) {
        nring_fd(address(), value);
        return this;
    }

    public IOURing features(@NativeType("unsigned int") int value) {
        nfeatures(address(), value);
        return this;
    }

    public IOURing enter_ring_fd(int value) {
        nenter_ring_fd(address(), value);
        return this;
    }

    public IOURing int_flags(@NativeType("__u8") byte value) {
        nint_flags(address(), value);
        return this;
    }

    public IOURing set(IOURingSQ sq, IOURingCQ cq, int flags, int ring_fd, int features, int enter_ring_fd, byte int_flags) {
        sq(sq);
        cq(cq);
        flags(flags);
        ring_fd(ring_fd);
        features(features);
        enter_ring_fd(enter_ring_fd);
        int_flags(int_flags);
        return this;
    }

    public IOURing set(IOURing src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURing malloc() {
        return new IOURing(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURing calloc() {
        return new IOURing(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURing create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURing(MemoryUtil.memAddress(container), container);
    }

    public static IOURing create(long address) {
        return new IOURing(address, null);
    }

    public static IOURing createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURing(address, null);
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

    public static IOURing malloc(MemoryStack stack) {
        return new IOURing(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURing calloc(MemoryStack stack) {
        return new IOURing(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static IOURingSQ nsq(long struct) {
        return IOURingSQ.create(struct + SQ);
    }

    public static IOURingCQ ncq(long struct) {
        return IOURingCQ.create(struct + CQ);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nring_fd(long struct) {
        return MemoryUtil.memGetInt(struct + RING_FD);
    }

    public static int nfeatures(long struct) {
        return MemoryUtil.memGetInt(struct + FEATURES);
    }

    public static int nenter_ring_fd(long struct) {
        return MemoryUtil.memGetInt(struct + ENTER_RING_FD);
    }

    public static byte nint_flags(long struct) {
        return MemoryUtil.memGetByte(struct + INT_FLAGS);
    }

    public static ByteBuffer npad(long struct) {
        return MemoryUtil.memByteBuffer(struct + PAD, 3);
    }

    public static byte npad(long struct, int index) {
        return MemoryUtil.memGetByte(struct + PAD + (Checks.check(index, 3) * 1));
    }

    public static int npad2(long struct) {
        return MemoryUtil.memGetInt(struct + PAD2);
    }

    public static void nsq(long struct, IOURingSQ value) {
        MemoryUtil.memCopy(value.address(), struct + SQ, IOURingSQ.SIZEOF);
    }

    public static void ncq(long struct, IOURingCQ value) {
        MemoryUtil.memCopy(value.address(), struct + CQ, IOURingCQ.SIZEOF);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nring_fd(long struct, int value) {
        MemoryUtil.memPutInt(struct + RING_FD, value);
    }

    public static void nfeatures(long struct, int value) {
        MemoryUtil.memPutInt(struct + FEATURES, value);
    }

    public static void nenter_ring_fd(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENTER_RING_FD, value);
    }

    public static void nint_flags(long struct, byte value) {
        MemoryUtil.memPutByte(struct + INT_FLAGS, value);
    }

    public static void npad(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PAD, value.remaining() * 1);
    }

    public static void npad(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + PAD + (Checks.check(index, 3) * 1), value);
    }

    public static void npad2(long struct, int value) {
        MemoryUtil.memPutInt(struct + PAD2, value);
    }

    public static void validate(long struct) {
        IOURingSQ.validate(struct + SQ);
        IOURingCQ.validate(struct + CQ);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURing$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURing$Buffer.class */
    public static class Buffer extends StructBuffer<IOURing, Buffer> implements NativeResource {
        private static final IOURing ELEMENT_FACTORY = IOURing.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURing.SIZEOF);
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
        public IOURing getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("struct io_uring_sq")
        public IOURingSQ sq() {
            return IOURing.nsq(address());
        }

        @NativeType("struct io_uring_cq")
        public IOURingCQ cq() {
            return IOURing.ncq(address());
        }

        @NativeType("unsigned int")
        public int flags() {
            return IOURing.nflags(address());
        }

        public int ring_fd() {
            return IOURing.nring_fd(address());
        }

        @NativeType("unsigned int")
        public int features() {
            return IOURing.nfeatures(address());
        }

        public int enter_ring_fd() {
            return IOURing.nenter_ring_fd(address());
        }

        @NativeType("__u8")
        public byte int_flags() {
            return IOURing.nint_flags(address());
        }

        public Buffer sq(@NativeType("struct io_uring_sq") IOURingSQ value) {
            IOURing.nsq(address(), value);
            return this;
        }

        public Buffer sq(Consumer<IOURingSQ> consumer) {
            consumer.accept(sq());
            return this;
        }

        public Buffer cq(@NativeType("struct io_uring_cq") IOURingCQ value) {
            IOURing.ncq(address(), value);
            return this;
        }

        public Buffer cq(Consumer<IOURingCQ> consumer) {
            consumer.accept(cq());
            return this;
        }

        public Buffer flags(@NativeType("unsigned int") int value) {
            IOURing.nflags(address(), value);
            return this;
        }

        public Buffer ring_fd(int value) {
            IOURing.nring_fd(address(), value);
            return this;
        }

        public Buffer features(@NativeType("unsigned int") int value) {
            IOURing.nfeatures(address(), value);
            return this;
        }

        public Buffer enter_ring_fd(int value) {
            IOURing.nenter_ring_fd(address(), value);
            return this;
        }

        public Buffer int_flags(@NativeType("__u8") byte value) {
            IOURing.nint_flags(address(), value);
            return this;
        }
    }
}
