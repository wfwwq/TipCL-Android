package com.pymcl.ai;

import androidx.core.app.NotificationCompat;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.process.JavaProcessService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiToolHost.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/ai/AiEvent;", "", "RoundStart", "Delta", "Think", "Status", "ToolStart", "ToolProgress", "ToolDone", "Confirm", "Ask", "Plan", "Done", "BgTask", "Fail", "Lcom/pymcl/ai/AiEvent$Ask;", "Lcom/pymcl/ai/AiEvent$BgTask;", "Lcom/pymcl/ai/AiEvent$Confirm;", "Lcom/pymcl/ai/AiEvent$Delta;", "Lcom/pymcl/ai/AiEvent$Done;", "Lcom/pymcl/ai/AiEvent$Fail;", "Lcom/pymcl/ai/AiEvent$Plan;", "Lcom/pymcl/ai/AiEvent$RoundStart;", "Lcom/pymcl/ai/AiEvent$Status;", "Lcom/pymcl/ai/AiEvent$Think;", "Lcom/pymcl/ai/AiEvent$ToolDone;", "Lcom/pymcl/ai/AiEvent$ToolProgress;", "Lcom/pymcl/ai/AiEvent$ToolStart;", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AiEvent {

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/pymcl/ai/AiEvent$RoundStart;", "Lcom/pymcl/ai/AiEvent;", "round", "", "model", "", "retry", "", "<init>", "(ILjava/lang/String;Z)V", "getRound", "()I", "getModel", "()Ljava/lang/String;", "getRetry", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RoundStart implements AiEvent {
        private final String model;
        private final boolean retry;
        private final int round;

        public static /* synthetic */ RoundStart copy$default(RoundStart roundStart, int i, String str, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = roundStart.round;
            }
            if ((i2 & 2) != 0) {
                str = roundStart.model;
            }
            if ((i2 & 4) != 0) {
                z = roundStart.retry;
            }
            return roundStart.copy(i, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRound() {
            return this.round;
        }

        /* renamed from: component2, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRetry() {
            return this.retry;
        }

        public final RoundStart copy(int round, String model, boolean retry) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new RoundStart(round, model, retry);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoundStart)) {
                return false;
            }
            RoundStart roundStart = (RoundStart) other;
            return this.round == roundStart.round && Intrinsics.areEqual(this.model, roundStart.model) && this.retry == roundStart.retry;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.round) * 31) + this.model.hashCode()) * 31) + Boolean.hashCode(this.retry);
        }

        public String toString() {
            return "RoundStart(round=" + this.round + ", model=" + this.model + ", retry=" + this.retry + ")";
        }

        public RoundStart(int round, String model, boolean retry) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.round = round;
            this.model = model;
            this.retry = retry;
        }

        public /* synthetic */ RoundStart(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? false : z);
        }

        public final String getModel() {
            return this.model;
        }

        public final boolean getRetry() {
            return this.retry;
        }

        public final int getRound() {
            return this.round;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/pymcl/ai/AiEvent$Delta;", "Lcom/pymcl/ai/AiEvent;", TerracottaVpnService.EXTRA_TEXT, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Delta implements AiEvent {
        private final String text;

        public static /* synthetic */ Delta copy$default(Delta delta, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = delta.text;
            }
            return delta.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Delta copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Delta(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Delta) && Intrinsics.areEqual(this.text, ((Delta) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Delta(text=" + this.text + ")";
        }

        public Delta(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/pymcl/ai/AiEvent$Think;", "Lcom/pymcl/ai/AiEvent;", TerracottaVpnService.EXTRA_TEXT, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Think implements AiEvent {
        private final String text;

        public static /* synthetic */ Think copy$default(Think think, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = think.text;
            }
            return think.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Think copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Think(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Think) && Intrinsics.areEqual(this.text, ((Think) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Think(text=" + this.text + ")";
        }

        public Think(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/pymcl/ai/AiEvent$Status;", "Lcom/pymcl/ai/AiEvent;", "kind", "", TerracottaVpnService.EXTRA_TEXT, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Status implements AiEvent {
        private final String kind;
        private final String text;

        public static /* synthetic */ Status copy$default(Status status, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = status.kind;
            }
            if ((i & 2) != 0) {
                str2 = status.text;
            }
            return status.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Status copy(String kind, String text) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Status(kind, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return Intrinsics.areEqual(this.kind, status.kind) && Intrinsics.areEqual(this.text, status.text);
        }

        public int hashCode() {
            return (this.kind.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            return "Status(kind=" + this.kind + ", text=" + this.text + ")";
        }

        public Status(String kind, String text) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(text, "text");
            this.kind = kind;
            this.text = text;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\tHÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\tHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/pymcl/ai/AiEvent$ToolStart;", "Lcom/pymcl/ai/AiEvent;", "callId", "", "tool", "title", JavaProcessService.EXTRA_ARGS, "", "", "Lcom/pymcl/core/util/JObj;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCallId", "()Ljava/lang/String;", "getTool", "getTitle", "getArgs", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ToolStart implements AiEvent {
        private final Map<String, Object> args;
        private final String callId;
        private final String title;
        private final String tool;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ToolStart copy$default(ToolStart toolStart, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolStart.callId;
            }
            if ((i & 2) != 0) {
                str2 = toolStart.tool;
            }
            if ((i & 4) != 0) {
                str3 = toolStart.title;
            }
            if ((i & 8) != 0) {
                map = toolStart.args;
            }
            return toolStart.copy(str, str2, str3, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTool() {
            return this.tool;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, Object> component4() {
            return this.args;
        }

        public final ToolStart copy(String callId, String tool, String title, Map<String, Object> args) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(tool, "tool");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(args, "args");
            return new ToolStart(callId, tool, title, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolStart)) {
                return false;
            }
            ToolStart toolStart = (ToolStart) other;
            return Intrinsics.areEqual(this.callId, toolStart.callId) && Intrinsics.areEqual(this.tool, toolStart.tool) && Intrinsics.areEqual(this.title, toolStart.title) && Intrinsics.areEqual(this.args, toolStart.args);
        }

        public int hashCode() {
            return (((((this.callId.hashCode() * 31) + this.tool.hashCode()) * 31) + this.title.hashCode()) * 31) + this.args.hashCode();
        }

        public String toString() {
            return "ToolStart(callId=" + this.callId + ", tool=" + this.tool + ", title=" + this.title + ", args=" + this.args + ")";
        }

        public ToolStart(String callId, String tool, String title, Map<String, Object> args) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(tool, "tool");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(args, "args");
            this.callId = callId;
            this.tool = tool;
            this.title = title;
            this.args = args;
        }

        public final Map<String, Object> getArgs() {
            return this.args;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getTool() {
            return this.tool;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/pymcl/ai/AiEvent$ToolProgress;", "Lcom/pymcl/ai/AiEvent;", "callId", "", NotificationCompat.CATEGORY_PROGRESS, "", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getDetail", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/pymcl/ai/AiEvent$ToolProgress;", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ToolProgress implements AiEvent {
        private final String callId;
        private final String detail;
        private final Float progress;

        public static /* synthetic */ ToolProgress copy$default(ToolProgress toolProgress, String str, Float f, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolProgress.callId;
            }
            if ((i & 2) != 0) {
                f = toolProgress.progress;
            }
            if ((i & 4) != 0) {
                str2 = toolProgress.detail;
            }
            return toolProgress.copy(str, f, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final Float getProgress() {
            return this.progress;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        public final ToolProgress copy(String callId, Float progress, String detail) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new ToolProgress(callId, progress, detail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolProgress)) {
                return false;
            }
            ToolProgress toolProgress = (ToolProgress) other;
            return Intrinsics.areEqual(this.callId, toolProgress.callId) && Intrinsics.areEqual((Object) this.progress, (Object) toolProgress.progress) && Intrinsics.areEqual(this.detail, toolProgress.detail);
        }

        public int hashCode() {
            return (((this.callId.hashCode() * 31) + (this.progress == null ? 0 : this.progress.hashCode())) * 31) + this.detail.hashCode();
        }

        public String toString() {
            return "ToolProgress(callId=" + this.callId + ", progress=" + this.progress + ", detail=" + this.detail + ")";
        }

        public ToolProgress(String callId, Float progress, String detail) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.callId = callId;
            this.progress = progress;
            this.detail = detail;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final Float getProgress() {
            return this.progress;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/pymcl/ai/AiEvent$ToolDone;", "Lcom/pymcl/ai/AiEvent;", "callId", "", "tool", SettingsProtocol.EXTRA_OK, "", "summary", "skipped", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "getCallId", "()Ljava/lang/String;", "getTool", "getOk", "()Z", "getSummary", "getSkipped", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ToolDone implements AiEvent {
        private final String callId;
        private final boolean ok;
        private final boolean skipped;
        private final String summary;
        private final String tool;

        public static /* synthetic */ ToolDone copy$default(ToolDone toolDone, String str, String str2, boolean z, String str3, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolDone.callId;
            }
            if ((i & 2) != 0) {
                str2 = toolDone.tool;
            }
            if ((i & 4) != 0) {
                z = toolDone.ok;
            }
            if ((i & 8) != 0) {
                str3 = toolDone.summary;
            }
            if ((i & 16) != 0) {
                z2 = toolDone.skipped;
            }
            boolean z3 = z2;
            boolean z4 = z;
            return toolDone.copy(str, str2, z4, str3, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTool() {
            return this.tool;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getOk() {
            return this.ok;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSkipped() {
            return this.skipped;
        }

        public final ToolDone copy(String callId, String tool, boolean ok, String summary, boolean skipped) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(tool, "tool");
            Intrinsics.checkNotNullParameter(summary, "summary");
            return new ToolDone(callId, tool, ok, summary, skipped);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolDone)) {
                return false;
            }
            ToolDone toolDone = (ToolDone) other;
            return Intrinsics.areEqual(this.callId, toolDone.callId) && Intrinsics.areEqual(this.tool, toolDone.tool) && this.ok == toolDone.ok && Intrinsics.areEqual(this.summary, toolDone.summary) && this.skipped == toolDone.skipped;
        }

        public int hashCode() {
            return (((((((this.callId.hashCode() * 31) + this.tool.hashCode()) * 31) + Boolean.hashCode(this.ok)) * 31) + this.summary.hashCode()) * 31) + Boolean.hashCode(this.skipped);
        }

        public String toString() {
            return "ToolDone(callId=" + this.callId + ", tool=" + this.tool + ", ok=" + this.ok + ", summary=" + this.summary + ", skipped=" + this.skipped + ")";
        }

        public ToolDone(String callId, String tool, boolean ok, String summary, boolean skipped) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(tool, "tool");
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.callId = callId;
            this.tool = tool;
            this.ok = ok;
            this.summary = summary;
            this.skipped = skipped;
        }

        public /* synthetic */ ToolDone(String str, String str2, boolean z, String str3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, str3, (i & 16) != 0 ? false : z2);
        }

        public final String getCallId() {
            return this.callId;
        }

        public final boolean getOk() {
            return this.ok;
        }

        public final boolean getSkipped() {
            return this.skipped;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getTool() {
            return this.tool;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\u0002`\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\u0002`\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006$"}, d2 = {"Lcom/pymcl/ai/AiEvent$Confirm;", "Lcom/pymcl/ai/AiEvent;", "callId", "", "tool", JavaProcessService.EXTRA_ARGS, "", "", "Lcom/pymcl/core/util/JObj;", "summary", "destructive", "", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getTool", "getArgs", "()Ljava/util/Map;", "getSummary", "getDestructive", "()Z", "getReason", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Confirm implements AiEvent {
        private final Map<String, Object> args;
        private final String callId;
        private final boolean destructive;
        private final String reason;
        private final String summary;
        private final String tool;

        public static /* synthetic */ Confirm copy$default(Confirm confirm, String str, String str2, Map map, String str3, boolean z, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirm.callId;
            }
            if ((i & 2) != 0) {
                str2 = confirm.tool;
            }
            if ((i & 4) != 0) {
                map = confirm.args;
            }
            if ((i & 8) != 0) {
                str3 = confirm.summary;
            }
            if ((i & 16) != 0) {
                z = confirm.destructive;
            }
            if ((i & 32) != 0) {
                str4 = confirm.reason;
            }
            boolean z2 = z;
            String str5 = str4;
            return confirm.copy(str, str2, map, str3, z2, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTool() {
            return this.tool;
        }

        public final Map<String, Object> component3() {
            return this.args;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getDestructive() {
            return this.destructive;
        }

        /* renamed from: component6, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final Confirm copy(String callId, String tool, Map<String, Object> args, String summary, boolean destructive, String reason) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(tool, "tool");
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Confirm(callId, tool, args, summary, destructive, reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Confirm)) {
                return false;
            }
            Confirm confirm = (Confirm) other;
            return Intrinsics.areEqual(this.callId, confirm.callId) && Intrinsics.areEqual(this.tool, confirm.tool) && Intrinsics.areEqual(this.args, confirm.args) && Intrinsics.areEqual(this.summary, confirm.summary) && this.destructive == confirm.destructive && Intrinsics.areEqual(this.reason, confirm.reason);
        }

        public int hashCode() {
            return (((((((((this.callId.hashCode() * 31) + this.tool.hashCode()) * 31) + this.args.hashCode()) * 31) + this.summary.hashCode()) * 31) + Boolean.hashCode(this.destructive)) * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "Confirm(callId=" + this.callId + ", tool=" + this.tool + ", args=" + this.args + ", summary=" + this.summary + ", destructive=" + this.destructive + ", reason=" + this.reason + ")";
        }

        public Confirm(String callId, String tool, Map<String, Object> args, String summary, boolean destructive, String reason) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(tool, "tool");
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.callId = callId;
            this.tool = tool;
            this.args = args;
            this.summary = summary;
            this.destructive = destructive;
            this.reason = reason;
        }

        public final Map<String, Object> getArgs() {
            return this.args;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final boolean getDestructive() {
            return this.destructive;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getTool() {
            return this.tool;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/pymcl/ai/AiEvent$Ask;", "Lcom/pymcl/ai/AiEvent;", "callId", "", "title", "questions", "", "Lcom/pymcl/ai/AskQuestion;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCallId", "()Ljava/lang/String;", "getTitle", "getQuestions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Ask implements AiEvent {
        private final String callId;
        private final List<AskQuestion> questions;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ask copy$default(Ask ask, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ask.callId;
            }
            if ((i & 2) != 0) {
                str2 = ask.title;
            }
            if ((i & 4) != 0) {
                list = ask.questions;
            }
            return ask.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<AskQuestion> component3() {
            return this.questions;
        }

        public final Ask copy(String callId, String title, List<AskQuestion> questions) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(questions, "questions");
            return new Ask(callId, title, questions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ask)) {
                return false;
            }
            Ask ask = (Ask) other;
            return Intrinsics.areEqual(this.callId, ask.callId) && Intrinsics.areEqual(this.title, ask.title) && Intrinsics.areEqual(this.questions, ask.questions);
        }

        public int hashCode() {
            return (((this.callId.hashCode() * 31) + this.title.hashCode()) * 31) + this.questions.hashCode();
        }

        public String toString() {
            return "Ask(callId=" + this.callId + ", title=" + this.title + ", questions=" + this.questions + ")";
        }

        public Ask(String callId, String title, List<AskQuestion> questions) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(questions, "questions");
            this.callId = callId;
            this.title = title;
            this.questions = questions;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final List<AskQuestion> getQuestions() {
            return this.questions;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J%\u0010\u000b\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/pymcl/ai/AiEvent$Plan;", "Lcom/pymcl/ai/AiEvent;", "items", "", "Lkotlin/Pair;", "", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Plan implements AiEvent {
        private final List<Pair<String, String>> items;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Plan copy$default(Plan plan, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = plan.items;
            }
            return plan.copy(list);
        }

        public final List<Pair<String, String>> component1() {
            return this.items;
        }

        public final Plan copy(List<Pair<String, String>> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new Plan(items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Plan) && Intrinsics.areEqual(this.items, ((Plan) other).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "Plan(items=" + this.items + ")";
        }

        public Plan(List<Pair<String, String>> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }

        public final List<Pair<String, String>> getItems() {
            return this.items;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/pymcl/ai/AiEvent$Done;", "Lcom/pymcl/ai/AiEvent;", TerracottaVpnService.EXTRA_TEXT, "", "stopReason", "note", "usage", "Lcom/pymcl/ai/Usage;", "pendingTasks", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/ai/Usage;Ljava/util/List;)V", "getText", "()Ljava/lang/String;", "getStopReason", "getNote", "getUsage", "()Lcom/pymcl/ai/Usage;", "getPendingTasks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Done implements AiEvent {
        private final String note;
        private final List<String> pendingTasks;
        private final String stopReason;
        private final String text;
        private final Usage usage;

        public static /* synthetic */ Done copy$default(Done done, String str, String str2, String str3, Usage usage, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = done.text;
            }
            if ((i & 2) != 0) {
                str2 = done.stopReason;
            }
            if ((i & 4) != 0) {
                str3 = done.note;
            }
            if ((i & 8) != 0) {
                usage = done.usage;
            }
            if ((i & 16) != 0) {
                list = done.pendingTasks;
            }
            List list2 = list;
            String str4 = str3;
            return done.copy(str, str2, str4, usage, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStopReason() {
            return this.stopReason;
        }

        /* renamed from: component3, reason: from getter */
        public final String getNote() {
            return this.note;
        }

        /* renamed from: component4, reason: from getter */
        public final Usage getUsage() {
            return this.usage;
        }

        public final List<String> component5() {
            return this.pendingTasks;
        }

        public final Done copy(String text, String stopReason, String note, Usage usage, List<String> pendingTasks) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(stopReason, "stopReason");
            Intrinsics.checkNotNullParameter(note, "note");
            Intrinsics.checkNotNullParameter(usage, "usage");
            Intrinsics.checkNotNullParameter(pendingTasks, "pendingTasks");
            return new Done(text, stopReason, note, usage, pendingTasks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Done)) {
                return false;
            }
            Done done = (Done) other;
            return Intrinsics.areEqual(this.text, done.text) && Intrinsics.areEqual(this.stopReason, done.stopReason) && Intrinsics.areEqual(this.note, done.note) && Intrinsics.areEqual(this.usage, done.usage) && Intrinsics.areEqual(this.pendingTasks, done.pendingTasks);
        }

        public int hashCode() {
            return (((((((this.text.hashCode() * 31) + this.stopReason.hashCode()) * 31) + this.note.hashCode()) * 31) + this.usage.hashCode()) * 31) + this.pendingTasks.hashCode();
        }

        public String toString() {
            return "Done(text=" + this.text + ", stopReason=" + this.stopReason + ", note=" + this.note + ", usage=" + this.usage + ", pendingTasks=" + this.pendingTasks + ")";
        }

        public Done(String text, String stopReason, String note, Usage usage, List<String> pendingTasks) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(stopReason, "stopReason");
            Intrinsics.checkNotNullParameter(note, "note");
            Intrinsics.checkNotNullParameter(usage, "usage");
            Intrinsics.checkNotNullParameter(pendingTasks, "pendingTasks");
            this.text = text;
            this.stopReason = stopReason;
            this.note = note;
            this.usage = usage;
            this.pendingTasks = pendingTasks;
        }

        public /* synthetic */ Done(String str, String str2, String str3, Usage usage, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new Usage(0L, 0L, 0L, false, 15, null) : usage, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getNote() {
            return this.note;
        }

        public final List<String> getPendingTasks() {
            return this.pendingTasks;
        }

        public final String getStopReason() {
            return this.stopReason;
        }

        public final String getText() {
            return this.text;
        }

        public final Usage getUsage() {
            return this.usage;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/pymcl/ai/AiEvent$BgTask;", "Lcom/pymcl/ai/AiEvent;", "task", "Lcom/pymcl/ai/BgTaskInfo;", "<init>", "(Lcom/pymcl/ai/BgTaskInfo;)V", "getTask", "()Lcom/pymcl/ai/BgTaskInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BgTask implements AiEvent {
        private final BgTaskInfo task;

        public static /* synthetic */ BgTask copy$default(BgTask bgTask, BgTaskInfo bgTaskInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                bgTaskInfo = bgTask.task;
            }
            return bgTask.copy(bgTaskInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final BgTaskInfo getTask() {
            return this.task;
        }

        public final BgTask copy(BgTaskInfo task) {
            Intrinsics.checkNotNullParameter(task, "task");
            return new BgTask(task);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BgTask) && Intrinsics.areEqual(this.task, ((BgTask) other).task);
        }

        public int hashCode() {
            return this.task.hashCode();
        }

        public String toString() {
            return "BgTask(task=" + this.task + ")";
        }

        public BgTask(BgTaskInfo task) {
            Intrinsics.checkNotNullParameter(task, "task");
            this.task = task;
        }

        public final BgTaskInfo getTask() {
            return this.task;
        }
    }

    /* compiled from: AiToolHost.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/pymcl/ai/AiEvent$Fail;", "Lcom/pymcl/ai/AiEvent;", TerracottaVpnService.EXTRA_TEXT, "", "stopped", "", "<init>", "(Ljava/lang/String;Z)V", "getText", "()Ljava/lang/String;", "getStopped", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Fail implements AiEvent {
        private final boolean stopped;
        private final String text;

        public static /* synthetic */ Fail copy$default(Fail fail, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fail.text;
            }
            if ((i & 2) != 0) {
                z = fail.stopped;
            }
            return fail.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getStopped() {
            return this.stopped;
        }

        public final Fail copy(String text, boolean stopped) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Fail(text, stopped);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fail)) {
                return false;
            }
            Fail fail = (Fail) other;
            return Intrinsics.areEqual(this.text, fail.text) && this.stopped == fail.stopped;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + Boolean.hashCode(this.stopped);
        }

        public String toString() {
            return "Fail(text=" + this.text + ", stopped=" + this.stopped + ")";
        }

        public Fail(String text, boolean stopped) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.stopped = stopped;
        }

        public /* synthetic */ Fail(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final boolean getStopped() {
            return this.stopped;
        }

        public final String getText() {
            return this.text;
        }
    }
}
