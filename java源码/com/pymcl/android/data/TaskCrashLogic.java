package com.pymcl.android.data;

import com.pymcl.android.ui.state.CrashInfo;
import com.pymcl.android.ui.state.CrashScene;
import com.pymcl.android.ui.state.TaskState;
import com.pymcl.core.crash.CrashAnalyzer;
import com.pymcl.core.crash.CrashInput;
import com.pymcl.core.crash.CrashReason;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: MiscLogic.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fÊ\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0010"}, d2 = {"Lcom/pymcl/android/data/TaskCrashLogic;", "", "<init>", "()V", "canAnalyze", "", "state", "Lcom/pymcl/android/ui/state/TaskState;", "detail", "", "analyze", "Lcom/pymcl/android/ui/state/CrashInfo;", "title", "gameDir", "scene", "Lcom/pymcl/android/ui/state/CrashScene;", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class TaskCrashLogic {
    public static final int $stable = 0;
    public static final TaskCrashLogic INSTANCE = new TaskCrashLogic();

    private TaskCrashLogic() {
    }

    public final boolean canAnalyze(TaskState state, String detail) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return state == TaskState.Failed && !StringsKt.isBlank(detail);
    }

    public static /* synthetic */ CrashInfo analyze$default(TaskCrashLogic taskCrashLogic, String str, String str2, String str3, CrashScene crashScene, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            crashScene = CrashScene.TASK;
        }
        return taskCrashLogic.analyze(str, str2, str3, crashScene);
    }

    public final CrashInfo analyze(String title, String detail, String gameDir, CrashScene scene) {
        Object objM8116constructorimpl;
        String explain;
        String title2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        Intrinsics.checkNotNullParameter(scene, "scene");
        try {
            Result.Companion companion = Result.INSTANCE;
            TaskCrashLogic taskCrashLogic = this;
            objM8116constructorimpl = Result.m8116constructorimpl(CrashAnalyzer.INSTANCE.analyze(new CrashInput(-1, detail, null, null, null, null, 60, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = listEmptyList;
        }
        Collection arrayList = new ArrayList();
        Iterator it = ((Iterable) objM8116constructorimpl).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            CrashReason crashReason = (CrashReason) next;
            if ((Intrinsics.areEqual(crashReason.getKind(), "no_files") || Intrinsics.areEqual(crashReason.getKind(), "tiny_output")) ? false : true) {
                arrayList.add(next);
            }
        }
        List reasons = (List) arrayList;
        CrashReason first = (CrashReason) CollectionsKt.firstOrNull(reasons);
        if (first == null) {
            explain = "没有匹配到已知原因。下面是这个任务的失败信息，可复制后搜索或反馈。";
        } else {
            String[] strArr = new String[2];
            strArr[0] = first.getDescription();
            List extra = first.getExtra();
            if (extra.isEmpty()) {
                extra = null;
            }
            strArr[1] = extra != null ? CollectionsKt.joinToString$default(extra, "、", null, null, 0, null, null, 62, null) : null;
            explain = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr), StringUtils.LF, null, null, 0, null, null, 62, null);
        }
        Iterable iterableLines = StringsKt.lines(detail);
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableLines, 10));
        Iterator it2 = iterableLines.iterator();
        while (it2.hasNext()) {
            arrayList2.add(CrashAnalyzer.INSTANCE.filterSecrets((String) it2.next()));
        }
        List tail = CollectionsKt.takeLast((List) arrayList2, 60);
        if (first == null || (title2 = first.getTitle()) == null) {
            title2 = "任务失败";
        }
        return new CrashInfo("", title, -1, title2, explain, CollectionsKt.emptyList(), tail, gameDir, scene);
    }
}
