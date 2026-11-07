package com.pymcl.android.ui.dialogs;

import android.content.Context;
import com.pymcl.android.data.CrashReport;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CrashInfo;
import java.io.File;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.DialogsKt$CrashSheet$exportAndShare$1", f = "Dialogs.kt", i = {0}, l = {427}, m = "invokeSuspend", n = {"$this$launch"}, nl = {428}, s = {"L$0"}, v = 2)
/* loaded from: classes18.dex */
final class DialogsKt$CrashSheet$exportAndShare$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ CrashInfo $info;
    final /* synthetic */ String $prefix;
    final /* synthetic */ AppState $state;
    final /* synthetic */ String $title;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogsKt$CrashSheet$exportAndShare$1(AppState appState, Context context, CrashInfo crashInfo, String str, String str2, Continuation<? super DialogsKt$CrashSheet$exportAndShare$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$ctx = context;
        this.$info = crashInfo;
        this.$prefix = str;
        this.$title = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DialogsKt$CrashSheet$exportAndShare$1 dialogsKt$CrashSheet$exportAndShare$1 = new DialogsKt$CrashSheet$exportAndShare$1(this.$state, this.$ctx, this.$info, this.$prefix, this.$title, continuation);
        dialogsKt$CrashSheet$exportAndShare$1.L$0 = obj;
        return dialogsKt$CrashSheet$exportAndShare$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogsKt$CrashSheet$exportAndShare$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        CoroutineScope $this$launch = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.L$0 = $this$launch;
                this.label = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new DialogsKt$CrashSheet$exportAndShare$1$f$1(this.$ctx, this.$info, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objWithContext = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        File f = (File) objWithContext;
        AppState appState = this.$state;
        String absolutePath = f.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        AppState.toast$default(appState, "已导出", absolutePath, null, 4, null);
        Context context = this.$ctx;
        String str = this.$prefix;
        CrashInfo crashInfo = this.$info;
        String str2 = this.$title;
        try {
            Result.Companion companion = Result.INSTANCE;
            CrashReport.INSTANCE.share(context, f, str + CrashReport.INSTANCE.text(crashInfo), str2);
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
