package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickSensorDesc.class */
public class SDL_VirtualJoystickSensorDesc extends Struct<SDL_VirtualJoystickSensorDesc> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RATE = layout.offsetof(1);
    }

    protected SDL_VirtualJoystickSensorDesc(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_VirtualJoystickSensorDesc create(long address, ByteBuffer container) {
        return new SDL_VirtualJoystickSensorDesc(address, container);
    }

    public SDL_VirtualJoystickSensorDesc(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_SensorType")
    public int type() {
        return ntype(address());
    }

    public float rate() {
        return nrate(address());
    }

    public SDL_VirtualJoystickSensorDesc type(@NativeType("SDL_SensorType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_VirtualJoystickSensorDesc rate(float value) {
        nrate(address(), value);
        return this;
    }

    public SDL_VirtualJoystickSensorDesc set(int type, float rate) {
        type(type);
        rate(rate);
        return this;
    }

    public SDL_VirtualJoystickSensorDesc set(SDL_VirtualJoystickSensorDesc src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_VirtualJoystickSensorDesc malloc() {
        return new SDL_VirtualJoystickSensorDesc(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_VirtualJoystickSensorDesc calloc() {
        return new SDL_VirtualJoystickSensorDesc(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_VirtualJoystickSensorDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_VirtualJoystickSensorDesc(MemoryUtil.memAddress(container), container);
    }

    public static SDL_VirtualJoystickSensorDesc create(long address) {
        return new SDL_VirtualJoystickSensorDesc(address, null);
    }

    public static SDL_VirtualJoystickSensorDesc createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_VirtualJoystickSensorDesc(address, null);
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

    public static SDL_VirtualJoystickSensorDesc malloc(MemoryStack stack) {
        return new SDL_VirtualJoystickSensorDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_VirtualJoystickSensorDesc calloc(MemoryStack stack) {
        return new SDL_VirtualJoystickSensorDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static float nrate(long struct) {
        return MemoryUtil.memGetFloat(struct + RATE);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nrate(long struct, float value) {
        MemoryUtil.memPutFloat(struct + RATE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickSensorDesc$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_VirtualJoystickSensorDesc, Buffer> implements NativeResource {
        private static final SDL_VirtualJoystickSensorDesc ELEMENT_FACTORY = SDL_VirtualJoystickSensorDesc.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_VirtualJoystickSensorDesc.SIZEOF);
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
        public SDL_VirtualJoystickSensorDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_SensorType")
        public int type() {
            return SDL_VirtualJoystickSensorDesc.ntype(address());
        }

        public float rate() {
            return SDL_VirtualJoystickSensorDesc.nrate(address());
        }

        public Buffer type(@NativeType("SDL_SensorType") int value) {
            SDL_VirtualJoystickSensorDesc.ntype(address(), value);
            return this;
        }

        public Buffer rate(float value) {
            SDL_VirtualJoystickSensorDesc.nrate(address(), value);
            return this;
        }
    }
}
