package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1", f = "MiscPages.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, nl = {586}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $code$delegate;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1(AppState appState, MutableState<String> mutableState, Continuation<? super MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1> continuation) {
        super(1, continuation);
        this.$state = appState;
        this.$code$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1(this.$state, this.$code$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$MultiplayerPage$3$3$4$2$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objTerracottaJoin;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                objTerracottaJoin = this.$state.getApi().terracottaJoin(MiscPagesKt.MultiplayerPage$lambda$3(this.$code$delegate), this);
                if (objTerracottaJoin == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objTerracottaJoin = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) objTerracottaJoin;
        if (str != null) {
            this.$state.toast("无法加入", I18nKt.tr(str, new Object[0]), "error");
        }
        return Unit.INSTANCE;
    }
}
