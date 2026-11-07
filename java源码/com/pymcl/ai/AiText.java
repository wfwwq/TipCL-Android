package com.pymcl.ai;

import com.pymcl.core.util.Json;
import com.pymcl.runtime.process.JavaProcessService;
import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: AiText.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0010\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0015¢\u0006\u0002\u0010\u0016J+\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0015\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0016J3\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0015\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR'\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/pymcl/ai/AiText;", "", "<init>", "()V", "english", "Lkotlin/Function0;", "", "getEnglish", "()Lkotlin/jvm/functions/Function0;", "setEnglish", "(Lkotlin/jvm/functions/Function0;)V", "EN", "", "", "getEN", "()Ljava/util/Map;", "EN$delegate", "Lkotlin/Lazy;", "format", "base", JavaProcessService.EXTRA_ARGS, "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "t", "zh", "tIn", "en", "(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "display", "stored", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiText {
    public static final AiText INSTANCE = new AiText();
    private static volatile Function0<Boolean> english = new Function0() { // from class: com.pymcl.ai.AiText$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(AiText.english$lambda$0());
        }
    };

    /* renamed from: EN$delegate, reason: from kotlin metadata */
    private static final Lazy EN = LazyKt.lazy(new Function0() { // from class: com.pymcl.ai.AiText$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AiText.EN_delegate$lambda$0();
        }
    });

    private AiText() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean english$lambda$0() {
        return false;
    }

    public final Function0<Boolean> getEnglish() {
        return english;
    }

    public final void setEnglish(Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        english = function0;
    }

    public final Map<String, String> getEN() {
        return (Map) EN.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map EN_delegate$lambda$0() {
        Object objM8116constructorimpl;
        AiText aiText = INSTANCE;
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream resourceAsStream = AiText.class.getResourceAsStream("/pymcl_ai/strings_en.json");
            Intrinsics.checkNotNull(resourceAsStream);
            InputStream inputStream = resourceAsStream;
            try {
                InputStream it = inputStream;
                String txt = new String(ByteStreamsKt.readBytes(it), Charsets.UTF_8);
                CloseableKt.closeFinally(inputStream, null);
                Iterable $this$associate$iv = Json.INSTANCE.obj(txt).entrySet();
                int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
                Map destination$iv$iv = new LinkedHashMap(capacity$iv);
                for (Object element$iv$iv : $this$associate$iv) {
                    Map.Entry entry = (Map.Entry) element$iv$iv;
                    String k = (String) entry.getKey();
                    Object v = entry.getValue();
                    String str = v instanceof String ? (String) v : null;
                    if (str == null) {
                        str = k;
                    }
                    Pair pair = TuplesKt.to(k, str);
                    destination$iv$iv.put(pair.getFirst(), pair.getSecond());
                }
                objM8116constructorimpl = Result.m8116constructorimpl(destination$iv$iv);
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

    public final String format(String base, Object[] args) {
        String string;
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(args, "args");
        int index$iv = 0;
        int length = args.length;
        int i = 0;
        String strReplace$default = base;
        while (i < length) {
            Object item$iv = args[i];
            int index$iv2 = index$iv + 1;
            String str = "{" + index$iv + "}";
            if (item$iv == null || (string = item$iv.toString()) == null) {
                string = "";
            }
            strReplace$default = StringsKt.replace$default(strReplace$default, str, string, false, 4, (Object) null);
            i++;
            index$iv = index$iv2;
        }
        return strReplace$default;
    }

    public final String t(String zh, Object... args) {
        Intrinsics.checkNotNullParameter(zh, "zh");
        Intrinsics.checkNotNullParameter(args, "args");
        return tIn(english.invoke().booleanValue(), zh, Arrays.copyOf(args, args.length));
    }

    public final String tIn(boolean en, String zh, Object... args) {
        String str;
        Intrinsics.checkNotNullParameter(zh, "zh");
        Intrinsics.checkNotNullParameter(args, "args");
        if (!en || (str = getEN().get(zh)) == null) {
            str = zh;
        }
        return format(str, args);
    }

    public static /* synthetic */ String display$default(AiText aiText, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = english.invoke().booleanValue();
        }
        return aiText.display(str, z);
    }

    public final String display(String stored, boolean en) {
        Intrinsics.checkNotNullParameter(stored, "stored");
        if (en) {
            if (!(stored.length() == 0)) {
                String it = getEN().get(stored);
                if (it != null) {
                    return it;
                }
                int i = StringsKt.indexOf$default((CharSequence) stored, (char) 65306, 0, false, 6, (Object) null);
                if (i > 0) {
                    Map<String, String> en2 = getEN();
                    String strSubstring = stored.substring(0, i + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String it2 = en2.get(strSubstring);
                    if (it2 != null) {
                        String strSubstring2 = stored.substring(i + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        return it2 + strSubstring2;
                    }
                }
                return stored;
            }
        }
        return stored;
    }
}
