package com.pymcl.android.ui.dialogs;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.SavesData;
import com.pymcl.core.instance.SaveInfo;
import com.pymcl.core.instance.SaveManager;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
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

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$4$7$2$1$2$3$1$1", f = "SavesDialog.kt", i = {}, l = {248}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$SavesSheet$4$7$2$1$2$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $packFor$delegate;
    final /* synthetic */ MutableState<List<File>> $packs$delegate;
    final /* synthetic */ SaveInfo $s;
    final /* synthetic */ SaveManager $sm;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavesDialogKt$SavesSheet$4$7$2$1$2$3$1$1(SaveInfo saveInfo, Context context, SaveManager saveManager, MutableState<List<File>> mutableState, MutableState<String> mutableState2, Continuation<? super SavesDialogKt$SavesSheet$4$7$2$1$2$3$1$1> continuation) {
        super(2, continuation);
        this.$s = saveInfo;
        this.$ctx = context;
        this.$sm = saveManager;
        this.$packs$delegate = mutableState;
        this.$packFor$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SavesDialogKt$SavesSheet$4$7$2$1$2$3$1$1(this.$s, this.$ctx, this.$sm, this.$packs$delegate, this.$packFor$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SavesDialogKt$SavesSheet$4$7$2$1$2$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: SavesDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$4$7$2$1$2$3$1$1$1", f = "SavesDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$4$7$2$1$2$3$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends File>>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ SaveManager $sm;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, SaveManager saveManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$sm = saveManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$sm, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends File>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return SavesData.INSTANCE.datapackCandidates(this.$ctx, this.$sm.getGameDir());
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        MutableState<List<File>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                MutableState<List<File>> mutableState2 = this.$packs$delegate;
                this.L$0 = mutableState2;
                this.label = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, this.$sm, null), this);
                if (objWithContext != coroutine_suspended) {
                    mutableState = mutableState2;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure($result);
                objWithContext = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableState.setValue((List) objWithContext);
        this.$packFor$delegate.setValue(this.$s.getDirName());
        return Unit.INSTANCE;
    }
}
