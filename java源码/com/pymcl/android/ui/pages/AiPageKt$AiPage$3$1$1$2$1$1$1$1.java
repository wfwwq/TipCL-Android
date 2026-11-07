package com.pymcl.android.ui.pages;

import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.ChatSummary;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AiPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$3$1$1$2$1$1$1$1", f = "AiPage.kt", i = {}, l = {203, 203}, m = "invokeSuspend", n = {}, nl = {203, 204}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$AiPage$3$1$1$2$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ ChatSummary $ch;
    final /* synthetic */ AiSession $s;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiPageKt$AiPage$3$1$1$2$1$1$1$1(AiSession aiSession, AppState appState, AiUiExtras aiUiExtras, ChatSummary chatSummary, Continuation<? super AiPageKt$AiPage$3$1$1$2$1$1$1$1> continuation) {
        super(2, continuation);
        this.$s = aiSession;
        this.$state = appState;
        this.$ai = aiUiExtras;
        this.$ch = chatSummary;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiPageKt$AiPage$3$1$1$2$1$1$1$1(this.$s, this.$state, this.$ai, this.$ch, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$AiPage$3$1$1$2$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            switch(r1) {
                case 0: goto L1a;
                case 1: goto L15;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L73
        L15:
            kotlin.ResultKt.throwOnFailure(r10)
            r1 = r10
            goto L4f
        L1a:
            kotlin.ResultKt.throwOnFailure(r10)
            com.pymcl.android.ui.pages.AiSession r1 = r9.$s
            boolean r1 = r1.getRunning()
            if (r1 == 0) goto L38
            com.pymcl.android.data.AiUiExtras r1 = r9.$ai
            com.pymcl.android.ui.pages.AiSession r2 = r9.$s
            com.pymcl.android.ui.pages.AiPageKt.access$AiPage$stop(r1, r2)
            com.pymcl.android.ui.state.AppState r3 = r9.$state
            r7 = 2
            r8 = 0
            java.lang.String r4 = "切换对话时正在运行的那一轮已中断"
            r5 = 0
            java.lang.String r6 = "info"
            com.pymcl.android.ui.state.AppState.toast$default(r3, r4, r5, r6, r7, r8)
        L38:
            com.pymcl.android.data.AiUiExtras r1 = r9.$ai
            if (r1 == 0) goto L51
            com.pymcl.android.ui.state.ChatSummary r2 = r9.$ch
            java.lang.String r2 = r2.getId()
            r3 = r9
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 1
            r9.label = r4
            java.lang.Object r1 = r1.setActive(r2, r3)
            if (r1 != r0) goto L4f
            return r0
        L4f:
            kotlin.Unit r1 = (kotlin.Unit) r1
        L51:
            com.pymcl.android.ui.pages.AiSession r1 = r9.$s
            com.pymcl.android.ui.state.ChatSummary r2 = r9.$ch
            java.lang.String r2 = r2.getId()
            r1.setActiveChat(r2)
            com.pymcl.android.data.AiUiExtras r1 = r9.$ai
            com.pymcl.android.ui.pages.AiSession r2 = r9.$s
            com.pymcl.android.ui.state.ChatSummary r3 = r9.$ch
            java.lang.String r3 = r3.getId()
            r4 = r9
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 2
            r9.label = r5
            java.lang.Object r1 = com.pymcl.android.ui.pages.AiPageKt.access$AiPage$loadHistory(r1, r2, r3, r4)
            if (r1 != r0) goto L73
            return r0
        L73:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt$AiPage$3$1$1$2$1$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
