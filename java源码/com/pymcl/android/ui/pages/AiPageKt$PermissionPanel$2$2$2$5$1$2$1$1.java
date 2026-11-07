package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.state.PermissionRule;
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
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt$PermissionPanel$2$2$2$5$1$2$1$1", f = "AiPage.kt", i = {}, l = {409, 409}, m = "invokeSuspend", n = {}, nl = {409, -1}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$PermissionPanel$2$2$2$5$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ PermissionRule $r;
    final /* synthetic */ MutableState<List<PermissionRule>> $rules$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiPageKt$PermissionPanel$2$2$2$5$1$2$1$1(AiUiExtras aiUiExtras, PermissionRule permissionRule, MutableState<List<PermissionRule>> mutableState, Continuation<? super AiPageKt$PermissionPanel$2$2$2$5$1$2$1$1> continuation) {
        super(2, continuation);
        this.$ai = aiUiExtras;
        this.$r = permissionRule;
        this.$rules$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiPageKt$PermissionPanel$2$2$2$5$1$2$1$1(this.$ai, this.$r, this.$rules$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiPageKt$PermissionPanel$2$2$2$5$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[RETURN] */
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
                case 0: goto L19;
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
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3e
        L15:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L2d
        L19:
            kotlin.ResultKt.throwOnFailure(r6)
            com.pymcl.android.data.AiUiExtras r1 = r5.$ai
            com.pymcl.android.ui.state.PermissionRule r2 = r5.$r
            r3 = r5
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 1
            r5.label = r4
            java.lang.Object r1 = r1.removeRule(r2, r3)
            if (r1 != r0) goto L2d
            return r0
        L2d:
            com.pymcl.android.data.AiUiExtras r1 = r5.$ai
            androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.PermissionRule>> r2 = r5.$rules$delegate
            r3 = r5
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 2
            r5.label = r4
            java.lang.Object r1 = com.pymcl.android.ui.pages.AiPageKt.access$PermissionPanel$reload(r1, r2, r3)
            if (r1 != r0) goto L3e
            return r0
        L3e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.AiPageKt$PermissionPanel$2$2$2$5$1$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
