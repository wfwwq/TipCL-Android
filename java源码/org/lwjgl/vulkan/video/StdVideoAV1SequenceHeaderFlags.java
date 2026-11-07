package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1SequenceHeaderFlags.class */
public class StdVideoAV1SequenceHeaderFlags extends Struct<StdVideoAV1SequenceHeaderFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;
    public static final int BITFIELD1;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    protected StdVideoAV1SequenceHeaderFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1SequenceHeaderFlags create(long address, ByteBuffer container) {
        return new StdVideoAV1SequenceHeaderFlags(address, container);
    }

    public StdVideoAV1SequenceHeaderFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean still_picture() {
        return nstill_picture(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean reduced_still_picture_header() {
        return nreduced_still_picture_header(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean use_128x128_superblock() {
        return nuse_128x128_superblock(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_filter_intra() {
        return nenable_filter_intra(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_intra_edge_filter() {
        return nenable_intra_edge_filter(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_interintra_compound() {
        return nenable_interintra_compound(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_masked_compound() {
        return nenable_masked_compound(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_warped_motion() {
        return nenable_warped_motion(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_dual_filter() {
        return nenable_dual_filter(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_order_hint() {
        return nenable_order_hint(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_jnt_comp() {
        return nenable_jnt_comp(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_ref_frame_mvs() {
        return nenable_ref_frame_mvs(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean frame_id_numbers_present_flag() {
        return nframe_id_numbers_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_superres() {
        return nenable_superres(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_cdef() {
        return nenable_cdef(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean enable_restoration() {
        return nenable_restoration(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean film_grain_params_present() {
        return nfilm_grain_params_present(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean timing_info_present_flag() {
        return ntiming_info_present_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean initial_display_delay_present_flag() {
        return ninitial_display_delay_present_flag(address()) != 0;
    }

    public StdVideoAV1SequenceHeaderFlags still_picture(@NativeType("uint32_t") boolean value) {
        nstill_picture(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags reduced_still_picture_header(@NativeType("uint32_t") boolean value) {
        nreduced_still_picture_header(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags use_128x128_superblock(@NativeType("uint32_t") boolean value) {
        nuse_128x128_superblock(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_filter_intra(@NativeType("uint32_t") boolean value) {
        nenable_filter_intra(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_intra_edge_filter(@NativeType("uint32_t") boolean value) {
        nenable_intra_edge_filter(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_interintra_compound(@NativeType("uint32_t") boolean value) {
        nenable_interintra_compound(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_masked_compound(@NativeType("uint32_t") boolean value) {
        nenable_masked_compound(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_warped_motion(@NativeType("uint32_t") boolean value) {
        nenable_warped_motion(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_dual_filter(@NativeType("uint32_t") boolean value) {
        nenable_dual_filter(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_order_hint(@NativeType("uint32_t") boolean value) {
        nenable_order_hint(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_jnt_comp(@NativeType("uint32_t") boolean value) {
        nenable_jnt_comp(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_ref_frame_mvs(@NativeType("uint32_t") boolean value) {
        nenable_ref_frame_mvs(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags frame_id_numbers_present_flag(@NativeType("uint32_t") boolean value) {
        nframe_id_numbers_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_superres(@NativeType("uint32_t") boolean value) {
        nenable_superres(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_cdef(@NativeType("uint32_t") boolean value) {
        nenable_cdef(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags enable_restoration(@NativeType("uint32_t") boolean value) {
        nenable_restoration(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags film_grain_params_present(@NativeType("uint32_t") boolean value) {
        nfilm_grain_params_present(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags timing_info_present_flag(@NativeType("uint32_t") boolean value) {
        ntiming_info_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags initial_display_delay_present_flag(@NativeType("uint32_t") boolean value) {
        ninitial_display_delay_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags set(boolean still_picture, boolean reduced_still_picture_header, boolean use_128x128_superblock, boolean enable_filter_intra, boolean enable_intra_edge_filter, boolean enable_interintra_compound, boolean enable_masked_compound, boolean enable_warped_motion, boolean enable_dual_filter, boolean enable_order_hint, boolean enable_jnt_comp, boolean enable_ref_frame_mvs, boolean frame_id_numbers_present_flag, boolean enable_superres, boolean enable_cdef, boolean enable_restoration, boolean film_grain_params_present, boolean timing_info_present_flag, boolean initial_display_delay_present_flag) {
        still_picture(still_picture);
        reduced_still_picture_header(reduced_still_picture_header);
        use_128x128_superblock(use_128x128_superblock);
        enable_filter_intra(enable_filter_intra);
        enable_intra_edge_filter(enable_intra_edge_filter);
        enable_interintra_compound(enable_interintra_compound);
        enable_masked_compound(enable_masked_compound);
        enable_warped_motion(enable_warped_motion);
        enable_dual_filter(enable_dual_filter);
        enable_order_hint(enable_order_hint);
        enable_jnt_comp(enable_jnt_comp);
        enable_ref_frame_mvs(enable_ref_frame_mvs);
        frame_id_numbers_present_flag(frame_id_numbers_present_flag);
        enable_superres(enable_superres);
        enable_cdef(enable_cdef);
        enable_restoration(enable_restoration);
        film_grain_params_present(film_grain_params_present);
        timing_info_present_flag(timing_info_present_flag);
        initial_display_delay_present_flag(initial_display_delay_present_flag);
        return this;
    }

    public StdVideoAV1SequenceHeaderFlags set(StdVideoAV1SequenceHeaderFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1SequenceHeaderFlags malloc() {
        return new StdVideoAV1SequenceHeaderFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1SequenceHeaderFlags calloc() {
        return new StdVideoAV1SequenceHeaderFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1SequenceHeaderFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1SequenceHeaderFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1SequenceHeaderFlags create(long address) {
        return new StdVideoAV1SequenceHeaderFlags(address, null);
    }

    public static StdVideoAV1SequenceHeaderFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1SequenceHeaderFlags(address, null);
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

    public static StdVideoAV1SequenceHeaderFlags malloc(MemoryStack stack) {
        return new StdVideoAV1SequenceHeaderFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1SequenceHeaderFlags calloc(MemoryStack stack) {
        return new StdVideoAV1SequenceHeaderFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbitfield0(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD0);
    }

    public static int nstill_picture(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nreduced_still_picture_header(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nuse_128x128_superblock(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nenable_filter_intra(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nenable_intra_edge_filter(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int nenable_interintra_compound(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static int nenable_masked_compound(long struct) {
        return (nbitfield0(struct) & 64) >>> 6;
    }

    public static int nenable_warped_motion(long struct) {
        return (nbitfield0(struct) & 128) >>> 7;
    }

    public static int nenable_dual_filter(long struct) {
        return (nbitfield0(struct) & 256) >>> 8;
    }

    public static int nenable_order_hint(long struct) {
        return (nbitfield0(struct) & 512) >>> 9;
    }

    public static int nenable_jnt_comp(long struct) {
        return (nbitfield0(struct) & 1024) >>> 10;
    }

    public static int nenable_ref_frame_mvs(long struct) {
        return (nbitfield0(struct) & 2048) >>> 11;
    }

    public static int nframe_id_numbers_present_flag(long struct) {
        return (nbitfield0(struct) & 4096) >>> 12;
    }

    public static int nenable_superres(long struct) {
        return (nbitfield0(struct) & 8192) >>> 13;
    }

    public static int nenable_cdef(long struct) {
        return (nbitfield0(struct) & 16384) >>> 14;
    }

    public static int nenable_restoration(long struct) {
        return (nbitfield0(struct) & 32768) >>> 15;
    }

    public static int nfilm_grain_params_present(long struct) {
        return (nbitfield0(struct) & 65536) >>> 16;
    }

    public static int ntiming_info_present_flag(long struct) {
        return (nbitfield0(struct) & 131072) >>> 17;
    }

    public static int ninitial_display_delay_present_flag(long struct) {
        return (nbitfield0(struct) & 262144) >>> 18;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & 8191;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nstill_picture(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nreduced_still_picture_header(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nuse_128x128_superblock(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nenable_filter_intra(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nenable_intra_edge_filter(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void nenable_interintra_compound(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    public static void nenable_masked_compound(long struct, int value) {
        nbitfield0(struct, ((value << 6) & 64) | (nbitfield0(struct) & (-65)));
    }

    public static void nenable_warped_motion(long struct, int value) {
        nbitfield0(struct, ((value << 7) & 128) | (nbitfield0(struct) & (-129)));
    }

    public static void nenable_dual_filter(long struct, int value) {
        nbitfield0(struct, ((value << 8) & 256) | (nbitfield0(struct) & (-257)));
    }

    public static void nenable_order_hint(long struct, int value) {
        nbitfield0(struct, ((value << 9) & 512) | (nbitfield0(struct) & (-513)));
    }

    public static void nenable_jnt_comp(long struct, int value) {
        nbitfield0(struct, ((value << 10) & 1024) | (nbitfield0(struct) & (-1025)));
    }

    public static void nenable_ref_frame_mvs(long struct, int value) {
        nbitfield0(struct, ((value << 11) & 2048) | (nbitfield0(struct) & (-2049)));
    }

    public static void nframe_id_numbers_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 12) & 4096) | (nbitfield0(struct) & (-4097)));
    }

    public static void nenable_superres(long struct, int value) {
        nbitfield0(struct, ((value << 13) & 8192) | (nbitfield0(struct) & (-8193)));
    }

    public static void nenable_cdef(long struct, int value) {
        nbitfield0(struct, ((value << 14) & 16384) | (nbitfield0(struct) & (-16385)));
    }

    public static void nenable_restoration(long struct, int value) {
        nbitfield0(struct, ((value << 15) & 32768) | (nbitfield0(struct) & (-32769)));
    }

    public static void nfilm_grain_params_present(long struct, int value) {
        nbitfield0(struct, ((value << 16) & 65536) | (nbitfield0(struct) & (-65537)));
    }

    public static void ntiming_info_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 17) & 131072) | (nbitfield0(struct) & (-131073)));
    }

    public static void ninitial_display_delay_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 18) & 262144) | (nbitfield0(struct) & (-262145)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-8192)) | (value & 8191));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1SequenceHeaderFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1SequenceHeaderFlags, Buffer> implements NativeResource {
        private static final StdVideoAV1SequenceHeaderFlags ELEMENT_FACTORY = StdVideoAV1SequenceHeaderFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1SequenceHeaderFlags.SIZEOF);
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
        public StdVideoAV1SequenceHeaderFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean still_picture() {
            return StdVideoAV1SequenceHeaderFlags.nstill_picture(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean reduced_still_picture_header() {
            return StdVideoAV1SequenceHeaderFlags.nreduced_still_picture_header(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean use_128x128_superblock() {
            return StdVideoAV1SequenceHeaderFlags.nuse_128x128_superblock(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_filter_intra() {
            return StdVideoAV1SequenceHeaderFlags.nenable_filter_intra(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_intra_edge_filter() {
            return StdVideoAV1SequenceHeaderFlags.nenable_intra_edge_filter(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_interintra_compound() {
            return StdVideoAV1SequenceHeaderFlags.nenable_interintra_compound(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_masked_compound() {
            return StdVideoAV1SequenceHeaderFlags.nenable_masked_compound(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_warped_motion() {
            return StdVideoAV1SequenceHeaderFlags.nenable_warped_motion(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_dual_filter() {
            return StdVideoAV1SequenceHeaderFlags.nenable_dual_filter(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_order_hint() {
            return StdVideoAV1SequenceHeaderFlags.nenable_order_hint(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_jnt_comp() {
            return StdVideoAV1SequenceHeaderFlags.nenable_jnt_comp(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_ref_frame_mvs() {
            return StdVideoAV1SequenceHeaderFlags.nenable_ref_frame_mvs(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean frame_id_numbers_present_flag() {
            return StdVideoAV1SequenceHeaderFlags.nframe_id_numbers_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_superres() {
            return StdVideoAV1SequenceHeaderFlags.nenable_superres(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_cdef() {
            return StdVideoAV1SequenceHeaderFlags.nenable_cdef(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean enable_restoration() {
            return StdVideoAV1SequenceHeaderFlags.nenable_restoration(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean film_grain_params_present() {
            return StdVideoAV1SequenceHeaderFlags.nfilm_grain_params_present(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean timing_info_present_flag() {
            return StdVideoAV1SequenceHeaderFlags.ntiming_info_present_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean initial_display_delay_present_flag() {
            return StdVideoAV1SequenceHeaderFlags.ninitial_display_delay_present_flag(address()) != 0;
        }

        public Buffer still_picture(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nstill_picture(address(), value ? 1 : 0);
            return this;
        }

        public Buffer reduced_still_picture_header(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nreduced_still_picture_header(address(), value ? 1 : 0);
            return this;
        }

        public Buffer use_128x128_superblock(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nuse_128x128_superblock(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_filter_intra(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_filter_intra(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_intra_edge_filter(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_intra_edge_filter(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_interintra_compound(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_interintra_compound(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_masked_compound(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_masked_compound(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_warped_motion(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_warped_motion(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_dual_filter(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_dual_filter(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_order_hint(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_order_hint(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_jnt_comp(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_jnt_comp(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_ref_frame_mvs(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_ref_frame_mvs(address(), value ? 1 : 0);
            return this;
        }

        public Buffer frame_id_numbers_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nframe_id_numbers_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_superres(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_superres(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_cdef(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_cdef(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enable_restoration(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nenable_restoration(address(), value ? 1 : 0);
            return this;
        }

        public Buffer film_grain_params_present(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.nfilm_grain_params_present(address(), value ? 1 : 0);
            return this;
        }

        public Buffer timing_info_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.ntiming_info_present_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer initial_display_delay_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoAV1SequenceHeaderFlags.ninitial_display_delay_present_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
