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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XSelectionClearEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XSelectionClearEvent.class */
public class XSelectionClearEvent extends Struct<XSelectionClearEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int WINDOW;
    public static final int SELECTION;
    public static final int TIME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        SELECTION = layout.offsetof(5);
        TIME = layout.offsetof(6);
    }

    protected XSelectionClearEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XSelectionClearEvent create(long address, ByteBuffer container) {
        return new XSelectionClearEvent(address, container);
    }

    public XSelectionClearEvent(ByteBuffer container) {
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

    @NativeType("Atom")
    public long selection() {
        return nselection(address());
    }

    @NativeType("Time")
    public long time() {
        return ntime(address());
    }

    public XSelectionClearEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XSelectionClearEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XSelectionClearEvent send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XSelectionClearEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XSelectionClearEvent window(@NativeType("Window") long value) {
        nwindow(address(), value);
        return this;
    }

    public XSelectionClearEvent selection(@NativeType("Atom") long value) {
        nselection(address(), value);
        return this;
    }

    public XSelectionClearEvent time(@NativeType("Time") long value) {
        ntime(address(), value);
        return this;
    }

    public XSelectionClearEvent set(int type, long serial, boolean send_event, long display, long window, long selection, long time) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        selection(selection);
        time(time);
        return this;
    }

    public XSelectionClearEvent set(XSelectionClearEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XSelectionClearEvent malloc() {
        return new XSelectionClearEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XSelectionClearEvent calloc() {
        return new XSelectionClearEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XSelectionClearEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XSelectionClearEvent(MemoryUtil.memAddress(container), container);
    }

    public static XSelectionClearEvent create(long address) {
        return new XSelectionClearEvent(address, null);
    }

    public static XSelectionClearEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XSelectionClearEvent(address, null);
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

    public static XSelectionClearEvent malloc(MemoryStack stack) {
        return new XSelectionClearEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XSelectionClearEvent calloc(MemoryStack stack) {
        return new XSelectionClearEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nselection(long struct) {
        return MemoryUtil.memGetCLong(struct + SELECTION);
    }

    public static long ntime(long struct) {
        return MemoryUtil.memGetCLong(struct + TIME);
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

    public static void nselection(long struct, long value) {
        MemoryUtil.memPutCLong(struct + SELECTION, value);
    }

    public static void ntime(long struct, long value) {
        MemoryUtil.memPutCLong(struct + TIME, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XSelectionClearEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XSelectionClearEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XSelectionClearEvent, Buffer> implements NativeResource {
        private static final XSelectionClearEvent ELEMENT_FACTORY = XSelectionClearEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XSelectionClearEvent.SIZEOF);
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
        public XSelectionClearEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XSelectionClearEvent.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XSelectionClearEvent.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XSelectionClearEvent.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XSelectionClearEvent.ndisplay(address());
        }

        @NativeType("Window")
        public long window() {
            return XSelectionClearEvent.nwindow(address());
        }

        @NativeType("Atom")
        public long selection() {
            return XSelectionClearEvent.nselection(address());
        }

        @NativeType("Time")
        public long time() {
            return XSelectionClearEvent.ntime(address());
        }

        public Buffer type(int value) {
            XSelectionClearEvent.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XSelectionClearEvent.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XSelectionClearEvent.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XSelectionClearEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer window(@NativeType("Window") long value) {
            XSelectionClearEvent.nwindow(address(), value);
            return this;
        }

        public Buffer selection(@NativeType("Atom") long value) {
            XSelectionClearEvent.nselection(address(), value);
            return this;
        }

        public Buffer time(@NativeType("Time") long value) {
            XSelectionClearEvent.ntime(address(), value);
            return this;
        }
    }
}
