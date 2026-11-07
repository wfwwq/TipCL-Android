package com.pymcl.android.data;

import androidx.autofill.HintConstants;
import com.pymcl.core.instance.MediaKind;
import com.pymcl.core.instance.SaveInfo;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: SavesFormat.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000fJ\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006J\u001e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0002¨\u0006 "}, d2 = {"Lcom/pymcl/android/data/SavesFormat;", "", "<init>", "()V", "TABS", "", "", "getTABS", "()Ljava/util/List;", "mediaKind", "Lcom/pymcl/core/instance/MediaKind;", "tab", "", "time", "ms", "", "tz", "Ljava/util/TimeZone;", "size", "b", "saveSubtitle", "s", "Lcom/pymcl/core/instance/SaveInfo;", "viewerLines", TerracottaVpnService.EXTRA_TEXT, "maxLines", "mime", HintConstants.AUTOFILL_HINT_NAME, "isDatapack", "", "isDir", "hasMcmeta", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class SavesFormat {
    public static final int $stable = 0;
    public static final SavesFormat INSTANCE = new SavesFormat();
    private static final List<String> TABS = CollectionsKt.listOf((Object[]) new String[]{"存档", "截图", "崩溃报告", "日志"});

    private SavesFormat() {
    }

    public final List<String> getTABS() {
        return TABS;
    }

    public final MediaKind mediaKind(int tab) {
        switch (tab) {
            case 1:
                return MediaKind.SCREENSHOTS;
            case 2:
                return MediaKind.CRASH_REPORTS;
            case 3:
                return MediaKind.LOGS;
            default:
                return null;
        }
    }

    public static /* synthetic */ String time$default(SavesFormat savesFormat, long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
        }
        return savesFormat.time(j, timeZone);
    }

    public final String time(long ms, TimeZone tz) {
        Intrinsics.checkNotNullParameter(tz, "tz");
        if (ms <= 0) {
            return "-";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ROOT);
        simpleDateFormat.setTimeZone(tz);
        String str = simpleDateFormat.format(new Date(ms));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final String size(long b) {
        if (b < 0) {
            return "";
        }
        if (b < 1024) {
            return b + " B";
        }
        if (b < 1048576) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ROOT, "%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(b / 1024.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (b >= 1073741824) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.ROOT, "%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(b / 1.073741824E9d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.ROOT, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(b / 1048576.0d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    public static /* synthetic */ String saveSubtitle$default(SavesFormat savesFormat, SaveInfo saveInfo, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
        }
        return savesFormat.saveSubtitle(saveInfo, timeZone);
    }

    public final String saveSubtitle(SaveInfo s, TimeZone tz) {
        String str;
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(tz, "tz");
        String[] strArr = new String[5];
        strArr[0] = time(s.getLastPlayed(), tz);
        String modeLabel = s.getModeLabel();
        if (modeLabel.length() == 0) {
            modeLabel = null;
        }
        strArr[1] = modeLabel;
        String versionName = s.getVersionName();
        if (versionName != null) {
            String str2 = versionName;
            if (StringsKt.isBlank(str2)) {
                str2 = null;
            }
            str = str2;
        } else {
            str = null;
        }
        strArr[2] = str;
        String size = size(s.getSizeBytes());
        if (size.length() == 0) {
            size = null;
        }
        strArr[3] = size;
        strArr[4] = Intrinsics.areEqual(s.getDirName(), s.getLevelName()) ? null : "📁 " + s.getDirName();
        return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr), " · ", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ List viewerLines$default(SavesFormat savesFormat, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1500;
        }
        return savesFormat.viewerLines(str, i);
    }

    public final List<String> viewerLines(String text, int maxLines) {
        Intrinsics.checkNotNullParameter(text, "text");
        List l = StringsKt.split$default((CharSequence) StringsKt.replace$default(text, "\r\n", StringUtils.LF, false, 4, (Object) null), new char[]{'\n'}, false, 0, 6, (Object) null);
        return l.size() <= maxLines ? l : CollectionsKt.plus((Collection) CollectionsKt.listOf("…（共 " + l.size() + " 行，只显示最后 " + maxLines + " 行）"), (Iterable) CollectionsKt.takeLast(l, maxLines));
    }

    public final String mime(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String n = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(n, "toLowerCase(...)");
        if (StringsKt.endsWith$default(n, ".png", false, 2, (Object) null)) {
            return "image/png";
        }
        if (StringsKt.endsWith$default(n, ".jpg", false, 2, (Object) null) || StringsKt.endsWith$default(n, ".jpeg", false, 2, (Object) null)) {
            return "image/jpeg";
        }
        return StringsKt.endsWith$default(n, ".webp", false, 2, (Object) null) ? "image/webp" : StringsKt.endsWith$default(n, ".zip", false, 2, (Object) null) ? "application/zip" : StringsKt.endsWith$default(n, ".gz", false, 2, (Object) null) ? "application/gzip" : "text/plain";
    }

    public final boolean isDatapack(String name, boolean isDir, boolean hasMcmeta) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isDir) {
            return hasMcmeta;
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.endsWith$default(lowerCase, ".zip", false, 2, (Object) null);
    }
}
