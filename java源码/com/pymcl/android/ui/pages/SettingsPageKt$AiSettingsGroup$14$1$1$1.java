package com.pymcl.android.ui.pages;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.MutableState;
import com.pymcl.ai.AiSettings;
import com.pymcl.android.data.AiBridge;
import com.pymcl.android.data.AiSettingsForm;
import com.pymcl.android.ui.state.AppState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: SettingsPage.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.SettingsPageKt$AiSettingsGroup$14$1$1$1", f = "SettingsPage.kt", i = {0, 0, 1, 1}, l = {285, 285}, m = "invokeSuspend", n = {"st", "$this$invokeSuspend_u24lambda_u240\\1", "st", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {285, 285}, s = {"L$0", "L$2", "L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class SettingsPageKt$AiSettingsGroup$14$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ AiBridge $ai;
    final /* synthetic */ AiSettings $b;
    final /* synthetic */ MutableState<AiSettings> $base$delegate;
    final /* synthetic */ MutableState<AiSettingsForm> $form$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ RowScope $this_Row;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsPageKt$AiSettingsGroup$14$1$1$1(AiSettings aiSettings, RowScope rowScope, MutableState<AiSettingsForm> mutableState, AiBridge aiBridge, AppState appState, MutableState<AiSettings> mutableState2, Continuation<? super SettingsPageKt$AiSettingsGroup$14$1$1$1> continuation) {
        super(1, continuation);
        this.$b = aiSettings;
        this.$this_Row = rowScope;
        this.$form$delegate = mutableState;
        this.$ai = aiBridge;
        this.$state = appState;
        this.$base$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SettingsPageKt$AiSettingsGroup$14$1$1$1(this.$b, this.$this_Row, this.$form$delegate, this.$ai, this.$state, this.$base$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((SettingsPageKt$AiSettingsGroup$14$1$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt$AiSettingsGroup$14$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
