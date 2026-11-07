package com.pymcl.ai;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.util.JsonKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Mcp.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\bJ\u0006\u0010\u001e\u001a\u00020\u001fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u001b\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Ja\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010¨\u0006-"}, d2 = {"Lcom/pymcl/ai/McpTool;", "", "server", "", HintConstants.AUTOFILL_HINT_NAME, "description", "inputSchema", "", "Lcom/pymcl/core/util/JObj;", "readOnly", "", "destructive", "kind", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZZLjava/lang/String;)V", "getServer", "()Ljava/lang/String;", "getName", "getDescription", "getInputSchema", "()Ljava/util/Map;", "getReadOnly", "()Z", "getDestructive", "getKind", AiMode.BUILTIN, "getBuiltin", "fullName", "getFullName", "schema", "meta", "Lcom/pymcl/ai/ToolMeta;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class McpTool {
    private final String description;
    private final boolean destructive;
    private final Map<String, Object> inputSchema;
    private final String kind;
    private final String name;
    private final boolean readOnly;
    private final String server;

    public static /* synthetic */ McpTool copy$default(McpTool mcpTool, String str, String str2, String str3, Map map, boolean z, boolean z2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpTool.server;
        }
        if ((i & 2) != 0) {
            str2 = mcpTool.name;
        }
        if ((i & 4) != 0) {
            str3 = mcpTool.description;
        }
        if ((i & 8) != 0) {
            map = mcpTool.inputSchema;
        }
        if ((i & 16) != 0) {
            z = mcpTool.readOnly;
        }
        if ((i & 32) != 0) {
            z2 = mcpTool.destructive;
        }
        if ((i & 64) != 0) {
            str4 = mcpTool.kind;
        }
        boolean z3 = z2;
        String str5 = str4;
        boolean z4 = z;
        String str6 = str3;
        return mcpTool.copy(str, str2, str6, map, z4, z3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getServer() {
        return this.server;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Map<String, Object> component4() {
        return this.inputSchema;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDestructive() {
        return this.destructive;
    }

    /* renamed from: component7, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    public final McpTool copy(String server, String name, String description, Map<String, Object> inputSchema, boolean readOnly, boolean destructive, String kind) {
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(inputSchema, "inputSchema");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new McpTool(server, name, description, inputSchema, readOnly, destructive, kind);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpTool)) {
            return false;
        }
        McpTool mcpTool = (McpTool) other;
        return Intrinsics.areEqual(this.server, mcpTool.server) && Intrinsics.areEqual(this.name, mcpTool.name) && Intrinsics.areEqual(this.description, mcpTool.description) && Intrinsics.areEqual(this.inputSchema, mcpTool.inputSchema) && this.readOnly == mcpTool.readOnly && this.destructive == mcpTool.destructive && Intrinsics.areEqual(this.kind, mcpTool.kind);
    }

    public int hashCode() {
        return (((((((((((this.server.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.inputSchema.hashCode()) * 31) + Boolean.hashCode(this.readOnly)) * 31) + Boolean.hashCode(this.destructive)) * 31) + this.kind.hashCode();
    }

    public String toString() {
        return "McpTool(server=" + this.server + ", name=" + this.name + ", description=" + this.description + ", inputSchema=" + this.inputSchema + ", readOnly=" + this.readOnly + ", destructive=" + this.destructive + ", kind=" + this.kind + ")";
    }

    public McpTool(String server, String name, String description, Map<String, Object> inputSchema, boolean readOnly, boolean destructive, String kind) {
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(inputSchema, "inputSchema");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.server = server;
        this.name = name;
        this.description = description;
        this.inputSchema = inputSchema;
        this.readOnly = readOnly;
        this.destructive = destructive;
        this.kind = kind;
    }

    public /* synthetic */ McpTool(String str, String str2, String str3, Map map, boolean z, boolean z2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, map, z, z2, (i & 64) != 0 ? "tool" : str4);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getDestructive() {
        return this.destructive;
    }

    public final Map<String, Object> getInputSchema() {
        return this.inputSchema;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final String getServer() {
        return this.server;
    }

    public final boolean getBuiltin() {
        return !Intrinsics.areEqual(this.kind, "tool");
    }

    public final String getFullName() {
        return McpManager.INSTANCE.fullName(this.server, this.name);
    }

    public final Map<String, Object> schema() {
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "function");
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, getFullName());
        pairArr2[1] = TuplesKt.to("description", "[MCP:" + this.server + "] " + StringsKt.take(this.description, 1000));
        Map it = this.inputSchema;
        if (it.isEmpty()) {
            it = null;
        }
        if (it == null) {
            it = JsonKt.jobj(TuplesKt.to(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "object"), TuplesKt.to("properties", JsonKt.jobj(new Pair[0])));
        }
        pairArr2[2] = TuplesKt.to("parameters", it);
        pairArr[1] = TuplesKt.to("function", JsonKt.jobj(pairArr2));
        return JsonKt.jobj(pairArr);
    }

    public final ToolMeta meta() {
        return new ToolMeta(getFullName(), this.readOnly, this.destructive ? "delete" : this.readOnly ? "network" : "write_local", this.readOnly ? "low" : "high", false, 16, null);
    }
}
