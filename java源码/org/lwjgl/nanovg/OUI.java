package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/OUI.class */
public class OUI {
    public static final int UI_USERMASK = -16777216;
    public static final int UI_ANY = -1;
    public static final int UI_COLD = 0;
    public static final int UI_HOT = 1;
    public static final int UI_ACTIVE = 2;
    public static final int UI_FROZEN = 3;
    public static final int UI_ROW = 2;
    public static final int UI_COLUMN = 3;
    public static final int UI_LAYOUT = 0;
    public static final int UI_FLEX = 2;
    public static final int UI_NOWRAP = 0;
    public static final int UI_WRAP = 4;
    public static final int UI_START = 8;
    public static final int UI_MIDDLE = 0;
    public static final int UI_END = 16;
    public static final int UI_JUSTIFY = 24;
    public static final int UI_LEFT = 32;
    public static final int UI_TOP = 64;
    public static final int UI_RIGHT = 128;
    public static final int UI_DOWN = 256;
    public static final int UI_HFILL = 160;
    public static final int UI_VFILL = 320;
    public static final int UI_HCENTER = 0;
    public static final int UI_VCENTER = 0;
    public static final int UI_CENTER = 0;
    public static final int UI_FILL = 480;
    public static final int UI_BREAK = 512;
    public static final int UI_BUTTON0_DOWN = 1024;
    public static final int UI_BUTTON0_UP = 2048;
    public static final int UI_BUTTON0_HOT_UP = 4096;
    public static final int UI_BUTTON0_CAPTURE = 8192;
    public static final int UI_BUTTON2_DOWN = 16384;
    public static final int UI_SCROLL = 32768;
    public static final int UI_KEY_DOWN = 65536;
    public static final int UI_KEY_UP = 131072;
    public static final int UI_CHAR = 262144;

    @NativeType("UIcontext *")
    public static native long uiCreateContext(@NativeType("unsigned int") int i, @NativeType("unsigned int") int i2);

    public static native void uiMakeCurrent(@NativeType("UIcontext *") long j);

    public static native void nuiDestroyContext(long j);

    @NativeType("UIcontext *")
    public static native long uiGetContext();

    public static native void uiSetCursor(int i, int i2);

    public static native void nuiGetCursor(long j);

    public static native void nuiGetCursorDelta(long j);

    public static native void nuiGetCursorStart(long j);

    public static native void nuiGetCursorStartDelta(long j);

    public static native void nuiSetButton(int i, int i2, int i3);

    public static native int nuiGetButton(int i);

    public static native int uiGetClicks();

    public static native void nuiSetKey(int i, int i2, int i3);

    public static native void uiSetChar(@NativeType("unsigned int") int i);

    public static native void uiSetScroll(int i, int i2);

    public static native void nuiGetScroll(long j);

    public static native void uiBeginLayout();

    public static native void uiEndLayout();

    public static native void uiUpdateHotItem();

    public static native void uiProcess(int i);

    public static native void uiClearState();

    public static native int uiItem();

    public static native void nuiSetFrozen(int i, int i2);

    public static native void uiSetHandle(int i, @NativeType("void *") long j);

    public static native long nuiAllocHandle(int i, int i2);

    public static native void nuiSetHandler(long j);

    public static native void uiSetEvents(int i, @NativeType("unsigned int") int i2);

    public static native void uiSetFlags(int i, @NativeType("unsigned int") int i2);

    public static native int uiInsert(int i, int i2);

    public static native int uiAppend(int i, int i2);

    public static native int uiInsertBack(int i, int i2);

    public static native int uiInsertFront(int i, int i2);

    public static native void uiSetSize(int i, int i2, int i3);

    public static native void uiSetLayout(int i, @NativeType("unsigned int") int i2);

    public static native void uiSetBox(int i, @NativeType("unsigned int") int i2);

    public static native void nuiSetMargins(int i, short s, short s2, short s3, short s4);

    public static native void uiFocus(int i);

    public static native int uiFirstChild(int i);

    public static native int uiNextSibling(int i);

    public static native int uiGetItemCount();

    @NativeType("unsigned int")
    public static native int uiGetAllocSize();

