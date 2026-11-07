package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableIntState;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.AppState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AiPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$setPerm$1", f = "AiPage.kt", i = {0, 0, 1, 1}, l = {119, 119}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240\\1", "$this$launch", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {119, 119}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$AiPage$setPerm$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ int $i;
    final /* synthetic */ MutableIntState $perm$delegate;
    final /* synthetic */ AppState $state;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiPageKt$AiPage$setPerm$1(int i, AiUiExtras aiUiExtras, MutableIntState mutableIntState, AppState appState, Continuation<? super AiPageKt$AiPage$setPerm$1> continuation) {
        super(2, continuation);
        this.$i = i;
        this.$ai = aiUiExtras;
        this.$perm$delegate = mutableIntState;
        this.$state = appState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiPageKt$AiPage$setPerm$1 aiPageKt$AiPage$setPerm$1 = new AiPageKt$AiPage$setPerm$1(this.$i, this.$ai, this.$perm$delegate, this.$state, continuation);
        aiPageKt$AiPage$setPerm$1.L$0 = obj;
        return aiPageKt$AiPage$setPerm$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$AiPage$setPerm$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt$AiPage$setPerm$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
