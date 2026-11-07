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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/OpenHow.class
 */
@NativeType("struct open_how")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/OpenHow.class */
public class OpenHow extends Struct<OpenHow> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int MODE;
    public static final int RESOLVE;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        MODE = layout.offsetof(1);
        RESOLVE = layout.offsetof(2);
    }

    protected OpenHow(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public OpenHow create(long address, ByteBuffer container) {
        return new OpenHow(address, container);
    }

    public OpenHow(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u64")
    public long flags() {
        return nflags(address());
    }

    @NativeType("__u64")
    public long mode() {
        return nmode(address());
    }

    @NativeType("__u64")
    public long resolve() {
        return nresolve(address());
    }

    public OpenHow flags(@NativeType("__u64") long value) {
        nflags(address(), value);
        return this;
    }

    public OpenHow mode(@NativeType("__u64") long value) {
        nmode(address(), value);
        return this;
    }

    public OpenHow resolve(@NativeType("__u64") long value) {
        nresolve(address(), value);
        return this;
    }

    public OpenHow set(long flags, long mode, long resolve) {
        flags(flags);
        mode(mode);
        resolve(resolve);
        return this;
    }

    public OpenHow set(OpenHow src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static OpenHow malloc() {
        return new OpenHow(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static OpenHow calloc() {
        return new OpenHow(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static OpenHow create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OpenHow(MemoryUtil.memAddress(container), container);
    }

    public static OpenHow create(long address) {
        return new OpenHow(address, null);
    }

    public static OpenHow createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new OpenHow(address, null);
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

    public static OpenHow malloc(MemoryStack stack) {
        return new OpenHow(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static OpenHow calloc(MemoryStack stack) {
        return new OpenHow(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nflags(long struct) {
        return MemoryUtil.memGetLong(struct + FLAGS);
    }

    public static long nmode(long struct) {
        return MemoryUtil.memGetLong(struct + MODE);
    }

    public static long nresolve(long struct) {
        return MemoryUtil.memGetLong(struct + RESOLVE);
    }

    public static void nflags(long struct, long value) {
        MemoryUtil.memPutLong(struct + FLAGS, value);
    }

    public static void nmode(long struct, long value) {
        MemoryUtil.memPutLong(struct + MODE, value);
    }

    public static void nresolve(long struct, long value) {
        MemoryUtil.memPutLong(struct + RESOLVE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/OpenHow$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/OpenHow$Buffer.class */
    public static class Buffer extends StructBuffer<OpenHow, Buffer> implements NativeResource {
        private static final OpenHow ELEMENT_FACTORY = OpenHow.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / OpenHow.SIZEOF);
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
        public OpenHow getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u64")
        public long flags() {
            return OpenHow.nflags(address());
        }

        @NativeType("__u64")
        public long mode() {
            return OpenHow.nmode(address());
        }

        @NativeType("__u64")
        public long resolve() {
            return OpenHow.nresolve(address());
        }

        public Buffer flags(@NativeType("__u64") long value) {
            OpenHow.nflags(address(), value);
            return this;
        }

        public Buffer mode(@NativeType("__u64") long value) {
            OpenHow.nmode(address(), value);
            return this;
        }

        public Buffer resolve(@NativeType("__u64") long value) {
            OpenHow.nresolve(address(), value);
            return this;
        }
    }
}
