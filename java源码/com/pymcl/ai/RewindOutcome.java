package com.pymcl.ai;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JG\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010%\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014¨\u0006&"}, d2 = {"Lcom/pymcl/ai/RewindOutcome;", "", "restoredFiles", "", "failed", "hadDiskChanges", "", "rewindable", "userText", "", "cancelledTasks", "<init>", "(IIZZLjava/lang/String;I)V", "getRestoredFiles", "()I", "getFailed", "getHadDiskChanges", "()Z", "getRewindable", "getUserText", "()Ljava/lang/String;", "getCancelledTasks", "message", "getMessage", "messageIn", "en", "baseMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewindOutcome {
    private final int cancelledTasks;
    private final int failed;
    private final boolean hadDiskChanges;
    private final int restoredFiles;
    private final boolean rewindable;
    private final String userText;

    public static /* synthetic */ RewindOutcome copy$default(RewindOutcome rewindOutcome, int i, int i2, boolean z, boolean z2, String str, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = rewindOutcome.restoredFiles;
        }
        if ((i4 & 2) != 0) {
            i2 = rewindOutcome.failed;
        }
        if ((i4 & 4) != 0) {
            z = rewindOutcome.hadDiskChanges;
        }
        if ((i4 & 8) != 0) {
            z2 = rewindOutcome.rewindable;
        }
        if ((i4 & 16) != 0) {
            str = rewindOutcome.userText;
        }
        if ((i4 & 32) != 0) {
            i3 = rewindOutcome.cancelledTasks;
        }
        String str2 = str;
        int i5 = i3;
        return rewindOutcome.copy(i, i2, z, z2, str2, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRestoredFiles() {
        return this.restoredFiles;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFailed() {
        return this.failed;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHadDiskChanges() {
        return this.hadDiskChanges;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRewindable() {
        return this.rewindable;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserText() {
        return this.userText;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCancelledTasks() {
        return this.cancelledTasks;
    }

    public final RewindOutcome copy(int restoredFiles, int failed, boolean hadDiskChanges, boolean rewindable, String userText, int cancelledTasks) {
        return new RewindOutcome(restoredFiles, failed, hadDiskChanges, rewindable, userText, cancelledTasks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewindOutcome)) {
            return false;
        }
        RewindOutcome rewindOutcome = (RewindOutcome) other;
        return this.restoredFiles == rewindOutcome.restoredFiles && this.failed == rewindOutcome.failed && this.hadDiskChanges == rewindOutcome.hadDiskChanges && this.rewindable == rewindOutcome.rewindable && Intrinsics.areEqual(this.userText, rewindOutcome.userText) && this.cancelledTasks == rewindOutcome.cancelledTasks;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.restoredFiles) * 31) + Integer.hashCode(this.failed)) * 31) + Boolean.hashCode(this.hadDiskChanges)) * 31) + Boolean.hashCode(this.rewindable)) * 31) + (this.userText == null ? 0 : this.userText.hashCode())) * 31) + Integer.hashCode(this.cancelledTasks);
    }

    public String toString() {
        return "RewindOutcome(restoredFiles=" + this.restoredFiles + ", failed=" + this.failed + ", hadDiskChanges=" + this.hadDiskChanges + ", rewindable=" + this.rewindable + ", userText=" + this.userText + ", cancelledTasks=" + this.cancelledTasks + ")";
    }

    public RewindOutcome(int restoredFiles, int failed, boolean hadDiskChanges, boolean rewindable, String userText, int cancelledTasks) {
        this.restoredFiles = restoredFiles;
        this.failed = failed;
        this.hadDiskChanges = hadDiskChanges;
        this.rewindable = rewindable;
        this.userText = userText;
        this.cancelledTasks = cancelledTasks;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RewindOutcome(int i, int i2, boolean z, boolean z2, String str, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        int i5;
        if ((i4 & 32) == 0) {
            i5 = i3;
        } else {
            i5 = 0;
        }
        this(i, i2, z, z2, str, i5);
    }

    public final int getFailed() {
        return this.failed;
    }

    public final boolean getHadDiskChanges() {
        return this.hadDiskChanges;
    }

    public final int getRestoredFiles() {
        return this.restoredFiles;
    }

    public final boolean getRewindable() {
        return this.rewindable;
    }

    public final String getUserText() {
        return this.userText;
    }

    public final int getCancelledTasks() {
        return this.cancelledTasks;
    }

    public final String getMessage() {
        return messageIn(AiText.INSTANCE.getEnglish().invoke().booleanValue());
    }

    public final String messageIn(boolean en) {
        return baseMessage(en) + ((this.userText == null || this.cancelledTasks <= 0) ? "" : AiText.INSTANCE.tIn(en, "；并取消了 {0} 个后台任务", Integer.valueOf(this.cancelledTasks)));
    }

    private final String baseMessage(boolean en) {
        return this.userText == null ? AiText.INSTANCE.tIn(en, "没有可撤回的对话", new Object[0]) : this.failed > 0 ? AiText.INSTANCE.tIn(en, "对话已回退，但磁盘改动没能全部还原，请手动检查相关文件", new Object[0]) : !this.rewindable ? AiText.INSTANCE.tIn(en, "已撤回：只回退了对话，这一轮的磁盘改动无法自动还原", new Object[0]) : (!this.hadDiskChanges || this.restoredFiles <= 0) ? AiText.INSTANCE.tIn(en, "已撤回：只回退了对话，这一轮没有可还原的磁盘改动", new Object[0]) : AiText.INSTANCE.tIn(en, "已撤回：{0} 个文件的改动已还原", Integer.valueOf(this.restoredFiles));
    }
}
