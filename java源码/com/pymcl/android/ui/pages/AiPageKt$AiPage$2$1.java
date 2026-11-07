package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.ai.BgTaskInfo;
import com.pymcl.android.data.AiItemReducer;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.ChatSummary;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AiPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$2$1", f = "AiPage.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, nl = {163}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$AiPage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ MutableState<List<ChatSummary>> $chats$delegate;
    final /* synthetic */ AiSession $s;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiPageKt$AiPage$2$1(AiUiExtras aiUiExtras, AiSession aiSession, AppState appState, MutableState<List<ChatSummary>> mutableState, Continuation<? super AiPageKt$AiPage$2$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
        this.$s = aiSession;
        this.$state = appState;
        this.$chats$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiPageKt$AiPage$2$1(this.$ai, this.$s, this.$state, this.$chats$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$AiPage$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Flow flowReport;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$ai == null) {
                    return Unit.INSTANCE;
                }
                if (!this.$s.getRunning() && this.$ai.needsReport(this.$s.getActiveChat()) && (flowReport = this.$ai.report(this.$s.getActiveChat())) != null) {
                    AiPageKt.AiPage$runFlow(this.$ai, this.$s, this.$state, this.$chats$delegate, flowReport);
                }
                Flow<BgTaskInfo> backgroundEvents = this.$ai.getBackgroundEvents();
                final AiSession aiSession = this.$s;
                final AiUiExtras aiUiExtras = this.$ai;
                final AppState appState = this.$state;
                final MutableState<List<ChatSummary>> mutableState = this.$chats$delegate;
                this.label = 1;
                if (backgroundEvents.collect(new FlowCollector() { // from class: com.pymcl.android.ui.pages.AiPageKt$AiPage$2$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                        return emit((BgTaskInfo) value, (Continuation<? super Unit>) $completion);
                    }

                    public final Object emit(BgTaskInfo t, Continuation<? super Unit> continuation) {
                        Flow flowReport2;
                        if (!Intrinsics.areEqual(t.getChatId(), aiSession.getActiveChat())) {
                            return Unit.INSTANCE;
                        }
                        aiSession.upsert(AiItemReducer.INSTANCE.bgItem(t));
                        if (!t.getRunning() && !aiSession.getRunning() && (flowReport2 = aiUiExtras.report(t.getChatId())) != null) {
                            AiPageKt.AiPage$runFlow(aiUiExtras, aiSession, appState, mutableState, flowReport2);
                        }
                        return Unit.INSTANCE;
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
        return Unit.INSTANCE;
    }
}
