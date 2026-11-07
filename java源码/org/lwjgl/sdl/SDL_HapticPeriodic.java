package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticPeriodic.class */
public class SDL_HapticPeriodic extends Struct<SDL_HapticPeriodic> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int DIRECTION;
    public static final int LENGTH;
    public static final int DELAY;
    public static final int BUTTON;
    public static final int INTERVAL;
    public static final int PERIOD;
    public static final int MAGNITUDE;
    public static final int OFFSET;
    public static final int PHASE;
    public static final int ATTACK_LENGTH;
    public static final int ATTACK_LEVEL;
    public static final int FADE_LENGTH;
    public static final int FADE_LEVEL;

    static {
        Struct.Layout layout = __struct(__member(2), __member(SDL_HapticDirection.SIZEOF, SDL_HapticDirection.ALIGNOF), __member(4), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        DIRECTION = layout.offsetof(1);
        LENGTH = layout.offsetof(2);
        DELAY = layout.offsetof(3);
        BUTTON = layout.offsetof(4);
        INTERVAL = layout.offsetof(5);
        PERIOD = layout.offsetof(6);
        MAGNITUDE = layout.offsetof(7);
        OFFSET = layout.offsetof(8);
        PHASE = layout.offsetof(9);
        ATTACK_LENGTH = layout.offsetof(10);
        ATTACK_LEVEL = layout.offsetof(11);
        FADE_LENGTH = layout.offsetof(12);
        FADE_LEVEL = layout.offsetof(13);
    }

    protected SDL_HapticPeriodic(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_HapticPeriodic create(long address, ByteBuffer container) {
        return new SDL_HapticPeriodic(address, container);
    }

    public SDL_HapticPeriodic(ByteBuffer container) {
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

    @NativeType("Uint16")
    public short period() {
        return nperiod(address());
    }

    @NativeType("Sint16")
    public short magnitude() {
        return nmagnitude(address());
    }

    @NativeType("Sint16")
    public short offset() {
        return noffset(address());
    }

    @NativeType("Uint16")
    public short phase() {
        return nphase(address());
    }

    @NativeType("Uint16")
    public short attack_length() {
        return nattack_length(address());
    }

    @NativeType("Uint16")
    public short attack_level() {
        return nattack_level(address());
    }

    @NativeType("Uint16")
    public short fade_length() {
        return nfade_length(address());
    }

    @NativeType("Uint16")
    public short fade_level() {
        return nfade_level(address());
    }

    public SDL_HapticPeriodic type(@NativeType("SDL_HapticEffectType") short value) {
        ntype(address(), value);
        return this;
    }

    public SDL_HapticPeriodic direction(SDL_HapticDirection value) {
        ndirection(address(), value);
        return this;
    }

    public SDL_HapticPeriodic direction(Consumer<SDL_HapticDirection> consumer) {
        consumer.accept(direction());
        return this;
    }

    public SDL_HapticPeriodic length(@NativeType("Uint32") int value) {
        nlength(address(), value);
        return this;
    }

    public SDL_HapticPeriodic delay(@NativeType("Uint16") short value) {
        ndelay(address(), value);
        return this;
    }

    public SDL_HapticPeriodic button(@NativeType("Uint16") short value) {
        nbutton(address(), value);
        return this;
    }

    public SDL_HapticPeriodic interval(@NativeType("Uint16") short value) {
        ninterval(address(), value);
        return this;
    }

    public SDL_HapticPeriodic period(@NativeType("Uint16") short value) {
        nperiod(address(), value);
        return this;
    }

    public SDL_HapticPeriodic magnitude(@NativeType("Sint16") short value) {
        nmagnitude(address(), value);
        return this;
    }

    public SDL_HapticPeriodic offset(@NativeType("Sint16") short value) {
        noffset(address(), value);
        return this;
    }

    public SDL_HapticPeriodic phase(@NativeType("Uint16") short value) {
        nphase(address(), value);
        return this;
    }

    public SDL_HapticPeriodic attack_length(@NativeType("Uint16") short value) {
        nattack_length(address(), value);
        return this;
    }

    public SDL_HapticPeriodic attack_level(@NativeType("Uint16") short value) {
        nattack_level(address(), value);
        return this;
    }

    public SDL_HapticPeriodic fade_length(@NativeType("Uint16") short value) {
        nfade_length(address(), value);
        return this;
    }

    public SDL_HapticPeriodic fade_level(@NativeType("Uint16") short value) {
        nfade_level(address(), value);
        return this;
    }

    public SDL_HapticPeriodic set(short type, SDL_HapticDirection direction, int length, short delay, short button, short interval, short period, short magnitude, short offset, short phase, short attack_length, short attack_level, short fade_length, short fade_level) {
        type(type);
        direction(direction);
        length(length);
        delay(delay);
        button(button);
        interval(interval);
        period(period);
        magnitude(magnitude);
        offset(offset);
        phase(phase);
        attack_length(attack_length);
        attack_level(attack_level);
        fade_length(fade_length);
        fade_level(fade_level);
        return this;
    }

    public SDL_HapticPeriodic set(SDL_HapticPeriodic src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_HapticPeriodic malloc() {
        return new SDL_HapticPeriodic(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_HapticPeriodic calloc() {
        return new SDL_HapticPeriodic(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_HapticPeriodic create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticPeriodic(MemoryUtil.memAddress(container), container);
    }

    public static SDL_HapticPeriodic create(long address) {
        return new SDL_HapticPeriodic(address, null);
    }

    public static SDL_HapticPeriodic createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_HapticPeriodic(address, null);
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

    public static SDL_HapticPeriodic malloc(MemoryStack stack) {
        return new SDL_HapticPeriodic(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_HapticPeriodic calloc(MemoryStack stack) {
        return new SDL_HapticPeriodic(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static short nperiod(long struct) {
        return MemoryUtil.memGetShort(struct + PERIOD);
    }

    public static short nmagnitude(long struct) {
        return MemoryUtil.memGetShort(struct + MAGNITUDE);
    }

    public static short noffset(long struct) {
        return MemoryUtil.memGetShort(struct + OFFSET);
    }

    public static short nphase(long struct) {
        return MemoryUtil.memGetShort(struct + PHASE);
    }

    public static short nattack_length(long struct) {
        return MemoryUtil.memGetShort(struct + ATTACK_LENGTH);
    }

    public static short nattack_level(long struct) {
        return MemoryUtil.memGetShort(struct + ATTACK_LEVEL);
    }

    public static short nfade_length(long struct) {
        return MemoryUtil.memGetShort(struct + FADE_LENGTH);
    }

    public static short nfade_level(long struct) {
        return MemoryUtil.memGetShort(struct + FADE_LEVEL);
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

    public static void nperiod(long struct, short value) {
        MemoryUtil.memPutShort(struct + PERIOD, value);
    }

    public static void nmagnitude(long struct, short value) {
        MemoryUtil.memPutShort(struct + MAGNITUDE, value);
    }

    public static void noffset(long struct, short value) {
        MemoryUtil.memPutShort(struct + OFFSET, value);
    }

    public static void nphase(long struct, short value) {
        MemoryUtil.memPutShort(struct + PHASE, value);
    }

    public static void nattack_length(long struct, short value) {
        MemoryUtil.memPutShort(struct + ATTACK_LENGTH, value);
    }

    public static void nattack_level(long struct, short value) {
        MemoryUtil.memPutShort(struct + ATTACK_LEVEL, value);
    }

    public static void nfade_length(long struct, short value) {
        MemoryUtil.memPutShort(struct + FADE_LENGTH, value);
    }

    public static void nfade_level(long struct, short value) {
        MemoryUtil.memPutShort(struct + FADE_LEVEL, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticPeriodic$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_HapticPeriodic, Buffer> implements NativeResource {
        private static final SDL_HapticPeriodic ELEMENT_FACTORY = SDL_HapticPeriodic.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_HapticPeriodic.SIZEOF);
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
        public SDL_HapticPeriodic getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_HapticEffectType")
        public short type() {
            return SDL_HapticPeriodic.ntype(address());
        }

        public SDL_HapticDirection direction() {
            return SDL_HapticPeriodic.ndirection(address());
        }

        @NativeType("Uint32")
        public int length() {
            return SDL_HapticPeriodic.nlength(address());
        }

        @NativeType("Uint16")
        public short delay() {
            return SDL_HapticPeriodic.ndelay(address());
        }

        @NativeType("Uint16")
        public short button() {
            return SDL_HapticPeriodic.nbutton(address());
        }

        @NativeType("Uint16")
        public short interval() {
            return SDL_HapticPeriodic.ninterval(address());
        }

        @NativeType("Uint16")
        public short period() {
            return SDL_HapticPeriodic.nperiod(address());
        }

        @NativeType("Sint16")
        public short magnitude() {
            return SDL_HapticPeriodic.nmagnitude(address());
        }

        @NativeType("Sint16")
        public short offset() {
            return SDL_HapticPeriodic.noffset(address());
        }

        @NativeType("Uint16")
        public short phase() {
            return SDL_HapticPeriodic.nphase(address());
        }

        @NativeType("Uint16")
        public short attack_length() {
            return SDL_HapticPeriodic.nattack_length(address());
        }

        @NativeType("Uint16")
        public short attack_level() {
            return SDL_HapticPeriodic.nattack_level(address());
        }

        @NativeType("Uint16")
        public short fade_length() {
            return SDL_HapticPeriodic.nfade_length(address());
        }

        @NativeType("Uint16")
        public short fade_level() {
            return SDL_HapticPeriodic.nfade_level(address());
        }

        public Buffer type(@NativeType("SDL_HapticEffectType") short value) {
            SDL_HapticPeriodic.ntype(address(), value);
            return this;
        }

        public Buffer direction(SDL_HapticDirection value) {
            SDL_HapticPeriodic.ndirection(address(), value);
            return this;
        }

        public Buffer direction(Consumer<SDL_HapticDirection> consumer) {
            consumer.accept(direction());
            return this;
        }

        public Buffer length(@NativeType("Uint32") int value) {
            SDL_HapticPeriodic.nlength(address(), value);
            return this;
        }

        public Buffer delay(@NativeType("Uint16") short value) {
            SDL_HapticPeriodic.ndelay(address(), value);
            return this;
        }

        public Buffer button(@NativeType("Uint16") short value) {
            SDL_HapticPeriodic.nbutton(address(), value);
            return this;
        }

        public Buffer interval(@NativeType("Uint16") short value) {
            SDL_HapticPeriodic.ninterval(address(), value);
            return this;
        }

        public Buffer period(@NativeType("Uint16") short value) {
            SDL_HapticPeriodic.nperiod(address(), value);
            return this;
        }

        public Buffer magnitude(@NativeType("Sint16") short value) {
            SDL_HapticPeriodic.nmagnitude(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("Sint16") short value) {
            SDL_HapticPeriodic.noffset(address(), value);
            return this;
        }

        public Buffer phase(@NativeType("Uint16") short value) {
            SDL_HapticPeriodic.nphase(address(), value);
            return this;
        }

        public Buffer attack_length(@NativeType("Uint16") short value) {
            SDL_HapticPeriodic.nattack_length(address(), value);
            return this;
        }

        public Buffer attack_level(@NativeType("Uint16") short value) {
            SDL_HapticPeriodic.nattack_level(address(), value);
            return this;
        }

        public Buffer fade_length(@NativeType("Uint16") short value) {
            SDL_HapticPeriodic.nfade_length(address(), value);
            return this;
        }

        public Buffer fade_level(@NativeType("Uint16") short value) {
            SDL_HapticPeriodic.nfade_level(address(), value);
            return this;
        }
    }
}
