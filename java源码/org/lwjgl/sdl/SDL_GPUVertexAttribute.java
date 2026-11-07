package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUVertexAttribute.class */
public class SDL_GPUVertexAttribute extends Struct<SDL_GPUVertexAttribute> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LOCATION;
    public static final int BUFFER_SLOT;
    public static final int FORMAT;
    public static final int OFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LOCATION = layout.offsetof(0);
        BUFFER_SLOT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        OFFSET = layout.offsetof(3);
    }

    protected SDL_GPUVertexAttribute(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUVertexAttribute create(long address, ByteBuffer container) {
        return new SDL_GPUVertexAttribute(address, container);
    }

    public SDL_GPUVertexAttribute(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint32")
    public int location() {
        return nlocation(address());
    }

    @NativeType("Uint32")
    public int buffer_slot() {
        return nbuffer_slot(address());
    }

    @NativeType("SDL_GPUVertexElementFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("Uint32")
    public int offset() {
        return noffset(address());
    }

    public SDL_GPUVertexAttribute location(@NativeType("Uint32") int value) {
        nlocation(address(), value);
        return this;
    }

    public SDL_GPUVertexAttribute buffer_slot(@NativeType("Uint32") int value) {
        nbuffer_slot(address(), value);
        return this;
    }

    public SDL_GPUVertexAttribute format(@NativeType("SDL_GPUVertexElementFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public SDL_GPUVertexAttribute offset(@NativeType("Uint32") int value) {
        noffset(address(), value);
        return this;
    }

    public SDL_GPUVertexAttribute set(int location, int buffer_slot, int format, int offset) {
        location(location);
        buffer_slot(buffer_slot);
        format(format);
        offset(offset);
        return this;
    }

    public SDL_GPUVertexAttribute set(SDL_GPUVertexAttribute src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUVertexAttribute malloc() {
        return new SDL_GPUVertexAttribute(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUVertexAttribute calloc() {
        return new SDL_GPUVertexAttribute(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUVertexAttribute create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUVertexAttribute(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUVertexAttribute create(long address) {
        return new SDL_GPUVertexAttribute(address, null);
    }

    public static SDL_GPUVertexAttribute createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUVertexAttribute(address, null);
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

    public static SDL_GPUVertexAttribute malloc(MemoryStack stack) {
        return new SDL_GPUVertexAttribute(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUVertexAttribute calloc(MemoryStack stack) {
        return new SDL_GPUVertexAttribute(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nlocation(long struct) {
        return MemoryUtil.memGetInt(struct + LOCATION);
    }

    public static int nbuffer_slot(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFER_SLOT);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int noffset(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET);
    }

    public static void nlocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOCATION, value);
    }

    public static void nbuffer_slot(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFER_SLOT, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUVertexAttribute$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUVertexAttribute, Buffer> implements NativeResource {
        private static final SDL_GPUVertexAttribute ELEMENT_FACTORY = SDL_GPUVertexAttribute.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUVertexAttribute.SIZEOF);
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
        public SDL_GPUVertexAttribute getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint32")
        public int location() {
            return SDL_GPUVertexAttribute.nlocation(address());
        }

        @NativeType("Uint32")
        public int buffer_slot() {
            return SDL_GPUVertexAttribute.nbuffer_slot(address());
        }

        @NativeType("SDL_GPUVertexElementFormat")
        public int format() {
            return SDL_GPUVertexAttribute.nformat(address());
        }

        @NativeType("Uint32")
        public int offset() {
            return SDL_GPUVertexAttribute.noffset(address());
        }

        public Buffer location(@NativeType("Uint32") int value) {
            SDL_GPUVertexAttribute.nlocation(address(), value);
            return this;
        }

        public Buffer buffer_slot(@NativeType("Uint32") int value) {
            SDL_GPUVertexAttribute.nbuffer_slot(address(), value);
            return this;
        }

        public Buffer format(@NativeType("SDL_GPUVertexElementFormat") int value) {
            SDL_GPUVertexAttribute.nformat(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("Uint32") int value) {
            SDL_GPUVertexAttribute.noffset(address(), value);
            return this;
        }
    }
}
