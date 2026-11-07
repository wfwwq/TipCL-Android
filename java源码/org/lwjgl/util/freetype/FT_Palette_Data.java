package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Palette_Data.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Palette_Data.class */
public class FT_Palette_Data extends Struct<FT_Palette_Data> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NUM_PALETTES;
    public static final int PALETTE_NAME_IDS;
    public static final int PALETTE_FLAGS;
    public static final int NUM_PALETTE_ENTRIES;
    public static final int PALETTE_ENTRY_NAME_IDS;

    static {
        Struct.Layout layout = __struct(__member(2), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(2), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NUM_PALETTES = layout.offsetof(0);
        PALETTE_NAME_IDS = layout.offsetof(1);
        PALETTE_FLAGS = layout.offsetof(2);
        NUM_PALETTE_ENTRIES = layout.offsetof(3);
        PALETTE_ENTRY_NAME_IDS = layout.offsetof(4);
    }

    protected FT_Palette_Data(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Palette_Data create(long address, ByteBuffer container) {
        return new FT_Palette_Data(address, container);
    }

    public FT_Palette_Data(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_UShort")
    public short num_palettes() {
        return nnum_palettes(address());
    }

    @NativeType("FT_UShort const *")
    public ShortBuffer palette_name_ids() {
        return npalette_name_ids(address());
    }

    @NativeType("FT_UShort const *")
    public ShortBuffer palette_flags() {
        return npalette_flags(address());
    }

    @NativeType("FT_UShort")
    public short num_palette_entries() {
        return nnum_palette_entries(address());
    }

    @NativeType("FT_UShort const *")
    public ShortBuffer palette_entry_name_ids() {
        return npalette_entry_name_ids(address());
    }

    public static FT_Palette_Data malloc() {
        return new FT_Palette_Data(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Palette_Data calloc() {
        return new FT_Palette_Data(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Palette_Data create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Palette_Data(MemoryUtil.memAddress(container), container);
    }

    public static FT_Palette_Data create(long address) {
        return new FT_Palette_Data(address, null);
    }

    public static FT_Palette_Data createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Palette_Data(address, null);
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

    public static FT_Palette_Data malloc(MemoryStack stack) {
        return new FT_Palette_Data(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Palette_Data calloc(MemoryStack stack) {
        return new FT_Palette_Data(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nnum_palettes(long struct) {
        return MemoryUtil.memGetShort(struct + NUM_PALETTES);
    }

    public static ShortBuffer npalette_name_ids(long struct) {
        return MemoryUtil.memShortBufferSafe(MemoryUtil.memGetAddress(struct + PALETTE_NAME_IDS), Short.toUnsignedInt(nnum_palettes(struct)));
    }

    public static ShortBuffer npalette_flags(long struct) {
        return MemoryUtil.memShortBufferSafe(MemoryUtil.memGetAddress(struct + PALETTE_FLAGS), Short.toUnsignedInt(nnum_palettes(struct)));
    }

    public static short nnum_palette_entries(long struct) {
        return MemoryUtil.memGetShort(struct + NUM_PALETTE_ENTRIES);
    }

    public static ShortBuffer npalette_entry_name_ids(long struct) {
        return MemoryUtil.memShortBufferSafe(MemoryUtil.memGetAddress(struct + PALETTE_ENTRY_NAME_IDS), Short.toUnsignedInt(nnum_palette_entries(struct)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Palette_Data$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Palette_Data$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Palette_Data, Buffer> implements NativeResource {
        private static final FT_Palette_Data ELEMENT_FACTORY = FT_Palette_Data.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Palette_Data.SIZEOF);
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
        public FT_Palette_Data getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_UShort")
        public short num_palettes() {
            return FT_Palette_Data.nnum_palettes(address());
        }

        @NativeType("FT_UShort const *")
        public ShortBuffer palette_name_ids() {
            return FT_Palette_Data.npalette_name_ids(address());
        }

        @NativeType("FT_UShort const *")
        public ShortBuffer palette_flags() {
            return FT_Palette_Data.npalette_flags(address());
        }

        @NativeType("FT_UShort")
        public short num_palette_entries() {
            return FT_Palette_Data.nnum_palette_entries(address());
        }

        @NativeType("FT_UShort const *")
        public ShortBuffer palette_entry_name_ids() {
            return FT_Palette_Data.npalette_entry_name_ids(address());
        }
    }
}
