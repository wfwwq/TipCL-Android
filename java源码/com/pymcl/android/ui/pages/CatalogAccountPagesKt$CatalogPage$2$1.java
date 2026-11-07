package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogKind;
import com.pymcl.android.ui.state.InstalledEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$2$1", f = "CatalogAccountPages.kt", i = {0, 1, 1}, l = {114, 115}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$LaunchedEffect", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {115, 115}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class CatalogAccountPagesKt$CatalogPage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $inst;
    final /* synthetic */ MutableState<List<InstalledEntry>> $installed$delegate;
    final /* synthetic */ CatalogKind $kind;
    final /* synthetic */ AppState $state;
    final /* synthetic */ String $ver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogAccountPagesKt$CatalogPage$2$1(AppState appState, CatalogKind catalogKind, String str, String str2, MutableState<List<InstalledEntry>> mutableState, Continuation<? super CatalogAccountPagesKt$CatalogPage$2$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$kind = catalogKind;
        this.$inst = str;
        this.$ver = str2;
        this.$installed$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CatalogAccountPagesKt$CatalogPage$2$1 catalogAccountPagesKt$CatalogPage$2$1 = new CatalogAccountPagesKt$CatalogPage$2$1(this.$state, this.$kind, this.$inst, this.$ver, this.$installed$delegate, continuation);
        catalogAccountPagesKt$CatalogPage$2$1.L$0 = obj;
        return catalogAccountPagesKt$CatalogPage$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogAccountPagesKt$CatalogPage$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            switch(r2) {
                case 0: goto L2d;
                case 1: goto L24;
                case 2: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L15:
            r1 = 0
            java.lang.Object r2 = r9.L$1
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L21
            r6 = r2
            r2 = r10
            goto L93
        L21:
            r1 = move-exception
            goto L9a
        L24:
            java.lang.Object r2 = r9.L$1
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            kotlin.ResultKt.throwOnFailure(r10)
            r3 = r10
            goto L53
        L2d:
            kotlin.ResultKt.throwOnFailure(r10)
            androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.InstalledEntry>> r2 = r9.$installed$delegate
            com.pymcl.android.ui.state.AppState r3 = r9.$state
            com.pymcl.android.ui.state.LauncherUiApi r3 = r3.getApi()
            com.pymcl.android.ui.state.CatalogKind r4 = r9.$kind
            java.lang.String r4 = r4.getKey()
            java.lang.String r5 = r9.$inst
            java.lang.String r6 = r9.$ver
            r7 = r9
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r9.L$0 = r0
            r9.L$1 = r2
            r8 = 1
            r9.label = r8
            java.lang.Object r3 = r3.getInstalled(r4, r5, r6, r7)
            if (r3 != r1) goto L53
            return r1
        L53:
            java.util.List r3 = (java.util.List) r3
            com.pymcl.android.ui.pages.CatalogAccountPagesKt.access$CatalogPage$lambda$26(r2, r3)
            com.pymcl.android.ui.state.CatalogKind r2 = r9.$kind
            com.pymcl.android.ui.state.CatalogKind r3 = com.pymcl.android.ui.state.CatalogKind.World
            if (r2 == r3) goto Lc4
            com.pymcl.android.ui.state.CatalogKind r2 = r9.$kind
            com.pymcl.android.ui.state.CatalogKind r3 = com.pymcl.android.ui.state.CatalogKind.Modpack
            if (r2 == r3) goto Lc4
            com.pymcl.android.ui.state.AppState r2 = r9.$state
            com.pymcl.android.ui.state.CatalogKind r3 = r9.$kind
            java.lang.String r4 = r9.$inst
            java.lang.String r5 = r9.$ver
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L21
            r6 = r0
            r7 = 0
            com.pymcl.android.ui.state.LauncherUiApi r2 = r2.getApi()     // Catch: java.lang.Throwable -> L21
            com.pymcl.android.ui.state.LauncherUiApiExt r2 = com.pymcl.android.ui.state.LauncherUiApiKt.getExt(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = r3.getKey()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Throwable -> L21
            r9.L$0 = r8     // Catch: java.lang.Throwable -> L21
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)     // Catch: java.lang.Throwable -> L21
            r9.L$1 = r8     // Catch: java.lang.Throwable -> L21
            r8 = 2
            r9.label = r8     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r2.identifyInstalled(r3, r4, r5, r9)     // Catch: java.lang.Throwable -> L21
            if (r2 != r1) goto L92
            return r1
        L92:
            r1 = r7
        L93:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = kotlin.Result.m8116constructorimpl(r2)     // Catch: java.lang.Throwable -> L21
            goto La4
        L9a:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m8116constructorimpl(r1)
        La4:
            boolean r2 = kotlin.Result.m8122isFailureimpl(r1)
            r3 = 0
            if (r2 == 0) goto Lac
            r1 = r3
        Lac:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lc4
            r2 = r1
            r4 = 0
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto Lbc
            r3 = r1
        Lbc:
            if (r3 == 0) goto Lc4
            androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.InstalledEntry>> r1 = r9.$installed$delegate
            r2 = 0
            com.pymcl.android.ui.pages.CatalogAccountPagesKt.access$CatalogPage$lambda$26(r1, r3)
        Lc4:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
