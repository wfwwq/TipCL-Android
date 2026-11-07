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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DialogFileFilter.class */
public class SDL_DialogFileFilter extends Struct<SDL_DialogFileFilter> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NAME;
    public static final int PATTERN;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NAME = layout.offsetof(0);
        PATTERN = layout.offsetof(1);
    }

    protected SDL_DialogFileFilter(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_DialogFileFilter create(long address, ByteBuffer container) {
        return new SDL_DialogFileFilter(address, container);
    }

    public SDL_DialogFileFilter(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char const *")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char const *")
    public String nameString() {
        return nnameString(address());
    }

    @NativeType("char const *")
    public ByteBuffer pattern() {
        return npattern(address());
    }

    @NativeType("char const *")
    public String patternString() {
        return npatternString(address());
    }

    public SDL_DialogFileFilter name(@NativeType("char const *") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public SDL_DialogFileFilter pattern(@NativeType("char const *") ByteBuffer value) {
        npattern(address(), value);
        return this;
    }

    public SDL_DialogFileFilter set(ByteBuffer name, ByteBuffer pattern) {
        name(name);
        pattern(pattern);
        return this;
    }

    public SDL_DialogFileFilter set(SDL_DialogFileFilter src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_DialogFileFilter malloc() {
        return new SDL_DialogFileFilter(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_DialogFileFilter calloc() {
        return new SDL_DialogFileFilter(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_DialogFileFilter create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_DialogFileFilter(MemoryUtil.memAddress(container), container);
    }

    public static SDL_DialogFileFilter create(long address) {
        return new SDL_DialogFileFilter(address, null);
    }

    public static SDL_DialogFileFilter createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_DialogFileFilter(address, null);
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

    public static SDL_DialogFileFilter malloc(MemoryStack stack) {
        return new SDL_DialogFileFilter(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_DialogFileFilter calloc(MemoryStack stack) {
        return new SDL_DialogFileFilter(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static ByteBuffer npattern(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + PATTERN));
    }

    public static String npatternString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + PATTERN));
    }

    public static void nname(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + NAME, MemoryUtil.memAddress(value));
    }

    public static void npattern(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + PATTERN, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + NAME));
        Checks.check(MemoryUtil.memGetAddress(struct + PATTERN));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DialogFileFilter$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_DialogFileFilter, Buffer> implements NativeResource {
        private static final SDL_DialogFileFilter ELEMENT_FACTORY = SDL_DialogFileFilter.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_DialogFileFilter.SIZEOF);
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
        public SDL_DialogFileFilter getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char const *")
        public ByteBuffer name() {
            return SDL_DialogFileFilter.nname(address());
        }

        @NativeType("char const *")
        public String nameString() {
            return SDL_DialogFileFilter.nnameString(address());
        }

        @NativeType("char const *")
        public ByteBuffer pattern() {
            return SDL_DialogFileFilter.npattern(address());
        }

        @NativeType("char const *")
        public String patternString() {
            return SDL_DialogFileFilter.npatternString(address());
        }

        public Buffer name(@NativeType("char const *") ByteBuffer value) {
            SDL_DialogFileFilter.nname(address(), value);
            return this;
        }

        public Buffer pattern(@NativeType("char const *") ByteBuffer value) {
            SDL_DialogFileFilter.npattern(address(), value);
            return this;
        }
    }
}
