package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.sdl.SDL_Color;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Palette.class */
public class SDL_Palette extends Struct<SDL_Palette> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NCOLORS;
    public static final int COLORS;
    public static final int VERSION;
    public static final int REFCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NCOLORS = layout.offsetof(0);
        COLORS = layout.offsetof(1);
        VERSION = layout.offsetof(2);
        REFCOUNT = layout.offsetof(3);
    }

    protected SDL_Palette(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_Palette create(long address, ByteBuffer container) {
        return new SDL_Palette(address, container);
    }

    public SDL_Palette(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int ncolors() {
        return nncolors(address());
    }

    @NativeType("SDL_Color *")
    public SDL_Color.Buffer colors() {
        return ncolors(address());
    }

    public static SDL_Palette malloc() {
        return new SDL_Palette(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_Palette calloc() {
        return new SDL_Palette(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_Palette create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Palette(MemoryUtil.memAddress(container), container);
    }

    public static SDL_Palette create(long address) {
        return new SDL_Palette(address, null);
    }

    public static SDL_Palette createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_Palette(address, null);
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

    public static SDL_Palette malloc(MemoryStack stack) {
        return new SDL_Palette(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_Palette calloc(MemoryStack stack) {
        return new SDL_Palette(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nncolors(long struct) {
        return MemoryUtil.memGetInt(struct + NCOLORS);
    }

    public static SDL_Color.Buffer ncolors(long struct) {
        return SDL_Color.create(MemoryUtil.memGetAddress(struct + COLORS), nncolors(struct));
    }

    public static int nversion(long struct) {
        return MemoryUtil.memGetInt(struct + VERSION);
    }

    public static int nrefcount(long struct) {
        return MemoryUtil.memGetInt(struct + REFCOUNT);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Palette$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_Palette, Buffer> implements NativeResource {
        private static final SDL_Palette ELEMENT_FACTORY = SDL_Palette.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_Palette.SIZEOF);
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
        public SDL_Palette getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int ncolors() {
            return SDL_Palette.nncolors(address());
        }

        @NativeType("SDL_Color *")
        public SDL_Color.Buffer colors() {
            return SDL_Palette.ncolors(address());
        }
    }
}
