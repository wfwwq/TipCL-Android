package com.pymcl.android.ui.pages;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.FeedbackHistory;
import com.pymcl.android.data.FeedbackLogic;
import com.pymcl.android.data.FeedbackSubmit;
import com.pymcl.android.data.LauncherRepository;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.FeedbackRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1", f = "MiscPages.kt", i = {0, 1, 1, 2, 2}, l = {498, 522, 528}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "outcome", "$this$launch", "outcome"}, nl = {516, 528, 529}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$FeedbackPage$doSubmit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $appVersion;
    final /* synthetic */ MutableState<List<Uri>> $attachments$delegate;
    final /* synthetic */ MutableState<String> $body$delegate;
    final /* synthetic */ MutableState<String> $contact$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<List<FeedbackRecord>> $hist$delegate;
    final /* synthetic */ MutableIntState $kind$delegate;
    final /* synthetic */ String $problem;
    final /* synthetic */ MutableState<Boolean> $sending$delegate;
    final /* synthetic */ AppState $state;
    final /* synthetic */ MutableState<Boolean> $sys$delegate;
    final /* synthetic */ String $sysText;
    final /* synthetic */ MutableState<String> $title$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$FeedbackPage$doSubmit$1(AppState appState, Context context, String str, String str2, MutableIntState mutableIntState, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, MutableState<List<Uri>> mutableState5, String str3, MutableState<List<FeedbackRecord>> mutableState6, MutableState<Boolean> mutableState7, Continuation<? super MiscPagesKt$FeedbackPage$doSubmit$1> continuation) {
        super(2, continuation);
        this.$state = appState;
        this.$ctx = context;
        this.$appVersion = str;
        this.$sysText = str2;
        this.$kind$delegate = mutableIntState;
        this.$title$delegate = mutableState;
        this.$body$delegate = mutableState2;
        this.$contact$delegate = mutableState3;
        this.$sys$delegate = mutableState4;
        this.$attachments$delegate = mutableState5;
        this.$problem = str3;
        this.$hist$delegate = mutableState6;
        this.$sending$delegate = mutableState7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MiscPagesKt$FeedbackPage$doSubmit$1 miscPagesKt$FeedbackPage$doSubmit$1 = new MiscPagesKt$FeedbackPage$doSubmit$1(this.$state, this.$ctx, this.$appVersion, this.$sysText, this.$kind$delegate, this.$title$delegate, this.$body$delegate, this.$contact$delegate, this.$sys$delegate, this.$attachments$delegate, this.$problem, this.$hist$delegate, this.$sending$delegate, continuation);
        miscPagesKt$FeedbackPage$doSubmit$1.L$0 = obj;
        return miscPagesKt$FeedbackPage$doSubmit$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiscPagesKt$FeedbackPage$doSubmit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0257 A[Catch: all -> 0x026e, TryCatch #10 {all -> 0x026e, blocks: (B:132:0x024f, B:134:0x0257, B:135:0x025b, B:140:0x026d, B:115:0x0225, B:116:0x022a), top: B:159:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140 A[Catch: all -> 0x0232, Exception -> 0x0237, CancellationException -> 0x0242, TRY_LEAVE, TryCatch #6 {Exception -> 0x0237, blocks: (B:51:0x00dc, B:75:0x0140), top: B:153:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.pymcl.android.ui.state.AppState] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1] */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.pymcl.android.ui.state.AppState] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit invokeSuspend$lambda$0(kotlinx.coroutines.CoroutineScope r17, android.content.Context r18, java.lang.String r19, com.pymcl.android.ui.state.AppState r20, androidx.compose.runtime.MutableState r21, java.lang.String r22, java.lang.String r23, androidx.compose.runtime.MutableIntState r24, androidx.compose.runtime.MutableState r25, androidx.compose.runtime.MutableState r26, androidx.compose.runtime.MutableState r27, androidx.compose.runtime.MutableState r28, androidx.compose.runtime.MutableState r29, androidx.compose.runtime.MutableState r30, boolean r31) {
        /*
            r1 = r31
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L1c
            r0 = r17
            r2 = 0
            com.pymcl.android.data.LauncherPrefs r3 = com.pymcl.android.data.LauncherPrefs.INSTANCE     // Catch: java.lang.Throwable -> L1c
            r7 = r18
            com.pymcl.runtime.settings.CrossProcessPrefs r3 = r3.store(r7)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "feedback_consent"
            r3.putBoolean(r4, r1)     // Catch: java.lang.Throwable -> L1a
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1a
            kotlin.Result.m8116constructorimpl(r0)     // Catch: java.lang.Throwable -> L1a
            goto L28
        L1a:
            r0 = move-exception
            goto L1f
        L1c:
            r0 = move-exception
            r7 = r18
        L1f:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m8116constructorimpl(r0)
        L28:
            if (r1 == 0) goto L45
            r4 = r19
            r5 = r20
            r6 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            com.pymcl.android.ui.pages.MiscPagesKt.access$FeedbackPage$doSubmit(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L45:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1.invokeSuspend$lambda$0(kotlinx.coroutines.CoroutineScope, android.content.Context, java.lang.String, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, java.lang.String, java.lang.String, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, boolean):kotlin.Unit");
    }

    /* compiled from: MiscPages.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/data/FeedbackHistory$Entry;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1$2", f = "MiscPages.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends FeedbackHistory.Entry>>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ MutableIntState $kind$delegate;
        final /* synthetic */ FeedbackSubmit.Outcome $outcome;
        final /* synthetic */ MutableState<String> $title$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, FeedbackSubmit.Outcome outcome, MutableIntState mutableIntState, MutableState<String> mutableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$outcome = outcome;
            this.$kind$delegate = mutableIntState;
            this.$title$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$ctx, this.$outcome, this.$kind$delegate, this.$title$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends FeedbackHistory.Entry>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<FeedbackHistory.Entry>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<FeedbackHistory.Entry>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return FeedbackHistory.INSTANCE.append(LauncherRepository.INSTANCE.rootDir(this.$ctx), new FeedbackHistory.Entry(((FeedbackSubmit.Outcome.Submitted) this.$outcome).getId(), System.currentTimeMillis(), FeedbackLogic.INSTANCE.getCATEGORY().get(RangesKt.coerceIn(MiscPagesKt.FeedbackPage$lambda$1(this.$kind$delegate), 0, CollectionsKt.getLastIndex(FeedbackLogic.INSTANCE.getCATEGORY()))), StringsKt.trim((CharSequence) MiscPagesKt.FeedbackPage$lambda$4(this.$title$delegate)).toString(), true));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
