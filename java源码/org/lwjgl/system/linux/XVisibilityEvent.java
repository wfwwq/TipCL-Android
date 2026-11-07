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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XVisibilityEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XVisibilityEvent.class */
public class XVisibilityEvent extends Struct<XVisibilityEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int WINDOW;
    public static final int STATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        STATE = layout.offsetof(5);
    }

    protected XVisibilityEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XVisibilityEvent create(long address, ByteBuffer container) {
        return new XVisibilityEvent(address, container);
    }

    public XVisibilityEvent(ByteBuffer container) {
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

    public int state() {
        return nstate(address());
    }

    public XVisibilityEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XVisibilityEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XVisibilityEvent send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XVisibilityEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XVisibilityEvent window(@NativeType("Window") long value) {
        nwindow(address(), value);
        return this;
    }

    public XVisibilityEvent state(int value) {
        nstate(address(), value);
        return this;
    }

    public XVisibilityEvent set(int type, long serial, boolean send_event, long display, long window, int state) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        state(state);
        return this;
    }

    public XVisibilityEvent set(XVisibilityEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XVisibilityEvent malloc() {
        return new XVisibilityEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XVisibilityEvent calloc() {
        return new XVisibilityEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XVisibilityEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XVisibilityEvent(MemoryUtil.memAddress(container), container);
    }

    public static XVisibilityEvent create(long address) {
        return new XVisibilityEvent(address, null);
    }

    public static XVisibilityEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XVisibilityEvent(address, null);
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

    public static XVisibilityEvent malloc(MemoryStack stack) {
        return new XVisibilityEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XVisibilityEvent calloc(MemoryStack stack) {
        return new XVisibilityEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstate(long struct) {
        return MemoryUtil.memGetInt(struct + STATE);
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

    public static void nstate(long struct, int value) {
        MemoryUtil.memPutInt(struct + STATE, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XVisibilityEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XVisibilityEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XVisibilityEvent, Buffer> implements NativeResource {
        private static final XVisibilityEvent ELEMENT_FACTORY = XVisibilityEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XVisibilityEvent.SIZEOF);
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
        public XVisibilityEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XVisibilityEvent.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XVisibilityEvent.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XVisibilityEvent.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XVisibilityEvent.ndisplay(address());
        }

        @NativeType("Window")
        public long window() {
            return XVisibilityEvent.nwindow(address());
        }

        public int state() {
            return XVisibilityEvent.nstate(address());
        }

        public Buffer type(int value) {
            XVisibilityEvent.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XVisibilityEvent.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XVisibilityEvent.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XVisibilityEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer window(@NativeType("Window") long value) {
            XVisibilityEvent.nwindow(address(), value);
            return this;
        }

        public Buffer state(int value) {
            XVisibilityEvent.nstate(address(), value);
            return this;
        }
    }
}
