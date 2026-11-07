package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.sdl.SDL_GPUColorTargetDescription;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUGraphicsPipelineTargetInfo.class */
public class SDL_GPUGraphicsPipelineTargetInfo extends Struct<SDL_GPUGraphicsPipelineTargetInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COLOR_TARGET_DESCRIPTIONS;
    public static final int NUM_COLOR_TARGETS;
    public static final int DEPTH_STENCIL_FORMAT;
    public static final int HAS_DEPTH_STENCIL_TARGET;
    public static final int PADDING1;
    public static final int PADDING2;
    public static final int PADDING3;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(4), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COLOR_TARGET_DESCRIPTIONS = layout.offsetof(0);
        NUM_COLOR_TARGETS = layout.offsetof(1);
        DEPTH_STENCIL_FORMAT = layout.offsetof(2);
        HAS_DEPTH_STENCIL_TARGET = layout.offsetof(3);
        PADDING1 = layout.offsetof(4);
        PADDING2 = layout.offsetof(5);
        PADDING3 = layout.offsetof(6);
    }

    protected SDL_GPUGraphicsPipelineTargetInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUGraphicsPipelineTargetInfo create(long address, ByteBuffer container) {
        return new SDL_GPUGraphicsPipelineTargetInfo(address, container);
    }

    public SDL_GPUGraphicsPipelineTargetInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUColorTargetDescription const *")
    public SDL_GPUColorTargetDescription.Buffer color_target_descriptions() {
        return ncolor_target_descriptions(address());
    }

    @NativeType("Uint32")
    public int num_color_targets() {
        return nnum_color_targets(address());
    }

    @NativeType("SDL_GPUTextureFormat")
    public int depth_stencil_format() {
        return ndepth_stencil_format(address());
    }

    @NativeType("bool")
    public boolean has_depth_stencil_target() {
        return nhas_depth_stencil_target(address());
    }

    public SDL_GPUGraphicsPipelineTargetInfo color_target_descriptions(@NativeType("SDL_GPUColorTargetDescription const *") SDL_GPUColorTargetDescription.Buffer value) {
        ncolor_target_descriptions(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineTargetInfo num_color_targets(@NativeType("Uint32") int value) {
        nnum_color_targets(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineTargetInfo depth_stencil_format(@NativeType("SDL_GPUTextureFormat") int value) {
        ndepth_stencil_format(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineTargetInfo has_depth_stencil_target(@NativeType("bool") boolean value) {
        nhas_depth_stencil_target(address(), value);
        return this;
    }

    public SDL_GPUGraphicsPipelineTargetInfo set(SDL_GPUColorTargetDescription.Buffer color_target_descriptions, int num_color_targets, int depth_stencil_format, boolean has_depth_stencil_target) {
        color_target_descriptions(color_target_descriptions);
        num_color_targets(num_color_targets);
        depth_stencil_format(depth_stencil_format);
        has_depth_stencil_target(has_depth_stencil_target);
        return this;
    }

    public SDL_GPUGraphicsPipelineTargetInfo set(SDL_GPUGraphicsPipelineTargetInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUGraphicsPipelineTargetInfo malloc() {
        return new SDL_GPUGraphicsPipelineTargetInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUGraphicsPipelineTargetInfo calloc() {
        return new SDL_GPUGraphicsPipelineTargetInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUGraphicsPipelineTargetInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUGraphicsPipelineTargetInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUGraphicsPipelineTargetInfo create(long address) {
        return new SDL_GPUGraphicsPipelineTargetInfo(address, null);
    }

    public static SDL_GPUGraphicsPipelineTargetInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUGraphicsPipelineTargetInfo(address, null);
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

    public static SDL_GPUGraphicsPipelineTargetInfo malloc(MemoryStack stack) {
        return new SDL_GPUGraphicsPipelineTargetInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUGraphicsPipelineTargetInfo calloc(MemoryStack stack) {
        return new SDL_GPUGraphicsPipelineTargetInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static SDL_GPUColorTargetDescription.Buffer ncolor_target_descriptions(long struct) {
        return SDL_GPUColorTargetDescription.createSafe(MemoryUtil.memGetAddress(struct + COLOR_TARGET_DESCRIPTIONS), nnum_color_targets(struct));
    }

    public static int nnum_color_targets(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_COLOR_TARGETS);
    }

    public static int ndepth_stencil_format(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTH_STENCIL_FORMAT);
    }

    public static boolean nhas_depth_stencil_target(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) HAS_DEPTH_STENCIL_TARGET)) != 0;
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

    public static void ncolor_target_descriptions(long struct, SDL_GPUColorTargetDescription.Buffer value) {
        MemoryUtil.memPutAddress(struct + COLOR_TARGET_DESCRIPTIONS, MemoryUtil.memAddressSafe(value));
        nnum_color_targets(struct, value == null ? 0 : value.remaining());
    }

    public static void nnum_color_targets(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_COLOR_TARGETS, value);
    }

    public static void ndepth_stencil_format(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTH_STENCIL_FORMAT, value);
    }

    public static void nhas_depth_stencil_target(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + HAS_DEPTH_STENCIL_TARGET, value ? (byte) 1 : (byte) 0);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUGraphicsPipelineTargetInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUGraphicsPipelineTargetInfo, Buffer> implements NativeResource {
        private static final SDL_GPUGraphicsPipelineTargetInfo ELEMENT_FACTORY = SDL_GPUGraphicsPipelineTargetInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUGraphicsPipelineTargetInfo.SIZEOF);
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
        public SDL_GPUGraphicsPipelineTargetInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUColorTargetDescription const *")
        public SDL_GPUColorTargetDescription.Buffer color_target_descriptions() {
            return SDL_GPUGraphicsPipelineTargetInfo.ncolor_target_descriptions(address());
        }

        @NativeType("Uint32")
        public int num_color_targets() {
            return SDL_GPUGraphicsPipelineTargetInfo.nnum_color_targets(address());
        }

        @NativeType("SDL_GPUTextureFormat")
        public int depth_stencil_format() {
            return SDL_GPUGraphicsPipelineTargetInfo.ndepth_stencil_format(address());
        }

        @NativeType("bool")
        public boolean has_depth_stencil_target() {
            return SDL_GPUGraphicsPipelineTargetInfo.nhas_depth_stencil_target(address());
        }

        public Buffer color_target_descriptions(@NativeType("SDL_GPUColorTargetDescription const *") SDL_GPUColorTargetDescription.Buffer value) {
            SDL_GPUGraphicsPipelineTargetInfo.ncolor_target_descriptions(address(), value);
            return this;
        }

        public Buffer num_color_targets(@NativeType("Uint32") int value) {
            SDL_GPUGraphicsPipelineTargetInfo.nnum_color_targets(address(), value);
            return this;
        }

        public Buffer depth_stencil_format(@NativeType("SDL_GPUTextureFormat") int value) {
            SDL_GPUGraphicsPipelineTargetInfo.ndepth_stencil_format(address(), value);
            return this;
        }

        public Buffer has_depth_stencil_target(@NativeType("bool") boolean value) {
            SDL_GPUGraphicsPipelineTargetInfo.nhas_depth_stencil_target(address(), value);
            return this;
        }
    }
}
