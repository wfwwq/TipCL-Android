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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterface.class */
public class SDL_IOStreamInterface extends Struct<SDL_IOStreamInterface> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERSION;
    public static final int SIZE;
    public static final int SEEK;
    public static final int READ;
    public static final int WRITE;
    public static final int FLUSH;
    public static final int CLOSE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERSION = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        SEEK = layout.offsetof(2);
        READ = layout.offsetof(3);
        WRITE = layout.offsetof(4);
        FLUSH = layout.offsetof(5);
        CLOSE = layout.offsetof(6);
    }

    protected SDL_IOStreamInterface(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_IOStreamInterface create(long address, ByteBuffer container) {
        return new SDL_IOStreamInterface(address, container);
    }

    public SDL_IOStreamInterface(ByteBuffer container) {
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

    @NativeType("Sint64 (*) (void *)")
    public SDL_IOStreamInterfaceSizeCallback size() {
        return nsize(address());
    }

    @NativeType("Sint64 (*) (void *, Sint64, SDL_IOWhence)")
    public SDL_IOStreamInterfaceSeekCallback seek() {
        return nseek(address());
    }

    @NativeType("size_t (*) (void *, void *, size_t, SDL_IOStatus *)")
    public SDL_IOStreamInterfaceReadCallback read() {
        return nread(address());
    }

    @NativeType("size_t (*) (void *, void const *, size_t, SDL_IOStatus *)")
    public SDL_IOStreamInterfaceWriteCallback write() {
        return nwrite(address());
    }

    @NativeType("bool (*) (void *, SDL_IOStatus *)")
    public SDL_IOStreamInterfaceFlushCallback flush() {
        return nflush(address());
    }

    @NativeType("bool (*) (void *)")
    public SDL_IOStreamInterfaceCloseCallback close$() {
        return nclose$(address());
    }

    public SDL_IOStreamInterface version(@NativeType("Uint32") int value) {
        nversion(address(), value);
        return this;
    }

    public SDL_IOStreamInterface size(@NativeType("Sint64 (*) (void *)") SDL_IOStreamInterfaceSizeCallbackI value) {
        nsize(address(), value);
        return this;
    }

    public SDL_IOStreamInterface seek(@NativeType("Sint64 (*) (void *, Sint64, SDL_IOWhence)") SDL_IOStreamInterfaceSeekCallbackI value) {
        nseek(address(), value);
        return this;
    }

    public SDL_IOStreamInterface read(@NativeType("size_t (*) (void *, void *, size_t, SDL_IOStatus *)") SDL_IOStreamInterfaceReadCallbackI value) {
        nread(address(), value);
        return this;
    }

    public SDL_IOStreamInterface write(@NativeType("size_t (*) (void *, void const *, size_t, SDL_IOStatus *)") SDL_IOStreamInterfaceWriteCallbackI value) {
        nwrite(address(), value);
        return this;
    }

    public SDL_IOStreamInterface flush(@NativeType("bool (*) (void *, SDL_IOStatus *)") SDL_IOStreamInterfaceFlushCallbackI value) {
        nflush(address(), value);
        return this;
    }

    public SDL_IOStreamInterface close$(@NativeType("bool (*) (void *)") SDL_IOStreamInterfaceCloseCallbackI value) {
        nclose$(address(), value);
        return this;
    }

    public SDL_IOStreamInterface set(int version, SDL_IOStreamInterfaceSizeCallbackI size, SDL_IOStreamInterfaceSeekCallbackI seek, SDL_IOStreamInterfaceReadCallbackI read, SDL_IOStreamInterfaceWriteCallbackI write, SDL_IOStreamInterfaceFlushCallbackI flush, SDL_IOStreamInterfaceCloseCallbackI close$) {
        version(version);
        size(size);
        seek(seek);
        read(read);
        write(write);
        flush(flush);
        close$(close$);
        return this;
    }

    public SDL_IOStreamInterface set(SDL_IOStreamInterface src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_IOStreamInterface malloc() {
        return new SDL_IOStreamInterface(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_IOStreamInterface calloc() {
        return new SDL_IOStreamInterface(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_IOStreamInterface create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_IOStreamInterface(MemoryUtil.memAddress(container), container);
    }

    public static SDL_IOStreamInterface create(long address) {
        return new SDL_IOStreamInterface(address, null);
    }

    public static SDL_IOStreamInterface createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_IOStreamInterface(address, null);
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

    public static SDL_IOStreamInterface malloc(MemoryStack stack) {
        return new SDL_IOStreamInterface(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_IOStreamInterface calloc(MemoryStack stack) {
        return new SDL_IOStreamInterface(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static SDL_IOStreamInterfaceSizeCallback nsize(long struct) {
        return SDL_IOStreamInterfaceSizeCallback.create(MemoryUtil.memGetAddress(struct + SIZE));
    }

    public static SDL_IOStreamInterfaceSeekCallback nseek(long struct) {
        return SDL_IOStreamInterfaceSeekCallback.create(MemoryUtil.memGetAddress(struct + SEEK));
    }

    public static SDL_IOStreamInterfaceReadCallback nread(long struct) {
        return SDL_IOStreamInterfaceReadCallback.create(MemoryUtil.memGetAddress(struct + READ));
    }

    public static SDL_IOStreamInterfaceWriteCallback nwrite(long struct) {
        return SDL_IOStreamInterfaceWriteCallback.create(MemoryUtil.memGetAddress(struct + WRITE));
    }

    public static SDL_IOStreamInterfaceFlushCallback nflush(long struct) {
        return SDL_IOStreamInterfaceFlushCallback.create(MemoryUtil.memGetAddress(struct + FLUSH));
    }

    public static SDL_IOStreamInterfaceCloseCallback nclose$(long struct) {
        return SDL_IOStreamInterfaceCloseCallback.create(MemoryUtil.memGetAddress(struct + CLOSE));
    }

    public static void nversion(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERSION, value);
    }

    public static void nsize(long struct, SDL_IOStreamInterfaceSizeCallbackI value) {
        MemoryUtil.memPutAddress(struct + SIZE, value.address());
    }

    public static void nseek(long struct, SDL_IOStreamInterfaceSeekCallbackI value) {
        MemoryUtil.memPutAddress(struct + SEEK, value.address());
    }

    public static void nread(long struct, SDL_IOStreamInterfaceReadCallbackI value) {
        MemoryUtil.memPutAddress(struct + READ, value.address());
    }

    public static void nwrite(long struct, SDL_IOStreamInterfaceWriteCallbackI value) {
        MemoryUtil.memPutAddress(struct + WRITE, value.address());
    }

    public static void nflush(long struct, SDL_IOStreamInterfaceFlushCallbackI value) {
        MemoryUtil.memPutAddress(struct + FLUSH, value.address());
    }

    public static void nclose$(long struct, SDL_IOStreamInterfaceCloseCallbackI value) {
        MemoryUtil.memPutAddress(struct + CLOSE, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + SIZE));
        Checks.check(MemoryUtil.memGetAddress(struct + SEEK));
        Checks.check(MemoryUtil.memGetAddress(struct + READ));
        Checks.check(MemoryUtil.memGetAddress(struct + WRITE));
        Checks.check(MemoryUtil.memGetAddress(struct + FLUSH));
        Checks.check(MemoryUtil.memGetAddress(struct + CLOSE));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_IOStreamInterface$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_IOStreamInterface, Buffer> implements NativeResource {
        private static final SDL_IOStreamInterface ELEMENT_FACTORY = SDL_IOStreamInterface.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_IOStreamInterface.SIZEOF);
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
        public SDL_IOStreamInterface getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint32")
        public int version() {
            return SDL_IOStreamInterface.nversion(address());
        }

        @NativeType("Sint64 (*) (void *)")
        public SDL_IOStreamInterfaceSizeCallback size() {
            return SDL_IOStreamInterface.nsize(address());
        }

        @NativeType("Sint64 (*) (void *, Sint64, SDL_IOWhence)")
        public SDL_IOStreamInterfaceSeekCallback seek() {
            return SDL_IOStreamInterface.nseek(address());
        }

        @NativeType("size_t (*) (void *, void *, size_t, SDL_IOStatus *)")
        public SDL_IOStreamInterfaceReadCallback read() {
            return SDL_IOStreamInterface.nread(address());
        }

        @NativeType("size_t (*) (void *, void const *, size_t, SDL_IOStatus *)")
        public SDL_IOStreamInterfaceWriteCallback write() {
            return SDL_IOStreamInterface.nwrite(address());
        }

        @NativeType("bool (*) (void *, SDL_IOStatus *)")
        public SDL_IOStreamInterfaceFlushCallback flush() {
            return SDL_IOStreamInterface.nflush(address());
        }

        @NativeType("bool (*) (void *)")
        public SDL_IOStreamInterfaceCloseCallback close$() {
            return SDL_IOStreamInterface.nclose$(address());
        }

        public Buffer version(@NativeType("Uint32") int value) {
            SDL_IOStreamInterface.nversion(address(), value);
            return this;
        }

        public Buffer size(@NativeType("Sint64 (*) (void *)") SDL_IOStreamInterfaceSizeCallbackI value) {
            SDL_IOStreamInterface.nsize(address(), value);
            return this;
        }

        public Buffer seek(@NativeType("Sint64 (*) (void *, Sint64, SDL_IOWhence)") SDL_IOStreamInterfaceSeekCallbackI value) {
            SDL_IOStreamInterface.nseek(address(), value);
            return this;
        }

        public Buffer read(@NativeType("size_t (*) (void *, void *, size_t, SDL_IOStatus *)") SDL_IOStreamInterfaceReadCallbackI value) {
            SDL_IOStreamInterface.nread(address(), value);
            return this;
        }

        public Buffer write(@NativeType("size_t (*) (void *, void const *, size_t, SDL_IOStatus *)") SDL_IOStreamInterfaceWriteCallbackI value) {
            SDL_IOStreamInterface.nwrite(address(), value);
            return this;
        }

        public Buffer flush(@NativeType("bool (*) (void *, SDL_IOStatus *)") SDL_IOStreamInterfaceFlushCallbackI value) {
            SDL_IOStreamInterface.nflush(address(), value);
            return this;
        }

        public Buffer close$(@NativeType("bool (*) (void *)") SDL_IOStreamInterfaceCloseCallbackI value) {
            SDL_IOStreamInterface.nclose$(address(), value);
            return this;
        }
    }
}
