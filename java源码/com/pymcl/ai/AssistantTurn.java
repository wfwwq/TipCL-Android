package com.pymcl.ai;

import com.pymcl.core.util.JsonKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sse.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018j\u0002`\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006'"}, d2 = {"Lcom/pymcl/ai/AssistantTurn;", "", "content", "", "reasoning", "toolCalls", "", "Lcom/pymcl/ai/ToolCall;", "usage", "Lcom/pymcl/ai/Usage;", "finishReason", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/ai/Usage;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getReasoning", "getToolCalls", "()Ljava/util/List;", "getUsage", "()Lcom/pymcl/ai/Usage;", "getFinishReason", "getModel", "toMessage", "", "Lcom/pymcl/core/util/JObj;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AssistantTurn {
    private final String content;
    private final String finishReason;
    private final String model;
    private final String reasoning;
    private final List<ToolCall> toolCalls;
    private final Usage usage;

    public static /* synthetic */ AssistantTurn copy$default(AssistantTurn assistantTurn, String str, String str2, List list, Usage usage, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assistantTurn.content;
        }
        if ((i & 2) != 0) {
            str2 = assistantTurn.reasoning;
        }
        if ((i & 4) != 0) {
            list = assistantTurn.toolCalls;
        }
        if ((i & 8) != 0) {
            usage = assistantTurn.usage;
        }
        if ((i & 16) != 0) {
            str3 = assistantTurn.finishReason;
        }
        if ((i & 32) != 0) {
            str4 = assistantTurn.model;
        }
        String str5 = str3;
        String str6 = str4;
        return assistantTurn.copy(str, str2, list, usage, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReasoning() {
        return this.reasoning;
    }

    public final List<ToolCall> component3() {
        return this.toolCalls;
    }

    /* renamed from: component4, reason: from getter */
    public final Usage getUsage() {
        return this.usage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFinishReason() {
        return this.finishReason;
    }

    /* renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final AssistantTurn copy(String content, String reasoning, List<ToolCall> toolCalls, Usage usage, String finishReason, String model) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(reasoning, "reasoning");
        Intrinsics.checkNotNullParameter(toolCalls, "toolCalls");
        Intrinsics.checkNotNullParameter(model, "model");
        return new AssistantTurn(content, reasoning, toolCalls, usage, finishReason, model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssistantTurn)) {
            return false;
        }
        AssistantTurn assistantTurn = (AssistantTurn) other;
        return Intrinsics.areEqual(this.content, assistantTurn.content) && Intrinsics.areEqual(this.reasoning, assistantTurn.reasoning) && Intrinsics.areEqual(this.toolCalls, assistantTurn.toolCalls) && Intrinsics.areEqual(this.usage, assistantTurn.usage) && Intrinsics.areEqual(this.finishReason, assistantTurn.finishReason) && Intrinsics.areEqual(this.model, assistantTurn.model);
    }

    public int hashCode() {
        return (((((((((this.content.hashCode() * 31) + this.reasoning.hashCode()) * 31) + this.toolCalls.hashCode()) * 31) + (this.usage == null ? 0 : this.usage.hashCode())) * 31) + (this.finishReason != null ? this.finishReason.hashCode() : 0)) * 31) + this.model.hashCode();
    }

    public String toString() {
        return "AssistantTurn(content=" + this.content + ", reasoning=" + this.reasoning + ", toolCalls=" + this.toolCalls + ", usage=" + this.usage + ", finishReason=" + this.finishReason + ", model=" + this.model + ")";
    }

    public AssistantTurn(String content, String reasoning, List<ToolCall> toolCalls, Usage usage, String finishReason, String model) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(reasoning, "reasoning");
        Intrinsics.checkNotNullParameter(toolCalls, "toolCalls");
        Intrinsics.checkNotNullParameter(model, "model");
        this.content = content;
        this.reasoning = reasoning;
        this.toolCalls = toolCalls;
        this.usage = usage;
        this.finishReason = finishReason;
        this.model = model;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getFinishReason() {
        return this.finishReason;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getReasoning() {
        return this.reasoning;
    }

    public final List<ToolCall> getToolCalls() {
        return this.toolCalls;
    }

    public final Usage getUsage() {
        return this.usage;
    }

    public final Map<String, Object> toMessage() {
        Map it = JsonKt.jobj(TuplesKt.to("role", "assistant"), TuplesKt.to("content", this.content));
        if (!this.toolCalls.isEmpty()) {
            Iterable $this$map$iv = this.toolCalls;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                ToolCall t = (ToolCall) item$iv$iv;
                destination$iv$iv.add(t.toJson());
            }
            it.put("tool_calls", CollectionsKt.toMutableList(destination$iv$iv));
        }
        if (this.reasoning.length() > 0) {
            it.put("reasoning_content", this.reasoning);
        }
        return it;
    }
}
