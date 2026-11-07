package com.pymcl.android.ui.pages;

import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.InstanceRow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GamePages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2", f = "GamePages.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, nl = {203}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InstanceRow $r;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2(AppState appState, InstanceRow instanceRow, Continuation<? super GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$r = instanceRow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2(this.$state, this.$r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 0
            r3 = 1
            switch(r1) {
                case 0: goto L18;
                case 1: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L13:
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r7
            goto L5f
        L18:
            kotlin.ResultKt.throwOnFailure(r7)
            com.pymcl.android.ui.state.AppState r1 = r6.$state
            java.lang.String r1 = r1.getSelectedInstance()
            com.pymcl.android.ui.state.InstanceRow r4 = r6.$r
            java.lang.String r4 = r4.getName()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 == 0) goto L47
            com.pymcl.android.ui.state.AppState r1 = r6.$state
            java.lang.String r1 = r1.getSelectedVersion()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L3d
            r1 = r3
            goto L3e
        L3d:
            r1 = r2
        L3e:
            if (r1 == 0) goto L47
            com.pymcl.android.ui.state.AppState r0 = r6.$state
            java.lang.String r0 = r0.getSelectedVersion()
            goto L73
        L47:
            com.pymcl.android.ui.state.AppState r1 = r6.$state
            com.pymcl.android.ui.state.LauncherUiApi r1 = r1.getApi()
            com.pymcl.android.ui.state.InstanceRow r4 = r6.$r
            java.lang.String r4 = r4.getName()
            r5 = r6
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r6.label = r3
            java.lang.Object r1 = r1.getInstalledVersions(r4, r5)
            if (r1 != r0) goto L5f
            return r0
        L5f:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r1)
            com.pymcl.android.ui.state.InstalledVersion r0 = (com.pymcl.android.ui.state.InstalledVersion) r0
            if (r0 == 0) goto L6e
            java.lang.String r0 = r0.getId()
            goto L6f
        L6e:
            r0 = 0
        L6f:
            if (r0 != 0) goto L73
            java.lang.String r0 = ""
        L73:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto L7e
            r2 = r3
        L7e:
            com.pymcl.android.ui.state.AppState r1 = r6.$state
            if (r2 == 0) goto L8c
            java.lang.String r2 = "先在这个实例里安装一个版本"
            java.lang.String r3 = "warn"
            java.lang.String r4 = "没有可导出的版本"
            r1.toast(r4, r2, r3)
            goto L9c
        L8c:
            com.pymcl.android.ui.state.DialogSpec$ExportModpack r2 = new com.pymcl.android.ui.state.DialogSpec$ExportModpack
            com.pymcl.android.ui.state.InstanceRow r3 = r6.$r
            java.lang.String r3 = r3.getName()
            r2.<init>(r3, r0)
            com.pymcl.android.ui.state.DialogSpec r2 = (com.pymcl.android.ui.state.DialogSpec) r2
            r1.open(r2)
        L9c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
