package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUTextureSamplerBinding.class */
public class SDL_GPUTextureSamplerBinding extends Struct<SDL_GPUTextureSamplerBinding> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TEXTURE;
    public static final int SAMPLER;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TEXTURE = layout.offsetof(0);
        SAMPLER = layout.offsetof(1);
    }

    protected SDL_GPUTextureSamplerBinding(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUTextureSamplerBinding create(long address, ByteBuffer container) {
        return new SDL_GPUTextureSamplerBinding(address, container);
    }

    public SDL_GPUTextureSamplerBinding(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUTexture *")
    public long texture() {
        return ntexture(address());
    }

    @NativeType("SDL_GPUSampler *")
    public long sampler() {
        return nsampler(address());
    }

    public SDL_GPUTextureSamplerBinding texture(@NativeType("SDL_GPUTexture *") long value) {
        ntexture(address(), value);
        return this;
    }

    public SDL_GPUTextureSamplerBinding sampler(@NativeType("SDL_GPUSampler *") long value) {
        nsampler(address(), value);
        return this;
    }

    public SDL_GPUTextureSamplerBinding set(long texture, long sampler) {
        texture(texture);
        sampler(sampler);
        return this;
    }

    public SDL_GPUTextureSamplerBinding set(SDL_GPUTextureSamplerBinding src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUTextureSamplerBinding malloc() {
        return new SDL_GPUTextureSamplerBinding(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUTextureSamplerBinding calloc() {
        return new SDL_GPUTextureSamplerBinding(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUTextureSamplerBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTextureSamplerBinding(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUTextureSamplerBinding create(long address) {
        return new SDL_GPUTextureSamplerBinding(address, null);
    }

    public static SDL_GPUTextureSamplerBinding createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUTextureSamplerBinding(address, null);
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

    public static SDL_GPUTextureSamplerBinding malloc(MemoryStack stack) {
        return new SDL_GPUTextureSamplerBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUTextureSamplerBinding calloc(MemoryStack stack) {
        return new SDL_GPUTextureSamplerBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ntexture(long struct) {
        return MemoryUtil.memGetAddress(struct + TEXTURE);
    }

    public static long nsampler(long struct) {
        return MemoryUtil.memGetAddress(struct + SAMPLER);
    }

    public static void ntexture(long struct, long value) {
        MemoryUtil.memPutAddress(struct + TEXTURE, Checks.check(value));
    }

    public static void nsampler(long struct, long value) {
        MemoryUtil.memPutAddress(struct + SAMPLER, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + TEXTURE));
        Checks.check(MemoryUtil.memGetAddress(struct + SAMPLER));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUTextureSamplerBinding$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUTextureSamplerBinding, Buffer> implements NativeResource {
        private static final SDL_GPUTextureSamplerBinding ELEMENT_FACTORY = SDL_GPUTextureSamplerBinding.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUTextureSamplerBinding.SIZEOF);
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
        public SDL_GPUTextureSamplerBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUTexture *")
        public long texture() {
            return SDL_GPUTextureSamplerBinding.ntexture(address());
        }

        @NativeType("SDL_GPUSampler *")
        public long sampler() {
            return SDL_GPUTextureSamplerBinding.nsampler(address());
        }

        public Buffer texture(@NativeType("SDL_GPUTexture *") long value) {
            SDL_GPUTextureSamplerBinding.ntexture(address(), value);
            return this;
        }

        public Buffer sampler(@NativeType("SDL_GPUSampler *") long value) {
            SDL_GPUTextureSamplerBinding.nsampler(address(), value);
            return this;
        }
    }
}
