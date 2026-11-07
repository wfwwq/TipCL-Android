package com.pymcl.ai;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: AiSettings.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/pymcl/ai/AiMode;", "", "<init>", "()V", "BUILTIN", "", "CUSTOM", "GATEWAY", "UI_ORDER", "", "getUI_ORDER", "()Ljava/util/List;", "uiIndex", "", "mode", "fromUi", "i", "normalize", "m", "migrate", "Lcom/pymcl/ai/AiMode$Migrated;", "raw", "baseUrl", "apiKey", "gatewayUrl", "Migrated", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiMode {
    public static final AiMode INSTANCE = new AiMode();
    public static final String BUILTIN = "builtin";
    public static final String CUSTOM = "custom";
    public static final String GATEWAY = "gateway";
    private static final List<String> UI_ORDER = CollectionsKt.listOf((Object[]) new String[]{BUILTIN, CUSTOM, GATEWAY});

    private AiMode() {
    }

    public final List<String> getUI_ORDER() {
        return UI_ORDER;
    }

    public final int uiIndex(String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return RangesKt.coerceAtLeast(UI_ORDER.indexOf(normalize(mode)), 0);
    }

    public final String fromUi(int i) {
        List<String> list = UI_ORDER;
        boolean z = false;
        if (i >= 0 && i < list.size()) {
            z = true;
        }
        return z ? list.get(i) : BUILTIN;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r0.equals(com.pymcl.ai.AiMode.GATEWAY) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r0.equals("public") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return com.pymcl.ai.AiMode.GATEWAY;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String normalize(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "m"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = r0.hashCode()
            java.lang.String r2 = "builtin"
            java.lang.String r3 = "gateway"
            switch(r1) {
                case -977423767: goto L3f;
                case -189118908: goto L38;
                case 679561: goto L2e;
                case 230960163: goto L27;
                default: goto L26;
            }
        L26:
            goto L4a
        L27:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L37
            goto L26
        L2e:
            java.lang.String r1 = "内置"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L37
            goto L26
        L37:
            goto L4c
        L38:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L48
            goto L26
        L3f:
            java.lang.String r1 = "public"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L26
        L48:
            r2 = r3
            goto L4c
        L4a:
            java.lang.String r2 = "custom"
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiMode.normalize(java.lang.String):java.lang.String");
    }

    /* compiled from: AiSettings.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/pymcl/ai/AiMode$Migrated;", "", "mode", "", "baseUrl", "gatewayUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMode", "()Ljava/lang/String;", "getBaseUrl", "getGatewayUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Migrated {
        private final String baseUrl;
        private final String gatewayUrl;
        private final String mode;

        public static /* synthetic */ Migrated copy$default(Migrated migrated, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = migrated.mode;
            }
            if ((i & 2) != 0) {
                str2 = migrated.baseUrl;
            }
            if ((i & 4) != 0) {
                str3 = migrated.gatewayUrl;
            }
            return migrated.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBaseUrl() {
            return this.baseUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getGatewayUrl() {
            return this.gatewayUrl;
        }

        public final Migrated copy(String mode, String baseUrl, String gatewayUrl) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(gatewayUrl, "gatewayUrl");
            return new Migrated(mode, baseUrl, gatewayUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Migrated)) {
                return false;
            }
            Migrated migrated = (Migrated) other;
            return Intrinsics.areEqual(this.mode, migrated.mode) && Intrinsics.areEqual(this.baseUrl, migrated.baseUrl) && Intrinsics.areEqual(this.gatewayUrl, migrated.gatewayUrl);
        }

        public int hashCode() {
            return (((this.mode.hashCode() * 31) + this.baseUrl.hashCode()) * 31) + this.gatewayUrl.hashCode();
        }

        public String toString() {
            return "Migrated(mode=" + this.mode + ", baseUrl=" + this.baseUrl + ", gatewayUrl=" + this.gatewayUrl + ")";
        }

        public Migrated(String mode, String baseUrl, String gatewayUrl) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(gatewayUrl, "gatewayUrl");
            this.mode = mode;
            this.baseUrl = baseUrl;
            this.gatewayUrl = gatewayUrl;
        }

        public final String getBaseUrl() {
            return this.baseUrl;
        }

        public final String getGatewayUrl() {
            return this.gatewayUrl;
        }

        public final String getMode() {
            return this.mode;
        }
    }

    public final Migrated migrate(String raw, String baseUrl, String apiKey, String gatewayUrl) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(gatewayUrl, "gatewayUrl");
        String r = StringsKt.trim((CharSequence) raw).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r, "toLowerCase(...)");
        String strNormalize = normalize(raw);
        if (Intrinsics.areEqual(strNormalize, BUILTIN)) {
            return new Migrated(BUILTIN, baseUrl, gatewayUrl);
        }
        if (Intrinsics.areEqual(strNormalize, GATEWAY)) {
            if (!StringsKt.isBlank(gatewayUrl)) {
                return new Migrated(GATEWAY, baseUrl, gatewayUrl);
            }
            if (Intrinsics.areEqual(r, "public")) {
                return new Migrated(BUILTIN, baseUrl, gatewayUrl);
            }
            return new Migrated(GATEWAY, baseUrl, Builtin.INSTANCE.getGatewayUrl());
        }
        if (!StringsKt.isBlank(baseUrl)) {
            return new Migrated(CUSTOM, baseUrl, gatewayUrl);
        }
        if (StringsKt.isBlank(apiKey)) {
            return new Migrated(BUILTIN, baseUrl, gatewayUrl);
        }
        return new Migrated(CUSTOM, Builtin.INSTANCE.getApiBase(), gatewayUrl);
    }
}
