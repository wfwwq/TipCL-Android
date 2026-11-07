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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XSelectionRequestEvent.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XSelectionRequestEvent.class */
public class XSelectionRequestEvent extends Struct<XSelectionRequestEvent> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SERIAL;
    public static final int SEND_EVENT;
    public static final int DISPLAY;
    public static final int OWNER;
    public static final int REQUESTOR;
    public static final int SELECTION;
    public static final int TARGET;
    public static final int PROPERTY;
    public static final int TIME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(CLONG_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        OWNER = layout.offsetof(4);
        REQUESTOR = layout.offsetof(5);
        SELECTION = layout.offsetof(6);
        TARGET = layout.offsetof(7);
        PROPERTY = layout.offsetof(8);
        TIME = layout.offsetof(9);
    }

    protected XSelectionRequestEvent(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public XSelectionRequestEvent create(long address, ByteBuffer container) {
        return new XSelectionRequestEvent(address, container);
    }

    public XSelectionRequestEvent(ByteBuffer container) {
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
    public long owner() {
        return nowner(address());
    }

    @NativeType("Window")
    public long requestor() {
        return nrequestor(address());
    }

    @NativeType("Atom")
    public long selection() {
        return nselection(address());
    }

    @NativeType("Atom")
    public long target() {
        return ntarget(address());
    }

    @NativeType("Atom")
    public long property() {
        return nproperty(address());
    }

    @NativeType("Time")
    public long time() {
        return ntime(address());
    }

    public XSelectionRequestEvent type(int value) {
        ntype(address(), value);
        return this;
    }

    public XSelectionRequestEvent serial(@NativeType("unsigned long") long value) {
        nserial(address(), value);
        return this;
    }

    public XSelectionRequestEvent send_event(@NativeType("Bool") boolean value) {
        nsend_event(address(), value ? 1 : 0);
        return this;
    }

    public XSelectionRequestEvent display(@NativeType("Display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public XSelectionRequestEvent owner(@NativeType("Window") long value) {
        nowner(address(), value);
        return this;
    }

    public XSelectionRequestEvent requestor(@NativeType("Window") long value) {
        nrequestor(address(), value);
        return this;
    }

    public XSelectionRequestEvent selection(@NativeType("Atom") long value) {
        nselection(address(), value);
        return this;
    }

    public XSelectionRequestEvent target(@NativeType("Atom") long value) {
        ntarget(address(), value);
        return this;
    }

    public XSelectionRequestEvent property(@NativeType("Atom") long value) {
        nproperty(address(), value);
        return this;
    }

    public XSelectionRequestEvent time(@NativeType("Time") long value) {
        ntime(address(), value);
        return this;
    }

    public XSelectionRequestEvent set(int type, long serial, boolean send_event, long display, long owner, long requestor, long selection, long target, long property, long time) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        owner(owner);
        requestor(requestor);
        selection(selection);
        target(target);
        property(property);
        time(time);
        return this;
    }

    public XSelectionRequestEvent set(XSelectionRequestEvent src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static XSelectionRequestEvent malloc() {
        return new XSelectionRequestEvent(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static XSelectionRequestEvent calloc() {
        return new XSelectionRequestEvent(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static XSelectionRequestEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XSelectionRequestEvent(MemoryUtil.memAddress(container), container);
    }

    public static XSelectionRequestEvent create(long address) {
        return new XSelectionRequestEvent(address, null);
    }

    public static XSelectionRequestEvent createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new XSelectionRequestEvent(address, null);
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

    public static XSelectionRequestEvent malloc(MemoryStack stack) {
        return new XSelectionRequestEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static XSelectionRequestEvent calloc(MemoryStack stack) {
        return new XSelectionRequestEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nowner(long struct) {
        return MemoryUtil.memGetCLong(struct + OWNER);
    }

    public static long nrequestor(long struct) {
        return MemoryUtil.memGetCLong(struct + REQUESTOR);
    }

    public static long nselection(long struct) {
        return MemoryUtil.memGetCLong(struct + SELECTION);
    }

    public static long ntarget(long struct) {
        return MemoryUtil.memGetCLong(struct + TARGET);
    }

    public static long nproperty(long struct) {
        return MemoryUtil.memGetCLong(struct + PROPERTY);
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

    public static void nowner(long struct, long value) {
        MemoryUtil.memPutCLong(struct + OWNER, value);
    }

    public static void nrequestor(long struct, long value) {
        MemoryUtil.memPutCLong(struct + REQUESTOR, value);
    }

    public static void nselection(long struct, long value) {
        MemoryUtil.memPutCLong(struct + SELECTION, value);
    }

    public static void ntarget(long struct, long value) {
        MemoryUtil.memPutCLong(struct + TARGET, value);
    }

    public static void nproperty(long struct, long value) {
        MemoryUtil.memPutCLong(struct + PROPERTY, value);
    }

    public static void ntime(long struct, long value) {
        MemoryUtil.memPutCLong(struct + TIME, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + DISPLAY));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/XSelectionRequestEvent$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/XSelectionRequestEvent$Buffer.class */
    public static class Buffer extends StructBuffer<XSelectionRequestEvent, Buffer> implements NativeResource {
        private static final XSelectionRequestEvent ELEMENT_FACTORY = XSelectionRequestEvent.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / XSelectionRequestEvent.SIZEOF);
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
        public XSelectionRequestEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int type() {
            return XSelectionRequestEvent.ntype(address());
        }

        @NativeType("unsigned long")
        public long serial() {
            return XSelectionRequestEvent.nserial(address());
        }

        @NativeType("Bool")
        public boolean send_event() {
            return XSelectionRequestEvent.nsend_event(address()) != 0;
        }

        @NativeType("Display *")
        public long display() {
            return XSelectionRequestEvent.ndisplay(address());
        }

        @NativeType("Window")
        public long owner() {
            return XSelectionRequestEvent.nowner(address());
        }

        @NativeType("Window")
        public long requestor() {
            return XSelectionRequestEvent.nrequestor(address());
        }

        @NativeType("Atom")
        public long selection() {
            return XSelectionRequestEvent.nselection(address());
        }

        @NativeType("Atom")
        public long target() {
            return XSelectionRequestEvent.ntarget(address());
        }

        @NativeType("Atom")
        public long property() {
            return XSelectionRequestEvent.nproperty(address());
        }

        @NativeType("Time")
        public long time() {
            return XSelectionRequestEvent.ntime(address());
        }

        public Buffer type(int value) {
            XSelectionRequestEvent.ntype(address(), value);
            return this;
        }

        public Buffer serial(@NativeType("unsigned long") long value) {
            XSelectionRequestEvent.nserial(address(), value);
            return this;
        }

        public Buffer send_event(@NativeType("Bool") boolean value) {
            XSelectionRequestEvent.nsend_event(address(), value ? 1 : 0);
            return this;
        }

        public Buffer display(@NativeType("Display *") long value) {
            XSelectionRequestEvent.ndisplay(address(), value);
            return this;
        }

        public Buffer owner(@NativeType("Window") long value) {
            XSelectionRequestEvent.nowner(address(), value);
            return this;
        }

        public Buffer requestor(@NativeType("Window") long value) {
            XSelectionRequestEvent.nrequestor(address(), value);
            return this;
        }

        public Buffer selection(@NativeType("Atom") long value) {
            XSelectionRequestEvent.nselection(address(), value);
            return this;
        }

        public Buffer target(@NativeType("Atom") long value) {
            XSelectionRequestEvent.ntarget(address(), value);
            return this;
        }

        public Buffer property(@NativeType("Atom") long value) {
            XSelectionRequestEvent.nproperty(address(), value);
            return this;
        }

        public Buffer time(@NativeType("Time") long value) {
            XSelectionRequestEvent.ntime(address(), value);
            return this;
        }
    }
}
