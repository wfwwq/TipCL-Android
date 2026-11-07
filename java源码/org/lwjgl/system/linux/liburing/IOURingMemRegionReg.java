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

@NativeType("struct io_uring_mem_region_reg")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingMemRegionReg.class */
public class IOURingMemRegionReg extends Struct<IOURingMemRegionReg> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int REGION_UPTR;
    public static final int FLAGS;
    public static final int __RESV;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __array(8, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        REGION_UPTR = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        __RESV = layout.offsetof(2);
    }

    protected IOURingMemRegionReg(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingMemRegionReg create(long address, ByteBuffer container) {
        return new IOURingMemRegionReg(address, container);
    }

    public IOURingMemRegionReg(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u64")
    public long region_uptr() {
        return nregion_uptr(address());
    }

    @NativeType("__u64")
    public long flags() {
        return nflags(address());
    }

    public IOURingMemRegionReg region_uptr(@NativeType("__u64") long value) {
        nregion_uptr(address(), value);
        return this;
    }

    public IOURingMemRegionReg flags(@NativeType("__u64") long value) {
        nflags(address(), value);
        return this;
    }

    public IOURingMemRegionReg set(long region_uptr, long flags) {
        region_uptr(region_uptr);
        flags(flags);
        return this;
    }

    public IOURingMemRegionReg set(IOURingMemRegionReg src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingMemRegionReg malloc() {
        return new IOURingMemRegionReg(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingMemRegionReg calloc() {
        return new IOURingMemRegionReg(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingMemRegionReg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingMemRegionReg(MemoryUtil.memAddress(container), container);
    }

    public static IOURingMemRegionReg create(long address) {
        return new IOURingMemRegionReg(address, null);
    }

    public static IOURingMemRegionReg createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingMemRegionReg(address, null);
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

    public static IOURingMemRegionReg malloc(MemoryStack stack) {
        return new IOURingMemRegionReg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingMemRegionReg calloc(MemoryStack stack) {
        return new IOURingMemRegionReg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nregion_uptr(long struct) {
        return MemoryUtil.memGetLong(struct + REGION_UPTR);
    }

    public static long nflags(long struct) {
        return MemoryUtil.memGetLong(struct + FLAGS);
    }

    public static LongBuffer n__resv(long struct) {
        return MemoryUtil.memLongBuffer(struct + __RESV, 2);
    }

    public static long n__resv(long struct, int index) {
        return MemoryUtil.memGetLong(struct + __RESV + (Checks.check(index, 2) * 8));
    }

    public static void nregion_uptr(long struct, long value) {
        MemoryUtil.memPutLong(struct + REGION_UPTR, value);
    }

    public static void nflags(long struct, long value) {
        MemoryUtil.memPutLong(struct + FLAGS, value);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingMemRegionReg$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingMemRegionReg, Buffer> implements NativeResource {
        private static final IOURingMemRegionReg ELEMENT_FACTORY = IOURingMemRegionReg.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingMemRegionReg.SIZEOF);
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
        public IOURingMemRegionReg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long region_uptr() {
            return IOURingMemRegionReg.nregion_uptr(address());
        }

        @NativeType("__u64")
        public long flags() {
            return IOURingMemRegionReg.nflags(address());
        }

        public Buffer region_uptr(@NativeType("__u64") long value) {
            IOURingMemRegionReg.nregion_uptr(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u64") long value) {
            IOURingMemRegionReg.nflags(address(), value);
            return this;
        }
    }
}
