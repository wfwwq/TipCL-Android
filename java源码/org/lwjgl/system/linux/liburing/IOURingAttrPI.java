package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct io_uring_attr_pi")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingAttrPI.class */
public class IOURingAttrPI extends Struct<IOURingAttrPI> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int APP_TAG;
    public static final int LEN;
    public static final int ADDR;
    public static final int SEED;
    public static final int RSVD;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(4), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        APP_TAG = layout.offsetof(1);
        LEN = layout.offsetof(2);
        ADDR = layout.offsetof(3);
        SEED = layout.offsetof(4);
        RSVD = layout.offsetof(5);
    }

    protected IOURingAttrPI(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingAttrPI create(long address, ByteBuffer container) {
        return new IOURingAttrPI(address, container);
    }

    public IOURingAttrPI(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u16")
    public short flags() {
        return nflags(address());
    }

    @NativeType("__u16")
    public short app_tag() {
        return napp_tag(address());
    }

    @NativeType("__u32")
    public int len() {
        return nlen(address());
    }

    @NativeType("__u64")
    public long addr() {
        return naddr(address());
    }

    @NativeType("__u64")
    public long seed() {
        return nseed(address());
    }

    @NativeType("__u64")
    public long rsvd() {
        return nrsvd(address());
    }

    public IOURingAttrPI flags(@NativeType("__u16") short value) {
        nflags(address(), value);
        return this;
    }

    public IOURingAttrPI app_tag(@NativeType("__u16") short value) {
        napp_tag(address(), value);
        return this;
    }

    public IOURingAttrPI len(@NativeType("__u32") int value) {
        nlen(address(), value);
        return this;
    }

    public IOURingAttrPI addr(@NativeType("__u64") long value) {
        naddr(address(), value);
        return this;
    }

    public IOURingAttrPI seed(@NativeType("__u64") long value) {
        nseed(address(), value);
        return this;
    }

    public IOURingAttrPI rsvd(@NativeType("__u64") long value) {
        nrsvd(address(), value);
        return this;
    }

    public IOURingAttrPI set(short flags, short app_tag, int len, long addr, long seed, long rsvd) {
        flags(flags);
        app_tag(app_tag);
        len(len);
        addr(addr);
        seed(seed);
        rsvd(rsvd);
        return this;
    }

    public IOURingAttrPI set(IOURingAttrPI src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingAttrPI malloc() {
        return new IOURingAttrPI(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingAttrPI calloc() {
        return new IOURingAttrPI(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingAttrPI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingAttrPI(MemoryUtil.memAddress(container), container);
    }

    public static IOURingAttrPI create(long address) {
        return new IOURingAttrPI(address, null);
    }

    public static IOURingAttrPI createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingAttrPI(address, null);
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

    public static IOURingAttrPI malloc(MemoryStack stack) {
        return new IOURingAttrPI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingAttrPI calloc(MemoryStack stack) {
        return new IOURingAttrPI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nflags(long struct) {
        return MemoryUtil.memGetShort(struct + FLAGS);
    }

    public static short napp_tag(long struct) {
        return MemoryUtil.memGetShort(struct + APP_TAG);
    }

    public static int nlen(long struct) {
        return MemoryUtil.memGetInt(struct + LEN);
    }

    public static long naddr(long struct) {
        return MemoryUtil.memGetLong(struct + ADDR);
    }

    public static long nseed(long struct) {
        return MemoryUtil.memGetLong(struct + SEED);
    }

    public static long nrsvd(long struct) {
        return MemoryUtil.memGetLong(struct + RSVD);
    }

    public static void nflags(long struct, short value) {
        MemoryUtil.memPutShort(struct + FLAGS, value);
    }

    public static void napp_tag(long struct, short value) {
        MemoryUtil.memPutShort(struct + APP_TAG, value);
    }

    public static void nlen(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEN, value);
    }

    public static void naddr(long struct, long value) {
        MemoryUtil.memPutLong(struct + ADDR, value);
    }

    public static void nseed(long struct, long value) {
        MemoryUtil.memPutLong(struct + SEED, value);
    }

    public static void nrsvd(long struct, long value) {
        MemoryUtil.memPutLong(struct + RSVD, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingAttrPI$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingAttrPI, Buffer> implements NativeResource {
        private static final IOURingAttrPI ELEMENT_FACTORY = IOURingAttrPI.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingAttrPI.SIZEOF);
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
        public IOURingAttrPI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u16")
        public short flags() {
            return IOURingAttrPI.nflags(address());
        }

        @NativeType("__u16")
        public short app_tag() {
            return IOURingAttrPI.napp_tag(address());
        }

        @NativeType("__u32")
        public int len() {
            return IOURingAttrPI.nlen(address());
        }

        @NativeType("__u64")
        public long addr() {
            return IOURingAttrPI.naddr(address());
        }

        @NativeType("__u64")
        public long seed() {
            return IOURingAttrPI.nseed(address());
        }

        @NativeType("__u64")
        public long rsvd() {
            return IOURingAttrPI.nrsvd(address());
        }

        public Buffer flags(@NativeType("__u16") short value) {
            IOURingAttrPI.nflags(address(), value);
            return this;
        }

        public Buffer app_tag(@NativeType("__u16") short value) {
            IOURingAttrPI.napp_tag(address(), value);
            return this;
        }

        public Buffer len(@NativeType("__u32") int value) {
            IOURingAttrPI.nlen(address(), value);
            return this;
        }

        public Buffer addr(@NativeType("__u64") long value) {
            IOURingAttrPI.naddr(address(), value);
            return this;
        }

        public Buffer seed(@NativeType("__u64") long value) {
            IOURingAttrPI.nseed(address(), value);
            return this;
        }

        public Buffer rsvd(@NativeType("__u64") long value) {
            IOURingAttrPI.nrsvd(address(), value);
            return this;
        }
    }
}
