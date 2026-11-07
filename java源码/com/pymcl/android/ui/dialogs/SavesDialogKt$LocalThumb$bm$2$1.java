package com.pymcl.android.ui.dialogs;

import android.graphics.Bitmap;
import androidx.compose.runtime.ProduceStateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$LocalThumb$bm$2$1", f = "SavesDialog.kt", i = {0, 0}, l = {388}, m = "invokeSuspend", n = {"$this$produceState", "p\\1"}, nl = {388}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$LocalThumb$bm$2$1 extends SuspendLambda implements Function2<ProduceStateScope<Bitmap>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $path;
    final /* synthetic */ int $px;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavesDialogKt$LocalThumb$bm$2$1(String str, int i, Continuation<? super SavesDialogKt$LocalThumb$bm$2$1> continuation) {
        super(2, continuation);
        this.$path = str;
        this.$px = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SavesDialogKt$LocalThumb$bm$2$1 savesDialogKt$LocalThumb$bm$2$1 = new SavesDialogKt$LocalThumb$bm$2$1(this.$path, this.$px, continuation);
        savesDialogKt$LocalThumb$bm$2$1.L$0 = obj;
        return savesDialogKt$LocalThumb$bm$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProduceStateScope<Bitmap> produceStateScope, Continuation<? super Unit> continuation) {
        return ((SavesDialogKt$LocalThumb$bm$2$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.L$0
            androidx.compose.runtime.ProduceStateScope r0 = (androidx.compose.runtime.ProduceStateScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.label
            switch(r2) {
                case 0: goto L23;
                case 1: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L15:
            r1 = 0
            java.lang.Object r2 = r8.L$2
            androidx.compose.runtime.ProduceStateScope r2 = (androidx.compose.runtime.ProduceStateScope) r2
            java.lang.Object r3 = r8.L$1
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.throwOnFailure(r9)
            r4 = r9
            goto L58
        L23:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r2 = r8.$path
            r3 = 0
            if (r2 == 0) goto L5c
            int r4 = r8.$px
            r5 = 0
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r6 = (kotlin.coroutines.CoroutineContext) r6
            com.pymcl.android.ui.dialogs.SavesDialogKt$LocalThumb$bm$2$1$1$1 r7 = new com.pymcl.android.ui.dialogs.SavesDialogKt$LocalThumb$bm$2$1$1$1
            r7.<init>(r2, r4, r3)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r8.L$0 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r8.L$1 = r3
            r8.L$2 = r0
            r3 = 1
            r8.label = r3
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r6, r7, r8)
            if (r3 != r1) goto L54
            return r1
        L54:
            r4 = r3
            r1 = r5
            r3 = r2
            r2 = r0
        L58:
            r3 = r4
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            goto L5d
        L5c:
            r2 = r0
        L5d:
            r2.<init>(r3)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.SavesDialogKt$LocalThumb$bm$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
