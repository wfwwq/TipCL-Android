package com.pymcl.android.data;

import com.pymcl.ai.AiEvent;
import com.pymcl.ai.AiSettings;
import com.pymcl.ai.BgClearResult;
import com.pymcl.ai.BgTaskInfo;
import com.pymcl.ai.McpServerStatus;
import com.pymcl.ai.RewindOutcome;
import com.pymcl.android.ui.state.AiItem;
import com.pymcl.android.ui.state.ChatSummary;
import com.pymcl.android.ui.state.PermissionRule;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AiBridge.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH&J\b\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003H&J,\u0010\u0013\u001a\u00020\u00032\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0003H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0007H&J\u000e\u0010\u0019\u001a\u00020\u001aH¦@¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016H¦@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001f\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u001bJ\u0016\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\tH¦@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\r2\u0006\u0010!\u001a\u00020\tH¦@¢\u0006\u0002\u0010\"J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00162\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0002\u0010\"J \u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H¦@¢\u0006\u0002\u0010)J&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0+2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H¦@¢\u0006\u0002\u0010)J\u000e\u0010,\u001a\u00020(H¦@¢\u0006\u0002\u0010\u001bJ\u0016\u0010-\u001a\u00020\r2\u0006\u0010'\u001a\u00020(H¦@¢\u0006\u0002\u0010)J\u0010\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u000200H\u0016J\n\u00101\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0016H¦@¢\u0006\u0002\u0010\u001bJ.\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0003H¦@¢\u0006\u0002\u00108J\u0016\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u000203H¦@¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020\tH&J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020>0\u0016H\u0016J\u0010\u0010B\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\tH\u0016J\u0014\u0010C\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0016H\u0016J\b\u0010H\u001a\u00020IH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006JÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/android/data/AiUiExtras;", "", "isRunning", "", "()Z", "send", "Lkotlinx/coroutines/flow/Flow;", "Lcom/pymcl/ai/AiEvent;", TerracottaVpnService.EXTRA_TEXT, "", "chatId", "hidden", "stop", "", "steer", "confirm", SettingsProtocol.EXTRA_OK, "always", "global", "answer", "answers", "", "", "skipped", "pendingCard", "rewind", "Lcom/pymcl/ai/RewindOutcome;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chats", "Lcom/pymcl/android/ui/state/ChatSummary;", "activeChat", "newChat", "setActive", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteChat", "history", "Lcom/pymcl/android/ui/state/AiItem;", "models", "st", "Lcom/pymcl/ai/AiSettings;", "(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "testConnection", "Lkotlin/Pair;", "settings", "saveSettings", "describeError", "e", "", "takeNetNotice", "rules", "Lcom/pymcl/android/ui/state/PermissionRule;", "addRule", "tool", "behavior", "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeRule", "rule", "(Lcom/pymcl/android/ui/state/PermissionRule;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usageText", "backgroundEvents", "Lcom/pymcl/ai/BgTaskInfo;", "getBackgroundEvents", "()Lkotlinx/coroutines/flow/Flow;", "backgroundTasks", "cancelTask", "needsReport", "report", "mcpToolNames", "mcpStatus", "Lcom/pymcl/ai/McpServerStatus;", "clearFinishedTasks", "Lcom/pymcl/ai/BgClearResult;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public interface AiUiExtras {
    Object activeChat(Continuation<? super String> continuation);

    Object addRule(String str, String str2, String str3, boolean z, Continuation<? super Unit> continuation);

    boolean answer(Map<String, ? extends List<String>> answers, boolean skipped);

    Object chats(Continuation<? super List<ChatSummary>> continuation);

    boolean confirm(boolean ok, boolean always, boolean global);

    Object deleteChat(String str, Continuation<? super Unit> continuation);

    Object history(String str, Continuation<? super List<? extends AiItem>> continuation);

    boolean isRunning();

    Object models(AiSettings aiSettings, Continuation<? super List<String>> continuation);

    Object newChat(Continuation<? super String> continuation);

    AiEvent pendingCard();

    Object removeRule(PermissionRule permissionRule, Continuation<? super Unit> continuation);

    Object rewind(Continuation<? super RewindOutcome> continuation);

    Object rules(Continuation<? super List<PermissionRule>> continuation);

    Object saveSettings(AiSettings aiSettings, Continuation<? super Unit> continuation);

    Flow<AiEvent> send(String text, String chatId, String hidden);

    Object setActive(String str, Continuation<? super Unit> continuation);

    Object settings(Continuation<? super AiSettings> continuation);

    boolean steer(String text);

    void stop();

    Object testConnection(AiSettings aiSettings, Continuation<? super Pair<Boolean, String>> continuation);

    String usageText();

    /* compiled from: AiBridge.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static String describeError(AiUiExtras $this, Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return AiUiExtras.super.describeError(e);
        }

        @Deprecated
        public static String takeNetNotice(AiUiExtras $this) {
            return AiUiExtras.super.takeNetNotice();
        }

        @Deprecated
        public static Flow<BgTaskInfo> getBackgroundEvents(AiUiExtras $this) {
            return AiUiExtras.super.getBackgroundEvents();
        }

        @Deprecated
        public static List<BgTaskInfo> backgroundTasks(AiUiExtras $this) {
            return AiUiExtras.super.backgroundTasks();
        }

        @Deprecated
        public static boolean cancelTask(AiUiExtras $this, String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return AiUiExtras.super.cancelTask(id);
        }

        @Deprecated
        public static boolean needsReport(AiUiExtras $this, String chatId) {
            return AiUiExtras.super.needsReport(chatId);
        }

        @Deprecated
        public static Flow<AiEvent> report(AiUiExtras $this, String chatId) {
            return AiUiExtras.super.report(chatId);
        }

        @Deprecated
        public static List<String> mcpToolNames(AiUiExtras $this) {
            return AiUiExtras.super.mcpToolNames();
        }

        @Deprecated
        public static List<McpServerStatus> mcpStatus(AiUiExtras $this) {
            return AiUiExtras.super.mcpStatus();
        }

        @Deprecated
        public static BgClearResult clearFinishedTasks(AiUiExtras $this) {
            return AiUiExtras.super.clearFinishedTasks();
        }
    }

    static /* synthetic */ Flow send$default(AiUiExtras aiUiExtras, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return aiUiExtras.send(str, str2, str3);
    }

    static /* synthetic */ boolean confirm$default(AiUiExtras aiUiExtras, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirm");
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return aiUiExtras.confirm(z, z2, z3);
    }

    static /* synthetic */ boolean answer$default(AiUiExtras aiUiExtras, Map map, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: answer");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return aiUiExtras.answer(map, z);
    }

    static /* synthetic */ Object models$default(AiUiExtras aiUiExtras, AiSettings aiSettings, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: models");
        }
        if ((i & 1) != 0) {
            aiSettings = null;
        }
        return aiUiExtras.models(aiSettings, continuation);
    }

    static /* synthetic */ Object testConnection$default(AiUiExtras aiUiExtras, AiSettings aiSettings, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: testConnection");
        }
        if ((i & 1) != 0) {
            aiSettings = null;
        }
        return aiUiExtras.testConnection(aiSettings, continuation);
    }

    default String describeError(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        String message = e.getMessage();
        return message == null ? e.toString() : message;
    }

    default String takeNetNotice() {
        return null;
    }

    default Flow<BgTaskInfo> getBackgroundEvents() {
        return FlowKt.emptyFlow();
    }

    default List<BgTaskInfo> backgroundTasks() {
        return CollectionsKt.emptyList();
    }

    default boolean cancelTask(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return false;
    }

    static /* synthetic */ boolean needsReport$default(AiUiExtras aiUiExtras, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: needsReport");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return aiUiExtras.needsReport(str);
    }

    default boolean needsReport(String chatId) {
        return false;
    }

    static /* synthetic */ Flow report$default(AiUiExtras aiUiExtras, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return aiUiExtras.report(str);
    }

    default Flow<AiEvent> report(String chatId) {
        return null;
    }

    default List<String> mcpToolNames() {
        return CollectionsKt.emptyList();
    }

    default List<McpServerStatus> mcpStatus() {
        return CollectionsKt.emptyList();
    }

    default BgClearResult clearFinishedTasks() {
        return new BgClearResult(CollectionsKt.emptyList(), 0, 0);
    }
}
