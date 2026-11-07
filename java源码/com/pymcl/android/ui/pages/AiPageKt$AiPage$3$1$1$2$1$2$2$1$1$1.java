package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
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

/* compiled from: AiPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1", f = "AiPage.kt", i = {}, l = {212, 213, 213, 214}, m = "invokeSuspend", n = {}, nl = {213, 213, 214, 215}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ ChatSummary $ch;
    final /* synthetic */ MutableState<List<ChatSummary>> $chats$delegate;
    final /* synthetic */ AiSession $s;
    final /* synthetic */ AppState $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1(AiUiExtras aiUiExtras, ChatSummary chatSummary, AiSession aiSession, AppState appState, MutableState<List<ChatSummary>> mutableState, Continuation<? super AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
        this.$ch = chatSummary;
        this.$s = aiSession;
        this.$state = appState;
        this.$chats$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1(this.$ai, this.$ch, this.$s, this.$state, this.$chats$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 0
            switch(r1) {
                case 0: goto L2a;
                case 1: goto L25;
                case 2: goto L1c;
                case 3: goto L17;
                case 4: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L12:
            kotlin.ResultKt.throwOnFailure(r7)
            goto La1
        L17:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L8d
        L1c:
            java.lang.Object r1 = r6.L$0
            com.pymcl.android.ui.pages.AiSession r1 = (com.pymcl.android.ui.pages.AiSession) r1
            kotlin.ResultKt.throwOnFailure(r7)
            r3 = r7
            goto L6d
        L25:
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r7
            goto L44
        L2a:
            kotlin.ResultKt.throwOnFailure(r7)
            com.pymcl.android.data.AiUiExtras r1 = r6.$ai
            if (r1 == 0) goto L46
            com.pymcl.android.ui.state.ChatSummary r3 = r6.$ch
            java.lang.String r3 = r3.getId()
            r4 = r6
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 1
            r6.label = r5
            java.lang.Object r1 = r1.deleteChat(r3, r4)
            if (r1 != r0) goto L44
            return r0
        L44:
            kotlin.Unit r1 = (kotlin.Unit) r1
        L46:
            com.pymcl.android.ui.state.ChatSummary r1 = r6.$ch
            java.lang.String r1 = r1.getId()
            com.pymcl.android.ui.pages.AiSession r3 = r6.$s
            java.lang.String r3 = r3.getActiveChat()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L8e
            com.pymcl.android.ui.pages.AiSession r1 = r6.$s
            com.pymcl.android.data.AiUiExtras r3 = r6.$ai
            if (r3 == 0) goto L70
            r4 = r6
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r6.L$0 = r1
            r5 = 2
            r6.label = r5
            java.lang.Object r3 = r3.activeChat(r4)
            if (r3 != r0) goto L6d
            return r0
        L6d:
            java.lang.String r3 = (java.lang.String) r3
            goto L71
        L70:
            r3 = r2
        L71:
            r1.setActiveChat(r3)
            com.pymcl.android.data.AiUiExtras r1 = r6.$ai
            com.pymcl.android.ui.pages.AiSession r3 = r6.$s
            com.pymcl.android.ui.pages.AiSession r4 = r6.$s
            java.lang.String r4 = r4.getActiveChat()
            r5 = r6
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r6.L$0 = r2
            r2 = 3
            r6.label = r2
            java.lang.Object r1 = com.pymcl.android.ui.pages.AiPageKt.access$AiPage$loadHistory(r1, r3, r4, r5)
            if (r1 != r0) goto L8d
            return r0
        L8d:
        L8e:
            com.pymcl.android.data.AiUiExtras r1 = r6.$ai
            com.pymcl.android.ui.state.AppState r2 = r6.$state
            androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.ChatSummary>> r3 = r6.$chats$delegate
            r4 = r6
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 4
            r6.label = r5
            java.lang.Object r1 = com.pymcl.android.ui.pages.AiPageKt.access$AiPage$reloadChats(r1, r2, r3, r4)
            if (r1 != r0) goto La1
            return r0
        La1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt$AiPage$3$1$1$2$1$2$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
