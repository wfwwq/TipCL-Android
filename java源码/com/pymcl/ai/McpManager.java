package com.pymcl.ai;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.pymcl.ai.ToolOutput;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.process.JavaProcessService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: Mcp.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u000256B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u0015J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0015J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160$H\u0002J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0015J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0'2\u0006\u0010(\u001a\u00020\nJ\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0015J\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\u0010\u0010,\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020\nJ(\u0010.\u001a\u00020/2\u0006\u0010-\u001a\u00020\n2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000101j\u0002`2J\u0006\u00103\u001a\u00020!J\u0006\u00104\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000RJ\u0010\r\u001a>\u0012\u0004\u0012\u00020\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u000ej\b\u0012\u0004\u0012\u00020\n`\u000f0\tj\u001e\u0012\u0004\u0012\u00020\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u000ej\b\u0012\u0004\u0012\u00020\n`\u000f`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00067"}, d2 = {"Lcom/pymcl/ai/McpManager;", "", "configFile", "Ljava/io/File;", "http", "Lcom/pymcl/ai/McpHttp;", "<init>", "(Ljava/io/File;Lcom/pymcl/ai/McpHttp;)V", "conns", "Ljava/util/LinkedHashMap;", "", "Lcom/pymcl/ai/McpManager$Conn;", "Lkotlin/collections/LinkedHashMap;", "subs", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "modelNotes", "", "loadedMtime", "", "value", "", "Lcom/pymcl/ai/McpServerStatus;", "statuses", "getStatuses", "()Ljava/util/List;", "configured", "", "getConfigured", "()Z", "ensure", "applyChanges", "updateStatus", "", HintConstants.AUTOFILL_HINT_NAME, "f", "Lkotlin/Function1;", "takeModelNotes", "subscriptions", "", "server", "tools", "Lcom/pymcl/ai/McpTool;", "schemas", "find", "fullName", NotificationCompat.CATEGORY_CALL, "Lcom/pymcl/ai/ToolOutput;", JavaProcessService.EXTRA_ARGS, "", "Lcom/pymcl/core/util/JObj;", "invalidate", "closeAll", "Companion", "Conn", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class McpManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final File configFile;
    private final LinkedHashMap<String, Conn> conns;
    private final McpHttp http;
    private volatile long loadedMtime;
    private final List<String> modelNotes;
    private volatile List<McpServerStatus> statuses;
    private final LinkedHashMap<String, LinkedHashSet<String>> subs;

    /* compiled from: Mcp.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011j\u0002`\u0012¨\u0006\u0013"}, d2 = {"Lcom/pymcl/ai/McpManager$Companion;", "", "<init>", "()V", "fullName", "", "server", "tool", "sanitize", "s", "isMcp", "", HintConstants.AUTOFILL_HINT_NAME, "parseConfig", "", "Lcom/pymcl/ai/McpServerConfig;", "o", "", "Lcom/pymcl/core/util/JObj;", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String fullName(String server, String tool) {
            Intrinsics.checkNotNullParameter(server, "server");
            Intrinsics.checkNotNullParameter(tool, "tool");
            return "mcp__" + sanitize(server) + "__" + sanitize(tool);
        }

        private final String sanitize(String s) {
            return StringsKt.take(new Regex("[^A-Za-z0-9_-]").replace(s, "_"), 40);
        }

        public final boolean isMcp(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return StringsKt.startsWith$default(name, "mcp__", false, 2, (Object) null);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01e7  */
        /* JADX WARN: Type inference failed for: r19v0 */
        /* JADX WARN: Type inference failed for: r19v1 */
        /* JADX WARN: Type inference failed for: r19v4 */
        /* JADX WARN: Type inference failed for: r19v5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<com.pymcl.ai.McpServerConfig> parseConfig(java.util.Map<java.lang.String, java.lang.Object> r34) {
            /*
                Method dump skipped, instructions count: 562
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.McpManager.Companion.parseConfig(java.util.Map):java.util.List");
        }
    }

    public McpManager(File configFile, McpHttp http) {
        Intrinsics.checkNotNullParameter(configFile, "configFile");
        Intrinsics.checkNotNullParameter(http, "http");
        this.configFile = configFile;
        this.http = http;
        this.conns = new LinkedHashMap<>();
        this.subs = new LinkedHashMap<>();
        this.modelNotes = new ArrayList();
        this.loadedMtime = -1L;
        this.statuses = CollectionsKt.emptyList();
    }

    public /* synthetic */ McpManager(File file, UrlConnectionMcpHttp urlConnectionMcpHttp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? new UrlConnectionMcpHttp() : urlConnectionMcpHttp);
    }

    /* compiled from: Mcp.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/pymcl/ai/McpManager$Conn;", "", "client", "Lcom/pymcl/ai/McpClient;", "tools", "", "Lcom/pymcl/ai/McpTool;", "<init>", "(Lcom/pymcl/ai/McpClient;Ljava/util/List;)V", "getClient", "()Lcom/pymcl/ai/McpClient;", "getTools", "()Ljava/util/List;", "setTools", "(Ljava/util/List;)V", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    private static final class Conn {
        private final McpClient client;
        private volatile List<McpTool> tools;

        public Conn(McpClient client, List<McpTool> tools) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(tools, "tools");
            this.client = client;
            this.tools = tools;
        }

        public final McpClient getClient() {
            return this.client;
        }

        public final List<McpTool> getTools() {
            return this.tools;
        }

        public final void setTools(List<McpTool> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.tools = list;
        }
    }

    public final List<McpServerStatus> getStatuses() {
        return this.statuses;
    }

    public final boolean getConfigured() {
        return this.configFile.isFile();
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e A[Catch: all -> 0x0370, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0015, B:10:0x001b, B:13:0x0021, B:15:0x002a, B:22:0x0060, B:24:0x0066, B:25:0x007d, B:27:0x0083, B:29:0x0091, B:30:0x00b1, B:31:0x00b9, B:106:0x0309, B:33:0x00c2, B:36:0x00cb, B:37:0x00eb, B:43:0x0102, B:65:0x0167, B:67:0x016e, B:68:0x0199, B:70:0x019f, B:71:0x01b5, B:73:0x01e1, B:75:0x01ef, B:77:0x01f7, B:78:0x01ff, B:80:0x0205, B:85:0x0220, B:92:0x0248, B:94:0x02a1, B:101:0x02c3, B:103:0x02d6, B:104:0x02da, B:100:0x02ba, B:91:0x023f, B:64:0x015d, B:40:0x00f4, B:107:0x032e, B:111:0x0339, B:21:0x0056, B:18:0x0036, B:97:0x02aa, B:45:0x010a, B:47:0x0120, B:49:0x0126, B:56:0x0145, B:59:0x0150, B:61:0x0157, B:55:0x013b, B:60:0x0153, B:88:0x022c, B:82:0x0210), top: B:117:0x0003, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<java.lang.String> ensure() {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.McpManager.ensure():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<java.lang.String> applyChanges() {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.McpManager.applyChanges():java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final McpServerStatus applyChanges$lambda$1$1(List $t, McpServerStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return McpServerStatus.copy$default(it, null, null, false, null, $t.size(), 15, null);
    }

    private final void updateStatus(String name, Function1<? super McpServerStatus, McpServerStatus> f) {
        Iterable $this$map$iv = this.statuses;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            McpServerStatus it = (McpServerStatus) item$iv$iv;
            if (Intrinsics.areEqual(it.getName(), name)) {
                it = f.invoke(it);
            }
            destination$iv$iv.add(it);
        }
        this.statuses = (List) destination$iv$iv;
    }

    public final synchronized List<String> takeModelNotes() {
        List<String> list;
        list = CollectionsKt.toList(this.modelNotes);
        this.modelNotes.clear();
        return list;
    }

    public final synchronized Set<String> subscriptions(String server) {
        Set<String> setEmptySet;
        Intrinsics.checkNotNullParameter(server, "server");
        LinkedHashSet<String> linkedHashSet = this.subs.get(server);
        if (linkedHashSet == null || (setEmptySet = CollectionsKt.toSet(linkedHashSet)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        return setEmptySet;
    }

    public final List<McpTool> tools() {
        ArrayList arrayList;
        synchronized (this) {
            Iterable iterableValues = this.conns.values();
            Intrinsics.checkNotNullExpressionValue(iterableValues, "<get-values>(...)");
            Iterable $this$flatMap$iv = iterableValues;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$flatMap$iv) {
                Conn it = (Conn) element$iv$iv;
                Iterable list$iv$iv = it.getTools();
                CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
            }
            arrayList = (List) destination$iv$iv;
        }
        return arrayList;
    }

    public final List<Object> schemas() {
        Iterable $this$map$iv = tools();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            McpTool it = (McpTool) item$iv$iv;
            destination$iv$iv.add(it.schema());
        }
        return (List) destination$iv$iv;
    }

    public final McpTool find(String fullName) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Iterable $this$firstOrNull$iv = tools();
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                element$iv = it.next();
                McpTool it2 = (McpTool) element$iv;
                if (Intrinsics.areEqual(it2.getFullName(), fullName)) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        return (McpTool) element$iv;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final ToolOutput call(String fullName, Map<String, Object> args) {
        Conn c;
        ToolOutput.Companion companion;
        String message;
        Object obj;
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(args, "args");
        McpTool t = find(fullName);
        if (t == null) {
            return ToolOutput.INSTANCE.err("没有名为 " + fullName + " 的 MCP 工具");
        }
        synchronized (this) {
            c = this.conns.get(t.getServer());
        }
        if (c == null) {
            return ToolOutput.INSTANCE.err("MCP 服务器 " + t.getServer() + " 未连接");
        }
        try {
            String kind = t.getKind();
            switch (kind.hashCode()) {
                case -1226789650:
                    if (!kind.equals("list_prompts")) {
                        return c.getClient().callTool(t.getName(), args);
                    }
                    McpClient client = c.getClient();
                    String it = JsonKt.str(args, "cursor");
                    if (it == null || StringsKt.isBlank(it)) {
                        it = null;
                    }
                    return client.listPrompts(it);
                case -349934749:
                    if (!kind.equals("subscribe_resource")) {
                        return c.getClient().callTool(t.getName(), args);
                    }
                    String str = JsonKt.str(args, "uri");
                    if (str == null) {
                        str = "";
                    }
                    String u = str;
                    ToolOutput o = c.getClient().subscribe(u);
                    if (o.getOk()) {
                        synchronized (this) {
                            Map $this$getOrPut$iv = this.subs;
                            String server = t.getServer();
                            Object value$iv = $this$getOrPut$iv.get(server);
                            if (value$iv == null) {
                                LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
                                $this$getOrPut$iv.put(server, linkedHashSet);
                                obj = linkedHashSet;
                            } else {
                                obj = value$iv;
                            }
                            ((Collection) obj).add(u);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    return o;
                case 131597463:
                    if (!kind.equals("read_resource")) {
                        return c.getClient().callTool(t.getName(), args);
                    }
                    McpClient client2 = c.getClient();
                    String str2 = JsonKt.str(args, "uri");
                    if (str2 == null) {
                        str2 = "";
                    }
                    return client2.readResource(str2);
                case 659645884:
                    if (!kind.equals("unsubscribe_resource")) {
                        return c.getClient().callTool(t.getName(), args);
                    }
                    String str3 = JsonKt.str(args, "uri");
                    if (str3 == null) {
                        str3 = "";
                    }
                    String u2 = str3;
                    ToolOutput o2 = c.getClient().unsubscribe(u2);
                    if (o2.getOk()) {
                        synchronized (this) {
                            LinkedHashSet<String> linkedHashSet2 = this.subs.get(t.getServer());
                            if (linkedHashSet2 != null) {
                                linkedHashSet2.remove(u2);
                            }
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    return o2;
                case 986364868:
                    if (!kind.equals("list_resources")) {
                        return c.getClient().callTool(t.getName(), args);
                    }
                    McpClient client3 = c.getClient();
                    String it2 = JsonKt.str(args, "cursor");
                    if (it2 == null || StringsKt.isBlank(it2)) {
                        it2 = null;
                    }
                    return client3.listResources(it2);
                case 1100872301:
                    if (!kind.equals("get_prompt")) {
                        return c.getClient().callTool(t.getName(), args);
                    }
                    McpClient client4 = c.getClient();
                    String str4 = JsonKt.str(args, HintConstants.AUTOFILL_HINT_NAME);
                    if (str4 == null) {
                        str4 = "";
                    }
                    return client4.getPrompt(str4, JsonKt.obj(args, "arguments"));
                default:
                    return c.getClient().callTool(t.getName(), args);
            }
        } catch (McpException e) {
            String message2 = e.getMessage();
            boolean z = false;
            if (message2 != null && StringsKt.contains$default((CharSequence) message2, (CharSequence) "会话已失效", false, 2, (Object) null)) {
                z = true;
            }
            if (z) {
                synchronized (this) {
                    this.loadedMtime = -1L;
                    Unit unit3 = Unit.INSTANCE;
                    companion = ToolOutput.INSTANCE;
                    message = e.getMessage() + "，下一轮会自动重连";
                }
            } else {
                companion = ToolOutput.INSTANCE;
                message = e.getMessage();
                if (message == null) {
                    message = "MCP 调用失败";
                }
            }
            return companion.err(message);
        }
    }

    public final void invalidate() {
        synchronized (this) {
            this.loadedMtime = -1L;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final synchronized void closeAll() {
        Iterable iterableValues = this.conns.values();
        Intrinsics.checkNotNullExpressionValue(iterableValues, "<get-values>(...)");
        Iterable $this$forEach$iv = iterableValues;
        for (Object element$iv : $this$forEach$iv) {
            Conn it = (Conn) element$iv;
            try {
                Result.Companion companion = Result.INSTANCE;
                McpManager mcpManager = this;
                it.getClient().close();
                Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
        }
        this.conns.clear();
    }
}
