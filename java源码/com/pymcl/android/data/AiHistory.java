package com.pymcl.android.data;

import kotlin.Metadata;

/* compiled from: AiBridge.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\u000e0\u0005Ê\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/pymcl/android/data/AiHistory;", "", "<init>", "()V", "withTasks", "", "Lcom/pymcl/android/ui/state/AiItem;", "items", "tasks", "Lcom/pymcl/ai/BgTaskInfo;", "toItems", "msgs", "", "", "Lcom/pymcl/core/util/JObj;", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class AiHistory {
    public static final int $stable = 0;
    public static final AiHistory INSTANCE = new AiHistory();

    private AiHistory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.pymcl.android.ui.state.AiItem> withTasks(java.util.List<? extends com.pymcl.android.ui.state.AiItem> r25, java.util.List<com.pymcl.ai.BgTaskInfo> r26) {
        /*
            r24 = this;
            r0 = r25
            r1 = r26
            java.lang.String r2 = "items"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "tasks"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L15
            return r0
        L15:
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            r4 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)
            int r5 = kotlin.collections.MapsKt.mapCapacity(r5)
            r6 = 16
            int r5 = kotlin.ranges.RangesKt.coerceAtLeast(r5, r6)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r5)
            java.util.Map r6 = (java.util.Map) r6
            r7 = r2
            r8 = 0
            java.util.Iterator r9 = r7.iterator()
        L36:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L4c
            java.lang.Object r10 = r9.next()
            r11 = r10
            com.pymcl.ai.BgTaskInfo r11 = (com.pymcl.ai.BgTaskInfo) r11
            r12 = 0
            java.lang.String r11 = r11.getCallId()
            r6.put(r11, r10)
            goto L36
        L4c:
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)
            r5.<init>(r4)
            r4 = r5
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r7 = 0
            java.util.Iterator r8 = r5.iterator()
        L65:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Ld4
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.pymcl.android.ui.state.AiItem r10 = (com.pymcl.android.ui.state.AiItem) r10
            r11 = 0
            boolean r12 = r10 instanceof com.pymcl.android.ui.state.AiItem.Tool
            if (r12 == 0) goto Lcc
            r12 = r10
            com.pymcl.android.ui.state.AiItem$Tool r12 = (com.pymcl.android.ui.state.AiItem.Tool) r12
            java.lang.String r12 = r12.getId()
            java.lang.Object r12 = r6.get(r12)
            com.pymcl.ai.BgTaskInfo r12 = (com.pymcl.ai.BgTaskInfo) r12
            if (r12 == 0) goto Lc6
            r13 = 0
            com.pymcl.android.data.AiItemReducer$Companion r14 = com.pymcl.android.data.AiItemReducer.INSTANCE
            com.pymcl.android.ui.state.AiItem$Tool r15 = r14.bgItem(r12)
            r14 = r10
            com.pymcl.android.ui.state.AiItem$Tool r14 = (com.pymcl.android.ui.state.AiItem.Tool) r14
            java.lang.String r14 = r14.getTitle()
            r16 = r14
            r17 = 0
            r18 = r10
            com.pymcl.android.ui.state.AiItem$Tool r18 = (com.pymcl.android.ui.state.AiItem.Tool) r18
            java.lang.String r0 = r18.getTool()
            r1 = r16
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto La9
            goto Laa
        La9:
            r14 = 0
        Laa:
            if (r14 != 0) goto Lb0
            java.lang.String r14 = r12.getTitle()
        Lb0:
            r18 = r14
            r22 = 59
            r23 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            com.pymcl.android.ui.state.AiItem$Tool r0 = com.pymcl.android.ui.state.AiItem.Tool.copy$default(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r0 != 0) goto Lc9
        Lc6:
            r0 = r10
            com.pymcl.android.ui.state.AiItem$Tool r0 = (com.pymcl.android.ui.state.AiItem.Tool) r0
        Lc9:
            com.pymcl.android.ui.state.AiItem r0 = (com.pymcl.android.ui.state.AiItem) r0
            r10 = r0
        Lcc:
            r4.add(r10)
            r0 = r25
            r1 = r26
            goto L65
        Ld4:
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiHistory.withTasks(java.util.List, java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.pymcl.android.ui.state.AiItem> toItems(java.util.List<? extends java.util.Map<java.lang.String, java.lang.Object>> r39) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiHistory.toItems(java.util.List):java.util.List");
    }
}
