package com.pymcl.runtime.control;

import android.content.Context;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ControlViews.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"createElementView", "Lcom/pymcl/runtime/control/ControlElementView;", "context", "Landroid/content/Context;", "e", "Lcom/pymcl/runtime/control/ControlElement;", "host", "Lcom/pymcl/runtime/control/ControlHost;", "PyMCL-Android:runtime_debug"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ControlViewsKt {

    /* compiled from: ControlViews.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ElementType.values().length];
            try {
                iArr[ElementType.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ElementType.DPAD.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ElementType.JOYSTICK.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[ElementType.LOOK_AREA.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ControlElementView createElementView(Context context, ControlElement e, ControlHost host) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(host, "host");
        switch (WhenMappings.$EnumSwitchMapping$0[e.getType().ordinal()]) {
            case 1:
                return new ButtonView(context, e, host);
            case 2:
            case 3:
                return new DirectionView(context, e, host);
            case 4:
                return new LookAreaView(context, e, host);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
