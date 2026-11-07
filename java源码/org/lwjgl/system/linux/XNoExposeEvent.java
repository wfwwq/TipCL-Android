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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XNoExposeEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XNoExposeEvent.class */
public class XNoExposeEvent extends Struct<XNoExposeEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int DRAWABLE;
    public static final int MAJOR_CODE;
    public static final int MINOR_CODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        DRAWABLE = layout.offsetof(4);
        MAJOR_CODE = layout.offsetof(5);
        MINOR_CODE = layout.offsetof(6);
    }

    protected XNoExposeEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XNoExposeEvent create(long address, ByteBuffer container) {
        return new XNoExposeEvent(address, container);
    }

    public XNoExposeEvent(ByteBuffer container) {
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

    @NativeType("Drawable")
    public long drawable() {
        return ndrawable(address());
    }

    public int major_code() {
        return nmajor_code(address());
    }

    public int minor_code() {
        return nminor_code(address());
    }

    public XNoExposeEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XNoExposeEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XNoExposeEvent send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XNoExposeEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XNoExposeEvent drawable(@NativeType("Drawable") long value) {
        ndrawable(address(), value);
        return this;
    }

    public XNoExposeEvent major_code(int value) {
        nmajor_code(address(), value);
        return this;
    }

    public XNoExposeEvent minor_code(int value) {
        nminor_code(address(), value);
        return this;
    }

    public XNoExposeEvent set(int type, long serial, boolean send_event, long display, long drawable, int major_code, int minor_code) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        drawable(drawable);
        major_code(major_code);
        minor_code(minor_code);
        return this;
    }

    public XNoExposeEvent set(XNoExposeEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XNoExposeEvent malloc() {
        return new XNoExposeEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XNoExposeEvent calloc() {
        return new XNoExposeEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XNoExposeEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XNoExposeEvent(MemoryUtil.memAddress(container), container);
    }

    public static XNoExposeEvent create(long address) {
        return new XNoExposeEvent(address, null);
    }

    public static XNoExposeEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XNoExposeEvent(address, null);
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

    public static XNoExposeEvent malloc(MemoryStack stack) {
        return new XNoExposeEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XNoExposeEvent calloc(MemoryStack stack) {
        return new XNoExposeEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndrawable(long struct) {
        return MemoryUtil.memGetCLong(struct + DRAWABLE);
    }

    public static int nmajor_code(long struct) {
        return MemoryUtil.memGetInt(struct + MAJOR_CODE);
    }

    public static int nminor_code(long struct) {
        return MemoryUtil.memGetInt(struct + MINOR_CODE);
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

    public static void ndrawable(long struct, long value) {
        MemoryUtil.memPutCLong(struct + DRAWABLE, value);
    }

    public static void nmajor_code(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAJOR_CODE, value);
    }

    public static void nminor_code(long struct, int value) {
        MemoryUtil.memPutInt(struct + MINOR_CODE, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XNoExposeEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XNoExposeEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XNoExposeEvent, Buffer> implements NativeResource {
        private static final XNoExposeEvent ELEMENT_FACTORY = XNoExposeEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XNoExposeEvent.SIZEOF);
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
        public XNoExposeEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XNoExposeEvent.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XNoExposeEvent.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XNoExposeEvent.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XNoExposeEvent.ndisplay(address());
        }

        @NativeType("Drawable")
        public long drawable() {
            return XNoExposeEvent.ndrawable(address());
        }

        public int major_code() {
            return XNoExposeEvent.nmajor_code(address());
        }

        public int minor_code() {
            return XNoExposeEvent.nminor_code(address());
        }

        public Buffer type(int value) {
            XNoExposeEvent.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XNoExposeEvent.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XNoExposeEvent.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XNoExposeEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer drawable(@NativeType("Drawable") long value) {
            XNoExposeEvent.ndrawable(address(), value);
            return this;
        }

        public Buffer major_code(int value) {
            XNoExposeEvent.nmajor_code(address(), value);
            return this;
        }

        public Buffer minor_code(int value) {
            XNoExposeEvent.nminor_code(address(), value);
            return this;
        }
    }
}
