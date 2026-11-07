package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Bitmap.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Bitmap.class */
public class FT_Bitmap extends Struct<FT_Bitmap> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ROWS;
    public static final int WIDTH;
    public static final int PITCH;
    public static final int BUFFER;
    public static final int NUM_GRAYS;
    public static final int PIXEL_MODE;
    public static final int PALETTE_MODE;
    public static final int PALETTE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(2), __member(1), __member(1), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ROWS = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        PITCH = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        NUM_GRAYS = layout.offsetof(4);
        PIXEL_MODE = layout.offsetof(5);
        PALETTE_MODE = layout.offsetof(6);
        PALETTE = layout.offsetof(7);
    }

    protected FT_Bitmap(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Bitmap create(long address, ByteBuffer container) {
        return new FT_Bitmap(address, container);
    }

    public FT_Bitmap(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned int")
    public int rows() {
        return nrows(address());
    }

    @NativeType("unsigned int")
    public int width() {
        return nwidth(address());
    }

    public int pitch() {
        return npitch(address());
    }

    @NativeType("unsigned char *")
    public ByteBuffer buffer(int capacity) {
        return nbuffer(address(), capacity);
    }

    @NativeType("unsigned short")
    public short num_grays() {
        return nnum_grays(address());
    }

    @NativeType("unsigned char")
    public byte pixel_mode() {
        return npixel_mode(address());
    }

    @NativeType("unsigned char")
    public byte palette_mode() {
        return npalette_mode(address());
    }

    @NativeType("void *")
    public long palette() {
        return npalette(address());
    }

    public static FT_Bitmap malloc() {
        return new FT_Bitmap(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Bitmap calloc() {
        return new FT_Bitmap(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Bitmap create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Bitmap(MemoryUtil.memAddress(container), container);
    }

    public static FT_Bitmap create(long address) {
        return new FT_Bitmap(address, null);
    }

    public static FT_Bitmap createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Bitmap(address, null);
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

    public static FT_Bitmap malloc(MemoryStack stack) {
        return new FT_Bitmap(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Bitmap calloc(MemoryStack stack) {
        return new FT_Bitmap(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nrows(long struct) {
        return MemoryUtil.memGetInt(struct + ROWS);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int npitch(long struct) {
        return MemoryUtil.memGetInt(struct + PITCH);
    }

    public static ByteBuffer nbuffer(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + BUFFER), capacity);
    }

    public static short nnum_grays(long struct) {
        return MemoryUtil.memGetShort(struct + NUM_GRAYS);
    }

    public static byte npixel_mode(long struct) {
        return MemoryUtil.memGetByte(struct + PIXEL_MODE);
    }

    public static byte npalette_mode(long struct) {
        return MemoryUtil.memGetByte(struct + PALETTE_MODE);
    }

    public static long npalette(long struct) {
        return MemoryUtil.memGetAddress(struct + PALETTE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Bitmap$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Bitmap$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Bitmap, Buffer> implements NativeResource {
        private static final FT_Bitmap ELEMENT_FACTORY = FT_Bitmap.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Bitmap.SIZEOF);
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
        public FT_Bitmap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned int")
        public int rows() {
            return FT_Bitmap.nrows(address());
        }

        @NativeType("unsigned int")
        public int width() {
            return FT_Bitmap.nwidth(address());
        }

        public int pitch() {
            return FT_Bitmap.npitch(address());
        }

        @NativeType("unsigned char *")
        public ByteBuffer buffer(int capacity) {
            return FT_Bitmap.nbuffer(address(), capacity);
        }

        @NativeType("unsigned short")
        public short num_grays() {
            return FT_Bitmap.nnum_grays(address());
        }

        @NativeType("unsigned char")
        public byte pixel_mode() {
            return FT_Bitmap.npixel_mode(address());
        }

        @NativeType("unsigned char")
        public byte palette_mode() {
            return FT_Bitmap.npalette_mode(address());
        }

        @NativeType("void *")
        public long palette() {
            return FT_Bitmap.npalette(address());
        }
    }
}
