package com.pymcl.ai;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiToolHost.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/pymcl/ai/AskQuestion;", "", "id", "", "prompt", "multi", "", "options", "", "Lcom/pymcl/ai/AskOption;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getId", "()Ljava/lang/String;", "getPrompt", "getMulti", "()Z", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AskQuestion {
    private final String id;
    private final boolean multi;
    private final List<AskOption> options;
    private final String prompt;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AskQuestion copy$default(AskQuestion askQuestion, String str, String str2, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = askQuestion.id;
        }
        if ((i & 2) != 0) {
            str2 = askQuestion.prompt;
        }
        if ((i & 4) != 0) {
            z = askQuestion.multi;
        }
        if ((i & 8) != 0) {
            list = askQuestion.options;
        }
        return askQuestion.copy(str, str2, z, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getMulti() {
        return this.multi;
    }

    public final List<AskOption> component4() {
        return this.options;
    }

    public final AskQuestion copy(String id, String prompt, boolean multi, List<AskOption> options) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(options, "options");
        return new AskQuestion(id, prompt, multi, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AskQuestion)) {
            return false;
        }
        AskQuestion askQuestion = (AskQuestion) other;
        return Intrinsics.areEqual(this.id, askQuestion.id) && Intrinsics.areEqual(this.prompt, askQuestion.prompt) && this.multi == askQuestion.multi && Intrinsics.areEqual(this.options, askQuestion.options);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.prompt.hashCode()) * 31) + Boolean.hashCode(this.multi)) * 31) + this.options.hashCode();
    }

    public String toString() {
        return "AskQuestion(id=" + this.id + ", prompt=" + this.prompt + ", multi=" + this.multi + ", options=" + this.options + ")";
    }

    public AskQuestion(String id, String prompt, boolean multi, List<AskOption> options) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(options, "options");
        this.id = id;
        this.prompt = prompt;
        this.multi = multi;
        this.options = options;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getMulti() {
        return this.multi;
    }

    public final List<AskOption> getOptions() {
        return this.options;
    }

    public final String getPrompt() {
        return this.prompt;
    }
}
