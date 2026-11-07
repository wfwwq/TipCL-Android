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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/FOwnerEx.class
 */
@NativeType("struct f_owner_ex")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/FOwnerEx.class */
public class FOwnerEx extends Struct<FOwnerEx> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int PID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        PID = layout.offsetof(1);
    }

    protected FOwnerEx(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FOwnerEx create(long address, ByteBuffer container) {
        return new FOwnerEx(address, container);
    }

    public FOwnerEx(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int type() {
        return ntype(address());
    }

    @NativeType("pid_t")
    public int pid() {
        return npid(address());
    }

    public FOwnerEx type(int value) {
        ntype(address(), value);
        return this;
    }

    public FOwnerEx pid(@NativeType("pid_t") int value) {
        npid(address(), value);
        return this;
    }

    public FOwnerEx set(int type, int pid) {
        type(type);
        pid(pid);
        return this;
    }

    public FOwnerEx set(FOwnerEx src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FOwnerEx malloc() {
        return new FOwnerEx(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FOwnerEx calloc() {
        return new FOwnerEx(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FOwnerEx create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FOwnerEx(MemoryUtil.memAddress(container), container);
    }

    public static FOwnerEx create(long address) {
        return new FOwnerEx(address, null);
    }

    public static FOwnerEx createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FOwnerEx(address, null);
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

    public static FOwnerEx malloc(MemoryStack stack) {
        return new FOwnerEx(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FOwnerEx calloc(MemoryStack stack) {
        return new FOwnerEx(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int npid(long struct) {
        return MemoryUtil.memGetInt(struct + PID);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void npid(long struct, int value) {
        MemoryUtil.memPutInt(struct + PID, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/FOwnerEx$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/FOwnerEx$Buffer.class */
    public static class Buffer extends StructBuffer<FOwnerEx, Buffer> implements NativeResource {
        private static final FOwnerEx ELEMENT_FACTORY = FOwnerEx.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FOwnerEx.SIZEOF);
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
        public FOwnerEx getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return FOwnerEx.ntype(address());
        }

        @NativeType("pid_t")
        public int pid() {
            return FOwnerEx.npid(address());
        }

        public Buffer type(int value) {
            FOwnerEx.ntype(address(), value);
            return this;
        }

        public Buffer pid(@NativeType("pid_t") int value) {
            FOwnerEx.npid(address(), value);
            return this;
        }
    }
}
