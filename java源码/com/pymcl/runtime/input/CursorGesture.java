package com.pymcl.runtime.input;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: TouchGestures.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007J\u001e\u00100\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u00020\tJ\u001e\u00102\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u00020\tJ\u000e\u00103\u001a\u00020-2\u0006\u00101\u001a\u00020\tJ \u00104\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u00020\tH\u0002J \u00105\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u00020\tH\u0002J\u0006\u00106\u001a\u00020-R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u001e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/pymcl/runtime/input/CursorGesture;", "", "sink", "Lcom/pymcl/runtime/input/InputSink;", "virtualMouse", "", "sensitivity", "", "tapMs", "", "slopPx", "doubleTapMs", "doubleTapSlackPx", "<init>", "(Lcom/pymcl/runtime/input/InputSink;ZFJFJF)V", "getVirtualMouse", "()Z", "setVirtualMouse", "(Z)V", "getSensitivity", "()F", "setSensitivity", "(F)V", "value", "cursorX", "getCursorX", "cursorY", "getCursorY", "screenW", "getScreenW", "setScreenW", "screenH", "getScreenH", "setScreenH", "lastX", "lastY", "downX", "downY", "downT", "moved", "dragging", "lastTapUpT", "lastTapX", "lastTapY", "place", "", "x", "y", "down", "t", "move", "up", "isDoubleTap", "rememberTap", "secondaryTap", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CursorGesture {
    private float cursorX;
    private float cursorY;
    private final long doubleTapMs;
    private final float doubleTapSlackPx;
    private long downT;
    private float downX;
    private float downY;
    private boolean dragging;
    private long lastTapUpT;
    private float lastTapX;
    private float lastTapY;
    private float lastX;
    private float lastY;
    private boolean moved;
    private float screenH;
    private float screenW;
    private float sensitivity;
    private final InputSink sink;
    private final float slopPx;
    private final long tapMs;
    private boolean virtualMouse;

    public CursorGesture(InputSink sink, boolean virtualMouse, float sensitivity, long tapMs, float slopPx, long doubleTapMs, float doubleTapSlackPx) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.virtualMouse = virtualMouse;
        this.sensitivity = sensitivity;
        this.tapMs = tapMs;
        this.slopPx = slopPx;
        this.doubleTapMs = doubleTapMs;
        this.doubleTapSlackPx = doubleTapSlackPx;
        this.screenW = 1.0f;
        this.screenH = 1.0f;
    }

    public /* synthetic */ CursorGesture(InputSink inputSink, boolean z, float f, long j, float f2, long j2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputSink, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 1.0f : f, (i & 8) != 0 ? 220L : j, (i & 16) != 0 ? 10.0f : f2, (i & 32) != 0 ? 280L : j2, (i & 64) != 0 ? 48.0f : f3);
    }

    public final float getSensitivity() {
        return this.sensitivity;
    }

    public final boolean getVirtualMouse() {
        return this.virtualMouse;
    }

    public final void setSensitivity(float f) {
        this.sensitivity = f;
    }

    public final void setVirtualMouse(boolean z) {
        this.virtualMouse = z;
    }

    public final float getCursorX() {
        return this.cursorX;
    }

    public final float getCursorY() {
        return this.cursorY;
    }

    public final float getScreenH() {
        return this.screenH;
    }

    public final float getScreenW() {
        return this.screenW;
    }

    public final void setScreenH(float f) {
        this.screenH = f;
    }

    public final void setScreenW(float f) {
        this.screenW = f;
    }

    public final void place(float x, float y) {
        this.cursorX = RangesKt.coerceIn(x, 0.0f, this.screenW);
        this.cursorY = RangesKt.coerceIn(y, 0.0f, this.screenH);
        this.sink.cursorPos(this.cursorX, this.cursorY);
    }

    public final void down(float x, float y, long t) {
        this.lastX = x;
        this.lastY = y;
        this.downX = x;
        this.downY = y;
        this.downT = t;
        this.moved = false;
        this.dragging = false;
        if (!this.virtualMouse) {
            place(x, y);
            this.sink.mouseButton(0, true);
        }
    }

    public final void move(float x, float y, long t) {
        if (!this.moved && ((float) Math.hypot(x - this.downX, y - this.downY)) > this.slopPx) {
            this.moved = true;
        }
        if (this.virtualMouse) {
            if (!this.moved) {
                return;
            }
            if (!this.dragging && t - this.downT > 350 && ((float) Math.hypot(this.lastX - this.downX, this.lastY - this.downY)) < this.slopPx) {
                this.dragging = true;
                this.sink.mouseButton(0, true);
            }
            place(this.cursorX + ((x - this.lastX) * this.sensitivity), this.cursorY + ((y - this.lastY) * this.sensitivity));
        } else {
            place(x, y);
        }
        this.lastX = x;
        this.lastY = y;
    }

    public final void up(long t) {
        if (!this.virtualMouse) {
            this.sink.mouseButton(0, false);
            if (!this.moved && t - this.downT <= this.tapMs && isDoubleTap(this.downX, this.downY, t)) {
                this.sink.click(1);
            }
            if (this.moved || t - this.downT > this.tapMs) {
                return;
            }
            rememberTap(this.downX, this.downY, t);
            return;
        }
        if (this.dragging) {
            this.sink.mouseButton(0, false);
        } else if (!this.moved && t - this.downT <= this.tapMs) {
            this.sink.click(isDoubleTap(this.downX, this.downY, t) ? 1 : 0);
            rememberTap(this.downX, this.downY, t);
        }
        this.dragging = false;
    }

    private final boolean isDoubleTap(float x, float y, long t) {
        return t - this.lastTapUpT <= this.doubleTapMs && ((float) Math.hypot((double) (x - this.lastTapX), (double) (y - this.lastTapY))) <= this.doubleTapSlackPx;
    }

    private final void rememberTap(float x, float y, long t) {
        this.lastTapUpT = t;
        this.lastTapX = x;
        this.lastTapY = y;
    }

    public final void secondaryTap() {
        this.sink.click(1);
    }
}
