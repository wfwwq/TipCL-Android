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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCUpdate2.class
 */
@NativeType("struct io_uring_rsrc_update2")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCUpdate2.class */
public class IOURingRSRCUpdate2 extends Struct<IOURingRSRCUpdate2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OFFSET;
    public static final int RESV;
    public static final int DATA;
    public static final int TAGS;
    public static final int NR;
    public static final int RESV2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET = layout.offsetof(0);
        RESV = layout.offsetof(1);
        DATA = layout.offsetof(2);
        TAGS = layout.offsetof(3);
        NR = layout.offsetof(4);
        RESV2 = layout.offsetof(5);
    }

    protected IOURingRSRCUpdate2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingRSRCUpdate2 create(long address, ByteBuffer container) {
        return new IOURingRSRCUpdate2(address, container);
    }

    public IOURingRSRCUpdate2(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int offset() {
        return noffset(address());
    }

    @NativeType("__u64")
    public long data() {
        return ndata(address());
    }

    @NativeType("__u64")
    public long tags() {
        return ntags(address());
    }

    @NativeType("__u32")
    public int nr() {
        return nnr(address());
    }

    public IOURingRSRCUpdate2 offset(@NativeType("__u32") int value) {
        noffset(address(), value);
        return this;
    }

    public IOURingRSRCUpdate2 data(@NativeType("__u64") long value) {
        ndata(address(), value);
        return this;
    }

    public IOURingRSRCUpdate2 tags(@NativeType("__u64") long value) {
        ntags(address(), value);
        return this;
    }

    public IOURingRSRCUpdate2 nr(@NativeType("__u32") int value) {
        nnr(address(), value);
        return this;
    }

    public IOURingRSRCUpdate2 set(int offset, long data, long tags, int nr) {
        offset(offset);
        data(data);
        tags(tags);
        nr(nr);
        return this;
    }

    public IOURingRSRCUpdate2 set(IOURingRSRCUpdate2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingRSRCUpdate2 malloc() {
        return new IOURingRSRCUpdate2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingRSRCUpdate2 calloc() {
        return new IOURingRSRCUpdate2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingRSRCUpdate2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingRSRCUpdate2(MemoryUtil.memAddress(container), container);
    }

    public static IOURingRSRCUpdate2 create(long address) {
        return new IOURingRSRCUpdate2(address, null);
    }

    public static IOURingRSRCUpdate2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingRSRCUpdate2(address, null);
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

    public static IOURingRSRCUpdate2 malloc(MemoryStack stack) {
        return new IOURingRSRCUpdate2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingRSRCUpdate2 calloc(MemoryStack stack) {
        return new IOURingRSRCUpdate2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int noffset(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET);
    }

    public static int nresv(long struct) {
        return MemoryUtil.memGetInt(struct + RESV);
    }

    public static long ndata(long struct) {
        return MemoryUtil.memGetLong(struct + DATA);
    }

    public static long ntags(long struct) {
        return MemoryUtil.memGetLong(struct + TAGS);
    }

    public static int nnr(long struct) {
        return MemoryUtil.memGetInt(struct + NR);
    }

    public static int nresv2(long struct) {
        return MemoryUtil.memGetInt(struct + RESV2);
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    public static void nresv(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESV, value);
    }

    public static void ndata(long struct, long value) {
        MemoryUtil.memPutLong(struct + DATA, value);
    }

    public static void ntags(long struct, long value) {
        MemoryUtil.memPutLong(struct + TAGS, value);
    }

    public static void nnr(long struct, int value) {
        MemoryUtil.memPutInt(struct + NR, value);
    }

    public static void nresv2(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESV2, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCUpdate2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCUpdate2$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingRSRCUpdate2, Buffer> implements NativeResource {
        private static final IOURingRSRCUpdate2 ELEMENT_FACTORY = IOURingRSRCUpdate2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingRSRCUpdate2.SIZEOF);
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
        public IOURingRSRCUpdate2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int offset() {
            return IOURingRSRCUpdate2.noffset(address());
        }

        @NativeType("__u64")
        public long data() {
            return IOURingRSRCUpdate2.ndata(address());
        }

        @NativeType("__u64")
        public long tags() {
            return IOURingRSRCUpdate2.ntags(address());
        }

        @NativeType("__u32")
        public int nr() {
            return IOURingRSRCUpdate2.nnr(address());
        }

        public Buffer offset(@NativeType("__u32") int value) {
            IOURingRSRCUpdate2.noffset(address(), value);
            return this;
        }

        public Buffer data(@NativeType("__u64") long value) {
            IOURingRSRCUpdate2.ndata(address(), value);
            return this;
        }

        public Buffer tags(@NativeType("__u64") long value) {
            IOURingRSRCUpdate2.ntags(address(), value);
            return this;
        }

        public Buffer nr(@NativeType("__u32") int value) {
            IOURingRSRCUpdate2.nnr(address(), value);
            return this;
        }
    }
}
