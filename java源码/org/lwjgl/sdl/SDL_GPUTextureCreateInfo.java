package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUTextureCreateInfo.class */
public class SDL_GPUTextureCreateInfo extends Struct<SDL_GPUTextureCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int FORMAT;
    public static final int USAGE;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int LAYER_COUNT_OR_DEPTH;
    public static final int NUM_LEVELS;
    public static final int SAMPLE_COUNT;
    public static final int PROPS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        USAGE = layout.offsetof(2);
        WIDTH = layout.offsetof(3);
        HEIGHT = layout.offsetof(4);
        LAYER_COUNT_OR_DEPTH = layout.offsetof(5);
        NUM_LEVELS = layout.offsetof(6);
        SAMPLE_COUNT = layout.offsetof(7);
        PROPS = layout.offsetof(8);
    }

    protected SDL_GPUTextureCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUTextureCreateInfo create(long address, ByteBuffer container) {
        return new SDL_GPUTextureCreateInfo(address, container);
    }

    public SDL_GPUTextureCreateInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUTextureType")
    public int type() {
        return ntype(address());
    }

    @NativeType("SDL_GPUTextureFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("SDL_GPUTextureUsageFlags")
    public int usage() {
        return nusage(address());
    }

    @NativeType("Uint32")
    public int width() {
        return nwidth(address());
    }

    @NativeType("Uint32")
    public int height() {
        return nheight(address());
    }

    @NativeType("Uint32")
    public int layer_count_or_depth() {
        return nlayer_count_or_depth(address());
    }

    @NativeType("Uint32")
    public int num_levels() {
        return nnum_levels(address());
    }

    @NativeType("SDL_GPUSampleCount")
    public int sample_count() {
        return nsample_count(address());
    }

    @NativeType("SDL_PropertiesID")
    public int props() {
        return nprops(address());
    }

    public SDL_GPUTextureCreateInfo type(@NativeType("SDL_GPUTextureType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_GPUTextureCreateInfo format(@NativeType("SDL_GPUTextureFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public SDL_GPUTextureCreateInfo usage(@NativeType("SDL_GPUTextureUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    public SDL_GPUTextureCreateInfo width(@NativeType("Uint32") int value) {
        nwidth(address(), value);
        return this;
    }

    public SDL_GPUTextureCreateInfo height(@NativeType("Uint32") int value) {
        nheight(address(), value);
        return this;
    }

    public SDL_GPUTextureCreateInfo layer_count_or_depth(@NativeType("Uint32") int value) {
        nlayer_count_or_depth(address(), value);
        return this;
    }

    public SDL_GPUTextureCreateInfo num_levels(@NativeType("Uint32") int value) {
        nnum_levels(address(), value);
        return this;
    }

    public SDL_GPUTextureCreateInfo sample_count(@NativeType("SDL_GPUSampleCount") int value) {
        nsample_count(address(), value);
        return this;
    }

    public SDL_GPUTextureCreateInfo props(@NativeType("SDL_PropertiesID") int value) {
        nprops(address(), value);
        return this;
    }

    public SDL_GPUTextureCreateInfo set(int type, int format, int usage, int width, int height, int layer_count_or_depth, int num_levels, int sample_count, int props) {
        type(type);
        format(format);
        usage(usage);
        width(width);
        height(height);
        layer_count_or_depth(layer_count_or_depth);
        num_levels(num_levels);
        sample_count(sample_count);
        props(props);
        return this;
    }

    public SDL_GPUTextureCreateInfo set(SDL_GPUTextureCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUTextureCreateInfo malloc() {
        return new SDL_GPUTextureCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUTextureCreateInfo calloc() {
        return new SDL_GPUTextureCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUTextureCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTextureCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUTextureCreateInfo create(long address) {
        return new SDL_GPUTextureCreateInfo(address, null);
    }

    public static SDL_GPUTextureCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUTextureCreateInfo(address, null);
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

    public static SDL_GPUTextureCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUTextureCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUTextureCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUTextureCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int nusage(long struct) {
        return MemoryUtil.memGetInt(struct + USAGE);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int nlayer_count_or_depth(long struct) {
        return MemoryUtil.memGetInt(struct + LAYER_COUNT_OR_DEPTH);
    }

    public static int nnum_levels(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_LEVELS);
    }

    public static int nsample_count(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLE_COUNT);
    }

    public static int nprops(long struct) {
        return MemoryUtil.memGetInt(struct + PROPS);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void nusage(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGE, value);
    }

    public static void nwidth(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDTH, value);
    }

    public static void nheight(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEIGHT, value);
    }

    public static void nlayer_count_or_depth(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYER_COUNT_OR_DEPTH, value);
    }

    public static void nnum_levels(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_LEVELS, value);
    }

    public static void nsample_count(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLE_COUNT, value);
    }

    public static void nprops(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROPS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUTextureCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUTextureCreateInfo, Buffer> implements NativeResource {
        private static final SDL_GPUTextureCreateInfo ELEMENT_FACTORY = SDL_GPUTextureCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUTextureCreateInfo.SIZEOF);
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
        public SDL_GPUTextureCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUTextureType")
        public int type() {
            return SDL_GPUTextureCreateInfo.ntype(address());
        }

        @NativeType("SDL_GPUTextureFormat")
        public int format() {
            return SDL_GPUTextureCreateInfo.nformat(address());
        }

        @NativeType("SDL_GPUTextureUsageFlags")
        public int usage() {
            return SDL_GPUTextureCreateInfo.nusage(address());
        }

        @NativeType("Uint32")
        public int width() {
            return SDL_GPUTextureCreateInfo.nwidth(address());
        }

        @NativeType("Uint32")
        public int height() {
            return SDL_GPUTextureCreateInfo.nheight(address());
        }

        @NativeType("Uint32")
        public int layer_count_or_depth() {
            return SDL_GPUTextureCreateInfo.nlayer_count_or_depth(address());
        }

        @NativeType("Uint32")
        public int num_levels() {
            return SDL_GPUTextureCreateInfo.nnum_levels(address());
        }

        @NativeType("SDL_GPUSampleCount")
        public int sample_count() {
            return SDL_GPUTextureCreateInfo.nsample_count(address());
        }

        @NativeType("SDL_PropertiesID")
        public int props() {
            return SDL_GPUTextureCreateInfo.nprops(address());
        }

        public Buffer type(@NativeType("SDL_GPUTextureType") int value) {
            SDL_GPUTextureCreateInfo.ntype(address(), value);
            return this;
        }

        public Buffer format(@NativeType("SDL_GPUTextureFormat") int value) {
            SDL_GPUTextureCreateInfo.nformat(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("SDL_GPUTextureUsageFlags") int value) {
            SDL_GPUTextureCreateInfo.nusage(address(), value);
            return this;
        }

        public Buffer width(@NativeType("Uint32") int value) {
            SDL_GPUTextureCreateInfo.nwidth(address(), value);
            return this;
        }

        public Buffer height(@NativeType("Uint32") int value) {
            SDL_GPUTextureCreateInfo.nheight(address(), value);
            return this;
        }

        public Buffer layer_count_or_depth(@NativeType("Uint32") int value) {
            SDL_GPUTextureCreateInfo.nlayer_count_or_depth(address(), value);
            return this;
        }

        public Buffer num_levels(@NativeType("Uint32") int value) {
            SDL_GPUTextureCreateInfo.nnum_levels(address(), value);
            return this;
        }

        public Buffer sample_count(@NativeType("SDL_GPUSampleCount") int value) {
            SDL_GPUTextureCreateInfo.nsample_count(address(), value);
            return this;
        }

        public Buffer props(@NativeType("SDL_PropertiesID") int value) {
            SDL_GPUTextureCreateInfo.nprops(address(), value);
            return this;
        }
    }
}
