package com.pymcl.android.ui.pages;

import android.content.Context;
import android.net.Uri;
import com.pymcl.android.ui.state.AppState;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.apache.commons.lang3.StringUtils;

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$exportSaver$1$1$1", f = "CatalogAccountPages.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, nl = {104}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class CatalogAccountPagesKt$CatalogPage$exportSaver$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ File $f;
    final /* synthetic */ AppState $state;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogAccountPagesKt$CatalogPage$exportSaver$1$1$1(Uri uri, AppState appState, File file, Context context, Continuation<? super CatalogAccountPagesKt$CatalogPage$exportSaver$1$1$1> continuation) {
        super(2, continuation);
        this.$uri = uri;
        this.$state = appState;
        this.$f = file;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CatalogAccountPagesKt$CatalogPage$exportSaver$1$1$1(this.$uri, this.$state, this.$f, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogAccountPagesKt$CatalogPage$exportSaver$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (this.$uri == null) {
                        AppState appState = this.$state;
                        String absolutePath = this.$f.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                        appState.toast("未选择保存位置，文件留在应用目录", absolutePath, "info");
                        return Unit.INSTANCE;
                    }
                    this.label = 1;
                    if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, this.$uri, this.$f, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AppState appState2 = this.$state;
            String name = this.$f.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            AppState.toast$default(appState2, "已导出", name, null, 4, null);
        } catch (Exception e) {
            AppState appState3 = this.$state;
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            appState3.toast("导出失败", message + StringUtils.LF + this.$f.getAbsolutePath(), "error");
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CatalogAccountPages.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$exportSaver$1$1$1$1", f = "CatalogAccountPages.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$exportSaver$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ File $f;
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Uri uri, File file, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$uri = uri;
            this.$f = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$uri, this.$f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    OutputStream outputStreamOpenOutputStream = this.$ctx.getContentResolver().openOutputStream(this.$uri);
                    if (outputStreamOpenOutputStream == null) {
                        throw new IOException("无法写入所选位置");
                    }
                    FileInputStream fileInputStream = outputStreamOpenOutputStream;
                    try {
                        OutputStream outputStream = fileInputStream;
                        fileInputStream = new FileInputStream(this.$f);
                        try {
                            long jCopyTo$default = ByteStreamsKt.copyTo$default(fileInputStream, outputStream, 0, 2, null);
                            CloseableKt.closeFinally(fileInputStream, null);
                            CloseableKt.closeFinally(fileInputStream, null);
                            return Boxing.boxLong(jCopyTo$default);
                        } finally {
                        }
                    } finally {
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
