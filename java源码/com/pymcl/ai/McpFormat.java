package com.pymcl.ai;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.StringUtils;

/* compiled from: Mcp.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0002`\nJM\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0002`\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0002`\n2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000e\"\u00020\u0007H\u0002¢\u0006\u0002\u0010\u000fJP\u0010\u0010\u001a\u00020\u00072\u001e\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0002`\n0\u00122\u001e\u0010\u0013\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0002`\n0\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007J \u0010\u0015\u001a\u00020\u00072\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0002`\nJ0\u0010\u0017\u001a\u00020\u00072\u001e\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0002`\n0\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007J \u0010\u0019\u001a\u00020\u00072\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0002`\nJ6\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0002`\n2\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tj\u0004\u0018\u0001`\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/pymcl/ai/McpFormat;", "", "<init>", "()V", "MAX_LIST", "", "content", "", "c", "", "Lcom/pymcl/core/util/JObj;", "pick", "o", "keys", "", "(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/Map;", "resourceList", "resources", "", "templates", "nextCursor", "readResult", "r", "promptList", "prompts", "promptResult", "promptArgs", "a", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class McpFormat {
    public static final McpFormat INSTANCE = new McpFormat();
    public static final int MAX_LIST = 200;

    private McpFormat() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String content(Map<String, Object> c) {
        String str;
        String it;
        String it2;
        String it3;
        Intrinsics.checkNotNullParameter(c, "c");
        String str2 = JsonKt.str(c, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -341064690:
                    if (str2.equals("resource")) {
                        Map r = JsonKt.obj(c, "resource");
                        String str3 = JsonKt.str(r, TerracottaVpnService.EXTRA_TEXT);
                        if (str3 != null) {
                            return str3;
                        }
                        String str4 = JsonKt.str(r, "uri");
                        if (str4 == null) {
                            str4 = "";
                        }
                        String it4 = JsonKt.str(r, "mimeType");
                        if (it4 != null && (it = StringUtils.SPACE + it4) != null) {
                            str = it;
                        }
                        return "[资源 " + str4 + str + "]";
                    }
                    break;
                case 3556653:
                    if (str2.equals(TerracottaVpnService.EXTRA_TEXT)) {
                        String str5 = JsonKt.str(c, TerracottaVpnService.EXTRA_TEXT);
                        return str5 == null ? "" : str5;
                    }
                    break;
                case 93166550:
                    if (str2.equals("audio")) {
                        String str6 = JsonKt.str(c, "mimeType");
                        return "[音频 " + (str6 != null ? str6 : "") + "]";
                    }
                    break;
                case 100313435:
                    if (str2.equals("image")) {
                        String str7 = JsonKt.str(c, "mimeType");
                        return "[图片 " + (str7 != null ? str7 : "") + "]";
                    }
                    break;
                case 979369355:
                    if (str2.equals("resource_link")) {
                        String str8 = JsonKt.str(c, "uri");
                        if (str8 == null) {
                            str8 = "";
                        }
                        String it5 = JsonKt.str(c, HintConstants.AUTOFILL_HINT_NAME);
                        if (it5 == null || (it2 = "（" + it5 + "）") == null) {
                            it2 = "";
                        }
                        String it6 = JsonKt.str(c, "description");
                        if (it6 != null && (it3 = "：" + it6) != null) {
                            str = it3;
                        }
                        return "[资源链接 " + str8 + it2 + str + "]";
                    }
                    break;
            }
        }
        return Json.stringify$default(Json.INSTANCE, c, false, 2, null);
    }

    private final Map<String, Object> pick(Map<String, Object> o, String... keys) {
        Collection destination$iv$iv = new ArrayList();
        for (String str : keys) {
            Object it = o.get(str);
            Pair pair = it != null ? TuplesKt.to(str, it) : null;
            if (pair != null) {
                destination$iv$iv.add(pair);
            }
        }
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;
        Pair[] pairArr = (Pair[]) $this$toTypedArray$iv.toArray(new Pair[0]);
        return JsonKt.jobj((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    public final String resourceList(List<? extends Map<String, Object>> resources, List<? extends Map<String, Object>> templates, String nextCursor) {
        boolean z;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(templates, "templates");
        boolean z2 = true;
        Pair[] pairArr = new Pair[1];
        List listTake = CollectionsKt.take(resources, 200);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        while (true) {
            z = z2;
            if (!it.hasNext()) {
                break;
            }
            Map<String, Object> map = (Map) it.next();
            McpFormat mcpFormat = INSTANCE;
            String[] strArr = new String[6];
            strArr[0] = "uri";
            strArr[z ? 1 : 0] = HintConstants.AUTOFILL_HINT_NAME;
            strArr[2] = "title";
            strArr[3] = "mimeType";
            strArr[4] = "description";
            strArr[5] = "size";
            arrayList.add(mcpFormat.pick(map, strArr));
            z2 = z ? 1 : 0;
        }
        int i = 5;
        pairArr[0] = TuplesKt.to("resources", CollectionsKt.toMutableList((Collection) arrayList));
        Map<String, Object> mapJobj = JsonKt.jobj(pairArr);
        if (!templates.isEmpty()) {
            List<Map<String, Object>> listTake2 = CollectionsKt.take(templates, 200);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake2, 10));
            for (Map<String, Object> map2 : listTake2) {
                McpFormat mcpFormat2 = INSTANCE;
                int i2 = i;
                String[] strArr2 = new String[i2];
                strArr2[0] = "uriTemplate";
                strArr2[z ? 1 : 0] = HintConstants.AUTOFILL_HINT_NAME;
                strArr2[2] = "title";
                strArr2[3] = "mimeType";
                strArr2[4] = "description";
                arrayList2.add(mcpFormat2.pick(map2, strArr2));
                i = i2;
            }
            mapJobj.put("resourceTemplates", CollectionsKt.toMutableList((Collection) arrayList2));
        }
        if (resources.size() > 200) {
            mapJobj.put("truncated", "只列出前 200 个");
        }
        if (nextCursor != null) {
            mapJobj.put("nextCursor", nextCursor);
        }
        if (resources.isEmpty() && templates.isEmpty()) {
            mapJobj.put("note", "服务器没有列出资源");
        }
        return Json.stringify$default(Json.INSTANCE, mapJobj, false, 2, null);
    }

    public final String readResult(Map<String, Object> r) {
        Intrinsics.checkNotNullParameter(r, "r");
        List cs = JsonKt.objs(JsonKt.arr(r, "contents"));
        return cs.isEmpty() ? "（资源没有内容）" : CollectionsKt.joinToString$default(cs, "\n\n", null, null, 0, null, new Function1() { // from class: com.pymcl.ai.McpFormat$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McpFormat.readResult$lambda$0((Map) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence readResult$lambda$0(Map c) {
        String str;
        String it;
        Intrinsics.checkNotNullParameter(c, "c");
        String str2 = JsonKt.str(c, "uri");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String it2 = JsonKt.str(c, "mimeType");
        if (it2 != null && (it = "（" + it2 + "）") != null) {
            str3 = it;
        }
        String head = "【" + str2 + "】" + str3;
        String text = JsonKt.str(c, TerracottaVpnService.EXTRA_TEXT);
        String blob = JsonKt.str(c, "blob");
        if (text != null) {
            str = text;
        } else {
            str = blob != null ? "[二进制内容，约 " + ((blob.length() * 3) / 4) + " 字节，未展开]" : "（空）";
        }
        return head + StringUtils.LF + str;
    }

    public final String promptList(List<? extends Map<String, Object>> prompts, String nextCursor) {
        Pair[] pairArr;
        List list;
        int i;
        Intrinsics.checkNotNullParameter(prompts, "prompts");
        boolean z = true;
        Pair[] pairArr2 = new Pair[1];
        List<Map<String, Object>> listTake = CollectionsKt.take(prompts, 200);
        int i2 = 0;
        int i3 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        for (Map<String, Object> map : listTake) {
            boolean z2 = z;
            McpFormat mcpFormat = INSTANCE;
            String[] strArr = new String[3];
            strArr[0] = HintConstants.AUTOFILL_HINT_NAME;
            strArr[z2 ? 1 : 0] = "title";
            strArr[2] = "description";
            Map<String, Object> mapPick = mcpFormat.pick(map, strArr);
            List<Map<String, Object>> listObjs = JsonKt.objs(JsonKt.arr(map, "arguments"));
            Iterable iterable = !listObjs.isEmpty() ? listObjs : null;
            if (iterable != null) {
                Iterable iterable2 = iterable;
                pairArr = pairArr2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, i3));
                Iterable<Map<String, Object>> iterable3 = iterable2;
                for (Map<String, Object> map2 : iterable3) {
                    Iterable iterable4 = iterable3;
                    McpFormat mcpFormat2 = INSTANCE;
                    int i4 = i2;
                    String[] strArr2 = new String[3];
                    strArr2[0] = HintConstants.AUTOFILL_HINT_NAME;
                    strArr2[z2 ? 1 : 0] = "description";
                    strArr2[2] = "required";
                    arrayList2.add(mcpFormat2.pick(map2, strArr2));
                    i2 = i4;
                    iterable3 = iterable4;
                    listTake = listTake;
                }
                list = listTake;
                i = i2;
                mapPick.put("arguments", CollectionsKt.toMutableList((Collection) arrayList2));
            } else {
                pairArr = pairArr2;
                list = listTake;
                i = i2;
            }
            arrayList.add(mapPick);
            z = z2 ? 1 : 0;
            i2 = i;
            pairArr2 = pairArr;
            listTake = list;
            i3 = 10;
        }
        Pair[] pairArr3 = pairArr2;
        pairArr3[0] = TuplesKt.to("prompts", CollectionsKt.toMutableList((Collection) arrayList));
        Map<String, Object> mapJobj = JsonKt.jobj(pairArr3);
        if (nextCursor != null) {
            mapJobj.put("nextCursor", nextCursor);
        }
        if (prompts.isEmpty()) {
            mapJobj.put("note", "服务器没有列出提示词");
        }
        return Json.stringify$default(Json.INSTANCE, mapJobj, false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String promptResult(java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            r12 = this;
            java.lang.String r0 = "r"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "description"
            java.lang.String r0 = com.pymcl.core.util.JsonKt.str(r13, r0)
            java.lang.String r1 = "\n\n"
            if (r0 == 0) goto L38
            r2 = r0
            r3 = 0
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            if (r4 != 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L38
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "说明："
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r0 = r3.toString()
            if (r0 != 0) goto L3a
        L38:
            java.lang.String r0 = ""
        L3a:
            java.lang.String r2 = "messages"
            java.util.List r2 = com.pymcl.core.util.JsonKt.arr(r13, r2)
            java.util.List r2 = com.pymcl.core.util.JsonKt.objs(r2)
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            com.pymcl.ai.McpFormat$$ExternalSyntheticLambda0 r9 = new com.pymcl.ai.McpFormat$$ExternalSyntheticLambda0
            r9.<init>()
            r10 = 30
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r1 = kotlin.collections.CollectionsKt.joinToString$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r3 = kotlin.text.StringsKt.isBlank(r2)
            if (r3 == 0) goto L67
            r2 = 0
            java.lang.String r2 = "（提示词没有消息）"
        L67:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.McpFormat.promptResult(java.util.Map):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence promptResult$lambda$2(Map m) {
        String strContent;
        Intrinsics.checkNotNullParameter(m, "m");
        String str = JsonKt.str(m, "role");
        if (str == null) {
            str = "user";
        }
        Map p0 = JsonKt.obj(m, "content");
        if (p0 == null || (strContent = INSTANCE.content(p0)) == null) {
            strContent = "";
        }
        return "[" + str + "]\n" + strContent;
    }

    public final Map<String, Object> promptArgs(Map<String, Object> a) {
        Iterable $this$filter$iv = (a == null ? JsonKt.jobj(new Pair[0]) : a).entrySet();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Map.Entry it = (Map.Entry) element$iv$iv;
            if (it.getValue() != null) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$map$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Map.Entry entry = (Map.Entry) item$iv$iv;
            String k = (String) entry.getKey();
            Object v = entry.getValue();
            destination$iv$iv2.add(TuplesKt.to(k, v instanceof String ? (String) v : Json.stringify$default(Json.INSTANCE, v, false, 2, null)));
        }
        Collection $this$toTypedArray$iv = (List) destination$iv$iv2;
        Pair[] pairArr = (Pair[]) $this$toTypedArray$iv.toArray(new Pair[0]);
        return JsonKt.jobj((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
