package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.core.instance.MediaFile;
import com.pymcl.core.instance.SaveBackup;
import com.pymcl.core.instance.SaveInfo;
import com.pymcl.core.instance.SaveManager;
import com.pymcl.core.instance.TrashEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
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
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$2$1", f = "SavesDialog.kt", i = {0, 0, 0}, l = {86}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "m", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {90}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$SavesSheet$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<SaveBackup>> $backups$delegate;
    final /* synthetic */ MutableState<String> $err$delegate;
    final /* synthetic */ MutableState<List<MediaFile>> $media$delegate;
    final /* synthetic */ MutableState<List<SaveInfo>> $saves$delegate;
    final /* synthetic */ SaveManager $sm;
    final /* synthetic */ MutableIntState $tab$delegate;
    final /* synthetic */ MutableState<List<TrashEntry>> $trash$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavesDialogKt$SavesSheet$2$1(SaveManager saveManager, MutableState<String> mutableState, MutableIntState mutableIntState, MutableState<List<SaveInfo>> mutableState2, MutableState<List<SaveBackup>> mutableState3, MutableState<List<TrashEntry>> mutableState4, MutableState<List<MediaFile>> mutableState5, Continuation<? super SavesDialogKt$SavesSheet$2$1> continuation) {
        super(2, continuation);
        this.$sm = saveManager;
        this.$err$delegate = mutableState;
        this.$tab$delegate = mutableIntState;
        this.$saves$delegate = mutableState2;
        this.$backups$delegate = mutableState3;
        this.$trash$delegate = mutableState4;
        this.$media$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SavesDialogKt$SavesSheet$2$1 savesDialogKt$SavesSheet$2$1 = new SavesDialogKt$SavesSheet$2$1(this.$sm, this.$err$delegate, this.$tab$delegate, this.$saves$delegate, this.$backups$delegate, this.$trash$delegate, this.$media$delegate, continuation);
        savesDialogKt$SavesSheet$2$1.L$0 = obj;
        return savesDialogKt$SavesSheet$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SavesDialogKt$SavesSheet$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        CoroutineScope $this$LaunchedEffect = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SaveManager m = this.$sm;
                    if (m != null) {
                        this.$err$delegate.setValue(null);
                        MutableIntState mutableIntState = this.$tab$delegate;
                        MutableState<List<SaveInfo>> mutableState = this.$saves$delegate;
                        MutableState<List<SaveBackup>> mutableState2 = this.$backups$delegate;
                        MutableState<List<TrashEntry>> mutableState3 = this.$trash$delegate;
                        MutableState<List<MediaFile>> mutableState4 = this.$media$delegate;
                        Result.Companion companion = Result.INSTANCE;
                        CoroutineDispatcher io = Dispatchers.getIO();
                        SavesDialogKt$SavesSheet$2$1$1$1 savesDialogKt$SavesSheet$2$1$1$1 = new SavesDialogKt$SavesSheet$2$1$1$1(m, mutableIntState, mutableState, mutableState2, mutableState3, mutableState4, null);
                        this.L$0 = SpillingKt.nullOutSpilledVariable($this$LaunchedEffect);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(m);
                        this.L$2 = SpillingKt.nullOutSpilledVariable($this$LaunchedEffect);
                        this.label = 1;
                        if (BuildersKt.withContext(io, savesDialogKt$SavesSheet$2$1$1$1, this) != coroutine_suspended) {
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        MutableState<String> mutableState5 = this.$err$delegate;
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String strTr = I18nKt.tr("读取失败", new Object[0]);
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = thM8119exceptionOrNullimpl.toString();
            }
            mutableState5.setValue(strTr + "：" + message);
        }
        return Unit.INSTANCE;
    }
}
