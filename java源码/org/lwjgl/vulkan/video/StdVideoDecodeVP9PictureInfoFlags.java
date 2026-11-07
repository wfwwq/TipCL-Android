package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeVP9PictureInfoFlags.class */
public class StdVideoDecodeVP9PictureInfoFlags extends Struct<StdVideoDecodeVP9PictureInfoFlags> implements NativeResource {
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

    protected StdVideoDecodeVP9PictureInfoFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeVP9PictureInfoFlags create(long address, ByteBuffer container) {
        return new StdVideoDecodeVP9PictureInfoFlags(address, container);
    }

    public StdVideoDecodeVP9PictureInfoFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean error_resilient_mode() {
        return nerror_resilient_mode(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean intra_only() {
        return nintra_only(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean allow_high_precision_mv() {
        return nallow_high_precision_mv(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean refresh_frame_context() {
        return nrefresh_frame_context(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean frame_parallel_decoding_mode() {
        return nframe_parallel_decoding_mode(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean segmentation_enabled() {
        return nsegmentation_enabled(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean show_frame() {
        return nshow_frame(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean UsePrevFrameMvs() {
        return nUsePrevFrameMvs(address()) != 0;
    }

    public StdVideoDecodeVP9PictureInfoFlags error_resilient_mode(@NativeType("uint32_t") boolean value) {
        nerror_resilient_mode(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeVP9PictureInfoFlags intra_only(@NativeType("uint32_t") boolean value) {
        nintra_only(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeVP9PictureInfoFlags allow_high_precision_mv(@NativeType("uint32_t") boolean value) {
        nallow_high_precision_mv(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeVP9PictureInfoFlags refresh_frame_context(@NativeType("uint32_t") boolean value) {
        nrefresh_frame_context(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeVP9PictureInfoFlags frame_parallel_decoding_mode(@NativeType("uint32_t") boolean value) {
        nframe_parallel_decoding_mode(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeVP9PictureInfoFlags segmentation_enabled(@NativeType("uint32_t") boolean value) {
        nsegmentation_enabled(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeVP9PictureInfoFlags show_frame(@NativeType("uint32_t") boolean value) {
        nshow_frame(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeVP9PictureInfoFlags UsePrevFrameMvs(@NativeType("uint32_t") boolean value) {
        nUsePrevFrameMvs(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoDecodeVP9PictureInfoFlags set(boolean error_resilient_mode, boolean intra_only, boolean allow_high_precision_mv, boolean refresh_frame_context, boolean frame_parallel_decoding_mode, boolean segmentation_enabled, boolean show_frame, boolean UsePrevFrameMvs) {
        error_resilient_mode(error_resilient_mode);
        intra_only(intra_only);
        allow_high_precision_mv(allow_high_precision_mv);
        refresh_frame_context(refresh_frame_context);
        frame_parallel_decoding_mode(frame_parallel_decoding_mode);
        segmentation_enabled(segmentation_enabled);
        show_frame(show_frame);
        UsePrevFrameMvs(UsePrevFrameMvs);
        return this;
    }

    public StdVideoDecodeVP9PictureInfoFlags set(StdVideoDecodeVP9PictureInfoFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeVP9PictureInfoFlags malloc() {
        return new StdVideoDecodeVP9PictureInfoFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeVP9PictureInfoFlags calloc() {
        return new StdVideoDecodeVP9PictureInfoFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeVP9PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeVP9PictureInfoFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeVP9PictureInfoFlags create(long address) {
        return new StdVideoDecodeVP9PictureInfoFlags(address, null);
    }

    public static StdVideoDecodeVP9PictureInfoFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeVP9PictureInfoFlags(address, null);
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

    public static StdVideoDecodeVP9PictureInfoFlags malloc(MemoryStack stack) {
        return new StdVideoDecodeVP9PictureInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeVP9PictureInfoFlags calloc(MemoryStack stack) {
        return new StdVideoDecodeVP9PictureInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nerror_resilient_mode(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nintra_only(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nallow_high_precision_mv(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nrefresh_frame_context(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nframe_parallel_decoding_mode(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static int nsegmentation_enabled(long struct) {
        return (nbitfield0(struct) & 32) >>> 5;
    }

    public static int nshow_frame(long struct) {
        return (nbitfield0(struct) & 64) >>> 6;
    }

    public static int nUsePrevFrameMvs(long struct) {
        return (nbitfield0(struct) & 128) >>> 7;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & 16777215;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nerror_resilient_mode(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nintra_only(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nallow_high_precision_mv(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nrefresh_frame_context(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nframe_parallel_decoding_mode(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    public static void nsegmentation_enabled(long struct, int value) {
        nbitfield0(struct, ((value << 5) & 32) | (nbitfield0(struct) & (-33)));
    }

    public static void nshow_frame(long struct, int value) {
        nbitfield0(struct, ((value << 6) & 64) | (nbitfield0(struct) & (-65)));
    }

    public static void nUsePrevFrameMvs(long struct, int value) {
        nbitfield0(struct, ((value << 7) & 128) | (nbitfield0(struct) & (-129)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-16777216)) | (value & 16777215));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeVP9PictureInfoFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeVP9PictureInfoFlags, Buffer> implements NativeResource {
        private static final StdVideoDecodeVP9PictureInfoFlags ELEMENT_FACTORY = StdVideoDecodeVP9PictureInfoFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeVP9PictureInfoFlags.SIZEOF);
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
        public StdVideoDecodeVP9PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean error_resilient_mode() {
            return StdVideoDecodeVP9PictureInfoFlags.nerror_resilient_mode(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean intra_only() {
            return StdVideoDecodeVP9PictureInfoFlags.nintra_only(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean allow_high_precision_mv() {
            return StdVideoDecodeVP9PictureInfoFlags.nallow_high_precision_mv(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean refresh_frame_context() {
            return StdVideoDecodeVP9PictureInfoFlags.nrefresh_frame_context(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean frame_parallel_decoding_mode() {
            return StdVideoDecodeVP9PictureInfoFlags.nframe_parallel_decoding_mode(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean segmentation_enabled() {
            return StdVideoDecodeVP9PictureInfoFlags.nsegmentation_enabled(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean show_frame() {
            return StdVideoDecodeVP9PictureInfoFlags.nshow_frame(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean UsePrevFrameMvs() {
            return StdVideoDecodeVP9PictureInfoFlags.nUsePrevFrameMvs(address()) != 0;
        }

        public Buffer error_resilient_mode(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeVP9PictureInfoFlags.nerror_resilient_mode(address(), value ? 1 : 0);
            return this;
        }

        public Buffer intra_only(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeVP9PictureInfoFlags.nintra_only(address(), value ? 1 : 0);
            return this;
        }

        public Buffer allow_high_precision_mv(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeVP9PictureInfoFlags.nallow_high_precision_mv(address(), value ? 1 : 0);
            return this;
        }

        public Buffer refresh_frame_context(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeVP9PictureInfoFlags.nrefresh_frame_context(address(), value ? 1 : 0);
            return this;
        }

        public Buffer frame_parallel_decoding_mode(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeVP9PictureInfoFlags.nframe_parallel_decoding_mode(address(), value ? 1 : 0);
            return this;
        }

        public Buffer segmentation_enabled(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeVP9PictureInfoFlags.nsegmentation_enabled(address(), value ? 1 : 0);
            return this;
        }

        public Buffer show_frame(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeVP9PictureInfoFlags.nshow_frame(address(), value ? 1 : 0);
            return this;
        }

        public Buffer UsePrevFrameMvs(@NativeType("uint32_t") boolean value) {
            StdVideoDecodeVP9PictureInfoFlags.nUsePrevFrameMvs(address(), value ? 1 : 0);
            return this;
        }
    }
}
