package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.SettingsLogic;
import com.pymcl.android.ui.state.UiSettings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SettingsPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$1$1", f = "SettingsPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class SettingsPageKt$SettingsPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $heightText$delegate;
    final /* synthetic */ MutableState<String> $limitText$delegate;
    final /* synthetic */ UiSettings $s;
    final /* synthetic */ MutableState<String> $widthText$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsPageKt$SettingsPage$1$1(UiSettings uiSettings, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, Continuation<? super SettingsPageKt$SettingsPage$1$1> continuation) {
        super(2, continuation);
        this.$s = uiSettings;
        this.$widthText$delegate = mutableState;
        this.$heightText$delegate = mutableState2;
        this.$limitText$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsPageKt$SettingsPage$1$1(this.$s, this.$widthText$delegate, this.$heightText$delegate, this.$limitText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SettingsPageKt$SettingsPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Integer intField$default = SettingsLogic.parseIntField$default(SettingsLogic.INSTANCE, SettingsPageKt.SettingsPage$lambda$9(this.$widthText$delegate), 0, 2, null);
                int width = this.$s.getWidth();
                if (intField$default == null || intField$default.intValue() != width) {
                    this.$widthText$delegate.setValue(String.valueOf(this.$s.getWidth()));
                }
                Integer intField$default2 = SettingsLogic.parseIntField$default(SettingsLogic.INSTANCE, SettingsPageKt.SettingsPage$lambda$12(this.$heightText$delegate), 0, 2, null);
                int height = this.$s.getHeight();
                if (intField$default2 == null || intField$default2.intValue() != height) {
                    this.$heightText$delegate.setValue(String.valueOf(this.$s.getHeight()));
                }
                Integer intField$default3 = SettingsLogic.parseIntField$default(SettingsLogic.INSTANCE, SettingsPageKt.SettingsPage$lambda$15(this.$limitText$delegate), 0, 2, null);
                if ((intField$default3 != null ? intField$default3.intValue() : 0) != this.$s.getSpeedLimit()) {
                    this.$limitText$delegate.setValue(String.valueOf(this.$s.getSpeedLimit()));
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
