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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MessageBoxButtonData.class */
public class SDL_MessageBoxButtonData extends Struct<SDL_MessageBoxButtonData> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int BUTTONID;
    public static final int TEXT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        BUTTONID = layout.offsetof(1);
        TEXT = layout.offsetof(2);
    }

    protected SDL_MessageBoxButtonData(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_MessageBoxButtonData create(long address, ByteBuffer container) {
        return new SDL_MessageBoxButtonData(address, container);
    }

    public SDL_MessageBoxButtonData(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_MessageBoxButtonFlags")
    public int flags() {
        return nflags(address());
    }

    public int buttonID() {
        return nbuttonID(address());
    }

    @NativeType("char const *")
    public ByteBuffer text() {
        return ntext(address());
    }

    @NativeType("char const *")
    public String textString() {
        return ntextString(address());
    }

    public SDL_MessageBoxButtonData flags(@NativeType("SDL_MessageBoxButtonFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public SDL_MessageBoxButtonData buttonID(int value) {
        nbuttonID(address(), value);
        return this;
    }

    public SDL_MessageBoxButtonData text(@NativeType("char const *") ByteBuffer value) {
        ntext(address(), value);
        return this;
    }

    public SDL_MessageBoxButtonData set(int flags, int buttonID, ByteBuffer text) {
        flags(flags);
        buttonID(buttonID);
        text(text);
        return this;
    }

    public SDL_MessageBoxButtonData set(SDL_MessageBoxButtonData src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_MessageBoxButtonData malloc() {
        return new SDL_MessageBoxButtonData(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_MessageBoxButtonData calloc() {
        return new SDL_MessageBoxButtonData(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_MessageBoxButtonData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MessageBoxButtonData(MemoryUtil.memAddress(container), container);
    }

    public static SDL_MessageBoxButtonData create(long address) {
        return new SDL_MessageBoxButtonData(address, null);
    }

    public static SDL_MessageBoxButtonData createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_MessageBoxButtonData(address, null);
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

    public static SDL_MessageBoxButtonData malloc(MemoryStack stack) {
        return new SDL_MessageBoxButtonData(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_MessageBoxButtonData calloc(MemoryStack stack) {
        return new SDL_MessageBoxButtonData(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nbuttonID(long struct) {
        return MemoryUtil.memGetInt(struct + BUTTONID);
    }

    public static ByteBuffer ntext(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + TEXT));
    }

    public static String ntextString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + TEXT));
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nbuttonID(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUTTONID, value);
    }

    public static void ntext(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + TEXT, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + TEXT));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MessageBoxButtonData$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_MessageBoxButtonData, Buffer> implements NativeResource {
        private static final SDL_MessageBoxButtonData ELEMENT_FACTORY = SDL_MessageBoxButtonData.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_MessageBoxButtonData.SIZEOF);
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
        public SDL_MessageBoxButtonData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_MessageBoxButtonFlags")
        public int flags() {
            return SDL_MessageBoxButtonData.nflags(address());
        }

        public int buttonID() {
            return SDL_MessageBoxButtonData.nbuttonID(address());
        }

        @NativeType("char const *")
        public ByteBuffer text() {
            return SDL_MessageBoxButtonData.ntext(address());
        }

        @NativeType("char const *")
        public String textString() {
            return SDL_MessageBoxButtonData.ntextString(address());
        }

        public Buffer flags(@NativeType("SDL_MessageBoxButtonFlags") int value) {
            SDL_MessageBoxButtonData.nflags(address(), value);
            return this;
        }

        public Buffer buttonID(int value) {
            SDL_MessageBoxButtonData.nbuttonID(address(), value);
            return this;
        }

        public Buffer text(@NativeType("char const *") ByteBuffer value) {
            SDL_MessageBoxButtonData.ntext(address(), value);
            return this;
        }
    }
}
