package org.lwjgl.system.linux;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XGenericEventCookie.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XGenericEventCookie.class */
public class XGenericEventCookie extends Struct<XGenericEventCookie> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int EXTENSION;
    public static final int EVTYPE;
    public static final int COOKIE;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        EXTENSION = layout.offsetof(4);
        EVTYPE = layout.offsetof(5);
        COOKIE = layout.offsetof(6);
        DATA = layout.offsetof(7);
    }

    protected XGenericEventCookie(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XGenericEventCookie create(long address, ByteBuffer container) {
        return new XGenericEventCookie(address, container);
    }

    public XGenericEventCookie(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int type() {
        return ntype(address());
    }

    @NativeType("unsigned long")
    public long serial() {
        return nserial(address());
    }

    @NativeType("Bool")
    public boolean send_event() {
        return nsend_event(address()) != 0;
    }

    @NativeType("Display *")
    public long display() {
        return ndisplay(address());
    }

    public int extension() {
        return nextension(address());
    }

    public int evtype() {
        return nevtype(address());
    }

    @NativeType("unsigned int")
    public int cookie() {
        return ncookie(address());
    }

    @NativeType("void *")
    public ByteBuffer data(int capacity) {
        return ndata(address(), capacity);
    }

    public XGenericEventCookie type(int value) {
        ntype(address(), value);
        return this;
    }

    public XGenericEventCookie serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XGenericEventCookie send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XGenericEventCookie display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XGenericEventCookie extension(int value) {
        nextension(address(), value);
        return this;
    }

    public XGenericEventCookie evtype(int value) {
        nevtype(address(), value);
        return this;
    }

    public XGenericEventCookie cookie(@NativeType("unsigned int") int value) {
        ncookie(address(), value);
        return this;
    }

    public XGenericEventCookie data(@NativeType("void *") ByteBuffer value) {
        ndata(address(), value);
        return this;
    }

    public XGenericEventCookie set(int type, long serial, boolean send_event, long display, int extension, int evtype, int cookie, ByteBuffer data) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        extension(extension);
        evtype(evtype);
        cookie(cookie);
        data(data);
        return this;
    }

    public XGenericEventCookie set(XGenericEventCookie src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XGenericEventCookie malloc() {
        return new XGenericEventCookie(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XGenericEventCookie calloc() {
        return new XGenericEventCookie(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XGenericEventCookie create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XGenericEventCookie(MemoryUtil.memAddress(container), container);
    }

    public static XGenericEventCookie create(long address) {
        return new XGenericEventCookie(address, null);
    }

    public static XGenericEventCookie createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XGenericEventCookie(address, null);
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

    public static XGenericEventCookie malloc(MemoryStack stack) {
        return new XGenericEventCookie(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XGenericEventCookie calloc(MemoryStack stack) {
        return new XGenericEventCookie(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nserial(long struct) {
        return MemoryUtil.memGetCLong(struct + SERIAL);
    }

    public static int nsend_event(long struct) {
        return MemoryUtil.memGetInt(struct + SEND_EVENT);
    }

    public static long ndisplay(long struct) {
        return MemoryUtil.memGetAddress(struct + DISPLAY);
    }

    public static int nextension(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENSION);
    }

    public static int nevtype(long struct) {
        return MemoryUtil.memGetInt(struct + EVTYPE);
    }

    public static int ncookie(long struct) {
        return MemoryUtil.memGetInt(struct + COOKIE);
    }

    public static ByteBuffer ndata(long struct, int capacity) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + DATA), capacity);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nserial(long struct, long value) {
        MemoryUtil.memPutCLong(struct + SERIAL, value);
    }

    public static void nsend_event(long struct, int value) {
        MemoryUtil.memPutInt(struct + SEND_EVENT, value);
    }

    public static void ndisplay(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DISPLAY, Checks.check(value));
    }

    public static void nextension(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENSION, value);
    }

    public static void nevtype(long struct, int value) {
        MemoryUtil.memPutInt(struct + EVTYPE, value);
    }

    public static void ncookie(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOKIE, value);
    }

    public static void ndata(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + DATA, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
        Checks.check(MemoryUtil.memGetAddress(struct + DATA));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XGenericEventCookie$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XGenericEventCookie$Buffer.class */
    public static class Buffer extends StructBuffer<XGenericEventCookie, Buffer> implements NativeResource {
        private static final XGenericEventCookie ELEMENT_FACTORY = XGenericEventCookie.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XGenericEventCookie.SIZEOF);
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
        public XGenericEventCookie getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XGenericEventCookie.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XGenericEventCookie.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XGenericEventCookie.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XGenericEventCookie.ndisplay(address());
        }

        public int extension() {
            return XGenericEventCookie.nextension(address());
        }

        public int evtype() {
            return XGenericEventCookie.nevtype(address());
        }

        @NativeType("unsigned int")
        public int cookie() {
            return XGenericEventCookie.ncookie(address());
        }

        @NativeType("void *")
        public ByteBuffer data(int capacity) {
            return XGenericEventCookie.ndata(address(), capacity);
        }

        public Buffer type(int value) {
            XGenericEventCookie.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XGenericEventCookie.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XGenericEventCookie.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XGenericEventCookie.ndisplay(address(), value);
            return this;
        }

        public Buffer extension(int value) {
            XGenericEventCookie.nextension(address(), value);
            return this;
        }

        public Buffer evtype(int value) {
            XGenericEventCookie.nevtype(address(), value);
            return this;
        }

        public Buffer cookie(@NativeType("unsigned int") int value) {
            XGenericEventCookie.ncookie(address(), value);
            return this;
        }

        public Buffer data(@NativeType("void *") ByteBuffer value) {
            XGenericEventCookie.ndata(address(), value);
            return this;
        }
    }
}
