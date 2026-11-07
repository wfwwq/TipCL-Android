package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUIndirectDispatchCommand.class */
public class SDL_GPUIndirectDispatchCommand extends Struct<SDL_GPUIndirectDispatchCommand> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int GROUPCOUNT_X;
    public static final int GROUPCOUNT_Y;
    public static final int GROUPCOUNT_Z;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        GROUPCOUNT_X = layout.offsetof(0);
        GROUPCOUNT_Y = layout.offsetof(1);
        GROUPCOUNT_Z = layout.offsetof(2);
    }

    protected SDL_GPUIndirectDispatchCommand(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUIndirectDispatchCommand create(long address, ByteBuffer container) {
        return new SDL_GPUIndirectDispatchCommand(address, container);
    }

    public SDL_GPUIndirectDispatchCommand(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint32")
    public int groupcount_x() {
        return ngroupcount_x(address());
    }

    @NativeType("Uint32")
    public int groupcount_y() {
        return ngroupcount_y(address());
    }

    @NativeType("Uint32")
    public int groupcount_z() {
        return ngroupcount_z(address());
    }

    public SDL_GPUIndirectDispatchCommand groupcount_x(@NativeType("Uint32") int value) {
        ngroupcount_x(address(), value);
        return this;
    }

    public SDL_GPUIndirectDispatchCommand groupcount_y(@NativeType("Uint32") int value) {
        ngroupcount_y(address(), value);
        return this;
    }

    public SDL_GPUIndirectDispatchCommand groupcount_z(@NativeType("Uint32") int value) {
        ngroupcount_z(address(), value);
        return this;
    }

    public SDL_GPUIndirectDispatchCommand set(int groupcount_x, int groupcount_y, int groupcount_z) {
        groupcount_x(groupcount_x);
        groupcount_y(groupcount_y);
        groupcount_z(groupcount_z);
        return this;
    }

    public SDL_GPUIndirectDispatchCommand set(SDL_GPUIndirectDispatchCommand src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUIndirectDispatchCommand malloc() {
        return new SDL_GPUIndirectDispatchCommand(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUIndirectDispatchCommand calloc() {
        return new SDL_GPUIndirectDispatchCommand(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUIndirectDispatchCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUIndirectDispatchCommand(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUIndirectDispatchCommand create(long address) {
        return new SDL_GPUIndirectDispatchCommand(address, null);
    }

    public static SDL_GPUIndirectDispatchCommand createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUIndirectDispatchCommand(address, null);
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

    public static SDL_GPUIndirectDispatchCommand malloc(MemoryStack stack) {
        return new SDL_GPUIndirectDispatchCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUIndirectDispatchCommand calloc(MemoryStack stack) {
        return new SDL_GPUIndirectDispatchCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ngroupcount_x(long struct) {
        return MemoryUtil.memGetInt(struct + GROUPCOUNT_X);
    }

    public static int ngroupcount_y(long struct) {
        return MemoryUtil.memGetInt(struct + GROUPCOUNT_Y);
    }

    public static int ngroupcount_z(long struct) {
        return MemoryUtil.memGetInt(struct + GROUPCOUNT_Z);
    }

    public static void ngroupcount_x(long struct, int value) {
        MemoryUtil.memPutInt(struct + GROUPCOUNT_X, value);
    }

    public static void ngroupcount_y(long struct, int value) {
        MemoryUtil.memPutInt(struct + GROUPCOUNT_Y, value);
    }

    public static void ngroupcount_z(long struct, int value) {
        MemoryUtil.memPutInt(struct + GROUPCOUNT_Z, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUIndirectDispatchCommand$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUIndirectDispatchCommand, Buffer> implements NativeResource {
        private static final SDL_GPUIndirectDispatchCommand ELEMENT_FACTORY = SDL_GPUIndirectDispatchCommand.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUIndirectDispatchCommand.SIZEOF);
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
        public SDL_GPUIndirectDispatchCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint32")
        public int groupcount_x() {
            return SDL_GPUIndirectDispatchCommand.ngroupcount_x(address());
        }

        @NativeType("Uint32")
        public int groupcount_y() {
            return SDL_GPUIndirectDispatchCommand.ngroupcount_y(address());
        }

        @NativeType("Uint32")
        public int groupcount_z() {
            return SDL_GPUIndirectDispatchCommand.ngroupcount_z(address());
        }

        public Buffer groupcount_x(@NativeType("Uint32") int value) {
            SDL_GPUIndirectDispatchCommand.ngroupcount_x(address(), value);
            return this;
        }

        public Buffer groupcount_y(@NativeType("Uint32") int value) {
            SDL_GPUIndirectDispatchCommand.ngroupcount_y(address(), value);
            return this;
        }

        public Buffer groupcount_z(@NativeType("Uint32") int value) {
            SDL_GPUIndirectDispatchCommand.ngroupcount_z(address(), value);
            return this;
        }
    }
}
