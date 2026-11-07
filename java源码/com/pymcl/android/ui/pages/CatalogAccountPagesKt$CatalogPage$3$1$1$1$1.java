package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import java.util.Map;
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

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$1$1$1$1", f = "CatalogAccountPages.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, nl = {125}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class CatalogAccountPagesKt$CatalogPage$3$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $checking$delegate;
    final /* synthetic */ String $inst;
    final /* synthetic */ MutableIntState $mode$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<Map<String, String>> $updates$delegate;
    final /* synthetic */ String $ver;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogAccountPagesKt$CatalogPage$3$1$1$1$1(AppState appState, String str, String str2, MutableState<Map<String, String>> mutableState, MutableIntState mutableIntState, MutableState<Boolean> mutableState2, Continuation<? super CatalogAccountPagesKt$CatalogPage$3$1$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$inst = str;
        this.$ver = str2;
        this.$updates$delegate = mutableState;
        this.$mode$delegate = mutableIntState;
        this.$checking$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CatalogAccountPagesKt$CatalogPage$3$1$1$1$1(this.$state, this.$inst, this.$ver, this.$updates$delegate, this.$mode$delegate, this.$checking$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogAccountPagesKt$CatalogPage$3$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objCheckModUpdates;
        MutableState<Map<String, String>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    MutableState<Map<String, String>> mutableState2 = this.$updates$delegate;
                    this.L$0 = mutableState2;
                    this.label = 1;
                    objCheckModUpdates = this.$state.getApi().checkModUpdates(this.$inst, this.$ver, this);
                    if (objCheckModUpdates == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    break;
                case 1:
                    mutableState = (MutableState) this.L$0;
                    ResultKt.throwOnFailure($result);
                    objCheckModUpdates = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState.setValue((Map) objCheckModUpdates);
            if (CatalogAccountPagesKt.CatalogPage$lambda$34(this.$updates$delegate).isEmpty()) {
                AppState.toast$default(this.$state, "都是最新的", "没有找到可更新的模组", null, 4, null);
            } else {
                this.$mode$delegate.setIntValue(1);
                this.$state.toast(I18nKt.tr("{0} 个模组可更新", Boxing.boxInt(CatalogAccountPagesKt.CatalogPage$lambda$34(this.$updates$delegate).size())), "", "info");
            }
            CatalogAccountPagesKt.CatalogPage$lambda$38(this.$checking$delegate, false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            CatalogAccountPagesKt.CatalogPage$lambda$38(this.$checking$delegate, false);
            throw th;
        }
    }
}
