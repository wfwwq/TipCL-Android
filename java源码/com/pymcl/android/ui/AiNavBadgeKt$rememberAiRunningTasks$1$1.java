package com.pymcl.android.ui;

import androidx.compose.runtime.MutableIntState;
import com.pymcl.ai.BgTaskInfo;
import com.pymcl.android.data.AiTaskCenter;
import com.pymcl.android.data.AiUiExtras;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AiNavBadge.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.AiNavBadgeKt$rememberAiRunningTasks$1$1", f = "AiNavBadge.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {32, 34, 36, 37}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "ids", "$this$LaunchedEffect", "ids", "events", "$this$LaunchedEffect", "ids", "events", "$this$LaunchedEffect", "ids", "events"}, nl = {33, 35, 43, -1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes20.dex */
final class AiNavBadgeKt$rememberAiRunningTasks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ MutableIntState $count$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiNavBadgeKt$rememberAiRunningTasks$1$1(AiUiExtras aiUiExtras, MutableIntState mutableIntState, Continuation<? super AiNavBadgeKt$rememberAiRunningTasks$1$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
        this.$count$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiNavBadgeKt$rememberAiRunningTasks$1$1 aiNavBadgeKt$rememberAiRunningTasks$1$1 = new AiNavBadgeKt$rememberAiRunningTasks$1$1(this.$ai, this.$count$delegate, continuation);
        aiNavBadgeKt$rememberAiRunningTasks$1$1.L$0 = obj;
        return aiNavBadgeKt$rememberAiRunningTasks$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiNavBadgeKt$rememberAiRunningTasks$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0120 -> B:23:0x00ba). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.AiNavBadgeKt$rememberAiRunningTasks$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$snapshot(AiUiExtras ai, Continuation<? super List<BgTaskInfo>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AiNavBadgeKt$rememberAiRunningTasks$1$1$snapshot$2(ai, null), continuation);
    }

    /* compiled from: AiNavBadge.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.AiNavBadgeKt$rememberAiRunningTasks$1$1$1", f = "AiNavBadge.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.AiNavBadgeKt$rememberAiRunningTasks$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableIntState $count$delegate;
        final /* synthetic */ Flow<BgTaskInfo> $events;
        final /* synthetic */ Ref.ObjectRef<Set<String>> $ids;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Flow<BgTaskInfo> flow, Ref.ObjectRef<Set<String>> objectRef, MutableIntState mutableIntState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$events = flow;
            this.$ids = objectRef;
            this.$count$delegate = mutableIntState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$events, this.$ids, this.$count$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Flow<BgTaskInfo> flow = this.$events;
                    final Ref.ObjectRef<Set<String>> objectRef = this.$ids;
                    final MutableIntState mutableIntState = this.$count$delegate;
                    this.label = 1;
                    if (flow.collect(new FlowCollector() { // from class: com.pymcl.android.ui.AiNavBadgeKt.rememberAiRunningTasks.1.1.1.1
                        public final Object emit(BgTaskInfo bgTaskInfo, Continuation<? super Unit> continuation) {
                            objectRef.element = (T) AiTaskCenter.INSTANCE.applyRunning(objectRef.element, bgTaskInfo);
                            mutableIntState.setIntValue(objectRef.element.size());
                            return Unit.INSTANCE;
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
}
