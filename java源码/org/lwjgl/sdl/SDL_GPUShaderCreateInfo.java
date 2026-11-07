package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUShaderCreateInfo.class */
public class SDL_GPUShaderCreateInfo extends Struct<SDL_GPUShaderCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CODE_SIZE;
    public static final int CODE;
    public static final int ENTRYPOINT;
    public static final int FORMAT;
    public static final int STAGE;
    public static final int NUM_SAMPLERS;
    public static final int NUM_STORAGE_TEXTURES;
    public static final int NUM_STORAGE_BUFFERS;
    public static final int NUM_UNIFORM_BUFFERS;
    public static final int PROPS;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CODE_SIZE = layout.offsetof(0);
        CODE = layout.offsetof(1);
        ENTRYPOINT = layout.offsetof(2);
        FORMAT = layout.offsetof(3);
        STAGE = layout.offsetof(4);
        NUM_SAMPLERS = layout.offsetof(5);
        NUM_STORAGE_TEXTURES = layout.offsetof(6);
        NUM_STORAGE_BUFFERS = layout.offsetof(7);
        NUM_UNIFORM_BUFFERS = layout.offsetof(8);
        PROPS = layout.offsetof(9);
    }

    protected SDL_GPUShaderCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUShaderCreateInfo create(long address, ByteBuffer container) {
        return new SDL_GPUShaderCreateInfo(address, container);
    }

    public SDL_GPUShaderCreateInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("size_t")
    public long code_size() {
        return ncode_size(address());
    }

    @NativeType("Uint8 const *")
    public ByteBuffer code() {
        return ncode(address());
    }

    @NativeType("char const *")
    public ByteBuffer entrypoint() {
        return nentrypoint(address());
    }

    @NativeType("char const *")
    public String entrypointString() {
        return nentrypointString(address());
    }

    @NativeType("SDL_GPUShaderFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("SDL_GPUShaderStage")
    public int stage() {
        return nstage(address());
    }

    @NativeType("Uint32")
    public int num_samplers() {
        return nnum_samplers(address());
    }

    @NativeType("Uint32")
    public int num_storage_textures() {
        return nnum_storage_textures(address());
    }

    @NativeType("Uint32")
    public int num_storage_buffers() {
        return nnum_storage_buffers(address());
    }

    @NativeType("Uint32")
    public int num_uniform_buffers() {
        return nnum_uniform_buffers(address());
    }

    @NativeType("SDL_PropertiesID")
    public int props() {
        return nprops(address());
    }

    public SDL_GPUShaderCreateInfo code(@NativeType("Uint8 const *") ByteBuffer value) {
        ncode(address(), value);
        return this;
    }

    public SDL_GPUShaderCreateInfo entrypoint(@NativeType("char const *") ByteBuffer value) {
        nentrypoint(address(), value);
        return this;
    }

    public SDL_GPUShaderCreateInfo format(@NativeType("SDL_GPUShaderFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public SDL_GPUShaderCreateInfo stage(@NativeType("SDL_GPUShaderStage") int value) {
        nstage(address(), value);
        return this;
    }

    public SDL_GPUShaderCreateInfo num_samplers(@NativeType("Uint32") int value) {
        nnum_samplers(address(), value);
        return this;
    }

    public SDL_GPUShaderCreateInfo num_storage_textures(@NativeType("Uint32") int value) {
        nnum_storage_textures(address(), value);
        return this;
    }

    public SDL_GPUShaderCreateInfo num_storage_buffers(@NativeType("Uint32") int value) {
        nnum_storage_buffers(address(), value);
        return this;
    }

    public SDL_GPUShaderCreateInfo num_uniform_buffers(@NativeType("Uint32") int value) {
        nnum_uniform_buffers(address(), value);
        return this;
    }

    public SDL_GPUShaderCreateInfo props(@NativeType("SDL_PropertiesID") int value) {
        nprops(address(), value);
        return this;
    }

    public SDL_GPUShaderCreateInfo set(ByteBuffer code, ByteBuffer entrypoint, int format, int stage, int num_samplers, int num_storage_textures, int num_storage_buffers, int num_uniform_buffers, int props) {
        code(code);
        entrypoint(entrypoint);
        format(format);
        stage(stage);
        num_samplers(num_samplers);
        num_storage_textures(num_storage_textures);
        num_storage_buffers(num_storage_buffers);
        num_uniform_buffers(num_uniform_buffers);
        props(props);
        return this;
    }

    public SDL_GPUShaderCreateInfo set(SDL_GPUShaderCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUShaderCreateInfo malloc() {
        return new SDL_GPUShaderCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUShaderCreateInfo calloc() {
        return new SDL_GPUShaderCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUShaderCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUShaderCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUShaderCreateInfo create(long address) {
        return new SDL_GPUShaderCreateInfo(address, null);
    }

    public static SDL_GPUShaderCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUShaderCreateInfo(address, null);
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

    public static SDL_GPUShaderCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUShaderCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUShaderCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUShaderCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ncode_size(long struct) {
        return MemoryUtil.memGetAddress(struct + CODE_SIZE);
    }

    public static ByteBuffer ncode(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + CODE), (int) ncode_size(struct));
    }

    public static ByteBuffer nentrypoint(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + ENTRYPOINT));
    }

    public static String nentrypointString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + ENTRYPOINT));
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int nstage(long struct) {
        return MemoryUtil.memGetInt(struct + STAGE);
    }

    public static int nnum_samplers(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_SAMPLERS);
    }

    public static int nnum_storage_textures(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_STORAGE_TEXTURES);
    }

    public static int nnum_storage_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_STORAGE_BUFFERS);
    }

    public static int nnum_uniform_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_UNIFORM_BUFFERS);
    }

    public static int nprops(long struct) {
        return MemoryUtil.memGetInt(struct + PROPS);
    }

    public static void ncode_size(long struct, long value) {
        MemoryUtil.memPutAddress(struct + CODE_SIZE, value);
    }

    public static void ncode(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + CODE, MemoryUtil.memAddress(value));
        ncode_size(struct, value.remaining());
    }

    public static void nentrypoint(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + ENTRYPOINT, MemoryUtil.memAddress(value));
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void nstage(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGE, value);
    }

    public static void nnum_samplers(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_SAMPLERS, value);
    }

    public static void nnum_storage_textures(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_STORAGE_TEXTURES, value);
    }

    public static void nnum_storage_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_STORAGE_BUFFERS, value);
    }

    public static void nnum_uniform_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_UNIFORM_BUFFERS, value);
    }

    public static void nprops(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROPS, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + CODE));
        Checks.check(MemoryUtil.memGetAddress(struct + ENTRYPOINT));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUShaderCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUShaderCreateInfo, Buffer> implements NativeResource {
        private static final SDL_GPUShaderCreateInfo ELEMENT_FACTORY = SDL_GPUShaderCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUShaderCreateInfo.SIZEOF);
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
        public SDL_GPUShaderCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("size_t")
        public long code_size() {
            return SDL_GPUShaderCreateInfo.ncode_size(address());
        }

        @NativeType("Uint8 const *")
        public ByteBuffer code() {
            return SDL_GPUShaderCreateInfo.ncode(address());
        }

        @NativeType("char const *")
        public ByteBuffer entrypoint() {
            return SDL_GPUShaderCreateInfo.nentrypoint(address());
        }

        @NativeType("char const *")
        public String entrypointString() {
            return SDL_GPUShaderCreateInfo.nentrypointString(address());
        }

        @NativeType("SDL_GPUShaderFormat")
        public int format() {
            return SDL_GPUShaderCreateInfo.nformat(address());
        }

        @NativeType("SDL_GPUShaderStage")
        public int stage() {
            return SDL_GPUShaderCreateInfo.nstage(address());
        }

        @NativeType("Uint32")
        public int num_samplers() {
            return SDL_GPUShaderCreateInfo.nnum_samplers(address());
        }

        @NativeType("Uint32")
        public int num_storage_textures() {
            return SDL_GPUShaderCreateInfo.nnum_storage_textures(address());
        }

        @NativeType("Uint32")
        public int num_storage_buffers() {
            return SDL_GPUShaderCreateInfo.nnum_storage_buffers(address());
        }

        @NativeType("Uint32")
        public int num_uniform_buffers() {
            return SDL_GPUShaderCreateInfo.nnum_uniform_buffers(address());
        }

        @NativeType("SDL_PropertiesID")
        public int props() {
            return SDL_GPUShaderCreateInfo.nprops(address());
        }

        public Buffer code(@NativeType("Uint8 const *") ByteBuffer value) {
            SDL_GPUShaderCreateInfo.ncode(address(), value);
            return this;
        }

        public Buffer entrypoint(@NativeType("char const *") ByteBuffer value) {
            SDL_GPUShaderCreateInfo.nentrypoint(address(), value);
            return this;
        }

        public Buffer format(@NativeType("SDL_GPUShaderFormat") int value) {
            SDL_GPUShaderCreateInfo.nformat(address(), value);
            return this;
        }

        public Buffer stage(@NativeType("SDL_GPUShaderStage") int value) {
            SDL_GPUShaderCreateInfo.nstage(address(), value);
            return this;
        }

        public Buffer num_samplers(@NativeType("Uint32") int value) {
            SDL_GPUShaderCreateInfo.nnum_samplers(address(), value);
            return this;
        }

        public Buffer num_storage_textures(@NativeType("Uint32") int value) {
            SDL_GPUShaderCreateInfo.nnum_storage_textures(address(), value);
            return this;
        }

        public Buffer num_storage_buffers(@NativeType("Uint32") int value) {
            SDL_GPUShaderCreateInfo.nnum_storage_buffers(address(), value);
            return this;
        }

        public Buffer num_uniform_buffers(@NativeType("Uint32") int value) {
            SDL_GPUShaderCreateInfo.nnum_uniform_buffers(address(), value);
            return this;
        }

        public Buffer props(@NativeType("SDL_PropertiesID") int value) {
            SDL_GPUShaderCreateInfo.nprops(address(), value);
            return this;
        }
    }
}
