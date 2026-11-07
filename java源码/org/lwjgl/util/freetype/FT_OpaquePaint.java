package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_OpaquePaint.class
 */
@NativeType("struct FT_OpaquePaintRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_OpaquePaint.class */
public class FT_OpaquePaint extends Struct<FT_OpaquePaint> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int P;
    public static final int INSERT_ROOT_TRANSFORM;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        P = layout.offsetof(0);
        INSERT_ROOT_TRANSFORM = layout.offsetof(1);
    }

    protected FT_OpaquePaint(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_OpaquePaint create(long address, ByteBuffer container) {
        return new FT_OpaquePaint(address, container);
    }

    public FT_OpaquePaint(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Byte *")
    public ByteBuffer p(int capacity) {
        return np(address(), capacity);
    }

    @NativeType("FT_Bool")
    public boolean insert_root_transform() {
        return ninsert_root_transform(address());
    }

    public static FT_OpaquePaint malloc() {
        return new FT_OpaquePaint(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_OpaquePaint calloc() {
        return new FT_OpaquePaint(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_OpaquePaint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_OpaquePaint(MemoryUtil.memAddress(container), container);
    }

    public static FT_OpaquePaint create(long address) {
        return new FT_OpaquePaint(address, null);
    }

    public static FT_OpaquePaint createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_OpaquePaint(address, null);
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

    public static FT_OpaquePaint malloc(MemoryStack stack) {
        return new FT_OpaquePaint(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_OpaquePaint calloc(MemoryStack stack) {
        return new FT_OpaquePaint(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer np(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + P), capacity);
    }

    public static boolean ninsert_root_transform(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) INSERT_ROOT_TRANSFORM)) != 0;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_OpaquePaint$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_OpaquePaint$Buffer.class */
    public static class Buffer extends StructBuffer<FT_OpaquePaint, Buffer> implements NativeResource {
        private static final FT_OpaquePaint ELEMENT_FACTORY = FT_OpaquePaint.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_OpaquePaint.SIZEOF);
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
        public FT_OpaquePaint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Byte *")
        public ByteBuffer p(int capacity) {
            return FT_OpaquePaint.np(address(), capacity);
        }

        @NativeType("FT_Bool")
        public boolean insert_root_transform() {
            return FT_OpaquePaint.ninsert_root_transform(address());
        }
    }
}
