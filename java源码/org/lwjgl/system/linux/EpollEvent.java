package org.lwjgl.system.linux;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/EpollEvent.class
 */
@NativeType("struct epoll_event")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/EpollEvent.class */
public class EpollEvent extends Struct<EpollEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int EVENTS;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(EpollData.SIZEOF, EpollData.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        EVENTS = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    protected EpollEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public EpollEvent create(long address, ByteBuffer container) {
        return new EpollEvent(address, container);
    }

    public EpollEvent(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int events() {
        return nevents(address());
    }

    @NativeType("epoll_data_t")
    public EpollData data() {
        return ndata(address());
    }

    public EpollEvent events(@NativeType("uint32_t") int value) {
        nevents(address(), value);
        return this;
    }

    public EpollEvent data(@NativeType("epoll_data_t") EpollData value) {
        ndata(address(), value);
        return this;
    }

    public EpollEvent data(Consumer<EpollData> consumer) {
        consumer.accept(data());
        return this;
    }

    public EpollEvent set(int events, EpollData data) {
        events(events);
        data(data);
        return this;
    }

    public EpollEvent set(EpollEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static EpollEvent malloc() {
        return new EpollEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static EpollEvent calloc() {
        return new EpollEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static EpollEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new EpollEvent(MemoryUtil.memAddress(container), container);
    }

    public static EpollEvent create(long address) {
        return new EpollEvent(address, null);
    }

    public static EpollEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new EpollEvent(address, null);
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

    public static EpollEvent malloc(MemoryStack stack) {
        return new EpollEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static EpollEvent calloc(MemoryStack stack) {
        return new EpollEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nevents(long struct) {
        return MemoryUtil.memGetInt(struct + EVENTS);
    }

    public static EpollData ndata(long struct) {
        return EpollData.create(struct + DATA);
    }

    public static void nevents(long struct, int value) {
        MemoryUtil.memPutInt(struct + EVENTS, value);
    }

    public static void ndata(long struct, EpollData value) {
        MemoryUtil.memCopy(value.address(), struct + DATA, EpollData.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/EpollEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/EpollEvent$Buffer.class */
    public static class Buffer extends StructBuffer<EpollEvent, Buffer> implements NativeResource {
        private static final EpollEvent ELEMENT_FACTORY = EpollEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / EpollEvent.SIZEOF);
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
        public EpollEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int events() {
            return EpollEvent.nevents(address());
        }

        @NativeType("epoll_data_t")
        public EpollData data() {
            return EpollEvent.ndata(address());
        }

        public Buffer events(@NativeType("uint32_t") int value) {
            EpollEvent.nevents(address(), value);
            return this;
        }

        public Buffer data(@NativeType("epoll_data_t") EpollData value) {
            EpollEvent.ndata(address(), value);
            return this;
        }

        public Buffer data(Consumer<EpollData> consumer) {
            consumer.accept(data());
            return this;
        }
    }
}
