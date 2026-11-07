package com.pymcl.android.ui.pages;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.UiSettings;
import java.util.concurrent.CancellationException;
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
import org.lwjgl.util.shaderc.SPV;

/* compiled from: SettingsPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1", f = "SettingsPage.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, nl = {103}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $importing$delegate;
    final /* synthetic */ Context $sctx;
    final /* synthetic */ AppState $state;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1(AppState appState, Context context, Uri uri, MutableState<Boolean> mutableState, Continuation<? super SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$sctx = context;
        this.$uri = uri;
        this.$importing$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1(this.$state, this.$sctx, this.$uri, this.$importing$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1$path$1(this.$sctx, this.$uri, null), this);
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
                final String path = (String) objWithContext;
                this.$state.updateSettings(new Function1() { // from class: com.pymcl.android.ui.pages.SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SettingsPageKt$SettingsPage$2$3$wpPicker$1$1$1.invokeSuspend$lambda$0(path, (UiSettings) obj);
                    }
                });
                AppState.toast$default(this.$state, "已设置壁纸", "点「保存设置」后下次打开仍生效", null, 4, null);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                AppState appState = this.$state;
                String message = e2.getMessage();
                if (message == null) {
                    message = e2.toString();
                }
                appState.toast("设置壁纸失败", message, "error");
            }
            SettingsPageKt.SettingsPage$lambda$20$2$2(this.$importing$delegate, false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            SettingsPageKt.SettingsPage$lambda$20$2$2(this.$importing$delegate, false);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings invokeSuspend$lambda$0(String $path, UiSettings it) {
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, $path, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -4097, SPV.kDefaultMaxIdBound, null);
    }
}
