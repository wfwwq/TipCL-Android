package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct io_uring_query_opcode")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingQueryOpcode.class */
public class IOURingQueryOpcode extends Struct<IOURingQueryOpcode> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NR_REQUEST_OPCODES;
    public static final int NR_REGISTER_OPCODES;
    public static final int FEATURE_FLAGS;
    public static final int RING_SETUP_FLAGS;
    public static final int ENTER_FLAGS;
    public static final int SQE_FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NR_REQUEST_OPCODES = layout.offsetof(0);
        NR_REGISTER_OPCODES = layout.offsetof(1);
        FEATURE_FLAGS = layout.offsetof(2);
        RING_SETUP_FLAGS = layout.offsetof(3);
        ENTER_FLAGS = layout.offsetof(4);
        SQE_FLAGS = layout.offsetof(5);
    }

    protected IOURingQueryOpcode(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingQueryOpcode create(long address, ByteBuffer container) {
        return new IOURingQueryOpcode(address, container);
    }

    public IOURingQueryOpcode(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int nr_request_opcodes() {
        return nnr_request_opcodes(address());
    }

    @NativeType("__u32")
    public int nr_register_opcodes() {
        return nnr_register_opcodes(address());
    }

    @NativeType("__u64")
    public long feature_flags() {
        return nfeature_flags(address());
    }

    @NativeType("__u64")
    public long ring_setup_flags() {
        return nring_setup_flags(address());
    }

    @NativeType("__u64")
    public long enter_flags() {
        return nenter_flags(address());
    }

    @NativeType("__u64")
    public long sqe_flags() {
        return nsqe_flags(address());
    }

    public IOURingQueryOpcode nr_request_opcodes(@NativeType("__u32") int value) {
        nnr_request_opcodes(address(), value);
        return this;
    }

    public IOURingQueryOpcode nr_register_opcodes(@NativeType("__u32") int value) {
        nnr_register_opcodes(address(), value);
        return this;
    }

    public IOURingQueryOpcode feature_flags(@NativeType("__u64") long value) {
        nfeature_flags(address(), value);
        return this;
    }

    public IOURingQueryOpcode ring_setup_flags(@NativeType("__u64") long value) {
        nring_setup_flags(address(), value);
        return this;
    }

    public IOURingQueryOpcode enter_flags(@NativeType("__u64") long value) {
        nenter_flags(address(), value);
        return this;
    }

    public IOURingQueryOpcode sqe_flags(@NativeType("__u64") long value) {
        nsqe_flags(address(), value);
        return this;
    }

    public IOURingQueryOpcode set(int nr_request_opcodes, int nr_register_opcodes, long feature_flags, long ring_setup_flags, long enter_flags, long sqe_flags) {
        nr_request_opcodes(nr_request_opcodes);
        nr_register_opcodes(nr_register_opcodes);
        feature_flags(feature_flags);
        ring_setup_flags(ring_setup_flags);
        enter_flags(enter_flags);
        sqe_flags(sqe_flags);
        return this;
    }

    public IOURingQueryOpcode set(IOURingQueryOpcode src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingQueryOpcode malloc() {
        return new IOURingQueryOpcode(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingQueryOpcode calloc() {
        return new IOURingQueryOpcode(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingQueryOpcode create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingQueryOpcode(MemoryUtil.memAddress(container), container);
    }

    public static IOURingQueryOpcode create(long address) {
        return new IOURingQueryOpcode(address, null);
    }

    public static IOURingQueryOpcode createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingQueryOpcode(address, null);
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

    public static IOURingQueryOpcode malloc(MemoryStack stack) {
        return new IOURingQueryOpcode(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingQueryOpcode calloc(MemoryStack stack) {
        return new IOURingQueryOpcode(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nnr_request_opcodes(long struct) {
        return MemoryUtil.memGetInt(struct + NR_REQUEST_OPCODES);
    }

    public static int nnr_register_opcodes(long struct) {
        return MemoryUtil.memGetInt(struct + NR_REGISTER_OPCODES);
    }

    public static long nfeature_flags(long struct) {
        return MemoryUtil.memGetLong(struct + FEATURE_FLAGS);
    }

    public static long nring_setup_flags(long struct) {
        return MemoryUtil.memGetLong(struct + RING_SETUP_FLAGS);
    }

    public static long nenter_flags(long struct) {
        return MemoryUtil.memGetLong(struct + ENTER_FLAGS);
    }

    public static long nsqe_flags(long struct) {
        return MemoryUtil.memGetLong(struct + SQE_FLAGS);
    }

    public static void nnr_request_opcodes(long struct, int value) {
        MemoryUtil.memPutInt(struct + NR_REQUEST_OPCODES, value);
    }

    public static void nnr_register_opcodes(long struct, int value) {
        MemoryUtil.memPutInt(struct + NR_REGISTER_OPCODES, value);
    }

    public static void nfeature_flags(long struct, long value) {
        MemoryUtil.memPutLong(struct + FEATURE_FLAGS, value);
    }

    public static void nring_setup_flags(long struct, long value) {
        MemoryUtil.memPutLong(struct + RING_SETUP_FLAGS, value);
    }

    public static void nenter_flags(long struct, long value) {
        MemoryUtil.memPutLong(struct + ENTER_FLAGS, value);
    }

    public static void nsqe_flags(long struct, long value) {
        MemoryUtil.memPutLong(struct + SQE_FLAGS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingQueryOpcode$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingQueryOpcode, Buffer> implements NativeResource {
        private static final IOURingQueryOpcode ELEMENT_FACTORY = IOURingQueryOpcode.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingQueryOpcode.SIZEOF);
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
        public IOURingQueryOpcode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int nr_request_opcodes() {
            return IOURingQueryOpcode.nnr_request_opcodes(address());
        }

        @NativeType("__u32")
        public int nr_register_opcodes() {
            return IOURingQueryOpcode.nnr_register_opcodes(address());
        }

        @NativeType("__u64")
        public long feature_flags() {
            return IOURingQueryOpcode.nfeature_flags(address());
        }

        @NativeType("__u64")
        public long ring_setup_flags() {
            return IOURingQueryOpcode.nring_setup_flags(address());
        }

        @NativeType("__u64")
        public long enter_flags() {
            return IOURingQueryOpcode.nenter_flags(address());
        }

        @NativeType("__u64")
        public long sqe_flags() {
            return IOURingQueryOpcode.nsqe_flags(address());
        }

        public Buffer nr_request_opcodes(@NativeType("__u32") int value) {
            IOURingQueryOpcode.nnr_request_opcodes(address(), value);
            return this;
        }

        public Buffer nr_register_opcodes(@NativeType("__u32") int value) {
            IOURingQueryOpcode.nnr_register_opcodes(address(), value);
            return this;
        }

        public Buffer feature_flags(@NativeType("__u64") long value) {
            IOURingQueryOpcode.nfeature_flags(address(), value);
            return this;
        }

        public Buffer ring_setup_flags(@NativeType("__u64") long value) {
            IOURingQueryOpcode.nring_setup_flags(address(), value);
            return this;
        }

        public Buffer enter_flags(@NativeType("__u64") long value) {
            IOURingQueryOpcode.nenter_flags(address(), value);
            return this;
        }

        public Buffer sqe_flags(@NativeType("__u64") long value) {
            IOURingQueryOpcode.nsqe_flags(address(), value);
            return this;
        }
    }
}
