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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1TileInfo.class */
public class StdVideoAV1TileInfo extends Struct<StdVideoAV1TileInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int TILECOLS;
    public static final int TILEROWS;
    public static final int CONTEXT_UPDATE_TILE_ID;
    public static final int TILE_SIZE_BYTES_MINUS_1;
    public static final int RESERVED1;
    public static final int PMICOLSTARTS;
    public static final int PMIROWSTARTS;
    public static final int PWIDTHINSBSMINUS1;
    public static final int PHEIGHTINSBSMINUS1;

    static {
        Struct.Layout layout = __struct(__member(StdVideoAV1TileInfoFlag.SIZEOF, StdVideoAV1TileInfoFlag.ALIGNOF), __member(1), __member(1), __member(2), __member(1), __array(1, 7), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        TILECOLS = layout.offsetof(1);
        TILEROWS = layout.offsetof(2);
        CONTEXT_UPDATE_TILE_ID = layout.offsetof(3);
        TILE_SIZE_BYTES_MINUS_1 = layout.offsetof(4);
        RESERVED1 = layout.offsetof(5);
        PMICOLSTARTS = layout.offsetof(6);
        PMIROWSTARTS = layout.offsetof(7);
        PWIDTHINSBSMINUS1 = layout.offsetof(8);
        PHEIGHTINSBSMINUS1 = layout.offsetof(9);
    }

    protected StdVideoAV1TileInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1TileInfo create(long address, ByteBuffer container) {
        return new StdVideoAV1TileInfo(address, container);
    }

    public StdVideoAV1TileInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoAV1TileInfoFlag flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte TileCols() {
        return nTileCols(address());
    }

    @NativeType("uint8_t")
    public byte TileRows() {
        return nTileRows(address());
    }

    @NativeType("uint16_t")
    public short context_update_tile_id() {
        return ncontext_update_tile_id(address());
    }

    @NativeType("uint8_t")
    public byte tile_size_bytes_minus_1() {
        return ntile_size_bytes_minus_1(address());
    }

    @NativeType("uint16_t const *")
    public ShortBuffer pMiColStarts() {
        return npMiColStarts(address());
    }

    @NativeType("uint16_t const *")
    public ShortBuffer pMiRowStarts() {
        return npMiRowStarts(address());
    }

    @NativeType("uint16_t const *")
    public ShortBuffer pWidthInSbsMinus1() {
        return npWidthInSbsMinus1(address());
    }

    @NativeType("uint16_t const *")
    public ShortBuffer pHeightInSbsMinus1() {
        return npHeightInSbsMinus1(address());
    }

    public StdVideoAV1TileInfo flags(StdVideoAV1TileInfoFlag value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoAV1TileInfo flags(Consumer<StdVideoAV1TileInfoFlag> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoAV1TileInfo TileCols(@NativeType("uint8_t") byte value) {
        nTileCols(address(), value);
        return this;
    }

    public StdVideoAV1TileInfo TileRows(@NativeType("uint8_t") byte value) {
        nTileRows(address(), value);
        return this;
    }

    public StdVideoAV1TileInfo context_update_tile_id(@NativeType("uint16_t") short value) {
        ncontext_update_tile_id(address(), value);
        return this;
    }

    public StdVideoAV1TileInfo tile_size_bytes_minus_1(@NativeType("uint8_t") byte value) {
        ntile_size_bytes_minus_1(address(), value);
        return this;
    }

    public StdVideoAV1TileInfo pMiColStarts(@NativeType("uint16_t const *") ShortBuffer value) {
        npMiColStarts(address(), value);
        return this;
    }

    public StdVideoAV1TileInfo pMiRowStarts(@NativeType("uint16_t const *") ShortBuffer value) {
        npMiRowStarts(address(), value);
        return this;
    }

    public StdVideoAV1TileInfo pWidthInSbsMinus1(@NativeType("uint16_t const *") ShortBuffer value) {
        npWidthInSbsMinus1(address(), value);
        return this;
    }

    public StdVideoAV1TileInfo pHeightInSbsMinus1(@NativeType("uint16_t const *") ShortBuffer value) {
        npHeightInSbsMinus1(address(), value);
        return this;
    }

    public StdVideoAV1TileInfo set(StdVideoAV1TileInfoFlag flags, byte TileCols, byte TileRows, short context_update_tile_id, byte tile_size_bytes_minus_1, ShortBuffer pMiColStarts, ShortBuffer pMiRowStarts, ShortBuffer pWidthInSbsMinus1, ShortBuffer pHeightInSbsMinus1) {
        flags(flags);
        TileCols(TileCols);
        TileRows(TileRows);
        context_update_tile_id(context_update_tile_id);
        tile_size_bytes_minus_1(tile_size_bytes_minus_1);
        pMiColStarts(pMiColStarts);
        pMiRowStarts(pMiRowStarts);
        pWidthInSbsMinus1(pWidthInSbsMinus1);
        pHeightInSbsMinus1(pHeightInSbsMinus1);
        return this;
    }

    public StdVideoAV1TileInfo set(StdVideoAV1TileInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1TileInfo malloc() {
        return new StdVideoAV1TileInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1TileInfo calloc() {
        return new StdVideoAV1TileInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1TileInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1TileInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1TileInfo create(long address) {
        return new StdVideoAV1TileInfo(address, null);
    }

    public static StdVideoAV1TileInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1TileInfo(address, null);
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

    public static StdVideoAV1TileInfo malloc(MemoryStack stack) {
        return new StdVideoAV1TileInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1TileInfo calloc(MemoryStack stack) {
        return new StdVideoAV1TileInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoAV1TileInfoFlag nflags(long struct) {
        return StdVideoAV1TileInfoFlag.create(struct + FLAGS);
    }

    public static byte nTileCols(long struct) {
        return MemoryUtil.memGetByte(struct + TILECOLS);
    }

    public static byte nTileRows(long struct) {
        return MemoryUtil.memGetByte(struct + TILEROWS);
    }

    public static short ncontext_update_tile_id(long struct) {
        return MemoryUtil.memGetShort(struct + CONTEXT_UPDATE_TILE_ID);
    }

    public static byte ntile_size_bytes_minus_1(long struct) {
        return MemoryUtil.memGetByte(struct + TILE_SIZE_BYTES_MINUS_1);
    }

    public static ByteBuffer nreserved1(long struct) {
        return MemoryUtil.memByteBuffer(struct + RESERVED1, 7);
    }

    public static byte nreserved1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + RESERVED1 + (Checks.check(index, 7) * 1));
    }

    public static ShortBuffer npMiColStarts(long struct) {
        return MemoryUtil.memShortBuffer(MemoryUtil.memGetAddress(struct + PMICOLSTARTS), Byte.toUnsignedInt(nTileCols(struct)));
    }

    public static ShortBuffer npMiRowStarts(long struct) {
        return MemoryUtil.memShortBuffer(MemoryUtil.memGetAddress(struct + PMIROWSTARTS), Byte.toUnsignedInt(nTileRows(struct)));
    }

    public static ShortBuffer npWidthInSbsMinus1(long struct) {
        return MemoryUtil.memShortBuffer(MemoryUtil.memGetAddress(struct + PWIDTHINSBSMINUS1), Byte.toUnsignedInt(nTileCols(struct)));
    }

    public static ShortBuffer npHeightInSbsMinus1(long struct) {
        return MemoryUtil.memShortBuffer(MemoryUtil.memGetAddress(struct + PHEIGHTINSBSMINUS1), Byte.toUnsignedInt(nTileRows(struct)));
    }

    public static void nflags(long struct, StdVideoAV1TileInfoFlag value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoAV1TileInfoFlag.SIZEOF);
    }

    public static void nTileCols(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TILECOLS, value);
    }

    public static void nTileRows(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TILEROWS, value);
    }

    public static void ncontext_update_tile_id(long struct, short value) {
        MemoryUtil.memPutShort(struct + CONTEXT_UPDATE_TILE_ID, value);
    }

    public static void ntile_size_bytes_minus_1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TILE_SIZE_BYTES_MINUS_1, value);
    }

    public static void nreserved1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESERVED1, value.remaining() * 1);
    }

    public static void nreserved1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1 + (Checks.check(index, 7) * 1), value);
    }

    public static void npMiColStarts(long struct, ShortBuffer value) {
        MemoryUtil.memPutAddress(struct + PMICOLSTARTS, MemoryUtil.memAddress(value));
    }

    public static void npMiRowStarts(long struct, ShortBuffer value) {
        MemoryUtil.memPutAddress(struct + PMIROWSTARTS, MemoryUtil.memAddress(value));
    }

    public static void npWidthInSbsMinus1(long struct, ShortBuffer value) {
        MemoryUtil.memPutAddress(struct + PWIDTHINSBSMINUS1, MemoryUtil.memAddress(value));
    }

    public static void npHeightInSbsMinus1(long struct, ShortBuffer value) {
        MemoryUtil.memPutAddress(struct + PHEIGHTINSBSMINUS1, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PMICOLSTARTS));
        Checks.check(MemoryUtil.memGetAddress(struct + PMIROWSTARTS));
        Checks.check(MemoryUtil.memGetAddress(struct + PWIDTHINSBSMINUS1));
        Checks.check(MemoryUtil.memGetAddress(struct + PHEIGHTINSBSMINUS1));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1TileInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1TileInfo, Buffer> implements NativeResource {
        private static final StdVideoAV1TileInfo ELEMENT_FACTORY = StdVideoAV1TileInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1TileInfo.SIZEOF);
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
        public StdVideoAV1TileInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoAV1TileInfoFlag flags() {
            return StdVideoAV1TileInfo.nflags(address());
        }

        @NativeType("uint8_t")
        public byte TileCols() {
            return StdVideoAV1TileInfo.nTileCols(address());
        }

        @NativeType("uint8_t")
        public byte TileRows() {
            return StdVideoAV1TileInfo.nTileRows(address());
        }

        @NativeType("uint16_t")
        public short context_update_tile_id() {
            return StdVideoAV1TileInfo.ncontext_update_tile_id(address());
        }

        @NativeType("uint8_t")
        public byte tile_size_bytes_minus_1() {
            return StdVideoAV1TileInfo.ntile_size_bytes_minus_1(address());
        }

        @NativeType("uint16_t const *")
        public ShortBuffer pMiColStarts() {
            return StdVideoAV1TileInfo.npMiColStarts(address());
        }

        @NativeType("uint16_t const *")
        public ShortBuffer pMiRowStarts() {
            return StdVideoAV1TileInfo.npMiRowStarts(address());
        }

        @NativeType("uint16_t const *")
        public ShortBuffer pWidthInSbsMinus1() {
            return StdVideoAV1TileInfo.npWidthInSbsMinus1(address());
        }

        @NativeType("uint16_t const *")
        public ShortBuffer pHeightInSbsMinus1() {
            return StdVideoAV1TileInfo.npHeightInSbsMinus1(address());
        }

        public Buffer flags(StdVideoAV1TileInfoFlag value) {
            StdVideoAV1TileInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoAV1TileInfoFlag> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer TileCols(@NativeType("uint8_t") byte value) {
            StdVideoAV1TileInfo.nTileCols(address(), value);
            return this;
        }

        public Buffer TileRows(@NativeType("uint8_t") byte value) {
            StdVideoAV1TileInfo.nTileRows(address(), value);
            return this;
        }

        public Buffer context_update_tile_id(@NativeType("uint16_t") short value) {
            StdVideoAV1TileInfo.ncontext_update_tile_id(address(), value);
            return this;
        }

        public Buffer tile_size_bytes_minus_1(@NativeType("uint8_t") byte value) {
            StdVideoAV1TileInfo.ntile_size_bytes_minus_1(address(), value);
            return this;
        }

        public Buffer pMiColStarts(@NativeType("uint16_t const *") ShortBuffer value) {
            StdVideoAV1TileInfo.npMiColStarts(address(), value);
            return this;
        }

        public Buffer pMiRowStarts(@NativeType("uint16_t const *") ShortBuffer value) {
            StdVideoAV1TileInfo.npMiRowStarts(address(), value);
            return this;
        }

        public Buffer pWidthInSbsMinus1(@NativeType("uint16_t const *") ShortBuffer value) {
            StdVideoAV1TileInfo.npWidthInSbsMinus1(address(), value);
            return this;
        }

        public Buffer pHeightInSbsMinus1(@NativeType("uint16_t const *") ShortBuffer value) {
            StdVideoAV1TileInfo.npHeightInSbsMinus1(address(), value);
            return this;
        }
    }
}
