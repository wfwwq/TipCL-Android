package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUVertexBufferDescription.class */
public class SDL_GPUVertexBufferDescription extends Struct<SDL_GPUVertexBufferDescription> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SLOT;
    public static final int PITCH;
    public static final int INPUT_RATE;
    public static final int INSTANCE_STEP_RATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SLOT = layout.offsetof(0);
        PITCH = layout.offsetof(1);
        INPUT_RATE = layout.offsetof(2);
        INSTANCE_STEP_RATE = layout.offsetof(3);
    }

    protected SDL_GPUVertexBufferDescription(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUVertexBufferDescription create(long address, ByteBuffer container) {
        return new SDL_GPUVertexBufferDescription(address, container);
    }

    public SDL_GPUVertexBufferDescription(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint32")
    public int slot() {
        return nslot(address());
    }

    @NativeType("Uint32")
    public int pitch() {
        return npitch(address());
    }

    @NativeType("SDL_GPUVertexInputRate")
    public int input_rate() {
        return ninput_rate(address());
    }

    @NativeType("Uint32")
    public int instance_step_rate() {
        return ninstance_step_rate(address());
    }

    public SDL_GPUVertexBufferDescription slot(@NativeType("Uint32") int value) {
        nslot(address(), value);
        return this;
    }

    public SDL_GPUVertexBufferDescription pitch(@NativeType("Uint32") int value) {
        npitch(address(), value);
        return this;
    }

    public SDL_GPUVertexBufferDescription input_rate(@NativeType("SDL_GPUVertexInputRate") int value) {
        ninput_rate(address(), value);
        return this;
    }

    public SDL_GPUVertexBufferDescription instance_step_rate(@NativeType("Uint32") int value) {
        ninstance_step_rate(address(), value);
        return this;
    }

    public SDL_GPUVertexBufferDescription set(int slot, int pitch, int input_rate, int instance_step_rate) {
        slot(slot);
        pitch(pitch);
        input_rate(input_rate);
        instance_step_rate(instance_step_rate);
        return this;
    }

    public SDL_GPUVertexBufferDescription set(SDL_GPUVertexBufferDescription src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUVertexBufferDescription malloc() {
        return new SDL_GPUVertexBufferDescription(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUVertexBufferDescription calloc() {
        return new SDL_GPUVertexBufferDescription(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUVertexBufferDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUVertexBufferDescription(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUVertexBufferDescription create(long address) {
        return new SDL_GPUVertexBufferDescription(address, null);
    }

    public static SDL_GPUVertexBufferDescription createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUVertexBufferDescription(address, null);
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

    public static SDL_GPUVertexBufferDescription malloc(MemoryStack stack) {
        return new SDL_GPUVertexBufferDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUVertexBufferDescription calloc(MemoryStack stack) {
        return new SDL_GPUVertexBufferDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nslot(long struct) {
        return MemoryUtil.memGetInt(struct + SLOT);
    }

    public static int npitch(long struct) {
        return MemoryUtil.memGetInt(struct + PITCH);
    }

    public static int ninput_rate(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_RATE);
    }

    public static int ninstance_step_rate(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCE_STEP_RATE);
    }

    public static void nslot(long struct, int value) {
        MemoryUtil.memPutInt(struct + SLOT, value);
    }

    public static void npitch(long struct, int value) {
        MemoryUtil.memPutInt(struct + PITCH, value);
    }

    public static void ninput_rate(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_RATE, value);
    }

    public static void ninstance_step_rate(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCE_STEP_RATE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUVertexBufferDescription$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUVertexBufferDescription, Buffer> implements NativeResource {
        private static final SDL_GPUVertexBufferDescription ELEMENT_FACTORY = SDL_GPUVertexBufferDescription.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUVertexBufferDescription.SIZEOF);
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
        public SDL_GPUVertexBufferDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint32")
        public int slot() {
            return SDL_GPUVertexBufferDescription.nslot(address());
        }

        @NativeType("Uint32")
        public int pitch() {
            return SDL_GPUVertexBufferDescription.npitch(address());
        }

        @NativeType("SDL_GPUVertexInputRate")
        public int input_rate() {
            return SDL_GPUVertexBufferDescription.ninput_rate(address());
        }

        @NativeType("Uint32")
        public int instance_step_rate() {
            return SDL_GPUVertexBufferDescription.ninstance_step_rate(address());
        }

        public Buffer slot(@NativeType("Uint32") int value) {
            SDL_GPUVertexBufferDescription.nslot(address(), value);
            return this;
        }

        public Buffer pitch(@NativeType("Uint32") int value) {
            SDL_GPUVertexBufferDescription.npitch(address(), value);
            return this;
        }

        public Buffer input_rate(@NativeType("SDL_GPUVertexInputRate") int value) {
            SDL_GPUVertexBufferDescription.ninput_rate(address(), value);
            return this;
        }

        public Buffer instance_step_rate(@NativeType("Uint32") int value) {
            SDL_GPUVertexBufferDescription.ninstance_step_rate(address(), value);
            return this;
        }
    }
}
