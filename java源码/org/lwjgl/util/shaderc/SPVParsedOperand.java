package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spv_parsed_operand_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVParsedOperand.class */
public class SPVParsedOperand extends Struct<SPVParsedOperand> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OFFSET;
    public static final int NUM_WORDS;
    public static final int TYPE;
    public static final int NUMBER_KIND;
    public static final int NUMBER_BIT_WIDTH;
    public static final int FP_ENCODING;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET = layout.offsetof(0);
        NUM_WORDS = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        NUMBER_KIND = layout.offsetof(3);
        NUMBER_BIT_WIDTH = layout.offsetof(4);
        FP_ENCODING = layout.offsetof(5);
    }

    protected SPVParsedOperand(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SPVParsedOperand create(long address, ByteBuffer container) {
        return new SPVParsedOperand(address, container);
    }

    public SPVParsedOperand(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint16_t")
    public short offset() {
        return noffset(address());
    }

    @NativeType("uint16_t")
    public short num_words() {
        return nnum_words(address());
    }

    @NativeType("spv_operand_type_t")
    public int type() {
        return ntype(address());
    }

    @NativeType("spv_number_kind_t")
    public int number_kind() {
        return nnumber_kind(address());
    }

    @NativeType("uint32_t")
    public int number_bit_width() {
        return nnumber_bit_width(address());
    }

    @NativeType("spv_fp_encoding_t")
    public int fp_encoding() {
        return nfp_encoding(address());
    }

    public SPVParsedOperand offset(@NativeType("uint16_t") short value) {
        noffset(address(), value);
        return this;
    }

    public SPVParsedOperand num_words(@NativeType("uint16_t") short value) {
        nnum_words(address(), value);
        return this;
    }

    public SPVParsedOperand type(@NativeType("spv_operand_type_t") int value) {
        ntype(address(), value);
        return this;
    }

    public SPVParsedOperand number_kind(@NativeType("spv_number_kind_t") int value) {
        nnumber_kind(address(), value);
        return this;
    }

    public SPVParsedOperand number_bit_width(@NativeType("uint32_t") int value) {
        nnumber_bit_width(address(), value);
        return this;
    }

    public SPVParsedOperand fp_encoding(@NativeType("spv_fp_encoding_t") int value) {
        nfp_encoding(address(), value);
        return this;
    }

    public SPVParsedOperand set(short offset, short num_words, int type, int number_kind, int number_bit_width, int fp_encoding) {
        offset(offset);
        num_words(num_words);
        type(type);
        number_kind(number_kind);
        number_bit_width(number_bit_width);
        fp_encoding(fp_encoding);
        return this;
    }

    public SPVParsedOperand set(SPVParsedOperand src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SPVParsedOperand malloc() {
        return new SPVParsedOperand(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SPVParsedOperand calloc() {
        return new SPVParsedOperand(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SPVParsedOperand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVParsedOperand(MemoryUtil.memAddress(container), container);
    }

    public static SPVParsedOperand create(long address) {
        return new SPVParsedOperand(address, null);
    }

    public static SPVParsedOperand createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SPVParsedOperand(address, null);
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

    public static SPVParsedOperand malloc(MemoryStack stack) {
        return new SPVParsedOperand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SPVParsedOperand calloc(MemoryStack stack) {
        return new SPVParsedOperand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short noffset(long struct) {
        return MemoryUtil.memGetShort(struct + OFFSET);
    }

    public static short nnum_words(long struct) {
        return MemoryUtil.memGetShort(struct + NUM_WORDS);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nnumber_kind(long struct) {
        return MemoryUtil.memGetInt(struct + NUMBER_KIND);
    }

    public static int nnumber_bit_width(long struct) {
        return MemoryUtil.memGetInt(struct + NUMBER_BIT_WIDTH);
    }

    public static int nfp_encoding(long struct) {
        return MemoryUtil.memGetInt(struct + FP_ENCODING);
    }

    public static void noffset(long struct, short value) {
        MemoryUtil.memPutShort(struct + OFFSET, value);
    }

    public static void nnum_words(long struct, short value) {
        MemoryUtil.memPutShort(struct + NUM_WORDS, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nnumber_kind(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUMBER_KIND, value);
    }

    public static void nnumber_bit_width(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUMBER_BIT_WIDTH, value);
    }

    public static void nfp_encoding(long struct, int value) {
        MemoryUtil.memPutInt(struct + FP_ENCODING, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVParsedOperand$Buffer.class */
    public static class Buffer extends StructBuffer<SPVParsedOperand, Buffer> implements NativeResource {
        private static final SPVParsedOperand ELEMENT_FACTORY = SPVParsedOperand.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SPVParsedOperand.SIZEOF);
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
        public SPVParsedOperand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint16_t")
        public short offset() {
            return SPVParsedOperand.noffset(address());
        }

        @NativeType("uint16_t")
        public short num_words() {
            return SPVParsedOperand.nnum_words(address());
        }

        @NativeType("spv_operand_type_t")
        public int type() {
            return SPVParsedOperand.ntype(address());
        }

        @NativeType("spv_number_kind_t")
        public int number_kind() {
            return SPVParsedOperand.nnumber_kind(address());
        }

        @NativeType("uint32_t")
        public int number_bit_width() {
            return SPVParsedOperand.nnumber_bit_width(address());
        }

        @NativeType("spv_fp_encoding_t")
        public int fp_encoding() {
            return SPVParsedOperand.nfp_encoding(address());
        }

        public Buffer offset(@NativeType("uint16_t") short value) {
            SPVParsedOperand.noffset(address(), value);
            return this;
        }

        public Buffer num_words(@NativeType("uint16_t") short value) {
            SPVParsedOperand.nnum_words(address(), value);
            return this;
        }

        public Buffer type(@NativeType("spv_operand_type_t") int value) {
            SPVParsedOperand.ntype(address(), value);
            return this;
        }

        public Buffer number_kind(@NativeType("spv_number_kind_t") int value) {
            SPVParsedOperand.nnumber_kind(address(), value);
            return this;
        }

        public Buffer number_bit_width(@NativeType("uint32_t") int value) {
            SPVParsedOperand.nnumber_bit_width(address(), value);
            return this;
        }

        public Buffer fp_encoding(@NativeType("spv_fp_encoding_t") int value) {
            SPVParsedOperand.nfp_encoding(address(), value);
            return this;
        }
    }
}
