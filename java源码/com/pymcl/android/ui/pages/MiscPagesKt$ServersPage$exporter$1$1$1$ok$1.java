package com.pymcl.android.ui.pages;

import android.content.Context;
import android.net.Uri;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$exporter$1$1$1$ok$1", f = "MiscPages.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$ServersPage$exporter$1$1$1$ok$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ String $text;
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$ServersPage$exporter$1$1$1$ok$1(Context context, Uri uri, String str, Continuation<? super MiscPagesKt$ServersPage$exporter$1$1$1$ok$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$uri = uri;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MiscPagesKt$ServersPage$exporter$1$1$1$ok$1 miscPagesKt$ServersPage$exporter$1$1$1$ok$1 = new MiscPagesKt$ServersPage$exporter$1$1$1$ok$1(this.$ctx, this.$uri, this.$text, continuation);
        miscPagesKt$ServersPage$exporter$1$1$1$ok$1.L$0 = obj;
        return miscPagesKt$ServersPage$exporter$1$1$1$ok$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((MiscPagesKt$ServersPage$exporter$1$1$1$ok$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Context context = this.$ctx;
                Uri uri = this.$uri;
                String str = this.$text;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "wt");
                    Unit unit = null;
                    if (outputStreamOpenOutputStream != null) {
                        OutputStream outputStream = outputStreamOpenOutputStream;
                        try {
                            byte[] bytes = str.getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            outputStream.write(bytes);
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(outputStream, null);
                            unit = Unit.INSTANCE;
                        } finally {
                        }
                    }
                    objM8116constructorimpl = Result.m8116constructorimpl(Boxing.boxBoolean(unit != null));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                return Result.m8122isFailureimpl(objM8116constructorimpl) ? Boxing.boxBoolean(false) : objM8116constructorimpl;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
