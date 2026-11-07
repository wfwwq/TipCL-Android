package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.InstalledEntry;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModsDialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$5$6$1$5$1$1$1", f = "ModsDialogs.kt", i = {0, 0}, l = {189}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {189}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$ModsSheet$5$6$1$5$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Set<String>> $injected$delegate;
    final /* synthetic */ String $inst;
    final /* synthetic */ InstalledEntry $m;
    final /* synthetic */ MutableState<List<InstalledEntry>> $rows$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<String> $ver$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$ModsSheet$5$6$1$5$1$1$1(AppState appState, String str, InstalledEntry installedEntry, MutableState<String> mutableState, MutableState<List<InstalledEntry>> mutableState2, MutableState<Set<String>> mutableState3, Continuation<? super ModsDialogsKt$ModsSheet$5$6$1$5$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$inst = str;
        this.$m = installedEntry;
        this.$ver$delegate = mutableState;
        this.$rows$delegate = mutableState2;
        this.$injected$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModsDialogsKt$ModsSheet$5$6$1$5$1$1$1 modsDialogsKt$ModsSheet$5$6$1$5$1$1$1 = new ModsDialogsKt$ModsSheet$5$6$1$5$1$1$1(this.$state, this.$inst, this.$m, this.$ver$delegate, this.$rows$delegate, this.$injected$delegate, continuation);
        modsDialogsKt$ModsSheet$5$6$1$5$1$1$1.L$0 = obj;
        return modsDialogsKt$ModsSheet$5$6$1$5$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModsDialogsKt$ModsSheet$5$6$1$5$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.L$0
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r11.label
            switch(r2) {
                case 0: goto L21;
                case 1: goto L17;
                default: goto Le;
            }
        Le:
            r8 = r11
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L17:
            r0 = 0
            java.lang.Object r2 = r11.L$1
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L62
            r8 = r11
            goto L59
        L21:
            kotlin.ResultKt.throwOnFailure(r12)
            com.pymcl.android.ui.state.AppState r2 = r11.$state
            java.lang.String r5 = r11.$inst
            com.pymcl.android.ui.state.InstalledEntry r3 = r11.$m
            androidx.compose.runtime.MutableState<java.lang.String> r4 = r11.$ver$delegate
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L62
            r9 = r1
            r10 = 0
            com.pymcl.android.ui.state.LauncherUiApi r2 = r2.getApi()     // Catch: java.lang.Throwable -> L62
            r6 = r4
            java.lang.String r4 = "mod"
            java.lang.String r6 = com.pymcl.android.ui.dialogs.ModsDialogsKt.access$ModsSheet$lambda$4(r6)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r3.getFilename()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)     // Catch: java.lang.Throwable -> L62
            r11.L$0 = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)     // Catch: java.lang.Throwable -> L62
            r11.L$1 = r3     // Catch: java.lang.Throwable -> L62
            r3 = 1
            r11.label = r3     // Catch: java.lang.Throwable -> L62
            r8 = r11
            r3 = r2
            java.lang.Object r2 = r3.deleteInstalled(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L60
            if (r2 != r0) goto L57
            return r0
        L57:
            r2 = r9
            r0 = r10
        L59:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = kotlin.Result.m8116constructorimpl(r0)     // Catch: java.lang.Throwable -> L60
            goto L6e
        L60:
            r0 = move-exception
            goto L64
        L62:
            r0 = move-exception
            r8 = r11
        L64:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m8116constructorimpl(r0)
        L6e:
            com.pymcl.android.ui.state.AppState r2 = r8.$state
            boolean r3 = kotlin.Result.m8123isSuccessimpl(r0)
            if (r3 == 0) goto L83
            r9 = r0
            kotlin.Unit r9 = (kotlin.Unit) r9
            r10 = 0
            r6 = 6
            r7 = 0
            java.lang.String r3 = "已删除"
            r4 = 0
            r5 = 0
            com.pymcl.android.ui.state.AppState.toast$default(r2, r3, r4, r5, r6, r7)
        L83:
            com.pymcl.android.ui.state.AppState r2 = r8.$state
            java.lang.Throwable r0 = kotlin.Result.m8119exceptionOrNullimpl(r0)
            if (r0 == 0) goto L9b
            r3 = 0
            java.lang.String r4 = r0.getMessage()
            if (r4 != 0) goto L94
            java.lang.String r4 = ""
        L94:
            java.lang.String r5 = "error"
            java.lang.String r6 = "删除失败"
            r2.toast(r6, r4, r5)
        L9b:
            com.pymcl.android.ui.state.AppState r0 = r8.$state
            java.lang.String r2 = r8.$inst
            androidx.compose.runtime.MutableState<java.lang.String> r3 = r8.$ver$delegate
            androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.InstalledEntry>> r4 = r8.$rows$delegate
            androidx.compose.runtime.MutableState<java.util.Set<java.lang.String>> r5 = r8.$injected$delegate
            com.pymcl.android.ui.dialogs.ModsDialogsKt.access$ModsSheet$reload(r0, r2, r3, r4, r5)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$5$6$1$5$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
