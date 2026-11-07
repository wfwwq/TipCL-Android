package com.pymcl.ai;

import com.pymcl.ai.PermissionRule;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: Permission.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tH\u0002J\u001a\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tH\u0002J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0006\u0010\u000f\u001a\u00020\bH\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\bJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\bJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bJ\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/pymcl/ai/PermissionStore;", "", "file", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "load", "", "", "Lcom/pymcl/core/util/JObj;", "empty", "rulesOf", "", "Lcom/pymcl/ai/PermissionRule;", "bucket", "scope", "global", "instance", "inst", "effective", "add", "", "rule", "remove", "key", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PermissionStore {
    private final File file;

    public PermissionStore(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
    }

    private final Map<String, Object> load() {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            PermissionStore $this$load_u24lambda_u240 = this;
            objM8116constructorimpl = Result.m8116constructorimpl(FileUtil.INSTANCE.readJsonObj($this$load_u24lambda_u240.file));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        Map<String, Object> map = (Map) objM8116constructorimpl;
        return map == null ? JsonKt.jobj(TuplesKt.to("version", 1L), TuplesKt.to("global", empty()), TuplesKt.to("per_instance", JsonKt.jobj(new Pair[0]))) : map;
    }

    private final Map<String, Object> empty() {
        return JsonKt.jobj(TuplesKt.to("allow", new ArrayList()), TuplesKt.to("deny", new ArrayList()), TuplesKt.to("ask", new ArrayList()));
    }

    private final List<PermissionRule> rulesOf(Map<String, Object> bucket, String scope) {
        Iterable $this$flatMapTo$iv$iv;
        int $i$f$flatMapTo;
        PermissionRule permissionRuleFrom;
        Iterable $this$flatMap$iv = CollectionsKt.listOf((Object[]) new String[]{"allow", "deny", "ask"});
        int $i$f$flatMap = 0;
        Collection destination$iv$iv = new ArrayList();
        Iterable $this$flatMapTo$iv$iv2 = $this$flatMap$iv;
        int $i$f$flatMapTo2 = 0;
        for (Object element$iv$iv : $this$flatMapTo$iv$iv2) {
            String b = (String) element$iv$iv;
            Iterable iterableArr = JsonKt.arr(bucket, b);
            if (iterableArr == null) {
                iterableArr = CollectionsKt.emptyList();
            }
            Iterable $this$mapNotNull$iv = iterableArr;
            Collection destination$iv$iv2 = new ArrayList();
            for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                Iterable $this$flatMap$iv2 = $this$flatMap$iv;
                int $i$f$flatMap2 = $i$f$flatMap;
                if (element$iv$iv$iv instanceof String) {
                    $this$flatMapTo$iv$iv = $this$flatMapTo$iv$iv2;
                    $i$f$flatMapTo = $i$f$flatMapTo2;
                    permissionRuleFrom = new PermissionRule((String) element$iv$iv$iv, "", b, scope);
                } else {
                    $this$flatMapTo$iv$iv = $this$flatMapTo$iv$iv2;
                    $i$f$flatMapTo = $i$f$flatMapTo2;
                    if (element$iv$iv$iv instanceof Map) {
                        PermissionRule.Companion companion = PermissionRule.INSTANCE;
                        Map<String, Object> mapO = JsonKt.o(element$iv$iv$iv);
                        Intrinsics.checkNotNull(mapO);
                        permissionRuleFrom = companion.from(mapO, scope, b);
                    } else {
                        permissionRuleFrom = null;
                    }
                }
                if (permissionRuleFrom != null) {
                    destination$iv$iv2.add(permissionRuleFrom);
                }
                $i$f$flatMap = $i$f$flatMap2;
                $this$flatMap$iv = $this$flatMap$iv2;
                $this$flatMapTo$iv$iv2 = $this$flatMapTo$iv$iv;
                $i$f$flatMapTo2 = $i$f$flatMapTo;
            }
            Iterable $this$flatMap$iv3 = $this$flatMap$iv;
            Iterable list$iv$iv = (List) destination$iv$iv2;
            CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
            $this$flatMap$iv = $this$flatMap$iv3;
        }
        return (List) destination$iv$iv;
    }

    public final List<PermissionRule> global() {
        List<PermissionRule> listRulesOf;
        synchronized (this) {
            listRulesOf = rulesOf(JsonKt.obj(load(), "global"), "global");
        }
        return listRulesOf;
    }

    public final List<PermissionRule> instance(String inst) {
        List<PermissionRule> listEmptyList;
        Intrinsics.checkNotNullParameter(inst, "inst");
        synchronized (this) {
            listEmptyList = StringsKt.isBlank(inst) ? CollectionsKt.emptyList() : rulesOf(JsonKt.obj(JsonKt.obj(load(), "per_instance"), inst), "instance");
        }
        return listEmptyList;
    }

    public final List<PermissionRule> effective(String inst) {
        Intrinsics.checkNotNullParameter(inst, "inst");
        return CollectionsKt.plus((Collection) instance(inst), (Iterable) global());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004c, blocks: (B:8:0x001d, B:11:0x0027, B:13:0x002f, B:14:0x003c, B:16:0x0042, B:26:0x006e, B:31:0x009d, B:33:0x00a9, B:37:0x00be, B:22:0x0058), top: B:57:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004c, blocks: (B:8:0x001d, B:11:0x0027, B:13:0x002f, B:14:0x003c, B:16:0x0042, B:26:0x006e, B:31:0x009d, B:33:0x00a9, B:37:0x00be, B:22:0x0058), top: B:57:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #2 {all -> 0x004c, blocks: (B:8:0x001d, B:11:0x0027, B:13:0x002f, B:14:0x003c, B:16:0x0042, B:26:0x006e, B:31:0x009d, B:33:0x00a9, B:37:0x00be, B:22:0x0058), top: B:57:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #2 {all -> 0x004c, blocks: (B:8:0x001d, B:11:0x0027, B:13:0x002f, B:14:0x003c, B:16:0x0042, B:26:0x006e, B:31:0x009d, B:33:0x00a9, B:37:0x00be, B:22:0x0058), top: B:57:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean add(final com.pymcl.ai.PermissionRule r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.PermissionStore.add(com.pymcl.ai.PermissionRule, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean add$lambda$0$4(com.pymcl.ai.PermissionRule r9, java.lang.Object r10) {
        /*
            java.util.Map r0 = com.pymcl.core.util.JsonKt.o(r10)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L39
            r4 = r0
            r0 = 0
            com.pymcl.ai.PermissionRule$Companion r3 = com.pymcl.ai.PermissionRule.INSTANCE
            r7 = 4
            r8 = 0
            java.lang.String r5 = ""
            r6 = 0
            com.pymcl.ai.PermissionRule r3 = com.pymcl.ai.PermissionRule.Companion.from$default(r3, r4, r5, r6, r7, r8)
            r5 = 0
            java.lang.String r6 = r3.getToolName()
            java.lang.String r7 = r9.getToolName()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L34
            java.lang.String r6 = r3.getRuleContent()
            java.lang.String r7 = r9.getRuleContent()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L34
            r3 = r1
            goto L35
        L34:
            r3 = r2
        L35:
            if (r3 != r1) goto L39
            r0 = r1
            goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 != 0) goto L59
            java.lang.String r0 = r9.getToolName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r0)
            if (r0 == 0) goto L58
            java.lang.String r0 = r9.getRuleContent()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L54
            r0 = r1
            goto L55
        L54:
            r0 = r2
        L55:
            if (r0 == 0) goto L58
            goto L59
        L58:
            r1 = r2
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.PermissionStore.add$lambda$0$4(com.pymcl.ai.PermissionRule, java.lang.Object):boolean");
    }

    public final boolean remove(final String key, String inst) {
        Iterable $this$mapNotNull$iv;
        Iterable iterableValues;
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(inst, "inst");
        synchronized (this) {
            int i2 = 0;
            Map m = load();
            final Ref.BooleanRef removed = new Ref.BooleanRef();
            List listListOfNotNull = CollectionsKt.listOfNotNull(JsonKt.obj(m, "global"));
            if (StringsKt.isBlank(inst)) {
                Map<String, Object> mapObj = JsonKt.obj(m, "per_instance");
                if (mapObj == null || (iterableValues = mapObj.values()) == null) {
                    $this$mapNotNull$iv = null;
                } else {
                    Iterable $this$mapNotNull$iv2 = iterableValues;
                    Collection destination$iv$iv = new ArrayList();
                    for (Object element$iv$iv$iv : $this$mapNotNull$iv2) {
                        Map<String, Object> mapO = JsonKt.o(element$iv$iv$iv);
                        if (mapO != null) {
                            i = i2;
                            destination$iv$iv.add(mapO);
                        } else {
                            i = i2;
                        }
                        i2 = i;
                    }
                    $this$mapNotNull$iv = (List) destination$iv$iv;
                }
                if ($this$mapNotNull$iv == null) {
                    $this$mapNotNull$iv = CollectionsKt.emptyList();
                }
            } else {
                $this$mapNotNull$iv = CollectionsKt.listOfNotNull(JsonKt.obj(JsonKt.obj(m, "per_instance"), inst));
            }
            List<Map> buckets = CollectionsKt.plus((Collection) listListOfNotNull, $this$mapNotNull$iv);
            for (Map bk : buckets) {
                for (final String b : CollectionsKt.listOf((Object[]) new String[]{"allow", "deny", "ask"})) {
                    List<Object> listArr = JsonKt.arr(bk, b);
                    if (listArr != null) {
                        CollectionsKt.removeAll((List) listArr, new Function1() { // from class: com.pymcl.ai.PermissionStore$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(PermissionStore.remove$lambda$0$1(b, key, removed, obj));
                            }
                        });
                    }
                }
            }
            if (removed.element) {
                FileUtil.INSTANCE.writeJson(this.file, m);
            }
            z = removed.element;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean remove$lambda$0$1(String $b, String $key, Ref.BooleanRef $removed, Object e) {
        PermissionRule r;
        if (e instanceof String) {
            r = new PermissionRule((String) e, "", $b, null, 8, null);
        } else if (e instanceof Map) {
            PermissionRule.Companion companion = PermissionRule.INSTANCE;
            Map<String, Object> mapO = JsonKt.o(e);
            Intrinsics.checkNotNull(mapO);
            r = companion.from(mapO, "", $b);
        } else {
            r = null;
        }
        boolean it = Intrinsics.areEqual(r != null ? r.getKey() : null, $key);
        if (it) {
            $removed.element = true;
        }
        return it;
    }
}
