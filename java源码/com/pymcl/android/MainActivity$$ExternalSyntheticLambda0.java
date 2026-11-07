package com.pymcl.android;

import androidx.compose.runtime.Composer;
import com.pymcl.android.ui.state.AppState;
import kotlin.jvm.functions.Function2;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes23.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ AppState f$0;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda0(AppState appState) {
        this.f$0 = appState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return MainActivity.onCreate$lambda$1(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
    }
}
