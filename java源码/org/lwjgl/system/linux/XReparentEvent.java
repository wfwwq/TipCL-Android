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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XReparentEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XReparentEvent.class */
public class XReparentEvent extends Struct<XReparentEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int EVENT;
    public static final int WINDOW;
    public static final int PARENT;
    public static final int X;
    public static final int Y;
    public static final int OVERRIDE_REDIRECT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        EVENT = layout.offsetof(4);
        WINDOW = layout.offsetof(5);
        PARENT = layout.offsetof(6);
        X = layout.offsetof(7);
        Y = layout.offsetof(8);
        OVERRIDE_REDIRECT = layout.offsetof(9);
    }

    protected XReparentEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XReparentEvent create(long address, ByteBuffer container) {
        return new XReparentEvent(address, container);
    }

    public XReparentEvent(ByteBuffer container) {
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
    public long event() {
        return nevent(address());
    }

    @NativeType("Window")
    public long window() {
        return nwindow(address());
    }

    @NativeType("Window")
    public long parent() {
        return nparent(address());
    }

    public int x() {
        return nx(address());
    }

    public int y() {
        return ny(address());
    }

    public int override_redirect() {
        return noverride_redirect(address());
    }

    public XReparentEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XReparentEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XReparentEvent send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XReparentEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XReparentEvent event(@NativeType("Window") long value) {
        nevent(address(), value);
        return this;
    }

    public XReparentEvent window(@NativeType("Window") long value) {
        nwindow(address(), value);
        return this;
    }

    public XReparentEvent parent(@NativeType("Window") long value) {
        nparent(address(), value);
        return this;
    }

    public XReparentEvent x(int value) {
        nx(address(), value);
        return this;
    }

    public XReparentEvent y(int value) {
        ny(address(), value);
        return this;
    }

    public XReparentEvent override_redirect(int value) {
        noverride_redirect(address(), value);
        return this;
    }

    public XReparentEvent set(int type, long serial, boolean send_event, long display, long event, long window, long parent, int x, int y, int override_redirect) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        event(event);
        window(window);
        parent(parent);
        x(x);
        y(y);
        override_redirect(override_redirect);
        return this;
    }

    public XReparentEvent set(XReparentEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XReparentEvent malloc() {
        return new XReparentEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XReparentEvent calloc() {
        return new XReparentEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XReparentEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XReparentEvent(MemoryUtil.memAddress(container), container);
    }

    public static XReparentEvent create(long address) {
        return new XReparentEvent(address, null);
    }

    public static XReparentEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XReparentEvent(address, null);
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

    public static XReparentEvent malloc(MemoryStack stack) {
        return new XReparentEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XReparentEvent calloc(MemoryStack stack) {
        return new XReparentEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nevent(long struct) {
        return MemoryUtil.memGetCLong(struct + EVENT);
    }

    public static long nwindow(long struct) {
        return MemoryUtil.memGetCLong(struct + WINDOW);
    }

    public static long nparent(long struct) {
        return MemoryUtil.memGetCLong(struct + PARENT);
    }

    public static int nx(long struct) {
        return MemoryUtil.memGetInt(struct + X);
    }

    public static int ny(long struct) {
        return MemoryUtil.memGetInt(struct + Y);
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

    public static void nevent(long struct, long value) {
        MemoryUtil.memPutCLong(struct + EVENT, value);
    }

    public static void nwindow(long struct, long value) {
        MemoryUtil.memPutCLong(struct + WINDOW, value);
    }

    public static void nparent(long struct, long value) {
        MemoryUtil.memPutCLong(struct + PARENT, value);
    }

    public static void nx(long struct, int value) {
        MemoryUtil.memPutInt(struct + X, value);
    }

    public static void ny(long struct, int value) {
        MemoryUtil.memPutInt(struct + Y, value);
    }

    public static void noverride_redirect(long struct, int value) {
        MemoryUtil.memPutInt(struct + OVERRIDE_REDIRECT, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XReparentEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XReparentEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XReparentEvent, Buffer> implements NativeResource {
        private static final XReparentEvent ELEMENT_FACTORY = XReparentEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XReparentEvent.SIZEOF);
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
        public XReparentEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XReparentEvent.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XReparentEvent.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XReparentEvent.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XReparentEvent.ndisplay(address());
        }

        @NativeType("Window")
        public long event() {
            return XReparentEvent.nevent(address());
        }

        @NativeType("Window")
        public long window() {
            return XReparentEvent.nwindow(address());
        }

        @NativeType("Window")
        public long parent() {
            return XReparentEvent.nparent(address());
        }

        public int x() {
            return XReparentEvent.nx(address());
        }

        public int y() {
            return XReparentEvent.ny(address());
        }

        public int override_redirect() {
            return XReparentEvent.noverride_redirect(address());
        }

        public Buffer type(int value) {
            XReparentEvent.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XReparentEvent.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XReparentEvent.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XReparentEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer event(@NativeType("Window") long value) {
            XReparentEvent.nevent(address(), value);
            return this;
        }

        public Buffer window(@NativeType("Window") long value) {
            XReparentEvent.nwindow(address(), value);
            return this;
        }

        public Buffer parent(@NativeType("Window") long value) {
            XReparentEvent.nparent(address(), value);
            return this;
        }

        public Buffer x(int value) {
            XReparentEvent.nx(address(), value);
            return this;
        }

        public Buffer y(int value) {
            XReparentEvent.ny(address(), value);
            return this;
        }

        public Buffer override_redirect(int value) {
            XReparentEvent.noverride_redirect(address(), value);
            return this;
        }
    }
}
