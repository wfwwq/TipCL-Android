package com.pymcl.android.ui.pages;

import android.content.Context;
import com.pymcl.android.data.LaunchConfigIO;
import com.pymcl.android.ui.state.AppState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LaunchPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/android/data/LaunchConfigIO$State;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.LaunchPageKt$ConfigCard$1$1$st$1", f = "LaunchPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class LaunchPageKt$ConfigCard$1$1$st$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LaunchConfigIO.State>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LaunchPageKt$ConfigCard$1$1$st$1(Context context, AppState appState, Continuation<? super LaunchPageKt$ConfigCard$1$1$st$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$state = appState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LaunchPageKt$ConfigCard$1$1$st$1 launchPageKt$ConfigCard$1$1$st$1 = new LaunchPageKt$ConfigCard$1$1$st$1(this.$ctx, this.$state, continuation);
        launchPageKt$ConfigCard$1$1$st$1.L$0 = obj;
        return launchPageKt$ConfigCard$1$1$st$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LaunchConfigIO.State> continuation) {
        return ((LaunchPageKt$ConfigCard$1$1$st$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Context context = this.$ctx;
                AppState appState = this.$state;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    LaunchConfigIO launchConfigIO = LaunchConfigIO.INSTANCE;
                    Intrinsics.checkNotNull(context);
                    objM8116constructorimpl = Result.m8116constructorimpl(launchConfigIO.load(context, appState.getSelectedInstance(), appState.getSelectedVersion()));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                    return null;
                }
                return objM8116constructorimpl;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
