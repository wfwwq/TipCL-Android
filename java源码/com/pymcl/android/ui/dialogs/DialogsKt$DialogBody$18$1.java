package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogFile;
import com.pymcl.android.ui.state.DialogSpec;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Dialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.DialogsKt$DialogBody$18$1", f = "Dialogs.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class DialogsKt$DialogBody$18$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DialogSpec $d;
    final /* synthetic */ MutableState<String> $err$delegate;
    final /* synthetic */ MutableState<List<CatalogFile>> $files$delegate;
    final /* synthetic */ AppState $state;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogsKt$DialogBody$18$1(AppState appState, DialogSpec dialogSpec, MutableState<String> mutableState, MutableState<List<CatalogFile>> mutableState2, Continuation<? super DialogsKt$DialogBody$18$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$d = dialogSpec;
        this.$err$delegate = mutableState;
        this.$files$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DialogsKt$DialogBody$18$1(this.$state, this.$d, this.$err$delegate, this.$files$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogsKt$DialogBody$18$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listEmptyList;
        MutableState<List<CatalogFile>> mutableState;
        Object projectFiles;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            switch (r1) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    MutableState<List<CatalogFile>> mutableState2 = this.$files$delegate;
                    this.L$0 = mutableState2;
                    this.L$1 = mutableState2;
                    this.label = 1;
                    projectFiles = this.$state.getApi().getProjectFiles(((DialogSpec.CatalogFiles) this.$d).getKind().getKey(), ((DialogSpec.CatalogFiles) this.$d).getHit().getId(), this);
                    if (projectFiles != coroutine_suspended) {
                        mutableState = mutableState2;
                        r1 = mutableState2;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    mutableState = (MutableState) this.L$1;
                    MutableState mutableState3 = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    projectFiles = obj;
                    r1 = mutableState3;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listEmptyList = (List) projectFiles;
        } catch (Exception e) {
            MutableState<String> mutableState4 = this.$err$delegate;
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            mutableState4.setValue(message);
            listEmptyList = CollectionsKt.emptyList();
            mutableState = r1;
        }
        mutableState.setValue(listEmptyList);
        return Unit.INSTANCE;
    }
}
