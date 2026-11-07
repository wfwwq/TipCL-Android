package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.InstalledEntry;
import com.pymcl.android.ui.state.LauncherUiApiExt8;
import com.pymcl.android.ui.state.LauncherUiApiKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModsDialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$GlobalModsSheet$3$2$1$3$1$1$1", f = "ModsDialogs.kt", i = {0, 0}, l = {242}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {242}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$GlobalModsSheet$3$2$1$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $dir$delegate;
    final /* synthetic */ InstalledEntry $m;
    final /* synthetic */ MutableState<List<InstalledEntry>> $rows$delegate;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$GlobalModsSheet$3$2$1$3$1$1$1(AppState appState, InstalledEntry installedEntry, MutableState<List<InstalledEntry>> mutableState, MutableState<String> mutableState2, Continuation<? super ModsDialogsKt$GlobalModsSheet$3$2$1$3$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$m = installedEntry;
        this.$rows$delegate = mutableState;
        this.$dir$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModsDialogsKt$GlobalModsSheet$3$2$1$3$1$1$1 modsDialogsKt$GlobalModsSheet$3$2$1$3$1$1$1 = new ModsDialogsKt$GlobalModsSheet$3$2$1$3$1$1$1(this.$state, this.$m, this.$rows$delegate, this.$dir$delegate, continuation);
        modsDialogsKt$GlobalModsSheet$3$2$1$3$1$1$1.L$0 = obj;
        return modsDialogsKt$GlobalModsSheet$3$2$1$3$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModsDialogsKt$GlobalModsSheet$3$2$1$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        CoroutineScope $this$launch = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    AppState appState = this.$state;
                    InstalledEntry installedEntry = this.$m;
                    Result.Companion companion = Result.INSTANCE;
                    LauncherUiApiExt8 ext8 = LauncherUiApiKt.getExt8(appState.getApi());
                    String filename = installedEntry.getFilename();
                    this.L$0 = SpillingKt.nullOutSpilledVariable($this$launch);
                    this.L$1 = SpillingKt.nullOutSpilledVariable($this$launch);
                    this.label = 1;
                    if (ext8.deleteGlobalMod(filename, this) != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        AppState appState2 = this.$state;
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            appState2.toast("删除失败", message, "error");
        }
        ModsDialogsKt.GlobalModsSheet$reload(this.$state, this.$rows$delegate, this.$dir$delegate);
        return Unit.INSTANCE;
    }
}
