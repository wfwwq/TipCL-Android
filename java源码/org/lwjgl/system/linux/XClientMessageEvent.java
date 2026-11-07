package org.lwjgl.system.linux;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.CLongBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XClientMessageEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XClientMessageEvent.class */
public class XClientMessageEvent extends Struct<XClientMessageEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int WINDOW;
    public static final int MESSAGE_TYPE;
    public static final int FORMAT;
    public static final int DATA;
    public static final int DATA_B;
    public static final int DATA_S;
    public static final int DATA_L;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(4), __struct(__array(1, 20), __array(2, 10), __array(CLONG_SIZE, 5)));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        MESSAGE_TYPE = layout.offsetof(5);
        FORMAT = layout.offsetof(6);
        DATA = layout.offsetof(7);
        DATA_B = layout.offsetof(8);
        DATA_S = layout.offsetof(9);
        DATA_L = layout.offsetof(10);
    }

    protected XClientMessageEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XClientMessageEvent create(long address, ByteBuffer container) {
        return new XClientMessageEvent(address, container);
    }

    public XClientMessageEvent(ByteBuffer container) {
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
    public long message_type() {
        return nmessage_type(address());
    }

    public int format() {
        return nformat(address());
    }

    @NativeType("char[20]")
    public ByteBuffer data_b() {
        return ndata_b(address());
    }

    @NativeType("char")
    public byte data_b(int index) {
        return ndata_b(address(), index);
    }

    @NativeType("short[10]")
    public ShortBuffer data_s() {
        return ndata_s(address());
    }

    public short data_s(int index) {
        return ndata_s(address(), index);
    }

    @NativeType("long[5]")
    public CLongBuffer data_l() {
        return ndata_l(address());
    }

    public long data_l(int index) {
        return ndata_l(address(), index);
    }

    public XClientMessageEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XClientMessageEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XClientMessageEvent send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XClientMessageEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XClientMessageEvent window(@NativeType("Window") long value) {
        nwindow(address(), value);
        return this;
    }

    public XClientMessageEvent message_type(@NativeType("Atom") long value) {
        nmessage_type(address(), value);
        return this;
    }

    public XClientMessageEvent format(int value) {
        nformat(address(), value);
        return this;
    }

    public XClientMessageEvent data_b(@NativeType("char[20]") ByteBuffer value) {
        ndata_b(address(), value);
        return this;
    }

    public XClientMessageEvent data_b(int index, @NativeType("char") byte value) {
        ndata_b(address(), index, value);
        return this;
    }

    public XClientMessageEvent data_s(@NativeType("short[10]") ShortBuffer value) {
        ndata_s(address(), value);
        return this;
    }

    public XClientMessageEvent data_s(int index, short value) {
        ndata_s(address(), index, value);
        return this;
    }

    public XClientMessageEvent data_l(@NativeType("long[5]") CLongBuffer value) {
        ndata_l(address(), value);
        return this;
    }

    public XClientMessageEvent data_l(int index, long value) {
        ndata_l(address(), index, value);
        return this;
    }

    public XClientMessageEvent set(int type, long serial, boolean send_event, long display, long window, long message_type, int format, ByteBuffer data_b, ShortBuffer data_s, CLongBuffer data_l) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        message_type(message_type);
        format(format);
        data_b(data_b);
        data_s(data_s);
        data_l(data_l);
        return this;
    }

    public XClientMessageEvent set(XClientMessageEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XClientMessageEvent malloc() {
        return new XClientMessageEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XClientMessageEvent calloc() {
        return new XClientMessageEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XClientMessageEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XClientMessageEvent(MemoryUtil.memAddress(container), container);
    }

    public static XClientMessageEvent create(long address) {
        return new XClientMessageEvent(address, null);
    }

    public static XClientMessageEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XClientMessageEvent(address, null);
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

    public static XClientMessageEvent malloc(MemoryStack stack) {
        return new XClientMessageEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XClientMessageEvent calloc(MemoryStack stack) {
        return new XClientMessageEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmessage_type(long struct) {
        return MemoryUtil.memGetCLong(struct + MESSAGE_TYPE);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static ByteBuffer ndata_b(long struct) {
        return MemoryUtil.memByteBuffer(struct + DATA_B, 20);
    }

    public static byte ndata_b(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DATA_B + (Checks.check(index, 20) * 1));
    }

    public static ShortBuffer ndata_s(long struct) {
        return MemoryUtil.memShortBuffer(struct + DATA_S, 10);
    }

    public static short ndata_s(long struct, int index) {
        return MemoryUtil.memGetShort(struct + DATA_S + (Checks.check(index, 10) * 2));
    }

    public static CLongBuffer ndata_l(long struct) {
        return MemoryUtil.memCLongBuffer(struct + DATA_L, 5);
    }

    public static long ndata_l(long struct, int index) {
        return MemoryUtil.memGetCLong(struct + DATA_L + (Checks.check(index, 5) * CLONG_SIZE));
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

    public static void nmessage_type(long struct, long value) {
        MemoryUtil.memPutCLong(struct + MESSAGE_TYPE, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void ndata_b(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 20);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DATA_B, value.remaining() * 1);
    }

    public static void ndata_b(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + DATA_B + (Checks.check(index, 20) * 1), value);
    }

    public static void ndata_s(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 10);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DATA_S, value.remaining() * 2);
    }

    public static void ndata_s(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + DATA_S + (Checks.check(index, 10) * 2), value);
    }

    public static void ndata_l(long struct, CLongBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 5);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DATA_L, value.remaining() * CLONG_SIZE);
    }

    public static void ndata_l(long struct, int index, long value) {
        MemoryUtil.memPutCLong(struct + DATA_L + (Checks.check(index, 5) * CLONG_SIZE), value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XClientMessageEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XClientMessageEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XClientMessageEvent, Buffer> implements NativeResource {
        private static final XClientMessageEvent ELEMENT_FACTORY = XClientMessageEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XClientMessageEvent.SIZEOF);
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
        public XClientMessageEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XClientMessageEvent.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XClientMessageEvent.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XClientMessageEvent.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XClientMessageEvent.ndisplay(address());
        }

        @NativeType("Window")
        public long window() {
            return XClientMessageEvent.nwindow(address());
        }

        @NativeType("Atom")
        public long message_type() {
            return XClientMessageEvent.nmessage_type(address());
        }

        public int format() {
            return XClientMessageEvent.nformat(address());
        }

        @NativeType("char[20]")
        public ByteBuffer data_b() {
            return XClientMessageEvent.ndata_b(address());
        }

        @NativeType("char")
        public byte data_b(int index) {
            return XClientMessageEvent.ndata_b(address(), index);
        }

        @NativeType("short[10]")
        public ShortBuffer data_s() {
            return XClientMessageEvent.ndata_s(address());
        }

        public short data_s(int index) {
            return XClientMessageEvent.ndata_s(address(), index);
        }

        @NativeType("long[5]")
        public CLongBuffer data_l() {
            return XClientMessageEvent.ndata_l(address());
        }

        public long data_l(int index) {
            return XClientMessageEvent.ndata_l(address(), index);
        }

        public Buffer type(int value) {
            XClientMessageEvent.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XClientMessageEvent.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XClientMessageEvent.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XClientMessageEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer window(@NativeType("Window") long value) {
            XClientMessageEvent.nwindow(address(), value);
            return this;
        }

        public Buffer message_type(@NativeType("Atom") long value) {
            XClientMessageEvent.nmessage_type(address(), value);
            return this;
        }

        public Buffer format(int value) {
            XClientMessageEvent.nformat(address(), value);
            return this;
        }

        public Buffer data_b(@NativeType("char[20]") ByteBuffer value) {
            XClientMessageEvent.ndata_b(address(), value);
            return this;
        }

        public Buffer data_b(int index, @NativeType("char") byte value) {
            XClientMessageEvent.ndata_b(address(), index, value);
            return this;
        }

        public Buffer data_s(@NativeType("short[10]") ShortBuffer value) {
            XClientMessageEvent.ndata_s(address(), value);
            return this;
        }

        public Buffer data_s(int index, short value) {
            XClientMessageEvent.ndata_s(address(), index, value);
            return this;
        }

        public Buffer data_l(@NativeType("long[5]") CLongBuffer value) {
            XClientMessageEvent.ndata_l(address(), value);
            return this;
        }

        public Buffer data_l(int index, long value) {
            XClientMessageEvent.ndata_l(address(), index, value);
            return this;
        }
    }
}
