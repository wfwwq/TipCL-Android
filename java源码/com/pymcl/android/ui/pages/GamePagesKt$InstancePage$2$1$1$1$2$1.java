package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.InstanceRow;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GamePages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.GamePagesKt$InstancePage$2$1$1$1$2$1", f = "GamePages.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, nl = {161}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class GamePagesKt$InstancePage$2$1$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $n;
    final /* synthetic */ MutableState<List<InstanceRow>> $rows$delegate;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamePagesKt$InstancePage$2$1$1$1$2$1(AppState appState, String str, MutableState<List<InstanceRow>> mutableState, Continuation<? super GamePagesKt$InstancePage$2$1$1$1$2$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$n = str;
        this.$rows$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GamePagesKt$InstancePage$2$1$1$1$2$1(this.$state, this.$n, this.$rows$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GamePagesKt$InstancePage$2$1$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (this.$state.getApi().createInstance(StringsKt.trim((CharSequence) this.$n).toString(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        GamePagesKt.InstancePage$reload(this.$state, this.$rows$delegate);
        this.$state.refreshData();
        AppState.toast$default(this.$state, "已创建", StringsKt.trim((CharSequence) this.$n).toString(), null, 4, null);
        return Unit.INSTANCE;
    }
}
