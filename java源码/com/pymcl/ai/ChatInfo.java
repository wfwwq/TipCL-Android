package com.pymcl.ai;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatStore.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/pymcl/ai/ChatInfo;", "", "id", "", "title", "updated", "", "messageCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JI)V", "getId", "()Ljava/lang/String;", "getTitle", "getUpdated", "()J", "getMessageCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChatInfo {
    private final String id;
    private final int messageCount;
    private final String title;
    private final long updated;

    public static /* synthetic */ ChatInfo copy$default(ChatInfo chatInfo, String str, String str2, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatInfo.id;
        }
        if ((i2 & 2) != 0) {
            str2 = chatInfo.title;
        }
        if ((i2 & 4) != 0) {
            j = chatInfo.updated;
        }
        if ((i2 & 8) != 0) {
            i = chatInfo.messageCount;
        }
        int i3 = i;
        return chatInfo.copy(str, str2, j, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final long getUpdated() {
        return this.updated;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMessageCount() {
        return this.messageCount;
    }

    public final ChatInfo copy(String id, String title, long updated, int messageCount) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new ChatInfo(id, title, updated, messageCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatInfo)) {
            return false;
        }
        ChatInfo chatInfo = (ChatInfo) other;
        return Intrinsics.areEqual(this.id, chatInfo.id) && Intrinsics.areEqual(this.title, chatInfo.title) && this.updated == chatInfo.updated && this.messageCount == chatInfo.messageCount;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + Long.hashCode(this.updated)) * 31) + Integer.hashCode(this.messageCount);
    }

    public String toString() {
        return "ChatInfo(id=" + this.id + ", title=" + this.title + ", updated=" + this.updated + ", messageCount=" + this.messageCount + ")";
    }

    public ChatInfo(String id, String title, long updated, int messageCount) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id;
        this.title = title;
        this.updated = updated;
        this.messageCount = messageCount;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMessageCount() {
        return this.messageCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getUpdated() {
        return this.updated;
    }
}
