package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct io_uring_query_hdr")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingQueryHdr.class */
public class IOURingQueryHdr extends Struct<IOURingQueryHdr> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NEXT_ENTRY;
    public static final int QUERY_DATA;
    public static final int QUERY_OP;
    public static final int SIZE;
    public static final int RESULT;
    public static final int __RESV;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(4), __member(4), __member(4), __array(4, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NEXT_ENTRY = layout.offsetof(0);
        QUERY_DATA = layout.offsetof(1);
        QUERY_OP = layout.offsetof(2);
        SIZE = layout.offsetof(3);
        RESULT = layout.offsetof(4);
        __RESV = layout.offsetof(5);
    }

    protected IOURingQueryHdr(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingQueryHdr create(long address, ByteBuffer container) {
        return new IOURingQueryHdr(address, container);
    }

    public IOURingQueryHdr(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u64")
    public long next_entry() {
        return nnext_entry(address());
    }

    @NativeType("__u64")
    public long query_data() {
        return nquery_data(address());
    }

    @NativeType("__u32")
    public int query_op() {
        return nquery_op(address());
    }

    @NativeType("__u32")
    public int size() {
        return nsize(address());
    }

    @NativeType("__s32")
    public int result() {
        return nresult(address());
    }

    public IOURingQueryHdr next_entry(@NativeType("__u64") long value) {
        nnext_entry(address(), value);
        return this;
    }

    public IOURingQueryHdr query_data(@NativeType("__u64") long value) {
        nquery_data(address(), value);
        return this;
    }

    public IOURingQueryHdr query_op(@NativeType("__u32") int value) {
        nquery_op(address(), value);
        return this;
    }

    public IOURingQueryHdr size(@NativeType("__u32") int value) {
        nsize(address(), value);
        return this;
    }

    public IOURingQueryHdr result(@NativeType("__s32") int value) {
        nresult(address(), value);
        return this;
    }

    public IOURingQueryHdr set(long next_entry, long query_data, int query_op, int size, int result) {
        next_entry(next_entry);
        query_data(query_data);
        query_op(query_op);
        size(size);
        result(result);
        return this;
    }

    public IOURingQueryHdr set(IOURingQueryHdr src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingQueryHdr malloc() {
        return new IOURingQueryHdr(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingQueryHdr calloc() {
        return new IOURingQueryHdr(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingQueryHdr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingQueryHdr(MemoryUtil.memAddress(container), container);
    }

    public static IOURingQueryHdr create(long address) {
        return new IOURingQueryHdr(address, null);
    }

    public static IOURingQueryHdr createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingQueryHdr(address, null);
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

    public static IOURingQueryHdr malloc(MemoryStack stack) {
        return new IOURingQueryHdr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingQueryHdr calloc(MemoryStack stack) {
        return new IOURingQueryHdr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nnext_entry(long struct) {
        return MemoryUtil.memGetLong(struct + NEXT_ENTRY);
    }

    public static long nquery_data(long struct) {
        return MemoryUtil.memGetLong(struct + QUERY_DATA);
    }

    public static int nquery_op(long struct) {
        return MemoryUtil.memGetInt(struct + QUERY_OP);
    }

    public static int nsize(long struct) {
        return MemoryUtil.memGetInt(struct + SIZE);
    }

    public static int nresult(long struct) {
        return MemoryUtil.memGetInt(struct + RESULT);
    }

    public static IntBuffer n__resv(long struct) {
        return MemoryUtil.memIntBuffer(struct + __RESV, 3);
    }

    public static int n__resv(long struct, int index) {
        return MemoryUtil.memGetInt(struct + __RESV + (Checks.check(index, 3) * 4));
    }

    public static void nnext_entry(long struct, long value) {
        MemoryUtil.memPutLong(struct + NEXT_ENTRY, value);
    }

    public static void nquery_data(long struct, long value) {
        MemoryUtil.memPutLong(struct + QUERY_DATA, value);
    }

    public static void nquery_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUERY_OP, value);
    }

    public static void nsize(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIZE, value);
    }

    public static void nresult(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESULT, value);
    }

    public static void n__resv(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + __RESV, value.remaining() * 4);
    }

    public static void n__resv(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + __RESV + (Checks.check(index, 3) * 4), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingQueryHdr$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingQueryHdr, Buffer> implements NativeResource {
        private static final IOURingQueryHdr ELEMENT_FACTORY = IOURingQueryHdr.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingQueryHdr.SIZEOF);
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
        public IOURingQueryHdr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long next_entry() {
            return IOURingQueryHdr.nnext_entry(address());
        }

        @NativeType("__u64")
        public long query_data() {
            return IOURingQueryHdr.nquery_data(address());
        }

        @NativeType("__u32")
        public int query_op() {
            return IOURingQueryHdr.nquery_op(address());
        }

        @NativeType("__u32")
        public int size() {
            return IOURingQueryHdr.nsize(address());
        }

        @NativeType("__s32")
        public int result() {
            return IOURingQueryHdr.nresult(address());
        }

        public Buffer next_entry(@NativeType("__u64") long value) {
            IOURingQueryHdr.nnext_entry(address(), value);
            return this;
        }

        public Buffer query_data(@NativeType("__u64") long value) {
            IOURingQueryHdr.nquery_data(address(), value);
            return this;
        }

        public Buffer query_op(@NativeType("__u32") int value) {
            IOURingQueryHdr.nquery_op(address(), value);
            return this;
        }

        public Buffer size(@NativeType("__u32") int value) {
            IOURingQueryHdr.nsize(address(), value);
            return this;
        }

        public Buffer result(@NativeType("__s32") int value) {
            IOURingQueryHdr.nresult(address(), value);
            return this;
        }
    }
}
