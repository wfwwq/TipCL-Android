package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.InstalledEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModsDialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$GlobalModsSheet$reload$1", f = "ModsDialogs.kt", i = {}, l = {207, 208}, m = "invokeSuspend", n = {}, nl = {208, 209}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$GlobalModsSheet$reload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $dir$delegate;
    final /* synthetic */ MutableState<List<InstalledEntry>> $rows$delegate;
    final /* synthetic */ AppState $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$GlobalModsSheet$reload$1(AppState appState, MutableState<List<InstalledEntry>> mutableState, MutableState<String> mutableState2, Continuation<? super ModsDialogsKt$GlobalModsSheet$reload$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$rows$delegate = mutableState;
        this.$dir$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModsDialogsKt$GlobalModsSheet$reload$1(this.$state, this.$rows$delegate, this.$dir$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModsDialogsKt$GlobalModsSheet$reload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
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
            java.lang.Object r0 = r6.L$0
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = r7
            goto L7e
        L1a:
            java.lang.Object r1 = r6.L$0
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L47
            r2 = r7
            goto L41
        L23:
            kotlin.ResultKt.throwOnFailure(r7)
            androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.InstalledEntry>> r1 = r6.$rows$delegate     // Catch: java.lang.Exception -> L47
            com.pymcl.android.ui.state.AppState r2 = r6.$state     // Catch: java.lang.Exception -> L47
            com.pymcl.android.ui.state.LauncherUiApi r2 = r2.getApi()     // Catch: java.lang.Exception -> L47
            com.pymcl.android.ui.state.LauncherUiApiExt8 r2 = com.pymcl.android.ui.state.LauncherUiApiKt.getExt8(r2)     // Catch: java.lang.Exception -> L47
            r3 = r6
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3     // Catch: java.lang.Exception -> L47
            r6.L$0 = r1     // Catch: java.lang.Exception -> L47
            r4 = 1
            r6.label = r4     // Catch: java.lang.Exception -> L47
            java.lang.Object r2 = r2.listGlobalMods(r3)     // Catch: java.lang.Exception -> L47
            if (r2 != r0) goto L41
            return r0
        L41:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L47
            com.pymcl.android.ui.dialogs.ModsDialogsKt.access$GlobalModsSheet$lambda$2(r1, r2)     // Catch: java.lang.Exception -> L47
            goto L62
        L47:
            r1 = move-exception
            androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.InstalledEntry>> r2 = r6.$rows$delegate
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            com.pymcl.android.ui.dialogs.ModsDialogsKt.access$GlobalModsSheet$lambda$2(r2, r3)
            com.pymcl.android.ui.state.AppState r2 = r6.$state
            java.lang.String r3 = r1.getMessage()
            if (r3 != 0) goto L5b
            java.lang.String r3 = ""
        L5b:
            java.lang.String r4 = "error"
            java.lang.String r5 = "读取失败"
            r2.toast(r5, r3, r4)
        L62:
            androidx.compose.runtime.MutableState<java.lang.String> r1 = r6.$dir$delegate
            com.pymcl.android.ui.state.AppState r2 = r6.$state
            com.pymcl.android.ui.state.LauncherUiApi r2 = r2.getApi()
            com.pymcl.android.ui.state.LauncherUiApiExt8 r2 = com.pymcl.android.ui.state.LauncherUiApiKt.getExt8(r2)
            r3 = r6
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r6.L$0 = r1
            r4 = 2
            r6.label = r4
            java.lang.Object r2 = r2.globalModsDirPath(r3)
            if (r2 != r0) goto L7d
            return r0
        L7d:
            r0 = r1
        L7e:
            java.lang.String r2 = (java.lang.String) r2
            com.pymcl.android.ui.dialogs.ModsDialogsKt.access$GlobalModsSheet$lambda$5(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.ModsDialogsKt$GlobalModsSheet$reload$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
