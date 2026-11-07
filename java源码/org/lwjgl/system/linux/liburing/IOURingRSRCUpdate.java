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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCUpdate.class
 */
@NativeType("struct io_uring_rsrc_update")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCUpdate.class */
public class IOURingRSRCUpdate extends Struct<IOURingRSRCUpdate> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OFFSET;
    public static final int RESV;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET = layout.offsetof(0);
        RESV = layout.offsetof(1);
        DATA = layout.offsetof(2);
    }

    protected IOURingRSRCUpdate(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingRSRCUpdate create(long address, ByteBuffer container) {
        return new IOURingRSRCUpdate(address, container);
    }

    public IOURingRSRCUpdate(ByteBuffer container) {
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

    public IOURingRSRCUpdate offset(@NativeType("__u32") int value) {
        noffset(address(), value);
        return this;
    }

    public IOURingRSRCUpdate data(@NativeType("__u64") long value) {
        ndata(address(), value);
        return this;
    }

    public IOURingRSRCUpdate set(int offset, long data) {
        offset(offset);
        data(data);
        return this;
    }

    public IOURingRSRCUpdate set(IOURingRSRCUpdate src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingRSRCUpdate malloc() {
        return new IOURingRSRCUpdate(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingRSRCUpdate calloc() {
        return new IOURingRSRCUpdate(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingRSRCUpdate create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingRSRCUpdate(MemoryUtil.memAddress(container), container);
    }

    public static IOURingRSRCUpdate create(long address) {
        return new IOURingRSRCUpdate(address, null);
    }

    public static IOURingRSRCUpdate createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingRSRCUpdate(address, null);
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

    public static IOURingRSRCUpdate malloc(MemoryStack stack) {
        return new IOURingRSRCUpdate(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingRSRCUpdate calloc(MemoryStack stack) {
        return new IOURingRSRCUpdate(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    public static void nresv(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESV, value);
    }

    public static void ndata(long struct, long value) {
        MemoryUtil.memPutLong(struct + DATA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCUpdate$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRSRCUpdate$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingRSRCUpdate, Buffer> implements NativeResource {
        private static final IOURingRSRCUpdate ELEMENT_FACTORY = IOURingRSRCUpdate.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingRSRCUpdate.SIZEOF);
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
        public IOURingRSRCUpdate getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int offset() {
            return IOURingRSRCUpdate.noffset(address());
        }

        @NativeType("__u64")
        public long data() {
            return IOURingRSRCUpdate.ndata(address());
        }

        public Buffer offset(@NativeType("__u32") int value) {
            IOURingRSRCUpdate.noffset(address(), value);
            return this;
        }

        public Buffer data(@NativeType("__u64") long value) {
            IOURingRSRCUpdate.ndata(address(), value);
            return this;
        }
    }
}
