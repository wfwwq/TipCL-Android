package com.pymcl.android.ui;

import android.content.Context;
import com.pymcl.android.data.LauncherRepository;
import java.util.Map;
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

/* compiled from: PyMclApp.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.PyMclAppKt$MergeSettingsExtras$1$1$snap$1", f = "PyMclApp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes20.dex */
final class PyMclAppKt$MergeSettingsExtras$1$1$snap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, Object>>, Object> {
    final /* synthetic */ Context $ctx;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PyMclAppKt$MergeSettingsExtras$1$1$snap$1(Context context, Continuation<? super PyMclAppKt$MergeSettingsExtras$1$1$snap$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PyMclAppKt$MergeSettingsExtras$1$1$snap$1 pyMclAppKt$MergeSettingsExtras$1$1$snap$1 = new PyMclAppKt$MergeSettingsExtras$1$1$snap$1(this.$ctx, continuation);
        pyMclAppKt$MergeSettingsExtras$1$1$snap$1.L$0 = obj;
        return pyMclAppKt$MergeSettingsExtras$1$1$snap$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, Object>> continuation) {
        return ((PyMclAppKt$MergeSettingsExtras$1$1$snap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Context context = this.$ctx;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    LauncherRepository.Companion companion2 = LauncherRepository.INSTANCE;
                    Intrinsics.checkNotNull(context);
                    objM8116constructorimpl = Result.m8116constructorimpl(companion2.get(context).getConfig().snapshot());
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
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
