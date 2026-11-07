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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticEffect.class */
public class SDL_HapticEffect extends Struct<SDL_HapticEffect> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int CONSTANT;
    public static final int PERIODIC;
    public static final int CONDITION;
    public static final int RAMP;
    public static final int LEFTRIGHT;
    public static final int CUSTOM;

    static {
        Struct.Layout layout = __union(__member(2), __member(SDL_HapticConstant.SIZEOF, SDL_HapticConstant.ALIGNOF), __member(SDL_HapticPeriodic.SIZEOF, SDL_HapticPeriodic.ALIGNOF), __member(SDL_HapticCondition.SIZEOF, SDL_HapticCondition.ALIGNOF), __member(SDL_HapticRamp.SIZEOF, SDL_HapticRamp.ALIGNOF), __member(SDL_HapticLeftRight.SIZEOF, SDL_HapticLeftRight.ALIGNOF), __member(SDL_HapticCustom.SIZEOF, SDL_HapticCustom.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        CONSTANT = layout.offsetof(1);
        PERIODIC = layout.offsetof(2);
        CONDITION = layout.offsetof(3);
        RAMP = layout.offsetof(4);
        LEFTRIGHT = layout.offsetof(5);
        CUSTOM = layout.offsetof(6);
    }

    protected SDL_HapticEffect(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_HapticEffect create(long address, ByteBuffer container) {
        return new SDL_HapticEffect(address, container);
    }

    public SDL_HapticEffect(ByteBuffer container) {
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

    public SDL_HapticConstant constant() {
        return nconstant(address());
    }

    public SDL_HapticPeriodic periodic() {
        return nperiodic(address());
    }

    public SDL_HapticCondition condition() {
        return ncondition(address());
    }

    public SDL_HapticRamp ramp() {
        return nramp(address());
    }

    public SDL_HapticLeftRight leftright() {
        return nleftright(address());
    }

    public SDL_HapticCustom custom() {
        return ncustom(address());
    }

    public SDL_HapticEffect type(@NativeType("SDL_HapticEffectType") short value) {
        ntype(address(), value);
        return this;
    }

    public SDL_HapticEffect constant(SDL_HapticConstant value) {
        nconstant(address(), value);
        return this;
    }

    public SDL_HapticEffect constant(Consumer<SDL_HapticConstant> consumer) {
        consumer.accept(constant());
        return this;
    }

    public SDL_HapticEffect periodic(SDL_HapticPeriodic value) {
        nperiodic(address(), value);
        return this;
    }

    public SDL_HapticEffect periodic(Consumer<SDL_HapticPeriodic> consumer) {
        consumer.accept(periodic());
        return this;
    }

    public SDL_HapticEffect condition(SDL_HapticCondition value) {
        ncondition(address(), value);
        return this;
    }

    public SDL_HapticEffect condition(Consumer<SDL_HapticCondition> consumer) {
        consumer.accept(condition());
        return this;
    }

    public SDL_HapticEffect ramp(SDL_HapticRamp value) {
        nramp(address(), value);
        return this;
    }

    public SDL_HapticEffect ramp(Consumer<SDL_HapticRamp> consumer) {
        consumer.accept(ramp());
        return this;
    }

    public SDL_HapticEffect leftright(SDL_HapticLeftRight value) {
        nleftright(address(), value);
        return this;
    }

    public SDL_HapticEffect leftright(Consumer<SDL_HapticLeftRight> consumer) {
        consumer.accept(leftright());
        return this;
    }

    public SDL_HapticEffect custom(SDL_HapticCustom value) {
        ncustom(address(), value);
        return this;
    }

    public SDL_HapticEffect custom(Consumer<SDL_HapticCustom> consumer) {
        consumer.accept(custom());
        return this;
    }

    public SDL_HapticEffect set(SDL_HapticEffect src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_HapticEffect malloc() {
        return new SDL_HapticEffect(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_HapticEffect calloc() {
        return new SDL_HapticEffect(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_HapticEffect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticEffect(MemoryUtil.memAddress(container), container);
    }

    public static SDL_HapticEffect create(long address) {
        return new SDL_HapticEffect(address, null);
    }

    public static SDL_HapticEffect createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_HapticEffect(address, null);
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

    public static SDL_HapticEffect malloc(MemoryStack stack) {
        return new SDL_HapticEffect(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_HapticEffect calloc(MemoryStack stack) {
        return new SDL_HapticEffect(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static SDL_HapticConstant nconstant(long struct) {
        return SDL_HapticConstant.create(struct + CONSTANT);
    }

    public static SDL_HapticPeriodic nperiodic(long struct) {
        return SDL_HapticPeriodic.create(struct + PERIODIC);
    }

    public static SDL_HapticCondition ncondition(long struct) {
        return SDL_HapticCondition.create(struct + CONDITION);
    }

    public static SDL_HapticRamp nramp(long struct) {
        return SDL_HapticRamp.create(struct + RAMP);
    }

    public static SDL_HapticLeftRight nleftright(long struct) {
        return SDL_HapticLeftRight.create(struct + LEFTRIGHT);
    }

    public static SDL_HapticCustom ncustom(long struct) {
        return SDL_HapticCustom.create(struct + CUSTOM);
    }

    public static void ntype(long struct, short value) {
        MemoryUtil.memPutShort(struct + TYPE, value);
    }

    public static void nconstant(long struct, SDL_HapticConstant value) {
        MemoryUtil.memCopy(value.address(), struct + CONSTANT, SDL_HapticConstant.SIZEOF);
    }

    public static void nperiodic(long struct, SDL_HapticPeriodic value) {
        MemoryUtil.memCopy(value.address(), struct + PERIODIC, SDL_HapticPeriodic.SIZEOF);
    }

    public static void ncondition(long struct, SDL_HapticCondition value) {
        MemoryUtil.memCopy(value.address(), struct + CONDITION, SDL_HapticCondition.SIZEOF);
    }

    public static void nramp(long struct, SDL_HapticRamp value) {
        MemoryUtil.memCopy(value.address(), struct + RAMP, SDL_HapticRamp.SIZEOF);
    }

    public static void nleftright(long struct, SDL_HapticLeftRight value) {
        MemoryUtil.memCopy(value.address(), struct + LEFTRIGHT, SDL_HapticLeftRight.SIZEOF);
    }

    public static void ncustom(long struct, SDL_HapticCustom value) {
        MemoryUtil.memCopy(value.address(), struct + CUSTOM, SDL_HapticCustom.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_HapticEffect$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_HapticEffect, Buffer> implements NativeResource {
        private static final SDL_HapticEffect ELEMENT_FACTORY = SDL_HapticEffect.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_HapticEffect.SIZEOF);
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
        public SDL_HapticEffect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_HapticEffectType")
        public short type() {
            return SDL_HapticEffect.ntype(address());
        }

        public SDL_HapticConstant constant() {
            return SDL_HapticEffect.nconstant(address());
        }

        public SDL_HapticPeriodic periodic() {
            return SDL_HapticEffect.nperiodic(address());
        }

        public SDL_HapticCondition condition() {
            return SDL_HapticEffect.ncondition(address());
        }

        public SDL_HapticRamp ramp() {
            return SDL_HapticEffect.nramp(address());
        }

        public SDL_HapticLeftRight leftright() {
            return SDL_HapticEffect.nleftright(address());
        }

        public SDL_HapticCustom custom() {
            return SDL_HapticEffect.ncustom(address());
        }

        public Buffer type(@NativeType("SDL_HapticEffectType") short value) {
            SDL_HapticEffect.ntype(address(), value);
            return this;
        }

        public Buffer constant(SDL_HapticConstant value) {
            SDL_HapticEffect.nconstant(address(), value);
            return this;
        }

        public Buffer constant(Consumer<SDL_HapticConstant> consumer) {
            consumer.accept(constant());
            return this;
        }

        public Buffer periodic(SDL_HapticPeriodic value) {
            SDL_HapticEffect.nperiodic(address(), value);
            return this;
        }

        public Buffer periodic(Consumer<SDL_HapticPeriodic> consumer) {
            consumer.accept(periodic());
            return this;
        }

        public Buffer condition(SDL_HapticCondition value) {
            SDL_HapticEffect.ncondition(address(), value);
            return this;
        }

        public Buffer condition(Consumer<SDL_HapticCondition> consumer) {
            consumer.accept(condition());
            return this;
        }

        public Buffer ramp(SDL_HapticRamp value) {
            SDL_HapticEffect.nramp(address(), value);
            return this;
        }

        public Buffer ramp(Consumer<SDL_HapticRamp> consumer) {
            consumer.accept(ramp());
            return this;
        }

        public Buffer leftright(SDL_HapticLeftRight value) {
            SDL_HapticEffect.nleftright(address(), value);
            return this;
        }

        public Buffer leftright(Consumer<SDL_HapticLeftRight> consumer) {
            consumer.accept(leftright());
            return this;
        }

        public Buffer custom(SDL_HapticCustom value) {
            SDL_HapticEffect.ncustom(address(), value);
            return this;
        }

        public Buffer custom(Consumer<SDL_HapticCustom> consumer) {
            consumer.accept(custom());
            return this;
        }
    }
}
