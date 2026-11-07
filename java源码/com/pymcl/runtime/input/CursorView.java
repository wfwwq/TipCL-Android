package com.pymcl.runtime.input;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CursorView.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tJ\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/pymcl/runtime/input/CursorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "p", "Landroid/graphics/Paint;", "cx", "", "getCx", "()F", "setCx", "(F)V", "cy", "getCy", "setCy", "moveTo", "", "x", "y", "onDraw", "c", "Landroid/graphics/Canvas;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CursorView extends View {
    private float cx;
    private float cy;
    private final Paint p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.p = new Paint(1);
    }

    public final float getCx() {
        return this.cx;
    }

    public final float getCy() {
        return this.cy;
    }

    public final void setCx(float f) {
        this.cx = f;
    }

    public final void setCy(float f) {
        this.cy = f;
    }

    public final void moveTo(float x, float y) {
        this.cx = x;
        this.cy = y;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        Path path = new Path();
        path.moveTo(this.cx, this.cy);
        path.lineTo(this.cx, this.cy + 28.0f);
        path.lineTo(this.cx + (0.3f * 28.0f), this.cy + (0.72f * 28.0f));
        path.lineTo(this.cx + (28.0f * 0.7f), this.cy + (0.7f * 28.0f));
        path.close();
        this.p.setStyle(Paint.Style.FILL);
        this.p.setColor(-1);
        c.drawPath(path, this.p);
        this.p.setStyle(Paint.Style.STROKE);
        this.p.setStrokeWidth(2.0f);
        this.p.setColor(-16777216);
        c.drawPath(path, this.p);
    }
}
