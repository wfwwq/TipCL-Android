package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogHit;
import com.pymcl.android.ui.state.CatalogKind;
import com.pymcl.android.ui.state.LatestOnly;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$1$1", f = "CatalogAccountPages.kt", i = {0, 1, 1}, l = {109, 110}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$LaunchedEffect", "$this$invokeSuspend_u24lambda_u240\\1"}, nl = {110, 320}, s = {"L$0", "L$0", "L$2"}, v = 2)
/* loaded from: classes22.dex */
final class CatalogAccountPagesKt$CatalogPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogAccountPagesKt$CatalogPage$1$1(AppState appState, MutableState<Set<String>> mutableState, MutableState<List<String>> mutableState2, LatestOnly latestOnly, CatalogKind catalogKind, List<String> list, MutableState<List<CatalogHit>> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableIntState mutableIntState3, MutableState<Map<String, CatalogHit>> mutableState6, Continuation<? super CatalogAccountPagesKt$CatalogPage$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$favs$delegate = mutableState;
        this.$gameVersions$delegate = mutableState2;
        this.$searchSeq = latestOnly;
        this.$kind = catalogKind;
        this.$sources = list;
        this.$hits$delegate = mutableState3;
        this.$error$delegate = mutableState4;
        this.$query$delegate = mutableState5;
        this.$source$delegate = mutableIntState;
        this.$gvIndex$delegate = mutableIntState2;
        this.$category$delegate = mutableIntState3;
        this.$favHits$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CatalogAccountPagesKt$CatalogPage$1$1 catalogAccountPagesKt$CatalogPage$1$1 = new CatalogAccountPagesKt$CatalogPage$1$1(this.$state, this.$favs$delegate, this.$gameVersions$delegate, this.$searchSeq, this.$kind, this.$sources, this.$hits$delegate, this.$error$delegate, this.$query$delegate, this.$source$delegate, this.$gvIndex$delegate, this.$category$delegate, this.$favHits$delegate, continuation);
        catalogAccountPagesKt$CatalogPage$1$1.L$0 = obj;
        return catalogAccountPagesKt$CatalogPage$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogAccountPagesKt$CatalogPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:7:0x0021, B:20:0x007b, B:21:0x008b, B:23:0x0091, B:25:0x00a5, B:26:0x00a9, B:27:0x00c4, B:29:0x00ca, B:30:0x00da, B:16:0x005a), top: B:35:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[Catch: all -> 0x0028, LOOP:1: B:27:0x00c4->B:29:0x00ca, LOOP_END, TryCatch #0 {all -> 0x0028, blocks: (B:7:0x0021, B:20:0x007b, B:21:0x008b, B:23:0x0091, B:25:0x00a5, B:26:0x00a9, B:27:0x00c4, B:29:0x00ca, B:30:0x00da, B:16:0x005a), top: B:35:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
