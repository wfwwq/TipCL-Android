package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUBufferCreateInfo.class */
public class SDL_GPUBufferCreateInfo extends Struct<SDL_GPUBufferCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int USAGE;
    public static final int SIZE;
    public static final int PROPS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        USAGE = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        PROPS = layout.offsetof(2);
    }

    protected SDL_GPUBufferCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUBufferCreateInfo create(long address, ByteBuffer container) {
        return new SDL_GPUBufferCreateInfo(address, container);
    }

    public SDL_GPUBufferCreateInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_GPUBufferUsageFlags")
    public int usage() {
        return nusage(address());
    }

    @NativeType("Uint32")
    public int size() {
        return nsize(address());
    }

    @NativeType("SDL_PropertiesID")
    public int props() {
        return nprops(address());
    }

    public SDL_GPUBufferCreateInfo usage(@NativeType("SDL_GPUBufferUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    public SDL_GPUBufferCreateInfo size(@NativeType("Uint32") int value) {
        nsize(address(), value);
        return this;
    }

    public SDL_GPUBufferCreateInfo props(@NativeType("SDL_PropertiesID") int value) {
        nprops(address(), value);
        return this;
    }

    public SDL_GPUBufferCreateInfo set(int usage, int size, int props) {
        usage(usage);
        size(size);
        props(props);
        return this;
    }

    public SDL_GPUBufferCreateInfo set(SDL_GPUBufferCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUBufferCreateInfo malloc() {
        return new SDL_GPUBufferCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUBufferCreateInfo calloc() {
        return new SDL_GPUBufferCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUBufferCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUBufferCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUBufferCreateInfo create(long address) {
        return new SDL_GPUBufferCreateInfo(address, null);
    }

    public static SDL_GPUBufferCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUBufferCreateInfo(address, null);
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

    public static SDL_GPUBufferCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUBufferCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUBufferCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUBufferCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nusage(long struct) {
        return MemoryUtil.memGetInt(struct + USAGE);
    }

    public static int nsize(long struct) {
        return MemoryUtil.memGetInt(struct + SIZE);
    }

    public static int nprops(long struct) {
        return MemoryUtil.memGetInt(struct + PROPS);
    }

    public static void nusage(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGE, value);
    }

    public static void nsize(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIZE, value);
    }

    public static void nprops(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROPS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUBufferCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUBufferCreateInfo, Buffer> implements NativeResource {
        private static final SDL_GPUBufferCreateInfo ELEMENT_FACTORY = SDL_GPUBufferCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUBufferCreateInfo.SIZEOF);
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
        public SDL_GPUBufferCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_GPUBufferUsageFlags")
        public int usage() {
            return SDL_GPUBufferCreateInfo.nusage(address());
        }

        @NativeType("Uint32")
        public int size() {
            return SDL_GPUBufferCreateInfo.nsize(address());
        }

        @NativeType("SDL_PropertiesID")
        public int props() {
            return SDL_GPUBufferCreateInfo.nprops(address());
        }

        public Buffer usage(@NativeType("SDL_GPUBufferUsageFlags") int value) {
            SDL_GPUBufferCreateInfo.nusage(address(), value);
            return this;
        }

        public Buffer size(@NativeType("Uint32") int value) {
            SDL_GPUBufferCreateInfo.nsize(address(), value);
            return this;
        }

        public Buffer props(@NativeType("SDL_PropertiesID") int value) {
            SDL_GPUBufferCreateInfo.nprops(address(), value);
            return this;
        }
    }
}
