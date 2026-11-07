package org.lwjgl.system.windows;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/CRYPTPROTECT_PROMPTSTRUCT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/CRYPTPROTECT_PROMPTSTRUCT.class */
public class CRYPTPROTECT_PROMPTSTRUCT extends Struct<CRYPTPROTECT_PROMPTSTRUCT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CBSIZE;
    public static final int DWPROMPTFLAGS;
    public static final int HWNDAPP;
    public static final int SZPROMPT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CBSIZE = layout.offsetof(0);
        DWPROMPTFLAGS = layout.offsetof(1);
        HWNDAPP = layout.offsetof(2);
        SZPROMPT = layout.offsetof(3);
    }

    protected CRYPTPROTECT_PROMPTSTRUCT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public CRYPTPROTECT_PROMPTSTRUCT create(long address, ByteBuffer container) {
        return new CRYPTPROTECT_PROMPTSTRUCT(address, container);
    }

    public CRYPTPROTECT_PROMPTSTRUCT(ByteBuffer container) {
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

    @NativeType("DWORD")
    public int dwPromptFlags() {
        return ndwPromptFlags(address());
    }

    @NativeType("HWND")
    public long hwndApp() {
        return nhwndApp(address());
    }

    @NativeType("LPCWSTR")
    public ByteBuffer szPrompt() {
        return nszPrompt(address());
    }

    @NativeType("LPCWSTR")
    public String szPromptString() {
        return nszPromptString(address());
    }

    public CRYPTPROTECT_PROMPTSTRUCT cbSize(@NativeType("DWORD") int value) {
        ncbSize(address(), value);
        return this;
    }

    public CRYPTPROTECT_PROMPTSTRUCT cbSize$Default() {
        return cbSize(SIZEOF);
    }

    public CRYPTPROTECT_PROMPTSTRUCT dwPromptFlags(@NativeType("DWORD") int value) {
        ndwPromptFlags(address(), value);
        return this;
    }

    public CRYPTPROTECT_PROMPTSTRUCT hwndApp(@NativeType("HWND") long value) {
        nhwndApp(address(), value);
        return this;
    }

    public CRYPTPROTECT_PROMPTSTRUCT szPrompt(@NativeType("LPCWSTR") ByteBuffer value) {
        nszPrompt(address(), value);
        return this;
    }

    public CRYPTPROTECT_PROMPTSTRUCT set(int cbSize, int dwPromptFlags, long hwndApp, ByteBuffer szPrompt) {
        cbSize(cbSize);
        dwPromptFlags(dwPromptFlags);
        hwndApp(hwndApp);
        szPrompt(szPrompt);
        return this;
    }

    public CRYPTPROTECT_PROMPTSTRUCT set(CRYPTPROTECT_PROMPTSTRUCT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static CRYPTPROTECT_PROMPTSTRUCT malloc() {
        return new CRYPTPROTECT_PROMPTSTRUCT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static CRYPTPROTECT_PROMPTSTRUCT calloc() {
        return new CRYPTPROTECT_PROMPTSTRUCT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static CRYPTPROTECT_PROMPTSTRUCT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CRYPTPROTECT_PROMPTSTRUCT(MemoryUtil.memAddress(container), container);
    }

    public static CRYPTPROTECT_PROMPTSTRUCT create(long address) {
        return new CRYPTPROTECT_PROMPTSTRUCT(address, null);
    }

    public static CRYPTPROTECT_PROMPTSTRUCT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new CRYPTPROTECT_PROMPTSTRUCT(address, null);
    }

    public static CRYPTPROTECT_PROMPTSTRUCT malloc(MemoryStack stack) {
        return new CRYPTPROTECT_PROMPTSTRUCT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static CRYPTPROTECT_PROMPTSTRUCT calloc(MemoryStack stack) {
        return new CRYPTPROTECT_PROMPTSTRUCT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static int ncbSize(long struct) {
        return MemoryUtil.memGetInt(struct + CBSIZE);
    }

    public static int ndwPromptFlags(long struct) {
        return MemoryUtil.memGetInt(struct + DWPROMPTFLAGS);
    }

    public static long nhwndApp(long struct) {
        return MemoryUtil.memGetAddress(struct + HWNDAPP);
    }

    public static ByteBuffer nszPrompt(long struct) {
        return MemoryUtil.memByteBufferNT2(MemoryUtil.memGetAddress(struct + SZPROMPT));
    }

    public static String nszPromptString(long struct) {
        return MemoryUtil.memUTF16(MemoryUtil.memGetAddress(struct + SZPROMPT));
    }

    public static void ncbSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + CBSIZE, value);
    }

    public static void ndwPromptFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + DWPROMPTFLAGS, value);
    }

    public static void nhwndApp(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HWNDAPP, Checks.check(value));
    }

    public static void nszPrompt(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT2(value);
        }
        MemoryUtil.memPutAddress(struct + SZPROMPT, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + HWNDAPP));
        Checks.check(MemoryUtil.memGetAddress(struct + SZPROMPT));
    }
}
