package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AccountRow;
import com.pymcl.android.ui.state.AppState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$AccountPage$3$3$1$4$1$1", f = "CatalogAccountPages.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class CatalogAccountPagesKt$AccountPage$3$3$1$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountRow $a;
    final /* synthetic */ MutableState<List<AccountRow>> $rows$delegate;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogAccountPagesKt$AccountPage$3$3$1$4$1$1(AppState appState, AccountRow accountRow, MutableState<List<AccountRow>> mutableState, Continuation<? super CatalogAccountPagesKt$AccountPage$3$3$1$4$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$a = accountRow;
        this.$rows$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CatalogAccountPagesKt$AccountPage$3$3$1$4$1$1(this.$state, this.$a, this.$rows$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogAccountPagesKt$AccountPage$3$3$1$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (this.$state.getApi().setActiveAccount(this.$a.getName(), this.$a.getType(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$state.setActiveAccount(this.$a.getName());
        CatalogAccountPagesKt.AccountPage$reload(this.$state, this.$rows$delegate);
        this.$state.refreshData();
        AppState.toast$default(this.$state, "已切换", I18nKt.tr("当前账号：{0}", this.$a.getName()), null, 4, null);
        return Unit.INSTANCE;
    }
}
