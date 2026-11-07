package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.LauncherUiApiKt;
import java.util.List;
import java.util.Map;
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

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.DialogsKt$ExportModpackSheet$1$1", f = "Dialogs.kt", i = {}, l = {381}, m = "invokeSuspend", n = {}, nl = {454}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class DialogsKt$ExportModpackSheet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DialogSpec.ExportModpack $d;
    final /* synthetic */ MutableState<List<Pair<String, Boolean>>> $items$delegate;
    final /* synthetic */ SnapshotStateMap<String, Boolean> $sel;
    final /* synthetic */ AppState $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogsKt$ExportModpackSheet$1$1(AppState appState, DialogSpec.ExportModpack exportModpack, SnapshotStateMap<String, Boolean> snapshotStateMap, MutableState<List<Pair<String, Boolean>>> mutableState, Continuation<? super DialogsKt$ExportModpackSheet$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$d = exportModpack;
        this.$sel = snapshotStateMap;
        this.$items$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DialogsKt$ExportModpackSheet$1$1(this.$state, this.$d, this.$sel, this.$items$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogsKt$ExportModpackSheet$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objModpackExportCandidates;
        MutableState<List<Pair<String, Boolean>>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                MutableState<List<Pair<String, Boolean>>> mutableState2 = this.$items$delegate;
                this.L$0 = mutableState2;
                this.label = 1;
                objModpackExportCandidates = LauncherUiApiKt.getExt(this.$state.getApi()).modpackExportCandidates(this.$d.getInstance(), this.$d.getVersion(), this);
                if (objModpackExportCandidates == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState = mutableState2;
                break;
            case 1:
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure($result);
                objModpackExportCandidates = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Map map = this.$sel;
        List<Pair> list = (List) objModpackExportCandidates;
        for (Pair pair : list) {
            map.put(pair.getFirst(), pair.getSecond());
        }
        mutableState.setValue(list);
        return Unit.INSTANCE;
    }
}
