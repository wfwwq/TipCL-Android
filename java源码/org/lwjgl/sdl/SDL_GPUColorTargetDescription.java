package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUColorTargetDescription.class */
public class SDL_GPUColorTargetDescription extends Struct<SDL_GPUColorTargetDescription> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FORMAT;
    public static final int BLEND_STATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(SDL_GPUColorTargetBlendState.SIZEOF, SDL_GPUColorTargetBlendState.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FORMAT = layout.offsetof(0);
        BLEND_STATE = layout.offsetof(1);
    }

    protected SDL_GPUColorTargetDescription(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUColorTargetDescription create(long address, ByteBuffer container) {
        return new SDL_GPUColorTargetDescription(address, container);
    }

    public SDL_GPUColorTargetDescription(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUTextureFormat")
    public int format() {
        return nformat(address());
    }

    public SDL_GPUColorTargetBlendState blend_state() {
        return nblend_state(address());
    }

    public SDL_GPUColorTargetDescription format(@NativeType("SDL_GPUTextureFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public SDL_GPUColorTargetDescription blend_state(SDL_GPUColorTargetBlendState value) {
        nblend_state(address(), value);
        return this;
    }

    public SDL_GPUColorTargetDescription blend_state(Consumer<SDL_GPUColorTargetBlendState> consumer) {
        consumer.accept(blend_state());
        return this;
    }

    public SDL_GPUColorTargetDescription set(int format, SDL_GPUColorTargetBlendState blend_state) {
        format(format);
        blend_state(blend_state);
        return this;
    }

    public SDL_GPUColorTargetDescription set(SDL_GPUColorTargetDescription src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUColorTargetDescription malloc() {
        return new SDL_GPUColorTargetDescription(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUColorTargetDescription calloc() {
        return new SDL_GPUColorTargetDescription(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUColorTargetDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUColorTargetDescription(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUColorTargetDescription create(long address) {
        return new SDL_GPUColorTargetDescription(address, null);
    }

    public static SDL_GPUColorTargetDescription createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUColorTargetDescription(address, null);
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

    public static SDL_GPUColorTargetDescription malloc(MemoryStack stack) {
        return new SDL_GPUColorTargetDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUColorTargetDescription calloc(MemoryStack stack) {
        return new SDL_GPUColorTargetDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static SDL_GPUColorTargetBlendState nblend_state(long struct) {
        return SDL_GPUColorTargetBlendState.create(struct + BLEND_STATE);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void nblend_state(long struct, SDL_GPUColorTargetBlendState value) {
        MemoryUtil.memCopy(value.address(), struct + BLEND_STATE, SDL_GPUColorTargetBlendState.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUColorTargetDescription$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUColorTargetDescription, Buffer> implements NativeResource {
        private static final SDL_GPUColorTargetDescription ELEMENT_FACTORY = SDL_GPUColorTargetDescription.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUColorTargetDescription.SIZEOF);
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
        public SDL_GPUColorTargetDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUTextureFormat")
        public int format() {
            return SDL_GPUColorTargetDescription.nformat(address());
        }

        public SDL_GPUColorTargetBlendState blend_state() {
            return SDL_GPUColorTargetDescription.nblend_state(address());
        }

        public Buffer format(@NativeType("SDL_GPUTextureFormat") int value) {
            SDL_GPUColorTargetDescription.nformat(address(), value);
            return this;
        }

        public Buffer blend_state(SDL_GPUColorTargetBlendState value) {
            SDL_GPUColorTargetDescription.nblend_state(address(), value);
            return this;
        }

        public Buffer blend_state(Consumer<SDL_GPUColorTargetBlendState> consumer) {
            consumer.accept(blend_state());
            return this;
        }
    }
}
