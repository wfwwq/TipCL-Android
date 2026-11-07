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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Locale.class */
public class SDL_Locale extends Struct<SDL_Locale> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LANGUAGE;
    public static final int COUNTRY;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LANGUAGE = layout.offsetof(0);
        COUNTRY = layout.offsetof(1);
    }

    protected SDL_Locale(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_Locale create(long address, ByteBuffer container) {
        return new SDL_Locale(address, container);
    }

    public SDL_Locale(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char const *")
    public ByteBuffer language() {
        return nlanguage(address());
    }

    @NativeType("char const *")
    public String languageString() {
        return nlanguageString(address());
    }

    @NativeType("char const *")
    public ByteBuffer country() {
        return ncountry(address());
    }

    @NativeType("char const *")
    public String countryString() {
        return ncountryString(address());
    }

    public SDL_Locale language(@NativeType("char const *") ByteBuffer value) {
        nlanguage(address(), value);
        return this;
    }

    public SDL_Locale country(@NativeType("char const *") ByteBuffer value) {
        ncountry(address(), value);
        return this;
    }

    public SDL_Locale set(ByteBuffer language, ByteBuffer country) {
        language(language);
        country(country);
        return this;
    }

    public SDL_Locale set(SDL_Locale src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_Locale malloc() {
        return new SDL_Locale(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_Locale calloc() {
        return new SDL_Locale(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_Locale create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Locale(MemoryUtil.memAddress(container), container);
    }

    public static SDL_Locale create(long address) {
        return new SDL_Locale(address, null);
    }

    public static SDL_Locale createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_Locale(address, null);
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

    public static SDL_Locale malloc(MemoryStack stack) {
        return new SDL_Locale(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_Locale calloc(MemoryStack stack) {
        return new SDL_Locale(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nlanguage(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + LANGUAGE));
    }

    public static String nlanguageString(long struct) {
        return MemoryUtil.memASCII(MemoryUtil.memGetAddress(struct + LANGUAGE));
    }

    public static ByteBuffer ncountry(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + COUNTRY));
    }

    public static String ncountryString(long struct) {
        return MemoryUtil.memASCIISafe(MemoryUtil.memGetAddress(struct + COUNTRY));
    }

    public static void nlanguage(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + LANGUAGE, MemoryUtil.memAddress(value));
    }

    public static void ncountry(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + COUNTRY, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + LANGUAGE));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Locale$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_Locale, Buffer> implements NativeResource {
        private static final SDL_Locale ELEMENT_FACTORY = SDL_Locale.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_Locale.SIZEOF);
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
        public SDL_Locale getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char const *")
        public ByteBuffer language() {
            return SDL_Locale.nlanguage(address());
        }

        @NativeType("char const *")
        public String languageString() {
            return SDL_Locale.nlanguageString(address());
        }

        @NativeType("char const *")
        public ByteBuffer country() {
            return SDL_Locale.ncountry(address());
        }

        @NativeType("char const *")
        public String countryString() {
            return SDL_Locale.ncountryString(address());
        }

        public Buffer language(@NativeType("char const *") ByteBuffer value) {
            SDL_Locale.nlanguage(address(), value);
            return this;
        }

        public Buffer country(@NativeType("char const *") ByteBuffer value) {
            SDL_Locale.ncountry(address(), value);
            return this;
        }
    }
}
