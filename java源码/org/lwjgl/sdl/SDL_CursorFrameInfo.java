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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CursorFrameInfo.class */
public class SDL_CursorFrameInfo extends Struct<SDL_CursorFrameInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SURFACE;
    public static final int DURATION;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SURFACE = layout.offsetof(0);
        DURATION = layout.offsetof(1);
    }

    protected SDL_CursorFrameInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_CursorFrameInfo create(long address, ByteBuffer container) {
        return new SDL_CursorFrameInfo(address, container);
    }

    public SDL_CursorFrameInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_Surface *")
    public SDL_Surface surface() {
        return nsurface(address());
    }

    @NativeType("Uint32")
    public int duration() {
        return nduration(address());
    }

    public SDL_CursorFrameInfo surface(@NativeType("SDL_Surface *") SDL_Surface value) {
        nsurface(address(), value);
        return this;
    }

    public SDL_CursorFrameInfo duration(@NativeType("Uint32") int value) {
        nduration(address(), value);
        return this;
    }

    public SDL_CursorFrameInfo set(SDL_Surface surface, int duration) {
        surface(surface);
        duration(duration);
        return this;
    }

    public SDL_CursorFrameInfo set(SDL_CursorFrameInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_CursorFrameInfo malloc() {
        return new SDL_CursorFrameInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_CursorFrameInfo calloc() {
        return new SDL_CursorFrameInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_CursorFrameInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_CursorFrameInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_CursorFrameInfo create(long address) {
        return new SDL_CursorFrameInfo(address, null);
    }

    public static SDL_CursorFrameInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_CursorFrameInfo(address, null);
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

    public static SDL_CursorFrameInfo malloc(MemoryStack stack) {
        return new SDL_CursorFrameInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_CursorFrameInfo calloc(MemoryStack stack) {
        return new SDL_CursorFrameInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static SDL_Surface nsurface(long struct) {
        return SDL_Surface.create(MemoryUtil.memGetAddress(struct + SURFACE));
    }

    public static int nduration(long struct) {
        return MemoryUtil.memGetInt(struct + DURATION);
    }

    public static void nsurface(long struct, SDL_Surface value) {
        MemoryUtil.memPutAddress(struct + SURFACE, value.address());
    }

    public static void nduration(long struct, int value) {
        MemoryUtil.memPutInt(struct + DURATION, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + SURFACE));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_CursorFrameInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_CursorFrameInfo, Buffer> implements NativeResource {
        private static final SDL_CursorFrameInfo ELEMENT_FACTORY = SDL_CursorFrameInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_CursorFrameInfo.SIZEOF);
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
        public SDL_CursorFrameInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_Surface *")
        public SDL_Surface surface() {
            return SDL_CursorFrameInfo.nsurface(address());
        }

        @NativeType("Uint32")
        public int duration() {
            return SDL_CursorFrameInfo.nduration(address());
        }

        public Buffer surface(@NativeType("SDL_Surface *") SDL_Surface value) {
            SDL_CursorFrameInfo.nsurface(address(), value);
            return this;
        }

        public Buffer duration(@NativeType("Uint32") int value) {
            SDL_CursorFrameInfo.nduration(address(), value);
            return this;
        }
    }
}
