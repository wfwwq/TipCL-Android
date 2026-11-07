package com.pymcl.android.ui.theme;

import androidx.compose.animation.core.CubicBezierEasing;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011Ê\u0001\u0002\b$¨\u0006#"}, d2 = {"Lcom/pymcl/android/ui/theme/PyMotion;", "", "enabled", "", "scale", "", "<init>", "(ZF)V", "getEnabled", "()Z", "getScale", "()F", "ms", "", "base", "fast", "getFast", "()I", "med", "getMed", "page", "getPage", "countUp", "getCountUp", "staggerStep", "getStaggerStep", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/Immutable;"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class PyMotion {
    public static final int $stable = 0;
    private final boolean enabled;
    private final float scale;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CubicBezierEasing EaseOut = new CubicBezierEasing(0.215f, 0.61f, 0.355f, 1.0f);
    private static final CubicBezierEasing EaseInOut = new CubicBezierEasing(0.455f, 0.03f, 0.515f, 0.955f);

    public PyMotion() {
        this(false, 0.0f, 3, null);
    }

    public static /* synthetic */ PyMotion copy$default(PyMotion pyMotion, boolean z, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pyMotion.enabled;
        }
        if ((i & 2) != 0) {
            f = pyMotion.scale;
        }
        return pyMotion.copy(z, f);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    public final PyMotion copy(boolean enabled, float scale) {
        return new PyMotion(enabled, scale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PyMotion)) {
            return false;
        }
        PyMotion pyMotion = (PyMotion) other;
        return this.enabled == pyMotion.enabled && Float.compare(this.scale, pyMotion.scale) == 0;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enabled) * 31) + Float.hashCode(this.scale);
    }

    public String toString() {
        return "PyMotion(enabled=" + this.enabled + ", scale=" + this.scale + ")";
    }

    public PyMotion(boolean enabled, float scale) {
        this.enabled = enabled;
        this.scale = scale;
    }

    public /* synthetic */ PyMotion(boolean z, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 1.0f : f);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final float getScale() {
        return this.scale;
    }

    public final int ms(int base) {
        if (this.enabled) {
            return (int) (base * this.scale);
        }
        return 0;
    }

    public final int getFast() {
        return ms(130);
    }

    public final int getMed() {
        return ms(220);
    }

    public final int getPage() {
        return ms(240);
    }

    public final int getCountUp() {
        return ms(620);
    }

    /* compiled from: Theme.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/pymcl/android/ui/theme/PyMotion$Companion;", "", "<init>", "()V", "EaseOut", "Landroidx/compose/animation/core/CubicBezierEasing;", "getEaseOut", "()Landroidx/compose/animation/core/CubicBezierEasing;", "EaseInOut", "getEaseInOut", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CubicBezierEasing getEaseInOut() {
            return PyMotion.EaseInOut;
        }

        public final CubicBezierEasing getEaseOut() {
            return PyMotion.EaseOut;
        }
    }

    public final int getStaggerStep() {
        return ms(26);
    }
}
