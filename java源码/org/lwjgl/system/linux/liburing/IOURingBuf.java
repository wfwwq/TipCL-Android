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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBuf.class
 */
@NativeType("struct io_uring_buf")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBuf.class */
public class IOURingBuf extends Struct<IOURingBuf> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ADDR;
    public static final int LEN;
    public static final int BID;
    public static final int RESV;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ADDR = layout.offsetof(0);
        LEN = layout.offsetof(1);
        BID = layout.offsetof(2);
        RESV = layout.offsetof(3);
    }

    protected IOURingBuf(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingBuf create(long address, ByteBuffer container) {
        return new IOURingBuf(address, container);
    }

    public IOURingBuf(ByteBuffer container) {
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

    @NativeType("__u32")
    public int len() {
        return nlen(address());
    }

    @NativeType("__u16")
    public short bid() {
        return nbid(address());
    }

    public IOURingBuf addr(@NativeType("__u64") long value) {
        naddr(address(), value);
        return this;
    }

    public IOURingBuf len(@NativeType("__u32") int value) {
        nlen(address(), value);
        return this;
    }

    public IOURingBuf bid(@NativeType("__u16") short value) {
        nbid(address(), value);
        return this;
    }

    public IOURingBuf set(long addr, int len, short bid) {
        addr(addr);
        len(len);
        bid(bid);
        return this;
    }

    public IOURingBuf set(IOURingBuf src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingBuf malloc() {
        return new IOURingBuf(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingBuf calloc() {
        return new IOURingBuf(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingBuf create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingBuf(MemoryUtil.memAddress(container), container);
    }

    public static IOURingBuf create(long address) {
        return new IOURingBuf(address, null);
    }

    public static IOURingBuf createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingBuf(address, null);
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

    public static IOURingBuf malloc(MemoryStack stack) {
        return new IOURingBuf(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingBuf calloc(MemoryStack stack) {
        return new IOURingBuf(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nlen(long struct) {
        return MemoryUtil.memGetInt(struct + LEN);
    }

    public static short nbid(long struct) {
        return MemoryUtil.memGetShort(struct + BID);
    }

    public static short nresv(long struct) {
        return MemoryUtil.memGetShort(struct + RESV);
    }

    public static void naddr(long struct, long value) {
        MemoryUtil.memPutLong(struct + ADDR, value);
    }

    public static void nlen(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEN, value);
    }

    public static void nbid(long struct, short value) {
        MemoryUtil.memPutShort(struct + BID, value);
    }

    public static void nresv(long struct, short value) {
        MemoryUtil.memPutShort(struct + RESV, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBuf$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBuf$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingBuf, Buffer> implements NativeResource {
        private static final IOURingBuf ELEMENT_FACTORY = IOURingBuf.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingBuf.SIZEOF);
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
        public IOURingBuf getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long addr() {
            return IOURingBuf.naddr(address());
        }

        @NativeType("__u32")
        public int len() {
            return IOURingBuf.nlen(address());
        }

        @NativeType("__u16")
        public short bid() {
            return IOURingBuf.nbid(address());
        }

        public Buffer addr(@NativeType("__u64") long value) {
            IOURingBuf.naddr(address(), value);
            return this;
        }

        public Buffer len(@NativeType("__u32") int value) {
            IOURingBuf.nlen(address(), value);
            return this;
        }

        public Buffer bid(@NativeType("__u16") short value) {
            IOURingBuf.nbid(address(), value);
            return this;
        }
    }
}
