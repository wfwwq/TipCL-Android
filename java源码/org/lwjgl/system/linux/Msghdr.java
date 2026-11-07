package org.lwjgl.system.linux;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.system.linux.IOVec;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/Msghdr.class
 */
@NativeType("struct msghdr")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/Msghdr.class */
public class Msghdr extends Struct<Msghdr> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MSG_NAME;
    public static final int MSG_NAMELEN;
    public static final int MSG_IOV;
    public static final int MSG_IOVLEN;
    public static final int MSG_CONTROL;
    public static final int MSG_CONTROLLEN;
    public static final int MSG_FLAGS;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MSG_NAME = layout.offsetof(0);
        MSG_NAMELEN = layout.offsetof(1);
        MSG_IOV = layout.offsetof(2);
        MSG_IOVLEN = layout.offsetof(3);
        MSG_CONTROL = layout.offsetof(4);
        MSG_CONTROLLEN = layout.offsetof(5);
        MSG_FLAGS = layout.offsetof(6);
    }

    protected Msghdr(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public Msghdr create(long address, ByteBuffer container) {
        return new Msghdr(address, container);
    }

    public Msghdr(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("void *")
    public ByteBuffer msg_name() {
        return nmsg_name(address());
    }

    @NativeType("socklen_t")
    public int msg_namelen() {
        return nmsg_namelen(address());
    }

    @NativeType("struct iovec *")
    public IOVec.Buffer msg_iov() {
        return nmsg_iov(address());
    }

    @NativeType("size_t")
    public long msg_iovlen() {
        return nmsg_iovlen(address());
    }

    @NativeType("void *")
    public ByteBuffer msg_control() {
        return nmsg_control(address());
    }

    @NativeType("size_t")
    public long msg_controllen() {
        return nmsg_controllen(address());
    }

    public int msg_flags() {
        return nmsg_flags(address());
    }

    public Msghdr msg_name(@NativeType("void *") ByteBuffer value) {
        nmsg_name(address(), value);
        return this;
    }

    public Msghdr msg_iov(@NativeType("struct iovec *") IOVec.Buffer value) {
        nmsg_iov(address(), value);
        return this;
    }

    public Msghdr msg_control(@NativeType("void *") ByteBuffer value) {
        nmsg_control(address(), value);
        return this;
    }

    public Msghdr msg_flags(int value) {
        nmsg_flags(address(), value);
        return this;
    }

    public Msghdr set(ByteBuffer msg_name, IOVec.Buffer msg_iov, ByteBuffer msg_control, int msg_flags) {
        msg_name(msg_name);
        msg_iov(msg_iov);
        msg_control(msg_control);
        msg_flags(msg_flags);
        return this;
    }

    public Msghdr set(Msghdr src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static Msghdr malloc() {
        return new Msghdr(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static Msghdr calloc() {
        return new Msghdr(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static Msghdr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new Msghdr(MemoryUtil.memAddress(container), container);
    }

    public static Msghdr create(long address) {
        return new Msghdr(address, null);
    }

    public static Msghdr createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new Msghdr(address, null);
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

    public static Msghdr malloc(MemoryStack stack) {
        return new Msghdr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static Msghdr calloc(MemoryStack stack) {
        return new Msghdr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nmsg_name(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + MSG_NAME), nmsg_namelen(struct));
    }

    public static int nmsg_namelen(long struct) {
        return MemoryUtil.memGetInt(struct + MSG_NAMELEN);
    }

    public static IOVec.Buffer nmsg_iov(long struct) {
        return IOVec.create(MemoryUtil.memGetAddress(struct + MSG_IOV), (int) nmsg_iovlen(struct));
    }

    public static long nmsg_iovlen(long struct) {
        return MemoryUtil.memGetAddress(struct + MSG_IOVLEN);
    }

    public static ByteBuffer nmsg_control(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + MSG_CONTROL), (int) nmsg_controllen(struct));
    }

    public static long nmsg_controllen(long struct) {
        return MemoryUtil.memGetAddress(struct + MSG_CONTROLLEN);
    }

    public static int nmsg_flags(long struct) {
        return MemoryUtil.memGetInt(struct + MSG_FLAGS);
    }

    public static void nmsg_name(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + MSG_NAME, MemoryUtil.memAddress(value));
        nmsg_namelen(struct, value.remaining());
    }

    public static void nmsg_namelen(long struct, int value) {
        MemoryUtil.memPutInt(struct + MSG_NAMELEN, value);
    }

    public static void nmsg_iov(long struct, IOVec.Buffer value) {
        MemoryUtil.memPutAddress(struct + MSG_IOV, value.address());
        nmsg_iovlen(struct, value.remaining());
    }

    public static void nmsg_iovlen(long struct, long value) {
        MemoryUtil.memPutAddress(struct + MSG_IOVLEN, value);
    }

    public static void nmsg_control(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + MSG_CONTROL, MemoryUtil.memAddress(value));
        nmsg_controllen(struct, value.remaining());
    }

    public static void nmsg_controllen(long struct, long value) {
        MemoryUtil.memPutAddress(struct + MSG_CONTROLLEN, value);
    }

    public static void nmsg_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + MSG_FLAGS, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + MSG_NAME));
        Checks.check(MemoryUtil.memGetAddress(struct + MSG_IOV));
        Checks.check(MemoryUtil.memGetAddress(struct + MSG_CONTROL));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/Msghdr$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/Msghdr$Buffer.class */
    public static class Buffer extends StructBuffer<Msghdr, Buffer> implements NativeResource {
        private static final Msghdr ELEMENT_FACTORY = Msghdr.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / Msghdr.SIZEOF);
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
        public Msghdr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("void *")
        public ByteBuffer msg_name() {
            return Msghdr.nmsg_name(address());
        }

        @NativeType("socklen_t")
        public int msg_namelen() {
            return Msghdr.nmsg_namelen(address());
        }

        @NativeType("struct iovec *")
        public IOVec.Buffer msg_iov() {
            return Msghdr.nmsg_iov(address());
        }

        @NativeType("size_t")
        public long msg_iovlen() {
            return Msghdr.nmsg_iovlen(address());
        }

        @NativeType("void *")
        public ByteBuffer msg_control() {
            return Msghdr.nmsg_control(address());
        }

        @NativeType("size_t")
        public long msg_controllen() {
            return Msghdr.nmsg_controllen(address());
        }

        public int msg_flags() {
            return Msghdr.nmsg_flags(address());
        }

        public Buffer msg_name(@NativeType("void *") ByteBuffer value) {
            Msghdr.nmsg_name(address(), value);
            return this;
        }

        public Buffer msg_iov(@NativeType("struct iovec *") IOVec.Buffer value) {
            Msghdr.nmsg_iov(address(), value);
            return this;
        }

        public Buffer msg_control(@NativeType("void *") ByteBuffer value) {
            Msghdr.nmsg_control(address(), value);
            return this;
        }

        public Buffer msg_flags(int value) {
            Msghdr.nmsg_flags(address(), value);
            return this;
        }
    }
}
