package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUStencilOpState.class */
public class SDL_GPUStencilOpState extends Struct<SDL_GPUStencilOpState> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FAIL_OP;
    public static final int PASS_OP;
    public static final int DEPTH_FAIL_OP;
    public static final int COMPARE_OP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FAIL_OP = layout.offsetof(0);
        PASS_OP = layout.offsetof(1);
        DEPTH_FAIL_OP = layout.offsetof(2);
        COMPARE_OP = layout.offsetof(3);
    }

    protected SDL_GPUStencilOpState(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUStencilOpState create(long address, ByteBuffer container) {
        return new SDL_GPUStencilOpState(address, container);
    }

    public SDL_GPUStencilOpState(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUStencilOp")
    public int fail_op() {
        return nfail_op(address());
    }

    @NativeType("SDL_GPUStencilOp")
    public int pass_op() {
        return npass_op(address());
    }

    @NativeType("SDL_GPUStencilOp")
    public int depth_fail_op() {
        return ndepth_fail_op(address());
    }

    @NativeType("SDL_GPUCompareOp")
    public int compare_op() {
        return ncompare_op(address());
    }

    public SDL_GPUStencilOpState fail_op(@NativeType("SDL_GPUStencilOp") int value) {
        nfail_op(address(), value);
        return this;
    }

    public SDL_GPUStencilOpState pass_op(@NativeType("SDL_GPUStencilOp") int value) {
        npass_op(address(), value);
        return this;
    }

    public SDL_GPUStencilOpState depth_fail_op(@NativeType("SDL_GPUStencilOp") int value) {
        ndepth_fail_op(address(), value);
        return this;
    }

    public SDL_GPUStencilOpState compare_op(@NativeType("SDL_GPUCompareOp") int value) {
        ncompare_op(address(), value);
        return this;
    }

    public SDL_GPUStencilOpState set(int fail_op, int pass_op, int depth_fail_op, int compare_op) {
        fail_op(fail_op);
        pass_op(pass_op);
        depth_fail_op(depth_fail_op);
        compare_op(compare_op);
        return this;
    }

    public SDL_GPUStencilOpState set(SDL_GPUStencilOpState src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUStencilOpState malloc() {
        return new SDL_GPUStencilOpState(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUStencilOpState calloc() {
        return new SDL_GPUStencilOpState(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUStencilOpState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUStencilOpState(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUStencilOpState create(long address) {
        return new SDL_GPUStencilOpState(address, null);
    }

    public static SDL_GPUStencilOpState createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUStencilOpState(address, null);
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

    public static SDL_GPUStencilOpState malloc(MemoryStack stack) {
        return new SDL_GPUStencilOpState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUStencilOpState calloc(MemoryStack stack) {
        return new SDL_GPUStencilOpState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nfail_op(long struct) {
        return MemoryUtil.memGetInt(struct + FAIL_OP);
    }

    public static int npass_op(long struct) {
        return MemoryUtil.memGetInt(struct + PASS_OP);
    }

    public static int ndepth_fail_op(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTH_FAIL_OP);
    }

    public static int ncompare_op(long struct) {
        return MemoryUtil.memGetInt(struct + COMPARE_OP);
    }

    public static void nfail_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + FAIL_OP, value);
    }

    public static void npass_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + PASS_OP, value);
    }

    public static void ndepth_fail_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTH_FAIL_OP, value);
    }

    public static void ncompare_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPARE_OP, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUStencilOpState$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUStencilOpState, Buffer> implements NativeResource {
        private static final SDL_GPUStencilOpState ELEMENT_FACTORY = SDL_GPUStencilOpState.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUStencilOpState.SIZEOF);
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
        public SDL_GPUStencilOpState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUStencilOp")
        public int fail_op() {
            return SDL_GPUStencilOpState.nfail_op(address());
        }

        @NativeType("SDL_GPUStencilOp")
        public int pass_op() {
            return SDL_GPUStencilOpState.npass_op(address());
        }

        @NativeType("SDL_GPUStencilOp")
        public int depth_fail_op() {
            return SDL_GPUStencilOpState.ndepth_fail_op(address());
        }

        @NativeType("SDL_GPUCompareOp")
        public int compare_op() {
            return SDL_GPUStencilOpState.ncompare_op(address());
        }

        public Buffer fail_op(@NativeType("SDL_GPUStencilOp") int value) {
            SDL_GPUStencilOpState.nfail_op(address(), value);
            return this;
        }

        public Buffer pass_op(@NativeType("SDL_GPUStencilOp") int value) {
            SDL_GPUStencilOpState.npass_op(address(), value);
            return this;
        }

        public Buffer depth_fail_op(@NativeType("SDL_GPUStencilOp") int value) {
            SDL_GPUStencilOpState.ndepth_fail_op(address(), value);
            return this;
        }

        public Buffer compare_op(@NativeType("SDL_GPUCompareOp") int value) {
            SDL_GPUStencilOpState.ncompare_op(address(), value);
            return this;
        }
    }
}
