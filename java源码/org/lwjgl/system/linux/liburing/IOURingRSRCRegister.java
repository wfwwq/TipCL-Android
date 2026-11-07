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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCRegister.class
 */
@NativeType("struct io_uring_rsrc_register")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCRegister.class */
public class IOURingRSRCRegister extends Struct<IOURingRSRCRegister> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NR;
    public static final int FLAGS;
    public static final int RESV2;
    public static final int DATA;
    public static final int TAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NR = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        RESV2 = layout.offsetof(2);
        DATA = layout.offsetof(3);
        TAGS = layout.offsetof(4);
    }

    protected IOURingRSRCRegister(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingRSRCRegister create(long address, ByteBuffer container) {
        return new IOURingRSRCRegister(address, container);
    }

    public IOURingRSRCRegister(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int nr() {
        return nnr(address());
    }

    @NativeType("__u32")
    public int flags() {
        return nflags(address());
    }

    @NativeType("__u64")
    public long data() {
        return ndata(address());
    }

    @NativeType("__u64")
    public long tags() {
        return ntags(address());
    }

    public IOURingRSRCRegister nr(@NativeType("__u32") int value) {
        nnr(address(), value);
        return this;
    }

    public IOURingRSRCRegister flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOURingRSRCRegister data(@NativeType("__u64") long value) {
        ndata(address(), value);
        return this;
    }

    public IOURingRSRCRegister tags(@NativeType("__u64") long value) {
        ntags(address(), value);
        return this;
    }

    public IOURingRSRCRegister set(int nr, int flags, long data, long tags) {
        nr(nr);
        flags(flags);
        data(data);
        tags(tags);
        return this;
    }

    public IOURingRSRCRegister set(IOURingRSRCRegister src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingRSRCRegister malloc() {
        return new IOURingRSRCRegister(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingRSRCRegister calloc() {
        return new IOURingRSRCRegister(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingRSRCRegister create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingRSRCRegister(MemoryUtil.memAddress(container), container);
    }

    public static IOURingRSRCRegister create(long address) {
        return new IOURingRSRCRegister(address, null);
    }

    public static IOURingRSRCRegister createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingRSRCRegister(address, null);
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

    public static IOURingRSRCRegister malloc(MemoryStack stack) {
        return new IOURingRSRCRegister(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingRSRCRegister calloc(MemoryStack stack) {
        return new IOURingRSRCRegister(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nnr(long struct) {
        return MemoryUtil.memGetInt(struct + NR);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long nresv2(long struct) {
        return MemoryUtil.memGetLong(struct + RESV2);
    }

    public static long ndata(long struct) {
        return MemoryUtil.memGetLong(struct + DATA);
    }

    public static long ntags(long struct) {
        return MemoryUtil.memGetLong(struct + TAGS);
    }

    public static void nnr(long struct, int value) {
        MemoryUtil.memPutInt(struct + NR, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nresv2(long struct, long value) {
        MemoryUtil.memPutLong(struct + RESV2, value);
    }

    public static void ndata(long struct, long value) {
        MemoryUtil.memPutLong(struct + DATA, value);
    }

    public static void ntags(long struct, long value) {
        MemoryUtil.memPutLong(struct + TAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCRegister$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCRegister$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingRSRCRegister, Buffer> implements NativeResource {
        private static final IOURingRSRCRegister ELEMENT_FACTORY = IOURingRSRCRegister.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingRSRCRegister.SIZEOF);
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
        public IOURingRSRCRegister getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int nr() {
            return IOURingRSRCRegister.nnr(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOURingRSRCRegister.nflags(address());
        }

        @NativeType("__u64")
        public long data() {
            return IOURingRSRCRegister.ndata(address());
        }

        @NativeType("__u64")
        public long tags() {
            return IOURingRSRCRegister.ntags(address());
        }

        public Buffer nr(@NativeType("__u32") int value) {
            IOURingRSRCRegister.nnr(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOURingRSRCRegister.nflags(address(), value);
            return this;
        }

        public Buffer data(@NativeType("__u64") long value) {
            IOURingRSRCRegister.ndata(address(), value);
            return this;
        }

        public Buffer tags(@NativeType("__u64") long value) {
            IOURingRSRCRegister.ntags(address(), value);
            return this;
        }
    }
}
