package org.lwjgl.system.linux;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/IOVec.class
 */
@NativeType("struct iovec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/IOVec.class */
public class IOVec extends Struct<IOVec> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int IOV_BASE;
    public static final int IOV_LEN;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        IOV_BASE = layout.offsetof(0);
        IOV_LEN = layout.offsetof(1);
    }

    protected IOVec(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOVec create(long address, ByteBuffer container) {
        return new IOVec(address, container);
    }

    public IOVec(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("void *")
    public ByteBuffer iov_base() {
        return niov_base(address());
    }

    @NativeType("size_t")
    public long iov_len() {
        return niov_len(address());
    }

    public IOVec iov_base(@NativeType("void *") ByteBuffer value) {
        niov_base(address(), value);
        return this;
    }

    public IOVec iov_len(@NativeType("size_t") long value) {
        niov_len(address(), value);
        return this;
    }

    public IOVec set(ByteBuffer iov_base, long iov_len) {
        iov_base(iov_base);
        iov_len(iov_len);
        return this;
    }

    public IOVec set(IOVec src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOVec malloc() {
        return new IOVec(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOVec calloc() {
        return new IOVec(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOVec create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOVec(MemoryUtil.memAddress(container), container);
    }

    public static IOVec create(long address) {
        return new IOVec(address, null);
    }

    public static IOVec createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOVec(address, null);
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

    public static IOVec malloc(MemoryStack stack) {
        return new IOVec(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOVec calloc(MemoryStack stack) {
        return new IOVec(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer niov_base(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + IOV_BASE), (int) niov_len(struct));
    }

    public static long niov_len(long struct) {
        return MemoryUtil.memGetAddress(struct + IOV_LEN);
    }

    public static void niov_base(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + IOV_BASE, MemoryUtil.memAddressSafe(value));
    }

    public static void niov_len(long struct, long value) {
        MemoryUtil.memPutAddress(struct + IOV_LEN, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/IOVec$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/IOVec$Buffer.class */
    public static class Buffer extends StructBuffer<IOVec, Buffer> implements NativeResource {
        private static final IOVec ELEMENT_FACTORY = IOVec.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOVec.SIZEOF);
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
        public IOVec getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("void *")
        public ByteBuffer iov_base() {
            return IOVec.niov_base(address());
        }

        @NativeType("size_t")
        public long iov_len() {
            return IOVec.niov_len(address());
        }

        public Buffer iov_base(@NativeType("void *") ByteBuffer value) {
            IOVec.niov_base(address(), value);
            return this;
        }

        public Buffer iov_len(@NativeType("size_t") long value) {
            IOVec.niov_len(address(), value);
            return this;
        }
    }
}
