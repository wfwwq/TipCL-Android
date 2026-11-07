package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.system.linux.KernelTimespec;

@NativeType("struct io_uring_reg_wait")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRegWait.class */
public class IOURingRegWait extends Struct<IOURingRegWait> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TS;
    public static final int MIN_WAIT_USEC;
    public static final int FLAGS;
    public static final int SIGMASK;
    public static final int SIGMASK_SZ;
    public static final int PAD;
    public static final int PAD2;

    static {
        Struct.Layout layout = __struct(__member(KernelTimespec.SIZEOF, KernelTimespec.ALIGNOF), __member(4), __member(4), __member(8), __member(4), __array(4, 3), __array(8, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TS = layout.offsetof(0);
        MIN_WAIT_USEC = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SIGMASK = layout.offsetof(3);
        SIGMASK_SZ = layout.offsetof(4);
        PAD = layout.offsetof(5);
        PAD2 = layout.offsetof(6);
    }

    protected IOURingRegWait(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingRegWait create(long address, ByteBuffer container) {
        return new IOURingRegWait(address, container);
    }

    public IOURingRegWait(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("struct __kernel_timespec")
    public KernelTimespec ts() {
        return nts(address());
    }

    @NativeType("__u32")
    public int min_wait_usec() {
        return nmin_wait_usec(address());
    }

    @NativeType("__u32")
    public int flags() {
        return nflags(address());
    }

    @NativeType("__u64")
    public long sigmask() {
        return nsigmask(address());
    }

    @NativeType("__u32")
    public int sigmask_sz() {
        return nsigmask_sz(address());
    }

    public IOURingRegWait ts(@NativeType("struct __kernel_timespec") KernelTimespec value) {
        nts(address(), value);
        return this;
    }

    public IOURingRegWait ts(Consumer<KernelTimespec> consumer) {
        consumer.accept(ts());
        return this;
    }

    public IOURingRegWait min_wait_usec(@NativeType("__u32") int value) {
        nmin_wait_usec(address(), value);
        return this;
    }

    public IOURingRegWait flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOURingRegWait sigmask(@NativeType("__u64") long value) {
        nsigmask(address(), value);
        return this;
    }

    public IOURingRegWait sigmask_sz(@NativeType("__u32") int value) {
        nsigmask_sz(address(), value);
        return this;
    }

    public IOURingRegWait set(KernelTimespec ts, int min_wait_usec, int flags, long sigmask, int sigmask_sz) {
        ts(ts);
        min_wait_usec(min_wait_usec);
        flags(flags);
        sigmask(sigmask);
        sigmask_sz(sigmask_sz);
        return this;
    }

    public IOURingRegWait set(IOURingRegWait src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingRegWait malloc() {
        return new IOURingRegWait(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingRegWait calloc() {
        return new IOURingRegWait(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingRegWait create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingRegWait(MemoryUtil.memAddress(container), container);
    }

    public static IOURingRegWait create(long address) {
        return new IOURingRegWait(address, null);
    }

    public static IOURingRegWait createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingRegWait(address, null);
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

    public static IOURingRegWait malloc(MemoryStack stack) {
        return new IOURingRegWait(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingRegWait calloc(MemoryStack stack) {
        return new IOURingRegWait(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static KernelTimespec nts(long struct) {
        return KernelTimespec.create(struct + TS);
    }

    public static int nmin_wait_usec(long struct) {
        return MemoryUtil.memGetInt(struct + MIN_WAIT_USEC);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long nsigmask(long struct) {
        return MemoryUtil.memGetLong(struct + SIGMASK);
    }

    public static int nsigmask_sz(long struct) {
        return MemoryUtil.memGetInt(struct + SIGMASK_SZ);
    }

    public static IntBuffer npad(long struct) {
        return MemoryUtil.memIntBuffer(struct + PAD, 3);
    }

    public static int npad(long struct, int index) {
        return MemoryUtil.memGetInt(struct + PAD + (Checks.check(index, 3) * 4));
    }

    public static LongBuffer npad2(long struct) {
        return MemoryUtil.memLongBuffer(struct + PAD2, 2);
    }

    public static long npad2(long struct, int index) {
        return MemoryUtil.memGetLong(struct + PAD2 + (Checks.check(index, 2) * 8));
    }

    public static void nts(long struct, KernelTimespec value) {
        MemoryUtil.memCopy(value.address(), struct + TS, KernelTimespec.SIZEOF);
    }

    public static void nmin_wait_usec(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIN_WAIT_USEC, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nsigmask(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIGMASK, value);
    }

    public static void nsigmask_sz(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIGMASK_SZ, value);
    }

    public static void npad(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PAD, value.remaining() * 4);
    }

    public static void npad(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + PAD + (Checks.check(index, 3) * 4), value);
    }

    public static void npad2(long struct, LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PAD2, value.remaining() * 8);
    }

    public static void npad2(long struct, int index, long value) {
        MemoryUtil.memPutLong(struct + PAD2 + (Checks.check(index, 2) * 8), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRegWait$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingRegWait, Buffer> implements NativeResource {
        private static final IOURingRegWait ELEMENT_FACTORY = IOURingRegWait.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingRegWait.SIZEOF);
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
        public IOURingRegWait getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("struct __kernel_timespec")
        public KernelTimespec ts() {
            return IOURingRegWait.nts(address());
        }

        @NativeType("__u32")
        public int min_wait_usec() {
            return IOURingRegWait.nmin_wait_usec(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOURingRegWait.nflags(address());
        }

        @NativeType("__u64")
        public long sigmask() {
            return IOURingRegWait.nsigmask(address());
        }

        @NativeType("__u32")
        public int sigmask_sz() {
            return IOURingRegWait.nsigmask_sz(address());
        }

        public Buffer ts(@NativeType("struct __kernel_timespec") KernelTimespec value) {
            IOURingRegWait.nts(address(), value);
            return this;
        }

        public Buffer ts(Consumer<KernelTimespec> consumer) {
            consumer.accept(ts());
            return this;
        }

        public Buffer min_wait_usec(@NativeType("__u32") int value) {
            IOURingRegWait.nmin_wait_usec(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOURingRegWait.nflags(address(), value);
            return this;
        }

        public Buffer sigmask(@NativeType("__u64") long value) {
            IOURingRegWait.nsigmask(address(), value);
            return this;
        }

        public Buffer sigmask_sz(@NativeType("__u32") int value) {
            IOURingRegWait.nsigmask_sz(address(), value);
            return this;
        }
    }
}
