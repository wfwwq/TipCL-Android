package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: BackLambda.kt */
/* loaded from: classes22.dex */
public final class BackLambda implements Function0 {
    private final MutableState sel;

    public BackLambda(MutableState mutableState) {
        this.sel = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m7718invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7718invoke() {
        this.sel.setValue(null);
    }
}
