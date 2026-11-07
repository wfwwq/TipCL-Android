package com.pymcl.android.ui.dialogs;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$LocalThumb$bm$2$1$1$1", f = "SavesDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$LocalThumb$bm$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ String $p;
    final /* synthetic */ int $px;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavesDialogKt$LocalThumb$bm$2$1$1$1(String str, int i, Continuation<? super SavesDialogKt$LocalThumb$bm$2$1$1$1> continuation) {
        super(2, continuation);
        this.$p = str;
        this.$px = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SavesDialogKt$LocalThumb$bm$2$1$1$1 savesDialogKt$LocalThumb$bm$2$1$1$1 = new SavesDialogKt$LocalThumb$bm$2$1$1$1(this.$p, this.$px, continuation);
        savesDialogKt$LocalThumb$bm$2$1$1$1.L$0 = obj;
        return savesDialogKt$LocalThumb$bm$2$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((SavesDialogKt$LocalThumb$bm$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                String str = this.$p;
                int i = this.$px;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(LocalThumbs.INSTANCE.load(str, i));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                    return null;
                }
                return objM8116constructorimpl;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
