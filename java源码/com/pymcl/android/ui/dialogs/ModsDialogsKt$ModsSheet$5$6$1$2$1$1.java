package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.InstalledEntry;
import java.util.List;
import java.util.Set;
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
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$5$6$1$2$1$1", f = "ModsDialogs.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$ModsSheet$5$6$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Set<String>> $injected$delegate;
    final /* synthetic */ String $inst;
    final /* synthetic */ InstalledEntry $m;
    final /* synthetic */ boolean $on;
    final /* synthetic */ MutableState<List<InstalledEntry>> $rows$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<String> $ver$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$ModsSheet$5$6$1$2$1$1(AppState appState, String str, InstalledEntry installedEntry, boolean z, MutableState<String> mutableState, MutableState<List<InstalledEntry>> mutableState2, MutableState<Set<String>> mutableState3, Continuation<? super ModsDialogsKt$ModsSheet$5$6$1$2$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$inst = str;
        this.$m = installedEntry;
        this.$on = z;
        this.$ver$delegate = mutableState;
        this.$rows$delegate = mutableState2;
        this.$injected$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModsDialogsKt$ModsSheet$5$6$1$2$1$1(this.$state, this.$inst, this.$m, this.$on, this.$ver$delegate, this.$rows$delegate, this.$injected$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModsDialogsKt$ModsSheet$5$6$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (this.$state.getApi().setInstalledEnabled("mod", this.$inst, ModsDialogsKt.ModsSheet$lambda$4(this.$ver$delegate), this.$m.getFilename(), this.$on, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AppState.toast$default(this.$state, this.$on ? "已启用" : "已禁用", null, null, 6, null);
        ModsDialogsKt.ModsSheet$reload(this.$state, this.$inst, this.$ver$delegate, this.$rows$delegate, this.$injected$delegate);
        return Unit.INSTANCE;
    }
}
