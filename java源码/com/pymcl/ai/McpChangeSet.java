package com.pymcl.ai;

import com.pymcl.core.util.JsonKt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: McpNotify.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013J\u0006\u0010\u0014\u001a\u00020\u000fJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/pymcl/ai/McpChangeSet;", "", "<init>", "()V", "dirty", "Ljava/util/LinkedHashSet;", "", "Lkotlin/collections/LinkedHashSet;", "updated", "value", "", "received", "getReceived", "()I", "apply", "", "method", "params", "", "Lcom/pymcl/core/util/JObj;", "hasPending", "takeDirty", "", "takeUpdated", "", "clearUpdated", "", "uri", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class McpChangeSet {
    private volatile int received;
    private final LinkedHashSet<String> dirty = new LinkedHashSet<>();
    private final LinkedHashSet<String> updated = new LinkedHashSet<>();

    public final int getReceived() {
        return this.received;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final synchronized boolean apply(String method, Map<String, Object> params) {
        boolean known;
        Intrinsics.checkNotNullParameter(method, "method");
        switch (method.hashCode()) {
            case 1016936794:
                if (!method.equals(McpNotify.PROMPTS_CHANGED)) {
                    known = false;
                    break;
                } else {
                    this.dirty.add("prompts");
                    known = true;
                    break;
                }
            case 1038541902:
                if (method.equals(McpNotify.TOOLS_CHANGED)) {
                    this.dirty.add("tools");
                    known = true;
                    break;
                }
                known = false;
                break;
            case 1817582788:
                if (!method.equals(McpNotify.RESOURCES_CHANGED)) {
                    known = false;
                    break;
                } else {
                    this.dirty.add("resources");
                    known = true;
                    break;
                }
            case 1987810666:
                if (!method.equals(McpNotify.RESOURCE_UPDATED)) {
                    known = false;
                    break;
                } else {
                    String it = JsonKt.str(params, "uri");
                    if (it != null) {
                        if (StringsKt.isBlank(it)) {
                            it = null;
                        }
                        if (it != null) {
                            this.updated.add(it);
                        }
                    }
                    known = true;
                    break;
                }
            default:
                known = false;
                break;
        }
        if (known) {
            this.received++;
        }
        return known;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean hasPending() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet<java.lang.String> r0 = r1.dirty     // Catch: java.lang.Throwable -> L1b
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L18
            java.util.LinkedHashSet<java.lang.String> r0 = r1.updated     // Catch: java.lang.Throwable -> L1b
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L16
            goto L18
        L16:
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            monitor-exit(r1)
            return r0
        L1b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.McpChangeSet.hasPending():boolean");
    }

    public final synchronized Set<String> takeDirty() {
        LinkedHashSet linkedHashSet;
        linkedHashSet = new LinkedHashSet(this.dirty);
        this.dirty.clear();
        return linkedHashSet;
    }

    public final synchronized List<String> takeUpdated() {
        List<String> list;
        list = CollectionsKt.toList(this.updated);
        this.updated.clear();
        return list;
    }

    public final synchronized void clearUpdated(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.updated.remove(uri);
    }
}
