package com.pymcl.runtime.control;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DefaultLayouts.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class DefaultLayouts$builtins$2 extends FunctionReferenceImpl implements Function0<ControlLayout> {
    DefaultLayouts$builtins$2(Object obj) {
        super(0, obj, DefaultLayouts.class, "dpad", "dpad()Lcom/pymcl/runtime/control/ControlLayout;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ControlLayout invoke() {
        return ((DefaultLayouts) this.receiver).dpad();
    }
}
