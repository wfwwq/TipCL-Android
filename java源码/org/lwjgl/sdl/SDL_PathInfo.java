package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_PathInfo.class */
public class SDL_PathInfo extends Struct<SDL_PathInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SIZE;
    public static final int CREATE_TIME;
    public static final int MODIFY_TIME;
    public static final int ACCESS_TIME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        CREATE_TIME = layout.offsetof(2);
        MODIFY_TIME = layout.offsetof(3);
        ACCESS_TIME = layout.offsetof(4);
    }

    protected SDL_PathInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_PathInfo create(long address, ByteBuffer container) {
        return new SDL_PathInfo(address, container);
    }

    public SDL_PathInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SDL_PathType")
    public int type() {
        return ntype(address());
    }

    @NativeType("Uint64")
    public long size() {
        return nsize(address());
    }

    @NativeType("SDL_Time")
    public long create_time() {
        return ncreate_time(address());
    }

    @NativeType("SDL_Time")
    public long modify_time() {
        return nmodify_time(address());
    }

    @NativeType("SDL_Time")
    public long access_time() {
        return naccess_time(address());
    }

    public SDL_PathInfo type(@NativeType("SDL_PathType") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_PathInfo size(@NativeType("Uint64") long value) {
        nsize(address(), value);
        return this;
    }

    public SDL_PathInfo create_time(@NativeType("SDL_Time") long value) {
        ncreate_time(address(), value);
        return this;
    }

    public SDL_PathInfo modify_time(@NativeType("SDL_Time") long value) {
        nmodify_time(address(), value);
        return this;
    }

    public SDL_PathInfo access_time(@NativeType("SDL_Time") long value) {
        naccess_time(address(), value);
        return this;
    }

    public SDL_PathInfo set(int type, long size, long create_time, long modify_time, long access_time) {
        type(type);
        size(size);
        create_time(create_time);
        modify_time(modify_time);
        access_time(access_time);
        return this;
    }

    public SDL_PathInfo set(SDL_PathInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_PathInfo malloc() {
        return new SDL_PathInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_PathInfo calloc() {
        return new SDL_PathInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_PathInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_PathInfo(MemoryUtil.memAddress(container), container);
    }

    public static SDL_PathInfo create(long address) {
        return new SDL_PathInfo(address, null);
    }

    public static SDL_PathInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_PathInfo(address, null);
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

    public static SDL_PathInfo malloc(MemoryStack stack) {
        return new SDL_PathInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_PathInfo calloc(MemoryStack stack) {
        return new SDL_PathInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static long ncreate_time(long struct) {
        return MemoryUtil.memGetLong(struct + CREATE_TIME);
    }

    public static long nmodify_time(long struct) {
        return MemoryUtil.memGetLong(struct + MODIFY_TIME);
    }

    public static long naccess_time(long struct) {
        return MemoryUtil.memGetLong(struct + ACCESS_TIME);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void ncreate_time(long struct, long value) {
        MemoryUtil.memPutLong(struct + CREATE_TIME, value);
    }

    public static void nmodify_time(long struct, long value) {
        MemoryUtil.memPutLong(struct + MODIFY_TIME, value);
    }

    public static void naccess_time(long struct, long value) {
        MemoryUtil.memPutLong(struct + ACCESS_TIME, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_PathInfo$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_PathInfo, Buffer> implements NativeResource {
        private static final SDL_PathInfo ELEMENT_FACTORY = SDL_PathInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_PathInfo.SIZEOF);
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
        public SDL_PathInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SDL_PathType")
        public int type() {
            return SDL_PathInfo.ntype(address());
        }

        @NativeType("Uint64")
        public long size() {
            return SDL_PathInfo.nsize(address());
        }

        @NativeType("SDL_Time")
        public long create_time() {
            return SDL_PathInfo.ncreate_time(address());
        }

        @NativeType("SDL_Time")
        public long modify_time() {
            return SDL_PathInfo.nmodify_time(address());
        }

        @NativeType("SDL_Time")
        public long access_time() {
            return SDL_PathInfo.naccess_time(address());
        }

        public Buffer type(@NativeType("SDL_PathType") int value) {
            SDL_PathInfo.ntype(address(), value);
            return this;
        }

        public Buffer size(@NativeType("Uint64") long value) {
            SDL_PathInfo.nsize(address(), value);
            return this;
        }

        public Buffer create_time(@NativeType("SDL_Time") long value) {
            SDL_PathInfo.ncreate_time(address(), value);
            return this;
        }

        public Buffer modify_time(@NativeType("SDL_Time") long value) {
            SDL_PathInfo.nmodify_time(address(), value);
            return this;
        }

        public Buffer access_time(@NativeType("SDL_Time") long value) {
            SDL_PathInfo.naccess_time(address(), value);
            return this;
        }
    }
}
