package com.pymcl.ai;

import com.pymcl.multiplayer.TerracottaVpnService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: AiService.kt */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010;\u001a\b\u0012\u0004\u0012\u0002080<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>J\u000e\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020>J\u001c\u0010A\u001a\u00020B2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010C\u001a\u00020\rJ\u0012\u0010D\u001a\u00020\r2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>J\u001a\u0010E\u001a\n\u0012\u0004\u0012\u00020F\u0018\u0001072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>J\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H0<J\f\u0010I\u001a\b\u0012\u0004\u0012\u00020>0<J\f\u0010V\u001a\b\u0012\u0004\u0012\u00020W0<J\b\u0010X\u001a\u0004\u0018\u00010>J\u0006\u0010Y\u001a\u00020>J\u000e\u0010Z\u001a\u00020\r2\u0006\u0010@\u001a\u00020>J\u000e\u0010[\u001a\u00020\\2\u0006\u0010@\u001a\u00020>J&\u0010]\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020>\u0012\u0006\u0012\u0004\u0018\u00010\u00010^j\u0002`_0<2\u0006\u0010@\u001a\u00020>J,\u0010`\u001a\b\u0012\u0004\u0012\u00020F072\u0006\u0010a\u001a\u00020>2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010>J\u0006\u0010c\u001a\u00020\\J\u000e\u0010d\u001a\u00020\\H\u0086@¢\u0006\u0002\u0010eJ\u000e\u0010f\u001a\u00020>H\u0086@¢\u0006\u0002\u0010eJ\u0016\u0010g\u001a\u00020\r2\u0006\u0010@\u001a\u00020>H\u0086@¢\u0006\u0002\u0010hJ\u0018\u0010i\u001a\u0004\u0018\u00010\\2\u0006\u0010@\u001a\u00020>H\u0086@¢\u0006\u0002\u0010hJ\b\u0010j\u001a\u0004\u0018\u00010>J\u000e\u0010k\u001a\u00020\r2\u0006\u0010a\u001a\u00020>J\u000e\u0010l\u001a\u00020\r2\u0006\u0010m\u001a\u00020nJ\u000e\u0010o\u001a\u00020\r2\u0006\u0010m\u001a\u00020pJ\b\u0010q\u001a\u0004\u0018\u00010FJ\u001a\u0010r\u001a\u00020s2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>H\u0086@¢\u0006\u0002\u0010hJ\u001e\u0010t\u001a\b\u0012\u0004\u0012\u00020>0<2\b\b\u0002\u0010u\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010vJ$\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020>0x2\b\b\u0002\u0010u\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010vJ\f\u0010y\u001a\b\u0012\u0004\u0012\u00020z0<J&\u0010{\u001a\u00020\r2\u0006\u0010|\u001a\u00020>2\u0006\u0010}\u001a\u00020>2\u0006\u0010~\u001a\u00020>2\u0006\u0010\u007f\u001a\u00020\rJ\u0010\u0010\u0080\u0001\u001a\u00020\r2\u0007\u0010\u0081\u0001\u001a\u00020>R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00106\u001a\b\u0012\u0004\u0012\u000208078F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0010\u0010J\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010M\u001a\u0004\u0018\u00010>2\b\u0010L\u001a\u0004\u0018\u00010>@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010P\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010R\u001a\u00020S8F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006\u0082\u0001"}, d2 = {"Lcom/pymcl/ai/AiService;", "", "root", "Ljava/io/File;", "cacheDir", "settings", "Lkotlin/Function0;", "Lcom/pymcl/ai/AiSettings;", "host", "Lcom/pymcl/ai/AiToolHost;", "http", "Lcom/pymcl/ai/AiHttp;", "background", "", "mcpHttp", "Lcom/pymcl/ai/McpHttp;", "hookHttp", "Lcom/pymcl/ai/HookHttp;", "<init>", "(Ljava/io/File;Ljava/io/File;Lkotlin/jvm/functions/Function0;Lcom/pymcl/ai/AiToolHost;Lcom/pymcl/ai/AiHttp;ZLcom/pymcl/ai/McpHttp;Lcom/pymcl/ai/HookHttp;)V", "client", "Lcom/pymcl/ai/AiClient;", "getClient", "()Lcom/pymcl/ai/AiClient;", "chats", "Lcom/pymcl/ai/ChatStore;", "getChats", "()Lcom/pymcl/ai/ChatStore;", "perms", "Lcom/pymcl/ai/PermissionStore;", "getPerms", "()Lcom/pymcl/ai/PermissionStore;", "checkpoints", "Lcom/pymcl/ai/CheckpointStore;", "getCheckpoints", "()Lcom/pymcl/ai/CheckpointStore;", "tasks", "Lcom/pymcl/ai/BackgroundTasks;", "getTasks", "()Lcom/pymcl/ai/BackgroundTasks;", "mcp", "Lcom/pymcl/ai/McpManager;", "getMcp", "()Lcom/pymcl/ai/McpManager;", "hooks", "Lcom/pymcl/ai/HookRunner;", "getHooks", "()Lcom/pymcl/ai/HookRunner;", "audit", "Lcom/pymcl/ai/AuditLog;", "getAudit", "()Lcom/pymcl/ai/AuditLog;", "agent", "Lcom/pymcl/ai/AiAgent;", "backgroundEvents", "Lkotlinx/coroutines/flow/Flow;", "Lcom/pymcl/ai/BgTaskInfo;", "getBackgroundEvents", "()Lkotlinx/coroutines/flow/Flow;", "backgroundTasks", "", "chatId", "", "cancelTask", "id", "clearFinishedTasks", "Lcom/pymcl/ai/BgClearResult;", "keepUnreported", "needsReport", "report", "Lcom/pymcl/ai/AiEvent;", "mcpStatus", "Lcom/pymcl/ai/McpServerStatus;", "mcpToolNames", "job", "Lkotlinx/coroutines/Job;", "value", "runningChat", "getRunningChat", "()Ljava/lang/String;", "isRunning", "()Z", "sessionUsage", "Lcom/pymcl/ai/Usage;", "getSessionUsage", "()Lcom/pymcl/ai/Usage;", "listChats", "Lcom/pymcl/ai/ChatInfo;", "activeChat", "newChat", "setActive", "deleteChat", "", "messages", "", "Lcom/pymcl/core/util/JObj;", "send", TerracottaVpnService.EXTRA_TEXT, "hidden", "stop", "stopAndJoin", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newChatAwait", "setActiveAwait", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteChatAwait", "takeNetNotice", "steer", "confirm", "a", "Lcom/pymcl/ai/ConfirmAnswer;", "answer", "Lcom/pymcl/ai/AskAnswer;", "pendingCard", "rewind", "Lcom/pymcl/ai/RewindOutcome;", "listModels", "st", "(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "testConnection", "Lkotlin/Pair;", "permissionRules", "Lcom/pymcl/ai/PermissionRule;", "addRule", "tool", "behavior", "content", "global", "removeRule", "key", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiService {
    private final AiAgent agent;
    private final AuditLog audit;
    private final ChatStore chats;
    private final CheckpointStore checkpoints;
    private final AiClient client;
    private final HookRunner hooks;
    private final AiToolHost host;
    private volatile Job job;
    private final McpManager mcp;
    private final PermissionStore perms;
    private volatile String runningChat;
    private final Function0<AiSettings> settings;
    private final BackgroundTasks tasks;

    /* compiled from: AiService.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiService", f = "AiService.kt", i = {0, 0}, l = {110}, m = "stopAndJoin", n = {"j", "$this$stopAndJoin_u24lambda_u240"}, nl = {110}, s = {"L$0", "L$1"}, v = 2)
    /* renamed from: com.pymcl.ai.AiService$stopAndJoin$1, reason: invalid class name */
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
            return AiService.this.stopAndJoin(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AiService(File root, File cacheDir, Function0<AiSettings> settings, AiToolHost host, AiHttp http, boolean z, McpHttp mcpHttp, HookHttp hookHttp) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(mcpHttp, "mcpHttp");
        Intrinsics.checkNotNullParameter(hookHttp, "hookHttp");
        this.settings = settings;
        this.host = host;
        AiClient aiClient = new AiClient(http);
        aiClient.setRules(ModelRules.INSTANCE.load(new File(root, "ai_model_rules.json")));
        this.client = aiClient;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i = 2;
        this.chats = new ChatStore(new File(root, "ai_chats.json"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.perms = new PermissionStore(new File(root, "ai_permissions.json"));
        this.checkpoints = new CheckpointStore(new File(cacheDir, "ai_checkpoints"));
        this.tasks = z ? new BackgroundTasks(new File(cacheDir, "ai_sessions/pending_tasks.json"), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0) : null;
        this.mcp = new McpManager(new File(root, "ai_mcp.json"), mcpHttp);
        this.hooks = new HookRunner(new File(root, "ai_hooks.json"), hookHttp);
        this.audit = new AuditLog(new File(cacheDir, "ai_hooks/audit.jsonl"), 0L, 2, null);
        this.agent = new AiAgent(this.client, this.settings, this.host, this.chats, this.perms, this.checkpoints, new File(cacheDir, "ai_results"), this.tasks, this.mcp, this.hooks, this.audit);
    }

    public /* synthetic */ AiService(File file, File file2, Function0 function0, AiToolHost aiToolHost, AiHttp aiHttp, boolean z, McpHttp mcpHttp, HookHttp hookHttp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, file2, function0, aiToolHost, (i & 16) != 0 ? new UrlConnectionAiHttp() : aiHttp, (i & 32) != 0 ? true : z, (i & 64) != 0 ? new UrlConnectionMcpHttp() : mcpHttp, (i & 128) != 0 ? new HookHttp() { // from class: com.pymcl.ai.AiService$$ExternalSyntheticLambda0
            @Override // com.pymcl.ai.HookHttp
            public final String post(String str, Map map, String str2, int i2) {
                return AiService._init_$lambda$0(str, map, str2, i2);
            }
        } : hookHttp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(String u, Map h, String b, int t) {
        Intrinsics.checkNotNullParameter(u, "u");
        Intrinsics.checkNotNullParameter(h, "h");
        Intrinsics.checkNotNullParameter(b, "b");
        return HookRunner.INSTANCE.defaultPost(u, h, b, t);
    }

    public final AiClient getClient() {
        return this.client;
    }

    public final ChatStore getChats() {
        return this.chats;
    }

    public final PermissionStore getPerms() {
        return this.perms;
    }

    public final CheckpointStore getCheckpoints() {
        return this.checkpoints;
    }

    public final BackgroundTasks getTasks() {
        return this.tasks;
    }

    public final McpManager getMcp() {
        return this.mcp;
    }

    public final HookRunner getHooks() {
        return this.hooks;
    }

    public final AuditLog getAudit() {
        return this.audit;
    }

    public final Flow<BgTaskInfo> getBackgroundEvents() {
        SharedFlow<BgTaskInfo> events;
        BackgroundTasks backgroundTasks = this.tasks;
        return (backgroundTasks == null || (events = backgroundTasks.getEvents()) == null) ? FlowKt.emptyFlow() : events;
    }

    public static /* synthetic */ List backgroundTasks$default(AiService aiService, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return aiService.backgroundTasks(str);
    }

    public final List<BgTaskInfo> backgroundTasks(String chatId) {
        List<BgTaskInfo> list;
        BackgroundTasks backgroundTasks = this.tasks;
        return (backgroundTasks == null || (list = backgroundTasks.list(chatId)) == null) ? CollectionsKt.emptyList() : list;
    }

    public final boolean cancelTask(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        BackgroundTasks backgroundTasks = this.tasks;
        if (backgroundTasks != null) {
            return backgroundTasks.cancel(id);
        }
        return false;
    }

    public static /* synthetic */ BgClearResult clearFinishedTasks$default(AiService aiService, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return aiService.clearFinishedTasks(str, z);
    }

    public final BgClearResult clearFinishedTasks(String chatId, boolean keepUnreported) {
        BgClearResult bgClearResultClearFinished;
        BackgroundTasks backgroundTasks = this.tasks;
        return (backgroundTasks == null || (bgClearResultClearFinished = backgroundTasks.clearFinished(chatId, keepUnreported)) == null) ? new BgClearResult(CollectionsKt.emptyList(), 0, 0) : bgClearResultClearFinished;
    }

    public static /* synthetic */ boolean needsReport$default(AiService aiService, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return aiService.needsReport(str);
    }

    public final boolean needsReport(String chatId) {
        String id;
        List<BgTaskInfo> listUnreported;
        if (chatId == null) {
            id = this.chats.activeId();
            if (id == null) {
                return false;
            }
        } else {
            id = chatId;
        }
        BackgroundTasks backgroundTasks = this.tasks;
        return (backgroundTasks == null || (listUnreported = backgroundTasks.unreported(id)) == null || !(listUnreported.isEmpty() ^ true)) ? false : true;
    }

    public static /* synthetic */ Flow report$default(AiService aiService, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return aiService.report(str);
    }

    public final Flow<AiEvent> report(String chatId) {
        String id;
        if (chatId == null) {
            id = this.chats.activeId();
            if (id == null) {
                return null;
            }
        } else {
            id = chatId;
        }
        if (isRunning() || !needsReport(id)) {
            return null;
        }
        return send("", id, AiAgent.BG_REPORT_PROMPT);
    }

    public final List<McpServerStatus> mcpStatus() {
        return this.mcp.getStatuses();
    }

    public final List<String> mcpToolNames() {
        Iterable $this$map$iv = this.mcp.tools();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            McpTool it = (McpTool) item$iv$iv;
            destination$iv$iv.add(it.getFullName());
        }
        return (List) destination$iv$iv;
    }

    public final String getRunningChat() {
        return this.runningChat;
    }

    public final boolean isRunning() {
        Job job = this.job;
        return job != null && job.isActive();
    }

    public final Usage getSessionUsage() {
        return this.agent.getSessionUsage();
    }

    public final List<ChatInfo> listChats() {
        return this.chats.list();
    }

    public final String activeChat() {
        return this.chats.activeId();
    }

    public final String newChat() {
        stop();
        return this.chats.create();
    }

    public final boolean setActive(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (this.runningChat != null && !Intrinsics.areEqual(this.runningChat, id)) {
            stop();
        }
        return this.chats.setActive(id);
    }

    public final void deleteChat(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (Intrinsics.areEqual(this.runningChat, id)) {
            stop();
        }
        this.chats.delete(id);
        this.checkpoints.deleteChat(id);
        BackgroundTasks backgroundTasks = this.tasks;
        if (backgroundTasks != null) {
            backgroundTasks.dropChat(id);
        }
    }

    public final List<Map<String, Object>> messages(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.chats.messages(id);
    }

    /* compiled from: AiService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/pymcl/ai/AiEvent;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiService$send$1", f = "AiService.kt", i = {0, 1, 2, 2, 2, 3, 3, 3}, l = {88, 89, 100, 101}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "$this$channelFlow", "id", "inner", "$this$channelFlow", "id", "inner"}, nl = {89, 90, 101, 103}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
    /* renamed from: com.pymcl.ai.AiService$send$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super AiEvent>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ String $hidden;
        final /* synthetic */ String $text;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ AiService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, String str2, AiService aiService, String str3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$text = str;
            this.$hidden = str2;
            this.this$0 = aiService;
            this.$chatId = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$text, this.$hidden, this.this$0, this.$chatId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super AiEvent> producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0122 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:7:0x0025, B:10:0x0032, B:52:0x011c, B:54:0x0122), top: B:69:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlinx.coroutines.Job] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ Flow send$default(AiService aiService, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return aiService.send(str, str2, str3);
    }

    public final Flow<AiEvent> send(String text, String chatId, String hidden) {
        Intrinsics.checkNotNullParameter(text, "text");
        return FlowKt.flowOn(FlowKt.channelFlow(new AnonymousClass1(text, hidden, this, chatId, null)), Dispatchers.getIO());
    }

    public final void stop() {
        this.client.cancel();
        this.agent.cancelPending();
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stopAndJoin(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.pymcl.ai.AiService.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            com.pymcl.ai.AiService$stopAndJoin$1 r0 = (com.pymcl.ai.AiService.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.ai.AiService$stopAndJoin$1 r0 = new com.pymcl.ai.AiService$stopAndJoin$1
            r0.<init>(r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L3b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            r2 = 0
            java.lang.Object r3 = r0.L$1
            com.pymcl.ai.AiService r3 = (com.pymcl.ai.AiService) r3
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L39
            goto L66
        L39:
            r2 = move-exception
            goto L6c
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.Job r3 = r7.job
            if (r3 != 0) goto L45
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L45:
            r4 = r3
            r7.stop()
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L39
            r3 = r7
            com.pymcl.ai.AiService r3 = (com.pymcl.ai.AiService) r3     // Catch: java.lang.Throwable -> L39
            r5 = 0
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)     // Catch: java.lang.Throwable -> L39
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L39
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Throwable -> L39
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L39
            r6 = 1
            r0.label = r6     // Catch: java.lang.Throwable -> L39
            java.lang.Object r6 = r4.join(r0)     // Catch: java.lang.Throwable -> L39
            if (r6 != r2) goto L65
            return r2
        L65:
            r2 = r5
        L66:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L39
            kotlin.Result.m8116constructorimpl(r2)     // Catch: java.lang.Throwable -> L39
            goto L75
        L6c:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            kotlin.Result.m8116constructorimpl(r2)
        L75:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiService.stopAndJoin(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: AiService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiService$newChatAwait$2", f = "AiService.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.ai.AiService$newChatAwait$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AiService.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (AiService.this.stopAndJoin(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return AiService.this.getChats().create();
        }
    }

    /* compiled from: AiService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiService$setActiveAwait$2", f = "AiService.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.ai.AiService$setActiveAwait$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AiService.this.new AnonymousClass2(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (AiService.this.getRunningChat() != null && !Intrinsics.areEqual(AiService.this.getRunningChat(), this.$id)) {
                        this.label = 1;
                        if (AiService.this.stopAndJoin(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Boxing.boxBoolean(AiService.this.getChats().setActive(this.$id));
        }
    }

    public final Object newChatAwait(Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
    }

    /* compiled from: AiService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiService$deleteChatAwait$2", f = "AiService.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.ai.AiService$deleteChatAwait$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AiService.this.new AnonymousClass2(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (Intrinsics.areEqual(AiService.this.getRunningChat(), this.$id)) {
                        this.label = 1;
                        if (AiService.this.stopAndJoin(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AiService.this.getChats().delete(this.$id);
            AiService.this.getCheckpoints().deleteChat(this.$id);
            BackgroundTasks tasks = AiService.this.getTasks();
            if (tasks == null) {
                return null;
            }
            tasks.dropChat(this.$id);
            return Unit.INSTANCE;
        }
    }

    public final Object setActiveAwait(String id, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(id, null), continuation);
    }

    public final Object deleteChatAwait(String id, Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(id, null), continuation);
    }

    public final String takeNetNotice() {
        return this.client.getBuiltinHttp().takeNotice();
    }

    public final boolean steer(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (!isRunning()) {
            return false;
        }
        this.agent.steer(text);
        return true;
    }

    public final boolean confirm(ConfirmAnswer a) {
        Intrinsics.checkNotNullParameter(a, "a");
        return this.agent.confirm(a);
    }

    public final boolean answer(AskAnswer a) {
        Intrinsics.checkNotNullParameter(a, "a");
        return this.agent.answer(a);
    }

    public final AiEvent pendingCard() {
        return this.agent.pendingCard();
    }

    /* compiled from: AiService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/ai/RewindOutcome;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiService$rewind$2", f = "AiService.kt", i = {1}, l = {125, 127}, m = "invokeSuspend", n = {"id"}, nl = {126, 128}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.ai.AiService$rewind$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RewindOutcome>, Object> {
        final /* synthetic */ String $chatId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AiService.this.new AnonymousClass2(this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RewindOutcome> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                switch(r1) {
                    case 0: goto L20;
                    case 1: goto L1b;
                    case 2: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L11:
                java.lang.Object r0 = r11.L$0
                java.lang.String r0 = (java.lang.String) r0
                kotlin.ResultKt.throwOnFailure(r12)
                r2 = r12
                goto L8f
            L1b:
                kotlin.ResultKt.throwOnFailure(r12)
                r1 = r12
                goto L45
            L20:
                kotlin.ResultKt.throwOnFailure(r12)
                com.pymcl.ai.AiService r1 = com.pymcl.ai.AiService.this
                boolean r1 = r1.isRunning()
                if (r1 == 0) goto L47
                com.pymcl.ai.AiService r1 = com.pymcl.ai.AiService.this
                r1.stop()
                com.pymcl.ai.AiService r1 = com.pymcl.ai.AiService.this
                kotlinx.coroutines.Job r1 = com.pymcl.ai.AiService.access$getJob$p(r1)
                if (r1 == 0) goto L47
                r2 = r11
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 1
                r11.label = r3
                java.lang.Object r1 = r1.join(r2)
                if (r1 != r0) goto L45
                return r0
            L45:
                kotlin.Unit r1 = (kotlin.Unit) r1
            L47:
                java.lang.String r1 = r11.$chatId
                if (r1 == 0) goto L5a
                r2 = r1
                r3 = 0
                r4 = r2
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r4 = kotlin.text.StringsKt.isBlank(r4)
                if (r4 != 0) goto L57
                goto L58
            L57:
                r1 = 0
            L58:
                if (r1 != 0) goto L75
            L5a:
                com.pymcl.ai.AiService r1 = com.pymcl.ai.AiService.this
                com.pymcl.ai.ChatStore r1 = r1.getChats()
                java.lang.String r1 = r1.activeId()
                if (r1 != 0) goto L75
                com.pymcl.ai.RewindOutcome r2 = new com.pymcl.ai.RewindOutcome
                r9 = 32
                r10 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 1
                r7 = 0
                r8 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return r2
            L75:
                com.pymcl.ai.AiService r2 = com.pymcl.ai.AiService.this
                com.pymcl.ai.AiAgent r2 = com.pymcl.ai.AiService.access$getAgent$p(r2)
                r3 = r11
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
                r11.L$0 = r4
                r4 = 2
                r11.label = r4
                java.lang.Object r2 = r2.rewind(r1, r3)
                if (r2 != r0) goto L8e
                return r0
            L8e:
                r0 = r1
            L8f:
                r1 = r2
                com.pymcl.ai.AiAgent$RewindResult r1 = (com.pymcl.ai.AiAgent.RewindResult) r1
                com.pymcl.ai.RollbackResult r2 = r1.getRollback()
                com.pymcl.ai.RewindOutcome r3 = new com.pymcl.ai.RewindOutcome
                int r4 = r2.getRestored()
                int r5 = r2.getFailed()
                boolean r6 = r2.getHadEntries()
                boolean r7 = r2.getRewindable()
                java.lang.String r8 = r1.getUserText()
                java.util.List r9 = r1.getCancelledTasks()
                int r9 = r9.size()
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiService.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ Object rewind$default(AiService aiService, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return aiService.rewind(str, continuation);
    }

    public final Object rewind(String chatId, Continuation<? super RewindOutcome> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(chatId, null), continuation);
    }

    /* compiled from: AiService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiService$listModels$2", f = "AiService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.ai.AiService$listModels$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
        final /* synthetic */ AiSettings $st;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AiSettings aiSettings, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$st = aiSettings;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AiService.this.new AnonymousClass2(this.$st, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return AiService.this.getClient().listModels(this.$st);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: AiService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiService$testConnection$2", f = "AiService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.ai.AiService$testConnection$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Boolean, ? extends String>>, Object> {
        final /* synthetic */ AiSettings $st;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AiSettings aiSettings, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$st = aiSettings;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AiService.this.new AnonymousClass2(this.$st, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Boolean, ? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Pair<Boolean, String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<Boolean, String>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return AiService.this.getClient().testConnection(this.$st);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static /* synthetic */ Object listModels$default(AiService aiService, AiSettings aiSettings, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            aiSettings = aiService.settings.invoke();
        }
        return aiService.listModels(aiSettings, continuation);
    }

    public final Object listModels(AiSettings st, Continuation<? super List<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(st, null), continuation);
    }

    public static /* synthetic */ Object testConnection$default(AiService aiService, AiSettings aiSettings, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            aiSettings = aiService.settings.invoke();
        }
        return aiService.testConnection(aiSettings, continuation);
    }

    public final Object testConnection(AiSettings st, Continuation<? super Pair<Boolean, String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(st, null), continuation);
    }

    public final List<PermissionRule> permissionRules() {
        return CollectionsKt.plus((Collection) this.perms.global(), (Iterable) this.perms.instance(this.host.currentInstance()));
    }

    public final boolean addRule(String tool, String behavior, String content, boolean global) {
        Intrinsics.checkNotNullParameter(tool, "tool");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(content, "content");
        return this.perms.add(new PermissionRule(tool, StringsKt.trim((CharSequence) content).toString(), behavior, global ? "global" : "instance"), this.host.currentInstance());
    }

    public final boolean removeRule(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.perms.remove(key, this.host.currentInstance());
    }
}
