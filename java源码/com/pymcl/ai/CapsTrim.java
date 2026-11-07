package com.pymcl.ai;

import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.util.JsonKt;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: ModelRules.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ:\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\u000e2\u0006\u0010\b\u001a\u00020\t¨\u0006\u0010"}, d2 = {"Lcom/pymcl/ai/CapsTrim;", "", "<init>", "()V", "contextWindow", "", "st", "Lcom/pymcl/ai/AiSettings;", "caps", "Lcom/pymcl/ai/ModelCaps;", "maxTokens", "stripImages", "", "", "Lcom/pymcl/core/util/JObj;", NotificationCompat.CATEGORY_MESSAGE, "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CapsTrim {
    public static final CapsTrim INSTANCE = new CapsTrim();

    private CapsTrim() {
    }

    public final int contextWindow(AiSettings st, ModelCaps caps) {
        Intrinsics.checkNotNullParameter(st, "st");
        Intrinsics.checkNotNullParameter(caps, "caps");
        return RangesKt.coerceAtLeast(Math.min(st.getContextWindow(), caps.getContextWindow()), AiSettings.MIN_CONTEXT);
    }

    public final int maxTokens(AiSettings st, ModelCaps caps) {
        Intrinsics.checkNotNullParameter(st, "st");
        Intrinsics.checkNotNullParameter(caps, "caps");
        return Math.min(st.getMaxTokens(), caps.getMaxOutput());
    }

    public final Map<String, Object> stripImages(Map<String, Object> msg, ModelCaps caps) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(caps, "caps");
        if (caps.getSupportsImages()) {
            return msg;
        }
        Object obj = msg.get("content");
        Iterable parts = obj instanceof List ? (List) obj : null;
        if (parts == null) {
            return msg;
        }
        Iterable $this$none$iv = parts;
        boolean z = true;
        if (!($this$none$iv instanceof Collection) || !((Collection) $this$none$iv).isEmpty()) {
            Iterator it = $this$none$iv.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object element$iv = it.next();
                Map map = element$iv instanceof Map ? (Map) element$iv : null;
                if (Intrinsics.areEqual(map != null ? map.get(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY) : null, "image_url")) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return msg;
        }
        String text = CollectionsKt.joinToString$default(parts, StringUtils.LF, null, null, 0, null, new Function1() { // from class: com.pymcl.ai.CapsTrim$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CapsTrim.stripImages$lambda$1(obj2);
            }
        }, 30, null);
        LinkedHashMap it2 = new LinkedHashMap(msg);
        it2.put("content", text);
        return it2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence stripImages$lambda$1(Object p) {
        String str;
        Map o = JsonKt.o(p);
        if (Intrinsics.areEqual(o != null ? JsonKt.str(o, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY) : null, "image_url")) {
            str = "[图片已省略：当前模型不支持图片]";
        } else if (o == null || (str = JsonKt.str(o, TerracottaVpnService.EXTRA_TEXT)) == null) {
            str = "";
        }
        return str;
    }
}
