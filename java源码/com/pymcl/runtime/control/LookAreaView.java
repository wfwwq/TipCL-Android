package com.pymcl.runtime.control;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.github.caciocavallosilano.cacio.peer.CacioTextAreaPeer;
import com.pymcl.runtime.input.LookGesture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ControlViews.kt */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/pymcl/runtime/control/LookAreaView;", "Lcom/pymcl/runtime/control/ControlElementView;", "context", "Landroid/content/Context;", "element", "Lcom/pymcl/runtime/control/ControlElement;", "host", "Lcom/pymcl/runtime/control/ControlHost;", "<init>", "(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V", "gesture", "Lcom/pymcl/runtime/input/LookGesture;", "tick", "com/pymcl/runtime/control/LookAreaView$tick$1", "Lcom/pymcl/runtime/control/LookAreaView$tick$1;", "onDraw", "", "c", "Landroid/graphics/Canvas;", "onGameTouch", "", "e", "Landroid/view/MotionEvent;", "releaseAll", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LookAreaView extends ControlElementView {
    private final LookGesture gesture;
    private final LookAreaView$tick$1 tick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.pymcl.runtime.control.LookAreaView$tick$1] */
    public LookAreaView(Context context, ControlElement element, ControlHost host) {
        super(context, element, host);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(host, "host");
        this.gesture = new LookGesture(host.getSink(), 0.0f, 0L, 0L, 0.0f, 30, null);
        this.tick = new Runnable() { // from class: com.pymcl.runtime.control.LookAreaView$tick$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.awt.Component, long] */
            @Override // java.lang.Runnable
            public void run() {
                this.this$0.gesture.checkLongPress(CacioTextAreaPeer.getAWTComponent());
                if (this.this$0.gesture.getActive()) {
                    this.this$0.postDelayed(this, 50L);
                }
            }
        };
    }

    @Override // com.pymcl.runtime.control.ControlElementView, android.view.View
    protected void onDraw(Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        if (getHost().getEditing()) {
            drawBackground(c);
            getTextPaint().setTextSize(28.0f);
            String text = getElement().getText();
            if (text.length() == 0) {
                text = "视角区";
            }
            c.drawText(text, getWidth() / 2.0f, getHeight() / 2.0f, getTextPaint());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.awt.Component, long] */
    @Override // com.pymcl.runtime.control.ControlElementView
    protected boolean onGameTouch(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.gesture.setSensitivity(getHost().lookSensitivity());
        this.gesture.setLongPressMs(getHost().longPressMs());
        ?? aWTComponent = CacioTextAreaPeer.getAWTComponent();
        switch (e.getActionMasked()) {
            case 0:
                this.gesture.down(e.getRawX(), e.getRawY(), aWTComponent);
                postDelayed(this.tick, 50L);
                break;
            case 1:
                this.gesture.up(aWTComponent);
                break;
            case 2:
                this.gesture.move(e.getRawX(), e.getRawY(), aWTComponent);
                break;
            case 3:
                this.gesture.cancel();
                break;
        }
        return true;
    }

    @Override // com.pymcl.runtime.control.ControlElementView
    public void releaseAll() {
        this.gesture.cancel();
    }
}
