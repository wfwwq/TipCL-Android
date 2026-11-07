package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogHit;
import com.pymcl.android.ui.state.CatalogKind;
import com.pymcl.android.ui.state.CatalogRules;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$3$5$1$1$1", f = "CatalogAccountPages.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, nl = {178}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class CatalogAccountPagesKt$CatalogPage$3$5$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Map<String, CatalogHit>> $favHits$delegate;
    final /* synthetic */ MutableState<Set<String>> $favs$delegate;
    final /* synthetic */ CatalogHit $hit;
    final /* synthetic */ CatalogKind $kind;
    final /* synthetic */ AppState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogAccountPagesKt$CatalogPage$3$5$1$1$1(AppState appState, CatalogKind catalogKind, CatalogHit catalogHit, MutableState<Set<String>> mutableState, MutableState<Map<String, CatalogHit>> mutableState2, Continuation<? super CatalogAccountPagesKt$CatalogPage$3$5$1$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$kind = catalogKind;
        this.$hit = catalogHit;
        this.$favs$delegate = mutableState;
        this.$favHits$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CatalogAccountPagesKt$CatalogPage$3$5$1$1$1(this.$state, this.$kind, this.$hit, this.$favs$delegate, this.$favHits$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogAccountPagesKt$CatalogPage$3$5$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object obj;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                obj = this.$state.getApi().toggleFavorite(this.$kind.getKey(), this.$hit.getId(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                obj = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean now = ((Boolean) obj).booleanValue();
        this.$favs$delegate.setValue(CatalogRules.INSTANCE.applyFavorite(CatalogAccountPagesKt.CatalogPage$lambda$28(this.$favs$delegate), this.$hit.getId(), now));
        if (now) {
            this.$favHits$delegate.setValue(MapsKt.plus(CatalogAccountPagesKt.CatalogPage$lambda$31(this.$favHits$delegate), TuplesKt.to(this.$hit.getId(), this.$hit)));
        }
        AppState.toast$default(this.$state, now ? "已收藏" : "已取消收藏", null, null, 6, null);
        return Unit.INSTANCE;
    }
}
