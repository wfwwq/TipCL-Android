package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.InstanceRow;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GamePages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$1$1", f = "GamePages.kt", i = {}, l = {198, 198}, m = "invokeSuspend", n = {}, nl = {198, -1}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InstanceRow $r;
    final /* synthetic */ MutableState<List<InstanceRow>> $rows$delegate;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$1$1(AppState appState, InstanceRow instanceRow, MutableState<List<InstanceRow>> mutableState, Continuation<? super GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$r = instanceRow;
        this.$rows$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$1$1(this.$state, this.$r, this.$rows$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
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
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4b
        L15:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L35
        L19:
            kotlin.ResultKt.throwOnFailure(r9)
            com.pymcl.android.ui.state.AppState r1 = r8.$state
            com.pymcl.android.ui.state.LauncherUiApi r1 = r1.getApi()
            com.pymcl.android.ui.state.InstanceRow r2 = r8.$r
            java.lang.String r2 = r2.getName()
            r3 = r8
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 1
            r8.label = r4
            java.lang.Object r1 = r1.deleteInstance(r2, r3)
            if (r1 != r0) goto L35
            return r0
        L35:
            com.pymcl.android.ui.state.AppState r1 = r8.$state
            androidx.compose.runtime.MutableState<java.util.List<com.pymcl.android.ui.state.InstanceRow>> r2 = r8.$rows$delegate
            com.pymcl.android.ui.pages.GamePagesKt.access$InstancePage$reload(r1, r2)
            com.pymcl.android.ui.state.AppState r1 = r8.$state
            r2 = r8
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r3 = 2
            r8.label = r3
            java.lang.Object r1 = r1.reload(r2)
            if (r1 != r0) goto L4b
            return r0
        L4b:
            com.pymcl.android.ui.state.AppState r2 = r8.$state
            r6 = 6
            r7 = 0
            java.lang.String r3 = "已删除"
            r4 = 0
            r5 = 0
            com.pymcl.android.ui.state.AppState.toast$default(r2, r3, r4, r5, r6, r7)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.GamePagesKt$InstancePage$2$3$2$5$3$1$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
