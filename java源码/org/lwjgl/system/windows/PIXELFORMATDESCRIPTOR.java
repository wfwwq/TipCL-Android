package org.lwjgl.system.windows;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/PIXELFORMATDESCRIPTOR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/PIXELFORMATDESCRIPTOR.class */
public class PIXELFORMATDESCRIPTOR extends Struct<PIXELFORMATDESCRIPTOR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NSIZE;
    public static final int NVERSION;
    public static final int DWFLAGS;
    public static final int IPIXELTYPE;
    public static final int CCOLORBITS;
    public static final int CREDBITS;
    public static final int CREDSHIFT;
    public static final int CGREENBITS;
    public static final int CGREENSHIFT;
    public static final int CBLUEBITS;
    public static final int CBLUESHIFT;
    public static final int CALPHABITS;
    public static final int CALPHASHIFT;
    public static final int CACCUMBITS;
    public static final int CACCUMREDBITS;
    public static final int CACCUMGREENBITS;
    public static final int CACCUMBLUEBITS;
    public static final int CACCUMALPHABITS;
    public static final int CDEPTHBITS;
    public static final int CSTENCILBITS;
    public static final int CAUXBUFFERS;
    public static final int ILAYERTYPE;
    public static final int BRESERVED;
    public static final int DWLAYERMASK;
    public static final int DWVISIBLEMASK;
    public static final int DWDAMAGEMASK;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(4), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NSIZE = layout.offsetof(0);
        NVERSION = layout.offsetof(1);
        DWFLAGS = layout.offsetof(2);
        IPIXELTYPE = layout.offsetof(3);
        CCOLORBITS = layout.offsetof(4);
        CREDBITS = layout.offsetof(5);
        CREDSHIFT = layout.offsetof(6);
        CGREENBITS = layout.offsetof(7);
        CGREENSHIFT = layout.offsetof(8);
        CBLUEBITS = layout.offsetof(9);
        CBLUESHIFT = layout.offsetof(10);
        CALPHABITS = layout.offsetof(11);
        CALPHASHIFT = layout.offsetof(12);
        CACCUMBITS = layout.offsetof(13);
        CACCUMREDBITS = layout.offsetof(14);
        CACCUMGREENBITS = layout.offsetof(15);
        CACCUMBLUEBITS = layout.offsetof(16);
        CACCUMALPHABITS = layout.offsetof(17);
        CDEPTHBITS = layout.offsetof(18);
        CSTENCILBITS = layout.offsetof(19);
        CAUXBUFFERS = layout.offsetof(20);
        ILAYERTYPE = layout.offsetof(21);
        BRESERVED = layout.offsetof(22);
        DWLAYERMASK = layout.offsetof(23);
        DWVISIBLEMASK = layout.offsetof(24);
        DWDAMAGEMASK = layout.offsetof(25);
    }

    protected PIXELFORMATDESCRIPTOR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public PIXELFORMATDESCRIPTOR create(long address, ByteBuffer container) {
        return new PIXELFORMATDESCRIPTOR(address, container);
    }

    public PIXELFORMATDESCRIPTOR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("WORD")
    public short nSize() {
        return nnSize(address());
    }

    @NativeType("WORD")
    public short nVersion() {
        return nnVersion(address());
    }

    @NativeType("DWORD")
    public int dwFlags() {
        return ndwFlags(address());
    }

    @NativeType("BYTE")
    public byte iPixelType() {
        return niPixelType(address());
    }

    @NativeType("BYTE")
    public byte cColorBits() {
        return ncColorBits(address());
    }

    @NativeType("BYTE")
    public byte cRedBits() {
        return ncRedBits(address());
    }

    @NativeType("BYTE")
    public byte cRedShift() {
        return ncRedShift(address());
    }

    @NativeType("BYTE")
    public byte cGreenBits() {
        return ncGreenBits(address());
    }

    @NativeType("BYTE")
    public byte cGreenShift() {
        return ncGreenShift(address());
    }

    @NativeType("BYTE")
    public byte cBlueBits() {
        return ncBlueBits(address());
    }

    @NativeType("BYTE")
    public byte cBlueShift() {
        return ncBlueShift(address());
    }

    @NativeType("BYTE")
    public byte cAlphaBits() {
        return ncAlphaBits(address());
    }

    @NativeType("BYTE")
    public byte cAlphaShift() {
        return ncAlphaShift(address());
    }

    @NativeType("BYTE")
    public byte cAccumBits() {
        return ncAccumBits(address());
    }

    @NativeType("BYTE")
    public byte cAccumRedBits() {
        return ncAccumRedBits(address());
    }

    @NativeType("BYTE")
    public byte cAccumGreenBits() {
        return ncAccumGreenBits(address());
    }

    @NativeType("BYTE")
    public byte cAccumBlueBits() {
        return ncAccumBlueBits(address());
    }

    @NativeType("BYTE")
    public byte cAccumAlphaBits() {
        return ncAccumAlphaBits(address());
    }

    @NativeType("BYTE")
    public byte cDepthBits() {
        return ncDepthBits(address());
    }

    @NativeType("BYTE")
    public byte cStencilBits() {
        return ncStencilBits(address());
    }

    @NativeType("BYTE")
    public byte cAuxBuffers() {
        return ncAuxBuffers(address());
    }

    @NativeType("BYTE")
    public byte iLayerType() {
        return niLayerType(address());
    }

    @NativeType("BYTE")
    public byte bReserved() {
        return nbReserved(address());
    }

    @NativeType("DWORD")
    public int dwLayerMask() {
        return ndwLayerMask(address());
    }

    @NativeType("DWORD")
    public int dwVisibleMask() {
        return ndwVisibleMask(address());
    }

    @NativeType("DWORD")
    public int dwDamageMask() {
        return ndwDamageMask(address());
    }

    public PIXELFORMATDESCRIPTOR nSize(@NativeType("WORD") short value) {
        nnSize(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR nVersion(@NativeType("WORD") short value) {
        nnVersion(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR dwFlags(@NativeType("DWORD") int value) {
        ndwFlags(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR iPixelType(@NativeType("BYTE") byte value) {
        niPixelType(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cColorBits(@NativeType("BYTE") byte value) {
        ncColorBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cRedBits(@NativeType("BYTE") byte value) {
        ncRedBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cRedShift(@NativeType("BYTE") byte value) {
        ncRedShift(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cGreenBits(@NativeType("BYTE") byte value) {
        ncGreenBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cGreenShift(@NativeType("BYTE") byte value) {
        ncGreenShift(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cBlueBits(@NativeType("BYTE") byte value) {
        ncBlueBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cBlueShift(@NativeType("BYTE") byte value) {
        ncBlueShift(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cAlphaBits(@NativeType("BYTE") byte value) {
        ncAlphaBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cAlphaShift(@NativeType("BYTE") byte value) {
        ncAlphaShift(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cAccumBits(@NativeType("BYTE") byte value) {
        ncAccumBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cAccumRedBits(@NativeType("BYTE") byte value) {
        ncAccumRedBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cAccumGreenBits(@NativeType("BYTE") byte value) {
        ncAccumGreenBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cAccumBlueBits(@NativeType("BYTE") byte value) {
        ncAccumBlueBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cAccumAlphaBits(@NativeType("BYTE") byte value) {
        ncAccumAlphaBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cDepthBits(@NativeType("BYTE") byte value) {
        ncDepthBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cStencilBits(@NativeType("BYTE") byte value) {
        ncStencilBits(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR cAuxBuffers(@NativeType("BYTE") byte value) {
        ncAuxBuffers(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR iLayerType(@NativeType("BYTE") byte value) {
        niLayerType(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR bReserved(@NativeType("BYTE") byte value) {
        nbReserved(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR dwLayerMask(@NativeType("DWORD") int value) {
        ndwLayerMask(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR dwVisibleMask(@NativeType("DWORD") int value) {
        ndwVisibleMask(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR dwDamageMask(@NativeType("DWORD") int value) {
        ndwDamageMask(address(), value);
        return this;
    }

    public PIXELFORMATDESCRIPTOR set(short nSize, short nVersion, int dwFlags, byte iPixelType, byte cColorBits, byte cRedBits, byte cRedShift, byte cGreenBits, byte cGreenShift, byte cBlueBits, byte cBlueShift, byte cAlphaBits, byte cAlphaShift, byte cAccumBits, byte cAccumRedBits, byte cAccumGreenBits, byte cAccumBlueBits, byte cAccumAlphaBits, byte cDepthBits, byte cStencilBits, byte cAuxBuffers, byte iLayerType, byte bReserved, int dwLayerMask, int dwVisibleMask, int dwDamageMask) {
        nSize(nSize);
        nVersion(nVersion);
        dwFlags(dwFlags);
        iPixelType(iPixelType);
        cColorBits(cColorBits);
        cRedBits(cRedBits);
        cRedShift(cRedShift);
        cGreenBits(cGreenBits);
        cGreenShift(cGreenShift);
        cBlueBits(cBlueBits);
        cBlueShift(cBlueShift);
        cAlphaBits(cAlphaBits);
        cAlphaShift(cAlphaShift);
        cAccumBits(cAccumBits);
        cAccumRedBits(cAccumRedBits);
        cAccumGreenBits(cAccumGreenBits);
        cAccumBlueBits(cAccumBlueBits);
        cAccumAlphaBits(cAccumAlphaBits);
        cDepthBits(cDepthBits);
        cStencilBits(cStencilBits);
        cAuxBuffers(cAuxBuffers);
        iLayerType(iLayerType);
        bReserved(bReserved);
        dwLayerMask(dwLayerMask);
        dwVisibleMask(dwVisibleMask);
        dwDamageMask(dwDamageMask);
        return this;
    }

    public PIXELFORMATDESCRIPTOR set(PIXELFORMATDESCRIPTOR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static PIXELFORMATDESCRIPTOR malloc() {
        return new PIXELFORMATDESCRIPTOR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static PIXELFORMATDESCRIPTOR calloc() {
        return new PIXELFORMATDESCRIPTOR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static PIXELFORMATDESCRIPTOR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new PIXELFORMATDESCRIPTOR(MemoryUtil.memAddress(container), container);
    }

    public static PIXELFORMATDESCRIPTOR create(long address) {
        return new PIXELFORMATDESCRIPTOR(address, null);
    }

    public static PIXELFORMATDESCRIPTOR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new PIXELFORMATDESCRIPTOR(address, null);
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

    public static PIXELFORMATDESCRIPTOR malloc(MemoryStack stack) {
        return new PIXELFORMATDESCRIPTOR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static PIXELFORMATDESCRIPTOR calloc(MemoryStack stack) {
        return new PIXELFORMATDESCRIPTOR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nnSize(long struct) {
        return MemoryUtil.memGetShort(struct + NSIZE);
    }

    public static short nnVersion(long struct) {
        return MemoryUtil.memGetShort(struct + NVERSION);
    }

    public static int ndwFlags(long struct) {
        return MemoryUtil.memGetInt(struct + DWFLAGS);
    }

    public static byte niPixelType(long struct) {
        return MemoryUtil.memGetByte(struct + IPIXELTYPE);
    }

    public static byte ncColorBits(long struct) {
        return MemoryUtil.memGetByte(struct + CCOLORBITS);
    }

    public static byte ncRedBits(long struct) {
        return MemoryUtil.memGetByte(struct + CREDBITS);
    }

    public static byte ncRedShift(long struct) {
        return MemoryUtil.memGetByte(struct + CREDSHIFT);
    }

    public static byte ncGreenBits(long struct) {
        return MemoryUtil.memGetByte(struct + CGREENBITS);
    }

    public static byte ncGreenShift(long struct) {
        return MemoryUtil.memGetByte(struct + CGREENSHIFT);
    }

    public static byte ncBlueBits(long struct) {
        return MemoryUtil.memGetByte(struct + CBLUEBITS);
    }

    public static byte ncBlueShift(long struct) {
        return MemoryUtil.memGetByte(struct + CBLUESHIFT);
    }

    public static byte ncAlphaBits(long struct) {
        return MemoryUtil.memGetByte(struct + CALPHABITS);
    }

    public static byte ncAlphaShift(long struct) {
        return MemoryUtil.memGetByte(struct + CALPHASHIFT);
    }

    public static byte ncAccumBits(long struct) {
        return MemoryUtil.memGetByte(struct + CACCUMBITS);
    }

    public static byte ncAccumRedBits(long struct) {
        return MemoryUtil.memGetByte(struct + CACCUMREDBITS);
    }

    public static byte ncAccumGreenBits(long struct) {
        return MemoryUtil.memGetByte(struct + CACCUMGREENBITS);
    }

    public static byte ncAccumBlueBits(long struct) {
        return MemoryUtil.memGetByte(struct + CACCUMBLUEBITS);
    }

    public static byte ncAccumAlphaBits(long struct) {
        return MemoryUtil.memGetByte(struct + CACCUMALPHABITS);
    }

    public static byte ncDepthBits(long struct) {
        return MemoryUtil.memGetByte(struct + CDEPTHBITS);
    }

    public static byte ncStencilBits(long struct) {
        return MemoryUtil.memGetByte(struct + CSTENCILBITS);
    }

    public static byte ncAuxBuffers(long struct) {
        return MemoryUtil.memGetByte(struct + CAUXBUFFERS);
    }

    public static byte niLayerType(long struct) {
        return MemoryUtil.memGetByte(struct + ILAYERTYPE);
    }

    public static byte nbReserved(long struct) {
        return MemoryUtil.memGetByte(struct + BRESERVED);
    }

    public static int ndwLayerMask(long struct) {
        return MemoryUtil.memGetInt(struct + DWLAYERMASK);
    }

    public static int ndwVisibleMask(long struct) {
        return MemoryUtil.memGetInt(struct + DWVISIBLEMASK);
    }

    public static int ndwDamageMask(long struct) {
        return MemoryUtil.memGetInt(struct + DWDAMAGEMASK);
    }

    public static void nnSize(long struct, short value) {
        MemoryUtil.memPutShort(struct + NSIZE, value);
    }

    public static void nnVersion(long struct, short value) {
        MemoryUtil.memPutShort(struct + NVERSION, value);
    }

    public static void ndwFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + DWFLAGS, value);
    }

    public static void niPixelType(long struct, byte value) {
        MemoryUtil.memPutByte(struct + IPIXELTYPE, value);
    }

    public static void ncColorBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CCOLORBITS, value);
    }

    public static void ncRedBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CREDBITS, value);
    }

    public static void ncRedShift(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CREDSHIFT, value);
    }

    public static void ncGreenBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CGREENBITS, value);
    }

    public static void ncGreenShift(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CGREENSHIFT, value);
    }

    public static void ncBlueBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CBLUEBITS, value);
    }

    public static void ncBlueShift(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CBLUESHIFT, value);
    }

    public static void ncAlphaBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CALPHABITS, value);
    }

    public static void ncAlphaShift(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CALPHASHIFT, value);
    }

    public static void ncAccumBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CACCUMBITS, value);
    }

    public static void ncAccumRedBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CACCUMREDBITS, value);
    }

    public static void ncAccumGreenBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CACCUMGREENBITS, value);
    }

    public static void ncAccumBlueBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CACCUMBLUEBITS, value);
    }

    public static void ncAccumAlphaBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CACCUMALPHABITS, value);
    }

    public static void ncDepthBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CDEPTHBITS, value);
    }

    public static void ncStencilBits(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CSTENCILBITS, value);
    }

    public static void ncAuxBuffers(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CAUXBUFFERS, value);
    }

    public static void niLayerType(long struct, byte value) {
        MemoryUtil.memPutByte(struct + ILAYERTYPE, value);
    }

    public static void nbReserved(long struct, byte value) {
        MemoryUtil.memPutByte(struct + BRESERVED, value);
    }

    public static void ndwLayerMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DWLAYERMASK, value);
    }

    public static void ndwVisibleMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DWVISIBLEMASK, value);
    }

    public static void ndwDamageMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DWDAMAGEMASK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/PIXELFORMATDESCRIPTOR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/PIXELFORMATDESCRIPTOR$Buffer.class */
    public static class Buffer extends StructBuffer<PIXELFORMATDESCRIPTOR, Buffer> implements NativeResource {
        private static final PIXELFORMATDESCRIPTOR ELEMENT_FACTORY = PIXELFORMATDESCRIPTOR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / PIXELFORMATDESCRIPTOR.SIZEOF);
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
        public PIXELFORMATDESCRIPTOR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("WORD")
        public short nSize() {
            return PIXELFORMATDESCRIPTOR.nnSize(address());
        }

        @NativeType("WORD")
        public short nVersion() {
            return PIXELFORMATDESCRIPTOR.nnVersion(address());
        }

        @NativeType("DWORD")
        public int dwFlags() {
            return PIXELFORMATDESCRIPTOR.ndwFlags(address());
        }

        @NativeType("BYTE")
        public byte iPixelType() {
            return PIXELFORMATDESCRIPTOR.niPixelType(address());
        }

        @NativeType("BYTE")
        public byte cColorBits() {
            return PIXELFORMATDESCRIPTOR.ncColorBits(address());
        }

        @NativeType("BYTE")
        public byte cRedBits() {
            return PIXELFORMATDESCRIPTOR.ncRedBits(address());
        }

        @NativeType("BYTE")
        public byte cRedShift() {
            return PIXELFORMATDESCRIPTOR.ncRedShift(address());
        }

        @NativeType("BYTE")
        public byte cGreenBits() {
            return PIXELFORMATDESCRIPTOR.ncGreenBits(address());
        }

        @NativeType("BYTE")
        public byte cGreenShift() {
            return PIXELFORMATDESCRIPTOR.ncGreenShift(address());
        }

        @NativeType("BYTE")
        public byte cBlueBits() {
            return PIXELFORMATDESCRIPTOR.ncBlueBits(address());
        }

        @NativeType("BYTE")
        public byte cBlueShift() {
            return PIXELFORMATDESCRIPTOR.ncBlueShift(address());
        }

        @NativeType("BYTE")
        public byte cAlphaBits() {
            return PIXELFORMATDESCRIPTOR.ncAlphaBits(address());
        }

        @NativeType("BYTE")
        public byte cAlphaShift() {
            return PIXELFORMATDESCRIPTOR.ncAlphaShift(address());
        }

        @NativeType("BYTE")
        public byte cAccumBits() {
            return PIXELFORMATDESCRIPTOR.ncAccumBits(address());
        }

        @NativeType("BYTE")
        public byte cAccumRedBits() {
            return PIXELFORMATDESCRIPTOR.ncAccumRedBits(address());
        }

        @NativeType("BYTE")
        public byte cAccumGreenBits() {
            return PIXELFORMATDESCRIPTOR.ncAccumGreenBits(address());
        }

        @NativeType("BYTE")
        public byte cAccumBlueBits() {
            return PIXELFORMATDESCRIPTOR.ncAccumBlueBits(address());
        }

        @NativeType("BYTE")
        public byte cAccumAlphaBits() {
            return PIXELFORMATDESCRIPTOR.ncAccumAlphaBits(address());
        }

        @NativeType("BYTE")
        public byte cDepthBits() {
            return PIXELFORMATDESCRIPTOR.ncDepthBits(address());
        }

        @NativeType("BYTE")
        public byte cStencilBits() {
            return PIXELFORMATDESCRIPTOR.ncStencilBits(address());
        }

        @NativeType("BYTE")
        public byte cAuxBuffers() {
            return PIXELFORMATDESCRIPTOR.ncAuxBuffers(address());
        }

        @NativeType("BYTE")
        public byte iLayerType() {
            return PIXELFORMATDESCRIPTOR.niLayerType(address());
        }

        @NativeType("BYTE")
        public byte bReserved() {
            return PIXELFORMATDESCRIPTOR.nbReserved(address());
        }

        @NativeType("DWORD")
        public int dwLayerMask() {
            return PIXELFORMATDESCRIPTOR.ndwLayerMask(address());
        }

        @NativeType("DWORD")
        public int dwVisibleMask() {
            return PIXELFORMATDESCRIPTOR.ndwVisibleMask(address());
        }

        @NativeType("DWORD")
        public int dwDamageMask() {
            return PIXELFORMATDESCRIPTOR.ndwDamageMask(address());
        }

        public Buffer nSize(@NativeType("WORD") short value) {
            PIXELFORMATDESCRIPTOR.nnSize(address(), value);
            return this;
        }

        public Buffer nVersion(@NativeType("WORD") short value) {
            PIXELFORMATDESCRIPTOR.nnVersion(address(), value);
            return this;
        }

        public Buffer dwFlags(@NativeType("DWORD") int value) {
            PIXELFORMATDESCRIPTOR.ndwFlags(address(), value);
            return this;
        }

        public Buffer iPixelType(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.niPixelType(address(), value);
            return this;
        }

        public Buffer cColorBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncColorBits(address(), value);
            return this;
        }

        public Buffer cRedBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncRedBits(address(), value);
            return this;
        }

        public Buffer cRedShift(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncRedShift(address(), value);
            return this;
        }

        public Buffer cGreenBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncGreenBits(address(), value);
            return this;
        }

        public Buffer cGreenShift(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncGreenShift(address(), value);
            return this;
        }

        public Buffer cBlueBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncBlueBits(address(), value);
            return this;
        }

        public Buffer cBlueShift(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncBlueShift(address(), value);
            return this;
        }

        public Buffer cAlphaBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncAlphaBits(address(), value);
            return this;
        }

        public Buffer cAlphaShift(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncAlphaShift(address(), value);
            return this;
        }

        public Buffer cAccumBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncAccumBits(address(), value);
            return this;
        }

        public Buffer cAccumRedBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncAccumRedBits(address(), value);
            return this;
        }

        public Buffer cAccumGreenBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncAccumGreenBits(address(), value);
            return this;
        }

        public Buffer cAccumBlueBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncAccumBlueBits(address(), value);
            return this;
        }

        public Buffer cAccumAlphaBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncAccumAlphaBits(address(), value);
            return this;
        }

        public Buffer cDepthBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncDepthBits(address(), value);
            return this;
        }

        public Buffer cStencilBits(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncStencilBits(address(), value);
            return this;
        }

        public Buffer cAuxBuffers(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.ncAuxBuffers(address(), value);
            return this;
        }

        public Buffer iLayerType(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.niLayerType(address(), value);
            return this;
        }

        public Buffer bReserved(@NativeType("BYTE") byte value) {
            PIXELFORMATDESCRIPTOR.nbReserved(address(), value);
            return this;
        }

        public Buffer dwLayerMask(@NativeType("DWORD") int value) {
            PIXELFORMATDESCRIPTOR.ndwLayerMask(address(), value);
            return this;
        }

        public Buffer dwVisibleMask(@NativeType("DWORD") int value) {
            PIXELFORMATDESCRIPTOR.ndwVisibleMask(address(), value);
            return this;
        }

        public Buffer dwDamageMask(@NativeType("DWORD") int value) {
            PIXELFORMATDESCRIPTOR.ndwDamageMask(address(), value);
            return this;
        }
    }
}
