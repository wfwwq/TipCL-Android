package com.pymcl.ai;

import androidx.core.app.NotificationCompat;
import com.pymcl.core.util.JsonKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 A2\u00020\u0001:\u0001AB\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010*j\u0002`+J\u0006\u0010,\u001a\u00020\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0011HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u0092\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010;J\u0014\u0010<\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010>\u001a\u00020?HÖ\u0081\u0004J\n\u0010@\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0011\u0010'\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010%¨\u0006B"}, d2 = {"Lcom/pymcl/ai/BgTaskInfo;", "", "id", "", "chatId", "callId", "tool", "title", "state", NotificationCompat.CATEGORY_PROGRESS, "", "detail", "result", "startedAt", "", "finishedAt", "reported", "", "turnId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getChatId", "getCallId", "getTool", "getTitle", "getState", "getProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getDetail", "getResult", "getStartedAt", "()J", "getFinishedAt", "getReported", "()Z", "getTurnId", "running", "getRunning", "toJson", "", "Lcom/pymcl/core/util/JObj;", "reportText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;)Lcom/pymcl/ai/BgTaskInfo;", "equals", "other", "hashCode", "", "toString", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BgTaskInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String callId;
    private final String chatId;
    private final String detail;
    private final long finishedAt;
    private final String id;
    private final Float progress;
    private final boolean reported;
    private final String result;
    private final long startedAt;
    private final String state;
    private final String title;
    private final String tool;
    private final String turnId;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getStartedAt() {
        return this.startedAt;
    }

    /* renamed from: component11, reason: from getter */
    public final long getFinishedAt() {
        return this.finishedAt;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getReported() {
        return this.reported;
    }

    /* renamed from: component13, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTool() {
        return this.tool;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final String getState() {
        return this.state;
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
    public final String getResult() {
        return this.result;
    }

    public final BgTaskInfo copy(String id, String chatId, String callId, String tool, String title, String state, Float progress, String detail, String result, long startedAt, long finishedAt, boolean reported, String turnId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(tool, "tool");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(turnId, "turnId");
        return new BgTaskInfo(id, chatId, callId, tool, title, state, progress, detail, result, startedAt, finishedAt, reported, turnId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BgTaskInfo)) {
            return false;
        }
        BgTaskInfo bgTaskInfo = (BgTaskInfo) other;
        return Intrinsics.areEqual(this.id, bgTaskInfo.id) && Intrinsics.areEqual(this.chatId, bgTaskInfo.chatId) && Intrinsics.areEqual(this.callId, bgTaskInfo.callId) && Intrinsics.areEqual(this.tool, bgTaskInfo.tool) && Intrinsics.areEqual(this.title, bgTaskInfo.title) && Intrinsics.areEqual(this.state, bgTaskInfo.state) && Intrinsics.areEqual((Object) this.progress, (Object) bgTaskInfo.progress) && Intrinsics.areEqual(this.detail, bgTaskInfo.detail) && Intrinsics.areEqual(this.result, bgTaskInfo.result) && this.startedAt == bgTaskInfo.startedAt && this.finishedAt == bgTaskInfo.finishedAt && this.reported == bgTaskInfo.reported && Intrinsics.areEqual(this.turnId, bgTaskInfo.turnId);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.id.hashCode() * 31) + this.chatId.hashCode()) * 31) + this.callId.hashCode()) * 31) + this.tool.hashCode()) * 31) + this.title.hashCode()) * 31) + this.state.hashCode()) * 31) + (this.progress == null ? 0 : this.progress.hashCode())) * 31) + this.detail.hashCode()) * 31) + this.result.hashCode()) * 31) + Long.hashCode(this.startedAt)) * 31) + Long.hashCode(this.finishedAt)) * 31) + Boolean.hashCode(this.reported)) * 31) + this.turnId.hashCode();
    }

    public String toString() {
        return "BgTaskInfo(id=" + this.id + ", chatId=" + this.chatId + ", callId=" + this.callId + ", tool=" + this.tool + ", title=" + this.title + ", state=" + this.state + ", progress=" + this.progress + ", detail=" + this.detail + ", result=" + this.result + ", startedAt=" + this.startedAt + ", finishedAt=" + this.finishedAt + ", reported=" + this.reported + ", turnId=" + this.turnId + ")";
    }

    public BgTaskInfo(String id, String chatId, String callId, String tool, String title, String state, Float progress, String detail, String result, long startedAt, long finishedAt, boolean reported, String turnId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(tool, "tool");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(turnId, "turnId");
        this.id = id;
        this.chatId = chatId;
        this.callId = callId;
        this.tool = tool;
        this.title = title;
        this.state = state;
        this.progress = progress;
        this.detail = detail;
        this.result = result;
        this.startedAt = startedAt;
        this.finishedAt = finishedAt;
        this.reported = reported;
        this.turnId = turnId;
    }

    public /* synthetic */ BgTaskInfo(String str, String str2, String str3, String str4, String str5, String str6, Float f, String str7, String str8, long j, long j2, boolean z, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : f, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? System.currentTimeMillis() : j, (i & 1024) != 0 ? 0L : j2, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? "" : str9);
    }

    public final String getCallId() {
        return this.callId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTool() {
        return this.tool;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final Float getProgress() {
        return this.progress;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getState() {
        return this.state;
    }

    public final long getFinishedAt() {
        return this.finishedAt;
    }

    public final boolean getReported() {
        return this.reported;
    }

    public final long getStartedAt() {
        return this.startedAt;
    }

    public final String getTurnId() {
        return this.turnId;
    }

    public final boolean getRunning() {
        return Intrinsics.areEqual(this.state, "running");
    }

    public final Map<String, Object> toJson() {
        return JsonKt.jobj(TuplesKt.to("id", this.id), TuplesKt.to("chat_id", this.chatId), TuplesKt.to("call_id", this.callId), TuplesKt.to("tool", this.tool), TuplesKt.to("title", this.title), TuplesKt.to("state", this.state), TuplesKt.to("detail", this.detail), TuplesKt.to("result", this.result), TuplesKt.to("started", Long.valueOf(this.startedAt)), TuplesKt.to("finished", Long.valueOf(this.finishedAt)), TuplesKt.to("reported", Boolean.valueOf(this.reported)), TuplesKt.to("turn_id", this.turnId));
    }

    /* compiled from: Background.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\t¨\u0006\n"}, d2 = {"Lcom/pymcl/ai/BgTaskInfo$Companion;", "", "<init>", "()V", "from", "Lcom/pymcl/ai/BgTaskInfo;", "o", "", "", "Lcom/pymcl/core/util/JObj;", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BgTaskInfo from(Map<String, Object> o) {
            Intrinsics.checkNotNullParameter(o, "o");
            String str = JsonKt.str(o, "id");
            if (str == null) {
                str = "";
            }
            String str2 = JsonKt.str(o, "chat_id");
            if (str2 == null) {
                str2 = "";
            }
            String str3 = JsonKt.str(o, "call_id");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = JsonKt.str(o, "tool");
            if (str4 == null) {
                str4 = "";
            }
            String str5 = JsonKt.str(o, "title");
            if (str5 == null) {
                str5 = "";
            }
            String str6 = JsonKt.str(o, "state");
            if (str6 == null) {
                str6 = "error";
            }
            String str7 = JsonKt.str(o, "detail");
            String str8 = str7 == null ? "" : str7;
            String str9 = JsonKt.str(o, "result");
            String str10 = str9 == null ? "" : str9;
            Long lM8043long = JsonKt.m8043long(o, "started");
            long jLongValue = lM8043long != null ? lM8043long.longValue() : 0L;
            Long lM8043long2 = JsonKt.m8043long(o, "finished");
            long jLongValue2 = lM8043long2 != null ? lM8043long2.longValue() : 0L;
            String str11 = str;
            boolean zAreEqual = Intrinsics.areEqual((Object) JsonKt.bool(o, "reported"), (Object) true);
            String str12 = JsonKt.str(o, "turn_id");
            return new BgTaskInfo(str11, str2, str3, str4, str5, str6, null, str8, str10, jLongValue, jLongValue2, zAreEqual, str12 != null ? str12 : "");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String reportText() {
        /*
            r7 = this;
            java.lang.String r0 = r7.state
            int r1 = r0.hashCode()
            switch(r1) {
                case -1947652542: goto L21;
                case 3548: goto L16;
                case 476588369: goto La;
                default: goto L9;
            }
        L9:
            goto L2d
        La:
            java.lang.String r1 = "cancelled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13
            goto L9
        L13:
            java.lang.String r0 = "已取消"
            goto L2f
        L16:
            java.lang.String r1 = "ok"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9
            java.lang.String r0 = "成功"
            goto L2f
        L21:
            java.lang.String r1 = "interrupted"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            goto L9
        L2a:
            java.lang.String r0 = "中断（应用在任务运行时退出，需要的话重新执行）"
            goto L2f
        L2d:
            java.lang.String r0 = "失败"
        L2f:
            java.lang.String r1 = r7.id
            java.lang.String r2 = r7.tool
            java.lang.String r3 = r7.title
            java.lang.String r4 = r7.result
            r5 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r4 = kotlin.text.StringsKt.take(r4, r5)
            java.lang.String r5 = "  "
            java.lang.String r4 = kotlin.text.StringsKt.prependIndent(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "- task_id="
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r1 = r5.append(r1)
            java.lang.String r5 = " 工具 "
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "（"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = "）："
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.BgTaskInfo.reportText():java.lang.String");
    }
}
