package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AccountRow;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.LauncherUiApiKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$AccountPage$3$3$1$1$1", f = "CatalogAccountPages.kt", i = {}, l = {274}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class CatalogAccountPagesKt$AccountPage$3$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountRow $a;
    final /* synthetic */ MutableState<String> $skinPath$delegate;
    final /* synthetic */ AppState $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogAccountPagesKt$AccountPage$3$3$1$1$1(AccountRow accountRow, AppState appState, MutableState<String> mutableState, Continuation<? super CatalogAccountPagesKt$AccountPage$3$3$1$1$1> continuation) {
        super(2, continuation);
        this.$a = accountRow;
        this.$state = appState;
        this.$skinPath$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CatalogAccountPagesKt$AccountPage$3$3$1$1$1(this.$a, this.$state, this.$skinPath$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogAccountPagesKt$AccountPage$3$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objAccountSkinFile;
        MutableState<String> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (Intrinsics.areEqual(this.$a.getType(), "offline")) {
                    MutableState<String> mutableState2 = this.$skinPath$delegate;
                    this.L$0 = mutableState2;
                    this.label = 1;
                    objAccountSkinFile = LauncherUiApiKt.getExt(this.$state.getApi()).accountSkinFile(this.$a.getName(), this);
                    if (objAccountSkinFile == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    mutableState.setValue((String) objAccountSkinFile);
                }
                return Unit.INSTANCE;
            case 1:
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure($result);
                objAccountSkinFile = $result;
                mutableState.setValue((String) objAccountSkinFile);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
