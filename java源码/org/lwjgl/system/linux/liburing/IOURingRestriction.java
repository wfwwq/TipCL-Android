package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRestriction.class
 */
@NativeType("struct io_uring_restriction")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRestriction.class */
public class IOURingRestriction extends Struct<IOURingRestriction> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OPCODE;
    public static final int REGISTER_OP;
    public static final int SQE_OP;
    public static final int SQE_FLAGS;
    public static final int RESV;
    public static final int RESV2;

    static {
        Struct.Layout layout = __struct(__member(2), __union(__member(1), __member(1), __member(1)), __member(1), __array(4, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OPCODE = layout.offsetof(0);
        REGISTER_OP = layout.offsetof(2);
        SQE_OP = layout.offsetof(3);
        SQE_FLAGS = layout.offsetof(4);
        RESV = layout.offsetof(5);
        RESV2 = layout.offsetof(6);
    }

    protected IOURingRestriction(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingRestriction create(long address, ByteBuffer container) {
        return new IOURingRestriction(address, container);
    }

    public IOURingRestriction(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u16")
    public short opcode() {
        return nopcode(address());
    }

    @NativeType("__u8")
    public byte register_op() {
        return nregister_op(address());
    }

    @NativeType("__u8")
    public byte sqe_op() {
        return nsqe_op(address());
    }

    @NativeType("__u8")
    public byte sqe_flags() {
        return nsqe_flags(address());
    }

    public IOURingRestriction opcode(@NativeType("__u16") short value) {
        nopcode(address(), value);
        return this;
    }

    public IOURingRestriction register_op(@NativeType("__u8") byte value) {
        nregister_op(address(), value);
        return this;
    }

    public IOURingRestriction sqe_op(@NativeType("__u8") byte value) {
        nsqe_op(address(), value);
        return this;
    }

    public IOURingRestriction sqe_flags(@NativeType("__u8") byte value) {
        nsqe_flags(address(), value);
        return this;
    }

    public IOURingRestriction set(IOURingRestriction src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingRestriction malloc() {
        return new IOURingRestriction(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingRestriction calloc() {
        return new IOURingRestriction(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingRestriction create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingRestriction(MemoryUtil.memAddress(container), container);
    }

    public static IOURingRestriction create(long address) {
        return new IOURingRestriction(address, null);
    }

    public static IOURingRestriction createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingRestriction(address, null);
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

    public static IOURingRestriction malloc(MemoryStack stack) {
        return new IOURingRestriction(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingRestriction calloc(MemoryStack stack) {
        return new IOURingRestriction(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nopcode(long struct) {
        return MemoryUtil.memGetShort(struct + OPCODE);
    }

    public static byte nregister_op(long struct) {
        return MemoryUtil.memGetByte(struct + REGISTER_OP);
    }

    public static byte nsqe_op(long struct) {
        return MemoryUtil.memGetByte(struct + SQE_OP);
    }

    public static byte nsqe_flags(long struct) {
        return MemoryUtil.memGetByte(struct + SQE_FLAGS);
    }

    public static byte nresv(long struct) {
        return MemoryUtil.memGetByte(struct + RESV);
    }

    public static IntBuffer nresv2(long struct) {
        return MemoryUtil.memIntBuffer(struct + RESV2, 3);
    }

    public static int nresv2(long struct, int index) {
        return MemoryUtil.memGetInt(struct + RESV2 + (Checks.check(index, 3) * 4));
    }

    public static void nopcode(long struct, short value) {
        MemoryUtil.memPutShort(struct + OPCODE, value);
    }

    public static void nregister_op(long struct, byte value) {
        MemoryUtil.memPutByte(struct + REGISTER_OP, value);
    }

    public static void nsqe_op(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SQE_OP, value);
    }

    public static void nsqe_flags(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SQE_FLAGS, value);
    }

    public static void nresv(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESV, value);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRestriction$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRestriction$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingRestriction, Buffer> implements NativeResource {
        private static final IOURingRestriction ELEMENT_FACTORY = IOURingRestriction.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingRestriction.SIZEOF);
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
        public IOURingRestriction getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u16")
        public short opcode() {
            return IOURingRestriction.nopcode(address());
        }

        @NativeType("__u8")
        public byte register_op() {
            return IOURingRestriction.nregister_op(address());
        }

        @NativeType("__u8")
        public byte sqe_op() {
            return IOURingRestriction.nsqe_op(address());
        }

        @NativeType("__u8")
        public byte sqe_flags() {
            return IOURingRestriction.nsqe_flags(address());
        }

        public Buffer opcode(@NativeType("__u16") short value) {
            IOURingRestriction.nopcode(address(), value);
            return this;
        }

        public Buffer register_op(@NativeType("__u8") byte value) {
            IOURingRestriction.nregister_op(address(), value);
            return this;
        }

        public Buffer sqe_op(@NativeType("__u8") byte value) {
            IOURingRestriction.nsqe_op(address(), value);
            return this;
        }

        public Buffer sqe_flags(@NativeType("__u8") byte value) {
            IOURingRestriction.nsqe_flags(address(), value);
            return this;
        }
    }
}
