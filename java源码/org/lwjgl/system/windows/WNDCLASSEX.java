package org.lwjgl.system.windows;

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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/WNDCLASSEX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/WNDCLASSEX.class */
public class WNDCLASSEX extends Struct<WNDCLASSEX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CBSIZE;
    public static final int STYLE;
    public static final int LPFNWNDPROC;
    public static final int CBCLSEXTRA;
    public static final int CBWNDEXTRA;
    public static final int HINSTANCE;
    public static final int HICON;
    public static final int HCURSOR;
    public static final int HBRBACKGROUND;
    public static final int LPSZMENUNAME;
    public static final int LPSZCLASSNAME;
    public static final int HICONSM;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CBSIZE = layout.offsetof(0);
        STYLE = layout.offsetof(1);
        LPFNWNDPROC = layout.offsetof(2);
        CBCLSEXTRA = layout.offsetof(3);
        CBWNDEXTRA = layout.offsetof(4);
        HINSTANCE = layout.offsetof(5);
        HICON = layout.offsetof(6);
        HCURSOR = layout.offsetof(7);
        HBRBACKGROUND = layout.offsetof(8);
        LPSZMENUNAME = layout.offsetof(9);
        LPSZCLASSNAME = layout.offsetof(10);
        HICONSM = layout.offsetof(11);
    }

    protected WNDCLASSEX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public WNDCLASSEX create(long address, ByteBuffer container) {
        return new WNDCLASSEX(address, container);
    }

    public WNDCLASSEX(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("UINT")
    public int cbSize() {
        return ncbSize(address());
    }

    @NativeType("UINT")
    public int style() {
        return nstyle(address());
    }

    @NativeType("WNDPROC")
    public WindowProc lpfnWndProc() {
        return nlpfnWndProc(address());
    }

    public int cbClsExtra() {
        return ncbClsExtra(address());
    }

    public int cbWndExtra() {
        return ncbWndExtra(address());
    }

    @NativeType("HINSTANCE")
    public long hInstance() {
        return nhInstance(address());
    }

    @NativeType("HICON")
    public long hIcon() {
        return nhIcon(address());
    }

    @NativeType("HCURSOR")
    public long hCursor() {
        return nhCursor(address());
    }

    @NativeType("HBRUSH")
    public long hbrBackground() {
        return nhbrBackground(address());
    }

    @NativeType("LPCTSTR")
    public ByteBuffer lpszMenuName() {
        return nlpszMenuName(address());
    }

    @NativeType("LPCTSTR")
    public String lpszMenuNameString() {
        return nlpszMenuNameString(address());
    }

    @NativeType("LPCTSTR")
    public ByteBuffer lpszClassName() {
        return nlpszClassName(address());
    }

    @NativeType("LPCTSTR")
    public String lpszClassNameString() {
        return nlpszClassNameString(address());
    }

    @NativeType("HICON")
    public long hIconSm() {
        return nhIconSm(address());
    }

    public WNDCLASSEX cbSize(@NativeType("UINT") int value) {
        ncbSize(address(), value);
        return this;
    }

    public WNDCLASSEX style(@NativeType("UINT") int value) {
        nstyle(address(), value);
        return this;
    }

    public WNDCLASSEX lpfnWndProc(@NativeType("WNDPROC") WindowProcI value) {
        nlpfnWndProc(address(), value);
        return this;
    }

    public WNDCLASSEX cbClsExtra(int value) {
        ncbClsExtra(address(), value);
        return this;
    }

    public WNDCLASSEX cbWndExtra(int value) {
        ncbWndExtra(address(), value);
        return this;
    }

    public WNDCLASSEX hInstance(@NativeType("HINSTANCE") long value) {
        nhInstance(address(), value);
        return this;
    }

    public WNDCLASSEX hIcon(@NativeType("HICON") long value) {
        nhIcon(address(), value);
        return this;
    }

    public WNDCLASSEX hCursor(@NativeType("HCURSOR") long value) {
        nhCursor(address(), value);
        return this;
    }

    public WNDCLASSEX hbrBackground(@NativeType("HBRUSH") long value) {
        nhbrBackground(address(), value);
        return this;
    }

    public WNDCLASSEX lpszMenuName(@NativeType("LPCTSTR") ByteBuffer value) {
        nlpszMenuName(address(), value);
        return this;
    }

    public WNDCLASSEX lpszClassName(@NativeType("LPCTSTR") ByteBuffer value) {
        nlpszClassName(address(), value);
        return this;
    }

    public WNDCLASSEX hIconSm(@NativeType("HICON") long value) {
        nhIconSm(address(), value);
        return this;
    }

    public WNDCLASSEX set(int cbSize, int style, WindowProcI lpfnWndProc, int cbClsExtra, int cbWndExtra, long hInstance, long hIcon, long hCursor, long hbrBackground, ByteBuffer lpszMenuName, ByteBuffer lpszClassName, long hIconSm) {
        cbSize(cbSize);
        style(style);
        lpfnWndProc(lpfnWndProc);
        cbClsExtra(cbClsExtra);
        cbWndExtra(cbWndExtra);
        hInstance(hInstance);
        hIcon(hIcon);
        hCursor(hCursor);
        hbrBackground(hbrBackground);
        lpszMenuName(lpszMenuName);
        lpszClassName(lpszClassName);
        hIconSm(hIconSm);
        return this;
    }

    public WNDCLASSEX set(WNDCLASSEX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static WNDCLASSEX malloc() {
        return new WNDCLASSEX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static WNDCLASSEX calloc() {
        return new WNDCLASSEX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static WNDCLASSEX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new WNDCLASSEX(MemoryUtil.memAddress(container), container);
    }

    public static WNDCLASSEX create(long address) {
        return new WNDCLASSEX(address, null);
    }

    public static WNDCLASSEX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new WNDCLASSEX(address, null);
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

    public static WNDCLASSEX malloc(MemoryStack stack) {
        return new WNDCLASSEX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static WNDCLASSEX calloc(MemoryStack stack) {
        return new WNDCLASSEX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstyle(long struct) {
        return MemoryUtil.memGetInt(struct + STYLE);
    }

    public static WindowProc nlpfnWndProc(long struct) {
        return WindowProc.create(MemoryUtil.memGetAddress(struct + LPFNWNDPROC));
    }

    public static int ncbClsExtra(long struct) {
        return MemoryUtil.memGetInt(struct + CBCLSEXTRA);
    }

    public static int ncbWndExtra(long struct) {
        return MemoryUtil.memGetInt(struct + CBWNDEXTRA);
    }

    public static long nhInstance(long struct) {
        return MemoryUtil.memGetAddress(struct + HINSTANCE);
    }

    public static long nhIcon(long struct) {
        return MemoryUtil.memGetAddress(struct + HICON);
    }

    public static long nhCursor(long struct) {
        return MemoryUtil.memGetAddress(struct + HCURSOR);
    }

    public static long nhbrBackground(long struct) {
        return MemoryUtil.memGetAddress(struct + HBRBACKGROUND);
    }

    public static ByteBuffer nlpszMenuName(long struct) {
        return MemoryUtil.memByteBufferNT2Safe(MemoryUtil.memGetAddress(struct + LPSZMENUNAME));
    }

    public static String nlpszMenuNameString(long struct) {
        return MemoryUtil.memUTF16Safe(MemoryUtil.memGetAddress(struct + LPSZMENUNAME));
    }

    public static ByteBuffer nlpszClassName(long struct) {
        return MemoryUtil.memByteBufferNT2(MemoryUtil.memGetAddress(struct + LPSZCLASSNAME));
    }

    public static String nlpszClassNameString(long struct) {
        return MemoryUtil.memUTF16(MemoryUtil.memGetAddress(struct + LPSZCLASSNAME));
    }

    public static long nhIconSm(long struct) {
        return MemoryUtil.memGetAddress(struct + HICONSM);
    }

    public static void ncbSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + CBSIZE, value);
    }

    public static void nstyle(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYLE, value);
    }

    public static void nlpfnWndProc(long struct, WindowProcI value) {
        MemoryUtil.memPutAddress(struct + LPFNWNDPROC, value.address());
    }

    public static void ncbClsExtra(long struct, int value) {
        MemoryUtil.memPutInt(struct + CBCLSEXTRA, value);
    }

    public static void ncbWndExtra(long struct, int value) {
        MemoryUtil.memPutInt(struct + CBWNDEXTRA, value);
    }

    public static void nhInstance(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HINSTANCE, value);
    }

    public static void nhIcon(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HICON, value);
    }

    public static void nhCursor(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HCURSOR, value);
    }

    public static void nhbrBackground(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HBRBACKGROUND, value);
    }

    public static void nlpszMenuName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT2Safe(value);
        }
        MemoryUtil.memPutAddress(struct + LPSZMENUNAME, MemoryUtil.memAddressSafe(value));
    }

    public static void nlpszClassName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT2(value);
        }
        MemoryUtil.memPutAddress(struct + LPSZCLASSNAME, MemoryUtil.memAddress(value));
    }

    public static void nhIconSm(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HICONSM, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + LPFNWNDPROC));
        Checks.check(MemoryUtil.memGetAddress(struct + LPSZCLASSNAME));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/WNDCLASSEX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/WNDCLASSEX$Buffer.class */
    public static class Buffer extends StructBuffer<WNDCLASSEX, Buffer> implements NativeResource {
        private static final WNDCLASSEX ELEMENT_FACTORY = WNDCLASSEX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / WNDCLASSEX.SIZEOF);
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
        public WNDCLASSEX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("UINT")
        public int cbSize() {
            return WNDCLASSEX.ncbSize(address());
        }

        @NativeType("UINT")
        public int style() {
            return WNDCLASSEX.nstyle(address());
        }

        @NativeType("WNDPROC")
        public WindowProc lpfnWndProc() {
            return WNDCLASSEX.nlpfnWndProc(address());
        }

        public int cbClsExtra() {
            return WNDCLASSEX.ncbClsExtra(address());
        }

        public int cbWndExtra() {
            return WNDCLASSEX.ncbWndExtra(address());
        }

        @NativeType("HINSTANCE")
        public long hInstance() {
            return WNDCLASSEX.nhInstance(address());
        }

        @NativeType("HICON")
        public long hIcon() {
            return WNDCLASSEX.nhIcon(address());
        }

        @NativeType("HCURSOR")
        public long hCursor() {
            return WNDCLASSEX.nhCursor(address());
        }

        @NativeType("HBRUSH")
        public long hbrBackground() {
            return WNDCLASSEX.nhbrBackground(address());
        }

        @NativeType("LPCTSTR")
        public ByteBuffer lpszMenuName() {
            return WNDCLASSEX.nlpszMenuName(address());
        }

        @NativeType("LPCTSTR")
        public String lpszMenuNameString() {
            return WNDCLASSEX.nlpszMenuNameString(address());
        }

        @NativeType("LPCTSTR")
        public ByteBuffer lpszClassName() {
            return WNDCLASSEX.nlpszClassName(address());
        }

        @NativeType("LPCTSTR")
        public String lpszClassNameString() {
            return WNDCLASSEX.nlpszClassNameString(address());
        }

        @NativeType("HICON")
        public long hIconSm() {
            return WNDCLASSEX.nhIconSm(address());
        }

        public Buffer cbSize(@NativeType("UINT") int value) {
            WNDCLASSEX.ncbSize(address(), value);
            return this;
        }

        public Buffer style(@NativeType("UINT") int value) {
            WNDCLASSEX.nstyle(address(), value);
            return this;
        }

        public Buffer lpfnWndProc(@NativeType("WNDPROC") WindowProcI value) {
            WNDCLASSEX.nlpfnWndProc(address(), value);
            return this;
        }

        public Buffer cbClsExtra(int value) {
            WNDCLASSEX.ncbClsExtra(address(), value);
            return this;
        }

        public Buffer cbWndExtra(int value) {
            WNDCLASSEX.ncbWndExtra(address(), value);
            return this;
        }

        public Buffer hInstance(@NativeType("HINSTANCE") long value) {
            WNDCLASSEX.nhInstance(address(), value);
            return this;
        }

        public Buffer hIcon(@NativeType("HICON") long value) {
            WNDCLASSEX.nhIcon(address(), value);
            return this;
        }

        public Buffer hCursor(@NativeType("HCURSOR") long value) {
            WNDCLASSEX.nhCursor(address(), value);
            return this;
        }

        public Buffer hbrBackground(@NativeType("HBRUSH") long value) {
            WNDCLASSEX.nhbrBackground(address(), value);
            return this;
        }

        public Buffer lpszMenuName(@NativeType("LPCTSTR") ByteBuffer value) {
            WNDCLASSEX.nlpszMenuName(address(), value);
            return this;
        }

        public Buffer lpszClassName(@NativeType("LPCTSTR") ByteBuffer value) {
            WNDCLASSEX.nlpszClassName(address(), value);
            return this;
        }

        public Buffer hIconSm(@NativeType("HICON") long value) {
            WNDCLASSEX.nhIconSm(address(), value);
            return this;
        }
    }
}
