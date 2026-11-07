package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.sdl.SDL_GPUVertexAttribute;
import org.lwjgl.sdl.SDL_GPUVertexBufferDescription;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUVertexInputState.class */
public class SDL_GPUVertexInputState extends Struct<SDL_GPUVertexInputState> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERTEX_BUFFER_DESCRIPTIONS;
    public static final int NUM_VERTEX_BUFFERS;
    public static final int VERTEX_ATTRIBUTES;
    public static final int NUM_VERTEX_ATTRIBUTES;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERTEX_BUFFER_DESCRIPTIONS = layout.offsetof(0);
        NUM_VERTEX_BUFFERS = layout.offsetof(1);
        VERTEX_ATTRIBUTES = layout.offsetof(2);
        NUM_VERTEX_ATTRIBUTES = layout.offsetof(3);
    }

    protected SDL_GPUVertexInputState(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUVertexInputState create(long address, ByteBuffer container) {
        return new SDL_GPUVertexInputState(address, container);
    }

    public SDL_GPUVertexInputState(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUVertexBufferDescription const *")
    public SDL_GPUVertexBufferDescription.Buffer vertex_buffer_descriptions() {
        return nvertex_buffer_descriptions(address());
    }

    @NativeType("Uint32")
    public int num_vertex_buffers() {
        return nnum_vertex_buffers(address());
    }

    @NativeType("SDL_GPUVertexAttribute const *")
    public SDL_GPUVertexAttribute.Buffer vertex_attributes() {
        return nvertex_attributes(address());
    }

    @NativeType("Uint32")
    public int num_vertex_attributes() {
        return nnum_vertex_attributes(address());
    }

    public SDL_GPUVertexInputState vertex_buffer_descriptions(@NativeType("SDL_GPUVertexBufferDescription const *") SDL_GPUVertexBufferDescription.Buffer value) {
        nvertex_buffer_descriptions(address(), value);
        return this;
    }

    public SDL_GPUVertexInputState num_vertex_buffers(@NativeType("Uint32") int value) {
        nnum_vertex_buffers(address(), value);
        return this;
    }

    public SDL_GPUVertexInputState vertex_attributes(@NativeType("SDL_GPUVertexAttribute const *") SDL_GPUVertexAttribute.Buffer value) {
        nvertex_attributes(address(), value);
        return this;
    }

    public SDL_GPUVertexInputState num_vertex_attributes(@NativeType("Uint32") int value) {
        nnum_vertex_attributes(address(), value);
        return this;
    }

    public SDL_GPUVertexInputState set(SDL_GPUVertexBufferDescription.Buffer vertex_buffer_descriptions, int num_vertex_buffers, SDL_GPUVertexAttribute.Buffer vertex_attributes, int num_vertex_attributes) {
        vertex_buffer_descriptions(vertex_buffer_descriptions);
        num_vertex_buffers(num_vertex_buffers);
        vertex_attributes(vertex_attributes);
        num_vertex_attributes(num_vertex_attributes);
        return this;
    }

    public SDL_GPUVertexInputState set(SDL_GPUVertexInputState src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUVertexInputState malloc() {
        return new SDL_GPUVertexInputState(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUVertexInputState calloc() {
        return new SDL_GPUVertexInputState(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUVertexInputState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUVertexInputState(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUVertexInputState create(long address) {
        return new SDL_GPUVertexInputState(address, null);
    }

    public static SDL_GPUVertexInputState createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUVertexInputState(address, null);
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

    public static SDL_GPUVertexInputState malloc(MemoryStack stack) {
        return new SDL_GPUVertexInputState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUVertexInputState calloc(MemoryStack stack) {
        return new SDL_GPUVertexInputState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static SDL_GPUVertexBufferDescription.Buffer nvertex_buffer_descriptions(long struct) {
        return SDL_GPUVertexBufferDescription.createSafe(MemoryUtil.memGetAddress(struct + VERTEX_BUFFER_DESCRIPTIONS), nnum_vertex_buffers(struct));
    }

    public static int nnum_vertex_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_VERTEX_BUFFERS);
    }

    public static SDL_GPUVertexAttribute.Buffer nvertex_attributes(long struct) {
        return SDL_GPUVertexAttribute.createSafe(MemoryUtil.memGetAddress(struct + VERTEX_ATTRIBUTES), nnum_vertex_attributes(struct));
    }

    public static int nnum_vertex_attributes(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_VERTEX_ATTRIBUTES);
    }

    public static void nvertex_buffer_descriptions(long struct, SDL_GPUVertexBufferDescription.Buffer value) {
        MemoryUtil.memPutAddress(struct + VERTEX_BUFFER_DESCRIPTIONS, MemoryUtil.memAddressSafe(value));
        nnum_vertex_buffers(struct, value == null ? 0 : value.remaining());
    }

    public static void nnum_vertex_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_VERTEX_BUFFERS, value);
    }

    public static void nvertex_attributes(long struct, SDL_GPUVertexAttribute.Buffer value) {
        MemoryUtil.memPutAddress(struct + VERTEX_ATTRIBUTES, MemoryUtil.memAddressSafe(value));
        nnum_vertex_attributes(struct, value == null ? 0 : value.remaining());
    }

    public static void nnum_vertex_attributes(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_VERTEX_ATTRIBUTES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUVertexInputState$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUVertexInputState, Buffer> implements NativeResource {
        private static final SDL_GPUVertexInputState ELEMENT_FACTORY = SDL_GPUVertexInputState.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUVertexInputState.SIZEOF);
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
        public SDL_GPUVertexInputState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUVertexBufferDescription const *")
        public SDL_GPUVertexBufferDescription.Buffer vertex_buffer_descriptions() {
            return SDL_GPUVertexInputState.nvertex_buffer_descriptions(address());
        }

        @NativeType("Uint32")
        public int num_vertex_buffers() {
            return SDL_GPUVertexInputState.nnum_vertex_buffers(address());
        }

        @NativeType("SDL_GPUVertexAttribute const *")
        public SDL_GPUVertexAttribute.Buffer vertex_attributes() {
            return SDL_GPUVertexInputState.nvertex_attributes(address());
        }

        @NativeType("Uint32")
        public int num_vertex_attributes() {
            return SDL_GPUVertexInputState.nnum_vertex_attributes(address());
        }

        public Buffer vertex_buffer_descriptions(@NativeType("SDL_GPUVertexBufferDescription const *") SDL_GPUVertexBufferDescription.Buffer value) {
            SDL_GPUVertexInputState.nvertex_buffer_descriptions(address(), value);
            return this;
        }

        public Buffer num_vertex_buffers(@NativeType("Uint32") int value) {
            SDL_GPUVertexInputState.nnum_vertex_buffers(address(), value);
            return this;
        }

        public Buffer vertex_attributes(@NativeType("SDL_GPUVertexAttribute const *") SDL_GPUVertexAttribute.Buffer value) {
            SDL_GPUVertexInputState.nvertex_attributes(address(), value);
            return this;
        }

        public Buffer num_vertex_attributes(@NativeType("Uint32") int value) {
            SDL_GPUVertexInputState.nnum_vertex_attributes(address(), value);
            return this;
        }
    }
}
