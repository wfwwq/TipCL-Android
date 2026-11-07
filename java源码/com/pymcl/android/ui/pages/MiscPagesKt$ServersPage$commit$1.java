package com.pymcl.android.ui.pages;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.SettingsExtrasIO;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.core.instance.ServerEntry;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$commit$1", f = "MiscPages.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, nl = {183}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$ServersPage$commit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<ServerEntry>> $all$delegate;
    final /* synthetic */ MutableState<Boolean> $busy$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $inst$delegate;
    final /* synthetic */ List<ServerEntry> $next;
    final /* synthetic */ String $okBody;
    final /* synthetic */ String $okTitle;
    final /* synthetic */ AppState $state;
    final /* synthetic */ String $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$ServersPage$commit$1(String str, List<ServerEntry> list, AppState appState, String str2, String str3, Context context, MutableState<String> mutableState, MutableState<List<ServerEntry>> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super MiscPagesKt$ServersPage$commit$1> continuation) {
        super(2, continuation);
        this.$target = str;
        this.$next = list;
        this.$state = appState;
        this.$okTitle = str2;
        this.$okBody = str3;
        this.$ctx = context;
        this.$inst$delegate = mutableState;
        this.$all$delegate = mutableState2;
        this.$busy$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiscPagesKt$ServersPage$commit$1(this.$target, this.$next, this.$state, this.$okTitle, this.$okBody, this.$ctx, this.$inst$delegate, this.$all$delegate, this.$busy$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$ServersPage$commit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                try {
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            this.label = 1;
                            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, this.$target, this.$next, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            break;
                        case 1:
                            ResultKt.throwOnFailure($result);
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (Intrinsics.areEqual(this.$target, MiscPagesKt.ServersPage$lambda$4(this.$inst$delegate))) {
                        this.$all$delegate.setValue(this.$next);
                    }
                    this.$state.toast(this.$okTitle, this.$okBody, SettingsProtocol.EXTRA_OK);
                } catch (Exception e) {
                    AppState appState = this.$state;
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.toString();
                    }
                    appState.toast("保存失败", message, "error");
                }
                MiscPagesKt.ServersPage$lambda$14(this.$busy$delegate, false);
                return Unit.INSTANCE;
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Throwable th) {
            MiscPagesKt.ServersPage$lambda$14(this.$busy$delegate, false);
            throw th;
        }
    }

    /* compiled from: MiscPages.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$commit$1$1", f = "MiscPages.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.pages.MiscPagesKt$ServersPage$commit$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ List<ServerEntry> $next;
        final /* synthetic */ String $target;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, String str, List<ServerEntry> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$target = str;
            this.$next = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$target, this.$next, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SettingsExtrasIO.INSTANCE.saveServers(this.$ctx, this.$target, this.$next);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
