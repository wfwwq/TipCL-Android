package com.pymcl.android.ui.pages;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MiscPages.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt", f = "MiscPages.kt", i = {0, 0, 0, 0, 0, 0}, l = {164}, m = "ServersPage$load", n = {"$state", "loading$delegate", "ctx", "inst$delegate", "instances$delegate", "all$delegate"}, nl = {169}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$ServersPage$load$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    MiscPagesKt$ServersPage$load$1(Continuation<? super MiscPagesKt$ServersPage$load$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MiscPagesKt.ServersPage$load(null, null, null, null, null, null, this);
    }
}
