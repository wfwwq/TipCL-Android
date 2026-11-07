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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/KernelTimespec.class
 */
@NativeType("struct __kernel_timespec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/KernelTimespec.class */
public class KernelTimespec extends Struct<KernelTimespec> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TV_SEC;
    public static final int TV_NSEC;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TV_SEC = layout.offsetof(0);
        TV_NSEC = layout.offsetof(1);
    }

    protected KernelTimespec(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public KernelTimespec create(long address, ByteBuffer container) {
        return new KernelTimespec(address, container);
    }

    public KernelTimespec(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("int64_t")
    public long tv_sec() {
        return ntv_sec(address());
    }

    @NativeType("long long")
    public long tv_nsec() {
        return ntv_nsec(address());
    }

    public KernelTimespec tv_sec(@NativeType("int64_t") long value) {
        ntv_sec(address(), value);
        return this;
    }

    public KernelTimespec tv_nsec(@NativeType("long long") long value) {
        ntv_nsec(address(), value);
        return this;
    }

    public KernelTimespec set(long tv_sec, long tv_nsec) {
        tv_sec(tv_sec);
        tv_nsec(tv_nsec);
        return this;
    }

    public KernelTimespec set(KernelTimespec src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static KernelTimespec malloc() {
        return new KernelTimespec(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static KernelTimespec calloc() {
        return new KernelTimespec(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static KernelTimespec create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new KernelTimespec(MemoryUtil.memAddress(container), container);
    }

    public static KernelTimespec create(long address) {
        return new KernelTimespec(address, null);
    }

    public static KernelTimespec createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new KernelTimespec(address, null);
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

    public static KernelTimespec malloc(MemoryStack stack) {
        return new KernelTimespec(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static KernelTimespec calloc(MemoryStack stack) {
        return new KernelTimespec(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ntv_sec(long struct) {
        return MemoryUtil.memGetLong(struct + TV_SEC);
    }

    public static long ntv_nsec(long struct) {
        return MemoryUtil.memGetLong(struct + TV_NSEC);
    }

    public static void ntv_sec(long struct, long value) {
        MemoryUtil.memPutLong(struct + TV_SEC, value);
    }

    public static void ntv_nsec(long struct, long value) {
        MemoryUtil.memPutLong(struct + TV_NSEC, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/KernelTimespec$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/KernelTimespec$Buffer.class */
    public static class Buffer extends StructBuffer<KernelTimespec, Buffer> implements NativeResource {
        private static final KernelTimespec ELEMENT_FACTORY = KernelTimespec.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / KernelTimespec.SIZEOF);
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
        public KernelTimespec getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("int64_t")
        public long tv_sec() {
            return KernelTimespec.ntv_sec(address());
        }

        @NativeType("long long")
        public long tv_nsec() {
            return KernelTimespec.ntv_nsec(address());
        }

        public Buffer tv_sec(@NativeType("int64_t") long value) {
            KernelTimespec.ntv_sec(address(), value);
            return this;
        }

        public Buffer tv_nsec(@NativeType("long long") long value) {
            KernelTimespec.ntv_nsec(address(), value);
            return this;
        }
    }
}
