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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/Flock.class
 */
@NativeType("struct flock64")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/Flock.class */
public class Flock extends Struct<Flock> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int L_TYPE;
    public static final int L_WHENCE;
    public static final int L_START;
    public static final int L_LEN;
    public static final int L_PID;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        L_TYPE = layout.offsetof(0);
        L_WHENCE = layout.offsetof(1);
        L_START = layout.offsetof(2);
        L_LEN = layout.offsetof(3);
        L_PID = layout.offsetof(4);
    }

    protected Flock(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public Flock create(long address, ByteBuffer container) {
        return new Flock(address, container);
    }

    public Flock(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public short l_type() {
        return nl_type(address());
    }

    public short l_whence() {
        return nl_whence(address());
    }

    @NativeType("off_t")
    public long l_start() {
        return nl_start(address());
    }

    @NativeType("off_t")
    public long l_len() {
        return nl_len(address());
    }

    @NativeType("pid_t")
    public int l_pid() {
        return nl_pid(address());
    }

    public Flock l_type(short value) {
        nl_type(address(), value);
        return this;
    }

    public Flock l_whence(short value) {
        nl_whence(address(), value);
        return this;
    }

    public Flock l_start(@NativeType("off_t") long value) {
        nl_start(address(), value);
        return this;
    }

    public Flock l_len(@NativeType("off_t") long value) {
        nl_len(address(), value);
        return this;
    }

    public Flock l_pid(@NativeType("pid_t") int value) {
        nl_pid(address(), value);
        return this;
    }

    public Flock set(short l_type, short l_whence, long l_start, long l_len, int l_pid) {
        l_type(l_type);
        l_whence(l_whence);
        l_start(l_start);
        l_len(l_len);
        l_pid(l_pid);
        return this;
    }

    public Flock set(Flock src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static Flock malloc() {
        return new Flock(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static Flock calloc() {
        return new Flock(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static Flock create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new Flock(MemoryUtil.memAddress(container), container);
    }

    public static Flock create(long address) {
        return new Flock(address, null);
    }

    public static Flock createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new Flock(address, null);
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

    public static Flock malloc(MemoryStack stack) {
        return new Flock(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static Flock calloc(MemoryStack stack) {
        return new Flock(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nl_type(long struct) {
        return MemoryUtil.memGetShort(struct + L_TYPE);
    }

    public static short nl_whence(long struct) {
        return MemoryUtil.memGetShort(struct + L_WHENCE);
    }

    public static long nl_start(long struct) {
        return MemoryUtil.memGetLong(struct + L_START);
    }

    public static long nl_len(long struct) {
        return MemoryUtil.memGetLong(struct + L_LEN);
    }

    public static int nl_pid(long struct) {
        return MemoryUtil.memGetInt(struct + L_PID);
    }

    public static void nl_type(long struct, short value) {
        MemoryUtil.memPutShort(struct + L_TYPE, value);
    }

    public static void nl_whence(long struct, short value) {
        MemoryUtil.memPutShort(struct + L_WHENCE, value);
    }

    public static void nl_start(long struct, long value) {
        MemoryUtil.memPutLong(struct + L_START, value);
    }

    public static void nl_len(long struct, long value) {
        MemoryUtil.memPutLong(struct + L_LEN, value);
    }

    public static void nl_pid(long struct, int value) {
        MemoryUtil.memPutInt(struct + L_PID, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/Flock$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/Flock$Buffer.class */
    public static class Buffer extends StructBuffer<Flock, Buffer> implements NativeResource {
        private static final Flock ELEMENT_FACTORY = Flock.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / Flock.SIZEOF);
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
        public Flock getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public short l_type() {
            return Flock.nl_type(address());
        }

        public short l_whence() {
            return Flock.nl_whence(address());
        }

        @NativeType("off_t")
        public long l_start() {
            return Flock.nl_start(address());
        }

        @NativeType("off_t")
        public long l_len() {
            return Flock.nl_len(address());
        }

        @NativeType("pid_t")
        public int l_pid() {
            return Flock.nl_pid(address());
        }

        public Buffer l_type(short value) {
            Flock.nl_type(address(), value);
            return this;
        }

        public Buffer l_whence(short value) {
            Flock.nl_whence(address(), value);
            return this;
        }

        public Buffer l_start(@NativeType("off_t") long value) {
            Flock.nl_start(address(), value);
            return this;
        }

        public Buffer l_len(@NativeType("off_t") long value) {
            Flock.nl_len(address(), value);
            return this;
        }

        public Buffer l_pid(@NativeType("pid_t") int value) {
            Flock.nl_pid(address(), value);
            return this;
        }
    }
}
