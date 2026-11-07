package org.lwjgl.util.spvc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslConstexprSampler.class
 */
@NativeType("struct spvc_msl_constexpr_sampler")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslConstexprSampler.class */
public class SpvcMslConstexprSampler extends Struct<SpvcMslConstexprSampler> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COORD;
    public static final int MIN_FILTER;
    public static final int MAG_FILTER;
    public static final int MIP_FILTER;
    public static final int S_ADDRESS;
    public static final int T_ADDRESS;
    public static final int R_ADDRESS;
    public static final int COMPARE_FUNC;
    public static final int BORDER_COLOR;
    public static final int LOD_CLAMP_MIN;
    public static final int LOD_CLAMP_MAX;
    public static final int MAX_ANISOTROPY;
    public static final int COMPARE_ENABLE;
    public static final int LOD_CLAMP_ENABLE;
    public static final int ANISOTROPY_ENABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COORD = layout.offsetof(0);
        MIN_FILTER = layout.offsetof(1);
        MAG_FILTER = layout.offsetof(2);
        MIP_FILTER = layout.offsetof(3);
        S_ADDRESS = layout.offsetof(4);
        T_ADDRESS = layout.offsetof(5);
        R_ADDRESS = layout.offsetof(6);
        COMPARE_FUNC = layout.offsetof(7);
        BORDER_COLOR = layout.offsetof(8);
        LOD_CLAMP_MIN = layout.offsetof(9);
        LOD_CLAMP_MAX = layout.offsetof(10);
        MAX_ANISOTROPY = layout.offsetof(11);
        COMPARE_ENABLE = layout.offsetof(12);
        LOD_CLAMP_ENABLE = layout.offsetof(13);
        ANISOTROPY_ENABLE = layout.offsetof(14);
    }

    protected SpvcMslConstexprSampler(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcMslConstexprSampler create(long address, ByteBuffer container) {
        return new SpvcMslConstexprSampler(address, container);
    }

    public SpvcMslConstexprSampler(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("spvc_msl_sampler_coord")
    public int coord() {
        return ncoord(address());
    }

    @NativeType("spvc_msl_sampler_filter")
    public int min_filter() {
        return nmin_filter(address());
    }

    @NativeType("spvc_msl_sampler_filter")
    public int mag_filter() {
        return nmag_filter(address());
    }

    @NativeType("spvc_msl_sampler_mip_filter")
    public int mip_filter() {
        return nmip_filter(address());
    }

    @NativeType("spvc_msl_sampler_address")
    public int s_address() {
        return ns_address(address());
    }

    @NativeType("spvc_msl_sampler_address")
    public int t_address() {
        return nt_address(address());
    }

    @NativeType("spvc_msl_sampler_address")
    public int r_address() {
        return nr_address(address());
    }

    @NativeType("spvc_msl_sampler_compare_func")
    public int compare_func() {
        return ncompare_func(address());
    }

    @NativeType("spvc_msl_sampler_border_color")
    public int border_color() {
        return nborder_color(address());
    }

    public float lod_clamp_min() {
        return nlod_clamp_min(address());
    }

    public float lod_clamp_max() {
        return nlod_clamp_max(address());
    }

    public int max_anisotropy() {
        return nmax_anisotropy(address());
    }

    @NativeType("spvc_bool")
    public boolean compare_enable() {
        return ncompare_enable(address());
    }

    @NativeType("spvc_bool")
    public boolean lod_clamp_enable() {
        return nlod_clamp_enable(address());
    }

    @NativeType("spvc_bool")
    public boolean anisotropy_enable() {
        return nanisotropy_enable(address());
    }

    public SpvcMslConstexprSampler coord(@NativeType("spvc_msl_sampler_coord") int value) {
        ncoord(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler min_filter(@NativeType("spvc_msl_sampler_filter") int value) {
        nmin_filter(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler mag_filter(@NativeType("spvc_msl_sampler_filter") int value) {
        nmag_filter(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler mip_filter(@NativeType("spvc_msl_sampler_mip_filter") int value) {
        nmip_filter(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler s_address(@NativeType("spvc_msl_sampler_address") int value) {
        ns_address(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler t_address(@NativeType("spvc_msl_sampler_address") int value) {
        nt_address(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler r_address(@NativeType("spvc_msl_sampler_address") int value) {
        nr_address(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler compare_func(@NativeType("spvc_msl_sampler_compare_func") int value) {
        ncompare_func(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler border_color(@NativeType("spvc_msl_sampler_border_color") int value) {
        nborder_color(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler lod_clamp_min(float value) {
        nlod_clamp_min(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler lod_clamp_max(float value) {
        nlod_clamp_max(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler max_anisotropy(int value) {
        nmax_anisotropy(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler compare_enable(@NativeType("spvc_bool") boolean value) {
        ncompare_enable(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler lod_clamp_enable(@NativeType("spvc_bool") boolean value) {
        nlod_clamp_enable(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler anisotropy_enable(@NativeType("spvc_bool") boolean value) {
        nanisotropy_enable(address(), value);
        return this;
    }

    public SpvcMslConstexprSampler set(int coord, int min_filter, int mag_filter, int mip_filter, int s_address, int t_address, int r_address, int compare_func, int border_color, float lod_clamp_min, float lod_clamp_max, int max_anisotropy, boolean compare_enable, boolean lod_clamp_enable, boolean anisotropy_enable) {
        coord(coord);
        min_filter(min_filter);
        mag_filter(mag_filter);
        mip_filter(mip_filter);
        s_address(s_address);
        t_address(t_address);
        r_address(r_address);
        compare_func(compare_func);
        border_color(border_color);
        lod_clamp_min(lod_clamp_min);
        lod_clamp_max(lod_clamp_max);
        max_anisotropy(max_anisotropy);
        compare_enable(compare_enable);
        lod_clamp_enable(lod_clamp_enable);
        anisotropy_enable(anisotropy_enable);
        return this;
    }

    public SpvcMslConstexprSampler set(SpvcMslConstexprSampler src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcMslConstexprSampler malloc() {
        return new SpvcMslConstexprSampler(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcMslConstexprSampler calloc() {
        return new SpvcMslConstexprSampler(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcMslConstexprSampler create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcMslConstexprSampler(MemoryUtil.memAddress(container), container);
    }

    public static SpvcMslConstexprSampler create(long address) {
        return new SpvcMslConstexprSampler(address, null);
    }

    public static SpvcMslConstexprSampler createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcMslConstexprSampler(address, null);
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

    public static SpvcMslConstexprSampler malloc(MemoryStack stack) {
        return new SpvcMslConstexprSampler(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcMslConstexprSampler calloc(MemoryStack stack) {
        return new SpvcMslConstexprSampler(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ncoord(long struct) {
        return MemoryUtil.memGetInt(struct + COORD);
    }

    public static int nmin_filter(long struct) {
        return MemoryUtil.memGetInt(struct + MIN_FILTER);
    }

    public static int nmag_filter(long struct) {
        return MemoryUtil.memGetInt(struct + MAG_FILTER);
    }

    public static int nmip_filter(long struct) {
        return MemoryUtil.memGetInt(struct + MIP_FILTER);
    }

    public static int ns_address(long struct) {
        return MemoryUtil.memGetInt(struct + S_ADDRESS);
    }

    public static int nt_address(long struct) {
        return MemoryUtil.memGetInt(struct + T_ADDRESS);
    }

    public static int nr_address(long struct) {
        return MemoryUtil.memGetInt(struct + R_ADDRESS);
    }

    public static int ncompare_func(long struct) {
        return MemoryUtil.memGetInt(struct + COMPARE_FUNC);
    }

    public static int nborder_color(long struct) {
        return MemoryUtil.memGetInt(struct + BORDER_COLOR);
    }

    public static float nlod_clamp_min(long struct) {
        return MemoryUtil.memGetFloat(struct + LOD_CLAMP_MIN);
    }

    public static float nlod_clamp_max(long struct) {
        return MemoryUtil.memGetFloat(struct + LOD_CLAMP_MAX);
    }

    public static int nmax_anisotropy(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_ANISOTROPY);
    }

    public static boolean ncompare_enable(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) COMPARE_ENABLE)) != 0;
    }

    public static boolean nlod_clamp_enable(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) LOD_CLAMP_ENABLE)) != 0;
    }

    public static boolean nanisotropy_enable(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ANISOTROPY_ENABLE)) != 0;
    }

    public static void ncoord(long struct, int value) {
        MemoryUtil.memPutInt(struct + COORD, value);
    }

    public static void nmin_filter(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIN_FILTER, value);
    }

    public static void nmag_filter(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAG_FILTER, value);
    }

    public static void nmip_filter(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIP_FILTER, value);
    }

    public static void ns_address(long struct, int value) {
        MemoryUtil.memPutInt(struct + S_ADDRESS, value);
    }

    public static void nt_address(long struct, int value) {
        MemoryUtil.memPutInt(struct + T_ADDRESS, value);
    }

    public static void nr_address(long struct, int value) {
        MemoryUtil.memPutInt(struct + R_ADDRESS, value);
    }

    public static void ncompare_func(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPARE_FUNC, value);
    }

    public static void nborder_color(long struct, int value) {
        MemoryUtil.memPutInt(struct + BORDER_COLOR, value);
    }

    public static void nlod_clamp_min(long struct, float value) {
        MemoryUtil.memPutFloat(struct + LOD_CLAMP_MIN, value);
    }

    public static void nlod_clamp_max(long struct, float value) {
        MemoryUtil.memPutFloat(struct + LOD_CLAMP_MAX, value);
    }

    public static void nmax_anisotropy(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_ANISOTROPY, value);
    }

    public static void ncompare_enable(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + COMPARE_ENABLE, value ? (byte) 1 : (byte) 0);
    }

    public static void nlod_clamp_enable(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + LOD_CLAMP_ENABLE, value ? (byte) 1 : (byte) 0);
    }

    public static void nanisotropy_enable(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ANISOTROPY_ENABLE, value ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslConstexprSampler$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslConstexprSampler$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcMslConstexprSampler, Buffer> implements NativeResource {
        private static final SpvcMslConstexprSampler ELEMENT_FACTORY = SpvcMslConstexprSampler.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcMslConstexprSampler.SIZEOF);
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
        public SpvcMslConstexprSampler getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("spvc_msl_sampler_coord")
        public int coord() {
            return SpvcMslConstexprSampler.ncoord(address());
        }

        @NativeType("spvc_msl_sampler_filter")
        public int min_filter() {
            return SpvcMslConstexprSampler.nmin_filter(address());
        }

        @NativeType("spvc_msl_sampler_filter")
        public int mag_filter() {
            return SpvcMslConstexprSampler.nmag_filter(address());
        }

        @NativeType("spvc_msl_sampler_mip_filter")
        public int mip_filter() {
            return SpvcMslConstexprSampler.nmip_filter(address());
        }

        @NativeType("spvc_msl_sampler_address")
        public int s_address() {
            return SpvcMslConstexprSampler.ns_address(address());
        }

        @NativeType("spvc_msl_sampler_address")
        public int t_address() {
            return SpvcMslConstexprSampler.nt_address(address());
        }

        @NativeType("spvc_msl_sampler_address")
        public int r_address() {
            return SpvcMslConstexprSampler.nr_address(address());
        }

        @NativeType("spvc_msl_sampler_compare_func")
        public int compare_func() {
            return SpvcMslConstexprSampler.ncompare_func(address());
        }

        @NativeType("spvc_msl_sampler_border_color")
        public int border_color() {
            return SpvcMslConstexprSampler.nborder_color(address());
        }

        public float lod_clamp_min() {
            return SpvcMslConstexprSampler.nlod_clamp_min(address());
        }

        public float lod_clamp_max() {
            return SpvcMslConstexprSampler.nlod_clamp_max(address());
        }

        public int max_anisotropy() {
            return SpvcMslConstexprSampler.nmax_anisotropy(address());
        }

        @NativeType("spvc_bool")
        public boolean compare_enable() {
            return SpvcMslConstexprSampler.ncompare_enable(address());
        }

        @NativeType("spvc_bool")
        public boolean lod_clamp_enable() {
            return SpvcMslConstexprSampler.nlod_clamp_enable(address());
        }

        @NativeType("spvc_bool")
        public boolean anisotropy_enable() {
            return SpvcMslConstexprSampler.nanisotropy_enable(address());
        }

        public Buffer coord(@NativeType("spvc_msl_sampler_coord") int value) {
            SpvcMslConstexprSampler.ncoord(address(), value);
            return this;
        }

        public Buffer min_filter(@NativeType("spvc_msl_sampler_filter") int value) {
            SpvcMslConstexprSampler.nmin_filter(address(), value);
            return this;
        }

        public Buffer mag_filter(@NativeType("spvc_msl_sampler_filter") int value) {
            SpvcMslConstexprSampler.nmag_filter(address(), value);
            return this;
        }

        public Buffer mip_filter(@NativeType("spvc_msl_sampler_mip_filter") int value) {
            SpvcMslConstexprSampler.nmip_filter(address(), value);
            return this;
        }

        public Buffer s_address(@NativeType("spvc_msl_sampler_address") int value) {
            SpvcMslConstexprSampler.ns_address(address(), value);
            return this;
        }

        public Buffer t_address(@NativeType("spvc_msl_sampler_address") int value) {
            SpvcMslConstexprSampler.nt_address(address(), value);
            return this;
        }

        public Buffer r_address(@NativeType("spvc_msl_sampler_address") int value) {
            SpvcMslConstexprSampler.nr_address(address(), value);
            return this;
        }

        public Buffer compare_func(@NativeType("spvc_msl_sampler_compare_func") int value) {
            SpvcMslConstexprSampler.ncompare_func(address(), value);
            return this;
        }

        public Buffer border_color(@NativeType("spvc_msl_sampler_border_color") int value) {
            SpvcMslConstexprSampler.nborder_color(address(), value);
            return this;
        }

        public Buffer lod_clamp_min(float value) {
            SpvcMslConstexprSampler.nlod_clamp_min(address(), value);
            return this;
        }

        public Buffer lod_clamp_max(float value) {
            SpvcMslConstexprSampler.nlod_clamp_max(address(), value);
            return this;
        }

        public Buffer max_anisotropy(int value) {
            SpvcMslConstexprSampler.nmax_anisotropy(address(), value);
            return this;
        }

        public Buffer compare_enable(@NativeType("spvc_bool") boolean value) {
            SpvcMslConstexprSampler.ncompare_enable(address(), value);
            return this;
        }

        public Buffer lod_clamp_enable(@NativeType("spvc_bool") boolean value) {
            SpvcMslConstexprSampler.nlod_clamp_enable(address(), value);
            return this;
        }

        public Buffer anisotropy_enable(@NativeType("spvc_bool") boolean value) {
            SpvcMslConstexprSampler.nanisotropy_enable(address(), value);
            return this;
        }
    }
}
