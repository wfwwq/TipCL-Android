package com.pymcl.android.ui.theme;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import java.awt.Checkbox;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\nJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\nJ\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012Ê\u0001\u0002\b(¨\u0006'"}, d2 = {"Lcom/pymcl/android/ui/theme/PyShapes;", "", "cardRadius", "Landroidx/compose/ui/unit/Dp;", "ctlRadius", "square", "", "<init>", "(FFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCardRadius-D9Ej5fM", "()F", "F", "getCtlRadius-D9Ej5fM", "getSquare", "()Z", "card", "Landroidx/compose/ui/graphics/Shape;", "getCard", "()Landroidx/compose/ui/graphics/Shape;", "ctl", "getCtl", "pane", "getPane", "pill", "getPill", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "copy", "copy-Md-fbLM", "(FFZ)Lcom/pymcl/android/ui/theme/PyShapes;", "equals", "other", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/Immutable;"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class PyShapes {
    public static final int $stable = 0;
    private final float cardRadius;
    private final float ctlRadius;
    private final boolean square;

    public /* synthetic */ PyShapes(float f, float f2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, z);
    }

    /* renamed from: copy-Md-fbLM$default, reason: not valid java name */
    public static /* synthetic */ PyShapes m7989copyMdfbLM$default(PyShapes pyShapes, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = pyShapes.cardRadius;
        }
        if ((i & 2) != 0) {
            f2 = pyShapes.ctlRadius;
        }
        if ((i & 4) != 0) {
            z = pyShapes.square;
        }
        return pyShapes.m7992copyMdfbLM(f, f2, z);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCardRadius() {
        return this.cardRadius;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCtlRadius() {
        return this.ctlRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSquare() {
        return this.square;
    }

    /* renamed from: copy-Md-fbLM, reason: not valid java name */
    public final PyShapes m7992copyMdfbLM(float cardRadius, float ctlRadius, boolean square) {
        return new PyShapes(cardRadius, ctlRadius, square, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PyShapes)) {
            return false;
        }
        PyShapes pyShapes = (PyShapes) other;
        return Dp.m7023equalsimpl0(this.cardRadius, pyShapes.cardRadius) && Dp.m7023equalsimpl0(this.ctlRadius, pyShapes.ctlRadius) && this.square == pyShapes.square;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, java.awt.CheckboxGroup] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, java.awt.CheckboxGroup] */
    public int hashCode() {
        float f = this.cardRadius;
        int checkboxGroup = Checkbox.getCheckboxGroup() * 31;
        float f2 = this.ctlRadius;
        return ((checkboxGroup + Checkbox.getCheckboxGroup()) * 31) + Boolean.hashCode(this.square);
    }

    public String toString() {
        return "PyShapes(cardRadius=" + Dp.m7029toStringimpl(this.cardRadius) + ", ctlRadius=" + Dp.m7029toStringimpl(this.ctlRadius) + ", square=" + this.square + ")";
    }

    private PyShapes(float cardRadius, float ctlRadius, boolean square) {
        this.cardRadius = cardRadius;
        this.ctlRadius = ctlRadius;
        this.square = square;
    }

    public /* synthetic */ PyShapes(float f, float f2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m7018constructorimpl(12) : f, (i & 2) != 0 ? Dp.m7018constructorimpl(8) : f2, (i & 4) != 0 ? false : z, null);
    }

    /* renamed from: getCardRadius-D9Ej5fM, reason: not valid java name */
    public final float m7993getCardRadiusD9Ej5fM() {
        return this.cardRadius;
    }

    /* renamed from: getCtlRadius-D9Ej5fM, reason: not valid java name */
    public final float m7994getCtlRadiusD9Ej5fM() {
        return this.ctlRadius;
    }

    public final boolean getSquare() {
        return this.square;
    }

    public final Shape getCard() {
        float fM7018constructorimpl;
        if (!this.square) {
            fM7018constructorimpl = this.cardRadius;
        } else {
            fM7018constructorimpl = Dp.m7018constructorimpl(0);
        }
        return RoundedCornerShapeKt.m1032RoundedCornerShape0680j_4(fM7018constructorimpl);
    }

    public final Shape getCtl() {
        float fM7018constructorimpl;
        if (!this.square) {
            fM7018constructorimpl = this.ctlRadius;
        } else {
            fM7018constructorimpl = Dp.m7018constructorimpl(0);
        }
        return RoundedCornerShapeKt.m1032RoundedCornerShape0680j_4(fM7018constructorimpl);
    }

    public final Shape getPane() {
        return RoundedCornerShapeKt.m1032RoundedCornerShape0680j_4(this.square ? Dp.m7018constructorimpl(0) : Dp.m7018constructorimpl(10));
    }

    public final Shape getPill() {
        return RoundedCornerShapeKt.RoundedCornerShape(50);
    }
}
