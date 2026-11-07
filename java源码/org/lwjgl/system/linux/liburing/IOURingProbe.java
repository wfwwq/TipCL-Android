package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.system.linux.liburing.IOURingProbeOp;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingProbe.class
 */
@NativeType("struct io_uring_probe")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingProbe.class */
public class IOURingProbe extends Struct<IOURingProbe> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LAST_OP;
    public static final int OPS_LEN;
    public static final int RESV;
    public static final int RESV2;
    public static final int OPS;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(2), __array(4, 3), __array(IOURingProbeOp.SIZEOF, IOURingProbeOp.ALIGNOF, 0));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LAST_OP = layout.offsetof(0);
        OPS_LEN = layout.offsetof(1);
        RESV = layout.offsetof(2);
        RESV2 = layout.offsetof(3);
        OPS = layout.offsetof(4);
    }

    protected IOURingProbe(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingProbe create(long address, ByteBuffer container) {
        return new IOURingProbe(address, container);
    }

    public IOURingProbe(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u8")
    public byte last_op() {
        return nlast_op(address());
    }

    @NativeType("__u8")
    public byte ops_len() {
        return nops_len(address());
    }

    @NativeType("struct io_uring_probe_op[0]")
    public IOURingProbeOp.Buffer ops() {
        return nops(address());
    }

    @NativeType("struct io_uring_probe_op")
    public IOURingProbeOp ops(int index) {
        return nops(address(), index);
    }

    public IOURingProbe last_op(@NativeType("__u8") byte value) {
        nlast_op(address(), value);
        return this;
    }

    public IOURingProbe ops_len(@NativeType("__u8") byte value) {
        nops_len(address(), value);
        return this;
    }

    public IOURingProbe ops(@NativeType("struct io_uring_probe_op[0]") IOURingProbeOp.Buffer value) {
        nops(address(), value);
        return this;
    }

    public IOURingProbe ops(int index, @NativeType("struct io_uring_probe_op") IOURingProbeOp value) {
        nops(address(), index, value);
        return this;
    }

    public IOURingProbe ops(Consumer<IOURingProbeOp.Buffer> consumer) {
        consumer.accept(ops());
        return this;
    }

    public IOURingProbe ops(int index, Consumer<IOURingProbeOp> consumer) {
        consumer.accept(ops(index));
        return this;
    }

    public IOURingProbe set(byte last_op, byte ops_len, IOURingProbeOp.Buffer ops) {
        last_op(last_op);
        ops_len(ops_len);
        ops(ops);
        return this;
    }

    public IOURingProbe set(IOURingProbe src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingProbe malloc() {
        return new IOURingProbe(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingProbe calloc() {
        return new IOURingProbe(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingProbe create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingProbe(MemoryUtil.memAddress(container), container);
    }

    public static IOURingProbe create(long address) {
        return new IOURingProbe(address, null);
    }

    public static IOURingProbe createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingProbe(address, null);
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

    public static IOURingProbe malloc(MemoryStack stack) {
        return new IOURingProbe(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingProbe calloc(MemoryStack stack) {
        return new IOURingProbe(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte nlast_op(long struct) {
        return MemoryUtil.memGetByte(struct + LAST_OP);
    }

    public static byte nops_len(long struct) {
        return MemoryUtil.memGetByte(struct + OPS_LEN);
    }

    public static short nresv(long struct) {
        return MemoryUtil.memGetShort(struct + RESV);
    }

    public static IntBuffer nresv2(long struct) {
        return MemoryUtil.memIntBuffer(struct + RESV2, 3);
    }

    public static int nresv2(long struct, int index) {
        return MemoryUtil.memGetInt(struct + RESV2 + (Checks.check(index, 3) * 4));
    }

    public static IOURingProbeOp.Buffer nops(long struct) {
        return IOURingProbeOp.create(struct + OPS, 0);
    }

    public static IOURingProbeOp nops(long struct, int index) {
        return IOURingProbeOp.create(struct + OPS + (Checks.check(index, 0) * IOURingProbeOp.SIZEOF));
    }

    public static void nlast_op(long struct, byte value) {
        MemoryUtil.memPutByte(struct + LAST_OP, value);
    }

    public static void nops_len(long struct, byte value) {
        MemoryUtil.memPutByte(struct + OPS_LEN, value);
    }

    public static void nresv(long struct, short value) {
        MemoryUtil.memPutShort(struct + RESV, value);
    }

    public static void nresv2(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESV2, value.remaining() * 4);
    }

    public static void nresv2(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + RESV2 + (Checks.check(index, 3) * 4), value);
    }

    public static void nops(long struct, IOURingProbeOp.Buffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 0);
        }
        MemoryUtil.memCopy(value.address(), struct + OPS, value.remaining() * IOURingProbeOp.SIZEOF);
    }

    public static void nops(long struct, int index, IOURingProbeOp value) {
        MemoryUtil.memCopy(value.address(), struct + OPS + (Checks.check(index, 0) * IOURingProbeOp.SIZEOF), IOURingProbeOp.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingProbe$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingProbe$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingProbe, Buffer> implements NativeResource {
        private static final IOURingProbe ELEMENT_FACTORY = IOURingProbe.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingProbe.SIZEOF);
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
        public IOURingProbe getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u8")
        public byte last_op() {
            return IOURingProbe.nlast_op(address());
        }

        @NativeType("__u8")
        public byte ops_len() {
            return IOURingProbe.nops_len(address());
        }

        @NativeType("struct io_uring_probe_op[0]")
        public IOURingProbeOp.Buffer ops() {
            return IOURingProbe.nops(address());
        }

        @NativeType("struct io_uring_probe_op")
        public IOURingProbeOp ops(int index) {
            return IOURingProbe.nops(address(), index);
        }

        public Buffer last_op(@NativeType("__u8") byte value) {
            IOURingProbe.nlast_op(address(), value);
            return this;
        }

        public Buffer ops_len(@NativeType("__u8") byte value) {
            IOURingProbe.nops_len(address(), value);
            return this;
        }

        public Buffer ops(@NativeType("struct io_uring_probe_op[0]") IOURingProbeOp.Buffer value) {
            IOURingProbe.nops(address(), value);
            return this;
        }

        public Buffer ops(int index, @NativeType("struct io_uring_probe_op") IOURingProbeOp value) {
            IOURingProbe.nops(address(), index, value);
            return this;
        }

        public Buffer ops(Consumer<IOURingProbeOp.Buffer> consumer) {
            consumer.accept(ops());
            return this;
        }

        public Buffer ops(int index, Consumer<IOURingProbeOp> consumer) {
            consumer.accept(ops(index));
            return this;
        }
    }
}
