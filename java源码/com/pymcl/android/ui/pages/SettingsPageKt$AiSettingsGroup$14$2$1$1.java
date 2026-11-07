package com.pymcl.android.ui.pages;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.MutableState;
import com.pymcl.ai.AiSettings;
import com.pymcl.android.data.AiBridge;
import com.pymcl.android.data.AiSettingsForm;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: SettingsPage.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.SettingsPageKt$AiSettingsGroup$14$2$1$1", f = "SettingsPage.kt", i = {0}, l = {293}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240\\1"}, nl = {293}, s = {"L$0"}, v = 2)
/* loaded from: classes22.dex */
final class SettingsPageKt$AiSettingsGroup$14$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ AiBridge $ai;
    final /* synthetic */ AiSettings $b;
    final /* synthetic */ MutableState<AiSettingsForm> $form$delegate;
    final /* synthetic */ MutableState<Pair<Boolean, String>> $lastResult$delegate;
    final /* synthetic */ MutableState<Boolean> $showDetail$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ RowScope $this_Row;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsPageKt$AiSettingsGroup$14$2$1$1(RowScope rowScope, AppState appState, AiBridge aiBridge, AiSettings aiSettings, MutableState<AiSettingsForm> mutableState, MutableState<Pair<Boolean, String>> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super SettingsPageKt$AiSettingsGroup$14$2$1$1> continuation) {
        super(1, continuation);
        this.$this_Row = rowScope;
        this.$state = appState;
        this.$ai = aiBridge;
        this.$b = aiSettings;
        this.$form$delegate = mutableState;
        this.$lastResult$delegate = mutableState2;
        this.$showDetail$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SettingsPageKt$AiSettingsGroup$14$2$1$1(this.$this_Row, this.$state, this.$ai, this.$b, this.$form$delegate, this.$lastResult$delegate, this.$showDetail$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((SettingsPageKt$AiSettingsGroup$14$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        Object objTestConnection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RowScope rowScope = this.$this_Row;
                    AiBridge aiBridge = this.$ai;
                    AiSettings aiSettings = this.$b;
                    MutableState<AiSettingsForm> mutableState = this.$form$delegate;
                    Result.Companion companion = Result.INSTANCE;
                    AiSettings settings = SettingsPageKt.AiSettingsGroup$lambda$5(mutableState).toSettings(aiSettings);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(rowScope);
                    this.label = 1;
                    objTestConnection = aiBridge.testConnection(settings, this);
                    if (objTestConnection != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    objTestConnection = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objM8116constructorimpl = Result.m8116constructorimpl((Pair) objTestConnection);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        AiBridge aiBridge2 = this.$ai;
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            objM8116constructorimpl = TuplesKt.to(Boxing.boxBoolean(false), aiBridge2.describeError(thM8119exceptionOrNullimpl));
        }
        Pair pair = (Pair) objM8116constructorimpl;
        boolean ok = ((Boolean) pair.component1()).booleanValue();
        String msg = (String) pair.component2();
        this.$lastResult$delegate.setValue(TuplesKt.to(Boxing.boxBoolean(ok), msg));
        SettingsPageKt.AiSettingsGroup$lambda$18(this.$showDetail$delegate, false);
        this.$state.toast(ok ? "AI 连接成功" : "AI 连接失败", AiSettingsForm.INSTANCE.splitDetail(msg).getFirst(), ok ? SettingsProtocol.EXTRA_OK : "error");
        return Unit.INSTANCE;
    }
}
