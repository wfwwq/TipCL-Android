package com.pymcl.android.ui.dialogs;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.pymcl.core.instance.SaveManager;
import java.io.IOException;
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
import kotlin.jvm.functions.Function1;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$exporter$1$1$2", f = "SavesDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$SavesSheet$exporter$1$1$2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ SaveManager $m;
    final /* synthetic */ String $name;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavesDialogKt$SavesSheet$exporter$1$1$2(Context context, Uri uri, String str, SaveManager saveManager, Continuation<? super SavesDialogKt$SavesSheet$exporter$1$1$2> continuation) {
        super(1, continuation);
        this.$ctx = context;
        this.$uri = uri;
        this.$name = str;
        this.$m = saveManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SavesDialogKt$SavesSheet$exporter$1$1$2(this.$ctx, this.$uri, this.$name, this.$m, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((SavesDialogKt$SavesSheet$exporter$1$1$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Exception {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                try {
                    OutputStream outputStreamOpenOutputStream = this.$ctx.getContentResolver().openOutputStream(this.$uri);
                    if (outputStreamOpenOutputStream == null) {
                        throw new IOException("无法写入所选位置");
                    }
                    OutputStream outputStream = outputStreamOpenOutputStream;
                    try {
                        this.$m.export(this.$name, outputStream);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(outputStream, null);
                        return this.$name;
                    } finally {
                    }
                } catch (Exception e) {
                    Context context = this.$ctx;
                    Uri uri = this.$uri;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Result.m8116constructorimpl(Boxing.boxBoolean(DocumentsContract.deleteDocument(context.getContentResolver(), uri)));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m8116constructorimpl(ResultKt.createFailure(th));
                    }
                    throw e;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
