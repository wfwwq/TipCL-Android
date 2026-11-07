package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickTouchpadDesc.class */
public class SDL_VirtualJoystickTouchpadDesc extends Struct<SDL_VirtualJoystickTouchpadDesc> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NFINGERS;
    public static final int PADDING;

    static {
        Struct.Layout layout = __struct(__member(2), __array(2, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NFINGERS = layout.offsetof(0);
        PADDING = layout.offsetof(1);
    }

    protected SDL_VirtualJoystickTouchpadDesc(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_VirtualJoystickTouchpadDesc create(long address, ByteBuffer container) {
        return new SDL_VirtualJoystickTouchpadDesc(address, container);
    }

    public SDL_VirtualJoystickTouchpadDesc(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint16")
    public short nfingers() {
        return nnfingers(address());
    }

    public SDL_VirtualJoystickTouchpadDesc nfingers(@NativeType("Uint16") short value) {
        nnfingers(address(), value);
        return this;
    }

    public SDL_VirtualJoystickTouchpadDesc set(SDL_VirtualJoystickTouchpadDesc src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_VirtualJoystickTouchpadDesc malloc() {
        return new SDL_VirtualJoystickTouchpadDesc(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_VirtualJoystickTouchpadDesc calloc() {
        return new SDL_VirtualJoystickTouchpadDesc(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_VirtualJoystickTouchpadDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_VirtualJoystickTouchpadDesc(MemoryUtil.memAddress(container), container);
    }

    public static SDL_VirtualJoystickTouchpadDesc create(long address) {
        return new SDL_VirtualJoystickTouchpadDesc(address, null);
    }

    public static SDL_VirtualJoystickTouchpadDesc createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_VirtualJoystickTouchpadDesc(address, null);
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

    public static SDL_VirtualJoystickTouchpadDesc malloc(MemoryStack stack) {
        return new SDL_VirtualJoystickTouchpadDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_VirtualJoystickTouchpadDesc calloc(MemoryStack stack) {
        return new SDL_VirtualJoystickTouchpadDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nnfingers(long struct) {
        return MemoryUtil.memGetShort(struct + NFINGERS);
    }

    public static ShortBuffer npadding(long struct) {
        return MemoryUtil.memShortBuffer(struct + PADDING, 3);
    }

    public static short npadding(long struct, int index) {
        return MemoryUtil.memGetShort(struct + PADDING + (Checks.check(index, 3) * 2));
    }

    public static void nnfingers(long struct, short value) {
        MemoryUtil.memPutShort(struct + NFINGERS, value);
    }

    public static void npadding(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PADDING, value.remaining() * 2);
    }

    public static void npadding(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + PADDING + (Checks.check(index, 3) * 2), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickTouchpadDesc$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_VirtualJoystickTouchpadDesc, Buffer> implements NativeResource {
        private static final SDL_VirtualJoystickTouchpadDesc ELEMENT_FACTORY = SDL_VirtualJoystickTouchpadDesc.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_VirtualJoystickTouchpadDesc.SIZEOF);
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
        public SDL_VirtualJoystickTouchpadDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint16")
        public short nfingers() {
            return SDL_VirtualJoystickTouchpadDesc.nnfingers(address());
        }

        public Buffer nfingers(@NativeType("Uint16") short value) {
            SDL_VirtualJoystickTouchpadDesc.nnfingers(address(), value);
            return this;
        }
    }
}
