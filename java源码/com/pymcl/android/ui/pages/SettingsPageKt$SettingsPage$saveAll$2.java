package com.pymcl.android.ui.pages;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.SettingsExtrasIO;
import com.pymcl.android.data.SettingsLogic;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.UiSettings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SettingsPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$saveAll$2", f = "SettingsPage.kt", i = {}, l = {51, 52}, m = "invokeSuspend", n = {}, nl = {52, 53}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class SettingsPageKt$SettingsPage$saveAll$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<SettingsLogic.WallpaperSnap> $savedWallpaper$delegate;
    final /* synthetic */ MutableState<Boolean> $saving$delegate;
    final /* synthetic */ Context $sctx;
    final /* synthetic */ AppState $state;
    final /* synthetic */ SettingsLogic.Validation $v;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsPageKt$SettingsPage$saveAll$2(AppState appState, SettingsLogic.Validation validation, Context context, MutableState<SettingsLogic.WallpaperSnap> mutableState, MutableState<Boolean> mutableState2, Continuation<? super SettingsPageKt$SettingsPage$saveAll$2> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$v = validation;
        this.$sctx = context;
        this.$savedWallpaper$delegate = mutableState;
        this.$saving$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsPageKt$SettingsPage$saveAll$2(this.$state, this.$v, this.$sctx, this.$savedWallpaper$delegate, this.$saving$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SettingsPageKt$SettingsPage$saveAll$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 0
            switch(r1) {
                case 0: goto L22;
                case 1: goto L16;
                case 2: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L12:
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            goto L6a
        L16:
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            goto L4b
        L1a:
            r0 = move-exception
            goto La4
        L1d:
            r0 = move-exception
            goto L88
        L1f:
            r0 = move-exception
            goto La3
        L22:
            kotlin.ResultKt.throwOnFailure(r10)
            com.pymcl.android.ui.state.AppState r1 = r9.$state     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.data.SettingsLogic$Validation r3 = r9.$v     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$saveAll$2$$ExternalSyntheticLambda0 r4 = new com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$saveAll$2$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            r4.<init>()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            r1.updateSettings(r4)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.ui.state.AppState r1 = r9.$state     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.ui.state.LauncherUiApi r1 = r1.getApi()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.data.SettingsLogic$Validation r3 = r9.$v     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.ui.state.UiSettings r3 = r3.getFixed()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            r4 = r9
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            r5 = 1
            r9.label = r5     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            java.lang.Object r1 = r1.saveSettings(r3, r4)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            if (r1 != r0) goto L4b
            return r0
        L4b:
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$saveAll$2$2 r3 = new com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$saveAll$2$2     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            android.content.Context r4 = r9.$sctx     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.data.SettingsLogic$Validation r5 = r9.$v     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            r6 = 0
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            r4 = r9
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            r5 = 2
            r9.label = r5     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r4)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            if (r1 != r0) goto L6a
            return r0
        L6a:
            androidx.compose.runtime.MutableState<com.pymcl.android.data.SettingsLogic$WallpaperSnap> r0 = r9.$savedWallpaper$delegate     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.data.SettingsLogic r1 = com.pymcl.android.data.SettingsLogic.INSTANCE     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.data.SettingsLogic$Validation r3 = r9.$v     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.ui.state.UiSettings r3 = r3.getFixed()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.data.SettingsLogic$WallpaperSnap r1 = r1.snap(r3)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.ui.pages.SettingsPageKt.access$SettingsPage$lambda$7(r0, r1)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            com.pymcl.android.ui.state.AppState r3 = r9.$state     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            java.lang.String r4 = "已保存"
            java.lang.String r5 = "下载设置立即生效；内存、分辨率、JVM 参数、GC 在下次启动游戏时生效"
            r7 = 4
            r8 = 0
            r6 = 0
            com.pymcl.android.ui.state.AppState.toast$default(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d java.util.concurrent.CancellationException -> L1f
            goto L9b
        L88:
            com.pymcl.android.ui.state.AppState r1 = r9.$state     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "保存失败"
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L96
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L1a
        L96:
            java.lang.String r5 = "error"
            r1.toast(r3, r4, r5)     // Catch: java.lang.Throwable -> L1a
        L9b:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r9.$saving$delegate
            com.pymcl.android.ui.pages.SettingsPageKt.access$SettingsPage$lambda$4(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La3:
            throw r0     // Catch: java.lang.Throwable -> L1a
        La4:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r9.$saving$delegate
            com.pymcl.android.ui.pages.SettingsPageKt.access$SettingsPage$lambda$4(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$saveAll$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings invokeSuspend$lambda$0(SettingsLogic.Validation $v, UiSettings it) {
        return $v.getFixed();
    }

    /* compiled from: SettingsPage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$saveAll$2$2", f = "SettingsPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$saveAll$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $sctx;
        final /* synthetic */ SettingsLogic.Validation $v;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, SettingsLogic.Validation validation, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$sctx = context;
            this.$v = validation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$sctx, this.$v, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SettingsExtrasIO.INSTANCE.save(this.$sctx, this.$v.getFixed());
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
