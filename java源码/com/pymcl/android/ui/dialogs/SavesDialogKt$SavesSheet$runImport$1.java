package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.SaveImportProgress;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.core.instance.SaveImport;
import com.pymcl.core.instance.SaveManager;
import java.io.File;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$runImport$1", f = "SavesDialog.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, nl = {148}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$SavesSheet$runImport$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<File, SaveImportProgress.Cb, SaveImport.Result> $block;
    final /* synthetic */ MutableState<Boolean> $busy$delegate;
    final /* synthetic */ MutableIntState $gen$delegate;
    final /* synthetic */ MutableState<Triple<Integer, Integer, Long>> $imp$delegate;
    final /* synthetic */ Ref.ObjectRef<Job> $job;
    final /* synthetic */ AtomicLong $lastPost;
    final /* synthetic */ SaveManager $m;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SavesDialogKt$SavesSheet$runImport$1(AppState appState, Function2<? super File, ? super SaveImportProgress.Cb, SaveImport.Result> function2, SaveManager saveManager, AtomicLong atomicLong, MutableState<Triple<Integer, Integer, Long>> mutableState, Ref.ObjectRef<Job> objectRef, MutableIntState mutableIntState, MutableState<Boolean> mutableState2, Continuation<? super SavesDialogKt$SavesSheet$runImport$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$block = function2;
        this.$m = saveManager;
        this.$lastPost = atomicLong;
        this.$imp$delegate = mutableState;
        this.$job = objectRef;
        this.$gen$delegate = mutableIntState;
        this.$busy$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SavesDialogKt$SavesSheet$runImport$1(this.$state, this.$block, this.$m, this.$lastPost, this.$imp$delegate, this.$job, this.$gen$delegate, this.$busy$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SavesDialogKt$SavesSheet$runImport$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        String strSt;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new SavesDialogKt$SavesSheet$runImport$1$r$1(this.$block, this.$m, this.$lastPost, this.$imp$delegate, this.$job, null), this);
                        if (objWithContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objWithContext = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SaveImport.Result r = (SaveImport.Result) objWithContext;
                AppState appState = this.$state;
                String strSt2 = SavesStringsKt.st("已导入", new Object[0]);
                if (r.getRenamed()) {
                    strSt = SavesStringsKt.st("与现有存档重名，已改名为「{0}」", r.getName());
                } else {
                    strSt = r.getName() + " · " + SavesStringsKt.st("{0} 个文件", Boxing.boxInt(r.getFiles()));
                }
                AppState.toast$default(appState, strSt2, strSt, null, 4, null);
                this.$gen$delegate.setIntValue(SavesDialogKt.SavesSheet$lambda$10(this.$gen$delegate) + 1);
            } catch (CancellationException e) {
                AppState appState2 = this.$state;
                String strSt3 = SavesStringsKt.st("已取消导入", new Object[0]);
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                appState2.toast(strSt3, message, "info");
            } catch (Exception e2) {
                AppState appState3 = this.$state;
                String strSt4 = SavesStringsKt.st("导入失败", new Object[0]);
                String message2 = e2.getMessage();
                if (message2 == null) {
                    message2 = e2.toString();
                }
                appState3.toast(strSt4, message2, "error");
            }
            SavesDialogKt.SavesSheet$lambda$44(this.$busy$delegate, false);
            this.$imp$delegate.setValue(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            SavesDialogKt.SavesSheet$lambda$44(this.$busy$delegate, false);
            this.$imp$delegate.setValue(null);
            throw th;
        }
    }
}
