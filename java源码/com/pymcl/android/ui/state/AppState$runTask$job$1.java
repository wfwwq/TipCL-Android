package com.pymcl.android.ui.state;

import com.pymcl.android.ui.i18n.I18nKt;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.state.AppState$runTask$job$1", f = "AppState.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, nl = {194}, s = {}, v = 2)
/* loaded from: classes20.dex */
final class AppState$runTask$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Function2<? super Float, ? super String, Unit>, Continuation<? super String>, Object> $block;
    final /* synthetic */ String $id;
    final /* synthetic */ String $key;
    final /* synthetic */ Function1<String, Unit> $onDone;
    final /* synthetic */ String $title;
    int label;
    final /* synthetic */ AppState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AppState$runTask$job$1(Function2<? super Function2<? super Float, ? super String, Unit>, ? super Continuation<? super String>, ? extends Object> function2, AppState appState, String str, String str2, Function1<? super String, Unit> function1, String str3, Continuation<? super AppState$runTask$job$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.this$0 = appState;
        this.$id = str;
        this.$title = str2;
        this.$onDone = function1;
        this.$key = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppState$runTask$job$1(this.$block, this.this$0, this.$id, this.$title, this.$onDone, this.$key, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppState$runTask$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Set set;
        Object objInvoke;
        final String r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Function2<Function2<? super Float, ? super String, Unit>, Continuation<? super String>, Object> function2 = this.$block;
                        Function2<? super Float, ? super String, Unit> function2ProgressOf = this.this$0.progressOf(this.$id);
                        this.label = 1;
                        objInvoke = function2.invoke(function2ProgressOf, this);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objInvoke = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r = (String) objInvoke;
            } catch (CancellationException e) {
                this.this$0.updateTask(this.$id, new Function1() { // from class: com.pymcl.android.ui.state.AppState$runTask$job$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AppState$runTask$job$1.invokeSuspend$lambda$1((TaskRow) obj);
                    }
                });
                throw e;
            } catch (Exception e2) {
                if (this.this$0.getTaskJobs().isCancelled(this.$id)) {
                    Unit unit = Unit.INSTANCE;
                    Set set2 = this.this$0.activeTaskKeys;
                    AppState appState = this.this$0;
                    String str = this.$key;
                    synchronized (set2) {
                        appState.activeTaskKeys.remove(str);
                        this.this$0.getTaskJobs().finish(this.$id);
                        return unit;
                    }
                }
                this.this$0.updateTask(this.$id, new Function1() { // from class: com.pymcl.android.ui.state.AppState$runTask$job$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AppState$runTask$job$1.invokeSuspend$lambda$2(e2, (TaskRow) obj);
                    }
                });
                AppState appState2 = this.this$0;
                String strTr = I18nKt.tr("{0} 失败", this.$title);
                String message = e2.getMessage();
                if (message == null) {
                    message = e2.toString();
                }
                appState2.toast(strTr, message, "error");
                set = this.this$0.activeTaskKeys;
                AppState appState3 = this.this$0;
                String str2 = this.$key;
                synchronized (set) {
                    appState3.activeTaskKeys.remove(str2);
                }
            }
            if (this.this$0.getTaskJobs().isCancelled(this.$id)) {
                Unit unit2 = Unit.INSTANCE;
                Set set3 = this.this$0.activeTaskKeys;
                AppState appState4 = this.this$0;
                String str3 = this.$key;
                synchronized (set3) {
                    appState4.activeTaskKeys.remove(str3);
                }
                this.this$0.getTaskJobs().finish(this.$id);
                return unit2;
            }
            this.this$0.updateTask(this.$id, new Function1() { // from class: com.pymcl.android.ui.state.AppState$runTask$job$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AppState$runTask$job$1.invokeSuspend$lambda$0(r, (TaskRow) obj);
                }
            });
            AppState.toast$default(this.this$0, "完成", I18nKt.tr("{0}：{1}", this.$title, r), null, 4, null);
            this.$onDone.invoke(r);
            this.this$0.refreshData();
            set = this.this$0.activeTaskKeys;
            AppState appState5 = this.this$0;
            String str4 = this.$key;
            synchronized (set) {
                appState5.activeTaskKeys.remove(str4);
                this.this$0.getTaskJobs().finish(this.$id);
                return Unit.INSTANCE;
            }
        } catch (Throwable th) {
            Set set4 = this.this$0.activeTaskKeys;
            AppState appState6 = this.this$0;
            String str5 = this.$key;
            synchronized (set4) {
                appState6.activeTaskKeys.remove(str5);
                this.this$0.getTaskJobs().finish(this.$id);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaskRow invokeSuspend$lambda$0(String $r, TaskRow it) {
        return TaskRow.copy$default(it, null, null, Float.valueOf(1.0f), TaskState.Done, $r, null, 35, null);
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
