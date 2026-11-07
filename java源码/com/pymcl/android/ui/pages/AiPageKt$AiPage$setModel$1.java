package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.UiSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AiPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$AiPage$setModel$1", f = "AiPage.kt", i = {0, 0, 1, 1}, l = {110, 110}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240\\1", "$this$launch", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {110, 110}, s = {"L$0", "L$2", "L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$AiPage$setModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ String $m;
    final /* synthetic */ MutableState<String> $model$delegate;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiPageKt$AiPage$setModel$1(AiUiExtras aiUiExtras, String str, AppState appState, MutableState<String> mutableState, Continuation<? super AiPageKt$AiPage$setModel$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
        this.$m = str;
        this.$state = appState;
        this.$model$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiPageKt$AiPage$setModel$1 aiPageKt$AiPage$setModel$1 = new AiPageKt$AiPage$setModel$1(this.$ai, this.$m, this.$state, this.$model$delegate, continuation);
        aiPageKt$AiPage$setModel$1.L$0 = obj;
        return aiPageKt$AiPage$setModel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$AiPage$setModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt$AiPage$setModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings invokeSuspend$lambda$1$0(String $m, UiSettings it) {
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, $m, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1, 4193279, null);
    }
}
