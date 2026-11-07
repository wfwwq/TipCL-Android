package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GamePages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.GamePagesKt$VersionPage$2$1", f = "GamePages.kt", i = {0, 0}, l = {46}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {46}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class GamePagesKt$VersionPage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $loader$delegate;
    final /* synthetic */ MutableState<Boolean> $loaderLoaded$delegate;
    final /* synthetic */ MutableIntState $loaderVer$delegate;
    final /* synthetic */ MutableState<List<String>> $loaderVersions$delegate;
    final /* synthetic */ List<String> $loaders;
    final /* synthetic */ MutableState<String> $selected$delegate;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamePagesKt$VersionPage$2$1(MutableState<Boolean> mutableState, MutableState<List<String>> mutableState2, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableState<String> mutableState3, AppState appState, List<String> list, Continuation<? super GamePagesKt$VersionPage$2$1> continuation) {
        super(2, continuation);
        this.$loaderLoaded$delegate = mutableState;
        this.$loaderVersions$delegate = mutableState2;
        this.$loaderVer$delegate = mutableIntState;
        this.$loader$delegate = mutableIntState2;
        this.$selected$delegate = mutableState3;
        this.$state = appState;
        this.$loaders = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GamePagesKt$VersionPage$2$1 gamePagesKt$VersionPage$2$1 = new GamePagesKt$VersionPage$2$1(this.$loaderLoaded$delegate, this.$loaderVersions$delegate, this.$loaderVer$delegate, this.$loader$delegate, this.$selected$delegate, this.$state, this.$loaders, continuation);
        gamePagesKt$VersionPage$2$1.L$0 = obj;
        return gamePagesKt$VersionPage$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GamePagesKt$VersionPage$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.runtime.MutableState<java.util.List<java.lang.String>>, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r10.label
            r3 = 1
            switch(r2) {
                case 0: goto L27;
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
            java.lang.Object r2 = r10.L$2
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            java.lang.Object r4 = r10.L$1
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L25
            r8 = r4
            r4 = r11
            goto L8a
        L25:
            r1 = move-exception
            goto L91
        L27:
            kotlin.ResultKt.throwOnFailure(r11)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r2 = r10.$loaderLoaded$delegate
            r4 = 0
            com.pymcl.android.ui.pages.GamePagesKt.access$VersionPage$lambda$27(r2, r4)
            androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> r2 = r10.$loaderVersions$delegate
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            com.pymcl.android.ui.pages.GamePagesKt.access$VersionPage$lambda$20(r2, r5)
            androidx.compose.runtime.MutableIntState r2 = r10.$loaderVer$delegate
            com.pymcl.android.ui.pages.GamePagesKt.access$VersionPage$lambda$23(r2, r4)
            androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> r2 = r10.$loaderVersions$delegate
            androidx.compose.runtime.MutableIntState r4 = r10.$loader$delegate
            int r4 = com.pymcl.android.ui.pages.GamePagesKt.access$VersionPage$lambda$16(r4)
            if (r4 == 0) goto La9
            androidx.compose.runtime.MutableState<java.lang.String> r4 = r10.$selected$delegate
            java.lang.String r4 = com.pymcl.android.ui.pages.GamePagesKt.access$VersionPage$lambda$13(r4)
            if (r4 != 0) goto L51
            goto La9
        L51:
            com.pymcl.android.ui.state.AppState r4 = r10.$state
            java.util.List<java.lang.String> r5 = r10.$loaders
            androidx.compose.runtime.MutableIntState r6 = r10.$loader$delegate
            androidx.compose.runtime.MutableState<java.lang.String> r7 = r10.$selected$delegate
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L25
            r8 = r0
            r9 = 0
            com.pymcl.android.ui.state.LauncherUiApi r4 = r4.getApi()     // Catch: java.lang.Throwable -> L25
            int r6 = com.pymcl.android.ui.pages.GamePagesKt.access$VersionPage$lambda$16(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = com.pymcl.android.ui.pages.GamePagesKt.access$VersionPage$lambda$13(r7)     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Throwable -> L25
            r10.L$0 = r7     // Catch: java.lang.Throwable -> L25
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)     // Catch: java.lang.Throwable -> L25
            r10.L$1 = r7     // Catch: java.lang.Throwable -> L25
            r10.L$2 = r2     // Catch: java.lang.Throwable -> L25
            r10.label = r3     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r4.listLoaderVersions(r5, r6, r10)     // Catch: java.lang.Throwable -> L25
            if (r4 != r1) goto L89
            return r1
        L89:
            r1 = r9
        L8a:
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = kotlin.Result.m8116constructorimpl(r4)     // Catch: java.lang.Throwable -> L25
            goto L9b
        L91:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m8116constructorimpl(r1)
        L9b:
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r5 = kotlin.Result.m8122isFailureimpl(r1)
            if (r5 == 0) goto La6
            r1 = r4
        La6:
            java.util.List r1 = (java.util.List) r1
            goto Lad
        La9:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        Lad:
            com.pymcl.android.ui.pages.GamePagesKt.access$VersionPage$lambda$20(r2, r1)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r10.$loaderLoaded$delegate
            com.pymcl.android.ui.pages.GamePagesKt.access$VersionPage$lambda$27(r1, r3)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt$VersionPage$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
