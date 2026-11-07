package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingSyncCancelReg.class
 */
@NativeType("struct io_uring_sync_cancel_reg")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingSyncCancelReg.class */
public class IOURingSyncCancelReg extends Struct<IOURingSyncCancelReg> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ADDR;
    public static final int FD;
    public static final int FLAGS;
    public static final int TIMEOUT;
    public static final int OPCODE;
    public static final int PAD;
    public static final int PAD2;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(4), __member(KernelTimespec.SIZEOF, KernelTimespec.ALIGNOF), __member(1), __array(1, 7), __array(8, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ADDR = layout.offsetof(0);
        FD = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TIMEOUT = layout.offsetof(3);
        OPCODE = layout.offsetof(4);
        PAD = layout.offsetof(5);
        PAD2 = layout.offsetof(6);
    }

    protected IOURingSyncCancelReg(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingSyncCancelReg create(long address, ByteBuffer container) {
        return new IOURingSyncCancelReg(address, container);
    }

    public IOURingSyncCancelReg(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u64")
    public long addr() {
        return naddr(address());
    }

    @NativeType("__s32")
    public int fd() {
        return nfd(address());
    }

    @NativeType("__u32")
    public int flags() {
        return nflags(address());
    }

    @NativeType("struct __kernel_timespec")
    public KernelTimespec timeout() {
        return ntimeout(address());
    }

    @NativeType("__u8")
    public byte opcode() {
        return nopcode(address());
    }

    public IOURingSyncCancelReg addr(@NativeType("__u64") long value) {
        naddr(address(), value);
        return this;
    }

    public IOURingSyncCancelReg fd(@NativeType("__s32") int value) {
        nfd(address(), value);
        return this;
    }

    public IOURingSyncCancelReg flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOURingSyncCancelReg timeout(@NativeType("struct __kernel_timespec") KernelTimespec value) {
        ntimeout(address(), value);
        return this;
    }

    public IOURingSyncCancelReg timeout(Consumer<KernelTimespec> consumer) {
        consumer.accept(timeout());
        return this;
    }

    public IOURingSyncCancelReg opcode(@NativeType("__u8") byte value) {
        nopcode(address(), value);
        return this;
    }

    public IOURingSyncCancelReg set(long addr, int fd, int flags, KernelTimespec timeout, byte opcode) {
        addr(addr);
        fd(fd);
        flags(flags);
        timeout(timeout);
        opcode(opcode);
        return this;
    }

    public IOURingSyncCancelReg set(IOURingSyncCancelReg src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingSyncCancelReg malloc() {
        return new IOURingSyncCancelReg(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingSyncCancelReg calloc() {
        return new IOURingSyncCancelReg(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingSyncCancelReg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingSyncCancelReg(MemoryUtil.memAddress(container), container);
    }

    public static IOURingSyncCancelReg create(long address) {
        return new IOURingSyncCancelReg(address, null);
    }

    public static IOURingSyncCancelReg createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingSyncCancelReg(address, null);
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

    public static IOURingSyncCancelReg malloc(MemoryStack stack) {
        return new IOURingSyncCancelReg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingSyncCancelReg calloc(MemoryStack stack) {
        return new IOURingSyncCancelReg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long naddr(long struct) {
        return MemoryUtil.memGetLong(struct + ADDR);
    }

    public static int nfd(long struct) {
        return MemoryUtil.memGetInt(struct + FD);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static KernelTimespec ntimeout(long struct) {
        return KernelTimespec.create(struct + TIMEOUT);
    }

    public static byte nopcode(long struct) {
        return MemoryUtil.memGetByte(struct + OPCODE);
    }

    public static ByteBuffer npad(long struct) {
        return MemoryUtil.memByteBuffer(struct + PAD, 7);
    }

    public static byte npad(long struct, int index) {
        return MemoryUtil.memGetByte(struct + PAD + (Checks.check(index, 7) * 1));
    }

    public static LongBuffer npad2(long struct) {
        return MemoryUtil.memLongBuffer(struct + PAD2, 3);
    }

    public static long npad2(long struct, int index) {
        return MemoryUtil.memGetLong(struct + PAD2 + (Checks.check(index, 3) * 8));
    }

    public static void naddr(long struct, long value) {
        MemoryUtil.memPutLong(struct + ADDR, value);
    }

    public static void nfd(long struct, int value) {
        MemoryUtil.memPutInt(struct + FD, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ntimeout(long struct, KernelTimespec value) {
        MemoryUtil.memCopy(value.address(), struct + TIMEOUT, KernelTimespec.SIZEOF);
    }

    public static void nopcode(long struct, byte value) {
        MemoryUtil.memPutByte(struct + OPCODE, value);
    }

    public static void npad(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PAD, value.remaining() * 1);
    }

    public static void npad(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + PAD + (Checks.check(index, 7) * 1), value);
    }

    public static void npad2(long struct, LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PAD2, value.remaining() * 8);
    }

    public static void npad2(long struct, int index, long value) {
        MemoryUtil.memPutLong(struct + PAD2 + (Checks.check(index, 3) * 8), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingSyncCancelReg$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingSyncCancelReg$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingSyncCancelReg, Buffer> implements NativeResource {
        private static final IOURingSyncCancelReg ELEMENT_FACTORY = IOURingSyncCancelReg.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingSyncCancelReg.SIZEOF);
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
        public IOURingSyncCancelReg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long addr() {
            return IOURingSyncCancelReg.naddr(address());
        }

        @NativeType("__s32")
        public int fd() {
            return IOURingSyncCancelReg.nfd(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOURingSyncCancelReg.nflags(address());
        }

        @NativeType("struct __kernel_timespec")
        public KernelTimespec timeout() {
            return IOURingSyncCancelReg.ntimeout(address());
        }

        @NativeType("__u8")
        public byte opcode() {
            return IOURingSyncCancelReg.nopcode(address());
        }

        public Buffer addr(@NativeType("__u64") long value) {
            IOURingSyncCancelReg.naddr(address(), value);
            return this;
        }

        public Buffer fd(@NativeType("__s32") int value) {
            IOURingSyncCancelReg.nfd(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOURingSyncCancelReg.nflags(address(), value);
            return this;
        }

        public Buffer timeout(@NativeType("struct __kernel_timespec") KernelTimespec value) {
            IOURingSyncCancelReg.ntimeout(address(), value);
            return this;
        }

        public Buffer timeout(Consumer<KernelTimespec> consumer) {
            consumer.accept(timeout());
            return this;
        }

        public Buffer opcode(@NativeType("__u8") byte value) {
            IOURingSyncCancelReg.nopcode(address(), value);
            return this;
        }
    }
}
