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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/KEYBDINPUT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/KEYBDINPUT.class */
public class KEYBDINPUT extends Struct<KEYBDINPUT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WVK;
    public static final int WSCAN;
    public static final int DWFLAGS;
    public static final int TIME;
    public static final int DWEXTRAINFO;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WVK = layout.offsetof(0);
        WSCAN = layout.offsetof(1);
        DWFLAGS = layout.offsetof(2);
        TIME = layout.offsetof(3);
        DWEXTRAINFO = layout.offsetof(4);
    }

    protected KEYBDINPUT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public KEYBDINPUT create(long address, ByteBuffer container) {
        return new KEYBDINPUT(address, container);
    }

    public KEYBDINPUT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("WORD")
    public short wVk() {
        return nwVk(address());
    }

    @NativeType("WORD")
    public short wScan() {
        return nwScan(address());
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

    public KEYBDINPUT wVk(@NativeType("WORD") short value) {
        nwVk(address(), value);
        return this;
    }

    public KEYBDINPUT wScan(@NativeType("WORD") short value) {
        nwScan(address(), value);
        return this;
    }

    public KEYBDINPUT dwFlags(@NativeType("DWORD") int value) {
        ndwFlags(address(), value);
        return this;
    }

    public KEYBDINPUT time(@NativeType("DWORD") int value) {
        ntime(address(), value);
        return this;
    }

    public KEYBDINPUT dwExtraInfo(@NativeType("ULONG_PTR") long value) {
        ndwExtraInfo(address(), value);
        return this;
    }

    public KEYBDINPUT set(short wVk, short wScan, int dwFlags, int time, long dwExtraInfo) {
        wVk(wVk);
        wScan(wScan);
        dwFlags(dwFlags);
        time(time);
        dwExtraInfo(dwExtraInfo);
        return this;
    }

    public KEYBDINPUT set(KEYBDINPUT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static KEYBDINPUT malloc() {
        return new KEYBDINPUT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static KEYBDINPUT calloc() {
        return new KEYBDINPUT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static KEYBDINPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new KEYBDINPUT(MemoryUtil.memAddress(container), container);
    }

    public static KEYBDINPUT create(long address) {
        return new KEYBDINPUT(address, null);
    }

    public static KEYBDINPUT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new KEYBDINPUT(address, null);
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

    public static KEYBDINPUT malloc(MemoryStack stack) {
        return new KEYBDINPUT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static KEYBDINPUT calloc(MemoryStack stack) {
        return new KEYBDINPUT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nwVk(long struct) {
        return MemoryUtil.memGetShort(struct + WVK);
    }

    public static short nwScan(long struct) {
        return MemoryUtil.memGetShort(struct + WSCAN);
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

    public static void nwVk(long struct, short value) {
        MemoryUtil.memPutShort(struct + WVK, value);
    }

    public static void nwScan(long struct, short value) {
        MemoryUtil.memPutShort(struct + WSCAN, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/KEYBDINPUT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/KEYBDINPUT$Buffer.class */
    public static class Buffer extends StructBuffer<KEYBDINPUT, Buffer> implements NativeResource {
        private static final KEYBDINPUT ELEMENT_FACTORY = KEYBDINPUT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / KEYBDINPUT.SIZEOF);
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
        public KEYBDINPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("WORD")
        public short wVk() {
            return KEYBDINPUT.nwVk(address());
        }

        @NativeType("WORD")
        public short wScan() {
            return KEYBDINPUT.nwScan(address());
        }

        @NativeType("DWORD")
        public int dwFlags() {
            return KEYBDINPUT.ndwFlags(address());
        }

        @NativeType("DWORD")
        public int time() {
            return KEYBDINPUT.ntime(address());
        }

        @NativeType("ULONG_PTR")
        public long dwExtraInfo() {
            return KEYBDINPUT.ndwExtraInfo(address());
        }

        public Buffer wVk(@NativeType("WORD") short value) {
            KEYBDINPUT.nwVk(address(), value);
            return this;
        }

        public Buffer wScan(@NativeType("WORD") short value) {
            KEYBDINPUT.nwScan(address(), value);
            return this;
        }

        public Buffer dwFlags(@NativeType("DWORD") int value) {
            KEYBDINPUT.ndwFlags(address(), value);
            return this;
        }

        public Buffer time(@NativeType("DWORD") int value) {
            KEYBDINPUT.ntime(address(), value);
            return this;
        }

        public Buffer dwExtraInfo(@NativeType("ULONG_PTR") long value) {
            KEYBDINPUT.ndwExtraInfo(address(), value);
            return this;
        }
    }
}
