package com.pymcl.android.data;

import com.pymcl.core.download.DownloadProgress;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.lang3.StringUtils;

/* compiled from: RepositoryUiApi.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$withProgress$2$job$1", f = "RepositoryUiApi.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes21.dex */
final class RepositoryUiApi$withProgress$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Float, String, Unit> $onProgress;
    int label;
    final /* synthetic */ RepositoryUiApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RepositoryUiApi$withProgress$2$job$1(RepositoryUiApi repositoryUiApi, Function2<? super Float, ? super String, Unit> function2, Continuation<? super RepositoryUiApi$withProgress$2$job$1> continuation) {
        super(2, continuation);
        this.this$0 = repositoryUiApi;
        this.$onProgress = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RepositoryUiApi$withProgress$2$job$1(this.this$0, this.$onProgress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RepositoryUiApi$withProgress$2$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                StateFlow<DownloadProgress> downloadProgress = this.this$0.repo.getDownloadProgress();
                final Function2<Float, String, Unit> function2 = this.$onProgress;
                this.label = 1;
                if (downloadProgress.collect(new FlowCollector() { // from class: com.pymcl.android.data.RepositoryUiApi$withProgress$2$job$1.1
                    public final Object emit(DownloadProgress p, Continuation<? super Unit> continuation) {
                        if (p.getTotalFiles() > 0 && !p.getFinished()) {
                            function2.invoke(Boxing.boxFloat(p.getFraction()), p.getTaskName() + StringUtils.SPACE + p.getDoneFiles() + "/" + p.getTotalFiles());
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                        return emit((DownloadProgress) value, (Continuation<? super Unit>) $completion);
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
        throw new KotlinNothingValueException();
    }
}
