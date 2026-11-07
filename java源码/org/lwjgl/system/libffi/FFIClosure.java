package org.lwjgl.system.libffi;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/libffi/FFIClosure.class
 */
@NativeType("struct ffi_closure")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/libffi/FFIClosure.class */
public class FFIClosure extends Struct<FFIClosure> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CIF;
    public static final int FUN;
    public static final int USER_DATA;

    private static native int offsets(long j);

    static {
        MemoryStack stack = MemoryStack.stackPush();
        try {
            IntBuffer offsets = stack.mallocInt(4);
            SIZEOF = offsets(MemoryUtil.memAddress(offsets));
            CIF = offsets.get(0);
            FUN = offsets.get(1);
            USER_DATA = offsets.get(2);
            ALIGNOF = offsets.get(3);
            if (stack != null) {
                stack.close();
            }
        } catch (Throwable th) {
            if (stack != null) {
                try {
                    stack.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected FFIClosure(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FFIClosure create(long address, ByteBuffer container) {
        return new FFIClosure(address, container);
    }

    public FFIClosure(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("ffi_cif *")
    public FFICIF cif() {
        return ncif(address());
    }

    @NativeType("void (*)(ffi_cif*,void*,void**,void*)")
    public long fun() {
        return nfun(address());
    }

    @NativeType("void *")
    public long user_data() {
        return nuser_data(address());
    }

    public static FFIClosure malloc() {
        return new FFIClosure(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FFIClosure calloc() {
        return new FFIClosure(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FFIClosure create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FFIClosure(MemoryUtil.memAddress(container), container);
    }

    public static FFIClosure create(long address) {
        return new FFIClosure(address, null);
    }

    public static FFIClosure createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FFIClosure(address, null);
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

    public static FFIClosure malloc(MemoryStack stack) {
        return new FFIClosure(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FFIClosure calloc(MemoryStack stack) {
        return new FFIClosure(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FFICIF ncif(long struct) {
        return FFICIF.create(MemoryUtil.memGetAddress(struct + CIF));
    }

    public static long nfun(long struct) {
        return MemoryUtil.memGetAddress(struct + FUN);
    }

    public static long nuser_data(long struct) {
        return MemoryUtil.memGetAddress(struct + USER_DATA);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/libffi/FFIClosure$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/libffi/FFIClosure$Buffer.class */
    public static class Buffer extends StructBuffer<FFIClosure, Buffer> implements NativeResource {
        private static final FFIClosure ELEMENT_FACTORY = FFIClosure.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FFIClosure.SIZEOF);
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
        public FFIClosure getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("ffi_cif *")
        public FFICIF cif() {
            return FFIClosure.ncif(address());
        }

        @NativeType("void (*)(ffi_cif*,void*,void**,void*)")
        public long fun() {
            return FFIClosure.nfun(address());
        }

        @NativeType("void *")
        public long user_data() {
            return FFIClosure.nuser_data(address());
        }
    }
}
