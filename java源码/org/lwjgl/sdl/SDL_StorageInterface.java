package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterface.class */
public class SDL_StorageInterface extends Struct<SDL_StorageInterface> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERSION;
    public static final int CLOSE;
    public static final int READY;
    public static final int ENUMERATE;
    public static final int INFO;
    public static final int READ_FILE;
    public static final int WRITE_FILE;
    public static final int MKDIR;
    public static final int REMOVE;
    public static final int RENAME;
    public static final int COPY;
    public static final int SPACE_REMAINING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERSION = layout.offsetof(0);
        CLOSE = layout.offsetof(1);
        READY = layout.offsetof(2);
        ENUMERATE = layout.offsetof(3);
        INFO = layout.offsetof(4);
        READ_FILE = layout.offsetof(5);
        WRITE_FILE = layout.offsetof(6);
        MKDIR = layout.offsetof(7);
        REMOVE = layout.offsetof(8);
        RENAME = layout.offsetof(9);
        COPY = layout.offsetof(10);
        SPACE_REMAINING = layout.offsetof(11);
    }

    protected SDL_StorageInterface(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_StorageInterface create(long address, ByteBuffer container) {
        return new SDL_StorageInterface(address, container);
    }

    public SDL_StorageInterface(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint32")
    public int version() {
        return nversion(address());
    }

    @NativeType("bool (*) (void *)")
    public SDL_StorageInterfaceCloseCallback close$() {
        return nclose$(address());
    }

    @NativeType("bool (*) (void *)")
    public SDL_StorageInterfaceReadyCallback ready() {
        return nready(address());
    }

    @NativeType("bool (*) (void *, char const *, SDL_EnumerateDirectoryCallback, void *)")
    public SDL_StorageInterfaceEnumerateCallback enumerate() {
        return nenumerate(address());
    }

    @NativeType("bool (*) (void *, char const *, SDL_PathInfo *)")
    public SDL_StorageInterfaceInfoCallback info() {
        return ninfo(address());
    }

    @NativeType("bool (*) (void *, char const *, void *, Uint64)")
    public SDL_StorageInterfaceReadFileCallback read_file() {
        return nread_file(address());
    }

    @NativeType("bool (*) (void *, char const *, void const *, Uint64)")
    public SDL_StorageInterfaceWriteFileCallback write_file() {
        return nwrite_file(address());
    }

    @NativeType("bool (*) (void *, char const *)")
    public SDL_StorageInterfaceMkdirCallback mkdir() {
        return nmkdir(address());
    }

    @NativeType("bool (*) (void *, char const *)")
    public SDL_StorageInterfaceRemoveCallback remove() {
        return nremove(address());
    }

    @NativeType("bool (*) (void *, char const *, char const *)")
    public SDL_StorageInterfaceRenameCallback rename() {
        return nrename(address());
    }

    @NativeType("bool (*) (void *, char const *, char const *)")
    public SDL_StorageInterfaceCopyCallback copy() {
        return ncopy(address());
    }

    @NativeType("Uint64 (*) (void *)")
    public SDL_StorageInterfaceSpaceRemainingCallback space_remaining() {
        return nspace_remaining(address());
    }

    public SDL_StorageInterface version(@NativeType("Uint32") int value) {
        nversion(address(), value);
        return this;
    }

    public SDL_StorageInterface close$(@NativeType("bool (*) (void *)") SDL_StorageInterfaceCloseCallbackI value) {
        nclose$(address(), value);
        return this;
    }

    public SDL_StorageInterface ready(@NativeType("bool (*) (void *)") SDL_StorageInterfaceReadyCallbackI value) {
        nready(address(), value);
        return this;
    }

    public SDL_StorageInterface enumerate(@NativeType("bool (*) (void *, char const *, SDL_EnumerateDirectoryCallback, void *)") SDL_StorageInterfaceEnumerateCallbackI value) {
        nenumerate(address(), value);
        return this;
    }

    public SDL_StorageInterface info(@NativeType("bool (*) (void *, char const *, SDL_PathInfo *)") SDL_StorageInterfaceInfoCallbackI value) {
        ninfo(address(), value);
        return this;
    }

    public SDL_StorageInterface read_file(@NativeType("bool (*) (void *, char const *, void *, Uint64)") SDL_StorageInterfaceReadFileCallbackI value) {
        nread_file(address(), value);
        return this;
    }

    public SDL_StorageInterface write_file(@NativeType("bool (*) (void *, char const *, void const *, Uint64)") SDL_StorageInterfaceWriteFileCallbackI value) {
        nwrite_file(address(), value);
        return this;
    }

    public SDL_StorageInterface mkdir(@NativeType("bool (*) (void *, char const *)") SDL_StorageInterfaceMkdirCallbackI value) {
        nmkdir(address(), value);
        return this;
    }

    public SDL_StorageInterface remove(@NativeType("bool (*) (void *, char const *)") SDL_StorageInterfaceRemoveCallbackI value) {
        nremove(address(), value);
        return this;
    }

    public SDL_StorageInterface rename(@NativeType("bool (*) (void *, char const *, char const *)") SDL_StorageInterfaceRenameCallbackI value) {
        nrename(address(), value);
        return this;
    }

    public SDL_StorageInterface copy(@NativeType("bool (*) (void *, char const *, char const *)") SDL_StorageInterfaceCopyCallbackI value) {
        ncopy(address(), value);
        return this;
    }

    public SDL_StorageInterface space_remaining(@NativeType("Uint64 (*) (void *)") SDL_StorageInterfaceSpaceRemainingCallbackI value) {
        nspace_remaining(address(), value);
        return this;
    }

    public SDL_StorageInterface set(int version, SDL_StorageInterfaceCloseCallbackI close$, SDL_StorageInterfaceReadyCallbackI ready, SDL_StorageInterfaceEnumerateCallbackI enumerate, SDL_StorageInterfaceInfoCallbackI info, SDL_StorageInterfaceReadFileCallbackI read_file, SDL_StorageInterfaceWriteFileCallbackI write_file, SDL_StorageInterfaceMkdirCallbackI mkdir, SDL_StorageInterfaceRemoveCallbackI remove, SDL_StorageInterfaceRenameCallbackI rename, SDL_StorageInterfaceCopyCallbackI copy, SDL_StorageInterfaceSpaceRemainingCallbackI space_remaining) {
        version(version);
        close$(close$);
        ready(ready);
        enumerate(enumerate);
        info(info);
        read_file(read_file);
        write_file(write_file);
        mkdir(mkdir);
        remove(remove);
        rename(rename);
        copy(copy);
        space_remaining(space_remaining);
        return this;
    }

    public SDL_StorageInterface set(SDL_StorageInterface src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_StorageInterface malloc() {
        return new SDL_StorageInterface(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_StorageInterface calloc() {
        return new SDL_StorageInterface(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_StorageInterface create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_StorageInterface(MemoryUtil.memAddress(container), container);
    }

    public static SDL_StorageInterface create(long address) {
        return new SDL_StorageInterface(address, null);
    }

    public static SDL_StorageInterface createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_StorageInterface(address, null);
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

    public static SDL_StorageInterface malloc(MemoryStack stack) {
        return new SDL_StorageInterface(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_StorageInterface calloc(MemoryStack stack) {
        return new SDL_StorageInterface(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nversion(long struct) {
        return MemoryUtil.memGetInt(struct + VERSION);
    }

    public static SDL_StorageInterfaceCloseCallback nclose$(long struct) {
        return SDL_StorageInterfaceCloseCallback.createSafe(MemoryUtil.memGetAddress(struct + CLOSE));
    }

    public static SDL_StorageInterfaceReadyCallback nready(long struct) {
        return SDL_StorageInterfaceReadyCallback.createSafe(MemoryUtil.memGetAddress(struct + READY));
    }

    public static SDL_StorageInterfaceEnumerateCallback nenumerate(long struct) {
        return SDL_StorageInterfaceEnumerateCallback.createSafe(MemoryUtil.memGetAddress(struct + ENUMERATE));
    }

    public static SDL_StorageInterfaceInfoCallback ninfo(long struct) {
        return SDL_StorageInterfaceInfoCallback.createSafe(MemoryUtil.memGetAddress(struct + INFO));
    }

    public static SDL_StorageInterfaceReadFileCallback nread_file(long struct) {
        return SDL_StorageInterfaceReadFileCallback.createSafe(MemoryUtil.memGetAddress(struct + READ_FILE));
    }

    public static SDL_StorageInterfaceWriteFileCallback nwrite_file(long struct) {
        return SDL_StorageInterfaceWriteFileCallback.createSafe(MemoryUtil.memGetAddress(struct + WRITE_FILE));
    }

    public static SDL_StorageInterfaceMkdirCallback nmkdir(long struct) {
        return SDL_StorageInterfaceMkdirCallback.createSafe(MemoryUtil.memGetAddress(struct + MKDIR));
    }

    public static SDL_StorageInterfaceRemoveCallback nremove(long struct) {
        return SDL_StorageInterfaceRemoveCallback.createSafe(MemoryUtil.memGetAddress(struct + REMOVE));
    }

    public static SDL_StorageInterfaceRenameCallback nrename(long struct) {
        return SDL_StorageInterfaceRenameCallback.createSafe(MemoryUtil.memGetAddress(struct + RENAME));
    }

    public static SDL_StorageInterfaceCopyCallback ncopy(long struct) {
        return SDL_StorageInterfaceCopyCallback.createSafe(MemoryUtil.memGetAddress(struct + COPY));
    }

    public static SDL_StorageInterfaceSpaceRemainingCallback nspace_remaining(long struct) {
        return SDL_StorageInterfaceSpaceRemainingCallback.createSafe(MemoryUtil.memGetAddress(struct + SPACE_REMAINING));
    }

    public static void nversion(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERSION, value);
    }

    public static void nclose$(long struct, SDL_StorageInterfaceCloseCallbackI value) {
        MemoryUtil.memPutAddress(struct + CLOSE, MemoryUtil.memAddressSafe(value));
    }

    public static void nready(long struct, SDL_StorageInterfaceReadyCallbackI value) {
        MemoryUtil.memPutAddress(struct + READY, MemoryUtil.memAddressSafe(value));
    }

    public static void nenumerate(long struct, SDL_StorageInterfaceEnumerateCallbackI value) {
        MemoryUtil.memPutAddress(struct + ENUMERATE, MemoryUtil.memAddressSafe(value));
    }

    public static void ninfo(long struct, SDL_StorageInterfaceInfoCallbackI value) {
        MemoryUtil.memPutAddress(struct + INFO, MemoryUtil.memAddressSafe(value));
    }

    public static void nread_file(long struct, SDL_StorageInterfaceReadFileCallbackI value) {
        MemoryUtil.memPutAddress(struct + READ_FILE, MemoryUtil.memAddressSafe(value));
    }

    public static void nwrite_file(long struct, SDL_StorageInterfaceWriteFileCallbackI value) {
        MemoryUtil.memPutAddress(struct + WRITE_FILE, MemoryUtil.memAddressSafe(value));
    }

    public static void nmkdir(long struct, SDL_StorageInterfaceMkdirCallbackI value) {
        MemoryUtil.memPutAddress(struct + MKDIR, MemoryUtil.memAddressSafe(value));
    }

    public static void nremove(long struct, SDL_StorageInterfaceRemoveCallbackI value) {
        MemoryUtil.memPutAddress(struct + REMOVE, MemoryUtil.memAddressSafe(value));
    }

    public static void nrename(long struct, SDL_StorageInterfaceRenameCallbackI value) {
        MemoryUtil.memPutAddress(struct + RENAME, MemoryUtil.memAddressSafe(value));
    }

    public static void ncopy(long struct, SDL_StorageInterfaceCopyCallbackI value) {
        MemoryUtil.memPutAddress(struct + COPY, MemoryUtil.memAddressSafe(value));
    }

    public static void nspace_remaining(long struct, SDL_StorageInterfaceSpaceRemainingCallbackI value) {
        MemoryUtil.memPutAddress(struct + SPACE_REMAINING, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_StorageInterface$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_StorageInterface, Buffer> implements NativeResource {
        private static final SDL_StorageInterface ELEMENT_FACTORY = SDL_StorageInterface.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_StorageInterface.SIZEOF);
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
        public SDL_StorageInterface getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint32")
        public int version() {
            return SDL_StorageInterface.nversion(address());
        }

        @NativeType("bool (*) (void *)")
        public SDL_StorageInterfaceCloseCallback close$() {
            return SDL_StorageInterface.nclose$(address());
        }

        @NativeType("bool (*) (void *)")
        public SDL_StorageInterfaceReadyCallback ready() {
            return SDL_StorageInterface.nready(address());
        }

        @NativeType("bool (*) (void *, char const *, SDL_EnumerateDirectoryCallback, void *)")
        public SDL_StorageInterfaceEnumerateCallback enumerate() {
            return SDL_StorageInterface.nenumerate(address());
        }

        @NativeType("bool (*) (void *, char const *, SDL_PathInfo *)")
        public SDL_StorageInterfaceInfoCallback info() {
            return SDL_StorageInterface.ninfo(address());
        }

        @NativeType("bool (*) (void *, char const *, void *, Uint64)")
        public SDL_StorageInterfaceReadFileCallback read_file() {
            return SDL_StorageInterface.nread_file(address());
        }

        @NativeType("bool (*) (void *, char const *, void const *, Uint64)")
        public SDL_StorageInterfaceWriteFileCallback write_file() {
            return SDL_StorageInterface.nwrite_file(address());
        }

        @NativeType("bool (*) (void *, char const *)")
        public SDL_StorageInterfaceMkdirCallback mkdir() {
            return SDL_StorageInterface.nmkdir(address());
        }

        @NativeType("bool (*) (void *, char const *)")
        public SDL_StorageInterfaceRemoveCallback remove() {
            return SDL_StorageInterface.nremove(address());
        }

        @NativeType("bool (*) (void *, char const *, char const *)")
        public SDL_StorageInterfaceRenameCallback rename() {
            return SDL_StorageInterface.nrename(address());
        }

        @NativeType("bool (*) (void *, char const *, char const *)")
        public SDL_StorageInterfaceCopyCallback copy() {
            return SDL_StorageInterface.ncopy(address());
        }

        @NativeType("Uint64 (*) (void *)")
        public SDL_StorageInterfaceSpaceRemainingCallback space_remaining() {
            return SDL_StorageInterface.nspace_remaining(address());
        }

        public Buffer version(@NativeType("Uint32") int value) {
            SDL_StorageInterface.nversion(address(), value);
            return this;
        }

        public Buffer close$(@NativeType("bool (*) (void *)") SDL_StorageInterfaceCloseCallbackI value) {
            SDL_StorageInterface.nclose$(address(), value);
            return this;
        }

        public Buffer ready(@NativeType("bool (*) (void *)") SDL_StorageInterfaceReadyCallbackI value) {
            SDL_StorageInterface.nready(address(), value);
            return this;
        }

        public Buffer enumerate(@NativeType("bool (*) (void *, char const *, SDL_EnumerateDirectoryCallback, void *)") SDL_StorageInterfaceEnumerateCallbackI value) {
            SDL_StorageInterface.nenumerate(address(), value);
            return this;
        }

        public Buffer info(@NativeType("bool (*) (void *, char const *, SDL_PathInfo *)") SDL_StorageInterfaceInfoCallbackI value) {
            SDL_StorageInterface.ninfo(address(), value);
            return this;
        }

        public Buffer read_file(@NativeType("bool (*) (void *, char const *, void *, Uint64)") SDL_StorageInterfaceReadFileCallbackI value) {
            SDL_StorageInterface.nread_file(address(), value);
            return this;
        }

        public Buffer write_file(@NativeType("bool (*) (void *, char const *, void const *, Uint64)") SDL_StorageInterfaceWriteFileCallbackI value) {
            SDL_StorageInterface.nwrite_file(address(), value);
            return this;
        }

        public Buffer mkdir(@NativeType("bool (*) (void *, char const *)") SDL_StorageInterfaceMkdirCallbackI value) {
            SDL_StorageInterface.nmkdir(address(), value);
            return this;
        }

        public Buffer remove(@NativeType("bool (*) (void *, char const *)") SDL_StorageInterfaceRemoveCallbackI value) {
            SDL_StorageInterface.nremove(address(), value);
            return this;
        }

        public Buffer rename(@NativeType("bool (*) (void *, char const *, char const *)") SDL_StorageInterfaceRenameCallbackI value) {
            SDL_StorageInterface.nrename(address(), value);
            return this;
        }

        public Buffer copy(@NativeType("bool (*) (void *, char const *, char const *)") SDL_StorageInterfaceCopyCallbackI value) {
            SDL_StorageInterface.ncopy(address(), value);
            return this;
        }

        public Buffer space_remaining(@NativeType("Uint64 (*) (void *)") SDL_StorageInterfaceSpaceRemainingCallbackI value) {
            SDL_StorageInterface.nspace_remaining(address(), value);
            return this;
        }
    }
}
