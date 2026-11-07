package com.pymcl.android.ui.state;

import androidx.core.app.NotificationCompat;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/pymcl/android/ui/state/AiItem;", "", "id", "", "getId", "()Ljava/lang/String;", "User", "Assistant", "Tool", "Plan", "Confirm", "Ask", "Lcom/pymcl/android/ui/state/AiItem$Ask;", "Lcom/pymcl/android/ui/state/AiItem$Assistant;", "Lcom/pymcl/android/ui/state/AiItem$Confirm;", "Lcom/pymcl/android/ui/state/AiItem$Plan;", "Lcom/pymcl/android/ui/state/AiItem$Tool;", "Lcom/pymcl/android/ui/state/AiItem$User;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface AiItem {
    String getId();

    /* compiled from: Models.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/pymcl/android/ui/state/AiItem$User;", "Lcom/pymcl/android/ui/state/AiItem;", "id", "", TerracottaVpnService.EXTRA_TEXT, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class User implements AiItem {
        public static final int $stable = 0;
        private final String id;
        private final String text;

        public static /* synthetic */ User copy$default(User user, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = user.id;
            }
            if ((i & 2) != 0) {
                str2 = user.text;
            }
            return user.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final User copy(String id, String text) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            return new User(id, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.text, user.text);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            return "User(id=" + this.id + ", text=" + this.text + ")";
        }

        public User(String id, String text) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = id;
            this.text = text;
        }

        @Override // com.pymcl.android.ui.state.AiItem
        public String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: Models.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/pymcl/android/ui/state/AiItem$Assistant;", "Lcom/pymcl/android/ui/state/AiItem;", "id", "", TerracottaVpnService.EXTRA_TEXT, "streaming", "", "thinking", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getText", "getStreaming", "()Z", "getThinking", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Assistant implements AiItem {
        public static final int $stable = 0;
        private final String id;
        private final boolean streaming;
        private final String text;
        private final String thinking;

        public static /* synthetic */ Assistant copy$default(Assistant assistant, String str, String str2, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assistant.id;
            }
            if ((i & 2) != 0) {
                str2 = assistant.text;
            }
            if ((i & 4) != 0) {
                z = assistant.streaming;
            }
            if ((i & 8) != 0) {
                str3 = assistant.thinking;
            }
            return assistant.copy(str, str2, z, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getStreaming() {
            return this.streaming;
        }

        /* renamed from: component4, reason: from getter */
        public final String getThinking() {
            return this.thinking;
        }

        public final Assistant copy(String id, String text, boolean streaming, String thinking) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Assistant(id, text, streaming, thinking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Assistant)) {
                return false;
            }
            Assistant assistant = (Assistant) other;
            return Intrinsics.areEqual(this.id, assistant.id) && Intrinsics.areEqual(this.text, assistant.text) && this.streaming == assistant.streaming && Intrinsics.areEqual(this.thinking, assistant.thinking);
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + this.text.hashCode()) * 31) + Boolean.hashCode(this.streaming)) * 31) + (this.thinking == null ? 0 : this.thinking.hashCode());
        }

        public String toString() {
            return "Assistant(id=" + this.id + ", text=" + this.text + ", streaming=" + this.streaming + ", thinking=" + this.thinking + ")";
        }

        public Assistant(String id, String text, boolean streaming, String thinking) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = id;
            this.text = text;
            this.streaming = streaming;
            this.thinking = thinking;
        }

        public /* synthetic */ Assistant(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3);
        }

        @Override // com.pymcl.android.ui.state.AiItem
        public String getId() {
            return this.id;
        }

        public final boolean getStreaming() {
            return this.streaming;
        }

        public final String getText() {
            return this.text;
        }

        public final String getThinking() {
            return this.thinking;
        }
    }

    /* compiled from: Models.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eÊ\u0001\f\b'\u0012\b\b(\u0012\u0004\b\u0003\u0010\u0002¨\u0006&"}, d2 = {"Lcom/pymcl/android/ui/state/AiItem$Tool;", "Lcom/pymcl/android/ui/state/AiItem;", "id", "", "tool", "title", NotificationCompat.CATEGORY_PROGRESS, "", "state", "Lcom/pymcl/android/ui/state/TaskState;", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTool", "getTitle", "getProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getState", "()Lcom/pymcl/android/ui/state/TaskState;", "getDetail", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;)Lcom/pymcl/android/ui/state/AiItem$Tool;", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Tool implements AiItem {
        public static final int $stable = 0;
        private final String detail;
        private final String id;
        private final Float progress;
        private final TaskState state;
        private final String title;
        private final String tool;

        public static /* synthetic */ Tool copy$default(Tool tool, String str, String str2, String str3, Float f, TaskState taskState, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tool.id;
            }
            if ((i & 2) != 0) {
                str2 = tool.tool;
            }
            if ((i & 4) != 0) {
                str3 = tool.title;
            }
            if ((i & 8) != 0) {
                f = tool.progress;
            }
            if ((i & 16) != 0) {
                taskState = tool.state;
            }
            if ((i & 32) != 0) {
                str4 = tool.detail;
            }
            TaskState taskState2 = taskState;
            String str5 = str4;
            return tool.copy(str, str2, str3, f, taskState2, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTool() {
            return this.tool;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final Float getProgress() {
            return this.progress;
        }

        /* renamed from: component5, reason: from getter */
        public final TaskState getState() {
            return this.state;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        public final Tool copy(String id, String tool, String title, Float progress, TaskState state, String detail) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tool, "tool");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new Tool(id, tool, title, progress, state, detail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tool)) {
                return false;
            }
            Tool tool = (Tool) other;
            return Intrinsics.areEqual(this.id, tool.id) && Intrinsics.areEqual(this.tool, tool.tool) && Intrinsics.areEqual(this.title, tool.title) && Intrinsics.areEqual((Object) this.progress, (Object) tool.progress) && this.state == tool.state && Intrinsics.areEqual(this.detail, tool.detail);
        }

        public int hashCode() {
            return (((((((((this.id.hashCode() * 31) + this.tool.hashCode()) * 31) + this.title.hashCode()) * 31) + (this.progress == null ? 0 : this.progress.hashCode())) * 31) + this.state.hashCode()) * 31) + this.detail.hashCode();
        }

        public String toString() {
            return "Tool(id=" + this.id + ", tool=" + this.tool + ", title=" + this.title + ", progress=" + this.progress + ", state=" + this.state + ", detail=" + this.detail + ")";
        }

        public Tool(String id, String tool, String title, Float progress, TaskState state, String detail) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tool, "tool");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.id = id;
            this.tool = tool;
            this.title = title;
            this.progress = progress;
            this.state = state;
            this.detail = detail;
        }

        public /* synthetic */ Tool(String str, String str2, String str3, Float f, TaskState taskState, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, f, taskState, (i & 32) != 0 ? "" : str4);
        }

        public final String getDetail() {
            return this.detail;
        }

        @Override // com.pymcl.android.ui.state.AiItem
        public String getId() {
            return this.id;
        }

        public final Float getProgress() {
            return this.progress;
        }

        public final TaskState getState() {
            return this.state;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getTool() {
            return this.tool;
        }
    }

    /* compiled from: Models.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/pymcl/android/ui/state/AiItem$Plan;", "Lcom/pymcl/android/ui/state/AiItem;", "id", "", "steps", "", "Lkotlin/Pair;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getSteps", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Plan implements AiItem {
        public static final int $stable = 8;
        private final String id;
        private final List<Pair<String, String>> steps;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Plan copy$default(Plan plan, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = plan.id;
            }
            if ((i & 2) != 0) {
                list = plan.steps;
            }
            return plan.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final List<Pair<String, String>> component2() {
            return this.steps;
        }

        public final Plan copy(String id, List<Pair<String, String>> steps) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(steps, "steps");
            return new Plan(id, steps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Plan)) {
                return false;
            }
            Plan plan = (Plan) other;
            return Intrinsics.areEqual(this.id, plan.id) && Intrinsics.areEqual(this.steps, plan.steps);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.steps.hashCode();
        }

        public String toString() {
            return "Plan(id=" + this.id + ", steps=" + this.steps + ")";
        }

        public Plan(String id, List<Pair<String, String>> steps) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.id = id;
            this.steps = steps;
        }

        @Override // com.pymcl.android.ui.state.AiItem
        public String getId() {
            return this.id;
        }

        public final List<Pair<String, String>> getSteps() {
            return this.steps;
        }
    }

    /* compiled from: Models.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fÊ\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001e"}, d2 = {"Lcom/pymcl/android/ui/state/AiItem$Confirm;", "Lcom/pymcl/android/ui/state/AiItem;", "id", "", "tool", "summary", "destructive", "", "resolved", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTool", "getSummary", "getDestructive", "()Z", "getResolved", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Confirm implements AiItem {
        public static final int $stable = 0;
        private final boolean destructive;
        private final String id;
        private final String resolved;
        private final String summary;
        private final String tool;

        public static /* synthetic */ Confirm copy$default(Confirm confirm, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirm.id;
            }
            if ((i & 2) != 0) {
                str2 = confirm.tool;
            }
            if ((i & 4) != 0) {
                str3 = confirm.summary;
            }
            if ((i & 8) != 0) {
                z = confirm.destructive;
            }
            if ((i & 16) != 0) {
                str4 = confirm.resolved;
            }
            String str5 = str4;
            String str6 = str3;
            return confirm.copy(str, str2, str6, z, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTool() {
            return this.tool;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getDestructive() {
            return this.destructive;
        }

        /* renamed from: component5, reason: from getter */
        public final String getResolved() {
            return this.resolved;
        }

        public final Confirm copy(String id, String tool, String summary, boolean destructive, String resolved) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tool, "tool");
            Intrinsics.checkNotNullParameter(summary, "summary");
            return new Confirm(id, tool, summary, destructive, resolved);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Confirm)) {
                return false;
            }
            Confirm confirm = (Confirm) other;
            return Intrinsics.areEqual(this.id, confirm.id) && Intrinsics.areEqual(this.tool, confirm.tool) && Intrinsics.areEqual(this.summary, confirm.summary) && this.destructive == confirm.destructive && Intrinsics.areEqual(this.resolved, confirm.resolved);
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.tool.hashCode()) * 31) + this.summary.hashCode()) * 31) + Boolean.hashCode(this.destructive)) * 31) + (this.resolved == null ? 0 : this.resolved.hashCode());
        }

        public String toString() {
            return "Confirm(id=" + this.id + ", tool=" + this.tool + ", summary=" + this.summary + ", destructive=" + this.destructive + ", resolved=" + this.resolved + ")";
        }

        public Confirm(String id, String tool, String summary, boolean destructive, String resolved) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tool, "tool");
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.id = id;
            this.tool = tool;
            this.summary = summary;
            this.destructive = destructive;
            this.resolved = resolved;
        }

        public /* synthetic */ Confirm(String str, String str2, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z, (i & 16) != 0 ? null : str4);
        }

        public final boolean getDestructive() {
            return this.destructive;
        }

        @Override // com.pymcl.android.ui.state.AiItem
        public String getId() {
            return this.id;
        }

        public final String getResolved() {
            return this.resolved;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getTool() {
            return this.tool;
        }
    }

    /* compiled from: Models.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rÊ\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006 "}, d2 = {"Lcom/pymcl/android/ui/state/AiItem$Ask;", "Lcom/pymcl/android/ui/state/AiItem;", "id", "", "question", "options", "", "multi", "", "resolved", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getQuestion", "getOptions", "()Ljava/util/List;", "getMulti", "()Z", "getResolved", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Ask implements AiItem {
        public static final int $stable = 8;
        private final String id;
        private final boolean multi;
        private final List<String> options;
        private final String question;
        private final String resolved;

        public static /* synthetic */ Ask copy$default(Ask ask, String str, String str2, List list, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ask.id;
            }
            if ((i & 2) != 0) {
                str2 = ask.question;
            }
            if ((i & 4) != 0) {
                list = ask.options;
            }
            if ((i & 8) != 0) {
                z = ask.multi;
            }
            if ((i & 16) != 0) {
                str3 = ask.resolved;
            }
            String str4 = str3;
            List list2 = list;
            return ask.copy(str, str2, list2, z, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        public final List<String> component3() {
            return this.options;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getMulti() {
            return this.multi;
        }

        /* renamed from: component5, reason: from getter */
        public final String getResolved() {
            return this.resolved;
        }

        public final Ask copy(String id, String question, List<String> options, boolean multi, String resolved) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(options, "options");
            return new Ask(id, question, options, multi, resolved);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ask)) {
                return false;
            }
            Ask ask = (Ask) other;
            return Intrinsics.areEqual(this.id, ask.id) && Intrinsics.areEqual(this.question, ask.question) && Intrinsics.areEqual(this.options, ask.options) && this.multi == ask.multi && Intrinsics.areEqual(this.resolved, ask.resolved);
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.question.hashCode()) * 31) + this.options.hashCode()) * 31) + Boolean.hashCode(this.multi)) * 31) + (this.resolved == null ? 0 : this.resolved.hashCode());
        }

        public String toString() {
            return "Ask(id=" + this.id + ", question=" + this.question + ", options=" + this.options + ", multi=" + this.multi + ", resolved=" + this.resolved + ")";
        }

        public Ask(String id, String question, List<String> options, boolean multi, String resolved) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(options, "options");
            this.id = id;
            this.question = question;
            this.options = options;
            this.multi = multi;
            this.resolved = resolved;
        }

        public /* synthetic */ Ask(String str, String str2, List list, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, list, z, (i & 16) != 0 ? null : str3);
        }

        @Override // com.pymcl.android.ui.state.AiItem
        public String getId() {
            return this.id;
        }

        public final boolean getMulti() {
            return this.multi;
        }

        public final List<String> getOptions() {
            return this.options;
        }

        public final String getQuestion() {
            return this.question;
        }

        public final String getResolved() {
            return this.resolved;
        }
    }
}
