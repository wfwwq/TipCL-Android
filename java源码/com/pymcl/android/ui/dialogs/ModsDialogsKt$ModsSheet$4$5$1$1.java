package com.pymcl.android.ui.dialogs;

import android.content.Context;
import androidx.compose.runtime.MutableState;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModsDialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$4$5$1$1", f = "ModsDialogs.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$ModsSheet$4$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ String $inst;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<String> $ver$delegate;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$ModsSheet$4$5$1$1(Context context, AppState appState, String str, MutableState<String> mutableState, Continuation<? super ModsDialogsKt$ModsSheet$4$5$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$state = appState;
        this.$inst = str;
        this.$ver$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModsDialogsKt$ModsSheet$4$5$1$1(this.$ctx, this.$state, this.$inst, this.$ver$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModsDialogsKt$ModsSheet$4$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Context context;
        Object objContentDirPath;
        AppState appState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                context = this.$ctx;
                AppState appState2 = this.$state;
                this.L$0 = context;
                this.L$1 = appState2;
                this.label = 1;
                objContentDirPath = LauncherUiApiKt.getExt8(this.$state.getApi()).contentDirPath("mod", this.$inst, ModsDialogsKt.ModsSheet$lambda$4(this.$ver$delegate), this);
                if (objContentDirPath != coroutine_suspended) {
                    appState = appState2;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                appState = (AppState) this.L$1;
                context = (Context) this.L$0;
                ResultKt.throwOnFailure($result);
                objContentDirPath = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ModsDialogsKt.openDirectory(context, appState, (String) objContentDirPath);
        return Unit.INSTANCE;
    }
}
