package org.lwjgl.util.spvc;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslSamplerYcbcrConversion.class
 */
@NativeType("struct spvc_msl_sampler_ycbcr_conversion")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslSamplerYcbcrConversion.class */
public class SpvcMslSamplerYcbcrConversion extends Struct<SpvcMslSamplerYcbcrConversion> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PLANES;
    public static final int RESOLUTION;
    public static final int CHROMA_FILTER;
    public static final int X_CHROMA_OFFSET;
    public static final int Y_CHROMA_OFFSET;
    public static final int SWIZZLE;
    public static final int YCBCR_MODEL;
    public static final int YCBCR_RANGE;
    public static final int BPC;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __array(4, 4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PLANES = layout.offsetof(0);
        RESOLUTION = layout.offsetof(1);
        CHROMA_FILTER = layout.offsetof(2);
        X_CHROMA_OFFSET = layout.offsetof(3);
        Y_CHROMA_OFFSET = layout.offsetof(4);
        SWIZZLE = layout.offsetof(5);
        YCBCR_MODEL = layout.offsetof(6);
        YCBCR_RANGE = layout.offsetof(7);
        BPC = layout.offsetof(8);
    }

    protected SpvcMslSamplerYcbcrConversion(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcMslSamplerYcbcrConversion create(long address, ByteBuffer container) {
        return new SpvcMslSamplerYcbcrConversion(address, container);
    }

    public SpvcMslSamplerYcbcrConversion(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned int")
    public int planes() {
        return nplanes(address());
    }

    @NativeType("spvc_msl_format_resolution")
    public int resolution() {
        return nresolution(address());
    }

    @NativeType("spvc_msl_sampler_filter")
    public int chroma_filter() {
        return nchroma_filter(address());
    }

    @NativeType("spvc_msl_chroma_location")
    public int x_chroma_offset() {
        return nx_chroma_offset(address());
    }

    @NativeType("spvc_msl_chroma_location")
    public int y_chroma_offset() {
        return ny_chroma_offset(address());
    }

    @NativeType("spvc_msl_component_swizzle[4]")
    public IntBuffer swizzle() {
        return nswizzle(address());
    }

    @NativeType("spvc_msl_component_swizzle")
    public int swizzle(int index) {
        return nswizzle(address(), index);
    }

    @NativeType("spvc_msl_sampler_ycbcr_model_conversion")
    public int ycbcr_model() {
        return nycbcr_model(address());
    }

    @NativeType("spvc_msl_sampler_ycbcr_range")
    public int ycbcr_range() {
        return nycbcr_range(address());
    }

    @NativeType("unsigned int")
    public int bpc() {
        return nbpc(address());
    }

    public SpvcMslSamplerYcbcrConversion planes(@NativeType("unsigned int") int value) {
        nplanes(address(), value);
        return this;
    }

    public SpvcMslSamplerYcbcrConversion resolution(@NativeType("spvc_msl_format_resolution") int value) {
        nresolution(address(), value);
        return this;
    }

    public SpvcMslSamplerYcbcrConversion chroma_filter(@NativeType("spvc_msl_sampler_filter") int value) {
        nchroma_filter(address(), value);
        return this;
    }

    public SpvcMslSamplerYcbcrConversion x_chroma_offset(@NativeType("spvc_msl_chroma_location") int value) {
        nx_chroma_offset(address(), value);
        return this;
    }

    public SpvcMslSamplerYcbcrConversion y_chroma_offset(@NativeType("spvc_msl_chroma_location") int value) {
        ny_chroma_offset(address(), value);
        return this;
    }

    public SpvcMslSamplerYcbcrConversion swizzle(@NativeType("spvc_msl_component_swizzle[4]") IntBuffer value) {
        nswizzle(address(), value);
        return this;
    }

    public SpvcMslSamplerYcbcrConversion swizzle(int index, @NativeType("spvc_msl_component_swizzle") int value) {
        nswizzle(address(), index, value);
        return this;
    }

    public SpvcMslSamplerYcbcrConversion ycbcr_model(@NativeType("spvc_msl_sampler_ycbcr_model_conversion") int value) {
        nycbcr_model(address(), value);
        return this;
    }

    public SpvcMslSamplerYcbcrConversion ycbcr_range(@NativeType("spvc_msl_sampler_ycbcr_range") int value) {
        nycbcr_range(address(), value);
        return this;
    }

    public SpvcMslSamplerYcbcrConversion bpc(@NativeType("unsigned int") int value) {
        nbpc(address(), value);
        return this;
    }

    public SpvcMslSamplerYcbcrConversion set(int planes, int resolution, int chroma_filter, int x_chroma_offset, int y_chroma_offset, IntBuffer swizzle, int ycbcr_model, int ycbcr_range, int bpc) {
        planes(planes);
        resolution(resolution);
        chroma_filter(chroma_filter);
        x_chroma_offset(x_chroma_offset);
        y_chroma_offset(y_chroma_offset);
        swizzle(swizzle);
        ycbcr_model(ycbcr_model);
        ycbcr_range(ycbcr_range);
        bpc(bpc);
        return this;
    }

    public SpvcMslSamplerYcbcrConversion set(SpvcMslSamplerYcbcrConversion src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcMslSamplerYcbcrConversion malloc() {
        return new SpvcMslSamplerYcbcrConversion(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcMslSamplerYcbcrConversion calloc() {
        return new SpvcMslSamplerYcbcrConversion(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcMslSamplerYcbcrConversion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcMslSamplerYcbcrConversion(MemoryUtil.memAddress(container), container);
    }

    public static SpvcMslSamplerYcbcrConversion create(long address) {
        return new SpvcMslSamplerYcbcrConversion(address, null);
    }

    public static SpvcMslSamplerYcbcrConversion createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcMslSamplerYcbcrConversion(address, null);
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

    public static SpvcMslSamplerYcbcrConversion malloc(MemoryStack stack) {
        return new SpvcMslSamplerYcbcrConversion(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcMslSamplerYcbcrConversion calloc(MemoryStack stack) {
        return new SpvcMslSamplerYcbcrConversion(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nplanes(long struct) {
        return MemoryUtil.memGetInt(struct + PLANES);
    }

    public static int nresolution(long struct) {
        return MemoryUtil.memGetInt(struct + RESOLUTION);
    }

    public static int nchroma_filter(long struct) {
        return MemoryUtil.memGetInt(struct + CHROMA_FILTER);
    }

    public static int nx_chroma_offset(long struct) {
        return MemoryUtil.memGetInt(struct + X_CHROMA_OFFSET);
    }

    public static int ny_chroma_offset(long struct) {
        return MemoryUtil.memGetInt(struct + Y_CHROMA_OFFSET);
    }

    public static IntBuffer nswizzle(long struct) {
        return MemoryUtil.memIntBuffer(struct + SWIZZLE, 4);
    }

    public static int nswizzle(long struct, int index) {
        return MemoryUtil.memGetInt(struct + SWIZZLE + (Checks.check(index, 4) * 4));
    }

    public static int nycbcr_model(long struct) {
        return MemoryUtil.memGetInt(struct + YCBCR_MODEL);
    }

    public static int nycbcr_range(long struct) {
        return MemoryUtil.memGetInt(struct + YCBCR_RANGE);
    }

    public static int nbpc(long struct) {
        return MemoryUtil.memGetInt(struct + BPC);
    }

    public static void nplanes(long struct, int value) {
        MemoryUtil.memPutInt(struct + PLANES, value);
    }

    public static void nresolution(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESOLUTION, value);
    }

    public static void nchroma_filter(long struct, int value) {
        MemoryUtil.memPutInt(struct + CHROMA_FILTER, value);
    }

    public static void nx_chroma_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + X_CHROMA_OFFSET, value);
    }

    public static void ny_chroma_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + Y_CHROMA_OFFSET, value);
    }

    public static void nswizzle(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SWIZZLE, value.remaining() * 4);
    }

    public static void nswizzle(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + SWIZZLE + (Checks.check(index, 4) * 4), value);
    }

    public static void nycbcr_model(long struct, int value) {
        MemoryUtil.memPutInt(struct + YCBCR_MODEL, value);
    }

    public static void nycbcr_range(long struct, int value) {
        MemoryUtil.memPutInt(struct + YCBCR_RANGE, value);
    }

    public static void nbpc(long struct, int value) {
        MemoryUtil.memPutInt(struct + BPC, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslSamplerYcbcrConversion$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslSamplerYcbcrConversion$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcMslSamplerYcbcrConversion, Buffer> implements NativeResource {
        private static final SpvcMslSamplerYcbcrConversion ELEMENT_FACTORY = SpvcMslSamplerYcbcrConversion.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcMslSamplerYcbcrConversion.SIZEOF);
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
        public SpvcMslSamplerYcbcrConversion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned int")
        public int planes() {
            return SpvcMslSamplerYcbcrConversion.nplanes(address());
        }

        @NativeType("spvc_msl_format_resolution")
        public int resolution() {
            return SpvcMslSamplerYcbcrConversion.nresolution(address());
        }

        @NativeType("spvc_msl_sampler_filter")
        public int chroma_filter() {
            return SpvcMslSamplerYcbcrConversion.nchroma_filter(address());
        }

        @NativeType("spvc_msl_chroma_location")
        public int x_chroma_offset() {
            return SpvcMslSamplerYcbcrConversion.nx_chroma_offset(address());
        }

        @NativeType("spvc_msl_chroma_location")
        public int y_chroma_offset() {
            return SpvcMslSamplerYcbcrConversion.ny_chroma_offset(address());
        }

        @NativeType("spvc_msl_component_swizzle[4]")
        public IntBuffer swizzle() {
            return SpvcMslSamplerYcbcrConversion.nswizzle(address());
        }

        @NativeType("spvc_msl_component_swizzle")
        public int swizzle(int index) {
            return SpvcMslSamplerYcbcrConversion.nswizzle(address(), index);
        }

        @NativeType("spvc_msl_sampler_ycbcr_model_conversion")
        public int ycbcr_model() {
            return SpvcMslSamplerYcbcrConversion.nycbcr_model(address());
        }

        @NativeType("spvc_msl_sampler_ycbcr_range")
        public int ycbcr_range() {
            return SpvcMslSamplerYcbcrConversion.nycbcr_range(address());
        }

        @NativeType("unsigned int")
        public int bpc() {
            return SpvcMslSamplerYcbcrConversion.nbpc(address());
        }

        public Buffer planes(@NativeType("unsigned int") int value) {
            SpvcMslSamplerYcbcrConversion.nplanes(address(), value);
            return this;
        }

        public Buffer resolution(@NativeType("spvc_msl_format_resolution") int value) {
            SpvcMslSamplerYcbcrConversion.nresolution(address(), value);
            return this;
        }

        public Buffer chroma_filter(@NativeType("spvc_msl_sampler_filter") int value) {
            SpvcMslSamplerYcbcrConversion.nchroma_filter(address(), value);
            return this;
        }

        public Buffer x_chroma_offset(@NativeType("spvc_msl_chroma_location") int value) {
            SpvcMslSamplerYcbcrConversion.nx_chroma_offset(address(), value);
            return this;
        }

        public Buffer y_chroma_offset(@NativeType("spvc_msl_chroma_location") int value) {
            SpvcMslSamplerYcbcrConversion.ny_chroma_offset(address(), value);
            return this;
        }

        public Buffer swizzle(@NativeType("spvc_msl_component_swizzle[4]") IntBuffer value) {
            SpvcMslSamplerYcbcrConversion.nswizzle(address(), value);
            return this;
        }

        public Buffer swizzle(int index, @NativeType("spvc_msl_component_swizzle") int value) {
            SpvcMslSamplerYcbcrConversion.nswizzle(address(), index, value);
            return this;
        }

        public Buffer ycbcr_model(@NativeType("spvc_msl_sampler_ycbcr_model_conversion") int value) {
            SpvcMslSamplerYcbcrConversion.nycbcr_model(address(), value);
            return this;
        }

        public Buffer ycbcr_range(@NativeType("spvc_msl_sampler_ycbcr_range") int value) {
            SpvcMslSamplerYcbcrConversion.nycbcr_range(address(), value);
            return this;
        }

        public Buffer bpc(@NativeType("unsigned int") int value) {
            SpvcMslSamplerYcbcrConversion.nbpc(address(), value);
            return this;
        }
    }
}
