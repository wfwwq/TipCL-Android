package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.AppState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AiPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$refreshModels$1", f = "AiPage.kt", i = {0, 0, 1, 1}, l = {101, 101}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240\\1", "$this$launch", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {101, 101}, s = {"L$0", "L$2", "L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$AiPage$refreshModels$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ MutableState<String> $model$delegate;
    final /* synthetic */ MutableState<List<String>> $models$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ boolean $toast;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiPageKt$AiPage$refreshModels$1(AiUiExtras aiUiExtras, AppState appState, boolean z, MutableState<String> mutableState, MutableState<List<String>> mutableState2, Continuation<? super AiPageKt$AiPage$refreshModels$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
        this.$state = appState;
        this.$toast = z;
        this.$model$delegate = mutableState;
        this.$models$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiPageKt$AiPage$refreshModels$1 aiPageKt$AiPage$refreshModels$1 = new AiPageKt$AiPage$refreshModels$1(this.$ai, this.$state, this.$toast, this.$model$delegate, this.$models$delegate, continuation);
        aiPageKt$AiPage$refreshModels$1.L$0 = obj;
        return aiPageKt$AiPage$refreshModels$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$AiPage$refreshModels$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt$AiPage$refreshModels$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
