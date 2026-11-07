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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBufReg.class
 */
@NativeType("struct io_uring_buf_reg")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBufReg.class */
public class IOURingBufReg extends Struct<IOURingBufReg> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RING_ADDR;
    public static final int RING_ENTRIES;
    public static final int BGID;
    public static final int FLAGS;
    public static final int RESV;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(2), __member(2), __array(8, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RING_ADDR = layout.offsetof(0);
        RING_ENTRIES = layout.offsetof(1);
        BGID = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        RESV = layout.offsetof(4);
    }

    protected IOURingBufReg(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingBufReg create(long address, ByteBuffer container) {
        return new IOURingBufReg(address, container);
    }

    public IOURingBufReg(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u64")
    public long ring_addr() {
        return nring_addr(address());
    }

    @NativeType("__u32")
    public int ring_entries() {
        return nring_entries(address());
    }

    @NativeType("__u16")
    public short bgid() {
        return nbgid(address());
    }

    @NativeType("__u16")
    public short flags() {
        return nflags(address());
    }

    public IOURingBufReg ring_addr(@NativeType("__u64") long value) {
        nring_addr(address(), value);
        return this;
    }

    public IOURingBufReg ring_entries(@NativeType("__u32") int value) {
        nring_entries(address(), value);
        return this;
    }

    public IOURingBufReg bgid(@NativeType("__u16") short value) {
        nbgid(address(), value);
        return this;
    }

    public IOURingBufReg flags(@NativeType("__u16") short value) {
        nflags(address(), value);
        return this;
    }

    public IOURingBufReg set(long ring_addr, int ring_entries, short bgid, short flags) {
        ring_addr(ring_addr);
        ring_entries(ring_entries);
        bgid(bgid);
        flags(flags);
        return this;
    }

    public IOURingBufReg set(IOURingBufReg src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingBufReg malloc() {
        return new IOURingBufReg(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingBufReg calloc() {
        return new IOURingBufReg(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingBufReg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingBufReg(MemoryUtil.memAddress(container), container);
    }

    public static IOURingBufReg create(long address) {
        return new IOURingBufReg(address, null);
    }

    public static IOURingBufReg createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingBufReg(address, null);
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

    public static IOURingBufReg malloc(MemoryStack stack) {
        return new IOURingBufReg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingBufReg calloc(MemoryStack stack) {
        return new IOURingBufReg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nring_addr(long struct) {
        return MemoryUtil.memGetLong(struct + RING_ADDR);
    }

    public static int nring_entries(long struct) {
        return MemoryUtil.memGetInt(struct + RING_ENTRIES);
    }

    public static short nbgid(long struct) {
        return MemoryUtil.memGetShort(struct + BGID);
    }

    public static short nflags(long struct) {
        return MemoryUtil.memGetShort(struct + FLAGS);
    }

    public static LongBuffer nresv(long struct) {
        return MemoryUtil.memLongBuffer(struct + RESV, 3);
    }

    public static long nresv(long struct, int index) {
        return MemoryUtil.memGetLong(struct + RESV + (Checks.check(index, 3) * 8));
    }

    public static void nring_addr(long struct, long value) {
        MemoryUtil.memPutLong(struct + RING_ADDR, value);
    }

    public static void nring_entries(long struct, int value) {
        MemoryUtil.memPutInt(struct + RING_ENTRIES, value);
    }

    public static void nbgid(long struct, short value) {
        MemoryUtil.memPutShort(struct + BGID, value);
    }

    public static void nflags(long struct, short value) {
        MemoryUtil.memPutShort(struct + FLAGS, value);
    }

    public static void nresv(long struct, LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESV, value.remaining() * 8);
    }

    public static void nresv(long struct, int index, long value) {
        MemoryUtil.memPutLong(struct + RESV + (Checks.check(index, 3) * 8), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBufReg$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBufReg$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingBufReg, Buffer> implements NativeResource {
        private static final IOURingBufReg ELEMENT_FACTORY = IOURingBufReg.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingBufReg.SIZEOF);
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
        public IOURingBufReg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long ring_addr() {
            return IOURingBufReg.nring_addr(address());
        }

        @NativeType("__u32")
        public int ring_entries() {
            return IOURingBufReg.nring_entries(address());
        }

        @NativeType("__u16")
        public short bgid() {
            return IOURingBufReg.nbgid(address());
        }

        @NativeType("__u16")
        public short flags() {
            return IOURingBufReg.nflags(address());
        }

        public Buffer ring_addr(@NativeType("__u64") long value) {
            IOURingBufReg.nring_addr(address(), value);
            return this;
        }

        public Buffer ring_entries(@NativeType("__u32") int value) {
            IOURingBufReg.nring_entries(address(), value);
            return this;
        }

        public Buffer bgid(@NativeType("__u16") short value) {
            IOURingBufReg.nbgid(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u16") short value) {
            IOURingBufReg.nflags(address(), value);
            return this;
        }
    }
}
