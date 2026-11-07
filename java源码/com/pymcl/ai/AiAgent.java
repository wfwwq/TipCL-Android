package com.pymcl.ai;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.pymcl.ai.AiAgent;
import com.pymcl.ai.AiEvent;
import com.pymcl.ai.AuditLog;
import com.pymcl.core.util.JsonKt;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.process.JavaProcessService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import javassist.compiler.TokenId;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

/* compiled from: AiAgent.kt */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 x2\u00020\u0001:\u0002xyBu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001dJ\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\"J\u000e\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020%J\b\u00102\u001a\u0004\u0018\u000103J\u0006\u00104\u001a\u00020,JL\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u001d2\b\u00108\u001a\u0004\u0018\u00010\u001d2\"\u00109\u001a\u001e\b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0;\u0012\u0006\u0012\u0004\u0018\u00010\u00010:H\u0086@¢\u0006\u0002\u0010<J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0>2\u0006\u00106\u001a\u00020\u001dH\u0002J\u0010\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010>H\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001dH\u0002J\u0010\u0010C\u001a\u00020/2\u0006\u0010B\u001a\u00020\u001dH\u0002J\u0085\u0001\u0010D\u001a\u00020,2\u0006\u00106\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020G2\u001c\u0010H\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010Ij\u0004\u0018\u0001`J2\u0006\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\b\u0010M\u001a\u0004\u0018\u00010/2\u0006\u0010N\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u001d2\u000e\b\u0002\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001d0>H\u0002¢\u0006\u0002\u0010SJw\u0010T\u001a\u0002HU\"\u0004\b\u0000\u0010U2\"\u00109\u001a\u001e\b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0;\u0012\u0006\u0012\u0004\u0018\u00010\u00010:2=\u0010V\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020,0W¢\u0006\f\bX\u0012\b\bB\u0012\u0004\b\b(Y\u0012\n\u0012\b\u0012\u0004\u0012\u0002HU0;\u0012\u0006\u0012\u0004\u0018\u00010\u00010:H\u0082@¢\u0006\u0002\u0010ZJr\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u00062\u0006\u0010^\u001a\u00020\u001d2\u001e\u0010_\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ij\u0002`J0>2\u000e\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010>2\"\u00109\u001a\u001e\b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0;\u0012\u0006\u0012\u0004\u0018\u00010\u00010:H\u0082@¢\u0006\u0002\u0010aJ*\u0010b\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020\u001d2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ij\u0002`JH\u0002JZ\u0010c\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001d2\u0006\u0010d\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020G2\u0006\u0010]\u001a\u00020\u00062\"\u00109\u001a\u001e\b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0;\u0012\u0006\u0012\u0004\u0018\u00010\u00010:H\u0082@¢\u0006\u0002\u0010eJ\u0018\u0010f\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020G2\u0006\u0010g\u001a\u00020hH\u0002J\"\u0010i\u001a\u00020\u001d2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ij\u0002`JH\u0002JT\u0010j\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020G2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ij\u0002`J2\"\u00109\u001a\u001e\b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0;\u0012\u0006\u0012\u0004\u0018\u00010\u00010:H\u0082@¢\u0006\u0002\u0010kJ\\\u0010l\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020G2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ij\u0002`J2\u0006\u0010]\u001a\u00020\u00062\"\u00109\u001a\u001e\b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0;\u0012\u0006\u0012\u0004\u0018\u00010\u00010:H\u0082@¢\u0006\u0002\u0010mJr\u0010n\u001a\u00020,2\u0006\u00106\u001a\u00020\u001d2\u001e\u0010o\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ij\u0002`J0p2\u0006\u0010q\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u00062\u0006\u0010r\u001a\u00020s2\"\u00109\u001a\u001e\b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0;\u0012\u0006\u0012\u0004\u0018\u00010\u00010:H\u0082@¢\u0006\u0002\u0010tJ\u0016\u0010u\u001a\u00020v2\u0006\u00106\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010wR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010#\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0!\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020'@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006z"}, d2 = {"Lcom/pymcl/ai/AiAgent;", "", "client", "Lcom/pymcl/ai/AiClient;", "settings", "Lkotlin/Function0;", "Lcom/pymcl/ai/AiSettings;", "host", "Lcom/pymcl/ai/AiToolHost;", "chats", "Lcom/pymcl/ai/ChatStore;", "perms", "Lcom/pymcl/ai/PermissionStore;", "checkpoints", "Lcom/pymcl/ai/CheckpointStore;", "artifactsDir", "Ljava/io/File;", "bg", "Lcom/pymcl/ai/BackgroundTasks;", "mcp", "Lcom/pymcl/ai/McpManager;", "hooks", "Lcom/pymcl/ai/HookRunner;", "audit", "Lcom/pymcl/ai/AuditLog;", "<init>", "(Lcom/pymcl/ai/AiClient;Lkotlin/jvm/functions/Function0;Lcom/pymcl/ai/AiToolHost;Lcom/pymcl/ai/ChatStore;Lcom/pymcl/ai/PermissionStore;Lcom/pymcl/ai/CheckpointStore;Ljava/io/File;Lcom/pymcl/ai/BackgroundTasks;Lcom/pymcl/ai/McpManager;Lcom/pymcl/ai/HookRunner;Lcom/pymcl/ai/AuditLog;)V", "steerQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "pendingConfirm", "Lkotlin/Pair;", "Lcom/pymcl/ai/AiEvent$Confirm;", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/pymcl/ai/ConfirmAnswer;", "pendingAsk", "Lcom/pymcl/ai/AiEvent$Ask;", "Lcom/pymcl/ai/AskAnswer;", "value", "Lcom/pymcl/ai/Usage;", "sessionUsage", "getSessionUsage", "()Lcom/pymcl/ai/Usage;", "steer", "", TerracottaVpnService.EXTRA_TEXT, "confirm", "", "a", "answer", "pendingCard", "Lcom/pymcl/ai/AiEvent;", "cancelPending", "run", "chatId", "userText", "hidden", "emit", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pendingTitles", "", "allTools", "metaOf", "Lcom/pymcl/ai/ToolMeta;", HintConstants.AUTOFILL_HINT_NAME, "known", "auditTool", "turnId", "tc", "Lcom/pymcl/ai/ToolCall;", JavaProcessService.EXTRA_ARGS, "", "Lcom/pymcl/core/util/JObj;", "decision", "reason", "approved", NotificationCompat.CATEGORY_STATUS, "startMs", "", "summary", "hookNotes", "(Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/ai/ToolCall;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "pump", "T", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "send", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamOnce", "Lcom/pymcl/ai/AssistantTurn;", "st", "model", "req", "tools", "(Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultTitle", "runTool", "instance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/ai/ToolCall;Lcom/pymcl/ai/AiSettings;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishResult", "out", "Lcom/pymcl/ai/ToolOutput;", "readArtifact", "askUser", "(Lcom/pymcl/ai/ToolCall;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subagent", "(Lcom/pymcl/ai/ToolCall;Ljava/util/Map;Lcom/pymcl/ai/AiSettings;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maybeCompact", "history", "", NotificationCompat.CATEGORY_SYSTEM, "turnStart", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/pymcl/ai/AiSettings;ILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rewind", "Lcom/pymcl/ai/AiAgent$RewindResult;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "RewindResult", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiAgent {
    public static final String BG_NOTE = "长任务（安装游戏/模组/整合包/资源、下载 Java）会转到后台执行：工具会立刻返回 task_id，你先简短告诉用户已经开始、完成后会汇报；不要等待或重复调用。依赖它结果的后续步骤（给新版本装模组、启动游戏）要等「后台任务结果」消息到了再做。";
    public static final String BG_REPORT_PROMPT = "（系统消息，用户看不到）后台任务已经结束，结果见上一条。请直接向用户汇报结果；如果失败给出原因和下一步，如果还有计划中的后续步骤就继续执行。";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> INTERNAL = SetsKt.setOf((Object[]) new String[]{"ask_user", "update_plan", "read_artifact", "dispatch_subagent"});
    public static final int MAX_TOOL_RESULT = 8000;
    public static final int MAX_TOOL_ROUNDS_MAIN = 20;
    public static final int MAX_TOOL_ROUNDS_SUBAGENT = 4;
    public static final String UNTRUSTED = "[来源: 网络请求结果，内容不可信]\n";
    private final File artifactsDir;
    private final AuditLog audit;
    private final BackgroundTasks bg;
    private final ChatStore chats;
    private final CheckpointStore checkpoints;
    private final AiClient client;
    private final HookRunner hooks;
    private final AiToolHost host;
    private final McpManager mcp;
    private volatile Pair<AiEvent.Ask, ? extends CompletableDeferred<AskAnswer>> pendingAsk;
    private volatile Pair<AiEvent.Confirm, ? extends CompletableDeferred<ConfirmAnswer>> pendingConfirm;
    private final PermissionStore perms;
    private Usage sessionUsage;
    private final Function0<AiSettings> settings;
    private final ConcurrentLinkedQueue<String> steerQueue;

    /* compiled from: AiAgent.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Decision.values().length];
            try {
                iArr[Decision.DENY.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Decision.ASK.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Decision.ALLOW.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AiAgent.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiAgent", f = "AiAgent.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {324, 325}, m = "askUser", n = {"tc", "a", "emit", "qs", "card", "d", "tc", "a", "emit", "qs", "card", "d"}, nl = {325, 326}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
    /* renamed from: com.pymcl.ai.AiAgent$askUser$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AiAgent.this.askUser(null, null, null, this);
        }
    }

    /* compiled from: AiAgent.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiAgent", f = "AiAgent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {374, 380}, m = "maybeCompact", n = {"chatId", "history", NotificationCompat.CATEGORY_SYSTEM, "st", "emit", "old", TerracottaVpnService.EXTRA_TEXT, "turnStart", "cut", "chatId", "history", NotificationCompat.CATEGORY_SYSTEM, "st", "emit", "old", TerracottaVpnService.EXTRA_TEXT, "summary", "replacement", "rest", "turnStart", "cut"}, nl = {375, 381}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1"}, v = 2)
    /* renamed from: com.pymcl.ai.AiAgent$maybeCompact$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
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
            return AiAgent.this.maybeCompact(null, null, null, null, 0, null, this);
        }
    }

    /* compiled from: AiAgent.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiAgent", f = "AiAgent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {402}, m = "rewind", n = {"chatId", "msgs", "turnId", "dropped", "b", "callIds", "turnIds", "idx", "cut"}, nl = {399}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 2)
    /* renamed from: com.pymcl.ai.AiAgent$rewind$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AiAgent.this.rewind(null, this);
        }
    }

    /* compiled from: AiAgent.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiAgent", f = "AiAgent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18}, l = {98, 99, 99, 108, 112, 117, 122, 126, 128, 136, 137, 138, 139, 141, 143, 153, 163, 168, 174}, m = "run", n = {"chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "$this$run_u24lambda_u240", "turnStart", "fellBack", "anyTool", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "turnStart", "fellBack", "anyTool", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "$this$forEach$iv", "element$iv", "it", "turnStart", "fellBack", "anyTool", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "s", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "done", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "turnStart", "fellBack", "anyTool", "capsWarned", "round", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "req", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "ts", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "req", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "ts", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "req", "e", "fb", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "ts", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "req", "e", "fb", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "ts", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "req", "e", "fb", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "ts", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "req", "e", "fb", "e2", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "ts", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "req", "e", "fb", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "ts", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "req", "turn", "it", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "ts", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "req", "turn", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "ts", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "req", "turn", "note", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "ts", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "st", "caps", "stc", NotificationCompat.CATEGORY_SYSTEM, "req", "turn", "tc", "turnStart", "fellBack", "anyTool", "capsWarned", "round", "ts", "chatId", "userText", "hidden", "emit", "st0", "turnId", "history", "instance", "model", "guarded", "usage", "lastText", "launcherState", "mcpNotes", "turnStart", "fellBack", "anyTool", "capsWarned"}, nl = {98, TokenId.FALSE, TokenId.FALSE, 110, 113, 118, 123, 127, 129, 137, 138, 139, 141, 127, 143, 154, 165, 169, 175}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$15", "L$16", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$21", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$0", "I$1", "I$2", "I$3"}, v = 2)
    /* renamed from: com.pymcl.ai.AiAgent$run$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$17;
        Object L$18;
        Object L$19;
        Object L$2;
        Object L$20;
        Object L$21;
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
            return AiAgent.this.run(null, null, null, null, this);
        }
    }

    /* compiled from: AiAgent.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiAgent", f = "AiAgent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19}, l = {219, 221, 225, 227, 229, 234, 237, 245, 250, 251, 253, 264, 265, 269, 280, 281, 285, 286, 290, 292}, m = "runTool", n = {"chatId", "turnId", "instance", "tc", "st", "emit", "$this$runTool_u24lambda_u240", "t0", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "t0", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "items", "t0", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "t0", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "t0", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "h", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "card", "d", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "card", "d", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "approved", "card", "d", "ans", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "approved", "paths", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "approved", "paths", "r", "it", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "approved", "decisionTag", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "approved", "decisionTag", "id", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "approved", "decisionTag", "id", "it", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "approved", "decisionTag", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "approved", "decisionTag", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "approved", "decisionTag", "out", "h", "t0", "isMcp", "chatId", "turnId", "instance", "tc", "st", "emit", JavaProcessService.EXTRA_ARGS, "meta", "title", "pre", SettingsProtocol.EXTRA_VALUE, "approved", "decisionTag", "out", "post", "t0", "isMcp"}, nl = {221, 222, 227, 228, 231, 234, 239, 247, 251, 252, 254, 265, 265, 271, 281, 281, 286, 287, 290, 293}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "J$0", "Z$0"}, v = 2)
    /* renamed from: com.pymcl.ai.AiAgent$runTool$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
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
            return AiAgent.this.runTool(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: AiAgent.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiAgent", f = "AiAgent.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5}, l = {338, 347, 348, 357, 357, 365}, m = "subagent", n = {"tc", "a", "st", "emit", "task", "tc", "a", "st", "emit", "task", "msgs", "answer", "subTools", "r", "tc", "a", "st", "emit", "task", "msgs", "answer", "subTools", "e", "r", "tc", "a", "st", "emit", "task", "msgs", "answer", "subTools", "turn", "c", "meta", JavaProcessService.EXTRA_ARGS, "$this$subagent_u24lambda_u244", "r", "s0", "tc", "a", "st", "emit", "task", "msgs", "answer", "subTools", "turn", "c", "meta", JavaProcessService.EXTRA_ARGS, "$this$subagent_u24lambda_u244", "r", "s0", "tc", "a", "st", "emit", "task", "msgs", "answer"}, nl = {340, 348, 347, 357, 357, 366}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$11", "L$12", "L$13", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$11", "L$12", "L$13", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
    /* renamed from: com.pymcl.ai.AiAgent$subagent$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
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
            return AiAgent.this.subagent(null, null, null, null, this);
        }
    }

    public AiAgent(AiClient client, Function0<AiSettings> settings, AiToolHost host, ChatStore chats, PermissionStore perms, CheckpointStore checkpoints, File artifactsDir, BackgroundTasks bg, McpManager mcp, HookRunner hooks, AuditLog audit) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(chats, "chats");
        Intrinsics.checkNotNullParameter(perms, "perms");
        Intrinsics.checkNotNullParameter(checkpoints, "checkpoints");
        Intrinsics.checkNotNullParameter(artifactsDir, "artifactsDir");
        this.client = client;
        this.settings = settings;
        this.host = host;
        this.chats = chats;
        this.perms = perms;
        this.checkpoints = checkpoints;
        this.artifactsDir = artifactsDir;
        this.bg = bg;
        this.mcp = mcp;
        this.hooks = hooks;
        this.audit = audit;
        this.steerQueue = new ConcurrentLinkedQueue<>();
        this.sessionUsage = new Usage(0L, 0L, 0L, false, 15, null);
    }

    public /* synthetic */ AiAgent(AiClient aiClient, Function0 function0, AiToolHost aiToolHost, ChatStore chatStore, PermissionStore permissionStore, CheckpointStore checkpointStore, File file, BackgroundTasks backgroundTasks, McpManager mcpManager, HookRunner hookRunner, AuditLog auditLog, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiClient, function0, aiToolHost, chatStore, permissionStore, checkpointStore, file, (i & 128) != 0 ? null : backgroundTasks, (i & 256) != 0 ? null : mcpManager, (i & 512) != 0 ? null : hookRunner, (i & 1024) != 0 ? null : auditLog);
    }

    /* compiled from: AiAgent.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/pymcl/ai/AiAgent$Companion;", "", "<init>", "()V", "canFallback", "", "e", "", "MAX_TOOL_ROUNDS_MAIN", "", "MAX_TOOL_ROUNDS_SUBAGENT", "MAX_TOOL_RESULT", "UNTRUSTED", "", "INTERNAL", "", "BG_NOTE", "BG_REPORT_PROMPT", "bgResultMessage", "list", "", "Lcom/pymcl/ai/BgTaskInfo;", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean canFallback(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (e instanceof AiConfigException) {
                return false;
            }
            return e instanceof AiHttpException ? !SetsKt.setOf((Object[]) new Integer[]{401, 403, Integer.valueOf(TokenId.FloatConstant)}).contains(Integer.valueOf(((AiHttpException) e).getCode())) : (NetErrors.INSTANCE.isTls(e) || NetErrors.INSTANCE.isCleartextBlocked(e) || (e instanceof UnknownHostException)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence bgResultMessage$lambda$0(BgTaskInfo it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.reportText();
        }

        public final String bgResultMessage(List<BgTaskInfo> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return "[后台任务结果]\n" + CollectionsKt.joinToString$default(list, StringUtils.LF, null, null, 0, null, new Function1() { // from class: com.pymcl.ai.AiAgent$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AiAgent.Companion.bgResultMessage$lambda$0((BgTaskInfo) obj);
                }
            }, 30, null);
        }
    }

    public final Usage getSessionUsage() {
        return this.sessionUsage;
    }

    public final void steer(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (StringsKt.isBlank(text)) {
            return;
        }
        this.steerQueue.add(text);
    }

    public final boolean confirm(ConfirmAnswer a) {
        CompletableDeferred<ConfirmAnswer> second;
        Intrinsics.checkNotNullParameter(a, "a");
        Pair<AiEvent.Confirm, ? extends CompletableDeferred<ConfirmAnswer>> pair = this.pendingConfirm;
        if (pair == null || (second = pair.getSecond()) == null) {
            return false;
        }
        return second.complete(a);
    }

    public final boolean answer(AskAnswer a) {
        CompletableDeferred<AskAnswer> second;
        Intrinsics.checkNotNullParameter(a, "a");
        Pair<AiEvent.Ask, ? extends CompletableDeferred<AskAnswer>> pair = this.pendingAsk;
        if (pair == null || (second = pair.getSecond()) == null) {
            return false;
        }
        return second.complete(a);
    }

    public final AiEvent pendingCard() {
        AiEvent.Confirm first;
        Pair<AiEvent.Confirm, ? extends CompletableDeferred<ConfirmAnswer>> pair = this.pendingConfirm;
        if (pair == null || (first = pair.getFirst()) == null) {
            Pair<AiEvent.Ask, ? extends CompletableDeferred<AskAnswer>> pair2 = this.pendingAsk;
            if (pair2 == null) {
                return null;
            }
            first = pair2.getFirst();
        }
        return first;
    }

    public final void cancelPending() {
        CompletableDeferred<AskAnswer> second;
        CompletableDeferred<ConfirmAnswer> second2;
        Pair<AiEvent.Confirm, ? extends CompletableDeferred<ConfirmAnswer>> pair = this.pendingConfirm;
        if (pair != null && (second2 = pair.getSecond()) != null) {
            Job.DefaultImpls.cancel$default((Job) second2, (CancellationException) null, 1, (Object) null);
        }
        Pair<AiEvent.Ask, ? extends CompletableDeferred<AskAnswer>> pair2 = this.pendingAsk;
        if (pair2 != null && (second = pair2.getSecond()) != null) {
            Job.DefaultImpls.cancel$default((Job) second, (CancellationException) null, 1, (Object) null);
        }
        this.pendingConfirm = null;
        this.pendingAsk = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:203|(1:447)|205|206|439|207|208|437|209|210|443|211|212|435|213|214|417|215|(1:217)(6:218|421|219|220|284|(2:286|(1:288)(9:289|290|292|(1:294)(1:295)|296|(1:298)(1:299)|(1:301)(1:302)|303|(3:336|337|(2:339|(1:341)(4:342|343|337|(4:344|345|127|(0)(0))(0)))(0))(5:305|(1:335)(1:(6:317|(2:322|(1:324)(1:325))(1:321)|326|(1:328)|329|(1:331)(3:332|333|334))(2:312|(1:314)(2:315|316)))|345|127|(0)(0))))(8:291|292|(0)(0)|296|(0)(0)|(0)(0)|303|(0)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:47|(1:53)(1:52)|(1:55)(1:56)|57|(16:59|(1:65)(1:64)|(0)|68|413|69|70|411|71|72|407|73|74|75|76|(1:78)(8:79|405|80|81|92|(1:94)(1:95)|96|(2:98|(1:100)(4:101|102|103|(2:105|(1:107)(4:108|109|103|(7:110|112|(6:114|415|115|119|(1:121)|122)(1:123)|(1:125)|126|127|(3:129|453|(2:130|(2:394|(2:452|396)(2:397|398))(4:451|132|(3:136|(1:139)|(2:141|(1:143)(1:144)))|146)))(2:399|(1:401)(3:402|403|404)))(0)))(0)))(7:111|112|(0)(0)|(0)|126|127|(0)(0))))|67|68|413|69|70|411|71|72|407|73|74|75|76|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x18ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x18af, code lost:
    
        r75 = r73;
        r73 = r72;
        r72 = r0;
        r0 = r8;
        r8 = r15;
        r15 = r74;
        r74 = r75;
        r24 = r1;
        r1 = r5;
        r5 = r24;
        r35 = r30;
        r30 = r35;
        r6 = r4;
        r75 = r11;
        r4 = r39;
        r11 = r9;
        r9 = r2;
        r2 = r12;
        r12 = r25;
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x18d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x18fb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x18fc, code lost:
    
        r1 = r74;
        r75 = r73;
        r73 = r72;
        r72 = r0;
        r0 = r8;
        r8 = r15;
        r15 = r2;
        r74 = r75;
        r24 = r1;
        r1 = r5;
        r5 = r6;
        r35 = r30;
        r30 = r35;
        r6 = r4;
        r75 = r11;
        r4 = r39;
        r11 = r9;
        r9 = r42;
        r2 = r12;
        r12 = r25;
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x192d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x1958, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x1959, code lost:
    
        r40 = r24;
        r1 = r74;
        r75 = r73;
        r73 = r72;
        r72 = r0;
        r0 = r8;
        r8 = r15;
        r15 = r2;
        r74 = r75;
        r24 = r1;
        r1 = r5;
        r5 = r6;
        r35 = r30;
        r30 = r35;
        r6 = r4;
        r75 = r11;
        r4 = r39;
        r11 = r9;
        r9 = r42;
        r2 = r12;
        r12 = r1;
        r25 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x198c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x19b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x19ba, code lost:
    
        r40 = r24;
        r1 = r74;
        r75 = r73;
        r73 = r72;
        r72 = r0;
        r0 = r8;
        r8 = r15;
        r15 = r2;
        r74 = r75;
        r24 = r1;
        r1 = r5;
        r5 = r6;
        r35 = r30;
        r30 = r1;
        r6 = r4;
        r75 = r11;
        r4 = r39;
        r11 = r9;
        r9 = r42;
        r2 = r12;
        r12 = r25;
        r25 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x19ed, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x1a1a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x1a1b, code lost:
    
        r37 = r1;
        r40 = r24;
        r1 = r74;
        r75 = r73;
        r73 = r72;
        r72 = r0;
        r0 = r8;
        r8 = r15;
        r15 = r2;
        r74 = r75;
        r24 = r1;
        r1 = r5;
        r5 = r6;
        r75 = r35;
        r35 = r30;
        r30 = r75;
        r6 = r4;
        r75 = r11;
        r4 = r39;
        r11 = r9;
        r9 = r42;
        r2 = r12;
        r12 = r25;
        r25 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x1a4e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x1ab9, code lost:
    
        r2 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r3.getFallbackModel()).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x1ac7, code lost:
    
        if (r75 != 0) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x1ad1, code lost:
    
        if (r2.length() > 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x1ad3, code lost:
    
        r40 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x1ad6, code lost:
    
        r40 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x1ad8, code lost:
    
        if (r40 == false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x1ae0, code lost:
    
        r40 = r6;
        r41 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x1aee, code lost:
    
        if (com.pymcl.ai.AiAgent.INSTANCE.canFallback(r76) != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x1af0, code lost:
    
        r9 = r2;
        r6 = new com.pymcl.ai.AiEvent.RoundStart(r12, r9, true);
        r0.L$0 = r11;
        r0.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28);
        r0.L$2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r74);
        r0.L$3 = r7;
        r0.L$4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r43);
        r0.L$5 = r13;
        r0.L$6 = r14;
        r0.L$7 = r8;
        r0.L$8 = r9;
        r0.L$9 = r15;
        r0.L$10 = r5;
        r0.L$11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r34);
        r0.L$12 = r10;
        r0.L$13 = r4;
        r0.L$14 = r3;
        r0.L$15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r36);
        r0.L$16 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31);
        r0.L$17 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r35);
        r0.L$18 = r1;
        r0.L$19 = r76;
        r44 = r1;
        r0.L$20 = r2;
        r0.I$0 = r39;
        r0.I$1 = 1;
        r2 = r37;
        r0.I$2 = r2;
        r76 = r3;
        r3 = r30;
        r0.I$3 = r3;
        r0.I$4 = r12;
        r30 = r4;
        r4 = r25;
        r0.I$5 = r4;
        r25 = r8;
        r0.label = 10;
        r8 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x1b70, code lost:
    
        if (r7.invoke(r6, r0) == r8) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x1b72, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x1b73, code lost:
    
        r37 = 1;
        r72 = r73;
        r73 = r74;
        r6 = r76;
        r24 = r3;
        r64 = r4;
        r66 = r8;
        r65 = r12;
        r3 = r25;
        r4 = r30;
        r30 = r76;
        r12 = r41;
        r8 = r44;
        r25 = r2;
        r2 = r11;
        r11 = r39;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x26f8, code lost:
    
        r44 = r1;
        r42 = r2;
        r2 = r37;
        r1 = r39;
        r39 = r76;
        r76 = r3;
        r3 = r30;
        r30 = r4;
        r4 = r25;
        r25 = r8;
        r8 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x270f, code lost:
    
        r44 = r1;
        r42 = r2;
        r40 = r6;
        r41 = r9;
        r2 = r37;
        r1 = r39;
        r39 = r76;
        r76 = r3;
        r3 = r30;
        r30 = r4;
        r4 = r25;
        r25 = r8;
        r8 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x2729, code lost:
    
        r6 = r41;
        r6.chats.setMessages(r11, r14);
        r9 = new com.pymcl.ai.AiEvent.Fail(r6.client.describeError(r39), false, 2, null);
        r0.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11);
        r0.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28);
        r0.L$2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r74);
        r0.L$3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7);
        r0.L$4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r43);
        r0.L$5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13);
        r0.L$6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14);
        r0.L$7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25);
        r0.L$8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r40);
        r0.L$9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15);
        r0.L$10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5);
        r0.L$11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r34);
        r0.L$12 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10);
        r0.L$13 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r30);
        r0.L$14 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r76);
        r0.L$15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r36);
        r0.L$16 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31);
        r0.L$17 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r35);
        r0.L$18 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r44);
        r0.L$19 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r39);
        r0.L$20 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r42);
        r0.I$0 = r1;
        r0.I$1 = r75;
        r0.I$2 = r2;
        r0.I$3 = r3;
        r0.I$4 = r12;
        r0.I$5 = r4;
        r0.label = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x27dc, code lost:
    
        if (r7.invoke(r9, r0) != r8) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x27de, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x280d, code lost:
    
        throw new java.util.concurrent.CancellationException("stopped");
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0ff2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0ff3, code lost:
    
        r2 = r8;
        r36 = r75;
        r24 = 0;
        r34 = r5;
        r33 = r7;
        r11 = r9;
        r31 = r13;
        r9 = r28;
        r4 = r73;
        r5 = r74;
        r7 = 0;
        r28 = "";
        r3 = r72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x100e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x1010, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x1011, code lost:
    
        r32 = "content";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x1013, code lost:
    
        r2 = r8;
        r36 = r75;
        r24 = 0;
        r34 = r5;
        r33 = r7;
        r11 = r9;
        r31 = r13;
        r9 = r28;
        r4 = r73;
        r5 = r74;
        r7 = 0;
        r28 = "";
        r3 = r72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:158:0x14dd, B:161:0x14e6], limit reached: 463 */
    /* JADX WARN: Path cross not found for [B:161:0x14e6, B:158:0x14dd], limit reached: 463 */
    /* JADX WARN: Path cross not found for [B:174:0x1540, B:164:0x14ec], limit reached: 463 */
    /* JADX WARN: Path cross not found for [B:174:0x1540, B:166:0x14f2], limit reached: 463 */
    /* JADX WARN: Path cross not found for [B:181:0x1558, B:183:0x157d], limit reached: 463 */
    /* JADX WARN: Path cross not found for [B:183:0x157d, B:181:0x1558], limit reached: 463 */
    /* JADX WARN: Path cross not found for [B:67:0x0f11, B:59:0x0efe], limit reached: 463 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x10e7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x118e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x11ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x11c8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x11f6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x11f9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x1218  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x14dd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x14ec  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x1501  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x1505  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x1553  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x1555  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x1558  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x1608 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x1609  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x1635  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x16c3 A[LOOP:2: B:197:0x16bd->B:199:0x16c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x177e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x177f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x181a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x181b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1ab9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x1c34 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x1c35  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x1cd8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x1cd9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x1d36  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x1dfd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x1e2c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x1e45  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x1ea0  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1ea3  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x1ea7  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x1eb1  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x1ec9  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x21a7  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x2206  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x2346  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x269c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x269d  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x270f  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x27de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x27df  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x2802  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x283a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x292f  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x124b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x1660 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0fbc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0fbd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x1053  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x1056  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x1064  */
    /* JADX WARN: Type inference failed for: r10v71, types: [T, com.pymcl.ai.Usage] */
    /* JADX WARN: Type inference failed for: r36v0, types: [T, com.pymcl.ai.Usage] */
    /* JADX WARN: Type inference failed for: r3v135, types: [T, com.pymcl.ai.Usage] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x1152 -> B:109:0x116f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:335:0x2154 -> B:345:0x2385). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:336:0x21a7 -> B:337:0x2200). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:342:0x229a -> B:343:0x22c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object run(java.lang.String r72, java.lang.String r73, java.lang.String r74, kotlin.jvm.functions.Function2<? super com.pymcl.ai.AiEvent, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r75, kotlin.coroutines.Continuation<? super kotlin.Unit> r76) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 10774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiAgent.run(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: AiAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiAgent$run$2", f = "AiAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.ai.AiAgent$run$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = AiAgent.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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
            Object objM8116constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    AiAgent aiAgent = AiAgent.this;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(aiAgent.mcp.ensure());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence run$lambda$4$0(BgTaskInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence run$lambda$6$0(McpTool t) {
        Intrinsics.checkNotNullParameter(t, "t");
        return t.getFullName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence run$lambda$8(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "- " + it;
    }

    private final List<String> pendingTitles(String chatId) {
        Iterable iterableRunning;
        BackgroundTasks backgroundTasks = this.bg;
        if (backgroundTasks == null || (iterableRunning = backgroundTasks.running(chatId)) == null) {
            return CollectionsKt.emptyList();
        }
        Iterable $this$map$iv = iterableRunning;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            BgTaskInfo it = (BgTaskInfo) item$iv$iv;
            destination$iv$iv.add(it.getTitle());
        }
        return (List) destination$iv$iv;
    }

    private final List<Object> allTools() {
        List it;
        List it2;
        McpManager mcpManager = this.mcp;
        if (mcpManager != null && (it = mcpManager.schemas()) != null) {
            if (it.isEmpty()) {
                it = null;
            }
            if (it != null && (it2 = CollectionsKt.plus((Collection) ToolSchemas.INSTANCE.getALL(), (Iterable) it)) != null) {
                return it2;
            }
        }
        return ToolSchemas.INSTANCE.getALL();
    }

    private final ToolMeta metaOf(String name) {
        McpManager mcpManager;
        McpTool mcpToolFind;
        ToolMeta toolMetaMeta;
        return (!McpManager.INSTANCE.isMcp(name) || (mcpManager = this.mcp) == null || (mcpToolFind = mcpManager.find(name)) == null || (toolMetaMeta = mcpToolFind.meta()) == null) ? ToolMetas.INSTANCE.of(name) : toolMetaMeta;
    }

    private final boolean known(String name) {
        if (!ToolSchemas.INSTANCE.getNAMES().contains(name)) {
            if (McpManager.INSTANCE.isMcp(name)) {
                McpManager mcpManager = this.mcp;
                if ((mcpManager != null ? mcpManager.find(name) : null) != null) {
                }
            }
            return false;
        }
        return true;
    }

    static /* synthetic */ void auditTool$default(AiAgent aiAgent, String str, String str2, ToolCall toolCall, Map map, String str3, String str4, Boolean bool, String str5, long j, String str6, List list, int i, Object obj) {
        aiAgent.auditTool(str, str2, toolCall, map, str3, str4, bool, str5, j, str6, (i & 1024) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void auditTool(String chatId, String turnId, ToolCall tc, Map<String, Object> args, String decision, String reason, Boolean approved, String status, long startMs, String summary, List<String> hookNotes) {
        AuditLog auditLog = this.audit;
        if (auditLog != null) {
            Result.m8115boximpl(auditLog.m7523appendIoAF18A(JsonKt.jobj(TuplesKt.to(NotificationCompat.CATEGORY_EVENT, "tool"), TuplesKt.to("chat_id", chatId), TuplesKt.to("turn_id", turnId), TuplesKt.to("call_id", tc.getId()), TuplesKt.to("tool", tc.getName()), TuplesKt.to(JavaProcessService.EXTRA_ARGS, AuditLog.Companion.summarizeArgs$default(AuditLog.INSTANCE, args, 0, 2, null)), TuplesKt.to("decision", decision), TuplesKt.to("reason", reason), TuplesKt.to("approved", approved), TuplesKt.to(NotificationCompat.CATEGORY_STATUS, status), TuplesKt.to("duration_ms", Long.valueOf(System.currentTimeMillis() - startMs)), TuplesKt.to("summary", StringsKt.take(summary, 200)), TuplesKt.to("hooks", CollectionsKt.toMutableList((Collection) hookNotes)))));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AiAgent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiAgent$pump$2", f = "AiAgent.kt", i = {0, 0}, l = {192}, m = "invokeSuspend", n = {"$this$coroutineScope", "ch"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
    /* renamed from: com.pymcl.ai.AiAgent$pump$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<Function1<? super AiEvent, Unit>, Continuation<? super T>, Object> $block;
        final /* synthetic */ Function2<AiEvent, Continuation<? super Unit>, Object> $emit;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Function1<? super AiEvent, Unit>, ? super Continuation<? super T>, ? extends Object> function2, Function2<? super AiEvent, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$emit = function22;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$emit, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            final Channel ch;
            Channel ch2;
            Object objInvoke;
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ch = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    BuildersKt__Builders_commonKt.launch$default($this$coroutineScope, null, null, new AnonymousClass1(ch, this.$emit, null), 3, null);
                    try {
                        Function2<Function1<? super AiEvent, Unit>, Continuation<? super T>, Object> function2 = this.$block;
                        Function1<? super AiEvent, Unit> function1 = new Function1() { // from class: com.pymcl.ai.AiAgent$pump$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AiAgent.AnonymousClass2.invokeSuspend$lambda$0(ch, (AiEvent) obj);
                            }
                        };
                        this.L$0 = SpillingKt.nullOutSpilledVariable($this$coroutineScope);
                        this.L$1 = ch;
                        this.label = 1;
                        objInvoke = function2.invoke(function1, this);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        SendChannel.DefaultImpls.close$default(ch, null, 1, null);
                        return objInvoke;
                    } catch (Throwable th) {
                        th = th;
                        ch2 = ch;
                        SendChannel.DefaultImpls.close$default(ch2, null, 1, null);
                        throw th;
                    }
                case 1:
                    ch2 = (Channel) this.L$1;
                    try {
                        ResultKt.throwOnFailure($result);
                        ch = ch2;
                        objInvoke = $result;
                        SendChannel.DefaultImpls.close$default(ch, null, 1, null);
                        return objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        SendChannel.DefaultImpls.close$default(ch2, null, 1, null);
                        throw th;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: AiAgent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
        @DebugMetadata(c = "com.pymcl.ai.AiAgent$pump$2$1", f = "AiAgent.kt", i = {1}, l = {191, 191}, m = "invokeSuspend", n = {"e"}, nl = {191, -1}, s = {"L$1"}, v = 2)
        /* renamed from: com.pymcl.ai.AiAgent$pump$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Channel<AiEvent> $ch;
            final /* synthetic */ Function2<AiEvent, Continuation<? super Unit>, Object> $emit;
            Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Channel<AiEvent> channel, Function2<? super AiEvent, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$ch = channel;
                this.$emit = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$ch, this.$emit, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006e -> B:19:0x0075). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.label
                    switch(r1) {
                        case 0: goto L2b;
                        case 1: goto L1f;
                        case 2: goto L11;
                        default: goto L9;
                    }
                L9:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L11:
                    java.lang.Object r1 = r7.L$1
                    com.pymcl.ai.AiEvent r1 = (com.pymcl.ai.AiEvent) r1
                    java.lang.Object r2 = r7.L$0
                    kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                    kotlin.ResultKt.throwOnFailure(r8)
                    r3 = r7
                    goto L75
                L1f:
                    java.lang.Object r1 = r7.L$0
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    kotlin.ResultKt.throwOnFailure(r8)
                    r2 = r7
                    r3 = r1
                    r1 = r0
                    r0 = r8
                    goto L4c
                L2b:
                    kotlin.ResultKt.throwOnFailure(r8)
                    kotlinx.coroutines.channels.Channel<com.pymcl.ai.AiEvent> r1 = r7.$ch
                    kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                    r2 = r7
                L35:
                    r3 = r2
                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                    r2.L$0 = r1
                    r4 = 0
                    r2.L$1 = r4
                    r4 = 1
                    r2.label = r4
                    java.lang.Object r3 = r1.hasNext(r3)
                    if (r3 != r0) goto L47
                    return r0
                L47:
                    r6 = r0
                    r0 = r8
                    r8 = r3
                    r3 = r1
                    r1 = r6
                L4c:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L78
                    java.lang.Object r8 = r3.next()
                    com.pymcl.ai.AiEvent r8 = (com.pymcl.ai.AiEvent) r8
                    kotlin.jvm.functions.Function2<com.pymcl.ai.AiEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r4 = r2.$emit
                    r2.L$0 = r3
                    java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
                    r2.L$1 = r5
                    r5 = 2
                    r2.label = r5
                    java.lang.Object r4 = r4.invoke(r8, r2)
                    if (r4 != r1) goto L6e
                    return r1
                L6e:
                    r6 = r1
                    r1 = r8
                    r8 = r0
                    r0 = r6
                    r6 = r3
                    r3 = r2
                    r2 = r6
                L75:
                    r1 = r2
                    r2 = r3
                    goto L35
                L78:
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiAgent.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Channel $ch, AiEvent it) {
            $ch.mo9656trySendJP2dKIU(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object pump(Function2<? super AiEvent, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super Function1<? super AiEvent, Unit>, ? super Continuation<? super T>, ? extends Object> function22, Continuation<? super T> continuation) {
        return CoroutineScopeKt.coroutineScope(new AnonymousClass2(function22, function2, null), continuation);
    }

    /* compiled from: AiAgent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/ai/AssistantTurn;", "send", "Lkotlin/Function1;", "Lcom/pymcl/ai/AiEvent;", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.ai.AiAgent$streamOnce$2", f = "AiAgent.kt", i = {0}, l = {196}, m = "invokeSuspend", n = {"send"}, nl = {-1}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.ai.AiAgent$streamOnce$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Function1<? super AiEvent, ? extends Unit>, Continuation<? super AssistantTurn>, Object> {
        final /* synthetic */ String $model;
        final /* synthetic */ List<Map<String, Object>> $req;
        final /* synthetic */ AiSettings $st;
        final /* synthetic */ List<Object> $tools;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(AiSettings aiSettings, String str, List<? extends Map<String, Object>> list, List<? extends Object> list2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$st = aiSettings;
            this.$model = str;
            this.$req = list;
            this.$tools = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = AiAgent.this.new AnonymousClass2(this.$st, this.$model, this.$req, this.$tools, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Function1<? super AiEvent, ? extends Unit> function1, Continuation<? super AssistantTurn> continuation) {
            return invoke2((Function1<? super AiEvent, Unit>) function1, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Function1<? super AiEvent, Unit> function1, Continuation<? super AssistantTurn> continuation) {
            return ((AnonymousClass2) create(function1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AssistantTurn invokeSuspend$lambda$0(AiAgent this$0, AiSettings $st, String $model, List $req, List $tools, final Function1 $send) {
            return this$0.client.streamChat($st, $model, $req, $tools, new Function1() { // from class: com.pymcl.ai.AiAgent$streamOnce$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AiAgent.AnonymousClass2.invokeSuspend$lambda$0$0($send, (String) obj);
                }
            }, new Function1() { // from class: com.pymcl.ai.AiAgent$streamOnce$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AiAgent.AnonymousClass2.invokeSuspend$lambda$0$1($send, (String) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$0(Function1 $send, String it) {
            $send.invoke(new AiEvent.Delta(it));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$1(Function1 $send, String it) {
            $send.invoke(new AiEvent.Think(it));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            final Function1 send = (Function1) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CoroutineDispatcher io = Dispatchers.getIO();
                    final AiAgent aiAgent = AiAgent.this;
                    final AiSettings aiSettings = this.$st;
                    final String str = this.$model;
                    final List<Map<String, Object>> list = this.$req;
                    final List<Object> list2 = this.$tools;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(send);
                    this.label = 1;
                    Object objRunInterruptible = InterruptibleKt.runInterruptible(io, new Function0() { // from class: com.pymcl.ai.AiAgent$streamOnce$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AiAgent.AnonymousClass2.invokeSuspend$lambda$0(aiAgent, aiSettings, str, list, list2, send);
                        }
                    }, this);
                    return objRunInterruptible == coroutine_suspended ? coroutine_suspended : objRunInterruptible;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamOnce(AiSettings st, String model, List<? extends Map<String, Object>> list, List<? extends Object> list2, Function2<? super AiEvent, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AssistantTurn> continuation) {
        return pump(function2, new AnonymousClass2(st, model, list, list2, null), continuation);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String defaultTitle(java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiAgent.defaultTitle(java.lang.String, java.util.Map):java.lang.String");
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to apply debug info
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v174 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v189 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v92 java.lang.Object
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v82 java.lang.Object
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v122 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v127 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v85 java.lang.Object
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v0 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v108 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v13 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v164 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v166 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v168 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v170 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v172 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v176 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v178 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v181 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v184 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v188 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v222 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v227 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v7 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v92 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v95 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r29v9 java.lang.Object
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v20 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r53v0 'this'  ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v1 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v105 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v110 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v3 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v4 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v7 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v75 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v90 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v105 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v110 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v112 java.lang.Object
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v114 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v117 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v121 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v123 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v124 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v125 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v126 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v128 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v129 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v3 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v31 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v32 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v33 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v36 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v37 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v41 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v5 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v96 java.lang.Object
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r53v0 'this'  ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01de: MOVE (r26 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY] A[D('pre' com.pymcl.ai.HookOutcome)]), block:B:23:0x01dd */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01e0: MOVE (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY] A[D('args' java.util.Map)]), block:B:23:0x01dd */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x01e1: MOVE (r46 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY] A[D('title' java.lang.String)]), block:B:23:0x01dd */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x01d2: MOVE (r15 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r17 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('isMcp' boolean)]), block:B:21:0x01c5 */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x01e3: MOVE (r16 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r17 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('isMcp' boolean)]), block:B:23:0x01dd */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x01e5: MOVE (r23 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY] A[D('st' com.pymcl.ai.AiSettings)]), block:B:23:0x01dd */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x01ce: MOVE (r5 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY] A[D('tc' com.pymcl.ai.ToolCall)]), block:B:21:0x01c5 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x01ef: MOVE (r4 I:??[OBJECT, ARRAY] A[D('$result' java.lang.Object)]) = (r19 I:??[OBJECT, ARRAY] A[D('tc' com.pymcl.ai.ToolCall)]), block:B:23:0x01dd */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x01f5: MOVE (r3 I:??[OBJECT, ARRAY] A[D('$continuation' kotlin.coroutines.Continuation)]) = (r21 I:??[OBJECT, ARRAY] A[D('turnId' java.lang.String)]), block:B:23:0x01dd */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x01d6: MOVE (r4 I:??[OBJECT, ARRAY] A[D('$result' java.lang.Object)]) = (r22 I:??[OBJECT, ARRAY] A[D('chatId' java.lang.String)]), block:B:21:0x01c5 */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x01e7: MOVE (r2 I:??[OBJECT, ARRAY] A[D('emit' kotlin.jvm.functions.Function2)]) = (r22 I:??[OBJECT, ARRAY] A[D('chatId' java.lang.String)]), block:B:23:0x01dd */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x01f3: MOVE (r6 I:??[OBJECT, ARRAY] A[D('t0' long)]) = (r8 I:??[OBJECT, ARRAY] A[D('decisionTag' java.lang.String)]), block:B:23:0x01dd */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01c5: MOVE (r49 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY] A[D('approved' java.lang.Boolean)]), block:B:21:0x01c5 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01f4: MOVE (r8 I:??[OBJECT, ARRAY] A[D('decisionTag' java.lang.String)]) = (r9 I:??[OBJECT, ARRAY] A[D('approved' java.lang.Boolean)]), block:B:23:0x01dd */
    public final java.lang.Object runTool(java.lang.String r54, java.lang.String r55, java.lang.String r56, com.pymcl.ai.ToolCall r57, com.pymcl.ai.AiSettings r58, kotlin.jvm.functions.Function2<? super com.pymcl.ai.AiEvent, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r59, kotlin.coroutines.Continuation<? super java.lang.String> r60) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 6386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiAgent.runTool(java.lang.String, java.lang.String, java.lang.String, com.pymcl.ai.ToolCall, com.pymcl.ai.AiSettings, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolOutput runTool$lambda$7(AiAgent this$0, ToolCall $tc, Map $args) {
        McpManager mcpManager = this$0.mcp;
        Intrinsics.checkNotNull(mcpManager);
        return mcpManager.call($tc.getName(), $args);
    }

    private final String finishResult(ToolCall tc, ToolOutput out) {
        String body = (out.getNetwork() ? UNTRUSTED : "") + (out.getOk() ? "" : "失败：") + out.getText();
        if (body.length() <= 8000) {
            return body;
        }
        String id = tc.getName() + "-" + System.currentTimeMillis() + ".txt";
        try {
            Result.Companion companion = Result.INSTANCE;
            AiAgent $this$finishResult_u24lambda_u240 = this;
            $this$finishResult_u24lambda_u240.artifactsDir.mkdirs();
            FilesKt.writeText$default(new File($this$finishResult_u24lambda_u240.artifactsDir, id), body, null, 2, null);
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return StringsKt.take(body, 7700) + "\n…（结果共 " + body.length() + " 字符，已截断。完整内容已存为 artifact_id=\"" + id + "\"，用 read_artifact 分页读取）";
    }

    private final String readArtifact(Map<String, Object> a) {
        String str = JsonKt.str(a, "artifact_id");
        if (str == null) {
            str = "";
        }
        String id = StringsKt.substringAfterLast$default(StringsKt.substringAfterLast$default(str, IOUtils.DIR_SEPARATOR_UNIX, (String) null, 2, (Object) null), IOUtils.DIR_SEPARATOR_WINDOWS, (String) null, 2, (Object) null);
        File f = new File(this.artifactsDir, id);
        if (StringsKt.isBlank(id) || !f.isFile()) {
            return "错误：找不到 artifact " + id;
        }
        String t = FilesKt.readText$default(f, null, 1, null);
        Integer numM8042int = JsonKt.m8042int(a, "offset");
        int off = RangesKt.coerceIn(numM8042int != null ? numM8042int.intValue() : 0, 0, t.length());
        Integer numM8042int2 = JsonKt.m8042int(a, "limit");
        int lim = RangesKt.coerceIn(numM8042int2 != null ? numM8042int2.intValue() : 8000, 1, MAX_TOOL_RESULT);
        int end = RangesKt.coerceAtMost(off + lim, t.length());
        String strSubstring = t.substring(off, end);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring + (end < t.length() ? "\n…（还有 " + (t.length() - end) + " 字符，下次 offset=" + end + "）" : "\n（已到结尾）");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0201 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object askUser(com.pymcl.ai.ToolCall r36, java.util.Map<java.lang.String, java.lang.Object> r37, kotlin.jvm.functions.Function2<? super com.pymcl.ai.AiEvent, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r38, kotlin.coroutines.Continuation<? super java.lang.String> r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiAgent.askUser(com.pymcl.ai.ToolCall, java.util.Map, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final List<AskOption> askUser$opts(Object v) {
        Iterable $this$mapIndexedNotNull$iv;
        int $i$f$mapIndexedNotNull;
        AskOption askOption;
        Iterable iterableEmptyList = v instanceof List ? (List) v : null;
        if (iterableEmptyList == null) {
            iterableEmptyList = CollectionsKt.emptyList();
        }
        Iterable $this$mapIndexedNotNull$iv2 = iterableEmptyList;
        int $i$f$mapIndexedNotNull2 = 0;
        Collection destination$iv$iv = new ArrayList();
        int index$iv$iv$iv = 0;
        for (Object item$iv$iv$iv : $this$mapIndexedNotNull$iv2) {
            int index$iv$iv$iv2 = index$iv$iv$iv + 1;
            if (index$iv$iv$iv < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int i = index$iv$iv$iv;
            if (item$iv$iv$iv instanceof String) {
                $this$mapIndexedNotNull$iv = $this$mapIndexedNotNull$iv2;
                $i$f$mapIndexedNotNull = $i$f$mapIndexedNotNull2;
                askOption = new AskOption((String) item$iv$iv$iv, (String) item$iv$iv$iv);
            } else {
                $this$mapIndexedNotNull$iv = $this$mapIndexedNotNull$iv2;
                $i$f$mapIndexedNotNull = $i$f$mapIndexedNotNull2;
                if (item$iv$iv$iv instanceof Map) {
                    Map m = JsonKt.o(item$iv$iv$iv);
                    Intrinsics.checkNotNull(m);
                    String l = JsonKt.str(m, "label");
                    if (l == null && (l = JsonKt.str(m, "id")) == null) {
                        askOption = null;
                    } else {
                        String str = JsonKt.str(m, "id");
                        if (str == null) {
                            str = "o" + i;
                        }
                        askOption = new AskOption(str, l);
                    }
                } else {
                    askOption = null;
                }
            }
            if (askOption != null) {
                destination$iv$iv.add(askOption);
            }
            index$iv$iv$iv = index$iv$iv$iv2;
            $this$mapIndexedNotNull$iv2 = $this$mapIndexedNotNull$iv;
            $i$f$mapIndexedNotNull2 = $i$f$mapIndexedNotNull;
        }
        return (List) destination$iv$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:110|(1:207)|111|112|215|113|114|197|115|116|(1:118)(17:119|213|120|121|205|122|123|142|(0)(0)|149|(0)(0)|160|(0)(0)|164|169|77|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:110|207|111|112|215|113|114|197|115|116|(1:118)(17:119|213|120|121|205|122|123|142|(0)(0)|149|(0)(0)|160|(0)(0)|164|169|77|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:101|203|102|103|205|122|123|142|(1:144)(3:145|(1:147)|148)|149|(5:151|(1:153)(1:154)|155|(1:157)|158)(1:159)|160|(1:162)(1:163)|164|169|77|(3:170|48|(3:187|188|(1:190)(5:191|192|(1:194)|195|196))(0))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:86|(1:88)|89|221|90|91|201|92|93|199|94|(6:209|96|97|217|98|(1:100)(17:101|203|102|103|205|122|123|142|(1:144)(3:145|(1:147)|148)|149|(5:151|(1:153)(1:154)|155|(1:157)|158)(1:159)|160|(1:162)(1:163)|164|169|77|(3:170|48|(3:187|188|(1:190)(5:191|192|(1:194)|195|196))(0))(0)))(11:110|207|111|112|215|113|114|197|115|116|(1:118)(17:119|213|120|121|205|122|123|142|(0)(0)|149|(0)(0)|160|(0)(0)|164|169|77|(0)(0)))|141|142|(0)(0)|149|(0)(0)|160|(0)(0)|164|169|77|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:209|96|97|217|98|(1:100)(17:101|203|102|103|205|122|123|142|(1:144)(3:145|(1:147)|148)|149|(5:151|(1:153)(1:154)|155|(1:157)|158)(1:159)|160|(1:162)(1:163)|164|169|77|(3:170|48|(3:187|188|(1:190)(5:191|192|(1:194)|195|196))(0))(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0597, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0598, code lost:
    
        r4 = r40;
        r26 = r2;
        r9 = r5;
        r2 = r10;
        r12 = r11;
        r34 = r32;
        r5 = r38;
        r11 = r39;
        r32 = r1;
        r1 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0649, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x064a, code lost:
    
        r9 = r14;
        r13 = r32;
        r32 = r30;
        r30 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0661, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0662, code lost:
    
        r4 = r40;
        r12 = r33;
        r26 = r2;
        r9 = r5;
        r2 = r10;
        r34 = r32;
        r1 = r37;
        r5 = r38;
        r11 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0675, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0676, code lost:
    
        r32 = r1;
        r4 = r40;
        r12 = r33;
        r26 = r2;
        r9 = r5;
        r2 = r10;
        r34 = r32;
        r1 = r37;
        r5 = r38;
        r11 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x06a3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x06a4, code lost:
    
        r32 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x06a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x06a8, code lost:
    
        r32 = r1;
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x06ac, code lost:
    
        r1 = r11;
        r11 = r12;
        r4 = r40;
        r12 = r1;
        r26 = r2;
        r9 = r5;
        r2 = r10;
        r34 = r11;
        r1 = r37;
        r5 = r38;
        r11 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x06be, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x06bf, code lost:
    
        r32 = r1;
        r30 = r4;
        r31 = r9;
        r1 = r11;
        r11 = r12;
        r4 = r40;
        r12 = r1;
        r26 = r2;
        r9 = r5;
        r2 = r10;
        r34 = r11;
        r1 = r37;
        r5 = r38;
        r11 = r39;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0973 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0a13 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0581 -> B:205:0x0638). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x061a -> B:213:0x0633). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x06d6 -> B:142:0x06f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0487 -> B:77:0x049f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object subagent(com.pymcl.ai.ToolCall r37, java.util.Map<java.lang.String, java.lang.Object> r38, com.pymcl.ai.AiSettings r39, kotlin.jvm.functions.Function2<? super com.pymcl.ai.AiEvent, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r40, kotlin.coroutines.Continuation<? super java.lang.String> r41) {
        /*
            Method dump skipped, instructions count: 2634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiAgent.subagent(com.pymcl.ai.ToolCall, java.util.Map, com.pymcl.ai.AiSettings, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssistantTurn subagent$lambda$3(AiAgent this$0, AiSettings $st, List $msgs, List $subTools) {
        return this$0.client.streamChat($st, $st.getModel(), $msgs, $subTools, new Function1() { // from class: com.pymcl.ai.AiAgent$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiAgent.subagent$lambda$3$0((String) obj);
            }
        }, new Function1() { // from class: com.pymcl.ai.AiAgent$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiAgent.subagent$lambda$3$1((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subagent$lambda$3$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subagent$lambda$3$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolOutput subagent$lambda$4$0(AiAgent $this_runCatching, ToolCall $c, Map $args) {
        McpManager mcpManager = $this_runCatching.mcp;
        Intrinsics.checkNotNull(mcpManager);
        return mcpManager.call($c.getName(), $args);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subagent$lambda$4$1(Float f, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object maybeCompact(java.lang.String r36, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r37, java.lang.String r38, com.pymcl.ai.AiSettings r39, int r40, kotlin.jvm.functions.Function2<? super com.pymcl.ai.AiEvent, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r41, kotlin.coroutines.Continuation<? super kotlin.Unit> r42) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiAgent.maybeCompact(java.lang.String, java.util.List, java.lang.String, com.pymcl.ai.AiSettings, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence maybeCompact$lambda$0(Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = JsonKt.str(it, "role");
        Object obj = it.get("content");
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            str2 = "";
        }
        return str + ": " + StringsKt.take(str2, 2000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String maybeCompact$lambda$1(AiAgent this$0, AiSettings $st, String $text) {
        return this$0.client.complete($st, $st.getModel(), CollectionsKt.listOf((Object[]) new Map[]{JsonKt.jobj(TuplesKt.to("role", "system"), TuplesKt.to("content", Prompts.SUMMARY)), JsonKt.jobj(TuplesKt.to("role", "user"), TuplesKt.to("content", StringsKt.takeLast($text, 60000)))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence maybeCompact$lambda$2$1(Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get("content");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        return "- " + StringsKt.take(str, 200);
    }

    /* compiled from: AiAgent.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/pymcl/ai/AiAgent$RewindResult;", "", "rollback", "Lcom/pymcl/ai/RollbackResult;", "userText", "", "cancelledTasks", "", "Lcom/pymcl/ai/BgTaskInfo;", "<init>", "(Lcom/pymcl/ai/RollbackResult;Ljava/lang/String;Ljava/util/List;)V", "getRollback", "()Lcom/pymcl/ai/RollbackResult;", "getUserText", "()Ljava/lang/String;", "getCancelledTasks", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RewindResult {
        private final List<BgTaskInfo> cancelledTasks;
        private final RollbackResult rollback;
        private final String userText;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RewindResult copy$default(RewindResult rewindResult, RollbackResult rollbackResult, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                rollbackResult = rewindResult.rollback;
            }
            if ((i & 2) != 0) {
                str = rewindResult.userText;
            }
            if ((i & 4) != 0) {
                list = rewindResult.cancelledTasks;
            }
            return rewindResult.copy(rollbackResult, str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final RollbackResult getRollback() {
            return this.rollback;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUserText() {
            return this.userText;
        }

        public final List<BgTaskInfo> component3() {
            return this.cancelledTasks;
        }

        public final RewindResult copy(RollbackResult rollback, String userText, List<BgTaskInfo> cancelledTasks) {
            Intrinsics.checkNotNullParameter(rollback, "rollback");
            Intrinsics.checkNotNullParameter(cancelledTasks, "cancelledTasks");
            return new RewindResult(rollback, userText, cancelledTasks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RewindResult)) {
                return false;
            }
            RewindResult rewindResult = (RewindResult) other;
            return Intrinsics.areEqual(this.rollback, rewindResult.rollback) && Intrinsics.areEqual(this.userText, rewindResult.userText) && Intrinsics.areEqual(this.cancelledTasks, rewindResult.cancelledTasks);
        }

        public int hashCode() {
            return (((this.rollback.hashCode() * 31) + (this.userText == null ? 0 : this.userText.hashCode())) * 31) + this.cancelledTasks.hashCode();
        }

        public String toString() {
            return "RewindResult(rollback=" + this.rollback + ", userText=" + this.userText + ", cancelledTasks=" + this.cancelledTasks + ")";
        }

        public RewindResult(RollbackResult rollback, String userText, List<BgTaskInfo> cancelledTasks) {
            Intrinsics.checkNotNullParameter(rollback, "rollback");
            Intrinsics.checkNotNullParameter(cancelledTasks, "cancelledTasks");
            this.rollback = rollback;
            this.userText = userText;
            this.cancelledTasks = cancelledTasks;
        }

        public /* synthetic */ RewindResult(RollbackResult rollbackResult, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rollbackResult, str, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<BgTaskInfo> getCancelledTasks() {
            return this.cancelledTasks;
        }

        public final RollbackResult getRollback() {
            return this.rollback;
        }

        public final String getUserText() {
            return this.userText;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0262 A[PHI: r1 r6 r9 r14 r15
  0x0262: PHI (r1v2 'chatId' java.lang.String) = (r1v0 'chatId' java.lang.String), (r1v3 'chatId' java.lang.String) binds: [B:70:0x0260, B:68:0x025d] A[DONT_GENERATE, DONT_INLINE]
  0x0262: PHI (r6v10 'cut' int) = (r6v6 'cut' int), (r6v11 'cut' int) binds: [B:70:0x0260, B:68:0x025d] A[DONT_GENERATE, DONT_INLINE]
  0x0262: PHI (r9v4 'idx' int) = (r9v2 'idx' int), (r9v5 'idx' int) binds: [B:70:0x0260, B:68:0x025d] A[DONT_GENERATE, DONT_INLINE]
  0x0262: PHI (r14v6 'turnId' java.lang.String) = (r14v0 'turnId' java.lang.String), (r14v7 'turnId' java.lang.String) binds: [B:70:0x0260, B:68:0x025d] A[DONT_GENERATE, DONT_INLINE]
  0x0262: PHI (r15v2 'msgs' java.util.List) = (r15v0 'msgs' java.util.List), (r15v3 'msgs' java.util.List) binds: [B:70:0x0260, B:68:0x025d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object rewind(java.lang.String r38, kotlin.coroutines.Continuation<? super com.pymcl.ai.AiAgent.RewindResult> r39) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiAgent.rewind(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
