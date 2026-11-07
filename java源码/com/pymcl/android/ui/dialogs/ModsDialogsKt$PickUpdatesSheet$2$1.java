package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.DialogSpec;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModsDialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$PickUpdatesSheet$2$1", f = "ModsDialogs.kt", i = {0, 1, 1, 1}, l = {267, 268}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$LaunchedEffect", "u", "$this$invokeSuspend_u24lambda_u241\\2"}, nl = {307, 308}, s = {"L$0", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$PickUpdatesSheet$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateMap<String, Boolean> $chosen;
    final /* synthetic */ DialogSpec.PickUpdates $d;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $ready$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<Map<String, String>> $titles$delegate;
    final /* synthetic */ MutableState<Map<String, String>> $updates$delegate;
    final /* synthetic */ MutableState<String> $ver$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$PickUpdatesSheet$2$1(SnapshotStateMap<String, Boolean> snapshotStateMap, AppState appState, DialogSpec.PickUpdates pickUpdates, MutableState<Boolean> mutableState, MutableState<Map<String, String>> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Map<String, String>> mutableState5, Continuation<? super ModsDialogsKt$PickUpdatesSheet$2$1> continuation) {
        super(2, continuation);
        this.$chosen = snapshotStateMap;
        this.$state = appState;
        this.$d = pickUpdates;
        this.$ready$delegate = mutableState;
        this.$updates$delegate = mutableState2;
        this.$error$delegate = mutableState3;
        this.$ver$delegate = mutableState4;
        this.$titles$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModsDialogsKt$PickUpdatesSheet$2$1 modsDialogsKt$PickUpdatesSheet$2$1 = new ModsDialogsKt$PickUpdatesSheet$2$1(this.$chosen, this.$state, this.$d, this.$ready$delegate, this.$updates$delegate, this.$error$delegate, this.$ver$delegate, this.$titles$delegate, continuation);
        modsDialogsKt$PickUpdatesSheet$2$1.L$0 = obj;
        return modsDialogsKt$PickUpdatesSheet$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModsDialogsKt$PickUpdatesSheet$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0160 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:7:0x0028, B:38:0x013a, B:39:0x015a, B:41:0x0160, B:34:0x010f), top: B:63:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7 A[Catch: Exception -> 0x003c, LOOP:1: B:52:0x01c1->B:54:0x01c7, LOOP_END, TRY_LEAVE, TryCatch #1 {Exception -> 0x003c, blocks: (B:47:0x0195, B:48:0x019f, B:51:0x01aa, B:52:0x01c1, B:54:0x01c7, B:11:0x0035, B:32:0x00d0, B:33:0x0106, B:27:0x007d, B:29:0x00b0), top: B:63:0x0010 }] */
    /* JADX WARN: Type inference failed for: r3v29, types: [androidx.compose.runtime.MutableState<java.util.Map<java.lang.String, java.lang.String>>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.runtime.MutableState] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.ModsDialogsKt$PickUpdatesSheet$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
