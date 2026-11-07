package com.pymcl.android.ui.state;

import com.pymcl.android.ui.i18n.I18nKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.state.AppState$installVersion$job$1", f = "AppState.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, nl = {219}, s = {}, v = 2)
/* loaded from: classes20.dex */
final class AppState$installVersion$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    final /* synthetic */ String $instance;
    final /* synthetic */ String $key;
    final /* synthetic */ String $loader;
    final /* synthetic */ String $loaderVersion;
    final /* synthetic */ String $version;
    int label;
    final /* synthetic */ AppState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppState$installVersion$job$1(AppState appState, String str, String str2, String str3, String str4, String str5, String str6, Continuation<? super AppState$installVersion$job$1> continuation) {
        super(2, continuation);
        this.this$0 = appState;
        this.$instance = str;
        this.$version = str2;
        this.$loader = str3;
        this.$loaderVersion = str4;
        this.$id = str5;
        this.$key = str6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppState$installVersion$job$1(this.this$0, this.$instance, this.$version, this.$loader, this.$loaderVersion, this.$id, this.$key, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppState$installVersion$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[Catch: all -> 0x0017, Exception -> 0x001a, CancellationException -> 0x001d, TryCatch #3 {CancellationException -> 0x001d, Exception -> 0x001a, blocks: (B:6:0x0012, B:18:0x0046, B:20:0x0057, B:23:0x0075, B:25:0x008f, B:31:0x00a6, B:30:0x00a1, B:15:0x0024), top: B:48:0x0007, outer: #2 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.AppState$installVersion$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaskRow invokeSuspend$lambda$0(String $vid, TaskRow it) {
        return TaskRow.copy$default(it, null, null, Float.valueOf(1.0f), TaskState.Done, $vid, null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaskRow invokeSuspend$lambda$1(TaskRow it) {
        return TaskRow.copy$default(it, null, null, null, TaskState.Cancelled, I18nKt.tr("已取消", new Object[0]), null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaskRow invokeSuspend$lambda$2(Exception $e, TaskRow it) {
        TaskState taskState = TaskState.Failed;
        String message = $e.getMessage();
        if (message == null) {
            message = $e.toString();
        }
        return TaskRow.copy$default(it, null, null, null, taskState, message, null, 39, null);
    }
}
