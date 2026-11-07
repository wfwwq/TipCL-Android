package com.pymcl.android.data;

import com.pymcl.core.auth.DeviceCode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: RepositoryUiApi.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$startMicrosoftLogin$1$job$1", f = "RepositoryUiApi.kt", i = {1, 2}, l = {192, 193, 194}, m = "invokeSuspend", n = {"acc", "e"}, nl = {193, 194, 195}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes21.dex */
final class RepositoryUiApi$startMicrosoftLogin$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProducerScope<Pair<String, String>> $$this$channelFlow;
    final /* synthetic */ Ref.BooleanRef $cancelled;
    Object L$0;
    int label;
    final /* synthetic */ RepositoryUiApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RepositoryUiApi$startMicrosoftLogin$1$job$1(RepositoryUiApi repositoryUiApi, ProducerScope<? super Pair<String, String>> producerScope, Ref.BooleanRef booleanRef, Continuation<? super RepositoryUiApi$startMicrosoftLogin$1$job$1> continuation) {
        super(2, continuation);
        this.this$0 = repositoryUiApi;
        this.$$this$channelFlow = producerScope;
        this.$cancelled = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RepositoryUiApi$startMicrosoftLogin$1$job$1(this.this$0, this.$$this$channelFlow, this.$cancelled, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RepositoryUiApi$startMicrosoftLogin$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 1
            switch(r1) {
                case 0: goto L2a;
                case 1: goto L23;
                case 2: goto L1b;
                case 3: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L12:
            java.lang.Object r0 = r7.L$0
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L96
        L1b:
            java.lang.Object r1 = r7.L$0
            com.pymcl.core.account.Account r1 = (com.pymcl.core.account.Account) r1
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L28
            goto L6f
        L23:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L28
            r1 = r8
            goto L4e
        L28:
            r1 = move-exception
            goto L70
        L2a:
            kotlin.ResultKt.throwOnFailure(r8)
            com.pymcl.android.data.RepositoryUiApi r1 = r7.this$0     // Catch: java.lang.Exception -> L28
            com.pymcl.android.data.LauncherRepository r1 = com.pymcl.android.data.RepositoryUiApi.access$getRepo$p(r1)     // Catch: java.lang.Exception -> L28
            kotlinx.coroutines.channels.ProducerScope<kotlin.Pair<java.lang.String, java.lang.String>> r3 = r7.$$this$channelFlow     // Catch: java.lang.Exception -> L28
            com.pymcl.android.data.RepositoryUiApi$startMicrosoftLogin$1$job$1$$ExternalSyntheticLambda0 r4 = new com.pymcl.android.data.RepositoryUiApi$startMicrosoftLogin$1$job$1$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L28
            r4.<init>()     // Catch: java.lang.Exception -> L28
            kotlin.jvm.internal.Ref$BooleanRef r3 = r7.$cancelled     // Catch: java.lang.Exception -> L28
            com.pymcl.android.data.RepositoryUiApi$startMicrosoftLogin$1$job$1$$ExternalSyntheticLambda1 r5 = new com.pymcl.android.data.RepositoryUiApi$startMicrosoftLogin$1$job$1$$ExternalSyntheticLambda1     // Catch: java.lang.Exception -> L28
            r5.<init>()     // Catch: java.lang.Exception -> L28
            r3 = r7
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3     // Catch: java.lang.Exception -> L28
            r7.label = r2     // Catch: java.lang.Exception -> L28
            java.lang.Object r1 = r1.loginMicrosoft(r4, r5, r3)     // Catch: java.lang.Exception -> L28
            if (r1 != r0) goto L4e
            return r0
        L4e:
            com.pymcl.core.account.Account r1 = (com.pymcl.core.account.Account) r1     // Catch: java.lang.Exception -> L28
            kotlinx.coroutines.channels.ProducerScope<kotlin.Pair<java.lang.String, java.lang.String>> r3 = r7.$$this$channelFlow     // Catch: java.lang.Exception -> L28
            java.lang.String r4 = "finished"
            java.lang.String r5 = r1.getName()     // Catch: java.lang.Exception -> L28
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r5)     // Catch: java.lang.Exception -> L28
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)     // Catch: java.lang.Exception -> L28
            r7.L$0 = r6     // Catch: java.lang.Exception -> L28
            r6 = 2
            r7.label = r6     // Catch: java.lang.Exception -> L28
            java.lang.Object r3 = r3.send(r4, r5)     // Catch: java.lang.Exception -> L28
            if (r3 != r0) goto L6f
            return r0
        L6f:
            goto L97
        L70:
            kotlinx.coroutines.channels.ProducerScope<kotlin.Pair<java.lang.String, java.lang.String>> r3 = r7.$$this$channelFlow
            java.lang.String r4 = r1.getMessage()
            if (r4 != 0) goto L7c
            java.lang.String r4 = r1.toString()
        L7c:
            java.lang.String r5 = "login_status"
            kotlin.Pair r4 = kotlin.TuplesKt.to(r5, r4)
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r7.L$0 = r6
            r6 = 3
            r7.label = r6
            java.lang.Object r3 = r3.send(r4, r5)
            if (r3 != r0) goto L95
            return r0
        L95:
            r0 = r1
        L96:
        L97:
            kotlinx.coroutines.channels.ProducerScope<kotlin.Pair<java.lang.String, java.lang.String>> r0 = r7.$$this$channelFlow
            kotlinx.coroutines.channels.SendChannel r0 = (kotlinx.coroutines.channels.SendChannel) r0
            r1 = 0
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r0, r1, r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi$startMicrosoftLogin$1$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ProducerScope $$this$channelFlow, DeviceCode dc) {
        $$this$channelFlow.mo9656trySendJP2dKIU(TuplesKt.to("login_code", dc.getUserCode() + "|" + dc.getVerificationUri()));
        return Unit.INSTANCE;
    }
}
