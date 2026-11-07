package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Vertex.class */
public class SDL_Vertex extends Struct<SDL_Vertex> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int POSITION;
    public static final int COLOR;
    public static final int TEX_COORD;

    static {
        Struct.Layout layout = __struct(__member(SDL_FPoint.SIZEOF, SDL_FPoint.ALIGNOF), __member(SDL_FColor.SIZEOF, SDL_FColor.ALIGNOF), __member(SDL_FPoint.SIZEOF, SDL_FPoint.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        POSITION = layout.offsetof(0);
        COLOR = layout.offsetof(1);
        TEX_COORD = layout.offsetof(2);
    }

    protected SDL_Vertex(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_Vertex create(long address, ByteBuffer container) {
        return new SDL_Vertex(address, container);
    }

    public SDL_Vertex(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public SDL_FPoint position$() {
        return nposition$(address());
    }

    public SDL_FColor color() {
        return ncolor(address());
    }

    public SDL_FPoint tex_coord() {
        return ntex_coord(address());
    }

    public SDL_Vertex position$(SDL_FPoint value) {
        nposition$(address(), value);
        return this;
    }

    public SDL_Vertex position$(Consumer<SDL_FPoint> consumer) {
        consumer.accept(position$());
        return this;
    }

    public SDL_Vertex color(SDL_FColor value) {
        ncolor(address(), value);
        return this;
    }

    public SDL_Vertex color(Consumer<SDL_FColor> consumer) {
        consumer.accept(color());
        return this;
    }

    public SDL_Vertex tex_coord(SDL_FPoint value) {
        ntex_coord(address(), value);
        return this;
    }

    public SDL_Vertex tex_coord(Consumer<SDL_FPoint> consumer) {
        consumer.accept(tex_coord());
        return this;
    }

    public SDL_Vertex set(SDL_FPoint position$, SDL_FColor color, SDL_FPoint tex_coord) {
        position$(position$);
        color(color);
        tex_coord(tex_coord);
        return this;
    }

    public SDL_Vertex set(SDL_Vertex src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_Vertex malloc() {
        return new SDL_Vertex(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_Vertex calloc() {
        return new SDL_Vertex(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_Vertex create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Vertex(MemoryUtil.memAddress(container), container);
    }

    public static SDL_Vertex create(long address) {
        return new SDL_Vertex(address, null);
    }

    public static SDL_Vertex createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_Vertex(address, null);
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

    public static SDL_Vertex malloc(MemoryStack stack) {
        return new SDL_Vertex(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_Vertex calloc(MemoryStack stack) {
        return new SDL_Vertex(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static SDL_FPoint nposition$(long struct) {
        return SDL_FPoint.create(struct + POSITION);
    }

    public static SDL_FColor ncolor(long struct) {
        return SDL_FColor.create(struct + COLOR);
    }

    public static SDL_FPoint ntex_coord(long struct) {
        return SDL_FPoint.create(struct + TEX_COORD);
    }

    public static void nposition$(long struct, SDL_FPoint value) {
        MemoryUtil.memCopy(value.address(), struct + POSITION, SDL_FPoint.SIZEOF);
    }

    public static void ncolor(long struct, SDL_FColor value) {
        MemoryUtil.memCopy(value.address(), struct + COLOR, SDL_FColor.SIZEOF);
    }

    public static void ntex_coord(long struct, SDL_FPoint value) {
        MemoryUtil.memCopy(value.address(), struct + TEX_COORD, SDL_FPoint.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Vertex$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_Vertex, Buffer> implements NativeResource {
        private static final SDL_Vertex ELEMENT_FACTORY = SDL_Vertex.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_Vertex.SIZEOF);
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
        public SDL_Vertex getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public SDL_FPoint position$() {
            return SDL_Vertex.nposition$(address());
        }

        public SDL_FColor color() {
            return SDL_Vertex.ncolor(address());
        }

        public SDL_FPoint tex_coord() {
            return SDL_Vertex.ntex_coord(address());
        }

        public Buffer position$(SDL_FPoint value) {
            SDL_Vertex.nposition$(address(), value);
            return this;
        }

        public Buffer position$(Consumer<SDL_FPoint> consumer) {
            consumer.accept(position$());
            return this;
        }

        public Buffer color(SDL_FColor value) {
            SDL_Vertex.ncolor(address(), value);
            return this;
        }

        public Buffer color(Consumer<SDL_FColor> consumer) {
            consumer.accept(color());
            return this;
        }

        public Buffer tex_coord(SDL_FPoint value) {
            SDL_Vertex.ntex_coord(address(), value);
            return this;
        }

        public Buffer tex_coord(Consumer<SDL_FPoint> consumer) {
            consumer.accept(tex_coord());
            return this;
        }
    }
}
