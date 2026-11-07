package com.pymcl.ai;

import androidx.autofill.HintConstants;
import com.pymcl.ai.McpHttp;
import com.pymcl.ai.McpNotify;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.process.JavaProcessService;
import java.io.Closeable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.util.spvc.Spv;

/* compiled from: Mcp.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 a2\u00020\u0001:\u0001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r09H\u0002J\u0006\u0010:\u001a\u00020/J \u0010;\u001a\u00020\"2\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u0017J\u0006\u0010=\u001a\u00020\"J\u0010\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020\u0013H\u0002J\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\rJ\u000e\u0010C\u001a\u00020A2\u0006\u0010B\u001a\u00020\rJ\r\u0010D\u001a\u0004\u0018\u00010E¢\u0006\u0002\u0010FJ\r\u0010G\u001a\u0004\u0018\u00010E¢\u0006\u0002\u0010FJ\f\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IJR\u0010K\u001a(\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u00170I\u0012\u0006\u0012\u0004\u0018\u00010\r0L2\u0006\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010P\u001a\u00020EH\u0002J\u0010\u0010Q\u001a\u00020A2\b\u0010O\u001a\u0004\u0018\u00010\rJ\u000e\u0010R\u001a\u00020A2\u0006\u0010B\u001a\u00020\rJ\u0010\u0010S\u001a\u00020A2\b\u0010O\u001a\u0004\u0018\u00010\rJ,\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020\r2\u001c\u0010V\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017J(\u0010W\u001a\u00020A2\u0006\u0010U\u001a\u00020\r2\u0018\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u0017J\u0010\u0010X\u001a\u00020/2\u0006\u0010M\u001a\u00020\rH\u0002J\u0010\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\rH\u0002J:\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u00172\u0006\u0010M\u001a\u00020\r2\u0018\u0010]\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u0017J4\u0010^\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u00172\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u0017H\u0002J\b\u0010_\u001a\u00020/H\u0002J\b\u0010`\u001a\u00020/H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u0013\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u00170\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bRB\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010'\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R(\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020/\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001b¨\u0006b"}, d2 = {"Lcom/pymcl/ai/McpClient;", "Ljava/io/Closeable;", "config", "Lcom/pymcl/ai/McpServerConfig;", "http", "Lcom/pymcl/ai/McpHttp;", "<init>", "(Lcom/pymcl/ai/McpServerConfig;Lcom/pymcl/ai/McpHttp;)V", "getConfig", "()Lcom/pymcl/ai/McpServerConfig;", "ids", "Ljava/util/concurrent/atomic/AtomicLong;", "session", "", "sseEndpoint", "sseStream", "Lcom/pymcl/ai/AiLineStream;", "waiting", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/CompletableFuture;", "", "", "Lcom/pymcl/core/util/JObj;", "value", "serverInfo", "getServerInfo", "()Ljava/lang/String;", "capabilities", "getCapabilities", "()Ljava/util/Map;", "protocolVersion", "getProtocolVersion", "hasResources", "", "getHasResources", "()Z", "hasPrompts", "getHasPrompts", "hasSubscribe", "getHasSubscribe", "changes", "Lcom/pymcl/ai/McpChangeSet;", "getChanges", "()Lcom/pymcl/ai/McpChangeSet;", "onNotification", "Lkotlin/Function1;", "", "getOnNotification", "()Lkotlin/jvm/functions/Function1;", "setOnNotification", "(Lkotlin/jvm/functions/Function1;)V", "closed", "listenStream", "listenerState", "getListenerState", "baseHeaders", "", "connect", "handleIncoming", "o", "startListener", "sleepQuiet", "ms", "subscribe", "Lcom/pymcl/ai/ToolOutput;", "uri", "unsubscribe", "countResources", "", "()Ljava/lang/Integer;", "countPrompts", "listTools", "", "Lcom/pymcl/ai/McpTool;", "paged", "Lkotlin/Pair;", "method", "key", "cursor", "maxItems", "listResources", "readResource", "listPrompts", "getPrompt", HintConstants.AUTOFILL_HINT_NAME, JavaProcessService.EXTRA_ARGS, "callTool", "notify", "post", "Lcom/pymcl/ai/McpHttp$Resp;", "body", "rpc", "params", "unwrap", "openSse", "close", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class McpClient implements Closeable {
    public static final String CLIENT_NAME = "PyMCL-Android";
    public static final int MAX_PAGES = 20;
    public static final String PROTOCOL = "2025-06-18";
    private volatile Map<String, Object> capabilities;
    private final McpChangeSet changes;
    private volatile boolean closed;
    private final McpServerConfig config;
    private final McpHttp http;
    private final AtomicLong ids;
    private volatile AiLineStream listenStream;
    private volatile String listenerState;
    private volatile Function1<? super String, Unit> onNotification;
    private volatile String protocolVersion;
    private volatile String serverInfo;
    private volatile String session;
    private volatile String sseEndpoint;
    private volatile AiLineStream sseStream;
    private final ConcurrentHashMap<Long, CompletableFuture<Map<String, Object>>> waiting;

    public McpClient(McpServerConfig config, McpHttp http) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(http, "http");
        this.config = config;
        this.http = http;
        this.ids = new AtomicLong(1L);
        this.waiting = new ConcurrentHashMap<>();
        this.serverInfo = "";
        this.capabilities = JsonKt.jobj(new Pair[0]);
        this.protocolVersion = PROTOCOL;
        this.changes = new McpChangeSet();
        this.listenerState = "idle";
    }

    public final McpServerConfig getConfig() {
        return this.config;
    }

    public final String getServerInfo() {
        return this.serverInfo;
    }

    public final Map<String, Object> getCapabilities() {
        return this.capabilities;
    }

    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    public final boolean getHasResources() {
        return JsonKt.obj(this.capabilities, "resources") != null;
    }

    public final boolean getHasPrompts() {
        return JsonKt.obj(this.capabilities, "prompts") != null;
    }

    public final boolean getHasSubscribe() {
        return McpNotify.INSTANCE.canSubscribe(this.capabilities);
    }

    public final McpChangeSet getChanges() {
        return this.changes;
    }

    public final Function1<String, Unit> getOnNotification() {
        return this.onNotification;
    }

    public final void setOnNotification(Function1<? super String, Unit> function1) {
        this.onNotification = function1;
    }

    public final String getListenerState() {
        return this.listenerState;
    }

    private final Map<String, String> baseHeaders() {
        Map<String, String> headers = this.config.getHeaders();
        Pair[] pairArr = new Pair[2];
        String it = this.session;
        pairArr[0] = it != null ? TuplesKt.to("Mcp-Session-Id", it) : null;
        pairArr[1] = TuplesKt.to("MCP-Protocol-Version", this.protocolVersion);
        return MapsKt.plus(headers, CollectionsKt.listOfNotNull((Object[]) pairArr));
    }

    public final void connect() throws McpException {
        String it;
        if (Intrinsics.areEqual(this.config.getType(), "sse")) {
            openSse();
        }
        Map r = rpc("initialize", JsonKt.jobj(TuplesKt.to("protocolVersion", PROTOCOL), TuplesKt.to("capabilities", JsonKt.jobj(new Pair[0])), TuplesKt.to("clientInfo", JsonKt.jobj(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, CLIENT_NAME), TuplesKt.to("version", "0.9.3")))));
        Map<String, Object> mapObj = JsonKt.obj(r, "capabilities");
        if (mapObj == null) {
            mapObj = JsonKt.jobj(new Pair[0]);
        }
        this.capabilities = mapObj;
        String it2 = JsonKt.str(r, "protocolVersion");
        if (it2 != null) {
            if (StringsKt.isBlank(it2)) {
                it2 = null;
            }
            if (it2 != null) {
                this.protocolVersion = it2;
            }
        }
        String str = JsonKt.str(JsonKt.obj(r, "serverInfo"), HintConstants.AUTOFILL_HINT_NAME);
        if (str == null) {
            str = this.config.getName();
        }
        String it3 = JsonKt.str(JsonKt.obj(r, "serverInfo"), "version");
        if (it3 == null || (it = StringUtils.SPACE + it3) == null) {
            it = "";
        }
        this.serverInfo = str + it;
        notify("notifications/initialized");
    }

    public final boolean handleIncoming(Map<String, Object> o) {
        Intrinsics.checkNotNullParameter(o, "o");
        McpNotify.Msg m = McpNotify.INSTANCE.classify(o);
        Unit unit = null;
        if (!(m instanceof McpNotify.Msg.Notification)) {
            if (!(m instanceof McpNotify.Msg.Request)) {
                return false;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                McpClient $this$handleIncoming_u24lambda_u241 = this;
                $this$handleIncoming_u24lambda_u241.post(Json.stringify$default(Json.INSTANCE, McpNotify.INSTANCE.replyFor((McpNotify.Msg.Request) m), false, 2, null)).getLines().close();
                Result.m8116constructorimpl(Unit.INSTANCE);
                return true;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
                return true;
            }
        }
        if (!this.changes.apply(((McpNotify.Msg.Notification) m).getMethod(), ((McpNotify.Msg.Notification) m).getParams())) {
            return true;
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            McpClient $this$handleIncoming_u24lambda_u240 = this;
            Function1<? super String, Unit> function1 = $this$handleIncoming_u24lambda_u240.onNotification;
            if (function1 != null) {
                function1.invoke(((McpNotify.Msg.Notification) m).getMethod());
                unit = Unit.INSTANCE;
            }
            Result.m8116constructorimpl(unit);
            return true;
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th2));
            return true;
        }
    }

    public final boolean startListener() {
        if (!Intrinsics.areEqual(this.config.getType(), "http") || this.closed || !McpNotify.INSTANCE.wantsListener(this.capabilities) || Intrinsics.areEqual(this.listenerState, "listening") || Intrinsics.areEqual(this.listenerState, "unsupported")) {
            return false;
        }
        this.listenerState = "listening";
        Thread t = new Thread(new Runnable() { // from class: com.pymcl.ai.McpClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                McpClient.startListener$lambda$0(this.f$0);
            }
        }, "mcp-listen-" + this.config.getName());
        t.setDaemon(true);
        t.start();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startListener$lambda$0(final McpClient this$0) throws InterruptedException {
        McpHttp.Resp respRequest;
        String l;
        int fails = 0;
        while (!this$0.closed) {
            try {
                respRequest = this$0.http.request("GET", this$0.config.getUrl(), MapsKt.plus(this$0.baseHeaders(), TuplesKt.to("Accept", "text/event-stream")), null, 0);
            } catch (Exception e) {
                respRequest = null;
            }
            McpHttp.Resp r = respRequest;
            if (r == null) {
                fails++;
                if (fails >= 3) {
                    break;
                } else {
                    this$0.sleepQuiet(McpNotify.INSTANCE.backoffMs(fails));
                }
            } else {
                if (r.getCode() != 405) {
                    int code = r.getCode();
                    if (!(200 <= code && code < 300) || StringsKt.contains$default((CharSequence) r.getContentType(), (CharSequence) "text/event-stream", false, 2, (Object) null)) {
                        int code2 = r.getCode();
                        if (!(200 <= code2 && code2 < 300)) {
                            r.getLines().close();
                            fails++;
                            if (fails >= 3) {
                                break;
                            } else {
                                this$0.sleepQuiet(McpNotify.INSTANCE.backoffMs(fails));
                            }
                        } else {
                            this$0.listenStream = r.getLines();
                            final Ref.BooleanRef got = new Ref.BooleanRef();
                            SseParser p = new SseParser(new Function1() { // from class: com.pymcl.ai.McpClient$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return McpClient.startListener$lambda$0$0(this.f$0, got, (String) obj);
                                }
                            });
                            while (!this$0.closed && (l = r.getLines().readLine()) != null) {
                                try {
                                    p.feed(l);
                                } catch (Exception e2) {
                                }
                            }
                            p.flush();
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                r.getLines().close();
                                Result.m8116constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                Result.m8116constructorimpl(ResultKt.createFailure(th));
                            }
                            this$0.listenStream = null;
                            if (!this$0.closed) {
                                fails = got.element ? 0 : fails + 1;
                                if (fails >= 3) {
                                    break;
                                } else {
                                    this$0.sleepQuiet(McpNotify.INSTANCE.backoffMs(RangesKt.coerceAtLeast(fails, 1)));
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                r.getLines().close();
                this$0.listenerState = "unsupported";
                return;
            }
        }
        if (Intrinsics.areEqual(this$0.listenerState, "listening")) {
            this$0.listenerState = "stopped";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startListener$lambda$0$0(McpClient this$0, Ref.BooleanRef $got, String data) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(Json.INSTANCE.obj(data));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        Map it = (Map) objM8116constructorimpl;
        if (it != null) {
            $got.element = true;
            this$0.handleIncoming(it);
        }
        return Unit.INSTANCE;
    }

    private final void sleepQuiet(long ms) throws InterruptedException {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }

    public final ToolOutput subscribe(String uri) throws McpException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!getHasSubscribe()) {
            return ToolOutput.INSTANCE.err("服务器 " + this.config.getName() + " 不支持订阅资源（resources.subscribe）");
        }
        if (StringsKt.isBlank(uri)) {
            return ToolOutput.INSTANCE.err("缺少 uri");
        }
        rpc("resources/subscribe", JsonKt.jobj(TuplesKt.to("uri", uri)));
        return new ToolOutput(true, "已订阅 " + uri + "：资源有更新时会在下一轮提示你", true);
    }

    public final ToolOutput unsubscribe(String uri) throws McpException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!getHasSubscribe()) {
            return ToolOutput.INSTANCE.err("服务器 " + this.config.getName() + " 不支持订阅资源（resources.subscribe）");
        }
        if (StringsKt.isBlank(uri)) {
            return ToolOutput.INSTANCE.err("缺少 uri");
        }
        rpc("resources/unsubscribe", JsonKt.jobj(TuplesKt.to("uri", uri)));
        this.changes.clearUpdated(uri);
        return new ToolOutput(true, "已取消订阅 " + uri, true);
    }

    public final Integer countResources() {
        Object objM8116constructorimpl;
        if (!getHasResources()) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            McpClient $this$countResources_u24lambda_u240 = this;
            objM8116constructorimpl = Result.m8116constructorimpl(Integer.valueOf(((List) paged$default($this$countResources_u24lambda_u240, "resources/list", "resources", null, 0, 8, null).getFirst()).size()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
    }

    public final Integer countPrompts() {
        Object objM8116constructorimpl;
        if (!getHasPrompts()) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            McpClient $this$countPrompts_u24lambda_u240 = this;
            objM8116constructorimpl = Result.m8116constructorimpl(Integer.valueOf(((List) paged$default($this$countPrompts_u24lambda_u240, "prompts/list", "prompts", null, 0, 8, null).getFirst()).size()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
    }

    public final List<McpTool> listTools() throws McpException {
        boolean z;
        List out = new ArrayList();
        String cursor = null;
        int pages = 0;
        do {
            int i = 0;
            boolean z2 = true;
            Map r = rpc("tools/list", cursor != null ? JsonKt.jobj(TuplesKt.to("cursor", cursor)) : JsonKt.jobj(new Pair[0]));
            Iterable $this$forEach$iv = JsonKt.objs(JsonKt.arr(r, "tools"));
            for (Object element$iv : $this$forEach$iv) {
                Map t = (Map) element$iv;
                Map ann = JsonKt.obj(t, "annotations");
                List list = out;
                String name = this.config.getName();
                String str = JsonKt.str(t, HintConstants.AUTOFILL_HINT_NAME);
                if (str == null) {
                    z = z2;
                } else {
                    String str2 = JsonKt.str(t, "description");
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    Map<String, Object> mapObj = JsonKt.obj(t, "inputSchema");
                    if (mapObj == null) {
                        mapObj = JsonKt.jobj(new Pair[i]);
                    }
                    z = z2;
                    list.add(new McpTool(name, str, str3, mapObj, Intrinsics.areEqual(JsonKt.bool(ann, "readOnlyHint"), Boolean.valueOf(z)), (!Intrinsics.areEqual(JsonKt.bool(ann, "destructiveHint"), Boolean.valueOf(z)) || Intrinsics.areEqual(JsonKt.bool(ann, "readOnlyHint"), Boolean.valueOf(z))) ? false : z, null, 64, null));
                }
                z2 = z;
                i = 0;
            }
            String it = JsonKt.str(r, "nextCursor");
            if (it == null || StringsKt.isBlank(it)) {
                it = null;
            }
            cursor = it;
            if (cursor == null) {
                break;
            }
            pages++;
        } while (pages < 20);
        return out;
    }

    static /* synthetic */ Pair paged$default(McpClient mcpClient, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 200;
        }
        return mcpClient.paged(str, str2, str3, i);
    }

    private final Pair<List<Map<String, Object>>, String> paged(String method, String key, String cursor, int maxItems) throws McpException {
        List out = new ArrayList();
        String c = cursor;
        int pages = 0;
        do {
            Map r = rpc(method, c != null ? JsonKt.jobj(TuplesKt.to("cursor", c)) : JsonKt.jobj(new Pair[0]));
            CollectionsKt.addAll(out, JsonKt.objs(JsonKt.arr(r, key)));
            String it = JsonKt.str(r, "nextCursor");
            if (it == null || StringsKt.isBlank(it)) {
                it = null;
            }
            c = it;
            if (cursor != null || c == null || (pages = pages + 1) >= 20) {
                break;
            }
        } while (out.size() < maxItems);
        return TuplesKt.to(out, c);
    }

    public final ToolOutput listResources(String cursor) {
        Object objM8116constructorimpl;
        List tpl;
        if (!getHasResources()) {
            return ToolOutput.INSTANCE.err("服务器 " + this.config.getName() + " 没有声明 resources 能力");
        }
        Pair pairPaged$default = paged$default(this, "resources/list", "resources", cursor, 0, 8, null);
        List res = (List) pairPaged$default.component1();
        String next = (String) pairPaged$default.component2();
        if (cursor == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                McpClient $this$listResources_u24lambda_u240 = this;
                objM8116constructorimpl = Result.m8116constructorimpl((List) paged$default($this$listResources_u24lambda_u240, "resources/templates/list", "resourceTemplates", null, 0, 8, null).getFirst());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            List listEmptyList = CollectionsKt.emptyList();
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                objM8116constructorimpl = listEmptyList;
            }
            tpl = (List) objM8116constructorimpl;
        } else {
            tpl = CollectionsKt.emptyList();
        }
        return new ToolOutput(true, McpFormat.INSTANCE.resourceList(res, tpl, next), true);
    }

    public final ToolOutput readResource(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!getHasResources()) {
            return ToolOutput.INSTANCE.err("服务器 " + this.config.getName() + " 没有声明 resources 能力");
        }
        if (StringsKt.isBlank(uri)) {
            return ToolOutput.INSTANCE.err("缺少 uri");
        }
        ToolOutput out = new ToolOutput(true, McpFormat.INSTANCE.readResult(rpc("resources/read", JsonKt.jobj(TuplesKt.to("uri", uri)))), true);
        this.changes.clearUpdated(uri);
        return out;
    }

    public final ToolOutput listPrompts(String cursor) {
        if (!getHasPrompts()) {
            return ToolOutput.INSTANCE.err("服务器 " + this.config.getName() + " 没有声明 prompts 能力");
        }
        Pair pairPaged$default = paged$default(this, "prompts/list", "prompts", cursor, 0, 8, null);
        List ps = (List) pairPaged$default.component1();
        String next = (String) pairPaged$default.component2();
        return new ToolOutput(true, McpFormat.INSTANCE.promptList(ps, next), true);
    }

    public final ToolOutput getPrompt(String name, Map<String, Object> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!getHasPrompts()) {
            return ToolOutput.INSTANCE.err("服务器 " + this.config.getName() + " 没有声明 prompts 能力");
        }
        if (StringsKt.isBlank(name)) {
            return ToolOutput.INSTANCE.err("缺少 name");
        }
        Map<String, Object> p = JsonKt.jobj(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, name));
        Map it = McpFormat.INSTANCE.promptArgs(args);
        if (it.isEmpty()) {
            it = null;
        }
        if (it != null) {
            p.put("arguments", it);
        }
        return new ToolOutput(true, McpFormat.INSTANCE.promptResult(rpc("prompts/get", p)), true);
    }

    public final ToolOutput callTool(String name, Map<String, Object> args) throws McpException {
        String strStringify$default;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Map r = rpc("tools/call", JsonKt.jobj(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, name), TuplesKt.to("arguments", args)));
        String strJoinToString$default = CollectionsKt.joinToString$default(JsonKt.objs(JsonKt.arr(r, "content")), StringUtils.LF, null, null, 0, null, new Function1() { // from class: com.pymcl.ai.McpClient$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McpClient.callTool$lambda$0((Map) obj);
            }
        }, 30, null);
        if (StringsKt.isBlank(strJoinToString$default)) {
            Map it = JsonKt.obj(r, "structuredContent");
            if (it == null || (strStringify$default = Json.stringify$default(Json.INSTANCE, it, false, 2, null)) == null) {
                strStringify$default = "（无输出）";
            }
            strJoinToString$default = strStringify$default;
        }
        String text = strJoinToString$default;
        return new ToolOutput(!Intrinsics.areEqual((Object) JsonKt.bool(r, "isError"), (Object) true), text, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence callTool$lambda$0(Map c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return McpFormat.INSTANCE.content(c);
    }

    private final void notify(String method) {
        String body = Json.stringify$default(Json.INSTANCE, JsonKt.jobj(TuplesKt.to("jsonrpc", "2.0"), TuplesKt.to("method", method)), false, 2, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            McpClient $this$notify_u24lambda_u240 = this;
            $this$notify_u24lambda_u240.post(body).getLines().close();
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final McpHttp.Resp post(String body) throws McpException {
        String url;
        if (Intrinsics.areEqual(this.config.getType(), "sse")) {
            url = this.sseEndpoint;
            if (url == null) {
                throw new McpException("SSE 未拿到 endpoint");
            }
        } else {
            url = this.config.getUrl();
        }
        String url2 = url;
        return this.http.request("POST", url2, MapsKt.plus(baseHeaders(), TuplesKt.to("Accept", "application/json, text/event-stream")), body, this.config.getTimeoutMs());
    }

    public final Map<String, Object> rpc(String method, Map<String, Object> params) throws McpException {
        final McpHttp.Resp r;
        Map o;
        Object obj;
        String l;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(params, "params");
        final long id = this.ids.getAndIncrement();
        boolean z = false;
        String body = Json.stringify$default(Json.INSTANCE, JsonKt.jobj(TuplesKt.to("jsonrpc", "2.0"), TuplesKt.to("id", Long.valueOf(id)), TuplesKt.to("method", method), TuplesKt.to("params", params)), false, 2, null);
        if (Intrinsics.areEqual(this.config.getType(), "sse")) {
            CompletableFuture f = new CompletableFuture();
            this.waiting.put(Long.valueOf(id), f);
            try {
                try {
                    r = post(body);
                    int code = r.getCode();
                    if (200 <= code && code < 300) {
                        z = true;
                    }
                    if (!z) {
                        throw new McpException("HTTP " + code);
                    }
                    Map<String, Object> map = f.get(this.config.getTimeoutMs(), TimeUnit.MILLISECONDS);
                    Intrinsics.checkNotNullExpressionValue(map, "get(...)");
                    return unwrap(map);
                } catch (TimeoutException e) {
                    throw new McpException(method + " 超时");
                }
            } finally {
                this.waiting.remove(Long.valueOf(id));
            }
        }
        r = post(body);
        String it = r.getHeaders().get("mcp-session-id");
        if (it != null) {
            if (StringsKt.isBlank(it)) {
                it = null;
            }
            if (it != null) {
                this.session = it;
            }
        }
        try {
            if (r.getCode() == 404 && this.session != null) {
                this.session = null;
                throw new McpException("会话已失效（HTTP 404）");
            }
            int code2 = r.getCode();
            if (!(200 <= code2 && code2 < 300)) {
                throw new McpException("HTTP " + r.getCode() + ": " + StringsKt.take(SequencesKt.joinToString$default(SequencesKt.take(SequencesKt.generateSequence(new Function0() { // from class: com.pymcl.ai.McpClient$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return McpClient.rpc$lambda$2(r);
                    }
                }), 5), StringUtils.SPACE, null, null, 0, null, null, 62, null), 200));
            }
            if (StringsKt.contains$default((CharSequence) r.getContentType(), (CharSequence) "text/event-stream", false, 2, (Object) null)) {
                final Ref.ObjectRef found = new Ref.ObjectRef();
                SseParser p = new SseParser(new Function1() { // from class: com.pymcl.ai.McpClient$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return McpClient.rpc$lambda$3(this.f$0, id, found, (String) obj2);
                    }
                });
                while (found.element == 0 && (l = r.getLines().readLine()) != null) {
                    p.feed(l);
                }
                p.flush();
                Map<String, Object> map2 = (Map) found.element;
                if (map2 != null) {
                    return unwrap(map2);
                }
                throw new McpException(method + " 没有返回结果");
            }
            String txt = SequencesKt.joinToString$default(SequencesKt.generateSequence(new Function0() { // from class: com.pymcl.ai.McpClient$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return McpClient.rpc$lambda$4(r);
                }
            }), StringUtils.LF, null, null, 0, null, null, 62, null);
            Object v = Json.INSTANCE.parse(txt);
            if (v instanceof List) {
                Iterable $this$mapNotNull$iv = (Iterable) v;
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                    Map<String, Object> mapO = JsonKt.o(element$iv$iv$iv);
                    if (mapO != null) {
                        destination$iv$iv.add(mapO);
                    }
                }
                Iterable $this$filter$iv = (List) destination$iv$iv;
                Collection destination$iv$iv2 = new ArrayList();
                for (Object element$iv$iv : $this$filter$iv) {
                    if (!handleIncoming((Map) element$iv$iv)) {
                        destination$iv$iv2.add(element$iv$iv);
                    }
                }
                Iterable $this$firstOrNull$iv = (List) destination$iv$iv2;
                Iterator it2 = $this$firstOrNull$iv.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object element$iv = it2.next();
                    Long lM8043long = JsonKt.m8043long((Map) element$iv, "id");
                    if (lM8043long != null && lM8043long.longValue() == id) {
                        obj = element$iv;
                        break;
                    }
                }
                o = (Map) obj;
            } else {
                o = JsonKt.o(v);
            }
            if (o != null) {
                return unwrap(o);
            }
            throw new McpException(method + " 响应不是 JSON-RPC");
        } finally {
            r.getLines().close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rpc$lambda$2(McpHttp.Resp $r) {
        return $r.getLines().readLine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.Map] */
    public static final Unit rpc$lambda$3(McpClient mcpClient, long $id, Ref.ObjectRef $found, String data) {
        Object objM8116constructorimpl;
        Long lM8043long;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(Json.INSTANCE.obj(data));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        ?? r0 = (Map) objM8116constructorimpl;
        if (r0 != 0 && !mcpClient.handleIncoming(r0) && (lM8043long = JsonKt.m8043long(r0, "id")) != null && lM8043long.longValue() == $id) {
            $found.element = r0;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rpc$lambda$4(McpHttp.Resp $r) {
        return $r.getLines().readLine();
    }

    private final Map<String, Object> unwrap(Map<String, Object> o) throws McpException {
        Map it = JsonKt.obj(o, "error");
        if (it != null) {
            Object objM8043long = JsonKt.m8043long(it, "code");
            if (objM8043long == null) {
                objM8043long = "";
            }
            String str = JsonKt.str(it, "message");
            throw new McpException("MCP 错误 " + objM8043long + ": " + (str != null ? str : ""));
        }
        Map<String, Object> mapObj = JsonKt.obj(o, "result");
        return mapObj == null ? JsonKt.jobj(new Pair[0]) : mapObj;
    }

    private final void openSse() throws McpException {
        Object objM8116constructorimpl;
        final McpHttp.Resp r = this.http.request("GET", this.config.getUrl(), MapsKt.plus(this.config.getHeaders(), TuplesKt.to("Accept", "text/event-stream")), null, 0);
        int code = r.getCode();
        boolean z = false;
        if (200 <= code && code < 300) {
            z = true;
        }
        if (!z) {
            r.getLines().close();
            throw new McpException("SSE 连接失败 HTTP " + r.getCode());
        }
        this.sseStream = r.getLines();
        final CompletableFuture gotEndpoint = new CompletableFuture();
        final Ref.ObjectRef event = new Ref.ObjectRef();
        event.element = "";
        final StringBuilder data = new StringBuilder();
        Thread t = new Thread(new Runnable() { // from class: com.pymcl.ai.McpClient$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                McpClient.openSse$lambda$0(r, data, event, gotEndpoint, this);
            }
        }, "mcp-sse-" + this.config.getName());
        t.setDaemon(true);
        t.start();
        try {
            String ep = (String) gotEndpoint.get(15L, TimeUnit.SECONDS);
            try {
                Result.Companion companion = Result.INSTANCE;
                McpClient $this$openSse_u24lambda_u241 = this;
                objM8116constructorimpl = Result.m8116constructorimpl(new URL(new URL($this$openSse_u24lambda_u241.config.getUrl()), ep).toString());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                objM8116constructorimpl = ep;
            }
            this.sseEndpoint = (String) objM8116constructorimpl;
        } catch (Exception e) {
            throw new McpException("SSE 没有给出 endpoint");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v13, types: [T, java.lang.String] */
    public static final void openSse$lambda$0(McpHttp.Resp resp, StringBuilder sb, Ref.ObjectRef objectRef, CompletableFuture completableFuture, McpClient mcpClient) {
        Object objM8116constructorimpl;
        Long lM8043long;
        while (true) {
            try {
                String line = resp.getLines().readLine();
                if (line == null) {
                    break;
                }
                boolean z = true;
                Object obj = null;
                if (line.length() == 0) {
                    String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    sb.setLength(0);
                    if (Intrinsics.areEqual(objectRef.element, "endpoint")) {
                        completableFuture.complete(StringsKt.trim((CharSequence) string).toString());
                    } else if (!StringsKt.isBlank(string)) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM8116constructorimpl = Result.m8116constructorimpl(Json.INSTANCE.obj(string));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                        }
                        if (!Result.m8122isFailureimpl(objM8116constructorimpl)) {
                            obj = objM8116constructorimpl;
                        }
                        Map<String, Object> map = (Map) obj;
                        if (map != null && !mcpClient.handleIncoming(map) && (lM8043long = JsonKt.m8043long(map, "id")) != null) {
                            CompletableFuture<Map<String, Object>> completableFuture2 = mcpClient.waiting.get(Long.valueOf(lM8043long.longValue()));
                            if (completableFuture2 != null) {
                                completableFuture2.complete(map);
                            }
                        }
                    }
                    objectRef.element = "";
                } else if (StringsKt.startsWith$default(line, "event:", false, 2, (Object) null)) {
                    objectRef.element = StringsKt.trim((CharSequence) StringsKt.removePrefix(line, (CharSequence) "event:")).toString();
                } else if (StringsKt.startsWith$default(line, "data:", false, 2, (Object) null)) {
                    if (sb.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        sb.append('\n');
                    }
                    sb.append(StringsKt.removePrefix(StringsKt.removePrefix(line, (CharSequence) "data:"), (CharSequence) StringUtils.SPACE));
                }
            } catch (Exception e) {
            }
        }
        completableFuture.completeExceptionally(new McpException("SSE 流已关闭"));
        Collection<CompletableFuture<Map<String, Object>>> collectionValues = mcpClient.waiting.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((CompletableFuture) it.next()).completeExceptionally(new McpException("SSE 流已关闭"));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Unit unit;
        this.closed = true;
        Unit unit2 = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            McpClient $this$close_u24lambda_u240 = this;
            AiLineStream aiLineStream = $this$close_u24lambda_u240.listenStream;
            if (aiLineStream != null) {
                aiLineStream.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m8116constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            McpClient $this$close_u24lambda_u241 = this;
            AiLineStream aiLineStream2 = $this$close_u24lambda_u241.sseStream;
            if (aiLineStream2 != null) {
                aiLineStream2.close();
                unit2 = Unit.INSTANCE;
            }
            Result.m8116constructorimpl(unit2);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Intrinsics.areEqual(this.config.getType(), "sse") && this.session != null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                McpClient $this$close_u24lambda_u242 = this;
                $this$close_u24lambda_u242.http.request("DELETE", $this$close_u24lambda_u242.config.getUrl(), $this$close_u24lambda_u242.baseHeaders(), null, Spv.SpvOpGroupIAddNonUniformAMD).getLines().close();
                Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th3));
            }
        }
    }
}
