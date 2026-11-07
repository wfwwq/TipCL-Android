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

@NativeType("struct io_uring_clone_buffers")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingCloneBuffers.class */
public class IOURingCloneBuffers extends Struct<IOURingCloneBuffers> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRC_FD;
    public static final int FLAGS;
    public static final int SRC_OFF;
    public static final int DST_OFF;
    public static final int NR;
    public static final int PAD;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __array(4, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRC_FD = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        SRC_OFF = layout.offsetof(2);
        DST_OFF = layout.offsetof(3);
        NR = layout.offsetof(4);
        PAD = layout.offsetof(5);
    }

    protected IOURingCloneBuffers(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingCloneBuffers create(long address, ByteBuffer container) {
        return new IOURingCloneBuffers(address, container);
    }

    public IOURingCloneBuffers(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int src_fd() {
        return nsrc_fd(address());
    }

    @NativeType("__u32")
    public int flags() {
        return nflags(address());
    }

    @NativeType("__u32")
    public int src_off() {
        return nsrc_off(address());
    }

    @NativeType("__u32")
    public int dst_off() {
        return ndst_off(address());
    }

    @NativeType("__u32")
    public int nr() {
        return nnr(address());
    }

    public IOURingCloneBuffers src_fd(@NativeType("__u32") int value) {
        nsrc_fd(address(), value);
        return this;
    }

    public IOURingCloneBuffers flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOURingCloneBuffers src_off(@NativeType("__u32") int value) {
        nsrc_off(address(), value);
        return this;
    }

    public IOURingCloneBuffers dst_off(@NativeType("__u32") int value) {
        ndst_off(address(), value);
        return this;
    }

    public IOURingCloneBuffers nr(@NativeType("__u32") int value) {
        nnr(address(), value);
        return this;
    }

    public IOURingCloneBuffers set(int src_fd, int flags, int src_off, int dst_off, int nr) {
        src_fd(src_fd);
        flags(flags);
        src_off(src_off);
        dst_off(dst_off);
        nr(nr);
        return this;
    }

    public IOURingCloneBuffers set(IOURingCloneBuffers src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingCloneBuffers malloc() {
        return new IOURingCloneBuffers(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingCloneBuffers calloc() {
        return new IOURingCloneBuffers(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingCloneBuffers create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingCloneBuffers(MemoryUtil.memAddress(container), container);
    }

    public static IOURingCloneBuffers create(long address) {
        return new IOURingCloneBuffers(address, null);
    }

    public static IOURingCloneBuffers createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingCloneBuffers(address, null);
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

    public static IOURingCloneBuffers malloc(MemoryStack stack) {
        return new IOURingCloneBuffers(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingCloneBuffers calloc(MemoryStack stack) {
        return new IOURingCloneBuffers(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsrc_fd(long struct) {
        return MemoryUtil.memGetInt(struct + SRC_FD);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nsrc_off(long struct) {
        return MemoryUtil.memGetInt(struct + SRC_OFF);
    }

    public static int ndst_off(long struct) {
        return MemoryUtil.memGetInt(struct + DST_OFF);
    }

    public static int nnr(long struct) {
        return MemoryUtil.memGetInt(struct + NR);
    }

    public static IntBuffer npad(long struct) {
        return MemoryUtil.memIntBuffer(struct + PAD, 3);
    }

    public static int npad(long struct, int index) {
        return MemoryUtil.memGetInt(struct + PAD + (Checks.check(index, 3) * 4));
    }

    public static void nsrc_fd(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRC_FD, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nsrc_off(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRC_OFF, value);
    }

    public static void ndst_off(long struct, int value) {
        MemoryUtil.memPutInt(struct + DST_OFF, value);
    }

    public static void nnr(long struct, int value) {
        MemoryUtil.memPutInt(struct + NR, value);
    }

    public static void npad(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PAD, value.remaining() * 4);
    }

    public static void npad(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + PAD + (Checks.check(index, 3) * 4), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingCloneBuffers$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingCloneBuffers, Buffer> implements NativeResource {
        private static final IOURingCloneBuffers ELEMENT_FACTORY = IOURingCloneBuffers.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingCloneBuffers.SIZEOF);
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
        public IOURingCloneBuffers getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int src_fd() {
            return IOURingCloneBuffers.nsrc_fd(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOURingCloneBuffers.nflags(address());
        }

        @NativeType("__u32")
        public int src_off() {
            return IOURingCloneBuffers.nsrc_off(address());
        }

        @NativeType("__u32")
        public int dst_off() {
            return IOURingCloneBuffers.ndst_off(address());
        }

        @NativeType("__u32")
        public int nr() {
            return IOURingCloneBuffers.nnr(address());
        }

        public Buffer src_fd(@NativeType("__u32") int value) {
            IOURingCloneBuffers.nsrc_fd(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOURingCloneBuffers.nflags(address(), value);
            return this;
        }

        public Buffer src_off(@NativeType("__u32") int value) {
            IOURingCloneBuffers.nsrc_off(address(), value);
            return this;
        }

        public Buffer dst_off(@NativeType("__u32") int value) {
            IOURingCloneBuffers.ndst_off(address(), value);
            return this;
        }

        public Buffer nr(@NativeType("__u32") int value) {
            IOURingCloneBuffers.nnr(address(), value);
            return this;
        }
    }
}
