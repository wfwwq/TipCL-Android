package com.pymcl.android.data;

import com.pymcl.android.ui.state.CrashInfo;
import com.pymcl.android.ui.state.CrashScene;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

/* compiled from: AiFixPrompt.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005J\"\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/pymcl/android/data/AiFixPrompt;", "", "<init>", "()V", "MAX_LOG_LINES", "", "MAX_LOG_CHARS", "SECRET_KV", "Lkotlin/text/Regex;", "SECRET_ARG", "filterSecrets", "", "s", "visible", "info", "Lcom/pymcl/android/ui/state/CrashInfo;", "exitCodeHint", "code", "hidden", "logPath", "extra", "defaultLogPath", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class AiFixPrompt {
    public static final int $stable = 0;
    public static final int MAX_LOG_CHARS = 12000;
    public static final int MAX_LOG_LINES = 120;
    public static final AiFixPrompt INSTANCE = new AiFixPrompt();
    private static final Regex SECRET_KV = new Regex("(?i)((?:access[_-]?token|session[_-]?token|refresh[_-]?token|client[_-]?secret|authorization)\\s*[:=]\\s*)([^\\s\"']+)");
    private static final Regex SECRET_ARG = new Regex("(?i)(--(?:accessToken|uuid|xuid|clientId)\\s+)\\S+");

    /* compiled from: AiFixPrompt.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrashScene.values().length];
            try {
                iArr[CrashScene.TASK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AiFixPrompt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence filterSecrets$lambda$0(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Object) it.getGroupValues().get(1)) + "***";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence filterSecrets$lambda$1(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Object) it.getGroupValues().get(1)) + "***";
    }

    public final String filterSecrets(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return SECRET_ARG.replace(SECRET_KV.replace(s, new Function1() { // from class: com.pymcl.android.data.AiFixPrompt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiFixPrompt.filterSecrets$lambda$0((MatchResult) obj);
            }
        }), new Function1() { // from class: com.pymcl.android.data.AiFixPrompt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiFixPrompt.filterSecrets$lambda$1((MatchResult) obj);
            }
        });
    }

    public final String visible(CrashInfo info) {
        String str;
        Intrinsics.checkNotNullParameter(info, "info");
        if (WhenMappings.$EnumSwitchMapping$0[info.getScene().ordinal()] == 1) {
            return "下载/安装任务「" + info.getVersion() + "」出错了：" + info.getTitle() + "。帮我找出原因并处理。";
        }
        String str2 = info.getExitCode() != 0 ? "异常退出（退出码 " + info.getExitCode() + "）" : "启动出问题了";
        String crashInfo = info.getInstance();
        String version = info.getVersion();
        if (StringsKt.isBlank(version)) {
            version = null;
        }
        if (version == null || (str = " 版本 " + version) == null) {
            str = "";
        }
        return "游戏" + str2 + "：实例「" + crashInfo + "」" + str + "。帮我找出原因并修好。";
    }

    public final String exitCodeHint(int code) {
        switch (code) {
            case -11:
            case 139:
                return "原生段错误（渲染器/驱动或原生库崩溃）";
            case -9:
            case 137:
                return "被系统杀死（多半是内存不足）";
            case -6:
            case 134:
                return "原生层 abort（渲染器/驱动或原生库崩溃）";
            case -1:
            case 255:
                return "进程被强制结束或 JVM 启动失败";
            case 0:
                return "正常退出码，但被判定为启动失败/崩溃";
            case 1:
                return "Java 异常退出（通常是模组或配置报错）";
            default:
                return "未知退出码";
        }
    }

    public static /* synthetic */ String hidden$default(AiFixPrompt aiFixPrompt, CrashInfo crashInfo, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = aiFixPrompt.defaultLogPath(crashInfo);
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        return aiFixPrompt.hidden(crashInfo, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hidden$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return INSTANCE.filterSecrets(it);
    }

    public final String hidden(CrashInfo info, String logPath, String extra) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(logPath, "logPath");
        Intrinsics.checkNotNullParameter(extra, "extra");
        String tail = CollectionsKt.joinToString$default(CollectionsKt.takeLast(info.getLogTail(), 120), StringUtils.LF, null, null, 0, null, new Function1() { // from class: com.pymcl.android.data.AiFixPrompt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiFixPrompt.hidden$lambda$0((String) obj);
            }
        }, 30, null);
        if (tail.length() > 12000) {
            tail = "…（前面省略）\n" + StringsKt.takeLast(tail, MAX_LOG_CHARS);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("（系统附带的崩溃上下文，用户看不到这段）").append('\n');
        sb.append("平台：安卓版 PyMCL（游戏运行在 FCL 启动桥上）").append('\n');
        sb.append("实例：" + info.getInstance()).append('\n');
        String version = info.getVersion();
        if (StringsKt.isBlank(version)) {
            version = "未知";
        }
        sb.append("版本：" + ((Object) version)).append('\n');
        sb.append("退出码：" + info.getExitCode() + "（" + INSTANCE.exitCodeHint(info.getExitCode()) + "）").append('\n');
        String title = info.getTitle();
        if (StringsKt.isBlank(title)) {
            title = "游戏异常退出";
        }
        sb.append("现象：" + ((Object) title)).append('\n');
        if (!StringsKt.isBlank(info.getExplain())) {
            sb.append("启动器的分析结论：" + info.getExplain()).append('\n');
        }
        if (!info.getActions().isEmpty()) {
            sb.append("崩溃窗提供的一键修复：" + CollectionsKt.joinToString$default(info.getActions(), "、", null, null, 0, null, null, 62, null)).append('\n');
        }
        if (!StringsKt.isBlank(info.getGameDir())) {
            sb.append("游戏目录：" + info.getGameDir()).append('\n');
        }
        sb.append("日志文件：" + logPath + "（可用 get_latest_log / get_crash_report 读全文）").append('\n');
        if (!StringsKt.isBlank(extra)) {
            sb.append(extra).append('\n');
        }
        sb.append("接口状态：所有工具可用；写操作会按当前权限档位确认，用户在窗口里点允许即可。").append('\n');
        sb.append("要求：先用 diagnose_launch / get_crash_report / get_latest_log / scan_mod_conflicts 确认原因；能改配置、禁用模组、切换 Java 就直接动手修（会按权限确认），不要让用户自己去改文件或 JVM 参数；修完简短说明改了什么，并建议重新启动。").append('\n');
        sb.append("日志截断摘录（最后 " + CollectionsKt.takeLast(info.getLogTail(), 120).size() + " 行）：").append('\n');
        sb.append("```").append('\n');
        String str = tail;
        if (StringsKt.isBlank(str)) {
            str = "（没有捕获到输出）";
        }
        sb.append(str).append('\n');
        sb.append("```");
        return sb.toString();
    }

    public final String defaultLogPath(CrashInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return !StringsKt.isBlank(info.getGameDir()) ? StringsKt.trimEnd(info.getGameDir(), IOUtils.DIR_SEPARATOR_UNIX) + "/logs/latest.log" : "实例目录/logs/latest.log";
    }
}
