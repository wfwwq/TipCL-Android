package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct io_uring_napi")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingNAPI.class */
public class IOURingNAPI extends Struct<IOURingNAPI> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUSY_POLL_TO;
    public static final int PREFER_BUSY_POLL;
    public static final int PAD;
    public static final int RESV;

    static {
        Struct.Layout layout = __struct(__member(4), __member(1), __array(1, 3), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUSY_POLL_TO = layout.offsetof(0);
        PREFER_BUSY_POLL = layout.offsetof(1);
        PAD = layout.offsetof(2);
        RESV = layout.offsetof(3);
    }

    protected IOURingNAPI(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingNAPI create(long address, ByteBuffer container) {
        return new IOURingNAPI(address, container);
    }

    public IOURingNAPI(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int busy_poll_to() {
        return nbusy_poll_to(address());
    }

    @NativeType("__u8")
    public byte prefer_busy_poll() {
        return nprefer_busy_poll(address());
    }

    public IOURingNAPI busy_poll_to(@NativeType("__u32") int value) {
        nbusy_poll_to(address(), value);
        return this;
    }

    public IOURingNAPI prefer_busy_poll(@NativeType("__u8") byte value) {
        nprefer_busy_poll(address(), value);
        return this;
    }

    public IOURingNAPI set(int busy_poll_to, byte prefer_busy_poll) {
        busy_poll_to(busy_poll_to);
        prefer_busy_poll(prefer_busy_poll);
        return this;
    }

    public IOURingNAPI set(IOURingNAPI src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingNAPI malloc() {
        return new IOURingNAPI(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingNAPI calloc() {
        return new IOURingNAPI(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingNAPI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingNAPI(MemoryUtil.memAddress(container), container);
    }

    public static IOURingNAPI create(long address) {
        return new IOURingNAPI(address, null);
    }

    public static IOURingNAPI createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingNAPI(address, null);
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

    public static IOURingNAPI malloc(MemoryStack stack) {
        return new IOURingNAPI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingNAPI calloc(MemoryStack stack) {
        return new IOURingNAPI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbusy_poll_to(long struct) {
        return MemoryUtil.memGetInt(struct + BUSY_POLL_TO);
    }

    public static byte nprefer_busy_poll(long struct) {
        return MemoryUtil.memGetByte(struct + PREFER_BUSY_POLL);
    }

    public static ByteBuffer npad(long struct) {
        return MemoryUtil.memByteBuffer(struct + PAD, 3);
    }

    public static byte npad(long struct, int index) {
        return MemoryUtil.memGetByte(struct + PAD + (Checks.check(index, 3) * 1));
    }

    public static long nresv(long struct) {
        return MemoryUtil.memGetLong(struct + RESV);
    }

    public static void nbusy_poll_to(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUSY_POLL_TO, value);
    }

    public static void nprefer_busy_poll(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PREFER_BUSY_POLL, value);
    }

    public static void npad(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PAD, value.remaining() * 1);
    }

    public static void npad(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + PAD + (Checks.check(index, 3) * 1), value);
    }

    public static void nresv(long struct, long value) {
        MemoryUtil.memPutLong(struct + RESV, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingNAPI$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingNAPI, Buffer> implements NativeResource {
        private static final IOURingNAPI ELEMENT_FACTORY = IOURingNAPI.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingNAPI.SIZEOF);
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
        public IOURingNAPI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int busy_poll_to() {
            return IOURingNAPI.nbusy_poll_to(address());
        }

        @NativeType("__u8")
        public byte prefer_busy_poll() {
            return IOURingNAPI.nprefer_busy_poll(address());
        }

        public Buffer busy_poll_to(@NativeType("__u32") int value) {
            IOURingNAPI.nbusy_poll_to(address(), value);
            return this;
        }

        public Buffer prefer_busy_poll(@NativeType("__u8") byte value) {
            IOURingNAPI.nprefer_busy_poll(address(), value);
            return this;
        }
    }
}
