package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.ConflictRow;
import com.pymcl.android.ui.state.InstalledEntry;
import java.util.List;
import java.util.Map;
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
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$2$1", f = "ModsDialogs.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$ModsSheet$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateMap<String, Boolean> $chosen;
    final /* synthetic */ MutableState<List<ConflictRow>> $conflicts$delegate;
    final /* synthetic */ MutableState<Set<String>> $injected$delegate;
    final /* synthetic */ String $inst;
    final /* synthetic */ MutableState<Boolean> $ready$delegate;
    final /* synthetic */ MutableState<List<InstalledEntry>> $rows$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<Map<String, String>> $updates$delegate;
    final /* synthetic */ MutableState<String> $ver$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$ModsSheet$2$1(SnapshotStateMap<String, Boolean> snapshotStateMap, MutableState<Boolean> mutableState, MutableState<Map<String, String>> mutableState2, MutableState<List<ConflictRow>> mutableState3, AppState appState, String str, MutableState<String> mutableState4, MutableState<List<InstalledEntry>> mutableState5, MutableState<Set<String>> mutableState6, Continuation<? super ModsDialogsKt$ModsSheet$2$1> continuation) {
        super(2, continuation);
        this.$chosen = snapshotStateMap;
        this.$ready$delegate = mutableState;
        this.$updates$delegate = mutableState2;
        this.$conflicts$delegate = mutableState3;
        this.$state = appState;
        this.$inst = str;
        this.$ver$delegate = mutableState4;
        this.$rows$delegate = mutableState5;
        this.$injected$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModsDialogsKt$ModsSheet$2$1(this.$chosen, this.$ready$delegate, this.$updates$delegate, this.$conflicts$delegate, this.$state, this.$inst, this.$ver$delegate, this.$rows$delegate, this.$injected$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModsDialogsKt$ModsSheet$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (ModsDialogsKt.ModsSheet$lambda$7(this.$ready$delegate)) {
                    this.$updates$delegate.setValue(null);
                    this.$chosen.clear();
                    this.$conflicts$delegate.setValue(null);
                    ModsDialogsKt.ModsSheet$reload(this.$state, this.$inst, this.$ver$delegate, this.$rows$delegate, this.$injected$delegate);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
