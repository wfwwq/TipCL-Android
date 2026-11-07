package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.InstalledVersion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$PickUpdatesSheet$1$1", f = "ModsDialogs.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$PickUpdatesSheet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DialogSpec.PickUpdates $d;
    final /* synthetic */ MutableState<Boolean> $ready$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<String> $ver$delegate;
    final /* synthetic */ MutableState<List<InstalledVersion>> $versions$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$PickUpdatesSheet$1$1(AppState appState, DialogSpec.PickUpdates pickUpdates, MutableState<List<InstalledVersion>> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super ModsDialogsKt$PickUpdatesSheet$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$d = pickUpdates;
        this.$versions$delegate = mutableState;
        this.$ver$delegate = mutableState2;
        this.$ready$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModsDialogsKt$PickUpdatesSheet$1$1(this.$state, this.$d, this.$versions$delegate, this.$ver$delegate, this.$ready$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModsDialogsKt$PickUpdatesSheet$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objResolveVersion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                objResolveVersion = ModsDialogsKt.resolveVersion(this.$state, this.$d.getInstance(), this.$d.getVersion(), this);
                if (objResolveVersion == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objResolveVersion = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Pair pair = (Pair) objResolveVersion;
        List vs = (List) pair.component1();
        String v = (String) pair.component2();
        this.$versions$delegate.setValue(vs);
        this.$ver$delegate.setValue(v);
        ModsDialogsKt.PickUpdatesSheet$lambda$8(this.$ready$delegate, true);
        return Unit.INSTANCE;
    }
}
