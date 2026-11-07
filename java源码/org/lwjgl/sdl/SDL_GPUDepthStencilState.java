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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUDepthStencilState.class */
public class SDL_GPUDepthStencilState extends Struct<SDL_GPUDepthStencilState> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COMPARE_OP;
    public static final int BACK_STENCIL_STATE;
    public static final int FRONT_STENCIL_STATE;
    public static final int COMPARE_MASK;
    public static final int WRITE_MASK;
    public static final int ENABLE_DEPTH_TEST;
    public static final int ENABLE_DEPTH_WRITE;
    public static final int ENABLE_STENCIL_TEST;
    public static final int PADDING1;
    public static final int PADDING2;
    public static final int PADDING3;

    static {
        Struct.Layout layout = __struct(__member(4), __member(SDL_GPUStencilOpState.SIZEOF, SDL_GPUStencilOpState.ALIGNOF), __member(SDL_GPUStencilOpState.SIZEOF, SDL_GPUStencilOpState.ALIGNOF), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COMPARE_OP = layout.offsetof(0);
        BACK_STENCIL_STATE = layout.offsetof(1);
        FRONT_STENCIL_STATE = layout.offsetof(2);
        COMPARE_MASK = layout.offsetof(3);
        WRITE_MASK = layout.offsetof(4);
        ENABLE_DEPTH_TEST = layout.offsetof(5);
        ENABLE_DEPTH_WRITE = layout.offsetof(6);
        ENABLE_STENCIL_TEST = layout.offsetof(7);
        PADDING1 = layout.offsetof(8);
        PADDING2 = layout.offsetof(9);
        PADDING3 = layout.offsetof(10);
    }

    protected SDL_GPUDepthStencilState(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUDepthStencilState create(long address, ByteBuffer container) {
        return new SDL_GPUDepthStencilState(address, container);
    }

    public SDL_GPUDepthStencilState(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUCompareOp")
    public int compare_op() {
        return ncompare_op(address());
    }

    public SDL_GPUStencilOpState back_stencil_state() {
        return nback_stencil_state(address());
    }

    public SDL_GPUStencilOpState front_stencil_state() {
        return nfront_stencil_state(address());
    }

    @NativeType("Uint8")
    public byte compare_mask() {
        return ncompare_mask(address());
    }

    @NativeType("Uint8")
    public byte write_mask() {
        return nwrite_mask(address());
    }

    @NativeType("bool")
    public boolean enable_depth_test() {
        return nenable_depth_test(address());
    }

    @NativeType("bool")
    public boolean enable_depth_write() {
        return nenable_depth_write(address());
    }

    @NativeType("bool")
    public boolean enable_stencil_test() {
        return nenable_stencil_test(address());
    }

    public SDL_GPUDepthStencilState compare_op(@NativeType("SDL_GPUCompareOp") int value) {
        ncompare_op(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilState back_stencil_state(SDL_GPUStencilOpState value) {
        nback_stencil_state(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilState back_stencil_state(Consumer<SDL_GPUStencilOpState> consumer) {
        consumer.accept(back_stencil_state());
        return this;
    }

    public SDL_GPUDepthStencilState front_stencil_state(SDL_GPUStencilOpState value) {
        nfront_stencil_state(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilState front_stencil_state(Consumer<SDL_GPUStencilOpState> consumer) {
        consumer.accept(front_stencil_state());
        return this;
    }

    public SDL_GPUDepthStencilState compare_mask(@NativeType("Uint8") byte value) {
        ncompare_mask(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilState write_mask(@NativeType("Uint8") byte value) {
        nwrite_mask(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilState enable_depth_test(@NativeType("bool") boolean value) {
        nenable_depth_test(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilState enable_depth_write(@NativeType("bool") boolean value) {
        nenable_depth_write(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilState enable_stencil_test(@NativeType("bool") boolean value) {
        nenable_stencil_test(address(), value);
        return this;
    }

    public SDL_GPUDepthStencilState set(int compare_op, SDL_GPUStencilOpState back_stencil_state, SDL_GPUStencilOpState front_stencil_state, byte compare_mask, byte write_mask, boolean enable_depth_test, boolean enable_depth_write, boolean enable_stencil_test) {
        compare_op(compare_op);
        back_stencil_state(back_stencil_state);
        front_stencil_state(front_stencil_state);
        compare_mask(compare_mask);
        write_mask(write_mask);
        enable_depth_test(enable_depth_test);
        enable_depth_write(enable_depth_write);
        enable_stencil_test(enable_stencil_test);
        return this;
    }

    public SDL_GPUDepthStencilState set(SDL_GPUDepthStencilState src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUDepthStencilState malloc() {
        return new SDL_GPUDepthStencilState(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUDepthStencilState calloc() {
        return new SDL_GPUDepthStencilState(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUDepthStencilState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUDepthStencilState(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUDepthStencilState create(long address) {
        return new SDL_GPUDepthStencilState(address, null);
    }

    public static SDL_GPUDepthStencilState createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUDepthStencilState(address, null);
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

    public static SDL_GPUDepthStencilState malloc(MemoryStack stack) {
        return new SDL_GPUDepthStencilState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUDepthStencilState calloc(MemoryStack stack) {
        return new SDL_GPUDepthStencilState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ncompare_op(long struct) {
        return MemoryUtil.memGetInt(struct + COMPARE_OP);
    }

    public static SDL_GPUStencilOpState nback_stencil_state(long struct) {
        return SDL_GPUStencilOpState.create(struct + BACK_STENCIL_STATE);
    }

    public static SDL_GPUStencilOpState nfront_stencil_state(long struct) {
        return SDL_GPUStencilOpState.create(struct + FRONT_STENCIL_STATE);
    }

    public static byte ncompare_mask(long struct) {
        return MemoryUtil.memGetByte(struct + COMPARE_MASK);
    }

    public static byte nwrite_mask(long struct) {
        return MemoryUtil.memGetByte(struct + WRITE_MASK);
    }

    public static boolean nenable_depth_test(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLE_DEPTH_TEST)) != 0;
    }

    public static boolean nenable_depth_write(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLE_DEPTH_WRITE)) != 0;
    }

    public static boolean nenable_stencil_test(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLE_STENCIL_TEST)) != 0;
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

    public static void ncompare_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPARE_OP, value);
    }

    public static void nback_stencil_state(long struct, SDL_GPUStencilOpState value) {
        MemoryUtil.memCopy(value.address(), struct + BACK_STENCIL_STATE, SDL_GPUStencilOpState.SIZEOF);
    }

    public static void nfront_stencil_state(long struct, SDL_GPUStencilOpState value) {
        MemoryUtil.memCopy(value.address(), struct + FRONT_STENCIL_STATE, SDL_GPUStencilOpState.SIZEOF);
    }

    public static void ncompare_mask(long struct, byte value) {
        MemoryUtil.memPutByte(struct + COMPARE_MASK, value);
    }

    public static void nwrite_mask(long struct, byte value) {
        MemoryUtil.memPutByte(struct + WRITE_MASK, value);
    }

    public static void nenable_depth_test(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ENABLE_DEPTH_TEST, value ? (byte) 1 : (byte) 0);
    }

    public static void nenable_depth_write(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ENABLE_DEPTH_WRITE, value ? (byte) 1 : (byte) 0);
    }

    public static void nenable_stencil_test(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ENABLE_STENCIL_TEST, value ? (byte) 1 : (byte) 0);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUDepthStencilState$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUDepthStencilState, Buffer> implements NativeResource {
        private static final SDL_GPUDepthStencilState ELEMENT_FACTORY = SDL_GPUDepthStencilState.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUDepthStencilState.SIZEOF);
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
        public SDL_GPUDepthStencilState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUCompareOp")
        public int compare_op() {
            return SDL_GPUDepthStencilState.ncompare_op(address());
        }

        public SDL_GPUStencilOpState back_stencil_state() {
            return SDL_GPUDepthStencilState.nback_stencil_state(address());
        }

        public SDL_GPUStencilOpState front_stencil_state() {
            return SDL_GPUDepthStencilState.nfront_stencil_state(address());
        }

        @NativeType("Uint8")
        public byte compare_mask() {
            return SDL_GPUDepthStencilState.ncompare_mask(address());
        }

        @NativeType("Uint8")
        public byte write_mask() {
            return SDL_GPUDepthStencilState.nwrite_mask(address());
        }

        @NativeType("bool")
        public boolean enable_depth_test() {
            return SDL_GPUDepthStencilState.nenable_depth_test(address());
        }

        @NativeType("bool")
        public boolean enable_depth_write() {
            return SDL_GPUDepthStencilState.nenable_depth_write(address());
        }

        @NativeType("bool")
        public boolean enable_stencil_test() {
            return SDL_GPUDepthStencilState.nenable_stencil_test(address());
        }

        public Buffer compare_op(@NativeType("SDL_GPUCompareOp") int value) {
            SDL_GPUDepthStencilState.ncompare_op(address(), value);
            return this;
        }

        public Buffer back_stencil_state(SDL_GPUStencilOpState value) {
            SDL_GPUDepthStencilState.nback_stencil_state(address(), value);
            return this;
        }

        public Buffer back_stencil_state(Consumer<SDL_GPUStencilOpState> consumer) {
            consumer.accept(back_stencil_state());
            return this;
        }

        public Buffer front_stencil_state(SDL_GPUStencilOpState value) {
            SDL_GPUDepthStencilState.nfront_stencil_state(address(), value);
            return this;
        }

        public Buffer front_stencil_state(Consumer<SDL_GPUStencilOpState> consumer) {
            consumer.accept(front_stencil_state());
            return this;
        }

        public Buffer compare_mask(@NativeType("Uint8") byte value) {
            SDL_GPUDepthStencilState.ncompare_mask(address(), value);
            return this;
        }

        public Buffer write_mask(@NativeType("Uint8") byte value) {
            SDL_GPUDepthStencilState.nwrite_mask(address(), value);
            return this;
        }

        public Buffer enable_depth_test(@NativeType("bool") boolean value) {
            SDL_GPUDepthStencilState.nenable_depth_test(address(), value);
            return this;
        }

        public Buffer enable_depth_write(@NativeType("bool") boolean value) {
            SDL_GPUDepthStencilState.nenable_depth_write(address(), value);
            return this;
        }

        public Buffer enable_stencil_test(@NativeType("bool") boolean value) {
            SDL_GPUDepthStencilState.nenable_stencil_test(address(), value);
            return this;
        }
    }
}
