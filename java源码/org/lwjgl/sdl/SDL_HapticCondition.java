package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticCondition.class */
public class SDL_HapticCondition extends Struct<SDL_HapticCondition> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int DIRECTION;
    public static final int LENGTH;
    public static final int DELAY;
    public static final int BUTTON;
    public static final int INTERVAL;
    public static final int RIGHT_SAT;
    public static final int LEFT_SAT;
    public static final int RIGHT_COEFF;
    public static final int LEFT_COEFF;
    public static final int DEADBAND;
    public static final int CENTER;

    static {
        Struct.Layout layout = __struct(__member(2), __member(SDL_HapticDirection.SIZEOF, SDL_HapticDirection.ALIGNOF), __member(4), __member(2), __member(2), __member(2), __array(2, 3), __array(2, 3), __array(2, 3), __array(2, 3), __array(2, 3), __array(2, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        DIRECTION = layout.offsetof(1);
        LENGTH = layout.offsetof(2);
        DELAY = layout.offsetof(3);
        BUTTON = layout.offsetof(4);
        INTERVAL = layout.offsetof(5);
        RIGHT_SAT = layout.offsetof(6);
        LEFT_SAT = layout.offsetof(7);
        RIGHT_COEFF = layout.offsetof(8);
        LEFT_COEFF = layout.offsetof(9);
        DEADBAND = layout.offsetof(10);
        CENTER = layout.offsetof(11);
    }

    protected SDL_HapticCondition(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_HapticCondition create(long address, ByteBuffer container) {
        return new SDL_HapticCondition(address, container);
    }

    public SDL_HapticCondition(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_HapticEffectType")
    public short type() {
        return ntype(address());
    }

    public SDL_HapticDirection direction() {
        return ndirection(address());
    }

    @NativeType("Uint32")
    public int length() {
        return nlength(address());
    }

    @NativeType("Uint16")
    public short delay() {
        return ndelay(address());
    }

    @NativeType("Uint16")
    public short button() {
        return nbutton(address());
    }

    @NativeType("Uint16")
    public short interval() {
        return ninterval(address());
    }

    @NativeType("Uint16[3]")
    public ShortBuffer right_sat() {
        return nright_sat(address());
    }

    @NativeType("Uint16")
    public short right_sat(int index) {
        return nright_sat(address(), index);
    }

    @NativeType("Uint16[3]")
    public ShortBuffer left_sat() {
        return nleft_sat(address());
    }

    @NativeType("Uint16")
    public short left_sat(int index) {
        return nleft_sat(address(), index);
    }

    @NativeType("Sint16[3]")
    public ShortBuffer right_coeff() {
        return nright_coeff(address());
    }

    @NativeType("Sint16")
    public short right_coeff(int index) {
        return nright_coeff(address(), index);
    }

    @NativeType("Sint16[3]")
    public ShortBuffer left_coeff() {
        return nleft_coeff(address());
    }

    @NativeType("Sint16")
    public short left_coeff(int index) {
        return nleft_coeff(address(), index);
    }

    @NativeType("Uint16[3]")
    public ShortBuffer deadband() {
        return ndeadband(address());
    }

    @NativeType("Uint16")
    public short deadband(int index) {
        return ndeadband(address(), index);
    }

    @NativeType("Sint16[3]")
    public ShortBuffer center() {
        return ncenter(address());
    }

    @NativeType("Sint16")
    public short center(int index) {
        return ncenter(address(), index);
    }

    public SDL_HapticCondition type(@NativeType("SDL_HapticEffectType") short value) {
        ntype(address(), value);
        return this;
    }

    public SDL_HapticCondition direction(SDL_HapticDirection value) {
        ndirection(address(), value);
        return this;
    }

    public SDL_HapticCondition direction(Consumer<SDL_HapticDirection> consumer) {
        consumer.accept(direction());
        return this;
    }

    public SDL_HapticCondition length(@NativeType("Uint32") int value) {
        nlength(address(), value);
        return this;
    }

    public SDL_HapticCondition delay(@NativeType("Uint16") short value) {
        ndelay(address(), value);
        return this;
    }

    public SDL_HapticCondition button(@NativeType("Uint16") short value) {
        nbutton(address(), value);
        return this;
    }

    public SDL_HapticCondition interval(@NativeType("Uint16") short value) {
        ninterval(address(), value);
        return this;
    }

    public SDL_HapticCondition right_sat(@NativeType("Uint16[3]") ShortBuffer value) {
        nright_sat(address(), value);
        return this;
    }

    public SDL_HapticCondition right_sat(int index, @NativeType("Uint16") short value) {
        nright_sat(address(), index, value);
        return this;
    }

    public SDL_HapticCondition left_sat(@NativeType("Uint16[3]") ShortBuffer value) {
        nleft_sat(address(), value);
        return this;
    }

    public SDL_HapticCondition left_sat(int index, @NativeType("Uint16") short value) {
        nleft_sat(address(), index, value);
        return this;
    }

    public SDL_HapticCondition right_coeff(@NativeType("Sint16[3]") ShortBuffer value) {
        nright_coeff(address(), value);
        return this;
    }

    public SDL_HapticCondition right_coeff(int index, @NativeType("Sint16") short value) {
        nright_coeff(address(), index, value);
        return this;
    }

    public SDL_HapticCondition left_coeff(@NativeType("Sint16[3]") ShortBuffer value) {
        nleft_coeff(address(), value);
        return this;
    }

    public SDL_HapticCondition left_coeff(int index, @NativeType("Sint16") short value) {
        nleft_coeff(address(), index, value);
        return this;
    }

    public SDL_HapticCondition deadband(@NativeType("Uint16[3]") ShortBuffer value) {
        ndeadband(address(), value);
        return this;
    }

    public SDL_HapticCondition deadband(int index, @NativeType("Uint16") short value) {
        ndeadband(address(), index, value);
        return this;
    }

    public SDL_HapticCondition center(@NativeType("Sint16[3]") ShortBuffer value) {
        ncenter(address(), value);
        return this;
    }

    public SDL_HapticCondition center(int index, @NativeType("Sint16") short value) {
        ncenter(address(), index, value);
        return this;
    }

    public SDL_HapticCondition set(short type, SDL_HapticDirection direction, int length, short delay, short button, short interval, ShortBuffer right_sat, ShortBuffer left_sat, ShortBuffer right_coeff, ShortBuffer left_coeff, ShortBuffer deadband, ShortBuffer center) {
        type(type);
        direction(direction);
        length(length);
        delay(delay);
        button(button);
        interval(interval);
        right_sat(right_sat);
        left_sat(left_sat);
        right_coeff(right_coeff);
        left_coeff(left_coeff);
        deadband(deadband);
        center(center);
        return this;
    }

    public SDL_HapticCondition set(SDL_HapticCondition src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_HapticCondition malloc() {
        return new SDL_HapticCondition(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_HapticCondition calloc() {
        return new SDL_HapticCondition(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_HapticCondition create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticCondition(MemoryUtil.memAddress(container), container);
    }

    public static SDL_HapticCondition create(long address) {
        return new SDL_HapticCondition(address, null);
    }

    public static SDL_HapticCondition createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_HapticCondition(address, null);
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

    public static SDL_HapticCondition malloc(MemoryStack stack) {
        return new SDL_HapticCondition(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_HapticCondition calloc(MemoryStack stack) {
        return new SDL_HapticCondition(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short ntype(long struct) {
        return MemoryUtil.memGetShort(struct + TYPE);
    }

    public static SDL_HapticDirection ndirection(long struct) {
        return SDL_HapticDirection.create(struct + DIRECTION);
    }

    public static int nlength(long struct) {
        return MemoryUtil.memGetInt(struct + LENGTH);
    }

    public static short ndelay(long struct) {
        return MemoryUtil.memGetShort(struct + DELAY);
    }

    public static short nbutton(long struct) {
        return MemoryUtil.memGetShort(struct + BUTTON);
    }

    public static short ninterval(long struct) {
        return MemoryUtil.memGetShort(struct + INTERVAL);
    }

    public static ShortBuffer nright_sat(long struct) {
        return MemoryUtil.memShortBuffer(struct + RIGHT_SAT, 3);
    }

    public static short nright_sat(long struct, int index) {
        return MemoryUtil.memGetShort(struct + RIGHT_SAT + (Checks.check(index, 3) * 2));
    }

    public static ShortBuffer nleft_sat(long struct) {
        return MemoryUtil.memShortBuffer(struct + LEFT_SAT, 3);
    }

    public static short nleft_sat(long struct, int index) {
        return MemoryUtil.memGetShort(struct + LEFT_SAT + (Checks.check(index, 3) * 2));
    }

    public static ShortBuffer nright_coeff(long struct) {
        return MemoryUtil.memShortBuffer(struct + RIGHT_COEFF, 3);
    }

    public static short nright_coeff(long struct, int index) {
        return MemoryUtil.memGetShort(struct + RIGHT_COEFF + (Checks.check(index, 3) * 2));
    }

    public static ShortBuffer nleft_coeff(long struct) {
        return MemoryUtil.memShortBuffer(struct + LEFT_COEFF, 3);
    }

    public static short nleft_coeff(long struct, int index) {
        return MemoryUtil.memGetShort(struct + LEFT_COEFF + (Checks.check(index, 3) * 2));
    }

    public static ShortBuffer ndeadband(long struct) {
        return MemoryUtil.memShortBuffer(struct + DEADBAND, 3);
    }

    public static short ndeadband(long struct, int index) {
        return MemoryUtil.memGetShort(struct + DEADBAND + (Checks.check(index, 3) * 2));
    }

    public static ShortBuffer ncenter(long struct) {
        return MemoryUtil.memShortBuffer(struct + CENTER, 3);
    }

    public static short ncenter(long struct, int index) {
        return MemoryUtil.memGetShort(struct + CENTER + (Checks.check(index, 3) * 2));
    }

    public static void ntype(long struct, short value) {
        MemoryUtil.memPutShort(struct + TYPE, value);
    }

    public static void ndirection(long struct, SDL_HapticDirection value) {
        MemoryUtil.memCopy(value.address(), struct + DIRECTION, SDL_HapticDirection.SIZEOF);
    }

    public static void nlength(long struct, int value) {
        MemoryUtil.memPutInt(struct + LENGTH, value);
    }

    public static void ndelay(long struct, short value) {
        MemoryUtil.memPutShort(struct + DELAY, value);
    }

    public static void nbutton(long struct, short value) {
        MemoryUtil.memPutShort(struct + BUTTON, value);
    }

    public static void ninterval(long struct, short value) {
        MemoryUtil.memPutShort(struct + INTERVAL, value);
    }

    public static void nright_sat(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RIGHT_SAT, value.remaining() * 2);
    }

    public static void nright_sat(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + RIGHT_SAT + (Checks.check(index, 3) * 2), value);
    }

    public static void nleft_sat(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LEFT_SAT, value.remaining() * 2);
    }

    public static void nleft_sat(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + LEFT_SAT + (Checks.check(index, 3) * 2), value);
    }

    public static void nright_coeff(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RIGHT_COEFF, value.remaining() * 2);
    }

    public static void nright_coeff(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + RIGHT_COEFF + (Checks.check(index, 3) * 2), value);
    }

    public static void nleft_coeff(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LEFT_COEFF, value.remaining() * 2);
    }

    public static void nleft_coeff(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + LEFT_COEFF + (Checks.check(index, 3) * 2), value);
    }

    public static void ndeadband(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DEADBAND, value.remaining() * 2);
    }

    public static void ndeadband(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + DEADBAND + (Checks.check(index, 3) * 2), value);
    }

    public static void ncenter(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CENTER, value.remaining() * 2);
    }

    public static void ncenter(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + CENTER + (Checks.check(index, 3) * 2), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticCondition$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_HapticCondition, Buffer> implements NativeResource {
        private static final SDL_HapticCondition ELEMENT_FACTORY = SDL_HapticCondition.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_HapticCondition.SIZEOF);
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
        public SDL_HapticCondition getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_HapticEffectType")
        public short type() {
            return SDL_HapticCondition.ntype(address());
        }

        public SDL_HapticDirection direction() {
            return SDL_HapticCondition.ndirection(address());
        }

        @NativeType("Uint32")
        public int length() {
            return SDL_HapticCondition.nlength(address());
        }

        @NativeType("Uint16")
        public short delay() {
            return SDL_HapticCondition.ndelay(address());
        }

        @NativeType("Uint16")
        public short button() {
            return SDL_HapticCondition.nbutton(address());
        }

        @NativeType("Uint16")
        public short interval() {
            return SDL_HapticCondition.ninterval(address());
        }

        @NativeType("Uint16[3]")
        public ShortBuffer right_sat() {
            return SDL_HapticCondition.nright_sat(address());
        }

        @NativeType("Uint16")
        public short right_sat(int index) {
            return SDL_HapticCondition.nright_sat(address(), index);
        }

        @NativeType("Uint16[3]")
        public ShortBuffer left_sat() {
            return SDL_HapticCondition.nleft_sat(address());
        }

        @NativeType("Uint16")
        public short left_sat(int index) {
            return SDL_HapticCondition.nleft_sat(address(), index);
        }

        @NativeType("Sint16[3]")
        public ShortBuffer right_coeff() {
            return SDL_HapticCondition.nright_coeff(address());
        }

        @NativeType("Sint16")
        public short right_coeff(int index) {
            return SDL_HapticCondition.nright_coeff(address(), index);
        }

        @NativeType("Sint16[3]")
        public ShortBuffer left_coeff() {
            return SDL_HapticCondition.nleft_coeff(address());
        }

        @NativeType("Sint16")
        public short left_coeff(int index) {
            return SDL_HapticCondition.nleft_coeff(address(), index);
        }

        @NativeType("Uint16[3]")
        public ShortBuffer deadband() {
            return SDL_HapticCondition.ndeadband(address());
        }

        @NativeType("Uint16")
        public short deadband(int index) {
            return SDL_HapticCondition.ndeadband(address(), index);
        }

        @NativeType("Sint16[3]")
        public ShortBuffer center() {
            return SDL_HapticCondition.ncenter(address());
        }

        @NativeType("Sint16")
        public short center(int index) {
            return SDL_HapticCondition.ncenter(address(), index);
        }

        public Buffer type(@NativeType("SDL_HapticEffectType") short value) {
            SDL_HapticCondition.ntype(address(), value);
            return this;
        }

        public Buffer direction(SDL_HapticDirection value) {
            SDL_HapticCondition.ndirection(address(), value);
            return this;
        }

        public Buffer direction(Consumer<SDL_HapticDirection> consumer) {
            consumer.accept(direction());
            return this;
        }

        public Buffer length(@NativeType("Uint32") int value) {
            SDL_HapticCondition.nlength(address(), value);
            return this;
        }

        public Buffer delay(@NativeType("Uint16") short value) {
            SDL_HapticCondition.ndelay(address(), value);
            return this;
        }

        public Buffer button(@NativeType("Uint16") short value) {
            SDL_HapticCondition.nbutton(address(), value);
            return this;
        }

        public Buffer interval(@NativeType("Uint16") short value) {
            SDL_HapticCondition.ninterval(address(), value);
            return this;
        }

        public Buffer right_sat(@NativeType("Uint16[3]") ShortBuffer value) {
            SDL_HapticCondition.nright_sat(address(), value);
            return this;
        }

        public Buffer right_sat(int index, @NativeType("Uint16") short value) {
            SDL_HapticCondition.nright_sat(address(), index, value);
            return this;
        }

        public Buffer left_sat(@NativeType("Uint16[3]") ShortBuffer value) {
            SDL_HapticCondition.nleft_sat(address(), value);
            return this;
        }

        public Buffer left_sat(int index, @NativeType("Uint16") short value) {
            SDL_HapticCondition.nleft_sat(address(), index, value);
            return this;
        }

        public Buffer right_coeff(@NativeType("Sint16[3]") ShortBuffer value) {
            SDL_HapticCondition.nright_coeff(address(), value);
            return this;
        }

        public Buffer right_coeff(int index, @NativeType("Sint16") short value) {
            SDL_HapticCondition.nright_coeff(address(), index, value);
            return this;
        }

        public Buffer left_coeff(@NativeType("Sint16[3]") ShortBuffer value) {
            SDL_HapticCondition.nleft_coeff(address(), value);
            return this;
        }

        public Buffer left_coeff(int index, @NativeType("Sint16") short value) {
            SDL_HapticCondition.nleft_coeff(address(), index, value);
            return this;
        }

        public Buffer deadband(@NativeType("Uint16[3]") ShortBuffer value) {
            SDL_HapticCondition.ndeadband(address(), value);
            return this;
        }

        public Buffer deadband(int index, @NativeType("Uint16") short value) {
            SDL_HapticCondition.ndeadband(address(), index, value);
            return this;
        }

        public Buffer center(@NativeType("Sint16[3]") ShortBuffer value) {
            SDL_HapticCondition.ncenter(address(), value);
            return this;
        }

        public Buffer center(int index, @NativeType("Sint16") short value) {
            SDL_HapticCondition.ncenter(address(), index, value);
            return this;
        }
    }
}
