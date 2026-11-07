package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUIndexedIndirectDrawCommand.class */
public class SDL_GPUIndexedIndirectDrawCommand extends Struct<SDL_GPUIndexedIndirectDrawCommand> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NUM_INDICES;
    public static final int NUM_INSTANCES;
    public static final int FIRST_INDEX;
    public static final int VERTEX_OFFSET;
    public static final int FIRST_INSTANCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NUM_INDICES = layout.offsetof(0);
        NUM_INSTANCES = layout.offsetof(1);
        FIRST_INDEX = layout.offsetof(2);
        VERTEX_OFFSET = layout.offsetof(3);
        FIRST_INSTANCE = layout.offsetof(4);
    }

    protected SDL_GPUIndexedIndirectDrawCommand(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUIndexedIndirectDrawCommand create(long address, ByteBuffer container) {
        return new SDL_GPUIndexedIndirectDrawCommand(address, container);
    }

    public SDL_GPUIndexedIndirectDrawCommand(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint32")
    public int num_indices() {
        return nnum_indices(address());
    }

    @NativeType("Uint32")
    public int num_instances() {
        return nnum_instances(address());
    }

    @NativeType("Uint32")
    public int first_index() {
        return nfirst_index(address());
    }

    @NativeType("Sint32")
    public int vertex_offset() {
        return nvertex_offset(address());
    }

    @NativeType("Uint32")
    public int first_instance() {
        return nfirst_instance(address());
    }

    public SDL_GPUIndexedIndirectDrawCommand num_indices(@NativeType("Uint32") int value) {
        nnum_indices(address(), value);
        return this;
    }

    public SDL_GPUIndexedIndirectDrawCommand num_instances(@NativeType("Uint32") int value) {
        nnum_instances(address(), value);
        return this;
    }

    public SDL_GPUIndexedIndirectDrawCommand first_index(@NativeType("Uint32") int value) {
        nfirst_index(address(), value);
        return this;
    }

    public SDL_GPUIndexedIndirectDrawCommand vertex_offset(@NativeType("Sint32") int value) {
        nvertex_offset(address(), value);
        return this;
    }

    public SDL_GPUIndexedIndirectDrawCommand first_instance(@NativeType("Uint32") int value) {
        nfirst_instance(address(), value);
        return this;
    }

    public SDL_GPUIndexedIndirectDrawCommand set(int num_indices, int num_instances, int first_index, int vertex_offset, int first_instance) {
        num_indices(num_indices);
        num_instances(num_instances);
        first_index(first_index);
        vertex_offset(vertex_offset);
        first_instance(first_instance);
        return this;
    }

    public SDL_GPUIndexedIndirectDrawCommand set(SDL_GPUIndexedIndirectDrawCommand src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUIndexedIndirectDrawCommand malloc() {
        return new SDL_GPUIndexedIndirectDrawCommand(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUIndexedIndirectDrawCommand calloc() {
        return new SDL_GPUIndexedIndirectDrawCommand(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUIndexedIndirectDrawCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUIndexedIndirectDrawCommand(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUIndexedIndirectDrawCommand create(long address) {
        return new SDL_GPUIndexedIndirectDrawCommand(address, null);
    }

    public static SDL_GPUIndexedIndirectDrawCommand createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUIndexedIndirectDrawCommand(address, null);
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

    public static SDL_GPUIndexedIndirectDrawCommand malloc(MemoryStack stack) {
        return new SDL_GPUIndexedIndirectDrawCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUIndexedIndirectDrawCommand calloc(MemoryStack stack) {
        return new SDL_GPUIndexedIndirectDrawCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nnum_indices(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_INDICES);
    }

    public static int nnum_instances(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_INSTANCES);
    }

    public static int nfirst_index(long struct) {
        return MemoryUtil.memGetInt(struct + FIRST_INDEX);
    }

    public static int nvertex_offset(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEX_OFFSET);
    }

    public static int nfirst_instance(long struct) {
        return MemoryUtil.memGetInt(struct + FIRST_INSTANCE);
    }

    public static void nnum_indices(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_INDICES, value);
    }

    public static void nnum_instances(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_INSTANCES, value);
    }

    public static void nfirst_index(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRST_INDEX, value);
    }

    public static void nvertex_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEX_OFFSET, value);
    }

    public static void nfirst_instance(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRST_INSTANCE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUIndexedIndirectDrawCommand$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUIndexedIndirectDrawCommand, Buffer> implements NativeResource {
        private static final SDL_GPUIndexedIndirectDrawCommand ELEMENT_FACTORY = SDL_GPUIndexedIndirectDrawCommand.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUIndexedIndirectDrawCommand.SIZEOF);
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
        public SDL_GPUIndexedIndirectDrawCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint32")
        public int num_indices() {
            return SDL_GPUIndexedIndirectDrawCommand.nnum_indices(address());
        }

        @NativeType("Uint32")
        public int num_instances() {
            return SDL_GPUIndexedIndirectDrawCommand.nnum_instances(address());
        }

        @NativeType("Uint32")
        public int first_index() {
            return SDL_GPUIndexedIndirectDrawCommand.nfirst_index(address());
        }

        @NativeType("Sint32")
        public int vertex_offset() {
            return SDL_GPUIndexedIndirectDrawCommand.nvertex_offset(address());
        }

        @NativeType("Uint32")
        public int first_instance() {
            return SDL_GPUIndexedIndirectDrawCommand.nfirst_instance(address());
        }

        public Buffer num_indices(@NativeType("Uint32") int value) {
            SDL_GPUIndexedIndirectDrawCommand.nnum_indices(address(), value);
            return this;
        }

        public Buffer num_instances(@NativeType("Uint32") int value) {
            SDL_GPUIndexedIndirectDrawCommand.nnum_instances(address(), value);
            return this;
        }

        public Buffer first_index(@NativeType("Uint32") int value) {
            SDL_GPUIndexedIndirectDrawCommand.nfirst_index(address(), value);
            return this;
        }

        public Buffer vertex_offset(@NativeType("Sint32") int value) {
            SDL_GPUIndexedIndirectDrawCommand.nvertex_offset(address(), value);
            return this;
        }

        public Buffer first_instance(@NativeType("Uint32") int value) {
            SDL_GPUIndexedIndirectDrawCommand.nfirst_instance(address(), value);
            return this;
        }
    }
}
