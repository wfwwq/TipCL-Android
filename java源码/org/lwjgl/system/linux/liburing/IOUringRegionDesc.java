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

@NativeType("struct io_uring_region_desc")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOUringRegionDesc.class */
public class IOUringRegionDesc extends Struct<IOUringRegionDesc> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int USER_ADDR;
    public static final int SIZE;
    public static final int FLAGS;
    public static final int ID;
    public static final int MMAP_OFFSET;
    public static final int __RESV;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(4), __member(4), __member(8), __array(8, 4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        USER_ADDR = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        ID = layout.offsetof(3);
        MMAP_OFFSET = layout.offsetof(4);
        __RESV = layout.offsetof(5);
    }

    protected IOUringRegionDesc(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOUringRegionDesc create(long address, ByteBuffer container) {
        return new IOUringRegionDesc(address, container);
    }

    public IOUringRegionDesc(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u64")
    public long user_addr() {
        return nuser_addr(address());
    }

    @NativeType("__u64")
    public long size() {
        return nsize(address());
    }

    @NativeType("__u32")
    public int flags() {
        return nflags(address());
    }

    @NativeType("__u32")
    public int id() {
        return nid(address());
    }

    @NativeType("__u64")
    public long mmap_offset() {
        return nmmap_offset(address());
    }

    public IOUringRegionDesc user_addr(@NativeType("__u64") long value) {
        nuser_addr(address(), value);
        return this;
    }

    public IOUringRegionDesc size(@NativeType("__u64") long value) {
        nsize(address(), value);
        return this;
    }

    public IOUringRegionDesc flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOUringRegionDesc id(@NativeType("__u32") int value) {
        nid(address(), value);
        return this;
    }

    public IOUringRegionDesc mmap_offset(@NativeType("__u64") long value) {
        nmmap_offset(address(), value);
        return this;
    }

    public IOUringRegionDesc set(long user_addr, long size, int flags, int id, long mmap_offset) {
        user_addr(user_addr);
        size(size);
        flags(flags);
        id(id);
        mmap_offset(mmap_offset);
        return this;
    }

    public IOUringRegionDesc set(IOUringRegionDesc src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOUringRegionDesc malloc() {
        return new IOUringRegionDesc(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOUringRegionDesc calloc() {
        return new IOUringRegionDesc(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOUringRegionDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOUringRegionDesc(MemoryUtil.memAddress(container), container);
    }

    public static IOUringRegionDesc create(long address) {
        return new IOUringRegionDesc(address, null);
    }

    public static IOUringRegionDesc createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOUringRegionDesc(address, null);
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

    public static IOUringRegionDesc malloc(MemoryStack stack) {
        return new IOUringRegionDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOUringRegionDesc calloc(MemoryStack stack) {
        return new IOUringRegionDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nuser_addr(long struct) {
        return MemoryUtil.memGetLong(struct + USER_ADDR);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nid(long struct) {
        return MemoryUtil.memGetInt(struct + ID);
    }

    public static long nmmap_offset(long struct) {
        return MemoryUtil.memGetLong(struct + MMAP_OFFSET);
    }

    public static LongBuffer n__resv(long struct) {
        return MemoryUtil.memLongBuffer(struct + __RESV, 4);
    }

    public static long n__resv(long struct, int index) {
        return MemoryUtil.memGetLong(struct + __RESV + (Checks.check(index, 4) * 8));
    }

    public static void nuser_addr(long struct, long value) {
        MemoryUtil.memPutLong(struct + USER_ADDR, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nid(long struct, int value) {
        MemoryUtil.memPutInt(struct + ID, value);
    }

    public static void nmmap_offset(long struct, long value) {
        MemoryUtil.memPutLong(struct + MMAP_OFFSET, value);
    }

    public static void n__resv(long struct, LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + __RESV, value.remaining() * 8);
    }

    public static void n__resv(long struct, int index, long value) {
        MemoryUtil.memPutLong(struct + __RESV + (Checks.check(index, 4) * 8), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOUringRegionDesc$Buffer.class */
    public static class Buffer extends StructBuffer<IOUringRegionDesc, Buffer> implements NativeResource {
        private static final IOUringRegionDesc ELEMENT_FACTORY = IOUringRegionDesc.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOUringRegionDesc.SIZEOF);
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
        public IOUringRegionDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long user_addr() {
            return IOUringRegionDesc.nuser_addr(address());
        }

        @NativeType("__u64")
        public long size() {
            return IOUringRegionDesc.nsize(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOUringRegionDesc.nflags(address());
        }

        @NativeType("__u32")
        public int id() {
            return IOUringRegionDesc.nid(address());
        }

        @NativeType("__u64")
        public long mmap_offset() {
            return IOUringRegionDesc.nmmap_offset(address());
        }

        public Buffer user_addr(@NativeType("__u64") long value) {
            IOUringRegionDesc.nuser_addr(address(), value);
            return this;
        }

        public Buffer size(@NativeType("__u64") long value) {
            IOUringRegionDesc.nsize(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOUringRegionDesc.nflags(address(), value);
            return this;
        }

        public Buffer id(@NativeType("__u32") int value) {
            IOUringRegionDesc.nid(address(), value);
            return this;
        }

        public Buffer mmap_offset(@NativeType("__u64") long value) {
            IOUringRegionDesc.nmmap_offset(address(), value);
            return this;
        }
    }
}
