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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XResizeRequestEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XResizeRequestEvent.class */
public class XResizeRequestEvent extends Struct<XResizeRequestEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int WINDOW;
    public static final int WIDTH;
    public static final int HEIGHT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        WIDTH = layout.offsetof(5);
        HEIGHT = layout.offsetof(6);
    }

    protected XResizeRequestEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XResizeRequestEvent create(long address, ByteBuffer container) {
        return new XResizeRequestEvent(address, container);
    }

    public XResizeRequestEvent(ByteBuffer container) {
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
    public long window() {
        return nwindow(address());
    }

    public int width() {
        return nwidth(address());
    }

    public int height() {
        return nheight(address());
    }

    public XResizeRequestEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XResizeRequestEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XResizeRequestEvent send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XResizeRequestEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XResizeRequestEvent window(@NativeType("Window") long value) {
        nwindow(address(), value);
        return this;
    }

    public XResizeRequestEvent width(int value) {
        nwidth(address(), value);
        return this;
    }

    public XResizeRequestEvent height(int value) {
        nheight(address(), value);
        return this;
    }

    public XResizeRequestEvent set(int type, long serial, boolean send_event, long display, long window, int width, int height) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        width(width);
        height(height);
        return this;
    }

    public XResizeRequestEvent set(XResizeRequestEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XResizeRequestEvent malloc() {
        return new XResizeRequestEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XResizeRequestEvent calloc() {
        return new XResizeRequestEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XResizeRequestEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XResizeRequestEvent(MemoryUtil.memAddress(container), container);
    }

    public static XResizeRequestEvent create(long address) {
        return new XResizeRequestEvent(address, null);
    }

    public static XResizeRequestEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XResizeRequestEvent(address, null);
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

    public static XResizeRequestEvent malloc(MemoryStack stack) {
        return new XResizeRequestEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XResizeRequestEvent calloc(MemoryStack stack) {
        return new XResizeRequestEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nwindow(long struct) {
        return MemoryUtil.memGetCLong(struct + WINDOW);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
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

    public static void nwindow(long struct, long value) {
        MemoryUtil.memPutCLong(struct + WINDOW, value);
    }

    public static void nwidth(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDTH, value);
    }

    public static void nheight(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEIGHT, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XResizeRequestEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XResizeRequestEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XResizeRequestEvent, Buffer> implements NativeResource {
        private static final XResizeRequestEvent ELEMENT_FACTORY = XResizeRequestEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XResizeRequestEvent.SIZEOF);
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
        public XResizeRequestEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XResizeRequestEvent.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XResizeRequestEvent.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XResizeRequestEvent.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XResizeRequestEvent.ndisplay(address());
        }

        @NativeType("Window")
        public long window() {
            return XResizeRequestEvent.nwindow(address());
        }

        public int width() {
            return XResizeRequestEvent.nwidth(address());
        }

        public int height() {
            return XResizeRequestEvent.nheight(address());
        }

        public Buffer type(int value) {
            XResizeRequestEvent.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XResizeRequestEvent.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XResizeRequestEvent.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XResizeRequestEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer window(@NativeType("Window") long value) {
            XResizeRequestEvent.nwindow(address(), value);
            return this;
        }

        public Buffer width(int value) {
            XResizeRequestEvent.nwidth(address(), value);
            return this;
        }

        public Buffer height(int value) {
            XResizeRequestEvent.nheight(address(), value);
            return this;
        }
    }
}
