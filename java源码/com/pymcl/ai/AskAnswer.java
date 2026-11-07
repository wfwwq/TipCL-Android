package com.pymcl.ai;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiToolHost.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0004HÖ\u0081\u0004R#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/pymcl/ai/AskAnswer;", "", "answers", "", "", "", "skipped", "", "<init>", "(Ljava/util/Map;Z)V", "getAnswers", "()Ljava/util/Map;", "getSkipped", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AskAnswer {
    private final Map<String, List<String>> answers;
    private final boolean skipped;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AskAnswer copy$default(AskAnswer askAnswer, Map map, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            map = askAnswer.answers;
        }
        if ((i & 2) != 0) {
            z = askAnswer.skipped;
        }
        return askAnswer.copy(map, z);
    }

    public final Map<String, List<String>> component1() {
        return this.answers;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSkipped() {
        return this.skipped;
    }

    public final AskAnswer copy(Map<String, ? extends List<String>> answers, boolean skipped) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new AskAnswer(answers, skipped);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AskAnswer)) {
            return false;
        }
        AskAnswer askAnswer = (AskAnswer) other;
        return Intrinsics.areEqual(this.answers, askAnswer.answers) && this.skipped == askAnswer.skipped;
    }

    public int hashCode() {
        return (this.answers.hashCode() * 31) + Boolean.hashCode(this.skipped);
    }

    public String toString() {
        return "AskAnswer(answers=" + this.answers + ", skipped=" + this.skipped + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AskAnswer(Map<String, ? extends List<String>> answers, boolean skipped) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.answers = answers;
        this.skipped = skipped;
    }

    public /* synthetic */ AskAnswer(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? false : z);
    }

    public final Map<String, List<String>> getAnswers() {
        return this.answers;
    }

    public final boolean getSkipped() {
        return this.skipped;
    }
}
