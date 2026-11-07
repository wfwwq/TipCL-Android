package com.pymcl.android.ui.dialogs;

import android.content.Context;
import com.pymcl.android.data.SavesData;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.core.instance.SaveTarget;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/core/instance/SaveTarget;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$1$1$1$1", f = "SavesDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$SavesSheet$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SaveTarget>>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ DialogSpec.Saves $d;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavesDialogKt$SavesSheet$1$1$1$1(DialogSpec.Saves saves, Context context, Continuation<? super SavesDialogKt$SavesSheet$1$1$1$1> continuation) {
        super(2, continuation);
        this.$d = saves;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SavesDialogKt$SavesSheet$1$1$1$1(this.$d, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SaveTarget>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<SaveTarget>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SaveTarget>> continuation) {
        return ((SavesDialogKt$SavesSheet$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                return StringsKt.isBlank(this.$d.getVersion()) ? SavesData.INSTANCE.targets(this.$ctx, this.$d.getInstance()) : CollectionsKt.listOf(new SaveTarget(this.$d.getVersion(), SavesData.INSTANCE.gameDir(this.$ctx, this.$d.getInstance(), this.$d.getVersion())));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
