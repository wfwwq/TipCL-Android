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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticCustom.class */
public class SDL_HapticCustom extends Struct<SDL_HapticCustom> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int DIRECTION;
    public static final int LENGTH;
    public static final int DELAY;
    public static final int BUTTON;
    public static final int INTERVAL;
    public static final int CHANNELS;
    public static final int PERIOD;
    public static final int SAMPLES;
    public static final int DATA;
    public static final int ATTACK_LENGTH;
    public static final int ATTACK_LEVEL;
    public static final int FADE_LENGTH;
    public static final int FADE_LEVEL;

    static {
        Struct.Layout layout = __struct(__member(2), __member(SDL_HapticDirection.SIZEOF, SDL_HapticDirection.ALIGNOF), __member(4), __member(2), __member(2), __member(2), __member(1), __member(2), __member(2), __member(POINTER_SIZE), __member(2), __member(2), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        DIRECTION = layout.offsetof(1);
        LENGTH = layout.offsetof(2);
        DELAY = layout.offsetof(3);
        BUTTON = layout.offsetof(4);
        INTERVAL = layout.offsetof(5);
        CHANNELS = layout.offsetof(6);
        PERIOD = layout.offsetof(7);
        SAMPLES = layout.offsetof(8);
        DATA = layout.offsetof(9);
        ATTACK_LENGTH = layout.offsetof(10);
        ATTACK_LEVEL = layout.offsetof(11);
        FADE_LENGTH = layout.offsetof(12);
        FADE_LEVEL = layout.offsetof(13);
    }

    protected SDL_HapticCustom(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_HapticCustom create(long address, ByteBuffer container) {
        return new SDL_HapticCustom(address, container);
    }

    public SDL_HapticCustom(ByteBuffer container) {
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

    @NativeType("Uint8")
    public byte channels() {
        return nchannels(address());
    }

    @NativeType("Uint16")
    public short period() {
        return nperiod(address());
    }

    @NativeType("Uint16")
    public short samples() {
        return nsamples(address());
    }

    @NativeType("Uint16 *")
    public ShortBuffer data() {
        return ndata(address());
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

    public SDL_HapticCustom type(@NativeType("SDL_HapticEffectType") short value) {
        ntype(address(), value);
        return this;
    }

    public SDL_HapticCustom direction(SDL_HapticDirection value) {
        ndirection(address(), value);
        return this;
    }

    public SDL_HapticCustom direction(Consumer<SDL_HapticDirection> consumer) {
        consumer.accept(direction());
        return this;
    }

    public SDL_HapticCustom length(@NativeType("Uint32") int value) {
        nlength(address(), value);
        return this;
    }

    public SDL_HapticCustom delay(@NativeType("Uint16") short value) {
        ndelay(address(), value);
        return this;
    }

    public SDL_HapticCustom button(@NativeType("Uint16") short value) {
        nbutton(address(), value);
        return this;
    }

    public SDL_HapticCustom interval(@NativeType("Uint16") short value) {
        ninterval(address(), value);
        return this;
    }

    public SDL_HapticCustom channels(@NativeType("Uint8") byte value) {
        nchannels(address(), value);
        return this;
    }

    public SDL_HapticCustom period(@NativeType("Uint16") short value) {
        nperiod(address(), value);
        return this;
    }

    public SDL_HapticCustom samples(@NativeType("Uint16") short value) {
        nsamples(address(), value);
        return this;
    }

    public SDL_HapticCustom data(@NativeType("Uint16 *") ShortBuffer value) {
        ndata(address(), value);
        return this;
    }

    public SDL_HapticCustom attack_length(@NativeType("Uint16") short value) {
        nattack_length(address(), value);
        return this;
    }

    public SDL_HapticCustom attack_level(@NativeType("Uint16") short value) {
        nattack_level(address(), value);
        return this;
    }

    public SDL_HapticCustom fade_length(@NativeType("Uint16") short value) {
        nfade_length(address(), value);
        return this;
    }

    public SDL_HapticCustom fade_level(@NativeType("Uint16") short value) {
        nfade_level(address(), value);
        return this;
    }

    public SDL_HapticCustom set(short type, SDL_HapticDirection direction, int length, short delay, short button, short interval, byte channels, short period, short samples, ShortBuffer data, short attack_length, short attack_level, short fade_length, short fade_level) {
        type(type);
        direction(direction);
        length(length);
        delay(delay);
        button(button);
        interval(interval);
        channels(channels);
        period(period);
        samples(samples);
        data(data);
        attack_length(attack_length);
        attack_level(attack_level);
        fade_length(fade_length);
        fade_level(fade_level);
        return this;
    }

    public SDL_HapticCustom set(SDL_HapticCustom src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_HapticCustom malloc() {
        return new SDL_HapticCustom(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_HapticCustom calloc() {
        return new SDL_HapticCustom(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_HapticCustom create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticCustom(MemoryUtil.memAddress(container), container);
    }

    public static SDL_HapticCustom create(long address) {
        return new SDL_HapticCustom(address, null);
    }

    public static SDL_HapticCustom createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_HapticCustom(address, null);
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

    public static SDL_HapticCustom malloc(MemoryStack stack) {
        return new SDL_HapticCustom(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_HapticCustom calloc(MemoryStack stack) {
        return new SDL_HapticCustom(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static byte nchannels(long struct) {
        return MemoryUtil.memGetByte(struct + CHANNELS);
    }

    public static short nperiod(long struct) {
        return MemoryUtil.memGetShort(struct + PERIOD);
    }

    public static short nsamples(long struct) {
        return MemoryUtil.memGetShort(struct + SAMPLES);
    }

    public static ShortBuffer ndata(long struct) {
        return MemoryUtil.memShortBuffer(MemoryUtil.memGetAddress(struct + DATA), Byte.toUnsignedInt(nchannels(struct)) * Short.toUnsignedInt(nsamples(struct)));
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

    public static void nchannels(long struct, byte value) {
        MemoryUtil.memPutByte(struct + CHANNELS, value);
    }

    public static void nperiod(long struct, short value) {
        MemoryUtil.memPutShort(struct + PERIOD, value);
    }

    public static void nsamples(long struct, short value) {
        MemoryUtil.memPutShort(struct + SAMPLES, value);
    }

    public static void ndata(long struct, ShortBuffer value) {
        MemoryUtil.memPutAddress(struct + DATA, MemoryUtil.memAddress(value));
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

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DATA));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticCustom$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_HapticCustom, Buffer> implements NativeResource {
        private static final SDL_HapticCustom ELEMENT_FACTORY = SDL_HapticCustom.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_HapticCustom.SIZEOF);
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
        public SDL_HapticCustom getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_HapticEffectType")
        public short type() {
            return SDL_HapticCustom.ntype(address());
        }

        public SDL_HapticDirection direction() {
            return SDL_HapticCustom.ndirection(address());
        }

        @NativeType("Uint32")
        public int length() {
            return SDL_HapticCustom.nlength(address());
        }

        @NativeType("Uint16")
        public short delay() {
            return SDL_HapticCustom.ndelay(address());
        }

        @NativeType("Uint16")
        public short button() {
            return SDL_HapticCustom.nbutton(address());
        }

        @NativeType("Uint16")
        public short interval() {
            return SDL_HapticCustom.ninterval(address());
        }

        @NativeType("Uint8")
        public byte channels() {
            return SDL_HapticCustom.nchannels(address());
        }

        @NativeType("Uint16")
        public short period() {
            return SDL_HapticCustom.nperiod(address());
        }

        @NativeType("Uint16")
        public short samples() {
            return SDL_HapticCustom.nsamples(address());
        }

        @NativeType("Uint16 *")
        public ShortBuffer data() {
            return SDL_HapticCustom.ndata(address());
        }

        @NativeType("Uint16")
        public short attack_length() {
            return SDL_HapticCustom.nattack_length(address());
        }

        @NativeType("Uint16")
        public short attack_level() {
            return SDL_HapticCustom.nattack_level(address());
        }

        @NativeType("Uint16")
        public short fade_length() {
            return SDL_HapticCustom.nfade_length(address());
        }

        @NativeType("Uint16")
        public short fade_level() {
            return SDL_HapticCustom.nfade_level(address());
        }

        public Buffer type(@NativeType("SDL_HapticEffectType") short value) {
            SDL_HapticCustom.ntype(address(), value);
            return this;
        }

        public Buffer direction(SDL_HapticDirection value) {
            SDL_HapticCustom.ndirection(address(), value);
            return this;
        }

        public Buffer direction(Consumer<SDL_HapticDirection> consumer) {
            consumer.accept(direction());
            return this;
        }

        public Buffer length(@NativeType("Uint32") int value) {
            SDL_HapticCustom.nlength(address(), value);
            return this;
        }

        public Buffer delay(@NativeType("Uint16") short value) {
            SDL_HapticCustom.ndelay(address(), value);
            return this;
        }

        public Buffer button(@NativeType("Uint16") short value) {
            SDL_HapticCustom.nbutton(address(), value);
            return this;
        }

        public Buffer interval(@NativeType("Uint16") short value) {
            SDL_HapticCustom.ninterval(address(), value);
            return this;
        }

        public Buffer channels(@NativeType("Uint8") byte value) {
            SDL_HapticCustom.nchannels(address(), value);
            return this;
        }

        public Buffer period(@NativeType("Uint16") short value) {
            SDL_HapticCustom.nperiod(address(), value);
            return this;
        }

        public Buffer samples(@NativeType("Uint16") short value) {
            SDL_HapticCustom.nsamples(address(), value);
            return this;
        }

        public Buffer data(@NativeType("Uint16 *") ShortBuffer value) {
            SDL_HapticCustom.ndata(address(), value);
            return this;
        }

        public Buffer attack_length(@NativeType("Uint16") short value) {
            SDL_HapticCustom.nattack_length(address(), value);
            return this;
        }

        public Buffer attack_level(@NativeType("Uint16") short value) {
            SDL_HapticCustom.nattack_level(address(), value);
            return this;
        }

        public Buffer fade_length(@NativeType("Uint16") short value) {
            SDL_HapticCustom.nfade_length(address(), value);
            return this;
        }

        public Buffer fade_level(@NativeType("Uint16") short value) {
            SDL_HapticCustom.nfade_level(address(), value);
            return this;
        }
    }
}
