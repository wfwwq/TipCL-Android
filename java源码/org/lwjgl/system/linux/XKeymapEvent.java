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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XKeymapEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XKeymapEvent.class */
public class XKeymapEvent extends Struct<XKeymapEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int WINDOW;
    public static final int KEY_VECTOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __array(1, 32));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        KEY_VECTOR = layout.offsetof(5);
    }

    protected XKeymapEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XKeymapEvent create(long address, ByteBuffer container) {
        return new XKeymapEvent(address, container);
    }

    public XKeymapEvent(ByteBuffer container) {
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

    @NativeType("char[32]")
    public ByteBuffer key_vector() {
        return nkey_vector(address());
    }

    @NativeType("char")
    public byte key_vector(int index) {
        return nkey_vector(address(), index);
    }

    public XKeymapEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XKeymapEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XKeymapEvent send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XKeymapEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XKeymapEvent window(@NativeType("Window") long value) {
        nwindow(address(), value);
        return this;
    }

    public XKeymapEvent key_vector(@NativeType("char[32]") ByteBuffer value) {
        nkey_vector(address(), value);
        return this;
    }

    public XKeymapEvent key_vector(int index, @NativeType("char") byte value) {
        nkey_vector(address(), index, value);
        return this;
    }

    public XKeymapEvent set(int type, long serial, boolean send_event, long display, long window, ByteBuffer key_vector) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        key_vector(key_vector);
        return this;
    }

    public XKeymapEvent set(XKeymapEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XKeymapEvent malloc() {
        return new XKeymapEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XKeymapEvent calloc() {
        return new XKeymapEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XKeymapEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XKeymapEvent(MemoryUtil.memAddress(container), container);
    }

    public static XKeymapEvent create(long address) {
        return new XKeymapEvent(address, null);
    }

    public static XKeymapEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XKeymapEvent(address, null);
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

    public static XKeymapEvent malloc(MemoryStack stack) {
        return new XKeymapEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XKeymapEvent calloc(MemoryStack stack) {
        return new XKeymapEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer nkey_vector(long struct) {
        return MemoryUtil.memByteBuffer(struct + KEY_VECTOR, 32);
    }

    public static byte nkey_vector(long struct, int index) {
        return MemoryUtil.memGetByte(struct + KEY_VECTOR + (Checks.check(index, 32) * 1));
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

    public static void nkey_vector(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + KEY_VECTOR, value.remaining() * 1);
    }

    public static void nkey_vector(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + KEY_VECTOR + (Checks.check(index, 32) * 1), value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XKeymapEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XKeymapEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XKeymapEvent, Buffer> implements NativeResource {
        private static final XKeymapEvent ELEMENT_FACTORY = XKeymapEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XKeymapEvent.SIZEOF);
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
        public XKeymapEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XKeymapEvent.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XKeymapEvent.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XKeymapEvent.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XKeymapEvent.ndisplay(address());
        }

        @NativeType("Window")
        public long window() {
            return XKeymapEvent.nwindow(address());
        }

        @NativeType("char[32]")
        public ByteBuffer key_vector() {
            return XKeymapEvent.nkey_vector(address());
        }

        @NativeType("char")
        public byte key_vector(int index) {
            return XKeymapEvent.nkey_vector(address(), index);
        }

        public Buffer type(int value) {
            XKeymapEvent.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XKeymapEvent.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XKeymapEvent.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XKeymapEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer window(@NativeType("Window") long value) {
            XKeymapEvent.nwindow(address(), value);
            return this;
        }

        public Buffer key_vector(@NativeType("char[32]") ByteBuffer value) {
            XKeymapEvent.nkey_vector(address(), value);
            return this;
        }

        public Buffer key_vector(int index, @NativeType("char") byte value) {
            XKeymapEvent.nkey_vector(address(), index, value);
            return this;
        }
    }
}
