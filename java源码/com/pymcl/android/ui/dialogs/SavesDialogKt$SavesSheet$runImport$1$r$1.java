package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.SaveImportProgress;
import com.pymcl.core.instance.SaveImport;
import com.pymcl.core.instance.SaveManager;
import java.io.File;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/core/instance/SaveImport$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$runImport$1$r$1", f = "SavesDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$SavesSheet$runImport$1$r$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SaveImport.Result>, Object> {
    final /* synthetic */ Function2<File, SaveImportProgress.Cb, SaveImport.Result> $block;
    final /* synthetic */ MutableState<Triple<Integer, Integer, Long>> $imp$delegate;
    final /* synthetic */ Ref.ObjectRef<Job> $job;
    final /* synthetic */ AtomicLong $lastPost;
    final /* synthetic */ SaveManager $m;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SavesDialogKt$SavesSheet$runImport$1$r$1(Function2<? super File, ? super SaveImportProgress.Cb, SaveImport.Result> function2, SaveManager saveManager, AtomicLong atomicLong, MutableState<Triple<Integer, Integer, Long>> mutableState, Ref.ObjectRef<Job> objectRef, Continuation<? super SavesDialogKt$SavesSheet$runImport$1$r$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$m = saveManager;
        this.$lastPost = atomicLong;
        this.$imp$delegate = mutableState;
        this.$job = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SavesDialogKt$SavesSheet$runImport$1$r$1(this.$block, this.$m, this.$lastPost, this.$imp$delegate, this.$job, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SaveImport.Result> continuation) {
        return ((SavesDialogKt$SavesSheet$runImport$1$r$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Function2<File, SaveImportProgress.Cb, SaveImport.Result> function2 = this.$block;
                File savesDir = this.$m.getSavesDir();
                final AtomicLong atomicLong = this.$lastPost;
                final MutableState<Triple<Integer, Integer, Long>> mutableState = this.$imp$delegate;
                Function3 function3 = new Function3() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$runImport$1$r$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return SavesDialogKt$SavesSheet$runImport$1$r$1.invokeSuspend$lambda$0(atomicLong, mutableState, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Long) obj3).longValue());
                    }
                };
                final Ref.ObjectRef<Job> objectRef = this.$job;
                return function2.invoke(savesDir, new SaveImportProgress.Cb(function3, new Function0() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$runImport$1$r$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(SavesDialogKt$SavesSheet$runImport$1$r$1.invokeSuspend$lambda$1(objectRef));
                    }
                }));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AtomicLong $lastPost, MutableState $imp$delegate, int d, int t, long b) {
        long last = $lastPost.get();
        if ((d == t || d - last >= Math.max(1L, t / 60)) && $lastPost.compareAndSet(last, d)) {
            $imp$delegate.setValue(new Triple(Integer.valueOf(d), Integer.valueOf(t), Long.valueOf(b)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(Ref.ObjectRef $job) {
        Job job = (Job) $job.element;
        return (job == null || job.isActive()) ? false : true;
    }
}
