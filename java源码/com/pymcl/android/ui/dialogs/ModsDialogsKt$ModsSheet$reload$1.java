package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.InstalledEntry;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModsDialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$reload$1", f = "ModsDialogs.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2}, l = {92, 93, 96}, m = "invokeSuspend", n = {"$this$launch", SettingsProtocol.EXTRA_VALUE, "$this$launch", SettingsProtocol.EXTRA_VALUE, "r", "$this$launch", SettingsProtocol.EXTRA_VALUE, "r", "inj", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {93, 94, 96}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$ModsSheet$reload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Set<String>> $injected$delegate;
    final /* synthetic */ String $inst;
    final /* synthetic */ MutableState<List<InstalledEntry>> $rows$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<String> $ver$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$ModsSheet$reload$1(AppState appState, String str, MutableState<String> mutableState, MutableState<List<InstalledEntry>> mutableState2, MutableState<Set<String>> mutableState3, Continuation<? super ModsDialogsKt$ModsSheet$reload$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$inst = str;
        this.$ver$delegate = mutableState;
        this.$rows$delegate = mutableState2;
        this.$injected$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModsDialogsKt$ModsSheet$reload$1 modsDialogsKt$ModsSheet$reload$1 = new ModsDialogsKt$ModsSheet$reload$1(this.$state, this.$inst, this.$ver$delegate, this.$rows$delegate, this.$injected$delegate, continuation);
        modsDialogsKt$ModsSheet$reload$1.L$0 = obj;
        return modsDialogsKt$ModsSheet$reload$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModsDialogsKt$ModsSheet$reload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$reload$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
