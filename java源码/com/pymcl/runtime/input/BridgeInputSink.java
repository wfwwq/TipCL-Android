package com.pymcl.runtime.input;

import com.tungsten.fclauncher.bridge.FCLBridge;
import com.tungsten.fclauncher.keycodes.LwjglKeycodeMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.lwjgl.glfw.CallbackBridge;

/* compiled from: InputSink.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u0014\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001aH\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/pymcl/runtime/input/BridgeInputSink;", "Lcom/pymcl/runtime/input/InputSink;", "bridge", "Lkotlin/Function0;", "Lcom/tungsten/fclauncher/bridge/FCLBridge;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "pressedMouse", "", "key", "", "fclKeycode", "", "press", "", "char", "c", "", "mouseButton", "button", "releaseAll", "scroll", "dy", "", "cursorPos", "x", "", "y", "lookDelta", "dx", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BridgeInputSink implements InputSink {
    private final Function0<FCLBridge> bridge;
    private final boolean[] pressedMouse;

    /* JADX WARN: Multi-variable type inference failed */
    public BridgeInputSink(Function0<? extends FCLBridge> bridge) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.bridge = bridge;
        this.pressedMouse = new boolean[8];
    }

    @Override // com.pymcl.runtime.input.InputSink
    public /* bridge */ void click(int button) {
        super.click(button);
    }

    @Override // com.pymcl.runtime.input.InputSink
    public /* bridge */ void tapKey(int fclKeycode) {
        super.tapKey(fclKeycode);
    }

    @Override // com.pymcl.runtime.input.InputSink
    public /* bridge */ void text(String s) {
        super.text(s);
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void key(int fclKeycode, boolean press) {
        FCLBridge b = this.bridge.invoke();
        if (b == null) {
            return;
        }
        int glfw = LwjglKeycodeMap.convertKeycode(fclKeycode);
        if (glfw >= 0) {
            CallbackBridge.setModifiers(glfw, press);
        }
        b.pushEventKey(fclKeycode, 0, press);
    }

    @Override // com.pymcl.runtime.input.InputSink
    /* renamed from: char, reason: not valid java name */
    public void mo8062char(char c) {
        FCLBridge fCLBridgeInvoke = this.bridge.invoke();
        if (fCLBridgeInvoke != null) {
            fCLBridgeInvoke.pushEventChar(c);
        }
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void mouseButton(int button, boolean press) {
        FCLBridge b = this.bridge.invoke();
        if (b == null) {
            return;
        }
        boolean z = false;
        if (button >= 0 && button < this.pressedMouse.length) {
            z = true;
        }
        if (z) {
            if (this.pressedMouse[button] == press) {
                return;
            } else {
                this.pressedMouse[button] = press;
            }
        }
        b.pushEventMouseButton(button, press);
    }

    public final void releaseAll() {
        int length = this.pressedMouse.length;
        for (int i = 0; i < length; i++) {
            if (this.pressedMouse[i]) {
                mouseButton(i, false);
            }
        }
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void scroll(double dy) {
        CallbackBridge.sendScroll(0.0d, dy);
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void cursorPos(float x, float y) {
        FCLBridge fCLBridgeInvoke = this.bridge.invoke();
        if (fCLBridgeInvoke != null) {
            fCLBridgeInvoke.pushEventPointer(x, y);
        }
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void lookDelta(float dx, float dy) {
        FCLBridge.pushEventLookDelta(dx, dy);
    }
}
