package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct io_uring_zcrx_rqe")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXRQE.class */
public class IOURingZCRXRQE extends Struct<IOURingZCRXRQE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OFF;
    public static final int LEN;
    public static final int __PAD;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFF = layout.offsetof(0);
        LEN = layout.offsetof(1);
        __PAD = layout.offsetof(2);
    }

    protected IOURingZCRXRQE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingZCRXRQE create(long address, ByteBuffer container) {
        return new IOURingZCRXRQE(address, container);
    }

    public IOURingZCRXRQE(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u64")
    public long off() {
        return noff(address());
    }

    @NativeType("__u32")
    public int len() {
        return nlen(address());
    }

    public IOURingZCRXRQE off(@NativeType("__u64") long value) {
        noff(address(), value);
        return this;
    }

    public IOURingZCRXRQE len(@NativeType("__u32") int value) {
        nlen(address(), value);
        return this;
    }

    public IOURingZCRXRQE set(long off, int len) {
        off(off);
        len(len);
        return this;
    }

    public IOURingZCRXRQE set(IOURingZCRXRQE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingZCRXRQE malloc() {
        return new IOURingZCRXRQE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingZCRXRQE calloc() {
        return new IOURingZCRXRQE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingZCRXRQE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXRQE(MemoryUtil.memAddress(container), container);
    }

    public static IOURingZCRXRQE create(long address) {
        return new IOURingZCRXRQE(address, null);
    }

    public static IOURingZCRXRQE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingZCRXRQE(address, null);
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

    public static IOURingZCRXRQE malloc(MemoryStack stack) {
        return new IOURingZCRXRQE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingZCRXRQE calloc(MemoryStack stack) {
        return new IOURingZCRXRQE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long noff(long struct) {
        return MemoryUtil.memGetLong(struct + OFF);
    }

    public static int nlen(long struct) {
        return MemoryUtil.memGetInt(struct + LEN);
    }

    public static int n__pad(long struct) {
        return MemoryUtil.memGetInt(struct + __PAD);
    }

    public static void noff(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFF, value);
    }

    public static void nlen(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEN, value);
    }

    public static void n__pad(long struct, int value) {
        MemoryUtil.memPutInt(struct + __PAD, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXRQE$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingZCRXRQE, Buffer> implements NativeResource {
        private static final IOURingZCRXRQE ELEMENT_FACTORY = IOURingZCRXRQE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingZCRXRQE.SIZEOF);
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
        public IOURingZCRXRQE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long off() {
            return IOURingZCRXRQE.noff(address());
        }

        @NativeType("__u32")
        public int len() {
            return IOURingZCRXRQE.nlen(address());
        }

        public Buffer off(@NativeType("__u64") long value) {
            IOURingZCRXRQE.noff(address(), value);
            return this;
        }

        public Buffer len(@NativeType("__u32") int value) {
            IOURingZCRXRQE.nlen(address(), value);
            return this;
        }
    }
}
