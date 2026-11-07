package com.pymcl.ai;

import androidx.autofill.HintConstants;
import com.pymcl.runtime.input.InputSettings;
import com.pymcl.runtime.process.JavaProcessService;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: Permission.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006J4\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cJB\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\u0006\u0010\u0013\u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006#"}, d2 = {"Lcom/pymcl/ai/Permission;", "", "<init>", "()V", "UI_MODES", "", "", "getUI_MODES", "()Ljava/util/List;", "UI_LABELS", "getUI_LABELS", "ARG_KEYS", "getARG_KEYS", "migrateMode", "m", "confirmWrites", "", "uiIndex", "", "mode", "norm", "s", "matches", "rule", "Lcom/pymcl/ai/PermissionRule;", "tool", JavaProcessService.EXTRA_ARGS, "", "Lcom/pymcl/core/util/JObj;", "decide", "Lcom/pymcl/ai/Verdict;", "meta", "Lcom/pymcl/ai/ToolMeta;", "rules", "note", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Permission {
    public static final Permission INSTANCE = new Permission();
    private static final List<String> UI_MODES = CollectionsKt.listOf((Object[]) new String[]{InputSettings.DEFAULT_LAYOUT, "acceptEdits", "plan", "yolo", AiMode.CUSTOM});
    private static final List<String> UI_LABELS = CollectionsKt.listOf((Object[]) new String[]{"每次确认", "写直接执行", "只看不动", "全自动", "自定义"});
    private static final List<String> ARG_KEYS = CollectionsKt.listOf((Object[]) new String[]{"command", "url", "file_path", "path", "pattern", "filename", "slug", HintConstants.AUTOFILL_HINT_NAME, "version", "major"});

    private Permission() {
    }

    public final List<String> getUI_MODES() {
        return UI_MODES;
    }

    public final List<String> getUI_LABELS() {
        return UI_LABELS;
    }

    public final List<String> getARG_KEYS() {
        return ARG_KEYS;
    }

    public static /* synthetic */ String migrateMode$default(Permission permission, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return permission.migrateMode(str, z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final String migrateMode(String m, boolean confirmWrites) {
        Intrinsics.checkNotNullParameter(m, "m");
        switch (m.hashCode()) {
            case 0:
                if (m.equals("")) {
                    return InputSettings.DEFAULT_LAYOUT;
                }
                break;
            case 3154575:
                if (m.equals("full")) {
                    return confirmWrites ? "acceptEdits" : "yolo";
                }
                break;
            case 1312628413:
                if (m.equals("standard")) {
                    return InputSettings.DEFAULT_LAYOUT;
                }
                break;
        }
        return m;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int uiIndex(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List<java.lang.String> r0 = com.pymcl.ai.Permission.UI_MODES
            int r0 = r0.indexOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = 0
            r3 = 1
            if (r1 < 0) goto L1c
            r4 = r3
            goto L1d
        L1c:
            r4 = 0
        L1d:
            if (r4 == 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 == 0) goto L28
            int r3 = r0.intValue()
            goto L4f
        L28:
            int r0 = r6.hashCode()
            switch(r0) {
                case -1532588420: goto L43;
                case 3005871: goto L39;
                case 1438273625: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L4e
        L30:
            java.lang.String r0 = "autoEdit"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L42
            goto L2f
        L39:
            java.lang.String r0 = "auto"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L42
            goto L2f
        L42:
            goto L4f
        L43:
            java.lang.String r0 = "bypassPermissions"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L4c
            goto L2f
        L4c:
            r3 = 3
            goto L4f
        L4e:
            r3 = 4
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.Permission.uiIndex(java.lang.String):int");
    }

    public final String norm(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        String lowerCase = StringsKt.trimEnd(StringsKt.replace$default(StringsKt.trim((CharSequence) s).toString(), IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX, false, 4, (Object) null), IOUtils.DIR_SEPARATOR_UNIX).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final boolean matches(PermissionRule rule, String tool, Map<String, Object> args) {
        Object v;
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(tool, "tool");
        if (!Intrinsics.areEqual(rule.getToolName(), tool) && !Intrinsics.areEqual(rule.getToolName(), "*")) {
            return false;
        }
        if (StringsKt.isBlank(rule.getRuleContent())) {
            return true;
        }
        String want = norm(rule.getRuleContent());
        Iterable $this$any$iv = ARG_KEYS;
        if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
            return false;
        }
        for (Object element$iv : $this$any$iv) {
            String k = (String) element$iv;
            if ((args == null || (v = args.get(k)) == null || !Intrinsics.areEqual(INSTANCE.norm(v.toString()), want)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d6, code lost:
    
        if (r14.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01de, code lost:
    
        if (r12.isDelete() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f8, code lost:
    
        if (r14.equals("bypassPermissions") != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:?, code lost:
    
        return new com.pymcl.ai.Verdict(com.pymcl.ai.Decision.ASK, "删除操作需要确认");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:?, code lost:
    
        return new com.pymcl.ai.Verdict(com.pymcl.ai.Decision.ALLOW, null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:?, code lost:
    
        return new com.pymcl.ai.Verdict(com.pymcl.ai.Decision.ALLOW, null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0168, code lost:
    
        if (r14.equals("autoEdit") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0171, code lost:
    
        if (r14.equals("acceptEdits") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a8, code lost:
    
        if (r14.equals("yolo") == false) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.ai.Verdict decide(com.pymcl.ai.ToolMeta r12, java.util.Map<java.lang.String, java.lang.Object> r13, java.lang.String r14, java.util.List<com.pymcl.ai.PermissionRule> r15) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.Permission.decide(com.pymcl.ai.ToolMeta, java.util.Map, java.lang.String, java.util.List):com.pymcl.ai.Verdict");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String note(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1532588420: goto L3f;
                case 3005871: goto L33;
                case 3443497: goto L28;
                case 3714841: goto L1f;
                case 604214145: goto L16;
                case 1438273625: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L4b
        Ld:
            java.lang.String r0 = "autoEdit"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3c
            goto Lc
        L16:
            java.lang.String r0 = "acceptEdits"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3c
            goto Lc
        L1f:
            java.lang.String r0 = "yolo"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L48
            goto Lc
        L28:
            java.lang.String r0 = "plan"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "当前权限档位：只看不动。只能调用只读工具，写操作会被拒绝；需要改动时把方案讲清楚让用户切档位。"
            goto L4d
        L33:
            java.lang.String r0 = "auto"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3c
            goto Lc
        L3c:
            java.lang.String r0 = "当前权限档位：写直接执行。安装/启用/禁用直接执行，删除类仍会弹确认。"
            goto L4d
        L3f:
            java.lang.String r0 = "bypassPermissions"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L48
            goto Lc
        L48:
            java.lang.String r0 = "当前权限档位：全自动。写操作会直接执行，动手前想清楚。"
            goto L4d
        L4b:
            java.lang.String r0 = "当前权限档位：每次确认。写操作会先弹确认卡，用户同意后才执行；被拒绝就换方案或说明原因，不要重复请求同一操作。"
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.Permission.note(java.lang.String):java.lang.String");
    }
}
