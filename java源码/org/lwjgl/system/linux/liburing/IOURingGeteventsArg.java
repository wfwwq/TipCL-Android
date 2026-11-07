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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingGeteventsArg.class
 */
@NativeType("struct io_uring_getevents_arg")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingGeteventsArg.class */
public class IOURingGeteventsArg extends Struct<IOURingGeteventsArg> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SIGMASK;
    public static final int SIGMASK_SZ;
    public static final int MIN_WAIT_USEC;
    public static final int TS;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SIGMASK = layout.offsetof(0);
        SIGMASK_SZ = layout.offsetof(1);
        MIN_WAIT_USEC = layout.offsetof(2);
        TS = layout.offsetof(3);
    }

    protected IOURingGeteventsArg(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingGeteventsArg create(long address, ByteBuffer container) {
        return new IOURingGeteventsArg(address, container);
    }

    public IOURingGeteventsArg(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u64")
    public long sigmask() {
        return nsigmask(address());
    }

    @NativeType("__u32")
    public int sigmask_sz() {
        return nsigmask_sz(address());
    }

    @NativeType("__u32")
    public int min_wait_usec() {
        return nmin_wait_usec(address());
    }

    @NativeType("__u64")
    public long ts() {
        return nts(address());
    }

    public IOURingGeteventsArg sigmask(@NativeType("__u64") long value) {
        nsigmask(address(), value);
        return this;
    }

    public IOURingGeteventsArg sigmask_sz(@NativeType("__u32") int value) {
        nsigmask_sz(address(), value);
        return this;
    }

    public IOURingGeteventsArg min_wait_usec(@NativeType("__u32") int value) {
        nmin_wait_usec(address(), value);
        return this;
    }

    public IOURingGeteventsArg ts(@NativeType("__u64") long value) {
        nts(address(), value);
        return this;
    }

    public IOURingGeteventsArg set(long sigmask, int sigmask_sz, int min_wait_usec, long ts) {
        sigmask(sigmask);
        sigmask_sz(sigmask_sz);
        min_wait_usec(min_wait_usec);
        ts(ts);
        return this;
    }

    public IOURingGeteventsArg set(IOURingGeteventsArg src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingGeteventsArg malloc() {
        return new IOURingGeteventsArg(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingGeteventsArg calloc() {
        return new IOURingGeteventsArg(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingGeteventsArg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingGeteventsArg(MemoryUtil.memAddress(container), container);
    }

    public static IOURingGeteventsArg create(long address) {
        return new IOURingGeteventsArg(address, null);
    }

    public static IOURingGeteventsArg createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingGeteventsArg(address, null);
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

    public static IOURingGeteventsArg malloc(MemoryStack stack) {
        return new IOURingGeteventsArg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingGeteventsArg calloc(MemoryStack stack) {
        return new IOURingGeteventsArg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nsigmask(long struct) {
        return MemoryUtil.memGetLong(struct + SIGMASK);
    }

    public static int nsigmask_sz(long struct) {
        return MemoryUtil.memGetInt(struct + SIGMASK_SZ);
    }

    public static int nmin_wait_usec(long struct) {
        return MemoryUtil.memGetInt(struct + MIN_WAIT_USEC);
    }

    public static long nts(long struct) {
        return MemoryUtil.memGetLong(struct + TS);
    }

    public static void nsigmask(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIGMASK, value);
    }

    public static void nsigmask_sz(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIGMASK_SZ, value);
    }

    public static void nmin_wait_usec(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIN_WAIT_USEC, value);
    }

    public static void nts(long struct, long value) {
        MemoryUtil.memPutLong(struct + TS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingGeteventsArg$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingGeteventsArg$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingGeteventsArg, Buffer> implements NativeResource {
        private static final IOURingGeteventsArg ELEMENT_FACTORY = IOURingGeteventsArg.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingGeteventsArg.SIZEOF);
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
        public IOURingGeteventsArg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long sigmask() {
            return IOURingGeteventsArg.nsigmask(address());
        }

        @NativeType("__u32")
        public int sigmask_sz() {
            return IOURingGeteventsArg.nsigmask_sz(address());
        }

        @NativeType("__u32")
        public int min_wait_usec() {
            return IOURingGeteventsArg.nmin_wait_usec(address());
        }

        @NativeType("__u64")
        public long ts() {
            return IOURingGeteventsArg.nts(address());
        }

        public Buffer sigmask(@NativeType("__u64") long value) {
            IOURingGeteventsArg.nsigmask(address(), value);
            return this;
        }

        public Buffer sigmask_sz(@NativeType("__u32") int value) {
            IOURingGeteventsArg.nsigmask_sz(address(), value);
            return this;
        }

        public Buffer min_wait_usec(@NativeType("__u32") int value) {
            IOURingGeteventsArg.nmin_wait_usec(address(), value);
            return this;
        }

        public Buffer ts(@NativeType("__u64") long value) {
            IOURingGeteventsArg.nts(address(), value);
            return this;
        }
    }
}