    @NativeType("UIitemState")
    public static native int uiGetState(int i);

    @NativeType("void *")
    public static native long uiGetHandle(int i);

    public static native int uiGetHotItem();

    public static native int uiGetFocusedItem();

    public static native int uiFindItem(int i, int i2, int i3, @NativeType("unsigned int") int i4, @NativeType("unsigned int") int i5);

    public static native long nuiGetHandler();

    @NativeType("unsigned int")
    public static native int uiGetEvents(int i);

    @NativeType("unsigned int")
    public static native int uiGetFlags(int i);

    @NativeType("unsigned int")
    public static native int uiGetKey();

    @NativeType("unsigned int")
    public static native int uiGetModifier();

    public static native void nuiGetRect(int i, long j);

    public static native int nuiContains(int i, int i2, int i3);

    public static native int uiGetWidth(int i);

    public static native int uiGetHeight(int i);

    @NativeType("unsigned int")
    public static native int uiGetLayout(int i);

    @NativeType("unsigned int")
    public static native int uiGetBox(int i);

    public static native short uiGetMarginLeft(int i);

    public static native short uiGetMarginTop(int i);

    public static native short uiGetMarginRight(int i);

    public static native short uiGetMarginDown(int i);

    public static native int uiRecoverItem(int i);

    public static native void uiRemapItem(int i, int i2);

    public static native int uiGetLastItemCount();

    static {
        LibNanoVG.initialize();
    }

    protected OUI() {
        throw new UnsupportedOperationException();
    }

    public static void uiDestroyContext(@NativeType("UIcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        nuiDestroyContext(ctx);
    }

    @NativeType("UIvec2")
    public static UIVec2 uiGetCursor(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursor(__result.address());
        return __result;
    }

    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorDelta(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorDelta(__result.address());
        return __result;
    }

    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorStart(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorStart(__result.address());
        return __result;
    }

    @NativeType("UIvec2")
    public static UIVec2 uiGetCursorStartDelta(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetCursorStartDelta(__result.address());
        return __result;
    }

    public static void uiSetButton(@NativeType("unsigned int") int button, @NativeType("unsigned int") int mod, @NativeType("int") boolean enabled) {
        nuiSetButton(button, mod, enabled ? 1 : 0);
    }

    @NativeType("int")
    public static boolean uiGetButton(@NativeType("unsigned int") int button) {
        return nuiGetButton(button) != 0;
    }

    public static void uiSetKey(@NativeType("unsigned int") int key, @NativeType("unsigned int") int mod, @NativeType("int") boolean enabled) {
        nuiSetKey(key, mod, enabled ? 1 : 0);
    }

    @NativeType("UIvec2")
    public static UIVec2 uiGetScroll(@NativeType("UIvec2") UIVec2 __result) {
        nuiGetScroll(__result.address());
        return __result;
    }

    public static void uiSetFrozen(int item, @NativeType("int") boolean enable) {
        nuiSetFrozen(item, enable ? 1 : 0);
    }

    @Nullable
    @NativeType("void *")
    public static ByteBuffer uiAllocHandle(int item, @NativeType("unsigned int") int size) {
        long __result = nuiAllocHandle(item, size);
        return MemoryUtil.memByteBufferSafe(__result, size);
    }

    public static void uiSetHandler(@NativeType("UIhandler") UIHandlerI handler) {
        nuiSetHandler(handler.address());
    }

    public static void uiSetMargins(int item, @NativeType("short") int l, @NativeType("short") int t, @NativeType("short") int r, @NativeType("short") int b) {
        nuiSetMargins(item, (short) l, (short) t, (short) r, (short) b);
    }

    @Nullable
    @NativeType("UIhandler")
    public static UIHandler uiGetHandler() {
        return UIHandler.createSafe(nuiGetHandler());
    }

    @NativeType("UIrect")
    public static UIRect uiGetRect(int item, @NativeType("UIrect") UIRect __result) {
        nuiGetRect(item, __result.address());
        return __result;
    }

    @NativeType("int")
    public static boolean uiContains(int item, int x, int y) {
        return nuiContains(item, x, y) != 0;
    }
}
