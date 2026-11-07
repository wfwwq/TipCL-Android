package com.pymcl.android.ui.pages;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.ServerLogic;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.core.instance.ServerEntry;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$importer$1$1$1", f = "MiscPages.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, nl = {196}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$ServersPage$importer$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<ServerEntry>> $all$delegate;
    final /* synthetic */ MutableState<Boolean> $busy$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $inst$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$ServersPage$importer$1$1$1(AppState appState, Context context, Uri uri, MutableState<List<ServerEntry>> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, Continuation<? super MiscPagesKt$ServersPage$importer$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$ctx = context;
        this.$uri = uri;
        this.$all$delegate = mutableState;
        this.$busy$delegate = mutableState2;
        this.$inst$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiscPagesKt$ServersPage$importer$1$1$1(this.$state, this.$ctx, this.$uri, this.$all$delegate, this.$busy$delegate, this.$inst$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$ServersPage$importer$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new MiscPagesKt$ServersPage$importer$1$1$1$text$1(this.$ctx, this.$uri, null), this);
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
        String text = (String) objWithContext;
        if (text == null) {
            this.$state.toast("导入失败", "读不到这个文件", "error");
            return Unit.INSTANCE;
        }
        ServerLogic.ImportResult r = ServerLogic.INSTANCE.importText(text, MiscPagesKt.ServersPage$lambda$7(this.$all$delegate));
        if (r.getAdded().isEmpty()) {
            this.$state.toast("没有可导入的服务器", I18nKt.tr("无法识别 {0} 行，重复 {1} 个", Boxing.boxInt(r.getBadLines().size()), Boxing.boxInt(r.getDuplicates())), "warn");
        } else {
            MiscPagesKt.ServersPage$commit(this.$state, this.$busy$delegate, this.$inst$delegate, this.$ctx, this.$all$delegate, CollectionsKt.plus((Collection) MiscPagesKt.ServersPage$lambda$7(this.$all$delegate), (Iterable) r.getAdded()), I18nKt.tr("已导入 {0} 个服务器", Boxing.boxInt(r.getAdded().size())), (r.getBadLines().isEmpty() && r.getDuplicates() == 0) ? "" : I18nKt.tr("无法识别 {0} 行，重复 {1} 个", Boxing.boxInt(r.getBadLines().size()), Boxing.boxInt(r.getDuplicates())));
        }
        return Unit.INSTANCE;
    }
}
