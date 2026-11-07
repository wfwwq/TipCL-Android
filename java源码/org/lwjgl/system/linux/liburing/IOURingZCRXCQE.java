package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct io_uring_zcrx_cqe")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXCQE.class */
public class IOURingZCRXCQE extends Struct<IOURingZCRXCQE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OFF;
    public static final int __PAD;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFF = layout.offsetof(0);
        __PAD = layout.offsetof(1);
    }

    protected IOURingZCRXCQE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingZCRXCQE create(long address, ByteBuffer container) {
        return new IOURingZCRXCQE(address, container);
    }

    public IOURingZCRXCQE(ByteBuffer container) {
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

    public IOURingZCRXCQE off(@NativeType("__u64") long value) {
        noff(address(), value);
        return this;
    }

    public IOURingZCRXCQE set(IOURingZCRXCQE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingZCRXCQE malloc() {
        return new IOURingZCRXCQE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingZCRXCQE calloc() {
        return new IOURingZCRXCQE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingZCRXCQE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXCQE(MemoryUtil.memAddress(container), container);
    }

    public static IOURingZCRXCQE create(long address) {
        return new IOURingZCRXCQE(address, null);
    }

    public static IOURingZCRXCQE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingZCRXCQE(address, null);
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

    public static IOURingZCRXCQE malloc(MemoryStack stack) {
        return new IOURingZCRXCQE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingZCRXCQE calloc(MemoryStack stack) {
        return new IOURingZCRXCQE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long n__pad(long struct) {
        return MemoryUtil.memGetLong(struct + __PAD);
    }

    public static void noff(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFF, value);
    }

    public static void n__pad(long struct, long value) {
        MemoryUtil.memPutLong(struct + __PAD, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXCQE$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingZCRXCQE, Buffer> implements NativeResource {
        private static final IOURingZCRXCQE ELEMENT_FACTORY = IOURingZCRXCQE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingZCRXCQE.SIZEOF);
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
        public IOURingZCRXCQE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long off() {
            return IOURingZCRXCQE.noff(address());
        }

        public Buffer off(@NativeType("__u64") long value) {
            IOURingZCRXCQE.noff(address(), value);
            return this;
        }
    }
}
