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

@NativeType("struct io_uring_zcrx_area_reg")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXAreaReg.class */
public class IOURingZCRXAreaReg extends Struct<IOURingZCRXAreaReg> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ADDR;
    public static final int LEN;
    public static final int RQ_AREA_TOKEN;
    public static final int FLAGS;
    public static final int DMABUF_FD;
    public static final int __RESV2;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8), __member(4), __member(4), __array(8, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ADDR = layout.offsetof(0);
        LEN = layout.offsetof(1);
        RQ_AREA_TOKEN = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        DMABUF_FD = layout.offsetof(4);
        __RESV2 = layout.offsetof(5);
    }

    protected IOURingZCRXAreaReg(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingZCRXAreaReg create(long address, ByteBuffer container) {
        return new IOURingZCRXAreaReg(address, container);
    }

    public IOURingZCRXAreaReg(ByteBuffer container) {
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

    @NativeType("__u64")
    public long len() {
        return nlen(address());
    }

    @NativeType("__u64")
    public long rq_area_token() {
        return nrq_area_token(address());
    }

    @NativeType("__u32")
    public int flags() {
        return nflags(address());
    }

    @NativeType("__u32")
    public int dmabuf_fd() {
        return ndmabuf_fd(address());
    }

    public IOURingZCRXAreaReg addr(@NativeType("__u64") long value) {
        naddr(address(), value);
        return this;
    }

    public IOURingZCRXAreaReg len(@NativeType("__u64") long value) {
        nlen(address(), value);
        return this;
    }

    public IOURingZCRXAreaReg rq_area_token(@NativeType("__u64") long value) {
        nrq_area_token(address(), value);
        return this;
    }

    public IOURingZCRXAreaReg flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOURingZCRXAreaReg dmabuf_fd(@NativeType("__u32") int value) {
        ndmabuf_fd(address(), value);
        return this;
    }

    public IOURingZCRXAreaReg set(long addr, long len, long rq_area_token, int flags, int dmabuf_fd) {
        addr(addr);
        len(len);
        rq_area_token(rq_area_token);
        flags(flags);
        dmabuf_fd(dmabuf_fd);
        return this;
    }

    public IOURingZCRXAreaReg set(IOURingZCRXAreaReg src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingZCRXAreaReg malloc() {
        return new IOURingZCRXAreaReg(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingZCRXAreaReg calloc() {
        return new IOURingZCRXAreaReg(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingZCRXAreaReg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXAreaReg(MemoryUtil.memAddress(container), container);
    }

    public static IOURingZCRXAreaReg create(long address) {
        return new IOURingZCRXAreaReg(address, null);
    }

    public static IOURingZCRXAreaReg createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingZCRXAreaReg(address, null);
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

    public static IOURingZCRXAreaReg malloc(MemoryStack stack) {
        return new IOURingZCRXAreaReg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingZCRXAreaReg calloc(MemoryStack stack) {
        return new IOURingZCRXAreaReg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nlen(long struct) {
        return MemoryUtil.memGetLong(struct + LEN);
    }

    public static long nrq_area_token(long struct) {
        return MemoryUtil.memGetLong(struct + RQ_AREA_TOKEN);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int ndmabuf_fd(long struct) {
        return MemoryUtil.memGetInt(struct + DMABUF_FD);
    }

    public static LongBuffer n__resv2(long struct) {
        return MemoryUtil.memLongBuffer(struct + __RESV2, 2);
    }

    public static long n__resv2(long struct, int index) {
        return MemoryUtil.memGetLong(struct + __RESV2 + (Checks.check(index, 2) * 8));
    }

    public static void naddr(long struct, long value) {
        MemoryUtil.memPutLong(struct + ADDR, value);
    }

    public static void nlen(long struct, long value) {
        MemoryUtil.memPutLong(struct + LEN, value);
    }

    public static void nrq_area_token(long struct, long value) {
        MemoryUtil.memPutLong(struct + RQ_AREA_TOKEN, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ndmabuf_fd(long struct, int value) {
        MemoryUtil.memPutInt(struct + DMABUF_FD, value);
    }

    public static void n__resv2(long struct, LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + __RESV2, value.remaining() * 8);
    }

    public static void n__resv2(long struct, int index, long value) {
        MemoryUtil.memPutLong(struct + __RESV2 + (Checks.check(index, 2) * 8), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXAreaReg$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingZCRXAreaReg, Buffer> implements NativeResource {
        private static final IOURingZCRXAreaReg ELEMENT_FACTORY = IOURingZCRXAreaReg.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingZCRXAreaReg.SIZEOF);
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
        public IOURingZCRXAreaReg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long addr() {
            return IOURingZCRXAreaReg.naddr(address());
        }

        @NativeType("__u64")
        public long len() {
            return IOURingZCRXAreaReg.nlen(address());
        }

        @NativeType("__u64")
        public long rq_area_token() {
            return IOURingZCRXAreaReg.nrq_area_token(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOURingZCRXAreaReg.nflags(address());
        }

        @NativeType("__u32")
        public int dmabuf_fd() {
            return IOURingZCRXAreaReg.ndmabuf_fd(address());
        }

        public Buffer addr(@NativeType("__u64") long value) {
            IOURingZCRXAreaReg.naddr(address(), value);
            return this;
        }

        public Buffer len(@NativeType("__u64") long value) {
            IOURingZCRXAreaReg.nlen(address(), value);
            return this;
        }

        public Buffer rq_area_token(@NativeType("__u64") long value) {
            IOURingZCRXAreaReg.nrq_area_token(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOURingZCRXAreaReg.nflags(address(), value);
            return this;
        }

        public Buffer dmabuf_fd(@NativeType("__u32") int value) {
            IOURingZCRXAreaReg.ndmabuf_fd(address(), value);
            return this;
        }
    }
}
