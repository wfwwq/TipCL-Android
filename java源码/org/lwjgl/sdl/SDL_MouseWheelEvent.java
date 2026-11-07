package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MouseWheelEvent.class */
public class SDL_MouseWheelEvent extends Struct<SDL_MouseWheelEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WINDOWID;
    public static final int WHICH;
    public static final int X;
    public static final int Y;
    public static final int DIRECTION;
    public static final int MOUSE_X;
    public static final int MOUSE_Y;
    public static final int INTEGER_X;
    public static final int INTEGER_Y;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        WHICH = layout.offsetof(4);
        X = layout.offsetof(5);
        Y = layout.offsetof(6);
        DIRECTION = layout.offsetof(7);
        MOUSE_X = layout.offsetof(8);
        MOUSE_Y = layout.offsetof(9);
        INTEGER_X = layout.offsetof(10);
        INTEGER_Y = layout.offsetof(11);
    }

    protected SDL_MouseWheelEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_MouseWheelEvent create(long address, ByteBuffer container) {
        return new SDL_MouseWheelEvent(address, container);
    }

    public SDL_MouseWheelEvent(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_EventType")
    public int type() {
        return ntype(address());
    }

    @NativeType("Uint64")
    public long timestamp() {
        return ntimestamp(address());
    }

    @NativeType("SDL_WindowID")
    public int windowID() {
        return nwindowID(address());
    }

    @NativeType("SDL_MouseID")
    public int which() {
        return nwhich(address());
    }

    public float x() {
        return nx(address());
    }

    public float y() {
        return ny(address());
    }

    @NativeType("SDL_MouseWheelDirection")
    public int direction() {
        return ndirection(address());
    }

    public float mouse_x() {
        return nmouse_x(address());
    }

    public float mouse_y() {
        return nmouse_y(address());
    }

    @NativeType("Sint32")
    public int integer_x() {
        return ninteger_x(address());
    }

    @NativeType("Sint32")
    public int integer_y() {
        return ninteger_y(address());
    }

    public SDL_MouseWheelEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_MouseWheelEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_MouseWheelEvent windowID(@NativeType("SDL_WindowID") int value) {
        nwindowID(address(), value);
        return this;
    }

    public SDL_MouseWheelEvent which(@NativeType("SDL_MouseID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_MouseWheelEvent x(float value) {
        nx(address(), value);
        return this;
    }

    public SDL_MouseWheelEvent y(float value) {
        ny(address(), value);
        return this;
    }

    public SDL_MouseWheelEvent direction(@NativeType("SDL_MouseWheelDirection") int value) {
        ndirection(address(), value);
        return this;
    }

    public SDL_MouseWheelEvent mouse_x(float value) {
        nmouse_x(address(), value);
        return this;
    }

    public SDL_MouseWheelEvent mouse_y(float value) {
        nmouse_y(address(), value);
        return this;
    }

    public SDL_MouseWheelEvent integer_x(@NativeType("Sint32") int value) {
        ninteger_x(address(), value);
        return this;
    }

    public SDL_MouseWheelEvent integer_y(@NativeType("Sint32") int value) {
        ninteger_y(address(), value);
        return this;
    }

    public SDL_MouseWheelEvent set(int type, long timestamp, int windowID, int which, float x, float y, int direction, float mouse_x, float mouse_y, int integer_x, int integer_y) {
        type(type);
        timestamp(timestamp);
        windowID(windowID);
        which(which);
        x(x);
        y(y);
        direction(direction);
        mouse_x(mouse_x);
        mouse_y(mouse_y);
        integer_x(integer_x);
        integer_y(integer_y);
        return this;
    }

    public SDL_MouseWheelEvent set(SDL_MouseWheelEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_MouseWheelEvent malloc() {
        return new SDL_MouseWheelEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_MouseWheelEvent calloc() {
        return new SDL_MouseWheelEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_MouseWheelEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MouseWheelEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_MouseWheelEvent create(long address) {
        return new SDL_MouseWheelEvent(address, null);
    }

    public static SDL_MouseWheelEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_MouseWheelEvent(address, null);
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

    public static SDL_MouseWheelEvent malloc(MemoryStack stack) {
        return new SDL_MouseWheelEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_MouseWheelEvent calloc(MemoryStack stack) {
        return new SDL_MouseWheelEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nreserved(long struct) {
        return MemoryUtil.memGetInt(struct + RESERVED);
    }

    public static long ntimestamp(long struct) {
        return MemoryUtil.memGetLong(struct + TIMESTAMP);
    }

    public static int nwindowID(long struct) {
        return MemoryUtil.memGetInt(struct + WINDOWID);
    }

    public static int nwhich(long struct) {
        return MemoryUtil.memGetInt(struct + WHICH);
    }

    public static float nx(long struct) {
        return MemoryUtil.memGetFloat(struct + X);
    }

    public static float ny(long struct) {
        return MemoryUtil.memGetFloat(struct + Y);
    }

    public static int ndirection(long struct) {
        return MemoryUtil.memGetInt(struct + DIRECTION);
    }

    public static float nmouse_x(long struct) {
        return MemoryUtil.memGetFloat(struct + MOUSE_X);
    }

    public static float nmouse_y(long struct) {
        return MemoryUtil.memGetFloat(struct + MOUSE_Y);
    }

    public static int ninteger_x(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGER_X);
    }

    public static int ninteger_y(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGER_Y);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nreserved(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESERVED, value);
    }

    public static void ntimestamp(long struct, long value) {
        MemoryUtil.memPutLong(struct + TIMESTAMP, value);
    }

    public static void nwindowID(long struct, int value) {
        MemoryUtil.memPutInt(struct + WINDOWID, value);
    }

    public static void nwhich(long struct, int value) {
        MemoryUtil.memPutInt(struct + WHICH, value);
    }

    public static void nx(long struct, float value) {
        MemoryUtil.memPutFloat(struct + X, value);
    }

    public static void ny(long struct, float value) {
        MemoryUtil.memPutFloat(struct + Y, value);
    }

    public static void ndirection(long struct, int value) {
        MemoryUtil.memPutInt(struct + DIRECTION, value);
    }

    public static void nmouse_x(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MOUSE_X, value);
    }

    public static void nmouse_y(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MOUSE_Y, value);
    }

    public static void ninteger_x(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTEGER_X, value);
    }

    public static void ninteger_y(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTEGER_Y, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_MouseWheelEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_MouseWheelEvent, Buffer> implements NativeResource {
        private static final SDL_MouseWheelEvent ELEMENT_FACTORY = SDL_MouseWheelEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_MouseWheelEvent.SIZEOF);
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
        public SDL_MouseWheelEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_MouseWheelEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_MouseWheelEvent.ntimestamp(address());
        }

        @NativeType("SDL_WindowID")
        public int windowID() {
            return SDL_MouseWheelEvent.nwindowID(address());
        }

        @NativeType("SDL_MouseID")
        public int which() {
            return SDL_MouseWheelEvent.nwhich(address());
        }

        public float x() {
            return SDL_MouseWheelEvent.nx(address());
        }

        public float y() {
            return SDL_MouseWheelEvent.ny(address());
        }

        @NativeType("SDL_MouseWheelDirection")
        public int direction() {
            return SDL_MouseWheelEvent.ndirection(address());
        }

        public float mouse_x() {
            return SDL_MouseWheelEvent.nmouse_x(address());
        }

        public float mouse_y() {
            return SDL_MouseWheelEvent.nmouse_y(address());
        }

        @NativeType("Sint32")
        public int integer_x() {
            return SDL_MouseWheelEvent.ninteger_x(address());
        }

        @NativeType("Sint32")
        public int integer_y() {
            return SDL_MouseWheelEvent.ninteger_y(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_MouseWheelEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_MouseWheelEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer windowID(@NativeType("SDL_WindowID") int value) {
            SDL_MouseWheelEvent.nwindowID(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_MouseID") int value) {
            SDL_MouseWheelEvent.nwhich(address(), value);
            return this;
        }

        public Buffer x(float value) {
            SDL_MouseWheelEvent.nx(address(), value);
            return this;
        }

        public Buffer y(float value) {
            SDL_MouseWheelEvent.ny(address(), value);
            return this;
        }

        public Buffer direction(@NativeType("SDL_MouseWheelDirection") int value) {
            SDL_MouseWheelEvent.ndirection(address(), value);
            return this;
        }

        public Buffer mouse_x(float value) {
            SDL_MouseWheelEvent.nmouse_x(address(), value);
            return this;
        }

        public Buffer mouse_y(float value) {
            SDL_MouseWheelEvent.nmouse_y(address(), value);
            return this;
        }

        public Buffer integer_x(@NativeType("Sint32") int value) {
            SDL_MouseWheelEvent.ninteger_x(address(), value);
            return this;
        }

        public Buffer integer_y(@NativeType("Sint32") int value) {
            SDL_MouseWheelEvent.ninteger_y(address(), value);
            return this;
        }
    }
}
