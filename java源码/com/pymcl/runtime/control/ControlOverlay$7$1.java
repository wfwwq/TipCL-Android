package com.pymcl.runtime.control;

import com.pymcl.runtime.input.InputSettings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ControlOverlay.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class ControlOverlay$7$1 extends FunctionReferenceImpl implements Function0<ControlLayout> {
    ControlOverlay$7$1(Object obj) {
        super(0, obj, DefaultLayouts.class, InputSettings.DEFAULT_LAYOUT, "default()Lcom/pymcl/runtime/control/ControlLayout;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ControlLayout invoke() {
        return ((DefaultLayouts) this.receiver).m8059default();
    }
}
