package com.pymcl.android.ui.pages;

import android.content.Context;
import android.net.Uri;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogKind;
import com.pymcl.android.ui.state.LauncherUiApi;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "p", "Lkotlin/Function2;", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.CatalogAccountPagesKt$CatalogPage$picker$1$1$2", f = "CatalogAccountPages.kt", i = {0, 1, 1}, l = {89, 90}, m = "invokeSuspend", n = {"p", "p", "f"}, nl = {90, -1}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class CatalogAccountPagesKt$CatalogPage$picker$1$1$2 extends SuspendLambda implements Function2<Function2<? super Float, ? super String, ? extends Unit>, Continuation<? super String>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ String $inst;
    final /* synthetic */ CatalogKind $kind;
    final /* synthetic */ AppState $state;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ String $ver;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogAccountPagesKt$CatalogPage$picker$1$1$2(AppState appState, CatalogKind catalogKind, String str, String str2, Context context, Uri uri, Continuation<? super CatalogAccountPagesKt$CatalogPage$picker$1$1$2> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$kind = catalogKind;
        this.$inst = str;
        this.$ver = str2;
        this.$ctx = context;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CatalogAccountPagesKt$CatalogPage$picker$1$1$2 catalogAccountPagesKt$CatalogPage$picker$1$1$2 = new CatalogAccountPagesKt$CatalogPage$picker$1$1$2(this.$state, this.$kind, this.$inst, this.$ver, this.$ctx, this.$uri, continuation);
        catalogAccountPagesKt$CatalogPage$picker$1$1$2.L$0 = obj;
        return catalogAccountPagesKt$CatalogPage$picker$1$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Function2<? super Float, ? super String, ? extends Unit> function2, Continuation<? super String> continuation) {
        return invoke2((Function2<? super Float, ? super String, Unit>) function2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return ((CatalogAccountPagesKt$CatalogPage$picker$1$1$2) create(function2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        Function2 p = (Function2) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.L$0 = p;
                this.label = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new CatalogAccountPagesKt$CatalogPage$picker$1$1$2$f$1(this.$ctx, this.$uri, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objWithContext = $result;
                break;
            case 2:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        File f = (File) objWithContext;
        LauncherUiApi api = this.$state.getApi();
        String key = this.$kind.getKey();
        String str = this.$inst;
        String str2 = this.$ver;
        String absolutePath = f.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this.L$0 = SpillingKt.nullOutSpilledVariable(p);
        this.L$1 = SpillingKt.nullOutSpilledVariable(f);
        this.label = 2;
        Object objImportLocalFile = api.importLocalFile(key, str, str2, absolutePath, p, this);
        return objImportLocalFile == coroutine_suspended ? coroutine_suspended : objImportLocalFile;
    }
}
