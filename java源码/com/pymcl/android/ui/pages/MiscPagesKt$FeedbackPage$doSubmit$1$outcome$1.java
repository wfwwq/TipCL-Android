package com.pymcl.android.ui.pages;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.pymcl.android.data.FeedbackSubmit;
import com.pymcl.android.data.LauncherPrefs;
import com.pymcl.android.data.LauncherRepository;
import com.pymcl.runtime.settings.CrossProcessPrefs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MiscPages.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/android/data/FeedbackSubmit$Outcome;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1", f = "MiscPages.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes22.dex */
final class MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FeedbackSubmit.Outcome>, Object> {
    final /* synthetic */ String $appVersion;
    final /* synthetic */ MutableState<List<Uri>> $attachments$delegate;
    final /* synthetic */ MutableState<String> $body$delegate;
    final /* synthetic */ MutableState<String> $contact$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableIntState $kind$delegate;
    final /* synthetic */ MutableState<Boolean> $sys$delegate;
    final /* synthetic */ String $sysText;
    final /* synthetic */ MutableState<String> $title$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1(Context context, String str, String str2, MutableIntState mutableIntState, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, MutableState<List<Uri>> mutableState5, Continuation<? super MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$appVersion = str;
        this.$sysText = str2;
        this.$kind$delegate = mutableIntState;
        this.$title$delegate = mutableState;
        this.$body$delegate = mutableState2;
        this.$contact$delegate = mutableState3;
        this.$sys$delegate = mutableState4;
        this.$attachments$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1 miscPagesKt$FeedbackPage$doSubmit$1$outcome$1 = new MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1(this.$ctx, this.$appVersion, this.$sysText, this.$kind$delegate, this.$title$delegate, this.$body$delegate, this.$contact$delegate, this.$sys$delegate, this.$attachments$delegate, continuation);
        miscPagesKt$FeedbackPage$doSubmit$1$outcome$1.L$0 = obj;
        return miscPagesKt$FeedbackPage$doSubmit$1$outcome$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FeedbackSubmit.Outcome> continuation) {
        return ((MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8116constructorimpl;
        Object objM8116constructorimpl2;
        Iterable iterable;
        final CoroutineScope $this$withContext = (CoroutineScope) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final CrossProcessPrefs p = LauncherPrefs.INSTANCE.store(this.$ctx);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(Boxing.boxBoolean(p.getBoolean(LauncherPrefs.FEEDBACK_CONSENT, false)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                    objM8116constructorimpl = boolBoxBoolean;
                }
                boolean zBooleanValue = ((Boolean) objM8116constructorimpl).booleanValue();
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM8116constructorimpl2 = Result.m8116constructorimpl(p.getString(LauncherPrefs.FEEDBACK_URL, null));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM8116constructorimpl2 = Result.m8116constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m8122isFailureimpl(objM8116constructorimpl2)) {
                    objM8116constructorimpl2 = null;
                }
                String str = (String) objM8116constructorimpl2;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                String strDeviceId = FeedbackSubmit.INSTANCE.deviceId(new Function1() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1.invokeSuspend$lambda$2($this$withContext, p, (String) obj);
                    }
                }, new Function2() { // from class: com.pymcl.android.ui.pages.MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1.invokeSuspend$lambda$3($this$withContext, p, (String) obj, (String) obj2);
                    }
                });
                int iFeedbackPage$lambda$1 = MiscPagesKt.FeedbackPage$lambda$1(this.$kind$delegate);
                String strFeedbackPage$lambda$4 = MiscPagesKt.FeedbackPage$lambda$4(this.$title$delegate);
                String strFeedbackPage$lambda$7 = MiscPagesKt.FeedbackPage$lambda$7(this.$body$delegate);
                String strFeedbackPage$lambda$10 = MiscPagesKt.FeedbackPage$lambda$10(this.$contact$delegate);
                String str3 = this.$appVersion;
                String str4 = MiscPagesKt.FeedbackPage$lambda$13(this.$sys$delegate) ? this.$sysText : null;
                Iterable<Uri> iterableFeedbackPage$lambda$16 = MiscPagesKt.FeedbackPage$lambda$16(this.$attachments$delegate);
                Collection arrayList = new ArrayList();
                for (Uri uri : iterableFeedbackPage$lambda$16) {
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment == null) {
                        String string = uri.toString();
                        iterable = iterableFeedbackPage$lambda$16;
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        lastPathSegment = string;
                    } else {
                        iterable = iterableFeedbackPage$lambda$16;
                    }
                    if (lastPathSegment != null) {
                        arrayList.add(lastPathSegment);
                    }
                    iterableFeedbackPage$lambda$16 = iterable;
                }
                FeedbackSubmit.Input input = new FeedbackSubmit.Input(zBooleanValue, str2, strDeviceId, iFeedbackPage$lambda$1, strFeedbackPage$lambda$4, strFeedbackPage$lambda$7, strFeedbackPage$lambda$10, str3, str4, (List) arrayList);
                FeedbackSubmit.Prepared prep = FeedbackSubmit.INSTANCE.prepare(input);
                if (Intrinsics.areEqual(prep, FeedbackSubmit.Prepared.NeedConsent.INSTANCE)) {
                    return null;
                }
                if (prep instanceof FeedbackSubmit.Prepared.Ready) {
                    return FeedbackSubmit.INSTANCE.submit(LauncherRepository.INSTANCE.get(this.$ctx).getHttp(), (FeedbackSubmit.Prepared.Ready) prep);
                }
                throw new NoWhenBranchMatchedException();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$2(CoroutineScope $$this$withContext, CrossProcessPrefs $p, String k) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl($p.getString(k, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(CoroutineScope $$this$withContext, CrossProcessPrefs $p, String k, String v) {
        try {
            Result.Companion companion = Result.INSTANCE;
            $p.putString(k, v);
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
