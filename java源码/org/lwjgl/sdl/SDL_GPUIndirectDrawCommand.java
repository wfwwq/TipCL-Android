package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUIndirectDrawCommand.class */
public class SDL_GPUIndirectDrawCommand extends Struct<SDL_GPUIndirectDrawCommand> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NUM_VERTICES;
    public static final int NUM_INSTANCES;
    public static final int FIRST_VERTEX;
    public static final int FIRST_INSTANCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NUM_VERTICES = layout.offsetof(0);
        NUM_INSTANCES = layout.offsetof(1);
        FIRST_VERTEX = layout.offsetof(2);
        FIRST_INSTANCE = layout.offsetof(3);
    }

    protected SDL_GPUIndirectDrawCommand(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUIndirectDrawCommand create(long address, ByteBuffer container) {
        return new SDL_GPUIndirectDrawCommand(address, container);
    }

    public SDL_GPUIndirectDrawCommand(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint32")
    public int num_vertices() {
        return nnum_vertices(address());
    }

    @NativeType("Uint32")
    public int num_instances() {
        return nnum_instances(address());
    }

    @NativeType("Uint32")
    public int first_vertex() {
        return nfirst_vertex(address());
    }

    @NativeType("Uint32")
    public int first_instance() {
        return nfirst_instance(address());
    }

    public SDL_GPUIndirectDrawCommand num_vertices(@NativeType("Uint32") int value) {
        nnum_vertices(address(), value);
        return this;
    }

    public SDL_GPUIndirectDrawCommand num_instances(@NativeType("Uint32") int value) {
        nnum_instances(address(), value);
        return this;
    }

    public SDL_GPUIndirectDrawCommand first_vertex(@NativeType("Uint32") int value) {
        nfirst_vertex(address(), value);
        return this;
    }

    public SDL_GPUIndirectDrawCommand first_instance(@NativeType("Uint32") int value) {
        nfirst_instance(address(), value);
        return this;
    }

    public SDL_GPUIndirectDrawCommand set(int num_vertices, int num_instances, int first_vertex, int first_instance) {
        num_vertices(num_vertices);
        num_instances(num_instances);
        first_vertex(first_vertex);
        first_instance(first_instance);
        return this;
    }

    public SDL_GPUIndirectDrawCommand set(SDL_GPUIndirectDrawCommand src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUIndirectDrawCommand malloc() {
        return new SDL_GPUIndirectDrawCommand(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUIndirectDrawCommand calloc() {
        return new SDL_GPUIndirectDrawCommand(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUIndirectDrawCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUIndirectDrawCommand(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUIndirectDrawCommand create(long address) {
        return new SDL_GPUIndirectDrawCommand(address, null);
    }

    public static SDL_GPUIndirectDrawCommand createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUIndirectDrawCommand(address, null);
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

    public static SDL_GPUIndirectDrawCommand malloc(MemoryStack stack) {
        return new SDL_GPUIndirectDrawCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUIndirectDrawCommand calloc(MemoryStack stack) {
        return new SDL_GPUIndirectDrawCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nnum_vertices(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_VERTICES);
    }

    public static int nnum_instances(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_INSTANCES);
    }

    public static int nfirst_vertex(long struct) {
        return MemoryUtil.memGetInt(struct + FIRST_VERTEX);
    }

    public static int nfirst_instance(long struct) {
        return MemoryUtil.memGetInt(struct + FIRST_INSTANCE);
    }

    public static void nnum_vertices(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_VERTICES, value);
    }

    public static void nnum_instances(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUM_INSTANCES, value);
    }

    public static void nfirst_vertex(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRST_VERTEX, value);
    }

    public static void nfirst_instance(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRST_INSTANCE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUIndirectDrawCommand$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUIndirectDrawCommand, Buffer> implements NativeResource {
        private static final SDL_GPUIndirectDrawCommand ELEMENT_FACTORY = SDL_GPUIndirectDrawCommand.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUIndirectDrawCommand.SIZEOF);
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
        public SDL_GPUIndirectDrawCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint32")
        public int num_vertices() {
            return SDL_GPUIndirectDrawCommand.nnum_vertices(address());
        }

        @NativeType("Uint32")
        public int num_instances() {
            return SDL_GPUIndirectDrawCommand.nnum_instances(address());
        }

        @NativeType("Uint32")
        public int first_vertex() {
            return SDL_GPUIndirectDrawCommand.nfirst_vertex(address());
        }

        @NativeType("Uint32")
        public int first_instance() {
            return SDL_GPUIndirectDrawCommand.nfirst_instance(address());
        }

        public Buffer num_vertices(@NativeType("Uint32") int value) {
            SDL_GPUIndirectDrawCommand.nnum_vertices(address(), value);
            return this;
        }

        public Buffer num_instances(@NativeType("Uint32") int value) {
            SDL_GPUIndirectDrawCommand.nnum_instances(address(), value);
            return this;
        }

        public Buffer first_vertex(@NativeType("Uint32") int value) {
            SDL_GPUIndirectDrawCommand.nfirst_vertex(address(), value);
            return this;
        }

        public Buffer first_instance(@NativeType("Uint32") int value) {
            SDL_GPUIndirectDrawCommand.nfirst_instance(address(), value);
            return this;
        }
    }
}
