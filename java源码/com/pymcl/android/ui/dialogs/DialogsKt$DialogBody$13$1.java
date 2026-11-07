package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.DialogSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.DialogsKt$DialogBody$13$1", f = "Dialogs.kt", i = {}, l = {171, 172}, m = "invokeSuspend", n = {}, nl = {172, 454}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class DialogsKt$DialogBody$13$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $current$delegate;
    final /* synthetic */ DialogSpec $d;
    final /* synthetic */ MutableIntState $model$delegate;
    final /* synthetic */ AppState $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogsKt$DialogBody$13$1(AppState appState, DialogSpec dialogSpec, MutableState<String> mutableState, MutableIntState mutableIntState, Continuation<? super DialogsKt$DialogBody$13$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$d = dialogSpec;
        this.$current$delegate = mutableState;
        this.$model$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DialogsKt$DialogBody$13$1(this.$state, this.$d, this.$current$delegate, this.$model$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogsKt$DialogBody$13$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            switch(r1) {
                case 0: goto L23;
                case 1: goto L1a;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.Object r0 = r11.L$0
            androidx.compose.runtime.MutableIntState r0 = (androidx.compose.runtime.MutableIntState) r0
            kotlin.ResultKt.throwOnFailure(r12)
            r2 = r12
            goto L66
        L1a:
            java.lang.Object r1 = r11.L$0
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            kotlin.ResultKt.throwOnFailure(r12)
            r2 = r12
            goto L49
        L23:
            kotlin.ResultKt.throwOnFailure(r12)
            androidx.compose.runtime.MutableState<java.lang.String> r1 = r11.$current$delegate
            com.pymcl.android.ui.state.AppState r2 = r11.$state
            com.pymcl.android.ui.state.LauncherUiApi r2 = r2.getApi()
            com.pymcl.android.ui.state.LauncherUiApiExt r2 = com.pymcl.android.ui.state.LauncherUiApiKt.getExt(r2)
            com.pymcl.android.ui.state.DialogSpec r3 = r11.$d
            com.pymcl.android.ui.state.DialogSpec$Skin r3 = (com.pymcl.android.ui.state.DialogSpec.Skin) r3
            java.lang.String r3 = r3.getAccount()
            r4 = r11
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r11.L$0 = r1
            r5 = 1
            r11.label = r5
            java.lang.Object r2 = r2.accountSkinFile(r3, r4)
            if (r2 != r0) goto L49
            return r0
        L49:
            java.lang.String r2 = (java.lang.String) r2
            com.pymcl.android.ui.dialogs.DialogsKt.access$DialogBody$lambda$42(r1, r2)
            androidx.compose.runtime.MutableIntState r1 = r11.$model$delegate
            com.pymcl.android.ui.state.AppState r2 = r11.$state
            com.pymcl.android.ui.state.LauncherUiApi r2 = r2.getApi()
            r3 = r11
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r11.L$0 = r1
            r4 = 2
            r11.label = r4
            java.lang.Object r2 = r2.getAccountRows(r3)
            if (r2 != r0) goto L65
            return r0
        L65:
            r0 = r1
        L66:
            r1 = r2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.pymcl.android.ui.state.DialogSpec r2 = r11.$d
            r3 = 0
            java.util.Iterator r4 = r1.iterator()
        L70:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto L91
            java.lang.Object r5 = r4.next()
            r7 = r5
            com.pymcl.android.ui.state.AccountRow r7 = (com.pymcl.android.ui.state.AccountRow) r7
            r8 = 0
            java.lang.String r9 = r7.getName()
            r10 = r2
            com.pymcl.android.ui.state.DialogSpec$Skin r10 = (com.pymcl.android.ui.state.DialogSpec.Skin) r10
            java.lang.String r10 = r10.getAccount()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r7 == 0) goto L70
            goto L92
        L91:
            r5 = r6
        L92:
            com.pymcl.android.ui.state.AccountRow r5 = (com.pymcl.android.ui.state.AccountRow) r5
            if (r5 == 0) goto L9a
            java.lang.String r6 = r5.getSkinModel()
        L9a:
            java.lang.String r1 = "slim"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r1)
            com.pymcl.android.ui.dialogs.DialogsKt.access$DialogBody$lambda$39(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.DialogsKt$DialogBody$13$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
