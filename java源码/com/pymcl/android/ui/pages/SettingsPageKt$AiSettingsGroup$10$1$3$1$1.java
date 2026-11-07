package com.pymcl.android.ui.pages;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.MutableState;
import com.pymcl.ai.AiSettings;
import com.pymcl.android.data.AiBridge;
import com.pymcl.android.data.AiSettingsForm;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import java.util.List;
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
@DebugMetadata(c = "com.pymcl.android.ui.pages.SettingsPageKt$AiSettingsGroup$10$1$3$1$1", f = "SettingsPage.kt", i = {0}, l = {269}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240\\1"}, nl = {269}, s = {"L$0"}, v = 2)
/* loaded from: classes22.dex */
final class SettingsPageKt$AiSettingsGroup$10$1$3$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ AiBridge $ai;
    final /* synthetic */ MutableState<List<String>> $aiModels$delegate;
    final /* synthetic */ AiSettings $b;
    final /* synthetic */ MutableState<AiSettingsForm> $form$delegate;
    final /* synthetic */ MutableState<Pair<Boolean, String>> $lastResult$delegate;
    final /* synthetic */ MutableState<Boolean> $showDetail$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ RowScope $this_Row;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsPageKt$AiSettingsGroup$10$1$3$1$1(RowScope rowScope, AiBridge aiBridge, AiSettings aiSettings, MutableState<AiSettingsForm> mutableState, AppState appState, MutableState<List<String>> mutableState2, MutableState<Pair<Boolean, String>> mutableState3, MutableState<Boolean> mutableState4, Continuation<? super SettingsPageKt$AiSettingsGroup$10$1$3$1$1> continuation) {
        super(1, continuation);
        this.$this_Row = rowScope;
        this.$ai = aiBridge;
        this.$b = aiSettings;
        this.$form$delegate = mutableState;
        this.$state = appState;
        this.$aiModels$delegate = mutableState2;
        this.$lastResult$delegate = mutableState3;
        this.$showDetail$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SettingsPageKt$AiSettingsGroup$10$1$3$1$1(this.$this_Row, this.$ai, this.$b, this.$form$delegate, this.$state, this.$aiModels$delegate, this.$lastResult$delegate, this.$showDetail$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((SettingsPageKt$AiSettingsGroup$10$1$3$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        Object objModels;
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
                    objModels = aiBridge.models(settings, this);
                    if (objModels != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    objModels = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objM8116constructorimpl = Result.m8116constructorimpl((List) objModels);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        AiBridge aiBridge2 = this.$ai;
        AppState appState = this.$state;
        MutableState<List<String>> mutableState2 = this.$aiModels$delegate;
        if (Result.m8123isSuccessimpl(objM8116constructorimpl)) {
            List list = (List) objM8116constructorimpl;
            mutableState2.setValue(list);
            String strTakeNetNotice = aiBridge2.takeNetNotice();
            if (strTakeNetNotice != null) {
                appState.toast("已改用 HTTP", strTakeNetNotice, "info");
            }
            if (list.isEmpty()) {
                appState.toast("没取到模型", I18nKt.tr("网关没返回模型列表，可直接手填模型名", new Object[0]), "info");
            } else {
                AppState.toast$default(appState, "模型列表已刷新", I18nKt.tr("共 {0} 个可用模型", Boxing.boxInt(list.size())), null, 4, null);
            }
        }
        AiBridge aiBridge3 = this.$ai;
        AppState appState2 = this.$state;
        MutableState<Pair<Boolean, String>> mutableState3 = this.$lastResult$delegate;
        MutableState<Boolean> mutableState4 = this.$showDetail$delegate;
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String strDescribeError = aiBridge3.describeError(thM8119exceptionOrNullimpl);
            mutableState3.setValue(TuplesKt.to(Boxing.boxBoolean(false), strDescribeError));
            SettingsPageKt.AiSettingsGroup$lambda$18(mutableState4, false);
            appState2.toast("拉取失败", AiSettingsForm.INSTANCE.splitDetail(strDescribeError).getFirst(), "error");
        }
        return Unit.INSTANCE;
    }
}
