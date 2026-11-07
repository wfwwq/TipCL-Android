package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265HrdParameters.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265HrdParameters.class */
public class StdVideoH265HrdParameters extends Struct<StdVideoH265HrdParameters> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int TICK_DIVISOR_MINUS2;
    public static final int DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1;
    public static final int DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1;
    public static final int BIT_RATE_SCALE;
    public static final int CPB_SIZE_SCALE;
    public static final int CPB_SIZE_DU_SCALE;
    public static final int INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1;
    public static final int AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1;
    public static final int DPB_OUTPUT_DELAY_LENGTH_MINUS1;
    public static final int CPB_CNT_MINUS1;
    public static final int ELEMENTAL_DURATION_IN_TC_MINUS1;
    public static final int RESERVED;
    public static final int PSUBLAYERHRDPARAMETERSNAL;
    public static final int PSUBLAYERHRDPARAMETERSVCL;

    static {
        Struct.Layout layout = __struct(__member(StdVideoH265HrdFlags.SIZEOF, StdVideoH265HrdFlags.ALIGNOF), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __array(1, 7), __array(2, 7), __array(2, 3), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        TICK_DIVISOR_MINUS2 = layout.offsetof(1);
        DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1 = layout.offsetof(2);
        DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1 = layout.offsetof(3);
        BIT_RATE_SCALE = layout.offsetof(4);
        CPB_SIZE_SCALE = layout.offsetof(5);
        CPB_SIZE_DU_SCALE = layout.offsetof(6);
        INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1 = layout.offsetof(7);
        AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1 = layout.offsetof(8);
        DPB_OUTPUT_DELAY_LENGTH_MINUS1 = layout.offsetof(9);
        CPB_CNT_MINUS1 = layout.offsetof(10);
        ELEMENTAL_DURATION_IN_TC_MINUS1 = layout.offsetof(11);
        RESERVED = layout.offsetof(12);
        PSUBLAYERHRDPARAMETERSNAL = layout.offsetof(13);
        PSUBLAYERHRDPARAMETERSVCL = layout.offsetof(14);
    }

    protected StdVideoH265HrdParameters(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265HrdParameters create(long address, ByteBuffer container) {
        return new StdVideoH265HrdParameters(address, container);
    }

    public StdVideoH265HrdParameters(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoH265HrdFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte tick_divisor_minus2() {
        return ntick_divisor_minus2(address());
    }

    @NativeType("uint8_t")
    public byte du_cpb_removal_delay_increment_length_minus1() {
        return ndu_cpb_removal_delay_increment_length_minus1(address());
    }

    @NativeType("uint8_t")
    public byte dpb_output_delay_du_length_minus1() {
        return ndpb_output_delay_du_length_minus1(address());
    }

    @NativeType("uint8_t")
    public byte bit_rate_scale() {
        return nbit_rate_scale(address());
    }

    @NativeType("uint8_t")
    public byte cpb_size_scale() {
        return ncpb_size_scale(address());
    }

    @NativeType("uint8_t")
    public byte cpb_size_du_scale() {
        return ncpb_size_du_scale(address());
    }

    @NativeType("uint8_t")
    public byte initial_cpb_removal_delay_length_minus1() {
        return ninitial_cpb_removal_delay_length_minus1(address());
    }

    @NativeType("uint8_t")
    public byte au_cpb_removal_delay_length_minus1() {
        return nau_cpb_removal_delay_length_minus1(address());
    }

    @NativeType("uint8_t")
    public byte dpb_output_delay_length_minus1() {
        return ndpb_output_delay_length_minus1(address());
    }

    @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
    public ByteBuffer cpb_cnt_minus1() {
        return ncpb_cnt_minus1(address());
    }

    @NativeType("uint8_t")
    public byte cpb_cnt_minus1(int index) {
        return ncpb_cnt_minus1(address(), index);
    }

    @NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
    public ShortBuffer elemental_duration_in_tc_minus1() {
        return nelemental_duration_in_tc_minus1(address());
    }

    @NativeType("uint16_t")
    public short elemental_duration_in_tc_minus1(int index) {
        return nelemental_duration_in_tc_minus1(address(), index);
    }

    @NativeType("StdVideoH265SubLayerHrdParameters const *")
    public StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersNal() {
        return npSubLayerHrdParametersNal(address());
    }

    @NativeType("StdVideoH265SubLayerHrdParameters const *")
    public StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersVcl() {
        return npSubLayerHrdParametersVcl(address());
    }

    public StdVideoH265HrdParameters flags(StdVideoH265HrdFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters flags(Consumer<StdVideoH265HrdFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoH265HrdParameters tick_divisor_minus2(@NativeType("uint8_t") byte value) {
        ntick_divisor_minus2(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters du_cpb_removal_delay_increment_length_minus1(@NativeType("uint8_t") byte value) {
        ndu_cpb_removal_delay_increment_length_minus1(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters dpb_output_delay_du_length_minus1(@NativeType("uint8_t") byte value) {
        ndpb_output_delay_du_length_minus1(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters bit_rate_scale(@NativeType("uint8_t") byte value) {
        nbit_rate_scale(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters cpb_size_scale(@NativeType("uint8_t") byte value) {
        ncpb_size_scale(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters cpb_size_du_scale(@NativeType("uint8_t") byte value) {
        ncpb_size_du_scale(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters initial_cpb_removal_delay_length_minus1(@NativeType("uint8_t") byte value) {
        ninitial_cpb_removal_delay_length_minus1(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters au_cpb_removal_delay_length_minus1(@NativeType("uint8_t") byte value) {
        nau_cpb_removal_delay_length_minus1(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters dpb_output_delay_length_minus1(@NativeType("uint8_t") byte value) {
        ndpb_output_delay_length_minus1(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters cpb_cnt_minus1(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") ByteBuffer value) {
        ncpb_cnt_minus1(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters cpb_cnt_minus1(int index, @NativeType("uint8_t") byte value) {
        ncpb_cnt_minus1(address(), index, value);
        return this;
    }

    public StdVideoH265HrdParameters elemental_duration_in_tc_minus1(@NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") ShortBuffer value) {
        nelemental_duration_in_tc_minus1(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters elemental_duration_in_tc_minus1(int index, @NativeType("uint16_t") short value) {
        nelemental_duration_in_tc_minus1(address(), index, value);
        return this;
    }

    public StdVideoH265HrdParameters pSubLayerHrdParametersNal(@NativeType("StdVideoH265SubLayerHrdParameters const *") StdVideoH265SubLayerHrdParameters value) {
        npSubLayerHrdParametersNal(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters pSubLayerHrdParametersVcl(@NativeType("StdVideoH265SubLayerHrdParameters const *") StdVideoH265SubLayerHrdParameters value) {
        npSubLayerHrdParametersVcl(address(), value);
        return this;
    }

    public StdVideoH265HrdParameters set(StdVideoH265HrdFlags flags, byte tick_divisor_minus2, byte du_cpb_removal_delay_increment_length_minus1, byte dpb_output_delay_du_length_minus1, byte bit_rate_scale, byte cpb_size_scale, byte cpb_size_du_scale, byte initial_cpb_removal_delay_length_minus1, byte au_cpb_removal_delay_length_minus1, byte dpb_output_delay_length_minus1, ByteBuffer cpb_cnt_minus1, ShortBuffer elemental_duration_in_tc_minus1, StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersNal, StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersVcl) {
        flags(flags);
        tick_divisor_minus2(tick_divisor_minus2);
        du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1);
        dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1);
        bit_rate_scale(bit_rate_scale);
        cpb_size_scale(cpb_size_scale);
        cpb_size_du_scale(cpb_size_du_scale);
        initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1);
        au_cpb_removal_delay_length_minus1(au_cpb_removal_delay_length_minus1);
        dpb_output_delay_length_minus1(dpb_output_delay_length_minus1);
        cpb_cnt_minus1(cpb_cnt_minus1);
        elemental_duration_in_tc_minus1(elemental_duration_in_tc_minus1);
        pSubLayerHrdParametersNal(pSubLayerHrdParametersNal);
        pSubLayerHrdParametersVcl(pSubLayerHrdParametersVcl);
        return this;
    }

    public StdVideoH265HrdParameters set(StdVideoH265HrdParameters src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265HrdParameters malloc() {
        return new StdVideoH265HrdParameters(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265HrdParameters calloc() {
        return new StdVideoH265HrdParameters(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265HrdParameters create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265HrdParameters(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265HrdParameters create(long address) {
        return new StdVideoH265HrdParameters(address, null);
    }

    public static StdVideoH265HrdParameters createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265HrdParameters(address, null);
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

    public static StdVideoH265HrdParameters malloc(MemoryStack stack) {
        return new StdVideoH265HrdParameters(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265HrdParameters calloc(MemoryStack stack) {
        return new StdVideoH265HrdParameters(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoH265HrdFlags nflags(long struct) {
        return StdVideoH265HrdFlags.create(struct + FLAGS);
    }

    public static byte ntick_divisor_minus2(long struct) {
        return MemoryUtil.memGetByte(struct + TICK_DIVISOR_MINUS2);
    }

    public static byte ndu_cpb_removal_delay_increment_length_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1);
    }

    public static byte ndpb_output_delay_du_length_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1);
    }

    public static byte nbit_rate_scale(long struct) {
        return MemoryUtil.memGetByte(struct + BIT_RATE_SCALE);
    }

    public static byte ncpb_size_scale(long struct) {
        return MemoryUtil.memGetByte(struct + CPB_SIZE_SCALE);
    }

    public static byte ncpb_size_du_scale(long struct) {
        return MemoryUtil.memGetByte(struct + CPB_SIZE_DU_SCALE);
    }

    public static byte ninitial_cpb_removal_delay_length_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1);
    }

    public static byte nau_cpb_removal_delay_length_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1);
    }

    public static byte ndpb_output_delay_length_minus1(long struct) {
        return MemoryUtil.memGetByte(struct + DPB_OUTPUT_DELAY_LENGTH_MINUS1);
    }

    public static ByteBuffer ncpb_cnt_minus1(long struct) {
        return MemoryUtil.memByteBuffer(struct + CPB_CNT_MINUS1, 7);
    }

    public static byte ncpb_cnt_minus1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CPB_CNT_MINUS1 + (Checks.check(index, 7) * 1));
    }

    public static ShortBuffer nelemental_duration_in_tc_minus1(long struct) {
        return MemoryUtil.memShortBuffer(struct + ELEMENTAL_DURATION_IN_TC_MINUS1, 7);
    }

    public static short nelemental_duration_in_tc_minus1(long struct, int index) {
        return MemoryUtil.memGetShort(struct + ELEMENTAL_DURATION_IN_TC_MINUS1 + (Checks.check(index, 7) * 2));
    }

    public static ShortBuffer nreserved(long struct) {
        return MemoryUtil.memShortBuffer(struct + RESERVED, 3);
    }

    public static short nreserved(long struct, int index) {
        return MemoryUtil.memGetShort(struct + RESERVED + (Checks.check(index, 3) * 2));
    }

    public static StdVideoH265SubLayerHrdParameters npSubLayerHrdParametersNal(long struct) {
        return StdVideoH265SubLayerHrdParameters.create(MemoryUtil.memGetAddress(struct + PSUBLAYERHRDPARAMETERSNAL));
    }

    public static StdVideoH265SubLayerHrdParameters npSubLayerHrdParametersVcl(long struct) {
        return StdVideoH265SubLayerHrdParameters.create(MemoryUtil.memGetAddress(struct + PSUBLAYERHRDPARAMETERSVCL));
    }

    public static void nflags(long struct, StdVideoH265HrdFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoH265HrdFlags.SIZEOF);
    }

    public static void ntick_divisor_minus2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TICK_DIVISOR_MINUS2, value);
    }

    public static void ndu_cpb_removal_delay_increment_length_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1, value);
    }

    public static void ndpb_output_delay_du_length_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1, value);
    }

    public static void nbit_rate_scale(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BIT_RATE_SCALE, value);
    }

    public static void ncpb_size_scale(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CPB_SIZE_SCALE, value);
    }

    public static void ncpb_size_du_scale(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CPB_SIZE_DU_SCALE, value);
    }

    public static void ninitial_cpb_removal_delay_length_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1, value);
    }

    public static void nau_cpb_removal_delay_length_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1, value);
    }

    public static void ndpb_output_delay_length_minus1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DPB_OUTPUT_DELAY_LENGTH_MINUS1, value);
    }

    public static void ncpb_cnt_minus1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CPB_CNT_MINUS1, value.remaining() * 1);
    }

    public static void ncpb_cnt_minus1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CPB_CNT_MINUS1 + (Checks.check(index, 7) * 1), value);
    }

    public static void nelemental_duration_in_tc_minus1(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + ELEMENTAL_DURATION_IN_TC_MINUS1, value.remaining() * 2);
    }

    public static void nelemental_duration_in_tc_minus1(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + ELEMENTAL_DURATION_IN_TC_MINUS1 + (Checks.check(index, 7) * 2), value);
    }

    public static void nreserved(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESERVED, value.remaining() * 2);
    }

    public static void nreserved(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + RESERVED + (Checks.check(index, 3) * 2), value);
    }

    public static void npSubLayerHrdParametersNal(long struct, StdVideoH265SubLayerHrdParameters value) {
        MemoryUtil.memPutAddress(struct + PSUBLAYERHRDPARAMETERSNAL, value.address());
    }

    public static void npSubLayerHrdParametersVcl(long struct, StdVideoH265SubLayerHrdParameters value) {
        MemoryUtil.memPutAddress(struct + PSUBLAYERHRDPARAMETERSVCL, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSUBLAYERHRDPARAMETERSNAL));
        Checks.check(MemoryUtil.memGetAddress(struct + PSUBLAYERHRDPARAMETERSVCL));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265HrdParameters$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265HrdParameters$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265HrdParameters, Buffer> implements NativeResource {
        private static final StdVideoH265HrdParameters ELEMENT_FACTORY = StdVideoH265HrdParameters.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265HrdParameters.SIZEOF);
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
        public StdVideoH265HrdParameters getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoH265HrdFlags flags() {
            return StdVideoH265HrdParameters.nflags(address());
        }

        @NativeType("uint8_t")
        public byte tick_divisor_minus2() {
            return StdVideoH265HrdParameters.ntick_divisor_minus2(address());
        }

        @NativeType("uint8_t")
        public byte du_cpb_removal_delay_increment_length_minus1() {
            return StdVideoH265HrdParameters.ndu_cpb_removal_delay_increment_length_minus1(address());
        }

        @NativeType("uint8_t")
        public byte dpb_output_delay_du_length_minus1() {
            return StdVideoH265HrdParameters.ndpb_output_delay_du_length_minus1(address());
        }

        @NativeType("uint8_t")
        public byte bit_rate_scale() {
            return StdVideoH265HrdParameters.nbit_rate_scale(address());
        }

        @NativeType("uint8_t")
        public byte cpb_size_scale() {
            return StdVideoH265HrdParameters.ncpb_size_scale(address());
        }

        @NativeType("uint8_t")
        public byte cpb_size_du_scale() {
            return StdVideoH265HrdParameters.ncpb_size_du_scale(address());
        }

        @NativeType("uint8_t")
        public byte initial_cpb_removal_delay_length_minus1() {
            return StdVideoH265HrdParameters.ninitial_cpb_removal_delay_length_minus1(address());
        }

        @NativeType("uint8_t")
        public byte au_cpb_removal_delay_length_minus1() {
            return StdVideoH265HrdParameters.nau_cpb_removal_delay_length_minus1(address());
        }

        @NativeType("uint8_t")
        public byte dpb_output_delay_length_minus1() {
            return StdVideoH265HrdParameters.ndpb_output_delay_length_minus1(address());
        }

        @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
        public ByteBuffer cpb_cnt_minus1() {
            return StdVideoH265HrdParameters.ncpb_cnt_minus1(address());
        }

        @NativeType("uint8_t")
        public byte cpb_cnt_minus1(int index) {
            return StdVideoH265HrdParameters.ncpb_cnt_minus1(address(), index);
        }

        @NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
        public ShortBuffer elemental_duration_in_tc_minus1() {
            return StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(address());
        }

        @NativeType("uint16_t")
        public short elemental_duration_in_tc_minus1(int index) {
            return StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(address(), index);
        }

        @NativeType("StdVideoH265SubLayerHrdParameters const *")
        public StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersNal() {
            return StdVideoH265HrdParameters.npSubLayerHrdParametersNal(address());
        }

        @NativeType("StdVideoH265SubLayerHrdParameters const *")
        public StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersVcl() {
            return StdVideoH265HrdParameters.npSubLayerHrdParametersVcl(address());
        }

        public Buffer flags(StdVideoH265HrdFlags value) {
            StdVideoH265HrdParameters.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoH265HrdFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer tick_divisor_minus2(@NativeType("uint8_t") byte value) {
            StdVideoH265HrdParameters.ntick_divisor_minus2(address(), value);
            return this;
        }

        public Buffer du_cpb_removal_delay_increment_length_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265HrdParameters.ndu_cpb_removal_delay_increment_length_minus1(address(), value);
            return this;
        }

        public Buffer dpb_output_delay_du_length_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265HrdParameters.ndpb_output_delay_du_length_minus1(address(), value);
            return this;
        }

        public Buffer bit_rate_scale(@NativeType("uint8_t") byte value) {
            StdVideoH265HrdParameters.nbit_rate_scale(address(), value);
            return this;
        }

        public Buffer cpb_size_scale(@NativeType("uint8_t") byte value) {
            StdVideoH265HrdParameters.ncpb_size_scale(address(), value);
            return this;
        }

        public Buffer cpb_size_du_scale(@NativeType("uint8_t") byte value) {
            StdVideoH265HrdParameters.ncpb_size_du_scale(address(), value);
            return this;
        }

        public Buffer initial_cpb_removal_delay_length_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265HrdParameters.ninitial_cpb_removal_delay_length_minus1(address(), value);
            return this;
        }

        public Buffer au_cpb_removal_delay_length_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265HrdParameters.nau_cpb_removal_delay_length_minus1(address(), value);
            return this;
        }

        public Buffer dpb_output_delay_length_minus1(@NativeType("uint8_t") byte value) {
            StdVideoH265HrdParameters.ndpb_output_delay_length_minus1(address(), value);
            return this;
        }

        public Buffer cpb_cnt_minus1(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") ByteBuffer value) {
            StdVideoH265HrdParameters.ncpb_cnt_minus1(address(), value);
            return this;
        }

        public Buffer cpb_cnt_minus1(int index, @NativeType("uint8_t") byte value) {
            StdVideoH265HrdParameters.ncpb_cnt_minus1(address(), index, value);
            return this;
        }

        public Buffer elemental_duration_in_tc_minus1(@NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") ShortBuffer value) {
            StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(address(), value);
            return this;
        }

        public Buffer elemental_duration_in_tc_minus1(int index, @NativeType("uint16_t") short value) {
            StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(address(), index, value);
            return this;
        }

        public Buffer pSubLayerHrdParametersNal(@NativeType("StdVideoH265SubLayerHrdParameters const *") StdVideoH265SubLayerHrdParameters value) {
            StdVideoH265HrdParameters.npSubLayerHrdParametersNal(address(), value);
            return this;
        }

        public Buffer pSubLayerHrdParametersVcl(@NativeType("StdVideoH265SubLayerHrdParameters const *") StdVideoH265SubLayerHrdParameters value) {
            StdVideoH265HrdParameters.npSubLayerHrdParametersVcl(address(), value);
            return this;
        }
    }
}
