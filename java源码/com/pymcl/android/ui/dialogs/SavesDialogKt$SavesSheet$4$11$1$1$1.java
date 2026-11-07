package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.core.instance.MediaFile;
import com.pymcl.core.instance.MediaKind;
import com.pymcl.core.instance.SaveManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$4$11$1$1$1", f = "SavesDialog.kt", i = {0, 0}, l = {355}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {355}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$SavesSheet$4$11$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MediaKind $kind;
    final /* synthetic */ MediaFile $m;
    final /* synthetic */ SaveManager $sm;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<Pair<MediaFile, List<String>>> $viewer$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavesDialogKt$SavesSheet$4$11$1$1$1(SaveManager saveManager, MediaKind mediaKind, MediaFile mediaFile, MutableState<Pair<MediaFile, List<String>>> mutableState, AppState appState, Continuation<? super SavesDialogKt$SavesSheet$4$11$1$1$1> continuation) {
        super(2, continuation);
        this.$sm = saveManager;
        this.$kind = mediaKind;
        this.$m = mediaFile;
        this.$viewer$delegate = mutableState;
        this.$state = appState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SavesDialogKt$SavesSheet$4$11$1$1$1 savesDialogKt$SavesSheet$4$11$1$1$1 = new SavesDialogKt$SavesSheet$4$11$1$1$1(this.$sm, this.$kind, this.$m, this.$viewer$delegate, this.$state, continuation);
        savesDialogKt$SavesSheet$4$11$1$1$1.L$0 = obj;
        return savesDialogKt$SavesSheet$4$11$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SavesDialogKt$SavesSheet$4$11$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        Object objWithContext;
        CoroutineScope $this$launch = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SaveManager saveManager = this.$sm;
                    MediaKind mediaKind = this.$kind;
                    MediaFile mediaFile = this.$m;
                    Result.Companion companion = Result.INSTANCE;
                    CoroutineDispatcher io = Dispatchers.getIO();
                    SavesDialogKt$SavesSheet$4$11$1$1$1$1$1 savesDialogKt$SavesSheet$4$11$1$1$1$1$1 = new SavesDialogKt$SavesSheet$4$11$1$1$1$1$1(saveManager, mediaKind, mediaFile, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable($this$launch);
                    this.L$1 = SpillingKt.nullOutSpilledVariable($this$launch);
                    this.label = 1;
                    objWithContext = BuildersKt.withContext(io, savesDialogKt$SavesSheet$4$11$1$1$1$1$1, this);
                    if (objWithContext != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    objWithContext = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objM8116constructorimpl = Result.m8116constructorimpl((List) objWithContext);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        MediaFile mediaFile2 = this.$m;
        MutableState<Pair<MediaFile, List<String>>> mutableState = this.$viewer$delegate;
        if (Result.m8123isSuccessimpl(objM8116constructorimpl)) {
            mutableState.setValue(TuplesKt.to(mediaFile2, (List) objM8116constructorimpl));
        }
        AppState appState = this.$state;
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            appState.toast("读取失败", message, "error");
        }
        return Unit.INSTANCE;
    }
}
