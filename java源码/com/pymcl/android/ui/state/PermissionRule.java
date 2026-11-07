package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/pymcl/android/ui/state/PermissionRule;", "", "tool", "", "behavior", "scope", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTool", "()Ljava/lang/String;", "getBehavior", "getScope", "getContent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class PermissionRule {
    public static final int $stable = 0;
    private final String behavior;
    private final String content;
    private final String scope;
    private final String tool;

    public static /* synthetic */ PermissionRule copy$default(PermissionRule permissionRule, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionRule.tool;
        }
        if ((i & 2) != 0) {
            str2 = permissionRule.behavior;
        }
        if ((i & 4) != 0) {
            str3 = permissionRule.scope;
        }
        if ((i & 8) != 0) {
            str4 = permissionRule.content;
        }
        return permissionRule.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTool() {
        return this.tool;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBehavior() {
        return this.behavior;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final PermissionRule copy(String tool, String behavior, String scope, String content) {
        Intrinsics.checkNotNullParameter(tool, "tool");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(content, "content");
        return new PermissionRule(tool, behavior, scope, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionRule)) {
            return false;
        }
        PermissionRule permissionRule = (PermissionRule) other;
        return Intrinsics.areEqual(this.tool, permissionRule.tool) && Intrinsics.areEqual(this.behavior, permissionRule.behavior) && Intrinsics.areEqual(this.scope, permissionRule.scope) && Intrinsics.areEqual(this.content, permissionRule.content);
    }

    public int hashCode() {
        return (((((this.tool.hashCode() * 31) + this.behavior.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "PermissionRule(tool=" + this.tool + ", behavior=" + this.behavior + ", scope=" + this.scope + ", content=" + this.content + ")";
    }

    public PermissionRule(String tool, String behavior, String scope, String content) {
        Intrinsics.checkNotNullParameter(tool, "tool");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(content, "content");
        this.tool = tool;
        this.behavior = behavior;
        this.scope = scope;
        this.content = content;
    }

    public /* synthetic */ PermissionRule(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }

    public final String getBehavior() {
        return this.behavior;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getTool() {
        return this.tool;
    }
}
