package com.pymcl.android.ui.dialogs;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.core.instance.SaveTarget;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$1$1", f = "SavesDialog.kt", i = {0, 0}, l = {75}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {77}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$SavesSheet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ DialogSpec.Saves $d;
    final /* synthetic */ MutableState<String> $err$delegate;
    final /* synthetic */ MutableState<List<SaveTarget>> $targets$delegate;
    final /* synthetic */ MutableState<Boolean> $targetsLoaded$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavesDialogKt$SavesSheet$1$1(MutableState<Boolean> mutableState, DialogSpec.Saves saves, Context context, MutableState<String> mutableState2, MutableState<List<SaveTarget>> mutableState3, Continuation<? super SavesDialogKt$SavesSheet$1$1> continuation) {
        super(2, continuation);
        this.$targetsLoaded$delegate = mutableState;
        this.$d = saves;
        this.$ctx = context;
        this.$err$delegate = mutableState2;
        this.$targets$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SavesDialogKt$SavesSheet$1$1 savesDialogKt$SavesSheet$1$1 = new SavesDialogKt$SavesSheet$1$1(this.$targetsLoaded$delegate, this.$d, this.$ctx, this.$err$delegate, this.$targets$delegate, continuation);
        savesDialogKt$SavesSheet$1$1.L$0 = obj;
        return savesDialogKt$SavesSheet$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SavesDialogKt$SavesSheet$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.runtime.MutableState<java.util.List<com.pymcl.core.instance.SaveTarget>>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.runtime.MutableState] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8116constructorimpl;
        ?? r2;
        Object objWithContext;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            switch (i) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    SavesDialogKt.SavesSheet$lambda$60(this.$targetsLoaded$delegate, false);
                    ?? r22 = this.$targets$delegate;
                    DialogSpec.Saves saves = this.$d;
                    Context context = this.$ctx;
                    Result.Companion companion = Result.INSTANCE;
                    CoroutineDispatcher io = Dispatchers.getIO();
                    SavesDialogKt$SavesSheet$1$1$1$1 savesDialogKt$SavesSheet$1$1$1$1 = new SavesDialogKt$SavesSheet$1$1$1$1(saves, context, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.L$2 = r22;
                    this.label = 1;
                    objWithContext = BuildersKt.withContext(io, savesDialogKt$SavesSheet$1$1$1$1, this);
                    if (objWithContext != coroutine_suspended) {
                        i = r22;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ?? r23 = (MutableState) this.L$2;
                    ResultKt.throwOnFailure(obj);
                    objWithContext = obj;
                    i = r23;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objM8116constructorimpl = Result.m8116constructorimpl((List) objWithContext);
            r2 = i;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            r2 = i;
        }
        MutableState<String> mutableState = this.$err$delegate;
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = thM8119exceptionOrNullimpl.toString();
            }
            mutableState.setValue(message);
            objM8116constructorimpl = CollectionsKt.emptyList();
        }
        r2.setValue((List) objM8116constructorimpl);
        SavesDialogKt.SavesSheet$lambda$60(this.$targetsLoaded$delegate, true);
        return Unit.INSTANCE;
    }
}
