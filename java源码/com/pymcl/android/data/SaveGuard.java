package com.pymcl.android.data;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: MiscLogic.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J*\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0005J&\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/pymcl/android/data/SaveGuard;", "", "<init>", "()V", "norm", "", "p", "blockReason", "op", "Lcom/pymcl/android/data/SaveGuard$Op;", "gameRunning", "", "runningGameDir", "targetGameDir", "ILLEGAL", "Lkotlin/text/Regex;", "renameProblem", "newName", "current", "existing", "", "Op", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class SaveGuard {
    public static final int $stable = 0;
    public static final SaveGuard INSTANCE = new SaveGuard();
    private static final Regex ILLEGAL = new Regex("[\\\\/:*?\"<>|\\u0000-\\u001f]");

    /* compiled from: MiscLogic.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/pymcl/android/data/SaveGuard$Op;", "", "<init>", "(Ljava/lang/String;I)V", "RENAME", "DELETE", "RESTORE", "IMPORT", "DATAPACK", "RESTORE_TRASH", "EMPTY_TRASH", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum Op {
        RENAME,
        DELETE,
        RESTORE,
        IMPORT,
        DATAPACK,
        RESTORE_TRASH,
        EMPTY_TRASH;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<Op> getEntries() {
            return $ENTRIES;
        }
    }

    private SaveGuard() {
    }

    private final String norm(String p) {
        return StringsKt.trimEnd(p, IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS);
    }

    public final String blockReason(Op op, boolean gameRunning, String runningGameDir, String targetGameDir) {
        Intrinsics.checkNotNullParameter(op, "op");
        Intrinsics.checkNotNullParameter(targetGameDir, "targetGameDir");
        if (!gameRunning || op == Op.EMPTY_TRASH) {
            return null;
        }
        String str = runningGameDir;
        boolean same = (str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(norm(runningGameDir), norm(targetGameDir));
        if (same) {
            return "游戏正在运行并使用这个存档目录，请先退出游戏再操作（否则游戏退出时会回写存档，改动可能丢失或损坏世界）";
        }
        return null;
    }

    public final String renameProblem(String newName, String current, Collection<String> existing) {
        Intrinsics.checkNotNullParameter(newName, "newName");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(existing, "existing");
        String n = StringsKt.trim((CharSequence) newName).toString();
        boolean z = false;
        if (n.length() == 0) {
            return "名称不能为空";
        }
        if (Intrinsics.areEqual(n, ".") || Intrinsics.areEqual(n, "..") || ILLEGAL.containsMatchIn(n)) {
            return "名称不能含 \\ / : * ? \" < > | 等字符";
        }
        if (n.length() > 128) {
            return "名称太长（最多 128 个字符）";
        }
        if (Intrinsics.areEqual(n, current)) {
            return "名称没有变化";
        }
        Collection<String> collection = existing;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (((!StringsKt.equals(str, n, true) || StringsKt.equals(str, current, true)) ? null : 1) != null) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return "已有同名存档「" + n + "」";
        }
        return null;
    }
}
