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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingProbeOp.class
 */
@NativeType("struct io_uring_probe_op")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingProbeOp.class */
public class IOURingProbeOp extends Struct<IOURingProbeOp> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OP;
    public static final int RESV;
    public static final int FLAGS;
    public static final int RESV2;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(2), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OP = layout.offsetof(0);
        RESV = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RESV2 = layout.offsetof(3);
    }

    protected IOURingProbeOp(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingProbeOp create(long address, ByteBuffer container) {
        return new IOURingProbeOp(address, container);
    }

    public IOURingProbeOp(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u8")
    public byte op() {
        return nop(address());
    }

    @NativeType("__u16")
    public short flags() {
        return nflags(address());
    }

    public IOURingProbeOp op(@NativeType("__u8") byte value) {
        nop(address(), value);
        return this;
    }

    public IOURingProbeOp flags(@NativeType("__u16") short value) {
        nflags(address(), value);
        return this;
    }

    public IOURingProbeOp set(byte op, short flags) {
        op(op);
        flags(flags);
        return this;
    }

    public IOURingProbeOp set(IOURingProbeOp src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingProbeOp malloc() {
        return new IOURingProbeOp(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingProbeOp calloc() {
        return new IOURingProbeOp(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingProbeOp create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingProbeOp(MemoryUtil.memAddress(container), container);
    }

    public static IOURingProbeOp create(long address) {
        return new IOURingProbeOp(address, null);
    }

    public static IOURingProbeOp createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingProbeOp(address, null);
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

    public static IOURingProbeOp malloc(MemoryStack stack) {
        return new IOURingProbeOp(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingProbeOp calloc(MemoryStack stack) {
        return new IOURingProbeOp(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte nop(long struct) {
        return MemoryUtil.memGetByte(struct + OP);
    }

    public static byte nresv(long struct) {
        return MemoryUtil.memGetByte(struct + RESV);
    }

    public static short nflags(long struct) {
        return MemoryUtil.memGetShort(struct + FLAGS);
    }

    public static int nresv2(long struct) {
        return MemoryUtil.memGetInt(struct + RESV2);
    }

    public static void nop(long struct, byte value) {
        MemoryUtil.memPutByte(struct + OP, value);
    }

    public static void nresv(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESV, value);
    }

    public static void nflags(long struct, short value) {
        MemoryUtil.memPutShort(struct + FLAGS, value);
    }

    public static void nresv2(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESV2, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingProbeOp$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingProbeOp$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingProbeOp, Buffer> implements NativeResource {
        private static final IOURingProbeOp ELEMENT_FACTORY = IOURingProbeOp.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingProbeOp.SIZEOF);
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
        public IOURingProbeOp getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u8")
        public byte op() {
            return IOURingProbeOp.nop(address());
        }

        @NativeType("__u16")
        public short flags() {
            return IOURingProbeOp.nflags(address());
        }

        public Buffer op(@NativeType("__u8") byte value) {
            IOURingProbeOp.nop(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u16") short value) {
            IOURingProbeOp.nflags(address(), value);
            return this;
        }
    }
}
