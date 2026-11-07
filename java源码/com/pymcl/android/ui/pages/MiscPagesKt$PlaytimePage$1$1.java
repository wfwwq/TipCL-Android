package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.PlaytimeRow;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$PlaytimePage$1$1", f = "MiscPages.kt", i = {}, l = {275}, m = "invokeSuspend", n = {}, nl = {586}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$PlaytimePage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $busy$delegate;
    final /* synthetic */ MutableState<List<PlaytimeRow>> $rows$delegate;
    final /* synthetic */ AppState $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$PlaytimePage$1$1(AppState appState, MutableState<Boolean> mutableState, MutableState<List<PlaytimeRow>> mutableState2, Continuation<? super MiscPagesKt$PlaytimePage$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$busy$delegate = mutableState;
        this.$rows$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiscPagesKt$PlaytimePage$1$1(this.$state, this.$busy$delegate, this.$rows$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$PlaytimePage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object playtime;
        MutableState<List<PlaytimeRow>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    MiscPagesKt.PlaytimePage$lambda$14(this.$busy$delegate, true);
                    MutableState<List<PlaytimeRow>> mutableState2 = this.$rows$delegate;
                    this.L$0 = mutableState2;
                    this.label = 1;
                    playtime = this.$state.getApi().getPlaytime(this);
                    if (playtime != coroutine_suspended) {
                        mutableState = mutableState2;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    mutableState = (MutableState) this.L$0;
                    ResultKt.throwOnFailure($result);
                    playtime = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState.setValue(CollectionsKt.sortedWith((Iterable) playtime, new Comparator() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$PlaytimePage$1$1$invokeSuspend$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((PlaytimeRow) t2).getSeconds()), Long.valueOf(((PlaytimeRow) t).getSeconds()));
                }
            }));
            MiscPagesKt.PlaytimePage$lambda$14(this.$busy$delegate, false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            MiscPagesKt.PlaytimePage$lambda$14(this.$busy$delegate, false);
            throw th;
        }
    }
}
