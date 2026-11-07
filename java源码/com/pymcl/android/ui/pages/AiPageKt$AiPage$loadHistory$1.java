package com.pymcl.android.ui.pages;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AiPage.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt", f = "AiPage.kt", i = {0, 0, 0}, l = {84}, m = "AiPage$loadHistory", n = {"ai", "s", "id"}, nl = {84}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$AiPage$loadHistory$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    AiPageKt$AiPage$loadHistory$1(Continuation<? super AiPageKt$AiPage$loadHistory$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AiPageKt.AiPage$loadHistory(null, null, null, this);
    }
}
