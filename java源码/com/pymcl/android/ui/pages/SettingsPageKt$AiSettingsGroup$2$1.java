package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.ai.AiSettings;
import com.pymcl.android.data.AiSettingsForm;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SettingsPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.SettingsPageKt$AiSettingsGroup$2$1", f = "SettingsPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class SettingsPageKt$AiSettingsGroup$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<AiSettings> $base$delegate;
    final /* synthetic */ MutableState<AiSettingsForm> $form$delegate;
    final /* synthetic */ String $uiModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsPageKt$AiSettingsGroup$2$1(String str, MutableState<AiSettings> mutableState, MutableState<AiSettingsForm> mutableState2, Continuation<? super SettingsPageKt$AiSettingsGroup$2$1> continuation) {
        super(2, continuation);
        this.$uiModel = str;
        this.$base$delegate = mutableState;
        this.$form$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsPageKt$AiSettingsGroup$2$1(this.$uiModel, this.$base$delegate, this.$form$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SettingsPageKt$AiSettingsGroup$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!StringsKt.isBlank(this.$uiModel) && SettingsPageKt.AiSettingsGroup$lambda$2(this.$base$delegate) != null) {
                    String str = this.$uiModel;
                    AiSettings aiSettingsAiSettingsGroup$lambda$2 = SettingsPageKt.AiSettingsGroup$lambda$2(this.$base$delegate);
                    if (!Intrinsics.areEqual(str, aiSettingsAiSettingsGroup$lambda$2 != null ? aiSettingsAiSettingsGroup$lambda$2.getModel() : null)) {
                        MutableState<AiSettings> mutableState = this.$base$delegate;
                        AiSettings aiSettingsAiSettingsGroup$lambda$22 = SettingsPageKt.AiSettingsGroup$lambda$2(this.$base$delegate);
                        mutableState.setValue(aiSettingsAiSettingsGroup$lambda$22 != null ? aiSettingsAiSettingsGroup$lambda$22.copy((7935 & 1) != 0 ? aiSettingsAiSettingsGroup$lambda$22.mode : null, (7935 & 2) != 0 ? aiSettingsAiSettingsGroup$lambda$22.gatewayUrl : null, (7935 & 4) != 0 ? aiSettingsAiSettingsGroup$lambda$22.baseUrl : null, (7935 & 8) != 0 ? aiSettingsAiSettingsGroup$lambda$22.apiKey : null, (7935 & 16) != 0 ? aiSettingsAiSettingsGroup$lambda$22.gatewayKey : null, (7935 & 32) != 0 ? aiSettingsAiSettingsGroup$lambda$22.model : this.$uiModel, (7935 & 64) != 0 ? aiSettingsAiSettingsGroup$lambda$22.fallbackModel : null, (7935 & 128) != 0 ? aiSettingsAiSettingsGroup$lambda$22.contextWindow : 0, (7935 & 256) != 0 ? aiSettingsAiSettingsGroup$lambda$22.maxTokens : 0, (7935 & 512) != 0 ? aiSettingsAiSettingsGroup$lambda$22.permissionMode : null, (7935 & 1024) != 0 ? aiSettingsAiSettingsGroup$lambda$22.temperature : 0.0d, (7935 & 2048) != 0 ? aiSettingsAiSettingsGroup$lambda$22.language : null, (7935 & 4096) != 0 ? aiSettingsAiSettingsGroup$lambda$22.capsOverrides : null) : null);
                        this.$form$delegate.setValue(AiSettingsForm.copy$default(SettingsPageKt.AiSettingsGroup$lambda$5(this.$form$delegate), 0, null, null, null, null, this.$uiModel, null, null, 0, 479, null));
                    }
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
