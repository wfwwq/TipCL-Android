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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SfntLangTag.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SfntLangTag.class */
public class FT_SfntLangTag extends Struct<FT_SfntLangTag> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STRING;
    public static final int STRING_LEN;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STRING = layout.offsetof(0);
        STRING_LEN = layout.offsetof(1);
    }

    protected FT_SfntLangTag(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_SfntLangTag create(long address, ByteBuffer container) {
        return new FT_SfntLangTag(address, container);
    }

    public FT_SfntLangTag(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_Byte *")
    public ByteBuffer string() {
        return nstring(address());
    }

    @NativeType("FT_UInt")
    public int string_len() {
        return nstring_len(address());
    }

    public static FT_SfntLangTag malloc() {
        return new FT_SfntLangTag(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_SfntLangTag calloc() {
        return new FT_SfntLangTag(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_SfntLangTag create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_SfntLangTag(MemoryUtil.memAddress(container), container);
    }

    public static FT_SfntLangTag create(long address) {
        return new FT_SfntLangTag(address, null);
    }

    public static FT_SfntLangTag createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_SfntLangTag(address, null);
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

    public static FT_SfntLangTag malloc(MemoryStack stack) {
        return new FT_SfntLangTag(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_SfntLangTag calloc(MemoryStack stack) {
        return new FT_SfntLangTag(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nstring(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + STRING), nstring_len(struct));
    }

    public static int nstring_len(long struct) {
        return MemoryUtil.memGetInt(struct + STRING_LEN);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SfntLangTag$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SfntLangTag$Buffer.class */
    public static class Buffer extends StructBuffer<FT_SfntLangTag, Buffer> implements NativeResource {
        private static final FT_SfntLangTag ELEMENT_FACTORY = FT_SfntLangTag.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_SfntLangTag.SIZEOF);
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
        public FT_SfntLangTag getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_Byte *")
        public ByteBuffer string() {
            return FT_SfntLangTag.nstring(address());
        }

        @NativeType("FT_UInt")
        public int string_len() {
            return FT_SfntLangTag.nstring_len(address());
        }
    }
}
