package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.AiItem;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CrashInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AiFixWindow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$1$1", f = "AiFixWindow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class AiFixWindowKt$AiFixWindow$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ MutableState<String> $chatId$delegate;
    final /* synthetic */ CrashInfo $info;
    final /* synthetic */ SnapshotStateList<AiItem> $items;
    final /* synthetic */ MutableState<Boolean> $running$delegate;
    final /* synthetic */ MutableState<Boolean> $started$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ String $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiFixWindowKt$AiFixWindow$1$1(AiUiExtras aiUiExtras, MutableState<Boolean> mutableState, AppState appState, SnapshotStateList<AiItem> snapshotStateList, String str, CrashInfo crashInfo, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super AiFixWindowKt$AiFixWindow$1$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
        this.$started$delegate = mutableState;
        this.$state = appState;
        this.$items = snapshotStateList;
        this.$visible = str;
        this.$info = crashInfo;
        this.$chatId$delegate = mutableState2;
        this.$running$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiFixWindowKt$AiFixWindow$1$1(this.$ai, this.$started$delegate, this.$state, this.$items, this.$visible, this.$info, this.$chatId$delegate, this.$running$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiFixWindowKt$AiFixWindow$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$ai != null && !this.$ai.isRunning() && !AiFixWindowKt.AiFixWindow$lambda$6(this.$started$delegate)) {
                    AiFixWindowKt.AiFixWindow$start(this.$ai, this.$state, this.$started$delegate, this.$items, this.$visible, this.$info, this.$chatId$delegate, this.$running$delegate);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
