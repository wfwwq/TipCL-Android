package com.pymcl.android.ui.pages;

import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.InstanceRow;
import com.pymcl.android.ui.state.ModUpdateWatcher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GamePages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$3", f = "GamePages.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InstanceRow $r;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$3(AppState appState, InstanceRow instanceRow, Continuation<? super GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$3> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$r = instanceRow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$3(this.$state, this.$r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objCheckInstance$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                objCheckInstance$default = ModUpdateWatcher.checkInstance$default(this.$state.getModWatcher(), this.$r.getName(), null, this, 2, null);
                if (objCheckInstance$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objCheckInstance$default = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int n = ((Number) objCheckInstance$default).intValue();
        AppState.toast$default(this.$state, n == 0 ? I18nKt.tr("都是最新的", new Object[0]) : I18nKt.tr("{0} 个模组有更新", Boxing.boxInt(n)), n == 0 ? I18nKt.tr("没有找到可更新的模组", new Object[0]) : I18nKt.tr("在「挑着更新模组…」里更新", new Object[0]), null, 4, null);
        return Unit.INSTANCE;
    }
}
