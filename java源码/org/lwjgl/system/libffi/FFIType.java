package org.lwjgl.system.libffi;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/libffi/FFIType.class
 */
@NativeType("struct ffi_type")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/libffi/FFIType.class */
public class FFIType extends Struct<FFIType> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SIZE;
    public static final int ALIGNMENT;
    public static final int TYPE;
    public static final int ELEMENTS;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(2), __member(2), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SIZE = layout.offsetof(0);
        ALIGNMENT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        ELEMENTS = layout.offsetof(3);
    }

    protected FFIType(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FFIType create(long address, ByteBuffer container) {
        return new FFIType(address, container);
    }

    public FFIType(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("size_t")
    public long size() {
        return nsize(address());
    }

    @NativeType("unsigned short")
    public short alignment() {
        return nalignment(address());
    }

    @NativeType("unsigned short")
    public short type() {
        return ntype(address());
    }

    @NativeType("ffi_type *")
    public PointerBuffer elements(int capacity) {
        return nelements(address(), capacity);
    }

    public FFIType size(@NativeType("size_t") long value) {
        nsize(address(), value);
        return this;
    }

    public FFIType alignment(@NativeType("unsigned short") short value) {
        nalignment(address(), value);
        return this;
    }

    public FFIType type(@NativeType("unsigned short") short value) {
        ntype(address(), value);
        return this;
    }

    public FFIType elements(@NativeType("ffi_type *") PointerBuffer value) {
        nelements(address(), value);
        return this;
    }

    public FFIType set(long size, short alignment, short type, PointerBuffer elements) {
        size(size);
        alignment(alignment);
        type(type);
        elements(elements);
        return this;
    }

    public FFIType set(FFIType src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FFIType malloc() {
        return new FFIType(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FFIType calloc() {
        return new FFIType(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FFIType create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FFIType(MemoryUtil.memAddress(container), container);
    }

    public static FFIType create(long address) {
        return new FFIType(address, null);
    }

    public static FFIType createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FFIType(address, null);
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

    public static FFIType malloc(MemoryStack stack) {
        return new FFIType(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FFIType calloc(MemoryStack stack) {
        return new FFIType(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetAddress(struct + SIZE);
    }

    public static short nalignment(long struct) {
        return MemoryUtil.memGetShort(struct + ALIGNMENT);
    }

    public static short ntype(long struct) {
        return MemoryUtil.memGetShort(struct + TYPE);
    }

    public static PointerBuffer nelements(long struct, int capacity) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + ELEMENTS), capacity);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + SIZE, value);
    }

    public static void nalignment(long struct, short value) {
        MemoryUtil.memPutShort(struct + ALIGNMENT, value);
    }

    public static void ntype(long struct, short value) {
        MemoryUtil.memPutShort(struct + TYPE, value);
    }

    public static void nelements(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + ELEMENTS, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/libffi/FFIType$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/libffi/FFIType$Buffer.class */
    public static class Buffer extends StructBuffer<FFIType, Buffer> implements NativeResource {
        private static final FFIType ELEMENT_FACTORY = FFIType.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FFIType.SIZEOF);
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
        public FFIType getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("size_t")
        public long size() {
            return FFIType.nsize(address());
        }

        @NativeType("unsigned short")
        public short alignment() {
            return FFIType.nalignment(address());
        }

        @NativeType("unsigned short")
        public short type() {
            return FFIType.ntype(address());
        }

        @NativeType("ffi_type *")
        public PointerBuffer elements(int capacity) {
            return FFIType.nelements(address(), capacity);
        }

        public Buffer size(@NativeType("size_t") long value) {
            FFIType.nsize(address(), value);
            return this;
        }

        public Buffer alignment(@NativeType("unsigned short") short value) {
            FFIType.nalignment(address(), value);
            return this;
        }

        public Buffer type(@NativeType("unsigned short") short value) {
            FFIType.ntype(address(), value);
            return this;
        }

        public Buffer elements(@NativeType("ffi_type *") PointerBuffer value) {
            FFIType.nelements(address(), value);
            return this;
        }
    }
}
