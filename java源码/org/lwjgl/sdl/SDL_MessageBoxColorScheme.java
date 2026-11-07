package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.sdl.SDL_MessageBoxColor;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MessageBoxColorScheme.class */
public class SDL_MessageBoxColorScheme extends Struct<SDL_MessageBoxColorScheme> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COLORS;

    static {
        Struct.Layout layout = __struct(__array(SDL_MessageBoxColor.SIZEOF, SDL_MessageBoxColor.ALIGNOF, 5));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COLORS = layout.offsetof(0);
    }

    protected SDL_MessageBoxColorScheme(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_MessageBoxColorScheme create(long address, ByteBuffer container) {
        return new SDL_MessageBoxColorScheme(address, container);
    }

    public SDL_MessageBoxColorScheme(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_MessageBoxColor[5]")
    public SDL_MessageBoxColor.Buffer colors() {
        return ncolors(address());
    }

    public SDL_MessageBoxColor colors(int index) {
        return ncolors(address(), index);
    }

    public SDL_MessageBoxColorScheme colors(@NativeType("SDL_MessageBoxColor[5]") SDL_MessageBoxColor.Buffer value) {
        ncolors(address(), value);
        return this;
    }

    public SDL_MessageBoxColorScheme colors(int index, SDL_MessageBoxColor value) {
        ncolors(address(), index, value);
        return this;
    }

    public SDL_MessageBoxColorScheme colors(Consumer<SDL_MessageBoxColor.Buffer> consumer) {
        consumer.accept(colors());
        return this;
    }

    public SDL_MessageBoxColorScheme colors(int index, Consumer<SDL_MessageBoxColor> consumer) {
        consumer.accept(colors(index));
        return this;
    }

    public SDL_MessageBoxColorScheme set(SDL_MessageBoxColorScheme src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_MessageBoxColorScheme malloc() {
        return new SDL_MessageBoxColorScheme(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_MessageBoxColorScheme calloc() {
        return new SDL_MessageBoxColorScheme(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_MessageBoxColorScheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MessageBoxColorScheme(MemoryUtil.memAddress(container), container);
    }

    public static SDL_MessageBoxColorScheme create(long address) {
        return new SDL_MessageBoxColorScheme(address, null);
    }

    public static SDL_MessageBoxColorScheme createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_MessageBoxColorScheme(address, null);
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

    public static SDL_MessageBoxColorScheme malloc(MemoryStack stack) {
        return new SDL_MessageBoxColorScheme(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_MessageBoxColorScheme calloc(MemoryStack stack) {
        return new SDL_MessageBoxColorScheme(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static SDL_MessageBoxColor.Buffer ncolors(long struct) {
        return SDL_MessageBoxColor.create(struct + COLORS, 5);
    }

    public static SDL_MessageBoxColor ncolors(long struct, int index) {
        return SDL_MessageBoxColor.create(struct + COLORS + (Checks.check(index, 5) * SDL_MessageBoxColor.SIZEOF));
    }

    public static void ncolors(long struct, SDL_MessageBoxColor.Buffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 5);
        }
        MemoryUtil.memCopy(value.address(), struct + COLORS, value.remaining() * SDL_MessageBoxColor.SIZEOF);
    }

    public static void ncolors(long struct, int index, SDL_MessageBoxColor value) {
        MemoryUtil.memCopy(value.address(), struct + COLORS + (Checks.check(index, 5) * SDL_MessageBoxColor.SIZEOF), SDL_MessageBoxColor.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MessageBoxColorScheme$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_MessageBoxColorScheme, Buffer> implements NativeResource {
        private static final SDL_MessageBoxColorScheme ELEMENT_FACTORY = SDL_MessageBoxColorScheme.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_MessageBoxColorScheme.SIZEOF);
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
        public SDL_MessageBoxColorScheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_MessageBoxColor[5]")
        public SDL_MessageBoxColor.Buffer colors() {
            return SDL_MessageBoxColorScheme.ncolors(address());
        }

        public SDL_MessageBoxColor colors(int index) {
            return SDL_MessageBoxColorScheme.ncolors(address(), index);
        }

        public Buffer colors(@NativeType("SDL_MessageBoxColor[5]") SDL_MessageBoxColor.Buffer value) {
            SDL_MessageBoxColorScheme.ncolors(address(), value);
            return this;
        }

        public Buffer colors(int index, SDL_MessageBoxColor value) {
            SDL_MessageBoxColorScheme.ncolors(address(), index, value);
            return this;
        }

        public Buffer colors(Consumer<SDL_MessageBoxColor.Buffer> consumer) {
            consumer.accept(colors());
            return this;
        }

        public Buffer colors(int index, Consumer<SDL_MessageBoxColor> consumer) {
            consumer.accept(colors(index));
            return this;
        }
    }
}
