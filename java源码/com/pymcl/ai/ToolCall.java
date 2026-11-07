package com.pymcl.ai;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Sse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rj\u0004\u0018\u0001`\u000eJ\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000eJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/pymcl/ai/ToolCall;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "arguments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getArguments", "argsObj", "", "Lcom/pymcl/core/util/JObj;", "toJson", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ToolCall {
    private final String arguments;
    private final String id;
    private final String name;

    public static /* synthetic */ ToolCall copy$default(ToolCall toolCall, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolCall.id;
        }
        if ((i & 2) != 0) {
            str2 = toolCall.name;
        }
        if ((i & 4) != 0) {
            str3 = toolCall.arguments;
        }
        return toolCall.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getArguments() {
        return this.arguments;
    }

    public final ToolCall copy(String id, String name, String arguments) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return new ToolCall(id, name, arguments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolCall)) {
            return false;
        }
        ToolCall toolCall = (ToolCall) other;
        return Intrinsics.areEqual(this.id, toolCall.id) && Intrinsics.areEqual(this.name, toolCall.name) && Intrinsics.areEqual(this.arguments, toolCall.arguments);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.arguments.hashCode();
    }

    public String toString() {
        return "ToolCall(id=" + this.id + ", name=" + this.name + ", arguments=" + this.arguments + ")";
    }

    public ToolCall(String id, String name, String arguments) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.id = id;
        this.name = name;
        this.arguments = arguments;
    }

    public final String getArguments() {
        return this.arguments;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> argsObj() {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ToolCall $this$argsObj_u24lambda_u240 = this;
            objM8116constructorimpl = Result.m8116constructorimpl(StringsKt.isBlank($this$argsObj_u24lambda_u240.arguments) ? JsonKt.jobj(new Pair[0]) : Json.INSTANCE.obj($this$argsObj_u24lambda_u240.arguments));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        return (Map) objM8116constructorimpl;
    }

    public final Map<String, Object> toJson() {
        return JsonKt.jobj(TuplesKt.to("id", this.id), TuplesKt.to(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "function"), TuplesKt.to("function", JsonKt.jobj(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, this.name), TuplesKt.to("arguments", this.arguments))));
    }
}
