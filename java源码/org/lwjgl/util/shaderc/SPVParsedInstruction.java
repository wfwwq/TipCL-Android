package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.util.shaderc.SPVParsedOperand;

@NativeType("struct spv_parsed_instruction_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVParsedInstruction.class */
public class SPVParsedInstruction extends Struct<SPVParsedInstruction> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WORDS;
    public static final int NUM_WORDS;
    public static final int OPCODE;
    public static final int EXT_INST_TYPE;
    public static final int TYPE_ID;
    public static final int RESULT_ID;
    public static final int OPERANDS;
    public static final int NUM_OPERANDS;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(2), __member(2), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WORDS = layout.offsetof(0);
        NUM_WORDS = layout.offsetof(1);
        OPCODE = layout.offsetof(2);
        EXT_INST_TYPE = layout.offsetof(3);
        TYPE_ID = layout.offsetof(4);
        RESULT_ID = layout.offsetof(5);
        OPERANDS = layout.offsetof(6);
        NUM_OPERANDS = layout.offsetof(7);
    }

    protected SPVParsedInstruction(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SPVParsedInstruction create(long address, ByteBuffer container) {
        return new SPVParsedInstruction(address, container);
    }

    public SPVParsedInstruction(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t const *")
    public IntBuffer words() {
        return nwords(address());
    }

    @NativeType("uint16_t")
    public short num_words() {
        return nnum_words(address());
    }

    @NativeType("uint16_t")
    public short opcode() {
        return nopcode(address());
    }

    @NativeType("spv_ext_inst_type_t")
    public int ext_inst_type() {
        return next_inst_type(address());
    }

    @NativeType("uint32_t")
    public int type_id() {
        return ntype_id(address());
    }

    @NativeType("uint32_t")
    public int result_id() {
        return nresult_id(address());
    }

    @NativeType("spv_parsed_operand_t const *")
    public SPVParsedOperand.Buffer operands() {
        return noperands(address());
    }

    @NativeType("uint16_t")
    public short num_operands() {
        return nnum_operands(address());
    }

    public SPVParsedInstruction words(@NativeType("uint32_t const *") IntBuffer value) {
        nwords(address(), value);
        return this;
    }

    public SPVParsedInstruction opcode(@NativeType("uint16_t") short value) {
        nopcode(address(), value);
        return this;
    }

    public SPVParsedInstruction ext_inst_type(@NativeType("spv_ext_inst_type_t") int value) {
        next_inst_type(address(), value);
        return this;
    }

    public SPVParsedInstruction type_id(@NativeType("uint32_t") int value) {
        ntype_id(address(), value);
        return this;
    }

    public SPVParsedInstruction result_id(@NativeType("uint32_t") int value) {
        nresult_id(address(), value);
        return this;
    }

    public SPVParsedInstruction operands(@NativeType("spv_parsed_operand_t const *") SPVParsedOperand.Buffer value) {
        noperands(address(), value);
        return this;
    }

    public SPVParsedInstruction set(IntBuffer words, short opcode, int ext_inst_type, int type_id, int result_id, SPVParsedOperand.Buffer operands) {
        words(words);
        opcode(opcode);
        ext_inst_type(ext_inst_type);
        type_id(type_id);
        result_id(result_id);
        operands(operands);
        return this;
    }

    public SPVParsedInstruction set(SPVParsedInstruction src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SPVParsedInstruction malloc() {
        return new SPVParsedInstruction(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SPVParsedInstruction calloc() {
        return new SPVParsedInstruction(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SPVParsedInstruction create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVParsedInstruction(MemoryUtil.memAddress(container), container);
    }

    public static SPVParsedInstruction create(long address) {
        return new SPVParsedInstruction(address, null);
    }

    public static SPVParsedInstruction createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SPVParsedInstruction(address, null);
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

    public static SPVParsedInstruction malloc(MemoryStack stack) {
        return new SPVParsedInstruction(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SPVParsedInstruction calloc(MemoryStack stack) {
        return new SPVParsedInstruction(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static IntBuffer nwords(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + WORDS), Short.toUnsignedInt(nnum_words(struct)));
    }

    public static short nnum_words(long struct) {
        return MemoryUtil.memGetShort(struct + NUM_WORDS);
    }

    public static short nopcode(long struct) {
        return MemoryUtil.memGetShort(struct + OPCODE);
    }

    public static int next_inst_type(long struct) {
        return MemoryUtil.memGetInt(struct + EXT_INST_TYPE);
    }

    public static int ntype_id(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE_ID);
    }

    public static int nresult_id(long struct) {
        return MemoryUtil.memGetInt(struct + RESULT_ID);
    }

    public static SPVParsedOperand.Buffer noperands(long struct) {
        return SPVParsedOperand.create(MemoryUtil.memGetAddress(struct + OPERANDS), Short.toUnsignedInt(nnum_operands(struct)));
    }

    public static short nnum_operands(long struct) {
        return MemoryUtil.memGetShort(struct + NUM_OPERANDS);
    }

    public static void nwords(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + WORDS, MemoryUtil.memAddress(value));
        nnum_words(struct, (short) value.remaining());
    }

    public static void nnum_words(long struct, short value) {
        MemoryUtil.memPutShort(struct + NUM_WORDS, value);
    }

    public static void nopcode(long struct, short value) {
        MemoryUtil.memPutShort(struct + OPCODE, value);
    }

    public static void next_inst_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXT_INST_TYPE, value);
    }

    public static void ntype_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE_ID, value);
    }

    public static void nresult_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESULT_ID, value);
    }

    public static void noperands(long struct, SPVParsedOperand.Buffer value) {
        MemoryUtil.memPutAddress(struct + OPERANDS, value.address());
        nnum_operands(struct, (short) value.remaining());
    }

    public static void nnum_operands(long struct, short value) {
        MemoryUtil.memPutShort(struct + NUM_OPERANDS, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + WORDS));
        Checks.check(MemoryUtil.memGetAddress(struct + OPERANDS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVParsedInstruction$Buffer.class */
    public static class Buffer extends StructBuffer<SPVParsedInstruction, Buffer> implements NativeResource {
        private static final SPVParsedInstruction ELEMENT_FACTORY = SPVParsedInstruction.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SPVParsedInstruction.SIZEOF);
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
        public SPVParsedInstruction getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t const *")
        public IntBuffer words() {
            return SPVParsedInstruction.nwords(address());
        }

        @NativeType("uint16_t")
        public short num_words() {
            return SPVParsedInstruction.nnum_words(address());
        }

        @NativeType("uint16_t")
        public short opcode() {
            return SPVParsedInstruction.nopcode(address());
        }

        @NativeType("spv_ext_inst_type_t")
        public int ext_inst_type() {
            return SPVParsedInstruction.next_inst_type(address());
        }

        @NativeType("uint32_t")
        public int type_id() {
            return SPVParsedInstruction.ntype_id(address());
        }

        @NativeType("uint32_t")
        public int result_id() {
            return SPVParsedInstruction.nresult_id(address());
        }

        @NativeType("spv_parsed_operand_t const *")
        public SPVParsedOperand.Buffer operands() {
            return SPVParsedInstruction.noperands(address());
        }

        @NativeType("uint16_t")
        public short num_operands() {
            return SPVParsedInstruction.nnum_operands(address());
        }

        public Buffer words(@NativeType("uint32_t const *") IntBuffer value) {
            SPVParsedInstruction.nwords(address(), value);
            return this;
        }

        public Buffer opcode(@NativeType("uint16_t") short value) {
            SPVParsedInstruction.nopcode(address(), value);
            return this;
        }

        public Buffer ext_inst_type(@NativeType("spv_ext_inst_type_t") int value) {
            SPVParsedInstruction.next_inst_type(address(), value);
            return this;
        }

        public Buffer type_id(@NativeType("uint32_t") int value) {
            SPVParsedInstruction.ntype_id(address(), value);
            return this;
        }

        public Buffer result_id(@NativeType("uint32_t") int value) {
            SPVParsedInstruction.nresult_id(address(), value);
            return this;
        }

        public Buffer operands(@NativeType("spv_parsed_operand_t const *") SPVParsedOperand.Buffer value) {
            SPVParsedInstruction.noperands(address(), value);
            return this;
        }
    }
}
