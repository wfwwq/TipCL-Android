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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SfntName.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SfntName.class */
public class FT_SfntName extends Struct<FT_SfntName> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PLATFORM_ID;
    public static final int ENCODING_ID;
    public static final int LANGUAGE_ID;
    public static final int NAME_ID;
    public static final int STRING;
    public static final int STRING_LEN;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(2), __member(2), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PLATFORM_ID = layout.offsetof(0);
        ENCODING_ID = layout.offsetof(1);
        LANGUAGE_ID = layout.offsetof(2);
        NAME_ID = layout.offsetof(3);
        STRING = layout.offsetof(4);
        STRING_LEN = layout.offsetof(5);
    }

    protected FT_SfntName(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_SfntName create(long address, ByteBuffer container) {
        return new FT_SfntName(address, container);
    }

    public FT_SfntName(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_UShort")
    public short platform_id() {
        return nplatform_id(address());
    }

    @NativeType("FT_UShort")
    public short encoding_id() {
        return nencoding_id(address());
    }

    @NativeType("FT_UShort")
    public short language_id() {
        return nlanguage_id(address());
    }

    @NativeType("FT_UShort")
    public short name_id() {
        return nname_id(address());
    }

    @NativeType("FT_Byte *")
    public ByteBuffer string() {
        return nstring(address());
    }

    @NativeType("FT_UInt")
    public int string_len() {
        return nstring_len(address());
    }

    public static FT_SfntName malloc() {
        return new FT_SfntName(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_SfntName calloc() {
        return new FT_SfntName(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_SfntName create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_SfntName(MemoryUtil.memAddress(container), container);
    }

    public static FT_SfntName create(long address) {
        return new FT_SfntName(address, null);
    }

    public static FT_SfntName createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_SfntName(address, null);
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

    public static FT_SfntName malloc(MemoryStack stack) {
        return new FT_SfntName(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_SfntName calloc(MemoryStack stack) {
        return new FT_SfntName(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nplatform_id(long struct) {
        return MemoryUtil.memGetShort(struct + PLATFORM_ID);
    }

    public static short nencoding_id(long struct) {
        return MemoryUtil.memGetShort(struct + ENCODING_ID);
    }

    public static short nlanguage_id(long struct) {
        return MemoryUtil.memGetShort(struct + LANGUAGE_ID);
    }

    public static short nname_id(long struct) {
        return MemoryUtil.memGetShort(struct + NAME_ID);
    }

    public static ByteBuffer nstring(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + STRING), nstring_len(struct));
    }

    public static int nstring_len(long struct) {
        return MemoryUtil.memGetInt(struct + STRING_LEN);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SfntName$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_SfntName$Buffer.class */
    public static class Buffer extends StructBuffer<FT_SfntName, Buffer> implements NativeResource {
        private static final FT_SfntName ELEMENT_FACTORY = FT_SfntName.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_SfntName.SIZEOF);
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
        public FT_SfntName getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_UShort")
        public short platform_id() {
            return FT_SfntName.nplatform_id(address());
        }

        @NativeType("FT_UShort")
        public short encoding_id() {
            return FT_SfntName.nencoding_id(address());
        }

        @NativeType("FT_UShort")
        public short language_id() {
            return FT_SfntName.nlanguage_id(address());
        }

        @NativeType("FT_UShort")
        public short name_id() {
            return FT_SfntName.nname_id(address());
        }

        @NativeType("FT_Byte *")
        public ByteBuffer string() {
            return FT_SfntName.nstring(address());
        }

        @NativeType("FT_UInt")
        public int string_len() {
            return FT_SfntName.nstring_len(address());
        }
    }
}
