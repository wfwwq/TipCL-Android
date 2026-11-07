package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.AiItem;
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
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$1$1", f = "AiPage.kt", i = {0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, l = {89, 91, 93, 93, 93, 97}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$LaunchedEffect", "$this$invokeSuspend_u24lambda_u240\\1", "$this$LaunchedEffect", "st", "$this$LaunchedEffect", "st", "$this$LaunchedEffect", "st", "$this$LaunchedEffect", "$this$invokeSuspend_u24lambda_u243\\10"}, nl = {90, 91, 93, 93, 95, 97}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$AiPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ MutableState<List<ChatSummary>> $chats$delegate;
    final /* synthetic */ List<AiItem> $initial;
    final /* synthetic */ MutableState<String> $model$delegate;
    final /* synthetic */ MutableState<List<String>> $models$delegate;
    final /* synthetic */ MutableIntState $perm$delegate;
    final /* synthetic */ AiSession $s;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AiPageKt$AiPage$1$1(List<? extends AiItem> list, AiSession aiSession, AiUiExtras aiUiExtras, AppState appState, MutableState<List<ChatSummary>> mutableState, MutableState<String> mutableState2, MutableIntState mutableIntState, MutableState<List<String>> mutableState3, Continuation<? super AiPageKt$AiPage$1$1> continuation) {
        super(2, continuation);
        this.$initial = list;
        this.$s = aiSession;
        this.$ai = aiUiExtras;
        this.$state = appState;
        this.$chats$delegate = mutableState;
        this.$model$delegate = mutableState2;
        this.$perm$delegate = mutableIntState;
        this.$models$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiPageKt$AiPage$1$1 aiPageKt$AiPage$1$1 = new AiPageKt$AiPage$1$1(this.$initial, this.$s, this.$ai, this.$state, this.$chats$delegate, this.$model$delegate, this.$perm$delegate, this.$models$delegate, continuation);
        aiPageKt$AiPage$1$1.L$0 = obj;
        return aiPageKt$AiPage$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$AiPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt$AiPage$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
