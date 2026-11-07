package com.pymcl.android.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LaunchConfigIO.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tR\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/pymcl/android/data/HomepageLogic;", "", "<init>", "()V", "mode", "Lcom/pymcl/android/data/HomepageLogic$Mode;", "index", "", "customPath", "", "MAX_BYTES", "", "readLocal", "path", "Mode", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class HomepageLogic {
    public static final int $stable = 0;
    public static final HomepageLogic INSTANCE = new HomepageLogic();
    public static final long MAX_BYTES = 2097152;

    /* compiled from: LaunchConfigIO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/pymcl/android/data/HomepageLogic$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "News", "Local", "LocalUnset", "Blank", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum Mode {
        News,
        Local,
        LocalUnset,
        Blank;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }
    }

    private HomepageLogic() {
    }

    public final Mode mode(int index, String customPath) {
        Intrinsics.checkNotNullParameter(customPath, "customPath");
        switch (index) {
            case 1:
                return StringsKt.isBlank(customPath) ? Mode.LocalUnset : Mode.Local;
            case 2:
                return Mode.Blank;
            default:
                return Mode.News;
        }
    }

    public final String readLocal(String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File f = new File(StringsKt.removePrefix(StringsKt.trim((CharSequence) path).toString(), (CharSequence) "file://"));
        if (!f.isFile()) {
            throw new FileNotFoundException(f.getPath());
        }
        if (f.length() > 2097152) {
            throw new IOException("> 2 MB");
        }
        return FilesKt.readText$default(f, null, 1, null);
    }
}
