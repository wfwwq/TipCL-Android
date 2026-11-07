package com.pymcl.android.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import com.pymcl.android.ui.state.UiSettings;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PyMclApp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.PyMclAppKt$Wallpaper$2$1", f = "PyMclApp.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, nl = {167}, s = {}, v = 2)
/* loaded from: classes20.dex */
final class PyMclAppKt$Wallpaper$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<ImageBitmap> $bmp$delegate;
    final /* synthetic */ UiSettings $s;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PyMclAppKt$Wallpaper$2$1(UiSettings uiSettings, MutableState<ImageBitmap> mutableState, Continuation<? super PyMclAppKt$Wallpaper$2$1> continuation) {
        super(2, continuation);
        this.$s = uiSettings;
        this.$bmp$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PyMclAppKt$Wallpaper$2$1(this.$s, this.$bmp$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PyMclAppKt$Wallpaper$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: PyMclApp.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/ImageBitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.PyMclAppKt$Wallpaper$2$1$1", f = "PyMclApp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.PyMclAppKt$Wallpaper$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageBitmap>, Object> {
        final /* synthetic */ UiSettings $s;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UiSettings uiSettings, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$s = uiSettings;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$s, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageBitmap> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objM8116constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    UiSettings uiSettings = this.$s;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = 2;
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(new File(uiSettings.getWallpaperPath()).getPath(), options);
                        objM8116constructorimpl = Result.m8116constructorimpl(bitmapDecodeFile != null ? AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeFile) : null);
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        MutableState<ImageBitmap> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                MutableState<ImageBitmap> mutableState2 = this.$bmp$delegate;
                this.L$0 = mutableState2;
                this.label = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$s, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState = mutableState2;
                break;
            case 1:
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure($result);
                objWithContext = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableState.setValue((ImageBitmap) objWithContext);
        return Unit.INSTANCE;
    }
}
