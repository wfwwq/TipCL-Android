package com.pymcl.android.data;

import com.pymcl.android.ui.state.MpState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SafeCollector.common.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class RepositoryUiApi$terracottaStates$$inlined$map$1 implements Flow<MpState> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;
    final /* synthetic */ RepositoryUiApi this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1", f = "RepositoryUiApi.kt", i = {0, 0, 0}, l = {109}, m = "collect", n = {"collector", "$completion", "$this$unsafeTransform_u24lambda_u240"}, nl = {113}, s = {"L$0", "L$1", "L$2"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryUiApi$terracottaStates$$inlined$map$1.this.collect(null, this);
        }
    }

    public RepositoryUiApi$terracottaStates$$inlined$map$1(Flow flow, RepositoryUiApi repositoryUiApi) {
        this.$this_unsafeTransform$inlined = flow;
        this.this$0 = repositoryUiApi;
    }

    /* compiled from: Emitters.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $this_unsafeFlow;
        final /* synthetic */ RepositoryUiApi this$0;

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$2", f = "RepositoryUiApi.kt", i = {0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
        /* renamed from: com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, RepositoryUiApi repositoryUiApi) {
            this.$this_unsafeFlow = flowCollector;
            this.this$0 = repositoryUiApi;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L14
                r0 = r13
                com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$2$1 r0 = (com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r1 = r0.label
                int r1 = r1 - r2
                r0.label = r1
                goto L19
            L14:
                com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$2$1 r0 = new com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$2$1
                r0.<init>(r13)
            L19:
                java.lang.Object r1 = r0.result
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r0.label
                switch(r3) {
                    case 0: goto L3d;
                    case 1: goto L2c;
                    default: goto L24;
                }
            L24:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L2c:
                r2 = 0
                java.lang.Object r3 = r0.L$3
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                java.lang.Object r4 = r0.L$2
                java.lang.Object r5 = r0.L$1
                com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$2$1 r5 = (com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1.AnonymousClass2.AnonymousClass1) r5
                java.lang.Object r12 = r0.L$0
                kotlin.ResultKt.throwOnFailure(r1)
                goto L75
            L3d:
                kotlin.ResultKt.throwOnFailure(r1)
                kotlinx.coroutines.flow.FlowCollector r3 = r11.$this_unsafeFlow
                r5 = r0
                r4 = r12
                r6 = 0
                r7 = r0
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r8 = r4
                com.pymcl.multiplayer.MultiplayerState r8 = (com.pymcl.multiplayer.MultiplayerState) r8
                r9 = 0
                com.pymcl.android.data.RepositoryUiApi r10 = r11.this$0
                com.pymcl.android.ui.state.MpState r7 = com.pymcl.android.data.RepositoryUiApi.access$toUi(r10, r8)
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
                r0.L$0 = r8
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                r0.L$1 = r8
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
                r0.L$2 = r8
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
                r0.L$3 = r8
                r8 = 1
                r0.label = r8
                java.lang.Object r7 = r3.emit(r7, r0)
                if (r7 != r2) goto L74
                return r2
            L74:
                r2 = r6
            L75:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.pymcl.android.ui.state.MpState> r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r11
            com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$1 r0 = (com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$1 r0 = new com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$1
            r0.<init>(r11)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L3e;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            r2 = 0
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            java.lang.Object r4 = r0.L$1
            com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$1 r4 = (com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1.AnonymousClass1) r4
            java.lang.Object r5 = r0.L$0
            r10 = r5
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            kotlin.ResultKt.throwOnFailure(r1)
            goto L6c
        L3e:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r10
            r4 = r0
            r5 = 0
            kotlinx.coroutines.flow.Flow r6 = r9.$this_unsafeTransform$inlined
            com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$2 r7 = new com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1$2
            com.pymcl.android.data.RepositoryUiApi r8 = r9.this$0
            r7.<init>(r3, r8)
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r0.L$0 = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r0.L$1 = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
            r0.L$2 = r8
            r8 = 1
            r0.label = r8
            java.lang.Object r6 = r6.collect(r7, r0)
            if (r6 != r2) goto L6b
            return r2
        L6b:
            r2 = r5
        L6c:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApi$terracottaStates$$inlined$map$1.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
