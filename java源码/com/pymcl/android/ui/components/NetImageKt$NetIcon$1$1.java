package com.pymcl.android.ui.components;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NetImage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.components.NetImageKt$NetIcon$1$1", f = "NetImage.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes21.dex */
final class NetImageKt$NetIcon$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<ImageBitmap> $img$delegate;
    final /* synthetic */ int $px;
    final /* synthetic */ String $url;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetImageKt$NetIcon$1$1(Context context, String str, int i, MutableState<ImageBitmap> mutableState, Continuation<? super NetImageKt$NetIcon$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$url = str;
        this.$px = i;
        this.$img$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetImageKt$NetIcon$1$1(this.$ctx, this.$url, this.$px, this.$img$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NetImageKt$NetIcon$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        Object objLoad;
        MutableState<ImageBitmap> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                MutableState<ImageBitmap> mutableState2 = this.$img$delegate;
                this.L$0 = mutableState2;
                this.label = 1;
                objLoad = Thumbs.INSTANCE.load(this.$ctx, this.$url, this.$px, this);
                if (objLoad != coroutine_suspended) {
                    mutableState = mutableState2;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure($result);
                objLoad = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Bitmap bitmap = (Bitmap) objLoad;
        mutableState.setValue(bitmap != null ? AndroidImageBitmap_androidKt.asImageBitmap(bitmap) : null);
        return Unit.INSTANCE;
    }
}
