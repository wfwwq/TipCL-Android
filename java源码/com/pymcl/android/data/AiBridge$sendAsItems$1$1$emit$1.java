package com.pymcl.android.data;

import com.pymcl.ai.AiEvent;
import com.pymcl.android.data.AiBridge;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AiBridge.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.data.AiBridge$sendAsItems$1$1", f = "AiBridge.kt", i = {0, 0, 0, 0}, l = {113}, m = "emit", n = {"e", "$this$forEach\\1", "element\\1", "it\\2"}, nl = {220}, s = {"L$0", "L$1", "L$4", "L$5"}, v = 2)
/* loaded from: classes21.dex */
final class AiBridge$sendAsItems$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AiBridge.AnonymousClass1.C01531<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AiBridge$sendAsItems$1$1$emit$1(AiBridge.AnonymousClass1.C01531<? super T> c01531, Continuation<? super AiBridge$sendAsItems$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c01531;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((AiEvent) null, (Continuation<? super Unit>) this);
    }
}
