package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_text")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_text.class */
public class spng_text extends Struct<spng_text> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int KEYWORD;
    public static final int TYPE;
    public static final int LENGTH;
    public static final int TEXT;
    public static final int COMPRESSION_FLAG;
    public static final int COMPRESSION_METHOD;
    public static final int LANGUAGE_TAG;
    public static final int TRANSLATED_KEYWORD;

    static {
        Struct.Layout layout = __struct(__array(1, 80), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(1), __member(1), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        KEYWORD = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        LENGTH = layout.offsetof(2);
        TEXT = layout.offsetof(3);
        COMPRESSION_FLAG = layout.offsetof(4);
        COMPRESSION_METHOD = layout.offsetof(5);
        LANGUAGE_TAG = layout.offsetof(6);
        TRANSLATED_KEYWORD = layout.offsetof(7);
    }

    protected spng_text(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_text create(long address, ByteBuffer container) {
        return new spng_text(address, container);
    }

    public spng_text(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char[80]")
    public ByteBuffer keyword() {
        return nkeyword(address());
    }

    @NativeType("char[80]")
    public String keywordString() {
        return nkeywordString(address());
    }

    public int type() {
        return ntype(address());
    }

    @NativeType("size_t")
    public long length() {
        return nlength(address());
    }

    @NativeType("char *")
    public ByteBuffer text() {
        return ntext(address());
    }

    @NativeType("char *")
    public String textString() {
        return ntextString(address());
    }

    @NativeType("uint8_t")
    public byte compression_flag() {
        return ncompression_flag(address());
    }

    @NativeType("uint8_t")
    public byte compression_method() {
        return ncompression_method(address());
    }

    @NativeType("char *")
    public ByteBuffer language_tag() {
        return nlanguage_tag(address());
    }

    @NativeType("char *")
    public String language_tagString() {
        return nlanguage_tagString(address());
    }

    @NativeType("char *")
    public ByteBuffer translated_keyword() {
        return ntranslated_keyword(address());
    }

    @NativeType("char *")
    public String translated_keywordString() {
        return ntranslated_keywordString(address());
    }

    public spng_text keyword(@NativeType("char[80]") ByteBuffer value) {
        nkeyword(address(), value);
        return this;
    }

    public spng_text type(int value) {
        ntype(address(), value);
        return this;
    }

    public spng_text text(@NativeType("char *") ByteBuffer value) {
        ntext(address(), value);
        return this;
    }

    public spng_text compression_flag(@NativeType("uint8_t") byte value) {
        ncompression_flag(address(), value);
        return this;
    }

    public spng_text compression_method(@NativeType("uint8_t") byte value) {
        ncompression_method(address(), value);
        return this;
    }

    public spng_text language_tag(@NativeType("char *") ByteBuffer value) {
        nlanguage_tag(address(), value);
        return this;
    }

    public spng_text translated_keyword(@NativeType("char *") ByteBuffer value) {
        ntranslated_keyword(address(), value);
        return this;
    }

    public spng_text set(ByteBuffer keyword, int type, ByteBuffer text, byte compression_flag, byte compression_method, ByteBuffer language_tag, ByteBuffer translated_keyword) {
        keyword(keyword);
        type(type);
        text(text);
        compression_flag(compression_flag);
        compression_method(compression_method);
        language_tag(language_tag);
        translated_keyword(translated_keyword);
        return this;
    }

    public spng_text set(spng_text src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_text malloc() {
        return new spng_text(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_text calloc() {
        return new spng_text(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_text create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_text(MemoryUtil.memAddress(container), container);
    }

    public static spng_text create(long address) {
        return new spng_text(address, null);
    }

    public static spng_text createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_text(address, null);
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

    public static spng_text malloc(MemoryStack stack) {
        return new spng_text(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_text calloc(MemoryStack stack) {
        return new spng_text(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nkeyword(long struct) {
        return MemoryUtil.memByteBuffer(struct + KEYWORD, 80);
    }

    public static String nkeywordString(long struct) {
        return MemoryUtil.memASCII(struct + KEYWORD);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static long nlength(long struct) {
        return MemoryUtil.memGetAddress(struct + LENGTH);
    }

    public static ByteBuffer ntext(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + TEXT));
    }

    public static String ntextString(long struct) {
        return MemoryUtil.memASCII(MemoryUtil.memGetAddress(struct + TEXT));
    }

    public static byte ncompression_flag(long struct) {
        return MemoryUtil.memGetByte(struct + COMPRESSION_FLAG);
    }

    public static byte ncompression_method(long struct) {
        return MemoryUtil.memGetByte(struct + COMPRESSION_METHOD);
    }

    public static ByteBuffer nlanguage_tag(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + LANGUAGE_TAG));
    }

    public static String nlanguage_tagString(long struct) {
        return MemoryUtil.memASCII(MemoryUtil.memGetAddress(struct + LANGUAGE_TAG));
    }

    public static ByteBuffer ntranslated_keyword(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + TRANSLATED_KEYWORD));
    }

    public static String ntranslated_keywordString(long struct) {
        return MemoryUtil.memASCII(MemoryUtil.memGetAddress(struct + TRANSLATED_KEYWORD));
    }

    public static void nkeyword(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
            Checks.checkGT(value, 80);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + KEYWORD, value.remaining());
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nlength(long struct, long value) {
        MemoryUtil.memPutAddress(struct + LENGTH, value);
    }

    public static void ntext(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + TEXT, MemoryUtil.memAddress(value));
        nlength(struct, value.remaining());
    }

    public static void ncompression_flag(long struct, byte value) {
        MemoryUtil.memPutByte(struct + COMPRESSION_FLAG, value);
    }

    public static void ncompression_method(long struct, byte value) {
        MemoryUtil.memPutByte(struct + COMPRESSION_METHOD, value);
    }

    public static void nlanguage_tag(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + LANGUAGE_TAG, MemoryUtil.memAddress(value));
    }

    public static void ntranslated_keyword(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + TRANSLATED_KEYWORD, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + TEXT));
        Checks.check(MemoryUtil.memGetAddress(struct + LANGUAGE_TAG));
        Checks.check(MemoryUtil.memGetAddress(struct + TRANSLATED_KEYWORD));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_text$Buffer.class */
    public static class Buffer extends StructBuffer<spng_text, Buffer> implements NativeResource {
        private static final spng_text ELEMENT_FACTORY = spng_text.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_text.SIZEOF);
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
        public spng_text getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char[80]")
        public ByteBuffer keyword() {
            return spng_text.nkeyword(address());
        }

        @NativeType("char[80]")
        public String keywordString() {
            return spng_text.nkeywordString(address());
        }

        public int type() {
            return spng_text.ntype(address());
        }

        @NativeType("size_t")
        public long length() {
            return spng_text.nlength(address());
        }

        @NativeType("char *")
        public ByteBuffer text() {
            return spng_text.ntext(address());
        }

        @NativeType("char *")
        public String textString() {
            return spng_text.ntextString(address());
        }

        @NativeType("uint8_t")
        public byte compression_flag() {
            return spng_text.ncompression_flag(address());
        }

        @NativeType("uint8_t")
        public byte compression_method() {
            return spng_text.ncompression_method(address());
        }

        @NativeType("char *")
        public ByteBuffer language_tag() {
            return spng_text.nlanguage_tag(address());
        }

        @NativeType("char *")
        public String language_tagString() {
            return spng_text.nlanguage_tagString(address());
        }

        @NativeType("char *")
        public ByteBuffer translated_keyword() {
            return spng_text.ntranslated_keyword(address());
        }

        @NativeType("char *")
        public String translated_keywordString() {
            return spng_text.ntranslated_keywordString(address());
        }

        public Buffer keyword(@NativeType("char[80]") ByteBuffer value) {
            spng_text.nkeyword(address(), value);
            return this;
        }

        public Buffer type(int value) {
            spng_text.ntype(address(), value);
            return this;
        }

        public Buffer text(@NativeType("char *") ByteBuffer value) {
            spng_text.ntext(address(), value);
            return this;
        }

        public Buffer compression_flag(@NativeType("uint8_t") byte value) {
            spng_text.ncompression_flag(address(), value);
            return this;
        }

        public Buffer compression_method(@NativeType("uint8_t") byte value) {
            spng_text.ncompression_method(address(), value);
            return this;
        }

        public Buffer language_tag(@NativeType("char *") ByteBuffer value) {
            spng_text.nlanguage_tag(address(), value);
            return this;
        }

        public Buffer translated_keyword(@NativeType("char *") ByteBuffer value) {
            spng_text.ntranslated_keyword(address(), value);
            return this;
        }
    }
}
