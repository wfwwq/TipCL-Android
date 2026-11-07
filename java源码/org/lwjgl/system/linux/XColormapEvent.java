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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XColormapEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XColormapEvent.class */
public class XColormapEvent extends Struct<XColormapEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int WINDOW;
    public static final int COLORMAP;
    public static final int NEW;
    public static final int STATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        COLORMAP = layout.offsetof(5);
        NEW = layout.offsetof(6);
        STATE = layout.offsetof(7);
    }

    protected XColormapEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XColormapEvent create(long address, ByteBuffer container) {
        return new XColormapEvent(address, container);
    }

    public XColormapEvent(ByteBuffer container) {
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

    @NativeType("Colormap")
    public long colormap() {
        return ncolormap(address());
    }

    public int new$() {
        return nnew$(address());
    }

    public int state() {
        return nstate(address());
    }

    public XColormapEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XColormapEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XColormapEvent send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XColormapEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XColormapEvent window(@NativeType("Window") long value) {
        nwindow(address(), value);
        return this;
    }

    public XColormapEvent colormap(@NativeType("Colormap") long value) {
        ncolormap(address(), value);
        return this;
    }

    public XColormapEvent new$(int value) {
        nnew$(address(), value);
        return this;
    }

    public XColormapEvent state(int value) {
        nstate(address(), value);
        return this;
    }

    public XColormapEvent set(int type, long serial, boolean send_event, long display, long window, long colormap, int new$, int state) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        colormap(colormap);
        new$(new$);
        state(state);
        return this;
    }

    public XColormapEvent set(XColormapEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XColormapEvent malloc() {
        return new XColormapEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XColormapEvent calloc() {
        return new XColormapEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XColormapEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XColormapEvent(MemoryUtil.memAddress(container), container);
    }

    public static XColormapEvent create(long address) {
        return new XColormapEvent(address, null);
    }

    public static XColormapEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XColormapEvent(address, null);
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

    public static XColormapEvent malloc(MemoryStack stack) {
        return new XColormapEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XColormapEvent calloc(MemoryStack stack) {
        return new XColormapEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ncolormap(long struct) {
        return MemoryUtil.memGetCLong(struct + COLORMAP);
    }

    public static int nnew$(long struct) {
        return MemoryUtil.memGetInt(struct + NEW);
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

    public static void ncolormap(long struct, long value) {
        MemoryUtil.memPutCLong(struct + COLORMAP, value);
    }

    public static void nnew$(long struct, int value) {
        MemoryUtil.memPutInt(struct + NEW, value);
    }

    public static void nstate(long struct, int value) {
        MemoryUtil.memPutInt(struct + STATE, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XColormapEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XColormapEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XColormapEvent, Buffer> implements NativeResource {
        private static final XColormapEvent ELEMENT_FACTORY = XColormapEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XColormapEvent.SIZEOF);
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
        public XColormapEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XColormapEvent.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XColormapEvent.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XColormapEvent.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XColormapEvent.ndisplay(address());
        }

        @NativeType("Window")
        public long window() {
            return XColormapEvent.nwindow(address());
        }

        @NativeType("Colormap")
        public long colormap() {
            return XColormapEvent.ncolormap(address());
        }

        public int new$() {
            return XColormapEvent.nnew$(address());
        }

        public int state() {
            return XColormapEvent.nstate(address());
        }

        public Buffer type(int value) {
            XColormapEvent.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XColormapEvent.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XColormapEvent.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XColormapEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer window(@NativeType("Window") long value) {
            XColormapEvent.nwindow(address(), value);
            return this;
        }

        public Buffer colormap(@NativeType("Colormap") long value) {
            XColormapEvent.ncolormap(address(), value);
            return this;
        }

        public Buffer new$(int value) {
            XColormapEvent.nnew$(address(), value);
            return this;
        }

        public Buffer state(int value) {
            XColormapEvent.nstate(address(), value);
            return this;
        }
    }
}
