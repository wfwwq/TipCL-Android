package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_SensorEvent.class */
public class SDL_SensorEvent extends Struct<SDL_SensorEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int RESERVED;
    public static final int TIMESTAMP;
    public static final int WHICH;
    public static final int DATA;
    public static final int SENSOR_TIMESTAMP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(4), __array(4, 6), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
        DATA = layout.offsetof(4);
        SENSOR_TIMESTAMP = layout.offsetof(5);
    }

    protected SDL_SensorEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_SensorEvent create(long address, ByteBuffer container) {
        return new SDL_SensorEvent(address, container);
    }

    public SDL_SensorEvent(ByteBuffer container) {
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

    @NativeType("SDL_SensorID")
    public int which() {
        return nwhich(address());
    }

    @NativeType("float[6]")
    public FloatBuffer data() {
        return ndata(address());
    }

    public float data(int index) {
        return ndata(address(), index);
    }

    @NativeType("Uint64")
    public long sensor_timestamp() {
        return nsensor_timestamp(address());
    }

    public SDL_SensorEvent type(@NativeType("SDL_EventType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_SensorEvent timestamp(@NativeType("Uint64") long value) {
        ntimestamp(address(), value);
        return this;
    }

    public SDL_SensorEvent which(@NativeType("SDL_SensorID") int value) {
        nwhich(address(), value);
        return this;
    }

    public SDL_SensorEvent data(@NativeType("float[6]") FloatBuffer value) {
        ndata(address(), value);
        return this;
    }

    public SDL_SensorEvent data(int index, float value) {
        ndata(address(), index, value);
        return this;
    }

    public SDL_SensorEvent sensor_timestamp(@NativeType("Uint64") long value) {
        nsensor_timestamp(address(), value);
        return this;
    }

    public SDL_SensorEvent set(int type, long timestamp, int which, FloatBuffer data, long sensor_timestamp) {
        type(type);
        timestamp(timestamp);
        which(which);
        data(data);
        sensor_timestamp(sensor_timestamp);
        return this;
    }

    public SDL_SensorEvent set(SDL_SensorEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_SensorEvent malloc() {
        return new SDL_SensorEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_SensorEvent calloc() {
        return new SDL_SensorEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_SensorEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_SensorEvent(MemoryUtil.memAddress(container), container);
    }

    public static SDL_SensorEvent create(long address) {
        return new SDL_SensorEvent(address, null);
    }

    public static SDL_SensorEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_SensorEvent(address, null);
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

    public static SDL_SensorEvent malloc(MemoryStack stack) {
        return new SDL_SensorEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_SensorEvent calloc(MemoryStack stack) {
        return new SDL_SensorEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nwhich(long struct) {
        return MemoryUtil.memGetInt(struct + WHICH);
    }

    public static FloatBuffer ndata(long struct) {
        return MemoryUtil.memFloatBuffer(struct + DATA, 6);
    }

    public static float ndata(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + DATA + (Checks.check(index, 6) * 4));
    }

    public static long nsensor_timestamp(long struct) {
        return MemoryUtil.memGetLong(struct + SENSOR_TIMESTAMP);
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

    public static void nwhich(long struct, int value) {
        MemoryUtil.memPutInt(struct + WHICH, value);
    }

    public static void ndata(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 6);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DATA, value.remaining() * 4);
    }

    public static void ndata(long struct, int index, float value) {
        MemoryUtil.memPutFloat(struct + DATA + (Checks.check(index, 6) * 4), value);
    }

    public static void nsensor_timestamp(long struct, long value) {
        MemoryUtil.memPutLong(struct + SENSOR_TIMESTAMP, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_SensorEvent$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_SensorEvent, Buffer> implements NativeResource {
        private static final SDL_SensorEvent ELEMENT_FACTORY = SDL_SensorEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_SensorEvent.SIZEOF);
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
        public SDL_SensorEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_EventType")
        public int type() {
            return SDL_SensorEvent.ntype(address());
        }

        @NativeType("Uint64")
        public long timestamp() {
            return SDL_SensorEvent.ntimestamp(address());
        }

        @NativeType("SDL_SensorID")
        public int which() {
            return SDL_SensorEvent.nwhich(address());
        }

        @NativeType("float[6]")
        public FloatBuffer data() {
            return SDL_SensorEvent.ndata(address());
        }

        public float data(int index) {
            return SDL_SensorEvent.ndata(address(), index);
        }

        @NativeType("Uint64")
        public long sensor_timestamp() {
            return SDL_SensorEvent.nsensor_timestamp(address());
        }

        public Buffer type(@NativeType("SDL_EventType") int value) {
            SDL_SensorEvent.ntype(address(), value);
            return this;
        }

        public Buffer timestamp(@NativeType("Uint64") long value) {
            SDL_SensorEvent.ntimestamp(address(), value);
            return this;
        }

        public Buffer which(@NativeType("SDL_SensorID") int value) {
            SDL_SensorEvent.nwhich(address(), value);
            return this;
        }

        public Buffer data(@NativeType("float[6]") FloatBuffer value) {
            SDL_SensorEvent.ndata(address(), value);
            return this;
        }

        public Buffer data(int index, float value) {
            SDL_SensorEvent.ndata(address(), index, value);
            return this;
        }

        public Buffer sensor_timestamp(@NativeType("Uint64") long value) {
            SDL_SensorEvent.nsensor_timestamp(address(), value);
            return this;
        }
    }
}
