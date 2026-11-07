package com.pymcl.android.ui.components;

import android.content.Context;
import android.graphics.Bitmap;
import com.pymcl.ai.AiAgent;
import com.pymcl.ai.AiClient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NetImage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.components.Thumbs$load$3$2", f = "NetImage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes21.dex */
final class Thumbs$load$3$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ int $targetPx;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Thumbs$load$3$2(Context context, String str, int i, Continuation<? super Thumbs$load$3$2> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$url = str;
        this.$targetPx = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Thumbs$load$3$2 thumbs$load$3$2 = new Thumbs$load$3$2(this.$ctx, this.$url, this.$targetPx, continuation);
        thumbs$load$3$2.L$0 = obj;
        return thumbs$load$3$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((Thumbs$load$3$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapM8116constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                File file = new File(Thumbs.INSTANCE.dir(this.$ctx), Thumbs.INSTANCE.key(this.$url));
                if (!file.isFile() || file.length() == 0) {
                    String str = this.$url;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        httpURLConnection.setConnectTimeout(AiAgent.MAX_TOOL_RESULT);
                        httpURLConnection.setReadTimeout(AiClient.CONNECT_TIMEOUT);
                        httpURLConnection.setRequestProperty("User-Agent", "PyMCL/1.0.1");
                        boolean z = true;
                        httpURLConnection.setInstanceFollowRedirects(true);
                        try {
                            int responseCode = httpURLConnection.getResponseCode();
                            if (200 > responseCode || responseCode >= 300) {
                                z = false;
                            }
                            if (z) {
                                File file2 = new File(file.getPath() + ".part");
                                InputStream inputStream = httpURLConnection.getInputStream();
                                try {
                                    InputStream inputStream2 = inputStream;
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        Intrinsics.checkNotNull(inputStream2);
                                        ByteStreamsKt.copyTo$default(inputStream2, fileOutputStream, 0, 2, null);
                                        CloseableKt.closeFinally(fileOutputStream, null);
                                        CloseableKt.closeFinally(inputStream, null);
                                        file2.renameTo(file);
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            httpURLConnection.disconnect();
                            Result.m8116constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m8116constructorimpl(ResultKt.createFailure(th2));
                    }
                }
                if (file.isFile()) {
                    int i = this.$targetPx;
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        bitmapM8116constructorimpl = Result.m8116constructorimpl(Thumbs.INSTANCE.decode(file, i));
                    } catch (Throwable th3) {
                        Result.Companion companion4 = Result.INSTANCE;
                        bitmapM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th3));
                    }
                    bitmap = Result.m8122isFailureimpl(bitmapM8116constructorimpl) ? null : bitmapM8116constructorimpl;
                }
                if (bitmap == null) {
                    Set set = Thumbs.failed;
                    Intrinsics.checkNotNullExpressionValue(set, "access$getFailed$p(...)");
                    set.add(this.$url);
                    Boxing.boxBoolean(file.delete());
                } else {
                    Thumbs.mem.put(this.$url, bitmap);
                }
                return bitmap;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
