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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingParams.class
 */
@NativeType("struct io_uring_params")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingParams.class */
public class IOURingParams extends Struct<IOURingParams> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SQ_ENTRIES;
    public static final int CQ_ENTRIES;
    public static final int FLAGS;
    public static final int SQ_THREAD_CPU;
    public static final int SQ_THREAD_IDLE;
    public static final int FEATURES;
    public static final int WQ_FD;
    public static final int RESV;
    public static final int SQ_OFF;
    public static final int CQ_OFF;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __array(4, 3), __member(IOSQRingOffsets.SIZEOF, IOSQRingOffsets.ALIGNOF), __member(IOCQRingOffsets.SIZEOF, IOCQRingOffsets.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SQ_ENTRIES = layout.offsetof(0);
        CQ_ENTRIES = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SQ_THREAD_CPU = layout.offsetof(3);
        SQ_THREAD_IDLE = layout.offsetof(4);
        FEATURES = layout.offsetof(5);
        WQ_FD = layout.offsetof(6);
        RESV = layout.offsetof(7);
        SQ_OFF = layout.offsetof(8);
        CQ_OFF = layout.offsetof(9);
    }

    protected IOURingParams(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingParams create(long address, ByteBuffer container) {
        return new IOURingParams(address, container);
    }

    public IOURingParams(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int sq_entries() {
        return nsq_entries(address());
    }

    @NativeType("__u32")
    public int cq_entries() {
        return ncq_entries(address());
    }

    @NativeType("__u32")
    public int flags() {
        return nflags(address());
    }

    @NativeType("__u32")
    public int sq_thread_cpu() {
        return nsq_thread_cpu(address());
    }

    @NativeType("__u32")
    public int sq_thread_idle() {
        return nsq_thread_idle(address());
    }

    @NativeType("__u32")
    public int features() {
        return nfeatures(address());
    }

    @NativeType("__u32")
    public int wq_fd() {
        return nwq_fd(address());
    }

    @NativeType("struct io_sqring_offsets")
    public IOSQRingOffsets sq_off() {
        return nsq_off(address());
    }

    @NativeType("struct io_cqring_offsets")
    public IOCQRingOffsets cq_off() {
        return ncq_off(address());
    }

    public IOURingParams sq_entries(@NativeType("__u32") int value) {
        nsq_entries(address(), value);
        return this;
    }

    public IOURingParams cq_entries(@NativeType("__u32") int value) {
        ncq_entries(address(), value);
        return this;
    }

    public IOURingParams flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOURingParams sq_thread_cpu(@NativeType("__u32") int value) {
        nsq_thread_cpu(address(), value);
        return this;
    }

    public IOURingParams sq_thread_idle(@NativeType("__u32") int value) {
        nsq_thread_idle(address(), value);
        return this;
    }

    public IOURingParams features(@NativeType("__u32") int value) {
        nfeatures(address(), value);
        return this;
    }

    public IOURingParams wq_fd(@NativeType("__u32") int value) {
        nwq_fd(address(), value);
        return this;
    }

    public IOURingParams sq_off(@NativeType("struct io_sqring_offsets") IOSQRingOffsets value) {
        nsq_off(address(), value);
        return this;
    }

    public IOURingParams sq_off(Consumer<IOSQRingOffsets> consumer) {
        consumer.accept(sq_off());
        return this;
    }

    public IOURingParams cq_off(@NativeType("struct io_cqring_offsets") IOCQRingOffsets value) {
        ncq_off(address(), value);
        return this;
    }

    public IOURingParams cq_off(Consumer<IOCQRingOffsets> consumer) {
        consumer.accept(cq_off());
        return this;
    }

    public IOURingParams set(int sq_entries, int cq_entries, int flags, int sq_thread_cpu, int sq_thread_idle, int features, int wq_fd, IOSQRingOffsets sq_off, IOCQRingOffsets cq_off) {
        sq_entries(sq_entries);
        cq_entries(cq_entries);
        flags(flags);
        sq_thread_cpu(sq_thread_cpu);
        sq_thread_idle(sq_thread_idle);
        features(features);
        wq_fd(wq_fd);
        sq_off(sq_off);
        cq_off(cq_off);
        return this;
    }

    public IOURingParams set(IOURingParams src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingParams malloc() {
        return new IOURingParams(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingParams calloc() {
        return new IOURingParams(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingParams(MemoryUtil.memAddress(container), container);
    }

    public static IOURingParams create(long address) {
        return new IOURingParams(address, null);
    }

    public static IOURingParams createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingParams(address, null);
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

    public static IOURingParams malloc(MemoryStack stack) {
        return new IOURingParams(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingParams calloc(MemoryStack stack) {
        return new IOURingParams(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsq_entries(long struct) {
        return MemoryUtil.memGetInt(struct + SQ_ENTRIES);
    }

    public static int ncq_entries(long struct) {
        return MemoryUtil.memGetInt(struct + CQ_ENTRIES);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nsq_thread_cpu(long struct) {
        return MemoryUtil.memGetInt(struct + SQ_THREAD_CPU);
    }

    public static int nsq_thread_idle(long struct) {
        return MemoryUtil.memGetInt(struct + SQ_THREAD_IDLE);
    }

    public static int nfeatures(long struct) {
        return MemoryUtil.memGetInt(struct + FEATURES);
    }

    public static int nwq_fd(long struct) {
        return MemoryUtil.memGetInt(struct + WQ_FD);
    }

    public static IntBuffer nresv(long struct) {
        return MemoryUtil.memIntBuffer(struct + RESV, 3);
    }

    public static int nresv(long struct, int index) {
        return MemoryUtil.memGetInt(struct + RESV + (Checks.check(index, 3) * 4));
    }

    public static IOSQRingOffsets nsq_off(long struct) {
        return IOSQRingOffsets.create(struct + SQ_OFF);
    }

    public static IOCQRingOffsets ncq_off(long struct) {
        return IOCQRingOffsets.create(struct + CQ_OFF);
    }

    public static void nsq_entries(long struct, int value) {
        MemoryUtil.memPutInt(struct + SQ_ENTRIES, value);
    }

    public static void ncq_entries(long struct, int value) {
        MemoryUtil.memPutInt(struct + CQ_ENTRIES, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nsq_thread_cpu(long struct, int value) {
        MemoryUtil.memPutInt(struct + SQ_THREAD_CPU, value);
    }

    public static void nsq_thread_idle(long struct, int value) {
        MemoryUtil.memPutInt(struct + SQ_THREAD_IDLE, value);
    }

    public static void nfeatures(long struct, int value) {
        MemoryUtil.memPutInt(struct + FEATURES, value);
    }

    public static void nwq_fd(long struct, int value) {
        MemoryUtil.memPutInt(struct + WQ_FD, value);
    }

    public static void nresv(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESV, value.remaining() * 4);
    }

    public static void nresv(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + RESV + (Checks.check(index, 3) * 4), value);
    }

    public static void nsq_off(long struct, IOSQRingOffsets value) {
        MemoryUtil.memCopy(value.address(), struct + SQ_OFF, IOSQRingOffsets.SIZEOF);
    }

    public static void ncq_off(long struct, IOCQRingOffsets value) {
        MemoryUtil.memCopy(value.address(), struct + CQ_OFF, IOCQRingOffsets.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingParams$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingParams$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingParams, Buffer> implements NativeResource {
        private static final IOURingParams ELEMENT_FACTORY = IOURingParams.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingParams.SIZEOF);
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
        public IOURingParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int sq_entries() {
            return IOURingParams.nsq_entries(address());
        }

        @NativeType("__u32")
        public int cq_entries() {
            return IOURingParams.ncq_entries(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOURingParams.nflags(address());
        }

        @NativeType("__u32")
        public int sq_thread_cpu() {
            return IOURingParams.nsq_thread_cpu(address());
        }

        @NativeType("__u32")
        public int sq_thread_idle() {
            return IOURingParams.nsq_thread_idle(address());
        }

        @NativeType("__u32")
        public int features() {
            return IOURingParams.nfeatures(address());
        }

        @NativeType("__u32")
        public int wq_fd() {
            return IOURingParams.nwq_fd(address());
        }

        @NativeType("struct io_sqring_offsets")
        public IOSQRingOffsets sq_off() {
            return IOURingParams.nsq_off(address());
        }

        @NativeType("struct io_cqring_offsets")
        public IOCQRingOffsets cq_off() {
            return IOURingParams.ncq_off(address());
        }

        public Buffer sq_entries(@NativeType("__u32") int value) {
            IOURingParams.nsq_entries(address(), value);
            return this;
        }

        public Buffer cq_entries(@NativeType("__u32") int value) {
            IOURingParams.ncq_entries(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOURingParams.nflags(address(), value);
            return this;
        }

        public Buffer sq_thread_cpu(@NativeType("__u32") int value) {
            IOURingParams.nsq_thread_cpu(address(), value);
            return this;
        }

        public Buffer sq_thread_idle(@NativeType("__u32") int value) {
            IOURingParams.nsq_thread_idle(address(), value);
            return this;
        }

        public Buffer features(@NativeType("__u32") int value) {
            IOURingParams.nfeatures(address(), value);
            return this;
        }

        public Buffer wq_fd(@NativeType("__u32") int value) {
            IOURingParams.nwq_fd(address(), value);
            return this;
        }

        public Buffer sq_off(@NativeType("struct io_sqring_offsets") IOSQRingOffsets value) {
            IOURingParams.nsq_off(address(), value);
            return this;
        }

        public Buffer sq_off(Consumer<IOSQRingOffsets> consumer) {
            consumer.accept(sq_off());
            return this;
        }

        public Buffer cq_off(@NativeType("struct io_cqring_offsets") IOCQRingOffsets value) {
            IOURingParams.ncq_off(address(), value);
            return this;
        }

        public Buffer cq_off(Consumer<IOCQRingOffsets> consumer) {
            consumer.accept(cq_off());
            return this;
        }
    }
}
