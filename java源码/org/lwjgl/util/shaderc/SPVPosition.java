package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spv_position_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVPosition.class */
public class SPVPosition extends Struct<SPVPosition> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LINE;
    public static final int COLUMN;
    public static final int INDEX;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LINE = layout.offsetof(0);
        COLUMN = layout.offsetof(1);
        INDEX = layout.offsetof(2);
    }

    protected SPVPosition(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SPVPosition create(long address, ByteBuffer container) {
        return new SPVPosition(address, container);
    }

    public SPVPosition(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("size_t")
    public long line() {
        return nline(address());
    }

    @NativeType("size_t")
    public long column() {
        return ncolumn(address());
    }

    @NativeType("size_t")
    public long index() {
        return nindex(address());
    }

    public SPVPosition line(@NativeType("size_t") long value) {
        nline(address(), value);
        return this;
    }

    public SPVPosition column(@NativeType("size_t") long value) {
        ncolumn(address(), value);
        return this;
    }

    public SPVPosition index(@NativeType("size_t") long value) {
        nindex(address(), value);
        return this;
    }

    public SPVPosition set(long line, long column, long index) {
        line(line);
        column(column);
        index(index);
        return this;
    }

    public SPVPosition set(SPVPosition src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SPVPosition malloc() {
        return new SPVPosition(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SPVPosition calloc() {
        return new SPVPosition(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SPVPosition create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVPosition(MemoryUtil.memAddress(container), container);
    }

    public static SPVPosition create(long address) {
        return new SPVPosition(address, null);
    }

    public static SPVPosition createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SPVPosition(address, null);
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

    public static SPVPosition malloc(MemoryStack stack) {
        return new SPVPosition(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SPVPosition calloc(MemoryStack stack) {
        return new SPVPosition(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nline(long struct) {
        return MemoryUtil.memGetAddress(struct + LINE);
    }

    public static long ncolumn(long struct) {
        return MemoryUtil.memGetAddress(struct + COLUMN);
    }

    public static long nindex(long struct) {
        return MemoryUtil.memGetAddress(struct + INDEX);
    }

    public static void nline(long struct, long value) {
        MemoryUtil.memPutAddress(struct + LINE, value);
    }

    public static void ncolumn(long struct, long value) {
        MemoryUtil.memPutAddress(struct + COLUMN, value);
    }

    public static void nindex(long struct, long value) {
        MemoryUtil.memPutAddress(struct + INDEX, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVPosition$Buffer.class */
    public static class Buffer extends StructBuffer<SPVPosition, Buffer> implements NativeResource {
        private static final SPVPosition ELEMENT_FACTORY = SPVPosition.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SPVPosition.SIZEOF);
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
        public SPVPosition getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("size_t")
        public long line() {
            return SPVPosition.nline(address());
        }

        @NativeType("size_t")
        public long column() {
            return SPVPosition.ncolumn(address());
        }

        @NativeType("size_t")
        public long index() {
            return SPVPosition.nindex(address());
        }

        public Buffer line(@NativeType("size_t") long value) {
            SPVPosition.nline(address(), value);
            return this;
        }

        public Buffer column(@NativeType("size_t") long value) {
            SPVPosition.ncolumn(address(), value);
            return this;
        }

        public Buffer index(@NativeType("size_t") long value) {
            SPVPosition.nindex(address(), value);
            return this;
        }
    }
}
