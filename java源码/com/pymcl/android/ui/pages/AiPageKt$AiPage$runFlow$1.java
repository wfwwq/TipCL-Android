package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.ai.AiEvent;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.ChatSummary;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AiPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$runFlow$1", f = "AiPage.kt", i = {0, 1, 2}, l = {129, 134, 134}, m = "invokeSuspend", n = {"r", "r", "r"}, nl = {134, 134, 136}, s = {"L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$AiPage$runFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ MutableState<List<ChatSummary>> $chats$delegate;
    final /* synthetic */ Flow<AiEvent> $f;
    final /* synthetic */ AiSession $s;
    final /* synthetic */ AppState $state;
    final /* synthetic */ AiUiExtras $x;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AiPageKt$AiPage$runFlow$1(Flow<? extends AiEvent> flow, AiSession aiSession, AiUiExtras aiUiExtras, AiUiExtras aiUiExtras2, AppState appState, MutableState<List<ChatSummary>> mutableState, Continuation<? super AiPageKt$AiPage$runFlow$1> continuation) {
        super(2, continuation);
        this.$f = flow;
        this.$s = aiSession;
        this.$x = aiUiExtras;
        this.$ai = aiUiExtras2;
        this.$state = appState;
        this.$chats$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiPageKt$AiPage$runFlow$1(this.$f, this.$s, this.$x, this.$ai, this.$state, this.$chats$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$AiPage$runFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[DONT_GENERATE] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt$AiPage$runFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
