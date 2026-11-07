package org.lwjgl.util.freetype;

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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Data.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Data.class */
public class FT_Data extends Struct<FT_Data> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int POINTER;
    public static final int LENGTH;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        POINTER = layout.offsetof(0);
        LENGTH = layout.offsetof(1);
    }

    protected FT_Data(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Data create(long address, ByteBuffer container) {
        return new FT_Data(address, container);
    }

    public FT_Data(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Byte const *")
    public ByteBuffer pointer() {
        return npointer(address());
    }

    @NativeType("FT_UInt")
    public int length() {
        return nlength(address());
    }

    public FT_Data pointer(@NativeType("FT_Byte const *") ByteBuffer value) {
        npointer(address(), value);
        return this;
    }

    public FT_Data set(FT_Data src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Data malloc() {
        return new FT_Data(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Data calloc() {
        return new FT_Data(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Data create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Data(MemoryUtil.memAddress(container), container);
    }

    public static FT_Data create(long address) {
        return new FT_Data(address, null);
    }

    public static FT_Data createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Data(address, null);
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

    public static FT_Data malloc(MemoryStack stack) {
        return new FT_Data(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Data calloc(MemoryStack stack) {
        return new FT_Data(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer npointer(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + POINTER), nlength(struct));
    }

    public static int nlength(long struct) {
        return MemoryUtil.memGetInt(struct + LENGTH);
    }

    public static void npointer(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + POINTER, MemoryUtil.memAddress(value));
        nlength(struct, value.remaining());
    }

    public static void nlength(long struct, int value) {
        MemoryUtil.memPutInt(struct + LENGTH, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + POINTER));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Data$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Data$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Data, Buffer> implements NativeResource {
        private static final FT_Data ELEMENT_FACTORY = FT_Data.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Data.SIZEOF);
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
        public FT_Data getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Byte const *")
        public ByteBuffer pointer() {
            return FT_Data.npointer(address());
        }

        @NativeType("FT_UInt")
        public int length() {
            return FT_Data.nlength(address());
        }

        public Buffer pointer(@NativeType("FT_Byte const *") ByteBuffer value) {
            FT_Data.npointer(address(), value);
            return this;
        }
    }
}
