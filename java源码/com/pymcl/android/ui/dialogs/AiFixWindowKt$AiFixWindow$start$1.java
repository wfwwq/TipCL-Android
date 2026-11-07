package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.pymcl.android.data.AiFixPrompt;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.pages.AiSession;
import com.pymcl.android.ui.state.AiItem;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CrashInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AiFixWindow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$start$1", f = "AiFixWindow.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, nl = {74}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class AiFixWindowKt$AiFixWindow$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiUiExtras $ai;
    final /* synthetic */ MutableState<String> $chatId$delegate;
    final /* synthetic */ CrashInfo $info;
    final /* synthetic */ SnapshotStateList<AiItem> $items;
    final /* synthetic */ MutableState<Boolean> $running$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ String $visible;
    final /* synthetic */ AiUiExtras $x;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiFixWindowKt$AiFixWindow$start$1(AiUiExtras aiUiExtras, SnapshotStateList<AiItem> snapshotStateList, String str, CrashInfo crashInfo, MutableState<String> mutableState, AiUiExtras aiUiExtras2, AppState appState, MutableState<Boolean> mutableState2, Continuation<? super AiFixWindowKt$AiFixWindow$start$1> continuation) {
        super(2, continuation);
        this.$x = aiUiExtras;
        this.$items = snapshotStateList;
        this.$visible = str;
        this.$info = crashInfo;
        this.$chatId$delegate = mutableState;
        this.$ai = aiUiExtras2;
        this.$state = appState;
        this.$running$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiFixWindowKt$AiFixWindow$start$1(this.$x, this.$items, this.$visible, this.$info, this.$chatId$delegate, this.$ai, this.$state, this.$running$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AiFixWindowKt$AiFixWindow$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objNewChat;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$x.isRunning()) {
                    this.$x.stop();
                }
                this.label = 1;
                objNewChat = this.$x.newChat(this);
                if (objNewChat == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objNewChat = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String id = (String) objNewChat;
        this.$chatId$delegate.setValue(id);
        AiSession.INSTANCE.setLoaded(false);
        this.$items.add(new AiItem.User("fix-u", this.$visible));
        AiFixWindowKt.AiFixWindow$runFix(this.$ai, this.$state, this.$running$delegate, this.$items, this.$chatId$delegate, this.$x.send(this.$visible, id, AiFixPrompt.hidden$default(AiFixPrompt.INSTANCE, this.$info, null, null, 6, null)));
        return Unit.INSTANCE;
    }
}
