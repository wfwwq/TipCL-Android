package com.pymcl.ai;

import com.pymcl.core.util.JsonKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Permission.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011j\u0002`\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/pymcl/ai/PermissionRule;", "", "toolName", "", "ruleContent", "behavior", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getToolName", "()Ljava/lang/String;", "getRuleContent", "getBehavior", "getScope", "key", "getKey", "toJson", "", "Lcom/pymcl/core/util/JObj;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PermissionRule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String behavior;
    private final String ruleContent;
    private final String scope;
    private final String toolName;

    public static /* synthetic */ PermissionRule copy$default(PermissionRule permissionRule, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionRule.toolName;
        }
        if ((i & 2) != 0) {
            str2 = permissionRule.ruleContent;
        }
        if ((i & 4) != 0) {
            str3 = permissionRule.behavior;
        }
        if ((i & 8) != 0) {
            str4 = permissionRule.scope;
        }
        return permissionRule.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToolName() {
        return this.toolName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRuleContent() {
        return this.ruleContent;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBehavior() {
        return this.behavior;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public final PermissionRule copy(String toolName, String ruleContent, String behavior, String scope) {
        Intrinsics.checkNotNullParameter(toolName, "toolName");
        Intrinsics.checkNotNullParameter(ruleContent, "ruleContent");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new PermissionRule(toolName, ruleContent, behavior, scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionRule)) {
            return false;
        }
        PermissionRule permissionRule = (PermissionRule) other;
        return Intrinsics.areEqual(this.toolName, permissionRule.toolName) && Intrinsics.areEqual(this.ruleContent, permissionRule.ruleContent) && Intrinsics.areEqual(this.behavior, permissionRule.behavior) && Intrinsics.areEqual(this.scope, permissionRule.scope);
    }

    public int hashCode() {
        return (((((this.toolName.hashCode() * 31) + this.ruleContent.hashCode()) * 31) + this.behavior.hashCode()) * 31) + this.scope.hashCode();
    }

    public String toString() {
        return "PermissionRule(toolName=" + this.toolName + ", ruleContent=" + this.ruleContent + ", behavior=" + this.behavior + ", scope=" + this.scope + ")";
    }

    public PermissionRule(String toolName, String ruleContent, String behavior, String scope) {
        Intrinsics.checkNotNullParameter(toolName, "toolName");
        Intrinsics.checkNotNullParameter(ruleContent, "ruleContent");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.toolName = toolName;
        this.ruleContent = ruleContent;
        this.behavior = behavior;
        this.scope = scope;
    }

    public /* synthetic */ PermissionRule(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "allow" : str3, (i & 8) != 0 ? "global" : str4);
    }

    public final String getBehavior() {
        return this.behavior;
    }

    public final String getRuleContent() {
        return this.ruleContent;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getToolName() {
        return this.toolName;
    }

    public final String getKey() {
        return this.toolName + "|" + this.behavior + "|" + this.ruleContent;
    }

    /* compiled from: Permission.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\t2\u0006\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¨\u0006\f"}, d2 = {"Lcom/pymcl/ai/PermissionRule$Companion;", "", "<init>", "()V", "from", "Lcom/pymcl/ai/PermissionRule;", "o", "", "", "Lcom/pymcl/core/util/JObj;", "scope", "behavior", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ PermissionRule from$default(Companion companion, Map map, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.from(map, str, str2);
        }

        public final PermissionRule from(Map<String, Object> o, String scope, String behavior) {
            String str;
            Intrinsics.checkNotNullParameter(o, "o");
            Intrinsics.checkNotNullParameter(scope, "scope");
            String str2 = JsonKt.str(o, "tool_name");
            if (str2 == null && (str2 = JsonKt.str(o, "tool")) == null) {
                str2 = "";
            }
            String str3 = JsonKt.str(o, "rule_content");
            String str4 = (str3 == null && (str3 = JsonKt.str(o, "content")) == null) ? "" : str3;
            if (behavior == null) {
                str = JsonKt.str(o, "behavior");
                if (str == null) {
                    str = "ask";
                }
            } else {
                str = behavior;
            }
            String str5 = JsonKt.str(o, "scope");
            if (str5 == null) {
                str5 = scope;
            }
            return new PermissionRule(str2, str4, str, str5);
        }
    }

    public final Map<String, Object> toJson() {
        return JsonKt.jobj(TuplesKt.to("tool_name", this.toolName), TuplesKt.to("rule_content", this.ruleContent), TuplesKt.to("behavior", this.behavior), TuplesKt.to("scope", this.scope));
    }
}
