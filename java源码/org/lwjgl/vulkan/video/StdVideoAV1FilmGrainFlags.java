package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1FilmGrainFlags.class */
public class StdVideoAV1FilmGrainFlags extends Struct<StdVideoAV1FilmGrainFlags> implements NativeResource {
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

    protected StdVideoAV1FilmGrainFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1FilmGrainFlags create(long address, ByteBuffer container) {
        return new StdVideoAV1FilmGrainFlags(address, container);
    }

    public StdVideoAV1FilmGrainFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean chroma_scaling_from_luma() {
        return nchroma_scaling_from_luma(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean overlap_flag() {
        return noverlap_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean clip_to_restricted_range() {
        return nclip_to_restricted_range(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean update_grain() {
        return nupdate_grain(address()) != 0;
    }

    public StdVideoAV1FilmGrainFlags chroma_scaling_from_luma(@NativeType("uint32_t") boolean value) {
        nchroma_scaling_from_luma(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1FilmGrainFlags overlap_flag(@NativeType("uint32_t") boolean value) {
        noverlap_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1FilmGrainFlags clip_to_restricted_range(@NativeType("uint32_t") boolean value) {
        nclip_to_restricted_range(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1FilmGrainFlags update_grain(@NativeType("uint32_t") boolean value) {
        nupdate_grain(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1FilmGrainFlags set(boolean chroma_scaling_from_luma, boolean overlap_flag, boolean clip_to_restricted_range, boolean update_grain) {
        chroma_scaling_from_luma(chroma_scaling_from_luma);
        overlap_flag(overlap_flag);
        clip_to_restricted_range(clip_to_restricted_range);
        update_grain(update_grain);
        return this;
    }

    public StdVideoAV1FilmGrainFlags set(StdVideoAV1FilmGrainFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1FilmGrainFlags malloc() {
        return new StdVideoAV1FilmGrainFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1FilmGrainFlags calloc() {
        return new StdVideoAV1FilmGrainFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1FilmGrainFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1FilmGrainFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1FilmGrainFlags create(long address) {
        return new StdVideoAV1FilmGrainFlags(address, null);
    }

    public static StdVideoAV1FilmGrainFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1FilmGrainFlags(address, null);
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

    public static StdVideoAV1FilmGrainFlags malloc(MemoryStack stack) {
        return new StdVideoAV1FilmGrainFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1FilmGrainFlags calloc(MemoryStack stack) {
        return new StdVideoAV1FilmGrainFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nchroma_scaling_from_luma(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int noverlap_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nclip_to_restricted_range(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int nupdate_grain(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & 268435455;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nchroma_scaling_from_luma(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void noverlap_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nclip_to_restricted_range(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void nupdate_grain(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-268435456)) | (value & 268435455));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1FilmGrainFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1FilmGrainFlags, Buffer> implements NativeResource {
        private static final StdVideoAV1FilmGrainFlags ELEMENT_FACTORY = StdVideoAV1FilmGrainFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1FilmGrainFlags.SIZEOF);
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
        public StdVideoAV1FilmGrainFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean chroma_scaling_from_luma() {
            return StdVideoAV1FilmGrainFlags.nchroma_scaling_from_luma(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean overlap_flag() {
            return StdVideoAV1FilmGrainFlags.noverlap_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean clip_to_restricted_range() {
            return StdVideoAV1FilmGrainFlags.nclip_to_restricted_range(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean update_grain() {
            return StdVideoAV1FilmGrainFlags.nupdate_grain(address()) != 0;
        }

        public Buffer chroma_scaling_from_luma(@NativeType("uint32_t") boolean value) {
            StdVideoAV1FilmGrainFlags.nchroma_scaling_from_luma(address(), value ? 1 : 0);
            return this;
        }

        public Buffer overlap_flag(@NativeType("uint32_t") boolean value) {
            StdVideoAV1FilmGrainFlags.noverlap_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer clip_to_restricted_range(@NativeType("uint32_t") boolean value) {
            StdVideoAV1FilmGrainFlags.nclip_to_restricted_range(address(), value ? 1 : 0);
            return this;
        }

        public Buffer update_grain(@NativeType("uint32_t") boolean value) {
            StdVideoAV1FilmGrainFlags.nupdate_grain(address(), value ? 1 : 0);
            return this;
        }
    }
}
