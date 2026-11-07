package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUSamplerCreateInfo.class */
public class SDL_GPUSamplerCreateInfo extends Struct<SDL_GPUSamplerCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MIN_FILTER;
    public static final int MAG_FILTER;
    public static final int MIPMAP_MODE;
    public static final int ADDRESS_MODE_U;
    public static final int ADDRESS_MODE_V;
    public static final int ADDRESS_MODE_W;
    public static final int MIP_LOD_BIAS;
    public static final int MAX_ANISOTROPY;
    public static final int COMPARE_OP;
    public static final int MIN_LOD;
    public static final int MAX_LOD;
    public static final int ENABLE_ANISOTROPY;
    public static final int ENABLE_COMPARE;
    public static final int PADDING1;
    public static final int PADDING2;
    public static final int PROPS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MIN_FILTER = layout.offsetof(0);
        MAG_FILTER = layout.offsetof(1);
        MIPMAP_MODE = layout.offsetof(2);
        ADDRESS_MODE_U = layout.offsetof(3);
        ADDRESS_MODE_V = layout.offsetof(4);
        ADDRESS_MODE_W = layout.offsetof(5);
        MIP_LOD_BIAS = layout.offsetof(6);
        MAX_ANISOTROPY = layout.offsetof(7);
        COMPARE_OP = layout.offsetof(8);
        MIN_LOD = layout.offsetof(9);
        MAX_LOD = layout.offsetof(10);
        ENABLE_ANISOTROPY = layout.offsetof(11);
        ENABLE_COMPARE = layout.offsetof(12);
        PADDING1 = layout.offsetof(13);
        PADDING2 = layout.offsetof(14);
        PROPS = layout.offsetof(15);
    }

    protected SDL_GPUSamplerCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUSamplerCreateInfo create(long address, ByteBuffer container) {
        return new SDL_GPUSamplerCreateInfo(address, container);
    }

    public SDL_GPUSamplerCreateInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUFilter")
    public int min_filter() {
        return nmin_filter(address());
    }

    @NativeType("SDL_GPUFilter")
    public int mag_filter() {
        return nmag_filter(address());
    }

    @NativeType("SDL_GPUSamplerMipmapMode")
    public int mipmap_mode() {
        return nmipmap_mode(address());
    }

    @NativeType("SDL_GPUSamplerAddressMode")
    public int address_mode_u() {
        return naddress_mode_u(address());
    }

    @NativeType("SDL_GPUSamplerAddressMode")
    public int address_mode_v() {
        return naddress_mode_v(address());
    }

    @NativeType("SDL_GPUSamplerAddressMode")
    public int address_mode_w() {
        return naddress_mode_w(address());
    }

    public float mip_lod_bias() {
        return nmip_lod_bias(address());
    }

    public float max_anisotropy() {
        return nmax_anisotropy(address());
    }

    @NativeType("SDL_GPUCompareOp")
    public int compare_op() {
        return ncompare_op(address());
    }

    public float min_lod() {
        return nmin_lod(address());
    }

    public float max_lod() {
        return nmax_lod(address());
    }

    @NativeType("bool")
    public boolean enable_anisotropy() {
        return nenable_anisotropy(address());
    }

    @NativeType("bool")
    public boolean enable_compare() {
        return nenable_compare(address());
    }

    @NativeType("SDL_PropertiesID")
    public int props() {
        return nprops(address());
    }

    public SDL_GPUSamplerCreateInfo min_filter(@NativeType("SDL_GPUFilter") int value) {
        nmin_filter(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo mag_filter(@NativeType("SDL_GPUFilter") int value) {
        nmag_filter(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo mipmap_mode(@NativeType("SDL_GPUSamplerMipmapMode") int value) {
        nmipmap_mode(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo address_mode_u(@NativeType("SDL_GPUSamplerAddressMode") int value) {
        naddress_mode_u(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo address_mode_v(@NativeType("SDL_GPUSamplerAddressMode") int value) {
        naddress_mode_v(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo address_mode_w(@NativeType("SDL_GPUSamplerAddressMode") int value) {
        naddress_mode_w(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo mip_lod_bias(float value) {
        nmip_lod_bias(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo max_anisotropy(float value) {
        nmax_anisotropy(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo compare_op(@NativeType("SDL_GPUCompareOp") int value) {
        ncompare_op(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo min_lod(float value) {
        nmin_lod(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo max_lod(float value) {
        nmax_lod(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo enable_anisotropy(@NativeType("bool") boolean value) {
        nenable_anisotropy(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo enable_compare(@NativeType("bool") boolean value) {
        nenable_compare(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo props(@NativeType("SDL_PropertiesID") int value) {
        nprops(address(), value);
        return this;
    }

    public SDL_GPUSamplerCreateInfo set(int min_filter, int mag_filter, int mipmap_mode, int address_mode_u, int address_mode_v, int address_mode_w, float mip_lod_bias, float max_anisotropy, int compare_op, float min_lod, float max_lod, boolean enable_anisotropy, boolean enable_compare, int props) {
        min_filter(min_filter);
        mag_filter(mag_filter);
        mipmap_mode(mipmap_mode);
        address_mode_u(address_mode_u);
        address_mode_v(address_mode_v);
        address_mode_w(address_mode_w);
        mip_lod_bias(mip_lod_bias);
        max_anisotropy(max_anisotropy);
        compare_op(compare_op);
        min_lod(min_lod);
        max_lod(max_lod);
        enable_anisotropy(enable_anisotropy);
        enable_compare(enable_compare);
        props(props);
        return this;
    }

    public SDL_GPUSamplerCreateInfo set(SDL_GPUSamplerCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUSamplerCreateInfo malloc() {
        return new SDL_GPUSamplerCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUSamplerCreateInfo calloc() {
        return new SDL_GPUSamplerCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUSamplerCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUSamplerCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUSamplerCreateInfo create(long address) {
        return new SDL_GPUSamplerCreateInfo(address, null);
    }

    public static SDL_GPUSamplerCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUSamplerCreateInfo(address, null);
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

    public static SDL_GPUSamplerCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUSamplerCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUSamplerCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUSamplerCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nmin_filter(long struct) {
        return MemoryUtil.memGetInt(struct + MIN_FILTER);
    }

    public static int nmag_filter(long struct) {
        return MemoryUtil.memGetInt(struct + MAG_FILTER);
    }

    public static int nmipmap_mode(long struct) {
        return MemoryUtil.memGetInt(struct + MIPMAP_MODE);
    }

    public static int naddress_mode_u(long struct) {
        return MemoryUtil.memGetInt(struct + ADDRESS_MODE_U);
    }

    public static int naddress_mode_v(long struct) {
        return MemoryUtil.memGetInt(struct + ADDRESS_MODE_V);
    }

    public static int naddress_mode_w(long struct) {
        return MemoryUtil.memGetInt(struct + ADDRESS_MODE_W);
    }

    public static float nmip_lod_bias(long struct) {
        return MemoryUtil.memGetFloat(struct + MIP_LOD_BIAS);
    }

    public static float nmax_anisotropy(long struct) {
        return MemoryUtil.memGetFloat(struct + MAX_ANISOTROPY);
    }

    public static int ncompare_op(long struct) {
        return MemoryUtil.memGetInt(struct + COMPARE_OP);
    }

    public static float nmin_lod(long struct) {
        return MemoryUtil.memGetFloat(struct + MIN_LOD);
    }

    public static float nmax_lod(long struct) {
        return MemoryUtil.memGetFloat(struct + MAX_LOD);
    }

    public static boolean nenable_anisotropy(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLE_ANISOTROPY)) != 0;
    }

    public static boolean nenable_compare(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLE_COMPARE)) != 0;
    }

    public static byte npadding1(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING1);
    }

    public static byte npadding2(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING2);
    }

    public static int nprops(long struct) {
        return MemoryUtil.memGetInt(struct + PROPS);
    }

    public static void nmin_filter(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIN_FILTER, value);
    }

    public static void nmag_filter(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAG_FILTER, value);
    }

    public static void nmipmap_mode(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIPMAP_MODE, value);
    }

    public static void naddress_mode_u(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADDRESS_MODE_U, value);
    }

    public static void naddress_mode_v(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADDRESS_MODE_V, value);
    }

    public static void naddress_mode_w(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADDRESS_MODE_W, value);
    }

    public static void nmip_lod_bias(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MIP_LOD_BIAS, value);
    }

    public static void nmax_anisotropy(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAX_ANISOTROPY, value);
    }

    public static void ncompare_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPARE_OP, value);
    }

    public static void nmin_lod(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MIN_LOD, value);
    }

    public static void nmax_lod(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAX_LOD, value);
    }

    public static void nenable_anisotropy(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ENABLE_ANISOTROPY, value ? (byte) 1 : (byte) 0);
    }

    public static void nenable_compare(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ENABLE_COMPARE, value ? (byte) 1 : (byte) 0);
    }

    public static void npadding1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING1, value);
    }

    public static void npadding2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING2, value);
    }

    public static void nprops(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROPS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUSamplerCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUSamplerCreateInfo, Buffer> implements NativeResource {
        private static final SDL_GPUSamplerCreateInfo ELEMENT_FACTORY = SDL_GPUSamplerCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUSamplerCreateInfo.SIZEOF);
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
        public SDL_GPUSamplerCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUFilter")
        public int min_filter() {
            return SDL_GPUSamplerCreateInfo.nmin_filter(address());
        }

        @NativeType("SDL_GPUFilter")
        public int mag_filter() {
            return SDL_GPUSamplerCreateInfo.nmag_filter(address());
        }

        @NativeType("SDL_GPUSamplerMipmapMode")
        public int mipmap_mode() {
            return SDL_GPUSamplerCreateInfo.nmipmap_mode(address());
        }

        @NativeType("SDL_GPUSamplerAddressMode")
        public int address_mode_u() {
            return SDL_GPUSamplerCreateInfo.naddress_mode_u(address());
        }

        @NativeType("SDL_GPUSamplerAddressMode")
        public int address_mode_v() {
            return SDL_GPUSamplerCreateInfo.naddress_mode_v(address());
        }

        @NativeType("SDL_GPUSamplerAddressMode")
        public int address_mode_w() {
            return SDL_GPUSamplerCreateInfo.naddress_mode_w(address());
        }

        public float mip_lod_bias() {
            return SDL_GPUSamplerCreateInfo.nmip_lod_bias(address());
        }

        public float max_anisotropy() {
            return SDL_GPUSamplerCreateInfo.nmax_anisotropy(address());
        }

        @NativeType("SDL_GPUCompareOp")
        public int compare_op() {
            return SDL_GPUSamplerCreateInfo.ncompare_op(address());
        }

        public float min_lod() {
            return SDL_GPUSamplerCreateInfo.nmin_lod(address());
        }

        public float max_lod() {
            return SDL_GPUSamplerCreateInfo.nmax_lod(address());
        }

        @NativeType("bool")
        public boolean enable_anisotropy() {
            return SDL_GPUSamplerCreateInfo.nenable_anisotropy(address());
        }

        @NativeType("bool")
        public boolean enable_compare() {
            return SDL_GPUSamplerCreateInfo.nenable_compare(address());
        }

        @NativeType("SDL_PropertiesID")
        public int props() {
            return SDL_GPUSamplerCreateInfo.nprops(address());
        }

        public Buffer min_filter(@NativeType("SDL_GPUFilter") int value) {
            SDL_GPUSamplerCreateInfo.nmin_filter(address(), value);
            return this;
        }

        public Buffer mag_filter(@NativeType("SDL_GPUFilter") int value) {
            SDL_GPUSamplerCreateInfo.nmag_filter(address(), value);
            return this;
        }

        public Buffer mipmap_mode(@NativeType("SDL_GPUSamplerMipmapMode") int value) {
            SDL_GPUSamplerCreateInfo.nmipmap_mode(address(), value);
            return this;
        }

        public Buffer address_mode_u(@NativeType("SDL_GPUSamplerAddressMode") int value) {
            SDL_GPUSamplerCreateInfo.naddress_mode_u(address(), value);
            return this;
        }

        public Buffer address_mode_v(@NativeType("SDL_GPUSamplerAddressMode") int value) {
            SDL_GPUSamplerCreateInfo.naddress_mode_v(address(), value);
            return this;
        }

        public Buffer address_mode_w(@NativeType("SDL_GPUSamplerAddressMode") int value) {
            SDL_GPUSamplerCreateInfo.naddress_mode_w(address(), value);
            return this;
        }

        public Buffer mip_lod_bias(float value) {
            SDL_GPUSamplerCreateInfo.nmip_lod_bias(address(), value);
            return this;
        }

        public Buffer max_anisotropy(float value) {
            SDL_GPUSamplerCreateInfo.nmax_anisotropy(address(), value);
            return this;
        }

        public Buffer compare_op(@NativeType("SDL_GPUCompareOp") int value) {
            SDL_GPUSamplerCreateInfo.ncompare_op(address(), value);
            return this;
        }

        public Buffer min_lod(float value) {
            SDL_GPUSamplerCreateInfo.nmin_lod(address(), value);
            return this;
        }

        public Buffer max_lod(float value) {
            SDL_GPUSamplerCreateInfo.nmax_lod(address(), value);
            return this;
        }

        public Buffer enable_anisotropy(@NativeType("bool") boolean value) {
            SDL_GPUSamplerCreateInfo.nenable_anisotropy(address(), value);
            return this;
        }

        public Buffer enable_compare(@NativeType("bool") boolean value) {
            SDL_GPUSamplerCreateInfo.nenable_compare(address(), value);
            return this;
        }

        public Buffer props(@NativeType("SDL_PropertiesID") int value) {
            SDL_GPUSamplerCreateInfo.nprops(address(), value);
            return this;
        }
    }
}
