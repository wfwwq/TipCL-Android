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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/MOUSEINPUT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/MOUSEINPUT.class */
public class MOUSEINPUT extends Struct<MOUSEINPUT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DX;
    public static final int DY;
    public static final int MOUSEDATA;
    public static final int DWFLAGS;
    public static final int TIME;
    public static final int DWEXTRAINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DX = layout.offsetof(0);
        DY = layout.offsetof(1);
        MOUSEDATA = layout.offsetof(2);
        DWFLAGS = layout.offsetof(3);
        TIME = layout.offsetof(4);
        DWEXTRAINFO = layout.offsetof(5);
    }

    protected MOUSEINPUT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public MOUSEINPUT create(long address, ByteBuffer container) {
        return new MOUSEINPUT(address, container);
    }

    public MOUSEINPUT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("LONG")
    public int dx() {
        return ndx(address());
    }

    @NativeType("LONG")
    public int dy() {
        return ndy(address());
    }

    @NativeType("DWORD")
    public int mouseData() {
        return nmouseData(address());
    }

    @NativeType("DWORD")
    public int dwFlags() {
        return ndwFlags(address());
    }

    @NativeType("DWORD")
    public int time() {
        return ntime(address());
    }

    @NativeType("ULONG_PTR")
    public long dwExtraInfo() {
        return ndwExtraInfo(address());
    }

    public MOUSEINPUT dx(@NativeType("LONG") int value) {
        ndx(address(), value);
        return this;
    }

    public MOUSEINPUT dy(@NativeType("LONG") int value) {
        ndy(address(), value);
        return this;
    }

    public MOUSEINPUT mouseData(@NativeType("DWORD") int value) {
        nmouseData(address(), value);
        return this;
    }

    public MOUSEINPUT dwFlags(@NativeType("DWORD") int value) {
        ndwFlags(address(), value);
        return this;
    }

    public MOUSEINPUT time(@NativeType("DWORD") int value) {
        ntime(address(), value);
        return this;
    }

    public MOUSEINPUT dwExtraInfo(@NativeType("ULONG_PTR") long value) {
        ndwExtraInfo(address(), value);
        return this;
    }

    public MOUSEINPUT set(int dx, int dy, int mouseData, int dwFlags, int time, long dwExtraInfo) {
        dx(dx);
        dy(dy);
        mouseData(mouseData);
        dwFlags(dwFlags);
        time(time);
        dwExtraInfo(dwExtraInfo);
        return this;
    }

    public MOUSEINPUT set(MOUSEINPUT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static MOUSEINPUT malloc() {
        return new MOUSEINPUT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static MOUSEINPUT calloc() {
        return new MOUSEINPUT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static MOUSEINPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MOUSEINPUT(MemoryUtil.memAddress(container), container);
    }

    public static MOUSEINPUT create(long address) {
        return new MOUSEINPUT(address, null);
    }

    public static MOUSEINPUT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new MOUSEINPUT(address, null);
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

    public static MOUSEINPUT malloc(MemoryStack stack) {
        return new MOUSEINPUT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static MOUSEINPUT calloc(MemoryStack stack) {
        return new MOUSEINPUT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ndx(long struct) {
        return MemoryUtil.memGetInt(struct + DX);
    }

    public static int ndy(long struct) {
        return MemoryUtil.memGetInt(struct + DY);
    }

    public static int nmouseData(long struct) {
        return MemoryUtil.memGetInt(struct + MOUSEDATA);
    }

    public static int ndwFlags(long struct) {
        return MemoryUtil.memGetInt(struct + DWFLAGS);
    }

    public static int ntime(long struct) {
        return MemoryUtil.memGetInt(struct + TIME);
    }

    public static long ndwExtraInfo(long struct) {
        return MemoryUtil.memGetAddress(struct + DWEXTRAINFO);
    }

    public static void ndx(long struct, int value) {
        MemoryUtil.memPutInt(struct + DX, value);
    }

    public static void ndy(long struct, int value) {
        MemoryUtil.memPutInt(struct + DY, value);
    }

    public static void nmouseData(long struct, int value) {
        MemoryUtil.memPutInt(struct + MOUSEDATA, value);
    }

    public static void ndwFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + DWFLAGS, value);
    }

    public static void ntime(long struct, int value) {
        MemoryUtil.memPutInt(struct + TIME, value);
    }

    public static void ndwExtraInfo(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DWEXTRAINFO, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/MOUSEINPUT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/MOUSEINPUT$Buffer.class */
    public static class Buffer extends StructBuffer<MOUSEINPUT, Buffer> implements NativeResource {
        private static final MOUSEINPUT ELEMENT_FACTORY = MOUSEINPUT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / MOUSEINPUT.SIZEOF);
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
        public MOUSEINPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("LONG")
        public int dx() {
            return MOUSEINPUT.ndx(address());
        }

        @NativeType("LONG")
        public int dy() {
            return MOUSEINPUT.ndy(address());
        }

        @NativeType("DWORD")
        public int mouseData() {
            return MOUSEINPUT.nmouseData(address());
        }

        @NativeType("DWORD")
        public int dwFlags() {
            return MOUSEINPUT.ndwFlags(address());
        }

        @NativeType("DWORD")
        public int time() {
            return MOUSEINPUT.ntime(address());
        }

        @NativeType("ULONG_PTR")
        public long dwExtraInfo() {
            return MOUSEINPUT.ndwExtraInfo(address());
        }

        public Buffer dx(@NativeType("LONG") int value) {
            MOUSEINPUT.ndx(address(), value);
            return this;
        }

        public Buffer dy(@NativeType("LONG") int value) {
            MOUSEINPUT.ndy(address(), value);
            return this;
        }

        public Buffer mouseData(@NativeType("DWORD") int value) {
            MOUSEINPUT.nmouseData(address(), value);
            return this;
        }

        public Buffer dwFlags(@NativeType("DWORD") int value) {
            MOUSEINPUT.ndwFlags(address(), value);
            return this;
        }

        public Buffer time(@NativeType("DWORD") int value) {
            MOUSEINPUT.ntime(address(), value);
            return this;
        }

        public Buffer dwExtraInfo(@NativeType("ULONG_PTR") long value) {
            MOUSEINPUT.ndwExtraInfo(address(), value);
            return this;
        }
    }
}
