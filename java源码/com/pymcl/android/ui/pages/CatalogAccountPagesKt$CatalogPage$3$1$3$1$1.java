package com.pymcl.android.ui.pages;

import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogKind;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "p", "Lkotlin/Function2;", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$1$3$1$1", f = "CatalogAccountPages.kt", i = {0, 1, 1, 1}, l = {139, 142}, m = "invokeSuspend", n = {"p", "p", "r", "f"}, nl = {140, 143}, s = {"L$0", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes22.dex */
final class CatalogAccountPagesKt$CatalogPage$3$1$3$1$1 extends SuspendLambda implements Function2<Function2<? super Float, ? super String, ? extends Unit>, Continuation<? super String>, Object> {
    final /* synthetic */ ManagedActivityResultLauncher<String, Uri> $exportSaver;
    final /* synthetic */ String $inst;
    final /* synthetic */ CatalogKind $kind;
    final /* synthetic */ MutableState<File> $pendingExport$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ String $ver;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogAccountPagesKt$CatalogPage$3$1$3$1$1(AppState appState, CatalogKind catalogKind, String str, String str2, ManagedActivityResultLauncher<String, Uri> managedActivityResultLauncher, MutableState<File> mutableState, Continuation<? super CatalogAccountPagesKt$CatalogPage$3$1$3$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$kind = catalogKind;
        this.$inst = str;
        this.$ver = str2;
        this.$exportSaver = managedActivityResultLauncher;
        this.$pendingExport$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CatalogAccountPagesKt$CatalogPage$3$1$3$1$1 catalogAccountPagesKt$CatalogPage$3$1$3$1$1 = new CatalogAccountPagesKt$CatalogPage$3$1$3$1$1(this.$state, this.$kind, this.$inst, this.$ver, this.$exportSaver, this.$pendingExport$delegate, continuation);
        catalogAccountPagesKt$CatalogPage$3$1$3$1$1.L$0 = obj;
        return catalogAccountPagesKt$CatalogPage$3$1$3$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Function2<? super Float, ? super String, ? extends Unit> function2, Continuation<? super String> continuation) {
        return invoke2((Function2<? super Float, ? super String, Unit>) function2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return ((CatalogAccountPagesKt$CatalogPage$3$1$3$1$1) create(function2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            r5 = r0
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            switch(r1) {
                case 0: goto L27;
                case 1: goto L22;
                case 2: goto L16;
                default: goto Le;
            }
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L16:
            java.lang.Object r0 = r9.L$2
            java.io.File r0 = (java.io.File) r0
            java.lang.Object r1 = r9.L$1
            com.pymcl.android.ui.state.ContentExportResult r1 = (com.pymcl.android.ui.state.ContentExportResult) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L8c
        L22:
            kotlin.ResultKt.throwOnFailure(r10)
            r1 = r10
            goto L51
        L27:
            kotlin.ResultKt.throwOnFailure(r10)
            com.pymcl.android.ui.state.AppState r1 = r9.$state
            com.pymcl.android.ui.state.LauncherUiApi r1 = r1.getApi()
            com.pymcl.android.ui.state.LauncherUiApiExt8 r1 = com.pymcl.android.ui.state.LauncherUiApiKt.getExt8(r1)
            com.pymcl.android.ui.state.CatalogKind r2 = r9.$kind
            java.lang.String r2 = r2.getKey()
            java.lang.String r3 = r9.$inst
            java.lang.String r4 = r9.$ver
            r6 = r9
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r9.L$0 = r7
            r7 = 1
            r9.label = r7
            java.lang.Object r1 = r1.exportAllContents(r2, r3, r4, r5, r6)
            if (r1 != r0) goto L51
            return r0
        L51:
            com.pymcl.android.ui.state.ContentExportResult r1 = (com.pymcl.android.ui.state.ContentExportResult) r1
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r1.getPath()
            r2.<init>(r3)
            int r3 = r1.getOk()
            if (r3 == 0) goto Lb6
            kotlinx.coroutines.MainCoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$1$3$1$1$1 r4 = new com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$1$3$1$1$1
            androidx.activity.compose.ManagedActivityResultLauncher<java.lang.String, android.net.Uri> r6 = r9.$exportSaver
            androidx.compose.runtime.MutableState<java.io.File> r7 = r9.$pendingExport$delegate
            r8 = 0
            r4.<init>(r2, r6, r7, r8)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r6 = r9
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r9.L$0 = r7
            r9.L$1 = r1
            r9.L$2 = r2
            r7 = 2
            r9.label = r7
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r6)
            if (r3 != r0) goto L8b
            return r0
        L8b:
            r0 = r2
        L8c:
            int r2 = r1.getFailed()
            if (r2 <= 0) goto L9f
            com.pymcl.android.ui.state.AppState r2 = r9.$state
            java.lang.String r3 = r1.getSummary()
            java.lang.String r4 = "warn"
            java.lang.String r6 = "部分没能导出"
            r2.toast(r6, r3, r4)
        L9f:
            int r2 = r1.getOk()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            java.lang.String r3 = r0.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "{0} 个 → {1}"
            java.lang.String r2 = com.pymcl.android.ui.i18n.I18nKt.tr(r3, r2)
            return r2
        Lb6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r1.getSummary()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$1$3$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: CatalogAccountPages.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$1$3$1$1$1", f = "CatalogAccountPages.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$1$3$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ManagedActivityResultLauncher<String, Uri> $exportSaver;
        final /* synthetic */ File $f;
        final /* synthetic */ MutableState<File> $pendingExport$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(File file, ManagedActivityResultLauncher<String, Uri> managedActivityResultLauncher, MutableState<File> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$f = file;
            this.$exportSaver = managedActivityResultLauncher;
            this.$pendingExport$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$f, this.$exportSaver, this.$pendingExport$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.$pendingExport$delegate.setValue(this.$f);
                    ManagedActivityResultLauncher<String, Uri> managedActivityResultLauncher = this.$exportSaver;
                    String name = this.$f.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    managedActivityResultLauncher.launch(name);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
