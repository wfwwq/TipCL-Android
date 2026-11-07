package com.pymcl.android.ui.dialogs;

import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.LauncherUiApiExt;
import com.pymcl.android.ui.state.LauncherUiApiKt;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.DialogsKt$ExportModpackSheet$2$2$1$1", f = "Dialogs.kt", i = {}, l = {398}, m = "invokeSuspend", n = {}, nl = {399}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class DialogsKt$ExportModpackSheet$2$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Pair<Float, String>> $busy$delegate;
    final /* synthetic */ DialogSpec.ExportModpack $d;
    final /* synthetic */ List<String> $include;
    final /* synthetic */ MutableState<String> $name$delegate;
    final /* synthetic */ MutableState<File> $pending$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<String, Uri> $saver;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<String> $ver$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogsKt$ExportModpackSheet$2$2$1$1(AppState appState, DialogSpec.ExportModpack exportModpack, List<String> list, ManagedActivityResultLauncher<String, Uri> managedActivityResultLauncher, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Pair<Float, String>> mutableState3, MutableState<File> mutableState4, Continuation<? super DialogsKt$ExportModpackSheet$2$2$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$d = exportModpack;
        this.$include = list;
        this.$saver = managedActivityResultLauncher;
        this.$name$delegate = mutableState;
        this.$ver$delegate = mutableState2;
        this.$busy$delegate = mutableState3;
        this.$pending$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DialogsKt$ExportModpackSheet$2$2$1$1(this.$state, this.$d, this.$include, this.$saver, this.$name$delegate, this.$ver$delegate, this.$busy$delegate, this.$pending$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogsKt$ExportModpackSheet$2$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objExportModpack;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    LauncherUiApiExt ext = LauncherUiApiKt.getExt(this.$state.getApi());
                    String exportModpack = this.$d.getInstance();
                    String version = this.$d.getVersion();
                    String strExportModpackSheet$lambda$5 = DialogsKt.ExportModpackSheet$lambda$5(this.$name$delegate);
                    String strExportModpackSheet$lambda$8 = DialogsKt.ExportModpackSheet$lambda$8(this.$ver$delegate);
                    List<String> list = this.$include;
                    final MutableState<Pair<Float, String>> mutableState = this.$busy$delegate;
                    this.label = 1;
                    objExportModpack = ext.exportModpack(exportModpack, version, strExportModpackSheet$lambda$5, strExportModpackSheet$lambda$8, list, new Function2() { // from class: com.pymcl.android.ui.dialogs.DialogsKt$ExportModpackSheet$2$2$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DialogsKt$ExportModpackSheet$2$2$1$1.invokeSuspend$lambda$0(mutableState, (Float) obj, (String) obj2);
                        }
                    }, this);
                    if (objExportModpack == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objExportModpack = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String path = (String) objExportModpack;
            File f = new File(path);
            this.$pending$delegate.setValue(f);
            ManagedActivityResultLauncher<String, Uri> managedActivityResultLauncher = this.$saver;
            String name = f.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            managedActivityResultLauncher.launch(name);
            this.$busy$delegate.setValue(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.$busy$delegate.setValue(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableState $busy$delegate, Float p, String t) {
        $busy$delegate.setValue(TuplesKt.to(p, t));
        return Unit.INSTANCE;
    }
}
