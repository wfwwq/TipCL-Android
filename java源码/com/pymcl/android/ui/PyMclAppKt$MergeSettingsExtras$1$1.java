package com.pymcl.android.ui;

import android.content.Context;
import androidx.compose.runtime.SnapshotStateKt;
import com.pymcl.android.data.SettingsLogic;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.UiSettings;
import com.pymcl.android.ui.theme.BgPreset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PyMclApp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.PyMclAppKt$MergeSettingsExtras$1$1", f = "PyMclApp.kt", i = {0, 1}, l = {119, 120}, m = "invokeSuspend", n = {"start", "start"}, nl = {120, 121}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes20.dex */
final class PyMclAppKt$MergeSettingsExtras$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ AppState $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PyMclAppKt$MergeSettingsExtras$1$1(AppState appState, Context context, Continuation<? super PyMclAppKt$MergeSettingsExtras$1$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PyMclAppKt$MergeSettingsExtras$1$1(this.$state, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PyMclAppKt$MergeSettingsExtras$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r63) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.PyMclAppKt$MergeSettingsExtras$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: PyMclApp.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/android/ui/state/UiSettings;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.PyMclAppKt$MergeSettingsExtras$1$1$1", f = "PyMclApp.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.PyMclAppKt$MergeSettingsExtras$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UiSettings>, Object> {
        final /* synthetic */ UiSettings $start;
        final /* synthetic */ AppState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AppState appState, UiSettings uiSettings, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$state = appState;
            this.$start = uiSettings;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$state, this.$start, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiSettings> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PyMclApp.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/pymcl/android/ui/state/UiSettings;"}, k = 3, mv = {2, 4, 0}, xi = 48)
        @DebugMetadata(c = "com.pymcl.android.ui.PyMclAppKt$MergeSettingsExtras$1$1$1$2", f = "PyMclApp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.pymcl.android.ui.PyMclAppKt$MergeSettingsExtras$1$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<UiSettings, Continuation<? super Boolean>, Object> {
            final /* synthetic */ UiSettings $start;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(UiSettings uiSettings, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$start = uiSettings;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$start, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiSettings uiSettings, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass2) create(uiSettings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                UiSettings it = (UiSettings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        return Boxing.boxBoolean(it != this.$start);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    final AppState appState = this.$state;
                    this.label = 1;
                    Object objFirst = FlowKt.first(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.pymcl.android.ui.PyMclAppKt$MergeSettingsExtras$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return appState.getSettings();
                        }
                    }), new AnonymousClass2(this.$start, null), this);
                    return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiSettings invokeSuspend$lambda$0(Map $snap, UiSettings it) {
        return SettingsLogic.Extras.INSTANCE.applyFrom($snap, it, BgPreset.getEntries().size());
    }
}
