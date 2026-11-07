package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.LauncherUiApi;
import com.pymcl.android.ui.state.RemoteVersion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GamePages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.GamePagesKt$VersionPage$1$1", f = "GamePages.kt", i = {0, 0}, l = {41}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {41}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class GamePagesKt$VersionPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<RemoteVersion>> $list$delegate;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamePagesKt$VersionPage$1$1(AppState appState, MutableState<List<RemoteVersion>> mutableState, Continuation<? super GamePagesKt$VersionPage$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$list$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GamePagesKt$VersionPage$1$1 gamePagesKt$VersionPage$1$1 = new GamePagesKt$VersionPage$1$1(this.$state, this.$list$delegate, continuation);
        gamePagesKt$VersionPage$1$1.L$0 = obj;
        return gamePagesKt$VersionPage$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GamePagesKt$VersionPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.RemoteVersion>>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8116constructorimpl;
        ?? r2;
        Object versionList;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            switch (i) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    ?? r22 = this.$list$delegate;
                    AppState appState = this.$state;
                    Result.Companion companion = Result.INSTANCE;
                    LauncherUiApi api = appState.getApi();
                    this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.L$2 = r22;
                    this.label = 1;
                    versionList = api.getVersionList(this);
                    if (versionList != coroutine_suspended) {
                        i = r22;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ?? r23 = (MutableState) this.L$2;
                    ResultKt.throwOnFailure(obj);
                    versionList = obj;
                    i = r23;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objM8116constructorimpl = Result.m8116constructorimpl((List) versionList);
            r2 = i;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            r2 = i;
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = listEmptyList;
        }
        r2.setValue((List) objM8116constructorimpl);
        this.$state.refreshData();
        return Unit.INSTANCE;
    }
}
