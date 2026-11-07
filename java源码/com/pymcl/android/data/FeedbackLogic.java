package com.pymcl.android.data;

import com.pymcl.core.crash.CrashAnalyzer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: MiscLogic.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017JJ\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/pymcl/android/data/FeedbackLogic;", "", "<init>", "()V", "KINDS", "", "", "getKINDS", "()Ljava/util/List;", "CATEGORY", "getCATEGORY", "MAX_TITLE", "", "MAX_BODY", "MAX_CONTACT", "problem", "title", "body", "contact", "dateText", "nowMs", "", "zone", "Ljava/util/TimeZone;", "compose", "kind", "appVersion", "sysinfo", "subject", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class FeedbackLogic {
    public static final int $stable = 0;
    public static final int MAX_BODY = 16000;
    public static final int MAX_CONTACT = 120;
    public static final int MAX_TITLE = 120;
    public static final FeedbackLogic INSTANCE = new FeedbackLogic();
    private static final List<String> KINDS = CollectionsKt.listOf((Object[]) new String[]{"问题反馈", "功能建议", "崩溃报告", "其它"});
    private static final List<String> CATEGORY = CollectionsKt.listOf((Object[]) new String[]{"bug", "feature", "crash", "other"});

    private FeedbackLogic() {
    }

    public final List<String> getKINDS() {
        return KINDS;
    }

    public final List<String> getCATEGORY() {
        return CATEGORY;
    }

    public final String problem(String title, String body, String contact) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (StringsKt.isBlank(title)) {
            return "标题不能为空";
        }
        if (StringsKt.trim((CharSequence) title).toString().length() > 120) {
            return "标题太长（最多 120 个字）";
        }
        if (body.length() > 16000) {
            return "详细描述太长（最多 16000 个字）";
        }
        if (StringsKt.trim((CharSequence) contact).toString().length() > 120) {
            return "联系方式太长（最多 120 个字）";
        }
        return null;
    }

    public static /* synthetic */ String dateText$default(FeedbackLogic feedbackLogic, long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
        }
        return feedbackLogic.dateText(j, timeZone);
    }

    public final String dateText(long nowMs, TimeZone zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ROOT);
        f.setTimeZone(zone);
        String str = f.format(new Date(nowMs));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static /* synthetic */ String compose$default(FeedbackLogic feedbackLogic, int i, String str, String str2, String str3, String str4, String str5, long j, TimeZone timeZone, int i2, Object obj) {
        TimeZone timeZone2;
        if ((i2 & 128) == 0) {
            timeZone2 = timeZone;
        } else {
            TimeZone timeZone3 = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone3, "getDefault(...)");
            timeZone2 = timeZone3;
        }
        return feedbackLogic.compose(i, str, str2, str3, str4, str5, j, timeZone2);
    }

    public final String compose(int kind, String title, String body, String contact, String appVersion, String sysinfo, long nowMs, TimeZone zone) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(zone, "zone");
        StringBuilder sb = new StringBuilder();
        int iCoerceIn = RangesKt.coerceIn(kind, 0, CollectionsKt.getLastIndex(KINDS));
        sb.append("[PyMCL Android 反馈] " + ((Object) KINDS.get(iCoerceIn)) + " (" + ((Object) CATEGORY.get(iCoerceIn)) + ")").append('\n');
        sb.append("标题：" + StringsKt.trim((CharSequence) title).toString()).append('\n');
        sb.append("时间：" + INSTANCE.dateText(nowMs, zone)).append('\n');
        sb.append("版本：" + appVersion).append('\n');
        if (!StringsKt.isBlank(contact)) {
            sb.append("联系方式：" + StringsKt.trim((CharSequence) contact).toString()).append('\n');
        }
        sb.append('\n');
        String string = StringsKt.trim((CharSequence) body).toString();
        if (string.length() == 0) {
            string = "（未填写详细描述）";
        }
        sb.append(string).append('\n');
        if (sysinfo != null) {
            sb.append('\n');
            sb.append("—— 系统信息 ——").append('\n');
            Iterator it = StringsKt.lines(sysinfo).iterator();
            while (it.hasNext()) {
                sb.append(CrashAnalyzer.INSTANCE.filterSecrets((String) it.next())).append('\n');
            }
        }
        return StringsKt.trimEnd((CharSequence) sb.toString()).toString() + StringUtils.LF;
    }

    public final String subject(int kind, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return "[PyMCL Android] " + ((Object) CATEGORY.get(RangesKt.coerceIn(kind, 0, CollectionsKt.getLastIndex(CATEGORY)))) + ": " + StringsKt.take(StringsKt.trim((CharSequence) title).toString(), 120);
    }
}
