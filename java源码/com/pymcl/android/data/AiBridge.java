package com.pymcl.android.data;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.pymcl.ai.AiEvent;
import com.pymcl.ai.AiService;
import com.pymcl.ai.AiSettings;
import com.pymcl.ai.AiText;
import com.pymcl.ai.AskAnswer;
import com.pymcl.ai.BgClearResult;
import com.pymcl.ai.BgTaskInfo;
import com.pymcl.ai.ChatInfo;
import com.pymcl.ai.ConfirmAnswer;
import com.pymcl.ai.McpServerStatus;
import com.pymcl.ai.RewindOutcome;
import com.pymcl.ai.Usage;
import com.pymcl.android.data.LauncherRepository;
import com.pymcl.android.ui.state.AiItem;
import com.pymcl.android.ui.state.ChatSummary;
import com.pymcl.android.ui.state.PermissionRule;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AiBridge.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\u001c\u0010\u001a\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001bH\u0082@¢\u0006\u0002\u0010\u001eJ*\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0016J \u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"H\u0016J*\u00102\u001a\u00020\"2\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020(05042\u0006\u00106\u001a\u00020\"H\u0016J\n\u00107\u001a\u0004\u0018\u00010&H\u0016J\u000e\u00108\u001a\u000209H\u0096@¢\u0006\u0002\u0010:J\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020<05H\u0096@¢\u0006\u0002\u0010:J\u0010\u0010=\u001a\u0004\u0018\u00010(H\u0096@¢\u0006\u0002\u0010:J\u000e\u0010>\u001a\u00020(H\u0096@¢\u0006\u0002\u0010:J\u0016\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020(H\u0096@¢\u0006\u0002\u0010AJ\u0016\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00020(H\u0096@¢\u0006\u0002\u0010AJ\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020D052\u0006\u0010)\u001a\u00020(H\u0096@¢\u0006\u0002\u0010AJ\u001e\u0010E\u001a\b\u0012\u0004\u0012\u00020(052\b\u0010F\u001a\u0004\u0018\u00010GH\u0096@¢\u0006\u0002\u0010HJ$\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020(0J2\b\u0010F\u001a\u0004\u0018\u00010GH\u0096@¢\u0006\u0002\u0010HJ\u000e\u0010K\u001a\u00020GH\u0096@¢\u0006\u0002\u0010:J\u0016\u0010L\u001a\u00020,2\u0006\u0010F\u001a\u00020GH\u0096@¢\u0006\u0002\u0010HJ\u0010\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020OH\u0016J\n\u0010P\u001a\u0004\u0018\u00010(H\u0016J\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020R05H\u0096@¢\u0006\u0002\u0010:J.\u0010S\u001a\u00020,2\u0006\u0010T\u001a\u00020(2\u0006\u0010U\u001a\u00020(2\u0006\u0010V\u001a\u00020(2\u0006\u00101\u001a\u00020\"H\u0096@¢\u0006\u0002\u0010WJ\u0016\u0010X\u001a\u00020,2\u0006\u0010Y\u001a\u00020RH\u0096@¢\u0006\u0002\u0010ZJ\u000e\u0010_\u001a\b\u0012\u0004\u0012\u00020\\05H\u0016J\u0010\u0010`\u001a\u00020\"2\u0006\u0010@\u001a\u00020(H\u0016J\b\u0010a\u001a\u00020bH\u0016J\u0012\u0010c\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010d\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016J\u000e\u0010e\u001a\b\u0012\u0004\u0012\u00020(05H\u0016J\u000e\u0010f\u001a\b\u0012\u0004\u0012\u00020g05H\u0016J\b\u0010h\u001a\u00020(H\u0016J\u0014\u0010i\u001a\b\u0012\u0004\u0012\u00020D0%2\u0006\u0010'\u001a\u00020(R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010#R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^Ê\u0001\f\bk\u0012\b\bl\u0012\u0004\b\u0003\u0010\u0000¨\u0006j"}, d2 = {"Lcom/pymcl/android/data/AiBridge;", "Lcom/pymcl/android/data/AiUiExtras;", "context", "Landroid/content/Context;", "api", "Lcom/pymcl/android/data/RepositoryUiApi;", "<init>", "(Landroid/content/Context;Lcom/pymcl/android/data/RepositoryUiApi;)V", "ctx", "kotlin.jvm.PlatformType", "repo", "Lcom/pymcl/android/data/LauncherRepository;", "getRepo", "()Lcom/pymcl/android/data/LauncherRepository;", "host", "Lcom/pymcl/android/data/AiToolHostImpl;", "getHost", "()Lcom/pymcl/android/data/AiToolHostImpl;", NotificationCompat.CATEGORY_SERVICE, "Lcom/pymcl/ai/AiService;", "getService", "()Lcom/pymcl/ai/AiService;", "service$delegate", "Lkotlin/Lazy;", "io", "T", "b", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fmt", "Ljava/text/SimpleDateFormat;", "isRunning", "", "()Z", "send", "Lkotlinx/coroutines/flow/Flow;", "Lcom/pymcl/ai/AiEvent;", TerracottaVpnService.EXTRA_TEXT, "", "chatId", "hidden", "stop", "", "steer", "confirm", SettingsProtocol.EXTRA_OK, "always", "global", "answer", "answers", "", "", "skipped", "pendingCard", "rewind", "Lcom/pymcl/ai/RewindOutcome;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chats", "Lcom/pymcl/android/ui/state/ChatSummary;", "activeChat", "newChat", "setActive", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteChat", "history", "Lcom/pymcl/android/ui/state/AiItem;", "models", "st", "Lcom/pymcl/ai/AiSettings;", "(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "testConnection", "Lkotlin/Pair;", "settings", "saveSettings", "describeError", "e", "", "takeNetNotice", "rules", "Lcom/pymcl/android/ui/state/PermissionRule;", "addRule", "tool", "behavior", "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeRule", "rule", "(Lcom/pymcl/android/ui/state/PermissionRule;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backgroundEvents", "Lcom/pymcl/ai/BgTaskInfo;", "getBackgroundEvents", "()Lkotlinx/coroutines/flow/Flow;", "backgroundTasks", "cancelTask", "clearFinishedTasks", "Lcom/pymcl/ai/BgClearResult;", "needsReport", "report", "mcpToolNames", "mcpStatus", "Lcom/pymcl/ai/McpServerStatus;", "usageText", "sendAsItems", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class AiBridge implements AiUiExtras {
    public static final int $stable = 8;
    private final Context ctx;
    private final SimpleDateFormat fmt;
    private final AiToolHostImpl host;

    /* renamed from: service$delegate, reason: from kotlin metadata */
    private final Lazy service;

    /* compiled from: AiBridge.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge", f = "AiBridge.kt", i = {0, 0, 0, 0}, l = {98}, m = "addRule", n = {"tool", "behavior", "content", "global"}, nl = {-1}, s = {"L$0", "L$1", "L$2", "Z$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$addRule$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AiBridge.this.addRule(null, null, null, false, this);
        }
    }

    /* compiled from: AiBridge.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge", f = "AiBridge.kt", i = {0}, l = {89}, m = "deleteChat", n = {"id"}, nl = {-1}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$deleteChat$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AiBridge.this.deleteChat(null, this);
        }
    }

    /* compiled from: AiBridge.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge", f = "AiBridge.kt", i = {0, 1}, l = {91, 91}, m = "models", n = {"st", "st"}, nl = {91, -1}, s = {"L$0", "L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$models$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AiBridge.this.models(null, this);
        }
    }

    /* compiled from: AiBridge.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge", f = "AiBridge.kt", i = {0}, l = {99}, m = "removeRule", n = {"rule"}, nl = {-1}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$removeRule$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AiBridge.this.removeRule(null, this);
        }
    }

    /* compiled from: AiBridge.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge", f = "AiBridge.kt", i = {0}, l = {94}, m = "saveSettings", n = {"st"}, nl = {-1}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$saveSettings$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AiBridge.this.saveSettings(null, this);
        }
    }

    /* compiled from: AiBridge.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge", f = "AiBridge.kt", i = {0}, l = {88}, m = "setActive", n = {"id"}, nl = {-1}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$setActive$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AiBridge.this.setActive(null, this);
        }
    }

    /* compiled from: AiBridge.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge", f = "AiBridge.kt", i = {0, 1}, l = {92, 92}, m = "testConnection", n = {"st", "st"}, nl = {92, -1}, s = {"L$0", "L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$testConnection$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AiBridge.this.testConnection(null, this);
        }
    }

    public AiBridge(Context context, RepositoryUiApi api) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(api, "api");
        this.ctx = context.getApplicationContext();
        AiLang.INSTANCE.install();
        Context ctx = this.ctx;
        Intrinsics.checkNotNullExpressionValue(ctx, "ctx");
        this.host = new AiToolHostImpl(ctx, api);
        this.service = LazyKt.lazy(new Function0() { // from class: com.pymcl.android.data.AiBridge$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AiBridge.service_delegate$lambda$0(this.f$0);
            }
        });
        this.fmt = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LauncherRepository getRepo() {
        LauncherRepository.Companion companion = LauncherRepository.INSTANCE;
        Context ctx = this.ctx;
        Intrinsics.checkNotNullExpressionValue(ctx, "ctx");
        return companion.get(ctx);
    }

    public final AiToolHostImpl getHost() {
        return this.host;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AiService getService() {
        return (AiService) this.service.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiService service_delegate$lambda$0(final AiBridge this$0) {
        return new AiService(this$0.getRepo().getPaths().getRoot(), this$0.getRepo().getPaths().getCacheDir(), new Function0() { // from class: com.pymcl.android.data.AiBridge$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AiBridge.service_delegate$lambda$0$0(this.f$0);
            }
        }, this$0.host, null, false, null, null, 240, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiSettings service_delegate$lambda$0$0(AiBridge this$0) {
        return AiSettings.INSTANCE.from(this$0.getRepo().getConfig().snapshot());
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AiBridge.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge$io$2", f = "AiBridge.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$io$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $b;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Function1<Continuation<? super T>, Object> function1 = this.$b;
                    this.label = 1;
                    Object objInvoke = function1.invoke(this);
                    return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object io(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(function1, null), continuation);
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public boolean isRunning() {
        return getService().isRunning();
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public Flow<AiEvent> send(String text, String chatId, String hidden) {
        Intrinsics.checkNotNullParameter(text, "text");
        return getService().send(text, chatId, hidden);
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public void stop() {
        getService().stop();
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public boolean steer(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return getService().steer(text);
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public boolean confirm(boolean ok, boolean always, boolean global) {
        return getService().confirm(new ConfirmAnswer(ok, always, global ? "global" : "instance"));
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public boolean answer(Map<String, ? extends List<String>> answers, boolean skipped) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        return getService().answer(new AskAnswer(answers, skipped));
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public AiEvent pendingCard() {
        return getService().pendingCard();
    }

    /* compiled from: AiBridge.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/ChatSummary;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge$chats$2", f = "AiBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$chats$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends ChatSummary>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AiBridge.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends ChatSummary>> continuation) {
            return invoke2((Continuation<? super List<ChatSummary>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<ChatSummary>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Iterable<ChatInfo> iterableListChats = AiBridge.this.getService().listChats();
                    AiBridge aiBridge = AiBridge.this;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableListChats, 10));
                    for (ChatInfo chatInfo : iterableListChats) {
                        String id = chatInfo.getId();
                        String title = chatInfo.getTitle();
                        String str = aiBridge.fmt.format(new Date(1000 * chatInfo.getUpdated()));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        arrayList.add(new ChatSummary(id, title, str));
                        iterableListChats = iterableListChats;
                    }
                    return (List) arrayList;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public Object rewind(Continuation<? super RewindOutcome> continuation) {
        return AiService.rewind$default(getService(), null, continuation, 1, null);
    }

    /* compiled from: AiBridge.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge$activeChat$2", f = "AiBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$activeChat$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AiBridge.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return AiBridge.this.getService().activeChat();
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public Object chats(Continuation<? super List<ChatSummary>> continuation) {
        return io(new AnonymousClass2(null), continuation);
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public Object activeChat(Continuation<? super String> continuation) {
        return io(new AnonymousClass2(null), continuation);
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public Object newChat(Continuation<? super String> continuation) {
        return getService().newChatAwait(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.data.AiUiExtras
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setActive(java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.pymcl.android.data.AiBridge.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            com.pymcl.android.data.AiBridge$setActive$1 r0 = (com.pymcl.android.data.AiBridge.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.AiBridge$setActive$1 r0 = new com.pymcl.android.data.AiBridge$setActive$1
            r0.<init>(r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L4c
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.ai.AiService r3 = r5.getService()
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r4
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r3.setActiveAwait(r6, r0)
            if (r3 != r2) goto L4c
            return r2
        L4c:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiBridge.setActive(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: AiBridge.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/AiItem;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge$history$2", f = "AiBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$history$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends AiItem>>, Object> {
        final /* synthetic */ String $chatId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AiBridge.this.new AnonymousClass2(this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super List<? extends AiItem>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return AiHistory.INSTANCE.withTasks(AiHistory.INSTANCE.toItems(AiBridge.this.getService().messages(this.$chatId)), AiBridge.this.getService().backgroundTasks(this.$chatId));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.data.AiUiExtras
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteChat(java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.pymcl.android.data.AiBridge.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            com.pymcl.android.data.AiBridge$deleteChat$1 r0 = (com.pymcl.android.data.AiBridge.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.AiBridge$deleteChat$1 r0 = new com.pymcl.android.data.AiBridge$deleteChat$1
            r0.<init>(r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L4c
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.ai.AiService r3 = r5.getService()
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r4
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r3.deleteChatAwait(r6, r0)
            if (r3 != r2) goto L4c
            return r2
        L4c:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiBridge.deleteChat(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public Object history(String chatId, Continuation<? super List<? extends AiItem>> continuation) {
        return io(new AnonymousClass2(chatId, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.data.AiUiExtras
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object models(com.pymcl.ai.AiSettings r7, kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.pymcl.android.data.AiBridge.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            com.pymcl.android.data.AiBridge$models$1 r0 = (com.pymcl.android.data.AiBridge.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.AiBridge$models$1 r0 = new com.pymcl.android.data.AiBridge$models$1
            r0.<init>(r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L44;
                case 1: goto L36;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r7 = r2
            com.pymcl.ai.AiSettings r7 = (com.pymcl.ai.AiSettings) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L76
        L36:
            java.lang.Object r3 = r0.L$1
            com.pymcl.ai.AiService r3 = (com.pymcl.ai.AiService) r3
            java.lang.Object r4 = r0.L$0
            r7 = r4
            com.pymcl.ai.AiSettings r7 = (com.pymcl.ai.AiSettings) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r4 = r1
            goto L5f
        L44:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.ai.AiService r3 = r6.getService()
            if (r7 != 0) goto L62
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r4
            r0.L$1 = r3
            r4 = 1
            r0.label = r4
            java.lang.Object r4 = r6.settings(r0)
            if (r4 != r2) goto L5f
            return r2
        L5f:
            com.pymcl.ai.AiSettings r4 = (com.pymcl.ai.AiSettings) r4
            goto L63
        L62:
            r4 = r7
        L63:
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r5
            r5 = 0
            r0.L$1 = r5
            r5 = 2
            r0.label = r5
            java.lang.Object r3 = r3.listModels(r4, r0)
            if (r3 != r2) goto L76
            return r2
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiBridge.models(com.pymcl.ai.AiSettings, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: AiBridge.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/ai/AiSettings;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge$settings$2", f = "AiBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$settings$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super AiSettings>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AiBridge.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AiSettings> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return AiSettings.INSTANCE.from(AiBridge.this.getRepo().getConfig().snapshot());
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.data.AiUiExtras
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object testConnection(com.pymcl.ai.AiSettings r7, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.pymcl.android.data.AiBridge.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            com.pymcl.android.data.AiBridge$testConnection$1 r0 = (com.pymcl.android.data.AiBridge.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.AiBridge$testConnection$1 r0 = new com.pymcl.android.data.AiBridge$testConnection$1
            r0.<init>(r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L44;
                case 1: goto L36;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r7 = r2
            com.pymcl.ai.AiSettings r7 = (com.pymcl.ai.AiSettings) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L76
        L36:
            java.lang.Object r3 = r0.L$1
            com.pymcl.ai.AiService r3 = (com.pymcl.ai.AiService) r3
            java.lang.Object r4 = r0.L$0
            r7 = r4
            com.pymcl.ai.AiSettings r7 = (com.pymcl.ai.AiSettings) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r4 = r1
            goto L5f
        L44:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.ai.AiService r3 = r6.getService()
            if (r7 != 0) goto L62
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r4
            r0.L$1 = r3
            r4 = 1
            r0.label = r4
            java.lang.Object r4 = r6.settings(r0)
            if (r4 != r2) goto L5f
            return r2
        L5f:
            com.pymcl.ai.AiSettings r4 = (com.pymcl.ai.AiSettings) r4
            goto L63
        L62:
            r4 = r7
        L63:
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r5
            r5 = 0
            r0.L$1 = r5
            r5 = 2
            r0.label = r5
            java.lang.Object r3 = r3.testConnection(r4, r0)
            if (r3 != r2) goto L76
            return r2
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiBridge.testConnection(com.pymcl.ai.AiSettings, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: AiBridge.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge$saveSettings$2", f = "AiBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$saveSettings$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
        final /* synthetic */ AiSettings $st;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AiSettings aiSettings, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$st = aiSettings;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AiBridge.this.new AnonymousClass2(this.$st, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return Boxing.boxBoolean(AiBridge.this.getRepo().getConfig().update(this.$st.toConfig()));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public Object settings(Continuation<? super AiSettings> continuation) {
        return io(new AnonymousClass2(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.data.AiUiExtras
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object saveSettings(com.pymcl.ai.AiSettings r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.pymcl.android.data.AiBridge.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            com.pymcl.android.data.AiBridge$saveSettings$1 r0 = (com.pymcl.android.data.AiBridge.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.AiBridge$saveSettings$1 r0 = new com.pymcl.android.data.AiBridge$saveSettings$1
            r0.<init>(r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r6 = r2
            com.pymcl.ai.AiSettings r6 = (com.pymcl.ai.AiSettings) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L50
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.android.data.AiBridge$saveSettings$2 r3 = new com.pymcl.android.data.AiBridge$saveSettings$2
            r4 = 0
            r3.<init>(r6, r4)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r4
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r5.io(r3, r0)
            if (r3 != r2) goto L50
            return r2
        L50:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiBridge.saveSettings(com.pymcl.ai.AiSettings, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public String describeError(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return getService().getClient().describeError(e);
    }

    /* compiled from: AiBridge.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/PermissionRule;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge$rules$2", f = "AiBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$rules$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends PermissionRule>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AiBridge.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends PermissionRule>> continuation) {
            return invoke2((Continuation<? super List<PermissionRule>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<PermissionRule>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Iterable<com.pymcl.ai.PermissionRule> iterablePermissionRules = AiBridge.this.getService().permissionRules();
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterablePermissionRules, 10));
                    for (com.pymcl.ai.PermissionRule permissionRule : iterablePermissionRules) {
                        arrayList.add(new PermissionRule(permissionRule.getToolName(), permissionRule.getBehavior(), permissionRule.getScope(), permissionRule.getRuleContent()));
                    }
                    return (List) arrayList;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public String takeNetNotice() {
        return getService().takeNetNotice();
    }

    /* compiled from: AiBridge.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge$addRule$2", f = "AiBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$addRule$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $behavior;
        final /* synthetic */ String $content;
        final /* synthetic */ boolean $global;
        final /* synthetic */ String $tool;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, String str3, boolean z, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$tool = str;
            this.$behavior = str2;
            this.$content = str3;
            this.$global = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AiBridge.this.new AnonymousClass2(this.$tool, this.$behavior, this.$content, this.$global, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return Boxing.boxBoolean(AiBridge.this.getService().addRule(this.$tool, this.$behavior, this.$content, this.$global));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public Object rules(Continuation<? super List<PermissionRule>> continuation) {
        return io(new AnonymousClass2(null), continuation);
    }

    /* compiled from: AiBridge.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge$removeRule$2", f = "AiBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$removeRule$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
        final /* synthetic */ PermissionRule $rule;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PermissionRule permissionRule, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$rule = permissionRule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AiBridge.this.new AnonymousClass2(this.$rule, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return Boxing.boxBoolean(AiBridge.this.getService().removeRule(new com.pymcl.ai.PermissionRule(this.$rule.getTool(), this.$rule.getContent(), this.$rule.getBehavior(), this.$rule.getScope()).getKey()));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.data.AiUiExtras
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object addRule(java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.pymcl.android.data.AiBridge.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r15
            com.pymcl.android.data.AiBridge$addRule$1 r0 = (com.pymcl.android.data.AiBridge.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.AiBridge$addRule$1 r0 = new com.pymcl.android.data.AiBridge$addRule$1
            r0.<init>(r15)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L44;
                case 1: goto L2e;
                default: goto L24;
            }
        L24:
            r5 = r11
            r6 = r12
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2e:
            boolean r14 = r0.Z$0
            java.lang.Object r2 = r0.L$2
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r0.L$1
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r0.L$0
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r1)
            r4 = r10
            goto L76
        L44:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.android.data.AiBridge$addRule$2 r3 = new com.pymcl.android.data.AiBridge$addRule$2
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r3.<init>(r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r0.L$0 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$1 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$2 = r11
            r0.Z$0 = r8
            r11 = 1
            r0.label = r11
            java.lang.Object r11 = r10.io(r3, r0)
            if (r11 != r2) goto L72
            return r2
        L72:
            r11 = r5
            r12 = r6
            r13 = r7
            r14 = r8
        L76:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiBridge.addRule(java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.data.AiUiExtras
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object removeRule(com.pymcl.android.ui.state.PermissionRule r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.pymcl.android.data.AiBridge.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            com.pymcl.android.data.AiBridge$removeRule$1 r0 = (com.pymcl.android.data.AiBridge.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.AiBridge$removeRule$1 r0 = new com.pymcl.android.data.AiBridge$removeRule$1
            r0.<init>(r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r6 = r2
            com.pymcl.android.ui.state.PermissionRule r6 = (com.pymcl.android.ui.state.PermissionRule) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L50
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.android.data.AiBridge$removeRule$2 r3 = new com.pymcl.android.data.AiBridge$removeRule$2
            r4 = 0
            r3.<init>(r6, r4)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r4
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r5.io(r3, r0)
            if (r3 != r2) goto L50
            return r2
        L50:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiBridge.removeRule(com.pymcl.android.ui.state.PermissionRule, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public Flow<BgTaskInfo> getBackgroundEvents() {
        return getService().getBackgroundEvents();
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public List<BgTaskInfo> backgroundTasks() {
        return AiService.backgroundTasks$default(getService(), null, 1, null);
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public boolean cancelTask(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return getService().cancelTask(id);
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public BgClearResult clearFinishedTasks() {
        return AiService.clearFinishedTasks$default(getService(), null, false, 3, null);
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public boolean needsReport(String chatId) {
        return getService().needsReport(chatId);
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public Flow<AiEvent> report(String chatId) {
        return getService().report(chatId);
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public List<String> mcpToolNames() {
        return getService().mcpToolNames();
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public List<McpServerStatus> mcpStatus() {
        return getService().mcpStatus();
    }

    @Override // com.pymcl.android.data.AiUiExtras
    public String usageText() {
        Usage sessionUsage = getService().getSessionUsage();
        if (sessionUsage.getPrompt() + sessionUsage.getCompletion() == 0) {
            return "";
        }
        return AiText.INSTANCE.t("本会话：输入 {0} / 输出 {1} tokens", Long.valueOf(sessionUsage.getPrompt()), Long.valueOf(sessionUsage.getCompletion())) + (sessionUsage.getEstimated() ? AiText.INSTANCE.t("（估算）", new Object[0]) : "");
    }

    /* compiled from: AiBridge.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/pymcl/android/ui/state/AiItem;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiBridge$sendAsItems$1", f = "AiBridge.kt", i = {0, 0}, l = {113}, m = "invokeSuspend", n = {"$this$flow", "r"}, nl = {114}, s = {"L$0", "L$1"}, v = 2)
    /* renamed from: com.pymcl.android.data.AiBridge$sendAsItems$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super AiItem>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $text;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$text = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = AiBridge.this.new AnonymousClass1(this.$text, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super AiItem> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            FlowCollector $this$flow = (FlowCollector) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    AiItemReducer r = new AiItemReducer();
                    this.L$0 = SpillingKt.nullOutSpilledVariable($this$flow);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(r);
                    this.label = 1;
                    if (AiService.send$default(AiBridge.this.getService(), this.$text, null, null, 6, null).collect(new C01531(r, $this$flow), this) != coroutine_suspended) {
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AiBridge.kt */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        /* renamed from: com.pymcl.android.data.AiBridge$sendAsItems$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01531<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<AiItem> $$this$flow;
            final /* synthetic */ AiItemReducer $r;

            /* JADX WARN: Multi-variable type inference failed */
            C01531(AiItemReducer aiItemReducer, FlowCollector<? super AiItem> flowCollector) {
                this.$r = aiItemReducer;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009a -> B:20:0x00a2). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.pymcl.ai.AiEvent r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
                /*
                    r13 = this;
                    boolean r0 = r15 instanceof com.pymcl.android.data.AiBridge$sendAsItems$1$1$emit$1
                    if (r0 == 0) goto L14
                    r0 = r15
                    com.pymcl.android.data.AiBridge$sendAsItems$1$1$emit$1 r0 = (com.pymcl.android.data.AiBridge$sendAsItems$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r1 = r0.label
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L19
                L14:
                    com.pymcl.android.data.AiBridge$sendAsItems$1$1$emit$1 r0 = new com.pymcl.android.data.AiBridge$sendAsItems$1$1$emit$1
                    r0.<init>(r13, r15)
                L19:
                    java.lang.Object r1 = r0.result
                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r3 = r0.label
                    switch(r3) {
                        case 0: goto L4f;
                        case 1: goto L2c;
                        default: goto L24;
                    }
                L24:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L2c:
                    r3 = 0
                    r4 = 0
                    java.lang.Object r5 = r0.L$5
                    com.pymcl.android.ui.state.AiItem r5 = (com.pymcl.android.ui.state.AiItem) r5
                    java.lang.Object r6 = r0.L$4
                    java.lang.Object r7 = r0.L$3
                    java.util.Iterator r7 = (java.util.Iterator) r7
                    java.lang.Object r8 = r0.L$2
                    kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                    java.lang.Object r9 = r0.L$1
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.lang.Object r10 = r0.L$0
                    r14 = r10
                    com.pymcl.ai.AiEvent r14 = (com.pymcl.ai.AiEvent) r14
                    kotlin.ResultKt.throwOnFailure(r1)
                    r10 = r9
                    r9 = r8
                    r8 = r7
                    r7 = r6
                    r6 = r5
                    r5 = r13
                    goto La2
                L4f:
                    kotlin.ResultKt.throwOnFailure(r1)
                    com.pymcl.android.data.AiItemReducer r3 = r13.$r
                    java.util.List r3 = r3.reduce(r14)
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                    kotlinx.coroutines.flow.FlowCollector<com.pymcl.android.ui.state.AiItem> r4 = r13.$$this$flow
                    r5 = 0
                    java.util.Iterator r6 = r3.iterator()
                    r9 = r3
                    r8 = r4
                    r3 = r5
                    r7 = r6
                    r4 = r13
                L66:
                    boolean r5 = r7.hasNext()
                    if (r5 == 0) goto La7
                    java.lang.Object r6 = r7.next()
                    r5 = r6
                    com.pymcl.android.ui.state.AiItem r5 = (com.pymcl.android.ui.state.AiItem) r5
                    r10 = 0
                    java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
                    r0.L$0 = r11
                    java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
                    r0.L$1 = r11
                    r0.L$2 = r8
                    r0.L$3 = r7
                    java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
                    r0.L$4 = r11
                    java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                    r0.L$5 = r11
                    r11 = 1
                    r0.label = r11
                    java.lang.Object r11 = r8.emit(r5, r0)
                    if (r11 != r2) goto L9a
                    return r2
                L9a:
                    r12 = r5
                    r5 = r4
                    r4 = r10
                    r10 = r9
                    r9 = r8
                    r8 = r7
                    r7 = r6
                    r6 = r12
                La2:
                    r4 = r5
                    r7 = r8
                    r8 = r9
                    r9 = r10
                    goto L66
                La7:
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiBridge.AnonymousClass1.C01531.emit(com.pymcl.ai.AiEvent, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                return emit((AiEvent) value, (Continuation<? super Unit>) $completion);
            }
        }
    }

    public final Flow<AiItem> sendAsItems(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return FlowKt.flow(new AnonymousClass1(text, null));
    }
}
