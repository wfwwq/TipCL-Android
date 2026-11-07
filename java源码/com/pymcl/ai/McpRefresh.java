package com.pymcl.ai;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mcp.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nJ\u001c\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n¨\u0006\u000f"}, d2 = {"Lcom/pymcl/ai/McpRefresh;", "", "<init>", "()V", "plan", "Lcom/pymcl/ai/McpRefresh$Plan;", "dirty", "", "", "updated", "", "updatedNote", "server", "uris", "Plan", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class McpRefresh {
    public static final McpRefresh INSTANCE = new McpRefresh();

    /* compiled from: Mcp.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/pymcl/ai/McpRefresh$Plan;", "", "tools", "", "resources", "prompts", "updated", "", "", "<init>", "(ZZZLjava/util/List;)V", "getTools", "()Z", "getResources", "getPrompts", "getUpdated", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Plan {
        private final boolean prompts;
        private final boolean resources;
        private final boolean tools;
        private final List<String> updated;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Plan copy$default(Plan plan, boolean z, boolean z2, boolean z3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = plan.tools;
            }
            if ((i & 2) != 0) {
                z2 = plan.resources;
            }
            if ((i & 4) != 0) {
                z3 = plan.prompts;
            }
            if ((i & 8) != 0) {
                list = plan.updated;
            }
            return plan.copy(z, z2, z3, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getTools() {
            return this.tools;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getResources() {
            return this.resources;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getPrompts() {
            return this.prompts;
        }

        public final List<String> component4() {
            return this.updated;
        }

        public final Plan copy(boolean tools, boolean resources, boolean prompts, List<String> updated) {
            Intrinsics.checkNotNullParameter(updated, "updated");
            return new Plan(tools, resources, prompts, updated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Plan)) {
                return false;
            }
            Plan plan = (Plan) other;
            return this.tools == plan.tools && this.resources == plan.resources && this.prompts == plan.prompts && Intrinsics.areEqual(this.updated, plan.updated);
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.tools) * 31) + Boolean.hashCode(this.resources)) * 31) + Boolean.hashCode(this.prompts)) * 31) + this.updated.hashCode();
        }

        public String toString() {
            return "Plan(tools=" + this.tools + ", resources=" + this.resources + ", prompts=" + this.prompts + ", updated=" + this.updated + ")";
        }

        public Plan(boolean tools, boolean resources, boolean prompts, List<String> updated) {
            Intrinsics.checkNotNullParameter(updated, "updated");
            this.tools = tools;
            this.resources = resources;
            this.prompts = prompts;
            this.updated = updated;
        }

        public final boolean getPrompts() {
            return this.prompts;
        }

        public final boolean getResources() {
            return this.resources;
        }

        public final boolean getTools() {
            return this.tools;
        }

        public final List<String> getUpdated() {
            return this.updated;
        }
    }

    private McpRefresh() {
    }

    public final Plan plan(Set<String> dirty, List<String> updated) {
        Intrinsics.checkNotNullParameter(dirty, "dirty");
        Intrinsics.checkNotNullParameter(updated, "updated");
        return new Plan(dirty.contains("tools"), dirty.contains("resources"), dirty.contains("prompts"), updated);
    }

    public final String updatedNote(String server, List<String> uris) {
        String str;
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(uris, "uris");
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.take(uris, 10), "、", null, null, 0, null, null, 62, null);
        if (uris.size() > 10) {
            str = " 等 " + uris.size() + " 个";
        } else {
            str = "";
        }
        return "MCP 服务器 " + server + " 上你订阅的资源有更新：" + strJoinToString$default + str + "；需要最新内容时用 " + McpManager.INSTANCE.fullName(server, "mcp_read_resource") + " 重新读取";
    }
}
