package com.pymcl.android.ui.pages;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.SettingsExtrasIO;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$PlaytimePage$2$1", f = "MiscPages.kt", i = {0}, l = {284}, m = "invokeSuspend", n = {"d"}, nl = {285}, s = {"L$0"}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$PlaytimePage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $detail$delegate;
    final /* synthetic */ MutableState<List<SettingsExtrasIO.SessionRow>> $sessions$delegate;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$PlaytimePage$2$1(MutableState<List<SettingsExtrasIO.SessionRow>> mutableState, MutableState<String> mutableState2, Context context, Continuation<? super MiscPagesKt$PlaytimePage$2$1> continuation) {
        super(2, continuation);
        this.$sessions$delegate = mutableState;
        this.$detail$delegate = mutableState2;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiscPagesKt$PlaytimePage$2$1(this.$sessions$delegate, this.$detail$delegate, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$PlaytimePage$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        MutableState<List<SettingsExtrasIO.SessionRow>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$sessions$delegate.setValue(null);
                String d = MiscPagesKt.PlaytimePage$lambda$4(this.$detail$delegate);
                if (d != null) {
                    MutableState<List<SettingsExtrasIO.SessionRow>> mutableState2 = this.$sessions$delegate;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(d);
                    this.L$1 = mutableState2;
                    this.label = 1;
                    objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, d, null), this);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    break;
                } else {
                    return Unit.INSTANCE;
                }
            case 1:
                mutableState = (MutableState) this.L$1;
                ResultKt.throwOnFailure($result);
                objWithContext = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableState.setValue((List) objWithContext);
        return Unit.INSTANCE;
    }

    /* compiled from: MiscPages.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/data/SettingsExtrasIO$SessionRow;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$PlaytimePage$2$1$1", f = "MiscPages.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.pages.MiscPagesKt$PlaytimePage$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SettingsExtrasIO.SessionRow>>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ String $d;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$ctx, this.$d, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SettingsExtrasIO.SessionRow>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SettingsExtrasIO.SessionRow>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SettingsExtrasIO.SessionRow>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objM8116constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Context context = this.$ctx;
                    String str = this.$d;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(SettingsExtrasIO.sessions$default(SettingsExtrasIO.INSTANCE, context, str, 0, 4, null));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                    }
                    return Result.m8122isFailureimpl(objM8116constructorimpl) ? CollectionsKt.emptyList() : objM8116constructorimpl;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
