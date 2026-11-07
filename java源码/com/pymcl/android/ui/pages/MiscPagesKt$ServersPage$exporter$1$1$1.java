package com.pymcl.android.ui.pages;

import android.content.Context;
import android.net.Uri;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.core.instance.ServerEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$exporter$1$1$1", f = "MiscPages.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, nl = {208}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$ServersPage$exporter$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ List<ServerEntry> $rows;
    final /* synthetic */ AppState $state;
    final /* synthetic */ String $text;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$ServersPage$exporter$1$1$1(AppState appState, List<ServerEntry> list, Context context, Uri uri, String str, Continuation<? super MiscPagesKt$ServersPage$exporter$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$rows = list;
        this.$ctx = context;
        this.$uri = uri;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiscPagesKt$ServersPage$exporter$1$1$1(this.$state, this.$rows, this.$ctx, this.$uri, this.$text, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$ServersPage$exporter$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new MiscPagesKt$ServersPage$exporter$1$1$1$ok$1(this.$ctx, this.$uri, this.$text, null), this);
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
        boolean ok = ((Boolean) objWithContext).booleanValue();
        AppState appState = this.$state;
        if (ok) {
            AppState.toast$default(appState, "已导出", I18nKt.tr("{0} 个服务器", Boxing.boxInt(this.$rows.size())), null, 4, null);
        } else {
            appState.toast("导出失败", "无法写入所选位置", "error");
        }
        return Unit.INSTANCE;
    }
}
