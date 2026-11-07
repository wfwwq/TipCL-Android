package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.ConflictRow;
import com.pymcl.android.ui.state.LauncherUiApiKt;
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

/* compiled from: ModsDialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$5$1$5$1$1", f = "ModsDialogs.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, nl = {307}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$ModsSheet$5$1$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $busy$delegate;
    final /* synthetic */ MutableState<List<ConflictRow>> $conflicts$delegate;
    final /* synthetic */ String $inst;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<String> $ver$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$ModsSheet$5$1$5$1$1(AppState appState, String str, MutableState<String> mutableState, MutableState<List<ConflictRow>> mutableState2, MutableState<String> mutableState3, Continuation<? super ModsDialogsKt$ModsSheet$5$1$5$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$inst = str;
        this.$ver$delegate = mutableState;
        this.$conflicts$delegate = mutableState2;
        this.$busy$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModsDialogsKt$ModsSheet$5$1$5$1$1(this.$state, this.$inst, this.$ver$delegate, this.$conflicts$delegate, this.$busy$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModsDialogsKt$ModsSheet$5$1$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objModConflicts;
        MutableState<List<ConflictRow>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        MutableState<List<ConflictRow>> mutableState2 = this.$conflicts$delegate;
                        this.L$0 = mutableState2;
                        this.label = 1;
                        objModConflicts = LauncherUiApiKt.getExt8(this.$state.getApi()).modConflicts(this.$inst, ModsDialogsKt.ModsSheet$lambda$4(this.$ver$delegate), this);
                        if (objModConflicts == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableState = mutableState2;
                        break;
                    case 1:
                        mutableState = (MutableState) this.L$0;
                        ResultKt.throwOnFailure($result);
                        objModConflicts = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AppState appState = this.$state;
                if (((List) objModConflicts).isEmpty()) {
                    AppState.toast$default(appState, "没有发现冲突", "重复、缺前置、版本区间、不兼容声明都检查过了", null, 4, null);
                }
                mutableState.setValue((List) objModConflicts);
            } catch (Exception e) {
                AppState appState2 = this.$state;
                String message = e.getMessage();
                if (message == null) {
                    message = e.toString();
                }
                appState2.toast("检查失败", message, "error");
            }
            this.$busy$delegate.setValue(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.$busy$delegate.setValue(null);
            throw th;
        }
    }
}
