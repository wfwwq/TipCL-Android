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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GUID.class */
public class SDL_GUID extends Struct<SDL_GUID> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__array(1, 16));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DATA = layout.offsetof(0);
    }

    protected SDL_GUID(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GUID create(long address, ByteBuffer container) {
        return new SDL_GUID(address, container);
    }

    public SDL_GUID(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint8[16]")
    public ByteBuffer data() {
        return ndata(address());
    }

    @NativeType("Uint8")
    public byte data(int index) {
        return ndata(address(), index);
    }

    public SDL_GUID data(@NativeType("Uint8[16]") ByteBuffer value) {
        ndata(address(), value);
        return this;
    }

    public SDL_GUID data(int index, @NativeType("Uint8") byte value) {
        ndata(address(), index, value);
        return this;
    }

    public SDL_GUID set(SDL_GUID src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GUID malloc() {
        return new SDL_GUID(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GUID calloc() {
        return new SDL_GUID(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GUID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GUID(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GUID create(long address) {
        return new SDL_GUID(address, null);
    }

    public static SDL_GUID createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GUID(address, null);
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

    public static SDL_GUID malloc(MemoryStack stack) {
        return new SDL_GUID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GUID calloc(MemoryStack stack) {
        return new SDL_GUID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer ndata(long struct) {
        return MemoryUtil.memByteBuffer(struct + DATA, 16);
    }

    public static byte ndata(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DATA + (Checks.check(index, 16) * 1));
    }

    public static void ndata(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 16);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DATA, value.remaining() * 1);
    }

    public static void ndata(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + DATA + (Checks.check(index, 16) * 1), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GUID$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GUID, Buffer> implements NativeResource {
        private static final SDL_GUID ELEMENT_FACTORY = SDL_GUID.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GUID.SIZEOF);
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
        public SDL_GUID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint8[16]")
        public ByteBuffer data() {
            return SDL_GUID.ndata(address());
        }

        @NativeType("Uint8")
        public byte data(int index) {
            return SDL_GUID.ndata(address(), index);
        }

        public Buffer data(@NativeType("Uint8[16]") ByteBuffer value) {
            SDL_GUID.ndata(address(), value);
            return this;
        }

        public Buffer data(int index, @NativeType("Uint8") byte value) {
            SDL_GUID.ndata(address(), index, value);
            return this;
        }
    }
}
