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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/MONITORINFOEX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/MONITORINFOEX.class */
public class MONITORINFOEX extends Struct<MONITORINFOEX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CBSIZE;
    public static final int RCMONITOR;
    public static final int RCWORK;
    public static final int DWFLAGS;
    public static final int SZDEVICE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(RECT.SIZEOF, RECT.ALIGNOF), __member(RECT.SIZEOF, RECT.ALIGNOF), __member(4), __array(2, 32));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CBSIZE = layout.offsetof(0);
        RCMONITOR = layout.offsetof(1);
        RCWORK = layout.offsetof(2);
        DWFLAGS = layout.offsetof(3);
        SZDEVICE = layout.offsetof(4);
    }

    protected MONITORINFOEX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public MONITORINFOEX create(long address, ByteBuffer container) {
        return new MONITORINFOEX(address, container);
    }

    public MONITORINFOEX(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("DWORD")
    public int cbSize() {
        return ncbSize(address());
    }

    public RECT rcMonitor() {
        return nrcMonitor(address());
    }

    public RECT rcWork() {
        return nrcWork(address());
    }

    @NativeType("DWORD")
    public int dwFlags() {
        return ndwFlags(address());
    }

    @NativeType("TCHAR[32]")
    public ByteBuffer szDevice() {
        return nszDevice(address());
    }

    @NativeType("TCHAR[32]")
    public String szDeviceString() {
        return nszDeviceString(address());
    }

    public MONITORINFOEX cbSize(@NativeType("DWORD") int value) {
        ncbSize(address(), value);
        return this;
    }

    public MONITORINFOEX set(MONITORINFOEX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static MONITORINFOEX malloc() {
        return new MONITORINFOEX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static MONITORINFOEX calloc() {
        return new MONITORINFOEX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static MONITORINFOEX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MONITORINFOEX(MemoryUtil.memAddress(container), container);
    }

    public static MONITORINFOEX create(long address) {
        return new MONITORINFOEX(address, null);
    }

    public static MONITORINFOEX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new MONITORINFOEX(address, null);
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

    public static MONITORINFOEX malloc(MemoryStack stack) {
        return new MONITORINFOEX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static MONITORINFOEX calloc(MemoryStack stack) {
        return new MONITORINFOEX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ncbSize(long struct) {
        return MemoryUtil.memGetInt(struct + CBSIZE);
    }

    public static RECT nrcMonitor(long struct) {
        return RECT.create(struct + RCMONITOR);
    }

    public static RECT nrcWork(long struct) {
        return RECT.create(struct + RCWORK);
    }

    public static int ndwFlags(long struct) {
        return MemoryUtil.memGetInt(struct + DWFLAGS);
    }

    public static ByteBuffer nszDevice(long struct) {
        return MemoryUtil.memByteBuffer(struct + SZDEVICE, 64);
    }

    public static String nszDeviceString(long struct) {
        return MemoryUtil.memUTF16(struct + SZDEVICE);
    }

    public static void ncbSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + CBSIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/MONITORINFOEX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/MONITORINFOEX$Buffer.class */
    public static class Buffer extends StructBuffer<MONITORINFOEX, Buffer> implements NativeResource {
        private static final MONITORINFOEX ELEMENT_FACTORY = MONITORINFOEX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / MONITORINFOEX.SIZEOF);
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
        public MONITORINFOEX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("DWORD")
        public int cbSize() {
            return MONITORINFOEX.ncbSize(address());
        }

        public RECT rcMonitor() {
            return MONITORINFOEX.nrcMonitor(address());
        }

        public RECT rcWork() {
            return MONITORINFOEX.nrcWork(address());
        }

        @NativeType("DWORD")
        public int dwFlags() {
            return MONITORINFOEX.ndwFlags(address());
        }

        @NativeType("TCHAR[32]")
        public ByteBuffer szDevice() {
            return MONITORINFOEX.nszDevice(address());
        }

        @NativeType("TCHAR[32]")
        public String szDeviceString() {
            return MONITORINFOEX.nszDeviceString(address());
        }

        public Buffer cbSize(@NativeType("DWORD") int value) {
            MONITORINFOEX.ncbSize(address(), value);
            return this;
        }
    }
}
