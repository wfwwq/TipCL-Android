package com.pymcl.android.ui.pages;

import android.content.Context;
import com.pymcl.android.data.LaunchConfigIO;
import com.pymcl.android.data.LaunchConfigLogic;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.LaunchPageKt$ConfigCard$2$1$ok$1", f = "LaunchPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class LaunchPageKt$ConfigCard$2$1$ok$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ LaunchConfigLogic.Display $d;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LaunchPageKt$ConfigCard$2$1$ok$1(Context context, AppState appState, LaunchConfigLogic.Display display, Continuation<? super LaunchPageKt$ConfigCard$2$1$ok$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$state = appState;
        this.$d = display;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LaunchPageKt$ConfigCard$2$1$ok$1 launchPageKt$ConfigCard$2$1$ok$1 = new LaunchPageKt$ConfigCard$2$1$ok$1(this.$ctx, this.$state, this.$d, continuation);
        launchPageKt$ConfigCard$2$1$ok$1.L$0 = obj;
        return launchPageKt$ConfigCard$2$1$ok$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((LaunchPageKt$ConfigCard$2$1$ok$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                LaunchConfigLogic.Display display = this.$d;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    LaunchConfigIO launchConfigIO = LaunchConfigIO.INSTANCE;
                    Intrinsics.checkNotNull(context);
                    launchConfigIO.saveDisplay(context, appState.getSelectedInstance(), appState.getSelectedVersion(), display);
                    objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                return Result.m8115boximpl(objM8116constructorimpl);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
