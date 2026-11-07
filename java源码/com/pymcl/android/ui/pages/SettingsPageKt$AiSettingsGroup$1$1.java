package com.pymcl.android.ui.pages;

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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SettingsPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.SettingsPageKt$AiSettingsGroup$1$1", f = "SettingsPage.kt", i = {0, 0}, l = {233}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {233}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class SettingsPageKt$AiSettingsGroup$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiBridge $ai;
    final /* synthetic */ MutableState<AiSettings> $base$delegate;
    final /* synthetic */ MutableState<AiSettingsForm> $form$delegate;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsPageKt$AiSettingsGroup$1$1(AiBridge aiBridge, MutableState<AiSettings> mutableState, MutableState<AiSettingsForm> mutableState2, AppState appState, Continuation<? super SettingsPageKt$AiSettingsGroup$1$1> continuation) {
        super(2, continuation);
        this.$ai = aiBridge;
        this.$base$delegate = mutableState;
        this.$form$delegate = mutableState2;
        this.$state = appState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SettingsPageKt$AiSettingsGroup$1$1 settingsPageKt$AiSettingsGroup$1$1 = new SettingsPageKt$AiSettingsGroup$1$1(this.$ai, this.$base$delegate, this.$form$delegate, this.$state, continuation);
        settingsPageKt$AiSettingsGroup$1$1.L$0 = obj;
        return settingsPageKt$AiSettingsGroup$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SettingsPageKt$AiSettingsGroup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            r3 = 0
            switch(r2) {
                case 0: goto L21;
                case 1: goto L16;
                default: goto Le;
            }
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L16:
            r1 = 0
            java.lang.Object r2 = r7.L$1
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L4c
            r4 = r2
            r2 = r8
            goto L43
        L21:
            kotlin.ResultKt.throwOnFailure(r8)
            com.pymcl.android.data.AiBridge r2 = r7.$ai
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4c
            r4 = r0
            r5 = 0
            if (r2 == 0) goto L46
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Throwable -> L4c
            r7.L$0 = r6     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)     // Catch: java.lang.Throwable -> L4c
            r7.L$1 = r6     // Catch: java.lang.Throwable -> L4c
            r6 = 1
            r7.label = r6     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r2 = r2.settings(r7)     // Catch: java.lang.Throwable -> L4c
            if (r2 != r1) goto L42
            return r1
        L42:
            r1 = r5
        L43:
            com.pymcl.ai.AiSettings r2 = (com.pymcl.ai.AiSettings) r2     // Catch: java.lang.Throwable -> L4c
            goto L47
        L46:
            r2 = r3
        L47:
            java.lang.Object r1 = kotlin.Result.m8116constructorimpl(r2)     // Catch: java.lang.Throwable -> L4c
            goto L57
        L4c:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m8116constructorimpl(r1)
        L57:
            boolean r2 = kotlin.Result.m8122isFailureimpl(r1)
            if (r2 == 0) goto L5e
            goto L5f
        L5e:
            r3 = r1
        L5f:
            com.pymcl.ai.AiSettings r3 = (com.pymcl.ai.AiSettings) r3
            if (r3 != 0) goto L66
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L66:
            androidx.compose.runtime.MutableState<com.pymcl.ai.AiSettings> r1 = r7.$base$delegate
            com.pymcl.android.ui.pages.SettingsPageKt.access$AiSettingsGroup$lambda$3(r1, r3)
            androidx.compose.runtime.MutableState<com.pymcl.android.data.AiSettingsForm> r1 = r7.$form$delegate
            com.pymcl.android.data.AiSettingsForm$Companion r2 = com.pymcl.android.data.AiSettingsForm.INSTANCE
            com.pymcl.android.data.AiSettingsForm r2 = r2.from(r3)
            com.pymcl.android.ui.pages.SettingsPageKt.access$AiSettingsGroup$lambda$6(r1, r2)
            com.pymcl.android.ui.state.AppState r1 = r7.$state
            com.pymcl.android.ui.pages.SettingsPageKt.access$AiSettingsGroup$syncUi(r1, r3)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt$AiSettingsGroup$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
