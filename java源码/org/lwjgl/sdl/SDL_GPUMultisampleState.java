package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUMultisampleState.class */
public class SDL_GPUMultisampleState extends Struct<SDL_GPUMultisampleState> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SAMPLE_COUNT;
    public static final int SAMPLE_MASK;
    public static final int ENABLE_MASK;
    public static final int ENABLE_ALPHA_TO_COVERAGE;
    public static final int PADDING2;
    public static final int PADDING3;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SAMPLE_COUNT = layout.offsetof(0);
        SAMPLE_MASK = layout.offsetof(1);
        ENABLE_MASK = layout.offsetof(2);
        ENABLE_ALPHA_TO_COVERAGE = layout.offsetof(3);
        PADDING2 = layout.offsetof(4);
        PADDING3 = layout.offsetof(5);
    }

    protected SDL_GPUMultisampleState(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUMultisampleState create(long address, ByteBuffer container) {
        return new SDL_GPUMultisampleState(address, container);
    }

    public SDL_GPUMultisampleState(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUSampleCount")
    public int sample_count() {
        return nsample_count(address());
    }

    @NativeType("Uint32")
    public int sample_mask() {
        return nsample_mask(address());
    }

    @NativeType("bool")
    public boolean enable_mask() {
        return nenable_mask(address());
    }

    @NativeType("bool")
    public boolean enable_alpha_to_coverage() {
        return nenable_alpha_to_coverage(address());
    }

    public SDL_GPUMultisampleState sample_count(@NativeType("SDL_GPUSampleCount") int value) {
        nsample_count(address(), value);
        return this;
    }

    public SDL_GPUMultisampleState sample_mask(@NativeType("Uint32") int value) {
        nsample_mask(address(), value);
        return this;
    }

    public SDL_GPUMultisampleState enable_mask(@NativeType("bool") boolean value) {
        nenable_mask(address(), value);
        return this;
    }

    public SDL_GPUMultisampleState enable_alpha_to_coverage(@NativeType("bool") boolean value) {
        nenable_alpha_to_coverage(address(), value);
        return this;
    }

    public SDL_GPUMultisampleState set(int sample_count, int sample_mask, boolean enable_mask, boolean enable_alpha_to_coverage) {
        sample_count(sample_count);
        sample_mask(sample_mask);
        enable_mask(enable_mask);
        enable_alpha_to_coverage(enable_alpha_to_coverage);
        return this;
    }

    public SDL_GPUMultisampleState set(SDL_GPUMultisampleState src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUMultisampleState malloc() {
        return new SDL_GPUMultisampleState(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUMultisampleState calloc() {
        return new SDL_GPUMultisampleState(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUMultisampleState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUMultisampleState(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUMultisampleState create(long address) {
        return new SDL_GPUMultisampleState(address, null);
    }

    public static SDL_GPUMultisampleState createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUMultisampleState(address, null);
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

    public static SDL_GPUMultisampleState malloc(MemoryStack stack) {
        return new SDL_GPUMultisampleState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUMultisampleState calloc(MemoryStack stack) {
        return new SDL_GPUMultisampleState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsample_count(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLE_COUNT);
    }

    public static int nsample_mask(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLE_MASK);
    }

    public static boolean nenable_mask(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLE_MASK)) != 0;
    }

    public static boolean nenable_alpha_to_coverage(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLE_ALPHA_TO_COVERAGE)) != 0;
    }

    public static byte npadding2(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING2);
    }

    public static byte npadding3(long struct) {
        return MemoryUtil.memGetByte(struct + PADDING3);
    }

    public static void nsample_count(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLE_COUNT, value);
    }

    public static void nsample_mask(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLE_MASK, value);
    }

    public static void nenable_mask(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ENABLE_MASK, value ? (byte) 1 : (byte) 0);
    }

    public static void nenable_alpha_to_coverage(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + ENABLE_ALPHA_TO_COVERAGE, value ? (byte) 1 : (byte) 0);
    }

    public static void npadding2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING2, value);
    }

    public static void npadding3(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PADDING3, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUMultisampleState$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUMultisampleState, Buffer> implements NativeResource {
        private static final SDL_GPUMultisampleState ELEMENT_FACTORY = SDL_GPUMultisampleState.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUMultisampleState.SIZEOF);
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
        public SDL_GPUMultisampleState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUSampleCount")
        public int sample_count() {
            return SDL_GPUMultisampleState.nsample_count(address());
        }

        @NativeType("Uint32")
        public int sample_mask() {
            return SDL_GPUMultisampleState.nsample_mask(address());
        }

        @NativeType("bool")
        public boolean enable_mask() {
            return SDL_GPUMultisampleState.nenable_mask(address());
        }

        @NativeType("bool")
        public boolean enable_alpha_to_coverage() {
            return SDL_GPUMultisampleState.nenable_alpha_to_coverage(address());
        }

        public Buffer sample_count(@NativeType("SDL_GPUSampleCount") int value) {
            SDL_GPUMultisampleState.nsample_count(address(), value);
            return this;
        }

        public Buffer sample_mask(@NativeType("Uint32") int value) {
            SDL_GPUMultisampleState.nsample_mask(address(), value);
            return this;
        }

        public Buffer enable_mask(@NativeType("bool") boolean value) {
            SDL_GPUMultisampleState.nenable_mask(address(), value);
            return this;
        }

        public Buffer enable_alpha_to_coverage(@NativeType("bool") boolean value) {
            SDL_GPUMultisampleState.nenable_alpha_to_coverage(address(), value);
            return this;
        }
    }
}
