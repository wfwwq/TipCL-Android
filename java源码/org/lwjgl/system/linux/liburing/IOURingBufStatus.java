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

@NativeType("struct io_uring_buf_status")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBufStatus.class */
public class IOURingBufStatus extends Struct<IOURingBufStatus> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUF_GROUP;
    public static final int HEAD;
    public static final int RESV;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __array(4, 8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUF_GROUP = layout.offsetof(0);
        HEAD = layout.offsetof(1);
        RESV = layout.offsetof(2);
    }

    protected IOURingBufStatus(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingBufStatus create(long address, ByteBuffer container) {
        return new IOURingBufStatus(address, container);
    }

    public IOURingBufStatus(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int buf_group() {
        return nbuf_group(address());
    }

    @NativeType("__u32")
    public int head() {
        return nhead(address());
    }

    public IOURingBufStatus buf_group(@NativeType("__u32") int value) {
        nbuf_group(address(), value);
        return this;
    }

    public IOURingBufStatus head(@NativeType("__u32") int value) {
        nhead(address(), value);
        return this;
    }

    public IOURingBufStatus set(int buf_group, int head) {
        buf_group(buf_group);
        head(head);
        return this;
    }

    public IOURingBufStatus set(IOURingBufStatus src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingBufStatus malloc() {
        return new IOURingBufStatus(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingBufStatus calloc() {
        return new IOURingBufStatus(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingBufStatus create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingBufStatus(MemoryUtil.memAddress(container), container);
    }

    public static IOURingBufStatus create(long address) {
        return new IOURingBufStatus(address, null);
    }

    public static IOURingBufStatus createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingBufStatus(address, null);
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

    public static IOURingBufStatus malloc(MemoryStack stack) {
        return new IOURingBufStatus(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingBufStatus calloc(MemoryStack stack) {
        return new IOURingBufStatus(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbuf_group(long struct) {
        return MemoryUtil.memGetInt(struct + BUF_GROUP);
    }

    public static int nhead(long struct) {
        return MemoryUtil.memGetInt(struct + HEAD);
    }

    public static IntBuffer nresv(long struct) {
        return MemoryUtil.memIntBuffer(struct + RESV, 8);
    }

    public static int nresv(long struct, int index) {
        return MemoryUtil.memGetInt(struct + RESV + (Checks.check(index, 8) * 4));
    }

    public static void nbuf_group(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUF_GROUP, value);
    }

    public static void nhead(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEAD, value);
    }

    public static void nresv(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESV, value.remaining() * 4);
    }

    public static void nresv(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + RESV + (Checks.check(index, 8) * 4), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingBufStatus$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingBufStatus, Buffer> implements NativeResource {
        private static final IOURingBufStatus ELEMENT_FACTORY = IOURingBufStatus.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingBufStatus.SIZEOF);
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
        public IOURingBufStatus getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int buf_group() {
            return IOURingBufStatus.nbuf_group(address());
        }

        @NativeType("__u32")
        public int head() {
            return IOURingBufStatus.nhead(address());
        }

        public Buffer buf_group(@NativeType("__u32") int value) {
            IOURingBufStatus.nbuf_group(address(), value);
            return this;
        }

        public Buffer head(@NativeType("__u32") int value) {
            IOURingBufStatus.nhead(address(), value);
            return this;
        }
    }
}
