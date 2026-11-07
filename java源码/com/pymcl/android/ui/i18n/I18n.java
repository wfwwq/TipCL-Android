package com.pymcl.android.ui.i18n;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.pymcl.android.R;
import com.pymcl.runtime.process.JavaProcessService;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* compiled from: I18n.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0005J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fJ+\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0016\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010 \"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010!J+\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f2\u0016\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010 \"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010!R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000Ê\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0002¨\u0006%"}, d2 = {"Lcom/pymcl/android/ui/i18n/I18n;", "", "<init>", "()V", "<set-?>", "Lcom/pymcl/android/ui/i18n/I18n$Lang;", "lang", "getLang", "()Lcom/pymcl/android/ui/i18n/I18n$Lang;", "setLang", "(Lcom/pymcl/android/ui/i18n/I18n$Lang;)V", "lang$delegate", "Landroidx/compose/runtime/MutableState;", "en", "", "", "zh", "init", "", "ctx", "Landroid/content/Context;", "initial", "set", "l", "load", "id", "", "has", "", "key", "t", JavaProcessService.EXTRA_ARGS, "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "fill", "base", "Lang", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class I18n {
    public static final int $stable = 0;
    public static final I18n INSTANCE = new I18n();

    /* renamed from: lang$delegate, reason: from kotlin metadata */
    private static final MutableState lang = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Lang.Zh, null, 2, null);
    private static Map<String, String> en = MapsKt.emptyMap();
    private static Map<String, String> zh = MapsKt.emptyMap();

    /* compiled from: I18n.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lang.values().length];
            try {
                iArr[Lang.En.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Lang.Zh.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: I18n.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/pymcl/android/ui/i18n/I18n$Lang;", "", "code", "", "label", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getLabel", "Zh", "En", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum Lang {
        Zh("zh_CN", "简体中文"),
        En("en", "English");

        private final String code;
        private final String label;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<Lang> getEntries() {
            return $ENTRIES;
        }

        Lang(String code, String label) {
            this.code = code;
            this.label = label;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getLabel() {
            return this.label;
        }
    }

    private I18n() {
    }

    private final void setLang(Lang lang2) {
        lang.setValue(lang2);
    }

    public final Lang getLang() {
        return (Lang) lang.getValue();
    }

    public final void init(Context ctx, Lang initial) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(initial, "initial");
        if (en.isEmpty()) {
            en = load(ctx, R.raw.locale_en);
            zh = load(ctx, R.raw.locale_zh_cn);
        }
        setLang(initial);
    }

    public final void set(Lang l) {
        Intrinsics.checkNotNullParameter(l, "l");
        setLang(l);
    }

    private final Map<String, String> load(Context ctx, int id) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            I18n i18n = this;
            InputStream inputStreamOpenRawResource = ctx.getResources().openRawResource(id);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                JSONObject jSONObject = new JSONObject(text);
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                Iterator itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String str = (String) itKeys.next();
                    mapCreateMapBuilder.put(str, jSONObject.optString(str, str));
                }
                objM8116constructorimpl = Result.m8116constructorimpl(MapsKt.build(mapCreateMapBuilder));
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = mapEmptyMap;
        }
        return (Map) objM8116constructorimpl;
    }

    public final boolean has(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return en.containsKey(key);
    }

    public final String t(String key, Object... args) {
        Map<String, String> map;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(args, "args");
        switch (WhenMappings.$EnumSwitchMapping$0[getLang().ordinal()]) {
            case 1:
                map = en;
                break;
            case 2:
                map = zh;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String base = map.get(key);
        if (base == null) {
            base = key;
        }
        return fill(base, Arrays.copyOf(args, args.length));
    }

    public final String fill(String base, Object... args) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(args, "args");
        return I18nFmt.INSTANCE.fill(base, Arrays.copyOf(args, args.length));
    }
}
