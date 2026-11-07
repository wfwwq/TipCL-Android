package com.pymcl.ai;

import androidx.autofill.HintConstants;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: Mcp.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJB\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\u0006\u0010\u0012\u001a\u00020\f2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/pymcl/ai/McpBuiltins;", "", "<init>", "()V", "TEMPLATES", "", "Lcom/pymcl/ai/McpBuiltins$Tpl;", "getTEMPLATES", "()Ljava/util/List;", "TEMPLATES$delegate", "Lkotlin/Lazy;", "NAMES", "", "getNAMES", "kindOf", HintConstants.AUTOFILL_HINT_NAME, "forServer", "Lcom/pymcl/ai/McpTool;", "server", "capabilities", "", "Lcom/pymcl/core/util/JObj;", "existing", "", "Tpl", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class McpBuiltins {
    public static final McpBuiltins INSTANCE = new McpBuiltins();

    /* renamed from: TEMPLATES$delegate, reason: from kotlin metadata */
    private static final Lazy TEMPLATES = LazyKt.lazy(new Function0() { // from class: com.pymcl.ai.McpBuiltins$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return McpBuiltins.TEMPLATES_delegate$lambda$0();
        }
    });

    private McpBuiltins() {
    }

    /* compiled from: Mcp.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/pymcl/ai/McpBuiltins$Tpl;", "", HintConstants.AUTOFILL_HINT_NAME, "", "capability", "description", "parameters", "", "Lcom/pymcl/core/util/JObj;", "requires", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getCapability", "getDescription", "getParameters", "()Ljava/util/Map;", "getRequires", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    private static final class Tpl {
        private final String capability;
        private final String description;
        private final String name;
        private final Map<String, Object> parameters;
        private final String requires;

        public Tpl(String name, String capability, String description, Map<String, Object> parameters, String requires) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(capability, "capability");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.name = name;
            this.capability = capability;
            this.description = description;
            this.parameters = parameters;
            this.requires = requires;
        }

        public /* synthetic */ Tpl(String str, String str2, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, map, (i & 16) != 0 ? null : str4);
        }

        public final String getCapability() {
            return this.capability;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getName() {
            return this.name;
        }

        public final Map<String, Object> getParameters() {
            return this.parameters;
        }

        public final String getRequires() {
            return this.requires;
        }
    }

    private final List<Tpl> getTEMPLATES() {
        return (List) TEMPLATES.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List TEMPLATES_delegate$lambda$0() {
        InputStream resourceAsStream = McpBuiltins.class.getResourceAsStream("/pymcl_ai/mcp_builtin_schemas.json");
        Intrinsics.checkNotNull(resourceAsStream);
        InputStream it = resourceAsStream;
        try {
            String txt = new String(ByteStreamsKt.readBytes(it), Charsets.UTF_8);
            CloseableKt.closeFinally(it, null);
            Object obj = Json.INSTANCE.parse(txt);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            Iterable $this$mapNotNull$iv = (List) obj;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                Map<String, Object> mapO = JsonKt.o(element$iv$iv$iv);
                if (mapO != null) {
                    destination$iv$iv.add(mapO);
                }
            }
            Iterable $this$map$iv = (List) destination$iv$iv;
            Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                Map it2 = (Map) item$iv$iv;
                String str = JsonKt.str(it2, HintConstants.AUTOFILL_HINT_NAME);
                Intrinsics.checkNotNull(str);
                String str2 = JsonKt.str(it2, "capability");
                Intrinsics.checkNotNull(str2);
                String str3 = JsonKt.str(it2, "description");
                if (str3 == null) {
                    str3 = "";
                }
                Map<String, Object> mapObj = JsonKt.obj(it2, "parameters");
                if (mapObj == null) {
                    mapObj = JsonKt.jobj(new Pair[0]);
                }
                destination$iv$iv2.add(new Tpl(str, str2, str3, mapObj, JsonKt.str(it2, "requires")));
            }
            return (List) destination$iv$iv2;
        } finally {
        }
    }

    public final List<String> getNAMES() {
        Iterable $this$map$iv = getTEMPLATES();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Tpl it = (Tpl) item$iv$iv;
            destination$iv$iv.add(it.getName());
        }
        return (List) destination$iv$iv;
    }

    public final String kindOf(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.removePrefix(name, (CharSequence) "mcp_");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List forServer$default(McpBuiltins mcpBuiltins, String str, Map map, Collection collection, int i, Object obj) {
        if ((i & 4) != 0) {
            collection = CollectionsKt.emptyList();
        }
        return mcpBuiltins.forServer(str, map, collection);
    }

    public final List<McpTool> forServer(String server, Map<String, Object> capabilities, Collection<String> existing) {
        String server2 = server;
        Intrinsics.checkNotNullParameter(server2, "server");
        Intrinsics.checkNotNullParameter(existing, "existing");
        if (capabilities == null) {
            return CollectionsKt.emptyList();
        }
        Iterable $this$filter$iv = getTEMPLATES();
        Collection destination$iv$iv = new ArrayList();
        Iterator it = $this$filter$iv.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object element$iv$iv = it.next();
            Tpl it2 = (Tpl) element$iv$iv;
            if (JsonKt.obj(capabilities, it2.getCapability()) != null && ((it2.getRequires() == null || Intrinsics.areEqual((Object) JsonKt.bool(JsonKt.obj(capabilities, it2.getCapability()), it2.getRequires()), (Object) true)) && !existing.contains(it2.getName()))) {
                z = true;
            }
            if (z) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$map$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Tpl it3 = (Tpl) item$iv$iv;
            String name = it3.getName();
            String description = it3.getDescription();
            Map<String, Object> mapO = JsonKt.o(JsonKt.deepCopy(it3.getParameters()));
            if (mapO == null) {
                mapO = JsonKt.jobj(new Pair[0]);
            }
            destination$iv$iv2.add(new McpTool(server2, name, description, mapO, true, false, INSTANCE.kindOf(it3.getName())));
            server2 = server;
        }
        return (List) destination$iv$iv2;
    }
}
