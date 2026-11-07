package com.pymcl.android.data;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.pymcl.ai.AiToolHost;
import com.pymcl.ai.ToolOutput;
import com.pymcl.android.data.LauncherRepository;
import com.pymcl.core.account.Account;
import com.pymcl.core.instance.Instance;
import com.pymcl.core.mods.ModCatalog;
import com.pymcl.core.mods.ResKind;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.process.JavaProcessService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: AiToolHostImpl.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0002J*\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u000e\u0010\u001d\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u001eJ,\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0016J0\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190#2\u0006\u0010 \u001a\u00020\u000f2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0016J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u000fH\u0002JL\u0010'\u001a\u00020(2\u0006\u0010 \u001a\u00020\u000f2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u00152\u001a\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020,0*H\u0096@¢\u0006\u0002\u0010-J\"\u0010.\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0002J0\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0082@¢\u0006\u0002\u00101JL\u00102\u001a\u00020(2\u0006\u00100\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u00152\u001a\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020,0*H\u0082@¢\u0006\u0002\u0010-J&\u00103\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0082@¢\u0006\u0002\u00104J\u0018\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u000208H\u0002J&\u00109\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013j\u0004\u0018\u0001`\u00152\u0006\u00106\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rÊ\u0001\f\b;\u0012\b\b<\u0012\u0004\b\u0003\u0010\u0000¨\u0006:"}, d2 = {"Lcom/pymcl/android/data/AiToolHostImpl;", "Lcom/pymcl/ai/AiToolHost;", "context", "Landroid/content/Context;", "api", "Lcom/pymcl/android/data/RepositoryUiApi;", "<init>", "(Landroid/content/Context;Lcom/pymcl/android/data/RepositoryUiApi;)V", "ctx", "kotlin.jvm.PlatformType", "repo", "Lcom/pymcl/android/data/LauncherRepository;", "getRepo", "()Lcom/pymcl/android/data/LauncherRepository;", "currentInstance", "", "instOf", "Lcom/pymcl/core/instance/Instance;", "a", "", "", "Lcom/pymcl/core/util/JObj;", "versionOf", "i", "gameDir", "Ljava/io/File;", SettingsProtocol.EXTRA_VALUE, "mcOf", "loaderOf", "launcherStateSummary", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "describe", HintConstants.AUTOFILL_HINT_NAME, JavaProcessService.EXTRA_ARGS, "affectedPaths", "", "configFile", "gd", "p", "execute", "Lcom/pymcl/ai/ToolOutput;", NotificationCompat.CATEGORY_PROGRESS, "Lkotlin/Function2;", "", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sourceOf", "search", "kind", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "install", "resolveMod", "(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tail", "f", "n", "", "modInfo", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class AiToolHostImpl implements AiToolHost {
    public static final int $stable = 8;
    private final RepositoryUiApi api;
    private final Context ctx;

    /* compiled from: AiToolHostImpl.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiToolHostImpl", f = "AiToolHostImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {165, 171}, m = "install", n = {"kind", "a", NotificationCompat.CATEGORY_PROGRESS, "k", "query", "hit", "f", "kind", "a", NotificationCompat.CATEGORY_PROGRESS, "k", "query", "hit", "i", SettingsProtocol.EXTRA_VALUE, "mc", "loader", "files", "f"}, nl = {166, 172}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11"}, v = 2)
    /* renamed from: com.pymcl.android.data.AiToolHostImpl$install$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AiToolHostImpl.this.install(null, null, null, this);
        }
    }

    /* compiled from: AiToolHostImpl.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiToolHostImpl", f = "AiToolHostImpl.kt", i = {0, 0, 0}, l = {176}, m = "resolveMod", n = {"i", SettingsProtocol.EXTRA_VALUE, HintConstants.AUTOFILL_HINT_NAME}, nl = {183}, s = {"L$0", "L$1", "L$2"}, v = 2)
    /* renamed from: com.pymcl.android.data.AiToolHostImpl$resolveMod$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AiToolHostImpl.this.resolveMod(null, null, null, this);
        }
    }

    public AiToolHostImpl(Context context, RepositoryUiApi api) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.ctx = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LauncherRepository getRepo() {
        LauncherRepository.Companion companion = LauncherRepository.INSTANCE;
        Context ctx = this.ctx;
        Intrinsics.checkNotNullExpressionValue(ctx, "ctx");
        return companion.get(ctx);
    }

    @Override // com.pymcl.ai.AiToolHost
    public String currentInstance() {
        String strString = getRepo().getConfig().string("default_instance");
        if (strString.length() == 0) {
            String rootName = getRepo().getInstances().getRootName();
            Intrinsics.checkNotNullExpressionValue(rootName, "<get-rootName>(...)");
            strString = rootName;
        }
        return strString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Instance instOf(Map<String, Object> a) {
        String strInstanceArg = AiToolLogic.INSTANCE.instanceArg(a, currentInstance());
        if (!getRepo().getInstances().list().contains(strInstanceArg)) {
            throw new IllegalArgumentException(AiToolLogic.INSTANCE.noInstanceMessage(strInstanceArg, getRepo().getInstances().list()));
        }
        return getRepo().getInstances().get(strInstanceArg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String versionOf(final com.pymcl.core.instance.Instance r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
        /*
            r6 = this;
            java.util.List r0 = r7.versions()
            java.lang.String r1 = "version"
            java.lang.String r1 = com.pymcl.core.util.JsonKt.str(r8, r1)
            r2 = 0
            if (r1 == 0) goto L24
            r3 = r1
            r4 = 0
            r5 = r3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.isBlank(r5)
            if (r5 != 0) goto L20
            boolean r5 = r0.contains(r3)
            if (r5 == 0) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            if (r5 == 0) goto L24
            goto L25
        L24:
            r1 = r2
        L25:
            if (r1 != 0) goto L4f
            com.pymcl.android.data.AiToolLogic r3 = com.pymcl.android.data.AiToolLogic.INSTANCE
            java.util.Map r4 = r7.meta()
            java.lang.String r5 = "mc_version"
            java.lang.String r4 = com.pymcl.core.util.JsonKt.str(r4, r5)
            com.pymcl.android.data.AiToolHostImpl$$ExternalSyntheticLambda2 r5 = new com.pymcl.android.data.AiToolHostImpl$$ExternalSyntheticLambda2
            r5.<init>()
            java.lang.String r2 = r3.pickVersion(r0, r2, r4, r5)
            if (r2 == 0) goto L3f
            goto L50
        L3f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            com.pymcl.android.data.AiToolLogic r3 = com.pymcl.android.data.AiToolLogic.INSTANCE
            java.lang.String r4 = r7.getName()
            java.lang.String r3 = r3.noVersionMessage(r4)
            r2.<init>(r3)
            throw r2
        L4f:
            r2 = r1
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiToolHostImpl.versionOf(com.pymcl.core.instance.Instance, java.util.Map):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long versionOf$lambda$1(Instance $i, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return $i.versionDir(it).lastModified();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File gameDir(Instance i, String v) {
        return i.settings(v, getRepo().getConfig()).gameDir(i.getDir());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String mcOf(Instance i, String v) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AiToolHostImpl aiToolHostImpl = this;
            Map jsonObj = FileUtil.INSTANCE.readJsonObj(i.versionJson(v));
            String str = JsonKt.str(jsonObj, "inheritsFrom");
            if (str == null) {
                str = JsonKt.str(jsonObj, "id");
            }
            objM8116constructorimpl = Result.m8116constructorimpl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        String str2 = (String) objM8116constructorimpl;
        return str2 == null ? v : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String loaderOf(String v) {
        return AiToolLogic.INSTANCE.loaderOf(v);
    }

    /* compiled from: AiToolHostImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiToolHostImpl$launcherStateSummary$2", f = "AiToolHostImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.AiToolHostImpl$launcherStateSummary$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = AiToolHostImpl.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objM8116constructorimpl;
            String name;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    AiToolHostImpl aiToolHostImpl = AiToolHostImpl.this;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        String strCurrentInstance = aiToolHostImpl.currentInstance();
                        String strJoinToString$default = CollectionsKt.joinToString$default(aiToolHostImpl.getRepo().getInstances().get(strCurrentInstance).versions(), "、", null, null, 0, null, null, 62, null);
                        if (strJoinToString$default.length() == 0) {
                            strJoinToString$default = "无";
                        }
                        String strJoinToString$default2 = CollectionsKt.joinToString$default(aiToolHostImpl.getRepo().getInstances().list(), "、", null, null, 0, null, null, 62, null);
                        Account accountActive = aiToolHostImpl.getRepo().getAccounts().active();
                        if (accountActive == null || (name = accountActive.getName()) == null) {
                            name = "未添加";
                        }
                        objM8116constructorimpl = Result.m8116constructorimpl("当前实例：" + strCurrentInstance + "（已装版本：" + ((Object) strJoinToString$default) + "）；全部实例：" + strJoinToString$default2 + "；账号：" + name + "；平台：Android");
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                    }
                    return Result.m8122isFailureimpl(objM8116constructorimpl) ? "" : objM8116constructorimpl;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.ai.AiToolHost
    public Object launcherStateSummary(Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
    }

    @Override // com.pymcl.ai.AiToolHost
    public String describe(String name, Map<String, Object> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        return AiToolLogic.INSTANCE.describe(name, args);
    }

    @Override // com.pymcl.ai.AiToolHost
    public List<File> affectedPaths(String name, final Map<String, Object> args) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            Result.Companion companion = Result.INSTANCE;
            final AiToolHostImpl aiToolHostImpl = this;
            final Instance instanceInstOf = aiToolHostImpl.instOf(args);
            objM8116constructorimpl = Result.m8116constructorimpl(AiToolLogic.INSTANCE.affectedPaths(name, args, new Function0() { // from class: com.pymcl.android.data.AiToolHostImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AiToolHostImpl.affectedPaths$lambda$0$0(this.f$0, instanceInstOf, args);
                }
            }, new Function1() { // from class: com.pymcl.android.data.AiToolHostImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AiToolHostImpl.affectedPaths$lambda$0$1(this.f$0, (String) obj);
                }
            }));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = listEmptyList;
        }
        return (List) objM8116constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File affectedPaths$lambda$0$0(AiToolHostImpl $this_runCatching, Instance $i, Map $args) {
        return $this_runCatching.gameDir($i, $this_runCatching.versionOf($i, $args));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File affectedPaths$lambda$0$1(AiToolHostImpl $this_runCatching, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return $this_runCatching.getRepo().getInstances().get(it).getDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File configFile(File gd, String p) {
        return AiToolLogic.INSTANCE.configFile(gd, p);
    }

    /* compiled from: AiToolHostImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/ai/ToolOutput;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.AiToolHostImpl$execute$2", f = "AiToolHostImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 11, 11, 11, 12, 13, 14, 15, 16, 17, 18, 18, 19, 19, 20, 20, 20, 21, 21, 21, 21, 22, 22, 22, 22, 23, 23, 23, 23, 24, 25, 25, 26, 26, 26, 27, 27, 27}, l = {66, 69, 71, 75, 76, 80, 87, 88, 89, 90, 92, 95, 98, 99, 100, 101, 102, 103, 104, 105, 108, 110, 111, 112, 116, 119, 123, 137}, m = "invokeSuspend", n = {"$this$withContext", "cur", "i", "$this$withContext", "cur", "i", "vs", "mods", "$this$withContext", "cur", "i", "vs", "mods", "$this$withContext", "$this$withContext", "i", "$this$withContext", "q", "kind", "$this$withContext", "$this$withContext", "$this$withContext", "$this$withContext", "$this$withContext", "i", SettingsProtocol.EXTRA_VALUE, "$this$withContext", "i", "loader", "$this$withContext", "$this$withContext", "$this$withContext", "$this$withContext", "$this$withContext", "$this$withContext", "$this$withContext", "n", "$this$withContext", "n", "$this$withContext", "i", SettingsProtocol.EXTRA_VALUE, "$this$withContext", "i", SettingsProtocol.EXTRA_VALUE, "fn", "$this$withContext", "i", SettingsProtocol.EXTRA_VALUE, "fn", "$this$withContext", "i", SettingsProtocol.EXTRA_VALUE, "fn", "$this$withContext", "$this$withContext", "m", "$this$withContext", "i", SettingsProtocol.EXTRA_VALUE, "$this$withContext", "i", SettingsProtocol.EXTRA_VALUE}, nl = {67, 187, 195, 199, 203, 81, 88, 89, 90, 91, 224, 96, 99, 100, 101, 102, 103, 104, 105, 107, 109, 111, 112, 114, 228, 122, 124, 138}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "I$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
    /* renamed from: com.pymcl.android.data.AiToolHostImpl$execute$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ToolOutput>, Object> {
        final /* synthetic */ Map<String, Object> $args;
        final /* synthetic */ String $name;
        final /* synthetic */ Function2<Float, String, Unit> $progress;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        final /* synthetic */ AiToolHostImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, AiToolHostImpl aiToolHostImpl, Map<String, Object> map, Function2<? super Float, ? super String, Unit> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$name = str;
            this.this$0 = aiToolHostImpl;
            this.$args = map;
            this.$progress = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$name, this.this$0, this.$args, this.$progress, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ToolOutput> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:102:0x0434, code lost:
        
            if (r0.equals("disable_mod") == false) goto L386;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0438, code lost:
        
            r0 = r32.this$0.instOf(r32.$args);
            r2 = r32.this$0.versionOf(r0, r32.$args);
            r32.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24);
            r32.L$1 = r0;
            r32.L$2 = r2;
            r32.label = 21;
            r4 = r32.this$0.resolveMod(r0, r2, com.pymcl.android.data.AiToolLogic.INSTANCE.required(r32.$args, "filename"), r32);
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0467, code lost:
        
            if (r4 != r3) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x0469, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x046a, code lost:
        
            r11 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x02d8, code lost:
        
            if (r0.equals("enable_mod") == false) goto L386;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x032c, code lost:
        
            if (r0.equals("delete_mod") == false) goto L386;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:219:0x0911 A[LOOP:0: B:217:0x090b->B:219:0x0911, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:231:0x09c5 A[LOOP:8: B:229:0x09bf->B:231:0x09c5, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:268:0x0bb3 A[LOOP:1: B:266:0x0bad->B:268:0x0bb3, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:279:0x0c56 A[LOOP:9: B:277:0x0c50->B:279:0x0c56, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:308:0x0d7d  */
        /* JADX WARN: Removed duplicated region for block: B:319:0x0da2  */
        /* JADX WARN: Removed duplicated region for block: B:320:0x0da7  */
        /* JADX WARN: Removed duplicated region for block: B:322:0x0daa  */
        /* JADX WARN: Removed duplicated region for block: B:326:0x0db9  */
        /* JADX WARN: Removed duplicated region for block: B:337:0x0dde  */
        /* JADX WARN: Removed duplicated region for block: B:338:0x0de3  */
        /* JADX WARN: Removed duplicated region for block: B:341:0x0de7  */
        /* JADX WARN: Removed duplicated region for block: B:345:0x0e05 A[LOOP:4: B:343:0x0dff->B:345:0x0e05, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:348:0x0e3a  */
        /* JADX WARN: Removed duplicated region for block: B:349:0x0e3c  */
        /* JADX WARN: Removed duplicated region for block: B:351:0x0e3f  */
        /* JADX WARN: Removed duplicated region for block: B:352:0x0e44  */
        /* JADX WARN: Removed duplicated region for block: B:356:0x0e6c  */
        /* JADX WARN: Removed duplicated region for block: B:362:0x0ea1 A[LOOP:6: B:360:0x0e9b->B:362:0x0ea1, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:366:0x0f11 A[LOOP:7: B:364:0x0f0b->B:366:0x0f11, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:381:0x0fd3  */
        /* JADX WARN: Removed duplicated region for block: B:382:0x0fee  */
        /* JADX WARN: Removed duplicated region for block: B:394:0x105b A[Catch: all -> 0x10b0, TryCatch #0 {all -> 0x10b0, blocks: (B:392:0x1044, B:394:0x105b, B:396:0x1062), top: B:445:0x1044 }] */
        /* JADX WARN: Removed duplicated region for block: B:407:0x10a0  */
        /* JADX WARN: Removed duplicated region for block: B:417:0x10cb  */
        /* JADX WARN: Removed duplicated region for block: B:420:0x1122 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:421:0x1123  */
        /* JADX WARN: Removed duplicated region for block: B:425:0x114b A[LOOP:11: B:423:0x1145->B:425:0x114b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:429:0x118f A[LOOP:12: B:427:0x1189->B:429:0x118f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:432:0x1229 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:433:0x122a  */
        /* JADX WARN: Removed duplicated region for block: B:437:0x124a A[LOOP:10: B:435:0x1244->B:437:0x124a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:440:0x12b4  */
        /* JADX WARN: Removed duplicated region for block: B:441:0x12b9  */
        /* JADX WARN: Removed duplicated region for block: B:455:0x0d9d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:460:0x0dd9 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.io.UnsupportedEncodingException {
            /*
                Method dump skipped, instructions count: 5076
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiToolHostImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$15(String it) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$16(Function2 $progress, Float p) {
            $progress.invoke(p, "启动中");
            return Unit.INSTANCE;
        }
    }

    @Override // com.pymcl.ai.AiToolHost
    public Object execute(String name, Map<String, Object> map, Function2<? super Float, ? super String, Unit> function2, Continuation<? super ToolOutput> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(name, this, map, function2, null), continuation);
    }

    private final String sourceOf(Map<String, Object> a) {
        return AiToolLogic.INSTANCE.sourceOf(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object search(String kind, Map<String, Object> map, Continuation<? super ToolOutput> continuation) {
        String q = AiToolLogic.INSTANCE.required(map, "query");
        List hits = ModCatalog.search$default(getRepo().getCatalog(), ResKind.INSTANCE.of(kind), StringsKt.trim((CharSequence) q).toString(), sourceOf(map), null, null, 0, 56, null);
        return ToolOutput.INSTANCE.json(AiToolLogic.INSTANCE.searchJson(hits), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object install(java.lang.String r26, java.util.Map<java.lang.String, java.lang.Object> r27, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.String, kotlin.Unit> r28, kotlin.coroutines.Continuation<? super com.pymcl.ai.ToolOutput> r29) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiToolHostImpl.install(java.lang.String, java.util.Map, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveMod(com.pymcl.core.instance.Instance r18, java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation<? super java.lang.String> r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r21
            boolean r2 = r1 instanceof com.pymcl.android.data.AiToolHostImpl.AnonymousClass1
            if (r2 == 0) goto L18
            r2 = r1
            com.pymcl.android.data.AiToolHostImpl$resolveMod$1 r2 = (com.pymcl.android.data.AiToolHostImpl.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.pymcl.android.data.AiToolHostImpl$resolveMod$1 r2 = new com.pymcl.android.data.AiToolHostImpl$resolveMod$1
            r2.<init>(r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            switch(r5) {
                case 0: goto L49;
                case 1: goto L34;
                default: goto L28;
            }
        L28:
            r9 = r19
            r8 = r20
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L34:
            java.lang.Object r4 = r2.L$3
            com.pymcl.android.data.AiToolLogic r4 = (com.pymcl.android.data.AiToolLogic) r4
            java.lang.Object r5 = r2.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.L$0
            com.pymcl.core.instance.Instance r7 = (com.pymcl.core.instance.Instance) r7
            kotlin.ResultKt.throwOnFailure(r3)
            r8 = r3
            goto L78
        L49:
            kotlin.ResultKt.throwOnFailure(r3)
            com.pymcl.android.data.AiToolLogic r5 = com.pymcl.android.data.AiToolLogic.INSTANCE
            com.pymcl.android.data.RepositoryUiApi r6 = r0.api
            java.lang.String r7 = r18.getName()
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r2.L$0 = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r2.L$1 = r8
            r8 = r20
            r2.L$2 = r8
            r2.L$3 = r5
            r9 = 1
            r2.label = r9
            r9 = r19
            java.lang.Object r6 = r6.getInstalledMods(r7, r9, r2)
            if (r6 != r4) goto L72
            return r4
        L72:
            r7 = r18
            r4 = r5
            r5 = r8
            r8 = r6
            r6 = r9
        L78:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r11)
            r10.<init>(r11)
            java.util.Collection r10 = (java.util.Collection) r10
            r11 = r8
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        L8e:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto La5
            java.lang.Object r14 = r13.next()
            r15 = r14
            com.pymcl.android.ui.state.InstalledEntry r15 = (com.pymcl.android.ui.state.InstalledEntry) r15
            r16 = 0
            java.lang.String r15 = r15.getFilename()
            r10.add(r15)
            goto L8e
        La5:
            java.util.List r10 = (java.util.List) r10
            java.lang.String r4 = r4.resolveModName(r10, r5)
            if (r4 == 0) goto Lb0
            return r4
        Lb0:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            com.pymcl.android.data.AiToolLogic r8 = com.pymcl.android.data.AiToolLogic.INSTANCE
            java.lang.String r8 = r8.noModMessage(r5)
            r4.<init>(r8)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiToolHostImpl.resolveMod(com.pymcl.core.instance.Instance, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String tail(File f, int n) {
        return AiToolLogic.INSTANCE.tail(f, n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> modInfo(File f) {
        return AiToolLogic.INSTANCE.modInfo(f);
    }
}
