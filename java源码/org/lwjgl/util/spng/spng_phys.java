package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_phys")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_phys.class */
public class spng_phys extends Struct<spng_phys> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PPU_X;
    public static final int PPU_Y;
    public static final int UNIT_SPECIFIER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PPU_X = layout.offsetof(0);
        PPU_Y = layout.offsetof(1);
        UNIT_SPECIFIER = layout.offsetof(2);
    }

    protected spng_phys(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_phys create(long address, ByteBuffer container) {
        return new spng_phys(address, container);
    }

    public spng_phys(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int ppu_x() {
        return nppu_x(address());
    }

    @NativeType("uint32_t")
    public int ppu_y() {
        return nppu_y(address());
    }

    @NativeType("uint8_t")
    public byte unit_specifier() {
        return nunit_specifier(address());
    }

    public spng_phys ppu_x(@NativeType("uint32_t") int value) {
        nppu_x(address(), value);
        return this;
    }

    public spng_phys ppu_y(@NativeType("uint32_t") int value) {
        nppu_y(address(), value);
        return this;
    }

    public spng_phys unit_specifier(@NativeType("uint8_t") byte value) {
        nunit_specifier(address(), value);
        return this;
    }

    public spng_phys set(int ppu_x, int ppu_y, byte unit_specifier) {
        ppu_x(ppu_x);
        ppu_y(ppu_y);
        unit_specifier(unit_specifier);
        return this;
    }

    public spng_phys set(spng_phys src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_phys malloc() {
        return new spng_phys(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_phys calloc() {
        return new spng_phys(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_phys create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_phys(MemoryUtil.memAddress(container), container);
    }

    public static spng_phys create(long address) {
        return new spng_phys(address, null);
    }

    public static spng_phys createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_phys(address, null);
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

    public static spng_phys malloc(MemoryStack stack) {
        return new spng_phys(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_phys calloc(MemoryStack stack) {
        return new spng_phys(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nppu_x(long struct) {
        return MemoryUtil.memGetInt(struct + PPU_X);
    }

    public static int nppu_y(long struct) {
        return MemoryUtil.memGetInt(struct + PPU_Y);
    }

    public static byte nunit_specifier(long struct) {
        return MemoryUtil.memGetByte(struct + UNIT_SPECIFIER);
    }

    public static void nppu_x(long struct, int value) {
        MemoryUtil.memPutInt(struct + PPU_X, value);
    }

    public static void nppu_y(long struct, int value) {
        MemoryUtil.memPutInt(struct + PPU_Y, value);
    }

    public static void nunit_specifier(long struct, byte value) {
        MemoryUtil.memPutByte(struct + UNIT_SPECIFIER, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_phys$Buffer.class */
    public static class Buffer extends StructBuffer<spng_phys, Buffer> implements NativeResource {
        private static final spng_phys ELEMENT_FACTORY = spng_phys.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_phys.SIZEOF);
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
        public spng_phys getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int ppu_x() {
            return spng_phys.nppu_x(address());
        }

        @NativeType("uint32_t")
        public int ppu_y() {
            return spng_phys.nppu_y(address());
        }

        @NativeType("uint8_t")
        public byte unit_specifier() {
            return spng_phys.nunit_specifier(address());
        }

        public Buffer ppu_x(@NativeType("uint32_t") int value) {
            spng_phys.nppu_x(address(), value);
            return this;
        }

        public Buffer ppu_y(@NativeType("uint32_t") int value) {
            spng_phys.nppu_y(address(), value);
            return this;
        }

        public Buffer unit_specifier(@NativeType("uint8_t") byte value) {
            spng_phys.nunit_specifier(address(), value);
            return this;
        }
    }
}
