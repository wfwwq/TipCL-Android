package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.SavesDialogKt$SavesSheet$act$1", f = "SavesDialog.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, nl = {109}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class SavesDialogKt$SavesSheet$act$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super String>, Object> $block;
    final /* synthetic */ MutableState<Boolean> $busy$delegate;
    final /* synthetic */ String $failTitle;
    final /* synthetic */ MutableIntState $gen$delegate;
    final /* synthetic */ String $okTitle;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SavesDialogKt$SavesSheet$act$1(AppState appState, String str, String str2, Function1<? super Continuation<? super String>, ? extends Object> function1, MutableIntState mutableIntState, MutableState<Boolean> mutableState, Continuation<? super SavesDialogKt$SavesSheet$act$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$okTitle = str;
        this.$failTitle = str2;
        this.$block = function1;
        this.$gen$delegate = mutableIntState;
        this.$busy$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SavesDialogKt$SavesSheet$act$1(this.$state, this.$okTitle, this.$failTitle, this.$block, this.$gen$delegate, this.$busy$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SavesDialogKt$SavesSheet$act$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new SavesDialogKt$SavesSheet$act$1$msg$1(this.$block, null), this);
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
                String msg = (String) objWithContext;
                AppState.toast$default(this.$state, this.$okTitle, msg, null, 4, null);
                this.$gen$delegate.setIntValue(SavesDialogKt.SavesSheet$lambda$10(this.$gen$delegate) + 1);
            } catch (Exception e) {
                AppState appState = this.$state;
                String str = this.$failTitle;
                String message = e.getMessage();
                if (message == null) {
                    message = e.toString();
                }
                appState.toast(str, message, "error");
            }
            SavesDialogKt.SavesSheet$lambda$44(this.$busy$delegate, false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            SavesDialogKt.SavesSheet$lambda$44(this.$busy$delegate, false);
            throw th;
        }
    }
}
