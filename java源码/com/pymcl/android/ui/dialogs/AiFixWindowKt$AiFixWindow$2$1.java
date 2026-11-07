package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.pymcl.ai.BgTaskInfo;
import com.pymcl.android.data.AiItemReducer;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.AiItem;
import com.pymcl.android.ui.state.AppState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AiFixWindow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$2$1", f = "AiFixWindow.kt", i = {0, 0}, l = {94}, m = "invokeSuspend", n = {"x", "id"}, nl = {99}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes18.dex */
final class AiFixWindowKt$AiFixWindow$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ MutableState<String> $chatId$delegate;
    final /* synthetic */ SnapshotStateList<AiItem> $items;
    final /* synthetic */ MutableState<Boolean> $running$delegate;
    final /* synthetic */ AppState $state;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiFixWindowKt$AiFixWindow$2$1(AiUiExtras aiUiExtras, MutableState<String> mutableState, SnapshotStateList<AiItem> snapshotStateList, MutableState<Boolean> mutableState2, AppState appState, Continuation<? super AiFixWindowKt$AiFixWindow$2$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
        this.$chatId$delegate = mutableState;
        this.$items = snapshotStateList;
        this.$running$delegate = mutableState2;
        this.$state = appState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiFixWindowKt$AiFixWindow$2$1(this.$ai, this.$chatId$delegate, this.$items, this.$running$delegate, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiFixWindowKt$AiFixWindow$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        final String id;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final AiUiExtras x = this.$ai;
                if (x != null && (id = AiFixWindowKt.AiFixWindow$lambda$9(this.$chatId$delegate)) != null) {
                    Flow<BgTaskInfo> backgroundEvents = x.getBackgroundEvents();
                    final SnapshotStateList<AiItem> snapshotStateList = this.$items;
                    final MutableState<Boolean> mutableState = this.$running$delegate;
                    final AiUiExtras aiUiExtras = this.$ai;
                    final AppState appState = this.$state;
                    final MutableState<String> mutableState2 = this.$chatId$delegate;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(x);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(id);
                    this.label = 1;
                    if (backgroundEvents.collect(new FlowCollector() { // from class: com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$2$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((BgTaskInfo) value, (Continuation<? super Unit>) $completion);
                        }

                        public final Object emit(BgTaskInfo t, Continuation<? super Unit> continuation) {
                            Flow flowReport;
                            if (!Intrinsics.areEqual(t.getChatId(), id)) {
                                return Unit.INSTANCE;
                            }
                            AiFixWindowKt.AiFixWindow$upsert(snapshotStateList, AiItemReducer.INSTANCE.bgItem(t));
                            if (!t.getRunning() && !AiFixWindowKt.AiFixWindow$lambda$3(mutableState) && (flowReport = x.report(id)) != null) {
                                AiFixWindowKt.AiFixWindow$runFix(aiUiExtras, appState, mutableState, snapshotStateList, mutableState2, flowReport);
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
