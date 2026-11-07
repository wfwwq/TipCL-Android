package com.pymcl.android.ui.pages;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.SettingsExtrasIO;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.core.instance.ServerEntry;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "", "", "Lcom/pymcl/core/instance/ServerEntry;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$load$r$1", f = "MiscPages.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$ServersPage$load$r$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Triple<? extends List<? extends String>, ? extends String, ? extends List<? extends ServerEntry>>>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $inst$delegate;
    final /* synthetic */ AppState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$ServersPage$load$r$1(AppState appState, Context context, MutableState<String> mutableState, Continuation<? super MiscPagesKt$ServersPage$load$r$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$ctx = context;
        this.$inst$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MiscPagesKt$ServersPage$load$r$1 miscPagesKt$ServersPage$load$r$1 = new MiscPagesKt$ServersPage$load$r$1(this.$state, this.$ctx, this.$inst$delegate, continuation);
        miscPagesKt$ServersPage$load$r$1.L$0 = obj;
        return miscPagesKt$ServersPage$load$r$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Triple<? extends List<? extends String>, ? extends String, ? extends List<? extends ServerEntry>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Triple<? extends List<String>, String, ? extends List<ServerEntry>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Triple<? extends List<String>, String, ? extends List<ServerEntry>>> continuation) {
        return ((MiscPagesKt$ServersPage$load$r$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        Object next;
        String i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Context context = this.$ctx;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(SettingsExtrasIO.INSTANCE.instanceNames(context));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                List<String> list = this.$state.getInstanceNames().toList();
                if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                    objM8116constructorimpl = list;
                }
                List names = (List) objM8116constructorimpl;
                if (names.contains(MiscPagesKt.ServersPage$lambda$4(this.$inst$delegate))) {
                    i = MiscPagesKt.ServersPage$lambda$4(this.$inst$delegate);
                } else {
                    AppState appState = this.$state;
                    Iterator it = names.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.areEqual((String) next, appState.getSelectedInstance())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    i = (String) next;
                    if (i == null && (i = (String) CollectionsKt.firstOrNull(names)) == null) {
                        i = "";
                    }
                }
                return new Triple(names, i, ((i.length() == 0) && names.isEmpty()) ? CollectionsKt.emptyList() : SettingsExtrasIO.INSTANCE.servers(this.$ctx, i));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
