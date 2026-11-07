package org.lwjgl.system.windows;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/MSG.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/MSG.class */
public class MSG extends Struct<MSG> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HWND;
    public static final int MESSAGE;
    public static final int WPARAM;
    public static final int LPARAM;
    public static final int TIME;
    public static final int PT;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINT.SIZEOF, POINT.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HWND = layout.offsetof(0);
        MESSAGE = layout.offsetof(1);
        WPARAM = layout.offsetof(2);
        LPARAM = layout.offsetof(3);
        TIME = layout.offsetof(4);
        PT = layout.offsetof(5);
    }

    protected MSG(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public MSG create(long address, ByteBuffer container) {
        return new MSG(address, container);
    }

    public MSG(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("HWND")
    public long hwnd() {
        return nhwnd(address());
    }

    @NativeType("UINT")
    public int message() {
        return nmessage(address());
    }

    @NativeType("WPARAM")
    public long wParam() {
        return nwParam(address());
    }

    @NativeType("LPARAM")
    public long lParam() {
        return nlParam(address());
    }

    @NativeType("DWORD")
    public int time() {
        return ntime(address());
    }

    public POINT pt() {
        return npt(address());
    }

    public MSG hwnd(@NativeType("HWND") long value) {
        nhwnd(address(), value);
        return this;
    }

    public MSG message(@NativeType("UINT") int value) {
        nmessage(address(), value);
        return this;
    }

    public MSG wParam(@NativeType("WPARAM") long value) {
        nwParam(address(), value);
        return this;
    }

    public MSG lParam(@NativeType("LPARAM") long value) {
        nlParam(address(), value);
        return this;
    }

    public MSG time(@NativeType("DWORD") int value) {
        ntime(address(), value);
        return this;
    }

    public MSG pt(POINT value) {
        npt(address(), value);
        return this;
    }

    public MSG pt(Consumer<POINT> consumer) {
        consumer.accept(pt());
        return this;
    }

    public MSG set(long hwnd, int message, long wParam, long lParam, int time, POINT pt) {
        hwnd(hwnd);
        message(message);
        wParam(wParam);
        lParam(lParam);
        time(time);
        pt(pt);
        return this;
    }

    public MSG set(MSG src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static MSG malloc() {
        return new MSG(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static MSG calloc() {
        return new MSG(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static MSG create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MSG(MemoryUtil.memAddress(container), container);
    }

    public static MSG create(long address) {
        return new MSG(address, null);
    }

    public static MSG createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new MSG(address, null);
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

    public static MSG malloc(MemoryStack stack) {
        return new MSG(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static MSG calloc(MemoryStack stack) {
        return new MSG(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nhwnd(long struct) {
        return MemoryUtil.memGetAddress(struct + HWND);
    }

    public static int nmessage(long struct) {
        return MemoryUtil.memGetInt(struct + MESSAGE);
    }

    public static long nwParam(long struct) {
        return MemoryUtil.memGetAddress(struct + WPARAM);
    }

    public static long nlParam(long struct) {
        return MemoryUtil.memGetAddress(struct + LPARAM);
    }

    public static int ntime(long struct) {
        return MemoryUtil.memGetInt(struct + TIME);
    }

    public static POINT npt(long struct) {
        return POINT.create(struct + PT);
    }

    public static void nhwnd(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HWND, value);
    }

    public static void nmessage(long struct, int value) {
        MemoryUtil.memPutInt(struct + MESSAGE, value);
    }

    public static void nwParam(long struct, long value) {
        MemoryUtil.memPutAddress(struct + WPARAM, value);
    }

    public static void nlParam(long struct, long value) {
        MemoryUtil.memPutAddress(struct + LPARAM, value);
    }

    public static void ntime(long struct, int value) {
        MemoryUtil.memPutInt(struct + TIME, value);
    }

    public static void npt(long struct, POINT value) {
        MemoryUtil.memCopy(value.address(), struct + PT, POINT.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/MSG$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/MSG$Buffer.class */
    public static class Buffer extends StructBuffer<MSG, Buffer> implements NativeResource {
        private static final MSG ELEMENT_FACTORY = MSG.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / MSG.SIZEOF);
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
        public MSG getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("HWND")
        public long hwnd() {
            return MSG.nhwnd(address());
        }

        @NativeType("UINT")
        public int message() {
            return MSG.nmessage(address());
        }

        @NativeType("WPARAM")
        public long wParam() {
            return MSG.nwParam(address());
        }

        @NativeType("LPARAM")
        public long lParam() {
            return MSG.nlParam(address());
        }

        @NativeType("DWORD")
        public int time() {
            return MSG.ntime(address());
        }

        public POINT pt() {
            return MSG.npt(address());
        }

        public Buffer hwnd(@NativeType("HWND") long value) {
            MSG.nhwnd(address(), value);
            return this;
        }

        public Buffer message(@NativeType("UINT") int value) {
            MSG.nmessage(address(), value);
            return this;
        }

        public Buffer wParam(@NativeType("WPARAM") long value) {
            MSG.nwParam(address(), value);
            return this;
        }

        public Buffer lParam(@NativeType("LPARAM") long value) {
            MSG.nlParam(address(), value);
            return this;
        }

        public Buffer time(@NativeType("DWORD") int value) {
            MSG.ntime(address(), value);
            return this;
        }

        public Buffer pt(POINT value) {
            MSG.npt(address(), value);
            return this;
        }

        public Buffer pt(Consumer<POINT> consumer) {
            consumer.accept(pt());
            return this;
        }
    }
}
