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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/StatxTimestamp.class
 */
@NativeType("struct statx_timestamp")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/StatxTimestamp.class */
public class StatxTimestamp extends Struct<StatxTimestamp> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TV_SEC;
    public static final int TV_NSEC;
    public static final int __RESERVED;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TV_SEC = layout.offsetof(0);
        TV_NSEC = layout.offsetof(1);
        __RESERVED = layout.offsetof(2);
    }

    protected StatxTimestamp(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StatxTimestamp create(long address, ByteBuffer container) {
        return new StatxTimestamp(address, container);
    }

    public StatxTimestamp(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__s64")
    public long tv_sec() {
        return ntv_sec(address());
    }

    @NativeType("__u32")
    public int tv_nsec() {
        return ntv_nsec(address());
    }

    public StatxTimestamp tv_sec(@NativeType("__s64") long value) {
        ntv_sec(address(), value);
        return this;
    }

    public StatxTimestamp tv_nsec(@NativeType("__u32") int value) {
        ntv_nsec(address(), value);
        return this;
    }

    public StatxTimestamp set(long tv_sec, int tv_nsec) {
        tv_sec(tv_sec);
        tv_nsec(tv_nsec);
        return this;
    }

    public StatxTimestamp set(StatxTimestamp src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StatxTimestamp malloc() {
        return new StatxTimestamp(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StatxTimestamp calloc() {
        return new StatxTimestamp(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StatxTimestamp create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StatxTimestamp(MemoryUtil.memAddress(container), container);
    }

    public static StatxTimestamp create(long address) {
        return new StatxTimestamp(address, null);
    }

    public static StatxTimestamp createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StatxTimestamp(address, null);
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

    public static StatxTimestamp malloc(MemoryStack stack) {
        return new StatxTimestamp(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StatxTimestamp calloc(MemoryStack stack) {
        return new StatxTimestamp(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntv_nsec(long struct) {
        return MemoryUtil.memGetInt(struct + TV_NSEC);
    }

    public static int n__reserved(long struct) {
        return MemoryUtil.memGetInt(struct + __RESERVED);
    }

    public static void ntv_sec(long struct, long value) {
        MemoryUtil.memPutLong(struct + TV_SEC, value);
    }

    public static void ntv_nsec(long struct, int value) {
        MemoryUtil.memPutInt(struct + TV_NSEC, value);
    }

    public static void n__reserved(long struct, int value) {
        MemoryUtil.memPutInt(struct + __RESERVED, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/StatxTimestamp$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/StatxTimestamp$Buffer.class */
    public static class Buffer extends StructBuffer<StatxTimestamp, Buffer> implements NativeResource {
        private static final StatxTimestamp ELEMENT_FACTORY = StatxTimestamp.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StatxTimestamp.SIZEOF);
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
        public StatxTimestamp getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__s64")
        public long tv_sec() {
            return StatxTimestamp.ntv_sec(address());
        }

        @NativeType("__u32")
        public int tv_nsec() {
            return StatxTimestamp.ntv_nsec(address());
        }

        public Buffer tv_sec(@NativeType("__s64") long value) {
            StatxTimestamp.ntv_sec(address(), value);
            return this;
        }

        public Buffer tv_nsec(@NativeType("__u32") int value) {
            StatxTimestamp.ntv_nsec(address(), value);
            return this;
        }
    }
}
