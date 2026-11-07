package com.pymcl.runtime.control;

import kotlin.Metadata;

/* compiled from: ControlViews.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/pymcl/runtime/control/DirectionMath;", "", "<init>", "()V", "directions", "", "nx", "", "ny", "deadzone", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DirectionMath {
    public static final DirectionMath INSTANCE = new DirectionMath();

    private DirectionMath() {
    }

    public static /* synthetic */ boolean[] directions$default(DirectionMath directionMath, float f, float f2, float f3, int i, Object obj) {
        if ((i & 4) != 0) {
            f3 = 0.25f;
        }
        return directionMath.directions(f, f2, f3);
    }

    public final boolean[] directions(float nx, float ny, float deadzone) {
        float r = (float) Math.hypot(nx, ny);
        if (r < deadzone) {
            return new boolean[4];
        }
        float ax = Math.abs(nx);
        float ay = Math.abs(ny);
        boolean diag = Math.min(ax, ay) / Math.max(ax, ay) > 0.4142f;
        boolean up = ny < 0.0f && (ay >= ax || diag);
        boolean down = ny > 0.0f && (ay >= ax || diag);
        boolean left = nx < 0.0f && (ax >= ay || diag);
        boolean right = nx > 0.0f && (ax >= ay || diag);
        return new boolean[]{up, down, left, right};
    }
}
