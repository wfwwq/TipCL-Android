package org.lwjgl.stb;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.stb.STBTTPackedchar;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackRange.class
 */
@NativeType("struct stbtt_pack_range")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackRange.class */
public class STBTTPackRange extends Struct<STBTTPackRange> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FONT_SIZE;
    public static final int FIRST_UNICODE_CODEPOINT_IN_RANGE;
    public static final int ARRAY_OF_UNICODE_CODEPOINTS;
    public static final int NUM_CHARS;
    public static final int CHARDATA_FOR_RANGE;
    public static final int H_OVERSAMPLE;
    public static final int V_OVERSAMPLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FONT_SIZE = layout.offsetof(0);
        FIRST_UNICODE_CODEPOINT_IN_RANGE = layout.offsetof(1);
        ARRAY_OF_UNICODE_CODEPOINTS = layout.offsetof(2);
        NUM_CHARS = layout.offsetof(3);
        CHARDATA_FOR_RANGE = layout.offsetof(4);
        H_OVERSAMPLE = layout.offsetof(5);
        V_OVERSAMPLE = layout.offsetof(6);
    }

    protected STBTTPackRange(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBTTPackRange create(long address, ByteBuffer container) {
        return new STBTTPackRange(address, container);
    }

    public STBTTPackRange(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public float font_size() {
        return nfont_size(address());
    }

    public int first_unicode_codepoint_in_range() {
        return nfirst_unicode_codepoint_in_range(address());
    }

    @NativeType("int *")
    public IntBuffer array_of_unicode_codepoints() {
        return narray_of_unicode_codepoints(address());
    }

    public int num_chars() {
        return nnum_chars(address());
    }

    @NativeType("stbtt_packedchar *")
    public STBTTPackedchar.Buffer chardata_for_range() {
        return nchardata_for_range(address());
    }

    @NativeType("unsigned char")
    public byte h_oversample() {
        return nh_oversample(address());
    }

    @NativeType("unsigned char")
    public byte v_oversample() {
        return nv_oversample(address());
    }

    public STBTTPackRange font_size(float value) {
        nfont_size(address(), value);
        return this;
    }

    public STBTTPackRange first_unicode_codepoint_in_range(int value) {
        nfirst_unicode_codepoint_in_range(address(), value);
        return this;
    }

    public STBTTPackRange array_of_unicode_codepoints(@NativeType("int *") IntBuffer value) {
        narray_of_unicode_codepoints(address(), value);
        return this;
    }

    public STBTTPackRange num_chars(int value) {
        nnum_chars(address(), value);
        return this;
    }

    public STBTTPackRange chardata_for_range(@NativeType("stbtt_packedchar *") STBTTPackedchar.Buffer value) {
        nchardata_for_range(address(), value);
        return this;
    }

    public STBTTPackRange h_oversample(@NativeType("unsigned char") byte value) {
        nh_oversample(address(), value);
        return this;
    }

    public STBTTPackRange v_oversample(@NativeType("unsigned char") byte value) {
        nv_oversample(address(), value);
        return this;
    }

    public STBTTPackRange set(float font_size, int first_unicode_codepoint_in_range, IntBuffer array_of_unicode_codepoints, int num_chars, STBTTPackedchar.Buffer chardata_for_range, byte h_oversample, byte v_oversample) {
        font_size(font_size);
        first_unicode_codepoint_in_range(first_unicode_codepoint_in_range);
        array_of_unicode_codepoints(array_of_unicode_codepoints);
        num_chars(num_chars);
        chardata_for_range(chardata_for_range);
        h_oversample(h_oversample);
        v_oversample(v_oversample);
        return this;
    }

    public STBTTPackRange set(STBTTPackRange src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static STBTTPackRange malloc() {
        return new STBTTPackRange(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBTTPackRange calloc() {
        return new STBTTPackRange(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBTTPackRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBTTPackRange(MemoryUtil.memAddress(container), container);
    }

    public static STBTTPackRange create(long address) {
        return new STBTTPackRange(address, null);
    }

    public static STBTTPackRange createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBTTPackRange(address, null);
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

    public static STBTTPackRange malloc(MemoryStack stack) {
        return new STBTTPackRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBTTPackRange calloc(MemoryStack stack) {
        return new STBTTPackRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static float nfont_size(long struct) {
        return MemoryUtil.memGetFloat(struct + FONT_SIZE);
    }

    public static int nfirst_unicode_codepoint_in_range(long struct) {
        return MemoryUtil.memGetInt(struct + FIRST_UNICODE_CODEPOINT_IN_RANGE);
    }

    public static IntBuffer narray_of_unicode_codepoints(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + ARRAY_OF_UNICODE_CODEPOINTS), nnum_chars(struct));
    }

    public static int nnum_chars(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_CHARS);
    }

    public static STBTTPackedchar.Buffer nchardata_for_range(long struct) {
        return STBTTPackedchar.create(MemoryUtil.memGetAddress(struct + CHARDATA_FOR_RANGE), nnum_chars(struct));
    }

    public static byte nh_oversample(long struct) {
        return MemoryUtil.memGetByte(struct + H_OVERSAMPLE);
    }

    public static byte nv_oversample(long struct) {
        return MemoryUtil.memGetByte(struct + V_OVERSAMPLE);
    }

    public static void nfont_size(long struct, float value) {
        MemoryUtil.memPutFloat(struct + FONT_SIZE, value);
    }

    public static void nfirst_unicode_codepoint_in_range(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRST_UNICODE_CODEPOINT_IN_RANGE, value);
    }

    public static void narray_of_unicode_codepoints(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + ARRAY_OF_UNICODE_CODEPOINTS, MemoryUtil.memAddressSafe(value));
    }

    public static void nnum_chars(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_CHARS, value);
    }

    public static void nchardata_for_range(long struct, STBTTPackedchar.Buffer value) {
        MemoryUtil.memPutAddress(struct + CHARDATA_FOR_RANGE, value.address());
    }

    public static void nh_oversample(long struct, byte value) {
        MemoryUtil.memPutByte(struct + H_OVERSAMPLE, value);
    }

    public static void nv_oversample(long struct, byte value) {
        MemoryUtil.memPutByte(struct + V_OVERSAMPLE, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + CHARDATA_FOR_RANGE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackRange$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackRange$Buffer.class */
    public static class Buffer extends StructBuffer<STBTTPackRange, Buffer> implements NativeResource {
        private static final STBTTPackRange ELEMENT_FACTORY = STBTTPackRange.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBTTPackRange.SIZEOF);
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
        public STBTTPackRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float font_size() {
            return STBTTPackRange.nfont_size(address());
        }

        public int first_unicode_codepoint_in_range() {
            return STBTTPackRange.nfirst_unicode_codepoint_in_range(address());
        }

        @NativeType("int *")
        public IntBuffer array_of_unicode_codepoints() {
            return STBTTPackRange.narray_of_unicode_codepoints(address());
        }

        public int num_chars() {
            return STBTTPackRange.nnum_chars(address());
        }

        @NativeType("stbtt_packedchar *")
        public STBTTPackedchar.Buffer chardata_for_range() {
            return STBTTPackRange.nchardata_for_range(address());
        }

        @NativeType("unsigned char")
        public byte h_oversample() {
            return STBTTPackRange.nh_oversample(address());
        }

        @NativeType("unsigned char")
        public byte v_oversample() {
            return STBTTPackRange.nv_oversample(address());
        }

        public Buffer font_size(float value) {
            STBTTPackRange.nfont_size(address(), value);
            return this;
        }

        public Buffer first_unicode_codepoint_in_range(int value) {
            STBTTPackRange.nfirst_unicode_codepoint_in_range(address(), value);
            return this;
        }

        public Buffer array_of_unicode_codepoints(@NativeType("int *") IntBuffer value) {
            STBTTPackRange.narray_of_unicode_codepoints(address(), value);
            return this;
        }

        public Buffer num_chars(int value) {
            STBTTPackRange.nnum_chars(address(), value);
            return this;
        }

        public Buffer chardata_for_range(@NativeType("stbtt_packedchar *") STBTTPackedchar.Buffer value) {
            STBTTPackRange.nchardata_for_range(address(), value);
            return this;
        }

        public Buffer h_oversample(@NativeType("unsigned char") byte value) {
            STBTTPackRange.nh_oversample(address(), value);
            return this;
        }

        public Buffer v_oversample(@NativeType("unsigned char") byte value) {
            STBTTPackRange.nv_oversample(address(), value);
            return this;
        }
    }
}
