package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AudioSpec.class */
public class SDL_AudioSpec extends Struct<SDL_AudioSpec> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FORMAT;
    public static final int CHANNELS;
    public static final int FREQ;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FORMAT = layout.offsetof(0);
        CHANNELS = layout.offsetof(1);
        FREQ = layout.offsetof(2);
    }

    protected SDL_AudioSpec(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_AudioSpec create(long address, ByteBuffer container) {
        return new SDL_AudioSpec(address, container);
    }

    public SDL_AudioSpec(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_AudioFormat")
    public int format() {
        return nformat(address());
    }

    public int channels() {
        return nchannels(address());
    }

    public int freq() {
        return nfreq(address());
    }

    public SDL_AudioSpec format(@NativeType("SDL_AudioFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public SDL_AudioSpec channels(int value) {
        nchannels(address(), value);
        return this;
    }

    public SDL_AudioSpec freq(int value) {
        nfreq(address(), value);
        return this;
    }

    public SDL_AudioSpec set(int format, int channels, int freq) {
        format(format);
        channels(channels);
        freq(freq);
        return this;
    }

    public SDL_AudioSpec set(SDL_AudioSpec src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_AudioSpec malloc() {
        return new SDL_AudioSpec(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_AudioSpec calloc() {
        return new SDL_AudioSpec(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_AudioSpec create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_AudioSpec(MemoryUtil.memAddress(container), container);
    }

    public static SDL_AudioSpec create(long address) {
        return new SDL_AudioSpec(address, null);
    }

    public static SDL_AudioSpec createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_AudioSpec(address, null);
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

    public static SDL_AudioSpec malloc(MemoryStack stack) {
        return new SDL_AudioSpec(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_AudioSpec calloc(MemoryStack stack) {
        return new SDL_AudioSpec(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nchannels(long struct) {
        return MemoryUtil.memGetInt(struct + CHANNELS);
    }

    public static int nfreq(long struct) {
        return MemoryUtil.memGetInt(struct + FREQ);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void nchannels(long struct, int value) {
        MemoryUtil.memPutInt(struct + CHANNELS, value);
    }

    public static void nfreq(long struct, int value) {
        MemoryUtil.memPutInt(struct + FREQ, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_AudioSpec$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_AudioSpec, Buffer> implements NativeResource {
        private static final SDL_AudioSpec ELEMENT_FACTORY = SDL_AudioSpec.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_AudioSpec.SIZEOF);
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
        public SDL_AudioSpec getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_AudioFormat")
        public int format() {
            return SDL_AudioSpec.nformat(address());
        }

        public int channels() {
            return SDL_AudioSpec.nchannels(address());
        }

        public int freq() {
            return SDL_AudioSpec.nfreq(address());
        }

        public Buffer format(@NativeType("SDL_AudioFormat") int value) {
            SDL_AudioSpec.nformat(address(), value);
            return this;
        }

        public Buffer channels(int value) {
            SDL_AudioSpec.nchannels(address(), value);
            return this;
        }

        public Buffer freq(int value) {
            SDL_AudioSpec.nfreq(address(), value);
            return this;
        }
    }
}
