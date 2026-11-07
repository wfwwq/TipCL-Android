package com.pymcl.android.ui.pages;

import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogHit;
import com.pymcl.android.ui.state.CatalogKind;
import com.pymcl.android.ui.state.DialogSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1", f = "CatalogAccountPages.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, nl = {133}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CatalogKind $kind;
    final /* synthetic */ AppState $state;
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1(AppState appState, CatalogKind catalogKind, String str, Continuation<? super CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$kind = catalogKind;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1(this.$state, this.$kind, this.$url, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objResolveCatalogLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                objResolveCatalogLink = this.$state.getApi().resolveCatalogLink(this.$kind.getKey(), this.$url, this);
                if (objResolveCatalogLink == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objResolveCatalogLink = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CatalogHit hit = (CatalogHit) objResolveCatalogLink;
        AppState appState = this.$state;
        if (hit == null) {
            appState.toast("无法识别链接", "支持 modrinth.com 与 curseforge.com 的项目链接", "error");
        } else {
            appState.open(new DialogSpec.CatalogFiles(this.$kind, hit));
        }
        return Unit.INSTANCE;
    }
}
