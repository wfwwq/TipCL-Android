package com.pymcl.android.ui.pages;

import android.content.Context;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.LaunchConfigIO;
import com.pymcl.android.data.LaunchConfigLogic;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.UiSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.lwjgl.util.shaderc.SPV;

/* compiled from: LaunchPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.LaunchPageKt$ConfigCard$2$1", f = "LaunchPage.kt", i = {0, 0, 1, 1}, l = {270, 271}, m = "invokeSuspend", n = {"st", "d", "st", "d"}, nl = {271, 274}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class LaunchPageKt$ConfigCard$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $h$delegate;
    final /* synthetic */ MutableState<LaunchConfigIO.State> $loaded$delegate;
    final /* synthetic */ MutableFloatState $mem$delegate;
    final /* synthetic */ String $resErr;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<String> $w$delegate;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LaunchPageKt$ConfigCard$2$1(String str, MutableState<LaunchConfigIO.State> mutableState, MutableFloatState mutableFloatState, MutableState<String> mutableState2, MutableState<String> mutableState3, Context context, AppState appState, Continuation<? super LaunchPageKt$ConfigCard$2$1> continuation) {
        super(2, continuation);
        this.$resErr = str;
        this.$loaded$delegate = mutableState;
        this.$mem$delegate = mutableFloatState;
        this.$w$delegate = mutableState2;
        this.$h$delegate = mutableState3;
        this.$ctx = context;
        this.$state = appState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LaunchPageKt$ConfigCard$2$1(this.$resErr, this.$loaded$delegate, this.$mem$delegate, this.$w$delegate, this.$h$delegate, this.$ctx, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LaunchPageKt$ConfigCard$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.LaunchPageKt$ConfigCard$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings invokeSuspend$lambda$0$0(LaunchConfigLogic.Display $d, UiSettings it) {
        return UiSettings.copy$default(it, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, $d.getMemoryMb(), $d.getWidth(), $d.getHeight(), null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -939524097, SPV.kDefaultMaxIdBound, null);
    }
}
