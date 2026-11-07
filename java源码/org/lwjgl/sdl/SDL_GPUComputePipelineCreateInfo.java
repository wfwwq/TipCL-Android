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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUComputePipelineCreateInfo.class */
public class SDL_GPUComputePipelineCreateInfo extends Struct<SDL_GPUComputePipelineCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CODE_SIZE;
    public static final int CODE;
    public static final int ENTRYPOINT;
    public static final int FORMAT;
    public static final int NUM_SAMPLERS;
    public static final int NUM_READONLY_STORAGE_TEXTURES;
    public static final int NUM_READONLY_STORAGE_BUFFERS;
    public static final int NUM_READWRITE_STORAGE_TEXTURES;
    public static final int NUM_READWRITE_STORAGE_BUFFERS;
    public static final int NUM_UNIFORM_BUFFERS;
    public static final int THREADCOUNT_X;
    public static final int THREADCOUNT_Y;
    public static final int THREADCOUNT_Z;
    public static final int PROPS;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CODE_SIZE = layout.offsetof(0);
        CODE = layout.offsetof(1);
        ENTRYPOINT = layout.offsetof(2);
        FORMAT = layout.offsetof(3);
        NUM_SAMPLERS = layout.offsetof(4);
        NUM_READONLY_STORAGE_TEXTURES = layout.offsetof(5);
        NUM_READONLY_STORAGE_BUFFERS = layout.offsetof(6);
        NUM_READWRITE_STORAGE_TEXTURES = layout.offsetof(7);
        NUM_READWRITE_STORAGE_BUFFERS = layout.offsetof(8);
        NUM_UNIFORM_BUFFERS = layout.offsetof(9);
        THREADCOUNT_X = layout.offsetof(10);
        THREADCOUNT_Y = layout.offsetof(11);
        THREADCOUNT_Z = layout.offsetof(12);
        PROPS = layout.offsetof(13);
    }

    protected SDL_GPUComputePipelineCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUComputePipelineCreateInfo create(long address, ByteBuffer container) {
        return new SDL_GPUComputePipelineCreateInfo(address, container);
    }

    public SDL_GPUComputePipelineCreateInfo(ByteBuffer container) {
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

    @NativeType("Uint32")
    public int num_samplers() {
        return nnum_samplers(address());
    }

    @NativeType("Uint32")
    public int num_readonly_storage_textures() {
        return nnum_readonly_storage_textures(address());
    }

    @NativeType("Uint32")
    public int num_readonly_storage_buffers() {
        return nnum_readonly_storage_buffers(address());
    }

    @NativeType("Uint32")
    public int num_readwrite_storage_textures() {
        return nnum_readwrite_storage_textures(address());
    }

    @NativeType("Uint32")
    public int num_readwrite_storage_buffers() {
        return nnum_readwrite_storage_buffers(address());
    }

    @NativeType("Uint32")
    public int num_uniform_buffers() {
        return nnum_uniform_buffers(address());
    }

    @NativeType("Uint32")
    public int threadcount_x() {
        return nthreadcount_x(address());
    }

    @NativeType("Uint32")
    public int threadcount_y() {
        return nthreadcount_y(address());
    }

    @NativeType("Uint32")
    public int threadcount_z() {
        return nthreadcount_z(address());
    }

    @NativeType("SDL_PropertiesID")
    public int props() {
        return nprops(address());
    }

    public SDL_GPUComputePipelineCreateInfo code(@NativeType("Uint8 const *") ByteBuffer value) {
        ncode(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo entrypoint(@NativeType("char const *") ByteBuffer value) {
        nentrypoint(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo format(@NativeType("SDL_GPUShaderFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo num_samplers(@NativeType("Uint32") int value) {
        nnum_samplers(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo num_readonly_storage_textures(@NativeType("Uint32") int value) {
        nnum_readonly_storage_textures(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo num_readonly_storage_buffers(@NativeType("Uint32") int value) {
        nnum_readonly_storage_buffers(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo num_readwrite_storage_textures(@NativeType("Uint32") int value) {
        nnum_readwrite_storage_textures(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo num_readwrite_storage_buffers(@NativeType("Uint32") int value) {
        nnum_readwrite_storage_buffers(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo num_uniform_buffers(@NativeType("Uint32") int value) {
        nnum_uniform_buffers(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo threadcount_x(@NativeType("Uint32") int value) {
        nthreadcount_x(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo threadcount_y(@NativeType("Uint32") int value) {
        nthreadcount_y(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo threadcount_z(@NativeType("Uint32") int value) {
        nthreadcount_z(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo props(@NativeType("SDL_PropertiesID") int value) {
        nprops(address(), value);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo set(ByteBuffer code, ByteBuffer entrypoint, int format, int num_samplers, int num_readonly_storage_textures, int num_readonly_storage_buffers, int num_readwrite_storage_textures, int num_readwrite_storage_buffers, int num_uniform_buffers, int threadcount_x, int threadcount_y, int threadcount_z, int props) {
        code(code);
        entrypoint(entrypoint);
        format(format);
        num_samplers(num_samplers);
        num_readonly_storage_textures(num_readonly_storage_textures);
        num_readonly_storage_buffers(num_readonly_storage_buffers);
        num_readwrite_storage_textures(num_readwrite_storage_textures);
        num_readwrite_storage_buffers(num_readwrite_storage_buffers);
        num_uniform_buffers(num_uniform_buffers);
        threadcount_x(threadcount_x);
        threadcount_y(threadcount_y);
        threadcount_z(threadcount_z);
        props(props);
        return this;
    }

    public SDL_GPUComputePipelineCreateInfo set(SDL_GPUComputePipelineCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUComputePipelineCreateInfo malloc() {
        return new SDL_GPUComputePipelineCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUComputePipelineCreateInfo calloc() {
        return new SDL_GPUComputePipelineCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUComputePipelineCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUComputePipelineCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUComputePipelineCreateInfo create(long address) {
        return new SDL_GPUComputePipelineCreateInfo(address, null);
    }

    public static SDL_GPUComputePipelineCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUComputePipelineCreateInfo(address, null);
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

    public static SDL_GPUComputePipelineCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUComputePipelineCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUComputePipelineCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUComputePipelineCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nnum_samplers(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_SAMPLERS);
    }

    public static int nnum_readonly_storage_textures(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_READONLY_STORAGE_TEXTURES);
    }

    public static int nnum_readonly_storage_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_READONLY_STORAGE_BUFFERS);
    }

    public static int nnum_readwrite_storage_textures(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_READWRITE_STORAGE_TEXTURES);
    }

    public static int nnum_readwrite_storage_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_READWRITE_STORAGE_BUFFERS);
    }

    public static int nnum_uniform_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_UNIFORM_BUFFERS);
    }

    public static int nthreadcount_x(long struct) {
        return MemoryUtil.memGetInt(struct + THREADCOUNT_X);
    }

    public static int nthreadcount_y(long struct) {
        return MemoryUtil.memGetInt(struct + THREADCOUNT_Y);
    }

    public static int nthreadcount_z(long struct) {
        return MemoryUtil.memGetInt(struct + THREADCOUNT_Z);
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

    public static void nnum_samplers(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_SAMPLERS, value);
    }

    public static void nnum_readonly_storage_textures(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_READONLY_STORAGE_TEXTURES, value);
    }

    public static void nnum_readonly_storage_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_READONLY_STORAGE_BUFFERS, value);
    }

    public static void nnum_readwrite_storage_textures(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_READWRITE_STORAGE_TEXTURES, value);
    }

    public static void nnum_readwrite_storage_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_READWRITE_STORAGE_BUFFERS, value);
    }

    public static void nnum_uniform_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_UNIFORM_BUFFERS, value);
    }

    public static void nthreadcount_x(long struct, int value) {
        MemoryUtil.memPutInt(struct + THREADCOUNT_X, value);
    }

    public static void nthreadcount_y(long struct, int value) {
        MemoryUtil.memPutInt(struct + THREADCOUNT_Y, value);
    }

    public static void nthreadcount_z(long struct, int value) {
        MemoryUtil.memPutInt(struct + THREADCOUNT_Z, value);
    }

    public static void nprops(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROPS, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + CODE));
        Checks.check(MemoryUtil.memGetAddress(struct + ENTRYPOINT));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUComputePipelineCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUComputePipelineCreateInfo, Buffer> implements NativeResource {
        private static final SDL_GPUComputePipelineCreateInfo ELEMENT_FACTORY = SDL_GPUComputePipelineCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUComputePipelineCreateInfo.SIZEOF);
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
        public SDL_GPUComputePipelineCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("size_t")
        public long code_size() {
            return SDL_GPUComputePipelineCreateInfo.ncode_size(address());
        }

        @NativeType("Uint8 const *")
        public ByteBuffer code() {
            return SDL_GPUComputePipelineCreateInfo.ncode(address());
        }

        @NativeType("char const *")
        public ByteBuffer entrypoint() {
            return SDL_GPUComputePipelineCreateInfo.nentrypoint(address());
        }

        @NativeType("char const *")
        public String entrypointString() {
            return SDL_GPUComputePipelineCreateInfo.nentrypointString(address());
        }

        @NativeType("SDL_GPUShaderFormat")
        public int format() {
            return SDL_GPUComputePipelineCreateInfo.nformat(address());
        }

        @NativeType("Uint32")
        public int num_samplers() {
            return SDL_GPUComputePipelineCreateInfo.nnum_samplers(address());
        }

        @NativeType("Uint32")
        public int num_readonly_storage_textures() {
            return SDL_GPUComputePipelineCreateInfo.nnum_readonly_storage_textures(address());
        }

        @NativeType("Uint32")
        public int num_readonly_storage_buffers() {
            return SDL_GPUComputePipelineCreateInfo.nnum_readonly_storage_buffers(address());
        }

        @NativeType("Uint32")
        public int num_readwrite_storage_textures() {
            return SDL_GPUComputePipelineCreateInfo.nnum_readwrite_storage_textures(address());
        }

        @NativeType("Uint32")
        public int num_readwrite_storage_buffers() {
            return SDL_GPUComputePipelineCreateInfo.nnum_readwrite_storage_buffers(address());
        }

        @NativeType("Uint32")
        public int num_uniform_buffers() {
            return SDL_GPUComputePipelineCreateInfo.nnum_uniform_buffers(address());
        }

        @NativeType("Uint32")
        public int threadcount_x() {
            return SDL_GPUComputePipelineCreateInfo.nthreadcount_x(address());
        }

        @NativeType("Uint32")
        public int threadcount_y() {
            return SDL_GPUComputePipelineCreateInfo.nthreadcount_y(address());
        }

        @NativeType("Uint32")
        public int threadcount_z() {
            return SDL_GPUComputePipelineCreateInfo.nthreadcount_z(address());
        }

        @NativeType("SDL_PropertiesID")
        public int props() {
            return SDL_GPUComputePipelineCreateInfo.nprops(address());
        }

        public Buffer code(@NativeType("Uint8 const *") ByteBuffer value) {
            SDL_GPUComputePipelineCreateInfo.ncode(address(), value);
            return this;
        }

        public Buffer entrypoint(@NativeType("char const *") ByteBuffer value) {
            SDL_GPUComputePipelineCreateInfo.nentrypoint(address(), value);
            return this;
        }

        public Buffer format(@NativeType("SDL_GPUShaderFormat") int value) {
            SDL_GPUComputePipelineCreateInfo.nformat(address(), value);
            return this;
        }

        public Buffer num_samplers(@NativeType("Uint32") int value) {
            SDL_GPUComputePipelineCreateInfo.nnum_samplers(address(), value);
            return this;
        }

        public Buffer num_readonly_storage_textures(@NativeType("Uint32") int value) {
            SDL_GPUComputePipelineCreateInfo.nnum_readonly_storage_textures(address(), value);
            return this;
        }

        public Buffer num_readonly_storage_buffers(@NativeType("Uint32") int value) {
            SDL_GPUComputePipelineCreateInfo.nnum_readonly_storage_buffers(address(), value);
            return this;
        }

        public Buffer num_readwrite_storage_textures(@NativeType("Uint32") int value) {
            SDL_GPUComputePipelineCreateInfo.nnum_readwrite_storage_textures(address(), value);
            return this;
        }

        public Buffer num_readwrite_storage_buffers(@NativeType("Uint32") int value) {
            SDL_GPUComputePipelineCreateInfo.nnum_readwrite_storage_buffers(address(), value);
            return this;
        }

        public Buffer num_uniform_buffers(@NativeType("Uint32") int value) {
            SDL_GPUComputePipelineCreateInfo.nnum_uniform_buffers(address(), value);
            return this;
        }

        public Buffer threadcount_x(@NativeType("Uint32") int value) {
            SDL_GPUComputePipelineCreateInfo.nthreadcount_x(address(), value);
            return this;
        }

        public Buffer threadcount_y(@NativeType("Uint32") int value) {
            SDL_GPUComputePipelineCreateInfo.nthreadcount_y(address(), value);
            return this;
        }

        public Buffer threadcount_z(@NativeType("Uint32") int value) {
            SDL_GPUComputePipelineCreateInfo.nthreadcount_z(address(), value);
            return this;
        }

        public Buffer props(@NativeType("SDL_PropertiesID") int value) {
            SDL_GPUComputePipelineCreateInfo.nprops(address(), value);
            return this;
        }
    }
}
