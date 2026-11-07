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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XKeyEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XKeyEvent.class */
public class XKeyEvent extends Struct<XKeyEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int WINDOW;
    public static final int ROOT;
    public static final int SUBWINDOW;
    public static final int TIME;
    public static final int X;
    public static final int Y;
    public static final int X_ROOT;
    public static final int Y_ROOT;
    public static final int STATE;
    public static final int KEYCODE;
    public static final int SAME_SCREEN;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        ROOT = layout.offsetof(5);
        SUBWINDOW = layout.offsetof(6);
        TIME = layout.offsetof(7);
        X = layout.offsetof(8);
        Y = layout.offsetof(9);
        X_ROOT = layout.offsetof(10);
        Y_ROOT = layout.offsetof(11);
        STATE = layout.offsetof(12);
        KEYCODE = layout.offsetof(13);
        SAME_SCREEN = layout.offsetof(14);
    }

    protected XKeyEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XKeyEvent create(long address, ByteBuffer container) {
        return new XKeyEvent(address, container);
    }

    public XKeyEvent(ByteBuffer container) {
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

    @NativeType("Window")
    public long root() {
        return nroot(address());
    }

    @NativeType("Window")
    public long subwindow() {
        return nsubwindow(address());
    }

    @NativeType("Time")
    public long time() {
        return ntime(address());
    }

    public int x() {
        return nx(address());
    }

    public int y() {
        return ny(address());
    }

    public int x_root() {
        return nx_root(address());
    }

    public int y_root() {
        return ny_root(address());
    }

    @NativeType("unsigned int")
    public int state() {
        return nstate(address());
    }

    @NativeType("unsigned int")
    public int keycode() {
        return nkeycode(address());
    }

    @NativeType("Bool")
    public boolean same_screen() {
        return nsame_screen(address()) != 0;
    }

    public XKeyEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XKeyEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XKeyEvent send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XKeyEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XKeyEvent window(@NativeType("Window") long value) {
        nwindow(address(), value);
        return this;
    }

    public XKeyEvent root(@NativeType("Window") long value) {
        nroot(address(), value);
        return this;
    }

    public XKeyEvent subwindow(@NativeType("Window") long value) {
        nsubwindow(address(), value);
        return this;
    }

    public XKeyEvent time(@NativeType("Time") long value) {
        ntime(address(), value);
        return this;
    }

    public XKeyEvent x(int value) {
        nx(address(), value);
        return this;
    }

    public XKeyEvent y(int value) {
        ny(address(), value);
        return this;
    }

    public XKeyEvent x_root(int value) {
        nx_root(address(), value);
        return this;
    }

    public XKeyEvent y_root(int value) {
        ny_root(address(), value);
        return this;
    }

    public XKeyEvent state(@NativeType("unsigned int") int value) {
        nstate(address(), value);
        return this;
    }

    public XKeyEvent keycode(@NativeType("unsigned int") int value) {
        nkeycode(address(), value);
        return this;
    }

    public XKeyEvent same_screen(@NativeType("Bool") boolean value) {
        nsame_screen(address(), value ? 1 : 0);
        return this;
    }

    public XKeyEvent set(int type, long serial, boolean send_event, long display, long window, long root, long subwindow, long time, int x, int y, int x_root, int y_root, int state, int keycode, boolean same_screen) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        root(root);
        subwindow(subwindow);
        time(time);
        x(x);
        y(y);
        x_root(x_root);
        y_root(y_root);
        state(state);
        keycode(keycode);
        same_screen(same_screen);
        return this;
    }

    public XKeyEvent set(XKeyEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XKeyEvent malloc() {
        return new XKeyEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XKeyEvent calloc() {
        return new XKeyEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XKeyEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XKeyEvent(MemoryUtil.memAddress(container), container);
    }

    public static XKeyEvent create(long address) {
        return new XKeyEvent(address, null);
    }

    public static XKeyEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XKeyEvent(address, null);
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

    public static XKeyEvent malloc(MemoryStack stack) {
        return new XKeyEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XKeyEvent calloc(MemoryStack stack) {
        return new XKeyEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nroot(long struct) {
        return MemoryUtil.memGetCLong(struct + ROOT);
    }

    public static long nsubwindow(long struct) {
        return MemoryUtil.memGetCLong(struct + SUBWINDOW);
    }

    public static long ntime(long struct) {
        return MemoryUtil.memGetCLong(struct + TIME);
    }

    public static int nx(long struct) {
        return MemoryUtil.memGetInt(struct + X);
    }

    public static int ny(long struct) {
        return MemoryUtil.memGetInt(struct + Y);
    }

    public static int nx_root(long struct) {
        return MemoryUtil.memGetInt(struct + X_ROOT);
    }

    public static int ny_root(long struct) {
        return MemoryUtil.memGetInt(struct + Y_ROOT);
    }

    public static int nstate(long struct) {
        return MemoryUtil.memGetInt(struct + STATE);
    }

    public static int nkeycode(long struct) {
        return MemoryUtil.memGetInt(struct + KEYCODE);
    }

    public static int nsame_screen(long struct) {
        return MemoryUtil.memGetInt(struct + SAME_SCREEN);
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

    public static void nroot(long struct, long value) {
        MemoryUtil.memPutCLong(struct + ROOT, value);
    }

    public static void nsubwindow(long struct, long value) {
        MemoryUtil.memPutCLong(struct + SUBWINDOW, value);
    }

    public static void ntime(long struct, long value) {
        MemoryUtil.memPutCLong(struct + TIME, value);
    }

    public static void nx(long struct, int value) {
        MemoryUtil.memPutInt(struct + X, value);
    }

    public static void ny(long struct, int value) {
        MemoryUtil.memPutInt(struct + Y, value);
    }

    public static void nx_root(long struct, int value) {
        MemoryUtil.memPutInt(struct + X_ROOT, value);
    }

    public static void ny_root(long struct, int value) {
        MemoryUtil.memPutInt(struct + Y_ROOT, value);
    }

    public static void nstate(long struct, int value) {
        MemoryUtil.memPutInt(struct + STATE, value);
    }

    public static void nkeycode(long struct, int value) {
        MemoryUtil.memPutInt(struct + KEYCODE, value);
    }

    public static void nsame_screen(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAME_SCREEN, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XKeyEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XKeyEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XKeyEvent, Buffer> implements NativeResource {
        private static final XKeyEvent ELEMENT_FACTORY = XKeyEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XKeyEvent.SIZEOF);
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
        public XKeyEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XKeyEvent.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XKeyEvent.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XKeyEvent.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XKeyEvent.ndisplay(address());
        }

        @NativeType("Window")
        public long window() {
            return XKeyEvent.nwindow(address());
        }

        @NativeType("Window")
        public long root() {
            return XKeyEvent.nroot(address());
        }

        @NativeType("Window")
        public long subwindow() {
            return XKeyEvent.nsubwindow(address());
        }

        @NativeType("Time")
        public long time() {
            return XKeyEvent.ntime(address());
        }

        public int x() {
            return XKeyEvent.nx(address());
        }

        public int y() {
            return XKeyEvent.ny(address());
        }

        public int x_root() {
            return XKeyEvent.nx_root(address());
        }

        public int y_root() {
            return XKeyEvent.ny_root(address());
        }

        @NativeType("unsigned int")
        public int state() {
            return XKeyEvent.nstate(address());
        }

        @NativeType("unsigned int")
        public int keycode() {
            return XKeyEvent.nkeycode(address());
        }

        @NativeType("Bool")
        public boolean same_screen() {
            return XKeyEvent.nsame_screen(address()) != 0;
        }

        public Buffer type(int value) {
            XKeyEvent.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XKeyEvent.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XKeyEvent.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XKeyEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer window(@NativeType("Window") long value) {
            XKeyEvent.nwindow(address(), value);
            return this;
        }

        public Buffer root(@NativeType("Window") long value) {
            XKeyEvent.nroot(address(), value);
            return this;
        }

        public Buffer subwindow(@NativeType("Window") long value) {
            XKeyEvent.nsubwindow(address(), value);
            return this;
        }

        public Buffer time(@NativeType("Time") long value) {
            XKeyEvent.ntime(address(), value);
            return this;
        }

        public Buffer x(int value) {
            XKeyEvent.nx(address(), value);
            return this;
        }

        public Buffer y(int value) {
            XKeyEvent.ny(address(), value);
            return this;
        }

        public Buffer x_root(int value) {
            XKeyEvent.nx_root(address(), value);
            return this;
        }

        public Buffer y_root(int value) {
            XKeyEvent.ny_root(address(), value);
            return this;
        }

        public Buffer state(@NativeType("unsigned int") int value) {
            XKeyEvent.nstate(address(), value);
            return this;
        }

        public Buffer keycode(@NativeType("unsigned int") int value) {
            XKeyEvent.nkeycode(address(), value);
            return this;
        }

        public Buffer same_screen(@NativeType("Bool") boolean value) {
            XKeyEvent.nsame_screen(address(), value ? 1 : 0);
            return this;
        }
    }
}
