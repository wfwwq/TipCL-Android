package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.sdl.SDL_MessageBoxButtonData;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MessageBoxData.class */
public class SDL_MessageBoxData extends Struct<SDL_MessageBoxData> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int WINDOW;
    public static final int TITLE;
    public static final int MESSAGE;
    public static final int NUMBUTTONS;
    public static final int BUTTONS;
    public static final int COLORSCHEME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        WINDOW = layout.offsetof(1);
        TITLE = layout.offsetof(2);
        MESSAGE = layout.offsetof(3);
        NUMBUTTONS = layout.offsetof(4);
        BUTTONS = layout.offsetof(5);
        COLORSCHEME = layout.offsetof(6);
    }

    protected SDL_MessageBoxData(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_MessageBoxData create(long address, ByteBuffer container) {
        return new SDL_MessageBoxData(address, container);
    }

    public SDL_MessageBoxData(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_MessageBoxFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("SDL_Window *")
    public long window() {
        return nwindow(address());
    }

    @NativeType("char const *")
    public ByteBuffer title() {
        return ntitle(address());
    }

    @NativeType("char const *")
    public String titleString() {
        return ntitleString(address());
    }

    @NativeType("char const *")
    public ByteBuffer message() {
        return nmessage(address());
    }

    @NativeType("char const *")
    public String messageString() {
        return nmessageString(address());
    }

    public int numbuttons() {
        return nnumbuttons(address());
    }

    @NativeType("SDL_MessageBoxButtonData const *")
    public SDL_MessageBoxButtonData.Buffer buttons() {
        return nbuttons(address());
    }

    @NativeType("SDL_MessageBoxColorScheme const *")
    public SDL_MessageBoxColorScheme colorScheme() {
        return ncolorScheme(address());
    }

    public SDL_MessageBoxData flags(@NativeType("SDL_MessageBoxFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public SDL_MessageBoxData window(@NativeType("SDL_Window *") long value) {
        nwindow(address(), value);
        return this;
    }

    public SDL_MessageBoxData title(@NativeType("char const *") ByteBuffer value) {
        ntitle(address(), value);
        return this;
    }

    public SDL_MessageBoxData message(@NativeType("char const *") ByteBuffer value) {
        nmessage(address(), value);
        return this;
    }

    public SDL_MessageBoxData buttons(@NativeType("SDL_MessageBoxButtonData const *") SDL_MessageBoxButtonData.Buffer value) {
        nbuttons(address(), value);
        return this;
    }

    public SDL_MessageBoxData colorScheme(@NativeType("SDL_MessageBoxColorScheme const *") SDL_MessageBoxColorScheme value) {
        ncolorScheme(address(), value);
        return this;
    }

    public SDL_MessageBoxData set(int flags, long window, ByteBuffer title, ByteBuffer message, SDL_MessageBoxButtonData.Buffer buttons, SDL_MessageBoxColorScheme colorScheme) {
        flags(flags);
        window(window);
        title(title);
        message(message);
        buttons(buttons);
        colorScheme(colorScheme);
        return this;
    }

    public SDL_MessageBoxData set(SDL_MessageBoxData src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_MessageBoxData malloc() {
        return new SDL_MessageBoxData(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_MessageBoxData calloc() {
        return new SDL_MessageBoxData(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_MessageBoxData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MessageBoxData(MemoryUtil.memAddress(container), container);
    }

    public static SDL_MessageBoxData create(long address) {
        return new SDL_MessageBoxData(address, null);
    }

    public static SDL_MessageBoxData createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_MessageBoxData(address, null);
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

    public static SDL_MessageBoxData malloc(MemoryStack stack) {
        return new SDL_MessageBoxData(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_MessageBoxData calloc(MemoryStack stack) {
        return new SDL_MessageBoxData(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nwindow(long struct) {
        return MemoryUtil.memGetAddress(struct + WINDOW);
    }

    public static ByteBuffer ntitle(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + TITLE));
    }

    public static String ntitleString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + TITLE));
    }

    public static ByteBuffer nmessage(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + MESSAGE));
    }

    public static String nmessageString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + MESSAGE));
    }

    public static int nnumbuttons(long struct) {
        return MemoryUtil.memGetInt(struct + NUMBUTTONS);
    }

    public static SDL_MessageBoxButtonData.Buffer nbuttons(long struct) {
        return SDL_MessageBoxButtonData.create(MemoryUtil.memGetAddress(struct + BUTTONS), nnumbuttons(struct));
    }

    public static SDL_MessageBoxColorScheme ncolorScheme(long struct) {
        return SDL_MessageBoxColorScheme.createSafe(MemoryUtil.memGetAddress(struct + COLORSCHEME));
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nwindow(long struct, long value) {
        MemoryUtil.memPutAddress(struct + WINDOW, value);
    }

    public static void ntitle(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + TITLE, MemoryUtil.memAddress(value));
    }

    public static void nmessage(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + MESSAGE, MemoryUtil.memAddress(value));
    }

    public static void nnumbuttons(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUMBUTTONS, value);
    }

    public static void nbuttons(long struct, SDL_MessageBoxButtonData.Buffer value) {
        MemoryUtil.memPutAddress(struct + BUTTONS, value.address());
        nnumbuttons(struct, value.remaining());
    }

    public static void ncolorScheme(long struct, SDL_MessageBoxColorScheme value) {
        MemoryUtil.memPutAddress(struct + COLORSCHEME, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + TITLE));
        Checks.check(MemoryUtil.memGetAddress(struct + MESSAGE));
        int numbuttons = nnumbuttons(struct);
        long buttons = MemoryUtil.memGetAddress(struct + BUTTONS);
        Checks.check(buttons);
        validate(buttons, numbuttons, SDL_MessageBoxButtonData.SIZEOF, SDL_MessageBoxButtonData::validate);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MessageBoxData$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_MessageBoxData, Buffer> implements NativeResource {
        private static final SDL_MessageBoxData ELEMENT_FACTORY = SDL_MessageBoxData.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_MessageBoxData.SIZEOF);
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
        public SDL_MessageBoxData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_MessageBoxFlags")
        public int flags() {
            return SDL_MessageBoxData.nflags(address());
        }

        @NativeType("SDL_Window *")
        public long window() {
            return SDL_MessageBoxData.nwindow(address());
        }

        @NativeType("char const *")
        public ByteBuffer title() {
            return SDL_MessageBoxData.ntitle(address());
        }

        @NativeType("char const *")
        public String titleString() {
            return SDL_MessageBoxData.ntitleString(address());
        }

        @NativeType("char const *")
        public ByteBuffer message() {
            return SDL_MessageBoxData.nmessage(address());
        }

        @NativeType("char const *")
        public String messageString() {
            return SDL_MessageBoxData.nmessageString(address());
        }

        public int numbuttons() {
            return SDL_MessageBoxData.nnumbuttons(address());
        }

        @NativeType("SDL_MessageBoxButtonData const *")
        public SDL_MessageBoxButtonData.Buffer buttons() {
            return SDL_MessageBoxData.nbuttons(address());
        }

        @NativeType("SDL_MessageBoxColorScheme const *")
        public SDL_MessageBoxColorScheme colorScheme() {
            return SDL_MessageBoxData.ncolorScheme(address());
        }

        public Buffer flags(@NativeType("SDL_MessageBoxFlags") int value) {
            SDL_MessageBoxData.nflags(address(), value);
            return this;
        }

        public Buffer window(@NativeType("SDL_Window *") long value) {
            SDL_MessageBoxData.nwindow(address(), value);
            return this;
        }

        public Buffer title(@NativeType("char const *") ByteBuffer value) {
            SDL_MessageBoxData.ntitle(address(), value);
            return this;
        }

        public Buffer message(@NativeType("char const *") ByteBuffer value) {
            SDL_MessageBoxData.nmessage(address(), value);
            return this;
        }

        public Buffer buttons(@NativeType("SDL_MessageBoxButtonData const *") SDL_MessageBoxButtonData.Buffer value) {
            SDL_MessageBoxData.nbuttons(address(), value);
            return this;
        }

        public Buffer colorScheme(@NativeType("SDL_MessageBoxColorScheme const *") SDL_MessageBoxColorScheme value) {
            SDL_MessageBoxData.ncolorScheme(address(), value);
            return this;
        }
    }
}
