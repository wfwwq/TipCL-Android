package org.lwjgl.system.windows;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/TOUCHINPUT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/TOUCHINPUT.class */
public class TOUCHINPUT extends Struct<TOUCHINPUT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;
    public static final int HSOURCE;
    public static final int DWID;
    public static final int DWFLAGS;
    public static final int DWMASK;
    public static final int DWTIME;
    public static final int DWEXTRAINFO;
    public static final int CXCONTACT;
    public static final int CYCONTACT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        HSOURCE = layout.offsetof(2);
        DWID = layout.offsetof(3);
        DWFLAGS = layout.offsetof(4);
        DWMASK = layout.offsetof(5);
        DWTIME = layout.offsetof(6);
        DWEXTRAINFO = layout.offsetof(7);
        CXCONTACT = layout.offsetof(8);
        CYCONTACT = layout.offsetof(9);
    }

    protected TOUCHINPUT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public TOUCHINPUT create(long address, ByteBuffer container) {
        return new TOUCHINPUT(address, container);
    }

    public TOUCHINPUT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("LONG")
    public int x() {
        return nx(address());
    }

    @NativeType("LONG")
    public int y() {
        return ny(address());
    }

    @NativeType("HANDLE")
    public long hSource() {
        return nhSource(address());
    }

    @NativeType("DWORD")
    public int dwID() {
        return ndwID(address());
    }

    @NativeType("DWORD")
    public int dwFlags() {
        return ndwFlags(address());
    }

    @NativeType("DWORD")
    public int dwMask() {
        return ndwMask(address());
    }

    @NativeType("DWORD")
    public int dwTime() {
        return ndwTime(address());
    }

    @NativeType("ULONG_PTR")
    public long dwExtraInfo() {
        return ndwExtraInfo(address());
    }

    @NativeType("DWORD")
    public int cxContact() {
        return ncxContact(address());
    }

    @NativeType("DWORD")
    public int cyContact() {
        return ncyContact(address());
    }

    public static TOUCHINPUT malloc() {
        return new TOUCHINPUT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static TOUCHINPUT calloc() {
        return new TOUCHINPUT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static TOUCHINPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new TOUCHINPUT(MemoryUtil.memAddress(container), container);
    }

    public static TOUCHINPUT create(long address) {
        return new TOUCHINPUT(address, null);
    }

    public static TOUCHINPUT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new TOUCHINPUT(address, null);
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

    public static TOUCHINPUT malloc(MemoryStack stack) {
        return new TOUCHINPUT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static TOUCHINPUT calloc(MemoryStack stack) {
        return new TOUCHINPUT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nx(long struct) {
        return MemoryUtil.memGetInt(struct + X);
    }

    public static int ny(long struct) {
        return MemoryUtil.memGetInt(struct + Y);
    }

    public static long nhSource(long struct) {
        return MemoryUtil.memGetAddress(struct + HSOURCE);
    }

    public static int ndwID(long struct) {
        return MemoryUtil.memGetInt(struct + DWID);
    }

    public static int ndwFlags(long struct) {
        return MemoryUtil.memGetInt(struct + DWFLAGS);
    }

    public static int ndwMask(long struct) {
        return MemoryUtil.memGetInt(struct + DWMASK);
    }

    public static int ndwTime(long struct) {
        return MemoryUtil.memGetInt(struct + DWTIME);
    }

    public static long ndwExtraInfo(long struct) {
        return MemoryUtil.memGetAddress(struct + DWEXTRAINFO);
    }

    public static int ncxContact(long struct) {
        return MemoryUtil.memGetInt(struct + CXCONTACT);
    }

    public static int ncyContact(long struct) {
        return MemoryUtil.memGetInt(struct + CYCONTACT);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/TOUCHINPUT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/TOUCHINPUT$Buffer.class */
    public static class Buffer extends StructBuffer<TOUCHINPUT, Buffer> implements NativeResource {
        private static final TOUCHINPUT ELEMENT_FACTORY = TOUCHINPUT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / TOUCHINPUT.SIZEOF);
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
        public TOUCHINPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("LONG")
        public int x() {
            return TOUCHINPUT.nx(address());
        }

        @NativeType("LONG")
        public int y() {
            return TOUCHINPUT.ny(address());
        }

        @NativeType("HANDLE")
        public long hSource() {
            return TOUCHINPUT.nhSource(address());
        }

        @NativeType("DWORD")
        public int dwID() {
            return TOUCHINPUT.ndwID(address());
        }

        @NativeType("DWORD")
        public int dwFlags() {
            return TOUCHINPUT.ndwFlags(address());
        }

        @NativeType("DWORD")
        public int dwMask() {
            return TOUCHINPUT.ndwMask(address());
        }

        @NativeType("DWORD")
        public int dwTime() {
            return TOUCHINPUT.ndwTime(address());
        }

        @NativeType("ULONG_PTR")
        public long dwExtraInfo() {
            return TOUCHINPUT.ndwExtraInfo(address());
        }

        @NativeType("DWORD")
        public int cxContact() {
            return TOUCHINPUT.ncxContact(address());
        }

        @NativeType("DWORD")
        public int cyContact() {
            return TOUCHINPUT.ncyContact(address());
        }
    }
}
