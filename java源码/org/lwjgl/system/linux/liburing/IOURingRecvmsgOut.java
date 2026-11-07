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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRecvmsgOut.class
 */
@NativeType("struct io_uring_recvmsg_out")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRecvmsgOut.class */
public class IOURingRecvmsgOut extends Struct<IOURingRecvmsgOut> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NAMELEN;
    public static final int CONTROLLEN;
    public static final int PAYLOADLEN;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NAMELEN = layout.offsetof(0);
        CONTROLLEN = layout.offsetof(1);
        PAYLOADLEN = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected IOURingRecvmsgOut(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingRecvmsgOut create(long address, ByteBuffer container) {
        return new IOURingRecvmsgOut(address, container);
    }

    public IOURingRecvmsgOut(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int namelen() {
        return nnamelen(address());
    }

    @NativeType("__u32")
    public int controllen() {
        return ncontrollen(address());
    }

    @NativeType("__u32")
    public int payloadlen() {
        return npayloadlen(address());
    }

    @NativeType("__u32")
    public int flags() {
        return nflags(address());
    }

    public IOURingRecvmsgOut namelen(@NativeType("__u32") int value) {
        nnamelen(address(), value);
        return this;
    }

    public IOURingRecvmsgOut controllen(@NativeType("__u32") int value) {
        ncontrollen(address(), value);
        return this;
    }

    public IOURingRecvmsgOut payloadlen(@NativeType("__u32") int value) {
        npayloadlen(address(), value);
        return this;
    }

    public IOURingRecvmsgOut flags(@NativeType("__u32") int value) {
        nflags(address(), value);
        return this;
    }

    public IOURingRecvmsgOut set(int namelen, int controllen, int payloadlen, int flags) {
        namelen(namelen);
        controllen(controllen);
        payloadlen(payloadlen);
        flags(flags);
        return this;
    }

    public IOURingRecvmsgOut set(IOURingRecvmsgOut src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingRecvmsgOut malloc() {
        return new IOURingRecvmsgOut(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingRecvmsgOut calloc() {
        return new IOURingRecvmsgOut(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingRecvmsgOut create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingRecvmsgOut(MemoryUtil.memAddress(container), container);
    }

    public static IOURingRecvmsgOut create(long address) {
        return new IOURingRecvmsgOut(address, null);
    }

    public static IOURingRecvmsgOut createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingRecvmsgOut(address, null);
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

    public static IOURingRecvmsgOut malloc(MemoryStack stack) {
        return new IOURingRecvmsgOut(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingRecvmsgOut calloc(MemoryStack stack) {
        return new IOURingRecvmsgOut(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nnamelen(long struct) {
        return MemoryUtil.memGetInt(struct + NAMELEN);
    }

    public static int ncontrollen(long struct) {
        return MemoryUtil.memGetInt(struct + CONTROLLEN);
    }

    public static int npayloadlen(long struct) {
        return MemoryUtil.memGetInt(struct + PAYLOADLEN);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static void nnamelen(long struct, int value) {
        MemoryUtil.memPutInt(struct + NAMELEN, value);
    }

    public static void ncontrollen(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONTROLLEN, value);
    }

    public static void npayloadlen(long struct, int value) {
        MemoryUtil.memPutInt(struct + PAYLOADLEN, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRecvmsgOut$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingRecvmsgOut$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingRecvmsgOut, Buffer> implements NativeResource {
        private static final IOURingRecvmsgOut ELEMENT_FACTORY = IOURingRecvmsgOut.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingRecvmsgOut.SIZEOF);
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
        public IOURingRecvmsgOut getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int namelen() {
            return IOURingRecvmsgOut.nnamelen(address());
        }

        @NativeType("__u32")
        public int controllen() {
            return IOURingRecvmsgOut.ncontrollen(address());
        }

        @NativeType("__u32")
        public int payloadlen() {
            return IOURingRecvmsgOut.npayloadlen(address());
        }

        @NativeType("__u32")
        public int flags() {
            return IOURingRecvmsgOut.nflags(address());
        }

        public Buffer namelen(@NativeType("__u32") int value) {
            IOURingRecvmsgOut.nnamelen(address(), value);
            return this;
        }

        public Buffer controllen(@NativeType("__u32") int value) {
            IOURingRecvmsgOut.ncontrollen(address(), value);
            return this;
        }

        public Buffer payloadlen(@NativeType("__u32") int value) {
            IOURingRecvmsgOut.npayloadlen(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u32") int value) {
            IOURingRecvmsgOut.nflags(address(), value);
            return this;
        }
    }
}
