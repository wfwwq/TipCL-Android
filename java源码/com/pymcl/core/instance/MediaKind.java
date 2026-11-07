package com.pymcl.core.instance;

import androidx.autofill.HintConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Saves.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000e"}, d2 = {"Lcom/pymcl/core/instance/MediaKind;", "", "dir", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDir", "()Ljava/lang/String;", "SCREENSHOTS", "CRASH_REPORTS", "LOGS", "accepts", "", HintConstants.AUTOFILL_HINT_NAME, "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum MediaKind {
    SCREENSHOTS("screenshots"),
    CRASH_REPORTS("crash-reports"),
    LOGS("logs");

    private final String dir;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    /* compiled from: Saves.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaKind.values().length];
            try {
                iArr[MediaKind.SCREENSHOTS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[MediaKind.CRASH_REPORTS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[MediaKind.LOGS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EnumEntries<MediaKind> getEntries() {
        return $ENTRIES;
    }

    MediaKind(String dir) {
        this.dir = dir;
    }

    public final String getDir() {
        return this.dir;
    }

    public final boolean accepts(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String n = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(n, "toLowerCase(...)");
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return StringsKt.endsWith$default(n, ".png", false, 2, (Object) null) || StringsKt.endsWith$default(n, ".jpg", false, 2, (Object) null) || StringsKt.endsWith$default(n, ".jpeg", false, 2, (Object) null) || StringsKt.endsWith$default(n, ".webp", false, 2, (Object) null);
            case 2:
                return StringsKt.endsWith$default(n, ".txt", false, 2, (Object) null) || StringsKt.endsWith$default(n, ".log", false, 2, (Object) null);
            case 3:
                return StringsKt.endsWith$default(n, ".log", false, 2, (Object) null) || StringsKt.endsWith$default(n, ".log.gz", false, 2, (Object) null) || StringsKt.endsWith$default(n, ".txt", false, 2, (Object) null) || StringsKt.endsWith$default(n, ".gz", false, 2, (Object) null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
