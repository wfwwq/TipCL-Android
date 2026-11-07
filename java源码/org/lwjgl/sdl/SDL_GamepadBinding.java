package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GamepadBinding.class */
public class SDL_GamepadBinding extends Struct<SDL_GamepadBinding> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int INPUT_TYPE;
    public static final int INPUT;
    public static final int INPUT_BUTTON;
    public static final int INPUT_AXIS;
    public static final int INPUT_AXIS_AXIS;
    public static final int INPUT_AXIS_AXIS_MIN;
    public static final int INPUT_AXIS_AXIS_MAX;
    public static final int INPUT_HAT;
    public static final int INPUT_HAT_HAT;
    public static final int INPUT_HAT_HAT_MASK;
    public static final int OUTPUT_TYPE;
    public static final int OUTPUT;
    public static final int OUTPUT_BUTTON;
    public static final int OUTPUT_AXIS;
    public static final int OUTPUT_AXIS_AXIS;
    public static final int OUTPUT_AXIS_AXIS_MIN;
    public static final int OUTPUT_AXIS_AXIS_MAX;

    static {
        Struct.Layout layout = __struct(__member(4), __union(__member(4), __struct(__member(4), __member(4), __member(4)), __struct(__member(4), __member(4))), __member(4), __union(__member(4), __struct(__member(4), __member(4), __member(4))));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        INPUT_TYPE = layout.offsetof(0);
        INPUT = layout.offsetof(1);
        INPUT_BUTTON = layout.offsetof(2);
        INPUT_AXIS = layout.offsetof(3);
        INPUT_AXIS_AXIS = layout.offsetof(4);
        INPUT_AXIS_AXIS_MIN = layout.offsetof(5);
        INPUT_AXIS_AXIS_MAX = layout.offsetof(6);
        INPUT_HAT = layout.offsetof(7);
        INPUT_HAT_HAT = layout.offsetof(8);
        INPUT_HAT_HAT_MASK = layout.offsetof(9);
        OUTPUT_TYPE = layout.offsetof(10);
        OUTPUT = layout.offsetof(11);
        OUTPUT_BUTTON = layout.offsetof(12);
        OUTPUT_AXIS = layout.offsetof(13);
        OUTPUT_AXIS_AXIS = layout.offsetof(14);
        OUTPUT_AXIS_AXIS_MIN = layout.offsetof(15);
        OUTPUT_AXIS_AXIS_MAX = layout.offsetof(16);
    }

    protected SDL_GamepadBinding(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GamepadBinding create(long address, ByteBuffer container) {
        return new SDL_GamepadBinding(address, container);
    }

    public SDL_GamepadBinding(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GamepadBindingType")
    public int input_type() {
        return ninput_type(address());
    }

    public int input_button() {
        return ninput_button(address());
    }

    public int input_axis_axis() {
        return ninput_axis_axis(address());
    }

    public int input_axis_axis_min() {
        return ninput_axis_axis_min(address());
    }

    public int input_axis_axis_max() {
        return ninput_axis_axis_max(address());
    }

    public int input_hat_hat() {
        return ninput_hat_hat(address());
    }

    public int input_hat_hat_mask() {
        return ninput_hat_hat_mask(address());
    }

    @NativeType("SDL_GamepadBindingType")
    public int output_type() {
        return noutput_type(address());
    }

    @NativeType("SDL_GamepadButton")
    public int output_button() {
        return noutput_button(address());
    }

    @NativeType("SDL_GamepadAxis")
    public int output_axis_axis() {
        return noutput_axis_axis(address());
    }

    public int output_axis_axis_min() {
        return noutput_axis_axis_min(address());
    }

    public int output_axis_axis_max() {
        return noutput_axis_axis_max(address());
    }

    public SDL_GamepadBinding input_type(@NativeType("SDL_GamepadBindingType") int value) {
        ninput_type(address(), value);
        return this;
    }

    public SDL_GamepadBinding input_button(int value) {
        ninput_button(address(), value);
        return this;
    }

    public SDL_GamepadBinding input_axis_axis(int value) {
        ninput_axis_axis(address(), value);
        return this;
    }

    public SDL_GamepadBinding input_axis_axis_min(int value) {
        ninput_axis_axis_min(address(), value);
        return this;
    }

    public SDL_GamepadBinding input_axis_axis_max(int value) {
        ninput_axis_axis_max(address(), value);
        return this;
    }

    public SDL_GamepadBinding input_hat_hat(int value) {
        ninput_hat_hat(address(), value);
        return this;
    }

    public SDL_GamepadBinding input_hat_hat_mask(int value) {
        ninput_hat_hat_mask(address(), value);
        return this;
    }

    public SDL_GamepadBinding output_type(@NativeType("SDL_GamepadBindingType") int value) {
        noutput_type(address(), value);
        return this;
    }

    public SDL_GamepadBinding output_button(@NativeType("SDL_GamepadButton") int value) {
        noutput_button(address(), value);
        return this;
    }

    public SDL_GamepadBinding output_axis_axis(@NativeType("SDL_GamepadAxis") int value) {
        noutput_axis_axis(address(), value);
        return this;
    }

    public SDL_GamepadBinding output_axis_axis_min(int value) {
        noutput_axis_axis_min(address(), value);
        return this;
    }

    public SDL_GamepadBinding output_axis_axis_max(int value) {
        noutput_axis_axis_max(address(), value);
        return this;
    }

    public SDL_GamepadBinding set(SDL_GamepadBinding src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GamepadBinding malloc() {
        return new SDL_GamepadBinding(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GamepadBinding calloc() {
        return new SDL_GamepadBinding(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GamepadBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GamepadBinding(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GamepadBinding create(long address) {
        return new SDL_GamepadBinding(address, null);
    }

    public static SDL_GamepadBinding createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GamepadBinding(address, null);
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

    public static SDL_GamepadBinding malloc(MemoryStack stack) {
        return new SDL_GamepadBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GamepadBinding calloc(MemoryStack stack) {
        return new SDL_GamepadBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ninput_type(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_TYPE);
    }

    public static int ninput_button(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_BUTTON);
    }

    public static int ninput_axis_axis(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_AXIS_AXIS);
    }

    public static int ninput_axis_axis_min(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_AXIS_AXIS_MIN);
    }

    public static int ninput_axis_axis_max(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_AXIS_AXIS_MAX);
    }

    public static int ninput_hat_hat(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_HAT_HAT);
    }

    public static int ninput_hat_hat_mask(long struct) {
        return MemoryUtil.memGetInt(struct + INPUT_HAT_HAT_MASK);
    }

    public static int noutput_type(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_TYPE);
    }

    public static int noutput_button(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_BUTTON);
    }

    public static int noutput_axis_axis(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_AXIS_AXIS);
    }

    public static int noutput_axis_axis_min(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_AXIS_AXIS_MIN);
    }

    public static int noutput_axis_axis_max(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUT_AXIS_AXIS_MAX);
    }

    public static void ninput_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_TYPE, value);
    }

    public static void ninput_button(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_BUTTON, value);
    }

    public static void ninput_axis_axis(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_AXIS_AXIS, value);
    }

    public static void ninput_axis_axis_min(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_AXIS_AXIS_MIN, value);
    }

    public static void ninput_axis_axis_max(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_AXIS_AXIS_MAX, value);
    }

    public static void ninput_hat_hat(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_HAT_HAT, value);
    }

    public static void ninput_hat_hat_mask(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUT_HAT_HAT_MASK, value);
    }

    public static void noutput_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_TYPE, value);
    }

    public static void noutput_button(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_BUTTON, value);
    }

    public static void noutput_axis_axis(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_AXIS_AXIS, value);
    }

    public static void noutput_axis_axis_min(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_AXIS_AXIS_MIN, value);
    }

    public static void noutput_axis_axis_max(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUT_AXIS_AXIS_MAX, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GamepadBinding$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GamepadBinding, Buffer> implements NativeResource {
        private static final SDL_GamepadBinding ELEMENT_FACTORY = SDL_GamepadBinding.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GamepadBinding.SIZEOF);
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
        public SDL_GamepadBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GamepadBindingType")
        public int input_type() {
            return SDL_GamepadBinding.ninput_type(address());
        }

        public int input_button() {
            return SDL_GamepadBinding.ninput_button(address());
        }

        public int input_axis_axis() {
            return SDL_GamepadBinding.ninput_axis_axis(address());
        }

        public int input_axis_axis_min() {
            return SDL_GamepadBinding.ninput_axis_axis_min(address());
        }

        public int input_axis_axis_max() {
            return SDL_GamepadBinding.ninput_axis_axis_max(address());
        }

        public int input_hat_hat() {
            return SDL_GamepadBinding.ninput_hat_hat(address());
        }

        public int input_hat_hat_mask() {
            return SDL_GamepadBinding.ninput_hat_hat_mask(address());
        }

        @NativeType("SDL_GamepadBindingType")
        public int output_type() {
            return SDL_GamepadBinding.noutput_type(address());
        }

        @NativeType("SDL_GamepadButton")
        public int output_button() {
            return SDL_GamepadBinding.noutput_button(address());
        }

        @NativeType("SDL_GamepadAxis")
        public int output_axis_axis() {
            return SDL_GamepadBinding.noutput_axis_axis(address());
        }

        public int output_axis_axis_min() {
            return SDL_GamepadBinding.noutput_axis_axis_min(address());
        }

        public int output_axis_axis_max() {
            return SDL_GamepadBinding.noutput_axis_axis_max(address());
        }

        public Buffer input_type(@NativeType("SDL_GamepadBindingType") int value) {
            SDL_GamepadBinding.ninput_type(address(), value);
            return this;
        }

        public Buffer input_button(int value) {
            SDL_GamepadBinding.ninput_button(address(), value);
            return this;
        }

        public Buffer input_axis_axis(int value) {
            SDL_GamepadBinding.ninput_axis_axis(address(), value);
            return this;
        }

        public Buffer input_axis_axis_min(int value) {
            SDL_GamepadBinding.ninput_axis_axis_min(address(), value);
            return this;
        }

        public Buffer input_axis_axis_max(int value) {
            SDL_GamepadBinding.ninput_axis_axis_max(address(), value);
            return this;
        }

        public Buffer input_hat_hat(int value) {
            SDL_GamepadBinding.ninput_hat_hat(address(), value);
            return this;
        }

        public Buffer input_hat_hat_mask(int value) {
            SDL_GamepadBinding.ninput_hat_hat_mask(address(), value);
            return this;
        }

        public Buffer output_type(@NativeType("SDL_GamepadBindingType") int value) {
            SDL_GamepadBinding.noutput_type(address(), value);
            return this;
        }

        public Buffer output_button(@NativeType("SDL_GamepadButton") int value) {
            SDL_GamepadBinding.noutput_button(address(), value);
            return this;
        }

        public Buffer output_axis_axis(@NativeType("SDL_GamepadAxis") int value) {
            SDL_GamepadBinding.noutput_axis_axis(address(), value);
            return this;
        }

        public Buffer output_axis_axis_min(int value) {
            SDL_GamepadBinding.noutput_axis_axis_min(address(), value);
            return this;
        }

        public Buffer output_axis_axis_max(int value) {
            SDL_GamepadBinding.noutput_axis_axis_max(address(), value);
            return this;
        }
    }
}
