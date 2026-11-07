package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.FeedbackRecord;
import com.pymcl.android.ui.state.HelpArticle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$1$1", f = "MiscPages.kt", i = {}, l = {462, 462}, m = "invokeSuspend", n = {}, nl = {462, -1}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$FeedbackPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<HelpArticle>> $arts$delegate;
    final /* synthetic */ MutableState<List<FeedbackRecord>> $hist$delegate;
    final /* synthetic */ AppState $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$FeedbackPage$1$1(AppState appState, MutableState<List<FeedbackRecord>> mutableState, MutableState<List<HelpArticle>> mutableState2, Continuation<? super MiscPagesKt$FeedbackPage$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$hist$delegate = mutableState;
        this.$arts$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiscPagesKt$FeedbackPage$1$1(this.$state, this.$hist$delegate, this.$arts$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$FeedbackPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            switch(r1) {
                case 0: goto L23;
                case 1: goto L1a;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.Object r0 = r5.L$0
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            kotlin.ResultKt.throwOnFailure(r6)
            r2 = r6
            goto L5a
        L1a:
            java.lang.Object r1 = r5.L$0
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            kotlin.ResultKt.throwOnFailure(r6)
            r2 = r6
            goto L3d
        L23:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.FeedbackRecord>> r1 = r5.$hist$delegate
            com.pymcl.android.ui.state.AppState r2 = r5.$state
            com.pymcl.android.ui.state.LauncherUiApi r2 = r2.getApi()
            r3 = r5
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r5.L$0 = r1
            r4 = 1
            r5.label = r4
            java.lang.Object r2 = r2.feedbackHistory(r3)
            if (r2 != r0) goto L3d
            return r0
        L3d:
            java.util.List r2 = (java.util.List) r2
            com.pymcl.android.ui.pages.MiscPagesKt.access$FeedbackPage$lambda$20(r1, r2)
            androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.HelpArticle>> r1 = r5.$arts$delegate
            com.pymcl.android.ui.state.AppState r2 = r5.$state
            com.pymcl.android.ui.state.LauncherUiApi r2 = r2.getApi()
            r3 = r5
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r5.L$0 = r1
            r4 = 2
            r5.label = r4
            java.lang.Object r2 = r2.helpArticles(r3)
            if (r2 != r0) goto L59
            return r0
        L59:
            r0 = r1
        L5a:
            java.util.List r2 = (java.util.List) r2
            com.pymcl.android.ui.pages.MiscPagesKt.access$FeedbackPage$lambda$23(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
