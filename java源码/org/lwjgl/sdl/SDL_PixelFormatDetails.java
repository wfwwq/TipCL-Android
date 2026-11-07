package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_PixelFormatDetails.class */
public class SDL_PixelFormatDetails extends Struct<SDL_PixelFormatDetails> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FORMAT;
    public static final int BITS_PER_PIXEL;
    public static final int BYTES_PER_PIXEL;
    public static final int PADDING;
    public static final int RMASK;
    public static final int GMASK;
    public static final int BMASK;
    public static final int AMASK;
    public static final int RBITS;
    public static final int GBITS;
    public static final int BBITS;
    public static final int ABITS;
    public static final int RSHIFT;
    public static final int GSHIFT;
    public static final int BSHIFT;
    public static final int ASHIFT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(1), __member(1), __array(1, 2), __member(4), __member(4), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FORMAT = layout.offsetof(0);
        BITS_PER_PIXEL = layout.offsetof(1);
        BYTES_PER_PIXEL = layout.offsetof(2);
        PADDING = layout.offsetof(3);
        RMASK = layout.offsetof(4);
        GMASK = layout.offsetof(5);
        BMASK = layout.offsetof(6);
        AMASK = layout.offsetof(7);
        RBITS = layout.offsetof(8);
        GBITS = layout.offsetof(9);
        BBITS = layout.offsetof(10);
        ABITS = layout.offsetof(11);
        RSHIFT = layout.offsetof(12);
        GSHIFT = layout.offsetof(13);
        BSHIFT = layout.offsetof(14);
        ASHIFT = layout.offsetof(15);
    }

    protected SDL_PixelFormatDetails(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_PixelFormatDetails create(long address, ByteBuffer container) {
        return new SDL_PixelFormatDetails(address, container);
    }

    public SDL_PixelFormatDetails(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_PixelFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("Uint8")
    public byte bits_per_pixel() {
        return nbits_per_pixel(address());
    }

    @NativeType("Uint8")
    public byte bytes_per_pixel() {
        return nbytes_per_pixel(address());
    }

    @NativeType("Uint32")
    public int Rmask() {
        return nRmask(address());
    }

    @NativeType("Uint32")
    public int Gmask() {
        return nGmask(address());
    }

    @NativeType("Uint32")
    public int Bmask() {
        return nBmask(address());
    }

    @NativeType("Uint32")
    public int Amask() {
        return nAmask(address());
    }

    @NativeType("Uint8")
    public byte Rbits() {
        return nRbits(address());
    }

    @NativeType("Uint8")
    public byte Gbits() {
        return nGbits(address());
    }

    @NativeType("Uint8")
    public byte Bbits() {
        return nBbits(address());
    }

    @NativeType("Uint8")
    public byte Abits() {
        return nAbits(address());
    }

    @NativeType("Uint8")
    public byte Rshift() {
        return nRshift(address());
    }

    @NativeType("Uint8")
    public byte Gshift() {
        return nGshift(address());
    }

    @NativeType("Uint8")
    public byte Bshift() {
        return nBshift(address());
    }

    @NativeType("Uint8")
    public byte Ashift() {
        return nAshift(address());
    }

    public static SDL_PixelFormatDetails create(long address) {
        return new SDL_PixelFormatDetails(address, null);
    }

    public static SDL_PixelFormatDetails createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_PixelFormatDetails(address, null);
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

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static byte nbits_per_pixel(long struct) {
        return MemoryUtil.memGetByte(struct + BITS_PER_PIXEL);
    }

    public static byte nbytes_per_pixel(long struct) {
        return MemoryUtil.memGetByte(struct + BYTES_PER_PIXEL);
    }

    public static ByteBuffer npadding(long struct) {
        return MemoryUtil.memByteBuffer(struct + PADDING, 2);
    }

    public static byte npadding(long struct, int index) {
        return MemoryUtil.memGetByte(struct + PADDING + (Checks.check(index, 2) * 1));
    }

    public static int nRmask(long struct) {
        return MemoryUtil.memGetInt(struct + RMASK);
    }

    public static int nGmask(long struct) {
        return MemoryUtil.memGetInt(struct + GMASK);
    }

    public static int nBmask(long struct) {
        return MemoryUtil.memGetInt(struct + BMASK);
    }

    public static int nAmask(long struct) {
        return MemoryUtil.memGetInt(struct + AMASK);
    }

    public static byte nRbits(long struct) {
        return MemoryUtil.memGetByte(struct + RBITS);
    }

    public static byte nGbits(long struct) {
        return MemoryUtil.memGetByte(struct + GBITS);
    }

    public static byte nBbits(long struct) {
        return MemoryUtil.memGetByte(struct + BBITS);
    }

    public static byte nAbits(long struct) {
        return MemoryUtil.memGetByte(struct + ABITS);
    }

    public static byte nRshift(long struct) {
        return MemoryUtil.memGetByte(struct + RSHIFT);
    }

    public static byte nGshift(long struct) {
        return MemoryUtil.memGetByte(struct + GSHIFT);
    }

    public static byte nBshift(long struct) {
        return MemoryUtil.memGetByte(struct + BSHIFT);
    }

    public static byte nAshift(long struct) {
        return MemoryUtil.memGetByte(struct + ASHIFT);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_PixelFormatDetails$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_PixelFormatDetails, Buffer> {
        private static final SDL_PixelFormatDetails ELEMENT_FACTORY = SDL_PixelFormatDetails.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_PixelFormatDetails.SIZEOF);
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
        public SDL_PixelFormatDetails getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_PixelFormat")
        public int format() {
            return SDL_PixelFormatDetails.nformat(address());
        }

        @NativeType("Uint8")
        public byte bits_per_pixel() {
            return SDL_PixelFormatDetails.nbits_per_pixel(address());
        }

        @NativeType("Uint8")
        public byte bytes_per_pixel() {
            return SDL_PixelFormatDetails.nbytes_per_pixel(address());
        }

        @NativeType("Uint32")
        public int Rmask() {
            return SDL_PixelFormatDetails.nRmask(address());
        }

        @NativeType("Uint32")
        public int Gmask() {
            return SDL_PixelFormatDetails.nGmask(address());
        }

        @NativeType("Uint32")
        public int Bmask() {
            return SDL_PixelFormatDetails.nBmask(address());
        }

        @NativeType("Uint32")
        public int Amask() {
            return SDL_PixelFormatDetails.nAmask(address());
        }

        @NativeType("Uint8")
        public byte Rbits() {
            return SDL_PixelFormatDetails.nRbits(address());
        }

        @NativeType("Uint8")
        public byte Gbits() {
            return SDL_PixelFormatDetails.nGbits(address());
        }

        @NativeType("Uint8")
        public byte Bbits() {
            return SDL_PixelFormatDetails.nBbits(address());
        }

        @NativeType("Uint8")
        public byte Abits() {
            return SDL_PixelFormatDetails.nAbits(address());
        }

        @NativeType("Uint8")
        public byte Rshift() {
            return SDL_PixelFormatDetails.nRshift(address());
        }

        @NativeType("Uint8")
        public byte Gshift() {
            return SDL_PixelFormatDetails.nGshift(address());
        }

        @NativeType("Uint8")
        public byte Bshift() {
            return SDL_PixelFormatDetails.nBshift(address());
        }

        @NativeType("Uint8")
        public byte Ashift() {
            return SDL_PixelFormatDetails.nAshift(address());
        }
    }
}
