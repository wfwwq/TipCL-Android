package com.pymcl.runtime.control;

import android.content.Context;
import android.view.MotionEvent;
import com.pymcl.runtime.input.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ControlViews.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/pymcl/runtime/control/ButtonView;", "Lcom/pymcl/runtime/control/ControlElementView;", "context", "Landroid/content/Context;", "element", "Lcom/pymcl/runtime/control/ControlElement;", "host", "Lcom/pymcl/runtime/control/ControlHost;", "<init>", "(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V", "toggled", "", "onGameTouch", "e", "Landroid/view/MotionEvent;", "send", "", "press", "releaseAll", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ButtonView extends ControlElementView {
    private boolean toggled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonView(Context context, ControlElement element, ControlHost host) {
        super(context, element, host);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(host, "host");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.pymcl.runtime.control.ControlElementView
    protected boolean onGameTouch(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        switch (e.getActionMasked()) {
            case 0:
                if (getElement().getToggle()) {
                    this.toggled = !this.toggled;
                    send(this.toggled);
                } else {
                    send(true);
                }
                return true;
            case 1:
            case 3:
                if (!getElement().getToggle()) {
                    send(false);
                }
                return true;
            case 2:
            default:
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.pymcl.runtime.control.ControlHost, int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.pymcl.runtime.control.ControlHost, int] */
    private final void send(boolean press) {
        setPressedState(press);
        invalidate();
        for (String k : getElement().getKeys()) {
            Keys.Action it = Keys.INSTANCE.dispatch(getHeight().getSink(), k, press);
            if (it != null && press) {
                getHeight().onAction(it);
            }
        }
    }

    @Override // com.pymcl.runtime.control.ControlElementView
    public void releaseAll() {
        if (getPressedState()) {
            send(false);
        }
        this.toggled = false;
    }
}
