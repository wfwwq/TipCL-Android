package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.ai.BgTaskInfo;
import com.pymcl.android.data.AiTaskCenter;
import com.pymcl.android.data.AiUiExtras;
import java.util.List;
import java.util.Map;
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

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$AiBackgroundTasksSection$1$1", f = "MiscPages.kt", i = {}, l = {388}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$AiBackgroundTasksSection$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ MutableState<List<BgTaskInfo>> $tasks$delegate;
    final /* synthetic */ MutableState<Map<String, String>> $titles$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$AiBackgroundTasksSection$1$1(AiUiExtras aiUiExtras, MutableState<List<BgTaskInfo>> mutableState, MutableState<Map<String, String>> mutableState2, Continuation<? super MiscPagesKt$AiBackgroundTasksSection$1$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
        this.$tasks$delegate = mutableState;
        this.$titles$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiscPagesKt$AiBackgroundTasksSection$1$1(this.$ai, this.$tasks$delegate, this.$titles$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$AiBackgroundTasksSection$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Flow<BgTaskInfo> backgroundEvents = this.$ai.getBackgroundEvents();
                final MutableState<List<BgTaskInfo>> mutableState = this.$tasks$delegate;
                final MutableState<Map<String, String>> mutableState2 = this.$titles$delegate;
                final AiUiExtras aiUiExtras = this.$ai;
                this.label = 1;
                if (backgroundEvents.collect(new FlowCollector() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$AiBackgroundTasksSection$1$1.1
                    public final Object emit(BgTaskInfo e, Continuation<? super Unit> continuation) {
                        mutableState.setValue(AiTaskCenter.INSTANCE.merge(MiscPagesKt.AiBackgroundTasksSection$lambda$3(mutableState), e));
                        return AiTaskCenter.INSTANCE.needsChatRefresh(MiscPagesKt.AiBackgroundTasksSection$lambda$3(mutableState), MiscPagesKt.AiBackgroundTasksSection$lambda$6(mutableState2)) ? MiscPagesKt.AiBackgroundTasksSection$refreshTitles(aiUiExtras, mutableState2, continuation) : Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                        return emit((BgTaskInfo) value, (Continuation<? super Unit>) $completion);
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
