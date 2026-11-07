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
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$rewind$1", f = "AiPage.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {173, 174, 174, 177}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u241\\3", "$this$launch", "r\\4", "$this$launch", "r\\4", "$this$launch", "r\\4"}, nl = {173, 174, 175, 178}, s = {"L$0", "L$1", "L$0", "L$6", "L$0", "L$6", "L$0", "L$2"}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$AiPage$rewind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ MutableState<List<ChatSummary>> $chats$delegate;
    final /* synthetic */ MutableState<String> $input$delegate;
    final /* synthetic */ AiSession $s;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiPageKt$AiPage$rewind$1(AiUiExtras aiUiExtras, AiSession aiSession, AppState appState, MutableState<String> mutableState, MutableState<List<ChatSummary>> mutableState2, Continuation<? super AiPageKt$AiPage$rewind$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
        this.$s = aiSession;
        this.$state = appState;
        this.$input$delegate = mutableState;
        this.$chats$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiPageKt$AiPage$rewind$1 aiPageKt$AiPage$rewind$1 = new AiPageKt$AiPage$rewind$1(this.$ai, this.$s, this.$state, this.$input$delegate, this.$chats$delegate, continuation);
        aiPageKt$AiPage$rewind$1.L$0 = obj;
        return aiPageKt$AiPage$rewind$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$AiPage$rewind$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt$AiPage$rewind$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
