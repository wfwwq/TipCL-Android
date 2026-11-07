package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingCQE.class
 */
@NativeType("struct io_uring_cqe")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingCQE.class */
public class IOURingCQE extends Struct<IOURingCQE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int USER_DATA;
    public static final int RES;
    public static final int FLAGS;
    public static final int BIG_CQE;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(4), __array(8, 0));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        USER_DATA = layout.offsetof(0);
        RES = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        BIG_CQE = layout.offsetof(3);
    }

    protected IOURingCQE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingCQE create(long address, ByteBuffer container) {
        return new IOURingCQE(address, container);
    }

    public IOURingCQE(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u64")
    public long user_data() {
        return nuser_data(address());
    }

    @NativeType("__s32")
    public int res() {
        return nres(address());
    }

    @NativeType("__u32")
    public int flags() {
        return nflags(address());
    }

    @NativeType("__u64[0]")
    public LongBuffer big_cqe() {
        return nbig_cqe(address());
    }

    @NativeType("__u64")
    public long big_cqe(int index) {
        return nbig_cqe(address(), index);
    }

    public IOURingCQE user_data(@NativeType("__u64") long value) {
        nuser_data(address(), value);
        return this;
    }

    public IOURingCQE res(@NativeType("__s32") int value) {
        nres(address(), value);
        return this;
    }

    public IOURingCQE flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOURingCQE big_cqe(@NativeType("__u64[0]") LongBuffer value) {
        nbig_cqe(address(), value);
        return this;
    }

    public IOURingCQE big_cqe(int index, @NativeType("__u64") long value) {
        nbig_cqe(address(), index, value);
        return this;
    }

    public IOURingCQE set(long user_data, int res, int flags, LongBuffer big_cqe) {
        user_data(user_data);
        res(res);
        flags(flags);
        big_cqe(big_cqe);
        return this;
    }

    public IOURingCQE set(IOURingCQE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingCQE malloc() {
        return new IOURingCQE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingCQE calloc() {
        return new IOURingCQE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingCQE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingCQE(MemoryUtil.memAddress(container), container);
    }

    public static IOURingCQE create(long address) {
        return new IOURingCQE(address, null);
    }

    public static IOURingCQE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingCQE(address, null);
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

    public static IOURingCQE malloc(MemoryStack stack) {
        return new IOURingCQE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingCQE calloc(MemoryStack stack) {
        return new IOURingCQE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nuser_data(long struct) {
        return MemoryUtil.memGetLong(struct + USER_DATA);
    }

    public static int nres(long struct) {
        return MemoryUtil.memGetInt(struct + RES);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static LongBuffer nbig_cqe(long struct) {
        return MemoryUtil.memLongBuffer(struct + BIG_CQE, 0);
    }

    public static long nbig_cqe(long struct, int index) {
        return MemoryUtil.memGetLong(struct + BIG_CQE + (Checks.check(index, 0) * 8));
    }

    public static void nuser_data(long struct, long value) {
        MemoryUtil.memPutLong(struct + USER_DATA, value);
    }

    public static void nres(long struct, int value) {
        MemoryUtil.memPutInt(struct + RES, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nbig_cqe(long struct, LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 0);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + BIG_CQE, value.remaining() * 8);
    }

    public static void nbig_cqe(long struct, int index, long value) {
        MemoryUtil.memPutLong(struct + BIG_CQE + (Checks.check(index, 0) * 8), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingCQE$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingCQE$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingCQE, Buffer> implements NativeResource {
        private static final IOURingCQE ELEMENT_FACTORY = IOURingCQE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingCQE.SIZEOF);
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
        public IOURingCQE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long user_data() {
            return IOURingCQE.nuser_data(address());
        }

        @NativeType("__s32")
        public int res() {
            return IOURingCQE.nres(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOURingCQE.nflags(address());
        }

        @NativeType("__u64[0]")
        public LongBuffer big_cqe() {
            return IOURingCQE.nbig_cqe(address());
        }

        @NativeType("__u64")
        public long big_cqe(int index) {
            return IOURingCQE.nbig_cqe(address(), index);
        }

        public Buffer user_data(@NativeType("__u64") long value) {
            IOURingCQE.nuser_data(address(), value);
            return this;
        }

        public Buffer res(@NativeType("__s32") int value) {
            IOURingCQE.nres(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOURingCQE.nflags(address(), value);
            return this;
        }

        public Buffer big_cqe(@NativeType("__u64[0]") LongBuffer value) {
            IOURingCQE.nbig_cqe(address(), value);
            return this;
        }

        public Buffer big_cqe(int index, @NativeType("__u64") long value) {
            IOURingCQE.nbig_cqe(address(), index, value);
            return this;
        }
    }
}
