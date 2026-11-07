package com.pymcl.ai;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: Mcp.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/pymcl/ai/McpStatusText;", "", "<init>", "()V", "capNote", "", "resources", "", "prompts", "subscribe", "en", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class McpStatusText {
    public static final McpStatusText INSTANCE = new McpStatusText();

    private McpStatusText() {
    }

    public static /* synthetic */ String capNote$default(McpStatusText mcpStatusText, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 8) != 0) {
            z4 = AiText.INSTANCE.getEnglish().invoke().booleanValue();
        }
        return mcpStatusText.capNote(z, z2, z3, z4);
    }

    public final String capNote(boolean resources, boolean prompts, boolean subscribe, boolean en) {
        String str;
        String str2;
        String str3;
        String[] strArr = new String[3];
        boolean z = false;
        String strTIn = AiText.INSTANCE.tIn(en, "资源", new Object[0]);
        if (!resources) {
            strTIn = null;
        }
        strArr[0] = strTIn;
        String strTIn2 = AiText.INSTANCE.tIn(en, "提示词", new Object[0]);
        if (!prompts) {
            strTIn2 = null;
        }
        strArr[1] = strTIn2;
        String strTIn3 = AiText.INSTANCE.tIn(en, "可订阅", new Object[0]);
        if (resources && subscribe) {
            z = true;
        }
        String it = z ? strTIn3 : null;
        strArr[2] = it;
        List parts = CollectionsKt.listOfNotNull((Object[]) strArr);
        if (parts.isEmpty()) {
            return "";
        }
        List list = parts;
        if (en) {
            str3 = ")";
        } else {
            str3 = "）";
        }
        return CollectionsKt.joinToString$default(list, str, str2, str3, 0, null, null, 56, null);
    }
}
