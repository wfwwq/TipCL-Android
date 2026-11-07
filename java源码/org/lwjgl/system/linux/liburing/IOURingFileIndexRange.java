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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingFileIndexRange.class
 */
@NativeType("struct io_uring_file_index_range")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingFileIndexRange.class */
public class IOURingFileIndexRange extends Struct<IOURingFileIndexRange> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OFF;
    public static final int LEN;
    public static final int RESV;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFF = layout.offsetof(0);
        LEN = layout.offsetof(1);
        RESV = layout.offsetof(2);
    }

    protected IOURingFileIndexRange(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingFileIndexRange create(long address, ByteBuffer container) {
        return new IOURingFileIndexRange(address, container);
    }

    public IOURingFileIndexRange(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u32")
    public int off() {
        return noff(address());
    }

    @NativeType("__u32")
    public int len() {
        return nlen(address());
    }

    public IOURingFileIndexRange off(@NativeType("__u32") int value) {
        noff(address(), value);
        return this;
    }

    public IOURingFileIndexRange len(@NativeType("__u32") int value) {
        nlen(address(), value);
        return this;
    }

    public IOURingFileIndexRange set(int off, int len) {
        off(off);
        len(len);
        return this;
    }

    public IOURingFileIndexRange set(IOURingFileIndexRange src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingFileIndexRange malloc() {
        return new IOURingFileIndexRange(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingFileIndexRange calloc() {
        return new IOURingFileIndexRange(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingFileIndexRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingFileIndexRange(MemoryUtil.memAddress(container), container);
    }

    public static IOURingFileIndexRange create(long address) {
        return new IOURingFileIndexRange(address, null);
    }

    public static IOURingFileIndexRange createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingFileIndexRange(address, null);
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

    public static IOURingFileIndexRange malloc(MemoryStack stack) {
        return new IOURingFileIndexRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingFileIndexRange calloc(MemoryStack stack) {
        return new IOURingFileIndexRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int noff(long struct) {
        return MemoryUtil.memGetInt(struct + OFF);
    }

    public static int nlen(long struct) {
        return MemoryUtil.memGetInt(struct + LEN);
    }

    public static long nresv(long struct) {
        return MemoryUtil.memGetLong(struct + RESV);
    }

    public static void noff(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFF, value);
    }

    public static void nlen(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEN, value);
    }

    public static void nresv(long struct, long value) {
        MemoryUtil.memPutLong(struct + RESV, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingFileIndexRange$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingFileIndexRange$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingFileIndexRange, Buffer> implements NativeResource {
        private static final IOURingFileIndexRange ELEMENT_FACTORY = IOURingFileIndexRange.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingFileIndexRange.SIZEOF);
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
        public IOURingFileIndexRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u32")
        public int off() {
            return IOURingFileIndexRange.noff(address());
        }

        @NativeType("__u32")
        public int len() {
            return IOURingFileIndexRange.nlen(address());
        }

        public Buffer off(@NativeType("__u32") int value) {
            IOURingFileIndexRange.noff(address(), value);
            return this;
        }

        public Buffer len(@NativeType("__u32") int value) {
            IOURingFileIndexRange.nlen(address(), value);
            return this;
        }
    }
}
