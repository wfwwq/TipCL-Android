package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.PermissionRule;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AiPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$PermissionPanel$2$2$2$4$1$1$1", f = "AiPage.kt", i = {}, l = {398, 398}, m = "invokeSuspend", n = {}, nl = {398, -1}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$PermissionPanel$2$2$2$4$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ String $b;
    final /* synthetic */ MutableState<String> $content$delegate;
    final /* synthetic */ MutableState<List<PermissionRule>> $rules$delegate;
    final /* synthetic */ MutableIntState $scope$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ String $t;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiPageKt$PermissionPanel$2$2$2$4$1$1$1(AiUiExtras aiUiExtras, String str, String str2, AppState appState, MutableState<String> mutableState, MutableIntState mutableIntState, MutableState<List<PermissionRule>> mutableState2, Continuation<? super AiPageKt$PermissionPanel$2$2$2$4$1$1$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
        this.$t = str;
        this.$b = str2;
        this.$state = appState;
        this.$content$delegate = mutableState;
        this.$scope$delegate = mutableIntState;
        this.$rules$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiPageKt$PermissionPanel$2$2$2$4$1$1$1(this.$ai, this.$t, this.$b, this.$state, this.$content$delegate, this.$scope$delegate, this.$rules$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$PermissionPanel$2$2$2$4$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            switch(r1) {
                case 0: goto L19;
                case 1: goto L15;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L59
        L15:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L41
        L19:
            kotlin.ResultKt.throwOnFailure(r9)
            com.pymcl.android.data.AiUiExtras r2 = r8.$ai
            java.lang.String r3 = r8.$t
            java.lang.String r4 = r8.$b
            androidx.compose.runtime.MutableState<java.lang.String> r1 = r8.$content$delegate
            java.lang.String r5 = com.pymcl.android.ui.pages.AiPageKt.access$PermissionPanel$lambda$14(r1)
            androidx.compose.runtime.MutableIntState r1 = r8.$scope$delegate
            int r1 = com.pymcl.android.ui.pages.AiPageKt.access$PermissionPanel$lambda$11(r1)
            r6 = 1
            if (r1 != 0) goto L33
            r1 = r6
            goto L34
        L33:
            r1 = 0
        L34:
            r7 = r8
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r8.label = r6
            r6 = r1
            java.lang.Object r1 = r2.addRule(r3, r4, r5, r6, r7)
            if (r1 != r0) goto L41
            return r0
        L41:
            androidx.compose.runtime.MutableState<java.lang.String> r1 = r8.$content$delegate
            java.lang.String r2 = ""
            com.pymcl.android.ui.pages.AiPageKt.access$PermissionPanel$lambda$15(r1, r2)
            com.pymcl.android.data.AiUiExtras r1 = r8.$ai
            androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.PermissionRule>> r2 = r8.$rules$delegate
            r3 = r8
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 2
            r8.label = r4
            java.lang.Object r1 = com.pymcl.android.ui.pages.AiPageKt.access$PermissionPanel$reload(r1, r2, r3)
            if (r1 != r0) goto L59
            return r0
        L59:
            com.pymcl.android.ui.state.AppState r2 = r8.$state
            r6 = 6
            r7 = 0
            java.lang.String r3 = "已保存"
            r4 = 0
            r5 = 0
            com.pymcl.android.ui.state.AppState.toast$default(r2, r3, r4, r5, r6, r7)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt$PermissionPanel$2$2$2$4$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
