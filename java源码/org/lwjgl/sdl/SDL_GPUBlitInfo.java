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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUBlitInfo.class */
public class SDL_GPUBlitInfo extends Struct<SDL_GPUBlitInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SOURCE;
    public static final int DESTINATION;
    public static final int LOAD_OP;
    public static final int CLEAR_COLOR;
    public static final int FLIP_MODE;
    public static final int FILTER;
    public static final int CYCLE;
    public static final int PADDING1;
    public static final int PADDING2;
    public static final int PADDING3;

    static {
        Struct.Layout layout = __struct(__member(SDL_GPUBlitRegion.SIZEOF, SDL_GPUBlitRegion.ALIGNOF), __member(SDL_GPUBlitRegion.SIZEOF, SDL_GPUBlitRegion.ALIGNOF), __member(4), __member(SDL_FColor.SIZEOF, SDL_FColor.ALIGNOF), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SOURCE = layout.offsetof(0);
        DESTINATION = layout.offsetof(1);
        LOAD_OP = layout.offsetof(2);
        CLEAR_COLOR = layout.offsetof(3);
        FLIP_MODE = layout.offsetof(4);
        FILTER = layout.offsetof(5);
        CYCLE = layout.offsetof(6);
        PADDING1 = layout.offsetof(7);
        PADDING2 = layout.offsetof(8);
        PADDING3 = layout.offsetof(9);
    }

    protected SDL_GPUBlitInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUBlitInfo create(long address, ByteBuffer container) {
        return new SDL_GPUBlitInfo(address, container);
    }

    public SDL_GPUBlitInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public SDL_GPUBlitRegion source() {
        return nsource(address());
    }

    public SDL_GPUBlitRegion destination() {
        return ndestination(address());
    }

    @NativeType("SDL_GPULoadOp")
    public int load_op() {
        return nload_op(address());
    }

    public SDL_FColor clear_color() {
        return nclear_color(address());
    }

    @NativeType("SDL_FlipMode")
    public int flip_mode() {
        return nflip_mode(address());
    }

    @NativeType("SDL_GPUFilter")
    public int filter() {
        return nfilter(address());
    }

    @NativeType("bool")
    public boolean cycle() {
        return ncycle(address());
    }

    public SDL_GPUBlitInfo source(SDL_GPUBlitRegion value) {
        nsource(address(), value);
        return this;
    }

    public SDL_GPUBlitInfo source(Consumer<SDL_GPUBlitRegion> consumer) {
        consumer.accept(source());
        return this;
    }

    public SDL_GPUBlitInfo destination(SDL_GPUBlitRegion value) {
        ndestination(address(), value);
        return this;
    }

    public SDL_GPUBlitInfo destination(Consumer<SDL_GPUBlitRegion> consumer) {
        consumer.accept(destination());
        return this;
    }

    public SDL_GPUBlitInfo load_op(@NativeType("SDL_GPULoadOp") int value) {
        nload_op(address(), value);
        return this;
    }

    public SDL_GPUBlitInfo clear_color(SDL_FColor value) {
        nclear_color(address(), value);
        return this;
    }

    public SDL_GPUBlitInfo clear_color(Consumer<SDL_FColor> consumer) {
        consumer.accept(clear_color());
        return this;
    }

    public SDL_GPUBlitInfo flip_mode(@NativeType("SDL_FlipMode") int value) {
        nflip_mode(address(), value);
        return this;
    }

    public SDL_GPUBlitInfo filter(@NativeType("SDL_GPUFilter") int value) {
        nfilter(address(), value);
        return this;
    }

    public SDL_GPUBlitInfo cycle(@NativeType("bool") boolean value) {
        ncycle(address(), value);
        return this;
    }

    public SDL_GPUBlitInfo set(SDL_GPUBlitRegion source, SDL_GPUBlitRegion destination, int load_op, SDL_FColor clear_color, int flip_mode, int filter, boolean cycle) {
        source(source);
        destination(destination);
        load_op(load_op);
        clear_color(clear_color);
        flip_mode(flip_mode);
        filter(filter);
        cycle(cycle);
        return this;
    }

    public SDL_GPUBlitInfo set(SDL_GPUBlitInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUBlitInfo malloc() {
        return new SDL_GPUBlitInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUBlitInfo calloc() {
        return new SDL_GPUBlitInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUBlitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUBlitInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUBlitInfo create(long address) {
        return new SDL_GPUBlitInfo(address, null);
    }

    public static SDL_GPUBlitInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUBlitInfo(address, null);
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

    public static SDL_GPUBlitInfo malloc(MemoryStack stack) {
        return new SDL_GPUBlitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUBlitInfo calloc(MemoryStack stack) {
        return new SDL_GPUBlitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static SDL_GPUBlitRegion nsource(long struct) {
        return SDL_GPUBlitRegion.create(struct + SOURCE);
    }

    public static SDL_GPUBlitRegion ndestination(long struct) {
        return SDL_GPUBlitRegion.create(struct + DESTINATION);
    }

    public static int nload_op(long struct) {
        return MemoryUtil.memGetInt(struct + LOAD_OP);
    }

    public static SDL_FColor nclear_color(long struct) {
        return SDL_FColor.create(struct + CLEAR_COLOR);
    }

    public static int nflip_mode(long struct) {
        return MemoryUtil.memGetInt(struct + FLIP_MODE);
    }

    public static int nfilter(long struct) {
        return MemoryUtil.memGetInt(struct + FILTER);
    }

    public static boolean ncycle(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) CYCLE)) != 0;
    }

    public static byte npadding1(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING1);
    }

    public static byte npadding2(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING2);
    }

    public static byte npadding3(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING3);
    }

    public static void nsource(long struct, SDL_GPUBlitRegion value) {
        MemoryUtil.memCopy(value.address(), struct + SOURCE, SDL_GPUBlitRegion.SIZEOF);
    }

    public static void ndestination(long struct, SDL_GPUBlitRegion value) {
        MemoryUtil.memCopy(value.address(), struct + DESTINATION, SDL_GPUBlitRegion.SIZEOF);
    }

    public static void nload_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOAD_OP, value);
    }

    public static void nclear_color(long struct, SDL_FColor value) {
        MemoryUtil.memCopy(value.address(), struct + CLEAR_COLOR, SDL_FColor.SIZEOF);
    }

    public static void nflip_mode(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLIP_MODE, value);
    }

    public static void nfilter(long struct, int value) {
        MemoryUtil.memPutInt(struct + FILTER, value);
    }

    public static void ncycle(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + CYCLE, value ? (byte) 1 : (byte) 0);
    }

    public static void npadding1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING1, value);
    }

    public static void npadding2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING2, value);
    }

    public static void npadding3(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING3, value);
    }

    public static void validate(long struct) {
        SDL_GPUBlitRegion.validate(struct + SOURCE);
        SDL_GPUBlitRegion.validate(struct + DESTINATION);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUBlitInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUBlitInfo, Buffer> implements NativeResource {
        private static final SDL_GPUBlitInfo ELEMENT_FACTORY = SDL_GPUBlitInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUBlitInfo.SIZEOF);
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
        public SDL_GPUBlitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public SDL_GPUBlitRegion source() {
            return SDL_GPUBlitInfo.nsource(address());
        }

        public SDL_GPUBlitRegion destination() {
            return SDL_GPUBlitInfo.ndestination(address());
        }

        @NativeType("SDL_GPULoadOp")
        public int load_op() {
            return SDL_GPUBlitInfo.nload_op(address());
        }

        public SDL_FColor clear_color() {
            return SDL_GPUBlitInfo.nclear_color(address());
        }

        @NativeType("SDL_FlipMode")
        public int flip_mode() {
            return SDL_GPUBlitInfo.nflip_mode(address());
        }

        @NativeType("SDL_GPUFilter")
        public int filter() {
            return SDL_GPUBlitInfo.nfilter(address());
        }

        @NativeType("bool")
        public boolean cycle() {
            return SDL_GPUBlitInfo.ncycle(address());
        }

        public Buffer source(SDL_GPUBlitRegion value) {
            SDL_GPUBlitInfo.nsource(address(), value);
            return this;
        }

        public Buffer source(Consumer<SDL_GPUBlitRegion> consumer) {
            consumer.accept(source());
            return this;
        }

        public Buffer destination(SDL_GPUBlitRegion value) {
            SDL_GPUBlitInfo.ndestination(address(), value);
            return this;
        }

        public Buffer destination(Consumer<SDL_GPUBlitRegion> consumer) {
            consumer.accept(destination());
            return this;
        }

        public Buffer load_op(@NativeType("SDL_GPULoadOp") int value) {
            SDL_GPUBlitInfo.nload_op(address(), value);
            return this;
        }

        public Buffer clear_color(SDL_FColor value) {
            SDL_GPUBlitInfo.nclear_color(address(), value);
            return this;
        }

        public Buffer clear_color(Consumer<SDL_FColor> consumer) {
            consumer.accept(clear_color());
            return this;
        }

        public Buffer flip_mode(@NativeType("SDL_FlipMode") int value) {
            SDL_GPUBlitInfo.nflip_mode(address(), value);
            return this;
        }

        public Buffer filter(@NativeType("SDL_GPUFilter") int value) {
            SDL_GPUBlitInfo.nfilter(address(), value);
            return this;
        }

        public Buffer cycle(@NativeType("bool") boolean value) {
            SDL_GPUBlitInfo.ncycle(address(), value);
            return this;
        }
    }
}
