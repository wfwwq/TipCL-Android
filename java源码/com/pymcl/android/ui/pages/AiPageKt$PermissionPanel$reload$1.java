package com.pymcl.android.ui.pages;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AiPage.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.AiPageKt", f = "AiPage.kt", i = {0, 0}, l = {379}, m = "PermissionPanel$reload", n = {"$ai", "rules$delegate"}, nl = {379}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class AiPageKt$PermissionPanel$reload$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    AiPageKt$PermissionPanel$reload$1(Continuation<? super AiPageKt$PermissionPanel$reload$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AiPageKt.PermissionPanel$reload(null, null, this);
    }
}
