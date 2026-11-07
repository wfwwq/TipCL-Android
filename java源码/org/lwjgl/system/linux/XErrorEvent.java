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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XErrorEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XErrorEvent.class */
public class XErrorEvent extends Struct<XErrorEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int DISPLAY;
    public static final int RESOURCEID;
    public static final int SERIAL;
    public static final int ERROR_CODE;
    public static final int REQUEST_CODE;
    public static final int MINOR_CODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        DISPLAY = layout.offsetof(1);
        RESOURCEID = layout.offsetof(2);
        SERIAL = layout.offsetof(3);
        ERROR_CODE = layout.offsetof(4);
        REQUEST_CODE = layout.offsetof(5);
        MINOR_CODE = layout.offsetof(6);
    }

    protected XErrorEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XErrorEvent create(long address, ByteBuffer container) {
        return new XErrorEvent(address, container);
    }

    public XErrorEvent(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int type() {
        return ntype(address());
    }

    @NativeType("Display *")
    public long display() {
        return ndisplay(address());
    }

    @NativeType("XID")
    public long resourceid() {
        return nresourceid(address());
    }

    @NativeType("unsigned long")
    public long serial() {
        return nserial(address());
    }

    @NativeType("unsigned char")
    public byte error_code() {
        return nerror_code(address());
    }

    @NativeType("unsigned char")
    public byte request_code() {
        return nrequest_code(address());
    }

    @NativeType("unsigned char")
    public byte minor_code() {
        return nminor_code(address());
    }

    public XErrorEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XErrorEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XErrorEvent resourceid(@NativeType("XID") long value) {
        nresourceid(address(), value);
        return this;
    }

    public XErrorEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XErrorEvent error_code(@NativeType("unsigned char") byte value) {
        nerror_code(address(), value);
        return this;
    }

    public XErrorEvent request_code(@NativeType("unsigned char") byte value) {
        nrequest_code(address(), value);
        return this;
    }

    public XErrorEvent minor_code(@NativeType("unsigned char") byte value) {
        nminor_code(address(), value);
        return this;
    }

    public XErrorEvent set(int type, long display, long resourceid, long serial, byte error_code, byte request_code, byte minor_code) {
        type(type);
        display(display);
        resourceid(resourceid);
        serial(serial);
        error_code(error_code);
        request_code(request_code);
        minor_code(minor_code);
        return this;
    }

    public XErrorEvent set(XErrorEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XErrorEvent malloc() {
        return new XErrorEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XErrorEvent calloc() {
        return new XErrorEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XErrorEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XErrorEvent(MemoryUtil.memAddress(container), container);
    }

    public static XErrorEvent create(long address) {
        return new XErrorEvent(address, null);
    }

    public static XErrorEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XErrorEvent(address, null);
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

    public static XErrorEvent malloc(MemoryStack stack) {
        return new XErrorEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XErrorEvent calloc(MemoryStack stack) {
        return new XErrorEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndisplay(long struct) {
        return MemoryUtil.memGetAddress(struct + DISPLAY);
    }

    public static long nresourceid(long struct) {
        return MemoryUtil.memGetCLong(struct + RESOURCEID);
    }

    public static long nserial(long struct) {
        return MemoryUtil.memGetCLong(struct + SERIAL);
    }

    public static byte nerror_code(long struct) {
        return MemoryUtil.memGetByte(struct + ERROR_CODE);
    }

    public static byte nrequest_code(long struct) {
        return MemoryUtil.memGetByte(struct + REQUEST_CODE);
    }

    public static byte nminor_code(long struct) {
        return MemoryUtil.memGetByte(struct + MINOR_CODE);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void ndisplay(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DISPLAY, Checks.check(value));
    }

    public static void nresourceid(long struct, long value) {
        MemoryUtil.memPutCLong(struct + RESOURCEID, value);
    }

    public static void nserial(long struct, long value) {
        MemoryUtil.memPutCLong(struct + SERIAL, value);
    }

    public static void nerror_code(long struct, byte value) {
        MemoryUtil.memPutByte(struct + ERROR_CODE, value);
    }

    public static void nrequest_code(long struct, byte value) {
        MemoryUtil.memPutByte(struct + REQUEST_CODE, value);
    }

    public static void nminor_code(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MINOR_CODE, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XErrorEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XErrorEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XErrorEvent, Buffer> implements NativeResource {
        private static final XErrorEvent ELEMENT_FACTORY = XErrorEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XErrorEvent.SIZEOF);
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
        public XErrorEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XErrorEvent.ntype(address());
        }

        @NativeType("Display *")
        public long display() {
            return XErrorEvent.ndisplay(address());
        }

        @NativeType("XID")
        public long resourceid() {
            return XErrorEvent.nresourceid(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XErrorEvent.nserial(address());
        }

        @NativeType("unsigned char")
        public byte error_code() {
            return XErrorEvent.nerror_code(address());
        }

        @NativeType("unsigned char")
        public byte request_code() {
            return XErrorEvent.nrequest_code(address());
        }

        @NativeType("unsigned char")
        public byte minor_code() {
            return XErrorEvent.nminor_code(address());
        }

        public Buffer type(int value) {
            XErrorEvent.ntype(address(), value);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XErrorEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer resourceid(@NativeType("XID") long value) {
            XErrorEvent.nresourceid(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XErrorEvent.nserial(address(), value);
            return this;
        }

        public Buffer error_code(@NativeType("unsigned char") byte value) {
            XErrorEvent.nerror_code(address(), value);
            return this;
        }

        public Buffer request_code(@NativeType("unsigned char") byte value) {
            XErrorEvent.nrequest_code(address(), value);
            return this;
        }

        public Buffer minor_code(@NativeType("unsigned char") byte value) {
            XErrorEvent.nminor_code(address(), value);
            return this;
        }
    }
}
