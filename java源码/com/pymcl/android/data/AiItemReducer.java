package com.pymcl.android.data;

import androidx.core.app.NotificationCompat;
import com.pymcl.ai.AiEvent;
import com.pymcl.ai.AiText;
import com.pymcl.ai.AskOption;
import com.pymcl.ai.AskQuestion;
import com.pymcl.android.ui.state.AiItem;
import com.pymcl.android.ui.state.TaskState;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: AiBridge.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u0017H\u0002J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nj\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\nj\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\r\u001a6\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f0\u000ej\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u000ej\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0000¨\u0006%"}, d2 = {"Lcom/pymcl/android/data/AiItemReducer;", "", "<init>", "()V", "base", "", "round", "", "aId", TerracottaVpnService.EXTRA_TEXT, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "think", "titles", "Ljava/util/HashMap;", "Lkotlin/Pair;", "Lkotlin/collections/HashMap;", "seq", "confirms", "Lcom/pymcl/android/ui/state/AiItem$Confirm;", "assistant", "Lcom/pymcl/android/ui/state/AiItem;", "streaming", "", "closeAssistant", "", "discardAssistant", "ensure", "", NotificationCompat.CATEGORY_STATUS, "Lcom/pymcl/android/ui/state/AiItem$Tool;", "t", NotificationCompat.CATEGORY_ERROR, "reduce", "e", "Lcom/pymcl/ai/AiEvent;", "Companion", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class AiItemReducer {
    private String aId;
    private int round;
    private int seq;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final String base = "r" + System.currentTimeMillis();
    private final StringBuilder text = new StringBuilder();
    private final StringBuilder think = new StringBuilder();
    private final HashMap<String, Pair<String, String>> titles = new HashMap<>();
    private final HashMap<String, AiItem.Confirm> confirms = new HashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.pymcl.android.ui.state.AiItem assistant(boolean r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.aId
            r1 = 0
            if (r0 == 0) goto L50
            r2 = 0
            java.lang.StringBuilder r3 = r8.text
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L14
            r3 = r4
            goto L15
        L14:
            r3 = r5
        L15:
            if (r3 == 0) goto L27
            java.lang.StringBuilder r3 = r8.think
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L23
            r3 = r4
            goto L24
        L23:
            r3 = r5
        L24:
            if (r3 == 0) goto L27
            goto L50
        L27:
            java.lang.StringBuilder r3 = r8.text
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
            java.lang.StringBuilder r6 = r8.think
            java.lang.String r6 = r6.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r7 = r6.length()
            if (r7 != 0) goto L41
            goto L42
        L41:
            r4 = r5
        L42:
            if (r4 == 0) goto L47
            r4 = 0
            goto L48
        L47:
            r1 = r6
        L48:
            java.lang.String r1 = (java.lang.String) r1
            com.pymcl.android.ui.state.AiItem$Assistant r4 = new com.pymcl.android.ui.state.AiItem$Assistant
            r4.<init>(r0, r3, r9, r1)
            r1 = r4
        L50:
            com.pymcl.android.ui.state.AiItem r1 = (com.pymcl.android.ui.state.AiItem) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiItemReducer.assistant(boolean):com.pymcl.android.ui.state.AiItem");
    }

    private final List<AiItem> closeAssistant() {
        AiItem a = assistant(false);
        this.aId = null;
        this.text.setLength(0);
        this.think.setLength(0);
        return CollectionsKt.listOfNotNull(a);
    }

    private final List<AiItem> discardAssistant() {
        String id = this.aId;
        boolean shown = true;
        if (!(this.text.length() > 0)) {
            if (!(this.think.length() > 0)) {
                shown = false;
            }
        }
        this.aId = null;
        this.text.setLength(0);
        this.think.setLength(0);
        return (id == null || !shown) ? CollectionsKt.emptyList() : CollectionsKt.listOf(new AiItem.Assistant(id, "", false, null));
    }

    private final void ensure() {
        if (this.aId == null) {
            String str = this.base;
            int i = this.round;
            this.round = i + 1;
            this.aId = str + "-a" + i;
        }
    }

    private final AiItem.Tool status(String t, boolean err) {
        String str = this.base;
        int i = this.seq;
        this.seq = i + 1;
        return new AiItem.Tool(str + "-s" + i, err ? "__error" : "__status", t, null, err ? TaskState.Failed : TaskState.Done, null, 32, null);
    }

    static /* synthetic */ AiItem.Tool status$default(AiItemReducer aiItemReducer, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aiItemReducer.status(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<AiItem> reduce(AiEvent e) {
        List listEmptyList;
        Iterable options;
        Intrinsics.checkNotNullParameter(e, "e");
        if (e instanceof AiEvent.RoundStart) {
            if (((AiEvent.RoundStart) e).getRetry()) {
                return discardAssistant();
            }
            List<AiItem> listCloseAssistant = closeAssistant();
            ensure();
            return listCloseAssistant;
        }
        if (e instanceof AiEvent.Delta) {
            ensure();
            this.text.append(((AiEvent.Delta) e).getText());
            return CollectionsKt.listOfNotNull(assistant(true));
        }
        if (e instanceof AiEvent.Think) {
            ensure();
            this.think.append(((AiEvent.Think) e).getText());
            return CollectionsKt.listOfNotNull(assistant(true));
        }
        if (e instanceof AiEvent.Status) {
            return CollectionsKt.plus((Collection<? extends AiItem.Tool>) closeAssistant(), status$default(this, ((AiEvent.Status) e).getText(), false, 2, null));
        }
        if (e instanceof AiEvent.ToolStart) {
            this.titles.put(((AiEvent.ToolStart) e).getCallId(), TuplesKt.to(((AiEvent.ToolStart) e).getTool(), ((AiEvent.ToolStart) e).getTitle()));
            AiItem.Confirm c = this.confirms.remove(((AiEvent.ToolStart) e).getCallId());
            return CollectionsKt.plus((Collection<? extends AiItem.Tool>) CollectionsKt.plus((Collection) closeAssistant(), (Iterable) CollectionsKt.listOfNotNull(c != null ? AiItem.Confirm.copy$default(c, null, null, null, false, AiConfirmOutcome.Allowed.getLabel(), 15, null) : null)), new AiItem.Tool(((AiEvent.ToolStart) e).getCallId(), ((AiEvent.ToolStart) e).getTool(), ((AiEvent.ToolStart) e).getTitle(), null, TaskState.Running, null, 32, null));
        }
        if (e instanceof AiEvent.ToolProgress) {
            Pair<String, String> pair = this.titles.get(((AiEvent.ToolProgress) e).getCallId());
            if (pair != null) {
                List<AiItem> listListOf = CollectionsKt.listOf(new AiItem.Tool(((AiEvent.ToolProgress) e).getCallId(), pair.component1(), pair.component2(), ((AiEvent.ToolProgress) e).getProgress(), TaskState.Running, ((AiEvent.ToolProgress) e).getDetail()));
                if (listListOf != null) {
                    return listListOf;
                }
            }
            return CollectionsKt.emptyList();
        }
        if (e instanceof AiEvent.ToolDone) {
            Pair<String, String> pair2 = this.titles.get(((AiEvent.ToolDone) e).getCallId());
            if (pair2 == null) {
                pair2 = TuplesKt.to(((AiEvent.ToolDone) e).getTool(), ((AiEvent.ToolDone) e).getSummary());
            }
            String t = pair2.component1();
            String ti = pair2.component2();
            AiItem.Confirm c2 = this.confirms.remove(((AiEvent.ToolDone) e).getCallId());
            List<AiItem> listCloseAssistant2 = closeAssistant();
            if (c2 != null) {
                objCopy$default = AiItem.Confirm.copy$default(c2, null, null, null, false, (((AiEvent.ToolDone) e).getSkipped() ? AiConfirmOutcome.Denied : AiConfirmOutcome.Allowed).getLabel(), 15, null);
            }
            return CollectionsKt.plus((Collection<? extends AiItem.Tool>) CollectionsKt.plus((Collection) listCloseAssistant2, (Iterable) CollectionsKt.listOfNotNull(objCopy$default)), new AiItem.Tool(((AiEvent.ToolDone) e).getCallId(), t, ti, Float.valueOf(1.0f), ((AiEvent.ToolDone) e).getSkipped() ? TaskState.Cancelled : ((AiEvent.ToolDone) e).getOk() ? TaskState.Done : TaskState.Failed, ((AiEvent.ToolDone) e).getSummary()));
        }
        if (e instanceof AiEvent.Confirm) {
            AiItem.Confirm c3 = new AiItem.Confirm(((AiEvent.Confirm) e).getCallId(), ((AiEvent.Confirm) e).getTool(), ((AiEvent.Confirm) e).getSummary() + (!StringsKt.isBlank(((AiEvent.Confirm) e).getReason()) ? StringUtils.LF + ((AiEvent.Confirm) e).getReason() : ""), ((AiEvent.Confirm) e).getDestructive(), null, 16, null);
            this.confirms.put(((AiEvent.Confirm) e).getCallId(), c3);
            return CollectionsKt.plus((Collection<? extends AiItem.Confirm>) closeAssistant(), c3);
        }
        if (!(e instanceof AiEvent.Ask)) {
            if (e instanceof AiEvent.Plan) {
                return CollectionsKt.plus((Collection<? extends AiItem.Plan>) closeAssistant(), new AiItem.Plan(this.base + "-plan", ((AiEvent.Plan) e).getItems()));
            }
            if (!(e instanceof AiEvent.Done)) {
                if (e instanceof AiEvent.BgTask) {
                    return CollectionsKt.listOf(INSTANCE.bgItem(((AiEvent.BgTask) e).getTask()));
                }
                if (e instanceof AiEvent.Fail) {
                    return CollectionsKt.plus((Collection<? extends AiItem.Tool>) closeAssistant(), status(((AiEvent.Fail) e).getText(), true ^ ((AiEvent.Fail) e).getStopped()));
                }
                throw new NoWhenBranchMatchedException();
            }
            List<AiItem> listCloseAssistant3 = closeAssistant();
            String note = ((AiEvent.Done) e).getNote();
            if (StringsKt.isBlank(note)) {
                note = null;
            }
            List listPlus = CollectionsKt.plus((Collection) listCloseAssistant3, (Iterable) CollectionsKt.listOfNotNull(note != null ? status$default(this, note, false, 2, null) : null));
            List pendingTasks = ((AiEvent.Done) e).getPendingTasks();
            if (pendingTasks.isEmpty()) {
                pendingTasks = null;
            }
            return CollectionsKt.plus((Collection) listPlus, (Iterable) CollectionsKt.listOfNotNull(pendingTasks != null ? status$default(this, INSTANCE.pendingText(pendingTasks), false, 2, null) : null));
        }
        AskQuestion q = (AskQuestion) CollectionsKt.firstOrNull((List) ((AiEvent.Ask) e).getQuestions());
        List<AiItem> listCloseAssistant4 = closeAssistant();
        String str = "ask-" + ((AiEvent.Ask) e).getCallId();
        String[] strArr = new String[2];
        String title = ((AiEvent.Ask) e).getTitle();
        if (StringsKt.isBlank(title)) {
            title = null;
        }
        strArr[0] = title;
        strArr[1] = q != null ? q.getPrompt() : null;
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr), " · ", null, null, 0, null, null, 62, null);
        if (strJoinToString$default.length() == 0) {
            strJoinToString$default = AiText.INSTANCE.t("请在下面选一下", new Object[0]);
        }
        String str2 = strJoinToString$default;
        if (q == null || (options = q.getOptions()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            Iterable iterable = options;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((AskOption) it.next()).getLabel());
            }
            listEmptyList = (List) arrayList;
        }
        return CollectionsKt.plus((Collection<? extends AiItem.Ask>) listCloseAssistant4, new AiItem.Ask(str, str2, listEmptyList, q != null && q.getMulti(), null, 16, null));
    }

    /* compiled from: AiBridge.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/pymcl/android/data/AiItemReducer$Companion;", "", "<init>", "()V", "isDiscarded", "", "it", "Lcom/pymcl/android/ui/state/AiItem;", "pendingText", "", "titles", "", "bgItem", "Lcom/pymcl/android/ui/state/AiItem$Tool;", "t", "Lcom/pymcl/ai/BgTaskInfo;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isDiscarded(AiItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof AiItem.Assistant) {
                return (((AiItem.Assistant) it).getText().length() == 0) && !((AiItem.Assistant) it).getStreaming() && ((AiItem.Assistant) it).getThinking() == null;
            }
            return false;
        }

        public final String pendingText(List<String> titles) {
            Intrinsics.checkNotNullParameter(titles, "titles");
            return AiText.INSTANCE.t("还有 {0} 个后台任务在运行（{1}），完成后助手会回来汇报", Integer.valueOf(titles.size()), StringsKt.take(CollectionsKt.joinToString$default(titles, "、", null, null, 0, null, null, 62, null), 80));
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
        /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.pymcl.android.ui.state.AiItem.Tool bgItem(com.pymcl.ai.BgTaskInfo r13) {
            /*
                r12 = this;
                java.lang.String r0 = "t"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                com.pymcl.android.ui.state.AiItem$Tool r1 = new com.pymcl.android.ui.state.AiItem$Tool
                java.lang.String r2 = r13.getCallId()
                java.lang.String r3 = r13.getTool()
                java.lang.String r4 = r13.getTitle()
                boolean r0 = r13.getRunning()
                if (r0 == 0) goto L1e
                java.lang.Float r0 = r13.getProgress()
                goto L24
            L1e:
                r0 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
            L24:
                r5 = r0
                java.lang.String r0 = r13.getState()
                int r6 = r0.hashCode()
                java.lang.String r7 = "running"
                switch(r6) {
                    case 3548: goto L49;
                    case 476588369: goto L3d;
                    case 1550783935: goto L33;
                    default: goto L32;
                }
            L32:
                goto L55
            L33:
                boolean r0 = r0.equals(r7)
                if (r0 != 0) goto L3a
                goto L32
            L3a:
                com.pymcl.android.ui.state.TaskState r0 = com.pymcl.android.ui.state.TaskState.Running
                goto L57
            L3d:
                java.lang.String r6 = "cancelled"
                boolean r0 = r0.equals(r6)
                if (r0 != 0) goto L46
                goto L32
            L46:
                com.pymcl.android.ui.state.TaskState r0 = com.pymcl.android.ui.state.TaskState.Cancelled
                goto L57
            L49:
                java.lang.String r6 = "ok"
                boolean r0 = r0.equals(r6)
                if (r0 != 0) goto L52
                goto L32
            L52:
                com.pymcl.android.ui.state.TaskState r0 = com.pymcl.android.ui.state.TaskState.Done
                goto L57
            L55:
                com.pymcl.android.ui.state.TaskState r0 = com.pymcl.android.ui.state.TaskState.Failed
            L57:
                r6 = r0
                java.lang.String r0 = r13.getState()
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
                r8 = 0
                r9 = 2
                r10 = 0
                if (r7 == 0) goto L8c
                com.pymcl.ai.AiText r0 = com.pymcl.ai.AiText.INSTANCE
                java.lang.String r7 = "后台："
                java.lang.Object[] r11 = new java.lang.Object[r10]
                java.lang.String r0 = r0.t(r7, r11)
                com.pymcl.ai.AiText r7 = com.pymcl.ai.AiText.INSTANCE
                java.lang.String r11 = r13.getDetail()
                java.lang.String r7 = com.pymcl.ai.AiText.display$default(r7, r11, r10, r9, r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.StringBuilder r0 = r8.append(r0)
                java.lang.StringBuilder r0 = r0.append(r7)
                java.lang.String r0 = r0.toString()
            L8a:
                r7 = r0
                goto Laa
            L8c:
                java.lang.String r7 = "interrupted"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
                if (r0 == 0) goto L9f
                com.pymcl.ai.AiText r0 = com.pymcl.ai.AiText.INSTANCE
                java.lang.String r7 = "后台任务被中断"
                java.lang.Object[] r8 = new java.lang.Object[r10]
                java.lang.String r0 = r0.t(r7, r8)
                goto L8a
            L9f:
                com.pymcl.ai.AiText r0 = com.pymcl.ai.AiText.INSTANCE
                java.lang.String r7 = r13.getDetail()
                java.lang.String r0 = com.pymcl.ai.AiText.display$default(r0, r7, r10, r9, r8)
                goto L8a
            Laa:
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiItemReducer.Companion.bgItem(com.pymcl.ai.BgTaskInfo):com.pymcl.android.ui.state.AiItem$Tool");
        }
    }
}
