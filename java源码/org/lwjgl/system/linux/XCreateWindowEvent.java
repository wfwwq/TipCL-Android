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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XCreateWindowEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XCreateWindowEvent.class */
public class XCreateWindowEvent extends Struct<XCreateWindowEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int PARENT;
    public static final int WINDOW;
    public static final int X;
    public static final int Y;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int BORDER_WIDTH;
    public static final int OVERRIDE_REDIRECT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        PARENT = layout.offsetof(4);
        WINDOW = layout.offsetof(5);
        X = layout.offsetof(6);
        Y = layout.offsetof(7);
        WIDTH = layout.offsetof(8);
        HEIGHT = layout.offsetof(9);
        BORDER_WIDTH = layout.offsetof(10);
        OVERRIDE_REDIRECT = layout.offsetof(11);
    }

    protected XCreateWindowEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XCreateWindowEvent create(long address, ByteBuffer container) {
        return new XCreateWindowEvent(address, container);
    }

    public XCreateWindowEvent(ByteBuffer container) {
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

    @NativeType("Window")
    public long parent() {
        return nparent(address());
    }

    @NativeType("Window")
    public long window() {
        return nwindow(address());
    }

    public int x() {
        return nx(address());
    }

    public int y() {
        return ny(address());
    }

    public int width() {
        return nwidth(address());
    }

    public int height() {
        return nheight(address());
    }

    public int border_width() {
        return nborder_width(address());
    }

    public int override_redirect() {
        return noverride_redirect(address());
    }

    public XCreateWindowEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XCreateWindowEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XCreateWindowEvent send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XCreateWindowEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XCreateWindowEvent parent(@NativeType("Window") long value) {
        nparent(address(), value);
        return this;
    }

    public XCreateWindowEvent window(@NativeType("Window") long value) {
        nwindow(address(), value);
        return this;
    }

    public XCreateWindowEvent x(int value) {
        nx(address(), value);
        return this;
    }

    public XCreateWindowEvent y(int value) {
        ny(address(), value);
        return this;
    }

    public XCreateWindowEvent width(int value) {
        nwidth(address(), value);
        return this;
    }

    public XCreateWindowEvent height(int value) {
        nheight(address(), value);
        return this;
    }

    public XCreateWindowEvent border_width(int value) {
        nborder_width(address(), value);
        return this;
    }

    public XCreateWindowEvent override_redirect(int value) {
        noverride_redirect(address(), value);
        return this;
    }

    public XCreateWindowEvent set(int type, long serial, boolean send_event, long display, long parent, long window, int x, int y, int width, int height, int border_width, int override_redirect) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        parent(parent);
        window(window);
        x(x);
        y(y);
        width(width);
        height(height);
        border_width(border_width);
        override_redirect(override_redirect);
        return this;
    }

    public XCreateWindowEvent set(XCreateWindowEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XCreateWindowEvent malloc() {
        return new XCreateWindowEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XCreateWindowEvent calloc() {
        return new XCreateWindowEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XCreateWindowEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XCreateWindowEvent(MemoryUtil.memAddress(container), container);
    }

    public static XCreateWindowEvent create(long address) {
        return new XCreateWindowEvent(address, null);
    }

    public static XCreateWindowEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XCreateWindowEvent(address, null);
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

    public static XCreateWindowEvent malloc(MemoryStack stack) {
        return new XCreateWindowEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XCreateWindowEvent calloc(MemoryStack stack) {
        return new XCreateWindowEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nparent(long struct) {
        return MemoryUtil.memGetCLong(struct + PARENT);
    }

    public static long nwindow(long struct) {
        return MemoryUtil.memGetCLong(struct + WINDOW);
    }

    public static int nx(long struct) {
        return MemoryUtil.memGetInt(struct + X);
    }

    public static int ny(long struct) {
        return MemoryUtil.memGetInt(struct + Y);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int nborder_width(long struct) {
        return MemoryUtil.memGetInt(struct + BORDER_WIDTH);
    }

    public static int noverride_redirect(long struct) {
        return MemoryUtil.memGetInt(struct + OVERRIDE_REDIRECT);
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

    public static void nparent(long struct, long value) {
        MemoryUtil.memPutCLong(struct + PARENT, value);
    }

    public static void nwindow(long struct, long value) {
        MemoryUtil.memPutCLong(struct + WINDOW, value);
    }

    public static void nx(long struct, int value) {
        MemoryUtil.memPutInt(struct + X, value);
    }

    public static void ny(long struct, int value) {
        MemoryUtil.memPutInt(struct + Y, value);
    }

    public static void nwidth(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDTH, value);
    }

    public static void nheight(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEIGHT, value);
    }

    public static void nborder_width(long struct, int value) {
        MemoryUtil.memPutInt(struct + BORDER_WIDTH, value);
    }

    public static void noverride_redirect(long struct, int value) {
        MemoryUtil.memPutInt(struct + OVERRIDE_REDIRECT, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XCreateWindowEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XCreateWindowEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XCreateWindowEvent, Buffer> implements NativeResource {
        private static final XCreateWindowEvent ELEMENT_FACTORY = XCreateWindowEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XCreateWindowEvent.SIZEOF);
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
        public XCreateWindowEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XCreateWindowEvent.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XCreateWindowEvent.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XCreateWindowEvent.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XCreateWindowEvent.ndisplay(address());
        }

        @NativeType("Window")
        public long parent() {
            return XCreateWindowEvent.nparent(address());
        }

        @NativeType("Window")
        public long window() {
            return XCreateWindowEvent.nwindow(address());
        }

        public int x() {
            return XCreateWindowEvent.nx(address());
        }

        public int y() {
            return XCreateWindowEvent.ny(address());
        }

        public int width() {
            return XCreateWindowEvent.nwidth(address());
        }

        public int height() {
            return XCreateWindowEvent.nheight(address());
        }

        public int border_width() {
            return XCreateWindowEvent.nborder_width(address());
        }

        public int override_redirect() {
            return XCreateWindowEvent.noverride_redirect(address());
        }

        public Buffer type(int value) {
            XCreateWindowEvent.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XCreateWindowEvent.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XCreateWindowEvent.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XCreateWindowEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer parent(@NativeType("Window") long value) {
            XCreateWindowEvent.nparent(address(), value);
            return this;
        }

        public Buffer window(@NativeType("Window") long value) {
            XCreateWindowEvent.nwindow(address(), value);
            return this;
        }

        public Buffer x(int value) {
            XCreateWindowEvent.nx(address(), value);
            return this;
        }

        public Buffer y(int value) {
            XCreateWindowEvent.ny(address(), value);
            return this;
        }

        public Buffer width(int value) {
            XCreateWindowEvent.nwidth(address(), value);
            return this;
        }

        public Buffer height(int value) {
            XCreateWindowEvent.nheight(address(), value);
            return this;
        }

        public Buffer border_width(int value) {
            XCreateWindowEvent.nborder_width(address(), value);
            return this;
        }

        public Buffer override_redirect(int value) {
            XCreateWindowEvent.noverride_redirect(address(), value);
            return this;
        }
    }
}
