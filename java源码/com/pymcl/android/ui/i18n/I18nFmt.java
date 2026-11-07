package com.pymcl.android.ui.i18n;

import com.pymcl.android.ui.i18n.I18n;
import com.pymcl.runtime.process.JavaProcessService;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.lwjgl.sdl.SDLTimer;

/* compiled from: I18nFmt.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/pymcl/android/ui/i18n/I18nFmt;", "", "<init>", "()V", "fill", "", "base", JavaProcessService.EXTRA_ARGS, "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "count", "n", "", "en", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class I18nFmt {
    public static final int $stable = 0;
    public static final I18nFmt INSTANCE = new I18nFmt();

    private I18nFmt() {
    }

    public final String fill(String base, Object... args) {
        String string;
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(args, "args");
        int i = 0;
        if (args.length == 0) {
            return base;
        }
        int i2 = 0;
        int length = args.length;
        String strReplace$default = base;
        while (i < length) {
            Object obj = args[i];
            int i3 = i2 + 1;
            String str = "{" + i2 + "}";
            if (obj == null || (string = obj.toString()) == null) {
                string = "";
            }
            strReplace$default = StringsKt.replace$default(strReplace$default, str, string, false, 4, (Object) null);
            i++;
            i2 = i3;
        }
        return strReplace$default;
    }

    public final String count(long n, boolean en) {
        if (!en) {
            if (n >= 100000000) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(n / 1.0E8d)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str + " 亿";
            }
            if (n >= 10000) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(n / 10000.0d)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                return str2 + " 万";
            }
            return String.valueOf(n);
        }
        if (n >= SDLTimer.SDL_NS_PER_SECOND) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(n / 1.0E9d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3 + "B";
        }
        if (n >= 1000000) {
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            String str4 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(n / 1000000.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            return str4 + "M";
        }
        if (n >= 1000) {
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            String str5 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(n / 1000.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            return str5 + "K";
        }
        return String.valueOf(n);
    }

    public final String count(long n) {
        return count(n, I18n.INSTANCE.getLang() == I18n.Lang.En);
    }
}
