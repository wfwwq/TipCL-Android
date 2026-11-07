package com.pymcl.android.data;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiTaskCenter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jt\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0014\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eÊ\u0001\f\b1\u0012\b\b2\u0012\u0004\b\u0003\u0010\u0002¨\u00060"}, d2 = {"Lcom/pymcl/android/data/AiTaskRow;", "", "id", "", "chatId", "title", "chatTitle", "stateLabel", "tone", NotificationCompat.CATEGORY_PROGRESS, "", "detail", "startedText", "running", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getChatId", "getTitle", "getChatTitle", "getStateLabel", "getTone", "getProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getDetail", "getStartedText", "getRunning", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/android/data/AiTaskRow;", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class AiTaskRow {
    public static final int $stable = 0;
    private final String chatId;
    private final String chatTitle;
    private final String detail;
    private final String id;
    private final Float progress;
    private final boolean running;
    private final String startedText;
    private final String stateLabel;
    private final String title;
    private final String tone;

    public static /* synthetic */ AiTaskRow copy$default(AiTaskRow aiTaskRow, String str, String str2, String str3, String str4, String str5, String str6, Float f, String str7, String str8, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiTaskRow.id;
        }
        if ((i & 2) != 0) {
            str2 = aiTaskRow.chatId;
        }
        if ((i & 4) != 0) {
            str3 = aiTaskRow.title;
        }
        if ((i & 8) != 0) {
            str4 = aiTaskRow.chatTitle;
        }
        if ((i & 16) != 0) {
            str5 = aiTaskRow.stateLabel;
        }
        if ((i & 32) != 0) {
            str6 = aiTaskRow.tone;
        }
        if ((i & 64) != 0) {
            f = aiTaskRow.progress;
        }
        if ((i & 128) != 0) {
            str7 = aiTaskRow.detail;
        }
        if ((i & 256) != 0) {
            str8 = aiTaskRow.startedText;
        }
        if ((i & 512) != 0) {
            z = aiTaskRow.running;
        }
        String str9 = str8;
        boolean z2 = z;
        Float f2 = f;
        String str10 = str7;
        String str11 = str5;
        String str12 = str6;
        return aiTaskRow.copy(str, str2, str3, str4, str11, str12, f2, str10, str9, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getRunning() {
        return this.running;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getChatTitle() {
        return this.chatTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStateLabel() {
        return this.stateLabel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTone() {
        return this.tone;
    }

    /* renamed from: component7, reason: from getter */
    public final Float getProgress() {
        return this.progress;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* renamed from: component9, reason: from getter */
    public final String getStartedText() {
        return this.startedText;
    }

    public final AiTaskRow copy(String id, String chatId, String title, String chatTitle, String stateLabel, String tone, Float progress, String detail, String startedText, boolean running) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(chatTitle, "chatTitle");
        Intrinsics.checkNotNullParameter(stateLabel, "stateLabel");
        Intrinsics.checkNotNullParameter(tone, "tone");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(startedText, "startedText");
        return new AiTaskRow(id, chatId, title, chatTitle, stateLabel, tone, progress, detail, startedText, running);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiTaskRow)) {
            return false;
        }
        AiTaskRow aiTaskRow = (AiTaskRow) other;
        return Intrinsics.areEqual(this.id, aiTaskRow.id) && Intrinsics.areEqual(this.chatId, aiTaskRow.chatId) && Intrinsics.areEqual(this.title, aiTaskRow.title) && Intrinsics.areEqual(this.chatTitle, aiTaskRow.chatTitle) && Intrinsics.areEqual(this.stateLabel, aiTaskRow.stateLabel) && Intrinsics.areEqual(this.tone, aiTaskRow.tone) && Intrinsics.areEqual((Object) this.progress, (Object) aiTaskRow.progress) && Intrinsics.areEqual(this.detail, aiTaskRow.detail) && Intrinsics.areEqual(this.startedText, aiTaskRow.startedText) && this.running == aiTaskRow.running;
    }

    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + this.chatId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.chatTitle.hashCode()) * 31) + this.stateLabel.hashCode()) * 31) + this.tone.hashCode()) * 31) + (this.progress == null ? 0 : this.progress.hashCode())) * 31) + this.detail.hashCode()) * 31) + this.startedText.hashCode()) * 31) + Boolean.hashCode(this.running);
    }

    public String toString() {
        return "AiTaskRow(id=" + this.id + ", chatId=" + this.chatId + ", title=" + this.title + ", chatTitle=" + this.chatTitle + ", stateLabel=" + this.stateLabel + ", tone=" + this.tone + ", progress=" + this.progress + ", detail=" + this.detail + ", startedText=" + this.startedText + ", running=" + this.running + ")";
    }

    public AiTaskRow(String id, String chatId, String title, String chatTitle, String stateLabel, String tone, Float progress, String detail, String startedText, boolean running) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(chatTitle, "chatTitle");
        Intrinsics.checkNotNullParameter(stateLabel, "stateLabel");
        Intrinsics.checkNotNullParameter(tone, "tone");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(startedText, "startedText");
        this.id = id;
        this.chatId = chatId;
        this.title = title;
        this.chatTitle = chatTitle;
        this.stateLabel = stateLabel;
        this.tone = tone;
        this.progress = progress;
        this.detail = detail;
        this.startedText = startedText;
        this.running = running;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getChatTitle() {
        return this.chatTitle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final Float getProgress() {
        return this.progress;
    }

    public final String getStateLabel() {
        return this.stateLabel;
    }

    public final String getTone() {
        return this.tone;
    }

    public final boolean getRunning() {
        return this.running;
    }

    public final String getStartedText() {
        return this.startedText;
    }
}
