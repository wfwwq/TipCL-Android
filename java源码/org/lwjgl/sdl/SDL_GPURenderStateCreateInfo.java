package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.sdl.SDL_GPUTextureSamplerBinding;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPURenderStateCreateInfo.class */
public class SDL_GPURenderStateCreateInfo extends Struct<SDL_GPURenderStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FRAGMENT_SHADER;
    public static final int NUM_SAMPLER_BINDINGS;
    public static final int SAMPLER_BINDINGS;
    public static final int NUM_STORAGE_TEXTURES;
    public static final int STORAGE_TEXTURES;
    public static final int NUM_STORAGE_BUFFERS;
    public static final int STORAGE_BUFFERS;
    public static final int PROPS;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FRAGMENT_SHADER = layout.offsetof(0);
        NUM_SAMPLER_BINDINGS = layout.offsetof(1);
        SAMPLER_BINDINGS = layout.offsetof(2);
        NUM_STORAGE_TEXTURES = layout.offsetof(3);
        STORAGE_TEXTURES = layout.offsetof(4);
        NUM_STORAGE_BUFFERS = layout.offsetof(5);
        STORAGE_BUFFERS = layout.offsetof(6);
        PROPS = layout.offsetof(7);
    }

    protected SDL_GPURenderStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPURenderStateCreateInfo create(long address, ByteBuffer container) {
        return new SDL_GPURenderStateCreateInfo(address, container);
    }

    public SDL_GPURenderStateCreateInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUShader *")
    public long fragment_shader() {
        return nfragment_shader(address());
    }

    @NativeType("Sint32")
    public int num_sampler_bindings() {
        return nnum_sampler_bindings(address());
    }

    @NativeType("SDL_GPUTextureSamplerBinding const *")
    public SDL_GPUTextureSamplerBinding.Buffer sampler_bindings() {
        return nsampler_bindings(address());
    }

    @NativeType("Sint32")
    public int num_storage_textures() {
        return nnum_storage_textures(address());
    }

    @NativeType("SDL_GPUTexture const **")
    public PointerBuffer storage_textures() {
        return nstorage_textures(address());
    }

    @NativeType("Sint32")
    public int num_storage_buffers() {
        return nnum_storage_buffers(address());
    }

    @NativeType("SDL_GPUBuffer const **")
    public PointerBuffer storage_buffers() {
        return nstorage_buffers(address());
    }

    @NativeType("SDL_PropertiesID")
    public int props() {
        return nprops(address());
    }

    public SDL_GPURenderStateCreateInfo fragment_shader(@NativeType("SDL_GPUShader *") long value) {
        nfragment_shader(address(), value);
        return this;
    }

    public SDL_GPURenderStateCreateInfo num_sampler_bindings(@NativeType("Sint32") int value) {
        nnum_sampler_bindings(address(), value);
        return this;
    }

    public SDL_GPURenderStateCreateInfo sampler_bindings(@NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.Buffer value) {
        nsampler_bindings(address(), value);
        return this;
    }

    public SDL_GPURenderStateCreateInfo num_storage_textures(@NativeType("Sint32") int value) {
        nnum_storage_textures(address(), value);
        return this;
    }

    public SDL_GPURenderStateCreateInfo storage_textures(@NativeType("SDL_GPUTexture const **") PointerBuffer value) {
        nstorage_textures(address(), value);
        return this;
    }

    public SDL_GPURenderStateCreateInfo num_storage_buffers(@NativeType("Sint32") int value) {
        nnum_storage_buffers(address(), value);
        return this;
    }

    public SDL_GPURenderStateCreateInfo storage_buffers(@NativeType("SDL_GPUBuffer const **") PointerBuffer value) {
        nstorage_buffers(address(), value);
        return this;
    }

    public SDL_GPURenderStateCreateInfo props(@NativeType("SDL_PropertiesID") int value) {
        nprops(address(), value);
        return this;
    }

    public SDL_GPURenderStateCreateInfo set(long fragment_shader, int num_sampler_bindings, SDL_GPUTextureSamplerBinding.Buffer sampler_bindings, int num_storage_textures, PointerBuffer storage_textures, int num_storage_buffers, PointerBuffer storage_buffers, int props) {
        fragment_shader(fragment_shader);
        num_sampler_bindings(num_sampler_bindings);
        sampler_bindings(sampler_bindings);
        num_storage_textures(num_storage_textures);
        storage_textures(storage_textures);
        num_storage_buffers(num_storage_buffers);
        storage_buffers(storage_buffers);
        props(props);
        return this;
    }

    public SDL_GPURenderStateCreateInfo set(SDL_GPURenderStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPURenderStateCreateInfo malloc() {
        return new SDL_GPURenderStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPURenderStateCreateInfo calloc() {
        return new SDL_GPURenderStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPURenderStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPURenderStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPURenderStateCreateInfo create(long address) {
        return new SDL_GPURenderStateCreateInfo(address, null);
    }

    public static SDL_GPURenderStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPURenderStateCreateInfo(address, null);
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

    public static SDL_GPURenderStateCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPURenderStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPURenderStateCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPURenderStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nfragment_shader(long struct) {
        return MemoryUtil.memGetAddress(struct + FRAGMENT_SHADER);
    }

    public static int nnum_sampler_bindings(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_SAMPLER_BINDINGS);
    }

    public static SDL_GPUTextureSamplerBinding.Buffer nsampler_bindings(long struct) {
        return SDL_GPUTextureSamplerBinding.createSafe(MemoryUtil.memGetAddress(struct + SAMPLER_BINDINGS), nnum_sampler_bindings(struct));
    }

    public static int nnum_storage_textures(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_STORAGE_TEXTURES);
    }

    public static PointerBuffer nstorage_textures(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + STORAGE_TEXTURES), nnum_storage_textures(struct));
    }

    public static int nnum_storage_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_STORAGE_BUFFERS);
    }

    public static PointerBuffer nstorage_buffers(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + STORAGE_BUFFERS), nnum_storage_buffers(struct));
    }

    public static int nprops(long struct) {
        return MemoryUtil.memGetInt(struct + PROPS);
    }

    public static void nfragment_shader(long struct, long value) {
        MemoryUtil.memPutAddress(struct + FRAGMENT_SHADER, Checks.check(value));
    }

    public static void nnum_sampler_bindings(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_SAMPLER_BINDINGS, value);
    }

    public static void nsampler_bindings(long struct, SDL_GPUTextureSamplerBinding.Buffer value) {
        MemoryUtil.memPutAddress(struct + SAMPLER_BINDINGS, MemoryUtil.memAddressSafe(value));
        nnum_sampler_bindings(struct, value == null ? 0 : value.remaining());
    }

    public static void nnum_storage_textures(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_STORAGE_TEXTURES, value);
    }

    public static void nstorage_textures(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + STORAGE_TEXTURES, MemoryUtil.memAddressSafe(value));
        nnum_storage_textures(struct, value == null ? 0 : value.remaining());
    }

    public static void nnum_storage_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_STORAGE_BUFFERS, value);
    }

    public static void nstorage_buffers(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + STORAGE_BUFFERS, MemoryUtil.memAddressSafe(value));
        nnum_storage_buffers(struct, value == null ? 0 : value.remaining());
    }

    public static void nprops(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROPS, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + FRAGMENT_SHADER));
        int num_sampler_bindings = nnum_sampler_bindings(struct);
        long sampler_bindings = MemoryUtil.memGetAddress(struct + SAMPLER_BINDINGS);
        if (sampler_bindings != 0) {
            validate(sampler_bindings, num_sampler_bindings, SDL_GPUTextureSamplerBinding.SIZEOF, SDL_GPUTextureSamplerBinding::validate);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPURenderStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPURenderStateCreateInfo, Buffer> implements NativeResource {
        private static final SDL_GPURenderStateCreateInfo ELEMENT_FACTORY = SDL_GPURenderStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPURenderStateCreateInfo.SIZEOF);
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
        public SDL_GPURenderStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUShader *")
        public long fragment_shader() {
            return SDL_GPURenderStateCreateInfo.nfragment_shader(address());
        }

        @NativeType("Sint32")
        public int num_sampler_bindings() {
            return SDL_GPURenderStateCreateInfo.nnum_sampler_bindings(address());
        }

        @NativeType("SDL_GPUTextureSamplerBinding const *")
        public SDL_GPUTextureSamplerBinding.Buffer sampler_bindings() {
            return SDL_GPURenderStateCreateInfo.nsampler_bindings(address());
        }

        @NativeType("Sint32")
        public int num_storage_textures() {
            return SDL_GPURenderStateCreateInfo.nnum_storage_textures(address());
        }

        @NativeType("SDL_GPUTexture const **")
        public PointerBuffer storage_textures() {
            return SDL_GPURenderStateCreateInfo.nstorage_textures(address());
        }

        @NativeType("Sint32")
        public int num_storage_buffers() {
            return SDL_GPURenderStateCreateInfo.nnum_storage_buffers(address());
        }

        @NativeType("SDL_GPUBuffer const **")
        public PointerBuffer storage_buffers() {
            return SDL_GPURenderStateCreateInfo.nstorage_buffers(address());
        }

        @NativeType("SDL_PropertiesID")
        public int props() {
            return SDL_GPURenderStateCreateInfo.nprops(address());
        }

        public Buffer fragment_shader(@NativeType("SDL_GPUShader *") long value) {
            SDL_GPURenderStateCreateInfo.nfragment_shader(address(), value);
            return this;
        }

        public Buffer num_sampler_bindings(@NativeType("Sint32") int value) {
            SDL_GPURenderStateCreateInfo.nnum_sampler_bindings(address(), value);
            return this;
        }

        public Buffer sampler_bindings(@NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.Buffer value) {
            SDL_GPURenderStateCreateInfo.nsampler_bindings(address(), value);
            return this;
        }

        public Buffer num_storage_textures(@NativeType("Sint32") int value) {
            SDL_GPURenderStateCreateInfo.nnum_storage_textures(address(), value);
            return this;
        }

        public Buffer storage_textures(@NativeType("SDL_GPUTexture const **") PointerBuffer value) {
            SDL_GPURenderStateCreateInfo.nstorage_textures(address(), value);
            return this;
        }

        public Buffer num_storage_buffers(@NativeType("Sint32") int value) {
            SDL_GPURenderStateCreateInfo.nnum_storage_buffers(address(), value);
            return this;
        }

        public Buffer storage_buffers(@NativeType("SDL_GPUBuffer const **") PointerBuffer value) {
            SDL_GPURenderStateCreateInfo.nstorage_buffers(address(), value);
            return this;
        }

        public Buffer props(@NativeType("SDL_PropertiesID") int value) {
            SDL_GPURenderStateCreateInfo.nprops(address(), value);
            return this;
        }
    }
}
