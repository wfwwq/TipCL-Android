package com.pymcl.runtime.input;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: TouchGestures.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0007J\u001e\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010(\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0007J\u0006\u0010*\u001a\u00020#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/pymcl/runtime/input/LookGesture;", "", "sink", "Lcom/pymcl/runtime/input/InputSink;", "sensitivity", "", "longPressMs", "", "tapMs", "slopPx", "<init>", "(Lcom/pymcl/runtime/input/InputSink;FJJF)V", "getSensitivity", "()F", "setSensitivity", "(F)V", "getLongPressMs", "()J", "setLongPressMs", "(J)V", "getTapMs", "setTapMs", "downX", "downY", "lastX", "lastY", "downT", "moved", "", "breaking", "value", "active", "getActive", "()Z", "down", "", "x", "y", "t", "move", "checkLongPress", "up", "cancel", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LookGesture {
    private boolean active;
    private boolean breaking;
    private long downT;
    private float downX;
    private float downY;
    private float lastX;
    private float lastY;
    private long longPressMs;
    private boolean moved;
    private float sensitivity;
    private final InputSink sink;
    private final float slopPx;
    private long tapMs;

    public LookGesture(InputSink sink, float sensitivity, long longPressMs, long tapMs, float slopPx) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.sensitivity = sensitivity;
        this.longPressMs = longPressMs;
        this.tapMs = tapMs;
        this.slopPx = slopPx;
    }

    public /* synthetic */ LookGesture(InputSink inputSink, float f, long j, long j2, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputSink, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? 300L : j, (i & 8) != 0 ? 200L : j2, (i & 16) != 0 ? 12.0f : f2);
    }

    public final float getSensitivity() {
        return this.sensitivity;
    }

    public final void setSensitivity(float f) {
        this.sensitivity = f;
    }

    public final long getLongPressMs() {
        return this.longPressMs;
    }

    public final void setLongPressMs(long j) {
        this.longPressMs = j;
    }

    public final long getTapMs() {
        return this.tapMs;
    }

    public final void setTapMs(long j) {
        this.tapMs = j;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final void down(float x, float y, long t) {
        this.downX = x;
        this.downY = y;
        this.lastX = x;
        this.lastY = y;
        this.downT = t;
        this.moved = false;
        this.breaking = false;
        this.active = true;
    }

    public final void move(float x, float y, long t) {
        if (this.active) {
            if (!this.moved && ((float) Math.hypot(x - this.downX, y - this.downY)) > this.slopPx) {
                this.moved = true;
            }
            float dx = x - this.lastX;
            float dy = y - this.lastY;
            this.lastX = x;
            this.lastY = y;
            if (this.moved && (Math.abs(dx) > 0.0f || Math.abs(dy) > 0.0f)) {
                this.sink.lookDelta(this.sensitivity * dx, this.sensitivity * dy);
            }
            checkLongPress(t);
        }
    }

    public final void checkLongPress(long t) {
        if (this.active && !this.moved && !this.breaking && t - this.downT >= this.longPressMs) {
            this.breaking = true;
            this.sink.mouseButton(0, true);
        }
    }

    public final void up(long t) {
        if (this.active) {
            this.active = false;
            if (this.breaking) {
                this.sink.mouseButton(0, false);
            } else if (!this.moved && t - this.downT <= RangesKt.coerceAtMost(this.tapMs, this.longPressMs)) {
                this.sink.click(1);
            }
            this.breaking = false;
        }
    }

    public final void cancel() {
        if (this.breaking) {
            this.sink.mouseButton(0, false);
        }
        this.active = false;
        this.breaking = false;
    }
}
