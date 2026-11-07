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

@NativeType("struct io_uring_zcrx_offsets")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXOffsets.class */
public class IOURingZCRXOffsets extends Struct<IOURingZCRXOffsets> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEAD;
    public static final int TAIL;
    public static final int RQES;
    public static final int __RESV2;
    public static final int __RESV;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __array(8, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEAD = layout.offsetof(0);
        TAIL = layout.offsetof(1);
        RQES = layout.offsetof(2);
        __RESV2 = layout.offsetof(3);
        __RESV = layout.offsetof(4);
    }

    protected IOURingZCRXOffsets(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingZCRXOffsets create(long address, ByteBuffer container) {
        return new IOURingZCRXOffsets(address, container);
    }

    public IOURingZCRXOffsets(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int head() {
        return nhead(address());
    }

    @NativeType("__u32")
    public int tail() {
        return ntail(address());
    }

    @NativeType("__u32")
    public int rqes() {
        return nrqes(address());
    }

    public IOURingZCRXOffsets head(@NativeType("__u32") int value) {
        nhead(address(), value);
        return this;
    }

    public IOURingZCRXOffsets tail(@NativeType("__u32") int value) {
        ntail(address(), value);
        return this;
    }

    public IOURingZCRXOffsets rqes(@NativeType("__u32") int value) {
        nrqes(address(), value);
        return this;
    }

    public IOURingZCRXOffsets set(int head, int tail, int rqes) {
        head(head);
        tail(tail);
        rqes(rqes);
        return this;
    }

    public IOURingZCRXOffsets set(IOURingZCRXOffsets src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingZCRXOffsets malloc() {
        return new IOURingZCRXOffsets(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingZCRXOffsets calloc() {
        return new IOURingZCRXOffsets(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingZCRXOffsets create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXOffsets(MemoryUtil.memAddress(container), container);
    }

    public static IOURingZCRXOffsets create(long address) {
        return new IOURingZCRXOffsets(address, null);
    }

    public static IOURingZCRXOffsets createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingZCRXOffsets(address, null);
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

    public static IOURingZCRXOffsets malloc(MemoryStack stack) {
        return new IOURingZCRXOffsets(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingZCRXOffsets calloc(MemoryStack stack) {
        return new IOURingZCRXOffsets(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nhead(long struct) {
        return MemoryUtil.memGetInt(struct + HEAD);
    }

    public static int ntail(long struct) {
        return MemoryUtil.memGetInt(struct + TAIL);
    }

    public static int nrqes(long struct) {
        return MemoryUtil.memGetInt(struct + RQES);
    }

    public static int n__resv2(long struct) {
        return MemoryUtil.memGetInt(struct + __RESV2);
    }

    public static LongBuffer n__resv(long struct) {
        return MemoryUtil.memLongBuffer(struct + __RESV, 2);
    }

    public static long n__resv(long struct, int index) {
        return MemoryUtil.memGetLong(struct + __RESV + (Checks.check(index, 2) * 8));
    }

    public static void nhead(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEAD, value);
    }

    public static void ntail(long struct, int value) {
        MemoryUtil.memPutInt(struct + TAIL, value);
    }

    public static void nrqes(long struct, int value) {
        MemoryUtil.memPutInt(struct + RQES, value);
    }

    public static void n__resv2(long struct, int value) {
        MemoryUtil.memPutInt(struct + __RESV2, value);
    }

    public static void n__resv(long struct, LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + __RESV, value.remaining() * 8);
    }

    public static void n__resv(long struct, int index, long value) {
        MemoryUtil.memPutLong(struct + __RESV + (Checks.check(index, 2) * 8), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXOffsets$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingZCRXOffsets, Buffer> implements NativeResource {
        private static final IOURingZCRXOffsets ELEMENT_FACTORY = IOURingZCRXOffsets.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingZCRXOffsets.SIZEOF);
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
        public IOURingZCRXOffsets getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int head() {
            return IOURingZCRXOffsets.nhead(address());
        }

        @NativeType("__u32")
        public int tail() {
            return IOURingZCRXOffsets.ntail(address());
        }

        @NativeType("__u32")
        public int rqes() {
            return IOURingZCRXOffsets.nrqes(address());
        }

        public Buffer head(@NativeType("__u32") int value) {
            IOURingZCRXOffsets.nhead(address(), value);
            return this;
        }

        public Buffer tail(@NativeType("__u32") int value) {
            IOURingZCRXOffsets.ntail(address(), value);
            return this;
        }

        public Buffer rqes(@NativeType("__u32") int value) {
            IOURingZCRXOffsets.nrqes(address(), value);
            return this;
        }
    }
}
