package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.SavesFormat;
import com.pymcl.core.instance.MediaFile;
import com.pymcl.core.instance.MediaKind;
import com.pymcl.core.instance.SaveBackup;
import com.pymcl.core.instance.SaveInfo;
import com.pymcl.core.instance.SaveManager;
import com.pymcl.core.instance.TrashEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$2$1$1$1", f = "SavesDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$SavesSheet$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<SaveBackup>> $backups$delegate;
    final /* synthetic */ SaveManager $m;
    final /* synthetic */ MutableState<List<MediaFile>> $media$delegate;
    final /* synthetic */ MutableState<List<SaveInfo>> $saves$delegate;
    final /* synthetic */ MutableIntState $tab$delegate;
    final /* synthetic */ MutableState<List<TrashEntry>> $trash$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavesDialogKt$SavesSheet$2$1$1$1(SaveManager saveManager, MutableIntState mutableIntState, MutableState<List<SaveInfo>> mutableState, MutableState<List<SaveBackup>> mutableState2, MutableState<List<TrashEntry>> mutableState3, MutableState<List<MediaFile>> mutableState4, Continuation<? super SavesDialogKt$SavesSheet$2$1$1$1> continuation) {
        super(2, continuation);
        this.$m = saveManager;
        this.$tab$delegate = mutableIntState;
        this.$saves$delegate = mutableState;
        this.$backups$delegate = mutableState2;
        this.$trash$delegate = mutableState3;
        this.$media$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SavesDialogKt$SavesSheet$2$1$1$1(this.$m, this.$tab$delegate, this.$saves$delegate, this.$backups$delegate, this.$trash$delegate, this.$media$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SavesDialogKt$SavesSheet$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                MediaKind kind = SavesFormat.INSTANCE.mediaKind(SavesDialogKt.SavesSheet$lambda$1(this.$tab$delegate));
                if (kind == null) {
                    this.$saves$delegate.setValue(SaveManager.listSaves$default(this.$m, false, 1, null));
                    this.$backups$delegate.setValue(SaveManager.listBackups$default(this.$m, null, 1, null));
                    this.$trash$delegate.setValue(this.$m.listTrash());
                } else {
                    this.$media$delegate.setValue(this.$m.listMedia(kind));
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
