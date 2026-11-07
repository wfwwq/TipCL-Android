package com.pymcl.android.ui.pages;

import com.pymcl.android.ui.state.AiItem;
import com.pymcl.android.ui.state.AppState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AiPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$send$1", f = "AiPage.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$AiPage$send$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiSession $s;
    final /* synthetic */ AppState $state;
    final /* synthetic */ String $text;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiPageKt$AiPage$send$1(AppState appState, String str, AiSession aiSession, Continuation<? super AiPageKt$AiPage$send$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$text = str;
        this.$s = aiSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiPageKt$AiPage$send$1(this.$state, this.$text, this.$s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$AiPage$send$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Flow<AiItem> flowAiSend = this.$state.getApi().aiSend(this.$text);
                    final AiSession aiSession = this.$s;
                    this.label = 1;
                    if (flowAiSend.collect(new FlowCollector() { // from class: com.pymcl.android.ui.pages.AiPageKt$AiPage$send$1.1
                        public final Object emit(AiItem it, Continuation<? super Unit> continuation) {
                            aiSession.upsert(it);
                            return Unit.INSTANCE;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((AiItem) value, (Continuation<? super Unit>) $completion);
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
            this.$s.setRunning(false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.$s.setRunning(false);
            throw th;
        }
    }
}
