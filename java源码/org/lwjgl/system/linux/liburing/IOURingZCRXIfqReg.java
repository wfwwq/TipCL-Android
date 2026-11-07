package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct io_uring_zcrx_ifq_reg")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXIfqReg.class */
public class IOURingZCRXIfqReg extends Struct<IOURingZCRXIfqReg> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int IF_IDX;
    public static final int IF_RXQ;
    public static final int RQ_ENTRIES;
    public static final int FLAGS;
    public static final int AREA_PTR;
    public static final int REGION_PTR;
    public static final int OFFSETS;
    public static final int ZCRX_ID;
    public static final int __RESV2;
    public static final int __RESV;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(8), __member(8), __member(IOURingZCRXOffsets.SIZEOF, IOURingZCRXOffsets.ALIGNOF), __member(4), __member(4), __array(8, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        IF_IDX = layout.offsetof(0);
        IF_RXQ = layout.offsetof(1);
        RQ_ENTRIES = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        AREA_PTR = layout.offsetof(4);
        REGION_PTR = layout.offsetof(5);
        OFFSETS = layout.offsetof(6);
        ZCRX_ID = layout.offsetof(7);
        __RESV2 = layout.offsetof(8);
        __RESV = layout.offsetof(9);
    }

    protected IOURingZCRXIfqReg(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingZCRXIfqReg create(long address, ByteBuffer container) {
        return new IOURingZCRXIfqReg(address, container);
    }

    public IOURingZCRXIfqReg(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int if_idx() {
        return nif_idx(address());
    }

    @NativeType("__u32")
    public int if_rxq() {
        return nif_rxq(address());
    }

    @NativeType("__u32")
    public int rq_entries() {
        return nrq_entries(address());
    }

    @NativeType("__u32")
    public int flags() {
        return nflags(address());
    }

    @NativeType("__u64")
    public long area_ptr() {
        return narea_ptr(address());
    }

    @NativeType("__u64")
    public long region_ptr() {
        return nregion_ptr(address());
    }

    @NativeType("struct io_uring_zcrx_offsets")
    public IOURingZCRXOffsets offsets() {
        return noffsets(address());
    }

    @NativeType("__u32")
    public int zcrx_id() {
        return nzcrx_id(address());
    }

    public IOURingZCRXIfqReg if_idx(@NativeType("__u32") int value) {
        nif_idx(address(), value);
        return this;
    }

    public IOURingZCRXIfqReg if_rxq(@NativeType("__u32") int value) {
        nif_rxq(address(), value);
        return this;
    }

    public IOURingZCRXIfqReg rq_entries(@NativeType("__u32") int value) {
        nrq_entries(address(), value);
        return this;
    }

    public IOURingZCRXIfqReg flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOURingZCRXIfqReg area_ptr(@NativeType("__u64") long value) {
        narea_ptr(address(), value);
        return this;
    }

    public IOURingZCRXIfqReg region_ptr(@NativeType("__u64") long value) {
        nregion_ptr(address(), value);
        return this;
    }

    public IOURingZCRXIfqReg offsets(@NativeType("struct io_uring_zcrx_offsets") IOURingZCRXOffsets value) {
        noffsets(address(), value);
        return this;
    }

    public IOURingZCRXIfqReg offsets(Consumer<IOURingZCRXOffsets> consumer) {
        consumer.accept(offsets());
        return this;
    }

    public IOURingZCRXIfqReg zcrx_id(@NativeType("__u32") int value) {
        nzcrx_id(address(), value);
        return this;
    }

    public IOURingZCRXIfqReg set(int if_idx, int if_rxq, int rq_entries, int flags, long area_ptr, long region_ptr, IOURingZCRXOffsets offsets, int zcrx_id) {
        if_idx(if_idx);
        if_rxq(if_rxq);
        rq_entries(rq_entries);
        flags(flags);
        area_ptr(area_ptr);
        region_ptr(region_ptr);
        offsets(offsets);
        zcrx_id(zcrx_id);
        return this;
    }

    public IOURingZCRXIfqReg set(IOURingZCRXIfqReg src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingZCRXIfqReg malloc() {
        return new IOURingZCRXIfqReg(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingZCRXIfqReg calloc() {
        return new IOURingZCRXIfqReg(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingZCRXIfqReg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXIfqReg(MemoryUtil.memAddress(container), container);
    }

    public static IOURingZCRXIfqReg create(long address) {
        return new IOURingZCRXIfqReg(address, null);
    }

    public static IOURingZCRXIfqReg createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingZCRXIfqReg(address, null);
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

    public static IOURingZCRXIfqReg malloc(MemoryStack stack) {
        return new IOURingZCRXIfqReg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingZCRXIfqReg calloc(MemoryStack stack) {
        return new IOURingZCRXIfqReg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nif_idx(long struct) {
        return MemoryUtil.memGetInt(struct + IF_IDX);
    }

    public static int nif_rxq(long struct) {
        return MemoryUtil.memGetInt(struct + IF_RXQ);
    }

    public static int nrq_entries(long struct) {
        return MemoryUtil.memGetInt(struct + RQ_ENTRIES);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long narea_ptr(long struct) {
        return MemoryUtil.memGetLong(struct + AREA_PTR);
    }

    public static long nregion_ptr(long struct) {
        return MemoryUtil.memGetLong(struct + REGION_PTR);
    }

    public static IOURingZCRXOffsets noffsets(long struct) {
        return IOURingZCRXOffsets.create(struct + OFFSETS);
    }

    public static int nzcrx_id(long struct) {
        return MemoryUtil.memGetInt(struct + ZCRX_ID);
    }

    public static int n__resv2(long struct) {
        return MemoryUtil.memGetInt(struct + __RESV2);
    }

    public static LongBuffer n__resv(long struct) {
        return MemoryUtil.memLongBuffer(struct + __RESV, 3);
    }

    public static long n__resv(long struct, int index) {
        return MemoryUtil.memGetLong(struct + __RESV + (Checks.check(index, 3) * 8));
    }

    public static void nif_idx(long struct, int value) {
        MemoryUtil.memPutInt(struct + IF_IDX, value);
    }

    public static void nif_rxq(long struct, int value) {
        MemoryUtil.memPutInt(struct + IF_RXQ, value);
    }

    public static void nrq_entries(long struct, int value) {
        MemoryUtil.memPutInt(struct + RQ_ENTRIES, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void narea_ptr(long struct, long value) {
        MemoryUtil.memPutLong(struct + AREA_PTR, value);
    }

    public static void nregion_ptr(long struct, long value) {
        MemoryUtil.memPutLong(struct + REGION_PTR, value);
    }

    public static void noffsets(long struct, IOURingZCRXOffsets value) {
        MemoryUtil.memCopy(value.address(), struct + OFFSETS, IOURingZCRXOffsets.SIZEOF);
    }

    public static void nzcrx_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + ZCRX_ID, value);
    }

    public static void n__resv2(long struct, int value) {
        MemoryUtil.memPutInt(struct + __RESV2, value);
    }

    public static void n__resv(long struct, LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + __RESV, value.remaining() * 8);
    }

    public static void n__resv(long struct, int index, long value) {
        MemoryUtil.memPutLong(struct + __RESV + (Checks.check(index, 3) * 8), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingZCRXIfqReg$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingZCRXIfqReg, Buffer> implements NativeResource {
        private static final IOURingZCRXIfqReg ELEMENT_FACTORY = IOURingZCRXIfqReg.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingZCRXIfqReg.SIZEOF);
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
        public IOURingZCRXIfqReg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int if_idx() {
            return IOURingZCRXIfqReg.nif_idx(address());
        }

        @NativeType("__u32")
        public int if_rxq() {
            return IOURingZCRXIfqReg.nif_rxq(address());
        }

        @NativeType("__u32")
        public int rq_entries() {
            return IOURingZCRXIfqReg.nrq_entries(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOURingZCRXIfqReg.nflags(address());
        }

        @NativeType("__u64")
        public long area_ptr() {
            return IOURingZCRXIfqReg.narea_ptr(address());
        }

        @NativeType("__u64")
        public long region_ptr() {
            return IOURingZCRXIfqReg.nregion_ptr(address());
        }

        @NativeType("struct io_uring_zcrx_offsets")
        public IOURingZCRXOffsets offsets() {
            return IOURingZCRXIfqReg.noffsets(address());
        }

        @NativeType("__u32")
        public int zcrx_id() {
            return IOURingZCRXIfqReg.nzcrx_id(address());
        }

        public Buffer if_idx(@NativeType("__u32") int value) {
            IOURingZCRXIfqReg.nif_idx(address(), value);
            return this;
        }

        public Buffer if_rxq(@NativeType("__u32") int value) {
            IOURingZCRXIfqReg.nif_rxq(address(), value);
            return this;
        }

        public Buffer rq_entries(@NativeType("__u32") int value) {
            IOURingZCRXIfqReg.nrq_entries(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOURingZCRXIfqReg.nflags(address(), value);
            return this;
        }

        public Buffer area_ptr(@NativeType("__u64") long value) {
            IOURingZCRXIfqReg.narea_ptr(address(), value);
            return this;
        }

        public Buffer region_ptr(@NativeType("__u64") long value) {
            IOURingZCRXIfqReg.nregion_ptr(address(), value);
            return this;
        }

        public Buffer offsets(@NativeType("struct io_uring_zcrx_offsets") IOURingZCRXOffsets value) {
            IOURingZCRXIfqReg.noffsets(address(), value);
            return this;
        }

        public Buffer offsets(Consumer<IOURingZCRXOffsets> consumer) {
            consumer.accept(offsets());
            return this;
        }

        public Buffer zcrx_id(@NativeType("__u32") int value) {
            IOURingZCRXIfqReg.nzcrx_id(address(), value);
            return this;
        }
    }
}
