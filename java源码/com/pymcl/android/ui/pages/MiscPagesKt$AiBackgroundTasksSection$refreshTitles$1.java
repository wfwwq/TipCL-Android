package com.pymcl.android.ui.pages;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MiscPages.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt", f = "MiscPages.kt", i = {0, 0}, l = {386}, m = "AiBackgroundTasksSection$refreshTitles", n = {"ai", "titles$delegate"}, nl = {587}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$AiBackgroundTasksSection$refreshTitles$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    MiscPagesKt$AiBackgroundTasksSection$refreshTitles$1(Continuation<? super MiscPagesKt$AiBackgroundTasksSection$refreshTitles$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MiscPagesKt.AiBackgroundTasksSection$refreshTitles(null, null, this);
    }
}
