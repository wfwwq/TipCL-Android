package org.lwjgl.system.windows;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/DATA_BLOB.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/DATA_BLOB.class */
public class DATA_BLOB extends Struct<DATA_BLOB> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CBDATA;
    public static final int PBDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CBDATA = layout.offsetof(0);
        PBDATA = layout.offsetof(1);
    }

    protected DATA_BLOB(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public DATA_BLOB create(long address, ByteBuffer container) {
        return new DATA_BLOB(address, container);
    }

    public DATA_BLOB(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("DWORD")
    public int cbData() {
        return ncbData(address());
    }

    @NativeType("BYTE *")
    public ByteBuffer pbData() {
        return npbData(address());
    }

    public DATA_BLOB pbData(@NativeType("BYTE *") ByteBuffer value) {
        npbData(address(), value);
        return this;
    }

    public DATA_BLOB set(DATA_BLOB src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static DATA_BLOB malloc() {
        return new DATA_BLOB(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static DATA_BLOB calloc() {
        return new DATA_BLOB(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static DATA_BLOB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new DATA_BLOB(MemoryUtil.memAddress(container), container);
    }

    public static DATA_BLOB create(long address) {
        return new DATA_BLOB(address, null);
    }

    public static DATA_BLOB createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new DATA_BLOB(address, null);
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

    public static DATA_BLOB malloc(MemoryStack stack) {
        return new DATA_BLOB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static DATA_BLOB calloc(MemoryStack stack) {
        return new DATA_BLOB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ncbData(long struct) {
        return MemoryUtil.memGetInt(struct + CBDATA);
    }

    public static ByteBuffer npbData(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PBDATA), ncbData(struct));
    }

    public static void ncbData(long struct, int value) {
        MemoryUtil.memPutInt(struct + CBDATA, value);
    }

    public static void npbData(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PBDATA, MemoryUtil.memAddress(value));
        ncbData(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PBDATA));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/DATA_BLOB$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/DATA_BLOB$Buffer.class */
    public static class Buffer extends StructBuffer<DATA_BLOB, Buffer> implements NativeResource {
        private static final DATA_BLOB ELEMENT_FACTORY = DATA_BLOB.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / DATA_BLOB.SIZEOF);
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
        public DATA_BLOB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("DWORD")
        public int cbData() {
            return DATA_BLOB.ncbData(address());
        }

        @NativeType("BYTE *")
        public ByteBuffer pbData() {
            return DATA_BLOB.npbData(address());
        }

        public Buffer pbData(@NativeType("BYTE *") ByteBuffer value) {
            DATA_BLOB.npbData(address(), value);
            return this;
        }
    }
}
