package com.pymcl.runtime.control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.InputDeviceCompat;
import com.github.caciocavallosilano.cacio.peer.CacioComponentPeer;
import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ControlViews.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010(\u001a\u00020\u001dH\u0004J\b\u0010)\u001a\u00020\u001dH\u0004J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0004J\u0010\u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0014J\u0010\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00172\u0006\u00100\u001a\u000201H\u0002J\u0010\u00103\u001a\u00020\u00172\u0006\u00100\u001a\u000201H\u0014J\b\u00104\u001a\u00020+H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u0017X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bÊ\u0001\u0016\b6\u0012\u0012\b7\u0012\u000e\b\fJ\u0004\b\b(8J\u0004\b\b(9¨\u00065"}, d2 = {"Lcom/pymcl/runtime/control/ControlElementView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "element", "Lcom/pymcl/runtime/control/ControlElement;", "host", "Lcom/pymcl/runtime/control/ControlHost;", "<init>", "(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V", "getElement", "()Lcom/pymcl/runtime/control/ControlElement;", "getHost", "()Lcom/pymcl/runtime/control/ControlHost;", "fill", "Landroid/graphics/Paint;", "getFill", "()Landroid/graphics/Paint;", "stroke", "getStroke", "textPaint", "getTextPaint", "pressedState", "", "getPressedState", "()Z", "setPressedState", "(Z)V", "editDownX", "", "editDownY", "resizing", "startX", "startY", "startW", "startH", SettingsProtocol.EXTRA_VALUE, "editSelected", "getEditSelected", "setEditSelected", "parentW", "parentH", "drawBackground", "", "c", "Landroid/graphics/Canvas;", "onDraw", "onTouchEvent", "e", "Landroid/view/MotionEvent;", "onEditTouch", "onGameTouch", "releaseAll", "PyMCL-Android:runtime_debug", "Landroid/annotation/SuppressLint;", "value", "ViewConstructor", "ClickableViewAccessibility"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public class ControlElementView extends View {
    private float editDownX;
    private float editDownY;
    private boolean editSelected;
    private final ControlElement element;
    private final Paint fill;
    private final ControlHost host;
    private boolean pressedState;
    private boolean resizing;
    private float startH;
    private float startW;
    private float startX;
    private float startY;
    private final Paint stroke;
    private final Paint textPaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlElementView(Context context, ControlElement element, ControlHost host) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(host, "host");
        this.element = element;
        this.host = host;
        this.fill = new Paint(1);
        Paint $this$stroke_u24lambda_u240 = new Paint(1);
        $this$stroke_u24lambda_u240.setStyle(Paint.Style.STROKE);
        $this$stroke_u24lambda_u240.setStrokeWidth(3.0f);
        $this$stroke_u24lambda_u240.setColor(-1);
        this.stroke = $this$stroke_u24lambda_u240;
        Paint $this$textPaint_u24lambda_u240 = new Paint(1);
        $this$textPaint_u24lambda_u240.setColor(-1);
        $this$textPaint_u24lambda_u240.setTextAlign(Paint.Align.CENTER);
        this.textPaint = $this$textPaint_u24lambda_u240;
        setAlpha(this.element.getAlpha());
    }

    public final ControlElement getElement() {
        return this.element;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ControlHost getHost() {
        return this.host;
    }

    protected final Paint getFill() {
        return this.fill;
    }

    protected final Paint getStroke() {
        return this.stroke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Paint getTextPaint() {
        return this.textPaint;
    }

    protected final boolean getPressedState() {
        return this.pressedState;
    }

    protected final void setPressedState(boolean z) {
        this.pressedState = z;
    }

    public final boolean getEditSelected() {
        return this.editSelected;
    }

    public final void setEditSelected(boolean v) {
        this.editSelected = v;
        invalidate();
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0000: INVOKE (r0 I:void) = (r5v0 ?? I:javax.swing.JTextArea), (r0 I:java.lang.String) VIRTUAL call: javax.swing.JTextArea.setText(java.lang.String):void (LINE:58), block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    protected final float parentW() {
        ?? r0;
        ?? text = setText((String) r0);
        if ((text instanceof View ? (View) text : null) != null) {
            Float fValueOf = Float.valueOf(r0.getWidth());
            float it = fValueOf.floatValue();
            Float f = (it > 0.0f ? 1 : (it == 0.0f ? 0 : -1)) > 0 ? fValueOf : null;
            if (f != null) {
                return f.floatValue();
            }
        }
        return 1.0f;
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0000: INVOKE (r0 I:void) = (r5v0 ?? I:javax.swing.JTextArea), (r0 I:java.lang.String) VIRTUAL call: javax.swing.JTextArea.setText(java.lang.String):void (LINE:59), block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    protected final float parentH() {
        ?? r0;
        ?? text = setText((String) r0);
        if ((text instanceof View ? (View) text : null) != null) {
            Float fValueOf = Float.valueOf(r0.getHeight());
            float it = fValueOf.floatValue();
            Float f = (it > 0.0f ? 1 : (it == 0.0f ? 0 : -1)) > 0 ? fValueOf : null;
            if (f != null) {
                return f.floatValue();
            }
        }
        return 1.0f;
    }

    protected final void drawBackground(Canvas c) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(c, "c");
        RectF r = new RectF(2.0f, 2.0f, getWidth() - 2.0f, getHeight() - 2.0f);
        float rad = Math.min(getWidth(), getHeight()) * this.element.getCornerRadius();
        Paint paint = this.fill;
        if (this.pressedState) {
            new CacioComponentPeer(46);
        } else {
            new CacioComponentPeer(30);
        }
        paint.setColor(i);
        c.drawRoundRect(r, rad, rad, this.fill);
        Paint paint2 = this.stroke;
        if (this.editSelected) {
            i2 = InputDeviceCompat.SOURCE_ANY;
        } else {
            new CacioComponentPeer(255);
        }
        paint2.setColor(i2);
        c.drawRoundRect(r, rad, rad, this.stroke);
    }

    @Override // android.view.View
    protected void onDraw(Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        drawBackground(c);
        this.textPaint.setTextSize(Math.min(getWidth(), getHeight()) * 0.36f);
        String text = this.element.getText();
        if (text.length() == 0) {
            text = CollectionsKt.joinToString$default(this.element.getKeys(), "+", null, null, 0, null, new Function1() { // from class: com.pymcl.runtime.control.ControlElementView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ControlElementView.onDraw$lambda$0$0((String) obj);
                }
            }, 30, null);
        }
        c.drawText(text, getWidth() / 2.0f, (getHeight() / 2.0f) - ((this.textPaint.descent() + this.textPaint.ascent()) / 2), this.textPaint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onDraw$lambda$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.removePrefix(it, (CharSequence) "KEY_");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return this.host.getEditing() ? onEditTouch(e) : onGameTouch(e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v22, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [void] */
    private final boolean onEditTouch(MotionEvent e) {
        switch (e.getActionMasked()) {
            case 0:
                this.editDownX = e.getRawX();
                this.editDownY = e.getRawY();
                this.startX = this.element.getX();
                this.startY = this.element.getY();
                this.startW = this.element.getW();
                this.startH = this.element.getH();
                this.resizing = e.getX() > ((float) getWidth()) * 0.75f && e.getY() > ((float) getHeight()) * 0.75f;
                this.host.onElementSelected(this);
                return true;
            case 1:
                this.host.onElementEdited(this);
                return true;
            case 2:
                ?? rawX = (e.getRawX() - this.editDownX) / parentW();
                float dy = (e.getRawY() - this.editDownY) / parentH();
                if (this.resizing) {
                    this.element.setW(RangesKt.coerceIn(this.startW + rawX, 0.03f, 1.0f));
                    this.element.setH(RangesKt.coerceIn(this.startH + dy, 0.03f, 1.0f));
                } else {
                    this.element.setX(RangesKt.coerceIn(this.startX + rawX, 0.0f, 1.0f - this.element.getW()));
                    this.element.setY(RangesKt.coerceIn(this.startY + dy, 0.0f, 1.0f - this.element.getH()));
                }
                requestLayout();
                ?? text = setText((String) rawX);
                View view = text instanceof View ? (View) text : null;
                if (view != null) {
                    view.requestLayout();
                }
                return true;
            default:
                return true;
        }
    }

    protected boolean onGameTouch(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    public void releaseAll() {
    }
}
