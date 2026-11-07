package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.pymcl.ai.AiEvent;
import com.pymcl.android.data.AiItemReducer;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.pages.AiSession;
import com.pymcl.android.ui.state.AiItem;
import com.pymcl.android.ui.state.AppState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AiFixWindow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$runFix$1", f = "AiFixWindow.kt", i = {0}, l = {60}, m = "invokeSuspend", n = {"r"}, nl = {62}, s = {"L$0"}, v = 2)
/* loaded from: classes18.dex */
final class AiFixWindowKt$AiFixWindow$runFix$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ MutableState<String> $chatId$delegate;
    final /* synthetic */ Flow<AiEvent> $f;
    final /* synthetic */ SnapshotStateList<AiItem> $items;
    final /* synthetic */ MutableState<Boolean> $running$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ AiUiExtras $x;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AiFixWindowKt$AiFixWindow$runFix$1(Flow<? extends AiEvent> flow, AiUiExtras aiUiExtras, SnapshotStateList<AiItem> snapshotStateList, MutableState<Boolean> mutableState, MutableState<String> mutableState2, AiUiExtras aiUiExtras2, AppState appState, Continuation<? super AiFixWindowKt$AiFixWindow$runFix$1> continuation) {
        super(2, continuation);
        this.$f = flow;
        this.$x = aiUiExtras;
        this.$items = snapshotStateList;
        this.$running$delegate = mutableState;
        this.$chatId$delegate = mutableState2;
        this.$ai = aiUiExtras2;
        this.$state = appState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiFixWindowKt$AiFixWindow$runFix$1(this.$f, this.$x, this.$items, this.$running$delegate, this.$chatId$delegate, this.$ai, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiFixWindowKt$AiFixWindow$runFix$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Flow flowReport;
        AiUiExtras aiUiExtras;
        String strAiFixWindow$lambda$9;
        Flow flowReport2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    final AiItemReducer r = new AiItemReducer();
                    Flow<AiEvent> flow = this.$f;
                    final SnapshotStateList<AiItem> snapshotStateList = this.$items;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(r);
                    this.label = 1;
                    if (flow.collect(new FlowCollector() { // from class: com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$runFix$1.1
                        public final Object emit(AiEvent e, Continuation<? super Unit> continuation) {
                            if (e instanceof AiEvent.Ask) {
                                AiSession.INSTANCE.getAsks().put("ask-" + ((AiEvent.Ask) e).getCallId(), e);
                            }
                            Iterable iterableReduce = r.reduce(e);
                            SnapshotStateList<AiItem> snapshotStateList2 = snapshotStateList;
                            Iterator<T> it = iterableReduce.iterator();
                            while (it.hasNext()) {
                                AiFixWindowKt.AiFixWindow$upsert(snapshotStateList2, (AiItem) it.next());
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((AiEvent) value, (Continuation<? super Unit>) $completion);
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (aiUiExtras.needsReport(strAiFixWindow$lambda$9) && (flowReport2 = this.$x.report(AiFixWindowKt.AiFixWindow$lambda$9(this.$chatId$delegate))) != null) {
                AiFixWindowKt.AiFixWindow$runFix(this.$ai, this.$state, this.$running$delegate, this.$items, this.$chatId$delegate, flowReport2);
            }
            return Unit.INSTANCE;
        } finally {
            AiFixWindowKt.AiFixWindow$lambda$4(this.$running$delegate, false);
            if (this.$x.needsReport(AiFixWindowKt.AiFixWindow$lambda$9(this.$chatId$delegate)) && (flowReport = this.$x.report(AiFixWindowKt.AiFixWindow$lambda$9(this.$chatId$delegate))) != null) {
                AiFixWindowKt.AiFixWindow$runFix(this.$ai, this.$state, this.$running$delegate, this.$items, this.$chatId$delegate, flowReport);
            }
        }
    }
}
