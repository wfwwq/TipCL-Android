package com.pymcl.android.ui.dialogs;

import com.pymcl.core.instance.MediaFile;
import com.pymcl.core.instance.MediaKind;
import com.pymcl.core.instance.SaveManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$4$9$5$1$1$1", f = "SavesDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$SavesSheet$4$9$5$1$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ MediaKind $kind;
    final /* synthetic */ MediaFile $pv;
    final /* synthetic */ SaveManager $sm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavesDialogKt$SavesSheet$4$9$5$1$1$1(SaveManager saveManager, MediaKind mediaKind, MediaFile mediaFile, Continuation<? super SavesDialogKt$SavesSheet$4$9$5$1$1$1> continuation) {
        super(1, continuation);
        this.$sm = saveManager;
        this.$kind = mediaKind;
        this.$pv = mediaFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SavesDialogKt$SavesSheet$4$9$5$1$1$1(this.$sm, this.$kind, this.$pv, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((SavesDialogKt$SavesSheet$4$9$5$1$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$sm.deleteMedia(this.$kind, this.$pv.getName());
                return this.$pv.getName();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
