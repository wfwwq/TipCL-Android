package com.pymcl.android.ui.dialogs;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.DialogsKt$ExportModpackSheet$saver$1$1$1", f = "Dialogs.kt", i = {}, l = {385}, m = "invokeSuspend", n = {}, nl = {388}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class DialogsKt$ExportModpackSheet$saver$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $close;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ File $f;
    final /* synthetic */ AppState $state;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogsKt$ExportModpackSheet$saver$1$1$1(AppState appState, File file, Function0<Unit> function0, Context context, Uri uri, Continuation<? super DialogsKt$ExportModpackSheet$saver$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$f = file;
        this.$close = function0;
        this.$ctx = context;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DialogsKt$ExportModpackSheet$saver$1$1$1(this.$state, this.$f, this.$close, this.$ctx, this.$uri, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogsKt$ExportModpackSheet$saver$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Dialogs.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.dialogs.DialogsKt$ExportModpackSheet$saver$1$1$1$1", f = "Dialogs.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.dialogs.DialogsKt$ExportModpackSheet$saver$1$1$1$1, reason: invalid class name */
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
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
        AppState appState = this.$state;
        String name = this.$f.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        AppState.toast$default(appState, "已导出整合包", name, null, 4, null);
        this.$close.invoke();
        return Unit.INSTANCE;
    }
}
