package com.pymcl.android.ui.dialogs;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModsDialogs.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$4$4$1$1", f = "ModsDialogs.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, nl = {128}, s = {}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$ModsSheet$4$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $busy$delegate;
    final /* synthetic */ SnapshotStateMap<String, Boolean> $chosen;
    final /* synthetic */ String $inst;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<Map<String, String>> $updates$delegate;
    final /* synthetic */ MutableState<String> $ver$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$ModsSheet$4$4$1$1(AppState appState, String str, SnapshotStateMap<String, Boolean> snapshotStateMap, MutableState<String> mutableState, MutableState<Map<String, String>> mutableState2, MutableState<String> mutableState3, Continuation<? super ModsDialogsKt$ModsSheet$4$4$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$inst = str;
        this.$chosen = snapshotStateMap;
        this.$ver$delegate = mutableState;
        this.$updates$delegate = mutableState2;
        this.$busy$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModsDialogsKt$ModsSheet$4$4$1$1(this.$state, this.$inst, this.$chosen, this.$ver$delegate, this.$updates$delegate, this.$busy$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModsDialogsKt$ModsSheet$4$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objCheckModUpdates;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        objCheckModUpdates = this.$state.getApi().checkModUpdates(this.$inst, ModsDialogsKt.ModsSheet$lambda$4(this.$ver$delegate), this);
                        if (objCheckModUpdates == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objCheckModUpdates = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Map u = (Map) objCheckModUpdates;
                this.$updates$delegate.setValue(u);
                this.$chosen.clear();
                Iterable iterableKeySet = u.keySet();
                SnapshotStateMap<String, Boolean> snapshotStateMap = this.$chosen;
                Iterator it = iterableKeySet.iterator();
                while (it.hasNext()) {
                    snapshotStateMap.put((String) it.next(), Boxing.boxBoolean(true));
                }
                this.$state.getModWatcher().getDetails().put(this.$inst + "/" + ModsDialogsKt.ModsSheet$lambda$4(this.$ver$delegate), u);
                if (u.isEmpty()) {
                    AppState.toast$default(this.$state, "都是最新的", "没有找到可更新的模组", null, 4, null);
                } else {
                    this.$state.toast(I18nKt.tr("{0} 个模组有更新", Boxing.boxInt(u.size())), I18nKt.tr("勾上要更新的，旧文件会在新包校验通过后才删除。", new Object[0]), "info");
                }
            } catch (Exception e) {
                AppState appState = this.$state;
                String message = e.getMessage();
                if (message == null) {
                    message = e.toString();
                }
                appState.toast("检查更新失败", message, "error");
            }
            this.$busy$delegate.setValue(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.$busy$delegate.setValue(null);
            throw th;
        }
    }
}
