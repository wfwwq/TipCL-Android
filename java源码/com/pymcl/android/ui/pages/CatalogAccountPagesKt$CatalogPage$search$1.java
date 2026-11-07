package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogHit;
import com.pymcl.android.ui.state.CatalogKind;
import com.pymcl.android.ui.state.LatestOnly;
import com.pymcl.android.ui.state.LauncherUiApi;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$search$1", f = "CatalogAccountPages.kt", i = {0}, l = {72}, m = "invokeSuspend", n = {"t"}, nl = {73}, s = {"J$0"}, v = 2)
/* loaded from: classes22.dex */
final class CatalogAccountPagesKt$CatalogPage$search$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $category$delegate;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<Map<String, CatalogHit>> $favHits$delegate;
    final /* synthetic */ MutableState<Set<String>> $favs$delegate;
    final /* synthetic */ MutableState<List<String>> $gameVersions$delegate;
    final /* synthetic */ MutableIntState $gvIndex$delegate;
    final /* synthetic */ MutableState<List<CatalogHit>> $hits$delegate;
    final /* synthetic */ CatalogKind $kind;
    final /* synthetic */ MutableState<String> $query$delegate;
    final /* synthetic */ LatestOnly $searchSeq;
    final /* synthetic */ MutableIntState $source$delegate;
    final /* synthetic */ List<String> $sources;
    final /* synthetic */ AppState $state;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogAccountPagesKt$CatalogPage$search$1(LatestOnly latestOnly, AppState appState, CatalogKind catalogKind, List<String> list, MutableState<List<CatalogHit>> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableIntState mutableIntState, MutableState<List<String>> mutableState4, MutableIntState mutableIntState2, MutableIntState mutableIntState3, MutableState<Set<String>> mutableState5, MutableState<Map<String, CatalogHit>> mutableState6, Continuation<? super CatalogAccountPagesKt$CatalogPage$search$1> continuation) {
        super(2, continuation);
        this.$searchSeq = latestOnly;
        this.$state = appState;
        this.$kind = catalogKind;
        this.$sources = list;
        this.$hits$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$query$delegate = mutableState3;
        this.$source$delegate = mutableIntState;
        this.$gameVersions$delegate = mutableState4;
        this.$gvIndex$delegate = mutableIntState2;
        this.$category$delegate = mutableIntState3;
        this.$favs$delegate = mutableState5;
        this.$favHits$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CatalogAccountPagesKt$CatalogPage$search$1(this.$searchSeq, this.$state, this.$kind, this.$sources, this.$hits$delegate, this.$error$delegate, this.$query$delegate, this.$source$delegate, this.$gameVersions$delegate, this.$gvIndex$delegate, this.$category$delegate, this.$favs$delegate, this.$favHits$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogAccountPagesKt$CatalogPage$search$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        List<CatalogHit> listEmptyList;
        Object objSearchCatalog;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        long next = this.label;
        try {
            switch (next) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    next = this.$searchSeq.next();
                    this.$hits$delegate.setValue(null);
                    this.$error$delegate.setValue(null);
                    str = null;
                    LauncherUiApi api = this.$state.getApi();
                    String key = this.$kind.getKey();
                    String strCatalogPage$lambda$4 = CatalogAccountPagesKt.CatalogPage$lambda$4(this.$query$delegate);
                    String str2 = this.$sources.get(CatalogAccountPagesKt.CatalogPage$lambda$7(this.$source$delegate));
                    List listCatalogPage$lambda$16 = CatalogAccountPagesKt.CatalogPage$lambda$16(this.$gameVersions$delegate);
                    int iCatalogPage$lambda$13 = CatalogAccountPagesKt.CatalogPage$lambda$13(this.$gvIndex$delegate);
                    boolean z = false;
                    if (iCatalogPage$lambda$13 >= 0 && iCatalogPage$lambda$13 < listCatalogPage$lambda$16.size()) {
                        z = true;
                    }
                    String str3 = z ? listCatalogPage$lambda$16.get(iCatalogPage$lambda$13) : "";
                    String str4 = (String) (Intrinsics.areEqual((String) str3, "全部") ? null : str3);
                    String str5 = str4 == null ? "" : str4;
                    this.J$0 = next;
                    this.label = 1;
                    objSearchCatalog = api.searchCatalog(key, strCatalogPage$lambda$4, str2, str5, (String) ((Pair) CatalogAccountPagesKt.CATEGORIES.get(CatalogAccountPagesKt.CatalogPage$lambda$10(this.$category$delegate))).getSecond(), this);
                    if (objSearchCatalog == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    next = this.J$0;
                    str = null;
                    ResultKt.throwOnFailure(obj);
                    objSearchCatalog = obj;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listEmptyList = (List) objSearchCatalog;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = e2.toString();
            }
            str = message;
            listEmptyList = CollectionsKt.emptyList();
        }
        if (!this.$searchSeq.isLatest(next)) {
            return Unit.INSTANCE;
        }
        this.$error$delegate.setValue(str);
        this.$hits$delegate.setValue(listEmptyList);
        MutableState<Set<String>> mutableState = this.$favs$delegate;
        MutableState<Map<String, CatalogHit>> mutableState2 = this.$favHits$delegate;
        for (CatalogHit catalogHit : listEmptyList) {
            if (CatalogAccountPagesKt.CatalogPage$lambda$28(mutableState).contains(catalogHit.getId())) {
                mutableState2.setValue(MapsKt.plus(CatalogAccountPagesKt.CatalogPage$lambda$31(mutableState2), TuplesKt.to(catalogHit.getId(), catalogHit)));
            }
        }
        return Unit.INSTANCE;
    }
}
